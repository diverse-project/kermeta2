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
import java.io.IOException;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.console.MessageConsole;
import org.kermeta.language.api.KermetaMessage;
import org.kermeta.language.api.KermetaMessage.Level;
import org.kermeta.utils.logger.eclipse.logger_console.LoggerConsole;
import org.kermeta.utils.logger.eclipse.messages.ConsoleMessage;
import org.kermeta.utils.logger.eclipse.messages.ConsoleMessageFactory;

public class LoggerConsoleFactory implements IConsoleFactory {

	public void openConsole() {
		
		LoggerConsole console = new LoggerConsole("Log console" , null);
		ConsoleMessage message = ConsoleMessageFactory.getInstance().createInfoMessage("info message", "qualifier");
		ConsoleMessage message2 = ConsoleMessageFactory.getInstance().createDebugMessage("debug message", "qualifier");
		console.println(message);
		console.println(message2);
		console.print("Write:");
		
	}

}

