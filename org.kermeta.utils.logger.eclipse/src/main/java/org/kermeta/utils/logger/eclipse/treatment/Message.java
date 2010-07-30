/* $Id:  $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 30 juil. 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.treatment;

public class Message {
	
	private String message;
	private String typeMessage;
	
	
	public Message(String message, String typeMessage) {
		this.message = message;
		this.typeMessage = typeMessage;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message, String type) {
		this.message = message;
		this.typeMessage = type;
	}
	
	public String getTypeMessage() {
		return typeMessage;
	}
 
}

