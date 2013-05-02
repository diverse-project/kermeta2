package org.kermeta.kp.wizard.eclipse.wizards.utils;

import java.util.ArrayList;

import k2.standard.RichKermetaOrderedSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;


public class Context {
	
	public boolean 	ecoreProject;
	public String 	typeProject;
	public String 	nameProject;
	public String 	locationProject;
	public String 	ecoreFile;
	public IFile 	ecoreIFile;
	public String 	ecoreProjectPath;
	public String 	operationName;
	public String 	operationReturnType;
	
	public k2.standard.RichKermetaOrderedSet<String> listNewClass;
	public k2.standard.RichKermetaOrderedSet<String> operationParams; 
	
	public Context () {
		this.ecoreProject 			= false;
		this.typeProject			= "None";
		this.nameProject 			= "NewKermetaProject";
		this.locationProject 		= ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();;
		this.ecoreFile	 			= "";
		this.ecoreIFile				= null;
		this.ecoreProjectPath		= "";
		this.operationName 			= "";
		this.operationReturnType 	= "";
		this.operationParams 		= new RichKermetaOrderedSet<String>(null);
		this.listNewClass 			= new RichKermetaOrderedSet<String>(null);
	}
}
