/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.kunit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.TestRunner#getLog <em>Log</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getTestRunner()
 * @model annotation="kermeta documentation='/**\n * Create and use a test runner to run one or more tests and print the failure log. E.g.:\n * do\n *\t     var suite : TestSuite init TestSuite.new.addAllTestCasesFrom(InterestingTestCaseSet)\n *\t     var runner : TestRunner init TestRunner.new\n *\t     runner.run(suite)\n *\t     runner.printLogs\n * end\n *\n * Where InterestingTestCaseSet is a subclass of TestCase and contains several test... methods\n \052/'"
 *        annotation="kermeta CompilerIgnore='true'"
 * @generated
 */
public interface TestRunner extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference.
	 * @see #setLog(Log)
	 * @see kermeta.kunit.KunitPackage#getTestRunner_Log()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='/**\n\t * Where to register the failures and errors\n\t \052/'"
	 * @generated
	 */
	Log getLog();

	/**
	 * Sets the value of the '{@link kermeta.kunit.TestRunner#getLog <em>Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' containment reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(Log value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Use this to run a test case or a test suite.\n\t * If you want to run all the test.... methods in a TestCase class,\n\t *  you can populate a suite with TestSuite.addAllTestCasesFrom\n\t \052/'"
	 *        annotation="kermeta.pre testNotVoid=''"
	 *        annotation="kermeta.post logNotVoid=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__1390835__testNotVoid\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test, null);\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\tthis.setLog(((kermeta.kunit.Log) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getLog())));\n\n\ttest.setLogKermeta(this.getLog());\n\n\ttest.run();\n\n//PostConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"post__21887324__logNotVoid\" ) ) {\njava.lang.Boolean result_post = false;\n\n\tresult_post = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getLog(), null);\nif( !result_post ) {\nkermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}'"
	 * @generated
	 */
	void runTest(Test test);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Prints the log or errors and failures from a test run.\n\t * Run some tests first.\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n---------------------------------------------  TEST RESULTS-----------------------------------------------\\n\");\n\n\tjava.lang.Boolean idIfCond_392 = false;\n\tidIfCond_392 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).empty());\n\n\tif( idIfCond_392 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nFailures: \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Failure> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).iterator();\n\tjava.lang.Boolean idLoopCond_393 = false;\n\twhile( !idLoopCond_393 ) {\n\tidLoopCond_393 = it_ft101.isOff();\n\tif ( idLoopCond_393 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Failure f_lbdExp101 = it_ft101.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", f_lbdExp101.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tjava.lang.Boolean idIfCond_394 = false;\n\tidIfCond_394 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).empty());\n\n\tif( idIfCond_394 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nErrors: \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft102 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_395 = false;\n\twhile( !idLoopCond_395 ) {\n\tidLoopCond_395 = it_ft102.isOff();\n\tif ( idLoopCond_395 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Error e_lbdExp102 = it_ft102.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", e_lbdExp102.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tjava.lang.Boolean idIfCond_396 = false;\n\tidIfCond_396 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).empty());\n\n\tif( idIfCond_396 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nErrors from setUp or tearDown : \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_397 = false;\n\twhile( !idLoopCond_397 ) {\n\tidLoopCond_397 = it_ft103.isOff();\n\tif ( idLoopCond_397 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Error e_lbdExp103 = it_ft103.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", e_lbdExp103.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n Summary: \");\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of launched tests : \", kermeta.standard.helper.IntegerWrapper.toString(this.getLog().getRuntests())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of failures : \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of errors : \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of errors in setUp or tearDown: \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n-------------------------------------------------------------------------------------------------------------------------------\\n\");\n'"
	 * @generated
	 */
	void printTestResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * For backwards compatibility with old kunit, this takes a test case class\n\t  * and creates the necessary suite, and runs it. DEPRECATED\n\t  \052/'"
	 *        annotation="kermeta.pre cIsATestCase=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__3029491__cIsATestCase\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).contains(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\tthis.runTest(((kermeta.kunit.TestSuite) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getTestSuite())).addAllTestCasesFrom(testCaseClass));\n'"
	 * @generated
	 */
	void run(kermeta.language.structure.Class testCaseClass);

} // TestRunner
