/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.ui;

/**
 * A proposal for completing an incomplete document.
 */
public class KermetaCompletionProposal implements java.lang.Comparable<KermetaCompletionProposal> {
	private java.lang.String insertString;
	private java.lang.String prefix;
	private boolean startsWithPrefix;
	private boolean structuralFeature;
	private org.eclipse.swt.graphics.Image image;
	
	public KermetaCompletionProposal(java.lang.String insertString, java.lang.String prefix, boolean startsWithPrefix, boolean structuralFeature, org.eclipse.swt.graphics.Image image) {
		this(insertString, prefix, startsWithPrefix, structuralFeature);
		this.image = image;
	}
	
	public KermetaCompletionProposal(java.lang.String insertString, java.lang.String prefix, boolean startsWithPrefix, boolean structuralFeature) {
		super();
		this.insertString = insertString;
		this.prefix = prefix;
		this.startsWithPrefix = startsWithPrefix;
		this.structuralFeature = structuralFeature;
	}
	
	public java.lang.String getInsertString() {
		return insertString;
	}
	
	public java.lang.String getPrefix() {
		return prefix;
	}
	
	public boolean getStartsWithPrefix() {
		return startsWithPrefix;
	}
	
	public org.eclipse.swt.graphics.Image getImage() {
		return image;
	}
	
	public boolean isStructuralFeature() {
		return structuralFeature;
	}
	
	public boolean equals(Object object) {
		if (object instanceof KermetaCompletionProposal) {
			KermetaCompletionProposal other = (KermetaCompletionProposal) object;
			return other.getInsertString().equals(getInsertString());
		}
		return false;
	}
	
	public int hashCode() {
		return getInsertString().hashCode();
	}
	
	public int compareTo(KermetaCompletionProposal object) {
		if (object instanceof KermetaCompletionProposal) {
			KermetaCompletionProposal other = (KermetaCompletionProposal) object;
			// proposals that start with the prefix are preferred over the ones that do not
			int startCompare = (startsWithPrefix ? 1 : 0) - (other.getStartsWithPrefix() ? 1 : 0);
			// if both proposals start with the prefix of both do not the insert string is
			// compared
			return startCompare == 0 ? getInsertString().compareTo(other.getInsertString()) : -startCompare;
		}
		return -1;
	}
	
}