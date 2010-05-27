/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import java.util.Collection;

import org.apache.maven.pom._4._0.ReportSet;
import org.apache.maven.pom._4._0.ReportSetsType;
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
 * An implementation of the model object '<em><b>Report Sets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ReportSetsTypeImpl#getReportSet <em>Report Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportSetsTypeImpl extends EObjectImpl implements ReportSetsType {
	/**
	 * The cached value of the '{@link #getReportSet() <em>Report Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportSet> reportSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportSetsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.REPORT_SETS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportSet> getReportSet() {
		if (reportSet == null) {
			reportSet = new EObjectContainmentEList<ReportSet>(ReportSet.class, this, _0Package.REPORT_SETS_TYPE__REPORT_SET);
		}
		return reportSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.REPORT_SETS_TYPE__REPORT_SET:
				return ((InternalEList<?>)getReportSet()).basicRemove(otherEnd, msgs);
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
			case _0Package.REPORT_SETS_TYPE__REPORT_SET:
				return getReportSet();
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
			case _0Package.REPORT_SETS_TYPE__REPORT_SET:
				getReportSet().clear();
				getReportSet().addAll((Collection<? extends ReportSet>)newValue);
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
			case _0Package.REPORT_SETS_TYPE__REPORT_SET:
				getReportSet().clear();
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
			case _0Package.REPORT_SETS_TYPE__REPORT_SET:
				return reportSet != null && !reportSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReportSetsTypeImpl
