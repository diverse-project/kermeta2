/*
* generated by Xtext
*/
package org.kermeta.language.sample.logo.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.kermeta.language.sample.logo.services.LogoTextualSyntaxGrammarAccess;

public class LogoTextualSyntaxParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private LogoTextualSyntaxGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.kermeta.language.sample.logo.parser.antlr.internal.InternalLogoTextualSyntaxParser createParser(XtextTokenStream stream) {
		return new org.kermeta.language.sample.logo.parser.antlr.internal.InternalLogoTextualSyntaxParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "LogoProgram";
	}
	
	public LogoTextualSyntaxGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LogoTextualSyntaxGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
