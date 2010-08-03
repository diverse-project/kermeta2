/* $Id: $
 * Project    : org.kermeta.language.checker
 * File       : PortCheckerTest.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 3 août 2010
 * Authors : 
 *           Jacques Falcou <jacques.falcou@inria.fr> 
 */
package org.kermeta.language.checker.art2.impl;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PortCheckerTest extends TestCase {

	
	public void testCheck() {
		
		CheckerComponentPORTchecker myComp = CheckerComponentFactory.createCheckerComponentPORTchecker();
		
		myComp.check(null);
		
		Assert.assertNotNull(myComp);
	}
}
