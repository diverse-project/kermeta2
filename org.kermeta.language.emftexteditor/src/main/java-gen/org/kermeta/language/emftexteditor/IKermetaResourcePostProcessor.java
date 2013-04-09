/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

/**
 * Implementors of this interface can be used to post-process parsed text
 * resources. This can be useful to validate or modify the model that was
 * instantiated for the text.
 */
public interface IKermetaResourcePostProcessor {
	
	/**
	 * Processes the resource after it was parsed. This method is automatically called
	 * for registered post processors.
	 * 
	 * @param resource the resource to validate of modify
	 */
	public void process(org.kermeta.language.emftexteditor.mopp.KermetaResource resource);
	
}
