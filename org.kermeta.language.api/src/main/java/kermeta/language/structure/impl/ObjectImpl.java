/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.exceptions.ConstraintsDiagnostic;

import kermeta.language.structure.Constraint;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Tag;
import kermeta.language.structure.Type;

import kermeta.persistence.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOid <em>Oid</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getInternalContainingResource <em>Internal Containing Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements
		kermeta.language.structure.Object {
	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

	/**
	 * The cached value of the '{@link #getOwnedTags() <em>Owned Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> ownedTags;

	/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected Integer oid = OID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalContainingResource() <em>Internal Containing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalContainingResource()
	 * @generated
	 * @ordered
	 */
	protected Resource internalContainingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTag() {
		if (tag == null) {
			tag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(
					Tag.class, this, StructurePackage.OBJECT__TAG,
					StructurePackage.TAG__OBJECT);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getOwnedTags() {
		if (ownedTags == null) {
			ownedTags = new EObjectContainmentEList.Resolving<Tag>(Tag.class,
					this, StructurePackage.OBJECT__OWNED_TAGS);
		}
		return ownedTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOid() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOid(Integer newOid) {
		Integer oldOid = oid;
		oid = newOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__OID, oldOid, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getInternalContainingResource() {
		if (internalContainingResource != null
				&& internalContainingResource.eIsProxy()) {
			InternalEObject oldInternalContainingResource = (InternalEObject) internalContainingResource;
			internalContainingResource = (Resource) eResolveProxy(oldInternalContainingResource);
			if (internalContainingResource != oldInternalContainingResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE,
							oldInternalContainingResource,
							internalContainingResource));
			}
		}
		return internalContainingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetInternalContainingResource() {
		return internalContainingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalContainingResource(
			Resource newInternalContainingResource) {
		Resource oldInternalContainingResource = internalContainingResource;
		internalContainingResource = newInternalContainingResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE,
					oldInternalContainingResource, internalContainingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInvariant(Constraint invariant) {

		java.lang.Integer minusOne = kermeta.standard.helper.IntegerWrapper
				.uminus(1);

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(this).getterClassDefinition();

		java.lang.Boolean idIfCond_301 = false;
		idIfCond_301 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						invariant,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PropertyConstraint"));

		if (idIfCond_301) {

			kermeta.language.structure.Property prop = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							invariant,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.PropertyConstraint")))
					.getProperty();

			kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getSwitcher(this, prop);

			java.lang.Boolean idIfCond_302 = false;
			idIfCond_302 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(v);

			if (idIfCond_302) {

				java.lang.Boolean idIfCond_303 = false;
				idIfCond_303 = kermeta.standard.helper.IntegerWrapper.equals(
						prop.getLower(), 1);

				if (idIfCond_303) {

					kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
									.getConstraintViolatedInv()));

					e.setConstraintAppliedTo(this);

					e
							.setMessage(kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															kermeta.standard.helper.StringWrapper
																																	.plus(
																																			"Invariant lower bound of ",
																																			cd
																																					.getName()),
																															"_"),
																											prop
																													.getName()),
																							"_"),
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.toStringSwitcher(prop
																							.getType())),
															" violated on "),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.toStringSwitcher(this)));

					e.setFailedConstraint(invariant);

					if (true)
						throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
								e);

				}

			} else {

				java.lang.Boolean idIfCond_304 = false;
				idIfCond_304 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								v,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.standard.Collection<kermeta.language.structure.Object>"));

				if (idIfCond_304) {

					kermeta.standard.Collection<kermeta.language.structure.Object> coll = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									v,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.standard.Collection<kermeta.language.structure.Object>")));

					java.lang.Boolean idIfCond_305 = false;
					idIfCond_305 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(
													prop.getUpper(), minusOne),
									kermeta.standard.helper.IntegerWrapper
											.isGreater(coll.size(), prop
													.getUpper()));

					if (idIfCond_305) {

						kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getConstraintViolatedInv()));

						e.setConstraintAppliedTo(this);

						e
								.setMessage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								kermeta.standard.helper.StringWrapper
																										.plus(
																												kermeta.standard.helper.StringWrapper
																														.plus(
																																kermeta.standard.helper.StringWrapper
																																		.plus(
																																				"Invariant upper bound of ",
																																				cd
																																						.getName()),
																																"_"),
																												prop
																														.getName()),
																								"_"),
																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.toStringSwitcher(prop
																								.getType())),
																" violated on "),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.toStringSwitcher(this)));

						e.setFailedConstraint(invariant);

						if (true)
							throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
									e);

					}

					java.lang.Boolean idIfCond_306 = false;
					idIfCond_306 = kermeta.standard.helper.IntegerWrapper
							.isLower(coll.size(), prop.getLower());

					if (idIfCond_306) {

						kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getConstraintViolatedInv()));

						e.setConstraintAppliedTo(this);

						e
								.setMessage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								kermeta.standard.helper.StringWrapper
																										.plus(
																												kermeta.standard.helper.StringWrapper
																														.plus(
																																kermeta.standard.helper.StringWrapper
																																		.plus(
																																				"Invariant lower bound of ",
																																				cd
																																						.getName()),
																																"_"),
																												prop
																														.getName()),
																								"_"),
																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.toStringSwitcher(prop
																								.getType())),
																" violated on "),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.toStringSwitcher(this)));

						e.setFailedConstraint(invariant);

						if (true)
							throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
									e);

					}

				}

			}

		} else {

			{
				try {
					org.kermeta.compil.runtime.helper.language.ObjectUtil
							.checkInvariant(this, invariant);
				} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_1) {
					boolean caught_1 = false;
					if (ex_switcher_1.getRealException() instanceof kermeta.exceptions.RuntimeError) {
						caught_1 = true;
						kermeta.exceptions.RuntimeError error = (kermeta.exceptions.RuntimeError) ex_switcher_1
								.getRealException();
						kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getConstraintViolatedInv()));
						e.setConstraintAppliedTo(this);
						e
								.setMessage(kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																"Invariant violated on ",
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.toStringSwitcher(this)),
												"runtime error (probably due to another failed constraint or an error in the code of the constraint)"));
						e.setFailedConstraint(invariant);
						e.setNestedException(error);
						if (true)
							throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
									e);

					}
					if (!caught_1) {
						throw ex_switcher_1;
					}

				}
			}
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSet(Property property) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isSet(this, property), "java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object get(Property property) {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(
				this, property);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isKindOf(kermeta.language.structure.Class cl) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.equalsSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(this), cl);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(this, element), "java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Class getMetaClass() {

		kermeta.language.structure.Class result = null;

		result = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(this),
						"kermeta.language.structure.Class");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Property property, kermeta.language.structure.Object element) {

		java.lang.Boolean idIfCond_307 = false;
		idIfCond_307 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_307) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
					property, element);
		} else {

			kermeta.language.structure.EnumerationLiteral v = null;

			v = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(element,
							"kermeta.language.structure.EnumerationLiteral");

			java.lang.Boolean idIfCond_308 = false;
			//BIft:andThen

			java.lang.Boolean result_ft74 = null;

			java.lang.Boolean idIfCond_309 = false;
			idIfCond_309 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(v, null);

			if (idIfCond_309) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object e_lbdExp74 = null;

				result_ft74 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(property.getType(), v.getEnumeration());
				//EIle:right

			} else {

				result_ft74 = false;
			}

			//CEC
			idIfCond_308 = result_ft74;
			//EIft:andThen

			if (idIfCond_308) {

				org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
						property, v);
			} else {

				kermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
								.getIncompatibleTypeError()));

				e
						.setMessage(kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						kermeta.standard.helper.StringWrapper
																								.plus(
																										kermeta.standard.helper.StringWrapper
																												.plus(
																														"IncompatibleTypeError : Cannot set property ",
																														property
																																.getName()),
																										" of object "),
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.toStringSwitcher(this)),
																		" to "),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.toStringSwitcher(element)),
										"."));

				if (true)
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							e);

			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isFrozen() {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isFrozen(this), "java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInvariants() {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(this).getterClassDefinition();

		java.lang.Boolean idIfCond_310 = false;
		idIfCond_310 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_310) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_311 = false;
				while (!idLoopCond_311) {
					idLoopCond_311 = it_ft75.isOff();
					if (idLoopCond_311) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp75 = it_ft75
								.next();

						//BIft:exists

						java.lang.Boolean result_ft76 = null;

						java.lang.Boolean test_ft76 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp75.getTag()).iterator();
							java.lang.Boolean idLoopCond_313 = false;
							while (!idLoopCond_313) {
								idLoopCond_313 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft76.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft76,
																false));
								if (idLoopCond_313) {
								} else {

									java.lang.Boolean result_lambda_ft76 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp76 = it_ft76
											.next();

									result_lambda_ft76 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp76.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft76 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft76, result_lambda_ft76);
								}
							}
						}

						result_ft76 = test_ft76;
						//EIft:exists
						java.lang.Boolean idIfCond_312 = false;
						idIfCond_312 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft76),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp75.getIsDerived()));

						if (idIfCond_312) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(this, p_lbdExp75);

							java.lang.Boolean idIfCond_314 = false;
							//BIft:andThen

							java.lang.Boolean result_ft77 = null;

							java.lang.Boolean idIfCond_315 = false;
							idIfCond_315 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_315) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp77 = null;

								result_ft77 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft77 = false;
							}

							//CEC
							idIfCond_314 = result_ft77;
							//EIft:andThen

							if (idIfCond_314) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_316 = false;
								idIfCond_316 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp75
																		.getUpper(),
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.convertAsObject(kermeta.standard.helper.IntegerWrapper
																				.uminus(1))),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp75
																		.getUpper()));

								if (idIfCond_316) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

									e
											.setConstraintAppliedTo(((kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															this,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.Object"))));

									e
											.setMessage(kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															"Inv upper bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp75
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_317 = false;
								idIfCond_317 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp75
												.getLower());

								if (idIfCond_317) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

									e
											.setConstraintAppliedTo(((kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															this,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.Object"))));

									e
											.setMessage(kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															"Inv lower bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp75
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_318 = false;
								idIfCond_318 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp75
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_318) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

									e
											.setConstraintAppliedTo(((kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															this,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.Object"))));

									e
											.setMessage(kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															"Inv lower bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp75
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							}

						}

						//EIle:func

					}
				}
			}

			//EIft:each

		}

		org.kermeta.compil.runtime.helper.language.ObjectUtil
				.checkInvariants(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer hashcode() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.hashcode(this), "java.lang.Integer");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsDiagnostic getViolatedConstraints() {

		kermeta.exceptions.ConstraintsDiagnostic result = null;

		kermeta.exceptions.ConstraintsDiagnostic contraintes = ((kermeta.exceptions.ConstraintsDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
						.getConstraintsDiagnostic())).initialize();

		kermeta.language.structure.ClassDefinition cd = null;

		cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(this).getterClassDefinition();

		java.lang.Boolean idIfCond_319 = false;
		idIfCond_319 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_319) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd.getInv()).iterator();
				java.lang.Boolean idLoopCond_320 = false;
				while (!idLoopCond_320) {
					idLoopCond_320 = it_ft78.isOff();
					if (idLoopCond_320) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint invariant_lbdExp78 = it_ft78
								.next();
						try {
							this.checkInvariant(invariant_lbdExp78);
						} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_2) {
							boolean caught_2 = false;
							if (ex_switcher_2.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv) {
								caught_2 = true;
								kermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_2
										.getRealException();
								org.kermeta.compil.runtime.helper.io.StdIOUtil
										.getInstance()
										.writeln(
												kermeta.standard.helper.StringWrapper
														.plus("    ", e
																.getMessage()));
								contraintes.add(e);
							}
							if (!caught_2) {
								throw ex_switcher_2;
							}

						}
						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft79 = cd
						.getCachedAllAttribute().iterator();
				java.lang.Boolean idLoopCond_321 = false;
				while (!idLoopCond_321) {
					idLoopCond_321 = it_ft79.isOff();
					if (idLoopCond_321) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp79 = it_ft79
								.next();

						//BIft:exists

						java.lang.Boolean result_ft80 = null;

						java.lang.Boolean test_ft80 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											prop_lbdExp79.getTag()).iterator();
							java.lang.Boolean idLoopCond_323 = false;
							while (!idLoopCond_323) {
								idLoopCond_323 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft80.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft80,
																false));
								if (idLoopCond_323) {
								} else {

									java.lang.Boolean result_lambda_ft80 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp80 = it_ft80
											.next();

									result_lambda_ft80 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp80.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft80 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft80, result_lambda_ft80);
								}
							}
						}

						result_ft80 = test_ft80;
						//EIft:exists
						java.lang.Boolean idIfCond_322 = false;
						idIfCond_322 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft80),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp79
														.getIsDerived()));

						if (idIfCond_322) {

							kermeta.language.structure.PropertyConstraint constraint = prop_lbdExp79
									.getPropertyConstraint();

							java.lang.Boolean idIfCond_324 = false;
							idIfCond_324 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(constraint);

							if (idIfCond_324) {

								constraint = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
												.getPropertyConstraint()));

								java.lang.Boolean idIfCond_325 = false;
								idIfCond_325 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												prop_lbdExp79.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ParameterizedType"));

								if (idIfCond_325) {

									constraint
											.setName(kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											cd
																													.getName(),
																											"_"),
																							prop_lbdExp79
																									.getName()),
																			"_"),
															((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			prop_lbdExp79
																					.getType(),
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.ParameterizedType")))
																	.getTypeDefinition()
																	.getName()));
								} else {

									constraint
											.setName(kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											cd
																													.getName(),
																											"_"),
																							prop_lbdExp79
																									.getName()),
																			"_"),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(prop_lbdExp79
																			.getType())));
								}

								constraint.setProperty(prop_lbdExp79);
							}

							{
								try {
									this.checkInvariant(constraint);
								} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_3) {
									boolean caught_3 = false;
									if (ex_switcher_3.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv) {
										caught_3 = true;
										kermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_3
												.getRealException();
										contraintes.add(e);
									}
									if (!caught_3) {
										throw ex_switcher_3;
									}

								}
							}

							java.lang.Boolean idIfCond_326 = false;
							idIfCond_326 = kermeta.standard.helper.BooleanWrapper
									.and(
											prop_lbdExp79.getIsComposite(),
											prop_lbdExp79
													.getViolatedConstraintsMustDrillDown());

							if (idIfCond_326) {

								kermeta.language.structure.Object propValue = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.getSwitcher(this, prop_lbdExp79);

								java.lang.Boolean idIfCond_327 = false;
								idIfCond_327 = kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoidSwitcher(propValue));

								if (idIfCond_327) {

									java.lang.Boolean idIfCond_328 = false;
									idIfCond_328 = kermeta.standard.helper.IntegerWrapper
											.equals(prop_lbdExp79.getUpper(), 1);

									if (idIfCond_328) {

										java.lang.Boolean idIfCond_329 = false;
										idIfCond_329 = kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																propValue,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.EnumerationLiteral")));

										if (idIfCond_329) {

											//BIft:each

											{

												kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft81 = propValue
														.getViolatedConstraints()
														.getSetConstraints()
														.iterator();
												java.lang.Boolean idLoopCond_330 = false;
												while (!idLoopCond_330) {
													idLoopCond_330 = it_ft81
															.isOff();
													if (idLoopCond_330) {
													} else {

														//BIle:func
														kermeta.exceptions.ConstraintViolatedInv v_lbdExp81 = it_ft81
																.next();

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						"    ",
																						v_lbdExp81
																								.getMessage()));

														contraintes
																.add(v_lbdExp81);
														//EIle:func

													}
												}
											}

											//EIft:each

										}

									} else {

										kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

										subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeOrVoid(propValue,
														"kermeta.standard.Collection<kermeta.language.structure.Object>");

										//BIft:each

										{

											kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft82 = subObjInstances
													.iterator();
											java.lang.Boolean idLoopCond_331 = false;
											while (!idLoopCond_331) {
												idLoopCond_331 = it_ft82
														.isOff();
												if (idLoopCond_331) {
												} else {

													//BIle:func
													kermeta.language.structure.Object aSubObjInstance_lbdExp82 = it_ft82
															.next();

													java.lang.Boolean idIfCond_332 = false;
													idIfCond_332 = kermeta.standard.helper.BooleanWrapper
															.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.isInstanceOfSwitcher(
																			aSubObjInstance_lbdExp82,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.EnumerationLiteral")));

													if (idIfCond_332) {

														//BIft:each

														{

															kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft83 = aSubObjInstance_lbdExp82
																	.getViolatedConstraints()
																	.getSetConstraints()
																	.iterator();
															java.lang.Boolean idLoopCond_333 = false;
															while (!idLoopCond_333) {
																idLoopCond_333 = it_ft83
																		.isOff();
																if (idLoopCond_333) {
																} else {

																	//BIle:func
																	kermeta.exceptions.ConstraintViolatedInv v_lbdExp83 = it_ft83
																			.next();

																	org.kermeta.compil.runtime.helper.io.StdIOUtil
																			.getInstance()
																			.writeln(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"    ",
																									v_lbdExp83
																											.getMessage()));

																	contraintes
																			.add(v_lbdExp83);
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

		result = contraintes;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isVoid() {

		java.lang.Boolean result = null;

		result = false;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isNotEqual(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(this, element));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void freeze() {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object container() {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset(Property property) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this,
				property);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer oid() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getOID(this), "java.lang.Integer");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource containingResource() {

		kermeta.persistence.Resource result = null;

		result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getContainingResource(this),
						"kermeta.persistence.Resource");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInstanceOf(Type type) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(this, type.getClass().getName()),
						"java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object asType(
			kermeta.language.structure.Class type) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_334 = false;
		idIfCond_334 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this, type);

		if (idIfCond_334) {

			result = this;
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getTypeCastError())));

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkAllInvariants() {

		java.lang.Boolean idIfCond_335 = false;
		idIfCond_335 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this, null);

		if (idIfCond_335) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariantsSwitcher(this);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getMetaClassSwitcher(this)
									.getTypeDefinition(),
							"kermeta.language.structure.ClassDefinition");

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft84 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_336 = false;
				while (!idLoopCond_336) {
					idLoopCond_336 = it_ft84.isOff();
					if (idLoopCond_336) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp84 = it_ft84
								.next();

						java.lang.Boolean idIfCond_337 = false;
						idIfCond_337 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp84.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp84
														.getIsDerived()));

						if (idIfCond_337) {

							java.lang.Boolean idIfCond_338 = false;
							idIfCond_338 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp84)));

							if (idIfCond_338) {

								java.lang.Boolean idIfCond_339 = false;
								//BIft:exists

								java.lang.Boolean result_ft85 = null;

								java.lang.Boolean test_ft85 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft85 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					this,
																					prop_lbdExp84))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_340 = false;
									while (!idLoopCond_340) {
										idLoopCond_340 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft85.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft85,
																		false));
										if (idLoopCond_340) {
										} else {

											java.lang.Boolean result_lambda_ft85 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp85 = it_ft85
													.next();

											java.lang.Boolean idIfCond_341 = false;
											idIfCond_341 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp85,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_341) {

												result_lambda_ft85 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp85,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft85 = false;
											}

											//EIle:func

											test_ft85 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft85,
															result_lambda_ft85);
										}
									}
								}

								result_ft85 = test_ft85;

								//CEC
								idIfCond_339 = result_ft85;
								//EIft:exists

								if (idIfCond_339) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(this,
																	prop_lbdExp84),
													"kermeta.standard.Collection<kermeta.language.structure.Object>");

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft86 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_342 = false;
										while (!idLoopCond_342) {
											idLoopCond_342 = it_ft86.isOff();
											if (idLoopCond_342) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp86 = it_ft86
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp86);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp84));
								}

							}

						}

						//EIle:func

					}
				}
			}

			//EIft:each

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper
				.plus(
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		"[",
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.getMetaClassSwitcher(
																						this)
																				.getTypeDefinition()
																				.qualifiedName()),
														":"),
										kermeta.standard.helper.IntegerWrapper
												.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.oidSwitcher(this))),
						"]");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.OBJECT__TAG:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTag())
					.basicAdd(otherEnd, msgs);
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
		case StructurePackage.OBJECT__TAG:
			return ((InternalEList<?>) getTag()).basicRemove(otherEnd, msgs);
		case StructurePackage.OBJECT__OWNED_TAGS:
			return ((InternalEList<?>) getOwnedTags()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.OBJECT__TAG:
			return getTag();
		case StructurePackage.OBJECT__OWNED_TAGS:
			return getOwnedTags();
		case StructurePackage.OBJECT__OID:
			return getOid();
		case StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE:
			if (resolve)
				return getInternalContainingResource();
			return basicGetInternalContainingResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StructurePackage.OBJECT__TAG:
			getTag().clear();
			getTag().addAll((Collection<? extends Tag>) newValue);
			return;
		case StructurePackage.OBJECT__OWNED_TAGS:
			getOwnedTags().clear();
			getOwnedTags().addAll((Collection<? extends Tag>) newValue);
			return;
		case StructurePackage.OBJECT__OID:
			setOid((Integer) newValue);
			return;
		case StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE:
			setInternalContainingResource((Resource) newValue);
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
		case StructurePackage.OBJECT__TAG:
			getTag().clear();
			return;
		case StructurePackage.OBJECT__OWNED_TAGS:
			getOwnedTags().clear();
			return;
		case StructurePackage.OBJECT__OID:
			setOid(OID_EDEFAULT);
			return;
		case StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE:
			setInternalContainingResource((Resource) null);
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
		case StructurePackage.OBJECT__TAG:
			return tag != null && !tag.isEmpty();
		case StructurePackage.OBJECT__OWNED_TAGS:
			return ownedTags != null && !ownedTags.isEmpty();
		case StructurePackage.OBJECT__OID:
			return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT
					.equals(oid);
		case StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE:
			return internalContainingResource != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
