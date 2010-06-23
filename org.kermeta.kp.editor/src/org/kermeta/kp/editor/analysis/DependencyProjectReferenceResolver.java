/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.analysis;

public class DependencyProjectReferenceResolver implements org.kermeta.kp.editor.IKptReferenceResolver<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProject> {
	
	private org.kermeta.kp.editor.analysis.KptDefaultResolverDelegate<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProject> delegate = new org.kermeta.kp.editor.analysis.KptDefaultResolverDelegate<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProject>();
	
	public void resolve(java.lang.String identifier, org.kermeta.kp.Dependency container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.kp.editor.IKptReferenceResolveResult<org.kermeta.kp.KermetaProject> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(org.kermeta.kp.KermetaProject element, org.kermeta.kp.Dependency container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}
	
}
