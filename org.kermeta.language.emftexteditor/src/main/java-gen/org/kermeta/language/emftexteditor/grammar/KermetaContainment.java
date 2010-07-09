/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

public class KermetaContainment extends org.kermeta.language.emftexteditor.grammar.KermetaTerminal {
	
	public KermetaContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
