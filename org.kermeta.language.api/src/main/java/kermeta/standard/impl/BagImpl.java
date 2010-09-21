/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.standard.impl;

import java.lang.Boolean;
import java.lang.Integer;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BagImpl<G> extends CollectionImpl<G> implements Bag<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.BAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> intersection(Bag<G> elements) {

		kermeta.standard.Bag<G> result = null;

		result = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		G elem = null;

		kermeta.standard.Iterator<G> it = this.iterator();

		java.lang.Boolean idLoopCond_246 = false;
		while (!idLoopCond_246) {
			idLoopCond_246 = it.isOff();
			if (idLoopCond_246) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_247 = false;
				idIfCond_247 = elements.contains(elem);

				if (idIfCond_247) {

					java.lang.Boolean idIfCond_248 = false;
					idIfCond_248 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_248) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_249 = false;
		while (!idLoopCond_249) {
			idLoopCond_249 = it.isOff();
			if (idLoopCond_249) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_250 = false;
				idIfCond_250 = this.contains(elem);

				if (idIfCond_250) {

					java.lang.Boolean idIfCond_251 = false;
					idIfCond_251 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_251) {

						result.add(elem);
					}

				}

			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		java.lang.Boolean isEqual = false;

		java.lang.Boolean idIfCond_252 = false;
		idIfCond_252 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(element));

		if (idIfCond_252) {

			java.lang.Boolean idIfCond_253 = false;
			idIfCond_253 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstanceSwitcher(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.standard.Collection<G>"),
							element);

			if (idIfCond_253) {

				kermeta.standard.Bag<G> collection = null;

				collection = (kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeOrVoid(element, "kermeta.standard.Bag<G>");

				kermeta.standard.Set<G> selfAsSet = this.asSet();

				isEqual = selfAsSet.equals(collection.asSet());
			}

		}

		result = isEqual;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence<G> asSequence() {

		kermeta.standard.Sequence<G> result = null;

		kermeta.standard.Sequence<G> s = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		s.addAll(this);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence<G> concatenate(Sequence<G> less, Sequence<G> pivot,
			Sequence<G> greater) {

		kermeta.standard.Sequence<G> result = null;

		result = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		result.addAll(less);

		result.addAll(pivot);

		result.addAll(greater);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> excluding(G object) {

		kermeta.standard.Bag<G> result = null;

		kermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		s.addAll(this);

		s.remove(object);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<G> intersectionWithSet(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_254 = false;
			while (!idLoopCond_254) {
				idLoopCond_254 = it.isOff();
				if (idLoopCond_254) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_255 = false;
					idIfCond_255 = this.contains(elem);

					if (idIfCond_255) {

						result.add(elem);
					}

				}
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<kermeta.language.structure.Object> flatten() {

		kermeta.standard.Bag<kermeta.language.structure.Object> result = null;

		kermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		java.lang.Boolean idIfCond_256 = false;
		idIfCond_256 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_256) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft62 = this.iterator();
				java.lang.Boolean idLoopCond_257 = false;
				while (!idLoopCond_257) {
					idLoopCond_257 = it_ft62.isOff();
					if (idLoopCond_257) {
					} else {

						//BIle:func
						G e_lbdExp62 = it_ft62.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(e_lbdExp62,
										"kermeta.standard.Collection<kermeta.language.structure.Object>");

						res.addAll(col);
						//EIle:func

					}
				}
			}

			//EIft:each

		}

		result = res;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> including(G object) {

		kermeta.standard.Bag<G> result = null;

		kermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		s.addAll(this);

		s.add(object);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<G> asOrderedSet() {

		kermeta.standard.OrderedSet<G> result = null;

		kermeta.standard.OrderedSet<G> s = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		s.addAll(this);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> asBag() {

		kermeta.standard.Bag<G> result = null;

		kermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		s.addAll(this);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> union(Collection<G> elements) {

		kermeta.standard.Bag<G> result = null;

		result = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		result.addAll(this);

		result.addAll(elements);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeOne(G element) {

		G elem = null;
		//BIft:detect

		G result_ft63 = null;

		G elem_ft63 = null;

		result_ft63 = null;

		{

			kermeta.standard.Iterator<G> it_ft63 = this.iterator();
			java.lang.Boolean idLoopCond_258 = false;
			while (!idLoopCond_258) {
				idLoopCond_258 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft63.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft63, null));
				if (idLoopCond_258) {
				} else {

					elem_ft63 = it_ft63.next();

					java.lang.Boolean idIfCond_259 = false;
					//BIle:detector
					G e_lbdExp63 = elem_ft63;

					idIfCond_259 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp63, element);
					//EIle:detector

					if (idIfCond_259) {

						result_ft63 = elem_ft63;
					}

				}
			}
		}

		//CE
		elem = result_ft63;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_260 = false;
		idIfCond_260 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_260) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFromOid(Integer elementOid) {

		G elem = null;
		//BIft:detect

		G result_ft64 = null;

		G elem_ft64 = null;

		result_ft64 = null;

		{

			kermeta.standard.Iterator<G> it_ft64 = this.iterator();
			java.lang.Boolean idLoopCond_261 = false;
			while (!idLoopCond_261) {
				idLoopCond_261 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft64.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft64, null));
				if (idLoopCond_261) {
				} else {

					elem_ft64 = it_ft64.next();

					java.lang.Boolean idIfCond_262 = false;
					//BIle:detector
					G e_lbdExp64 = elem_ft64;

					idIfCond_262 = kermeta.standard.helper.IntegerWrapper
							.equals(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.oidSwitcher(e_lbdExp64),
									elementOid);
					//EIle:detector

					if (idIfCond_262) {

						result_ft64 = elem_ft64;
					}

				}
			}
		}

		//CE
		elem = result_ft64;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_263 = false;
		idIfCond_263 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_263) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked(
							"post__13687095__doesntContainsElementAnymore")) {
				java.lang.Boolean result_post = false;

				//BIft:exists

				java.lang.Boolean result_ft65 = null;

				java.lang.Boolean test_ft65 = false;

				{

					kermeta.standard.Iterator<G> it_ft65 = this.iterator();
					java.lang.Boolean idLoopCond_264 = false;
					while (!idLoopCond_264) {
						idLoopCond_264 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft65.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(test_ft65,
														false));
						if (idLoopCond_264) {
						} else {

							java.lang.Boolean result_lambda_ft65 = null;
							//BIle:func
							G e_lbdExp65 = it_ft65.next();

							result_lambda_ft65 = kermeta.standard.helper.IntegerWrapper
									.equals(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.oidSwitcher(e_lbdExp65),
											elementOid);
							//EIle:func

							test_ft65 = kermeta.standard.helper.BooleanWrapper
									.or(test_ft65, result_lambda_ft65);
						}
					}
				}

				result_ft65 = test_ft65;
				//EIft:exists
				result_post = kermeta.standard.helper.BooleanWrapper
						.not(result_ft65);
				if (!result_post) {
					kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
							.createConstraintViolatedPost();
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exp);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<G> asSet() {

		kermeta.standard.Set<G> result = null;

		kermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		s.addAll(this);

		result = s;

		return result;

	}

} //BagImpl
