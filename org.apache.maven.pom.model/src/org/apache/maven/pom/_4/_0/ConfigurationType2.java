/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.ConfigurationType2#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.maven.pom._4._0._0Package#getConfigurationType2()
 * @model extendedMetaData="name='configuration_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.apache.maven.pom._4._0._0Package#getConfigurationType2_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='skip'"
	 * @generated
	 */
	FeatureMap getAny();

} // ConfigurationType2
