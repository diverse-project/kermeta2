/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.EqualityExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link org3.kermeta.alf.EqualityExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getEqualityExpression()
 * @model
 * @generated
 */
public interface EqualityExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link org3.kermeta.alf.ClassificationExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see org3.kermeta.alf.AlfPackage#getEqualityExpression_Exp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassificationExpression> getExp();

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute list.
	 * @see org3.kermeta.alf.AlfPackage#getEqualityExpression_Op()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getOp();

} // EqualityExpression
