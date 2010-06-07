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
	004_testPackagesDeclaration
*/
	
	@Before
	public void testGenerateTestCases() {

		try {
			String directory = basePATH + "testCases/KermetaParserInput";
			String filtre = "(\\d*_\\w*)(.kermeta)";
			Pattern p = Pattern.compile(filtre);
			String[] s = new File(directory).list();
			if (s != null) {
				Arrays.sort(s);
			}
			/*String path = "/home/hrambelo/Applications/Eclipses/32/E_CodeCamp_Kermeta/workspace/org.kermeta.language.emftexteditor.tests/"
					+ "/src/test/java/org/kermeta/language/emftexteditor/tests/TestCaseParserRunnerGen.java";*/
			String path = basePATH + "../../src/test/java/org/kermeta/language/emftexteditor/tests/gen/TestCaseParserRunnerGen.java";
			//System.out.println(path);
			OutputStream out = new FileOutputStream(path);
			PrintWriter writer = new PrintWriter(out);
			String cmd = "package org.kermeta.language.emftexteditor.tests.gen;"
						+ "\n\nimport org.junit.Test; "
						+ "\nimport org.kermeta.language.emftexteditor.tests.impl.TestCaseRunnerSetup;"
						+ "\n\n/** " 
						+ "\n* Automatically generated from TestCaseParserRunner.java " 
						+ "\n* @author hrambelo " 
						+ "\n* " 
						+ "\n*/" 
						+ "\npublic class TestCaseParserRunnerGen extends TestCaseRunnerSetup { ";

			String cmdGen = "";
			if (s!=null){
				for (int i = 0; i < s.length; i++) {
					Matcher m = p.matcher(s[i]);
					if (m.matches()) {
						//System.out.println(m.group(1));
	
						cmdGen = cmdGen + "\n\n\t@Test" + "\n	public void test"+m.group(1)+"(){ "
								+ "\n\tprocessParser(\"testCases/KermetaParserInput/"
								+ m.group(1) + ".kermeta\");" + "\n\t}";
					}
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
