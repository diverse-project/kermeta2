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
 * A representation of the model object '<em><b>Excludes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.ExcludesType#getExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getExcludesType()
 * @model extendedMetaData="name='excludes_._type' kind='elementOnly'"
 * @generated
 */
public interface ExcludesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' attribute list.
	 * @see maven.MavenPackage#getExcludesType_Exclude()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getExclude();

} // ExcludesType
