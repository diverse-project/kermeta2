/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import org.apache.maven.pom._4._0.DeploymentRepository;
import org.apache.maven.pom._4._0._0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeploymentRepositoryImpl#isUniqueVersion <em>Unique Version</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeploymentRepositoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeploymentRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeploymentRepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeploymentRepositoryImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentRepositoryImpl extends EObjectImpl implements DeploymentRepository {
	/**
	 * The default value of the '{@link #isUniqueVersion() <em>Unique Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_VERSION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUniqueVersion() <em>Unique Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueVersion = UNIQUE_VERSION_EDEFAULT;

	/**
	 * This is true if the Unique Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueVersionESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_EDEFAULT = "default";

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected String layout = LAYOUT_EDEFAULT;

	/**
	 * This is true if the Layout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.DEPLOYMENT_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueVersion() {
		return uniqueVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueVersion(boolean newUniqueVersion) {
		boolean oldUniqueVersion = uniqueVersion;
		uniqueVersion = newUniqueVersion;
		boolean oldUniqueVersionESet = uniqueVersionESet;
		uniqueVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEPLOYMENT_REPOSITORY__UNIQUE_VERSION, oldUniqueVersion, uniqueVersion, !oldUniqueVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniqueVersion() {
		boolean oldUniqueVersion = uniqueVersion;
		boolean oldUniqueVersionESet = uniqueVersionESet;
		uniqueVersion = UNIQUE_VERSION_EDEFAULT;
		uniqueVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.DEPLOYMENT_REPOSITORY__UNIQUE_VERSION, oldUniqueVersion, UNIQUE_VERSION_EDEFAULT, oldUniqueVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniqueVersion() {
		return uniqueVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEPLOYMENT_REPOSITORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEPLOYMENT_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEPLOYMENT_REPOSITORY__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(String newLayout) {
		String oldLayout = layout;
		layout = newLayout;
		boolean oldLayoutESet = layoutESet;
		layoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEPLOYMENT_REPOSITORY__LAYOUT, oldLayout, layout, !oldLayoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayout() {
		String oldLayout = layout;
		boolean oldLayoutESet = layoutESet;
		layout = LAYOUT_EDEFAULT;
		layoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.DEPLOYMENT_REPOSITORY__LAYOUT, oldLayout, LAYOUT_EDEFAULT, oldLayoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayout() {
		return layoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.DEPLOYMENT_REPOSITORY__UNIQUE_VERSION:
				return isUniqueVersion();
			case _0Package.DEPLOYMENT_REPOSITORY__ID:
				return getId();
			case _0Package.DEPLOYMENT_REPOSITORY__NAME:
				return getName();
			case _0Package.DEPLOYMENT_REPOSITORY__URL:
				return getUrl();
			case _0Package.DEPLOYMENT_REPOSITORY__LAYOUT:
				return getLayout();
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
			case _0Package.DEPLOYMENT_REPOSITORY__UNIQUE_VERSION:
				setUniqueVersion((Boolean)newValue);
				return;
			case _0Package.DEPLOYMENT_REPOSITORY__ID:
				setId((String)newValue);
				return;
			case _0Package.DEPLOYMENT_REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case _0Package.DEPLOYMENT_REPOSITORY__URL:
				setUrl((String)newValue);
				return;
			case _0Package.DEPLOYMENT_REPOSITORY__LAYOUT:
				setLayout((String)newValue);
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
			case _0Package.DEPLOYMENT_REPOSITORY__UNIQUE_VERSION:
				unsetUniqueVersion();
				return;
			case _0Package.DEPLOYMENT_REPOSITORY__ID:
				setId(ID_EDEFAULT);
				return;
			case _0Package.DEPLOYMENT_REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _0Package.DEPLOYMENT_REPOSITORY__URL:
				setUrl(URL_EDEFAULT);
				return;
			case _0Package.DEPLOYMENT_REPOSITORY__LAYOUT:
				unsetLayout();
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
			case _0Package.DEPLOYMENT_REPOSITORY__UNIQUE_VERSION:
				return isSetUniqueVersion();
			case _0Package.DEPLOYMENT_REPOSITORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _0Package.DEPLOYMENT_REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _0Package.DEPLOYMENT_REPOSITORY__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case _0Package.DEPLOYMENT_REPOSITORY__LAYOUT:
				return isSetLayout();
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
		result.append(" (uniqueVersion: ");
		if (uniqueVersionESet) result.append(uniqueVersion); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(", layout: ");
		if (layoutESet) result.append(layout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeploymentRepositoryImpl
