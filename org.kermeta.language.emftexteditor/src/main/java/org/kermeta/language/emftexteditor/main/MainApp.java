package org.kermeta.language.emftexteditor.main;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.emftexteditor.IKermetaTextResource;
import org.kermeta.language.emftexteditor.mopp.KermetaResource;
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

		/*ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("kermeta", new KermetaResourceFactory());*/

		String file_uri = "file:///home/hrambelo/2_packageSimple.kermeta";
		//Resource resourceA = resourceSet.getResource(URI.createURI(file_uri),true);
		
		IKermetaTextResource resourceA = new KermetaResource(URI.createURI(file_uri));
		System.out.println(resourceA.toString());
		try {
			resourceA.load(null);
			if (!resourceA.getContents().isEmpty()){
				for (EObject o : resourceA.getContents()){
					System.out.println(o.toString());
					if (o instanceof ModelingUnit){
						ModelingUnit mu = (ModelingUnit) o;
						if (!(mu.getPackages().isEmpty() &&
								mu.getOwnedTypeDefinition().isEmpty() && 
								mu.getRequires().isEmpty() &&
								mu.getUsings().isEmpty())){
							for (Package p : mu.getPackages()){
								System.out.println("=>>" + p.getName() );	
							}
						}
						else{
							throw new Exception("Parsing error: Modeling Unit is empty");
						}
					}
				}
			}
			else {
				throw new Exception("Parsing error: Keremta Resource is empty");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
