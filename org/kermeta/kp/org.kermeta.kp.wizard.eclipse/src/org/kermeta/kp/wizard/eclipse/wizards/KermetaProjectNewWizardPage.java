/* $Id: NewKermetaProjectWizardPage.java,v 1.4 2008-06-09 10:02:23 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaNewProjectWizardPage.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 19, 2005
 * Authors: zdrey
 * Notes :
 * 	This file was primarily generated by Eclipse plug-in helper
 */

package org.kermeta.kp.wizard.eclipse.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * The "New" wizard page allows setting the container for
 * the new file as well as the file name. The page
 * will only accept file name without the extension OR
 * with the extension that matches the expected one (kmt).
 */

public class KermetaProjectNewWizardPage extends WizardNewProjectCreationPage
{ 
    // 
    protected WizardDialog wizardDialog;
    
    /** true if user uses the default metamodel/model/output folders, false otherwise */
    public boolean useDefaultFolders = true;
    protected Button useDefaultFoldersButton;
    
    private Label _srcFolderLabel;
    private Text _srcFolder;
    private String _srcFolderValue = "src/kermeta";

    private Label _modelFolderLabel;
    private Text _modelFolder;
    private String _modelFolderValue = "model";
    
    private Label _metamodelFolderLabel;
    private Text _metamodelFolder;
    private String _metamodelFolderValue = "metamodel";
    
    
	/**
	 * Constructor for KermetaNewWizardPage.
	 * @param pageName
	 */
	public KermetaProjectNewWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("New Kermeta project");
		setDescription("This wizard creates a new project");
	}
	
	public KermetaProjectNewWizardPage() {
		super("wizardPage");
		setTitle("New Kermeta project");
		setDescription("This wizard creates a new project");
	}
	
    /**
     * Create the layout of this page
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(Composite parent) {
        // Super method contains the following widgets : 
        // The text field for the project name
        // The text field for the project location (default or user defined)
        super.createControl(parent);
        Composite composite = (Composite)getControl();
        createDefaultFoldersRadioButton(composite);
        
    }
    /**
     * Create the radio button and the box fields to define the folders
     * models/metamodels/src/bin
     * @param parent
     */
    protected void createDefaultFoldersRadioButton(Composite parent)
    {
        
        Font font = parent.getFont();
        // project specification group
        Group folderGroup = new Group(parent, SWT.NONE);
        GridLayout layout = new GridLayout(2,false);
        folderGroup.setLayout(layout);
        folderGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        folderGroup.setFont(font);
        folderGroup.setText("Set default folders");
        
        final Button useEmptyFoldersButton = new Button(folderGroup, SWT.RADIO | SWT.RIGHT);
        
        useEmptyFoldersButton.setText("Create empty folder");
        useEmptyFoldersButton.setSelection(!useDefaultFolders);
        useEmptyFoldersButton.setFont(font);
        
        GridData buttonData = new GridData();
        buttonData.horizontalSpan = 3;
        useEmptyFoldersButton.setLayoutData(buttonData);
              
        // Default folders
        final Button useDefaultFoldersButton = new Button(folderGroup, SWT.RADIO | SWT.RIGHT);
        
        useDefaultFoldersButton.setText("Create separate folders for source (src) and libraries (lib)");
        useDefaultFoldersButton.setSelection(!useEmptyFoldersButton.getSelection());
        useDefaultFoldersButton.setFont(font);
        
        buttonData = new GridData();
        buttonData.horizontalSpan = 3;
        useDefaultFoldersButton.setLayoutData(buttonData);
               
        createUserSpecifiedFolderLocationGroup(folderGroup, !useEmptyFoldersButton.getSelection());
        
        SelectionListener listener = new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                useDefaultFolders = useDefaultFoldersButton.getSelection();
                setLocationFoldersEnabled(useDefaultFolders);
                if (useDefaultFolders) {
                    setLocationFoldersForSelection();
                } else {
                    // User choice
                }
            }
        };
        useDefaultFoldersButton.addSelectionListener(listener);
        
    }
    
    /**
     * Enable/Disable the default folder location fields
     * */
    protected void setLocationFoldersEnabled(boolean b)
    {/*
        modelLocationText.setEnabled(b);   modelLocationLabel.setEnabled(b);
        mmodelLocationText.setEnabled(b);  mmodelLocationLabel.setEnabled(b);*/
        _srcFolder.setEnabled(b);
        _srcFolderLabel.setEnabled(b);
        _modelFolder.setEnabled(b);
        _modelFolderLabel.setEnabled(b);
        _metamodelFolder.setEnabled(b);
        _metamodelFolderLabel.setEnabled(b);
    }

    protected void setLocationFoldersForSelection() {
		if ( useDefaultFolders ) {
			_srcFolder.setText( _srcFolderValue );
			_modelFolder.setText( _modelFolderValue );
			_metamodelFolder.setText( _metamodelFolderValue );
		}
    }

    /**
     * Create the templated folder
     * @param folderGroup
     * @param b
     */
    private void createUserSpecifiedFolderLocationGroup(Group folderGroup, boolean b) {
		Font font = folderGroup.getFont();
		_srcFolderLabel = createLocationLabel(folderGroup, "Kermeta Source Folder", b, font);
		_srcFolder = createLocationText(folderGroup, b, font, _srcFolderValue);

		_modelFolderLabel = createLocationLabel(folderGroup, "Model Folder", b, font);
		_modelFolder = createLocationText(folderGroup, b, font, _modelFolderValue);
		
		_metamodelFolderLabel = createLocationLabel(folderGroup, "Metamodel Folder", b, font);
		_metamodelFolder = createLocationText(folderGroup, b, font, _metamodelFolderValue);
    }
    
    protected Label createLocationLabel(Group folderGroup, String label, boolean enabled, Font font) {
        Label _locationLabel = new Label(folderGroup, SWT.NONE);
		_locationLabel.setText(label); //$NON-NLS-1$
		_locationLabel.setEnabled(enabled);
		_locationLabel.setFont(font);
		return _locationLabel;
    }

    protected Text createLocationText(Group folderGroup, boolean enabled, Font font, String defaultValue) {
        Text _locationText = new Text(folderGroup, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        //data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        _locationText.setLayoutData(data);
        _locationText.setEnabled(enabled);
        _locationText.setFont(font);
        _locationText.setText(defaultValue);
        return _locationText;
    }
    
    /**
     * 
     * @return
     */
    public String getSrcFolder() {
    	return _srcFolder.getText();
    }
    
    /**
     * 
     * @return
     */
    public String getModelFolder() {
    	return _modelFolder.getText();
    }
    
    /**
     * 
     * @return
     */
    public String getMetamodelFolder() {
    	return _metamodelFolder.getText();
    }
    
    /**
     * 
     * @return
     */
    public boolean createFolders() {
    	return useDefaultFolders;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.dialogs.WizardNewProjectCreationPage#setInitialProjectName(java.lang.String)
     */
    public void setInitialProjectName(String name) {
        // TODO Auto-generated method stub
        super.setInitialProjectName(name);
    }   
    
}