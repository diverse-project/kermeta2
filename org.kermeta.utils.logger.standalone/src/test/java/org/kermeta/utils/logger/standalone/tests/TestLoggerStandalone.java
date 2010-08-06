/* $Id:  $
 * Project    : org.kermeta.utils.logger.standalone
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 4 aout 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.standalone.tests;

import org.kermeta.language.api.KermetaMessage;
import org.kermeta.utils.logger.standalone.art2.impl.Art2ComponentStandaloneLogger;
import org.kermeta.utils.logger.standalone.treatment.LoggerStandalone;

public class TestLoggerStandalone {
	
	public static void testInfoMessage(Art2ComponentStandaloneLogger comp) {
		KermetaMessage info = new KermetaMessage("Test info", "org.kermeta.utils.logger.standalone.tests", KermetaMessage.Level.INFO);
		System.out.println("Test info message");
		comp.getLogger().displayMessage(info);
		System.out.println("");
	}
	
	public static void testErrorMessage(Art2ComponentStandaloneLogger comp) {
		Throwable exception = new Throwable("Exception : Explanation of the exception");
		KermetaMessage error = new KermetaMessage("Test error", "org.kermeta.utils.logger.standalone.tests", KermetaMessage.Level.ERROR, exception);
		System.out.println("Test error message");
		comp.getLogger().displayMessage(error);
		System.out.println("");
	}
	
	
	
	public static void main(String [] arg){
		Art2ComponentStandaloneLogger comp = new Art2ComponentStandaloneLogger();
		comp.start();
		testInfoMessage(comp);
		testErrorMessage(comp);
	}

}

