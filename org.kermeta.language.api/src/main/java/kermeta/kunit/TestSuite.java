/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.kunit;

import kermeta.language.structure.ClassDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.TestSuite#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getTestSuite()
 * @model annotation="kermeta documentation='/**\n * A TestSuite is a structured collection of tests, using the\n * composite pattern, all tests are runnable and have a log\n * In addition a suite can be populated automatically from a\n * test case class with one test case object for each test\n * method in the class.\n *  You can make a suite and populate it manually like this:\n *\n *  var suite : TestSuite init TestSuite.new.\n *  suite.tests.add(t1)\n *\n *  Alternatively you can populate a suite automatically from\n *  a class that inherits TestCase and which has several methods\n *  called test:\n *\n *  var suite : TestSuite init TestSuite.new.addAllTestCasesFrom(InterestingTestCaseSet)\n \052/'"
 *        annotation="kermeta CompilerIgnore='true'"
 * @generated
 */
public interface TestSuite extends Test {
	/**
	 * Returns the value of the '<em><b>Tests</b></em>' reference list.
	 * The list contents are of type {@link kermeta.kunit.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' reference list.
	 * @see kermeta.kunit.KunitPackage#getTestSuite_Tests()
	 * @model annotation="kermeta documentation='/**\n\t * The collection of tests which will be ran as the suite\n\t \052/'"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * Add to this suite, a set of test cases of type c, one for each\n\t  * test method in class c. C must be a descendent of TestCase\n\t  \052/'"
	 *        annotation="kermeta.pre testCaseClassIsATestCase=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__520128__testCaseClassIsATestCase\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).contains(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\t//BIft:exists\n\njava.lang.Boolean result_ft93 = null;\n\n\tjava.lang.Boolean test_ft93 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_378 = false;\n\twhile( !idLoopCond_378 ) {\n\tidLoopCond_378 = kermeta.standard.helper.BooleanWrapper.or(it_ft93.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft93, false));\n\tif ( idLoopCond_378 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft93 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp93 = it_ft93.next();\n\n\tresult_lambda_ft93 = org.kermeta.compil.runtime.helper.language.ClassUtil.equalsSwitcher(sc_lbdExp93, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft93 = kermeta.standard.helper.BooleanWrapper.or(test_ft93, result_lambda_ft93);\n}\n\t}\n}\n\n\n\tresult_ft93 = test_ft93;\n//EIft:exists\njava.lang.Boolean idIfCond_377 = false;\n\tidIfCond_377 = kermeta.standard.helper.BooleanWrapper.not(result_ft93);\n\n\tif( idIfCond_377 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getInvalidParameterException()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft95 = null;\n\n\tkermeta.language.structure.Operation elem_ft95 = null;\n\n\tresult_ft95 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_380 = false;\n\twhile( !idLoopCond_380 ) {\n\tidLoopCond_380 = it_ft95.isOff();\n\tif ( idLoopCond_380 ) {\n\t} else {\n\n\telem_ft95 = it_ft95.next();\n\n\tjava.lang.Boolean idIfCond_381 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp95 = elem_ft95;\n\n\tjava.lang.Boolean idIfCond_382 = false;\n\tidIfCond_382 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp95.getName()), 4);\n\n\tif( idIfCond_382 ) {\n\n\tidIfCond_381 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp95.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_381 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_381 ) {\n\n\tresult_ft95.add(elem_ft95);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft94 = result_ft95.iterator();\n\tjava.lang.Boolean idLoopCond_379 = false;\n\twhile( !idLoopCond_379 ) {\n\tidLoopCond_379 = it_ft94.isOff();\n\tif ( idLoopCond_379 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp94 = it_ft94.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp94.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Run all the tests in the test suite\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_383 = false;\n\twhile( !idLoopCond_383 ) {\n\tidLoopCond_383 = it_ft96.isOff();\n\tif ( idLoopCond_383 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp96 = it_ft96.next();\n\n\tt_lbdExp96.setLogKermeta(this.getLog());\n\n\tt_lbdExp96.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * to be written #####################################################\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft98 = null;\n\n\tkermeta.language.structure.Operation elem_ft98 = null;\n\n\tresult_ft98 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft98 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_385 = false;\n\twhile( !idLoopCond_385 ) {\n\tidLoopCond_385 = it_ft98.isOff();\n\tif ( idLoopCond_385 ) {\n\t} else {\n\n\telem_ft98 = it_ft98.next();\n\n\tjava.lang.Boolean idIfCond_386 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp98 = elem_ft98;\n\n\tjava.lang.Boolean idIfCond_387 = false;\n\tidIfCond_387 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp98.getName()), 4);\n\n\tif( idIfCond_387 ) {\n\n\tidIfCond_386 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp98.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_386 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_386 ) {\n\n\tresult_ft98.add(elem_ft98);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft97 = result_ft98.iterator();\n\tjava.lang.Boolean idLoopCond_384 = false;\n\twhile( !idLoopCond_384 ) {\n\tidLoopCond_384 = it_ft97.isOff();\n\tif ( idLoopCond_384 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp97 = it_ft97.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp97.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
