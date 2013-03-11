package org.kermeta.kp.wizard.eclipse.popup.actions;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
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
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.editor.analysis.helper.KpVariableExpander;
import org.kermeta.kp.loader.kp.KpLoaderImpl;
import org.kermeta.kp.wizard.eclipse.Activator;
import org.kermeta.kp.wizard.eclipse.helper.PomGenerator4KP;
import org.kermeta.utils.helpers.eclipse.LocalFileConverterForEclipse;

public class GeneratePOMAction implements IObjectActionDelegate {

	private Shell shell;
	
	private ISelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public GeneratePOMAction() {
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
			KpLoaderImpl ldr = new KpLoaderImpl(
					org.kermeta.utils.systemservices.eclipse.Activator.getDefault().getMessaggingSystem());
			KermetaProject kp = ldr.loadKp(kpfile.getLocationURI().toString());
			KpVariableExpander varExpander = new KpVariableExpander(kpfile.getLocationURI().toString(), kp, new LocalFileConverterForEclipse(), org.kermeta.utils.systemservices.eclipse.Activator.getDefault().getMessaggingSystem() );
			PomGenerator4KP pomGenerator = new PomGenerator4KP(kp, varExpander, org.kermeta.utils.systemservices.eclipse.Activator.getDefault().getMessaggingSystem());
			
			
			
			
			IFile pomFile = kpfile.getProject().getFile("pom.xml");
			if(pomFile.exists()){
				if(MessageDialog.openConfirm(shell, "overiding pom.xml", "a pom.xml file already exists. Are you sure you wish to overide it ?")){
					pomGenerator.saveToFile(pomGenerator.createProject(groupId, artefactId, version), pomFile.getLocation().toFile());
				}
			} else {
				pomGenerator.saveToFile(pomGenerator.createProject(groupId, artefactId, version), pomFile.getLocation().toFile());
			}
		}
	}
	

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
	
}
