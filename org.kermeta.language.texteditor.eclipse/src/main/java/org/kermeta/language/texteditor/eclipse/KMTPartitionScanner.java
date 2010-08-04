package org.kermeta.language.texteditor.eclipse;

import org.eclipse.jface.text.IDocument;
import org.kermeta.language.lexer.*;
import org.eclipse.jface.text.rules.*;

public class KMTPartitionScanner implements IPartitionTokenScanner {
	public final static String XML_COMMENT = "__xml_comment";
	public final static String XML_TAG = "__xml_tag";
	private KMLexer lexer;
	
	public KMTPartitionScanner() {

		IToken xmlComment = new Token(XML_COMMENT);
		IToken tag = new Token(XML_TAG);
		
		
	/*	IPredicateRule[] rules = new IPredicateRule[2];

		rules[0] = new MultiLineRule("/*", "*///", xmlComment);
		//rules[1] = new TagRule(tag);
		//rules[2] = new SingleLineRule("//", Token.UNDEFINED.toString(), xmlComment);
		//TODO javadoc-like comment as follow 
		//rules[3] = new SingleLineRule(startSequence, endSequence, token, escapeCharacter, breaksOnEOF, escapeContinuesLine)

		//setPredicateRules(rules);
	}

	@Override
	public void setPartialRange(IDocument document, int offset, int length,
			String contentType, int partitionOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTokenLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTokenOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IToken nextToken() {
		 /* INIT GHOST LEXER */
        if (lexer == null) {
            int ch = input.read();
            while (ch != EOF) {
                ch = input.read();
            }
            lexer = new KMLexer(input.readText().toString());
            input.backup(input.readLengthEOF());
        }
		return null;
	}

	@Override
	public void setRange(IDocument document, int offset, int length) {
		// TODO Auto-generated method stub
		
	}
}
