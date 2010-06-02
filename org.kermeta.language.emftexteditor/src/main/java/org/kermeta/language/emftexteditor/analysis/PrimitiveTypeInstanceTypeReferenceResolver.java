/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.analysis;

public class PrimitiveTypeInstanceTypeReferenceResolver implements org.kermeta.language.emftexteditor.IKermetaReferenceResolver<org.kermeta.language.structure.PrimitiveType, org.kermeta.language.structure.Type> {
	
	private org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.structure.PrimitiveType, org.kermeta.language.structure.Type> delegate = new org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.structure.PrimitiveType, org.kermeta.language.structure.Type>();
	
	public void resolve(java.lang.String identifier, org.kermeta.language.structure.PrimitiveType container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<org.kermeta.language.structure.Type> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(org.kermeta.language.structure.Type element, org.kermeta.language.structure.PrimitiveType container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
