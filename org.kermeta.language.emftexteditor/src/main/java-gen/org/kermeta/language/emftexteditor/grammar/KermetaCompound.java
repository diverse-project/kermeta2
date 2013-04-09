/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

public class KermetaCompound extends org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement {
	
	public KermetaCompound(org.kermeta.language.emftexteditor.grammar.KermetaChoice choice, org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality) {
		super(cardinality, new org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
