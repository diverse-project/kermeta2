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
 * A representation of the model object '<em><b>Modules Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.ModulesType1#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getModulesType1()
 * @model extendedMetaData="name='modules_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ModulesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute list.
	 * @see maven.MavenPackage#getModulesType1_Module()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='module' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getModule();

} // ModulesType1
