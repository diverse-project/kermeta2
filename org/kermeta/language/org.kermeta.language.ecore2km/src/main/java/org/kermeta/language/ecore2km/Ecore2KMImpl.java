/* $Id: $
 * Project    : org.kermeta.language.ecore2km
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 25 nov. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 *            Arnaud Blouin
 */
package org.kermeta.language.ecore2km;

import java.util.ArrayList;

import kermeta.standard.JavaConversions;

import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.ecore2km.internal.Activator;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.util.ModelingUnit;


public class Ecore2KMImpl  implements org.kermeta.language.ecore2km.api.Ecore2KM {

  
    
	public Ecore2KMImpl(){
    	org.kermeta.language.language.ecore2kmrunner.MainRunner.init();   	
    }
    

    
   
    public ModelingUnit convertPackage(final EPackage rootPackage, final String namespacePrefix) {
        // call the init in order to make sure that the registry is correctly set
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
    	org.kermeta.language.language.ecore2kmrunner.MainRunner.init();

        org.kermeta.language.ecore2km.Ecore2km converter = org.kermeta.language.ecore2km.KerRichFactory.createEcore2km();
        String muName = rootPackage.getName();
        if(rootPackage.eResource() != null){ // use the resource name as name for the ModelingUnit
        	muName = rootPackage.eResource().getURI().lastSegment();
        }
        ModelingUnit mu = new ModelingUnit(muName, new ArrayList<Metamodel>());
        mu.getMetamodels().addAll(converter.convert(rootPackage, namespacePrefix));
        // make sure to clean the memory
		JavaConversions.cleanCache();
        return mu;
    }
    
           
}
