package org.kermeta.language.texteditor.eclipse;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.RGB;
import org.kermeta.language.lexer.KMLexer;

public class KermetaScanner implements org.eclipse.jface.text.rules.ITokenScanner {

    private KermetaColorManager colorManager;
    private org.kermeta.language.texteditor.eclipse.KermetaEditor editor;
    private int offset;
    private KMLexer lexer = null;
    private org.kermeta.language.lexer.KTokens.KToken actualToken = null;

    public KermetaScanner(KermetaColorManager _colorManager, org.kermeta.language.texteditor.eclipse.KermetaEditor _editor) {
        colorManager = _colorManager;
        editor = _editor;
    }

    @Override
    public void setRange(IDocument document, int offset, int length) {
        this.offset = offset;
        try {
            String content = document.get(offset, length);
            System.out.println(offset + "-" + length + "Set Range,content=" + content);
            lexer = new KMLexer(content);
        } catch (org.eclipse.jface.text.BadLocationException e) {
            //ignore this error. It might occur during editing when locations are outdated quickly.
        }
    }

    @Override
    public IToken nextToken() {
        System.out.println("NEXT");

        try {
            offset = getTokenOffset();
            actualToken = (org.kermeta.language.lexer.KTokens.KToken) lexer.nextToken();
            System.out.println(actualToken.getClass().getSimpleName() + "-" + actualToken.toString());
        } catch (Exception e) {
            return org.eclipse.jface.text.rules.Token.EOF;
        }
        if (actualToken == null) {
            return org.eclipse.jface.text.rules.Token.EOF;
        }

        String tokenName = actualToken.getClass().getSimpleName();
        RGB color = new RGB(0, 0, 0);
        if (tokenName.equals("Identifier")) {
            color = new RGB(128, 0, 0);
        }
        if (tokenName.equals("Keyword")) {
            color = new RGB(0, 0, 128);
        }
        if (tokenName.equals("Delimiter")) {
            color = new RGB(0, 128, 0);
        }
        if (tokenName.equals("Comment")) {
            color = new RGB(128, 0, 0);
        }

        //org.eclipse.jface.text.TextAttribute ta = new org.eclipse.jface.text.TextAttribute(colorManager.getColor(color),null,org.eclipse.swt.SWT.BOLD);

        //	String colorKey = org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.COLOR);
        //	org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));


        //return new org.eclipse.jface.text.rules.Token(ta);

        //Token tok = new Token(Token.OTHER);

        Token token = new Token(new TextAttribute(colorManager.getColor(color)));
        //System.out.println(token);

        return token;
    }

    @Override
    public int getTokenOffset() {
        int result = 0;
        if (actualToken != null) {
            result= offset + actualToken.toString().length();
        } else {
            result= offset;
        }

        System.out.println(result);
        return result ;
    }

    @Override
    public int getTokenLength() {
        return actualToken.toString().length();
    }
}
