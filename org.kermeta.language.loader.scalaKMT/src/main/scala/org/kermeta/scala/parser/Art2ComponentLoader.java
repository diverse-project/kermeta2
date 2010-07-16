/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.scala.parser;

import org.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
 */
public class Art2ComponentLoader implements org.kermeta.language.api.port.PortResourceLoader {

    @Override
    public ModelingUnit load(String uri, org.kermeta.language.api.port.PortResourceLoader.URIType type) {

        KParser parser = new KParser();


        parser.parseSynch(ParserUtil.loadFile(uri)).get();
        return null;

    }
}
