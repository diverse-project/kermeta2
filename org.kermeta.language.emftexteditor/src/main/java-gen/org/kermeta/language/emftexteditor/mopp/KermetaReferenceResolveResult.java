/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

/**
 * A basic implementation of the
 * org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult interface
 * that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class KermetaReferenceResolveResult<ReferenceType> implements org.kermeta.language.emftexteditor.IKermetaReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.kermeta.language.emftexteditor.IKermetaReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	
	public KermetaReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.kermeta.language.emftexteditor.IKermetaReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.kermeta.language.emftexteditor.IKermetaReferenceMapping<ReferenceType>>();
		}
		mappings.add(new org.kermeta.language.emftexteditor.mopp.KermetaElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.kermeta.language.emftexteditor.IKermetaReferenceMapping<ReferenceType>>();
		}
		mappings.add(new org.kermeta.language.emftexteditor.mopp.KermetaURIMapping<ReferenceType>(identifier, uri, warning));
	}
}