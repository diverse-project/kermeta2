/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.kermeta.language.structure.ModelTypeVariable;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.parts.ModelTypeVariablePropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class ModelTypeVariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for kTag ReferencesTable
	 */
	private	ReferencesTableSettings kTagSettings;
	
	/**
	 * Settings for kType EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings kTypeSettings;
	
	/**
	 * Settings for typeContainer EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings typeContainerSettings;
	
	/**
	 * Settings for supertype EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings supertypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ModelTypeVariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject modelTypeVariable, String editing_mode) {
		super(editingContext, modelTypeVariable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = StructureViewsRepository.class;
		partKey = StructureViewsRepository.ModelTypeVariable.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final ModelTypeVariable modelTypeVariable = (ModelTypeVariable)elt;
			final ModelTypeVariablePropertiesEditionPart basePart = (ModelTypeVariablePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(modelTypeVariable, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(modelTypeVariable, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.typeContainer)) {
				// init part
				typeContainerSettings = new EObjectFlatComboSettings(modelTypeVariable, StructurePackage.eINSTANCE.getType_TypeContainer());
				basePart.initTypeContainer(typeContainerSettings);
				// set the button mode
				basePart.setTypeContainerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (modelTypeVariable.getName() != null && isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), modelTypeVariable.getName()));
			
			if (isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.supertype)) {
				// init part
				supertypeSettings = new EObjectFlatComboSettings(modelTypeVariable, StructurePackage.eINSTANCE.getTypeVariable_Supertype());
				basePart.initSupertype(supertypeSettings);
				// set the button mode
				basePart.setSupertypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToKTag(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInKTagTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToKTag(new EObjectFilter(StructurePackage.eINSTANCE.getTag()));
			// Start of user code for additional businessfilters for kTag
			// End of user code
			
			basePart.addFilterToKType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Type);
				}
			
			});
			// Start of user code for additional businessfilters for kType
			// End of user code
			
			basePart.addFilterToTypeContainer(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof TypeContainer); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for typeContainer
			// End of user code
			
			
			basePart.addFilterToSupertype(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Type); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for supertype
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}








	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == StructureViewsRepository.ModelTypeVariable.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == StructureViewsRepository.ModelTypeVariable.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == StructureViewsRepository.ModelTypeVariable.Properties.typeContainer) {
			return StructurePackage.eINSTANCE.getType_TypeContainer();
		}
		if (editorKey == StructureViewsRepository.ModelTypeVariable.Properties.name) {
			return StructurePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == StructureViewsRepository.ModelTypeVariable.Properties.supertype) {
			return StructurePackage.eINSTANCE.getTypeVariable_Supertype();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ModelTypeVariable modelTypeVariable = (ModelTypeVariable)semanticObject;
		if (StructureViewsRepository.ModelTypeVariable.Properties.kTag == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Tag) {
					kTagSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				kTagSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				kTagSettings.move(event.getNewIndex(), (Tag) event.getNewValue());
			}
		}
		if (StructureViewsRepository.ModelTypeVariable.Properties.kType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				kTypeSettings.setToReference((Type)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, kTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (StructureViewsRepository.ModelTypeVariable.Properties.typeContainer == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				typeContainerSettings.setToReference((TypeContainer)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, typeContainerSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (StructureViewsRepository.ModelTypeVariable.Properties.name == event.getAffectedEditor()) {
			modelTypeVariable.setName((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (StructureViewsRepository.ModelTypeVariable.Properties.supertype == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				supertypeSettings.setToReference((Type)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, supertypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ModelTypeVariablePropertiesEditionPart basePart = (ModelTypeVariablePropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getType_TypeContainer().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.typeContainer))
				basePart.setTypeContainer((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (StructurePackage.eINSTANCE.getTypeVariable_Supertype().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.ModelTypeVariable.Properties.supertype))
				basePart.setSupertype((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == StructureViewsRepository.ModelTypeVariable.Properties.kType || key == StructureViewsRepository.ModelTypeVariable.Properties.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (StructureViewsRepository.ModelTypeVariable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}