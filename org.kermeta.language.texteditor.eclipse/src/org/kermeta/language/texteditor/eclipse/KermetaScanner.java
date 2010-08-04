package org.kermeta.language.texteditor.eclipse;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.swt.graphics.RGB;
import org.kermeta.language.lexer.KMLexer;

public class KermetaScanner implements org.eclipse.jface.text.rules.ITokenScanner {

	private KermetaColorManager colorManager ;
	private org.kermeta.language.texteditor.eclipse.KermetaEditor editor;
	private int offset;
	private KMLexer lexer = null;
	private org.kermeta.language.lexer.KTokens.KToken actualToken = null;
	
	public KermetaScanner(KermetaColorManager _colorManager,org.kermeta.language.texteditor.eclipse.KermetaEditor _editor){
		colorManager = _colorManager;
		editor = _editor;
	}
	
//	@Override
	public void setRange(IDocument document, int offset, int length) {
		
		this.offset = offset;
		System.out.println("offset"+this.offset);
		try {
			lexer = new KMLexer(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			//ignore this error. It might occur during editing when locations are outdated quickly.
		}
	}

//	@Override
	public IToken nextToken() {
		System.out.println("offset"+this.offset);
		try{
		actualToken = (org.kermeta.language.lexer.KTokens.KToken) lexer.nextToken();
		System.out.println(actualToken.getClass().getSimpleName()+"-"+actualToken.toString());
		} catch (Exception e){
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		if (actualToken == null) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		org.eclipse.jface.text.TextAttribute ta = new org.eclipse.jface.text.TextAttribute(colorManager.getColor(new RGB(128, 0, 0)), null, org.eclipse.jface.text.TextAttribute.STRIKETHROUGH);
		
	//	String colorKey = org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.COLOR);
	//	org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));

		
		return new org.eclipse.jface.text.rules.Token(ta);
	}

//	@Override
	public int getTokenOffset() {
		return offset+getTokenLength();
	}

//	@Override
	public int getTokenLength() {
		return actualToken.toString().length();
	}

}
