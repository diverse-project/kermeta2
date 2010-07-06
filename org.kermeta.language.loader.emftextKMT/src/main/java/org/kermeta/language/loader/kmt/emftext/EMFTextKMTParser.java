/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.emftext;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.emftexteditor.IKermetaTextResource;
import org.kermeta.language.emftexteditor.mopp.KermetaResource;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Package;

/**
 *
 * @author ffouquet
 */
public class EMFTextKMTParser implements PortResourceLoader {

    public ModelingUnit load(String uri, URIType type) {
    	IKermetaTextResource resourceA = new KermetaResource(URI.createURI(uri));
    	try {
			resourceA.load(null);
			for (EObject o : resourceA.getContents()){
				if (o instanceof ModelingUnit){
					ModelingUnit mu = (ModelingUnit) o;
					return mu;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return null;
    }

}
