/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.persistence.impl;

import kermeta.persistence.DanglingDiagnostic;
import kermeta.persistence.PersistencePackage;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

import kermeta.standard.Set;

import kermeta.standard.impl.SetImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceImpl extends
		SetImpl<kermeta.language.structure.Object> implements Resource {
	/**
	 * The default value of the '{@link #getMetaModelURI() <em>Meta Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaModelURI() <em>Meta Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelURI()
	 * @generated
	 * @ordered
	 */
	protected String metaModelURI = META_MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_READ_ONLY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		if (eContainerFeatureID() != PersistencePackage.RESOURCE__REPOSITORY)
			return null;
		return (Repository) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		if (eContainerFeatureID() != PersistencePackage.RESOURCE__REPOSITORY)
			return null;
		return (Repository) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRepository,
				PersistencePackage.RESOURCE__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != eInternalContainer()
				|| (eContainerFeatureID() != PersistencePackage.RESOURCE__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this,
						PersistencePackage.REPOSITORY__RESOURCES,
						Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.RESOURCE__REPOSITORY, newRepository,
					newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModelURI() {
		return metaModelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelURI(String newMetaModelURI) {
		String oldMetaModelURI = metaModelURI;
		metaModelURI = newMetaModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.RESOURCE__META_MODEL_URI,
					oldMetaModelURI, metaModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		Boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.RESOURCE__IS_READ_ONLY, oldIsReadOnly,
					isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.RESOURCE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save() {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveWithNewURI(String new_uri) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<DanglingDiagnostic> findDanglingModelElements() {

		kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic> result = null;

		result = ((kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft9 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Object> convertAsSet(
							this.getterContents()).iterator();
			java.lang.Boolean idLoopCond_23 = false;
			while (!idLoopCond_23) {
				idLoopCond_23 = it_ft9.isOff();
				if (idLoopCond_23) {
				} else {

					//BIle:func
					kermeta.language.structure.Object containedObj_lbdExp9 = it_ft9
							.next();

					kermeta.language.structure.ClassDefinition classDef = null;

					classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getMetaClassSwitcher(
													containedObj_lbdExp9)
											.getTypeDefinition(),
									"kermeta.language.structure.ClassDefinition");

					java.lang.Boolean idIfCond_24 = false;
					idIfCond_24 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(classDef));

					if (idIfCond_24) {

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft10 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											classDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_25 = false;
							while (!idLoopCond_25) {
								idLoopCond_25 = it_ft10.isOff();
								if (idLoopCond_25) {
								} else {

									//BIle:func
									kermeta.language.structure.Property prop_lbdExp10 = it_ft10
											.next();

									java.lang.Boolean idIfCond_26 = false;
									idIfCond_26 = kermeta.standard.helper.BooleanWrapper
											.not(prop_lbdExp10.getIsDerived());

									if (idIfCond_26) {

										java.lang.Boolean idIfCond_27 = false;
										idIfCond_27 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		prop_lbdExp10
																				.getUpper(),
																		1),
														kermeta.standard.helper.IntegerWrapper
																.equals(
																		prop_lbdExp10
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)));

										if (idIfCond_27) {

											kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

											referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeOrVoid(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getSwitcher(
																			containedObj_lbdExp9,
																			prop_lbdExp10),
															"kermeta.standard.Collection<kermeta.language.structure.Object>");

											java.lang.Boolean idIfCond_28 = false;
											idIfCond_28 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObjs));

											if (idIfCond_28) {

												//BIft:each

												{

													kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft11 = referencedObjs
															.iterator();
													java.lang.Boolean idLoopCond_29 = false;
													while (!idLoopCond_29) {
														idLoopCond_29 = it_ft11
																.isOff();
														if (idLoopCond_29) {
														} else {

															//BIle:func
															kermeta.language.structure.Object referencedObj_lbdExp11 = it_ft11
																	.next();

															//BIft:exists

															java.lang.Boolean result_ft12 = null;

															java.lang.Boolean test_ft12 = false;

															{

																kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<kermeta.persistence.Resource> convertAsSet(
																				this
																						.getRepository()
																						.getResources())
																		.iterator();
																java.lang.Boolean idLoopCond_31 = false;
																while (!idLoopCond_31) {
																	idLoopCond_31 = kermeta.standard.helper.BooleanWrapper
																			.or(
																					it_ft12
																							.isOff(),
																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.isNotEqualSwitcher(
																									test_ft12,
																									false));
																	if (idLoopCond_31) {
																	} else {

																		java.lang.Boolean result_lambda_ft12 = null;
																		//BIle:func
																		kermeta.persistence.Resource res2_lbdExp12 = it_ft12
																				.next();

																		result_lambda_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																				.<kermeta.language.structure.Object> convertAsSet(
																						res2_lbdExp12
																								.getterContents())
																				.contains(
																						referencedObj_lbdExp11);
																		//EIle:func

																		test_ft12 = kermeta.standard.helper.BooleanWrapper
																				.or(
																						test_ft12,
																						result_lambda_ft12);
																	}
																}
															}

															result_ft12 = test_ft12;
															//EIft:exists
															java.lang.Boolean idIfCond_30 = false;
															idIfCond_30 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(result_ft12),
																			kermeta.standard.helper.BooleanWrapper
																					.not(kermeta.standard.helper.BooleanWrapper
																							.or(
																									kermeta.standard.helper.BooleanWrapper
																											.or(
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp11,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.String")),
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp11,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.Integer"))),
																									org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.isKindOfSwitcher(
																													referencedObj_lbdExp11,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"java.lang.Boolean")))));

															if (idIfCond_30) {

																kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
																				.getDanglingDiagnostic()));

																diagnostic
																		.setDanglingElement(referencedObj_lbdExp11);

																diagnostic
																		.setReferencingElement(containedObj_lbdExp9);

																diagnostic
																		.setReferencingProperty(prop_lbdExp10);

																result
																		.add(diagnostic);
															}

															//EIle:func

														}
													}
												}

												//EIft:each

											}

										} else {

											kermeta.language.structure.Object referencedObj = null;

											referencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(
															containedObj_lbdExp9,
															prop_lbdExp10);

											java.lang.Boolean idIfCond_32 = false;
											idIfCond_32 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObj));

											if (idIfCond_32) {

												//BIft:exists

												java.lang.Boolean result_ft13 = null;

												java.lang.Boolean test_ft13 = false;

												{

													kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
															.<kermeta.persistence.Resource> convertAsSet(
																	this
																			.getRepository()
																			.getResources())
															.iterator();
													java.lang.Boolean idLoopCond_34 = false;
													while (!idLoopCond_34) {
														idLoopCond_34 = kermeta.standard.helper.BooleanWrapper
																.or(
																		it_ft13
																				.isOff(),
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.isNotEqualSwitcher(
																						test_ft13,
																						false));
														if (idLoopCond_34) {
														} else {

															java.lang.Boolean result_lambda_ft13 = null;
															//BIle:func
															kermeta.persistence.Resource res2_lbdExp13 = it_ft13
																	.next();

															result_lambda_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																	.<kermeta.language.structure.Object> convertAsSet(
																			res2_lbdExp13
																					.getterContents())
																	.contains(
																			referencedObj);
															//EIle:func

															test_ft13 = kermeta.standard.helper.BooleanWrapper
																	.or(
																			test_ft13,
																			result_lambda_ft13);
														}
													}
												}

												result_ft13 = test_ft13;
												//EIft:exists
												java.lang.Boolean idIfCond_33 = false;
												idIfCond_33 = kermeta.standard.helper.BooleanWrapper
														.and(
																kermeta.standard.helper.BooleanWrapper
																		.not(result_ft13),
																kermeta.standard.helper.BooleanWrapper
																		.not(kermeta.standard.helper.BooleanWrapper
																				.or(
																						kermeta.standard.helper.BooleanWrapper
																								.or(
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.isKindOfSwitcher(
																														referencedObj,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"java.lang.String")),
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.isKindOfSwitcher(
																														referencedObj,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"java.lang.Integer"))),
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.isKindOfSwitcher(
																										referencedObj,
																										org.kermeta.compil.runtime.ExecutionContext
																												.getInstance()
																												.getMetaClass(
																														"java.lang.Boolean")))));

												if (idIfCond_33) {

													kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
																	.getDanglingDiagnostic()));

													diagnostic
															.setDanglingElement(referencedObj);

													diagnostic
															.setReferencingElement(containedObj_lbdExp9);

													diagnostic
															.setReferencingProperty(prop_lbdExp10);

													result.add(diagnostic);
												}

											}

										}

									}

									//EIle:func

								}
							}
						}

						//EIft:each

					}

					//EIle:func

				}
			}
		}

		//EIft:each

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void load() {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource instances() {

		kermeta.persistence.Resource result = null;

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizedUri() {

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil
								.normalizeUri(uri), "java.lang.String");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getterDependentResources() {

		kermeta.standard.Set<kermeta.persistence.Resource> result = null;

		result = (kermeta.standard.Set<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.ResourceUtil
								.getDependentResources(this, uri, metaModelURI,
										"EMF"),
						"kermeta.standard.Set<kermeta.persistence.Resource>");

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Object> getterContents() {

		kermeta.standard.Set<kermeta.language.structure.Object> result = null;

		kermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		res.addAll(this);

		kermeta.standard.Set<kermeta.language.structure.Object> coll = null;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft8 = this
					.iterator();
			java.lang.Boolean idLoopCond_22 = false;
			while (!idLoopCond_22) {
				idLoopCond_22 = it_ft8.isOff();
				if (idLoopCond_22) {
				} else {

					//BIle:func
					kermeta.language.structure.Object e_lbdExp8 = it_ft8.next();

					coll = (kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getAllContainedObjects(e_lbdExp8),
									"kermeta.standard.Set<kermeta.language.structure.Object>");

					res.addAll(coll);
					//EIle:func

				}
			}
		}

		//EIft:each

		result = res;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRepository((Repository) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			return basicSetRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			return eInternalContainer().eInverseRemove(this,
					PersistencePackage.REPOSITORY__RESOURCES, Repository.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			if (resolve)
				return getRepository();
			return basicGetRepository();
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			return getMetaModelURI();
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			return getIsReadOnly();
		case PersistencePackage.RESOURCE__URI:
			return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			setRepository((Repository) newValue);
			return;
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			setMetaModelURI((String) newValue);
			return;
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			setIsReadOnly((Boolean) newValue);
			return;
		case PersistencePackage.RESOURCE__URI:
			setUri((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			setRepository((Repository) null);
			return;
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			setMetaModelURI(META_MODEL_URI_EDEFAULT);
			return;
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			setIsReadOnly(IS_READ_ONLY_EDEFAULT);
			return;
		case PersistencePackage.RESOURCE__URI:
			setUri(URI_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			return basicGetRepository() != null;
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			return META_MODEL_URI_EDEFAULT == null ? metaModelURI != null
					: !META_MODEL_URI_EDEFAULT.equals(metaModelURI);
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null
					: !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
		case PersistencePackage.RESOURCE__URI:
			return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT
					.equals(uri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metaModelURI: ");
		result.append(metaModelURI);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
