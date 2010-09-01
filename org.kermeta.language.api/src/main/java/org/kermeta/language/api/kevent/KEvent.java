/* $Id: $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 sept. 2010
 * Authors : 
 *          Marie Gouyette <marie.gouyette@inria.fr> 
 */
package org.kermeta.language.api.kevent;

/**
 * 
 * @author mgouyett
 * KEvent is the common abstract class to represent all events that can be used with Kermeta.
 */
public  abstract class KEvent {
	
	/**
	 * Qualified names for elements on which an event appears.
	 */
	protected String qualifiedName;
	
	
	/**
	 * Constructor
	 * @param qualifiedName : qualifiedName of element on which event appear.
	 */
	public KEvent(String qualifiedName) {
		this.qualifiedName = qualifiedName;
	}

}

