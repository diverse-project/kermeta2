/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private KermetaSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<java.lang.Integer> indicesToPrint = new java.util.ArrayList<java.lang.Integer>();
	
	public KermetaSyntaxElementDecorator(org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement decoratedElement, KermetaSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(java.lang.Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.kermeta.language.emftexteditor.grammar.KermetaSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public KermetaSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public java.lang.Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
