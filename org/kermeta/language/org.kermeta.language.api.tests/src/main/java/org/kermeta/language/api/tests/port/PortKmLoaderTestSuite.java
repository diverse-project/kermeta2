/*
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : January 2011
 * Authors :
 *			Arnaud Blouin
 */
package org.kermeta.language.api.tests.port;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortKmLoader;
import org.kermeta.language.api.tests.Util;
import org.kermeta.language.api.tests.factory.PortAbstractFactory;

public class PortKmLoaderTestSuite extends TestSuite {
	public static PortAbstractFactory<PortKmLoader> portKmLoaderfactory = null;
	
	
    public static Test suite() {
        System.out.println("Getting KmLoader test suite.");

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        TestSuite suite = new TestSuite("PortKmLoaderTestSuite");
        
        try {
            populate(suite, "KmLoader_Valid", true, portKmLoaderfactory);
        } catch (InstantiationException ex) {
            Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(PortKmBinaryMergerTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return suite;
    }
    
    
    
    public static void populate(final TestSuite ts, final String folder, final Boolean valid, 
    							final PortAbstractFactory<PortKmLoader> factory)
    							throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] vfiles;
        try {
            String folderFullURI = PortEcore2KmTestSuite.class.getClassLoader().getResource(folder).toString();
            folderFullURI =folderFullURI.replace("file:/", "file:///");
            vfiles = Util.getResourceListingFullURI(PortResourceLoaderTestSuite.class, folder);

            System.out.println("full URI: " + folderFullURI);

            final String jarPath = folderFullURI.substring(0, folderFullURI.indexOf("!")); // get only the jar url
            final String jarToken = "!/";
            
            for(final String uri : vfiles)
            	if(uri.endsWith(".km")) {
            		System.out.println("Entries list: " + uri);
                    ts.addTest(new PortKmLoaderTest(jarPath + jarToken + uri, valid,factory));
            	}
        } catch (URISyntaxException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
