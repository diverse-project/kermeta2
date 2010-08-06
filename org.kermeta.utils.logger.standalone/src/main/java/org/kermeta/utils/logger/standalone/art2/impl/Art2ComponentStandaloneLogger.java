/* $Id:  $
 * Project    : org.kermeta.utils.logger.standalone
 * File       : Art2ComponentStandaloneLogger.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 juil. 2010
 * Authors : 
 *          Didier Vojtisek  <didier.vojtisek@inria.fr> 
 */
package org.kermeta.utils.logger.standalone.art2.impl;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.KermetaMessage;
import org.kermeta.utils.logger.standalone.treatment.LoggerStandalone;
//import org.kermeta.art2.framework.MessagePort;

@Provides({
    @ProvidedPort(name = "log", type=PortType.MESSAGE)
})
@ComponentType(libName = "standaloneLogger")
public class Art2ComponentStandaloneLogger extends AbstractComponentType {

	@Port(name="log",method="sendMessage")
    public void sendMessage(KermetaMessage kermetaMessage){
        LoggerStandalone logger = new LoggerStandalone();
        logger.displayMessage(kermetaMessage);
    }
}
