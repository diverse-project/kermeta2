package org.kermeta.language.emftexteditor.tests.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.junit.Before;

public class TestCaseParserRunner extends TestCaseRunnerSetup {

/*Full list of tested feature inside TestCaseParserRunnerGen
	001_testRequireUsingPackageDeclaration
	002_testNestedPackage
	003_testRequire
	004_testPackagesDeclaration
	005_testSimpleType
	006_testMultiSimpleType
	007_testBehaviourSimpleCondition
	008_testSimplePackageDeclaration
	009_testNestedBlock
	010_testSimpleConditionStructure
	011_testPackageDeclarationWithURI
	012_testAssignment
	013_testEnum
	014_testArithm
	015_testOpCall
	016_testOpOpCall
	017_testExternPackageCall
	018_testOpPkgCall
	019_failtestExternPackageCall
	020_testExternPackageCall
	021_testExternPackageCall2
	022_testOpPkgCall
	022_testOpPkgCallBis
	023_testInterPackageCall
	024_testOpInternPkgCall
	025_testOpCallObject
	026_testBlock
	027_testBlocksSequence
	028_testCallExp
	029_testClass
	030_testConditional
	031_testCycleA
	032_testCycleB
	033_testCycleC
	034_testCycleD
	035_testCycleE
	036_testEnum
	037_testExpression
	038_testExtractOperation
	039_testGenericClass
	040_testImportAlias
	041_testInjectOperation
	042_testInterDependA
	043_testInterDependB
	044_testLambdaExpressionAsCallFeature
	045_testLoadStdLibSource
	046_testMCommentAlone
	047_testMCommentBegin
	048_testMCommentEmptyOp
	049_testMCommentInline
	050_testMCommentMany
	051_testMCommentMiddleOfLoop
	052_testModelType
	053_testModelTypesStateMachines
	054_testOperation
	055_testOperationOnObject
	056_testPackage
	057_testPackageDepA
	058_testPackageDepA2
	059_testPackageDepB
	060_testPackageDepB2
	061_testPackageDepC
	062_testPackageDepC2
	063_testPackageDepD
	064_testPackageDepD2
	065_testPrimitiveType
	066_testPrimitiveType2
	067_testProperty
	068_testResult
	069_testSCommentAlone
	070_testSCommentBegin
	071_testSCommentEmptyOp
	072_testSCommentEndOfFile
	073_testSCommentInline
	074_testSCommentMany
	075_testSCommentMiddleOfLoop
	076_testSimpleAnnotations
	077_testSimpleAnnotations2
	078_testSimpleCond
	079_testSimpleExpression
	080_testSimpleLoop
	081_testVariable
*/
	
	@Before
	public void testGenerateTestCases() {

		try {
			String directory = basePATH + "testCases/KermetaParserInput";
			String filtre = "(\\d*_\\w*)(.kermeta)";
			Pattern p = Pattern.compile(filtre);
			String[] s = new File(directory).list();
			Arrays.sort(s);
			/*String path = "/home/hrambelo/Applications/Eclipses/32/E_CodeCamp_Kermeta/workspace/org.kermeta.language.emftexteditor.tests/"
					+ "/src/test/java/org/kermeta/language/emftexteditor/tests/TestCaseParserRunnerGen.java";*/
			String path = basePATH + "../../src/test/java/org/kermeta/language/emftexteditor/tests/TestCaseParserRunnerGen.java";
			//System.out.println(path);
			OutputStream out = new FileOutputStream(path);
			PrintWriter writer = new PrintWriter(out);
			String cmd = "package org.kermeta.language.emftexteditor.tests;"
					+ "\n\nimport org.junit.Test; "
					+ "\n\n//Automatically generated from TestCaseParserRunner.java" +
							"\npublic class TestCaseParserRunnerGen extends TestCaseRunnerSetup { ";

			String cmdGen = "";
			for (int i = 0; i < s.length; i++) {
				Matcher m = p.matcher(s[i]);
				if (m.matches()) {
					//System.out.println(m.group(1));

					cmdGen = cmdGen + "\n\n\t@Test" + "\n	public void test"+m.group(1)+"(){ "
							+ "\n\tprocessParser(\"testCases/KermetaParserInput/"
							+ m.group(1) + ".kermeta\");" + "\n\t}";
				}
			}

			cmd = cmd + cmdGen + "\n}";
			writer.print(cmd);
			writer.flush();
			writer.close();

		} catch (PatternSyntaxException pse) {
			pse.printStackTrace();
			assertTrue(false);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
}
