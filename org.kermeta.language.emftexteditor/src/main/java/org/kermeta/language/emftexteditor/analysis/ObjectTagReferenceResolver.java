/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.analysis;

public class ObjectTagReferenceResolver implements org.kermeta.language.emftexteditor.IKermetaReferenceResolver<org.kermeta.language.structure.Object, org.kermeta.language.structure.Tag> {
	
	private org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.structure.Object, org.kermeta.language.structure.Tag> delegate = new org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.structure.Object, org.kermeta.language.structure.Tag>();
	
	public void resolve(java.lang.String identifier, org.kermeta.language.structure.Object container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<org.kermeta.language.structure.Tag> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(org.kermeta.language.structure.Tag element, org.kermeta.language.structure.Object container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
