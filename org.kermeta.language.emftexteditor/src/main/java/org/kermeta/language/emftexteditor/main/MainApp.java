package org.kermeta.language.emftexteditor.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.language.emftexteditor.mopp.KermetaResourceFactory;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Package;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Object,Object> options = new HashMap<Object,Object>();
		//options.put(XMIResource.OPTION_ENCODING, "UTF-8");

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("kermeta", new KermetaResourceFactory());

		String file_uri = "file:///home/hrambelo/2_packageSimple.kermeta";
		Resource resourceA = resourceSet.getResource(URI.createURI(file_uri),true);
		for (EObject o : resourceA.getContents()){
			if (o instanceof ModelingUnit){
				ModelingUnit mu = (ModelingUnit) o;
				for (Package p : mu.getPackages()){
					System.out.println("=>>" + p.getName() );	
				}
			}
		}
		
	}

}
