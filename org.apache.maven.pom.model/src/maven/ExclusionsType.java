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
 * A representation of the model object '<em><b>Exclusions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.ExclusionsType#getExclusion <em>Exclusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getExclusionsType()
 * @model extendedMetaData="name='exclusions_._type' kind='elementOnly'"
 * @generated
 */
public interface ExclusionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclusion</b></em>' containment reference list.
	 * The list contents are of type {@link maven.Exclusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion</em>' containment reference list.
	 * @see maven.MavenPackage#getExclusionsType_Exclusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclusion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Exclusion> getExclusion();

} // ExclusionsType
