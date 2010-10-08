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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.utils.error.report.eclipse.art2.impl.Art2ComponentEclipseErrorReport;

/**
 * Helper class to add markers to text files 
 */
public class KermetaMarker {

	public static final String MARKER_TYPE = "org.kermeta.utils.error.report.eclipse.kermetaProblem";
	
	/**
	 * Factory used to create message as described in org.kermeta.language.api.messaging
	 */
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	
	/**
	 * Marks a file with markers.
	 * 
	 * @param url The url of the resource that is the file to mark.
	 * @param message
	 * @param severity
	 * @param LineNumber
	 * @param charStart
	 * @param charEnd
	 */
	public void mark(String url, String message, int severity, int LineNumber, int charStart, int charEnd ){
		if (url == null) {
			return;
		}
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(url);
		// URI might not point at a platform file
		if (file == null) {
			return;
		}
		createMarker(file, message, severity, LineNumber, charStart, charEnd);
	}
	
	/**
	 * Unmarks a file with markers.
	 * 
	 * @param url The url of the resource that is the file to unmark.
	 */
	public void unMark(String url){
		try {
			IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(url);
			if (file != null) {
				file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
			}
		} catch (CoreException e) {
			Art2ComponentEclipseErrorReport.getDefault().getLogPort().log(mFactory.createErrorMessage("Exception raised : ", 
					Art2ComponentEclipseErrorReport.getDefault().getBundleSymbolicName(), e));
			e.printStackTrace();
		}
	}
	
	/**
	 * Create a marker with specific attributes
	 * @param file The resource file to mark
	 * @param markerSeverity The severity of the marker
	 * @param message The custom message to show with the marker
	 * @param lineNumber The line number to mark
	 * @param charStart The starting character to mark
	 * @param charEnd The ending character to mark
	 */
	public void createMarker(IFile file, String message, int markerSeverity, int lineNumber, int charStart, int charEnd){
		try {
			org.eclipse.core.resources.IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.SEVERITY, markerSeverity);
			marker.setAttribute(IMarker.MESSAGE, message);
			if(lineNumber != -1 && charStart != -1 && charEnd!=-1){
				marker.setAttribute(org.eclipse.core.resources.IMarker.LINE_NUMBER, lineNumber);
				marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_START, charStart);
				marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_END, charEnd + 1);
			}
			else {
				marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_START, 0);
				marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_END, 1);
			}
		} catch (org.eclipse.core.runtime.CoreException ce) {
			if (ce.getMessage().matches("Marker.*not found.")) {
				// ignore but log
				Art2ComponentEclipseErrorReport.getDefault().getLogPort().log(mFactory.createErrorMessage("Exception raised : Marker.*not found at : ", 
						Art2ComponentEclipseErrorReport.getDefault().getBundleSymbolicName(), ce));
			} else {
				ce.printStackTrace();
				Art2ComponentEclipseErrorReport.getDefault().getLogPort().log(mFactory.createErrorMessage("Exception raised : ", 
						Art2ComponentEclipseErrorReport.getDefault().getBundleSymbolicName(), ce));
			}
		}
	}
}
