/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

// A simple interface for commands that can be executed
// and that return information about the success of their
// execution.
public interface IKermetaCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
