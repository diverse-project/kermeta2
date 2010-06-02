/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

// Implementors of this interface can be configured by a
// map of options (or parameters).
public interface IKermetaConfigurable {
	
	// Passed the options given by the map to the configurable
	// object.
	public void setOptions(java.util.Map<?,?> options);
}
