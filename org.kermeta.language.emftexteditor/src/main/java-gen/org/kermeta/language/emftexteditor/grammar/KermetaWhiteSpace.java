/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

public class KermetaWhiteSpace extends org.kermeta.language.emftexteditor.grammar.KermetaFormattingElement {
	
	private final int amount;
	
	public KermetaWhiteSpace(int amount, org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
