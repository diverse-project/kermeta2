/* $Id: $
 * Project    : org.kermeta.language.KWF
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 sept. 2010
 * Authors : 
 *          Marie Gouyette <marie.gouyette@inria.fr> 
 */

package org.kermeta.language.kwf.art2.impl;


import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.language.api.port.PortKEvent;


/**
 * Implementation of a workflow component that manages KEvent sent to it doing the adequate action associated with these KEvent.
 * @author mgouyett
 *
 */

@Provides({
    //@ProvidedPort(name = "asynclog", type=PortType.MESSAGE),
    @ProvidedPort(name = "kevent", type=PortType.SERVICE, className=PortKEvent.class)
})


@ComponentType(libName = "org.kermeta.language")
public class Art2ComponentKWF extends AbstractComponentType {
	
	@Port(name="kevent",method="getKEvent")
	public void getKEvent(Object o) {
		
	}
	
	@Start
	public void start() {
		
	}
	
	@Stop
	public void stop() {
		
	}

}

