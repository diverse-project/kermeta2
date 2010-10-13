/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.kunit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.Failure#getMessage <em>Message</em>}</li>
 *   <li>{@link kermeta.kunit.Failure#getFailure <em>Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getFailure()
 * @model annotation="kermeta documentation='/**\n * Failure represents an assertion failure stored in a failure log\n \052/'"
 *        annotation="kermeta CompilerIgnore='true'"
 * @generated
 */
public interface Failure extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see kermeta.kunit.KunitPackage#getFailure_Message()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * the stored message (given or generated one)\n\t \052/'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Failure#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' reference.
	 * @see #setFailure(Fallible)
	 * @see kermeta.kunit.KunitPackage#getFailure_Failure()
	 * @model annotation="kermeta documentation='/**\n\t * the stored failure\n\t \052/'"
	 * @generated
	 */
	Fallible getFailure();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Failure#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Fallible value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * overwrite the default method, in order to add the message\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this.getFailure()), \" \"), this.getMessage());\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * initialization of the failure\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.Failure result = null;\n\n\tthis.setFailure(fallible);\n\n\tthis.setMessage(msg);\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	Failure initFrom(Fallible fallible, String msg);

} // Failure
