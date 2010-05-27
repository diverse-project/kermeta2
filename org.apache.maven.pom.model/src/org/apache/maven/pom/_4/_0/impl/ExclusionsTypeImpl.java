/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import java.util.Collection;

import org.apache.maven.pom._4._0.Exclusion;
import org.apache.maven.pom._4._0.ExclusionsType;
import org.apache.maven.pom._4._0._0Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ExclusionsTypeImpl#getExclusion <em>Exclusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExclusionsTypeImpl extends EObjectImpl implements ExclusionsType {
	/**
	 * The cached value of the '{@link #getExclusion() <em>Exclusion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusion()
	 * @generated
	 * @ordered
	 */
	protected EList<Exclusion> exclusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.EXCLUSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exclusion> getExclusion() {
		if (exclusion == null) {
			exclusion = new EObjectContainmentEList<Exclusion>(Exclusion.class, this, _0Package.EXCLUSIONS_TYPE__EXCLUSION);
		}
		return exclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.EXCLUSIONS_TYPE__EXCLUSION:
				return ((InternalEList<?>)getExclusion()).basicRemove(otherEnd, msgs);
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
			case _0Package.EXCLUSIONS_TYPE__EXCLUSION:
				return getExclusion();
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
			case _0Package.EXCLUSIONS_TYPE__EXCLUSION:
				getExclusion().clear();
				getExclusion().addAll((Collection<? extends Exclusion>)newValue);
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
			case _0Package.EXCLUSIONS_TYPE__EXCLUSION:
				getExclusion().clear();
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
			case _0Package.EXCLUSIONS_TYPE__EXCLUSION:
				return exclusion != null && !exclusion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExclusionsTypeImpl
