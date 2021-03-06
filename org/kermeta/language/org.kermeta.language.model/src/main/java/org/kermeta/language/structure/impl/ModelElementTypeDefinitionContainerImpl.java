/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.ModelElementTypeDefinition;
import org.kermeta.language.structure.ModelElementTypeDefinitionContainer;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element Type Definition Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelElementTypeDefinitionContainerImpl#getOwnedTypeDefinition <em>Owned Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelElementTypeDefinitionContainerImpl extends NamedElementImpl implements ModelElementTypeDefinitionContainer {
	/**
	 * The cached value of the '{@link #getOwnedTypeDefinition() <em>Owned Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElementTypeDefinition> ownedTypeDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementTypeDefinitionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElementTypeDefinition> getOwnedTypeDefinition() {
		if (ownedTypeDefinition == null) {
			ownedTypeDefinition = new EObjectContainmentEList<ModelElementTypeDefinition>(ModelElementTypeDefinition.class, this, StructurePackage.MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION);
		}
		return ownedTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION:
				return ((InternalEList<?>)getOwnedTypeDefinition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION:
				return getOwnedTypeDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurePackage.MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION:
				getOwnedTypeDefinition().clear();
				getOwnedTypeDefinition().addAll((Collection<? extends ModelElementTypeDefinition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructurePackage.MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION:
				getOwnedTypeDefinition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructurePackage.MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION:
				return ownedTypeDefinition != null && !ownedTypeDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementTypeDefinitionContainerImpl
