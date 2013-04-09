/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class KermetaExpectedStructuralFeature extends org.kermeta.language.emftexteditor.mopp.KermetaAbstractExpectedElement {
	
	private org.kermeta.language.emftexteditor.grammar.KermetaPlaceholder placeholder;
	
	public KermetaExpectedStructuralFeature(org.kermeta.language.emftexteditor.grammar.KermetaPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.lang.String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof KermetaExpectedStructuralFeature) {
			return getFeature().equals(((KermetaExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
