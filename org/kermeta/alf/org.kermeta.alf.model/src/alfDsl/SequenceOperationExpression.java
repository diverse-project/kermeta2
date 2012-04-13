/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Operation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.SequenceOperationExpression#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link alfDsl.SequenceOperationExpression#getTuple <em>Tuple</em>}</li>
 *   <li>{@link alfDsl.SequenceOperationExpression#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSequenceOperationExpression()
 * @model
 * @generated
 */
public interface SequenceOperationExpression extends SuffixExpression {
	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see alfDsl.AlfDslPackage#getSequenceOperationExpression_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceOperationExpression#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple</em>' containment reference.
	 * @see #setTuple(Tuple)
	 * @see alfDsl.AlfDslPackage#getSequenceOperationExpression_Tuple()
	 * @model containment="true"
	 * @generated
	 */
	Tuple getTuple();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceOperationExpression#getTuple <em>Tuple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple</em>' containment reference.
	 * @see #getTuple()
	 * @generated
	 */
	void setTuple(Tuple value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference.
	 * @see #setSuffix(SuffixExpression)
	 * @see alfDsl.AlfDslPackage#getSequenceOperationExpression_Suffix()
	 * @model containment="true"
	 * @generated
	 */
	SuffixExpression getSuffix();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceOperationExpression#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(SuffixExpression value);

} // SequenceOperationExpression