/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 3.0.0+
 * 
 *          The &lt;code&gt;&amp;lt;project&amp;gt;&lt;/code&gt; element is the root of the descriptor.
 *          The following table lists all of the possible child elements.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getParent <em>Parent</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getVersion <em>Version</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getDescription <em>Description</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getUrl <em>Url</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getIssueManagement <em>Issue Management</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getCiManagement <em>Ci Management</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getInceptionYear <em>Inception Year</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getMailingLists <em>Mailing Lists</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getScm <em>Scm</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getBuild <em>Build</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getModules <em>Modules</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getPluginRepositories <em>Plugin Repositories</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getReports <em>Reports</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getReporting <em>Reporting</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getDependencyManagement <em>Dependency Management</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getDistributionManagement <em>Distribution Management</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.Model#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.maven.pom._4._0._0Package#getModel()
 * @model extendedMetaData="name='Model' kind='elementOnly'"
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             The location of the parent project, if one exists. Values from the
	 *             parent project will be the default for this project if they are
	 *             left unspecified. The location is given as a group ID, artifact ID and version.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Parent)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	Parent getParent();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Parent value);

	/**
	 * Returns the value of the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * Declares to which version of project descriptor this POM conforms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Version</em>' attribute.
	 * @see #setModelVersion(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_ModelVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='modelVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelVersion();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getModelVersion <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Version</em>' attribute.
	 * @see #getModelVersion()
	 * @generated
	 */
	void setModelVersion(String value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             A universally unique identifier for a project. It is normal to
	 *             use a fully-qualified package name to distinguish it from other projects with a similar name
	 *             (eg. &lt;code&gt;org.apache.maven&lt;/code&gt;).
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_GroupId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             The identifier for this artifact that is unique within the group given by the group ID.
	 *             An artifact is something that is either produced or used by a project. Examples of artifacts produced by
	 *             Maven for a project include: JARs, source and binary distributions, and WARs.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_ArtifactId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='artifactId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' attribute.
	 * The default value is <code>"jar"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             The type of artifact this project produces, for example &lt;code&gt;jar&lt;/code&gt;
	 *               &lt;code&gt;war&lt;/code&gt;
	 *               &lt;code&gt;ear&lt;/code&gt;
	 *               &lt;code&gt;pom&lt;/code&gt;.
	 *             Plugins can create their own packaging, and
	 *             therefore their own packaging types,
	 *             so this list does not contain all possible types.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaging</em>' attribute.
	 * @see #isSetPackaging()
	 * @see #unsetPackaging()
	 * @see #setPackaging(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Packaging()
	 * @model default="jar" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPackaging();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getPackaging <em>Packaging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' attribute.
	 * @see #isSetPackaging()
	 * @see #unsetPackaging()
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(String value);

	/**
	 * Unsets the value of the '{@link org.apache.maven.pom._4._0.Model#getPackaging <em>Packaging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPackaging()
	 * @see #getPackaging()
	 * @see #setPackaging(String)
	 * @generated
	 */
	void unsetPackaging();

	/**
	 * Returns whether the value of the '{@link org.apache.maven.pom._4._0.Model#getPackaging <em>Packaging</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Packaging</em>' attribute is set.
	 * @see #unsetPackaging()
	 * @see #getPackaging()
	 * @see #setPackaging(String)
	 * @generated
	 */
	boolean isSetPackaging();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             The full name of the project.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             The current version of the artifact produced by this project.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             A detailed description of the project, used by Maven whenever it needs to describe the project,
	 *             such as on the web site. While this element can be specified as CDATA to enable
	 *             the use of HTML tags within the description, it is discouraged to allow plain text representation.
	 *             If you need to modify the index page of the generated web site, you are able to specify your own instead
	 *             of adjusting this text.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *              The URL to the project's homepage.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             Describes the prerequisites in the build environment for this project.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prerequisites</em>' containment reference.
	 * @see #setPrerequisites(Prerequisites)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Prerequisites()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prerequisites' namespace='##targetNamespace'"
	 * @generated
	 */
	Prerequisites getPrerequisites();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getPrerequisites <em>Prerequisites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisites</em>' containment reference.
	 * @see #getPrerequisites()
	 * @generated
	 */
	void setPrerequisites(Prerequisites value);

	/**
	 * Returns the value of the '<em><b>Issue Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * The project's issue management system information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Management</em>' containment reference.
	 * @see #setIssueManagement(IssueManagement)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_IssueManagement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issueManagement' namespace='##targetNamespace'"
	 * @generated
	 */
	IssueManagement getIssueManagement();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getIssueManagement <em>Issue Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Management</em>' containment reference.
	 * @see #getIssueManagement()
	 * @generated
	 */
	void setIssueManagement(IssueManagement value);

	/**
	 * Returns the value of the '<em><b>Ci Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * The project's continuous integration information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ci Management</em>' containment reference.
	 * @see #setCiManagement(CiManagement)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_CiManagement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ciManagement' namespace='##targetNamespace'"
	 * @generated
	 */
	CiManagement getCiManagement();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getCiManagement <em>Ci Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ci Management</em>' containment reference.
	 * @see #getCiManagement()
	 * @generated
	 */
	void setCiManagement(CiManagement value);

	/**
	 * Returns the value of the '<em><b>Inception Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             The year of the project's inception, specified with 4 digits.
	 *             This value is used when generating copyright notices as well as being informational.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inception Year</em>' attribute.
	 * @see #setInceptionYear(String)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_InceptionYear()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='inceptionYear' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInceptionYear();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getInceptionYear <em>Inception Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inception Year</em>' attribute.
	 * @see #getInceptionYear()
	 * @generated
	 */
	void setInceptionYear(String value);

	/**
	 * Returns the value of the '<em><b>Mailing Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             Contains information about a project's mailing lists.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mailing Lists</em>' containment reference.
	 * @see #setMailingLists(MailingListsType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_MailingLists()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mailingLists' namespace='##targetNamespace'"
	 * @generated
	 */
	MailingListsType getMailingLists();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getMailingLists <em>Mailing Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mailing Lists</em>' containment reference.
	 * @see #getMailingLists()
	 * @generated
	 */
	void setMailingLists(MailingListsType value);

	/**
	 * Returns the value of the '<em><b>Developers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             Describes the committers of a project.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Developers</em>' containment reference.
	 * @see #setDevelopers(DevelopersType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Developers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='developers' namespace='##targetNamespace'"
	 * @generated
	 */
	DevelopersType getDevelopers();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getDevelopers <em>Developers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developers</em>' containment reference.
	 * @see #getDevelopers()
	 * @generated
	 */
	void setDevelopers(DevelopersType value);

	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             Describes the contributors to a project that are not yet committers.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributors</em>' containment reference.
	 * @see #setContributors(ContributorsType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getContributors <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors</em>' containment reference.
	 * @see #getContributors()
	 * @generated
	 */
	void setContributors(ContributorsType value);

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             This element describes all of the licenses for this project.  
	 *             Each license is described by a &lt;code&gt;license&lt;/code&gt; element, which 
	 *             is then described by additional elements.
	 *             Projects should only list the license(s) that applies to the project 
	 *             and not the licenses that apply to dependencies.
	 *             If multiple licenses are listed, it is assumed that the user can select any of them, not that they
	 *             must accept all.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licenses</em>' containment reference.
	 * @see #setLicenses(LicensesType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Licenses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licenses' namespace='##targetNamespace'"
	 * @generated
	 */
	LicensesType getLicenses();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getLicenses <em>Licenses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licenses</em>' containment reference.
	 * @see #getLicenses()
	 * @generated
	 */
	void setLicenses(LicensesType value);

	/**
	 * Returns the value of the '<em><b>Scm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             Specification for the SCM used by the project, such as CVS, Subversion, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scm</em>' containment reference.
	 * @see #setScm(Scm)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Scm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scm' namespace='##targetNamespace'"
	 * @generated
	 */
	Scm getScm();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getScm <em>Scm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scm</em>' containment reference.
	 * @see #getScm()
	 * @generated
	 */
	void setScm(Scm value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             This element describes various attributes of the organization to
	 *             which the project belongs.  These attributes are utilized when
	 *             documentation is created (for copyright notices and links).
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Organization)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * Information required to build the project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Build</em>' containment reference.
	 * @see #setBuild(Build)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Build()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='build' namespace='##targetNamespace'"
	 * @generated
	 */
	Build getBuild();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getBuild <em>Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build</em>' containment reference.
	 * @see #getBuild()
	 * @generated
	 */
	void setBuild(Build value);

	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             A listing of project-local build profiles which will modify the build process when activated.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference.
	 * @see #setProfiles(ProfilesType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Profiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profiles' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfilesType getProfiles();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getProfiles <em>Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profiles</em>' containment reference.
	 * @see #getProfiles()
	 * @generated
	 */
	void setProfiles(ProfilesType value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             The modules (sometimes called subprojects) to build as a part of this project.
	 *             Each module listed is a relative path to the directory containing the module.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference.
	 * @see #setModules(ModulesType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Modules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modules' namespace='##targetNamespace'"
	 * @generated
	 */
	ModulesType getModules();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getModules <em>Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modules</em>' containment reference.
	 * @see #getModules()
	 * @generated
	 */
	void setModules(ModulesType value);

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * The lists of the remote repositories for discovering dependencies and
	 *           extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference.
	 * @see #setRepositories(RepositoriesType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Repositories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repositories' namespace='##targetNamespace'"
	 * @generated
	 */
	RepositoriesType getRepositories();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getRepositories <em>Repositories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repositories</em>' containment reference.
	 * @see #getRepositories()
	 * @generated
	 */
	void setRepositories(RepositoriesType value);

	/**
	 * Returns the value of the '<em><b>Plugin Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             The lists of the remote repositories for discovering plugins for builds and reports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plugin Repositories</em>' containment reference.
	 * @see #setPluginRepositories(PluginRepositoriesType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_PluginRepositories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pluginRepositories' namespace='##targetNamespace'"
	 * @generated
	 */
	PluginRepositoriesType getPluginRepositories();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getPluginRepositories <em>Plugin Repositories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Repositories</em>' containment reference.
	 * @see #getPluginRepositories()
	 * @generated
	 */
	void setPluginRepositories(PluginRepositoriesType value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *               This element describes all of the dependencies associated with a
	 *               project.
	 *               These dependencies are used to construct a classpath for your 
	 *               project during the build process. They are automatically downloaded from the
	 *               repositories defined in this project.
	 *               See &lt;a href="http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html"&gt;the
	 *               dependency mechanism&lt;/a&gt; for more information.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	DependenciesType getDependencies();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(DependenciesType value);

	/**
	 * Returns the value of the '<em><b>Reports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             &lt;b&gt;Deprecated&lt;/b&gt;. Now ignored by Maven.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reports</em>' containment reference.
	 * @see #setReports(ReportsType1)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Reports()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reports' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportsType1 getReports();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getReports <em>Reports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reports</em>' containment reference.
	 * @see #getReports()
	 * @generated
	 */
	void setReports(ReportsType1 value);

	/**
	 * Returns the value of the '<em><b>Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             This element includes the specification of report plugins to use to generate the reports on the
	 *             Maven-generated site.  These reports will be run when a user executes &lt;code&gt;mvn site&lt;/code&gt;.  All of the
	 *             reports will be included in the navigation bar for browsing.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporting</em>' containment reference.
	 * @see #setReporting(Reporting)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Reporting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reporting' namespace='##targetNamespace'"
	 * @generated
	 */
	Reporting getReporting();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getReporting <em>Reporting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting</em>' containment reference.
	 * @see #getReporting()
	 * @generated
	 */
	void setReporting(Reporting value);

	/**
	 * Returns the value of the '<em><b>Dependency Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *             Default dependency information for projects that inherit from
	 *             this one. The dependencies in this section are not immediately resolved.
	 *             Instead, when a POM derived from this one declares a dependency 
	 *             described by a matching groupId and artifactId, the version and other values from this
	 *             section are used for that dependency if they were not already specified.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency Management</em>' containment reference.
	 * @see #setDependencyManagement(DependencyManagement)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_DependencyManagement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencyManagement' namespace='##targetNamespace'"
	 * @generated
	 */
	DependencyManagement getDependencyManagement();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getDependencyManagement <em>Dependency Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Management</em>' containment reference.
	 * @see #getDependencyManagement()
	 * @generated
	 */
	void setDependencyManagement(DependencyManagement value);

	/**
	 * Returns the value of the '<em><b>Distribution Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * Distribution information for a project that enables deployment of the site
	 *           and artifacts to remote web servers and repositories respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distribution Management</em>' containment reference.
	 * @see #setDistributionManagement(DistributionManagement)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_DistributionManagement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributionManagement' namespace='##targetNamespace'"
	 * @generated
	 */
	DistributionManagement getDistributionManagement();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getDistributionManagement <em>Distribution Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Management</em>' containment reference.
	 * @see #getDistributionManagement()
	 * @generated
	 */
	void setDistributionManagement(DistributionManagement value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 *              Properties that can be used throughout the POM as a substitution, and are used as filters in resources
	 *              if enabled. The format is &lt;code&gt;&amp;lt;name&amp;gt;value&amp;lt;/name&amp;gt;&lt;/code&gt;.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType2)
	 * @see org.apache.maven.pom._4._0._0Package#getModel_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType2 getProperties();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.Model#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType2 value);

} // Model
