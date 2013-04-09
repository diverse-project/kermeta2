/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.analysis;

public class KermetaNAMESPACEPREFIXTokenResolver implements org.kermeta.language.emftexteditor.IKermetaTokenResolver {
	
	private org.kermeta.language.emftexteditor.analysis.KermetaDefaultTokenResolver defaultTokenResolver = new org.kermeta.language.emftexteditor.analysis.KermetaDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.language.emftexteditor.IKermetaTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
