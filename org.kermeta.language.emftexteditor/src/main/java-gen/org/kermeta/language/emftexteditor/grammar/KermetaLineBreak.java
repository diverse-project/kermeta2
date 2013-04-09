/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

public class KermetaLineBreak extends org.kermeta.language.emftexteditor.grammar.KermetaFormattingElement {
	
	private final int tabs;
	
	public KermetaLineBreak(org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
