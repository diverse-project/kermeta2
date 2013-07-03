package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.builder.eclipse.KermetaBuilderEventListener;
import org.kermeta.language.texteditor.eclipse.internal.autocompletion.BracketInserter;
import org.kermeta.language.texteditor.eclipse.internal.outline.KermetaOutline;
import org.kermeta.language.util.ModelingUnit;


public class KermetaEditor extends TextEditor implements  KermetaBuilderEventListener {

	private KermetaColorManager colorManager;
	private BracketInserter fBracketInserter= null;
	private KermetaOutline outline;
	public KermetaModelAccessor myAccess;
	
	public KermetaEditor(){
		super();
		colorManager = new KermetaColorManager();

		setSourceViewerConfiguration(new KermetaEditorConfiguration(this, colorManager));
		setDocumentProvider(new org.eclipse.ui.editors.text.TextFileDocumentProvider());
		myAccess = new KermetaModelAccessor();
		
	}
	// Added by Suresh for the Outline
	public Object getAdapter(Class adapter) {
		if (adapter.equals(IContentOutlinePage.class)) {
			if (outline == null) {
				outline = new KermetaOutline(this);
				//outline.update();
				org.kermeta.language.builder.eclipse.Activator.getDefault().registerListener(this);
			}
			return outline;
		}
		return super.getAdapter(adapter);
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		ISourceViewer sourceViewer= getSourceViewer();
		fBracketInserter = new BracketInserter(sourceViewer);
		if (sourceViewer instanceof ITextViewerExtension)
			((ITextViewerExtension) sourceViewer).prependVerifyKeyListener(fBracketInserter);
	}

	public void dispose() {
		colorManager.dispose();
		ISourceViewer sourceViewer= getSourceViewer();
		if (sourceViewer instanceof ITextViewerExtension)
			((ITextViewerExtension) sourceViewer).removeVerifyKeyListener(fBracketInserter);	
		org.kermeta.language.builder.eclipse.Activator.getDefault().unregisterListener(this);
		super.dispose();
	}

	@Override
	protected void firePropertyChange(int property) {
		super.firePropertyChange(property);
		if (property == KermetaEditor.PROP_DIRTY) {
			if (! this.isDirty()) {
				KermetaBuilder.getDefault().setDirty(getFile(), false);
				Activator.getDefault().dirtyFilesContainment.remove(getFile());
			} else {
				KermetaBuilder.getDefault().setDirty(getFile(), true);
				Activator.getDefault().dirtyFilesContainment.put(getFile(),new String());
			}
		}
	}
	
    public IFile getFile() {
    	if( getEditorInput() instanceof IFileEditorInput ) {
            IFileEditorInput input = (IFileEditorInput)getEditorInput();
            return input.getFile();
        }
    	return null;
    }
    
    /*
	 * @see AbstractTextEditor#doSetInput(IEditorInput)
	 */
	protected void doSetInput(IEditorInput input) throws CoreException {
		super.doSetInput(input);
		// update accessor so it will know about the current file in the editor
		if( input instanceof IFileEditorInput ) {
			myAccess.setEditor(this);
        }
	}
    
	@Override
	public void projectCompiled(IProject project, ModelingUnit lastCompiledKm) {
		// Check if file belongs to project that update
		// TODO the file may still be visible from another eclipse project via the kp require statement
		if(getFile().getProject().getName().equals(project.getName())){
			myAccess.setSourceModelingUnit(lastCompiledKm);
			outline.update(lastCompiledKm);
		}		
	}
	
	public ModelingUnit loadPrecompiledKMForFile(){
		IFile file = this.getFile().getProject().getFile("target/beforeCheckingforScopeRESOLVED.km");
		if (file == null){
			file = this.getFile().getProject().getFile("target/beforeCheckingforScopeMERGED.km");
		}
		if (file != null){
			try {
				ResourceSet resSet = new ResourceSetImpl();
				Resource res = resSet.getResource(org.kermeta.utils.helpers.emf.EMFUriHelper.convertToEMFUri(file.getLocationURI()), true);
				ModelingUnit rtNode = new ModelingUnit( file.getName(), res.getContents());	
				
				return rtNode;
			} catch(RuntimeException e){
				return null;
			}
		}
		return null;
	}
	
}
