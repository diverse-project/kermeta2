/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.ui;

public class KermetaUIMetaInformation extends org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation {
	
	public org.kermeta.language.emftexteditor.IKermetaHoverTextProvider getHoverTextProvider() {
		return new org.kermeta.language.emftexteditor.ui.KermetaHoverTextProvider();
	}
	
	public org.kermeta.language.emftexteditor.ui.KermetaColorManager createColorManager() {
		return new org.kermeta.language.emftexteditor.ui.KermetaColorManager();
	}
	
	public org.kermeta.language.emftexteditor.ui.KermetaTokenScanner createTokenScanner(org.kermeta.language.emftexteditor.ui.KermetaColorManager colorManager) {
		return new org.kermeta.language.emftexteditor.ui.KermetaTokenScanner(colorManager);
	}
	
	public org.kermeta.language.emftexteditor.ui.KermetaCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.language.emftexteditor.ui.KermetaCodeCompletionHelper();
	}
	
}
