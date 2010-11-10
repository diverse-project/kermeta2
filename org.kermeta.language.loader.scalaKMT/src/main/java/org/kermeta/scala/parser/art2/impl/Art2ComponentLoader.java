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

import java.util.ArrayList;
import java.util.List;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.ktoken.IKToken;
import org.kermeta.language.api.port.PortLexer;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.scala.parser.KParser;
import org.kermeta.scala.parser.ParserUtil;
import org.kermeta.language.lexer.KMLexer;
import scala.Option;

/**
 *
 * @author ffouquet
 */
@Provides({
    @ProvidedPort(name = "KMTloader", className = PortResourceLoader.class),
    @ProvidedPort(name = "KMTlexer", className = PortLexer.class)
})
@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentLoader extends AbstractComponentType implements org.kermeta.language.api.port.PortResourceLoader {

    @Port(name = "KMTloader", method = "load")
    public ModelingUnit load(String uri, org.kermeta.language.api.port.PortResourceLoader.URIType type) {

        KParser parser = new KParser();

        Option result = parser.parseSynch(ParserUtil.loadFile(uri));

        System.out.println("RESULT="+result);

        if(result.isEmpty()){
            return null;
        } else {
            return (ModelingUnit) result.get();
        }

    }

    @Port(name = "KMTlexer", method = "lex")
    public List<IKToken> lex(String content) {

        List<IKToken> result = new ArrayList<IKToken>();

        org.kermeta.language.api.ktoken.IKToken actualToken = null;
        KMLexer lexer = new KMLexer(content);

        while (lexer.atEnd()) {
            Object t = lexer.nextToken();
            result.add((IKToken) t);
        }

        return result;

    }

    @Start
    public void start() {
    }

    @Stop
    public void stop() {
    }
}
