/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import org.apache.maven.pom._4._0.ActivationFile;
import org.apache.maven.pom._4._0._0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ActivationFileImpl#getMissing <em>Missing</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ActivationFileImpl#getExists <em>Exists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationFileImpl extends EObjectImpl implements ActivationFile {
	/**
	 * The default value of the '{@link #getMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissing()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissing()
	 * @generated
	 * @ordered
	 */
	protected String missing = MISSING_EDEFAULT;

	/**
	 * The default value of the '{@link #getExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExists()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExists()
	 * @generated
	 * @ordered
	 */
	protected String exists = EXISTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.ACTIVATION_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissing() {
		return missing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing(String newMissing) {
		String oldMissing = missing;
		missing = newMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION_FILE__MISSING, oldMissing, missing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExists() {
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExists(String newExists) {
		String oldExists = exists;
		exists = newExists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION_FILE__EXISTS, oldExists, exists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.ACTIVATION_FILE__MISSING:
				return getMissing();
			case _0Package.ACTIVATION_FILE__EXISTS:
				return getExists();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.ACTIVATION_FILE__MISSING:
				setMissing((String)newValue);
				return;
			case _0Package.ACTIVATION_FILE__EXISTS:
				setExists((String)newValue);
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
			case _0Package.ACTIVATION_FILE__MISSING:
				setMissing(MISSING_EDEFAULT);
				return;
			case _0Package.ACTIVATION_FILE__EXISTS:
				setExists(EXISTS_EDEFAULT);
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
			case _0Package.ACTIVATION_FILE__MISSING:
				return MISSING_EDEFAULT == null ? missing != null : !MISSING_EDEFAULT.equals(missing);
			case _0Package.ACTIVATION_FILE__EXISTS:
				return EXISTS_EDEFAULT == null ? exists != null : !EXISTS_EDEFAULT.equals(exists);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (missing: ");
		result.append(missing);
		result.append(", exists: ");
		result.append(exists);
		result.append(')');
		return result.toString();
	}

} //ActivationFileImpl
