package org.kermeta.language.checker.art2.impl;

import org.kermeta.scala.parser.ParserUtil;

import junit.framework.TestCase;


public class LoaderTest extends TestCase {

	public void testLoad() {
		String myFile = "C:\\Users\\jfalcou\\Desktop\\KermetaV2\\eclipseTest\\eclipse\\workspace\\org.kermeta.language.checker\\src\\test\\resources\\file.kmt";

        System.out.println("["+ ParserUtil.loadFile(myFile)+"]" );

	}
}
