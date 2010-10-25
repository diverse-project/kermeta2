/* $Id: $
 * Project    : org.kermeta.utils.error.report.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 8 sept. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.utils.error.report.eclipse;

import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.messaging.ProblemMessage.Severity;
import org.kermeta.language.api.port.PortLog;
import org.kermeta.traceability.Reference;
import org.kermeta.traceability.TextReference;

/**
 * Factory in charge of handling the creation of markers. 
 * Acts as a filter on ProblemMessage sender group and content   
 * @author hrambelo
 *
 */
public class KermetaMarkerFactory {

	/**
	 * Instance of the singleton factory
	 */
	public static KermetaMarkerFactory instance = new KermetaMarkerFactory();

	protected KermetaMarker marker;
	
	protected Hashtable<String, String> treatedMarker = new Hashtable<String, String>();
	/**
	 * Retrieve the factory instance
	 * @return
	 */
	public static KermetaMarkerFactory getInstance() {
		return instance;
	}
	
	/**
	 * Treat received Problem Message by group
	 * @param pbmMsg
	 */
	public void treatProblemMsg(ProblemMessage pbmMsg){
		Reference causeObject = (Reference)pbmMsg.getCauseObject();
		//treat only pbm msg that contains TextReference
		if (causeObject!=null && causeObject instanceof TextReference){
			TextReference ref = (TextReference) causeObject;
			if (!treatedMarker.containsKey(pbmMsg.getMessageGroup())){
				//treat an unknown group
				treatUnknownGroup(pbmMsg, ref);
			}else{
				//treat registered group 
				treatRegisteredGroup(pbmMsg, ref);
			}
		}
	}

	/**
	 * Treat Known group
	 * @param pbmMsg
	 * @param ref
	 */
	private void treatRegisteredGroup(ProblemMessage pbmMsg, TextReference ref) {
		//Message Group may not be unique value !!
		String knownFile = treatedMarker.get(pbmMsg.getMessageGroup());
		//find all markers on this file
		if (knownFile.equals(ref.getFileURI())){
			IFile file = findFileFromLocation(ref.getFileURI());
			if (file == null) {
				return;
			}
			try {
				IMarker[] markers;
				markers = file.findMarkers(IMarker.PROBLEM, false, IResource.DEPTH_ZERO);
				//IMarker foundMarker = null;
				//if there's no marker on the file, add a marker if file has error 
				if (markers.length <= 0){
					if (pbmMsg.getSeverity() != Severity.OK){
						marker.refreshMarkers(file, pbmMsg.getMessage(), pbmMsg.getMessageGroup(), pbmMsg.getSeverity(), ref.getCharBeginAt(), ref.getCharEndAt());
					}
				}else{
					//for each marker compare the text to see if we should treat or not
			    	for (int index = 0; index < markers.length; index++ ) {
						String msg = ((String) markers[index].getAttribute(IMarker.MESSAGE));
						//Refresh only new unregistered messages
						if (!msg.equals(pbmMsg.getMessage())){
							marker.refreshMarkers(file, pbmMsg.getMessage(), pbmMsg.getMessageGroup(), pbmMsg.getSeverity(), ref.getCharBeginAt(), ref.getCharEndAt());
						}
			    	}
				}
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	/**
	 * Treat New Group
	 * @param pbmMsg
	 * @param ref
	 */
	private void treatUnknownGroup(ProblemMessage pbmMsg, TextReference ref) {
		marker = createKermetaMarker();
		treatedMarker.put(pbmMsg.getMessageGroup(), ref.getFileURI());
		IFile file = findFileFromLocation(ref.getFileURI());
		if (file == null) {
			return;
		}
		marker.refreshMarkers(file, pbmMsg.getMessage(), pbmMsg.getMessageGroup(), pbmMsg.getSeverity(), ref.getCharBeginAt(), ref.getCharEndAt());
	}
	
	
	private KermetaMarker createKermetaMarker(){
		KermetaMarker marker = new KermetaMarker();
		return marker;
	}
	
	protected IFile findFileFromLocation(String url){
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(url);
		// URI might not point at a platform file
		return file;
	}
	
}
