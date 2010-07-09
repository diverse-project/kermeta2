/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.ui;

public class KermetaHoverTextProvider implements org.kermeta.language.emftexteditor.IKermetaHoverTextProvider {
	
	private org.kermeta.language.emftexteditor.ui.KermetaDefaultHoverTextProvider defaultProvider = new org.kermeta.language.emftexteditor.ui.KermetaDefaultHoverTextProvider();
	
	public java.lang.String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
