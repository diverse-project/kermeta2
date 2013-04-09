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
 * A representation of the model object '<em><b>Plugins Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.PluginsType3#getPlugin <em>Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getPluginsType3()
 * @model extendedMetaData="name='plugins_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface PluginsType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' containment reference list.
	 * The list contents are of type {@link maven.Plugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' containment reference list.
	 * @see maven.MavenPackage#getPluginsType3_Plugin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plugin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Plugin> getPlugin();

} // PluginsType3
