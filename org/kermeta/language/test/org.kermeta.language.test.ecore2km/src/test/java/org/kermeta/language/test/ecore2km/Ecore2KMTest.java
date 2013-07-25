/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.test.ecore2km;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import junit.framework.TestCase;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.ecore2km.Ecore2KMImpl;
import org.kermeta.language.ecore2km.Ecore2km;
import org.kermeta.language.helper.tests.utils.EMFCompareModelHelper;
import org.kermeta.language.helper.tests.utils.FileHelper;
import org.kermeta.language.helper.tests.utils.ModelingUnitBaseUtil;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;

public class Ecore2KMTest extends TestCase {
	String ecoreFile;
	boolean shouldPass;

	ResourceSet resourceSet;

	public Ecore2KMTest(String ecoreFile, boolean mustBeValid) {
		super();
		this.ecoreFile = ecoreFile;
		this.shouldPass = mustBeValid;
		this.resourceSet = new ResourceSetImpl();

		// Register KM model
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("km", new XMIResourceFactoryImpl());
	}

	public void test() throws IOException {
		System.out.println("Test ecore2km "
				+ (shouldPass ? "valid " : "invalid ") + ecoreFile);


        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",          new XMIResourceFactoryImpl());
		/*Ecore2KMImpl ecore2km = new Ecore2KMImpl();*/
        org.kermeta.language.ecore2km.Ecore2km converter = org.kermeta.language.ecore2km.KerRichFactory.createEcore2km();
        
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI,
				EcorePackage.eINSTANCE);
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",          new XMIResourceFactoryImpl());

		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI
				.createFileURI(ecoreFile));
		resource.load(m);
		
		String muName = ecoreFile;
        if(resource != null){ // use the resource name as name for the ModelingUnit
        	muName = resource.getURI().lastSegment();
        }
        ModelingUnit mu = new ModelingUnit(muName, new ArrayList<Metamodel>());
       
		
		for (EObject obj : resource.getContents()) {
			if (obj instanceof EPackage) {
		//		ecore2km.convertPackage((EPackage) obj, ecoreFile);
				 mu.getMetamodels().addAll(converter.convert((EPackage) obj, muName));
			}
		}
		// ModelingUnit beforeResolving = new
		// ModelingUnit(ecoreFile,resource.getContents());

		// ErrorProneResult<ModelingUnit> epr=
		// ecore2km..resolve(beforeResolving);
		/*
		 * String firstError = (epr.getProblems().size()!=0 ?
		 * epr.getProblems().get(0).getMessage() : "");
		 * if(!ms.errorTrace.isEmpty()){ assertTrue(ms.errorTrace.get(0),
		 * ms.errorTrace.isEmpty()); } if(shouldPass){
		 * assertTrue("Failed to resolve ! "+firstError, epr.hasSevereProblems()
		 * ^ shouldPass);//for noobs :p : ^ is XOR } else{
		 * assertTrue("Resolver should have failed ! "+firstError,
		 * epr.hasSevereProblems() ^ shouldPass);//for noobs :p : ^ is XOR }
		 */
	}

	@Override
	public String getName() {
		return ecoreFile;
	}

	@Override
	public void runTest() throws Throwable {
		test();
	}

	@Override
	protected void tearDown() throws Exception {
		//
	}
}
