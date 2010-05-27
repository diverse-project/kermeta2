/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import org.apache.maven.pom._4._0.ExcludesType;
import org.apache.maven.pom._4._0.IncludesType;
import org.apache.maven.pom._4._0.Resource;
import org.apache.maven.pom._4._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ResourceImpl#getTargetPath <em>Target Path</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ResourceImpl#isFiltering <em>Filtering</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ResourceImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ResourceImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ResourceImpl#getExcludes <em>Excludes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends EObjectImpl implements Resource {
	/**
	 * The default value of the '{@link #getTargetPath() <em>Target Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPath() <em>Target Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPath()
	 * @generated
	 * @ordered
	 */
	protected String targetPath = TARGET_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isFiltering() <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFiltering() <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltering()
	 * @generated
	 * @ordered
	 */
	protected boolean filtering = FILTERING_EDEFAULT;

	/**
	 * This is true if the Filtering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filteringESet;

	/**
	 * The default value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected String directory = DIRECTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected IncludesType includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected ExcludesType excludes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetPath() {
		return targetPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPath(String newTargetPath) {
		String oldTargetPath = targetPath;
		targetPath = newTargetPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.RESOURCE__TARGET_PATH, oldTargetPath, targetPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFiltering() {
		return filtering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltering(boolean newFiltering) {
		boolean oldFiltering = filtering;
		filtering = newFiltering;
		boolean oldFilteringESet = filteringESet;
		filteringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.RESOURCE__FILTERING, oldFiltering, filtering, !oldFilteringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiltering() {
		boolean oldFiltering = filtering;
		boolean oldFilteringESet = filteringESet;
		filtering = FILTERING_EDEFAULT;
		filteringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.RESOURCE__FILTERING, oldFiltering, FILTERING_EDEFAULT, oldFilteringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFiltering() {
		return filteringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirectory() {
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectory(String newDirectory) {
		String oldDirectory = directory;
		directory = newDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.RESOURCE__DIRECTORY, oldDirectory, directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludesType getIncludes() {
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludes(IncludesType newIncludes, NotificationChain msgs) {
		IncludesType oldIncludes = includes;
		includes = newIncludes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.RESOURCE__INCLUDES, oldIncludes, newIncludes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludes(IncludesType newIncludes) {
		if (newIncludes != includes) {
			NotificationChain msgs = null;
			if (includes != null)
				msgs = ((InternalEObject)includes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.RESOURCE__INCLUDES, null, msgs);
			if (newIncludes != null)
				msgs = ((InternalEObject)newIncludes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.RESOURCE__INCLUDES, null, msgs);
			msgs = basicSetIncludes(newIncludes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.RESOURCE__INCLUDES, newIncludes, newIncludes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludesType getExcludes() {
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludes(ExcludesType newExcludes, NotificationChain msgs) {
		ExcludesType oldExcludes = excludes;
		excludes = newExcludes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.RESOURCE__EXCLUDES, oldExcludes, newExcludes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludes(ExcludesType newExcludes) {
		if (newExcludes != excludes) {
			NotificationChain msgs = null;
			if (excludes != null)
				msgs = ((InternalEObject)excludes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.RESOURCE__EXCLUDES, null, msgs);
			if (newExcludes != null)
				msgs = ((InternalEObject)newExcludes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.RESOURCE__EXCLUDES, null, msgs);
			msgs = basicSetExcludes(newExcludes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.RESOURCE__EXCLUDES, newExcludes, newExcludes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.RESOURCE__INCLUDES:
				return basicSetIncludes(null, msgs);
			case _0Package.RESOURCE__EXCLUDES:
				return basicSetExcludes(null, msgs);
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
			case _0Package.RESOURCE__TARGET_PATH:
				return getTargetPath();
			case _0Package.RESOURCE__FILTERING:
				return isFiltering();
			case _0Package.RESOURCE__DIRECTORY:
				return getDirectory();
			case _0Package.RESOURCE__INCLUDES:
				return getIncludes();
			case _0Package.RESOURCE__EXCLUDES:
				return getExcludes();
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
			case _0Package.RESOURCE__TARGET_PATH:
				setTargetPath((String)newValue);
				return;
			case _0Package.RESOURCE__FILTERING:
				setFiltering((Boolean)newValue);
				return;
			case _0Package.RESOURCE__DIRECTORY:
				setDirectory((String)newValue);
				return;
			case _0Package.RESOURCE__INCLUDES:
				setIncludes((IncludesType)newValue);
				return;
			case _0Package.RESOURCE__EXCLUDES:
				setExcludes((ExcludesType)newValue);
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
			case _0Package.RESOURCE__TARGET_PATH:
				setTargetPath(TARGET_PATH_EDEFAULT);
				return;
			case _0Package.RESOURCE__FILTERING:
				unsetFiltering();
				return;
			case _0Package.RESOURCE__DIRECTORY:
				setDirectory(DIRECTORY_EDEFAULT);
				return;
			case _0Package.RESOURCE__INCLUDES:
				setIncludes((IncludesType)null);
				return;
			case _0Package.RESOURCE__EXCLUDES:
				setExcludes((ExcludesType)null);
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
			case _0Package.RESOURCE__TARGET_PATH:
				return TARGET_PATH_EDEFAULT == null ? targetPath != null : !TARGET_PATH_EDEFAULT.equals(targetPath);
			case _0Package.RESOURCE__FILTERING:
				return isSetFiltering();
			case _0Package.RESOURCE__DIRECTORY:
				return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
			case _0Package.RESOURCE__INCLUDES:
				return includes != null;
			case _0Package.RESOURCE__EXCLUDES:
				return excludes != null;
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
		result.append(" (targetPath: ");
		result.append(targetPath);
		result.append(", filtering: ");
		if (filteringESet) result.append(filtering); else result.append("<unset>");
		result.append(", directory: ");
		result.append(directory);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
