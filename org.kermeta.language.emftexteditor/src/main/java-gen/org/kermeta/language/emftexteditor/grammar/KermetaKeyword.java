/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class KermetaKeyword extends org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement {
	
	private final String value;
	
	public KermetaKeyword(String value, org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
