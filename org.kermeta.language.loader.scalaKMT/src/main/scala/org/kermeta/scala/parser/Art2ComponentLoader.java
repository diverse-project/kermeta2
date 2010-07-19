/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */
package org.kermeta.scala.parser;

import org.kermeta.language.structure.ModelingUnit;

/**
 * Implementation of the ART port org.kermeta.language.api.port.PortResourceLoader
 * that loads a KMT file into a ModelingUnit 
 */
public class Art2ComponentLoader implements org.kermeta.language.api.port.PortResourceLoader {

    @Override
    public ModelingUnit load(String uri, org.kermeta.language.api.port.PortResourceLoader.URIType type) {

        KParser parser = new KParser();


        parser.parseSynch(ParserUtil.loadFile(uri)).get();
        return null;

    }
}
