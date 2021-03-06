/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collect Or Iterate Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.CollectOrIterateOperation#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getCollectOrIterateOperation()
 * @model
 * @generated
 */
public interface CollectOrIterateOperation extends SequenceExpansionExpression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org3.kermeta.alf.CollectOrIterateOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org3.kermeta.alf.CollectOrIterateOperator
	 * @see #setOp(CollectOrIterateOperator)
	 * @see org3.kermeta.alf.AlfPackage#getCollectOrIterateOperation_Op()
	 * @model
	 * @generated
	 */
	CollectOrIterateOperator getOp();

	/**
	 * Sets the value of the '{@link org3.kermeta.alf.CollectOrIterateOperation#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org3.kermeta.alf.CollectOrIterateOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(CollectOrIterateOperator value);

} // CollectOrIterateOperation
