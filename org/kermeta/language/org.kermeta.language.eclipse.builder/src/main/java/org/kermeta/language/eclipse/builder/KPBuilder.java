/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 21 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.eclipse.builder;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.language.compiler.commandline.KermetaCompiler;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;

public class KPBuilder {
	protected IFile kpProjectFile;
	
	protected KPNeedBuildDeltaVisitor needBuildVisitor;
	
	public KPBuilder(IFile kpProjectFile) {
		super();
		this.kpProjectFile = kpProjectFile;
		needBuildVisitor = new KPNeedBuildDeltaVisitor(kpProjectFile);
	}


	public boolean isBuildNeeded(IResourceDelta delta){
		needBuildVisitor.setBuildNeeded(false);
		try {
			delta.accept(needBuildVisitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return needBuildVisitor.isBuildNeeded();
	}

	
	public void conditionalBuild(IResourceDelta delta){
		if(isBuildNeeded(delta)){
			build();
		}
	}
	synchronized public void build(){
		Job job = new Job("Kermeta builder root job") {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					String kpFileURL = kpProjectFile.getRawLocation().toString();
					File f = new File(kpFileURL);
					String projectUri = f.getParentFile().getCanonicalPath();
					String outputFolder = projectUri+"/target";
					KermetaCompiler compiler = new KermetaCompiler(outputFolder,outputFolder,true, true,false, Activator.getDefault().getMessaggingSystem());
				
					compiler.kp2bytecode(kpFileURL);
				} catch (IOException e) {
					Activator.getDefault().getMessaggingSystem().log(Kind.DevERROR,"builder failed", this.getClass().getName(), e);
				}
				return Status.OK_STATUS;
	        }
	    };
	    job.setPriority(Job.LONG);
	    job.schedule(); // start as soon as possible
	}


	public void refreshFileIndex() {
		needBuildVisitor.refreshFileIndex();
	}
}
