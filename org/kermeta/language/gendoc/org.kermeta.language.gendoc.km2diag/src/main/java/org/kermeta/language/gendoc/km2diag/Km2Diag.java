package org.kermeta.language.gendoc.km2diag;

public class Km2Diag {
	
	public Km2Diag() {
		
		kermeta_km2diagrunner.DefaultRunner$.MODULE$.init4eclipse();
		
	}
	
	public void genModelDiag(String modelURI, String destFolderURI){
		
		kermeta_km2diagrunner.DefaultRunner$.MODULE$.init4eclipse();

		kermeta_km2diag.mainPackage.DiagGenerator printer = kermeta_km2diag.mainPackage.KerRichFactory.createDiagGenerator();
		printer.createDiag(modelURI, destFolderURI);
		
	}
	
}
