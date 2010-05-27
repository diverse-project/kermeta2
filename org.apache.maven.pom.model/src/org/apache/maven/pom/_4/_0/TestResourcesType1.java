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
 * A representation of the model object '<em><b>Test Resources Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.TestResourcesType1#getTestResource <em>Test Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.maven.pom._4._0._0Package#getTestResourcesType1()
 * @model extendedMetaData="name='testResources_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface TestResourcesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.maven.pom._4._0.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Resource</em>' containment reference list.
	 * @see org.apache.maven.pom._4._0._0Package#getTestResourcesType1_TestResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resource> getTestResource();

} // TestResourcesType1
