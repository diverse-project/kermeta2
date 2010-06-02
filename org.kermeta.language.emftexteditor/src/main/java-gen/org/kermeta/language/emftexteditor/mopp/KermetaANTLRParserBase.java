/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public abstract class KermetaANTLRParserBase extends org.antlr.runtime.Parser implements org.kermeta.language.emftexteditor.IKermetaTextParser {
	
	public KermetaANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public KermetaANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
