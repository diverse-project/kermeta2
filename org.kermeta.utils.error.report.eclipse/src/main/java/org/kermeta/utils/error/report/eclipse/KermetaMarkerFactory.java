/* $Id: $
 * Project    : org.kermeta.utils.error.report.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 8 sept. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.utils.error.report.eclipse;

public class KermetaMarkerFactory {

	/**
	 * Instance of the singleton factory
	 */
	public static KermetaMarkerFactory instance = new KermetaMarkerFactory();

	/**
	 * Retrieve the factory instance
	 * @return
	 */
	public static KermetaMarkerFactory getInstance() {
		return instance;
	}
	
	public KermetaMarker createKermetaMarker(){
		KermetaMarker marker = new KermetaMarker();
		return marker;
	}
	
}
