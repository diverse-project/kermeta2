/* $Id: KMLexer.scala 11856 2010-07-23 12:41:04Z dvojtise $
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 *           Francois Fouquet 
 */
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
	//private int estimatedOffset;
	private KMLexer lexer = null;
	private org.kermeta.language.lexer.KTokens.KToken actualToken = null;
	
	public KermetaScanner(KermetaColorManager _colorManager,org.kermeta.language.texteditor.eclipse.KermetaEditor _editor){
		colorManager = _colorManager;
		editor = _editor;
	}
	
	//private int rangeOffset = 0;
	
//	@Override
	public void setRange(IDocument document, int offset, int length) {
	
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
			Object t = lexer.nextToken();
			if(t instanceof org.kermeta.language.lexer.KTokens.KToken){
				actualToken = (org.kermeta.language.lexer.KTokens.KToken) t;
			}
			if(t instanceof org.kermeta.language.lexer.KTokens.KError ){
				org.kermeta.language.lexer.KTokens.KError k = (org.kermeta.language.lexer.KTokens.KError) t;
			}
		} catch (Exception e){
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		/*try{
			actualToken = (org.kermeta.language.lexer.KTokens.KToken) lexer.nextToken();
		//	KError k;
		} catch (Exception e){
			return org.eclipse.jface.text.rules.Token.EOF;
		}*/
		if (actualToken.getClass().getSimpleName().equals("KEOF")) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		String tokenName = actualToken.getClass().getSimpleName();
		
		
		RGB color = new RGB(0,0,0);
		int style = org.eclipse.swt.SWT.NORMAL;
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

		if(tokenName.equals("KIncomplet") || tokenName.equals("KError")){
			
			color=new RGB(0,128,0);
			style = SWT.BOLD;
			//TODO report error to error system
		}
		
		
		System.out.println(tokenName+"\t Offset="+getTokenOffset()+"; Length="+getTokenLength() +"; -> " +actualToken.toString());
		TextAttribute ta = new TextAttribute(colorManager.getColor(color),null,style);
		Token token =  new Token(ta) ;
		
		return token;
	}

	//	@Override
	public int getTokenOffset() {
		return actualToken.getOffset();
		
	}

	//	@Override
	public int getTokenLength() {
		return actualToken.getLength();
	}

}
