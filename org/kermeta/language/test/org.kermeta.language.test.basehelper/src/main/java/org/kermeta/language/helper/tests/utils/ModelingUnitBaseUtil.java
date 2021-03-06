/* $Id:$ 
 * Creation : 22 dec. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.helper.tests.utils;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.util.ModelingUnit;


public class ModelingUnitBaseUtil {

	public static ModelingUnit loadModelingUnit(String filePath) throws IOException, URISyntaxException{
    	if(filePath.endsWith(".km")){
    		return loadModelingUnitFromKm(filePath);
    	}
    	return null;
    }
	
	public static ModelingUnit loadModelingUnitFromKm(String modelFilePath){
		return loadModelingUnitFromKm(modelFilePath, new ResourceSetImpl());
	}
	public static ModelingUnit loadModelingUnitFromKm(String modelFilePath, ResourceSet resourceSet){
    	URI uri = URI.createURI( modelFilePath );
    	ModelingUnit result = new ModelingUnit(modelFilePath);
		/*
		 * If the loading is not done in a workbench, then uri matching platform:/resource or platform:/plugin
		 * will be useless. Need to convert them into absolute path.
		 * It works only if a mapping exist between platform:/resource and its concrete path. 
		 */
		URIConverter converter = new ExtensibleURIConverterImpl();
		uri = converter.normalize(uri);
		Resource resource = resourceSet.getResource(uri, true);
		for(EObject o : resource.getContents()){
			if( o instanceof Metamodel){
				result.getMetamodels().add((Metamodel) o);
			}				
		}
		return result;
    }    
    
    public static void saveModelingUnit(String modelFilePath, ModelingUnit modelingUnit) throws IOException {
        saveModelingUnit(modelFilePath,modelingUnit, new ResourceSetImpl());
    }
    public static void saveModelingUnit(String modelFilePath, ModelingUnit modelingUnit, ResourceSet resourceSet) throws IOException {
    	
    	
    	URI uri = URI.createURI( modelFilePath );
		/*
		 * If the loading is not done in a workbench, then uri matching platform:/resource or platform:/plugin
		 * will be useless. Need to convert them into absolute path.
		 * It works only if a mapping exist between platform:/resource and its concrete path.
		 */
		URIConverter converter = new ExtensibleURIConverterImpl();
		uri = converter.normalize(uri);
	/*	XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot();
		XMLNamespacePackage.eINSTANCE.getEFactoryInstance(); */
		Resource resource = resourceSet.createResource(uri);
     /*   ((XMIResource)resource).getDefaultLoadOptions().put(XMLResource.OPTION_ENCODING, "UTF-8");
        ((XMIResource)resource).getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, "UTF-8");  */
		resource.getContents().addAll(modelingUnit.getMetamodels());
		resource.save(null);
    }
    public static void registerEMFextensionToFactoryMap(String uri) {
		String ext = uri.substring(uri.lastIndexOf(".")+1);
		
		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().contains(ext)){
			if(ext != null){
				//internalLog.debug("registering extension: " + ext);					
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
			}
		}
		//else internalLog.debug(" extension " + ext + " is already registered ");
/*		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().contains("ecore")){
			internalLog.debug("registering extension: ecore");
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		}*/
		//logEMFRegistryExtensionContent();
	}
}
