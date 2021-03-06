package org.kermeta.language.resolver.test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;



import junit.framework.Test;
import junit.framework.TestSuite;

public class KmResolverTestSuite extends TestSuite {
    public static Test suite() {
    	//KermetaCompiler.initializeFactory();
    	System.out.println("début test suite");
		
		final String folderFullURIPass 	= new File(KmResolverTestSuite.class.getClassLoader().getResource("tests_pass").getFile()).getPath();
		System.out.println("fullURI "+ folderFullURIPass);
		
		final TestSuite suite 		= new TestSuite("KmResolverTestSuite");
		
		
		addTestsToSuite(folderFullURIPass, suite, true);
		final String folderFullURIFail 	= new File(KmResolverTestSuite.class.getClassLoader().getResource("tests_fail").getFile()).getPath();
		addTestsToSuite(folderFullURIFail, suite, false);
		
        return suite;
    }


	public static void addTestsToSuite(final String folderFullURI,
			final TestSuite suite, boolean shouldPass) {
		final List<File> files 		= new ArrayList<File>();
		final FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname!=null && pathname.getAbsolutePath().endsWith("beforeResolving.km");
			}
		};
		
		
		getFiles(new File(folderFullURI), files, filter);
		
		for(File file : files) {
			System.out.println("Testing: " + file.getPath() );
			suite.addTest(new KmResolverTest(file.getPath(), shouldPass));
		}
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
