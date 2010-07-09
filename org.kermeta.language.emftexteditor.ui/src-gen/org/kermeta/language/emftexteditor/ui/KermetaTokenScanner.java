/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class KermetaTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.kermeta.language.emftexteditor.IKermetaTextScanner lexer;
	private org.kermeta.language.emftexteditor.IKermetaTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.kermeta.language.emftexteditor.ui.KermetaColorManager colorManager;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public KermetaTokenScanner(org.kermeta.language.emftexteditor.ui.KermetaColorManager colorManager) {
		this.lexer = new org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation().createLexer();
		this.languageId = new org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation().getSyntaxName();
		this.store = org.kermeta.language.emftexteditor.ui.KermetaUIPlugin.getDefault().getPreferenceStore();
		this.colorManager = colorManager;
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(color, null, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
}
