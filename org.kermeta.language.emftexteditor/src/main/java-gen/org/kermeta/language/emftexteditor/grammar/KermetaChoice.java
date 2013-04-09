/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

public class KermetaChoice extends org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement {
	
	public KermetaChoice(org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality, org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.kermeta.language.emftexteditor.util.KermetaStringUtil.explode(getChildren(), "|");
	}
	
}
