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
 * A representation of the model object '<em><b>Extensions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.ExtensionsType#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getExtensionsType()
 * @model extendedMetaData="name='extensions_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtensionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link maven.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see maven.MavenPackage#getExtensionsType_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getExtension();

} // ExtensionsType
