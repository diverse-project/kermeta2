package org.kermeta.language.emftexteditor.ui;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

//import fr.irisa.triskell.eclipse.console.IOConsole;
import org.kermeta.language.emftexteditor.mopp.KermetaResourceFactory;

public class GenerateKmtK {

	public static void run(String file_uri,/* IOConsole console,*/ String format) {
		
		//register KermetaResourceFactory for "kmt" file extension 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
		        ).put("kermeta", new KermetaResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
        ).put("kmt", new KermetaResourceFactory());
		        
		//register XMI resource factory for all other extensions 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
		        ).put(Resource.Factory.Registry.DEFAULT_EXTENSION,
		                new XMIResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();

		//load km resource
		Resource kmResourc = rs.getResource(URI.createFileURI(file_uri),true);

		String newUri = kmResourc.getURI().trimFileExtension().appendFileExtension(format).toFileString();
		

		Resource kmtResource = rs.createResource(URI.createFileURI(newUri));
		try {//trick to ensure that target file already exist on disk to avoid getResource() to hang
			kmtResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//create an empty Kermeta resource (will be an instance of KermetaResource)
		kmtResource = rs.getResource(
		        URI.createFileURI(newUri),true);

		//transfer content from km to Kermeta resource
		kmtResource.getContents().addAll(kmResourc.getContents());

		//save the dsl resource (this will automatically use the KermetaPrinter)
		try {
			kmtResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
