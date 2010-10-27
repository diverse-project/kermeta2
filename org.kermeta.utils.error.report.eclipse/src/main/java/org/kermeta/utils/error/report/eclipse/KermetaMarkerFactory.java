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
	
	protected Hashtable<String, List<String>> groupStore;
	
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
	 * @param pbmMsg
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
	 * @param pbmMsg
	 * @param ref
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
	 * @param pbmMsg
	 * @param ref
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
	
	private KermetaMarker createKermetaMarker(){
		KermetaMarker marker = new KermetaMarker();
		return marker;
	}
	
	public Hashtable<String, List<String>> flushGroupStore(){
		if (groupStore != null){
			Set<String> groups = groupStore.keySet();
			//remove all markers on files before clearing Store
			for (String group : groups){	
				List<String> uris = groupStore.get(group);
				for (String uri : uris){
					IFile file =  KermetaMarkerUtils.findFileFromLocation(uri);
					if (file != null) {
						try {
							file.deleteMarkers(IMarker.PROBLEM, false, IResource.DEPTH_INFINITE);
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			groupStore.clear();
			return groupStore;
		}else{
			return KermetaMarkerUtils.initGroupStore();
		}
	}

	public void setGroupStore(Hashtable<String, List<String>> groupStore) {
		this.groupStore = groupStore;
	}
}
