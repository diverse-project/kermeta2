/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.ContributorsType#getContributor <em>Contributor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.maven.pom._4._0._0Package#getContributorsType()
 * @model extendedMetaData="name='contributors_._type' kind='elementOnly'"
 * @generated
 */
public interface ContributorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.maven.pom._4._0.Contributor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference list.
	 * @see org.apache.maven.pom._4._0._0Package#getContributorsType_Contributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Contributor> getContributor();

} // ContributorsType
