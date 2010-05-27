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
 * A representation of the model object '<em><b>Licenses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.LicensesType#getLicense <em>License</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getLicensesType()
 * @model extendedMetaData="name='licenses_._type' kind='elementOnly'"
 * @generated
 */
public interface LicensesType extends EObject {
	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference list.
	 * The list contents are of type {@link maven.License}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference list.
	 * @see maven.MavenPackage#getLicensesType_License()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<License> getLicense();

} // LicensesType
