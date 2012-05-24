/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.essentialocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LetExp#getIn <em>In</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LetExp#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getLetExp()
 * @model
 * @generated
 */
public interface LetExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getLetExp_In()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getIn();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LetExp#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.Variable#getLetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getLetExp_Variable()
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.Variable#getLetExp
	 * @model opposite="letExp" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LetExp#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // LetExp
