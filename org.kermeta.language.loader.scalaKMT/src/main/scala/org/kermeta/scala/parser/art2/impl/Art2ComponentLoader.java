/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.scala.parser.art2.impl;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.scala.parser.KParser;
import org.kermeta.scala.parser.ParserUtil;

/**
 *
 * @author ffouquet
 */

@Provides({
	@ProvidedPort(name="KMTloader", className=PortResourceLoader.class)
	}		
)

@ComponentType(libName="KMTloaderComponent")
public class Art2ComponentLoader extends AbstractComponentType {//implements org.kermeta.language.api.port.PortResourceLoader {

    @Port(name="KMTloader", method="load")
    public ModelingUnit loadResource(String uri, org.kermeta.language.api.port.PortResourceLoader.URIType type) {

        KParser parser = new KParser();

        parser.parseSynch(ParserUtil.loadFile(uri)).get();
        return null;

    }
}
