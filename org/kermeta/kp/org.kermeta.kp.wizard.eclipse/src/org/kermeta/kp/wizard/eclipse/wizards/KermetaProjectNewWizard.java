

/*$Id: NewKermetaProjectWizard.java,v 1.4 2008-06-09 10:02:23 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kp.wizard.eclipse.wizards;

import org.kermeta.kp.wizard.eclipse.wizards.utils.Context;
import org.kermeta.kp.wizard.eclipse.wizards.utils.GenerateAspect;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.regex.Pattern;

import k2.io.StdIO;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.kermeta.kp.wizard.eclipse.Activator;
import org.kermeta.kp.wizard.eclipse.preferences.PreferenceConstants;

public class KermetaProjectNewWizard extends Wizard implements INewWizard {

	private Context context = new Context ();
	
	KermetaProjectNewWizardPage 		projectPage 		= new KermetaProjectNewWizardPage(context);
	KermetaProjectNewWizardPageCustom 	projectPageCustom	= new KermetaProjectNewWizardPageCustom(context);
	
	public KermetaProjectNewWizard() {}

	@Override
	public void addPages() {
		addPage(projectPage);
		addPage(projectPageCustom);
	}
	
	public static void addKermetaNatureToProject(IProject project) {
		IProjectDescription description;
		try {
			description = project.getDescription();				
			if (!description.hasNature(org.kermeta.language.texteditor.eclipse.nature.Activator.NATURE_ID)){
				String[] natures = description.getNatureIds();			
				String[] newNatures = new String[natures.length + 1];
				System.arraycopy(natures, 0, newNatures, 0, natures.length);
				newNatures[natures.length] = org.kermeta.language.texteditor.eclipse.nature.Activator.NATURE_ID;
				description.setNatureIds(newNatures);
				project.setDescription(description, null);
				
			}
		} catch (CoreException e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
	
	
	@Override
	public boolean performFinish() {
		try {
			 final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.context.nameProject);
			 StdIO.writeln(this.context.nameProject);
			 IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				 public void run(IProgressMonitor monitor) throws CoreException {
					 project.create(monitor);
					 project.open(monitor);
					 addKermetaNatureToProject(project);
					 manageCreationProject(project, monitor);
					 
					 //createFolder(project, "src/main/kmt", monitor);
					 createDefaultKmt(project, "src/main/kmt/MainClass.kmt", monitor);
					 createDefaultKp(project, "project.kp", monitor);
					 IFile ecoreFile = context.ecoreIFile;
					 if(ecoreFile != null){
						 try {
							 
							createEcoreAspect(project.getName(),
											  project.getLocationURI().toURL().toString()+"/src/main/kmt",
											  "/"+ecoreFile.getProjectRelativePath().toString(),
											  ecoreFile.getProject().getName());
						} catch (MalformedURLException e) {
							Activator.logErrorMessage("Cannot call AspectGenerator due to exception "+e, e);
						}
					 }
					 project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					 
				 }
			};
			ResourcesPlugin.getWorkspace().run(operation, null);
		} catch (CoreException exception) {
			Activator.logErrorMessage(exception.getMessage(), exception);
			return false;
		}
		return true;
	}

	public void createEcoreAspect(String nameProject, String folderLocation, String ecoreFile, String ecoreProject){
		org.kermeta.language.aspectgenerator.KM2KMTAspectGenerator generator = Activator.getKM2KMTAspectGenerator();
		if(generator != null)			
			generator.generateCompilerProjectScala(nameProject, folderLocation, ecoreFile, ecoreProject);
		else
			Activator.logErrorMessage("Cannot call AspectGenerator because the service isn't available", null);
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	
	private void manageCreationProject (IProject project, IProgressMonitor monitor) throws CoreException {
		createFolder(project, "src/main/kmt", monitor);
		if (this.context.ecoreProject) {
			GenerateAspect ga = new GenerateAspect (this.context);
			ga.generateKermetaProject();
		}
		else {
			createDefaultKmt(project, "src/main/kmt/MainClass.kmt", monitor);
			createDefaultKp(project, "project.kp", monitor);	
		}
	}
	
	/**
	 * Creates folder hierarchically from a path relative to a project.
	 * @param project
	 * @param path
	 * @param monitor
	 * @throws CoreException
	 */
	private void createFolder(IProject project, String path, IProgressMonitor monitor) throws CoreException {
		String[] strings = path.split("/");
		IContainer currentContainer = project;
		for ( String s : strings ) {
			IFolder folder = currentContainer.getFolder( new Path(s) );
			folder.create(true, true, monitor);
			currentContainer = folder;
		}
	}
	
	public static IFile createDefaultKp(IProject project,String path,IProgressMonitor monitor) throws CoreException{
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_NEW_KP_TEMPLATE_STRING);
		
		// replace variables with values from the user
		contents = contents.replaceAll(Pattern.quote("${project.name}"), project.getName().replaceAll(Pattern.quote("."), "_"));
		contents = contents.replaceAll(Pattern.quote("${class.name}"), "MainClass");
		contents = contents.replaceAll(Pattern.quote("${package.name}"), "mainPackage");
		contents = contents.replaceAll(Pattern.quote("${operation.name}"), "mainOperation");
		try {
			InputStream stream =  new ByteArrayInputStream(contents.getBytes());;
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		return file;
	}
	
	
	
	private void createDefaultKmt(IProject project,String path,IProgressMonitor monitor) throws CoreException{
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_NEW_KMT_TEMPLATE_STRING);
		
		// replace variables with values from the user
		contents = contents.replaceAll(Pattern.quote("${class.name}"), "MainClass");
		contents = contents.replaceAll(Pattern.quote("${package.name}"), "mainPackage");
		contents = contents.replaceAll(Pattern.quote("${operation.name}"), "mainOperation");
		
		try {
			InputStream stream =  new ByteArrayInputStream(contents.getBytes());;
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
	}
	
}
