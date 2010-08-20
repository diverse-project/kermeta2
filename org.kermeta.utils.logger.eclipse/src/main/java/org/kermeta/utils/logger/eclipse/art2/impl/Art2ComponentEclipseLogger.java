/* $Id$
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 28 juil. 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.utils.logger.eclipse.art2.impl;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.messaging.UnifiedMessage;
import org.kermeta.utils.logger.eclipse.ConsoleMessageFactory;
import org.kermeta.utils.logger.eclipse.console.ConsoleIO;
import org.kermeta.utils.logger.eclipse.console.EclipseConsoleIOFactory;
import org.osgi.framework.Bundle;


/**
 * Implementation of a Message port dedicated to receive UnifiedMessage
 * and log them in Eclipse
 */

@Provides({
    @ProvidedPort(name = "log", type=PortType.MESSAGE)
})
@ComponentType(libName = "org.kermeta.utils")
public class Art2ComponentEclipseLogger extends AbstractComponentType {
	ConsoleIO logger;
	ConsoleMessageFactory consoleMessageFactory = new ConsoleMessageFactory();
	protected String consoleUId ;
	
	@Port(name="log",method="process")
    public void process(Object o){ 
		if (o instanceof UnifiedMessage) {
			// TODO filter Developer message if not required by the UI (preference page, and/or toggle button etc...)
			
			UnifiedMessage kermetaMessage = (UnifiedMessage) o;
			// build consoleMessage from unifiedMessage then print it
			logger.println(consoleMessageFactory.getConsoleMessage(kermetaMessage));
			// TODO also log errors and warnings to Eclipse log view
		}
    }
	
	@Start
	public void start(){
		Bundle b = (Bundle)this.getDictionary().get("osgi.bundle");
		String bundleSymbolicName = b.getHeaders().get("Bundle-SymbolicName").toString();
		consoleUId = bundleSymbolicName+this.hashCode();
		logger = EclipseConsoleIOFactory.getInstance().getConsoleIO(consoleUId, bundleSymbolicName + " console");
	}
	
	
	
	@Stop
	public void stop(){
		EclipseConsoleIOFactory.getInstance().removeConsoleIO(consoleUId);
	}
		
	
	
}

