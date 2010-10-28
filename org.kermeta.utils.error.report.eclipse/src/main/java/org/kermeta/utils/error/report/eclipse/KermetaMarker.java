/* $Id$
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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.kermeta.language.api.messaging.ProblemMessage.Severity;
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

	/**
	 * Mark file resource on error
	 * @param file the file resource to be marked
	 * @param message the error message
	 * @param charStart offset to start marking
	 * @param charStop offset to end marking
	 * @throws CoreException if something goes wrong, the exception thrown
	 */
	private void markError(IFile file, String message, int charStart,
			int charStop) throws CoreException {
		mark(file, message, IMarker.SEVERITY_ERROR, charStart, charStop);
	}

	/**
	 * Mark file resource on warning
	 * @param file the file resource to be marked
	 * @param message the warning message
	 * @param charStart offset to start marking
	 * @param charStop offset to end marking
	 * @throws CoreException if something goes wrong, the exception thrown
	 */
	private void markWarning(IFile file, String message, int charStart,
			int charStop) throws CoreException {
		mark(file, message, IMarker.SEVERITY_WARNING, charStart, charStop);
	}
	
	/**
	 * Mark file resource according to error severity
	 * @param file the file resource to be marked
	 * @param message the error message
	 * @param severity the error severity
	 * @param charStart offset to start marking
	 * @param charStop offset to end marking
	 * @throws CoreException if something goes wrong, the exception thrown
	 */
	protected void mark(IFile file, String message, int severity, int charStart, int charStop) throws CoreException {
		//System.out.println("MARK :" + file.getFullPath().toOSString());
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
		
		datas.put(IMarker.LINE_NUMBER, 3);
		
		MarkerUtilities.setLineNumber(datas, 3);
		MarkerUtilities.createMarker(file, datas, getMarkerType());

	}

	/**
	 * Refresh the markers on file resource
	 * @param file the file resource to be marked
	 * @param message the error message
	 * @param severity the error severity
	 * @param charStart offset to start marking
	 * @param charStop offset to end marking
	 */
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
			ex.printStackTrace();
		}
	}
}
