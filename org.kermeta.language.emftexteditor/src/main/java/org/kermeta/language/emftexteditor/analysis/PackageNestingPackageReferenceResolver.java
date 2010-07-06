/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.analysis;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.Package;
//import org.eclipse.emf.ecore.EObject;

public class PackageNestingPackageReferenceResolver implements org.kermeta.language.emftexteditor.IKermetaReferenceResolver<org.kermeta.language.structure.Package, org.kermeta.language.structure.Package> {
	
	private org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.structure.Package, org.kermeta.language.structure.Package> delegate = new org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.structure.Package, org.kermeta.language.structure.Package>();
	
	public void resolve(java.lang.String identifier, org.kermeta.language.structure.Package container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<org.kermeta.language.structure.Package> result) {
		//delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
		
		EObject root = org.kermeta.language.emftexteditor.util.KermetaEObjectUtil.findRootContainer(container);
		if (root instanceof ModelingUnit){
			ModelingUnit m = (ModelingUnit) root;
			boolean foundPackage = false ;
			for (Package p : m.getPackages()){
				if (p.getName() == identifier)
					foundPackage = true ; 
			}
			if (!foundPackage) {
				Package p = StructureFactory.eINSTANCE.createPackage();
				ClassDefinition c = StructureFactory.eINSTANCE.createClassDefinition();
				c.setName("Dummy");
				p.getOwnedTypeDefinition().add(c);
				p.setName(identifier);
				m.getPackages().add(p);
				Package nestingPackage = container.getNestingPackage();
				nestingPackage.getNestedPackage().add(p);
				nestingPackage.getNestedPackage().remove(container);
				p.getNestedPackage().add(container);
				//container.getsetNestingPackage(p);
				result.addMapping(identifier, p);
			}
		}
	}
	
	public java.lang.String deResolve(org.kermeta.language.structure.Package element, org.kermeta.language.structure.Package container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
