/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.kermeta.language.behavior.BehaviorFactory;

import org.kermeta.language.structure.ModelTransformation;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;

/**
 * This is the item provider adapter for a {@link org.kermeta.language.structure.ModelTransformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTransformationItemProvider
	extends MultiplicityElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTransformationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypeParametersPropertyDescriptor(object);
			addRulesPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelTransformation_typeParameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelTransformation_typeParameters_feature", "_UI_ModelTransformation_type"),
				 StructurePackage.Literals.MODEL_TRANSFORMATION__TYPE_PARAMETERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelTransformation_rules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelTransformation_rules_feature", "_UI_ModelTransformation_type"),
				 StructurePackage.Literals.MODEL_TRANSFORMATION__RULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelTransformation_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelTransformation_isAbstract_feature", "_UI_ModelTransformation_type"),
				 StructurePackage.Literals.MODEL_TRANSFORMATION__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY);
			childrenFeatures.add(StructurePackage.Literals.MODEL_TRANSFORMATION__OWNED_PARAMETER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ModelTransformation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelTransformation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelTransformation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelTransformation_type") :
			getString("_UI_ModelTransformation_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModelTransformation.class)) {
			case StructurePackage.MODEL_TRANSFORMATION__IS_ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructurePackage.MODEL_TRANSFORMATION__BODY:
			case StructurePackage.MODEL_TRANSFORMATION__OWNED_PARAMETER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createUnresolvedCall()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallProperty()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__BODY,
				 BehaviorFactory.eINSTANCE.createCallModelTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TRANSFORMATION__OWNED_PARAMETER,
				 StructureFactory.eINSTANCE.createParameter()));
	}

}
