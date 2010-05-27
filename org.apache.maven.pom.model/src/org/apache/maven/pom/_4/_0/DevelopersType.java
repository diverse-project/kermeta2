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
 * A representation of the model object '<em><b>Developers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.DevelopersType#getDeveloper <em>Developer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.maven.pom._4._0._0Package#getDevelopersType()
 * @model extendedMetaData="name='developers_._type' kind='elementOnly'"
 * @generated
 */
public interface DevelopersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Developer</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.maven.pom._4._0.Developer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developer</em>' containment reference list.
	 * @see org.apache.maven.pom._4._0._0Package#getDevelopersType_Developer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='developer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Developer> getDeveloper();

} // DevelopersType
