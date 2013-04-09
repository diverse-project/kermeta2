/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

public class KermetaSequence extends org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement {
	
	public KermetaSequence(org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality, org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.kermeta.language.emftexteditor.util.KermetaStringUtil.explode(getChildren(), " ");
	}
	
}
