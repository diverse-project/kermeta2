/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

// Implementors of this interface can provide a post-processor
// for text resources.
public interface IKermetaResourcePostProcessorProvider {
	
	// Returns the processor that shall be called after text
	// resource are successfully parsed.
	public org.kermeta.language.emftexteditor.IKermetaResourcePostProcessor getResourcePostProcessor();
}
