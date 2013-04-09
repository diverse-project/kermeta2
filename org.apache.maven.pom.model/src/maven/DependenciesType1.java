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
 * A representation of the model object '<em><b>Dependencies Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.DependenciesType1#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getDependenciesType1()
 * @model extendedMetaData="name='dependencies_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface DependenciesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link maven.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see maven.MavenPackage#getDependenciesType1_Dependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Dependency> getDependency();

} // DependenciesType1
