/**
 */
package org.kermeta.language.sample.logo.model.logoASM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Back</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.sample.logo.model.logoASM.Back#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.sample.logo.model.logoASM.logoASMPackage#getBack()
 * @model
 * @generated
 */
public interface Back extends Primitive {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference.
	 * @see #setSteps(Expression)
	 * @see org.kermeta.language.sample.logo.model.logoASM.logoASMPackage#getBack_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSteps();

	/**
	 * Sets the value of the '{@link org.kermeta.language.sample.logo.model.logoASM.Back#getSteps <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps</em>' containment reference.
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(Expression value);

} // Back
