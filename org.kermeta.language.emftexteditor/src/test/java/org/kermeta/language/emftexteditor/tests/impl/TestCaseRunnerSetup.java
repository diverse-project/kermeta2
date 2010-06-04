package org.kermeta.language.emftexteditor.tests.impl;

import org.kermeta.language.emftexteditor.tests.GenerateKmK;
import org.kermeta.language.emftexteditor.tests.GenerateKmtK;
import org.kermeta.language.emftexteditor.tests.utility.FileUtility;

import junit.framework.TestCase;

public abstract class TestCaseRunnerSetup extends TestCase {

	protected String basePATH = "";
	
	public TestCaseRunnerSetup() {
		super();
		basePATH = this.getClass().getResource("/").getPath();
	}

	public TestCaseRunnerSetup(String name) {
		super(name);
		basePATH = this.getClass().getResource("/").getPath();
	}

	public void processParser(String testcase) {

		/*
		 * if(testcase.equalsIgnoreCase(
		 * "testCases/001a_testRequireDeclarationBis.kermeta"))
		 * assertTrue(true);
		 */
		//String basePATH = this.getClass().getResource("/").getPath();
		String kermetaPATH = "";
		String kmPATH = "";
		String path = "";

		kermetaPATH = basePATH + testcase;
		String last = testcase.substring(0, testcase.length() - 7);
		kmPATH = basePATH.concat(last.replace("KermetaParserInput","expectedKmOutput")).concat("km");
		
		System.out.println("TestCase Process Begin on : " + kermetaPATH);
		System.out.println("basePATH" + basePATH);
		System.out.println("kermetaPATH" + kermetaPATH);
		System.out.println("kmPATH" + kmPATH+"\n");

		// Step 1 : Run the generate km
		try {
			int index = 0;

			GenerateKmK.run(kermetaPATH, "km");
			index = kermetaPATH.length();
			path = kermetaPATH.substring(0, index - 7);
			//System.out.println("PATH " + path + "\n");
			FileUtility.compareFiles(kmPATH, path.concat("km"));

			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}

	}

	// TODO set up the URI and fix GenerateKmtK(..) file empty produced
	public void processPrinter(String testcase) {

		/*
		 * if(testcase.equalsIgnoreCase(
		 * "testCases/001a_testRequireDeclarationBis.kermeta"))
		 * assertTrue(true);
		 */
		String basePATH = this.getClass().getResource("/").getPath();
		String kermetaPATH = "";
		String kmPATH = "";
		String path = "";

		kermetaPATH = basePATH + "testCases/expectedKermetaOutput/"
				+ "001_testRequireDeclaration.kermeta";
		kmPATH = basePATH + testcase;

		System.out.println("TestCase Process Begin on : " + kermetaPATH + "\n");
		System.out.println("basePATH" + basePATH);
		System.out.println("kermetaPATH" + kermetaPATH);
		System.out.println("kmPATH" + kmPATH);

		// Step 1 : Run the generate km
		try {
			int index = 0;

			// GenerateKmtK.run(kmPATH, "kermeta");
			GenerateKmtK.run(kmPATH, "kermeta");
			index = kmPATH.length();
			path = kmPATH.substring(0, index - 2);
			//System.out.println("PATH " + path + "\n");
			FileUtility.compareFiles(kermetaPATH, path.concat("kermeta"));

			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}

	}
}