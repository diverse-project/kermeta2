package org.kermeta.language.aspectgenerator.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.aspectgenerator.ui.Activator;

public class GenerateKmtAspect implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
	private Shell shell;
	protected IFile selectedfile;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateKmtAspect() {
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
		
		k2.io.StdIO$.MODULE$.messagingSystem_$eq(Activator.getDefault().getMessagingSystem());
		
		Activator.getDefault().getMessagingSystem().debug("AspectGenerator "+ selectedfile.getLocationURI().toString(), Activator.PLUGIN_ID);
		org.kermeta.language.aspectgenerator.KM2KMTAspectGenerator aspectGenerator_ = new org.kermeta.language.aspectgenerator.KM2KMTAspectGeneratorImpl4Eclipse();
		//aspectGenerator_.aspectGeneratorScala(selectedfile.getLocationURI().toString(), selectedfile.getLocationURI().toString()+".kmt");
		aspectGenerator_.aspectGeneratorScala("C:\\Workspaces\\workspace_dashboardGemocStudio\\aspectGenerator", selectedfile.getLocationURI().toString());
		Activator.getDefault().getMessagingSystem().debug("Done", Activator.PLUGIN_ID);

		try {
			selectedfile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {}
		
		/*MessageDialog.openInformation(
			shell,
			"Ui",
			"New Action was executed.");*/
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
				selectedfile = (IFile)it.next();
			}

		}
	}

}
