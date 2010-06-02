/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class KermetaExpectedCsString extends org.kermeta.language.emftexteditor.mopp.KermetaAbstractExpectedElement {
	
	private String value;
	
	public KermetaExpectedCsString(String value) {
		super();
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getTokenName() {
		return "'" + value + "'";
	}
	
	public String toString() {
		return "CsString \"" + value + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof KermetaExpectedCsString) {
			return this.value.equals(((KermetaExpectedCsString) o).value);
		}
		return false;
	}
	
}
