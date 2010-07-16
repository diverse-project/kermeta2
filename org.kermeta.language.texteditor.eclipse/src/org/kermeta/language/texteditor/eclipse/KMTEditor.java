package org.kermeta.language.texteditor.eclipse;

import org.eclipse.ui.editors.text.TextEditor;

public class KMTEditor extends TextEditor {

	private ColorManager colorManager;

	public KMTEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
