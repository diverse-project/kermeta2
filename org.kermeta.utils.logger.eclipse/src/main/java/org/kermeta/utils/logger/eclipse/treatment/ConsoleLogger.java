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

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.kermeta.language.api.KermetaMessage;

public class ConsoleLogger {
	
	private MessageConsole consoleLogger;
	private static ConsoleLogger instance = new ConsoleLogger();
	
	public ConsoleLogger() {
		/*ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = plugin.getConsoleManager();
		MessageConsole consoleLogger = new MessageConsole("Logger Eclipse",null);
		consoleManager.addConsoles(new IConsole[] {consoleLogger}); */
	}
	
	public IConsole displayConsole(KermetaMessage message){
		// Create console
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = plugin.getConsoleManager();
		MessageConsole consoleLogger = new MessageConsole("Logger Eclipse",null);
		consoleManager.addConsoles(new IConsole[] {consoleLogger}); 
		
		// Display message on the console
		MessageConsoleStream log = consoleLogger.newMessageStream();
		Color color = ColorMessages.getInstance().getColor(message.getLevel());
		log.setColor(color);
		String display = "["+ message.getLevel() + "]" + "	" + "[" + message.getQualifier()+ "]" + "	" + message.getMessage();
		if (message.getException() != null) {
			display += "	" + message.getException().getMessage();
		}
		log.println(display);
		
		return consoleLogger;
		
	}
	
	public static ConsoleLogger getInstance() {
		return instance;
	}
	
	public MessageConsole getConsoleLogger() {
		return this.consoleLogger;
	}

}

