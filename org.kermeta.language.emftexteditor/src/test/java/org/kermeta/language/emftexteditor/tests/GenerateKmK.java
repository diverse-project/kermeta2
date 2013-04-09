package org.kermeta.language.emftexteditor.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.kermeta.language.emftexteditor.mopp.KermetaResourceFactory;

public class GenerateKmK {
	public static void run(String file_uri, String format) {
		// KmPackage.eINSTANCE.eClass();

		// change as needed according to the type of resource
		// you are using
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMIResource.OPTION_ENCODING, "UTF-8");

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("kermeta", new KermetaResourceFactory());

		Resource resourceA = resourceSet.getResource(URI.createURI(file_uri),
				true);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.clear();

		String newUri = resourceA.getURI().trimFileExtension()
				.appendFileExtension(format).toFileString();

		DataOutputStream file;
		try {//trick to ensure that file exists on file system (needed for create/getResource()
			file = new DataOutputStream(new FileOutputStream(newUri, true));
			file.close();
			//System.out.println("filURI" + file_uri + "\nnewURI" + newUri + "\n");

			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());
			Resource resourceB = resourceSet.createResource(URI
					.createFileURI(newUri));

			resourceB.getContents().addAll(resourceA.getContents());
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(resourceB);
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(resourceSet);
			
			resourceB.save(options);
			// resourceB.save(null);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
