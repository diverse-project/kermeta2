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
 * @author mgouyett KEvent is the common abstract class to represent all events
 *         that can be used with Kermeta.
 */
public abstract class KEvent {

	/**
	 * URI of the resource that have changed.
	 */
	protected String URI;

	/**
	 * Constructor
	 * 
	 */
	public KEvent(String URI) {
		this.URI = URI;
	}

}
