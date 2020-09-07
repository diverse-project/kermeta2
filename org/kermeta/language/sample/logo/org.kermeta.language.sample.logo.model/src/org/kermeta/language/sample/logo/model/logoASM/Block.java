/**
 */
package org.kermeta.language.sample.logo.model.logoASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.sample.logo.model.logoASM.Block#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.sample.logo.model.logoASM.LogoASMPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Instruction {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.sample.logo.model.logoASM.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.kermeta.language.sample.logo.model.logoASM.LogoASMPackage#getBlock_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // Block