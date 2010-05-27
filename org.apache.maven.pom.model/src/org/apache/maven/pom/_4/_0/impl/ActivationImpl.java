/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import org.apache.maven.pom._4._0.Activation;
import org.apache.maven.pom._4._0.ActivationFile;
import org.apache.maven.pom._4._0.ActivationOS;
import org.apache.maven.pom._4._0.ActivationProperty;
import org.apache.maven.pom._4._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ActivationImpl#isActiveByDefault <em>Active By Default</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ActivationImpl#getJdk <em>Jdk</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ActivationImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ActivationImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ActivationImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationImpl extends EObjectImpl implements Activation {
	/**
	 * The default value of the '{@link #isActiveByDefault() <em>Active By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveByDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_BY_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActiveByDefault() <em>Active By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveByDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean activeByDefault = ACTIVE_BY_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Active By Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activeByDefaultESet;

	/**
	 * The default value of the '{@link #getJdk() <em>Jdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdk()
	 * @generated
	 * @ordered
	 */
	protected static final String JDK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdk() <em>Jdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdk()
	 * @generated
	 * @ordered
	 */
	protected String jdk = JDK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected ActivationOS os;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected ActivationProperty property;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected ActivationFile file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActiveByDefault() {
		return activeByDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveByDefault(boolean newActiveByDefault) {
		boolean oldActiveByDefault = activeByDefault;
		activeByDefault = newActiveByDefault;
		boolean oldActiveByDefaultESet = activeByDefaultESet;
		activeByDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION__ACTIVE_BY_DEFAULT, oldActiveByDefault, activeByDefault, !oldActiveByDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActiveByDefault() {
		boolean oldActiveByDefault = activeByDefault;
		boolean oldActiveByDefaultESet = activeByDefaultESet;
		activeByDefault = ACTIVE_BY_DEFAULT_EDEFAULT;
		activeByDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.ACTIVATION__ACTIVE_BY_DEFAULT, oldActiveByDefault, ACTIVE_BY_DEFAULT_EDEFAULT, oldActiveByDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActiveByDefault() {
		return activeByDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdk() {
		return jdk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdk(String newJdk) {
		String oldJdk = jdk;
		jdk = newJdk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION__JDK, oldJdk, jdk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationOS getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOs(ActivationOS newOs, NotificationChain msgs) {
		ActivationOS oldOs = os;
		os = newOs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION__OS, oldOs, newOs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(ActivationOS newOs) {
		if (newOs != os) {
			NotificationChain msgs = null;
			if (os != null)
				msgs = ((InternalEObject)os).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.ACTIVATION__OS, null, msgs);
			if (newOs != null)
				msgs = ((InternalEObject)newOs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.ACTIVATION__OS, null, msgs);
			msgs = basicSetOs(newOs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION__OS, newOs, newOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationProperty getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(ActivationProperty newProperty, NotificationChain msgs) {
		ActivationProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(ActivationProperty newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.ACTIVATION__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.ACTIVATION__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationFile getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(ActivationFile newFile, NotificationChain msgs) {
		ActivationFile oldFile = file;
		file = newFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION__FILE, oldFile, newFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(ActivationFile newFile) {
		if (newFile != file) {
			NotificationChain msgs = null;
			if (file != null)
				msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.ACTIVATION__FILE, null, msgs);
			if (newFile != null)
				msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.ACTIVATION__FILE, null, msgs);
			msgs = basicSetFile(newFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ACTIVATION__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVATION__OS:
				return basicSetOs(null, msgs);
			case _0Package.ACTIVATION__PROPERTY:
				return basicSetProperty(null, msgs);
			case _0Package.ACTIVATION__FILE:
				return basicSetFile(null, msgs);
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
			case _0Package.ACTIVATION__ACTIVE_BY_DEFAULT:
				return isActiveByDefault();
			case _0Package.ACTIVATION__JDK:
				return getJdk();
			case _0Package.ACTIVATION__OS:
				return getOs();
			case _0Package.ACTIVATION__PROPERTY:
				return getProperty();
			case _0Package.ACTIVATION__FILE:
				return getFile();
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
			case _0Package.ACTIVATION__ACTIVE_BY_DEFAULT:
				setActiveByDefault((Boolean)newValue);
				return;
			case _0Package.ACTIVATION__JDK:
				setJdk((String)newValue);
				return;
			case _0Package.ACTIVATION__OS:
				setOs((ActivationOS)newValue);
				return;
			case _0Package.ACTIVATION__PROPERTY:
				setProperty((ActivationProperty)newValue);
				return;
			case _0Package.ACTIVATION__FILE:
				setFile((ActivationFile)newValue);
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
			case _0Package.ACTIVATION__ACTIVE_BY_DEFAULT:
				unsetActiveByDefault();
				return;
			case _0Package.ACTIVATION__JDK:
				setJdk(JDK_EDEFAULT);
				return;
			case _0Package.ACTIVATION__OS:
				setOs((ActivationOS)null);
				return;
			case _0Package.ACTIVATION__PROPERTY:
				setProperty((ActivationProperty)null);
				return;
			case _0Package.ACTIVATION__FILE:
				setFile((ActivationFile)null);
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
			case _0Package.ACTIVATION__ACTIVE_BY_DEFAULT:
				return isSetActiveByDefault();
			case _0Package.ACTIVATION__JDK:
				return JDK_EDEFAULT == null ? jdk != null : !JDK_EDEFAULT.equals(jdk);
			case _0Package.ACTIVATION__OS:
				return os != null;
			case _0Package.ACTIVATION__PROPERTY:
				return property != null;
			case _0Package.ACTIVATION__FILE:
				return file != null;
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
		result.append(" (activeByDefault: ");
		if (activeByDefaultESet) result.append(activeByDefault); else result.append("<unset>");
		result.append(", jdk: ");
		result.append(jdk);
		result.append(')');
		return result.toString();
	}

} //ActivationImpl
