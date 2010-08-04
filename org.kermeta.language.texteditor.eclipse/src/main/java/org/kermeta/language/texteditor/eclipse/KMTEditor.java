package org.kermeta.language.texteditor.eclipse;

import org.eclipse.ui.editors.text.TextEditor;

public class KMTEditor extends TextEditor {

	private ColorManager colorManager;

	public KMTEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new KMTConfiguration(colorManager));
		setDocumentProvider(new KMTDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
