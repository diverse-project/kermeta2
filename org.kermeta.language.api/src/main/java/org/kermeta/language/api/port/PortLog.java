/* $Id:  $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 6 ao�t 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.language.api.port;

import org.kermeta.language.api.KermetaMessage;

public interface PortLog {
	
	public void sendMessage (KermetaMessage message); 

}

