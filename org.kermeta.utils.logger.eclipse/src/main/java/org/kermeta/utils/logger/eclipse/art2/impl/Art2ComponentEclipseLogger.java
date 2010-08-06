/* $Id:  $
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
import org.kermeta.language.api.KermetaMessage;
import org.kermeta.utils.logger.eclipse.logger_console.LoggerConsole;




@Provides({
    @ProvidedPort(name = "log", type=PortType.MESSAGE)
})
@ComponentType(libName = "standaloneLogger")
public class Art2ComponentEclipseLogger extends AbstractComponentType {
	LoggerConsole logger;
	
	@Port(name="log",method="process")
    public void process(Object o){ 
		if (o instanceof KermetaMessage) {
			KermetaMessage kermetaMessage = (KermetaMessage) o;
			logger.println(kermetaMessage);
		}
    }
	
	@Start
	public void start(){
		logger = new LoggerConsole("Logger Console",null);
	}
	
	
	
	@Stop
	public void stop(){
		//logger.destroy();
	}
	
	public LoggerConsole getLogger() {
		return logger;
	}
	
	
	
}

