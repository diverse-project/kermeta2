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
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.Library;
import org.kermeta.language.api.kevent.KEvent;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKEvent;
import org.osgi.framework.Bundle;


/**
 * Implementation of a workflow component that manages KEvent sent to it doing the adequate action associated with these KEvent.
 * @author mgouyett
 *
 */

@Provides({
	@ProvidedPort(name="kevent", type=PortType.SERVICE,  className=PortKEvent.class)
	}		
)


@Requires({
    //@ProvidedPort(name = "asynclog", type=PortType.MESSAGE),
	/**
	 * Log port for sending technical messages
	 */
	@RequiredPort(name = "log", type=PortType.MESSAGE)
})


@Library(name= "org.kermeta.language")
@ComponentType
public class Art2ComponentKWF extends AbstractComponentType  implements org.kermeta.language.api.port.PortKEvent{
	
	protected String bundleSymbolicName="";
	protected Bundle bundle;
	protected MessagePort logPort=null;
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	
	/**
	 * As it uses UI declaration via plugin.xml, this component is a singleton in Eclipse
	 */
	protected static Art2ComponentKWF instance;
	public static Art2ComponentKWF getDefault(){
		return instance;
	}
	
	public String getBundleSymbolicName(){
		return bundleSymbolicName;
	}
	public Bundle getBundle(){
		return bundle;
	}
	
	@Start
	public void start(){
		instance =  this;
		logPort = getPortByName("log", MessagePort.class);
		bundle = (Bundle)this.getDictionary().get("osgi.bundle");
		bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
		System.out.println("Successfully started KWF");
		logPort.process(mFactory.createDebugMessage("Successfully started KWF" , bundleSymbolicName));
	}
	
	@Stop
	public void stop() {
		
	}

	@Port(name="kevent", method="processKEvent")
	public void processKEvent(KEvent event) {
		//log the incoming event
		logPort.process(mFactory.createInfoMessage("KWF received new event : " + event, bundleSymbolicName));
		//Advanced event processing goes here : define action according to event type
		
	}

}

