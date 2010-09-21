/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.standard.impl;

import java.lang.Boolean;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SetImpl<G> extends CollectionImpl<G> implements Set<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<G> intersection(Collection<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = this.iterator();
			java.lang.Boolean idLoopCond_231 = false;
			while (!idLoopCond_231) {
				idLoopCond_231 = it.isOff();
				if (idLoopCond_231) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_232 = false;
					idIfCond_232 = elements.contains(elem);

					if (idIfCond_232) {

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
	public Set<G> minus(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = this.iterator();
			java.lang.Boolean idLoopCond_233 = false;
			while (!idLoopCond_233) {
				idLoopCond_233 = it.isOff();
				if (idLoopCond_233) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_234 = false;
					idIfCond_234 = kermeta.standard.helper.BooleanWrapper
							.not(elements.contains(elem));

					if (idIfCond_234) {

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
	public void remove(G element) {

		G elem = null;
		//BIft:detect

		G result_ft60 = null;

		G elem_ft60 = null;

		result_ft60 = null;

		{

			kermeta.standard.Iterator<G> it_ft60 = this.iterator();
			java.lang.Boolean idLoopCond_235 = false;
			while (!idLoopCond_235) {
				idLoopCond_235 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft60.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft60, null));
				if (idLoopCond_235) {
				} else {

					elem_ft60 = it_ft60.next();

					java.lang.Boolean idIfCond_236 = false;
					//BIle:detector
					G e_lbdExp60 = elem_ft60;

					idIfCond_236 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp60, element);
					//EIle:detector

					if (idIfCond_236) {

						result_ft60 = elem_ft60;
					}

				}
			}
		}

		//CE
		elem = result_ft60;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_237 = false;
		idIfCond_237 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_237) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		java.lang.Boolean isEqual = false;

		java.lang.Boolean idIfCond_238 = false;
		idIfCond_238 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(element));

		if (idIfCond_238) {

			java.lang.Boolean idIfCond_239 = false;
			idIfCond_239 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstanceSwitcher(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.standard.Collection<G>"),
							element);

			if (idIfCond_239) {

				kermeta.standard.Collection<G> collection = null;

				collection = (kermeta.standard.Collection<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeOrVoid(element, "kermeta.standard.Collection<G>");

				java.lang.Boolean idIfCond_240 = false;
				idIfCond_240 = kermeta.standard.helper.IntegerWrapper.equals(
						this.size(), collection.size());

				if (idIfCond_240) {

					G elem = null;

					java.lang.Boolean ok = true;

					{

						kermeta.standard.Iterator<G> it = this.iterator();
						java.lang.Boolean idLoopCond_241 = false;
						while (!idLoopCond_241) {
							idLoopCond_241 = kermeta.standard.helper.BooleanWrapper
									.or(
											it.isOff(),
											kermeta.standard.helper.BooleanWrapper
													.not(ok));
							if (idLoopCond_241) {
							} else {

								elem = it.next();

								java.lang.Boolean idIfCond_242 = false;
								idIfCond_242 = kermeta.standard.helper.BooleanWrapper
										.not(collection.contains(elem));

								if (idIfCond_242) {

									ok = false;
								}

							}
						}
					}

					isEqual = ok;
				}

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
	public void add(G element) {

		java.lang.Boolean idIfCond_243 = false;
		idIfCond_243 = kermeta.standard.helper.BooleanWrapper.not(this
				.contains(element));

		if (idIfCond_243) {

			super.add(element);
		}

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
	public OrderedSet<G> concatenate(OrderedSet<G> less, OrderedSet<G> pivot,
			OrderedSet<G> greater) {

		kermeta.standard.OrderedSet<G> result = null;

		result = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

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
	public Set<G> symmetricDifference(Set<G> s) {

		kermeta.standard.Set<G> result = null;

		kermeta.standard.Set<G> res = s.minus(this);

		result = this.minus(s);

		result.addAll(res);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<kermeta.language.structure.Object> flatten() {

		kermeta.standard.Set<kermeta.language.structure.Object> result = null;

		kermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		java.lang.Boolean idIfCond_244 = false;
		idIfCond_244 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_244) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft61 = this.iterator();
				java.lang.Boolean idLoopCond_245 = false;
				while (!idLoopCond_245) {
					idLoopCond_245 = it_ft61.isOff();
					if (idLoopCond_245) {
					} else {

						//BIle:func
						G e_lbdExp61 = it_ft61.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(e_lbdExp61,
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
	public Set<G> union(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		result.addAll(this);

		result.addAll(elements);

		return result;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> unionWithBag(Bag<G> elements) {

		kermeta.standard.Bag<G> result = null;

		result = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		result.addAll(this);

		result.addAll(elements);

		return result;

	}

} //SetImpl
