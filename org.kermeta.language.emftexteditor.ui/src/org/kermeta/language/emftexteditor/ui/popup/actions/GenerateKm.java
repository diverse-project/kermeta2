package org.kermeta.language.emftexteditor.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.jface.viewers.StructuredSelection;
import org.kermeta.language.emftexteditor.ui.GenerateKmK;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;

public class GenerateKm implements IObjectActionDelegate {

	private Shell shell;
	protected StructuredSelection currentSelection;
	protected IFile kermetaFile;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateKm() {
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
		IOConsole console = new EclipseConsole("Km Converter");
		console.println(new InfoMessage("Launching km converter on file : " + kermetaFile.getLocation().toOSString() + "..."));
		String file_uri = "file:/" + kermetaFile.getLocation().toOSString();
		GenerateKmK.run(file_uri, console, "km");
		/*MessageDialog.openInformation(
				shell,
				"EMFText Parser Plugin: kermeta",
				"Generate km (Kermeta Model) executed succesfully, check your workspace for *.km");*/
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//project.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		console.println(new OKMessage("Execution terminated successfully."));
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				kermetaFile = (IFile)it.next();
			}

		}
		
	
	}

}
