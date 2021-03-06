/* $Id: $
 * Project    : org.kermeta.language.merger.binarymerger
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 june 2011
 * Authors : 
 *            Cédric Bouhours
 */

package org.kermeta.language.merger.binarymerger.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.merger.BinaryMerger;
import org.kermeta.language.merger.BinaryMergerAspect;
import org.kermeta.ecore.binarymerger.BinaryMergerExceptionAspect;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.ModelReference;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage.Severity;

public class KmBinaryMergerOperations {
	
	private BinaryMerger merger = null;
	
	public KmBinaryMergerOperations(BinaryMerger merger) {
		this.merger = merger;
	}
	
	public ErrorProneResult<ModelingUnit> merge(ModelingUnit first_mu, ModelingUnit second_mu) {
		
        ErrorProneResult<ModelingUnit> result = new ErrorProneResult<ModelingUnit>();
        ModelingUnit resultMu = new ModelingUnit(); 
        resultMu.setName("{"+first_mu.getName()+","+second_mu.getName()+"}");
        result.setResult(resultMu);
		try {
			resultMu.getMetamodels().addAll( merger.merge(enforceAspect(first_mu.getMetamodels()), enforceAspect(second_mu.getMetamodels())));
			//resultMu.getMetamodels().addAll( merger.merge(first_mu.getMetamodels(), second_mu.getMetamodels()));
		
	        BinaryMergerAspect mergerAspect = (BinaryMergerAspect) merger;
	        for (Object o : mergerAspect.getErrors()) {
	        	if(o instanceof BinaryMergerExceptionAspect){
	        		BinaryMergerExceptionAspect e = (BinaryMergerExceptionAspect) o;
	        		ModelReference modelRef = new ModelReference(e.aspectElement());
	        		// TODO bug, the nested exception isn't the correct one, I don't know how to cast the BinaryMergerExceptionAspect into a classic java Exception
	        		//ProblemMessage pm = (ProblemMessage) UnifiedMessageFactory.getInstance().createErrorMessage(e.message(), "org.kemeta.language.merger.binarymerger", e, modelRef);
	        		
	        		ResultProblemMessage pm = new ResultProblemMessage(Severity.ERROR,e.message(), null,  modelRef) ;
	        		result.getProblems().add(pm);
	        		// TODO also send the problem to a log port ?
	        	}
			}
		} catch (IOException e1) {
			ResultProblemMessage pm = new ResultProblemMessage(Severity.FATAL, e1.getMessage(), e1, null);
    		result.getProblems().add(pm);
    		MessagingSystem logger = new org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem();
    		logger.error(e1.getMessage() != null ? e1.getMessage() : e1.toString(), "KmBinaryMergerOperations", e1);
		}
		catch (Exception e2) {
    		MessagingSystem logger = new org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem();
    		logger.error(e2.getMessage() != null ? e2.getMessage() : e2.toString(), "KmBinaryMergerOperations", e2);
		}
        return result;
	}
	
	public ErrorProneResult<ModelingUnit> genericMerge(ModelingUnit first_mu, ModelingUnit second_mu) {
		
        ErrorProneResult<ModelingUnit> result = new ErrorProneResult<ModelingUnit>();
        ModelingUnit resultMu = new ModelingUnit(); 
        resultMu.setName("{"+first_mu.getName()+","+second_mu.getName()+"}");
        result.setResult(resultMu);
		try {
			resultMu.getMetamodels().addAll( merger.genericMerge(enforceAspect(first_mu.getMetamodels()), enforceAspect(second_mu.getMetamodels())));
			//resultMu.getMetamodels().addAll( merger.merge(first_mu.getMetamodels(), second_mu.getMetamodels()));
		
	        BinaryMergerAspect mergerAspect = (BinaryMergerAspect) merger;
	        for (Object o : mergerAspect.getErrors()) {
	        	if(o instanceof BinaryMergerExceptionAspect){
	        		BinaryMergerExceptionAspect e = (BinaryMergerExceptionAspect) o;
	        		ModelReference modelRef = new ModelReference(e.aspectElement());
	        		// TODO bug, the nested exception isn't the correct one, I don't know how to cast the BinaryMergerExceptionAspect into a classic java Exception
	        		//ProblemMessage pm = (ProblemMessage) UnifiedMessageFactory.getInstance().createErrorMessage(e.message(), "org.kemeta.language.merger.binarymerger", e, modelRef);
	        		
	        		ResultProblemMessage pm = new ResultProblemMessage(Severity.ERROR,e.message(), null,  modelRef) ;
	        		result.getProblems().add(pm);
	        		// TODO also send the problem to a log port ?
	        	}
			}
		} catch (IOException e1) {
			ResultProblemMessage pm = new ResultProblemMessage(Severity.FATAL, e1.getMessage(), e1, null);
    		result.getProblems().add(pm);
		}
        return result;
	}
   
    protected List<Metamodel> enforceAspect(List<Metamodel> mms) throws IOException{
    	List<Metamodel> result = new ArrayList<Metamodel>();
    	ModelingUnit mu = new ModelingUnit();
    	mu.getMetamodels().addAll(mms);
    	
    	mu.gatherInMainEResource();
    	
    	// check if this is an instance of the BinaryMergerAspect or a standard EMF (compatible with implicit conversion)
    	boolean needConversion = false;
    	for (Metamodel mm : mms) {
    		if (! (mm.getClass().getCanonicalName().equals("org.kermeta.language.language.merger.binarymerger.org.kermeta.language.structure.RichMetamodel") ) ) {

        		MessagingSystem logger = new org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem();
        		logger.debug("convertion required for "+mu.getDescriptionString()+" for binaryMerger due to "+mm.getClass().getCanonicalName(), "KmBinaryMergerOperations");
    			needConversion = true;
    			break;
    		}
    	}
    	
    	
    	if(needConversion){
	    	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    	URI uri;
			Map<String, String> options = null;
	    	uri = URI.createURI(mu.getMainEResource().getURI().toString() + ".km_in_memory");
			// let's suppose that the ModelingUnit contains everything (otherwise we would have to look for references and save them too ...)
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
			Map<String,Object> m = f.getExtensionToFactoryMap();
			m.put("km_in_memory",new XMIResourceFactoryImpl());
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().addAll(mu.getMetamodels());
			resource.save(outputStream, options);
	
	    	ResourceSet resourceSet2 = new ResourceSetImpl();
			Resource.Factory.Registry f2 = resourceSet2.getResourceFactoryRegistry();
			Map<String,Object> m2 = f2.getExtensionToFactoryMap();
			m2.put("*",new XMIResourceFactoryImpl());
			Resource resource2 = resourceSet2.createResource(uri);
			resource2.load(new ByteArrayInputStream(outputStream.toByteArray()), options);
	    	
			return new ModelingUnit(uri.toString(), resource2.getContents()).getMetamodels();
    	}
    	else{
    		// no conversion required
    		return mu.getMetamodels();
    	}

    }


}
