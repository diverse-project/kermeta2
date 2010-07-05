/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.loader.kmt.emftext;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.tests.port.PortResourceLoaderTestSuite;

/**
 *
 * @author ffouquet
 */
public class EMFTextKMTParserTestSuite extends TestSuite {

   // @Override
    public static Test suite() {

        PortResourceLoaderTestSuite.loaderClass = EMFTextKMTParser.class;
        return PortResourceLoaderTestSuite.suite();
    }


    
}
