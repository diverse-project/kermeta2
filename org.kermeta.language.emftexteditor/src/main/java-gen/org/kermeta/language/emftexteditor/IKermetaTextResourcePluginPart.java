/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

// This interface is extended by all other EMFText runtime
// API interfaces for generated components. It provides
// access to the plug-in meta information.
public interface IKermetaTextResourcePluginPart {
	
	// Returns a meta information object for the language plug-in
	// that contains this part.
	public org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation getMetaInformation();
}
