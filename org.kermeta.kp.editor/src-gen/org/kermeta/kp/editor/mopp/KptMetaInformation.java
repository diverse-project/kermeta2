/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptMetaInformation implements org.kermeta.kp.editor.IKptMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "kpt";
	}
	
	public java.lang.String getURI() {
		return "http://www.kermeta.org/kp/1.0.0";
	}
	
	public org.kermeta.kp.editor.IKptTextScanner createLexer() {
		return new org.kermeta.kp.editor.mopp.KptAntlrScanner(new org.kermeta.kp.editor.mopp.KptLexer());
	}
	
	public org.kermeta.kp.editor.IKptTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new org.kermeta.kp.editor.mopp.KptParser().createInstance(inputStream, encoding);
	}
	
	public org.kermeta.kp.editor.IKptTextPrinter createPrinter(java.io.OutputStream outputStream, org.kermeta.kp.editor.IKptTextResource resource) {
		return new org.kermeta.kp.editor.mopp.KptPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.kermeta.kp.editor.mopp.KptSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.kermeta.kp.editor.mopp.KptSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.kermeta.kp.editor.IKptReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch();
	}
	
	public org.kermeta.kp.editor.IKptTokenResolverFactory getTokenResolverFactory() {
		return new org.kermeta.kp.editor.mopp.KptTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.kermeta.kp.model/model/KermetaProject.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new org.kermeta.kp.editor.mopp.KptParser(null).getTokenNames();
	}
	
	public org.kermeta.kp.editor.IKptTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new org.kermeta.kp.editor.mopp.KptTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKptBracketPair> getBracketPairs() {
		return new org.kermeta.kp.editor.mopp.KptBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kermeta.kp.editor.mopp.KptFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.kermeta.kp.editor.IKptHoverTextProvider getHoverTextProvider() {
		return new org.kermeta.kp.editor.mopp.KptHoverTextProvider();
	}
	
	public org.kermeta.kp.editor.ui.KptColorManager createColorManager() {
		return new org.kermeta.kp.editor.ui.KptColorManager();
	}
	
	public org.eclipse.jface.text.rules.ITokenScanner createTokenScanner(org.kermeta.kp.editor.ui.KptColorManager colorManager) {
		return new org.kermeta.kp.editor.ui.KptTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kermeta.kp.editor.mopp.KptResourceFactory();
	}
	
	public org.kermeta.kp.editor.mopp.KptNewFileContentProvider getNewFileContentProvider() {
		return new org.kermeta.kp.editor.mopp.KptNewFileContentProvider();
	}
	
	public org.kermeta.kp.editor.mopp.KptCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.kp.editor.mopp.KptCodeCompletionHelper();
	}
	
}
