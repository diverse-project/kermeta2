/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */
package org.kermeta.scala.parser.art2.impl;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.ktoken.IKToken;
import org.kermeta.language.api.port.PortLexer;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.scala.parser.KParser;
import org.kermeta.scala.parser.ParserUtil;
import org.kermeta.language.lexer.KMLexer;

import scala.util.parsing.combinator.token.Tokens.Token;

/**
 *
 * @author ffouquet
 */

@Provides({
	@ProvidedPort(name="KMTloader", className=PortResourceLoader.class),
	@ProvidedPort(name="KMTlexer", className=PortLexer.class)
	}		
)

@Library(name= "KMTloaderComponent")
@ComponentType
public class Art2ComponentLoader extends AbstractComponentType implements org.kermeta.language.api.port.PortResourceLoader {
	
    @Port(name="KMTloader", method="load")
    public ModelingUnit load(String uri, org.kermeta.language.api.port.PortResourceLoader.URIType type) {

        KParser parser = new KParser();

        return parser.parseSynch(ParserUtil.loadFile(uri)).get();

    }
    
    @Port(name="KMTlexer", method="lex")
    public IKToken lex(String content) {
    	org.kermeta.language.api.ktoken.IKToken actualToken = null;
        KMLexer lexer = new KMLexer(content);
        try{
			Object t = lexer.nextToken();
			if(t instanceof org.kermeta.language.api.ktoken.IKToken){
				actualToken = ( org.kermeta.language.api.ktoken.IKToken) t;
			}
		} catch (Exception e){
		}
        return actualToken;

    }
}
