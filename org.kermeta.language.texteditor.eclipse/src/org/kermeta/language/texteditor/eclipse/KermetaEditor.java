package org.kermeta.language.texteditor.eclipse;

import org.eclipse.ui.editors.text.TextEditor;

public class KermetaEditor extends TextEditor {

	private KermetaColorManager colorManager;
	
	public KermetaEditor(){

		colorManager = new KermetaColorManager();
		setDocumentProvider(new org.eclipse.ui.editors.text.TextFileDocumentProvider());
		
		//org.eclipse.ui.editors.text.TextFileDocumentProvider
		
		setSourceViewerConfiguration(new KermetaEditorConfiguration(this, colorManager));
		//initializeEditingDomain();
		//addBackgroundParsingListener(new MarkerUpdateListener());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
	
}
