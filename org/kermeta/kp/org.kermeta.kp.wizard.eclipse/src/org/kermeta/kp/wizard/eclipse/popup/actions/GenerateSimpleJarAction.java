package org.kermeta.kp.wizard.eclipse.popup.actions;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
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
import org.kermeta.language.km2bytecode.embedded.scala.JarCreatorScala;
import org.kermeta.utils.helpers.eclipse.LocalFileConverterForEclipse;

public class GenerateSimpleJarAction implements IObjectActionDelegate {

	private Shell shell;
	
	private ISelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateSimpleJarAction() {
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
			
			String jarName = kpfile.getProject().getName()+".jar";

			IFolder targetFolder = kpfile.getProject().getFolder("target");
			IFile jarIFile = kpfile.getProject().getFile("target/"+jarName);
			Boolean mustDo = false;
			if(jarIFile.exists()){
				if(MessageDialog.openConfirm(shell, "overiding "+jarName, "target/"+jarName+" file already exists. Are you sure you wish to overide it ?")){
					mustDo = true;
					try {
						jarIFile.delete(true, null);
					} catch (CoreException e) {
						Activator.logErrorMessage("problem deleting "+jarName, e);
					}
				}
			} else {
				mustDo = true;
			}
			if(mustDo){
				JarCreatorScala.createForClassicKermetaTargetProject(targetFolder.getLocation().toOSString(), jarIFile.getLocation().toOSString() );
				try {
					targetFolder.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					Activator.logErrorMessage("problem refreshing "+targetFolder.getLocation(), e);
				}
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
