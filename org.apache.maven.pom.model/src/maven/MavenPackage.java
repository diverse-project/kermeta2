/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package maven;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maven.MavenFactory
 * @model kind="package"
 * @generated
 */
public interface MavenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maven";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maven.apache.org/POM/4.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maven";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MavenPackage eINSTANCE = maven.impl.MavenPackageImpl.init();

	/**
	 * The meta object id for the '{@link maven.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ActivationImpl
	 * @see maven.impl.MavenPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 0;

	/**
	 * The feature id for the '<em><b>Active By Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__ACTIVE_BY_DEFAULT = 0;

	/**
	 * The feature id for the '<em><b>Jdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__JDK = 1;

	/**
	 * The feature id for the '<em><b>Os</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__OS = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__FILE = 4;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link maven.impl.ActivationFileImpl <em>Activation File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ActivationFileImpl
	 * @see maven.impl.MavenPackageImpl#getActivationFile()
	 * @generated
	 */
	int ACTIVATION_FILE = 1;

	/**
	 * The feature id for the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FILE__MISSING = 0;

	/**
	 * The feature id for the '<em><b>Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FILE__EXISTS = 1;

	/**
	 * The number of structural features of the '<em>Activation File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link maven.impl.ActivationOSImpl <em>Activation OS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ActivationOSImpl
	 * @see maven.impl.MavenPackageImpl#getActivationOS()
	 * @generated
	 */
	int ACTIVATION_OS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OS__FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OS__ARCH = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OS__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Activation OS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link maven.impl.ActivationPropertyImpl <em>Activation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ActivationPropertyImpl
	 * @see maven.impl.MavenPackageImpl#getActivationProperty()
	 * @generated
	 */
	int ACTIVATION_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Activation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link maven.impl.BuildImpl <em>Build</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.BuildImpl
	 * @see maven.impl.MavenPackageImpl#getBuild()
	 * @generated
	 */
	int BUILD = 4;

	/**
	 * The feature id for the '<em><b>Source Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__SOURCE_DIRECTORY = 0;

	/**
	 * The feature id for the '<em><b>Script Source Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__SCRIPT_SOURCE_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Test Source Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__TEST_SOURCE_DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__OUTPUT_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Test Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__TEST_OUTPUT_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__EXTENSIONS = 5;

	/**
	 * The feature id for the '<em><b>Default Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__DEFAULT_GOAL = 6;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__RESOURCES = 7;

	/**
	 * The feature id for the '<em><b>Test Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__TEST_RESOURCES = 8;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__DIRECTORY = 9;

	/**
	 * The feature id for the '<em><b>Final Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__FINAL_NAME = 10;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__FILTERS = 11;

	/**
	 * The feature id for the '<em><b>Plugin Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__PLUGIN_MANAGEMENT = 12;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__PLUGINS = 13;

	/**
	 * The number of structural features of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link maven.impl.BuildBaseImpl <em>Build Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.BuildBaseImpl
	 * @see maven.impl.MavenPackageImpl#getBuildBase()
	 * @generated
	 */
	int BUILD_BASE = 5;

	/**
	 * The feature id for the '<em><b>Default Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE__DEFAULT_GOAL = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Test Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE__TEST_RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE__DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Final Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE__FINAL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE__FILTERS = 5;

	/**
	 * The feature id for the '<em><b>Plugin Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE__PLUGIN_MANAGEMENT = 6;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE__PLUGINS = 7;

	/**
	 * The number of structural features of the '<em>Build Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link maven.impl.CiManagementImpl <em>Ci Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.CiManagementImpl
	 * @see maven.impl.MavenPackageImpl#getCiManagement()
	 * @generated
	 */
	int CI_MANAGEMENT = 6;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CI_MANAGEMENT__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CI_MANAGEMENT__URL = 1;

	/**
	 * The feature id for the '<em><b>Notifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CI_MANAGEMENT__NOTIFIERS = 2;

	/**
	 * The number of structural features of the '<em>Ci Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CI_MANAGEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link maven.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ConfigurationTypeImpl
	 * @see maven.impl.MavenPackageImpl#getConfigurationType()
	 * @generated
	 */
	int CONFIGURATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ConfigurationType1Impl <em>Configuration Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ConfigurationType1Impl
	 * @see maven.impl.MavenPackageImpl#getConfigurationType1()
	 * @generated
	 */
	int CONFIGURATION_TYPE1 = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE1__ANY = 0;

	/**
	 * The number of structural features of the '<em>Configuration Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ConfigurationType2Impl <em>Configuration Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ConfigurationType2Impl
	 * @see maven.impl.MavenPackageImpl#getConfigurationType2()
	 * @generated
	 */
	int CONFIGURATION_TYPE2 = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE2__ANY = 0;

	/**
	 * The number of structural features of the '<em>Configuration Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ConfigurationType3Impl <em>Configuration Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ConfigurationType3Impl
	 * @see maven.impl.MavenPackageImpl#getConfigurationType3()
	 * @generated
	 */
	int CONFIGURATION_TYPE3 = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE3__ANY = 0;

	/**
	 * The number of structural features of the '<em>Configuration Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ConfigurationType4Impl <em>Configuration Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ConfigurationType4Impl
	 * @see maven.impl.MavenPackageImpl#getConfigurationType4()
	 * @generated
	 */
	int CONFIGURATION_TYPE4 = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE4__ANY = 0;

	/**
	 * The number of structural features of the '<em>Configuration Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ContributorImpl <em>Contributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ContributorImpl
	 * @see maven.impl.MavenPackageImpl#getContributor()
	 * @generated
	 */
	int CONTRIBUTOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__URL = 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ORGANIZATION = 3;

	/**
	 * The feature id for the '<em><b>Organization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ORGANIZATION_URL = 4;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ROLES = 5;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__TIMEZONE = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__PROPERTIES = 7;

	/**
	 * The number of structural features of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link maven.impl.ContributorsTypeImpl <em>Contributors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ContributorsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getContributorsType()
	 * @generated
	 */
	int CONTRIBUTORS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTORS_TYPE__CONTRIBUTOR = 0;

	/**
	 * The number of structural features of the '<em>Contributors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTORS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DependenciesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getDependenciesType()
	 * @generated
	 */
	int DEPENDENCIES_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE__DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.DependenciesType1Impl <em>Dependencies Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DependenciesType1Impl
	 * @see maven.impl.MavenPackageImpl#getDependenciesType1()
	 * @generated
	 */
	int DEPENDENCIES_TYPE1 = 15;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE1__DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Dependencies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.DependenciesType2Impl <em>Dependencies Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DependenciesType2Impl
	 * @see maven.impl.MavenPackageImpl#getDependenciesType2()
	 * @generated
	 */
	int DEPENDENCIES_TYPE2 = 16;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE2__DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Dependencies Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.DependenciesType3Impl <em>Dependencies Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DependenciesType3Impl
	 * @see maven.impl.MavenPackageImpl#getDependenciesType3()
	 * @generated
	 */
	int DEPENDENCIES_TYPE3 = 17;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE3__DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Dependencies Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DependencyImpl
	 * @see maven.impl.MavenPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 18;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ARTIFACT_ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SCOPE = 5;

	/**
	 * The feature id for the '<em><b>System Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SYSTEM_PATH = 6;

	/**
	 * The feature id for the '<em><b>Exclusions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__EXCLUSIONS = 7;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OPTIONAL = 8;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link maven.impl.DependencyManagementImpl <em>Dependency Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DependencyManagementImpl
	 * @see maven.impl.MavenPackageImpl#getDependencyManagement()
	 * @generated
	 */
	int DEPENDENCY_MANAGEMENT = 19;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MANAGEMENT__DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Dependency Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MANAGEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.DeploymentRepositoryImpl <em>Deployment Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DeploymentRepositoryImpl
	 * @see maven.impl.MavenPackageImpl#getDeploymentRepository()
	 * @generated
	 */
	int DEPLOYMENT_REPOSITORY = 20;

	/**
	 * The feature id for the '<em><b>Unique Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REPOSITORY__UNIQUE_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REPOSITORY__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REPOSITORY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REPOSITORY__URL = 3;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REPOSITORY__LAYOUT = 4;

	/**
	 * The number of structural features of the '<em>Deployment Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REPOSITORY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link maven.impl.DeveloperImpl <em>Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DeveloperImpl
	 * @see maven.impl.MavenPackageImpl#getDeveloper()
	 * @generated
	 */
	int DEVELOPER = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__URL = 3;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Organization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ORGANIZATION_URL = 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ROLES = 6;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__TIMEZONE = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__PROPERTIES = 8;

	/**
	 * The number of structural features of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link maven.impl.DevelopersTypeImpl <em>Developers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DevelopersTypeImpl
	 * @see maven.impl.MavenPackageImpl#getDevelopersType()
	 * @generated
	 */
	int DEVELOPERS_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Developer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPERS_TYPE__DEVELOPER = 0;

	/**
	 * The number of structural features of the '<em>Developers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.DistributionManagementImpl <em>Distribution Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DistributionManagementImpl
	 * @see maven.impl.MavenPackageImpl#getDistributionManagement()
	 * @generated
	 */
	int DISTRIBUTION_MANAGEMENT = 23;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Snapshot Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT__SNAPSHOT_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT__SITE = 2;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT__DOWNLOAD_URL = 3;

	/**
	 * The feature id for the '<em><b>Relocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT__RELOCATION = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT__STATUS = 5;

	/**
	 * The number of structural features of the '<em>Distribution Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link maven.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.DocumentRootImpl
	 * @see maven.impl.MavenPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link maven.impl.ExcludesTypeImpl <em>Excludes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ExcludesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getExcludesType()
	 * @generated
	 */
	int EXCLUDES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_TYPE__EXCLUDE = 0;

	/**
	 * The number of structural features of the '<em>Excludes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ExclusionImpl <em>Exclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ExclusionImpl
	 * @see maven.impl.MavenPackageImpl#getExclusion()
	 * @generated
	 */
	int EXCLUSION = 26;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__ARTIFACT_ID = 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__GROUP_ID = 1;

	/**
	 * The number of structural features of the '<em>Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link maven.impl.ExclusionsTypeImpl <em>Exclusions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ExclusionsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getExclusionsType()
	 * @generated
	 */
	int EXCLUSIONS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Exclusion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIONS_TYPE__EXCLUSION = 0;

	/**
	 * The number of structural features of the '<em>Exclusions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ExecutionsTypeImpl <em>Executions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ExecutionsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getExecutionsType()
	 * @generated
	 */
	int EXECUTIONS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONS_TYPE__EXECUTION = 0;

	/**
	 * The number of structural features of the '<em>Executions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ExtensionImpl
	 * @see maven.impl.MavenPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 29;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ARTIFACT_ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link maven.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ExtensionsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getExtensionsType()
	 * @generated
	 */
	int EXTENSIONS_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE__EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.FiltersTypeImpl <em>Filters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.FiltersTypeImpl
	 * @see maven.impl.MavenPackageImpl#getFiltersType()
	 * @generated
	 */
	int FILTERS_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERS_TYPE__FILTER = 0;

	/**
	 * The number of structural features of the '<em>Filters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.FiltersType1Impl <em>Filters Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.FiltersType1Impl
	 * @see maven.impl.MavenPackageImpl#getFiltersType1()
	 * @generated
	 */
	int FILTERS_TYPE1 = 32;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERS_TYPE1__FILTER = 0;

	/**
	 * The number of structural features of the '<em>Filters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.GoalsTypeImpl <em>Goals Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.GoalsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getGoalsType()
	 * @generated
	 */
	int GOALS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Goals Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.GoalsType1Impl <em>Goals Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.GoalsType1Impl
	 * @see maven.impl.MavenPackageImpl#getGoalsType1()
	 * @generated
	 */
	int GOALS_TYPE1 = 34;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_TYPE1__GOAL = 0;

	/**
	 * The number of structural features of the '<em>Goals Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.IncludesTypeImpl <em>Includes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.IncludesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getIncludesType()
	 * @generated
	 */
	int INCLUDES_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_TYPE__INCLUDE = 0;

	/**
	 * The number of structural features of the '<em>Includes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.IssueManagementImpl <em>Issue Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.IssueManagementImpl
	 * @see maven.impl.MavenPackageImpl#getIssueManagement()
	 * @generated
	 */
	int ISSUE_MANAGEMENT = 36;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT__URL = 1;

	/**
	 * The number of structural features of the '<em>Issue Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link maven.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.LicenseImpl
	 * @see maven.impl.MavenPackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__URL = 1;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__DISTRIBUTION = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__COMMENTS = 3;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link maven.impl.LicensesTypeImpl <em>Licenses Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.LicensesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getLicensesType()
	 * @generated
	 */
	int LICENSES_TYPE = 38;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSES_TYPE__LICENSE = 0;

	/**
	 * The number of structural features of the '<em>Licenses Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.MailingListImpl <em>Mailing List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.MailingListImpl
	 * @see maven.impl.MavenPackageImpl#getMailingList()
	 * @generated
	 */
	int MAILING_LIST = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__SUBSCRIBE = 1;

	/**
	 * The feature id for the '<em><b>Unsubscribe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__UNSUBSCRIBE = 2;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__POST = 3;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__ARCHIVE = 4;

	/**
	 * The feature id for the '<em><b>Other Archives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__OTHER_ARCHIVES = 5;

	/**
	 * The number of structural features of the '<em>Mailing List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link maven.impl.MailingListsTypeImpl <em>Mailing Lists Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.MailingListsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getMailingListsType()
	 * @generated
	 */
	int MAILING_LISTS_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Mailing List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LISTS_TYPE__MAILING_LIST = 0;

	/**
	 * The number of structural features of the '<em>Mailing Lists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LISTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ModelImpl
	 * @see maven.impl.MavenPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 41;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GROUP_ID = 2;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ARTIFACT_ID = 3;

	/**
	 * The feature id for the '<em><b>Packaging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__URL = 8;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PREREQUISITES = 9;

	/**
	 * The feature id for the '<em><b>Issue Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ISSUE_MANAGEMENT = 10;

	/**
	 * The feature id for the '<em><b>Ci Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CI_MANAGEMENT = 11;

	/**
	 * The feature id for the '<em><b>Inception Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INCEPTION_YEAR = 12;

	/**
	 * The feature id for the '<em><b>Mailing Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MAILING_LISTS = 13;

	/**
	 * The feature id for the '<em><b>Developers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEVELOPERS = 14;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTRIBUTORS = 15;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LICENSES = 16;

	/**
	 * The feature id for the '<em><b>Scm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCM = 17;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ORGANIZATION = 18;

	/**
	 * The feature id for the '<em><b>Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BUILD = 19;

	/**
	 * The feature id for the '<em><b>Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROFILES = 20;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODULES = 21;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REPOSITORIES = 22;

	/**
	 * The feature id for the '<em><b>Plugin Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PLUGIN_REPOSITORIES = 23;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEPENDENCIES = 24;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REPORTS = 25;

	/**
	 * The feature id for the '<em><b>Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REPORTING = 26;

	/**
	 * The feature id for the '<em><b>Dependency Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEPENDENCY_MANAGEMENT = 27;

	/**
	 * The feature id for the '<em><b>Distribution Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DISTRIBUTION_MANAGEMENT = 28;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROPERTIES = 29;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link maven.impl.ModulesTypeImpl <em>Modules Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ModulesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getModulesType()
	 * @generated
	 */
	int MODULES_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_TYPE__MODULE = 0;

	/**
	 * The number of structural features of the '<em>Modules Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ModulesType1Impl <em>Modules Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ModulesType1Impl
	 * @see maven.impl.MavenPackageImpl#getModulesType1()
	 * @generated
	 */
	int MODULES_TYPE1 = 43;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_TYPE1__MODULE = 0;

	/**
	 * The number of structural features of the '<em>Modules Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.NotifierImpl <em>Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.NotifierImpl
	 * @see maven.impl.MavenPackageImpl#getNotifier()
	 * @generated
	 */
	int NOTIFIER = 44;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Send On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIER__SEND_ON_ERROR = 1;

	/**
	 * The feature id for the '<em><b>Send On Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIER__SEND_ON_FAILURE = 2;

	/**
	 * The feature id for the '<em><b>Send On Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIER__SEND_ON_SUCCESS = 3;

	/**
	 * The feature id for the '<em><b>Send On Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIER__SEND_ON_WARNING = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIER__ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIER__CONFIGURATION = 6;

	/**
	 * The number of structural features of the '<em>Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link maven.impl.NotifiersTypeImpl <em>Notifiers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.NotifiersTypeImpl
	 * @see maven.impl.MavenPackageImpl#getNotifiersType()
	 * @generated
	 */
	int NOTIFIERS_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Notifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIERS_TYPE__NOTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Notifiers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFIERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.OrganizationImpl
	 * @see maven.impl.MavenPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__URL = 1;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link maven.impl.OtherArchivesTypeImpl <em>Other Archives Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.OtherArchivesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getOtherArchivesType()
	 * @generated
	 */
	int OTHER_ARCHIVES_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Other Archive</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARCHIVES_TYPE__OTHER_ARCHIVE = 0;

	/**
	 * The number of structural features of the '<em>Other Archives Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARCHIVES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ParentImpl
	 * @see maven.impl.MavenPackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 48;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__ARTIFACT_ID = 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__GROUP_ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__RELATIVE_PATH = 3;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link maven.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginImpl
	 * @see maven.impl.MavenPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 49;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ARTIFACT_ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__EXTENSIONS = 3;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__EXECUTIONS = 4;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__DEPENDENCIES = 5;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__GOALS = 6;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__INHERITED = 7;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__CONFIGURATION = 8;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link maven.impl.PluginExecutionImpl <em>Plugin Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginExecutionImpl
	 * @see maven.impl.MavenPackageImpl#getPluginExecution()
	 * @generated
	 */
	int PLUGIN_EXECUTION = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXECUTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXECUTION__PHASE = 1;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXECUTION__GOALS = 2;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXECUTION__INHERITED = 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXECUTION__CONFIGURATION = 4;

	/**
	 * The number of structural features of the '<em>Plugin Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXECUTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link maven.impl.PluginManagementImpl <em>Plugin Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginManagementImpl
	 * @see maven.impl.MavenPackageImpl#getPluginManagement()
	 * @generated
	 */
	int PLUGIN_MANAGEMENT = 51;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_MANAGEMENT__PLUGINS = 0;

	/**
	 * The number of structural features of the '<em>Plugin Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_MANAGEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PluginRepositoriesTypeImpl <em>Plugin Repositories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginRepositoriesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getPluginRepositoriesType()
	 * @generated
	 */
	int PLUGIN_REPOSITORIES_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Plugin Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Plugin Repositories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REPOSITORIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PluginRepositoriesType1Impl <em>Plugin Repositories Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginRepositoriesType1Impl
	 * @see maven.impl.MavenPackageImpl#getPluginRepositoriesType1()
	 * @generated
	 */
	int PLUGIN_REPOSITORIES_TYPE1 = 53;

	/**
	 * The feature id for the '<em><b>Plugin Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REPOSITORIES_TYPE1__PLUGIN_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Plugin Repositories Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REPOSITORIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PluginsTypeImpl <em>Plugins Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getPluginsType()
	 * @generated
	 */
	int PLUGINS_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_TYPE__PLUGIN = 0;

	/**
	 * The number of structural features of the '<em>Plugins Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PluginsType1Impl <em>Plugins Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginsType1Impl
	 * @see maven.impl.MavenPackageImpl#getPluginsType1()
	 * @generated
	 */
	int PLUGINS_TYPE1 = 55;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_TYPE1__PLUGIN = 0;

	/**
	 * The number of structural features of the '<em>Plugins Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PluginsType2Impl <em>Plugins Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginsType2Impl
	 * @see maven.impl.MavenPackageImpl#getPluginsType2()
	 * @generated
	 */
	int PLUGINS_TYPE2 = 56;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_TYPE2__PLUGIN = 0;

	/**
	 * The number of structural features of the '<em>Plugins Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PluginsType3Impl <em>Plugins Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PluginsType3Impl
	 * @see maven.impl.MavenPackageImpl#getPluginsType3()
	 * @generated
	 */
	int PLUGINS_TYPE3 = 57;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_TYPE3__PLUGIN = 0;

	/**
	 * The number of structural features of the '<em>Plugins Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PrerequisitesImpl <em>Prerequisites</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PrerequisitesImpl
	 * @see maven.impl.MavenPackageImpl#getPrerequisites()
	 * @generated
	 */
	int PREREQUISITES = 58;

	/**
	 * The feature id for the '<em><b>Maven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES__MAVEN = 0;

	/**
	 * The number of structural features of the '<em>Prerequisites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ProfileImpl
	 * @see maven.impl.MavenPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ACTIVATION = 1;

	/**
	 * The feature id for the '<em><b>Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__BUILD = 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MODULES = 3;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__REPOSITORIES = 4;

	/**
	 * The feature id for the '<em><b>Plugin Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PLUGIN_REPOSITORIES = 5;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DEPENDENCIES = 6;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__REPORTS = 7;

	/**
	 * The feature id for the '<em><b>Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__REPORTING = 8;

	/**
	 * The feature id for the '<em><b>Dependency Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DEPENDENCY_MANAGEMENT = 9;

	/**
	 * The feature id for the '<em><b>Distribution Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DISTRIBUTION_MANAGEMENT = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PROPERTIES = 11;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link maven.impl.ProfilesTypeImpl <em>Profiles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ProfilesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getProfilesType()
	 * @generated
	 */
	int PROFILES_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILES_TYPE__PROFILE = 0;

	/**
	 * The number of structural features of the '<em>Profiles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PropertiesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PropertiesType1Impl <em>Properties Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PropertiesType1Impl
	 * @see maven.impl.MavenPackageImpl#getPropertiesType1()
	 * @generated
	 */
	int PROPERTIES_TYPE1 = 62;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1__ANY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PropertiesType2Impl <em>Properties Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PropertiesType2Impl
	 * @see maven.impl.MavenPackageImpl#getPropertiesType2()
	 * @generated
	 */
	int PROPERTIES_TYPE2 = 63;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE2__ANY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.PropertiesType3Impl <em>Properties Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.PropertiesType3Impl
	 * @see maven.impl.MavenPackageImpl#getPropertiesType3()
	 * @generated
	 */
	int PROPERTIES_TYPE3 = 64;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE3__ANY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.RelocationImpl <em>Relocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.RelocationImpl
	 * @see maven.impl.MavenPackageImpl#getRelocation()
	 * @generated
	 */
	int RELOCATION = 65;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION__ARTIFACT_ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Relocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link maven.impl.ReportingImpl <em>Reporting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ReportingImpl
	 * @see maven.impl.MavenPackageImpl#getReporting()
	 * @generated
	 */
	int REPORTING = 66;

	/**
	 * The feature id for the '<em><b>Exclude Defaults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__EXCLUDE_DEFAULTS = 0;

	/**
	 * The feature id for the '<em><b>Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__OUTPUT_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__PLUGINS = 2;

	/**
	 * The number of structural features of the '<em>Reporting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link maven.impl.ReportPluginImpl <em>Report Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ReportPluginImpl
	 * @see maven.impl.MavenPackageImpl#getReportPlugin()
	 * @generated
	 */
	int REPORT_PLUGIN = 67;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PLUGIN__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PLUGIN__ARTIFACT_ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PLUGIN__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PLUGIN__INHERITED = 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PLUGIN__CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Report Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PLUGIN__REPORT_SETS = 5;

	/**
	 * The number of structural features of the '<em>Report Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PLUGIN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link maven.impl.ReportSetImpl <em>Report Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ReportSetImpl
	 * @see maven.impl.MavenPackageImpl#getReportSet()
	 * @generated
	 */
	int REPORT_SET = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SET__ID = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SET__CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SET__INHERITED = 2;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SET__REPORTS = 3;

	/**
	 * The number of structural features of the '<em>Report Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SET_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link maven.impl.ReportSetsTypeImpl <em>Report Sets Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ReportSetsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getReportSetsType()
	 * @generated
	 */
	int REPORT_SETS_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Report Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SETS_TYPE__REPORT_SET = 0;

	/**
	 * The number of structural features of the '<em>Report Sets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SETS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ReportsTypeImpl <em>Reports Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ReportsTypeImpl
	 * @see maven.impl.MavenPackageImpl#getReportsType()
	 * @generated
	 */
	int REPORTS_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE__REPORT = 0;

	/**
	 * The number of structural features of the '<em>Reports Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ReportsType1Impl <em>Reports Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ReportsType1Impl
	 * @see maven.impl.MavenPackageImpl#getReportsType1()
	 * @generated
	 */
	int REPORTS_TYPE1 = 71;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE1__ANY = 0;

	/**
	 * The number of structural features of the '<em>Reports Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ReportsType2Impl <em>Reports Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ReportsType2Impl
	 * @see maven.impl.MavenPackageImpl#getReportsType2()
	 * @generated
	 */
	int REPORTS_TYPE2 = 72;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE2__ANY = 0;

	/**
	 * The number of structural features of the '<em>Reports Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.RepositoriesTypeImpl <em>Repositories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.RepositoriesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getRepositoriesType()
	 * @generated
	 */
	int REPOSITORIES_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIES_TYPE__REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Repositories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.RepositoriesType1Impl <em>Repositories Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.RepositoriesType1Impl
	 * @see maven.impl.MavenPackageImpl#getRepositoriesType1()
	 * @generated
	 */
	int REPOSITORIES_TYPE1 = 74;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIES_TYPE1__REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Repositories Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.RepositoryImpl
	 * @see maven.impl.MavenPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 75;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__RELEASES = 0;

	/**
	 * The feature id for the '<em><b>Snapshots</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SNAPSHOTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__URL = 4;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LAYOUT = 5;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link maven.impl.RepositoryPolicyImpl <em>Repository Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.RepositoryPolicyImpl
	 * @see maven.impl.MavenPackageImpl#getRepositoryPolicy()
	 * @generated
	 */
	int REPOSITORY_POLICY = 76;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_POLICY__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Update Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_POLICY__UPDATE_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Checksum Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_POLICY__CHECKSUM_POLICY = 2;

	/**
	 * The number of structural features of the '<em>Repository Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_POLICY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link maven.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ResourceImpl
	 * @see maven.impl.MavenPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 77;

	/**
	 * The feature id for the '<em><b>Target Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TARGET_PATH = 0;

	/**
	 * The feature id for the '<em><b>Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__FILTERING = 1;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__INCLUDES = 3;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXCLUDES = 4;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link maven.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ResourcesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getResourcesType()
	 * @generated
	 */
	int RESOURCES_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ResourcesType1Impl <em>Resources Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ResourcesType1Impl
	 * @see maven.impl.MavenPackageImpl#getResourcesType1()
	 * @generated
	 */
	int RESOURCES_TYPE1 = 79;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE1__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Resources Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.RolesTypeImpl <em>Roles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.RolesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getRolesType()
	 * @generated
	 */
	int ROLES_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_TYPE__ROLE = 0;

	/**
	 * The number of structural features of the '<em>Roles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.RolesType1Impl <em>Roles Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.RolesType1Impl
	 * @see maven.impl.MavenPackageImpl#getRolesType1()
	 * @generated
	 */
	int ROLES_TYPE1 = 81;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_TYPE1__ROLE = 0;

	/**
	 * The number of structural features of the '<em>Roles Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.ScmImpl <em>Scm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.ScmImpl
	 * @see maven.impl.MavenPackageImpl#getScm()
	 * @generated
	 */
	int SCM = 82;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Developer Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM__DEVELOPER_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM__TAG = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM__URL = 3;

	/**
	 * The number of structural features of the '<em>Scm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link maven.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.SiteImpl
	 * @see maven.impl.MavenPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 83;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__URL = 2;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link maven.impl.TestResourcesTypeImpl <em>Test Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.TestResourcesTypeImpl
	 * @see maven.impl.MavenPackageImpl#getTestResourcesType()
	 * @generated
	 */
	int TEST_RESOURCES_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Test Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESOURCES_TYPE__TEST_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Test Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link maven.impl.TestResourcesType1Impl <em>Test Resources Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maven.impl.TestResourcesType1Impl
	 * @see maven.impl.MavenPackageImpl#getTestResourcesType1()
	 * @generated
	 */
	int TEST_RESOURCES_TYPE1 = 85;

	/**
	 * The feature id for the '<em><b>Test Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESOURCES_TYPE1__TEST_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Test Resources Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESOURCES_TYPE1_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link maven.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation</em>'.
	 * @see maven.Activation
	 * @generated
	 */
	EClass getActivation();

	/**
	 * Returns the meta object for the attribute '{@link maven.Activation#isActiveByDefault <em>Active By Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active By Default</em>'.
	 * @see maven.Activation#isActiveByDefault()
	 * @see #getActivation()
	 * @generated
	 */
	EAttribute getActivation_ActiveByDefault();

	/**
	 * Returns the meta object for the attribute '{@link maven.Activation#getJdk <em>Jdk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdk</em>'.
	 * @see maven.Activation#getJdk()
	 * @see #getActivation()
	 * @generated
	 */
	EAttribute getActivation_Jdk();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Activation#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os</em>'.
	 * @see maven.Activation#getOs()
	 * @see #getActivation()
	 * @generated
	 */
	EReference getActivation_Os();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Activation#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see maven.Activation#getProperty()
	 * @see #getActivation()
	 * @generated
	 */
	EReference getActivation_Property();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Activation#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see maven.Activation#getFile()
	 * @see #getActivation()
	 * @generated
	 */
	EReference getActivation_File();

	/**
	 * Returns the meta object for class '{@link maven.ActivationFile <em>Activation File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation File</em>'.
	 * @see maven.ActivationFile
	 * @generated
	 */
	EClass getActivationFile();

	/**
	 * Returns the meta object for the attribute '{@link maven.ActivationFile#getMissing <em>Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing</em>'.
	 * @see maven.ActivationFile#getMissing()
	 * @see #getActivationFile()
	 * @generated
	 */
	EAttribute getActivationFile_Missing();

	/**
	 * Returns the meta object for the attribute '{@link maven.ActivationFile#getExists <em>Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exists</em>'.
	 * @see maven.ActivationFile#getExists()
	 * @see #getActivationFile()
	 * @generated
	 */
	EAttribute getActivationFile_Exists();

	/**
	 * Returns the meta object for class '{@link maven.ActivationOS <em>Activation OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation OS</em>'.
	 * @see maven.ActivationOS
	 * @generated
	 */
	EClass getActivationOS();

	/**
	 * Returns the meta object for the attribute '{@link maven.ActivationOS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.ActivationOS#getName()
	 * @see #getActivationOS()
	 * @generated
	 */
	EAttribute getActivationOS_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.ActivationOS#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see maven.ActivationOS#getFamily()
	 * @see #getActivationOS()
	 * @generated
	 */
	EAttribute getActivationOS_Family();

	/**
	 * Returns the meta object for the attribute '{@link maven.ActivationOS#getArch <em>Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch</em>'.
	 * @see maven.ActivationOS#getArch()
	 * @see #getActivationOS()
	 * @generated
	 */
	EAttribute getActivationOS_Arch();

	/**
	 * Returns the meta object for the attribute '{@link maven.ActivationOS#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maven.ActivationOS#getVersion()
	 * @see #getActivationOS()
	 * @generated
	 */
	EAttribute getActivationOS_Version();

	/**
	 * Returns the meta object for class '{@link maven.ActivationProperty <em>Activation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Property</em>'.
	 * @see maven.ActivationProperty
	 * @generated
	 */
	EClass getActivationProperty();

	/**
	 * Returns the meta object for the attribute '{@link maven.ActivationProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.ActivationProperty#getName()
	 * @see #getActivationProperty()
	 * @generated
	 */
	EAttribute getActivationProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.ActivationProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see maven.ActivationProperty#getValue()
	 * @see #getActivationProperty()
	 * @generated
	 */
	EAttribute getActivationProperty_Value();

	/**
	 * Returns the meta object for class '{@link maven.Build <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build</em>'.
	 * @see maven.Build
	 * @generated
	 */
	EClass getBuild();

	/**
	 * Returns the meta object for the attribute '{@link maven.Build#getSourceDirectory <em>Source Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Directory</em>'.
	 * @see maven.Build#getSourceDirectory()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_SourceDirectory();

	/**
	 * Returns the meta object for the attribute '{@link maven.Build#getScriptSourceDirectory <em>Script Source Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Source Directory</em>'.
	 * @see maven.Build#getScriptSourceDirectory()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_ScriptSourceDirectory();

	/**
	 * Returns the meta object for the attribute '{@link maven.Build#getTestSourceDirectory <em>Test Source Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Source Directory</em>'.
	 * @see maven.Build#getTestSourceDirectory()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_TestSourceDirectory();

	/**
	 * Returns the meta object for the attribute '{@link maven.Build#getOutputDirectory <em>Output Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Directory</em>'.
	 * @see maven.Build#getOutputDirectory()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_OutputDirectory();

	/**
	 * Returns the meta object for the attribute '{@link maven.Build#getTestOutputDirectory <em>Test Output Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Output Directory</em>'.
	 * @see maven.Build#getTestOutputDirectory()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_TestOutputDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Build#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see maven.Build#getExtensions()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link maven.Build#getDefaultGoal <em>Default Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Goal</em>'.
	 * @see maven.Build#getDefaultGoal()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_DefaultGoal();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Build#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see maven.Build#getResources()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Build#getTestResources <em>Test Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Resources</em>'.
	 * @see maven.Build#getTestResources()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_TestResources();

	/**
	 * Returns the meta object for the attribute '{@link maven.Build#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see maven.Build#getDirectory()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Directory();

	/**
	 * Returns the meta object for the attribute '{@link maven.Build#getFinalName <em>Final Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Name</em>'.
	 * @see maven.Build#getFinalName()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_FinalName();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Build#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filters</em>'.
	 * @see maven.Build#getFilters()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Filters();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Build#getPluginManagement <em>Plugin Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin Management</em>'.
	 * @see maven.Build#getPluginManagement()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_PluginManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Build#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugins</em>'.
	 * @see maven.Build#getPlugins()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Plugins();

	/**
	 * Returns the meta object for class '{@link maven.BuildBase <em>Build Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Base</em>'.
	 * @see maven.BuildBase
	 * @generated
	 */
	EClass getBuildBase();

	/**
	 * Returns the meta object for the attribute '{@link maven.BuildBase#getDefaultGoal <em>Default Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Goal</em>'.
	 * @see maven.BuildBase#getDefaultGoal()
	 * @see #getBuildBase()
	 * @generated
	 */
	EAttribute getBuildBase_DefaultGoal();

	/**
	 * Returns the meta object for the containment reference '{@link maven.BuildBase#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see maven.BuildBase#getResources()
	 * @see #getBuildBase()
	 * @generated
	 */
	EReference getBuildBase_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link maven.BuildBase#getTestResources <em>Test Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Resources</em>'.
	 * @see maven.BuildBase#getTestResources()
	 * @see #getBuildBase()
	 * @generated
	 */
	EReference getBuildBase_TestResources();

	/**
	 * Returns the meta object for the attribute '{@link maven.BuildBase#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see maven.BuildBase#getDirectory()
	 * @see #getBuildBase()
	 * @generated
	 */
	EAttribute getBuildBase_Directory();

	/**
	 * Returns the meta object for the attribute '{@link maven.BuildBase#getFinalName <em>Final Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Name</em>'.
	 * @see maven.BuildBase#getFinalName()
	 * @see #getBuildBase()
	 * @generated
	 */
	EAttribute getBuildBase_FinalName();

	/**
	 * Returns the meta object for the containment reference '{@link maven.BuildBase#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filters</em>'.
	 * @see maven.BuildBase#getFilters()
	 * @see #getBuildBase()
	 * @generated
	 */
	EReference getBuildBase_Filters();

	/**
	 * Returns the meta object for the containment reference '{@link maven.BuildBase#getPluginManagement <em>Plugin Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin Management</em>'.
	 * @see maven.BuildBase#getPluginManagement()
	 * @see #getBuildBase()
	 * @generated
	 */
	EReference getBuildBase_PluginManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.BuildBase#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugins</em>'.
	 * @see maven.BuildBase#getPlugins()
	 * @see #getBuildBase()
	 * @generated
	 */
	EReference getBuildBase_Plugins();

	/**
	 * Returns the meta object for class '{@link maven.CiManagement <em>Ci Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ci Management</em>'.
	 * @see maven.CiManagement
	 * @generated
	 */
	EClass getCiManagement();

	/**
	 * Returns the meta object for the attribute '{@link maven.CiManagement#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see maven.CiManagement#getSystem()
	 * @see #getCiManagement()
	 * @generated
	 */
	EAttribute getCiManagement_System();

	/**
	 * Returns the meta object for the attribute '{@link maven.CiManagement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.CiManagement#getUrl()
	 * @see #getCiManagement()
	 * @generated
	 */
	EAttribute getCiManagement_Url();

	/**
	 * Returns the meta object for the containment reference '{@link maven.CiManagement#getNotifiers <em>Notifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notifiers</em>'.
	 * @see maven.CiManagement#getNotifiers()
	 * @see #getCiManagement()
	 * @generated
	 */
	EReference getCiManagement_Notifiers();

	/**
	 * Returns the meta object for class '{@link maven.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type</em>'.
	 * @see maven.ConfigurationType
	 * @generated
	 */
	EClass getConfigurationType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ConfigurationType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.ConfigurationType#getAny()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_Any();

	/**
	 * Returns the meta object for class '{@link maven.ConfigurationType1 <em>Configuration Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type1</em>'.
	 * @see maven.ConfigurationType1
	 * @generated
	 */
	EClass getConfigurationType1();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ConfigurationType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.ConfigurationType1#getAny()
	 * @see #getConfigurationType1()
	 * @generated
	 */
	EAttribute getConfigurationType1_Any();

	/**
	 * Returns the meta object for class '{@link maven.ConfigurationType2 <em>Configuration Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type2</em>'.
	 * @see maven.ConfigurationType2
	 * @generated
	 */
	EClass getConfigurationType2();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ConfigurationType2#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.ConfigurationType2#getAny()
	 * @see #getConfigurationType2()
	 * @generated
	 */
	EAttribute getConfigurationType2_Any();

	/**
	 * Returns the meta object for class '{@link maven.ConfigurationType3 <em>Configuration Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type3</em>'.
	 * @see maven.ConfigurationType3
	 * @generated
	 */
	EClass getConfigurationType3();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ConfigurationType3#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.ConfigurationType3#getAny()
	 * @see #getConfigurationType3()
	 * @generated
	 */
	EAttribute getConfigurationType3_Any();

	/**
	 * Returns the meta object for class '{@link maven.ConfigurationType4 <em>Configuration Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type4</em>'.
	 * @see maven.ConfigurationType4
	 * @generated
	 */
	EClass getConfigurationType4();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ConfigurationType4#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.ConfigurationType4#getAny()
	 * @see #getConfigurationType4()
	 * @generated
	 */
	EAttribute getConfigurationType4_Any();

	/**
	 * Returns the meta object for class '{@link maven.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributor</em>'.
	 * @see maven.Contributor
	 * @generated
	 */
	EClass getContributor();

	/**
	 * Returns the meta object for the attribute '{@link maven.Contributor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.Contributor#getName()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.Contributor#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see maven.Contributor#getEmail()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Email();

	/**
	 * Returns the meta object for the attribute '{@link maven.Contributor#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.Contributor#getUrl()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Url();

	/**
	 * Returns the meta object for the attribute '{@link maven.Contributor#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see maven.Contributor#getOrganization()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Organization();

	/**
	 * Returns the meta object for the attribute '{@link maven.Contributor#getOrganizationUrl <em>Organization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Url</em>'.
	 * @see maven.Contributor#getOrganizationUrl()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_OrganizationUrl();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Contributor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roles</em>'.
	 * @see maven.Contributor#getRoles()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Roles();

	/**
	 * Returns the meta object for the attribute '{@link maven.Contributor#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see maven.Contributor#getTimezone()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Timezone();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Contributor#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see maven.Contributor#getProperties()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Properties();

	/**
	 * Returns the meta object for class '{@link maven.ContributorsType <em>Contributors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributors Type</em>'.
	 * @see maven.ContributorsType
	 * @generated
	 */
	EClass getContributorsType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.ContributorsType#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributor</em>'.
	 * @see maven.ContributorsType#getContributor()
	 * @see #getContributorsType()
	 * @generated
	 */
	EReference getContributorsType_Contributor();

	/**
	 * Returns the meta object for class '{@link maven.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type</em>'.
	 * @see maven.DependenciesType
	 * @generated
	 */
	EClass getDependenciesType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.DependenciesType#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see maven.DependenciesType#getDependency()
	 * @see #getDependenciesType()
	 * @generated
	 */
	EReference getDependenciesType_Dependency();

	/**
	 * Returns the meta object for class '{@link maven.DependenciesType1 <em>Dependencies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type1</em>'.
	 * @see maven.DependenciesType1
	 * @generated
	 */
	EClass getDependenciesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.DependenciesType1#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see maven.DependenciesType1#getDependency()
	 * @see #getDependenciesType1()
	 * @generated
	 */
	EReference getDependenciesType1_Dependency();

	/**
	 * Returns the meta object for class '{@link maven.DependenciesType2 <em>Dependencies Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type2</em>'.
	 * @see maven.DependenciesType2
	 * @generated
	 */
	EClass getDependenciesType2();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.DependenciesType2#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see maven.DependenciesType2#getDependency()
	 * @see #getDependenciesType2()
	 * @generated
	 */
	EReference getDependenciesType2_Dependency();

	/**
	 * Returns the meta object for class '{@link maven.DependenciesType3 <em>Dependencies Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type3</em>'.
	 * @see maven.DependenciesType3
	 * @generated
	 */
	EClass getDependenciesType3();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.DependenciesType3#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see maven.DependenciesType3#getDependency()
	 * @see #getDependenciesType3()
	 * @generated
	 */
	EReference getDependenciesType3_Dependency();

	/**
	 * Returns the meta object for class '{@link maven.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see maven.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link maven.Dependency#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see maven.Dependency#getGroupId()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Dependency#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see maven.Dependency#getArtifactId()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Dependency#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maven.Dependency#getVersion()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Version();

	/**
	 * Returns the meta object for the attribute '{@link maven.Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see maven.Dependency#getType()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Type();

	/**
	 * Returns the meta object for the attribute '{@link maven.Dependency#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see maven.Dependency#getClassifier()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link maven.Dependency#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see maven.Dependency#getScope()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Scope();

	/**
	 * Returns the meta object for the attribute '{@link maven.Dependency#getSystemPath <em>System Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Path</em>'.
	 * @see maven.Dependency#getSystemPath()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_SystemPath();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Dependency#getExclusions <em>Exclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclusions</em>'.
	 * @see maven.Dependency#getExclusions()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Exclusions();

	/**
	 * Returns the meta object for the attribute '{@link maven.Dependency#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see maven.Dependency#isOptional()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Optional();

	/**
	 * Returns the meta object for class '{@link maven.DependencyManagement <em>Dependency Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Management</em>'.
	 * @see maven.DependencyManagement
	 * @generated
	 */
	EClass getDependencyManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.DependencyManagement#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see maven.DependencyManagement#getDependencies()
	 * @see #getDependencyManagement()
	 * @generated
	 */
	EReference getDependencyManagement_Dependencies();

	/**
	 * Returns the meta object for class '{@link maven.DeploymentRepository <em>Deployment Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Repository</em>'.
	 * @see maven.DeploymentRepository
	 * @generated
	 */
	EClass getDeploymentRepository();

	/**
	 * Returns the meta object for the attribute '{@link maven.DeploymentRepository#isUniqueVersion <em>Unique Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Version</em>'.
	 * @see maven.DeploymentRepository#isUniqueVersion()
	 * @see #getDeploymentRepository()
	 * @generated
	 */
	EAttribute getDeploymentRepository_UniqueVersion();

	/**
	 * Returns the meta object for the attribute '{@link maven.DeploymentRepository#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see maven.DeploymentRepository#getId()
	 * @see #getDeploymentRepository()
	 * @generated
	 */
	EAttribute getDeploymentRepository_Id();

	/**
	 * Returns the meta object for the attribute '{@link maven.DeploymentRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.DeploymentRepository#getName()
	 * @see #getDeploymentRepository()
	 * @generated
	 */
	EAttribute getDeploymentRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.DeploymentRepository#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.DeploymentRepository#getUrl()
	 * @see #getDeploymentRepository()
	 * @generated
	 */
	EAttribute getDeploymentRepository_Url();

	/**
	 * Returns the meta object for the attribute '{@link maven.DeploymentRepository#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see maven.DeploymentRepository#getLayout()
	 * @see #getDeploymentRepository()
	 * @generated
	 */
	EAttribute getDeploymentRepository_Layout();

	/**
	 * Returns the meta object for class '{@link maven.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developer</em>'.
	 * @see maven.Developer
	 * @generated
	 */
	EClass getDeveloper();

	/**
	 * Returns the meta object for the attribute '{@link maven.Developer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see maven.Developer#getId()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Id();

	/**
	 * Returns the meta object for the attribute '{@link maven.Developer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.Developer#getName()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.Developer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see maven.Developer#getEmail()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Email();

	/**
	 * Returns the meta object for the attribute '{@link maven.Developer#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.Developer#getUrl()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Url();

	/**
	 * Returns the meta object for the attribute '{@link maven.Developer#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see maven.Developer#getOrganization()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Organization();

	/**
	 * Returns the meta object for the attribute '{@link maven.Developer#getOrganizationUrl <em>Organization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Url</em>'.
	 * @see maven.Developer#getOrganizationUrl()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_OrganizationUrl();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Developer#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roles</em>'.
	 * @see maven.Developer#getRoles()
	 * @see #getDeveloper()
	 * @generated
	 */
	EReference getDeveloper_Roles();

	/**
	 * Returns the meta object for the attribute '{@link maven.Developer#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see maven.Developer#getTimezone()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Timezone();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Developer#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see maven.Developer#getProperties()
	 * @see #getDeveloper()
	 * @generated
	 */
	EReference getDeveloper_Properties();

	/**
	 * Returns the meta object for class '{@link maven.DevelopersType <em>Developers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developers Type</em>'.
	 * @see maven.DevelopersType
	 * @generated
	 */
	EClass getDevelopersType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.DevelopersType#getDeveloper <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Developer</em>'.
	 * @see maven.DevelopersType#getDeveloper()
	 * @see #getDevelopersType()
	 * @generated
	 */
	EReference getDevelopersType_Developer();

	/**
	 * Returns the meta object for class '{@link maven.DistributionManagement <em>Distribution Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Management</em>'.
	 * @see maven.DistributionManagement
	 * @generated
	 */
	EClass getDistributionManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.DistributionManagement#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see maven.DistributionManagement#getRepository()
	 * @see #getDistributionManagement()
	 * @generated
	 */
	EReference getDistributionManagement_Repository();

	/**
	 * Returns the meta object for the containment reference '{@link maven.DistributionManagement#getSnapshotRepository <em>Snapshot Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Snapshot Repository</em>'.
	 * @see maven.DistributionManagement#getSnapshotRepository()
	 * @see #getDistributionManagement()
	 * @generated
	 */
	EReference getDistributionManagement_SnapshotRepository();

	/**
	 * Returns the meta object for the containment reference '{@link maven.DistributionManagement#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Site</em>'.
	 * @see maven.DistributionManagement#getSite()
	 * @see #getDistributionManagement()
	 * @generated
	 */
	EReference getDistributionManagement_Site();

	/**
	 * Returns the meta object for the attribute '{@link maven.DistributionManagement#getDownloadUrl <em>Download Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Url</em>'.
	 * @see maven.DistributionManagement#getDownloadUrl()
	 * @see #getDistributionManagement()
	 * @generated
	 */
	EAttribute getDistributionManagement_DownloadUrl();

	/**
	 * Returns the meta object for the containment reference '{@link maven.DistributionManagement#getRelocation <em>Relocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relocation</em>'.
	 * @see maven.DistributionManagement#getRelocation()
	 * @see #getDistributionManagement()
	 * @generated
	 */
	EReference getDistributionManagement_Relocation();

	/**
	 * Returns the meta object for the attribute '{@link maven.DistributionManagement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see maven.DistributionManagement#getStatus()
	 * @see #getDistributionManagement()
	 * @generated
	 */
	EAttribute getDistributionManagement_Status();

	/**
	 * Returns the meta object for class '{@link maven.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see maven.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link maven.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see maven.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link maven.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see maven.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link maven.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see maven.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link maven.DocumentRoot#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see maven.DocumentRoot#getProject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Project();

	/**
	 * Returns the meta object for class '{@link maven.ExcludesType <em>Excludes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excludes Type</em>'.
	 * @see maven.ExcludesType
	 * @generated
	 */
	EClass getExcludesType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ExcludesType#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exclude</em>'.
	 * @see maven.ExcludesType#getExclude()
	 * @see #getExcludesType()
	 * @generated
	 */
	EAttribute getExcludesType_Exclude();

	/**
	 * Returns the meta object for class '{@link maven.Exclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion</em>'.
	 * @see maven.Exclusion
	 * @generated
	 */
	EClass getExclusion();

	/**
	 * Returns the meta object for the attribute '{@link maven.Exclusion#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see maven.Exclusion#getArtifactId()
	 * @see #getExclusion()
	 * @generated
	 */
	EAttribute getExclusion_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Exclusion#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see maven.Exclusion#getGroupId()
	 * @see #getExclusion()
	 * @generated
	 */
	EAttribute getExclusion_GroupId();

	/**
	 * Returns the meta object for class '{@link maven.ExclusionsType <em>Exclusions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusions Type</em>'.
	 * @see maven.ExclusionsType
	 * @generated
	 */
	EClass getExclusionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.ExclusionsType#getExclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclusion</em>'.
	 * @see maven.ExclusionsType#getExclusion()
	 * @see #getExclusionsType()
	 * @generated
	 */
	EReference getExclusionsType_Exclusion();

	/**
	 * Returns the meta object for class '{@link maven.ExecutionsType <em>Executions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executions Type</em>'.
	 * @see maven.ExecutionsType
	 * @generated
	 */
	EClass getExecutionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.ExecutionsType#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution</em>'.
	 * @see maven.ExecutionsType#getExecution()
	 * @see #getExecutionsType()
	 * @generated
	 */
	EReference getExecutionsType_Execution();

	/**
	 * Returns the meta object for class '{@link maven.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see maven.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link maven.Extension#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see maven.Extension#getGroupId()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Extension#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see maven.Extension#getArtifactId()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Extension#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maven.Extension#getVersion()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Version();

	/**
	 * Returns the meta object for class '{@link maven.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions Type</em>'.
	 * @see maven.ExtensionsType
	 * @generated
	 */
	EClass getExtensionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.ExtensionsType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see maven.ExtensionsType#getExtension()
	 * @see #getExtensionsType()
	 * @generated
	 */
	EReference getExtensionsType_Extension();

	/**
	 * Returns the meta object for class '{@link maven.FiltersType <em>Filters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filters Type</em>'.
	 * @see maven.FiltersType
	 * @generated
	 */
	EClass getFiltersType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.FiltersType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Filter</em>'.
	 * @see maven.FiltersType#getFilter()
	 * @see #getFiltersType()
	 * @generated
	 */
	EAttribute getFiltersType_Filter();

	/**
	 * Returns the meta object for class '{@link maven.FiltersType1 <em>Filters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filters Type1</em>'.
	 * @see maven.FiltersType1
	 * @generated
	 */
	EClass getFiltersType1();

	/**
	 * Returns the meta object for the attribute list '{@link maven.FiltersType1#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Filter</em>'.
	 * @see maven.FiltersType1#getFilter()
	 * @see #getFiltersType1()
	 * @generated
	 */
	EAttribute getFiltersType1_Filter();

	/**
	 * Returns the meta object for class '{@link maven.GoalsType <em>Goals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goals Type</em>'.
	 * @see maven.GoalsType
	 * @generated
	 */
	EClass getGoalsType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.GoalsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.GoalsType#getAny()
	 * @see #getGoalsType()
	 * @generated
	 */
	EAttribute getGoalsType_Any();

	/**
	 * Returns the meta object for class '{@link maven.GoalsType1 <em>Goals Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goals Type1</em>'.
	 * @see maven.GoalsType1
	 * @generated
	 */
	EClass getGoalsType1();

	/**
	 * Returns the meta object for the attribute list '{@link maven.GoalsType1#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Goal</em>'.
	 * @see maven.GoalsType1#getGoal()
	 * @see #getGoalsType1()
	 * @generated
	 */
	EAttribute getGoalsType1_Goal();

	/**
	 * Returns the meta object for class '{@link maven.IncludesType <em>Includes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Includes Type</em>'.
	 * @see maven.IncludesType
	 * @generated
	 */
	EClass getIncludesType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.IncludesType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Include</em>'.
	 * @see maven.IncludesType#getInclude()
	 * @see #getIncludesType()
	 * @generated
	 */
	EAttribute getIncludesType_Include();

	/**
	 * Returns the meta object for class '{@link maven.IssueManagement <em>Issue Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Management</em>'.
	 * @see maven.IssueManagement
	 * @generated
	 */
	EClass getIssueManagement();

	/**
	 * Returns the meta object for the attribute '{@link maven.IssueManagement#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see maven.IssueManagement#getSystem()
	 * @see #getIssueManagement()
	 * @generated
	 */
	EAttribute getIssueManagement_System();

	/**
	 * Returns the meta object for the attribute '{@link maven.IssueManagement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.IssueManagement#getUrl()
	 * @see #getIssueManagement()
	 * @generated
	 */
	EAttribute getIssueManagement_Url();

	/**
	 * Returns the meta object for class '{@link maven.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see maven.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link maven.License#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.License#getName()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.License#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.License#getUrl()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Url();

	/**
	 * Returns the meta object for the attribute '{@link maven.License#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see maven.License#getDistribution()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link maven.License#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see maven.License#getComments()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Comments();

	/**
	 * Returns the meta object for class '{@link maven.LicensesType <em>Licenses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Licenses Type</em>'.
	 * @see maven.LicensesType
	 * @generated
	 */
	EClass getLicensesType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.LicensesType#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>License</em>'.
	 * @see maven.LicensesType#getLicense()
	 * @see #getLicensesType()
	 * @generated
	 */
	EReference getLicensesType_License();

	/**
	 * Returns the meta object for class '{@link maven.MailingList <em>Mailing List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailing List</em>'.
	 * @see maven.MailingList
	 * @generated
	 */
	EClass getMailingList();

	/**
	 * Returns the meta object for the attribute '{@link maven.MailingList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.MailingList#getName()
	 * @see #getMailingList()
	 * @generated
	 */
	EAttribute getMailingList_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.MailingList#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscribe</em>'.
	 * @see maven.MailingList#getSubscribe()
	 * @see #getMailingList()
	 * @generated
	 */
	EAttribute getMailingList_Subscribe();

	/**
	 * Returns the meta object for the attribute '{@link maven.MailingList#getUnsubscribe <em>Unsubscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsubscribe</em>'.
	 * @see maven.MailingList#getUnsubscribe()
	 * @see #getMailingList()
	 * @generated
	 */
	EAttribute getMailingList_Unsubscribe();

	/**
	 * Returns the meta object for the attribute '{@link maven.MailingList#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post</em>'.
	 * @see maven.MailingList#getPost()
	 * @see #getMailingList()
	 * @generated
	 */
	EAttribute getMailingList_Post();

	/**
	 * Returns the meta object for the attribute '{@link maven.MailingList#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive</em>'.
	 * @see maven.MailingList#getArchive()
	 * @see #getMailingList()
	 * @generated
	 */
	EAttribute getMailingList_Archive();

	/**
	 * Returns the meta object for the containment reference '{@link maven.MailingList#getOtherArchives <em>Other Archives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Archives</em>'.
	 * @see maven.MailingList#getOtherArchives()
	 * @see #getMailingList()
	 * @generated
	 */
	EReference getMailingList_OtherArchives();

	/**
	 * Returns the meta object for class '{@link maven.MailingListsType <em>Mailing Lists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailing Lists Type</em>'.
	 * @see maven.MailingListsType
	 * @generated
	 */
	EClass getMailingListsType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.MailingListsType#getMailingList <em>Mailing List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mailing List</em>'.
	 * @see maven.MailingListsType#getMailingList()
	 * @see #getMailingListsType()
	 * @generated
	 */
	EReference getMailingListsType_MailingList();

	/**
	 * Returns the meta object for class '{@link maven.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see maven.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see maven.Model#getParent()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Parent();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getModelVersion <em>Model Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Version</em>'.
	 * @see maven.Model#getModelVersion()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelVersion();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see maven.Model#getGroupId()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see maven.Model#getArtifactId()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getPackaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packaging</em>'.
	 * @see maven.Model#getPackaging()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Packaging();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maven.Model#getVersion()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maven.Model#getDescription()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.Model#getUrl()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Url();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prerequisites</em>'.
	 * @see maven.Model#getPrerequisites()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Prerequisites();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getIssueManagement <em>Issue Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issue Management</em>'.
	 * @see maven.Model#getIssueManagement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_IssueManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getCiManagement <em>Ci Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ci Management</em>'.
	 * @see maven.Model#getCiManagement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_CiManagement();

	/**
	 * Returns the meta object for the attribute '{@link maven.Model#getInceptionYear <em>Inception Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inception Year</em>'.
	 * @see maven.Model#getInceptionYear()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_InceptionYear();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getMailingLists <em>Mailing Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mailing Lists</em>'.
	 * @see maven.Model#getMailingLists()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MailingLists();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getDevelopers <em>Developers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Developers</em>'.
	 * @see maven.Model#getDevelopers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Developers();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see maven.Model#getContributors()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licenses</em>'.
	 * @see maven.Model#getLicenses()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Licenses();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getScm <em>Scm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scm</em>'.
	 * @see maven.Model#getScm()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Scm();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see maven.Model#getOrganization()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build</em>'.
	 * @see maven.Model#getBuild()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Build();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getProfiles <em>Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profiles</em>'.
	 * @see maven.Model#getProfiles()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Profiles();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modules</em>'.
	 * @see maven.Model#getModules()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Modules();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repositories</em>'.
	 * @see maven.Model#getRepositories()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Repositories();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getPluginRepositories <em>Plugin Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin Repositories</em>'.
	 * @see maven.Model#getPluginRepositories()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_PluginRepositories();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see maven.Model#getDependencies()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reports</em>'.
	 * @see maven.Model#getReports()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Reports();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getReporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reporting</em>'.
	 * @see maven.Model#getReporting()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Reporting();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getDependencyManagement <em>Dependency Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency Management</em>'.
	 * @see maven.Model#getDependencyManagement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DependencyManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getDistributionManagement <em>Distribution Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution Management</em>'.
	 * @see maven.Model#getDistributionManagement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DistributionManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Model#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see maven.Model#getProperties()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Properties();

	/**
	 * Returns the meta object for class '{@link maven.ModulesType <em>Modules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modules Type</em>'.
	 * @see maven.ModulesType
	 * @generated
	 */
	EClass getModulesType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ModulesType#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Module</em>'.
	 * @see maven.ModulesType#getModule()
	 * @see #getModulesType()
	 * @generated
	 */
	EAttribute getModulesType_Module();

	/**
	 * Returns the meta object for class '{@link maven.ModulesType1 <em>Modules Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modules Type1</em>'.
	 * @see maven.ModulesType1
	 * @generated
	 */
	EClass getModulesType1();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ModulesType1#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Module</em>'.
	 * @see maven.ModulesType1#getModule()
	 * @see #getModulesType1()
	 * @generated
	 */
	EAttribute getModulesType1_Module();

	/**
	 * Returns the meta object for class '{@link maven.Notifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifier</em>'.
	 * @see maven.Notifier
	 * @generated
	 */
	EClass getNotifier();

	/**
	 * Returns the meta object for the attribute '{@link maven.Notifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see maven.Notifier#getType()
	 * @see #getNotifier()
	 * @generated
	 */
	EAttribute getNotifier_Type();

	/**
	 * Returns the meta object for the attribute '{@link maven.Notifier#isSendOnError <em>Send On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send On Error</em>'.
	 * @see maven.Notifier#isSendOnError()
	 * @see #getNotifier()
	 * @generated
	 */
	EAttribute getNotifier_SendOnError();

	/**
	 * Returns the meta object for the attribute '{@link maven.Notifier#isSendOnFailure <em>Send On Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send On Failure</em>'.
	 * @see maven.Notifier#isSendOnFailure()
	 * @see #getNotifier()
	 * @generated
	 */
	EAttribute getNotifier_SendOnFailure();

	/**
	 * Returns the meta object for the attribute '{@link maven.Notifier#isSendOnSuccess <em>Send On Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send On Success</em>'.
	 * @see maven.Notifier#isSendOnSuccess()
	 * @see #getNotifier()
	 * @generated
	 */
	EAttribute getNotifier_SendOnSuccess();

	/**
	 * Returns the meta object for the attribute '{@link maven.Notifier#isSendOnWarning <em>Send On Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send On Warning</em>'.
	 * @see maven.Notifier#isSendOnWarning()
	 * @see #getNotifier()
	 * @generated
	 */
	EAttribute getNotifier_SendOnWarning();

	/**
	 * Returns the meta object for the attribute '{@link maven.Notifier#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see maven.Notifier#getAddress()
	 * @see #getNotifier()
	 * @generated
	 */
	EAttribute getNotifier_Address();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Notifier#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see maven.Notifier#getConfiguration()
	 * @see #getNotifier()
	 * @generated
	 */
	EReference getNotifier_Configuration();

	/**
	 * Returns the meta object for class '{@link maven.NotifiersType <em>Notifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifiers Type</em>'.
	 * @see maven.NotifiersType
	 * @generated
	 */
	EClass getNotifiersType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.NotifiersType#getNotifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifier</em>'.
	 * @see maven.NotifiersType#getNotifier()
	 * @see #getNotifiersType()
	 * @generated
	 */
	EReference getNotifiersType_Notifier();

	/**
	 * Returns the meta object for class '{@link maven.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see maven.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link maven.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.Organization#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.Organization#getUrl()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Url();

	/**
	 * Returns the meta object for class '{@link maven.OtherArchivesType <em>Other Archives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Archives Type</em>'.
	 * @see maven.OtherArchivesType
	 * @generated
	 */
	EClass getOtherArchivesType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.OtherArchivesType#getOtherArchive <em>Other Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Archive</em>'.
	 * @see maven.OtherArchivesType#getOtherArchive()
	 * @see #getOtherArchivesType()
	 * @generated
	 */
	EAttribute getOtherArchivesType_OtherArchive();

	/**
	 * Returns the meta object for class '{@link maven.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see maven.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the attribute '{@link maven.Parent#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see maven.Parent#getArtifactId()
	 * @see #getParent()
	 * @generated
	 */
	EAttribute getParent_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Parent#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see maven.Parent#getGroupId()
	 * @see #getParent()
	 * @generated
	 */
	EAttribute getParent_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Parent#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maven.Parent#getVersion()
	 * @see #getParent()
	 * @generated
	 */
	EAttribute getParent_Version();

	/**
	 * Returns the meta object for the attribute '{@link maven.Parent#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see maven.Parent#getRelativePath()
	 * @see #getParent()
	 * @generated
	 */
	EAttribute getParent_RelativePath();

	/**
	 * Returns the meta object for class '{@link maven.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see maven.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link maven.Plugin#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see maven.Plugin#getGroupId()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Plugin#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see maven.Plugin#getArtifactId()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Plugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maven.Plugin#getVersion()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Version();

	/**
	 * Returns the meta object for the attribute '{@link maven.Plugin#isExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extensions</em>'.
	 * @see maven.Plugin#isExtensions()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Extensions();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Plugin#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executions</em>'.
	 * @see maven.Plugin#getExecutions()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Executions();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Plugin#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see maven.Plugin#getDependencies()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Plugin#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goals</em>'.
	 * @see maven.Plugin#getGoals()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Goals();

	/**
	 * Returns the meta object for the attribute '{@link maven.Plugin#getInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited</em>'.
	 * @see maven.Plugin#getInherited()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Inherited();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Plugin#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see maven.Plugin#getConfiguration()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Configuration();

	/**
	 * Returns the meta object for class '{@link maven.PluginExecution <em>Plugin Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Execution</em>'.
	 * @see maven.PluginExecution
	 * @generated
	 */
	EClass getPluginExecution();

	/**
	 * Returns the meta object for the attribute '{@link maven.PluginExecution#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see maven.PluginExecution#getId()
	 * @see #getPluginExecution()
	 * @generated
	 */
	EAttribute getPluginExecution_Id();

	/**
	 * Returns the meta object for the attribute '{@link maven.PluginExecution#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see maven.PluginExecution#getPhase()
	 * @see #getPluginExecution()
	 * @generated
	 */
	EAttribute getPluginExecution_Phase();

	/**
	 * Returns the meta object for the containment reference '{@link maven.PluginExecution#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goals</em>'.
	 * @see maven.PluginExecution#getGoals()
	 * @see #getPluginExecution()
	 * @generated
	 */
	EReference getPluginExecution_Goals();

	/**
	 * Returns the meta object for the attribute '{@link maven.PluginExecution#getInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited</em>'.
	 * @see maven.PluginExecution#getInherited()
	 * @see #getPluginExecution()
	 * @generated
	 */
	EAttribute getPluginExecution_Inherited();

	/**
	 * Returns the meta object for the containment reference '{@link maven.PluginExecution#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see maven.PluginExecution#getConfiguration()
	 * @see #getPluginExecution()
	 * @generated
	 */
	EReference getPluginExecution_Configuration();

	/**
	 * Returns the meta object for class '{@link maven.PluginManagement <em>Plugin Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Management</em>'.
	 * @see maven.PluginManagement
	 * @generated
	 */
	EClass getPluginManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.PluginManagement#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugins</em>'.
	 * @see maven.PluginManagement#getPlugins()
	 * @see #getPluginManagement()
	 * @generated
	 */
	EReference getPluginManagement_Plugins();

	/**
	 * Returns the meta object for class '{@link maven.PluginRepositoriesType <em>Plugin Repositories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Repositories Type</em>'.
	 * @see maven.PluginRepositoriesType
	 * @generated
	 */
	EClass getPluginRepositoriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.PluginRepositoriesType#getPluginRepository <em>Plugin Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin Repository</em>'.
	 * @see maven.PluginRepositoriesType#getPluginRepository()
	 * @see #getPluginRepositoriesType()
	 * @generated
	 */
	EReference getPluginRepositoriesType_PluginRepository();

	/**
	 * Returns the meta object for class '{@link maven.PluginRepositoriesType1 <em>Plugin Repositories Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Repositories Type1</em>'.
	 * @see maven.PluginRepositoriesType1
	 * @generated
	 */
	EClass getPluginRepositoriesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.PluginRepositoriesType1#getPluginRepository <em>Plugin Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin Repository</em>'.
	 * @see maven.PluginRepositoriesType1#getPluginRepository()
	 * @see #getPluginRepositoriesType1()
	 * @generated
	 */
	EReference getPluginRepositoriesType1_PluginRepository();

	/**
	 * Returns the meta object for class '{@link maven.PluginsType <em>Plugins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugins Type</em>'.
	 * @see maven.PluginsType
	 * @generated
	 */
	EClass getPluginsType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.PluginsType#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin</em>'.
	 * @see maven.PluginsType#getPlugin()
	 * @see #getPluginsType()
	 * @generated
	 */
	EReference getPluginsType_Plugin();

	/**
	 * Returns the meta object for class '{@link maven.PluginsType1 <em>Plugins Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugins Type1</em>'.
	 * @see maven.PluginsType1
	 * @generated
	 */
	EClass getPluginsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.PluginsType1#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin</em>'.
	 * @see maven.PluginsType1#getPlugin()
	 * @see #getPluginsType1()
	 * @generated
	 */
	EReference getPluginsType1_Plugin();

	/**
	 * Returns the meta object for class '{@link maven.PluginsType2 <em>Plugins Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugins Type2</em>'.
	 * @see maven.PluginsType2
	 * @generated
	 */
	EClass getPluginsType2();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.PluginsType2#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin</em>'.
	 * @see maven.PluginsType2#getPlugin()
	 * @see #getPluginsType2()
	 * @generated
	 */
	EReference getPluginsType2_Plugin();

	/**
	 * Returns the meta object for class '{@link maven.PluginsType3 <em>Plugins Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugins Type3</em>'.
	 * @see maven.PluginsType3
	 * @generated
	 */
	EClass getPluginsType3();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.PluginsType3#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin</em>'.
	 * @see maven.PluginsType3#getPlugin()
	 * @see #getPluginsType3()
	 * @generated
	 */
	EReference getPluginsType3_Plugin();

	/**
	 * Returns the meta object for class '{@link maven.Prerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisites</em>'.
	 * @see maven.Prerequisites
	 * @generated
	 */
	EClass getPrerequisites();

	/**
	 * Returns the meta object for the attribute '{@link maven.Prerequisites#getMaven <em>Maven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maven</em>'.
	 * @see maven.Prerequisites#getMaven()
	 * @see #getPrerequisites()
	 * @generated
	 */
	EAttribute getPrerequisites_Maven();

	/**
	 * Returns the meta object for class '{@link maven.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see maven.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the attribute '{@link maven.Profile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see maven.Profile#getId()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Id();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see maven.Profile#getActivation()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build</em>'.
	 * @see maven.Profile#getBuild()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Build();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modules</em>'.
	 * @see maven.Profile#getModules()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Modules();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repositories</em>'.
	 * @see maven.Profile#getRepositories()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Repositories();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getPluginRepositories <em>Plugin Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin Repositories</em>'.
	 * @see maven.Profile#getPluginRepositories()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_PluginRepositories();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see maven.Profile#getDependencies()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reports</em>'.
	 * @see maven.Profile#getReports()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Reports();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getReporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reporting</em>'.
	 * @see maven.Profile#getReporting()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Reporting();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getDependencyManagement <em>Dependency Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency Management</em>'.
	 * @see maven.Profile#getDependencyManagement()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_DependencyManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getDistributionManagement <em>Distribution Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution Management</em>'.
	 * @see maven.Profile#getDistributionManagement()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_DistributionManagement();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Profile#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see maven.Profile#getProperties()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Properties();

	/**
	 * Returns the meta object for class '{@link maven.ProfilesType <em>Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profiles Type</em>'.
	 * @see maven.ProfilesType
	 * @generated
	 */
	EClass getProfilesType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.ProfilesType#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile</em>'.
	 * @see maven.ProfilesType#getProfile()
	 * @see #getProfilesType()
	 * @generated
	 */
	EReference getProfilesType_Profile();

	/**
	 * Returns the meta object for class '{@link maven.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see maven.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.PropertiesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.PropertiesType#getAny()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_Any();

	/**
	 * Returns the meta object for class '{@link maven.PropertiesType1 <em>Properties Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type1</em>'.
	 * @see maven.PropertiesType1
	 * @generated
	 */
	EClass getPropertiesType1();

	/**
	 * Returns the meta object for the attribute list '{@link maven.PropertiesType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.PropertiesType1#getAny()
	 * @see #getPropertiesType1()
	 * @generated
	 */
	EAttribute getPropertiesType1_Any();

	/**
	 * Returns the meta object for class '{@link maven.PropertiesType2 <em>Properties Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type2</em>'.
	 * @see maven.PropertiesType2
	 * @generated
	 */
	EClass getPropertiesType2();

	/**
	 * Returns the meta object for the attribute list '{@link maven.PropertiesType2#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.PropertiesType2#getAny()
	 * @see #getPropertiesType2()
	 * @generated
	 */
	EAttribute getPropertiesType2_Any();

	/**
	 * Returns the meta object for class '{@link maven.PropertiesType3 <em>Properties Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type3</em>'.
	 * @see maven.PropertiesType3
	 * @generated
	 */
	EClass getPropertiesType3();

	/**
	 * Returns the meta object for the attribute list '{@link maven.PropertiesType3#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.PropertiesType3#getAny()
	 * @see #getPropertiesType3()
	 * @generated
	 */
	EAttribute getPropertiesType3_Any();

	/**
	 * Returns the meta object for class '{@link maven.Relocation <em>Relocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relocation</em>'.
	 * @see maven.Relocation
	 * @generated
	 */
	EClass getRelocation();

	/**
	 * Returns the meta object for the attribute '{@link maven.Relocation#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see maven.Relocation#getGroupId()
	 * @see #getRelocation()
	 * @generated
	 */
	EAttribute getRelocation_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Relocation#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see maven.Relocation#getArtifactId()
	 * @see #getRelocation()
	 * @generated
	 */
	EAttribute getRelocation_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link maven.Relocation#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maven.Relocation#getVersion()
	 * @see #getRelocation()
	 * @generated
	 */
	EAttribute getRelocation_Version();

	/**
	 * Returns the meta object for the attribute '{@link maven.Relocation#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see maven.Relocation#getMessage()
	 * @see #getRelocation()
	 * @generated
	 */
	EAttribute getRelocation_Message();

	/**
	 * Returns the meta object for class '{@link maven.Reporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting</em>'.
	 * @see maven.Reporting
	 * @generated
	 */
	EClass getReporting();

	/**
	 * Returns the meta object for the attribute '{@link maven.Reporting#isExcludeDefaults <em>Exclude Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Defaults</em>'.
	 * @see maven.Reporting#isExcludeDefaults()
	 * @see #getReporting()
	 * @generated
	 */
	EAttribute getReporting_ExcludeDefaults();

	/**
	 * Returns the meta object for the attribute '{@link maven.Reporting#getOutputDirectory <em>Output Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Directory</em>'.
	 * @see maven.Reporting#getOutputDirectory()
	 * @see #getReporting()
	 * @generated
	 */
	EAttribute getReporting_OutputDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Reporting#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugins</em>'.
	 * @see maven.Reporting#getPlugins()
	 * @see #getReporting()
	 * @generated
	 */
	EReference getReporting_Plugins();

	/**
	 * Returns the meta object for class '{@link maven.ReportPlugin <em>Report Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Plugin</em>'.
	 * @see maven.ReportPlugin
	 * @generated
	 */
	EClass getReportPlugin();

	/**
	 * Returns the meta object for the attribute '{@link maven.ReportPlugin#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see maven.ReportPlugin#getGroupId()
	 * @see #getReportPlugin()
	 * @generated
	 */
	EAttribute getReportPlugin_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link maven.ReportPlugin#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see maven.ReportPlugin#getArtifactId()
	 * @see #getReportPlugin()
	 * @generated
	 */
	EAttribute getReportPlugin_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link maven.ReportPlugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maven.ReportPlugin#getVersion()
	 * @see #getReportPlugin()
	 * @generated
	 */
	EAttribute getReportPlugin_Version();

	/**
	 * Returns the meta object for the attribute '{@link maven.ReportPlugin#getInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited</em>'.
	 * @see maven.ReportPlugin#getInherited()
	 * @see #getReportPlugin()
	 * @generated
	 */
	EAttribute getReportPlugin_Inherited();

	/**
	 * Returns the meta object for the containment reference '{@link maven.ReportPlugin#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see maven.ReportPlugin#getConfiguration()
	 * @see #getReportPlugin()
	 * @generated
	 */
	EReference getReportPlugin_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link maven.ReportPlugin#getReportSets <em>Report Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Sets</em>'.
	 * @see maven.ReportPlugin#getReportSets()
	 * @see #getReportPlugin()
	 * @generated
	 */
	EReference getReportPlugin_ReportSets();

	/**
	 * Returns the meta object for class '{@link maven.ReportSet <em>Report Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Set</em>'.
	 * @see maven.ReportSet
	 * @generated
	 */
	EClass getReportSet();

	/**
	 * Returns the meta object for the attribute '{@link maven.ReportSet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see maven.ReportSet#getId()
	 * @see #getReportSet()
	 * @generated
	 */
	EAttribute getReportSet_Id();

	/**
	 * Returns the meta object for the containment reference '{@link maven.ReportSet#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see maven.ReportSet#getConfiguration()
	 * @see #getReportSet()
	 * @generated
	 */
	EReference getReportSet_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link maven.ReportSet#getInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited</em>'.
	 * @see maven.ReportSet#getInherited()
	 * @see #getReportSet()
	 * @generated
	 */
	EAttribute getReportSet_Inherited();

	/**
	 * Returns the meta object for the containment reference '{@link maven.ReportSet#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reports</em>'.
	 * @see maven.ReportSet#getReports()
	 * @see #getReportSet()
	 * @generated
	 */
	EReference getReportSet_Reports();

	/**
	 * Returns the meta object for class '{@link maven.ReportSetsType <em>Report Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Sets Type</em>'.
	 * @see maven.ReportSetsType
	 * @generated
	 */
	EClass getReportSetsType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.ReportSetsType#getReportSet <em>Report Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report Set</em>'.
	 * @see maven.ReportSetsType#getReportSet()
	 * @see #getReportSetsType()
	 * @generated
	 */
	EReference getReportSetsType_ReportSet();

	/**
	 * Returns the meta object for class '{@link maven.ReportsType <em>Reports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reports Type</em>'.
	 * @see maven.ReportsType
	 * @generated
	 */
	EClass getReportsType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ReportsType#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Report</em>'.
	 * @see maven.ReportsType#getReport()
	 * @see #getReportsType()
	 * @generated
	 */
	EAttribute getReportsType_Report();

	/**
	 * Returns the meta object for class '{@link maven.ReportsType1 <em>Reports Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reports Type1</em>'.
	 * @see maven.ReportsType1
	 * @generated
	 */
	EClass getReportsType1();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ReportsType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.ReportsType1#getAny()
	 * @see #getReportsType1()
	 * @generated
	 */
	EAttribute getReportsType1_Any();

	/**
	 * Returns the meta object for class '{@link maven.ReportsType2 <em>Reports Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reports Type2</em>'.
	 * @see maven.ReportsType2
	 * @generated
	 */
	EClass getReportsType2();

	/**
	 * Returns the meta object for the attribute list '{@link maven.ReportsType2#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see maven.ReportsType2#getAny()
	 * @see #getReportsType2()
	 * @generated
	 */
	EAttribute getReportsType2_Any();

	/**
	 * Returns the meta object for class '{@link maven.RepositoriesType <em>Repositories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repositories Type</em>'.
	 * @see maven.RepositoriesType
	 * @generated
	 */
	EClass getRepositoriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.RepositoriesType#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository</em>'.
	 * @see maven.RepositoriesType#getRepository()
	 * @see #getRepositoriesType()
	 * @generated
	 */
	EReference getRepositoriesType_Repository();

	/**
	 * Returns the meta object for class '{@link maven.RepositoriesType1 <em>Repositories Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repositories Type1</em>'.
	 * @see maven.RepositoriesType1
	 * @generated
	 */
	EClass getRepositoriesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.RepositoriesType1#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository</em>'.
	 * @see maven.RepositoriesType1#getRepository()
	 * @see #getRepositoriesType1()
	 * @generated
	 */
	EReference getRepositoriesType1_Repository();

	/**
	 * Returns the meta object for class '{@link maven.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see maven.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Repository#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Releases</em>'.
	 * @see maven.Repository#getReleases()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Releases();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Repository#getSnapshots <em>Snapshots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Snapshots</em>'.
	 * @see maven.Repository#getSnapshots()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Snapshots();

	/**
	 * Returns the meta object for the attribute '{@link maven.Repository#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see maven.Repository#getId()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Id();

	/**
	 * Returns the meta object for the attribute '{@link maven.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.Repository#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.Repository#getUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Url();

	/**
	 * Returns the meta object for the attribute '{@link maven.Repository#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see maven.Repository#getLayout()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Layout();

	/**
	 * Returns the meta object for class '{@link maven.RepositoryPolicy <em>Repository Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Policy</em>'.
	 * @see maven.RepositoryPolicy
	 * @generated
	 */
	EClass getRepositoryPolicy();

	/**
	 * Returns the meta object for the attribute '{@link maven.RepositoryPolicy#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see maven.RepositoryPolicy#isEnabled()
	 * @see #getRepositoryPolicy()
	 * @generated
	 */
	EAttribute getRepositoryPolicy_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link maven.RepositoryPolicy#getUpdatePolicy <em>Update Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Policy</em>'.
	 * @see maven.RepositoryPolicy#getUpdatePolicy()
	 * @see #getRepositoryPolicy()
	 * @generated
	 */
	EAttribute getRepositoryPolicy_UpdatePolicy();

	/**
	 * Returns the meta object for the attribute '{@link maven.RepositoryPolicy#getChecksumPolicy <em>Checksum Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum Policy</em>'.
	 * @see maven.RepositoryPolicy#getChecksumPolicy()
	 * @see #getRepositoryPolicy()
	 * @generated
	 */
	EAttribute getRepositoryPolicy_ChecksumPolicy();

	/**
	 * Returns the meta object for class '{@link maven.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see maven.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link maven.Resource#getTargetPath <em>Target Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Path</em>'.
	 * @see maven.Resource#getTargetPath()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_TargetPath();

	/**
	 * Returns the meta object for the attribute '{@link maven.Resource#isFiltering <em>Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtering</em>'.
	 * @see maven.Resource#isFiltering()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Filtering();

	/**
	 * Returns the meta object for the attribute '{@link maven.Resource#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see maven.Resource#getDirectory()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Directory();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Resource#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Includes</em>'.
	 * @see maven.Resource#getIncludes()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Includes();

	/**
	 * Returns the meta object for the containment reference '{@link maven.Resource#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Excludes</em>'.
	 * @see maven.Resource#getExcludes()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Excludes();

	/**
	 * Returns the meta object for class '{@link maven.ResourcesType <em>Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Type</em>'.
	 * @see maven.ResourcesType
	 * @generated
	 */
	EClass getResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.ResourcesType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see maven.ResourcesType#getResource()
	 * @see #getResourcesType()
	 * @generated
	 */
	EReference getResourcesType_Resource();

	/**
	 * Returns the meta object for class '{@link maven.ResourcesType1 <em>Resources Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Type1</em>'.
	 * @see maven.ResourcesType1
	 * @generated
	 */
	EClass getResourcesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.ResourcesType1#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see maven.ResourcesType1#getResource()
	 * @see #getResourcesType1()
	 * @generated
	 */
	EReference getResourcesType1_Resource();

	/**
	 * Returns the meta object for class '{@link maven.RolesType <em>Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roles Type</em>'.
	 * @see maven.RolesType
	 * @generated
	 */
	EClass getRolesType();

	/**
	 * Returns the meta object for the attribute list '{@link maven.RolesType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see maven.RolesType#getRole()
	 * @see #getRolesType()
	 * @generated
	 */
	EAttribute getRolesType_Role();

	/**
	 * Returns the meta object for class '{@link maven.RolesType1 <em>Roles Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roles Type1</em>'.
	 * @see maven.RolesType1
	 * @generated
	 */
	EClass getRolesType1();

	/**
	 * Returns the meta object for the attribute list '{@link maven.RolesType1#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see maven.RolesType1#getRole()
	 * @see #getRolesType1()
	 * @generated
	 */
	EAttribute getRolesType1_Role();

	/**
	 * Returns the meta object for class '{@link maven.Scm <em>Scm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scm</em>'.
	 * @see maven.Scm
	 * @generated
	 */
	EClass getScm();

	/**
	 * Returns the meta object for the attribute '{@link maven.Scm#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see maven.Scm#getConnection()
	 * @see #getScm()
	 * @generated
	 */
	EAttribute getScm_Connection();

	/**
	 * Returns the meta object for the attribute '{@link maven.Scm#getDeveloperConnection <em>Developer Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developer Connection</em>'.
	 * @see maven.Scm#getDeveloperConnection()
	 * @see #getScm()
	 * @generated
	 */
	EAttribute getScm_DeveloperConnection();

	/**
	 * Returns the meta object for the attribute '{@link maven.Scm#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see maven.Scm#getTag()
	 * @see #getScm()
	 * @generated
	 */
	EAttribute getScm_Tag();

	/**
	 * Returns the meta object for the attribute '{@link maven.Scm#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.Scm#getUrl()
	 * @see #getScm()
	 * @generated
	 */
	EAttribute getScm_Url();

	/**
	 * Returns the meta object for class '{@link maven.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see maven.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the attribute '{@link maven.Site#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see maven.Site#getId()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Id();

	/**
	 * Returns the meta object for the attribute '{@link maven.Site#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maven.Site#getName()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Name();

	/**
	 * Returns the meta object for the attribute '{@link maven.Site#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maven.Site#getUrl()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Url();

	/**
	 * Returns the meta object for class '{@link maven.TestResourcesType <em>Test Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Resources Type</em>'.
	 * @see maven.TestResourcesType
	 * @generated
	 */
	EClass getTestResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.TestResourcesType#getTestResource <em>Test Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Resource</em>'.
	 * @see maven.TestResourcesType#getTestResource()
	 * @see #getTestResourcesType()
	 * @generated
	 */
	EReference getTestResourcesType_TestResource();

	/**
	 * Returns the meta object for class '{@link maven.TestResourcesType1 <em>Test Resources Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Resources Type1</em>'.
	 * @see maven.TestResourcesType1
	 * @generated
	 */
	EClass getTestResourcesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link maven.TestResourcesType1#getTestResource <em>Test Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Resource</em>'.
	 * @see maven.TestResourcesType1#getTestResource()
	 * @see #getTestResourcesType1()
	 * @generated
	 */
	EReference getTestResourcesType1_TestResource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MavenFactory getMavenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maven.impl.ActivationImpl <em>Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ActivationImpl
		 * @see maven.impl.MavenPackageImpl#getActivation()
		 * @generated
		 */
		EClass ACTIVATION = eINSTANCE.getActivation();

		/**
		 * The meta object literal for the '<em><b>Active By Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION__ACTIVE_BY_DEFAULT = eINSTANCE.getActivation_ActiveByDefault();

		/**
		 * The meta object literal for the '<em><b>Jdk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION__JDK = eINSTANCE.getActivation_Jdk();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION__OS = eINSTANCE.getActivation_Os();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION__PROPERTY = eINSTANCE.getActivation_Property();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION__FILE = eINSTANCE.getActivation_File();

		/**
		 * The meta object literal for the '{@link maven.impl.ActivationFileImpl <em>Activation File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ActivationFileImpl
		 * @see maven.impl.MavenPackageImpl#getActivationFile()
		 * @generated
		 */
		EClass ACTIVATION_FILE = eINSTANCE.getActivationFile();

		/**
		 * The meta object literal for the '<em><b>Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_FILE__MISSING = eINSTANCE.getActivationFile_Missing();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_FILE__EXISTS = eINSTANCE.getActivationFile_Exists();

		/**
		 * The meta object literal for the '{@link maven.impl.ActivationOSImpl <em>Activation OS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ActivationOSImpl
		 * @see maven.impl.MavenPackageImpl#getActivationOS()
		 * @generated
		 */
		EClass ACTIVATION_OS = eINSTANCE.getActivationOS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_OS__NAME = eINSTANCE.getActivationOS_Name();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_OS__FAMILY = eINSTANCE.getActivationOS_Family();

		/**
		 * The meta object literal for the '<em><b>Arch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_OS__ARCH = eINSTANCE.getActivationOS_Arch();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_OS__VERSION = eINSTANCE.getActivationOS_Version();

		/**
		 * The meta object literal for the '{@link maven.impl.ActivationPropertyImpl <em>Activation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ActivationPropertyImpl
		 * @see maven.impl.MavenPackageImpl#getActivationProperty()
		 * @generated
		 */
		EClass ACTIVATION_PROPERTY = eINSTANCE.getActivationProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROPERTY__NAME = eINSTANCE.getActivationProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PROPERTY__VALUE = eINSTANCE.getActivationProperty_Value();

		/**
		 * The meta object literal for the '{@link maven.impl.BuildImpl <em>Build</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.BuildImpl
		 * @see maven.impl.MavenPackageImpl#getBuild()
		 * @generated
		 */
		EClass BUILD = eINSTANCE.getBuild();

		/**
		 * The meta object literal for the '<em><b>Source Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__SOURCE_DIRECTORY = eINSTANCE.getBuild_SourceDirectory();

		/**
		 * The meta object literal for the '<em><b>Script Source Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__SCRIPT_SOURCE_DIRECTORY = eINSTANCE.getBuild_ScriptSourceDirectory();

		/**
		 * The meta object literal for the '<em><b>Test Source Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__TEST_SOURCE_DIRECTORY = eINSTANCE.getBuild_TestSourceDirectory();

		/**
		 * The meta object literal for the '<em><b>Output Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__OUTPUT_DIRECTORY = eINSTANCE.getBuild_OutputDirectory();

		/**
		 * The meta object literal for the '<em><b>Test Output Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__TEST_OUTPUT_DIRECTORY = eINSTANCE.getBuild_TestOutputDirectory();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__EXTENSIONS = eINSTANCE.getBuild_Extensions();

		/**
		 * The meta object literal for the '<em><b>Default Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__DEFAULT_GOAL = eINSTANCE.getBuild_DefaultGoal();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__RESOURCES = eINSTANCE.getBuild_Resources();

		/**
		 * The meta object literal for the '<em><b>Test Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__TEST_RESOURCES = eINSTANCE.getBuild_TestResources();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__DIRECTORY = eINSTANCE.getBuild_Directory();

		/**
		 * The meta object literal for the '<em><b>Final Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__FINAL_NAME = eINSTANCE.getBuild_FinalName();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__FILTERS = eINSTANCE.getBuild_Filters();

		/**
		 * The meta object literal for the '<em><b>Plugin Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__PLUGIN_MANAGEMENT = eINSTANCE.getBuild_PluginManagement();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__PLUGINS = eINSTANCE.getBuild_Plugins();

		/**
		 * The meta object literal for the '{@link maven.impl.BuildBaseImpl <em>Build Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.BuildBaseImpl
		 * @see maven.impl.MavenPackageImpl#getBuildBase()
		 * @generated
		 */
		EClass BUILD_BASE = eINSTANCE.getBuildBase();

		/**
		 * The meta object literal for the '<em><b>Default Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_BASE__DEFAULT_GOAL = eINSTANCE.getBuildBase_DefaultGoal();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_BASE__RESOURCES = eINSTANCE.getBuildBase_Resources();

		/**
		 * The meta object literal for the '<em><b>Test Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_BASE__TEST_RESOURCES = eINSTANCE.getBuildBase_TestResources();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_BASE__DIRECTORY = eINSTANCE.getBuildBase_Directory();

		/**
		 * The meta object literal for the '<em><b>Final Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_BASE__FINAL_NAME = eINSTANCE.getBuildBase_FinalName();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_BASE__FILTERS = eINSTANCE.getBuildBase_Filters();

		/**
		 * The meta object literal for the '<em><b>Plugin Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_BASE__PLUGIN_MANAGEMENT = eINSTANCE.getBuildBase_PluginManagement();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_BASE__PLUGINS = eINSTANCE.getBuildBase_Plugins();

		/**
		 * The meta object literal for the '{@link maven.impl.CiManagementImpl <em>Ci Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.CiManagementImpl
		 * @see maven.impl.MavenPackageImpl#getCiManagement()
		 * @generated
		 */
		EClass CI_MANAGEMENT = eINSTANCE.getCiManagement();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CI_MANAGEMENT__SYSTEM = eINSTANCE.getCiManagement_System();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CI_MANAGEMENT__URL = eINSTANCE.getCiManagement_Url();

		/**
		 * The meta object literal for the '<em><b>Notifiers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CI_MANAGEMENT__NOTIFIERS = eINSTANCE.getCiManagement_Notifiers();

		/**
		 * The meta object literal for the '{@link maven.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ConfigurationTypeImpl
		 * @see maven.impl.MavenPackageImpl#getConfigurationType()
		 * @generated
		 */
		EClass CONFIGURATION_TYPE = eINSTANCE.getConfigurationType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_TYPE__ANY = eINSTANCE.getConfigurationType_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.ConfigurationType1Impl <em>Configuration Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ConfigurationType1Impl
		 * @see maven.impl.MavenPackageImpl#getConfigurationType1()
		 * @generated
		 */
		EClass CONFIGURATION_TYPE1 = eINSTANCE.getConfigurationType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_TYPE1__ANY = eINSTANCE.getConfigurationType1_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.ConfigurationType2Impl <em>Configuration Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ConfigurationType2Impl
		 * @see maven.impl.MavenPackageImpl#getConfigurationType2()
		 * @generated
		 */
		EClass CONFIGURATION_TYPE2 = eINSTANCE.getConfigurationType2();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_TYPE2__ANY = eINSTANCE.getConfigurationType2_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.ConfigurationType3Impl <em>Configuration Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ConfigurationType3Impl
		 * @see maven.impl.MavenPackageImpl#getConfigurationType3()
		 * @generated
		 */
		EClass CONFIGURATION_TYPE3 = eINSTANCE.getConfigurationType3();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_TYPE3__ANY = eINSTANCE.getConfigurationType3_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.ConfigurationType4Impl <em>Configuration Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ConfigurationType4Impl
		 * @see maven.impl.MavenPackageImpl#getConfigurationType4()
		 * @generated
		 */
		EClass CONFIGURATION_TYPE4 = eINSTANCE.getConfigurationType4();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_TYPE4__ANY = eINSTANCE.getConfigurationType4_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.ContributorImpl <em>Contributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ContributorImpl
		 * @see maven.impl.MavenPackageImpl#getContributor()
		 * @generated
		 */
		EClass CONTRIBUTOR = eINSTANCE.getContributor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__NAME = eINSTANCE.getContributor_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__EMAIL = eINSTANCE.getContributor_Email();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__URL = eINSTANCE.getContributor_Url();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__ORGANIZATION = eINSTANCE.getContributor_Organization();

		/**
		 * The meta object literal for the '<em><b>Organization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__ORGANIZATION_URL = eINSTANCE.getContributor_OrganizationUrl();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__ROLES = eINSTANCE.getContributor_Roles();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__TIMEZONE = eINSTANCE.getContributor_Timezone();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__PROPERTIES = eINSTANCE.getContributor_Properties();

		/**
		 * The meta object literal for the '{@link maven.impl.ContributorsTypeImpl <em>Contributors Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ContributorsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getContributorsType()
		 * @generated
		 */
		EClass CONTRIBUTORS_TYPE = eINSTANCE.getContributorsType();

		/**
		 * The meta object literal for the '<em><b>Contributor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTORS_TYPE__CONTRIBUTOR = eINSTANCE.getContributorsType_Contributor();

		/**
		 * The meta object literal for the '{@link maven.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DependenciesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getDependenciesType()
		 * @generated
		 */
		EClass DEPENDENCIES_TYPE = eINSTANCE.getDependenciesType();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES_TYPE__DEPENDENCY = eINSTANCE.getDependenciesType_Dependency();

		/**
		 * The meta object literal for the '{@link maven.impl.DependenciesType1Impl <em>Dependencies Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DependenciesType1Impl
		 * @see maven.impl.MavenPackageImpl#getDependenciesType1()
		 * @generated
		 */
		EClass DEPENDENCIES_TYPE1 = eINSTANCE.getDependenciesType1();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES_TYPE1__DEPENDENCY = eINSTANCE.getDependenciesType1_Dependency();

		/**
		 * The meta object literal for the '{@link maven.impl.DependenciesType2Impl <em>Dependencies Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DependenciesType2Impl
		 * @see maven.impl.MavenPackageImpl#getDependenciesType2()
		 * @generated
		 */
		EClass DEPENDENCIES_TYPE2 = eINSTANCE.getDependenciesType2();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES_TYPE2__DEPENDENCY = eINSTANCE.getDependenciesType2_Dependency();

		/**
		 * The meta object literal for the '{@link maven.impl.DependenciesType3Impl <em>Dependencies Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DependenciesType3Impl
		 * @see maven.impl.MavenPackageImpl#getDependenciesType3()
		 * @generated
		 */
		EClass DEPENDENCIES_TYPE3 = eINSTANCE.getDependenciesType3();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES_TYPE3__DEPENDENCY = eINSTANCE.getDependenciesType3_Dependency();

		/**
		 * The meta object literal for the '{@link maven.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DependencyImpl
		 * @see maven.impl.MavenPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__GROUP_ID = eINSTANCE.getDependency_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__ARTIFACT_ID = eINSTANCE.getDependency_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__VERSION = eINSTANCE.getDependency_Version();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__CLASSIFIER = eINSTANCE.getDependency_Classifier();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__SCOPE = eINSTANCE.getDependency_Scope();

		/**
		 * The meta object literal for the '<em><b>System Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__SYSTEM_PATH = eINSTANCE.getDependency_SystemPath();

		/**
		 * The meta object literal for the '<em><b>Exclusions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__EXCLUSIONS = eINSTANCE.getDependency_Exclusions();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__OPTIONAL = eINSTANCE.getDependency_Optional();

		/**
		 * The meta object literal for the '{@link maven.impl.DependencyManagementImpl <em>Dependency Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DependencyManagementImpl
		 * @see maven.impl.MavenPackageImpl#getDependencyManagement()
		 * @generated
		 */
		EClass DEPENDENCY_MANAGEMENT = eINSTANCE.getDependencyManagement();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_MANAGEMENT__DEPENDENCIES = eINSTANCE.getDependencyManagement_Dependencies();

		/**
		 * The meta object literal for the '{@link maven.impl.DeploymentRepositoryImpl <em>Deployment Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DeploymentRepositoryImpl
		 * @see maven.impl.MavenPackageImpl#getDeploymentRepository()
		 * @generated
		 */
		EClass DEPLOYMENT_REPOSITORY = eINSTANCE.getDeploymentRepository();

		/**
		 * The meta object literal for the '<em><b>Unique Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_REPOSITORY__UNIQUE_VERSION = eINSTANCE.getDeploymentRepository_UniqueVersion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_REPOSITORY__ID = eINSTANCE.getDeploymentRepository_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_REPOSITORY__NAME = eINSTANCE.getDeploymentRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_REPOSITORY__URL = eINSTANCE.getDeploymentRepository_Url();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_REPOSITORY__LAYOUT = eINSTANCE.getDeploymentRepository_Layout();

		/**
		 * The meta object literal for the '{@link maven.impl.DeveloperImpl <em>Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DeveloperImpl
		 * @see maven.impl.MavenPackageImpl#getDeveloper()
		 * @generated
		 */
		EClass DEVELOPER = eINSTANCE.getDeveloper();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__ID = eINSTANCE.getDeveloper_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__NAME = eINSTANCE.getDeveloper_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__EMAIL = eINSTANCE.getDeveloper_Email();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__URL = eINSTANCE.getDeveloper_Url();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__ORGANIZATION = eINSTANCE.getDeveloper_Organization();

		/**
		 * The meta object literal for the '<em><b>Organization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__ORGANIZATION_URL = eINSTANCE.getDeveloper_OrganizationUrl();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPER__ROLES = eINSTANCE.getDeveloper_Roles();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__TIMEZONE = eINSTANCE.getDeveloper_Timezone();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPER__PROPERTIES = eINSTANCE.getDeveloper_Properties();

		/**
		 * The meta object literal for the '{@link maven.impl.DevelopersTypeImpl <em>Developers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DevelopersTypeImpl
		 * @see maven.impl.MavenPackageImpl#getDevelopersType()
		 * @generated
		 */
		EClass DEVELOPERS_TYPE = eINSTANCE.getDevelopersType();

		/**
		 * The meta object literal for the '<em><b>Developer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPERS_TYPE__DEVELOPER = eINSTANCE.getDevelopersType_Developer();

		/**
		 * The meta object literal for the '{@link maven.impl.DistributionManagementImpl <em>Distribution Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DistributionManagementImpl
		 * @see maven.impl.MavenPackageImpl#getDistributionManagement()
		 * @generated
		 */
		EClass DISTRIBUTION_MANAGEMENT = eINSTANCE.getDistributionManagement();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_MANAGEMENT__REPOSITORY = eINSTANCE.getDistributionManagement_Repository();

		/**
		 * The meta object literal for the '<em><b>Snapshot Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_MANAGEMENT__SNAPSHOT_REPOSITORY = eINSTANCE.getDistributionManagement_SnapshotRepository();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_MANAGEMENT__SITE = eINSTANCE.getDistributionManagement_Site();

		/**
		 * The meta object literal for the '<em><b>Download Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_MANAGEMENT__DOWNLOAD_URL = eINSTANCE.getDistributionManagement_DownloadUrl();

		/**
		 * The meta object literal for the '<em><b>Relocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_MANAGEMENT__RELOCATION = eINSTANCE.getDistributionManagement_Relocation();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_MANAGEMENT__STATUS = eINSTANCE.getDistributionManagement_Status();

		/**
		 * The meta object literal for the '{@link maven.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.DocumentRootImpl
		 * @see maven.impl.MavenPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROJECT = eINSTANCE.getDocumentRoot_Project();

		/**
		 * The meta object literal for the '{@link maven.impl.ExcludesTypeImpl <em>Excludes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ExcludesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getExcludesType()
		 * @generated
		 */
		EClass EXCLUDES_TYPE = eINSTANCE.getExcludesType();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDES_TYPE__EXCLUDE = eINSTANCE.getExcludesType_Exclude();

		/**
		 * The meta object literal for the '{@link maven.impl.ExclusionImpl <em>Exclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ExclusionImpl
		 * @see maven.impl.MavenPackageImpl#getExclusion()
		 * @generated
		 */
		EClass EXCLUSION = eINSTANCE.getExclusion();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUSION__ARTIFACT_ID = eINSTANCE.getExclusion_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUSION__GROUP_ID = eINSTANCE.getExclusion_GroupId();

		/**
		 * The meta object literal for the '{@link maven.impl.ExclusionsTypeImpl <em>Exclusions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ExclusionsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getExclusionsType()
		 * @generated
		 */
		EClass EXCLUSIONS_TYPE = eINSTANCE.getExclusionsType();

		/**
		 * The meta object literal for the '<em><b>Exclusion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIONS_TYPE__EXCLUSION = eINSTANCE.getExclusionsType_Exclusion();

		/**
		 * The meta object literal for the '{@link maven.impl.ExecutionsTypeImpl <em>Executions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ExecutionsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getExecutionsType()
		 * @generated
		 */
		EClass EXECUTIONS_TYPE = eINSTANCE.getExecutionsType();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTIONS_TYPE__EXECUTION = eINSTANCE.getExecutionsType_Execution();

		/**
		 * The meta object literal for the '{@link maven.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ExtensionImpl
		 * @see maven.impl.MavenPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__GROUP_ID = eINSTANCE.getExtension_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ARTIFACT_ID = eINSTANCE.getExtension_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VERSION = eINSTANCE.getExtension_Version();

		/**
		 * The meta object literal for the '{@link maven.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ExtensionsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getExtensionsType()
		 * @generated
		 */
		EClass EXTENSIONS_TYPE = eINSTANCE.getExtensionsType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS_TYPE__EXTENSION = eINSTANCE.getExtensionsType_Extension();

		/**
		 * The meta object literal for the '{@link maven.impl.FiltersTypeImpl <em>Filters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.FiltersTypeImpl
		 * @see maven.impl.MavenPackageImpl#getFiltersType()
		 * @generated
		 */
		EClass FILTERS_TYPE = eINSTANCE.getFiltersType();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERS_TYPE__FILTER = eINSTANCE.getFiltersType_Filter();

		/**
		 * The meta object literal for the '{@link maven.impl.FiltersType1Impl <em>Filters Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.FiltersType1Impl
		 * @see maven.impl.MavenPackageImpl#getFiltersType1()
		 * @generated
		 */
		EClass FILTERS_TYPE1 = eINSTANCE.getFiltersType1();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERS_TYPE1__FILTER = eINSTANCE.getFiltersType1_Filter();

		/**
		 * The meta object literal for the '{@link maven.impl.GoalsTypeImpl <em>Goals Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.GoalsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getGoalsType()
		 * @generated
		 */
		EClass GOALS_TYPE = eINSTANCE.getGoalsType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOALS_TYPE__ANY = eINSTANCE.getGoalsType_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.GoalsType1Impl <em>Goals Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.GoalsType1Impl
		 * @see maven.impl.MavenPackageImpl#getGoalsType1()
		 * @generated
		 */
		EClass GOALS_TYPE1 = eINSTANCE.getGoalsType1();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOALS_TYPE1__GOAL = eINSTANCE.getGoalsType1_Goal();

		/**
		 * The meta object literal for the '{@link maven.impl.IncludesTypeImpl <em>Includes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.IncludesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getIncludesType()
		 * @generated
		 */
		EClass INCLUDES_TYPE = eINSTANCE.getIncludesType();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDES_TYPE__INCLUDE = eINSTANCE.getIncludesType_Include();

		/**
		 * The meta object literal for the '{@link maven.impl.IssueManagementImpl <em>Issue Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.IssueManagementImpl
		 * @see maven.impl.MavenPackageImpl#getIssueManagement()
		 * @generated
		 */
		EClass ISSUE_MANAGEMENT = eINSTANCE.getIssueManagement();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_MANAGEMENT__SYSTEM = eINSTANCE.getIssueManagement_System();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_MANAGEMENT__URL = eINSTANCE.getIssueManagement_Url();

		/**
		 * The meta object literal for the '{@link maven.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.LicenseImpl
		 * @see maven.impl.MavenPackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NAME = eINSTANCE.getLicense_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__URL = eINSTANCE.getLicense_Url();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__DISTRIBUTION = eINSTANCE.getLicense_Distribution();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__COMMENTS = eINSTANCE.getLicense_Comments();

		/**
		 * The meta object literal for the '{@link maven.impl.LicensesTypeImpl <em>Licenses Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.LicensesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getLicensesType()
		 * @generated
		 */
		EClass LICENSES_TYPE = eINSTANCE.getLicensesType();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSES_TYPE__LICENSE = eINSTANCE.getLicensesType_License();

		/**
		 * The meta object literal for the '{@link maven.impl.MailingListImpl <em>Mailing List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.MailingListImpl
		 * @see maven.impl.MavenPackageImpl#getMailingList()
		 * @generated
		 */
		EClass MAILING_LIST = eINSTANCE.getMailingList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILING_LIST__NAME = eINSTANCE.getMailingList_Name();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILING_LIST__SUBSCRIBE = eINSTANCE.getMailingList_Subscribe();

		/**
		 * The meta object literal for the '<em><b>Unsubscribe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILING_LIST__UNSUBSCRIBE = eINSTANCE.getMailingList_Unsubscribe();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILING_LIST__POST = eINSTANCE.getMailingList_Post();

		/**
		 * The meta object literal for the '<em><b>Archive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILING_LIST__ARCHIVE = eINSTANCE.getMailingList_Archive();

		/**
		 * The meta object literal for the '<em><b>Other Archives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAILING_LIST__OTHER_ARCHIVES = eINSTANCE.getMailingList_OtherArchives();

		/**
		 * The meta object literal for the '{@link maven.impl.MailingListsTypeImpl <em>Mailing Lists Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.MailingListsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getMailingListsType()
		 * @generated
		 */
		EClass MAILING_LISTS_TYPE = eINSTANCE.getMailingListsType();

		/**
		 * The meta object literal for the '<em><b>Mailing List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAILING_LISTS_TYPE__MAILING_LIST = eINSTANCE.getMailingListsType_MailingList();

		/**
		 * The meta object literal for the '{@link maven.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ModelImpl
		 * @see maven.impl.MavenPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PARENT = eINSTANCE.getModel_Parent();

		/**
		 * The meta object literal for the '<em><b>Model Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL_VERSION = eINSTANCE.getModel_ModelVersion();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__GROUP_ID = eINSTANCE.getModel_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__ARTIFACT_ID = eINSTANCE.getModel_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Packaging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PACKAGING = eINSTANCE.getModel_Packaging();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__VERSION = eINSTANCE.getModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__URL = eINSTANCE.getModel_Url();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PREREQUISITES = eINSTANCE.getModel_Prerequisites();

		/**
		 * The meta object literal for the '<em><b>Issue Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ISSUE_MANAGEMENT = eINSTANCE.getModel_IssueManagement();

		/**
		 * The meta object literal for the '<em><b>Ci Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CI_MANAGEMENT = eINSTANCE.getModel_CiManagement();

		/**
		 * The meta object literal for the '<em><b>Inception Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__INCEPTION_YEAR = eINSTANCE.getModel_InceptionYear();

		/**
		 * The meta object literal for the '<em><b>Mailing Lists</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MAILING_LISTS = eINSTANCE.getModel_MailingLists();

		/**
		 * The meta object literal for the '<em><b>Developers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEVELOPERS = eINSTANCE.getModel_Developers();

		/**
		 * The meta object literal for the '<em><b>Contributors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTRIBUTORS = eINSTANCE.getModel_Contributors();

		/**
		 * The meta object literal for the '<em><b>Licenses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LICENSES = eINSTANCE.getModel_Licenses();

		/**
		 * The meta object literal for the '<em><b>Scm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCM = eINSTANCE.getModel_Scm();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ORGANIZATION = eINSTANCE.getModel_Organization();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__BUILD = eINSTANCE.getModel_Build();

		/**
		 * The meta object literal for the '<em><b>Profiles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROFILES = eINSTANCE.getModel_Profiles();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MODULES = eINSTANCE.getModel_Modules();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__REPOSITORIES = eINSTANCE.getModel_Repositories();

		/**
		 * The meta object literal for the '<em><b>Plugin Repositories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PLUGIN_REPOSITORIES = eINSTANCE.getModel_PluginRepositories();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEPENDENCIES = eINSTANCE.getModel_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Reports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__REPORTS = eINSTANCE.getModel_Reports();

		/**
		 * The meta object literal for the '<em><b>Reporting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__REPORTING = eINSTANCE.getModel_Reporting();

		/**
		 * The meta object literal for the '<em><b>Dependency Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEPENDENCY_MANAGEMENT = eINSTANCE.getModel_DependencyManagement();

		/**
		 * The meta object literal for the '<em><b>Distribution Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DISTRIBUTION_MANAGEMENT = eINSTANCE.getModel_DistributionManagement();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROPERTIES = eINSTANCE.getModel_Properties();

		/**
		 * The meta object literal for the '{@link maven.impl.ModulesTypeImpl <em>Modules Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ModulesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getModulesType()
		 * @generated
		 */
		EClass MODULES_TYPE = eINSTANCE.getModulesType();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULES_TYPE__MODULE = eINSTANCE.getModulesType_Module();

		/**
		 * The meta object literal for the '{@link maven.impl.ModulesType1Impl <em>Modules Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ModulesType1Impl
		 * @see maven.impl.MavenPackageImpl#getModulesType1()
		 * @generated
		 */
		EClass MODULES_TYPE1 = eINSTANCE.getModulesType1();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULES_TYPE1__MODULE = eINSTANCE.getModulesType1_Module();

		/**
		 * The meta object literal for the '{@link maven.impl.NotifierImpl <em>Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.NotifierImpl
		 * @see maven.impl.MavenPackageImpl#getNotifier()
		 * @generated
		 */
		EClass NOTIFIER = eINSTANCE.getNotifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFIER__TYPE = eINSTANCE.getNotifier_Type();

		/**
		 * The meta object literal for the '<em><b>Send On Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFIER__SEND_ON_ERROR = eINSTANCE.getNotifier_SendOnError();

		/**
		 * The meta object literal for the '<em><b>Send On Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFIER__SEND_ON_FAILURE = eINSTANCE.getNotifier_SendOnFailure();

		/**
		 * The meta object literal for the '<em><b>Send On Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFIER__SEND_ON_SUCCESS = eINSTANCE.getNotifier_SendOnSuccess();

		/**
		 * The meta object literal for the '<em><b>Send On Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFIER__SEND_ON_WARNING = eINSTANCE.getNotifier_SendOnWarning();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFIER__ADDRESS = eINSTANCE.getNotifier_Address();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFIER__CONFIGURATION = eINSTANCE.getNotifier_Configuration();

		/**
		 * The meta object literal for the '{@link maven.impl.NotifiersTypeImpl <em>Notifiers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.NotifiersTypeImpl
		 * @see maven.impl.MavenPackageImpl#getNotifiersType()
		 * @generated
		 */
		EClass NOTIFIERS_TYPE = eINSTANCE.getNotifiersType();

		/**
		 * The meta object literal for the '<em><b>Notifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFIERS_TYPE__NOTIFIER = eINSTANCE.getNotifiersType_Notifier();

		/**
		 * The meta object literal for the '{@link maven.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.OrganizationImpl
		 * @see maven.impl.MavenPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__URL = eINSTANCE.getOrganization_Url();

		/**
		 * The meta object literal for the '{@link maven.impl.OtherArchivesTypeImpl <em>Other Archives Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.OtherArchivesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getOtherArchivesType()
		 * @generated
		 */
		EClass OTHER_ARCHIVES_TYPE = eINSTANCE.getOtherArchivesType();

		/**
		 * The meta object literal for the '<em><b>Other Archive</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_ARCHIVES_TYPE__OTHER_ARCHIVE = eINSTANCE.getOtherArchivesType_OtherArchive();

		/**
		 * The meta object literal for the '{@link maven.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ParentImpl
		 * @see maven.impl.MavenPackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT__ARTIFACT_ID = eINSTANCE.getParent_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT__GROUP_ID = eINSTANCE.getParent_GroupId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT__VERSION = eINSTANCE.getParent_Version();

		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT__RELATIVE_PATH = eINSTANCE.getParent_RelativePath();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginImpl
		 * @see maven.impl.MavenPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__GROUP_ID = eINSTANCE.getPlugin_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__ARTIFACT_ID = eINSTANCE.getPlugin_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__VERSION = eINSTANCE.getPlugin_Version();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__EXTENSIONS = eINSTANCE.getPlugin_Extensions();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__EXECUTIONS = eINSTANCE.getPlugin_Executions();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__DEPENDENCIES = eINSTANCE.getPlugin_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__GOALS = eINSTANCE.getPlugin_Goals();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__INHERITED = eINSTANCE.getPlugin_Inherited();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__CONFIGURATION = eINSTANCE.getPlugin_Configuration();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginExecutionImpl <em>Plugin Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginExecutionImpl
		 * @see maven.impl.MavenPackageImpl#getPluginExecution()
		 * @generated
		 */
		EClass PLUGIN_EXECUTION = eINSTANCE.getPluginExecution();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_EXECUTION__ID = eINSTANCE.getPluginExecution_Id();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_EXECUTION__PHASE = eINSTANCE.getPluginExecution_Phase();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_EXECUTION__GOALS = eINSTANCE.getPluginExecution_Goals();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_EXECUTION__INHERITED = eINSTANCE.getPluginExecution_Inherited();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_EXECUTION__CONFIGURATION = eINSTANCE.getPluginExecution_Configuration();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginManagementImpl <em>Plugin Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginManagementImpl
		 * @see maven.impl.MavenPackageImpl#getPluginManagement()
		 * @generated
		 */
		EClass PLUGIN_MANAGEMENT = eINSTANCE.getPluginManagement();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_MANAGEMENT__PLUGINS = eINSTANCE.getPluginManagement_Plugins();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginRepositoriesTypeImpl <em>Plugin Repositories Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginRepositoriesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getPluginRepositoriesType()
		 * @generated
		 */
		EClass PLUGIN_REPOSITORIES_TYPE = eINSTANCE.getPluginRepositoriesType();

		/**
		 * The meta object literal for the '<em><b>Plugin Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY = eINSTANCE.getPluginRepositoriesType_PluginRepository();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginRepositoriesType1Impl <em>Plugin Repositories Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginRepositoriesType1Impl
		 * @see maven.impl.MavenPackageImpl#getPluginRepositoriesType1()
		 * @generated
		 */
		EClass PLUGIN_REPOSITORIES_TYPE1 = eINSTANCE.getPluginRepositoriesType1();

		/**
		 * The meta object literal for the '<em><b>Plugin Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_REPOSITORIES_TYPE1__PLUGIN_REPOSITORY = eINSTANCE.getPluginRepositoriesType1_PluginRepository();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginsTypeImpl <em>Plugins Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getPluginsType()
		 * @generated
		 */
		EClass PLUGINS_TYPE = eINSTANCE.getPluginsType();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGINS_TYPE__PLUGIN = eINSTANCE.getPluginsType_Plugin();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginsType1Impl <em>Plugins Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginsType1Impl
		 * @see maven.impl.MavenPackageImpl#getPluginsType1()
		 * @generated
		 */
		EClass PLUGINS_TYPE1 = eINSTANCE.getPluginsType1();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGINS_TYPE1__PLUGIN = eINSTANCE.getPluginsType1_Plugin();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginsType2Impl <em>Plugins Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginsType2Impl
		 * @see maven.impl.MavenPackageImpl#getPluginsType2()
		 * @generated
		 */
		EClass PLUGINS_TYPE2 = eINSTANCE.getPluginsType2();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGINS_TYPE2__PLUGIN = eINSTANCE.getPluginsType2_Plugin();

		/**
		 * The meta object literal for the '{@link maven.impl.PluginsType3Impl <em>Plugins Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PluginsType3Impl
		 * @see maven.impl.MavenPackageImpl#getPluginsType3()
		 * @generated
		 */
		EClass PLUGINS_TYPE3 = eINSTANCE.getPluginsType3();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGINS_TYPE3__PLUGIN = eINSTANCE.getPluginsType3_Plugin();

		/**
		 * The meta object literal for the '{@link maven.impl.PrerequisitesImpl <em>Prerequisites</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PrerequisitesImpl
		 * @see maven.impl.MavenPackageImpl#getPrerequisites()
		 * @generated
		 */
		EClass PREREQUISITES = eINSTANCE.getPrerequisites();

		/**
		 * The meta object literal for the '<em><b>Maven</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITES__MAVEN = eINSTANCE.getPrerequisites_Maven();

		/**
		 * The meta object literal for the '{@link maven.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ProfileImpl
		 * @see maven.impl.MavenPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__ID = eINSTANCE.getProfile_Id();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__ACTIVATION = eINSTANCE.getProfile_Activation();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__BUILD = eINSTANCE.getProfile_Build();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__MODULES = eINSTANCE.getProfile_Modules();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__REPOSITORIES = eINSTANCE.getProfile_Repositories();

		/**
		 * The meta object literal for the '<em><b>Plugin Repositories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__PLUGIN_REPOSITORIES = eINSTANCE.getProfile_PluginRepositories();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__DEPENDENCIES = eINSTANCE.getProfile_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Reports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__REPORTS = eINSTANCE.getProfile_Reports();

		/**
		 * The meta object literal for the '<em><b>Reporting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__REPORTING = eINSTANCE.getProfile_Reporting();

		/**
		 * The meta object literal for the '<em><b>Dependency Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__DEPENDENCY_MANAGEMENT = eINSTANCE.getProfile_DependencyManagement();

		/**
		 * The meta object literal for the '<em><b>Distribution Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__DISTRIBUTION_MANAGEMENT = eINSTANCE.getProfile_DistributionManagement();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__PROPERTIES = eINSTANCE.getProfile_Properties();

		/**
		 * The meta object literal for the '{@link maven.impl.ProfilesTypeImpl <em>Profiles Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ProfilesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getProfilesType()
		 * @generated
		 */
		EClass PROFILES_TYPE = eINSTANCE.getProfilesType();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILES_TYPE__PROFILE = eINSTANCE.getProfilesType_Profile();

		/**
		 * The meta object literal for the '{@link maven.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PropertiesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE__ANY = eINSTANCE.getPropertiesType_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.PropertiesType1Impl <em>Properties Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PropertiesType1Impl
		 * @see maven.impl.MavenPackageImpl#getPropertiesType1()
		 * @generated
		 */
		EClass PROPERTIES_TYPE1 = eINSTANCE.getPropertiesType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE1__ANY = eINSTANCE.getPropertiesType1_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.PropertiesType2Impl <em>Properties Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PropertiesType2Impl
		 * @see maven.impl.MavenPackageImpl#getPropertiesType2()
		 * @generated
		 */
		EClass PROPERTIES_TYPE2 = eINSTANCE.getPropertiesType2();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE2__ANY = eINSTANCE.getPropertiesType2_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.PropertiesType3Impl <em>Properties Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.PropertiesType3Impl
		 * @see maven.impl.MavenPackageImpl#getPropertiesType3()
		 * @generated
		 */
		EClass PROPERTIES_TYPE3 = eINSTANCE.getPropertiesType3();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE3__ANY = eINSTANCE.getPropertiesType3_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.RelocationImpl <em>Relocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.RelocationImpl
		 * @see maven.impl.MavenPackageImpl#getRelocation()
		 * @generated
		 */
		EClass RELOCATION = eINSTANCE.getRelocation();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELOCATION__GROUP_ID = eINSTANCE.getRelocation_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELOCATION__ARTIFACT_ID = eINSTANCE.getRelocation_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELOCATION__VERSION = eINSTANCE.getRelocation_Version();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELOCATION__MESSAGE = eINSTANCE.getRelocation_Message();

		/**
		 * The meta object literal for the '{@link maven.impl.ReportingImpl <em>Reporting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ReportingImpl
		 * @see maven.impl.MavenPackageImpl#getReporting()
		 * @generated
		 */
		EClass REPORTING = eINSTANCE.getReporting();

		/**
		 * The meta object literal for the '<em><b>Exclude Defaults</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORTING__EXCLUDE_DEFAULTS = eINSTANCE.getReporting_ExcludeDefaults();

		/**
		 * The meta object literal for the '<em><b>Output Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORTING__OUTPUT_DIRECTORY = eINSTANCE.getReporting_OutputDirectory();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORTING__PLUGINS = eINSTANCE.getReporting_Plugins();

		/**
		 * The meta object literal for the '{@link maven.impl.ReportPluginImpl <em>Report Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ReportPluginImpl
		 * @see maven.impl.MavenPackageImpl#getReportPlugin()
		 * @generated
		 */
		EClass REPORT_PLUGIN = eINSTANCE.getReportPlugin();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_PLUGIN__GROUP_ID = eINSTANCE.getReportPlugin_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_PLUGIN__ARTIFACT_ID = eINSTANCE.getReportPlugin_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_PLUGIN__VERSION = eINSTANCE.getReportPlugin_Version();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_PLUGIN__INHERITED = eINSTANCE.getReportPlugin_Inherited();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_PLUGIN__CONFIGURATION = eINSTANCE.getReportPlugin_Configuration();

		/**
		 * The meta object literal for the '<em><b>Report Sets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_PLUGIN__REPORT_SETS = eINSTANCE.getReportPlugin_ReportSets();

		/**
		 * The meta object literal for the '{@link maven.impl.ReportSetImpl <em>Report Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ReportSetImpl
		 * @see maven.impl.MavenPackageImpl#getReportSet()
		 * @generated
		 */
		EClass REPORT_SET = eINSTANCE.getReportSet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_SET__ID = eINSTANCE.getReportSet_Id();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_SET__CONFIGURATION = eINSTANCE.getReportSet_Configuration();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_SET__INHERITED = eINSTANCE.getReportSet_Inherited();

		/**
		 * The meta object literal for the '<em><b>Reports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_SET__REPORTS = eINSTANCE.getReportSet_Reports();

		/**
		 * The meta object literal for the '{@link maven.impl.ReportSetsTypeImpl <em>Report Sets Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ReportSetsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getReportSetsType()
		 * @generated
		 */
		EClass REPORT_SETS_TYPE = eINSTANCE.getReportSetsType();

		/**
		 * The meta object literal for the '<em><b>Report Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_SETS_TYPE__REPORT_SET = eINSTANCE.getReportSetsType_ReportSet();

		/**
		 * The meta object literal for the '{@link maven.impl.ReportsTypeImpl <em>Reports Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ReportsTypeImpl
		 * @see maven.impl.MavenPackageImpl#getReportsType()
		 * @generated
		 */
		EClass REPORTS_TYPE = eINSTANCE.getReportsType();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORTS_TYPE__REPORT = eINSTANCE.getReportsType_Report();

		/**
		 * The meta object literal for the '{@link maven.impl.ReportsType1Impl <em>Reports Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ReportsType1Impl
		 * @see maven.impl.MavenPackageImpl#getReportsType1()
		 * @generated
		 */
		EClass REPORTS_TYPE1 = eINSTANCE.getReportsType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORTS_TYPE1__ANY = eINSTANCE.getReportsType1_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.ReportsType2Impl <em>Reports Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ReportsType2Impl
		 * @see maven.impl.MavenPackageImpl#getReportsType2()
		 * @generated
		 */
		EClass REPORTS_TYPE2 = eINSTANCE.getReportsType2();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORTS_TYPE2__ANY = eINSTANCE.getReportsType2_Any();

		/**
		 * The meta object literal for the '{@link maven.impl.RepositoriesTypeImpl <em>Repositories Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.RepositoriesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getRepositoriesType()
		 * @generated
		 */
		EClass REPOSITORIES_TYPE = eINSTANCE.getRepositoriesType();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIES_TYPE__REPOSITORY = eINSTANCE.getRepositoriesType_Repository();

		/**
		 * The meta object literal for the '{@link maven.impl.RepositoriesType1Impl <em>Repositories Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.RepositoriesType1Impl
		 * @see maven.impl.MavenPackageImpl#getRepositoriesType1()
		 * @generated
		 */
		EClass REPOSITORIES_TYPE1 = eINSTANCE.getRepositoriesType1();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIES_TYPE1__REPOSITORY = eINSTANCE.getRepositoriesType1_Repository();

		/**
		 * The meta object literal for the '{@link maven.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.RepositoryImpl
		 * @see maven.impl.MavenPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__RELEASES = eINSTANCE.getRepository_Releases();

		/**
		 * The meta object literal for the '<em><b>Snapshots</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SNAPSHOTS = eINSTANCE.getRepository_Snapshots();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ID = eINSTANCE.getRepository_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__URL = eINSTANCE.getRepository_Url();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__LAYOUT = eINSTANCE.getRepository_Layout();

		/**
		 * The meta object literal for the '{@link maven.impl.RepositoryPolicyImpl <em>Repository Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.RepositoryPolicyImpl
		 * @see maven.impl.MavenPackageImpl#getRepositoryPolicy()
		 * @generated
		 */
		EClass REPOSITORY_POLICY = eINSTANCE.getRepositoryPolicy();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_POLICY__ENABLED = eINSTANCE.getRepositoryPolicy_Enabled();

		/**
		 * The meta object literal for the '<em><b>Update Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_POLICY__UPDATE_POLICY = eINSTANCE.getRepositoryPolicy_UpdatePolicy();

		/**
		 * The meta object literal for the '<em><b>Checksum Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_POLICY__CHECKSUM_POLICY = eINSTANCE.getRepositoryPolicy_ChecksumPolicy();

		/**
		 * The meta object literal for the '{@link maven.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ResourceImpl
		 * @see maven.impl.MavenPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Target Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TARGET_PATH = eINSTANCE.getResource_TargetPath();

		/**
		 * The meta object literal for the '<em><b>Filtering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__FILTERING = eINSTANCE.getResource_Filtering();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DIRECTORY = eINSTANCE.getResource_Directory();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__INCLUDES = eINSTANCE.getResource_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__EXCLUDES = eINSTANCE.getResource_Excludes();

		/**
		 * The meta object literal for the '{@link maven.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ResourcesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getResourcesType()
		 * @generated
		 */
		EClass RESOURCES_TYPE = eINSTANCE.getResourcesType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES_TYPE__RESOURCE = eINSTANCE.getResourcesType_Resource();

		/**
		 * The meta object literal for the '{@link maven.impl.ResourcesType1Impl <em>Resources Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ResourcesType1Impl
		 * @see maven.impl.MavenPackageImpl#getResourcesType1()
		 * @generated
		 */
		EClass RESOURCES_TYPE1 = eINSTANCE.getResourcesType1();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES_TYPE1__RESOURCE = eINSTANCE.getResourcesType1_Resource();

		/**
		 * The meta object literal for the '{@link maven.impl.RolesTypeImpl <em>Roles Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.RolesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getRolesType()
		 * @generated
		 */
		EClass ROLES_TYPE = eINSTANCE.getRolesType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLES_TYPE__ROLE = eINSTANCE.getRolesType_Role();

		/**
		 * The meta object literal for the '{@link maven.impl.RolesType1Impl <em>Roles Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.RolesType1Impl
		 * @see maven.impl.MavenPackageImpl#getRolesType1()
		 * @generated
		 */
		EClass ROLES_TYPE1 = eINSTANCE.getRolesType1();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLES_TYPE1__ROLE = eINSTANCE.getRolesType1_Role();

		/**
		 * The meta object literal for the '{@link maven.impl.ScmImpl <em>Scm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.ScmImpl
		 * @see maven.impl.MavenPackageImpl#getScm()
		 * @generated
		 */
		EClass SCM = eINSTANCE.getScm();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCM__CONNECTION = eINSTANCE.getScm_Connection();

		/**
		 * The meta object literal for the '<em><b>Developer Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCM__DEVELOPER_CONNECTION = eINSTANCE.getScm_DeveloperConnection();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCM__TAG = eINSTANCE.getScm_Tag();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCM__URL = eINSTANCE.getScm_Url();

		/**
		 * The meta object literal for the '{@link maven.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.SiteImpl
		 * @see maven.impl.MavenPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__ID = eINSTANCE.getSite_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__NAME = eINSTANCE.getSite_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__URL = eINSTANCE.getSite_Url();

		/**
		 * The meta object literal for the '{@link maven.impl.TestResourcesTypeImpl <em>Test Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.TestResourcesTypeImpl
		 * @see maven.impl.MavenPackageImpl#getTestResourcesType()
		 * @generated
		 */
		EClass TEST_RESOURCES_TYPE = eINSTANCE.getTestResourcesType();

		/**
		 * The meta object literal for the '<em><b>Test Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RESOURCES_TYPE__TEST_RESOURCE = eINSTANCE.getTestResourcesType_TestResource();

		/**
		 * The meta object literal for the '{@link maven.impl.TestResourcesType1Impl <em>Test Resources Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maven.impl.TestResourcesType1Impl
		 * @see maven.impl.MavenPackageImpl#getTestResourcesType1()
		 * @generated
		 */
		EClass TEST_RESOURCES_TYPE1 = eINSTANCE.getTestResourcesType1();

		/**
		 * The meta object literal for the '<em><b>Test Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RESOURCES_TYPE1__TEST_RESOURCE = eINSTANCE.getTestResourcesType1_TestResource();

	}

} //MavenPackage
