package kompren.slicer.edit.contribution;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class KomprenHandler extends AbstractHandler {
	protected List<IFile> paths;
	
	public KomprenHandler() {
		super();
		paths = new ArrayList<IFile>();
	}
	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);

		paths.clear();
		
		if(selection!=null && !selection.isEmpty() && selection instanceof StructuredSelection) {
			List<?> listSel = ((StructuredSelection)selection).toList();

			for(Object obj : listSel)
				if(obj instanceof IFile && supportExtension((IFile)obj))
					paths.add((IFile)obj);
		}
		
		return null;
	}
	
	
	protected abstract boolean supportExtension(final IFile file);
}
