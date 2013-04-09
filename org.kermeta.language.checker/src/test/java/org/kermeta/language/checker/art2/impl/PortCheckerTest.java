 /* $Id: $
 * Project    : org.kermeta.language.checker
 * File       : PortCheckerTest.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 3 aot 2010
 * Authors : 
 *           Jacques Falcou <jacques.falcou@inria.fr> 
 */
package org.kermeta.language.checker.art2.impl;

import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.scala.parser.KParser;
import org.kermeta.scala.parser.ParserUtil;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PortCheckerTest extends TestCase {

	
	/*public void testCheck() {
		
		Art2ComponentCheckerPORTchecker myComp = Art2ComponentCheckerFactory.createArt2ComponentCheckerPORTchecker(
														Art2ComponentCheckerFactory.createArt2ComponentChecker());
		
		//myComp.check(null);

                
		Assert.assertNotNull(myComp);
		Assert.assertTrue(true);
	}*/
	
	public void testLoadFile() {
		
		String myFile = "C:\\Users\\jfalcou\\Desktop\\KermetaV2\\eclipseTest\\eclipse\\workspace\\org.kermeta.language.checker\\src\\test\\resources\\file.kmt";
		
        KParser parser = new KParser();

        //return parser.parseSynch(ParserUtil.loadFile(uri)).get();

        //System.out.println( ParserUtil.loadFile(myFile) );
        String fileTest = ParserUtil.loadFile(myFile);
        
        System.out.println("File content : [" + fileTest + "]");
                
        ModelingUnit mu = null;
		try {
			mu = parser.parse(fileTest).get();
			
			System.out.println("ModelingUnit : " + mu.getName());

			System.out.println(" Nb of Packages : " + mu.getPackages().size());
	        for (org.kermeta.language.structure.Package p : mu.getPackages()) {
				System.out.println(" -> package : " + p.getName());
			}
			
			//Art2ComponentChecker myChecker = Art2ComponentCheckerFactory.createArt2ComponentChecker();
			//myChecker.check(mu);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}
	
}
