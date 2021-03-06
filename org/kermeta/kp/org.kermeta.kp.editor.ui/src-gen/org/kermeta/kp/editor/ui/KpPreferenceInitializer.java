/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

/**
 * A class used to initialize default preference values.
 */
public class KpPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.kermeta.kp.editor.ui.KpAntlrTokenHelper tokenHelper = new org.kermeta.kp.editor.ui.KpAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kp.editor.ui.KpUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.kermeta.kp.editor.ui.KpPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.kermeta.kp.editor.ui.KpPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kp.editor.ui.KpUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.kermeta.kp.editor.mopp.KpMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.kp.editor.ui.KpUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.kermeta.kp.editor.mopp.KpMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.kermeta.kp.editor.IKpMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.kermeta.kp.editor.ui.KpBracketSet bracketSet = new org.kermeta.kp.editor.ui.KpBracketSet(null, null);
		final java.util.Collection<org.kermeta.kp.editor.IKpBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.kermeta.kp.editor.IKpBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.kermeta.kp.editor.ui.KpPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.kermeta.kp.editor.IKpMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			org.kermeta.kp.editor.IKpTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.kp.editor.ui.KpSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
