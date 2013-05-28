package org.kermeta.language.prettyprinter;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public interface KM2KMTPrettyPrinter {

	public void setMessagingSystem(MessagingSystem messagingSystem);
	public void prettyPrintFile(String modelURI, String kmtURI);
}
