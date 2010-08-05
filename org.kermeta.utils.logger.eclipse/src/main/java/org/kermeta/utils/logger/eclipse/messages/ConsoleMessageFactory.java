/* $Id:  $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 5 août 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.messages;

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
	
	/**
	 * Create a new info message to display.
	 * @param message : the message to display
	 * @param qualifier : the name of the element related to the message
	 * @return the new ConsoleMessage created
	 */
	public ConsoleMessage createInfoMessage(String message, String qualifier) {
		ConsoleMessage messageInfo = new ConsoleMessage(message, qualifier, Level.INFO, ConsoleMessage.INFO);
		return messageInfo;
	}
	
	/**
	 * Create a new debug message to display
	 * @param message : the message to display
	 * @param qualifier : the name of the element related to the message
	 * @return the new ConsoleMessage created
	 */
	public ConsoleMessage createDebugMessage (String message, String qualifier){
		ConsoleMessage messageDebug = new ConsoleMessage(message, qualifier,Level.DEBUG, ConsoleMessage.DEBUG);
		return messageDebug;
	}
	
	/**
	 * Create a new warning message to display
	 * @param message : the message to display
	 * @param qualifier : the name of the element related to the message
	 * @return the new ConsoleMessage created
	 */
	public ConsoleMessage createWarningMessage (String message, String qualifier) {
		ConsoleMessage messageWarning = new ConsoleMessage(message, qualifier, Level.WARNING,ConsoleMessage.WARNING);
		return messageWarning;
	}
	
	/**
	 * Create a new error message (without exception) to display
	 * @param message : the message to display
	 * @param qualifier : the name of the element related to the message
	 * @return the new ConsoleMessage created
	 */
	public ConsoleMessage createErrorMessage (String message, String qualifier) {
		ConsoleMessage messageError = new ConsoleMessage (message, qualifier, Level.ERROR, ConsoleMessage.ERROR);
		return messageError;
	}
	
	/**
	 * Create a new error message (with exception) to display
	 * @param message : the message to display
	 * @param qualifier : the name of the element related to the message
	 * @param exception : the exception caused by the qualifier
	 * @return the new ConsoleMessage created
	 */
	public ConsoleMessage createErrorMessageWithException(String message, String qualifier, Throwable exception ){
		ConsoleMessage errorException = new ConsoleMessage(message, qualifier, Level.ERROR, exception, ConsoleMessage.ERROR);
		return errorException;
	}
	
	/**
	 * Create a message to display an object
	 * @param object : the object to display
	 * @return the new ConsoleMessage created
	 */
	public ConsoleMessage createMessageToDisplayObject(Object object) {
		ConsoleMessage displayObject = new ConsoleMessage(object.toString(), "", Level.DEFAULT, ConsoleMessage.DEFAULT);
		return displayObject;
	}
	
	
	
	
	
	

}

