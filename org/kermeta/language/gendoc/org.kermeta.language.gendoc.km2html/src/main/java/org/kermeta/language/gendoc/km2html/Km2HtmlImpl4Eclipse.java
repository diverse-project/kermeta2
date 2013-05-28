package org.kermeta.language.gendoc.km2html;


import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;


public class Km2HtmlImpl4Eclipse implements Km2Html {
	
	public Km2HtmlImpl4Eclipse(){
		kermeta_km2htmlrunner.DefaultRunner$.MODULE$.init4eclipse();   	
    }
	
	public void setMessagingSystem(MessagingSystem messagingSystem){
		k2.io.StdIO$.MODULE$.messagingSystem_$eq(messagingSystem);
	}
	
	@Override
	public void genHtmlDoc4File(String modelURI, String destFolderURI, String excludePackages, String documentName) {

		kermeta_km2htmlrunner.DefaultRunner$.MODULE$.init4eclipse();

		kermeta_km2html.gendoc.HtmlGenerator printer = kermeta_km2html.gendoc.KerRichFactory.createHtmlGenerator();
		printer.generateHtml(modelURI, destFolderURI, excludePackages, documentName);
	}

}
