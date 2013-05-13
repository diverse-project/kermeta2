package org.kermeta.language.aspectgenerator.impl;

import org.kermeta.language.aspectgenerator.KM2KMTAspectGenerator;

public class KM2KMTAspectGeneratorImpl implements KM2KMTAspectGenerator {

	public KM2KMTAspectGeneratorImpl(){
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init();   	
    }
	
	@Override
	public void aspectGeneratorScala() {
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init();

		ecore_aspectgenerator.org.kermeta.language.aspectgenerator.AspectGenerator aspectGenerator_ = ecore_aspectgenerator.org.kermeta.language.aspectgenerator.KerRichFactory.createAspectGenerator();
        aspectGenerator_.aspectGenerator();
	}
	
	@Override
    public void generateCompilerProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject) {
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init();
		
		ecore_aspectgenerator.org.kermeta.language.aspectgenerator.AspectGenerator aspectGenerator_ = ecore_aspectgenerator.org.kermeta.language.aspectgenerator.KerRichFactory.createAspectGenerator();
        aspectGenerator_.generateCompilerProject (nameProject, folderLocation, ecoreFile, ecoreProject);
	}
    
	@Override
	public void generateInterpreterProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject) {
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init();
		
		ecore_aspectgenerator.org.kermeta.language.aspectgenerator.AspectGenerator aspectGenerator_ = ecore_aspectgenerator.org.kermeta.language.aspectgenerator.KerRichFactory.createAspectGenerator();
		aspectGenerator_.generateInterpreterProject(nameProject, folderLocation, ecoreFile, ecoreProject);
	}
    
	@Override
	public void generateCustomizeProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject, String operationName, String operationReturnType, k2.standard.KermetaOrderedSet<String> operationParams, k2.standard.KermetaOrderedSet<String> listNewClass) {
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init();
		
		ecore_aspectgenerator.org.kermeta.language.aspectgenerator.AspectGenerator aspectGenerator_ = ecore_aspectgenerator.org.kermeta.language.aspectgenerator.KerRichFactory.createAspectGenerator();
		aspectGenerator_.generateCustomizeProject(nameProject, folderLocation, ecoreFile, ecoreProject, operationName, operationReturnType, operationParams, listNewClass);
	}
    
	@Override
	public void generateVisitorProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject) {
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init();
		
		ecore_aspectgenerator.org.kermeta.language.aspectgenerator.AspectGenerator aspectGenerator_ = ecore_aspectgenerator.org.kermeta.language.aspectgenerator.KerRichFactory.createAspectGenerator();
		aspectGenerator_.generateVisitorProject (nameProject, folderLocation, ecoreFile, ecoreProject);
	}
    
	@Override
	public void generateAspectProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject) {
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init();
		
		ecore_aspectgenerator.org.kermeta.language.aspectgenerator.AspectGenerator aspectGenerator_ = ecore_aspectgenerator.org.kermeta.language.aspectgenerator.KerRichFactory.createAspectGenerator();
		aspectGenerator_.generateAspectProject (nameProject, folderLocation, ecoreFile, ecoreProject);
	}
	
	@Override
	public void generateNoneScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject) {
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init();
		
		ecore_aspectgenerator.org.kermeta.language.aspectgenerator.AspectGenerator aspectGenerator_ = ecore_aspectgenerator.org.kermeta.language.aspectgenerator.KerRichFactory.createAspectGenerator();
		aspectGenerator_.generateNone (nameProject, folderLocation, ecoreFile, ecoreProject);
	}
}
