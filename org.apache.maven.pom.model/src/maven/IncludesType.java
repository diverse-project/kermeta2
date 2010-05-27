/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package maven;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Includes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.IncludesType#getInclude <em>Include</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getIncludesType()
 * @model extendedMetaData="name='includes_._type' kind='elementOnly'"
 * @generated
 */
public interface IncludesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' attribute list.
	 * @see maven.MavenPackage#getIncludesType_Include()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getInclude();

} // IncludesType
