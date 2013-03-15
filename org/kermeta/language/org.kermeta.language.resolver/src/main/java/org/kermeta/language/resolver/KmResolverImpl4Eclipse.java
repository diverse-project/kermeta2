/*$Id:  $
 * License : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : 19 avr. 2011
 * Authors : 
 *      Didier Vojtisek <didier.vojtisek@inria.fr>
 *      Cédric Bouhours <cedric.bouhours@inria.fr>
 */
package org.kermeta.language.resolver;

import kermeta.standard.JavaConversions;
import org.kermeta.language.resolver.api.KmResolver;
import org.kermeta.language.resolver.internal.Activator;
import org.kermeta.language.resolver.internal.KmResolverOperations;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class KmResolverImpl4Eclipse implements KmResolver {

	KmResolverOperations operations = null;
		
	/** constructor for use in standalone mode, where we must set the MessagingSystem for internal logging
	 * 
	 * @param logger, if null will use the default System.out MessagingSystem
	 */
	public KmResolverImpl4Eclipse(MessagingSystem logger){ 
		org.kermeta.language.language.resolverrunner.MainRunner.init4eclipse();
		Activator.getDefault().reflexivityLoaderContext();
		FullStaticResolver resolver = org.kermeta.language.resolver.KerRichFactory.createFullStaticResolver();
		operations = new KmResolverOperations(resolver, logger);
	}

	@Override
	public ErrorProneResult<ModelingUnit> doResolving(ModelingUnit mu) {	  	
		ErrorProneResult<ModelingUnit> result = operations.doResolving(mu);
		// make sure to clean the memory
		JavaConversions.cleanCache();
        return result;
	}

	@Override
	public ErrorProneResult<ModelingUnit> doStaticSetting(ModelingUnit mu) {		
		ErrorProneResult<ModelingUnit> result = operations.doStaticSetting(mu);
		// make sure to clean the memory
		JavaConversions.cleanCache();
        return result;
	}

	@Override
	public ErrorProneResult<ModelingUnit> resolve(ModelingUnit mu) {    	
		ErrorProneResult<ModelingUnit> result = operations.resolve(mu);
		// make sure to clean the memory
		JavaConversions.cleanCache();
        return result;
	}
}
