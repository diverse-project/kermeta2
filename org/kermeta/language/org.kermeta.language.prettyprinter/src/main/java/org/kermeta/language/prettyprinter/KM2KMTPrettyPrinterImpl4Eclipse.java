package org.kermeta.language.prettyprinter;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class KM2KMTPrettyPrinterImpl4Eclipse implements KM2KMTPrettyPrinter {
	
	public KM2KMTPrettyPrinterImpl4Eclipse(){
		kermeta_prettyprinterrunner.DefaultRunner$.MODULE$.init4eclipse();   	
    }
	
	public void setMessagingSystem(MessagingSystem messagingSystem){
		k2.io.StdIO$.MODULE$.messagingSystem_$eq(messagingSystem);
	}
	@Override
	public void prettyPrintFile(String modelURI, String kmtURI) {
		
		kermeta_prettyprinterrunner.DefaultRunner$.MODULE$.init4eclipse();

		kermeta_prettyprinter.org.kermeta.language.prettyprinter.PrettyPrinter printer = kermeta_prettyprinter.org.kermeta.language.prettyprinter.KerRichFactory.createPrettyPrinter();
		printer.prettyPrintFile(modelURI, kmtURI);
	}

}
