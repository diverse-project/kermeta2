/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IKermetaParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.kermeta.language.emftexteditor.IKermetaCommand<org.kermeta.language.emftexteditor.IKermetaTextResource>> getPostParseCommands();
	
}
