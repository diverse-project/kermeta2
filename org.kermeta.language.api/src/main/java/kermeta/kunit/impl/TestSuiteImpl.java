/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.kunit.impl;

import java.util.Collection;

import kermeta.kunit.KunitPackage;
import kermeta.kunit.Test;
import kermeta.kunit.TestSuite;

import kermeta.language.structure.ClassDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.TestSuiteImpl#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuiteImpl extends TestImpl implements TestSuite {
	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.TEST_SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList<Test>(Test.class, this,
					KunitPackage.TEST_SUITE__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuite addAllTestCasesFrom(
			kermeta.language.structure.Class testCaseClass) {

		kermeta.kunit.TestSuite result = null;

		//PreConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked("pre__520128__testCaseClassIsATestCase")) {
				java.lang.Boolean result_pre = false;

				result_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Class> convertAsSet(
								testCaseClass.getterSuperClass()).contains(
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance().getMetaClass(
												"kermeta.kunit.TestCase"));
				if (!result_pre) {
					kermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
							.createConstraintViolatedPre();
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exp);
				}
			}
		}
		//BIft:exists

		java.lang.Boolean result_ft93 = null;

		java.lang.Boolean test_ft93 = false;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Class> convertAsSet(
							testCaseClass.getterSuperClass()).iterator();
			java.lang.Boolean idLoopCond_378 = false;
			while (!idLoopCond_378) {
				idLoopCond_378 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft93.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft93, false));
				if (idLoopCond_378) {
				} else {

					java.lang.Boolean result_lambda_ft93 = null;
					//BIle:func
					kermeta.language.structure.Class sc_lbdExp93 = it_ft93
							.next();

					result_lambda_ft93 = org.kermeta.compil.runtime.helper.language.ClassUtil
							.equalsSwitcher(sc_lbdExp93,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"kermeta.kunit.TestCase"));
					//EIle:func

					test_ft93 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft93, result_lambda_ft93);
				}
			}
		}

		result_ft93 = test_ft93;
		//EIft:exists
		java.lang.Boolean idIfCond_377 = false;
		idIfCond_377 = kermeta.standard.helper.BooleanWrapper.not(result_ft93);

		if (idIfCond_377) {

			kermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.kunit.KunitPackage.eINSTANCE
							.getInvalidParameterException()));

			e.setMessage(kermeta.standard.helper.StringWrapper.plus(
					"Cannot build a suite from class: ", testCaseClass
							.getterName()));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft95 = null;

		kermeta.language.structure.Operation elem_ft95 = null;

		result_ft95 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							testCaseClass.getterOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_380 = false;
			while (!idLoopCond_380) {
				idLoopCond_380 = it_ft95.isOff();
				if (idLoopCond_380) {
				} else {

					elem_ft95 = it_ft95.next();

					java.lang.Boolean idIfCond_381 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp95 = elem_ft95;

					java.lang.Boolean idIfCond_382 = false;
					idIfCond_382 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp95.getName()), 4);

					if (idIfCond_382) {

						idIfCond_381 = kermeta.standard.helper.StringWrapper
								.equals(kermeta.standard.helper.StringWrapper
										.substring(o_lbdExp95.getName(), 0, 4),
										"test");
					} else {

						idIfCond_381 = false;
					}

					//EIle:selector

					if (idIfCond_381) {

						result_ft95.add(elem_ft95);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft94 = result_ft95
					.iterator();
			java.lang.Boolean idLoopCond_379 = false;
			while (!idLoopCond_379) {
				idLoopCond_379 = it_ft94.isOff();
				if (idLoopCond_379) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp94 = it_ft94
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp94.getName());

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.kunit.Test> convertAsOrderedSet(
									this.getTests()).add(testCase);
					//EIle:func

				}
			}
		}

		//EIft:each

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.kunit.Test> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.kunit.Test> convertAsOrderedSet(this.getTests())
					.iterator();
			java.lang.Boolean idLoopCond_383 = false;
			while (!idLoopCond_383) {
				idLoopCond_383 = it_ft96.isOff();
				if (idLoopCond_383) {
				} else {

					//BIle:func
					kermeta.kunit.Test t_lbdExp96 = it_ft96.next();

					t_lbdExp96.setLogKermeta(this.getLog());

					t_lbdExp96.run();
					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect) {

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft98 = null;

		kermeta.language.structure.Operation elem_ft98 = null;

		result_ft98 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft98 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							anAspect.getOwnedOperation()).iterator();
			java.lang.Boolean idLoopCond_385 = false;
			while (!idLoopCond_385) {
				idLoopCond_385 = it_ft98.isOff();
				if (idLoopCond_385) {
				} else {

					elem_ft98 = it_ft98.next();

					java.lang.Boolean idIfCond_386 = false;
					//BIle:selector
					kermeta.language.structure.Operation o_lbdExp98 = elem_ft98;

					java.lang.Boolean idIfCond_387 = false;
					idIfCond_387 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.size(o_lbdExp98.getName()), 4);

					if (idIfCond_387) {

						idIfCond_386 = kermeta.standard.helper.StringWrapper
								.equals(kermeta.standard.helper.StringWrapper
										.substring(o_lbdExp98.getName(), 0, 4),
										"test");
					} else {

						idIfCond_386 = false;
					}

					//EIle:selector

					if (idIfCond_386) {

						result_ft98.add(elem_ft98);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft97 = result_ft98
					.iterator();
			java.lang.Boolean idLoopCond_384 = false;
			while (!idLoopCond_384) {
				idLoopCond_384 = it_ft97.isOff();
				if (idLoopCond_384) {
				} else {

					//BIle:func
					kermeta.language.structure.Operation o_lbdExp97 = it_ft97
							.next();

					kermeta.kunit.TestCase testCase = null;

					testCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(testCaseClass._new(),
									"kermeta.kunit.TestCase");

					testCase.setTestMethodName(o_lbdExp97.getName());

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.kunit.Test> convertAsOrderedSet(
									this.getTests()).add(testCase);
					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KunitPackage.TEST_SUITE__TESTS:
			return getTests();
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
		case KunitPackage.TEST_SUITE__TESTS:
			getTests().clear();
			getTests().addAll((Collection<? extends Test>) newValue);
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
		case KunitPackage.TEST_SUITE__TESTS:
			getTests().clear();
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
		case KunitPackage.TEST_SUITE__TESTS:
			return tests != null && !tests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestSuiteImpl
