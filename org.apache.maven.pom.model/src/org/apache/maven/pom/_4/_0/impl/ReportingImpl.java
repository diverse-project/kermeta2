/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import org.apache.maven.pom._4._0.PluginsType1;
import org.apache.maven.pom._4._0.Reporting;
import org.apache.maven.pom._4._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reporting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ReportingImpl#isExcludeDefaults <em>Exclude Defaults</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ReportingImpl#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.ReportingImpl#getPlugins <em>Plugins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportingImpl extends EObjectImpl implements Reporting {
	/**
	 * The default value of the '{@link #isExcludeDefaults() <em>Exclude Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExcludeDefaults()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUDE_DEFAULTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExcludeDefaults() <em>Exclude Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExcludeDefaults()
	 * @generated
	 * @ordered
	 */
	protected boolean excludeDefaults = EXCLUDE_DEFAULTS_EDEFAULT;

	/**
	 * This is true if the Exclude Defaults attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean excludeDefaultsESet;

	/**
	 * The default value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDirectory()
	 * @generated
	 * @ordered
	 */
	protected String outputDirectory = OUTPUT_DIRECTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugins()
	 * @generated
	 * @ordered
	 */
	protected PluginsType1 plugins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.REPORTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExcludeDefaults() {
		return excludeDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeDefaults(boolean newExcludeDefaults) {
		boolean oldExcludeDefaults = excludeDefaults;
		excludeDefaults = newExcludeDefaults;
		boolean oldExcludeDefaultsESet = excludeDefaultsESet;
		excludeDefaultsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.REPORTING__EXCLUDE_DEFAULTS, oldExcludeDefaults, excludeDefaults, !oldExcludeDefaultsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExcludeDefaults() {
		boolean oldExcludeDefaults = excludeDefaults;
		boolean oldExcludeDefaultsESet = excludeDefaultsESet;
		excludeDefaults = EXCLUDE_DEFAULTS_EDEFAULT;
		excludeDefaultsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.REPORTING__EXCLUDE_DEFAULTS, oldExcludeDefaults, EXCLUDE_DEFAULTS_EDEFAULT, oldExcludeDefaultsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExcludeDefaults() {
		return excludeDefaultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputDirectory() {
		return outputDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDirectory(String newOutputDirectory) {
		String oldOutputDirectory = outputDirectory;
		outputDirectory = newOutputDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.REPORTING__OUTPUT_DIRECTORY, oldOutputDirectory, outputDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginsType1 getPlugins() {
		return plugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlugins(PluginsType1 newPlugins, NotificationChain msgs) {
		PluginsType1 oldPlugins = plugins;
		plugins = newPlugins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.REPORTING__PLUGINS, oldPlugins, newPlugins);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugins(PluginsType1 newPlugins) {
		if (newPlugins != plugins) {
			NotificationChain msgs = null;
			if (plugins != null)
				msgs = ((InternalEObject)plugins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.REPORTING__PLUGINS, null, msgs);
			if (newPlugins != null)
				msgs = ((InternalEObject)newPlugins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.REPORTING__PLUGINS, null, msgs);
			msgs = basicSetPlugins(newPlugins, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.REPORTING__PLUGINS, newPlugins, newPlugins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.REPORTING__PLUGINS:
				return basicSetPlugins(null, msgs);
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
			case _0Package.REPORTING__EXCLUDE_DEFAULTS:
				return isExcludeDefaults();
			case _0Package.REPORTING__OUTPUT_DIRECTORY:
				return getOutputDirectory();
			case _0Package.REPORTING__PLUGINS:
				return getPlugins();
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
			case _0Package.REPORTING__EXCLUDE_DEFAULTS:
				setExcludeDefaults((Boolean)newValue);
				return;
			case _0Package.REPORTING__OUTPUT_DIRECTORY:
				setOutputDirectory((String)newValue);
				return;
			case _0Package.REPORTING__PLUGINS:
				setPlugins((PluginsType1)newValue);
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
			case _0Package.REPORTING__EXCLUDE_DEFAULTS:
				unsetExcludeDefaults();
				return;
			case _0Package.REPORTING__OUTPUT_DIRECTORY:
				setOutputDirectory(OUTPUT_DIRECTORY_EDEFAULT);
				return;
			case _0Package.REPORTING__PLUGINS:
				setPlugins((PluginsType1)null);
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
			case _0Package.REPORTING__EXCLUDE_DEFAULTS:
				return isSetExcludeDefaults();
			case _0Package.REPORTING__OUTPUT_DIRECTORY:
				return OUTPUT_DIRECTORY_EDEFAULT == null ? outputDirectory != null : !OUTPUT_DIRECTORY_EDEFAULT.equals(outputDirectory);
			case _0Package.REPORTING__PLUGINS:
				return plugins != null;
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
		result.append(" (excludeDefaults: ");
		if (excludeDefaultsESet) result.append(excludeDefaults); else result.append("<unset>");
		result.append(", outputDirectory: ");
		result.append(outputDirectory);
		result.append(')');
		return result.toString();
	}

} //ReportingImpl
