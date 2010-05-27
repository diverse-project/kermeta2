/**
 * IRISA / INRIA / Universite de Rennes 1
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

import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Require;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Using;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelingUnitImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelingUnitImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelingUnitImpl#getUsings <em>Usings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingUnitImpl extends ObjectImpl implements ModelingUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<org.kermeta.language.structure.Package> packages;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Require> requires;

	/**
	 * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsings()
	 * @generated
	 * @ordered
	 */
	protected EList<Using> usings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODELING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.kermeta.language.structure.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList.Resolving<org.kermeta.language.structure.Package>(org.kermeta.language.structure.Package.class, this, StructurePackage.MODELING_UNIT__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Require> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList.Resolving<Require>(Require.class, this, StructurePackage.MODELING_UNIT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Using> getUsings() {
		if (usings == null) {
			usings = new EObjectContainmentEList.Resolving<Using>(Using.class, this, StructurePackage.MODELING_UNIT__USINGS);
		}
		return usings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.MODELING_UNIT__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODELING_UNIT__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODELING_UNIT__USINGS:
				return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.MODELING_UNIT__PACKAGES:
				return getPackages();
			case StructurePackage.MODELING_UNIT__REQUIRES:
				return getRequires();
			case StructurePackage.MODELING_UNIT__USINGS:
				return getUsings();
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
			case StructurePackage.MODELING_UNIT__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends org.kermeta.language.structure.Package>)newValue);
				return;
			case StructurePackage.MODELING_UNIT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Require>)newValue);
				return;
			case StructurePackage.MODELING_UNIT__USINGS:
				getUsings().clear();
				getUsings().addAll((Collection<? extends Using>)newValue);
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
			case StructurePackage.MODELING_UNIT__PACKAGES:
				getPackages().clear();
				return;
			case StructurePackage.MODELING_UNIT__REQUIRES:
				getRequires().clear();
				return;
			case StructurePackage.MODELING_UNIT__USINGS:
				getUsings().clear();
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
			case StructurePackage.MODELING_UNIT__PACKAGES:
				return packages != null && !packages.isEmpty();
			case StructurePackage.MODELING_UNIT__REQUIRES:
				return requires != null && !requires.isEmpty();
			case StructurePackage.MODELING_UNIT__USINGS:
				return usings != null && !usings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelingUnitImpl
