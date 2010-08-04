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

import java.awt.MultipleGradientPaint.ColorSpaceType;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.kermeta.language.api.KermetaMessage;
import org.kermeta.language.api.KermetaMessage.Level;

public class LoggerConsoleFactory implements IConsoleFactory {

	public void openConsole() {
		ConsoleLogger clogger = new ConsoleLogger();
		Throwable exception = new Throwable("Exception : define cause of the exception");
		KermetaMessage message = new KermetaMessage("Test info", "org.kermeta.utils.logger.eclipse",Level.ERROR, exception);
		IConsole consoleLogger = clogger.displayConsole(message); 
		IConsoleManager consoleManager =  ConsolePlugin.getDefault().getConsoleManager();
		//MessageConsole consoleLogger = ConsoleLogger.getInstance().getConsoleLogger();
		consoleManager.showConsoleView(consoleLogger);
	}

}

