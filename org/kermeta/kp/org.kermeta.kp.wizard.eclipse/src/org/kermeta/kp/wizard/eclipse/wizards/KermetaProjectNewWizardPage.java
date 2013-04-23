package org.kermeta.kp.wizard.eclipse.wizards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.mapping.ecore2ecore.presentation.Ecore2EcoreEditorPlugin;

public class KermetaProjectNewWizardPage extends WizardPage {

	private String 		projectLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
	private String		projectName		= "NewKermetaProject";
	private String		projectType		= "None";
	private String		ecoreFile		= "None";
	private boolean		ecoreProject	= false;
	
	private static final List<String> FILE_EXTENSIONS = Arrays.asList(new String [] { "ecore" });
	private boolean 	enableNext;
	
	private Composite 	container;
	private Label 		lblProjectName;
	private Text 		txtProjectName;
	private Text 		txtProjectLocation;
	private Text 		txtPathEcore;
	private Button		btnBrowseLocation;
	private Button 		btnBrowseEcore;
	private Button 		btnCheckLocation;
	private Button 		btnCheckEcore;
	private Combo 		combo;

	public KermetaProjectNewWizardPage(){
		super("wizardPage");
		setTitle("New Kermeta project");
		setDescription("This wizard creates a new kermeta project");
	}
	
	/**
	 * Constructor for KermetaNewWizardDashboard.
	 * @param pageName
	 */
	public KermetaProjectNewWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("New Kermeta project");
		setDescription("This wizard creates a new kermeta project");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		
		//-----------------------------------------------
		
		txtProjectName = new Text(container, SWT.BORDER);
		txtProjectName.setBounds(93, 7, 255, 21);
		txtProjectName.setText(this.projectName);
		
		lblProjectName = new Label(container, SWT.NONE);
		lblProjectName.setBounds(10, 10, 98, 15);
		lblProjectName.setText("project name :");
		
		//-----------------------------------------------
		
		btnBrowseLocation = new Button(container, SWT.NONE);
		btnBrowseLocation.setBounds(349, 66, 75, 25);
		btnBrowseLocation.setText("Browse...");
		
		btnBrowseLocation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtProjectLocation.setText(locationDialog());
			}
		});
		
		txtProjectLocation = new Text(container, SWT.BORDER);
		txtProjectLocation.setBounds(10, 68, 333, 21);
		txtProjectLocation.setText(this.projectLocation);
		
		btnCheckLocation = new Button(container, SWT.CHECK);
		btnCheckLocation.setText("use default location");
		btnCheckLocation.setBounds(10, 46, 218, 16);
		btnCheckLocation.setSelection(true);
		
		btnCheckLocation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnCheckLocation.getSelection()) {
					txtProjectLocation.setEnabled(false);
					btnBrowseLocation.setEnabled(false);
				}
				else {
					txtProjectLocation.setEnabled(true);
					btnBrowseLocation.setEnabled(true);
				} 
			}
		});
		
		//-----------------------------------------------
		
		btnCheckEcore = new Button(container, SWT.CHECK);
		btnCheckEcore.setBounds(10, 108, 218, 16);
		btnCheckEcore.setText("referencing an existing ecore file");
		
		btnCheckEcore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnCheckEcore.getSelection()) {
					updateEcoreProject(true);
					btnBrowseEcore.setEnabled(true);
					txtPathEcore.setEnabled(true);
					combo.setEnabled(true);
					if ( txtPathEcore.getText().isEmpty()) {
						setPageComplete(false);
					}
				}
				else {
					updateEcoreProject(false);
					btnBrowseEcore.setEnabled(false);
					txtPathEcore.setEnabled(false);
					combo.setEnabled(false);
					combo.select(0);
					updateNextButton (false);
					setPageComplete(true);
				} 
			}
		});
		
		txtPathEcore = new Text(container, SWT.READ_ONLY | SWT.BORDER);
		txtPathEcore.setBounds(10, 130, 333, 21);
		
		btnBrowseEcore = new Button(container, SWT.NONE);
		btnBrowseEcore.setBounds(349, 128, 75, 25);
		btnBrowseEcore.setText("Browse...");
		
		btnBrowseEcore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (workspaceDialog() || !txtPathEcore.getText().isEmpty()) {
					setPageComplete(true);
				}
			}
		});
		
		combo = new Combo(container, SWT.NONE);
		combo.setItems(new String[] {"None", "1 aspect class per 1 ecore class", "Compiler template", "Interpreter template", "Traditional Visitor design patter", "Custom operation per ecore class"});
		combo.setBounds(10, 157, 333, 23);
		combo.select(0);
		
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(combo.getSelectionIndex() == 5) {
					updateNextButton (true);
				}
				else {
					updateNextButton (false);
				}
			}
		});
		
		//-----------------------------------------------
		
		//initialization of enabled state of controls
		txtProjectLocation.setEnabled(false);
		btnBrowseLocation.setEnabled(false);
		btnBrowseEcore.setEnabled(false);
		txtPathEcore.setEnabled(false);
		combo.setEnabled(false);
		
		// Required to avoid an error in the system
		setControl(container);
		setPageComplete(true);
	}
	
	private String locationDialog () {
		DirectoryDialog dirDialog = new DirectoryDialog(new Shell());
	    dirDialog.setText("Select location directory");
	    this.projectLocation = dirDialog.open();
	    return this.projectLocation;
	}
	  
	private boolean workspaceDialog() {
		boolean bResult = false;
		
		final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		Object selection = ((IStructuredSelection)workbenchWindow.getSelectionService().getSelection()).getFirstElement();
		final IFile selectedEcoreFile = 
				selection instanceof IFile && FILE_EXTENSIONS.contains(((IFile)selection).getFileExtension()) ? (IFile)selection : null;
		
		ViewerFilter viewerFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IFile) {
					IFile file = (IFile)element;
					return FILE_EXTENSIONS.contains	(file.getFileExtension()) &&
													(selectedEcoreFile == null ||
													!selectedEcoreFile.getFullPath().equals(file.getFullPath()));
				}
				return true;
			}
		};
		
		final IFile[] files = WorkspaceResourceDialog.openFileSelection	(workbenchWindow.getShell(), 
																		null, 
																		Ecore2EcoreEditorPlugin.INSTANCE.getString("_UI_SelectOutputEcoreModels_label"), 
																		true, 
																		null, 
																		Collections.singletonList(viewerFilter));
		if (files.length > 0) {
			for (int i = 0; i < files.length; i++) {
				this.ecoreFile = files[i].getFullPath().toOSString();
				txtPathEcore.setText(files[i].getFullPath().toOSString());
			}
			bResult = true;
		}
		return bResult;
	}
	
	private void updateEcoreProject (boolean bState) {
		this.ecoreProject = bState;
	}
	
	private void updateNextButton (boolean enable) {
		enableNext = enable;
		canFlipToNextPage();
		getWizard().getContainer().updateButtons();		
	}
	
	@Override
	public boolean canFlipToNextPage () {
		return enableNext;
	}
	
	public String getProjectLocation () {
		return this.projectLocation;
	}

	public String getProjectName () { 
		return this.txtProjectName.getText();
	}

	public String getProjectType () {
		return this.projectType 	;
	}
	
	public String getEcoreFile () {
		return this.ecoreFile;
	}
	
	public boolean getProjectWithEcore () {
		return ecoreProject;
	}
}