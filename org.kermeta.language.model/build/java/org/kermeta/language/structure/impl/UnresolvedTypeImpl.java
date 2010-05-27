/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.UnresolvedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedTypeImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_TYPE__TYPE_IDENTIFIER:
				return getTypeIdentifier();
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
