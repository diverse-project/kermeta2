/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.analysis;

public class CallFeatureStaticPropertyReferenceResolver implements org.kermeta.language.emftexteditor.IKermetaReferenceResolver<org.kermeta.language.behavior.CallFeature, org.kermeta.language.structure.Property> {
	
	private org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.behavior.CallFeature, org.kermeta.language.structure.Property> delegate = new org.kermeta.language.emftexteditor.analysis.KermetaDefaultResolverDelegate<org.kermeta.language.behavior.CallFeature, org.kermeta.language.structure.Property>();
	
	public void resolve(java.lang.String identifier, org.kermeta.language.behavior.CallFeature container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<org.kermeta.language.structure.Property> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(org.kermeta.language.structure.Property element, org.kermeta.language.behavior.CallFeature container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
