/* $Id:  $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 28 juil. 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.treatment;


import org.eclipse.ui.console.IConsoleFactory;
import org.kermeta.language.api.KermetaMessage;
import org.kermeta.language.api.KermetaMessageFactory;
import org.kermeta.utils.logger.eclipse.logger_console.LoggerConsole;


public class LoggerConsoleFactory implements IConsoleFactory {

	public void openConsole() {
		
		LoggerConsole console = new LoggerConsole("Log console" , null);
		
		KermetaMessage message = KermetaMessageFactory.getInstance().createInfoMessage("info message", "qualifier");
		KermetaMessage message2 = KermetaMessageFactory.getInstance().createDebugMessage("debug message", "qualifier");
		console.println(message);
		console.println(message2);
		console.print("Write:");  
		console.activate();
	} 

}

