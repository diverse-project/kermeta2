/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.kunit.impl;

import kermeta.kunit.Assert;
import kermeta.kunit.KunitPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssertImpl extends AbstractFallibleImpl implements Assert {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.ASSERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrue(Boolean condition) {

		java.lang.Boolean idIfCond_59 = false;
		idIfCond_59 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_59) {

			this.fail("assertTrue failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalseWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_60 = false;
		idIfCond_60 = condition;

		if (idIfCond_60) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fail(String msg) {

		kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.kunit.KunitPackage.eINSTANCE
						.getAssertionFailedError()));

		exception.setMessage(msg);

		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					exception);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertEqual(String expected, String actual) {

		java.lang.Boolean idIfCond_61 = false;
		idIfCond_61 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.equals(expected,
						actual));

		if (idIfCond_61) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											"assertEqual failed\nexpected\t:[",
											expected), "] != \nactual\t:["),
							actual), "]"));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalse(Boolean condition) {

		java.lang.Boolean idIfCond_62 = false;
		idIfCond_62 = condition;

		if (idIfCond_62) {

			this.fail("assertTrue number failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrueWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_63 = false;
		idIfCond_63 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_63) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _assert(Boolean condition) {

		java.lang.Boolean idIfCond_64 = false;
		idIfCond_64 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_64) {

			this.fail("assert failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_65 = false;
		idIfCond_65 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_65) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

} //AssertImpl
