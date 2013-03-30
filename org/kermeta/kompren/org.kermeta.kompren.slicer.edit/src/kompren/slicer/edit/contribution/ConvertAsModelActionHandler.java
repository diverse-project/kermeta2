package kompren.slicer.edit.contribution;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class ConvertAsModelActionHandler extends KomprenHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		super.execute(event);
		
		for(final IFile file : paths)
			convertKomprentFile(file);
		
		return null;
	}
	
	
	protected void convertKomprentFile(final IFile file) {
		org.kermeta.kompren.MainRunner.convertAsXMI(file.getLocation().toString());
		try { file.getParent().refreshLocal(IResource.DEPTH_ONE, null); }
		catch(final CoreException ex) { ex.printStackTrace(System.err); }
	}
	
	
	@Override
	protected boolean supportExtension(final IFile file) {
		return file.getFileExtension().equals("komprent");
	}
}
