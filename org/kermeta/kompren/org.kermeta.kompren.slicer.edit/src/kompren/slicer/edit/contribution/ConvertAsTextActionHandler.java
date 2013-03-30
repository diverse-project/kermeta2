package kompren.slicer.edit.contribution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org2.kermeta.kompren.slicer.Slicer;

public class ConvertAsTextActionHandler extends KomprenHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		super.execute(event);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("kompren", new XMIResourceFactoryImpl());

		for(final IFile file : paths)
			convertKomprenFile(file);
		
		return null;
	}
	
	protected void convertKomprenFile(final IFile file) {
		final Resource resource = new ResourceSetImpl().getResource(URI.createFileURI(file.getLocation().toString()), true);
		final String code = ((Slicer)resource.getContents().get(0)).toString();
		final File fileOut = new File(file.getLocation().removeFileExtension().addFileExtension("komprent").toString());
		FileWriter fw = null;

		try {
			fw = new FileWriter(fileOut, false);
			fw.write(code);
		}catch(IOException ex) { ex.printStackTrace(System.err); }

		try { if(fw!=null) fw.close(); } catch(final IOException ex) { ex.printStackTrace(System.err); }

		try { file.getParent().refreshLocal(IResource.DEPTH_ONE, null); }
		catch(final CoreException ex) { ex.printStackTrace(System.err); }
	}


	@Override
	protected boolean supportExtension(final IFile file) {
		return file.getFileExtension().equals("kompren");
	}
}
