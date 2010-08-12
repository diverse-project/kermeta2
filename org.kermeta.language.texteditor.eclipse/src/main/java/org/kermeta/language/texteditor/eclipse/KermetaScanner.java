package org.kermeta.language.texteditor.eclipse;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.kermeta.language.lexer.KMLexer;

public class KermetaScanner implements org.eclipse.jface.text.rules.ITokenScanner {

	private KermetaColorManager colorManager ;
	private org.kermeta.language.texteditor.eclipse.KermetaEditor editor;
	private int estimatedOffset;
	private KMLexer lexer = null;
	private org.kermeta.language.lexer.KTokens.KToken actualToken = null;
	
	public KermetaScanner(KermetaColorManager _colorManager,org.kermeta.language.texteditor.eclipse.KermetaEditor _editor){
		colorManager = _colorManager;
		editor = _editor;
	}
	
//	@Override
	public void setRange(IDocument document, int offset, int length) {
		
		this.estimatedOffset = offset;
		try {
			// Note: do not try to parse only this range, recheck the whole document (more reliable)
			String content = document.get(0, document.getLength());			
			lexer = new KMLexer(content);
		} catch (org.eclipse.jface.text.BadLocationException e) {
			//ignore this error. It might occur during editing when locations are outdated quickly.
		}
	}

//	@Override
	public IToken nextToken() {
		try{
			 if(actualToken != null){
				 estimatedOffset = estimatedOffset + actualToken.toString().length();
			}
			else{
				estimatedOffset = 0;
			}
			actualToken = (org.kermeta.language.lexer.KTokens.KToken) lexer.nextToken();
			//offset = actualToken.getOffset();
			System.out.println(actualToken.getClass().getSimpleName()+"-"+actualToken.toString());
		} catch (Exception e){
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		if (actualToken == null) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		String tokenName = actualToken.getClass().getSimpleName();
		RGB color = new RGB(0,0,0);
		int style = org.eclipse.swt.SWT.NORMAL;
		if(tokenName.equals("Identifier")){
			color=new RGB(0,0,0);
		}
		if(tokenName.equals("StringLit")){
			color=new RGB(0,0,255);
		}
		if(tokenName.equals("NumericLit")){
			color=new RGB(0,0,255);
		}
		if(tokenName.equals("Keyword")){
			color=new RGB(128,0,0);
			style = SWT.BOLD;
		}
		if(tokenName.equals("Delimiter")){
			color=new RGB(64,64,64);
			style =  SWT.UNDERLINE_SINGLE;
		}
		if(tokenName.equals("Comment") || tokenName.equals("MLComment")){
			color=new RGB(0,128,0);
			style=SWT.ITALIC;
		}
		
		
		
		Token token =  new Token(new TextAttribute(colorManager.getColor(color),null,style)) ;
		System.out.println("    Offset="+getTokenOffset()+"; Length="+getTokenLength() +"; -> " +actualToken.toString());
		
		return token;
	}

//	@Override
	public int getTokenOffset() {
		
		if(actualToken.pos() instanceof scala.util.parsing.input.NoPosition$){
			System.out.println("Warn : use estimitatedOffset for ["+ actualToken.productPrefix()+"]"+actualToken.toString());
			return estimatedOffset;
		}
		else {
			// reset estimatedOffset to the real one
			estimatedOffset = actualToken.getOffset();
			return estimatedOffset;
		}
	}

//	@Override
	public int getTokenLength() {
		return actualToken.toString().length();
	}

}
