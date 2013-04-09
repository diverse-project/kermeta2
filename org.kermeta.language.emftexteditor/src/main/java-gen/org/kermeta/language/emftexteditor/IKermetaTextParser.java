/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

/**
 * A text parser parses a text into a tree of <code>EObject</code>s. It is
 * associated with a <code>TextResource</code>.
 */
public interface IKermetaTextParser extends org.kermeta.language.emftexteditor.IKermetaConfigurable {
	
	/**
	 * Parses the content given to the parser and create a tree of EObjects. The root
	 * of this tree is wrapped together with some commands that might be executed
	 * after parsing into a result object.
	 * 
	 * @return the result of the parse process
	 */
	public org.kermeta.language.emftexteditor.IKermetaParseResult parse();
	
	/**
	 * Parses the document and returns a list of expected elements. Each expected
	 * element covers a range in the input stream.
	 * If the parser implementation can not determine expected elements null can be
	 * returned. This method is used by the code completion to figure out which
	 * proposals can be shown to users for a given cursor position. The class 'type'
	 * is used as start symbol.
	 */
	public java.util.List<org.kermeta.language.emftexteditor.mopp.KermetaExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.kermeta.language.emftexteditor.IKermetaTextResource dummyResource);
	
	/**
	 * Signals the parse to terminate parsing as soon as possible. This method must be
	 * called from a different thread than the one calling parse().
	 */
	public void terminate();
	
}