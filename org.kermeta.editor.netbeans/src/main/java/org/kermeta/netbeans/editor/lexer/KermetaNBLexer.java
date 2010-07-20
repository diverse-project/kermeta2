/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.netbeans.editor.lexer;

import org.kermeta.language.lexer.KMLexer;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerInput;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.netbeans.spi.lexer.TokenFactory;
import scala.util.parsing.combinator.token.Tokens;

/**
 *
 * @author ffouquet
 */
public class KermetaNBLexer implements Lexer<KmTokenId> {

    private LexerInput input;
    private TokenFactory<KmTokenId> tokenFactory;
    private KMLexer lexer;
    private static final int EOF = LexerInput.EOF;

    KermetaNBLexer(LexerRestartInfo<KmTokenId> info) {

        this.input = info.input();

        this.input.readText();
        this.tokenFactory = info.tokenFactory();
        assert (info.state() == null); // passed argument always null

    }

    @Override
    public Token<KmTokenId> nextToken() {

        /* INIT GHOST LEXER */
        if (lexer == null) {
            int ch = input.read();
            while (ch != EOF) {
                ch = input.read();
            }
            lexer = new KMLexer(input.readText().toString());
            input.backup(input.readLengthEOF());
        }

        int ch = input.read();

        if(ch == EOF) return null;

        if (Character.isWhitespace((char) ch)) {
            ch = input.read();
            while (ch != EOF && Character.isWhitespace((char) ch)) {
                ch = input.read();
            }
            input.backup(1);
            return token(KmTokenId.WHITESPACE);
        }

        Tokens.Token tok = lexer.nextToken();
        for (int i = 0; i < tok.toString().length()- 1; i++) {
            input.read();
        }

        System.out.println(
                "=" + tok.toString());
        System.out.println(
                "=" + input.readText());






        return token(getNBTokenFromKMToken(tok));







    }

    @Override
    public Object state() {
        return null;


    }

    @Override
    public void release() {
    }

    private Token<KmTokenId> token(KmTokenId id) {
        return (id.fixedText() != null)
                ? tokenFactory.getFlyweightToken(id, id.fixedText())
                : tokenFactory.createToken(id);


    }

    public KmTokenId getNBTokenFromKMToken(Tokens.Token tok) {
        KmTokenId id = null;
        String className = tok.getClass().getSimpleName();



        if (className.equals("MLComment")) {
            id = KmTokenId.ML_COMMENT;


        }
        if (className.equals("Delimiter")) {
            id = KmTokenId.SEPARATOR;


        }
        if (className.equals("Identifier")) {
            id = KmTokenId.IDENTIFIER;


        }
        if (className.equals("StringLit")) {
            id = KmTokenId.STRING;


        }
        if (className.equals("Keyword")) {
            id = KmTokenId.KEYWORD;


        }
        if (className.equals("NumericLit")) {
            id = KmTokenId.INT_LITERAL;


        }

        if (id == null) {
            id = KmTokenId.ERROR;


        }

        return id;

    }
}
