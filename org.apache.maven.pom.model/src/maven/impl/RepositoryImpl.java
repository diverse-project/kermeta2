/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package maven.impl;

import maven.MavenPackage;
import maven.Repository;
import maven.RepositoryPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maven.impl.RepositoryImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link maven.impl.RepositoryImpl#getSnapshots <em>Snapshots</em>}</li>
 *   <li>{@link maven.impl.RepositoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link maven.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link maven.impl.RepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link maven.impl.RepositoryImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends EObjectImpl implements Repository {
	/**
	 * The cached value of the '{@link #getReleases() <em>Releases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleases()
	 * @generated
	 * @ordered
	 */
	protected RepositoryPolicy releases;

	/**
	 * The cached value of the '{@link #getSnapshots() <em>Snapshots</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshots()
	 * @generated
	 * @ordered
	 */
	protected RepositoryPolicy snapshots;

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
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryPolicy getReleases() {
		return releases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleases(RepositoryPolicy newReleases, NotificationChain msgs) {
		RepositoryPolicy oldReleases = releases;
		releases = newReleases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MavenPackage.REPOSITORY__RELEASES, oldReleases, newReleases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleases(RepositoryPolicy newReleases) {
		if (newReleases != releases) {
			NotificationChain msgs = null;
			if (releases != null)
				msgs = ((InternalEObject)releases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MavenPackage.REPOSITORY__RELEASES, null, msgs);
			if (newReleases != null)
				msgs = ((InternalEObject)newReleases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MavenPackage.REPOSITORY__RELEASES, null, msgs);
			msgs = basicSetReleases(newReleases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MavenPackage.REPOSITORY__RELEASES, newReleases, newReleases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryPolicy getSnapshots() {
		return snapshots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSnapshots(RepositoryPolicy newSnapshots, NotificationChain msgs) {
		RepositoryPolicy oldSnapshots = snapshots;
		snapshots = newSnapshots;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MavenPackage.REPOSITORY__SNAPSHOTS, oldSnapshots, newSnapshots);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapshots(RepositoryPolicy newSnapshots) {
		if (newSnapshots != snapshots) {
			NotificationChain msgs = null;
			if (snapshots != null)
				msgs = ((InternalEObject)snapshots).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MavenPackage.REPOSITORY__SNAPSHOTS, null, msgs);
			if (newSnapshots != null)
				msgs = ((InternalEObject)newSnapshots).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MavenPackage.REPOSITORY__SNAPSHOTS, null, msgs);
			msgs = basicSetSnapshots(newSnapshots, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MavenPackage.REPOSITORY__SNAPSHOTS, newSnapshots, newSnapshots));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MavenPackage.REPOSITORY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MavenPackage.REPOSITORY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MavenPackage.REPOSITORY__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MavenPackage.REPOSITORY__LAYOUT, oldLayout, layout, !oldLayoutESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MavenPackage.REPOSITORY__LAYOUT, oldLayout, LAYOUT_EDEFAULT, oldLayoutESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MavenPackage.REPOSITORY__RELEASES:
				return basicSetReleases(null, msgs);
			case MavenPackage.REPOSITORY__SNAPSHOTS:
				return basicSetSnapshots(null, msgs);
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
			case MavenPackage.REPOSITORY__RELEASES:
				return getReleases();
			case MavenPackage.REPOSITORY__SNAPSHOTS:
				return getSnapshots();
			case MavenPackage.REPOSITORY__ID:
				return getId();
			case MavenPackage.REPOSITORY__NAME:
				return getName();
			case MavenPackage.REPOSITORY__URL:
				return getUrl();
			case MavenPackage.REPOSITORY__LAYOUT:
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
			case MavenPackage.REPOSITORY__RELEASES:
				setReleases((RepositoryPolicy)newValue);
				return;
			case MavenPackage.REPOSITORY__SNAPSHOTS:
				setSnapshots((RepositoryPolicy)newValue);
				return;
			case MavenPackage.REPOSITORY__ID:
				setId((String)newValue);
				return;
			case MavenPackage.REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case MavenPackage.REPOSITORY__URL:
				setUrl((String)newValue);
				return;
			case MavenPackage.REPOSITORY__LAYOUT:
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
			case MavenPackage.REPOSITORY__RELEASES:
				setReleases((RepositoryPolicy)null);
				return;
			case MavenPackage.REPOSITORY__SNAPSHOTS:
				setSnapshots((RepositoryPolicy)null);
				return;
			case MavenPackage.REPOSITORY__ID:
				setId(ID_EDEFAULT);
				return;
			case MavenPackage.REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MavenPackage.REPOSITORY__URL:
				setUrl(URL_EDEFAULT);
				return;
			case MavenPackage.REPOSITORY__LAYOUT:
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
			case MavenPackage.REPOSITORY__RELEASES:
				return releases != null;
			case MavenPackage.REPOSITORY__SNAPSHOTS:
				return snapshots != null;
			case MavenPackage.REPOSITORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MavenPackage.REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MavenPackage.REPOSITORY__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case MavenPackage.REPOSITORY__LAYOUT:
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
		result.append(" (id: ");
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

} //RepositoryImpl
