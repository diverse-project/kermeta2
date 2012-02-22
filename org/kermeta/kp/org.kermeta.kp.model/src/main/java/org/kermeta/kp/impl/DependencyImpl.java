/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.kp.Dependency;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.PackageEquivalence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.DependencyImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.DependencyImpl#isIgnoreByteCode <em>Ignore Byte Code</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.DependencyImpl#isSourceOnly <em>Source Only</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.DependencyImpl#getGenmodel <em>Genmodel</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.DependencyImpl#isByteCodeOnly <em>Byte Code Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends NamedElementImpl implements Dependency {
	/**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
	protected EList<String> url;

	/**
   * The default value of the '{@link #isIgnoreByteCode() <em>Ignore Byte Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreByteCode()
   * @generated
   * @ordered
   */
  protected static final boolean IGNORE_BYTE_CODE_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isIgnoreByteCode() <em>Ignore Byte Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreByteCode()
   * @generated
   * @ordered
   */
  protected boolean ignoreByteCode = IGNORE_BYTE_CODE_EDEFAULT;
  /**
   * The default value of the '{@link #isSourceOnly() <em>Source Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSourceOnly()
   * @generated
   * @ordered
   */
  protected static final boolean SOURCE_ONLY_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isSourceOnly() <em>Source Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSourceOnly()
   * @generated
   * @ordered
   */
  protected boolean sourceOnly = SOURCE_ONLY_EDEFAULT;

  /**
   * The default value of the '{@link #getGenmodel() <em>Genmodel</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGenmodel()
   * @generated
   * @ordered
   */
	protected static final String GENMODEL_EDEFAULT = null;

		/**
   * The cached value of the '{@link #getGenmodel() <em>Genmodel</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGenmodel()
   * @generated
   * @ordered
   */
	protected String genmodel = GENMODEL_EDEFAULT;

		/**
   * The default value of the '{@link #isByteCodeOnly() <em>Byte Code Only</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isByteCodeOnly()
   * @generated
   * @ordered
   */
	protected static final boolean BYTE_CODE_ONLY_EDEFAULT = false;

		/**
   * The cached value of the '{@link #isByteCodeOnly() <em>Byte Code Only</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isByteCodeOnly()
   * @generated
   * @ordered
   */
	protected boolean byteCodeOnly = BYTE_CODE_ONLY_EDEFAULT;

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DependencyImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return KpPackage.Literals.DEPENDENCY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getUrl() {
    if (url == null)
    {
      url = new EDataTypeUniqueEList<String>(String.class, this, KpPackage.DEPENDENCY__URL);
    }
    return url;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreByteCode()
  {
    return ignoreByteCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreByteCode(boolean newIgnoreByteCode)
  {
    boolean oldIgnoreByteCode = ignoreByteCode;
    ignoreByteCode = newIgnoreByteCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.DEPENDENCY__IGNORE_BYTE_CODE, oldIgnoreByteCode, ignoreByteCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSourceOnly()
  {
    return sourceOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceOnly(boolean newSourceOnly)
  {
    boolean oldSourceOnly = sourceOnly;
    sourceOnly = newSourceOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.DEPENDENCY__SOURCE_ONLY, oldSourceOnly, sourceOnly));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getGenmodel() {
    return genmodel;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setGenmodel(String newGenmodel) {
    String oldGenmodel = genmodel;
    genmodel = newGenmodel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.DEPENDENCY__GENMODEL, oldGenmodel, genmodel));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isByteCodeOnly() {
    return byteCodeOnly;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setByteCodeOnly(boolean newByteCodeOnly) {
    boolean oldByteCodeOnly = byteCodeOnly;
    byteCodeOnly = newByteCodeOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.DEPENDENCY__BYTE_CODE_ONLY, oldByteCodeOnly, byteCodeOnly));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case KpPackage.DEPENDENCY__URL:
        return getUrl();
      case KpPackage.DEPENDENCY__IGNORE_BYTE_CODE:
        return isIgnoreByteCode();
      case KpPackage.DEPENDENCY__SOURCE_ONLY:
        return isSourceOnly();
      case KpPackage.DEPENDENCY__GENMODEL:
        return getGenmodel();
      case KpPackage.DEPENDENCY__BYTE_CODE_ONLY:
        return isByteCodeOnly();
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
    switch (featureID)
    {
      case KpPackage.DEPENDENCY__URL:
        getUrl().clear();
        getUrl().addAll((Collection<? extends String>)newValue);
        return;
      case KpPackage.DEPENDENCY__IGNORE_BYTE_CODE:
        setIgnoreByteCode((Boolean)newValue);
        return;
      case KpPackage.DEPENDENCY__SOURCE_ONLY:
        setSourceOnly((Boolean)newValue);
        return;
      case KpPackage.DEPENDENCY__GENMODEL:
        setGenmodel((String)newValue);
        return;
      case KpPackage.DEPENDENCY__BYTE_CODE_ONLY:
        setByteCodeOnly((Boolean)newValue);
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
    switch (featureID)
    {
      case KpPackage.DEPENDENCY__URL:
        getUrl().clear();
        return;
      case KpPackage.DEPENDENCY__IGNORE_BYTE_CODE:
        setIgnoreByteCode(IGNORE_BYTE_CODE_EDEFAULT);
        return;
      case KpPackage.DEPENDENCY__SOURCE_ONLY:
        setSourceOnly(SOURCE_ONLY_EDEFAULT);
        return;
      case KpPackage.DEPENDENCY__GENMODEL:
        setGenmodel(GENMODEL_EDEFAULT);
        return;
      case KpPackage.DEPENDENCY__BYTE_CODE_ONLY:
        setByteCodeOnly(BYTE_CODE_ONLY_EDEFAULT);
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
    switch (featureID)
    {
      case KpPackage.DEPENDENCY__URL:
        return url != null && !url.isEmpty();
      case KpPackage.DEPENDENCY__IGNORE_BYTE_CODE:
        return ignoreByteCode != IGNORE_BYTE_CODE_EDEFAULT;
      case KpPackage.DEPENDENCY__SOURCE_ONLY:
        return sourceOnly != SOURCE_ONLY_EDEFAULT;
      case KpPackage.DEPENDENCY__GENMODEL:
        return GENMODEL_EDEFAULT == null ? genmodel != null : !GENMODEL_EDEFAULT.equals(genmodel);
      case KpPackage.DEPENDENCY__BYTE_CODE_ONLY:
        return byteCodeOnly != BYTE_CODE_ONLY_EDEFAULT;
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
    result.append(" (url: ");
    result.append(url);
    result.append(", ignoreByteCode: ");
    result.append(ignoreByteCode);
    result.append(", sourceOnly: ");
    result.append(sourceOnly);
    result.append(", genmodel: ");
    result.append(genmodel);
    result.append(", byteCodeOnly: ");
    result.append(byteCodeOnly);
    result.append(')');
    return result.toString();
  }

} //DependencyImpl
