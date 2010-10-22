

/* $Id: $
 * Project    : org.kermeta.language.checker
 * File       : CheckerComponentTestSuite.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 3 aot 2010
 * Authors : 
 *           Jacques Falcou <jacques.falcou@inria.fr> 
 */

package org.kermeta.language.checker;

import org.kermeta.language.checker.art2.impl.LoaderTest;
import org.kermeta.language.checker.art2.impl.PortCheckerTest;

import junit.framework.Test;
import junit.framework.TestSuite;




public class CheckerComponentTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("PortCheckerTestSuite");
		//$JUnit-BEGIN$
		suite.addTestSuite(PortCheckerTest.class);
		//suite.addTestSuite(LoaderTest.class);
		//$JUnit-END$
		return suite;
	}

}
