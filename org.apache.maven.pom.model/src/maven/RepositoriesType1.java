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
 * A representation of the model object '<em><b>Repositories Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.RepositoriesType1#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getRepositoriesType1()
 * @model extendedMetaData="name='repositories_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface RepositoriesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link maven.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see maven.MavenPackage#getRepositoriesType1_Repository()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repository' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Repository> getRepository();

} // RepositoriesType1
