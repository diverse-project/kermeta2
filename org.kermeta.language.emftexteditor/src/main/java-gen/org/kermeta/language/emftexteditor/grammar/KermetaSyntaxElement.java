/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class KermetaSyntaxElement {
	
	private KermetaSyntaxElement[] children;
	private KermetaSyntaxElement parent;
	private org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality;
	
	public KermetaSyntaxElement(org.kermeta.language.emftexteditor.grammar.KermetaCardinality cardinality, KermetaSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (KermetaSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(KermetaSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public KermetaSyntaxElement[] getChildren() {
		if (children == null) {
			return new KermetaSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.kermeta.language.emftexteditor.grammar.KermetaCardinality getCardinality() {
		return cardinality;
	}
	
}
