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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__16167547__testCaseClassIsATestCase\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).contains(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\t//BIft:exists\n\njava.lang.Boolean result_ft8 = null;\n\n\tjava.lang.Boolean test_ft8 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft8 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_35 = false;\n\twhile( !idLoopCond_35 ) {\n\tidLoopCond_35 = kermeta.standard.helper.BooleanWrapper.or(it_ft8.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft8, false));\n\tif ( idLoopCond_35 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft8 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp8 = it_ft8.next();\n\n\tresult_lambda_ft8 = org.kermeta.compil.runtime.helper.language.ClassUtil.equalsSwitcher(sc_lbdExp8, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft8 = kermeta.standard.helper.BooleanWrapper.or(test_ft8, result_lambda_ft8);\n}\n\t}\n}\n\n\n\tresult_ft8 = test_ft8;\n//EIft:exists\njava.lang.Boolean idIfCond_34 = false;\n\tidIfCond_34 = kermeta.standard.helper.BooleanWrapper.not(result_ft8);\n\n\tif( idIfCond_34 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getInvalidParameterException()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft10 = null;\n\n\tkermeta.language.structure.Operation elem_ft10 = null;\n\n\tresult_ft10 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft10 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_37 = false;\n\twhile( !idLoopCond_37 ) {\n\tidLoopCond_37 = it_ft10.isOff();\n\tif ( idLoopCond_37 ) {\n\t} else {\n\n\telem_ft10 = it_ft10.next();\n\n\tjava.lang.Boolean idIfCond_38 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp10 = elem_ft10;\n\n\tjava.lang.Boolean idIfCond_39 = false;\n\tidIfCond_39 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp10.getName()), 4);\n\n\tif( idIfCond_39 ) {\n\n\tidIfCond_38 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp10.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_38 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_38 ) {\n\n\tresult_ft10.add(elem_ft10);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft9 = result_ft10.iterator();\n\tjava.lang.Boolean idLoopCond_36 = false;\n\twhile( !idLoopCond_36 ) {\n\tidLoopCond_36 = it_ft9.isOff();\n\tif ( idLoopCond_36 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp9 = it_ft9.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp9.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Run all the tests in the test suite\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft11 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_40 = false;\n\twhile( !idLoopCond_40 ) {\n\tidLoopCond_40 = it_ft11.isOff();\n\tif ( idLoopCond_40 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp11 = it_ft11.next();\n\n\tt_lbdExp11.setLogEMF_renameAs(this.getLog());\n\n\tt_lbdExp11.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * to be written #####################################################\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft13 = null;\n\n\tkermeta.language.structure.Operation elem_ft13 = null;\n\n\tresult_ft13 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_42 = false;\n\twhile( !idLoopCond_42 ) {\n\tidLoopCond_42 = it_ft13.isOff();\n\tif ( idLoopCond_42 ) {\n\t} else {\n\n\telem_ft13 = it_ft13.next();\n\n\tjava.lang.Boolean idIfCond_43 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp13 = elem_ft13;\n\n\tjava.lang.Boolean idIfCond_44 = false;\n\tidIfCond_44 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp13.getName()), 4);\n\n\tif( idIfCond_44 ) {\n\n\tidIfCond_43 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp13.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_43 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_43 ) {\n\n\tresult_ft13.add(elem_ft13);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft12 = result_ft13.iterator();\n\tjava.lang.Boolean idLoopCond_41 = false;\n\twhile( !idLoopCond_41 ) {\n\tidLoopCond_41 = it_ft12.isOff();\n\tif ( idLoopCond_41 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp12 = it_ft12.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp12.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
