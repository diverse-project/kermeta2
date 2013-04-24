package org.kermeta.kp.wizard.eclipse.wizards;

import org.kermeta.kp.wizard.eclipse.wizards.utils.Context;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class KermetaProjectNewWizardPageCustom extends WizardPage {
	
	private Context		context;
	
	private Composite 	container;
	private Label 		lblOperationName;
	private Label 		lblParameterName;
	private Label 		lblParameterType;
	private Text 		txtOperationName;
	private Text 		txtParameterName;
	private Text 		txtParameterType;
	private Button 		btnCheckCreateClass;
	private Table		table;
	private TableColumn	colClassCreation;
	private TableColumn	colParamName;
	private TableColumn	colParamType;
	private TableItem 	item;
	private Button 		btnAdd;
	private Button 		btnRemove;
	private String[] 	tabItem =  {"yes", "context", "Context"};
	
	public KermetaProjectNewWizardPageCustom (Context context){
		super("wizardPage");
		this.context = context;
		setTitle("Custom Operation for New Kermeta project");
		setDescription("This wizard configures the operation which has to add at the aspect files at the new kermeta project");
		setPageComplete(true);
	}
	
	/**
	 * Constructor for KermetaNewWizardDashboard.
	 * @param pageName
	 */
	public KermetaProjectNewWizardPageCustom (ISelection selection) {
		super("wizardPage");
		setTitle("Custom Operation for New Kermeta project");
		setDescription("This wizard configures the operation which has to add at the aspect files at the new kermeta project");
	}
	
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		
		//-----------------------------------------------
		
		txtOperationName = new Text(container, SWT.BORDER);
		txtOperationName.setBounds(135, 10, 294, 21);
		txtOperationName.setText("customize");
		
		lblOperationName = new Label(container, SWT.NONE);
		lblOperationName.setText("Operation name :");
		lblOperationName.setBounds(10, 13, 105, 15);
		
		txtParameterName = new Text(container, SWT.BORDER);
		txtParameterName.setBounds(10, 76, 105, 21);
		
		txtParameterType = new Text(container, SWT.BORDER);
		txtParameterType.setBounds(135, 76, 105, 21);
		
		lblParameterName = new Label(container, SWT.NONE);
		lblParameterName.setBounds(10, 55, 105, 15);
		lblParameterName.setText("Parameter name :");
		
		lblParameterType = new Label(container, SWT.NONE);
		lblParameterType.setText("Parameter type :");
		lblParameterType.setBounds(135, 55, 105, 15);
		
		btnCheckCreateClass = new Button(container, SWT.CHECK);
		btnCheckCreateClass.setBounds(246, 78, 102, 16);
		btnCheckCreateClass.setText("create class for ");
		
		table = new Table(container, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);

		colClassCreation = new TableColumn(table, SWT.LEFT);
		colClassCreation.setText("new class for");
		colClassCreation.setWidth(100);
		colParamName = new TableColumn(table, SWT.LEFT);
		colParamName.setText("parameter name");
		colParamName.setWidth(100);
		colParamType = new TableColumn(table, SWT.LEFT);
		colParamType.setText("parameter type");
		colParamType.setWidth(100);
		
		item = new TableItem(table, SWT.LEFT);
		item.setText(tabItem);
		
		table.setBounds(10, 135, 305, 163);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		btnAdd = new Button(container, SWT.NONE);
		btnAdd.setBounds(354, 74, 75, 25);
		btnAdd.setText("Add");
		
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addParameter();
			}
		});
		
		btnRemove = new Button(container, SWT.NONE);
		btnRemove.setText("Remove");
		btnRemove.setBounds(354, 135, 75, 25);
		
		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeParameter();
			}
		});
		
		// Required to avoid an error in the system
		setControl(container);
		setPageComplete(true);
	}
	
	private void addParameter () {
		if (!txtParameterName.getText().isEmpty() && !txtParameterType.getText().isEmpty()) {
			
			TableItem 	newItem 		= new TableItem(table, SWT.LEFT);
			String [] 	tabNewItem 		= new String[3];
			String 		sCreateClass 	= "No";
			
			if (btnCheckCreateClass.getSelection()) {
				sCreateClass = "Yes";
			}
			tabNewItem[0] = sCreateClass;
			tabNewItem[1] = txtParameterName.getText();
			tabNewItem[2] = txtParameterType.getText();
			newItem.setText(tabNewItem);
		}
		table.redraw();
	}
	
	private void removeParameter () {
		if (table.getSelectionIndices().length > 0) {
	        table.remove(table.getSelectionIndices());
	        table.redraw();
        }
	}
	
	/*public <String> getParameters () {
		TableItem[] tItem = table.getItems();
		if (tItem.length > 0) {
			for (int i =0; i < tItem.length; i++) {
				this.context.operationParams.add(tItem[i].getText(1) + " : " + tItem[i].getText(2));
			}
		}
		return this.context.operationParams;
	}
	
	public ArrayList<String> getNewClass () {
		TableItem[] tItem = table.getItems();
		if (tItem.length > 0) {
			for (int i =0; i < tItem.length; i++) {
				if (tItem[i].getText(0) == "yes") {
					this.context.listNewClass.add(tItem[i].getText(2));
				}
			}
		}
		return this.context.listNewClass;
	}*/
}
