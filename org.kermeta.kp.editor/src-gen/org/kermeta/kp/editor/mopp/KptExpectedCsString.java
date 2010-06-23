/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class KptExpectedCsString extends org.kermeta.kp.editor.mopp.KptAbstractExpectedElement {
	
	private String value;
	
	public KptExpectedCsString(String value) {
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
		if (o instanceof KptExpectedCsString) {
			return this.value.equals(((KptExpectedCsString) o).value);
		}
		return false;
	}
	
}
