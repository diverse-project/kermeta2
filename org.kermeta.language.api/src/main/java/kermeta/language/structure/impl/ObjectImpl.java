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

		java.lang.Boolean idIfCond_345 = false;
		idIfCond_345 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						invariant,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PropertyConstraint"));

		if (idIfCond_345) {

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

			java.lang.Boolean idIfCond_346 = false;
			idIfCond_346 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(v);

			if (idIfCond_346) {

				java.lang.Boolean idIfCond_347 = false;
				idIfCond_347 = kermeta.standard.helper.IntegerWrapper.equals(
						prop.getLower(), 1);

				if (idIfCond_347) {

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

				java.lang.Boolean idIfCond_348 = false;
				idIfCond_348 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								v,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.standard.Collection<kermeta.language.structure.Object>"));

				if (idIfCond_348) {

					kermeta.standard.Collection<kermeta.language.structure.Object> coll = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									v,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.standard.Collection<kermeta.language.structure.Object>")));

					java.lang.Boolean idIfCond_349 = false;
					idIfCond_349 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(
													prop.getUpper(), minusOne),
									kermeta.standard.helper.IntegerWrapper
											.isGreater(coll.size(), prop
													.getUpper()));

					if (idIfCond_349) {

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

					java.lang.Boolean idIfCond_350 = false;
					idIfCond_350 = kermeta.standard.helper.IntegerWrapper
							.isLower(coll.size(), prop.getLower());

					if (idIfCond_350) {

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
				} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5) {
					boolean caught_5 = false;
					if (ex_switcher_5.getRealException() instanceof kermeta.exceptions.RuntimeError) {
						caught_5 = true;
						kermeta.exceptions.RuntimeError error = (kermeta.exceptions.RuntimeError) ex_switcher_5
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
					if (!caught_5) {
						throw ex_switcher_5;
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
	public void set(Property property, kermeta.language.structure.Object element) {

		java.lang.Boolean idIfCond_351 = false;
		idIfCond_351 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_351) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
					property, element);
		} else {

			kermeta.language.structure.EnumerationLiteral v = null;

			v = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(element,
							"kermeta.language.structure.EnumerationLiteral");

			java.lang.Boolean idIfCond_352 = false;
			//BIft:andThen

			java.lang.Boolean result_ft85 = null;

			java.lang.Boolean idIfCond_353 = false;
			idIfCond_353 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(v, null);

			if (idIfCond_353) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object e_lbdExp85 = null;

				result_ft85 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(property.getType(), v.getEnumeration());
				//EIle:right

			} else {

				result_ft85 = false;
			}

			//CEC
			idIfCond_352 = result_ft85;
			//EIft:andThen

			if (idIfCond_352) {

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

		java.lang.Boolean idIfCond_354 = false;
		idIfCond_354 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_354) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_355 = false;
				while (!idLoopCond_355) {
					idLoopCond_355 = it_ft86.isOff();
					if (idLoopCond_355) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp86 = it_ft86
								.next();

						//BIft:exists

						java.lang.Boolean result_ft87 = null;

						java.lang.Boolean test_ft87 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp86.getTag()).iterator();
							java.lang.Boolean idLoopCond_357 = false;
							while (!idLoopCond_357) {
								idLoopCond_357 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft87.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft87,
																false));
								if (idLoopCond_357) {
								} else {

									java.lang.Boolean result_lambda_ft87 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp87 = it_ft87
											.next();

									result_lambda_ft87 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp87.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft87 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft87, result_lambda_ft87);
								}
							}
						}

						result_ft87 = test_ft87;
						//EIft:exists
						java.lang.Boolean idIfCond_356 = false;
						idIfCond_356 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft87),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp86.getIsDerived()));

						if (idIfCond_356) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(this, p_lbdExp86);

							java.lang.Boolean idIfCond_358 = false;
							//BIft:andThen

							java.lang.Boolean result_ft88 = null;

							java.lang.Boolean idIfCond_359 = false;
							idIfCond_359 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_359) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp88 = null;

								result_ft88 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft88 = false;
							}

							//CEC
							idIfCond_358 = result_ft88;
							//EIft:andThen

							if (idIfCond_358) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_360 = false;
								idIfCond_360 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp86
																		.getUpper(),
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.convertAsObject(kermeta.standard.helper.IntegerWrapper
																				.uminus(1))),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp86
																		.getUpper()));

								if (idIfCond_360) {

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
																							p_lbdExp86
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_361 = false;
								idIfCond_361 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp86
												.getLower());

								if (idIfCond_361) {

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
																							p_lbdExp86
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_362 = false;
								idIfCond_362 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp86
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_362) {

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
																							p_lbdExp86
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

		java.lang.Boolean idIfCond_363 = false;
		idIfCond_363 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_363) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd.getInv()).iterator();
				java.lang.Boolean idLoopCond_364 = false;
				while (!idLoopCond_364) {
					idLoopCond_364 = it_ft89.isOff();
					if (idLoopCond_364) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint invariant_lbdExp89 = it_ft89
								.next();
						try {
							this.checkInvariant(invariant_lbdExp89);
						} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_6) {
							boolean caught_6 = false;
							if (ex_switcher_6.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv) {
								caught_6 = true;
								kermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_6
										.getRealException();
								org.kermeta.compil.runtime.helper.io.StdIOUtil
										.getInstance()
										.writeln(
												kermeta.standard.helper.StringWrapper
														.plus("    ", e
																.getMessage()));
								contraintes.add(e);
							}
							if (!caught_6) {
								throw ex_switcher_6;
							}

						}
						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft90 = cd
						.getCachedAllAttribute().iterator();
				java.lang.Boolean idLoopCond_365 = false;
				while (!idLoopCond_365) {
					idLoopCond_365 = it_ft90.isOff();
					if (idLoopCond_365) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp90 = it_ft90
								.next();

						//BIft:exists

						java.lang.Boolean result_ft91 = null;

						java.lang.Boolean test_ft91 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											prop_lbdExp90.getTag()).iterator();
							java.lang.Boolean idLoopCond_367 = false;
							while (!idLoopCond_367) {
								idLoopCond_367 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft91.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft91,
																false));
								if (idLoopCond_367) {
								} else {

									java.lang.Boolean result_lambda_ft91 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp91 = it_ft91
											.next();

									result_lambda_ft91 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp91.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft91 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft91, result_lambda_ft91);
								}
							}
						}

						result_ft91 = test_ft91;
						//EIft:exists
						java.lang.Boolean idIfCond_366 = false;
						idIfCond_366 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft91),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp90
														.getIsDerived()));

						if (idIfCond_366) {

							kermeta.language.structure.PropertyConstraint constraint = prop_lbdExp90
									.getPropertyConstraint();

							java.lang.Boolean idIfCond_368 = false;
							idIfCond_368 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(constraint);

							if (idIfCond_368) {

								constraint = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
												.getPropertyConstraint()));

								java.lang.Boolean idIfCond_369 = false;
								idIfCond_369 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												prop_lbdExp90.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ParameterizedType"));

								if (idIfCond_369) {

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
																							prop_lbdExp90
																									.getName()),
																			"_"),
															((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			prop_lbdExp90
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
																							prop_lbdExp90
																									.getName()),
																			"_"),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(prop_lbdExp90
																			.getType())));
								}

								constraint.setProperty(prop_lbdExp90);
							}

							{
								try {
									this.checkInvariant(constraint);
								} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_7) {
									boolean caught_7 = false;
									if (ex_switcher_7.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv) {
										caught_7 = true;
										kermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_7
												.getRealException();
										contraintes.add(e);
									}
									if (!caught_7) {
										throw ex_switcher_7;
									}

								}
							}

							java.lang.Boolean idIfCond_370 = false;
							idIfCond_370 = kermeta.standard.helper.BooleanWrapper
									.and(
											prop_lbdExp90.getIsComposite(),
											prop_lbdExp90
													.getViolatedConstraintsMustDrillDown());

							if (idIfCond_370) {

								kermeta.language.structure.Object propValue = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.getSwitcher(this, prop_lbdExp90);

								java.lang.Boolean idIfCond_371 = false;
								idIfCond_371 = kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoidSwitcher(propValue));

								if (idIfCond_371) {

									java.lang.Boolean idIfCond_372 = false;
									idIfCond_372 = kermeta.standard.helper.IntegerWrapper
											.equals(prop_lbdExp90.getUpper(), 1);

									if (idIfCond_372) {

										java.lang.Boolean idIfCond_373 = false;
										idIfCond_373 = kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																propValue,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.EnumerationLiteral")));

										if (idIfCond_373) {

											//BIft:each

											{

												kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft92 = propValue
														.getViolatedConstraints()
														.getSetConstraints()
														.iterator();
												java.lang.Boolean idLoopCond_374 = false;
												while (!idLoopCond_374) {
													idLoopCond_374 = it_ft92
															.isOff();
													if (idLoopCond_374) {
													} else {

														//BIle:func
														kermeta.exceptions.ConstraintViolatedInv v_lbdExp92 = it_ft92
																.next();

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						"    ",
																						v_lbdExp92
																								.getMessage()));

														contraintes
																.add(v_lbdExp92);
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

											kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft93 = subObjInstances
													.iterator();
											java.lang.Boolean idLoopCond_375 = false;
											while (!idLoopCond_375) {
												idLoopCond_375 = it_ft93
														.isOff();
												if (idLoopCond_375) {
												} else {

													//BIle:func
													kermeta.language.structure.Object aSubObjInstance_lbdExp93 = it_ft93
															.next();

													java.lang.Boolean idIfCond_376 = false;
													idIfCond_376 = kermeta.standard.helper.BooleanWrapper
															.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.isInstanceOfSwitcher(
																			aSubObjInstance_lbdExp93,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.EnumerationLiteral")));

													if (idIfCond_376) {

														//BIft:each

														{

															kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft94 = aSubObjInstance_lbdExp93
																	.getViolatedConstraints()
																	.getSetConstraints()
																	.iterator();
															java.lang.Boolean idLoopCond_377 = false;
															while (!idLoopCond_377) {
																idLoopCond_377 = it_ft94
																		.isOff();
																if (idLoopCond_377) {
																} else {

																	//BIle:func
																	kermeta.exceptions.ConstraintViolatedInv v_lbdExp94 = it_ft94
																			.next();

																	org.kermeta.compil.runtime.helper.io.StdIOUtil
																			.getInstance()
																			.writeln(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"    ",
																									v_lbdExp94
																											.getMessage()));

																	contraintes
																			.add(v_lbdExp94);
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
	public void unset(Property property) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this,
				property);

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
	public void checkAllInvariants() {

		java.lang.Boolean idIfCond_378 = false;
		idIfCond_378 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this, null);

		if (idIfCond_378) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_379 = false;
				while (!idLoopCond_379) {
					idLoopCond_379 = it_ft95.isOff();
					if (idLoopCond_379) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp95 = it_ft95
								.next();

						java.lang.Boolean idIfCond_380 = false;
						idIfCond_380 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp95.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp95
														.getIsDerived()));

						if (idIfCond_380) {

							java.lang.Boolean idIfCond_381 = false;
							idIfCond_381 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp95)));

							if (idIfCond_381) {

								java.lang.Boolean idIfCond_382 = false;
								//BIft:exists

								java.lang.Boolean result_ft96 = null;

								java.lang.Boolean test_ft96 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft96 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					this,
																					prop_lbdExp95))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_383 = false;
									while (!idLoopCond_383) {
										idLoopCond_383 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft96.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft96,
																		false));
										if (idLoopCond_383) {
										} else {

											java.lang.Boolean result_lambda_ft96 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp96 = it_ft96
													.next();

											java.lang.Boolean idIfCond_384 = false;
											idIfCond_384 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp96,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_384) {

												result_lambda_ft96 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp96,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft96 = false;
											}

											//EIle:func

											test_ft96 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft96,
															result_lambda_ft96);
										}
									}
								}

								result_ft96 = test_ft96;

								//CEC
								idIfCond_382 = result_ft96;
								//EIft:exists

								if (idIfCond_382) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(this,
																	prop_lbdExp95),
													"kermeta.standard.Collection<kermeta.language.structure.Object>");

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft97 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_385 = false;
										while (!idLoopCond_385) {
											idLoopCond_385 = it_ft97.isOff();
											if (idLoopCond_385) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp97 = it_ft97
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp97);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp95));
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
	public kermeta.language.structure.Object asType(
			kermeta.language.structure.Class type) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_386 = false;
		idIfCond_386 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this, type);

		if (idIfCond_386) {

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
