/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Enumeration Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.SimpleEnumerationBinding#getSource <em>Source</em>}</li>
 *   <li>{@link org.kermeta.language.structure.SimpleEnumerationBinding#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getSimpleEnumerationBinding()
 * @model
 * @generated
 */
public interface SimpleEnumerationBinding extends EnumerationBinding {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Enumeration)
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleEnumerationBinding_Source()
	 * @model required="true"
	 * @generated
	 */
	Enumeration getSource();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.SimpleEnumerationBinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Enumeration)
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleEnumerationBinding_Target()
	 * @model required="true"
	 * @generated
	 */
	Enumeration getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.SimpleEnumerationBinding#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Enumeration value);

} // SimpleEnumerationBinding