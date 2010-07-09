/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.ui;

public class KermetaCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.kermeta.language.emftexteditor.ui.KermetaEditor editor;
	
	public KermetaCompletionProcessor(org.kermeta.language.emftexteditor.ui.KermetaEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		org.kermeta.language.emftexteditor.IKermetaTextResource textResource = (org.kermeta.language.emftexteditor.IKermetaTextResource) resource;
		java.lang.String content = viewer.getDocument().get();
		org.kermeta.language.emftexteditor.ui.KermetaCodeCompletionHelper helper = new org.kermeta.language.emftexteditor.ui.KermetaCodeCompletionHelper();
		org.kermeta.language.emftexteditor.ui.KermetaCompletionProposal[] proposals = helper.computeCompletionProposals(textResource, content, offset);
		
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[proposals.length];
		int i = 0;
		for (org.kermeta.language.emftexteditor.ui.KermetaCompletionProposal proposal : proposals) {
			java.lang.String proposalString = proposal.getInsertString();
			java.lang.String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			org.kermeta.language.emftexteditor.ui.IKermetaBracketHandler bracketHandler = editor.getBracketHandler();
			java.lang.String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, proposalString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
