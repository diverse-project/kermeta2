/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

// This interface is extended by all other EMFText runtime
// API interfaces for generated components. It provides
// access to the plug-in meta information.
public interface IKptTextResourcePluginPart {
	
	// Returns a meta information object for the language plug-in
	// that contains this part.
	public org.kermeta.kp.editor.mopp.KptMetaInformation getMetaInformation();
}
