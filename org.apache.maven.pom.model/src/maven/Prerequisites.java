/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package maven;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0
 * Describes the prerequisites a project can have.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.Prerequisites#getMaven <em>Maven</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getPrerequisites()
 * @model extendedMetaData="name='Prerequisites' kind='elementOnly'"
 * @generated
 */
public interface Prerequisites extends EObject {
	/**
	 * Returns the value of the '<em><b>Maven</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * The minimum version of Maven required to build the project, or to use this plugin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maven</em>' attribute.
	 * @see #isSetMaven()
	 * @see #unsetMaven()
	 * @see #setMaven(String)
	 * @see maven.MavenPackage#getPrerequisites_Maven()
	 * @model default="2.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='maven' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaven();

	/**
	 * Sets the value of the '{@link maven.Prerequisites#getMaven <em>Maven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maven</em>' attribute.
	 * @see #isSetMaven()
	 * @see #unsetMaven()
	 * @see #getMaven()
	 * @generated
	 */
	void setMaven(String value);

	/**
	 * Unsets the value of the '{@link maven.Prerequisites#getMaven <em>Maven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaven()
	 * @see #getMaven()
	 * @see #setMaven(String)
	 * @generated
	 */
	void unsetMaven();

	/**
	 * Returns whether the value of the '{@link maven.Prerequisites#getMaven <em>Maven</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maven</em>' attribute is set.
	 * @see #unsetMaven()
	 * @see #getMaven()
	 * @see #setMaven(String)
	 * @generated
	 */
	boolean isSetMaven();

} // Prerequisites
