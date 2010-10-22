/* $Id: $
 * Project    : org.kermeta.language.checker
 * File       : CheckerComponent.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 juil. 2010
 * Authors : 
 *           Jacques Falcou <jacques.falcou@inria.fr> 
 */
package org.kermeta.language.checker.art2.impl;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.Diagnostic;
import org.kermeta.language.api.DiagnosticImpl;
import org.kermeta.language.api.port.PortChecker;
import org.kermeta.language.checker.Checker;
import org.kermeta.language.checker.RichFactory;
import org.kermeta.language.structure.ModelingUnit;

@Provides({
    @ProvidedPort(name="checker", type=PortType.SERVICE, className=PortChecker.class)
})


@ComponentType(name = "org.kermeta.language")
public class Art2ComponentChecker extends AbstractComponentType implements PortChecker {

	@Start
	public void start(){
		/*instance =  this;
		logPort = getPortByName("log", PortLog.class);
		bundle = (Bundle)this.getDictionary().get("osgi.bundle");
		bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
		System.out.println("Successfully started KWF");
		logPort.log(mFactory.createDebugMessage("Successfully started KWF" , bundleSymbolicName));*/
	}
	
	@Stop
	public void stop() {
		
	}

	
    @Port(name="checker",method="check")
    public Diagnostic /*void */check(ModelingUnit mu){
    	
    	Checker myChecker =  RichFactory.createChecker();
    	
    	myChecker.check( (fr.irisa.triskell.kermeta.language.structure.ModelingUnit)  mu);
    	
        return new DiagnosticImpl(null);
    }
	
}
