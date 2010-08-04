/* $Id:  $
 * Project    : org.kermeta.utils.logger.standalone
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 4 août 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.standalone.treatment;

import org.kermeta.language.api.KermetaMessage;



public class LoggerStandalone {
	
	public void displayMessage(KermetaMessage message) {
		String display = "["+ message.getLevel() + "]" + "	" + "[" + message.getQualifier()+ "]" + "	" + message.getMessage();
		if (message.getException() != null) {
			display += "	" + message.getException().getMessage();
		}
			System.out.println(display);
	}

}

