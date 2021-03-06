/**
 * <copyright>
 * </copyright>
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
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getIsSingleton <em>Is Singleton</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ClassDefinition#getIsFinal <em>Is Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition()
 * @model
 * @generated
 */
public interface ClassDefinition extends GenericTypeDefinition {
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
	 * @model opposite="invOwner" containment="true"
	 * @generated
	 */
	EList<Constraint> getInv();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether the ClassDefinition is abstract (which means that
	 * no instance can be allocated)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition_IsAbstract()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ClassDefinition#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

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
	 * @model opposite="owningClass" containment="true" ordered="false"
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
	 * @model opposite="owningClass" containment="true" ordered="false"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Is Singleton</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether the ClassDefinition is a singleton. 
	 * 
	 * Note: not sure is this is the right place, maybe it can be generalized to other TypeDefinition ?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Singleton</em>' attribute.
	 * @see #setIsSingleton(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition_IsSingleton()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsSingleton();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ClassDefinition#getIsSingleton <em>Is Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Singleton</em>' attribute.
	 * @see #getIsSingleton()
	 * @generated
	 */
	void setIsSingleton(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates wether this defintition can be subclassed. 
	 * This has no effect on extension via aspect weaving.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getClassDefinition_IsFinal()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsFinal();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ClassDefinition#getIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #getIsFinal()
	 * @generated
	 */
	void setIsFinal(Boolean value);

} // ClassDefinition
