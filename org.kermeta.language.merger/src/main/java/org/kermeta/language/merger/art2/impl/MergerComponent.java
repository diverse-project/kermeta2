/* $Id: $
 * Project    : org.kermeta.language.merger
 * File       : MergerComponent.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Aug 13, 2010
 * Authors : 
 *           Mickael Clavreul <mclavreu@irisa.fr> 
 */
package org.kermeta.language.merger.art2.impl;

import java.util.Collection;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.structure.ModelingUnit;

@Provides({
	@ProvidedPort(name="mergerPort",className=PortKmMerger.class)
})
@ComponentType(libName="org.kermeta.language.MergerComponent")
public class MergerComponent extends AbstractComponentType {
	@Port(name="mergerPort", method="merge")
	public ModelingUnit merge(ModelingUnit first_mu,ModelingUnit second_mu, Collection<String> directives){
		return null;
	}
}
