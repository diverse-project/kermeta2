/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.UnresolvedType;
import org.kermeta.language.structure.Using;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl#getUsings <em>Usings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedTypeImpl extends TypeImpl implements UnresolvedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * The default value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String typeIdentifier = TYPE_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsings()
	 * @generated
	 * @ordered
	 */
	protected Using usings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.UNRESOLVED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeIdentifier() {
		return typeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeIdentifier(String newTypeIdentifier) {
		String oldTypeIdentifier = typeIdentifier;
		typeIdentifier = newTypeIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER, oldTypeIdentifier, typeIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Using getUsings() {
		if (usings != null && usings.eIsProxy()) {
			InternalEObject oldUsings = (InternalEObject)usings;
			usings = (Using)eResolveProxy(oldUsings);
			if (usings != oldUsings) {
				InternalEObject newUsings = (InternalEObject)usings;
				NotificationChain msgs = oldUsings.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.UNRESOLVED_TYPE__USINGS, null, null);
				if (newUsings.eInternalContainer() == null) {
					msgs = newUsings.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.UNRESOLVED_TYPE__USINGS, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.UNRESOLVED_TYPE__USINGS, oldUsings, usings));
			}
		}
		return usings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Using basicGetUsings() {
		return usings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsings(Using newUsings, NotificationChain msgs) {
		Using oldUsings = usings;
		usings = newUsings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_TYPE__USINGS, oldUsings, newUsings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsings(Using newUsings) {
		if (newUsings != usings) {
			NotificationChain msgs = null;
			if (usings != null)
				msgs = ((InternalEObject)usings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.UNRESOLVED_TYPE__USINGS, null, msgs);
			if (newUsings != null)
				msgs = ((InternalEObject)newUsings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.UNRESOLVED_TYPE__USINGS, null, msgs);
			msgs = basicSetUsings(newUsings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_TYPE__USINGS, newUsings, newUsings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				return basicSetUsings(null, msgs);
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
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				return getTypeIdentifier();
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				if (resolve) return getUsings();
				return basicGetUsings();
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
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				setTypeIdentifier((String)newValue);
				return;
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				setUsings((Using)newValue);
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
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				setTypeIdentifier(TYPE_IDENTIFIER_EDEFAULT);
				return;
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				setUsings((Using)null);
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
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				return TYPE_IDENTIFIER_EDEFAULT == null ? typeIdentifier != null : !TYPE_IDENTIFIER_EDEFAULT.equals(typeIdentifier);
			case StructurePackage.UNRESOLVED_TYPE__USINGS:
				return usings != null;
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
		result.append(" (typeIdentifier: ");
		result.append(typeIdentifier);
		result.append(')');
		return result.toString();
	}

} //UnresolvedTypeImpl
