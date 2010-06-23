/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface IKptTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public org.kermeta.kp.editor.IKptTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public org.kermeta.kp.editor.IKptTokenResolver createCollectInTokenResolver(String featureName);
}
