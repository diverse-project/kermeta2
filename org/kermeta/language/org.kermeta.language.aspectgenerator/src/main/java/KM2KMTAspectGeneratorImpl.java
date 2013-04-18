package org.kermeta.language.aspectgenerator;

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
}
