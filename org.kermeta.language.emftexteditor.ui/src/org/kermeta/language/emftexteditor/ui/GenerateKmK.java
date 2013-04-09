package org.kermeta.language.emftexteditor.ui;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.IOException;

//import fr.irisa.triskell.eclipse.console.IOConsole;

public class GenerateKmK {
	public static void run(String file_uri,/* IOConsole console,*/ String format) {

		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resourceA = resourceSet
				.createResource(URI.createURI(file_uri));
		String newUri = resourceA.getURI().trimFileExtension()
				.appendFileExtension(format).toFileString();
		Resource resourceB = resourceSet.createResource(URI
				.createFileURI(newUri));
		try {
			resourceA.load(null);
			resourceB.getContents().addAll(resourceA.getContents());
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(resourceB);
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(resourceSet);
			resourceB.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
