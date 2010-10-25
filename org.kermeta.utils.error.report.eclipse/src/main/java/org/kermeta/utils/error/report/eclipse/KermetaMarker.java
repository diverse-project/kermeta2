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
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.kermeta.language.api.messaging.ProblemMessage.Severity;
import org.kermeta.traceability.TextReference;
import org.eclipse.ui.PlatformUI;

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
		System.out.println("MARK :" + file.getFullPath().toOSString());
		final HashMap<String, java.lang.Object> datas = new HashMap<String, java.lang.Object>();
		datas.put(IMarker.MESSAGE, message);
		datas.put(IMarker.SEVERITY, severity);
		final IFile f = file;
		
		if (charStart < 0)
			datas.put(IMarker.CHAR_START, charStart);
		else
			datas.put(IMarker.CHAR_START, 0);

		if (charStop < 0)
			datas.put(IMarker.CHAR_END, charStop);
		else
			datas.put(IMarker.CHAR_END, 0);
		
		datas.put(IMarker.LINE_NUMBER, 3);
		
		/*IWorkspaceRunnable r= new IWorkspaceRunnable() {
			 @Override
			 public void run(IProgressMonitor monitor) throws CoreException {
			              IMarker marker= f.createMarker(getMarkerType());
			              marker.setAttributes(datas);
			            }

			};
			
		file.getWorkspace().run(r, null,IWorkspace.AVOID_UPDATE, null);*/

		
		MarkerUtilities.setLineNumber(datas, 3);
		MarkerUtilities.createMarker(file, datas, getMarkerType());
		//file.getWorkspace().run(r, null,IWorkspace.AVOID_UPDATE, null);
		//MarkerUtilities.createMarker(file, datas, IMarker.TEXT);

	}

	public void refreshMarkers(IFile file, String message, String groupId, Severity severity, int charStart, int charEnd){
		final Severity s = severity;
		final IFile f = file; 
		final String msg =message;
		final int start = charStart;
		final int end = charEnd;
		PlatformUI.getWorkbench().getDisplay().asyncExec(new java.lang.Runnable() {
			public void run() {
				try {
					if (s == Severity.ERROR) {
						markError(f, msg, start , end);
					}
					if (s == Severity.FATAL) {
						markError(f, msg, start , end);
					}
					if (s == Severity.OK) {
						clearMarkers(f);
					}
					if (s == Severity.WARNING) {
						markWarning(f, msg, start , end);
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
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
