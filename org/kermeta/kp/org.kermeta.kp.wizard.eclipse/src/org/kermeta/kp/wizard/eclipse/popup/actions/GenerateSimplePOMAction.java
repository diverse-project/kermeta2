package org.kermeta.kp.wizard.eclipse.popup.actions;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.kp.wizard.eclipse.Activator;

public class GenerateSimplePOMAction implements IObjectActionDelegate {

	private Shell shell;
	
	private ISelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateSimplePOMAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			IFile kpfile = (IFile) ((IStructuredSelection) selection).getFirstElement();
			
			String artefactId = kpfile.getProject().getName();
			String groupId = artefactId.contains(".") ? artefactId.substring(0, artefactId.lastIndexOf(".")) : artefactId;
			
			String version = Activator.getDefault().getBundle().getVersion().toString().replace(".qualifier", "-SNAPSHOT");
			version = version.replace(".SNAPSHOT", "-SNAPSHOT"); // workaround trouble when the bundle version is already a snapshot, maven requires a - instead of the . 
			if(version.contains("-SNAPSHOT")){
				version = version.substring(0, version.lastIndexOf("-SNAPSHOT")+9); // removes the timestamp if any
			}
			
			InputStream is= new ByteArrayInputStream(
					generatePOMContent(artefactId, 
							groupId, 
							kpfile.getName(), 
							version).getBytes());
			IFile pomFile = kpfile.getProject().getFile("pom.xml");
			try {
				if(pomFile.exists()){
					if(MessageDialog.openConfirm(shell, "overiding pom.xml", "a pom.xml file already exists. Are you sure you wish to overide it ?")){
						pomFile.setContents(is, IResource.KEEP_HISTORY & IResource.FORCE, null);
					}
				} else {
					pomFile.create(is, true, null);
				}
			} catch (CoreException e) {
				Activator.logErrorMessage("failed to save pom.xml", e);
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
	
	protected String generatePOMContent(String artefactId, String groupId, String kpFileName, String kermetaVersion){
		StringBuilder sb = new StringBuilder();
		
		InputStream is = this.getClass().getResourceAsStream("/templates/simpleJarExporter/pom.xml");
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));	    
	    String line = null;
	    try {
		    while ((line = reader.readLine()) != null) {
		      sb.append(line + "\n");
		    }	    
			is.close();
		} catch (IOException e) {
			Activator.logErrorMessage("failed to load pom.xml template", e);
		}
	    
	    
	    
		return sb.toString().replaceAll(Pattern.quote("@artefactId@"), artefactId)
				.replaceAll(Pattern.quote("@groupId@"), groupId)
				.replaceAll(Pattern.quote("@kp.filename@"), kpFileName)
				.replaceAll(Pattern.quote("@kermeta.version@"), kermetaVersion);
	}

}
