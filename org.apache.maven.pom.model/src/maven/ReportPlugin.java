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
 * A representation of the model object '<em><b>Report Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.ReportPlugin#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link maven.ReportPlugin#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link maven.ReportPlugin#getVersion <em>Version</em>}</li>
 *   <li>{@link maven.ReportPlugin#getInherited <em>Inherited</em>}</li>
 *   <li>{@link maven.ReportPlugin#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link maven.ReportPlugin#getReportSets <em>Report Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getReportPlugin()
 * @model extendedMetaData="name='ReportPlugin' kind='elementOnly'"
 * @generated
 */
public interface ReportPlugin extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * The default value is <code>"org.apache.maven.plugins"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * The group ID of the reporting plugin in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #isSetGroupId()
	 * @see #unsetGroupId()
	 * @see #setGroupId(String)
	 * @see maven.MavenPackage#getReportPlugin_GroupId()
	 * @model default="org.apache.maven.plugins" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link maven.ReportPlugin#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #isSetGroupId()
	 * @see #unsetGroupId()
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Unsets the value of the '{@link maven.ReportPlugin#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupId()
	 * @see #getGroupId()
	 * @see #setGroupId(String)
	 * @generated
	 */
	void unsetGroupId();

	/**
	 * Returns whether the value of the '{@link maven.ReportPlugin#getGroupId <em>Group Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group Id</em>' attribute is set.
	 * @see #unsetGroupId()
	 * @see #getGroupId()
	 * @see #setGroupId(String)
	 * @generated
	 */
	boolean isSetGroupId();

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * The artifact ID of the reporting plugin in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see maven.MavenPackage#getReportPlugin_ArtifactId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='artifactId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link maven.ReportPlugin#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * The version of the reporting plugin to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see maven.MavenPackage#getReportPlugin_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link maven.ReportPlugin#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * Whether the configuration in this plugin should be made available to projects that
	 *             inherit from this one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited</em>' attribute.
	 * @see #setInherited(String)
	 * @see maven.MavenPackage#getReportPlugin_Inherited()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='inherited' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInherited();

	/**
	 * Sets the value of the '{@link maven.ReportPlugin#getInherited <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited</em>' attribute.
	 * @see #getInherited()
	 * @generated
	 */
	void setInherited(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * The configuration of the reporting plugin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationType)
	 * @see maven.MavenPackage#getReportPlugin_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationType getConfiguration();

	/**
	 * Sets the value of the '{@link maven.ReportPlugin#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationType value);

	/**
	 * Returns the value of the '<em><b>Report Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * Multiple specifications of a set of reports, each having (possibly) different
	 *             configuration. This is the reporting parallel to an &lt;code&gt;execution&lt;/code&gt; in the build.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Sets</em>' containment reference.
	 * @see #setReportSets(ReportSetsType)
	 * @see maven.MavenPackage#getReportPlugin_ReportSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportSets' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportSetsType getReportSets();

	/**
	 * Sets the value of the '{@link maven.ReportPlugin#getReportSets <em>Report Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Sets</em>' containment reference.
	 * @see #getReportSets()
	 * @generated
	 */
	void setReportSets(ReportSetsType value);

} // ReportPlugin
