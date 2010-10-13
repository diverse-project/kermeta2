/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.standard;

import java.lang.Boolean;
import java.lang.Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Each Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.standard.EachContext#getIsLast <em>Is Last</em>}</li>
 *   <li>{@link kermeta.standard.EachContext#getIndex <em>Index</em>}</li>
 *   <li>{@link kermeta.standard.EachContext#getIsFirst <em>Is First</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.standard.StandardPackage#getEachContext()
 * @model annotation="kermeta documentation='/**\n * context used in the indexedEach of Collection\n \052/'"
 *        annotation="kermeta CompilerIgnore='true'"
 * @generated
 */
public interface EachContext extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Is Last</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Last</em>' attribute.
	 * @see #setIsLast(Boolean)
	 * @see kermeta.standard.StandardPackage#getEachContext_IsLast()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 * @generated
	 */
	Boolean getIsLast();

	/**
	 * Sets the value of the '{@link kermeta.standard.EachContext#getIsLast <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Last</em>' attribute.
	 * @see #getIsLast()
	 * @generated
	 */
	void setIsLast(Boolean value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(Integer)
	 * @see kermeta.standard.StandardPackage#getEachContext_Index()
	 * @model dataType="kermeta.standard.JavaInteger"
	 * @generated
	 */
	Integer getIndex();

	/**
	 * Sets the value of the '{@link kermeta.standard.EachContext#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Integer value);

	/**
	 * Returns the value of the '<em><b>Is First</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is First</em>' attribute.
	 * @see #setIsFirst(Boolean)
	 * @see kermeta.standard.StandardPackage#getEachContext_IsFirst()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 * @generated
	 */
	Boolean getIsFirst();

	/**
	 * Sets the value of the '{@link kermeta.standard.EachContext#getIsFirst <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is First</em>' attribute.
	 * @see #getIsFirst()
	 * @generated
	 */
	void setIsFirst(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iDataType="kermeta.standard.JavaInteger" firstDataType="kermeta.standard.JavaBoolean" lastDataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.EachContext result = null;\n\n\tthis.setIndex(i);\n\n\tthis.setIsFirst(first);\n\n\tthis.setIsLast(last);\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	EachContext initialize(Integer i, Boolean first, Boolean last);

} // EachContext
