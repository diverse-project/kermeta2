/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.util;

import org.apache.maven.pom._4._0.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.apache.maven.pom._4._0._0Package
 * @generated
 */
public class _0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _0Switch<Adapter> modelSwitch =
		new _0Switch<Adapter>() {
			@Override
			public Adapter caseActivation(Activation object) {
				return createActivationAdapter();
			}
			@Override
			public Adapter caseActivationFile(ActivationFile object) {
				return createActivationFileAdapter();
			}
			@Override
			public Adapter caseActivationOS(ActivationOS object) {
				return createActivationOSAdapter();
			}
			@Override
			public Adapter caseActivationProperty(ActivationProperty object) {
				return createActivationPropertyAdapter();
			}
			@Override
			public Adapter caseBuild(Build object) {
				return createBuildAdapter();
			}
			@Override
			public Adapter caseBuildBase(BuildBase object) {
				return createBuildBaseAdapter();
			}
			@Override
			public Adapter caseCiManagement(CiManagement object) {
				return createCiManagementAdapter();
			}
			@Override
			public Adapter caseConfigurationType(ConfigurationType object) {
				return createConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationType1(ConfigurationType1 object) {
				return createConfigurationType1Adapter();
			}
			@Override
			public Adapter caseConfigurationType2(ConfigurationType2 object) {
				return createConfigurationType2Adapter();
			}
			@Override
			public Adapter caseConfigurationType3(ConfigurationType3 object) {
				return createConfigurationType3Adapter();
			}
			@Override
			public Adapter caseConfigurationType4(ConfigurationType4 object) {
				return createConfigurationType4Adapter();
			}
			@Override
			public Adapter caseContributor(Contributor object) {
				return createContributorAdapter();
			}
			@Override
			public Adapter caseContributorsType(ContributorsType object) {
				return createContributorsTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesType(DependenciesType object) {
				return createDependenciesTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesType1(DependenciesType1 object) {
				return createDependenciesType1Adapter();
			}
			@Override
			public Adapter caseDependenciesType2(DependenciesType2 object) {
				return createDependenciesType2Adapter();
			}
			@Override
			public Adapter caseDependenciesType3(DependenciesType3 object) {
				return createDependenciesType3Adapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseDependencyManagement(DependencyManagement object) {
				return createDependencyManagementAdapter();
			}
			@Override
			public Adapter caseDeploymentRepository(DeploymentRepository object) {
				return createDeploymentRepositoryAdapter();
			}
			@Override
			public Adapter caseDeveloper(Developer object) {
				return createDeveloperAdapter();
			}
			@Override
			public Adapter caseDevelopersType(DevelopersType object) {
				return createDevelopersTypeAdapter();
			}
			@Override
			public Adapter caseDistributionManagement(DistributionManagement object) {
				return createDistributionManagementAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExcludesType(ExcludesType object) {
				return createExcludesTypeAdapter();
			}
			@Override
			public Adapter caseExclusion(Exclusion object) {
				return createExclusionAdapter();
			}
			@Override
			public Adapter caseExclusionsType(ExclusionsType object) {
				return createExclusionsTypeAdapter();
			}
			@Override
			public Adapter caseExecutionsType(ExecutionsType object) {
				return createExecutionsTypeAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseExtensionsType(ExtensionsType object) {
				return createExtensionsTypeAdapter();
			}
			@Override
			public Adapter caseFiltersType(FiltersType object) {
				return createFiltersTypeAdapter();
			}
			@Override
			public Adapter caseFiltersType1(FiltersType1 object) {
				return createFiltersType1Adapter();
			}
			@Override
			public Adapter caseGoalsType(GoalsType object) {
				return createGoalsTypeAdapter();
			}
			@Override
			public Adapter caseGoalsType1(GoalsType1 object) {
				return createGoalsType1Adapter();
			}
			@Override
			public Adapter caseIncludesType(IncludesType object) {
				return createIncludesTypeAdapter();
			}
			@Override
			public Adapter caseIssueManagement(IssueManagement object) {
				return createIssueManagementAdapter();
			}
			@Override
			public Adapter caseLicense(License object) {
				return createLicenseAdapter();
			}
			@Override
			public Adapter caseLicensesType(LicensesType object) {
				return createLicensesTypeAdapter();
			}
			@Override
			public Adapter caseMailingList(MailingList object) {
				return createMailingListAdapter();
			}
			@Override
			public Adapter caseMailingListsType(MailingListsType object) {
				return createMailingListsTypeAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModulesType(ModulesType object) {
				return createModulesTypeAdapter();
			}
			@Override
			public Adapter caseModulesType1(ModulesType1 object) {
				return createModulesType1Adapter();
			}
			@Override
			public Adapter caseNotifier(org.apache.maven.pom._4._0.Notifier object) {
				return createNotifierAdapter();
			}
			@Override
			public Adapter caseNotifiersType(NotifiersType object) {
				return createNotifiersTypeAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseOtherArchivesType(OtherArchivesType object) {
				return createOtherArchivesTypeAdapter();
			}
			@Override
			public Adapter caseParent(Parent object) {
				return createParentAdapter();
			}
			@Override
			public Adapter casePlugin(Plugin object) {
				return createPluginAdapter();
			}
			@Override
			public Adapter casePluginExecution(PluginExecution object) {
				return createPluginExecutionAdapter();
			}
			@Override
			public Adapter casePluginManagement(PluginManagement object) {
				return createPluginManagementAdapter();
			}
			@Override
			public Adapter casePluginRepositoriesType(PluginRepositoriesType object) {
				return createPluginRepositoriesTypeAdapter();
			}
			@Override
			public Adapter casePluginRepositoriesType1(PluginRepositoriesType1 object) {
				return createPluginRepositoriesType1Adapter();
			}
			@Override
			public Adapter casePluginsType(PluginsType object) {
				return createPluginsTypeAdapter();
			}
			@Override
			public Adapter casePluginsType1(PluginsType1 object) {
				return createPluginsType1Adapter();
			}
			@Override
			public Adapter casePluginsType2(PluginsType2 object) {
				return createPluginsType2Adapter();
			}
			@Override
			public Adapter casePluginsType3(PluginsType3 object) {
				return createPluginsType3Adapter();
			}
			@Override
			public Adapter casePrerequisites(Prerequisites object) {
				return createPrerequisitesAdapter();
			}
			@Override
			public Adapter caseProfile(Profile object) {
				return createProfileAdapter();
			}
			@Override
			public Adapter caseProfilesType(ProfilesType object) {
				return createProfilesTypeAdapter();
			}
			@Override
			public Adapter casePropertiesType(PropertiesType object) {
				return createPropertiesTypeAdapter();
			}
			@Override
			public Adapter casePropertiesType1(PropertiesType1 object) {
				return createPropertiesType1Adapter();
			}
			@Override
			public Adapter casePropertiesType2(PropertiesType2 object) {
				return createPropertiesType2Adapter();
			}
			@Override
			public Adapter casePropertiesType3(PropertiesType3 object) {
				return createPropertiesType3Adapter();
			}
			@Override
			public Adapter caseRelocation(Relocation object) {
				return createRelocationAdapter();
			}
			@Override
			public Adapter caseReporting(Reporting object) {
				return createReportingAdapter();
			}
			@Override
			public Adapter caseReportPlugin(ReportPlugin object) {
				return createReportPluginAdapter();
			}
			@Override
			public Adapter caseReportSet(ReportSet object) {
				return createReportSetAdapter();
			}
			@Override
			public Adapter caseReportSetsType(ReportSetsType object) {
				return createReportSetsTypeAdapter();
			}
			@Override
			public Adapter caseReportsType(ReportsType object) {
				return createReportsTypeAdapter();
			}
			@Override
			public Adapter caseReportsType1(ReportsType1 object) {
				return createReportsType1Adapter();
			}
			@Override
			public Adapter caseReportsType2(ReportsType2 object) {
				return createReportsType2Adapter();
			}
			@Override
			public Adapter caseRepositoriesType(RepositoriesType object) {
				return createRepositoriesTypeAdapter();
			}
			@Override
			public Adapter caseRepositoriesType1(RepositoriesType1 object) {
				return createRepositoriesType1Adapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseRepositoryPolicy(RepositoryPolicy object) {
				return createRepositoryPolicyAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourcesType(ResourcesType object) {
				return createResourcesTypeAdapter();
			}
			@Override
			public Adapter caseResourcesType1(ResourcesType1 object) {
				return createResourcesType1Adapter();
			}
			@Override
			public Adapter caseRolesType(RolesType object) {
				return createRolesTypeAdapter();
			}
			@Override
			public Adapter caseRolesType1(RolesType1 object) {
				return createRolesType1Adapter();
			}
			@Override
			public Adapter caseScm(Scm object) {
				return createScmAdapter();
			}
			@Override
			public Adapter caseSite(Site object) {
				return createSiteAdapter();
			}
			@Override
			public Adapter caseTestResourcesType(TestResourcesType object) {
				return createTestResourcesTypeAdapter();
			}
			@Override
			public Adapter caseTestResourcesType1(TestResourcesType1 object) {
				return createTestResourcesType1Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Activation
	 * @generated
	 */
	public Adapter createActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ActivationFile <em>Activation File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ActivationFile
	 * @generated
	 */
	public Adapter createActivationFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ActivationOS <em>Activation OS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ActivationOS
	 * @generated
	 */
	public Adapter createActivationOSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ActivationProperty <em>Activation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ActivationProperty
	 * @generated
	 */
	public Adapter createActivationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Build <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Build
	 * @generated
	 */
	public Adapter createBuildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.BuildBase <em>Build Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.BuildBase
	 * @generated
	 */
	public Adapter createBuildBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.CiManagement <em>Ci Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.CiManagement
	 * @generated
	 */
	public Adapter createCiManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ConfigurationType
	 * @generated
	 */
	public Adapter createConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ConfigurationType1 <em>Configuration Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ConfigurationType1
	 * @generated
	 */
	public Adapter createConfigurationType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ConfigurationType2 <em>Configuration Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ConfigurationType2
	 * @generated
	 */
	public Adapter createConfigurationType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ConfigurationType3 <em>Configuration Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ConfigurationType3
	 * @generated
	 */
	public Adapter createConfigurationType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ConfigurationType4 <em>Configuration Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ConfigurationType4
	 * @generated
	 */
	public Adapter createConfigurationType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Contributor
	 * @generated
	 */
	public Adapter createContributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ContributorsType <em>Contributors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ContributorsType
	 * @generated
	 */
	public Adapter createContributorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DependenciesType
	 * @generated
	 */
	public Adapter createDependenciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DependenciesType1 <em>Dependencies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DependenciesType1
	 * @generated
	 */
	public Adapter createDependenciesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DependenciesType2 <em>Dependencies Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DependenciesType2
	 * @generated
	 */
	public Adapter createDependenciesType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DependenciesType3 <em>Dependencies Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DependenciesType3
	 * @generated
	 */
	public Adapter createDependenciesType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DependencyManagement <em>Dependency Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DependencyManagement
	 * @generated
	 */
	public Adapter createDependencyManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DeploymentRepository <em>Deployment Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DeploymentRepository
	 * @generated
	 */
	public Adapter createDeploymentRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Developer
	 * @generated
	 */
	public Adapter createDeveloperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DevelopersType <em>Developers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DevelopersType
	 * @generated
	 */
	public Adapter createDevelopersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DistributionManagement <em>Distribution Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DistributionManagement
	 * @generated
	 */
	public Adapter createDistributionManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ExcludesType <em>Excludes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ExcludesType
	 * @generated
	 */
	public Adapter createExcludesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Exclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Exclusion
	 * @generated
	 */
	public Adapter createExclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ExclusionsType <em>Exclusions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ExclusionsType
	 * @generated
	 */
	public Adapter createExclusionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ExecutionsType <em>Executions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ExecutionsType
	 * @generated
	 */
	public Adapter createExecutionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ExtensionsType
	 * @generated
	 */
	public Adapter createExtensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.FiltersType <em>Filters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.FiltersType
	 * @generated
	 */
	public Adapter createFiltersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.FiltersType1 <em>Filters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.FiltersType1
	 * @generated
	 */
	public Adapter createFiltersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.GoalsType <em>Goals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.GoalsType
	 * @generated
	 */
	public Adapter createGoalsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.GoalsType1 <em>Goals Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.GoalsType1
	 * @generated
	 */
	public Adapter createGoalsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.IncludesType <em>Includes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.IncludesType
	 * @generated
	 */
	public Adapter createIncludesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.IssueManagement <em>Issue Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.IssueManagement
	 * @generated
	 */
	public Adapter createIssueManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.License
	 * @generated
	 */
	public Adapter createLicenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.LicensesType <em>Licenses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.LicensesType
	 * @generated
	 */
	public Adapter createLicensesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.MailingList <em>Mailing List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.MailingList
	 * @generated
	 */
	public Adapter createMailingListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.MailingListsType <em>Mailing Lists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.MailingListsType
	 * @generated
	 */
	public Adapter createMailingListsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ModulesType <em>Modules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ModulesType
	 * @generated
	 */
	public Adapter createModulesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ModulesType1 <em>Modules Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ModulesType1
	 * @generated
	 */
	public Adapter createModulesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Notifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Notifier
	 * @generated
	 */
	public Adapter createNotifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.NotifiersType <em>Notifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.NotifiersType
	 * @generated
	 */
	public Adapter createNotifiersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.OtherArchivesType <em>Other Archives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.OtherArchivesType
	 * @generated
	 */
	public Adapter createOtherArchivesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Parent
	 * @generated
	 */
	public Adapter createParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PluginExecution <em>Plugin Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PluginExecution
	 * @generated
	 */
	public Adapter createPluginExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PluginManagement <em>Plugin Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PluginManagement
	 * @generated
	 */
	public Adapter createPluginManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PluginRepositoriesType <em>Plugin Repositories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PluginRepositoriesType
	 * @generated
	 */
	public Adapter createPluginRepositoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PluginRepositoriesType1 <em>Plugin Repositories Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PluginRepositoriesType1
	 * @generated
	 */
	public Adapter createPluginRepositoriesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PluginsType <em>Plugins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PluginsType
	 * @generated
	 */
	public Adapter createPluginsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PluginsType1 <em>Plugins Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PluginsType1
	 * @generated
	 */
	public Adapter createPluginsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PluginsType2 <em>Plugins Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PluginsType2
	 * @generated
	 */
	public Adapter createPluginsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PluginsType3 <em>Plugins Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PluginsType3
	 * @generated
	 */
	public Adapter createPluginsType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Prerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Prerequisites
	 * @generated
	 */
	public Adapter createPrerequisitesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ProfilesType <em>Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ProfilesType
	 * @generated
	 */
	public Adapter createProfilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PropertiesType
	 * @generated
	 */
	public Adapter createPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PropertiesType1 <em>Properties Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PropertiesType1
	 * @generated
	 */
	public Adapter createPropertiesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PropertiesType2 <em>Properties Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PropertiesType2
	 * @generated
	 */
	public Adapter createPropertiesType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.PropertiesType3 <em>Properties Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.PropertiesType3
	 * @generated
	 */
	public Adapter createPropertiesType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Relocation <em>Relocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Relocation
	 * @generated
	 */
	public Adapter createRelocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Reporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Reporting
	 * @generated
	 */
	public Adapter createReportingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ReportPlugin <em>Report Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ReportPlugin
	 * @generated
	 */
	public Adapter createReportPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ReportSet <em>Report Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ReportSet
	 * @generated
	 */
	public Adapter createReportSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ReportSetsType <em>Report Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ReportSetsType
	 * @generated
	 */
	public Adapter createReportSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ReportsType <em>Reports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ReportsType
	 * @generated
	 */
	public Adapter createReportsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ReportsType1 <em>Reports Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ReportsType1
	 * @generated
	 */
	public Adapter createReportsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ReportsType2 <em>Reports Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ReportsType2
	 * @generated
	 */
	public Adapter createReportsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.RepositoriesType <em>Repositories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.RepositoriesType
	 * @generated
	 */
	public Adapter createRepositoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.RepositoriesType1 <em>Repositories Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.RepositoriesType1
	 * @generated
	 */
	public Adapter createRepositoriesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.RepositoryPolicy <em>Repository Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.RepositoryPolicy
	 * @generated
	 */
	public Adapter createRepositoryPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ResourcesType <em>Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ResourcesType
	 * @generated
	 */
	public Adapter createResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.ResourcesType1 <em>Resources Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.ResourcesType1
	 * @generated
	 */
	public Adapter createResourcesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.RolesType <em>Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.RolesType
	 * @generated
	 */
	public Adapter createRolesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.RolesType1 <em>Roles Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.RolesType1
	 * @generated
	 */
	public Adapter createRolesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Scm <em>Scm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Scm
	 * @generated
	 */
	public Adapter createScmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.Site
	 * @generated
	 */
	public Adapter createSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.TestResourcesType <em>Test Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.TestResourcesType
	 * @generated
	 */
	public Adapter createTestResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.apache.maven.pom._4._0.TestResourcesType1 <em>Test Resources Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.apache.maven.pom._4._0.TestResourcesType1
	 * @generated
	 */
	public Adapter createTestResourcesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_0AdapterFactory
