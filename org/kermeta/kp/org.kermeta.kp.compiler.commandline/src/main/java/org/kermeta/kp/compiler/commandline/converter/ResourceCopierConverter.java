/* $Id:$ 
 * Creation : 2 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline.converter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

/**
 * This class provide load and save method for Ecore using Stream which can be used to convert an Ecore into another Ecore conformant to a specific factory
 * and making sure that all elements are contained in the resulting resource
 * Be careful the factories must not change during this process (ie. not thread safe)
 * @author dvojtise
 *
 */
public class ResourceCopierConverter {

	public final String LOG_MESSAGE_GROUP = KermetaCompiler.LOG_MESSAGE_GROUP+".ResourceCopierConverter";
	public MessagingSystem logger;
	
	
	

	public ResourceCopierConverter(MessagingSystem logger) {
		this.logger = logger;
	}



	/**
	 * If the correct factories are set up, this will convert an existing ModelingUnit into the ModelingUnit using these factories
	 * @param mu
	 * @return
	 * @throws IOException
	 */
	public Resource copyConvert(Resource srcResource) throws IOException{
		logger.initProgress(LOG_MESSAGE_GROUP, "Coping and converting resource "+srcResource.getURI()+" (and inderect resources)", KermetaCompiler.LOG_MESSAGE_GROUP, 0);
		//resolve all
		EcoreUtil.resolveAll(srcResource.getResourceSet());
		// make sure there are no unresolved element
		// find all resources
		Map<String, String> options = null;

		Map<Resource,ResourceConvertionMap> resourceStreams = new HashMap<Resource,ResourceConvertionMap>();
		logger.debug("Copying "+srcResource.getResourceSet().getResources().size()+" resource(s)",  LOG_MESSAGE_GROUP);
		for(Resource res : srcResource.getResourceSet().getResources()){
			// save them all in new streams
			ResourceConvertionMap converted = new ResourceConvertionMap();
			resourceStreams.put(res,converted);
			
			res.save(converted.resStream, options);
			
		}
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);
		Resource.Factory.Registry f = resourceSet
				.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("km_in_memory", new XMIResourceFactoryImpl());
		m.put("km", new XMIResourceFactoryImpl());
		m.put("*", new XMIResourceFactoryImpl());
		// reload new resources from the streams
		for(Resource res : srcResource.getResourceSet().getResources()){
			Resource newResource = resourceSet.createResource(res.getURI());
			resourceStreams.get(res).newResource = newResource;
			newResource.load(new ByteArrayInputStream(resourceStreams.get(res).resStream.toByteArray()), options);
		}
		logger.doneProgress(LOG_MESSAGE_GROUP, "Resource copied and converted "+srcResource.getURI(), KermetaCompiler.LOG_MESSAGE_GROUP);
		return resourceStreams.get(srcResource).newResource;
	}
	
	class ResourceConvertionMap{
		ByteArrayOutputStream resStream = new ByteArrayOutputStream();
		Resource newResource;
	}
	
}
