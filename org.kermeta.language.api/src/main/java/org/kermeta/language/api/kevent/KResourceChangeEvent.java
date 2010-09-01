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
 * This class manages events that represents a change on a resource.
 * @author mgouyett
 *
 */
public class KResourceChangeEvent extends KEvent {
	

	/**
	 * URI of the resource that have changed.
	 */
	protected String URI;

	/**
	 * Constructor
	 * @param qualifiedName : qualifiedName of element on which event appear
	 * @param URI : URI of the changed resource
	 */
	public KResourceChangeEvent(String qualifiedName, String URI) {
		super(qualifiedName);
		this.URI = URI;
		// TODO Auto-generated constructor stub
	}

}

