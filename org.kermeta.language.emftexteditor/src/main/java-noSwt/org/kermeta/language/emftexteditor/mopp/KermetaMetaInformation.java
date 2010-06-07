/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaMetaInformation implements org.kermeta.language.emftexteditor.IKermetaMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "kermeta";
	}
	
	public java.lang.String getURI() {
		return "http://www.kermeta.org/kermeta/2_0_0//kermeta";
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTextScanner createLexer() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaAntlrScanner(new org.kermeta.language.emftexteditor.mopp.KermetaLexer());
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new org.kermeta.language.emftexteditor.mopp.KermetaParser().createInstance(inputStream, encoding);
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTextPrinter createPrinter(java.io.OutputStream outputStream, org.kermeta.language.emftexteditor.IKermetaTextResource resource) {
		return new org.kermeta.language.emftexteditor.mopp.KermetaPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.kermeta.language.emftexteditor.IKermetaReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaReferenceResolverSwitch();
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTokenResolverFactory getTokenResolverFactory() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.kermeta.language.emftexteditor/concrete_syntax/kermeta_java.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaParser(null).getTokenNames();
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new org.kermeta.language.emftexteditor.mopp.KermetaTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kermeta.language.emftexteditor.IKermetaBracketPair> getBracketPairs() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.kermeta.language.emftexteditor.IKermetaHoverTextProvider getHoverTextProvider() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaHoverTextProvider();
	}
	
	public void /*org.kermeta.language.emftexteditor.ui.KermetaColorManager*/ createColorManager() {
		//return new org.kermeta.language.emftexteditor.ui.KermetaColorManager();
	}
	
	public void /*org.eclipse.jface.text.rules.ITokenScanner*/ createTokenScanner(/*org.kermeta.language.emftexteditor.ui.KermetaColorManager colorManager*/) {
		//return new org.kermeta.language.emftexteditor.ui.KermetaTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaResourceFactory();
	}
	
	public org.kermeta.language.emftexteditor.mopp.KermetaNewFileContentProvider getNewFileContentProvider() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaNewFileContentProvider();
	}
	
	public org.kermeta.language.emftexteditor.mopp.KermetaCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaCodeCompletionHelper();
	}
	
}
