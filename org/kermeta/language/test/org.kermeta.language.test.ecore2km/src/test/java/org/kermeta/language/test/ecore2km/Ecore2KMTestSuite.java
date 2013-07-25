/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *                  Francois Fouquet <ffouquet@irisa.fr>
 *                  Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.test.ecore2km;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import junit.framework.Test;
import junit.framework.TestSuite;


public class Ecore2KMTestSuite extends TestSuite {

	 public static Test suite() {
			//KermetaCompiler.initializeFactory();
		 
		  Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",          new XMIResourceFactoryImpl());
			
			final FileFilter filter = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return pathname!=null && pathname.getAbsolutePath().endsWith(".ecore");
				}
			};
			final String folderFullURI 	= new File(Ecore2KMTestSuite.class.getClassLoader().getResource("do_not_remove").getFile()).getParent();
			final List<File> files 		= new ArrayList<File>();
			final TestSuite suite 		= new TestSuite("Ecore2KMTestSuite");
			
			getFiles(new File(folderFullURI), files, filter);
			
			for(File file : files) {
				System.out.println("Testing: " + file.getPath() + "\tto\t" + file.getParent());
				suite.addTest(new Ecore2KMTest(file.getPath(), 
						!(file.getParent().contains("invalid")&&file.getParent().contains("internal")) ));
			}
			
	        return suite;
	    }

    public static void getFiles(final File file, final List<File> files, final FileFilter filter) {
    	final String[] children = file.list();
    	final String base 		= file.getPath() + System.getProperty("file.separator");
    	File file2;
    	
    	if(children!=null)
    	    for(int i=0; i<children.length; i++) {
    	    	file2 = new File(base + children[i]);
    	    	
    	    	getFiles(file2, files, filter);
    	    	
    	        if(filter.accept(file2))
    	        	files.add(file2);
    	    }
    }
    
}
