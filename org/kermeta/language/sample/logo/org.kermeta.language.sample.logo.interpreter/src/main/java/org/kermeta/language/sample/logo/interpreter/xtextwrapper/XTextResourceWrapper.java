package org.kermeta.language.sample.logo.interpreter.xtextwrapper;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.kermeta.language.sample.logo.LogoTextualSyntaxStandaloneSetup;

import com.google.inject.Injector;

public class XTextResourceWrapper {

	public static Resource getLogoXTextResource(String uriString){
		Injector injector = new LogoTextualSyntaxStandaloneSetup().createInjector();
		
		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("logo", resourceFactory);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("logo", serviceProvider);
		
		
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(uriString), true);
		System.out.println("resource="+resource.toString());
		System.out.println("resource.getContents().get(0)="+resource.getContents().get(0).toString());
		//Model model = (Model) resource.getContents().get(0);
		return resource;
	}
}
