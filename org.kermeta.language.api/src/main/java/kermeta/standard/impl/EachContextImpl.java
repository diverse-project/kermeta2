/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.standard.impl;

import java.lang.Boolean;
import java.lang.Integer;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.EachContext;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Each Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.standard.impl.EachContextImpl#getIsLast <em>Is Last</em>}</li>
 *   <li>{@link kermeta.standard.impl.EachContextImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link kermeta.standard.impl.EachContextImpl#getIsFirst <em>Is First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EachContextImpl extends ObjectImpl implements EachContext {
	/**
	 * The default value of the '{@link #getIsLast() <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLast()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LAST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsLast() <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLast()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLast = IS_LAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsFirst() <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFirst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FIRST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsFirst() <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFirst()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFirst = IS_FIRST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EachContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.EACH_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLast() {
		return isLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLast(Boolean newIsLast) {
		Boolean oldIsLast = isLast;
		isLast = newIsLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StandardPackage.EACH_CONTEXT__IS_LAST, oldIsLast, isLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Integer newIndex) {
		Integer oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StandardPackage.EACH_CONTEXT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFirst() {
		return isFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFirst(Boolean newIsFirst) {
		Boolean oldIsFirst = isFirst;
		isFirst = newIsFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StandardPackage.EACH_CONTEXT__IS_FIRST, oldIsFirst, isFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EachContext initialize(Integer i, Boolean first, Boolean last) {

		kermeta.standard.EachContext result = null;

		this.setIndex(i);

		this.setIsFirst(first);

		this.setIsLast(last);

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StandardPackage.EACH_CONTEXT__IS_LAST:
			return getIsLast();
		case StandardPackage.EACH_CONTEXT__INDEX:
			return getIndex();
		case StandardPackage.EACH_CONTEXT__IS_FIRST:
			return getIsFirst();
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
		case StandardPackage.EACH_CONTEXT__IS_LAST:
			setIsLast((Boolean) newValue);
			return;
		case StandardPackage.EACH_CONTEXT__INDEX:
			setIndex((Integer) newValue);
			return;
		case StandardPackage.EACH_CONTEXT__IS_FIRST:
			setIsFirst((Boolean) newValue);
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
		case StandardPackage.EACH_CONTEXT__IS_LAST:
			setIsLast(IS_LAST_EDEFAULT);
			return;
		case StandardPackage.EACH_CONTEXT__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case StandardPackage.EACH_CONTEXT__IS_FIRST:
			setIsFirst(IS_FIRST_EDEFAULT);
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
		case StandardPackage.EACH_CONTEXT__IS_LAST:
			return IS_LAST_EDEFAULT == null ? isLast != null
					: !IS_LAST_EDEFAULT.equals(isLast);
		case StandardPackage.EACH_CONTEXT__INDEX:
			return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT
					.equals(index);
		case StandardPackage.EACH_CONTEXT__IS_FIRST:
			return IS_FIRST_EDEFAULT == null ? isFirst != null
					: !IS_FIRST_EDEFAULT.equals(isFirst);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLast: ");
		result.append(isLast);
		result.append(", index: ");
		result.append(index);
		result.append(", isFirst: ");
		result.append(isFirst);
		result.append(')');
		return result.toString();
	}

} //EachContextImpl
