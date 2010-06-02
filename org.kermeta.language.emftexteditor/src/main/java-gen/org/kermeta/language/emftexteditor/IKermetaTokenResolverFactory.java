/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface IKermetaTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public org.kermeta.language.emftexteditor.IKermetaTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public org.kermeta.language.emftexteditor.IKermetaTokenResolver createCollectInTokenResolver(String featureName);
}
