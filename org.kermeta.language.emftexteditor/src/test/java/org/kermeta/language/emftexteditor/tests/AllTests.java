package org.kermeta.language.emftexteditor.tests;


import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.emftexteditor.tests.gen.TestCaseParserRunnerGen;
import org.kermeta.language.emftexteditor.tests.impl.TestCaseParserRunner;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.kermeta.language.emftexteditor.tests");

		suite.addTestSuite(TestCaseParserRunner.class);
		suite.addTestSuite(TestCaseParserRunnerGen.class);
		return suite;
	}

}
