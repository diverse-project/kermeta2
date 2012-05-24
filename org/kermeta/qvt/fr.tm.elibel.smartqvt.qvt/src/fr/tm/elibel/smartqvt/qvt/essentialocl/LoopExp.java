/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.essentialocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LoopExp#getBody <em>Body</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LoopExp#getIterator <em>Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getLoopExp()
 * @model abstract="true"
 * @generated
 */
public interface LoopExp extends CallExp, OclExpression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getLoopExp_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.LoopExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getLoopExp_Iterator()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.Variable" containment="true" ordered="false"
	 * @generated
	 */
	EList getIterator();

} // LoopExp
