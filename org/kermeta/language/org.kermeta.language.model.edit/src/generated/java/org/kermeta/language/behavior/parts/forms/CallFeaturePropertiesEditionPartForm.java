/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.behavior.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.kermeta.language.behavior.parts.BehaviorViewsRepository;
import org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart;
import org.kermeta.language.behavior.providers.BehaviorMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class CallFeaturePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, CallFeaturePropertiesEditionPart {

		protected ReferencesTable kTag;
		protected List<ViewerFilter> kTagBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> kTagFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer kType;
	protected EObjectFlatComboViewer staticType;
	protected Text name;
		protected ReferencesTable staticTypeVariableBindings;
		protected List<ViewerFilter> staticTypeVariableBindingsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> staticTypeVariableBindingsFilters = new ArrayList<ViewerFilter>();
	protected Button isAtpre;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CallFeaturePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence callFeatureStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = callFeatureStep.addStep(BehaviorViewsRepository.CallFeature.Properties.class);
		propertiesStep.addStep(BehaviorViewsRepository.CallFeature.Properties.kTag);
		propertiesStep.addStep(BehaviorViewsRepository.CallFeature.Properties.kType);
		propertiesStep.addStep(BehaviorViewsRepository.CallFeature.Properties.staticType);
		propertiesStep.addStep(BehaviorViewsRepository.CallFeature.Properties.name);
		propertiesStep.addStep(BehaviorViewsRepository.CallFeature.Properties.staticTypeVariableBindings);
		propertiesStep.addStep(BehaviorViewsRepository.CallFeature.Properties.isAtpre);
		
		
		composer = new PartComposer(callFeatureStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BehaviorViewsRepository.CallFeature.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BehaviorViewsRepository.CallFeature.Properties.kTag) {
					return createKTagReferencesTable(widgetFactory, parent);
				}
				if (key == BehaviorViewsRepository.CallFeature.Properties.kType) {
					return createKTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == BehaviorViewsRepository.CallFeature.Properties.staticType) {
					return createStaticTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == BehaviorViewsRepository.CallFeature.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == BehaviorViewsRepository.CallFeature.Properties.staticTypeVariableBindings) {
					return createStaticTypeVariableBindingsReferencesTable(widgetFactory, parent);
				}
				if (key == BehaviorViewsRepository.CallFeature.Properties.isAtpre) {
					return createIsAtpreCheckbox(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(BehaviorMessages.CallFeaturePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createKTagReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.kTag = new ReferencesTable(BehaviorMessages.CallFeaturePropertiesEditionPart_KTagLabel, new ReferencesTableListener	() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.CallFeature.Properties.kTag, BehaviorViewsRepository.FORM_KIND));
		this.kTag.createControls(parent, widgetFactory);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(BehaviorViewsRepository.CallFeature.Properties.kTag);
		kTag.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addKTag() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(kTag.getInput(), kTagFilters, kTagBusinessFilters,
		"kTag", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.kTag,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				kTag.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveKTag(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void editKTag(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				kTag.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createKTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, BehaviorMessages.CallFeaturePropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.CallFeature.Properties.kType, BehaviorViewsRepository.FORM_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BehaviorViewsRepository.CallFeature.Properties.kType, BehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(kType);
		kType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData kTypeData = new GridData(GridData.FILL_HORIZONTAL);
		kType.setLayoutData(kTypeData);
		kType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.kType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		kType.setID(BehaviorViewsRepository.CallFeature.Properties.kType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.CallFeature.Properties.kType, BehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createStaticTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, BehaviorMessages.CallFeaturePropertiesEditionPart_StaticTypeLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.CallFeature.Properties.staticType, BehaviorViewsRepository.FORM_KIND));
		staticType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BehaviorViewsRepository.CallFeature.Properties.staticType, BehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(staticType);
		staticType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData staticTypeData = new GridData(GridData.FILL_HORIZONTAL);
		staticType.setLayoutData(staticTypeData);
		staticType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.staticType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStaticType()));
			}

		});
		staticType.setID(BehaviorViewsRepository.CallFeature.Properties.staticType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.CallFeature.Properties.staticType, BehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, BehaviorMessages.CallFeaturePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.CallFeature.Properties.name, BehaviorViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BehaviorViewsRepository.CallFeature.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.CallFeature.Properties.name, BehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createStaticTypeVariableBindingsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.staticTypeVariableBindings = new ReferencesTable(BehaviorMessages.CallFeaturePropertiesEditionPart_StaticTypeVariableBindingsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addStaticTypeVariableBindings(); }
			public void handleEdit(EObject element) { editStaticTypeVariableBindings(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveStaticTypeVariableBindings(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromStaticTypeVariableBindings(element); }
			public void navigateTo(EObject element) { }
		});
		this.staticTypeVariableBindings.setHelpText(propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.CallFeature.Properties.staticTypeVariableBindings, BehaviorViewsRepository.FORM_KIND));
		this.staticTypeVariableBindings.createControls(parent, widgetFactory);
		this.staticTypeVariableBindings.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.staticTypeVariableBindings, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData staticTypeVariableBindingsData = new GridData(GridData.FILL_HORIZONTAL);
		staticTypeVariableBindingsData.horizontalSpan = 3;
		this.staticTypeVariableBindings.setLayoutData(staticTypeVariableBindingsData);
		this.staticTypeVariableBindings.disableMove();
		staticTypeVariableBindings.setID(BehaviorViewsRepository.CallFeature.Properties.staticTypeVariableBindings);
		staticTypeVariableBindings.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addStaticTypeVariableBindings() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(staticTypeVariableBindings.getInput(), staticTypeVariableBindingsFilters, staticTypeVariableBindingsBusinessFilters,
		"staticTypeVariableBindings", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.staticTypeVariableBindings,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				staticTypeVariableBindings.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveStaticTypeVariableBindings(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.staticTypeVariableBindings, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		staticTypeVariableBindings.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromStaticTypeVariableBindings(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.staticTypeVariableBindings, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		staticTypeVariableBindings.refresh();
	}

	/**
	 * 
	 */
	protected void editStaticTypeVariableBindings(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				staticTypeVariableBindings.refresh();
			}
		}
	}

	
	protected Composite createIsAtpreCheckbox(FormToolkit widgetFactory, Composite parent) {
		isAtpre = widgetFactory.createButton(parent, BehaviorMessages.CallFeaturePropertiesEditionPart_IsAtpreLabel, SWT.CHECK);
		isAtpre.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallFeaturePropertiesEditionPartForm.this, BehaviorViewsRepository.CallFeature.Properties.isAtpre, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isAtpre.getSelection())));
			}

		});
		GridData isAtpreData = new GridData(GridData.FILL_HORIZONTAL);
		isAtpreData.horizontalSpan = 2;
		isAtpre.setLayoutData(isAtpreData);
		EditingUtils.setID(isAtpre, BehaviorViewsRepository.CallFeature.Properties.isAtpre);
		EditingUtils.setEEFtype(isAtpre, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.CallFeature.Properties.isAtpre, BehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initKTag(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		kTag.setContentProvider(contentProvider);
		kTag.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#getKType()
	 * 
	 */
	public EObject getKType() {
		if (kType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) kType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#initKType(EObjectFlatComboSettings)
	 */
	public void initKType(EObjectFlatComboSettings settings) {
		kType.setInput(settings);
		if (current != null) {
			kType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#setKType(EObject newValue)
	 * 
	 */
	public void setKType(EObject newValue) {
		if (newValue != null) {
			kType.setSelection(new StructuredSelection(newValue));
		} else {
			kType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#getStaticType()
	 * 
	 */
	public EObject getStaticType() {
		if (staticType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) staticType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#initStaticType(EObjectFlatComboSettings)
	 */
	public void initStaticType(EObjectFlatComboSettings settings) {
		staticType.setInput(settings);
		if (current != null) {
			staticType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#setStaticType(EObject newValue)
	 * 
	 */
	public void setStaticType(EObject newValue) {
		if (newValue != null) {
			staticType.setSelection(new StructuredSelection(newValue));
		} else {
			staticType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#setStaticTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStaticTypeButtonMode(ButtonsModeEnum newValue) {
		staticType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#addFilterStaticType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStaticType(ViewerFilter filter) {
		staticType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#addBusinessFilterStaticType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStaticType(ViewerFilter filter) {
		staticType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#initStaticTypeVariableBindings(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initStaticTypeVariableBindings(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		staticTypeVariableBindings.setContentProvider(contentProvider);
		staticTypeVariableBindings.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#updateStaticTypeVariableBindings()
	 * 
	 */
	public void updateStaticTypeVariableBindings() {
	staticTypeVariableBindings.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#addFilterStaticTypeVariableBindings(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStaticTypeVariableBindings(ViewerFilter filter) {
		staticTypeVariableBindingsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#addBusinessFilterStaticTypeVariableBindings(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStaticTypeVariableBindings(ViewerFilter filter) {
		staticTypeVariableBindingsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#isContainedInStaticTypeVariableBindingsTable(EObject element)
	 * 
	 */
	public boolean isContainedInStaticTypeVariableBindingsTable(EObject element) {
		return ((ReferencesTableSettings)staticTypeVariableBindings.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#getIsAtpre()
	 * 
	 */
	public Boolean getIsAtpre() {
		return Boolean.valueOf(isAtpre.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.CallFeaturePropertiesEditionPart#setIsAtpre(Boolean newValue)
	 * 
	 */
	public void setIsAtpre(Boolean newValue) {
		if (newValue != null) {
			isAtpre.setSelection(newValue.booleanValue());
		} else {
			isAtpre.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BehaviorMessages.CallFeature_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}