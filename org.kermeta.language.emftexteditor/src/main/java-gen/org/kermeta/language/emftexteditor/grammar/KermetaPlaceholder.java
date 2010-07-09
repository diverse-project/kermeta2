/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class KermetaPlaceholder extends org.kermeta.language.emftexteditor.grammar.KermetaTerminal {
	
	private final java.lang.String tokenName;
	
	public KermetaPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, java.lang.String tokenName, org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public java.lang.String getTokenName() {
		return tokenName;
	}
	
}
