/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of a class definition :)
 *  <pre>class A
 * { 
 *   attribute s : String
 * }
 *   </pre> is a class definition; in :
 * <pre>
 * main() : A is do end
 * </pre>
 * A is a <b>Class</b> : it corresponds to the <b>use</b> of the class definition of A
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getInv <em>Inv</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition()
 * @model
 * @generated
 */
public interface ClassDefinition extends GenericTypeDefinition, TypeContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Inv</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invariants defined for this ClassDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inv</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition_Inv()
	 * @see org.kermeta.language.structure.Constraint#getInvOwner
	 * @model opposite="invOwner" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Constraint> getInv();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether the ClassDefinition is abstract (which means that
	 * no instance can be allocated)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition_IsAbstract()
	 * @model dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ClassDefinition#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Property}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributes, References, and derived Properties owned by this ClassDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition_OwnedAttribute()
	 * @see org.kermeta.language.structure.Property#getOwningClass
	 * @model opposite="owningClass" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Operation}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operations owned by this ClassDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition_OwnedOperation()
	 * @see org.kermeta.language.structure.Operation#getOwningClass
	 * @model opposite="owningClass" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classes from which this ClassDefinition inherits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Type</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition_SuperType()
	 * @model
	 * @generated
	 */
	EList<Type> getSuperType();

} // ClassDefinition
