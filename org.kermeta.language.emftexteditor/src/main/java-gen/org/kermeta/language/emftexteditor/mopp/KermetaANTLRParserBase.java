/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public abstract class KermetaANTLRParserBase extends org.antlr.runtime3_2_0.Parser implements org.kermeta.language.emftexteditor.IKermetaTextParser {
	
	public KermetaANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input) {
		super(input);
	}
	
	public KermetaANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input, org.antlr.runtime3_2_0.RecognizerSharedState state) {
		super(input, state);
	}
	
}
