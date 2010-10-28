/* $Id$
 * Project    : org.kermeta.utils.error.report.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 oct. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.utils.error.report.eclipse.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

/**
 * A Utility class for art2 component bundle Error marker
 * @author hrambelo
 *
 */
public class KermetaMarkerUtils {

	/**
	 * Retrieve a file on workspace according to its location url
	 * @param url the location url
	 * @return the file
	 */
	public static IFile findFileFromLocation(String url){
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(url);
		// URI might not point at a platform file
		return file;
	}
	
	/**
	 * Add a new group to the groupStore
	 * @param groupStore the groupStore
	 * @param group the new group
	 * @return the modified groupStore
	 */
	public static Hashtable<String, List<String>> addGrouptoStore(Hashtable<String, List<String>> groupStore, String group){
		groupStore.put(group, new ArrayList<String>());
		return groupStore;
	}
	
	/**
	 * Remove a group to the groupStore
	 * @param groupStore the groupStore
	 * @param group the group to be removed
	 * @return the modified groupStore
	 */
	public static Hashtable<String, List<String>> removeGrouptoStore(Hashtable<String, List<String>> groupStore, String group){
		groupStore.remove(group);
		return groupStore;
	}
	
	/**
	 * Add a file uri reference into a group of the groupStore
	 * @param groupStore the groupStore
	 * @param group the concerned group
	 * @param fileUri the file reference uri to be added
	 * @return the modified groupStore
	 */
	public static Hashtable<String, List<String>> addFiletoGroupStore(Hashtable<String, List<String>> groupStore, String group, String fileUri){
		List<String> fileUris = groupStore.get(group);
		if (!fileUris.contains(fileUri)){
			groupStore.get(group).add(fileUri);
		}
		return groupStore;
	}
	
	/**
	 * Remove a file uri reference from a group of the groupStore
	 * @param groupStore the groupStore
	 * @param group the concerned group
	 * @param fileUri the file reference uri to be removed
	 * @return the modified groupStore
	 */
	public static Hashtable<String, List<String>> removeFiletoGroupStore(Hashtable<String, List<String>> groupStore, String group, String fileUri){
		List<String> fileUris = groupStore.get(group);
		if (fileUris.contains(fileUri)){
			groupStore.get(group).remove(fileUri);
		}
		if (fileUris.isEmpty()){
			groupStore = KermetaMarkerUtils.removeGrouptoStore(groupStore, group);
		}
		return groupStore;
	}
	
	/**
	 * Init the groupStore
	 * @return a fresh new empty groupStore
	 */
	public static Hashtable<String, List<String>> initGroupStore(){
		Hashtable<String, List<String>> groupStore = new Hashtable<String, List<String>>();
		return groupStore;
	}
	
	/**
	 * Clear a group store and clear all marker on files referenced into each group of the groupStore
	 * @param groupStore the groupStore
	 * @return the modified groupStore
	 */
	public static Hashtable<String, List<String>> clearAllMarkerInGroupStore(Hashtable<String, List<String>> groupStore) {
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
						e.printStackTrace();
					}
				}
			}
		}
		groupStore.clear();
		return groupStore;
	}
}
