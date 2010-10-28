/* $Id$
 * Project    : org.kermeta.utils.error.report.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 8 sept. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.utils.error.report.eclipse;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.messaging.ProblemMessage.Severity;
import org.kermeta.traceability.Reference;
import org.kermeta.traceability.TextReference;
import org.kermeta.utils.error.report.eclipse.utils.KermetaMarkerUtils;

/**
 * Factory in charge of handling the creation of markers on resource file. 
 * Filter the org.kermeta.language.api.messaging.ProblemMessage according to sender group 
 * and message content to avoid texteditor's forever re-lexing the document each time a marker is added
 * TODO Correct the texteditor's listener to stop infinite loop (because normally filtering is not the marker's job)
 * @author hrambelo
 *
 */
public class KermetaMarkerFactory {

	/**
	 * Instance of the singleton factory
	 */
	public static KermetaMarkerFactory instance = new KermetaMarkerFactory();

	/**
	 * Marker used on file resource
	 */
	protected KermetaMarker marker;
	
	/**
	 * Hashtable to register the message sender group and its associated files
	 * <GroupName, FilesHandledByTheGroup>
	 */
	protected Hashtable<String, List<String>> groupStore;
	
	/**
	 * Default constructor of the factory
	 */
	private KermetaMarkerFactory(){
		setGroupStore(flushGroupStore());
	}
	
	/**
	 * Retrieve the factory instance
	 * @return
	 */
	public static KermetaMarkerFactory getInstance() {
		return instance;
	}
	
	/**
	 * Filter received Problem Message by group to avoid forever re-lexing the document each time a marker is added
	 * TODO correct the texteditor's listener to stop infinite loop (because normally filtering is not the marker's job)
	 * @param pbmMsg the log message received from the log port 
	 */
	public void treatProblemMsg(ProblemMessage pbmMsg){
		Reference causeObject = (Reference)pbmMsg.getCauseObject();
		//treat only pbm msg that contains TextReference
		if (causeObject!=null && causeObject instanceof TextReference){
			TextReference ref = (TextReference) causeObject;
			if (!groupStore.containsKey(pbmMsg.getMessageGroup())){
				//treat an unknown group
				treatUnknownGroup(pbmMsg, ref);
			}else{
				//treat registered group 
				treatRegisteredGroup(pbmMsg, ref);
			}
		}
	}
	
	/**
	 * Register and treat new group
	 * @param pbmMsg the log message received from the log port 
	 * @param ref the file object reference inside the message and provided by org.kermeta.traceability.model to be treated  
	 */
	private void treatUnknownGroup(ProblemMessage pbmMsg, TextReference ref) {
		IFile file = KermetaMarkerUtils.findFileFromLocation(ref.getFileURI());
		if (file == null) {
			return;
		}
		//register new group and new file
		List<String> knownFiles = new ArrayList<String>();
		knownFiles.add(ref.getFileURI());
		setGroupStore(KermetaMarkerUtils.addGrouptoStore(groupStore, pbmMsg.getMessageGroup()));
		setGroupStore(KermetaMarkerUtils.addFiletoGroupStore(groupStore, pbmMsg.getMessageGroup(), ref.getFileURI()));
		//groupStore.put(pbmMsg.getMessageGroup(), knownFiles);
		//treat marker on the new file
		marker = createKermetaMarker();
		marker.refreshMarkers(file, pbmMsg.getMessage(), pbmMsg.getMessageGroup(), pbmMsg.getSeverity(), ref.getCharBeginAt(), ref.getCharEndAt());
	}
	
	/**
	 * Treat Known group
	 * @param pbmMsg the log message received from the log port 
	 * @param ref the file object reference inside the message and provided by org.kermeta.traceability.model to be treated  
	 */
	private void treatRegisteredGroup(ProblemMessage pbmMsg, TextReference ref) {
		List<String> urls = groupStore.get(pbmMsg.getMessageGroup());
		if (!urls.contains(ref.getFileURI())){
			//treat a new file of registered group
			treatNewFile(pbmMsg, ref);
		}else{
			treatRegisteredFile(pbmMsg, ref);
		}
	}
		
	/**
	 * Treat new file reference of a group
	 * @param pbmMsg the log message received from the log port 
	 * @param ref the file object reference inside the message and provided by org.kermeta.traceability.model to be treated  
	 */
	private void treatNewFile(ProblemMessage pbmMsg, TextReference ref) {	
		//register new file only if it exists
		IFile file =  KermetaMarkerUtils.findFileFromLocation(ref.getFileURI());
		if (file == null) {
			return;
		}
		setGroupStore(KermetaMarkerUtils.addFiletoGroupStore(groupStore, pbmMsg.getMessageGroup(), ref.getFileURI()));
		//treat marker
		marker = createKermetaMarker();
		marker.refreshMarkers(file, pbmMsg.getMessage(), pbmMsg.getMessageGroup(), pbmMsg.getSeverity(), ref.getCharBeginAt(), ref.getCharEndAt());
	}

	/**
	 * Treat registered file reference of a group
	 * @param pbmMsg the log message received from the log port 
	 * @param ref the file object reference inside the message and provided by org.kermeta.traceability.model to be treated  
	 */
	private void treatRegisteredFile(ProblemMessage pbmMsg, TextReference ref) {
		//ensure file exists before processing
		IFile file =  KermetaMarkerUtils.findFileFromLocation(ref.getFileURI());
		if (file == null) {
			return;
		}
		//find all markers on this file
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
				//if there is already error on files
				//and file was corrected then remove markers and unregister the file
				if (pbmMsg.getSeverity() == Severity.OK){
					marker.refreshMarkers(file, pbmMsg.getMessage(), pbmMsg.getMessageGroup(), pbmMsg.getSeverity(), ref.getCharBeginAt(), ref.getCharEndAt());
					setGroupStore(KermetaMarkerUtils.removeFiletoGroupStore(groupStore, pbmMsg.getMessageGroup(), ref.getFileURI()));
				}else{
					//otherwise treat only new error message
			    	for (int index = 0; index < markers.length; index++ ) {
						String msg = ((String) markers[index].getAttribute(IMarker.MESSAGE));
						//Refresh only new unregistered messages
						if (!msg.equals(pbmMsg.getMessage())){
							marker.refreshMarkers(file, pbmMsg.getMessage(), pbmMsg.getMessageGroup(), pbmMsg.getSeverity(), ref.getCharBeginAt(), ref.getCharEndAt());
						}
			    	}
				}
			}
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	/**
	 * Create a new marker to be used on file resource
	 * @return
	 */
	private KermetaMarker createKermetaMarker(){
		KermetaMarker marker = new KermetaMarker();
		return marker;
	}
	
	/**
	 * Set a new value for the groupStore
	 * @param groupStore new value
	 */
	public void setGroupStore(Hashtable<String, List<String>> groupStore) {
		this.groupStore = groupStore;
	}
	
	/**
	 * Flush all the values of the groupStore
	 * @param groupStore the groupStore to be cleaned
	 * @return the cleared groupStore
	 */
	public Hashtable<String, List<String>> flushGroupStore(){
		if (groupStore != null){
			return KermetaMarkerUtils.clearAllMarkerInGroupStore(groupStore);
		}else{
			return KermetaMarkerUtils.initGroupStore();
		}
	}
}
