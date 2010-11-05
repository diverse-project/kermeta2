/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This boolean allows to tell if this Type definition is an aspect or not
 * If it is an aspect, then at runtime, its definition will be merged with the definition of another
 * TypeDefinition that has exactly the same qualified name
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.TypeDefinition#isIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link org.kermeta.language.structure.TypeDefinition#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.TypeDefinition#getTypeMappings <em>Type Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Is Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Aspect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aspect</em>' attribute.
	 * @see #setIsAspect(boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinition_IsAspect()
	 * @model dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsAspect();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.TypeDefinition#isIsAspect <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Aspect</em>' attribute.
	 * @see #isIsAspect()
	 * @generated
	 */
	void setIsAspect(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classes from which this ClassDefinition inherits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Type</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinition_SuperType()
	 * @model
	 * @generated
	 */
	EList<Type> getSuperType();

	/**
	 * Returns the value of the '<em><b>Type Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeMapping}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.TypeMapping#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These mappings define how we can substitute the target Type with this TypeDefinition 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Mappings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinition_TypeMappings()
	 * @see org.kermeta.language.structure.TypeMapping#getSourceType
	 * @model opposite="sourceType" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypeMapping> getTypeMappings();

} // TypeDefinition
