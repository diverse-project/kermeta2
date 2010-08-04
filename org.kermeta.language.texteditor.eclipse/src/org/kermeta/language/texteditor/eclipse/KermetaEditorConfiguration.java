package org.kermeta.language.texteditor.eclipse;

public class KermetaEditorConfiguration extends org.eclipse.jface.text.source.SourceViewerConfiguration {

	private org.kermeta.language.texteditor.eclipse.KermetaColorManager colorManager;
	private org.kermeta.language.texteditor.eclipse.KermetaEditor theEditor;
	
	// Create a new editor configuration.
	//
	// @param editor
	// @param colorManager
	///
	public KermetaEditorConfiguration(org.kermeta.language.texteditor.eclipse.KermetaEditor editor, org.kermeta.language.texteditor.eclipse.KermetaColorManager colorManager) {
		this.theEditor = editor;
		this.colorManager = colorManager;
	}
	
	public org.eclipse.jface.text.presentation.IPresentationReconciler getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		org.eclipse.jface.text.presentation.PresentationReconciler reconciler = new org.eclipse.jface.text.presentation.PresentationReconciler();
		
		
		org.eclipse.jface.text.rules.DefaultDamagerRepairer repairer = new org.eclipse.jface.text.rules.DefaultDamagerRepairer(getScanner());
		
		reconciler.setDamager(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		return reconciler;
	}
	
	// @param fileExtension
	// @return
	protected org.eclipse.jface.text.rules.ITokenScanner getScanner() {
		return new org.kermeta.language.texteditor.eclipse.KermetaScanner(colorManager,theEditor);
	}
	
	
}
