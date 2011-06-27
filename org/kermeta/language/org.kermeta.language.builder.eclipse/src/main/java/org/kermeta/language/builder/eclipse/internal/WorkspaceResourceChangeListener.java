/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 21 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.builder.eclipse.internal;

import java.io.IOException;

import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;

/**
 * This class is used to handle Workspace level events
 * It must do has less as possible concrete work, the real work is done in a separate jobs
 * it deals with add/remove of kp file
 * 		for each kp files, a specific KermetaKPResourceChangeListener is registered  
 */
public class WorkspaceResourceChangeListener implements IResourceChangeListener{

	public static final String KP_FILE_EXTENSION = "kp";
	private KermetaBuilder kermetaBuilder = KermetaBuilder.getDefault();
	
	public WorkspaceResourceChangeListener() {
		super();
		// initialize builders
		Workspace ws = (Workspace)ResourcesPlugin.getWorkspace();
		try {
			ws.getRoot().accept(new KPBuilderInitializerResourceVisitor());
		} catch (CoreException e) {
			Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR, "failed to initialize builders ", this.getClass().getName(), e);		
		}
	}


	class KPFileDeltaVisitor implements IResourceDeltaVisitor {
		
		public boolean visit(IResourceDelta delta) throws CoreException {
			// Flag stating whether to continue the visit or not.
			boolean processResourceChildren = true;
			IResource resource = delta.getResource();
			switch( delta.getResource().getType() ) {		
			// Only handling project changes.
			case IResource.PROJECT :
				// maybe we should deal with project open/close ?
				break;

			case IResource.FILE :
				if(resource.getFileExtension().equals(KP_FILE_EXTENSION)){
					KPBuilder builder = null;
					switch (delta.getKind()) {
					case IResourceDelta.ADDED:
						// add a new visitor dedicated to this Kermeta project file
						Activator.getDefault().getMessaggingSystem().log(Kind.DevDEBUG, "adding builder for "+resource.getFullPath(), this.getClass().getName());
						kermetaBuilder.kpBuilders.put(kermetaBuilder.generateIdentifier(resource),new KPBuilder((IFile) resource));
						break;
					case IResourceDelta.REMOVED:
						// handle removed resource
						Activator.getDefault().getMessaggingSystem().log(Kind.DevDEBUG, "removing builder for "+resource.getFullPath(), this.getClass().getName());
						if(builder != null){
							kermetaBuilder.kpBuilders.remove(kermetaBuilder.generateIdentifier(resource));
						}
						else{
							Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR, "failed to remove builder for "+resource.getFullPath(), this.getClass().getName());							
						}
						break;
					case IResourceDelta.CHANGED:
						 if ((delta.getFlags() & IResourceDelta.CONTENT) == 0)
							  // we care only about content change
			                  return false;
						Activator.getDefault().getMessaggingSystem().log(Kind.DevDEBUG, "refreshing builder for "+resource.getFullPath(), this.getClass().getName());
						builder = kermetaBuilder.kpBuilders.get(kermetaBuilder.generateIdentifier(resource));
						if(builder != null){
							try {
								builder.refreshFileIndex();
								builder.compile();
							} catch (IOException e) {
								Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR, "failed to refresh builder for "+resource.getFullPath(), this.getClass().getName());
							}
						}
						else{
							Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR, "failed to refresh builder for "+resource.getFullPath(), this.getClass().getName());							
						}
						break;
					}
				}
				processResourceChildren = false;
				break;
								
			default :
				break;
			}
			
			//return true to continue visiting children.
			return processResourceChildren;
		}
	}
	
	/**
	 * Initialize the builders by looking for kp files in the workbench
	 */
	class KPBuilderInitializerResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			// Flag stating whether to continue the visit or not.
			boolean processResourceChildren = true;
			switch( resource.getType() ) {
			case IResource.PROJECT :
				// ignore closed projects
				
				break;
			case IResource.FILE :
				if (resource.getFileExtension()!=null) {
					if(resource.getFileExtension().equals(KP_FILE_EXTENSION)){
						// ignore kp in target folder
						if(!resource.getProjectRelativePath().segments()[0].equals("target")){
							Activator.getDefault().getMessaggingSystem().log(Kind.DevDEBUG, "adding builder for "+resource.getFullPath(), this.getClass().getName());
							KPBuilder aBuilder = new KPBuilder((IFile) resource);
							kermetaBuilder.kpBuilders.put(kermetaBuilder.generateIdentifier(resource),aBuilder);
							aBuilder.compile();							
						}
					}
				}
				processResourceChildren = false;
				break;
								
			default :
				break;
			}
			return processResourceChildren;
		}
	}
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		final IResourceDelta delta = event.getDelta();
		if ( delta != null ){
			Job job = new Job("Kermeta builder root job") {
				protected IStatus run(IProgressMonitor monitor) {
					// see if the event need a refresh of the kpBuilders
					try {
						delta.accept(new KPFileDeltaVisitor());
					} catch (CoreException e) {
						Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR, "failed to process delta with KPFileDeltaVisitor", e));
					}
					/* see if the event is related to one of our builders */
					for(KPBuilder builder : kermetaBuilder.kpBuilders.values()){
						builder.conditionalBuild(delta);
					}
		            return Status.OK_STATUS;
		        }
		     };
		    job.setPriority(Job.SHORT);
		    job.schedule(); // start as soon as possible
			
		}
	}
}
