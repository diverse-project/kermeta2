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

import org.eclipse.swt.graphics.Color;
import org.kermeta.language.api.KermetaMessage;

/**
 * This class extends KermetaMessage to give a specific color for each kind of messages.
 * @author mgouyett
 *
 */
public class ConsoleMessage extends KermetaMessage {
	
	// some default colors that can be used
	public static final Color INFO = new Color(null, 0,0,255);
	public static final Color ERROR = new Color(null, 192,0,0);
	public static final Color WARNING = new Color(null, 215,100,0);
	public static final Color DEBUG = new Color(null, 255,114,0);
	public static final Color DEFAULT = new Color(null, 0,0,0);
	
	// Color of the message
	private Color colorMessage;

	/**
	 * Constructor inherited from KermetaMessage 
	 * @param message : the message to display
	 * @param qualifier : the name of the element on which the message is applied
	 * @param level : the level of the message : DEBUG,INFO, WARNING,ERROR
	 * @param exception : the exception that causes the displaying of the message	
	 * @param color : the color for the displayed message	
	 */
	public ConsoleMessage(String message, String qualifier, Level level,
			Throwable exception, Color color) {
		super(message, qualifier, level, exception);
		this.colorMessage = color;
	}
	
	/**
	 * Constructor inherited from KermetaMessage
	 * @param message : the message to display
	 * @param qualifier : the name of the element on which the message is applied
	 * @param level : the exception that causes the displaying of the message
	 * @param color : the color for the displayed message		
	 */
	public ConsoleMessage(String message, String qualifier, Level level, Color color) {
		super(message, qualifier, level);
		this.colorMessage = color;
	}
	
	/**
	 * Change the message's color
	 * @param color : the new color for the displayed message
	 */
	public void setColorMessage(Color color) {
		this.colorMessage = color;
	}
	
	/**
	 * Retrieve the color of the displayed message.
	 * @return the color of the displayed message.
	 */
	public Color getColorMessage() {
		return this.colorMessage;
	}

}

