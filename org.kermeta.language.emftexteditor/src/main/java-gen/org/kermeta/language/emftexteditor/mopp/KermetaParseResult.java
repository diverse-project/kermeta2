/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaParseResult implements org.kermeta.language.emftexteditor.IKermetaParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.kermeta.language.emftexteditor.IKermetaCommand<org.kermeta.language.emftexteditor.IKermetaTextResource>> commands = new java.util.ArrayList<org.kermeta.language.emftexteditor.IKermetaCommand<org.kermeta.language.emftexteditor.IKermetaTextResource>>();
	
	public KermetaParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.kermeta.language.emftexteditor.IKermetaCommand<org.kermeta.language.emftexteditor.IKermetaTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
