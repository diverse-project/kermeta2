/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaAntlrScanner implements org.kermeta.language.emftexteditor.IKermetaTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public KermetaAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		org.kermeta.language.emftexteditor.IKermetaTextToken result = new org.kermeta.language.emftexteditor.mopp.KermetaTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
