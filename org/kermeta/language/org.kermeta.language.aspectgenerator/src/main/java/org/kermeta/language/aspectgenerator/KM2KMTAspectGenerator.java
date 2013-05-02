package org.kermeta.language.aspectgenerator;

public interface KM2KMTAspectGenerator {

		public void aspectGeneratorScala();
	    public void generateCompilerProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject);
	    public void generateInterpreterProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject);
	    public void generateUserDefinedProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject, String operationName, String operationReturnType, k2.standard.KermetaOrderedSet<String> operationParams, k2.standard.KermetaOrderedSet<String> listNewClass);
	    public void generateVisitorProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject);
	    public void generateAspectProjectScala(String nameProject, String folderLocation, String ecoreFile, String ecoreProject);
}
