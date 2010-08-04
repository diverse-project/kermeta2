/* $Id:  $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2 ao�t 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.language.api;

public class KermetaMessage {
	
	// Kind of message
	public enum Level {ERROR, WARNING, INFO, DEBUG};
	
	// Message to transmit
	private String message;
	
	private Level level;
	
	// Name of the element related to the message
	private String qualifier;
	
	private Throwable exception;
	
	public KermetaMessage(String message, String qualifier, Level level) {
		this.message =message;
		this.qualifier = qualifier;
		this.level = level;
	}
	
	public KermetaMessage(String message, String qualifier, Level level , Throwable exception){
		this.message = message;
		this.qualifier = qualifier;
		this.level = level;
		this.exception = exception;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Level getLevel() {
		return level;
	}
	
	public void setLevel(Level level) {
		this.level = level;
	}
	
	public String getQualifier() {
		return this.qualifier;
	}
	
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}
	
	public Throwable getException() {
		return this.exception;
	}
	
	public void setException(Throwable exception) {
		this.exception = exception;
	}

}

