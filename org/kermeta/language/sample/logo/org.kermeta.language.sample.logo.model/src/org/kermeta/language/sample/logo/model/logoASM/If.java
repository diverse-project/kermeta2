/**
 */
package org.kermeta.language.sample.logo.model.logoASM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.sample.logo.model.logoASM.If#getThenPart <em>Then Part</em>}</li>
 *   <li>{@link org.kermeta.language.sample.logo.model.logoASM.If#getElsePart <em>Else Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.sample.logo.model.logoASM.LogoASMPackage#getIf()
 * @model
 * @generated
 */
public interface If extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>Then Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Part</em>' containment reference.
	 * @see #setThenPart(Block)
	 * @see org.kermeta.language.sample.logo.model.logoASM.LogoASMPackage#getIf_ThenPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getThenPart();

	/**
	 * Sets the value of the '{@link org.kermeta.language.sample.logo.model.logoASM.If#getThenPart <em>Then Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Part</em>' containment reference.
	 * @see #getThenPart()
	 * @generated
	 */
	void setThenPart(Block value);

	/**
	 * Returns the value of the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Part</em>' containment reference.
	 * @see #setElsePart(Block)
	 * @see org.kermeta.language.sample.logo.model.logoASM.LogoASMPackage#getIf_ElsePart()
	 * @model containment="true"
	 * @generated
	 */
	Block getElsePart();

	/**
	 * Sets the value of the '{@link org.kermeta.language.sample.logo.model.logoASM.If#getElsePart <em>Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Part</em>' containment reference.
	 * @see #getElsePart()
	 * @generated
	 */
	void setElsePart(Block value);

} // If
