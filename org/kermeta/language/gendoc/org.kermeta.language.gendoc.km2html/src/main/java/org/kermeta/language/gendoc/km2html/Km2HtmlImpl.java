package org.kermeta.language.gendoc.km2html;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;


public class Km2HtmlImpl implements Km2Html {

	public Km2HtmlImpl(){
		kermeta_km2htmlrunner.DefaultRunner$.MODULE$.init();   	
    }
	public void setMessagingSystem(MessagingSystem messagingSystem){
		k2.io.StdIO$.MODULE$.messagingSystem_$eq(messagingSystem);
	}
	@Override
	public void genHtmlDoc4File(String modelURI, String destFolderURI, String excludePackages, String documentName) {
		
		kermeta_km2htmlrunner.DefaultRunner$.MODULE$.init(); 

		kermeta_km2html.gendoc.HtmlGenerator printer = kermeta_km2html.gendoc.KerRichFactory.createHtmlGenerator();
        printer.generateHtml(modelURI, destFolderURI, excludePackages, documentName);
	}

}
