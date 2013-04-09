package org.kermeta.language.emftexteditor.tests;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.language.emftexteditor.mopp.KermetaResourceFactory;

public class GenerateKmtK {

	public static void run(String file_uri, String format) {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",
				new KermetaResourceFactory());
		
		
		ResourceSet rs = new ResourceSetImpl();

		//load xmi resource
		Resource xmiResourc = rs.getResource(URI.createFileURI(file_uri),true);

		String newUri = xmiResourc.getURI().trimFileExtension().appendFileExtension(format).toFileString();
		

		Resource dslResource;
		DataOutputStream file;
		try {

			file = new DataOutputStream(new FileOutputStream(newUri, true));
			file.close();
			System.out.println("newURI" + newUri + "\n");
			//dslResource = rs.createResource(URI.createFileURI(newUri));
			//dslResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//create an empty DSL resource (will be an instance of <dsl>Resource)
		dslResource = rs.getResource(
		        URI.createFileURI(newUri),true);

		//transfer content from XMI to DSL resource
		dslResource.getContents().addAll(xmiResourc.getContents());

		//save the dsl resource (this will automatically use the <dsl>Printer)
		try {
			dslResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
