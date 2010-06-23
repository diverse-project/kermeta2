/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

// An interface used to access the result of parsing a
// document.
public interface IKptParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> getPostParseCommands();
}
