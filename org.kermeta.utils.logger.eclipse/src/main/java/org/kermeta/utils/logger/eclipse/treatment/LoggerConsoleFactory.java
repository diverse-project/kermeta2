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
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;

public class LoggerConsoleFactory implements IConsoleFactory {

	public void openConsole() {
		ConsoleLogger clogger = new ConsoleLogger();
		IConsole consoleLogger = clogger.displayConsole("Test logger");
		IConsoleManager consoleManager =  ConsolePlugin.getDefault().getConsoleManager();
		consoleManager.showConsoleView(consoleLogger);
	}

}

