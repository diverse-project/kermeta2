package org.kermeta.language.aspectgenerator;

public class KM2KMTAspectGeneratorImpl4Eclipse implements KM2KMTAspectGenerator {
	
	public KM2KMTAspectGeneratorImpl4Eclipse(){
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init4eclipse();   	
    }
	
	@Override
	public void aspectGeneratorScala(String pathFolder, String ecoreFile) {
		
		ecore_aspectgeneratorrunner.DefaultRunner$.MODULE$.init4eclipse();

		ecore_aspectgenerator.org.kermeta.language.aspectgenerator.AspectGenerator aspectGenerator_ = ecore_aspectgenerator.org.kermeta.language.aspectgenerator.KerRichFactory.createAspectGenerator();
		aspectGenerator_.aspectGenerator(pathFolder, ecoreFile);
	}

}
