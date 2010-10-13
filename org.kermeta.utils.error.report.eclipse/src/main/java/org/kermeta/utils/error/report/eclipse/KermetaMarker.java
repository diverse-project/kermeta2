/* $Id: $
 * Project    : org.kermeta.utils.error.report.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 7 sept. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.utils.error.report.eclipse;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.kermeta.language.api.messaging.ProblemMessage.Severity;
import org.kermeta.traceability.TextReference;

/**
 * Helper class to add markers to text files
 */
public class KermetaMarker {
	/**
	 * The marker type : must correspond to the type that is declared in the
	 * extension "org.eclipse.core.resources.markers" in
	 * fr.irisa.triskell.kermeta/plugin.xml (super
	 * type="org.eclipse.core.resources.problemmarker")
	 */
	protected static String getMarkerType() {
		return IMarker.PROBLEM;
	}

	/*protected void markError(IFile file, String message) throws CoreException {
		mark(file, message, IMarker.SEVERITY_ERROR, null, null);
	}*/

	protected void markError(IFile file, String message, int charStart,
			int charStop) throws CoreException {
		mark(file, message, IMarker.SEVERITY_ERROR, charStart, charStop);
	}

	/*protected void markWarning(IFile file, String message) throws CoreException {
		mark(file, message, IMarker.SEVERITY_WARNING, null, null);
	}*/

	protected void markWarning(IFile file, String message, int charStart,
			int charStop) throws CoreException {
		mark(file, message, IMarker.SEVERITY_WARNING, charStart, charStop);
	}

	/*protected void markInfo(IFile file, String message) throws CoreException {
		mark(file, message, IMarker.SEVERITY_INFO, null, null);
	}*/

	protected void mark(IFile file, String message, int severity, int charStart, int charStop) throws CoreException {
		System.out.println("Mark stg" + file.getFullPath().toOSString());
		HashMap<String, java.lang.Object> datas = new HashMap<String, java.lang.Object>();
		datas.put(IMarker.MESSAGE, message);
		datas.put(IMarker.SEVERITY, severity);

		if (charStart < 0)
			datas.put(IMarker.CHAR_START, charStart);
		else
			datas.put(IMarker.CHAR_START, 0);

		if (charStop < 0)
			datas.put(IMarker.CHAR_END, charStop);
		else
			datas.put(IMarker.CHAR_END, 0);

		MarkerUtilities.createMarker(file, datas, getMarkerType());
	}


	public void treatMarker(TextReference ref, String message, String groupId, Severity severity) {
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(ref.getFileURI());
		
		/*IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		
*/
		// URI might not point at a platform file
		if (file == null) {
			System.out.println("File at " + ref.getFileURI() + "not found");
			return;
		}
		System.out.println("About to mark stg" + ref.getFileURI());
		int charStart = (ref.getCharBeginAt()== null)? -1 : ref.getCharBeginAt() ;
		int charEnd = (ref.getCharEndAt()== null)? -1 : ref.getCharEndAt();
		try {
			if (severity == Severity.ERROR) {
				System.out.println("ERROR MARK");
				markError(file, message, charStart , charEnd);
			}
			if (severity == Severity.FATAL) {
				markError(file, message, charStart , charEnd);
			}
			if (severity == Severity.OK) {
				System.out.println("OK MARK");
				clearMarkers(file);
			}
			if (severity == Severity.WARNING) {
				markWarning(file, message, charStart , charEnd);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Clear previous marker in the given file; in the texteditor, markers
	 * display messages/warning/errors icons at begining of lines in the text
	 * editors and underline elements that are concerned by those messages (for
	 * example, invalid calls).
	 */
	protected void clearMarkers(IFile file) {
		try {
			if (file != null)
				file.deleteMarkers(getMarkerType(), false, IResource.DEPTH_INFINITE);
		} catch (Exception ex) {
			// ex.printStackTrace();
		}
	}

}
