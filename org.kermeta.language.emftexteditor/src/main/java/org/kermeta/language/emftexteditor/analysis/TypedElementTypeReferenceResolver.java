/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.analysis;

import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.UnresolvedType;

public class TypedElementTypeReferenceResolver implements org.kermeta.language.emftexteditor.IKermetaReferenceResolver<org.kermeta.language.structure.TypedElement, org.kermeta.language.structure.Type> {
	
	private org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.structure.TypedElement, org.kermeta.language.structure.Type> delegate = new org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.structure.TypedElement, org.kermeta.language.structure.Type>();
	
	public void resolve(java.lang.String identifier, org.kermeta.language.structure.TypedElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<org.kermeta.language.structure.Type> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
		if(!result.wasResolved()){
			UnresolvedType t = StructureFactory.eINSTANCE.createUnresolvedType();
			t.setTypeIdentifier(identifier);
			container.setType(t);
			result.addMapping(identifier, t);
			if (!container.getContainedType().contains(t)){
				container.getContainedType().add(t);
			}
		}
	}
	
	public java.lang.String deResolve(org.kermeta.language.structure.Type element, org.kermeta.language.structure.TypedElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
