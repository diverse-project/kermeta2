/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.ui;

/**
 * A class used to initialize default preference values.
 */
public class KermetaPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.kermeta.language.emftexteditor.ui.KermetaAntlrTokenHelper tokenHelper = new org.kermeta.language.emftexteditor.ui.KermetaAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.language.emftexteditor.ui.KermetaUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		// Set default value for occurrences
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		// store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_
		// RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.language.emftexteditor.ui.KermetaUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.kermeta.language.emftexteditor.ui.KermetaUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.kermeta.language.emftexteditor.IKermetaMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.kermeta.language.emftexteditor.ui.KermetaBracketSet bracketSet = new org.kermeta.language.emftexteditor.ui.KermetaBracketSet(null, null);
		final java.util.Collection<org.kermeta.language.emftexteditor.IKermetaBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.kermeta.language.emftexteditor.IKermetaBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.kermeta.language.emftexteditor.ui.KermetaPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.kermeta.language.emftexteditor.IKermetaMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxColoring(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			org.kermeta.language.emftexteditor.IKermetaTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.kermeta.language.emftexteditor.ui.KermetaSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
