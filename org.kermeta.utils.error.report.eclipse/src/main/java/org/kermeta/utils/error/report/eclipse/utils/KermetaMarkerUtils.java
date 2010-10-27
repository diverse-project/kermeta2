/* $Id: $
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;


public class KermetaMarkerUtils {

	public static IFile findFileFromLocation(String url){
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(url);
		// URI might not point at a platform file
		return file;
	}
	
	public static Hashtable<String, List<String>> addGrouptoStore(Hashtable<String, List<String>> groupStore, String group){
		groupStore.put(group, new ArrayList<String>());
		return groupStore;
	}
	
	public static Hashtable<String, List<String>> removeGrouptoStore(Hashtable<String, List<String>> groupStore, String group){
		groupStore.remove(group);
		return groupStore;
	}
	
	public static Hashtable<String, List<String>> addFiletoGroupStore(Hashtable<String, List<String>> groupStore, String group, String fileUri){
		List<String> fileUris = groupStore.get(group);
		if (!fileUris.contains(fileUri)){
			groupStore.get(group).add(fileUri);
		}
		return groupStore;
	}
	
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
	
	public static Hashtable<String, List<String>> initGroupStore(){
		Hashtable<String, List<String>> groupStore = new Hashtable<String, List<String>>();
		return groupStore;
	}
}
