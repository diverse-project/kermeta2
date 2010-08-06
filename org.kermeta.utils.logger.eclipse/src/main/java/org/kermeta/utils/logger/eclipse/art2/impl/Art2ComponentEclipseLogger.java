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
import org.kermeta.art2.framework.AbstractComponentType;
//import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.KermetaMessage;
import org.kermeta.utils.logger.eclipse.logger_console.LoggerConsole;
import org.kermeta.utils.logger.eclipse.messages.ConsoleMessage;
import org.kermeta.utils.logger.eclipse.messages.ConsoleMessageFactory;


@Provides({
    @ProvidedPort(name = "log", type=PortType.MESSAGE)
})
@ComponentType(libName = "standaloneLogger")
public class Art2ComponentEclipseLogger extends AbstractComponentType {

	@Port(name="log",method="process")
    public void processMsg(Object o){
		KermetaMessage kermetaMessage = (KermetaMessage) o;
        LoggerConsole logger = new LoggerConsole("LoggerConsole",null);
        logger.println(kermetaMessage);
    }
}

