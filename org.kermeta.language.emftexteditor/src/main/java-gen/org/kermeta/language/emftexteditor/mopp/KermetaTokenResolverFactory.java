/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaTokenResolverFactory implements org.kermeta.language.emftexteditor.IKermetaTokenResolverFactory {
	
	private java.util.Map<java.lang.String, org.kermeta.language.emftexteditor.IKermetaTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, org.kermeta.language.emftexteditor.IKermetaTokenResolver> featureName2CollectInTokenResolver;
	private static org.kermeta.language.emftexteditor.IKermetaTokenResolver defaultResolver = new org.kermeta.language.emftexteditor.analysis.KermetaDefaultTokenResolver();
	
	public KermetaTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, org.kermeta.language.emftexteditor.IKermetaTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, org.kermeta.language.emftexteditor.IKermetaTokenResolver>();
		registerCollectInTokenResolver("comments", new org.kermeta.language.emftexteditor.analysis.KermetaCOLLECT_commentsTokenResolver());
		registerCollectInTokenResolver("comments", new org.kermeta.language.emftexteditor.analysis.KermetaCOLLECT_commentsTokenResolver());
		registerTokenResolver("CASTED", new org.kermeta.language.emftexteditor.analysis.KermetaCASTEDTokenResolver());
		registerTokenResolver("BOOLEAN", new org.kermeta.language.emftexteditor.analysis.KermetaBOOLEANTokenResolver());
		registerTokenResolver("PRIMITIVE_TYPE", new org.kermeta.language.emftexteditor.analysis.KermetaPRIMITIVE_TYPETokenResolver());
		registerTokenResolver("INTEGER", new org.kermeta.language.emftexteditor.analysis.KermetaINTEGERTokenResolver());
		registerTokenResolver("KERMETA_LITERAL", new org.kermeta.language.emftexteditor.analysis.KermetaKERMETA_LITERALTokenResolver());
		registerTokenResolver("IDENTIFIER", new org.kermeta.language.emftexteditor.analysis.KermetaIDENTIFIERTokenResolver());
		registerTokenResolver("QUOTED_34_34", new org.kermeta.language.emftexteditor.analysis.KermetaQUOTED_34_34TokenResolver());
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.kermeta.language.emftexteditor.IKermetaTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.kermeta.language.emftexteditor.IKermetaTokenResolver internalCreateResolver(java.util.Map<java.lang.String, org.kermeta.language.emftexteditor.IKermetaTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, org.kermeta.language.emftexteditor.IKermetaTokenResolver> resolverMap, java.lang.String key, org.kermeta.language.emftexteditor.IKermetaTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
