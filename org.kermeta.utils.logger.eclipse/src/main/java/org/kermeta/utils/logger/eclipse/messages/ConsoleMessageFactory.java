/* $Id:  $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 5 aout 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.messages;

import org.eclipse.swt.graphics.Color;
import org.kermeta.language.api.KermetaMessage;
import org.kermeta.language.api.KermetaMessage.Level;


/**
 * This class is a factory for messages displayed on the console : info, debug, error or warning messages.
 * This factory is a singleton.
 * @author mgouyett
 *
 */
public class ConsoleMessageFactory {
	
	private static ConsoleMessageFactory instance = new ConsoleMessageFactory();
	
	/**
	 * Retrieve the factory as a singleton.
	 * @return
	 */
	public static ConsoleMessageFactory getInstance() {
		return instance;
	}
	
	public ConsoleMessage createConsoleMessage(KermetaMessage message) {
		Color color = MapColorMessage.getInstance().getColor(message.getLevel());
		ConsoleMessage consoleMessage;
		if (!message.existException()) {
		consoleMessage = new ConsoleMessage(message.getMessage(), message.getQualifier(),message.getLevel(), color);
		}
		else {
			 consoleMessage = new ConsoleMessage(message.getMessage(), message.getQualifier(),message.getLevel(),message.getException(), color);
		}
		return consoleMessage;
	}
	
	
	
	
	
	

}

