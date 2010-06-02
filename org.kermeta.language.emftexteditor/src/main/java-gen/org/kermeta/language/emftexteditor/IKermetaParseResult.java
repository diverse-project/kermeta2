/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

// An interface used to access the result of parsing a
// document.
public interface IKermetaParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<org.kermeta.language.emftexteditor.IKermetaCommand<org.kermeta.language.emftexteditor.IKermetaTextResource>> getPostParseCommands();
}
