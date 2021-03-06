/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Super Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a call to the operation in a parent class. 
 * 	In the following example, the type of super(element) is CallSuperOperation:
 * 
 * class ParentClass {
 *   operation op(element : Integer) : Integer is do
 *       result := element + 1
 *   end
 * }
 *  *
 * class ChildClass {
 *   method op(element : Integer) : Integer is do
 *       result := super(element)
 *   end
 * }
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.CallSuperOperation#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallSuperOperation()
 * @model
 * @generated
 */
public interface CallSuperOperation extends CallOperation {

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After resolving this type must be set (either because the user entered it, or it can be computed because there is only one parent)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(Type)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallSuperOperation_SuperType()
	 * @model
	 * @generated
	 */
	Type getSuperType();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallSuperOperation#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(Type value);
} // CallSuperOperation
