package org.kermeta.kp.compiler.commandline;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.kp.compiler.commandline.converter.ModelingUnitConverter;
import org.kermeta.kp.compiler.commandline.converter.ResourceCopierConverter;
import org.kermeta.language.ecore2km.Ecore2KMImpl;
import org.kermeta.language.ecore2km.Ecore2KMImpl4Eclipse;
import org.kermeta.language.ecore2km.api.Ecore2KM;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl4Eclipse;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;

public class ModelingUnitLoaderForEcore implements ModelingUnitLoader {
	MessagingSystem logger;
	Boolean runInEclipse;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	
	
	/** Error message of the last load or empty string if last load was successful */
	public String lastLoadErrorMessage = "";
	
	public ModelingUnitLoaderForEcore(MessagingSystem logger, Boolean runInEclipse) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
	}
	public ModelingUnitLoaderForEcore(MessagingSystem logger, Boolean runInEclipse, Boolean saveIntermediateFiles, String targetIntermediateFolder) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
	}
	
	@Override
	public ModelingUnit loadModelingUnitFromURL(String urlString) throws IOException{
		ModelingUnitCacheHelper muCacheHelper = new ModelingUnitCacheHelper(logger);
		lastLoadErrorMessage = "";
		URI uri =  URI.createURI(URLDecoder.decode(urlString,"UTF-8"));
		ModelingUnit mu = null; 
		
		if (urlString.endsWith(".ecore")) {
			//this.logger.debug("URI.createFileURI "+targetIntermediateFolder+"/ecore2km"+uri.path()+".km",this.getClass().getName());
			String outputCacheUrl = URI.createFileURI(targetIntermediateFolder+"/ecore2km"+uri.path()+".km").toString();
			StructurePackage.eINSTANCE.getEFactoryInstance();
			if(muCacheHelper.isCacheUpTodate(urlString, outputCacheUrl)){
				this.logger.debug("Using cached version of "+urlString,this.getClass().getName());
				if (runInEclipse) { // load this file to be ready for the merger
					new KmBinaryMergerImpl4Eclipse();
				} else {
					new KmBinaryMergerImpl();
				}
				mu = muCacheHelper.getCachedModelingUnit(outputCacheUrl);
				if(mu == null)
					this.logger.debug("pb loading cache for "+urlString,this.getClass().getName());
			}
			else{
				//org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
				//this.logger.debug("loadEcore "+urlString,this.getClass().getName());
				mu = this.loadEcore(urlString);
				if( mu != null){
					URI saveKMURI = URI.createURI(outputCacheUrl);
					logger.debug(saveKMURI.toString(), this.getClass().getName());
					new ModelingUnitConverter(true,saveKMURI.toFileString(), logger).saveMu(mu, saveKMURI);
				}
			}
		}
		return mu;
	}
	
	/**
	 * Loader for ecore files
	 * This loader is cached. If a target km file exist and is newer than the ecore file, it simply load the km files.
	 * @param uri
	 * @return
	 * @throws IOException
	 */
	protected ModelingUnit loadEcore(String uri) throws IOException {
				
		// utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.ecore2km");
		// org.kermeta.language.ecore2km.Ecore2km converter = org.kermeta.language.ecore2km.KerRichFactory.createEcore2km();
		Ecore2KM converter;
		if(runInEclipse){
			converter = new Ecore2KMImpl4Eclipse(); 
		}
		else{
			converter = new Ecore2KMImpl();
		}
       // kermeta.persistence.EMFRepository rep = kermeta.persistence.KerRichFactory.createEMFRepository();
       // kermeta.persistence.Resource r = rep.getResource( uri);
		Map<String, String> options = null;
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		m.put("ecore", new XMIResourceFactoryImpl());
		if(runInEclipse){
			// according to https://bugs.eclipse.org/bugs/show_bug.cgi?id=219742
			// this helps loading models with crossreferences using platform:/plugin uri in situation where it exists an equivalent/alternative platform:/resource
			logger.log(Kind.DevINFO, "Adding EcorePlugin.computePlatformURIMap() to the ResourceSet used to load ecore models", this.getClass().getName());
			resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
		}
		URI ruri =  URI.createURI(uri);
		Resource resource = resourceSet.createResource(ruri);
		resource.load(options);
        //r.load();   
		
		EPackage rootPackage;
		//if(runInEclipse){
			// WORKAROUND problem of incomplete conversion if run in eclipse, the ecore.ecore from nsURI is loaded without using the new factory
			// this fixes bug 1951
		
		/*	ResourceCopierConverter resourceCopier = new ResourceCopierConverter(logger);
			Resource newresource = resourceCopier.copyConvert(resource);
			rootPackage = (EPackage) newresource.getContents().get(0);
			
			Map<EObject, Collection<Setting>> unresolvedExternalRefs =EcoreUtil.UnresolvedProxyCrossReferencer.find(newresource);
			for(Entry<EObject, Collection<Setting>> entry : unresolvedExternalRefs.entrySet()){
				EObject rootExternalObject = getRootContainer(entry.getKey());
				logger.warn( "Unresolved proxy "+entry.getKey()+" "+rootExternalObject+" in copied EObject", this.getClass().getName());
			}
		*/
			logger.log(Kind.DevINFO, "Applying ecore load workaround so it can load ecore model in registry", this.getClass().getName());
			EcoreUtil.resolveAll(resourceSet);
			Collection<EObject> objectsToCopy = new LinkedHashSet<EObject>();
			
			objectsToCopy.addAll(resource.getContents());
			for(Resource res : resourceSet.getResources()){
				if(res != resource){
					logger.debug( "workaround applied on additional resource "+res.getURI(), this.getClass().getName());
					objectsToCopy.addAll(res.getContents());
					/*TreeIterator<EObject> it = res.getAllContents();
					
					while(it.hasNext()){
						objectsToCopy.add(it.next());
					}*/
				}
			}
			//Collection<Resource> externalResources = new HashSet<Resource>(); 
			Map<EObject, Collection<Setting>> externalRefs = EcoreUtil.CrossReferencer.find(objectsToCopy);
			/*for(Entry<EObject, Collection<Setting>> entry : externalRefs.entrySet()){
				EObject rootExternalObject = getRootContainer(entry.getKey());
				if(!objectsToCopy.contains(rootExternalObject)){
					logger.debug( "workaround applied on external EObject "+rootExternalObject+entry.getKey(), this.getClass().getName());			
					objectsToCopy.add(rootExternalObject);
					
				/*	TreeIterator<EObject> it = EcoreUtil.getAllContents(rootExternalObject, true);
					
					while(it.hasNext()){
						EObject tocopy = it.next();
						logger.debug( "   Adding for copy "+tocopy.toString()+" contained by "+tocopy.eContainer(), this.getClass().getName());
						objectsToCopy.add(tocopy);
					}*/
					//EcoreUtil.getRootContainer(rootExternalObject)
					//externalResources.add(rootExternalObject.eResource());
			//	}
			//}
			/*for(Resource res : externalResources){
				if(res != resource){
					logger.debug( "workaround applied on additional resource full content"+res.getURI(), this.getClass().getName());
					TreeIterator<EObject> it = res.getAllContents();
					
					while(it.hasNext()){
						objectsToCopy.add(it.next());
					}
					//objectsToCopy.addAll(res.getContents());
				}
			}*/
			/*
			logger.debug( "Copying "+objectsToCopy.size()+" EObjects", this.getClass().getName());
			//Collection<EObject> copiedObjects = EcoreUtil.copyAll(objectsToCopy);
			EcoreUtil.Copier copier = new EcoreUtil.Copier(true, true);
			 // EObject result = copier.copy(eObject);
		    Collection<EObject> copiedObjects = copier.copyAll(objectsToCopy);
		    copier.copyReferences();
		    */
			
			boolean hasExternalRef = externalRefs.size() > 0;
			int nbPass = 0;
			Collection<EObject> copiedObjects = objectsToCopy;
			while(hasExternalRef && nbPass < 1){
				nbPass++;
				for(Entry<EObject, Collection<Setting>> entry : externalRefs.entrySet()){
					EObject rootExternalObject = getRootContainer(entry.getKey());
					if(!objectsToCopy.contains(rootExternalObject)){
						//if(!entry.getKey().getClass().getName().startsWith("Rich")){
							StringBuffer reference = new StringBuffer();
							for(Setting s :entry.getValue()){
								reference.append(s.getEStructuralFeature().getName()+", ");
							}
							logger.debug( "workaround applied("+nbPass+") on external EObject "+rootExternalObject+" "+entry.getKey()+" via references "+reference.toString(), this.getClass().getName());			
							objectsToCopy.add(rootExternalObject);
						/*	TreeIterator<EObject> it = EcoreUtil.getAllContents(rootExternalObject, true);
							
							while(it.hasNext()){
								EObject tocopy = it.next();
								logger.debug( "   Adding for copy "+tocopy.toString()+" contained by "+tocopy.eContainer(), this.getClass().getName());
								objectsToCopy.add(tocopy);
							}*/
							//objectsToCopy.add(entry.getKey());
						//}
					}
				}
				EcoreUtil.Copier copier = new EcoreUtil.Copier(true, true);
				copiedObjects = copier.copyAll(objectsToCopy);
			    copier.copyReferences();
				//copiedObjects = EcoreUtil.copyAll(copiedObjects);
			    objectsToCopy = new LinkedHashSet<EObject>();
				objectsToCopy.addAll(copiedObjects);
				externalRefs = EcoreUtil.CrossReferencer.find(objectsToCopy);
				hasExternalRef = externalRefs.size() > 0;
			}
			
			
			// check copy
			Map<EObject, Collection<Setting>> unresolvedExternalRefs =EcoreUtil.UnresolvedProxyCrossReferencer.find(copiedObjects);
			for(Entry<EObject, Collection<Setting>> entry : unresolvedExternalRefs.entrySet()){
				EObject rootExternalObject = getRootContainer(entry.getKey());
				logger.warn( "Unresolved proxy "+entry.getKey()+" "+rootExternalObject+" in copied EObject", this.getClass().getName());
			}
			
			rootPackage = (EPackage) copiedObjects.toArray()[0];
			
			for (Iterator<EObject> iterator = copiedObjects.iterator(); iterator.hasNext();) {
				EObject eObject = (EObject) iterator.next();
				logger.debug( "   copied EObject "+eObject.toString()+" contained by "+eObject.eContainer(), this.getClass().getName());
			}
			
			// END OF WORKAROUND
			
		/*}
		else{
			rootPackage = (EPackage) resource.getContents().get(0);
		}*/
		ModelingUnit result = converter.convertPackage(rootPackage, "");
		result.setName(ruri.lastSegment());
        return  result;
	}
	
	private EObject getRootContainer(EObject obj){
		if(obj.eContainer() != null ) return getRootContainer(obj.eContainer());
		return obj;
	}

	@Override
	public String getLastLoadErrorMessage() {
		return lastLoadErrorMessage;
	}
}
