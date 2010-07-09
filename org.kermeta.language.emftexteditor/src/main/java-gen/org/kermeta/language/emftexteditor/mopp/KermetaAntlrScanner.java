/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaAntlrScanner implements org.kermeta.language.emftexteditor.IKermetaTextScanner {
	
	private org.antlr.runtime3_2_0.Lexer antlrLexer;
	
	public KermetaAntlrScanner(org.antlr.runtime3_2_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_2_0.Token current = antlrLexer.nextToken();
		org.kermeta.language.emftexteditor.IKermetaTextToken result = new org.kermeta.language.emftexteditor.mopp.KermetaTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_2_0.ANTLRStringStream(text));
	}
	
}
