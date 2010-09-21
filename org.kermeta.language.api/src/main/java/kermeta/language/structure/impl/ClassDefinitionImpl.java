/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;

import kermeta.standard.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#get_allAttributeCache <em>all Attribute Cache</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#get_allSuperTypesCache <em>all Super Types Cache</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefinitionImpl extends GenericTypeDefinitionImpl implements
		ClassDefinition {
	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> containedType;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #get_allAttributeCache() <em>all Attribute Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_allAttributeCache()
	 * @generated
	 * @ordered
	 */
	protected Set<Property> _allAttributeCache;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #get_allSuperTypesCache() <em>all Super Types Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_allSuperTypesCache()
	 * @generated
	 * @ordered
	 */
	protected Set<Type> _allSuperTypesCache;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> superType;

	/**
	 * The cached value of the '{@link #getInv() <em>Inv</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInv()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> inv;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.CLASS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList.Resolving<Type>(
					Type.class, this,
					StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE,
					StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList.Resolving<Operation>(
					Operation.class, this,
					StructurePackage.CLASS_DEFINITION__OWNED_OPERATION,
					StructurePackage.OPERATION__OWNING_CLASS);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Set<Property> get_allAttributeCache() {
		if (_allAttributeCache != null && _allAttributeCache.eIsProxy()) {
			InternalEObject old_allAttributeCache = (InternalEObject) _allAttributeCache;
			_allAttributeCache = (Set<Property>) eResolveProxy(old_allAttributeCache);
			if (_allAttributeCache != old_allAttributeCache) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE_CACHE,
							old_allAttributeCache, _allAttributeCache));
			}
		}
		return _allAttributeCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Property> basicGet_allAttributeCache() {
		return _allAttributeCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_allAttributeCache(Set<Property> new_allAttributeCache) {
		Set<Property> old_allAttributeCache = _allAttributeCache;
		_allAttributeCache = new_allAttributeCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE_CACHE,
					old_allAttributeCache, _allAttributeCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS_DEFINITION__IS_ABSTRACT,
					oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Set<Type> get_allSuperTypesCache() {
		if (_allSuperTypesCache != null && _allSuperTypesCache.eIsProxy()) {
			InternalEObject old_allSuperTypesCache = (InternalEObject) _allSuperTypesCache;
			_allSuperTypesCache = (Set<Type>) eResolveProxy(old_allSuperTypesCache);
			if (_allSuperTypesCache != old_allSuperTypesCache) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.CLASS_DEFINITION__ALL_SUPER_TYPES_CACHE,
							old_allSuperTypesCache, _allSuperTypesCache));
			}
		}
		return _allSuperTypesCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Type> basicGet_allSuperTypesCache() {
		return _allSuperTypesCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_allSuperTypesCache(Set<Type> new_allSuperTypesCache) {
		Set<Type> old_allSuperTypesCache = _allSuperTypesCache;
		_allSuperTypesCache = new_allSuperTypesCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS_DEFINITION__ALL_SUPER_TYPES_CACHE,
					old_allSuperTypesCache, _allSuperTypesCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getSuperType() {
		if (superType == null) {
			superType = new EObjectResolvingEList<Type>(Type.class, this,
					StructurePackage.CLASS_DEFINITION__SUPER_TYPE);
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getInv() {
		if (inv == null) {
			inv = new EObjectContainmentWithInverseEList.Resolving<Constraint>(
					Constraint.class, this,
					StructurePackage.CLASS_DEFINITION__INV,
					StructurePackage.CONSTRAINT__INV_OWNER);
		}
		return inv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList.Resolving<Property>(
					Property.class, this,
					StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE,
					StructurePackage.PROPERTY__OWNING_CLASS);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Property> getCachedAllAttribute() {

		kermeta.standard.Set<kermeta.language.structure.Property> result = null;

		java.lang.Boolean idIfCond_295 = false;
		idIfCond_295 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(this.get_allAttributeCache());

		if (idIfCond_295) {

			this
					.set_allAttributeCache(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Property> convertAsSet(this
									.getterAllAttribute()));
		}

		result = this.get_allAttributeCache();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Type> getCachedAllSuperTypes() {

		kermeta.standard.Set<kermeta.language.structure.Type> result = null;

		java.lang.Boolean idIfCond_296 = false;
		idIfCond_296 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(this.get_allSuperTypesCache());

		if (idIfCond_296) {

			this.set_allSuperTypesCache(this.allSuperTypes());
		}

		result = this.get_allSuperTypesCache();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Type> allSuperTypes() {

		kermeta.standard.Set<kermeta.language.structure.Type> result = null;

		kermeta.standard.Set<kermeta.language.structure.Type> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		kermeta.standard.Set<kermeta.language.structure.Type> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		superClasses
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(this
								.getSuperType()));

		kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
		java.lang.Boolean idLoopCond_297 = false;
		while (!idLoopCond_297) {
			idLoopCond_297 = superClasses.isEmpty();
			if (idLoopCond_297) {
			} else {

				allSuperClasses.addAll(superClasses);

				kermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.standard.StandardPackage.eINSTANCE
								.getSet()));

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft73 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_298 = false;
					while (!idLoopCond_298) {
						idLoopCond_298 = it_ft73.isOff();
						if (idLoopCond_298) {
						} else {

							//BIle:func
							kermeta.language.structure.Type s_lbdExp73 = it_ft73
									.next();

							java.lang.Boolean idIfCond_299 = false;
							idIfCond_299 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											s_lbdExp73,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ParameterizedType"));

							if (idIfCond_299) {

								java.lang.Boolean idIfCond_300 = false;
								idIfCond_300 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																s_lbdExp73,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.ParameterizedType")))
														.getTypeDefinition(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_300) {

									temp
											.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Type> convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asTypeSwitcher(
																					s_lbdExp73,
																					org.kermeta.compil.runtime.ExecutionContext
																							.getInstance()
																							.getMetaClass(
																									"kermeta.language.structure.ParameterizedType")))
																			.getTypeDefinition(),
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ClassDefinition")))
															.getSuperType()));
								}

							}

							//EIle:func

						}
					}
				}

				//EIft:each

				superClasses.clear();

				superClasses.addAll(temp);
			}
		}

		result = allSuperClasses;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getterAllOperation() {

		kermeta.standard.Set<kermeta.language.structure.Operation> result = null;

		result = ((kermeta.standard.Set<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		result
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(this
								.getOwnedOperation()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_289 = false;
			while (!idLoopCond_289) {
				idLoopCond_289 = it_ft69.isOff();
				if (idLoopCond_289) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp69 = it_ft69.next();

					java.lang.Boolean idIfCond_290 = false;
					idIfCond_290 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp69);

					if (idIfCond_290) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(t_lbdExp69,
										"kermeta.language.structure.Class");

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(c.getTypeDefinition(),
										"kermeta.language.structure.ClassDefinition");

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Operation> convertAsSet(
											cDef.getterAllOperation())
									.iterator();
							java.lang.Boolean idLoopCond_291 = false;
							while (!idLoopCond_291) {
								idLoopCond_291 = it_ft70.isOff();
								if (idLoopCond_291) {
								} else {

									//BIle:func
									kermeta.language.structure.Operation p_lbdExp70 = it_ft70
											.next();

									result.add(p_lbdExp70);
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

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getterAllAttribute() {

		kermeta.standard.Set<kermeta.language.structure.Property> result = null;

		result = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		result
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsOrderedSet(this
								.getOwnedAttribute()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_292 = false;
			while (!idLoopCond_292) {
				idLoopCond_292 = it_ft71.isOff();
				if (idLoopCond_292) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp71 = it_ft71.next();

					java.lang.Boolean idIfCond_293 = false;
					idIfCond_293 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp71);

					if (idIfCond_293) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(t_lbdExp71,
										"kermeta.language.structure.Class");

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(c.getTypeDefinition(),
										"kermeta.language.structure.ClassDefinition");

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft72 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											cDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_294 = false;
							while (!idLoopCond_294) {
								idLoopCond_294 = it_ft72.isOff();
								if (idLoopCond_294) {
								} else {

									//BIle:func
									kermeta.language.structure.Property p_lbdExp72 = it_ft72
											.next();

									result.add(p_lbdExp72);
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

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedType())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperation())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__INV:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInv())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedAttribute())
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return ((InternalEList<?>) getContainedType()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			return ((InternalEList<?>) getOwnedOperation()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__INV:
			return ((InternalEList<?>) getInv()).basicRemove(otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return ((InternalEList<?>) getOwnedAttribute()).basicRemove(
					otherEnd, msgs);
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return getContainedType();
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			return getOwnedOperation();
		case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE_CACHE:
			if (resolve)
				return get_allAttributeCache();
			return basicGet_allAttributeCache();
		case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
			return getIsAbstract();
		case StructurePackage.CLASS_DEFINITION__ALL_SUPER_TYPES_CACHE:
			if (resolve)
				return get_allSuperTypesCache();
			return basicGet_allSuperTypesCache();
		case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
			return getSuperType();
		case StructurePackage.CLASS_DEFINITION__INV:
			return getInv();
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return getOwnedAttribute();
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			getContainedType().clear();
			getContainedType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			getOwnedOperation().clear();
			getOwnedOperation().addAll(
					(Collection<? extends Operation>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE_CACHE:
			set_allAttributeCache((Set<Property>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__ALL_SUPER_TYPES_CACHE:
			set_allSuperTypesCache((Set<Type>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
			getSuperType().clear();
			getSuperType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__INV:
			getInv().clear();
			getInv().addAll((Collection<? extends Constraint>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			getOwnedAttribute().clear();
			getOwnedAttribute().addAll(
					(Collection<? extends Property>) newValue);
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			getContainedType().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			getOwnedOperation().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE_CACHE:
			set_allAttributeCache((Set<Property>) null);
			return;
		case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.CLASS_DEFINITION__ALL_SUPER_TYPES_CACHE:
			set_allSuperTypesCache((Set<Type>) null);
			return;
		case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
			getSuperType().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__INV:
			getInv().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			getOwnedAttribute().clear();
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return containedType != null && !containedType.isEmpty();
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			return ownedOperation != null && !ownedOperation.isEmpty();
		case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE_CACHE:
			return _allAttributeCache != null;
		case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
			return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null
					: !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
		case StructurePackage.CLASS_DEFINITION__ALL_SUPER_TYPES_CACHE:
			return _allSuperTypesCache != null;
		case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
			return superType != null && !superType.isEmpty();
		case StructurePackage.CLASS_DEFINITION__INV:
			return inv != null && !inv.isEmpty();
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return ownedAttribute != null && !ownedAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
				return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE:
				return StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassDefinitionImpl
