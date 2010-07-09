/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public KermetaResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.kermeta.language.emftexteditor.mopp.KermetaResource(uri);
	}
	
}
