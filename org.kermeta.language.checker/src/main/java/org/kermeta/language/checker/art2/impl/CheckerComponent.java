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
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.ConstraintsDiagnostic;
import org.kermeta.language.api.port.PortChecker;
import org.kermeta.language.structure.ModelingUnit;

@Provides({
    @ProvidedPort(name="checker",className=PortChecker.class)
})
@ComponentType(libName = "checker")
public class CheckerComponent extends AbstractComponentType {

	
    @Port(name="checker",method="check")
    public ConstraintsDiagnostic check(ModelingUnit mu){
        return null;
    }
	
}
