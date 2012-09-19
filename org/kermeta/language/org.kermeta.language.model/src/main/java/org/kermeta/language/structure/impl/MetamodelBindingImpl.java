/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.ClassDefinitionBinding;
import org.kermeta.language.structure.EnumerationBinding;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.MetamodelBinding;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.UseAdaptationOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelBindingImpl#getBoundMetamodel <em>Bound Metamodel</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelBindingImpl#getOwnedClassDefinitionBindings <em>Owned Class Definition Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelBindingImpl#getUsedAdaptationOperators <em>Used Adaptation Operators</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelBindingImpl#getOwnedEnumerationBindings <em>Owned Enumeration Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelBindingImpl extends KermetaModelElementImpl implements MetamodelBinding {
	/**
	 * The cached value of the '{@link #getBoundMetamodel() <em>Bound Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel boundMetamodel;

	/**
	 * The cached value of the '{@link #getOwnedClassDefinitionBindings() <em>Owned Class Definition Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClassDefinitionBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinitionBinding> ownedClassDefinitionBindings;

	/**
	 * The cached value of the '{@link #getUsedAdaptationOperators() <em>Used Adaptation Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedAdaptationOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<UseAdaptationOperator> usedAdaptationOperators;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationBindings() <em>Owned Enumeration Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationBinding> ownedEnumerationBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.METAMODEL_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getBoundMetamodel() {
		if (boundMetamodel != null && boundMetamodel.eIsProxy()) {
			InternalEObject oldBoundMetamodel = (InternalEObject)boundMetamodel;
			boundMetamodel = (Metamodel)eResolveProxy(oldBoundMetamodel);
			if (boundMetamodel != oldBoundMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.METAMODEL_BINDING__BOUND_METAMODEL, oldBoundMetamodel, boundMetamodel));
			}
		}
		return boundMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetBoundMetamodel() {
		return boundMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundMetamodel(Metamodel newBoundMetamodel) {
		Metamodel oldBoundMetamodel = boundMetamodel;
		boundMetamodel = newBoundMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METAMODEL_BINDING__BOUND_METAMODEL, oldBoundMetamodel, boundMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDefinitionBinding> getOwnedClassDefinitionBindings() {
		if (ownedClassDefinitionBindings == null) {
			ownedClassDefinitionBindings = new EObjectContainmentEList<ClassDefinitionBinding>(ClassDefinitionBinding.class, this, StructurePackage.METAMODEL_BINDING__OWNED_CLASS_DEFINITION_BINDINGS);
		}
		return ownedClassDefinitionBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseAdaptationOperator> getUsedAdaptationOperators() {
		if (usedAdaptationOperators == null) {
			usedAdaptationOperators = new EObjectContainmentEList<UseAdaptationOperator>(UseAdaptationOperator.class, this, StructurePackage.METAMODEL_BINDING__USED_ADAPTATION_OPERATORS);
		}
		return usedAdaptationOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationBinding> getOwnedEnumerationBindings() {
		if (ownedEnumerationBindings == null) {
			ownedEnumerationBindings = new EObjectContainmentEList<EnumerationBinding>(EnumerationBinding.class, this, StructurePackage.METAMODEL_BINDING__OWNED_ENUMERATION_BINDINGS);
		}
		return ownedEnumerationBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.METAMODEL_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return ((InternalEList<?>)getOwnedClassDefinitionBindings()).basicRemove(otherEnd, msgs);
			case StructurePackage.METAMODEL_BINDING__USED_ADAPTATION_OPERATORS:
				return ((InternalEList<?>)getUsedAdaptationOperators()).basicRemove(otherEnd, msgs);
			case StructurePackage.METAMODEL_BINDING__OWNED_ENUMERATION_BINDINGS:
				return ((InternalEList<?>)getOwnedEnumerationBindings()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.METAMODEL_BINDING__BOUND_METAMODEL:
				if (resolve) return getBoundMetamodel();
				return basicGetBoundMetamodel();
			case StructurePackage.METAMODEL_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return getOwnedClassDefinitionBindings();
			case StructurePackage.METAMODEL_BINDING__USED_ADAPTATION_OPERATORS:
				return getUsedAdaptationOperators();
			case StructurePackage.METAMODEL_BINDING__OWNED_ENUMERATION_BINDINGS:
				return getOwnedEnumerationBindings();
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
			case StructurePackage.METAMODEL_BINDING__BOUND_METAMODEL:
				setBoundMetamodel((Metamodel)newValue);
				return;
			case StructurePackage.METAMODEL_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				getOwnedClassDefinitionBindings().clear();
				getOwnedClassDefinitionBindings().addAll((Collection<? extends ClassDefinitionBinding>)newValue);
				return;
			case StructurePackage.METAMODEL_BINDING__USED_ADAPTATION_OPERATORS:
				getUsedAdaptationOperators().clear();
				getUsedAdaptationOperators().addAll((Collection<? extends UseAdaptationOperator>)newValue);
				return;
			case StructurePackage.METAMODEL_BINDING__OWNED_ENUMERATION_BINDINGS:
				getOwnedEnumerationBindings().clear();
				getOwnedEnumerationBindings().addAll((Collection<? extends EnumerationBinding>)newValue);
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
			case StructurePackage.METAMODEL_BINDING__BOUND_METAMODEL:
				setBoundMetamodel((Metamodel)null);
				return;
			case StructurePackage.METAMODEL_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				getOwnedClassDefinitionBindings().clear();
				return;
			case StructurePackage.METAMODEL_BINDING__USED_ADAPTATION_OPERATORS:
				getUsedAdaptationOperators().clear();
				return;
			case StructurePackage.METAMODEL_BINDING__OWNED_ENUMERATION_BINDINGS:
				getOwnedEnumerationBindings().clear();
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
			case StructurePackage.METAMODEL_BINDING__BOUND_METAMODEL:
				return boundMetamodel != null;
			case StructurePackage.METAMODEL_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return ownedClassDefinitionBindings != null && !ownedClassDefinitionBindings.isEmpty();
			case StructurePackage.METAMODEL_BINDING__USED_ADAPTATION_OPERATORS:
				return usedAdaptationOperators != null && !usedAdaptationOperators.isEmpty();
			case StructurePackage.METAMODEL_BINDING__OWNED_ENUMERATION_BINDINGS:
				return ownedEnumerationBindings != null && !ownedEnumerationBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetamodelBindingImpl