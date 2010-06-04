/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.resource.kermeta.mopp;

public class KermetaMetaInformation implements org.kermeta.language.emftexteditor.resource.kermeta.IKermetaMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "kermeta";
	}
	
	public java.lang.String getURI() {
		return "http://www.kermeta.org/kermeta/1_2_0//kermeta";
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.IKermetaTextScanner createLexer() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaAntlrScanner(new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaLexer());
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.IKermetaTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaParser().createInstance(inputStream, encoding);
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.IKermetaTextPrinter createPrinter(java.io.OutputStream outputStream, org.kermeta.language.emftexteditor.resource.kermeta.IKermetaTextResource resource) {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.IKermetaReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaReferenceResolverSwitch();
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.IKermetaTokenResolverFactory getTokenResolverFactory() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.kermeta.language.emftexteditor/model/kermeta_java.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaParser(null).getTokenNames();
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.IKermetaTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kermeta.language.emftexteditor.resource.kermeta.IKermetaBracketPair> getBracketPairs() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.IKermetaHoverTextProvider getHoverTextProvider() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaHoverTextProvider();
	}
	
	public void /*org.kermeta.language.emftexteditor.resource.kermeta.ui.KermetaColorManager*/ createColorManager() {
		//return new org.kermeta.language.emftexteditor.resource.kermeta.ui.KermetaColorManager();
	}
	
	public void /*org.eclipse.jface.text.rules.ITokenScanner*/ createTokenScanner(/*org.kermeta.language.emftexteditor.resource.kermeta.ui.KermetaColorManager colorManager*/) {
		//return new org.kermeta.language.emftexteditor.resource.kermeta.ui.KermetaTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaResourceFactory();
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaNewFileContentProvider getNewFileContentProvider() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaNewFileContentProvider();
	}
	
	public org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.language.emftexteditor.resource.kermeta.mopp.KermetaCodeCompletionHelper();
	}
	
}
