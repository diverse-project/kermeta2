/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class KermetaExpectedCsString extends org.kermeta.language.emftexteditor.mopp.KermetaAbstractExpectedElement {
	
	private org.kermeta.language.emftexteditor.grammar.KermetaKeyword keyword;
	
	public KermetaExpectedCsString(org.kermeta.language.emftexteditor.grammar.KermetaKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public String getTokenName() {
		return "'" + getValue() + "'";
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof KermetaExpectedCsString) {
			return getValue().equals(((KermetaExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
