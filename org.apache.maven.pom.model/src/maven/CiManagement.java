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
 * A representation of the model object '<em><b>Ci Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.CiManagement#getSystem <em>System</em>}</li>
 *   <li>{@link maven.CiManagement#getUrl <em>Url</em>}</li>
 *   <li>{@link maven.CiManagement#getNotifiers <em>Notifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getCiManagement()
 * @model extendedMetaData="name='CiManagement' kind='elementOnly'"
 * @generated
 */
public interface CiManagement extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             The name of the continuous integration system, e.g. &lt;code&gt;continuum&lt;/code&gt;.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see maven.MavenPackage#getCiManagement_System()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link maven.CiManagement#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             URL for the continuous integration system used by the project if it has a web interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see maven.MavenPackage#getCiManagement_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link maven.CiManagement#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Notifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             Configuration for notifying developers/users when a build is 
	 *             unsuccessful, including user information and notification mode.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notifiers</em>' containment reference.
	 * @see #setNotifiers(NotifiersType)
	 * @see maven.MavenPackage#getCiManagement_Notifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	NotifiersType getNotifiers();

	/**
	 * Sets the value of the '{@link maven.CiManagement#getNotifiers <em>Notifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifiers</em>' containment reference.
	 * @see #getNotifiers()
	 * @generated
	 */
	void setNotifiers(NotifiersType value);

} // CiManagement