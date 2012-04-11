/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.Expression;
import alfDsl.LinkOperationTupleElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Operation Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.LinkOperationTupleElementImpl#getObjectOrRole <em>Object Or Role</em>}</li>
 *   <li>{@link alfDsl.impl.LinkOperationTupleElementImpl#getRoleIndex <em>Role Index</em>}</li>
 *   <li>{@link alfDsl.impl.LinkOperationTupleElementImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkOperationTupleElementImpl extends EObjectImpl implements LinkOperationTupleElement {
	/**
	 * The default value of the '{@link #getObjectOrRole() <em>Object Or Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectOrRole()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_OR_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectOrRole() <em>Object Or Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectOrRole()
	 * @generated
	 * @ordered
	 */
	protected String objectOrRole = OBJECT_OR_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoleIndex() <em>Role Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleIndex()
	 * @generated
	 * @ordered
	 */
	protected Expression roleIndex;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected String object = OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkOperationTupleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.LINK_OPERATION_TUPLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectOrRole() {
		return objectOrRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectOrRole(String newObjectOrRole) {
		String oldObjectOrRole = objectOrRole;
		objectOrRole = newObjectOrRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE, oldObjectOrRole, objectOrRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRoleIndex() {
		return roleIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleIndex(Expression newRoleIndex, NotificationChain msgs) {
		Expression oldRoleIndex = roleIndex;
		roleIndex = newRoleIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX, oldRoleIndex, newRoleIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleIndex(Expression newRoleIndex) {
		if (newRoleIndex != roleIndex) {
			NotificationChain msgs = null;
			if (roleIndex != null)
				msgs = ((InternalEObject)roleIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX, null, msgs);
			if (newRoleIndex != null)
				msgs = ((InternalEObject)newRoleIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX, null, msgs);
			msgs = basicSetRoleIndex(newRoleIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX, newRoleIndex, newRoleIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(String newObject) {
		String oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
				return basicSetRoleIndex(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE:
				return getObjectOrRole();
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
				return getRoleIndex();
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT:
				return getObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE:
				setObjectOrRole((String)newValue);
				return;
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
				setRoleIndex((Expression)newValue);
				return;
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT:
				setObject((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE:
				setObjectOrRole(OBJECT_OR_ROLE_EDEFAULT);
				return;
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
				setRoleIndex((Expression)null);
				return;
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE:
				return OBJECT_OR_ROLE_EDEFAULT == null ? objectOrRole != null : !OBJECT_OR_ROLE_EDEFAULT.equals(objectOrRole);
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
				return roleIndex != null;
			case AlfDslPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (objectOrRole: ");
		result.append(objectOrRole);
		result.append(", object: ");
		result.append(object);
		result.append(')');
		return result.toString();
	}

} //LinkOperationTupleElementImpl
