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

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ConsoleLogger {
	
	public IConsole displayConsole(String message){
		// Create console
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = plugin.getConsoleManager();
		MessageConsole consoleLogger = new MessageConsole("LoggerEclipse",null);
		consoleManager.addConsoles(new IConsole[] {consoleLogger});
		
		// Display message on the console
		MessageConsoleStream log = consoleLogger.newMessageStream();
		log.println(message);	
		
		return consoleLogger;
		
	}

}

