
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
 * This class manages event that represent an addition on a resource. 
 * @author mgouyett
 *
 */
public class KResourceAddEvent extends KResourceChangeEvent {

	/**
	 * Constructor
	 * @param qualifiedName : qualifiedName of element on which event appear.
	 * @param URI : URI of the changed resource
	 */
	public KResourceAddEvent(String qualifiedName, String URI) {
		super(qualifiedName, URI);
		// TODO Auto-generated constructor stub
	}

}

