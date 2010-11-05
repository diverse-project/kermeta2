/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Special type reference which is still unresolved.
 * The reference string is used to create a real Type that points to the correct TypeDefinition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.UnresolvedType#getTypeIdentifier <em>Type Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedType()
 * @model
 * @generated
 */
public interface UnresolvedType extends Type, Unresolved {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String that identifies the Type.
	 * The container of the UnresolvedType  is considered as the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Identifier</em>' attribute.
	 * @see #setTypeIdentifier(String)
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedType_TypeIdentifier()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getTypeIdentifier();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.UnresolvedType#getTypeIdentifier <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Identifier</em>' attribute.
	 * @see #getTypeIdentifier()
	 * @generated
	 */
	void setTypeIdentifier(String value);

} // UnresolvedType
