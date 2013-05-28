package org.kermeta.language.gendoc.km2html;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;


public interface Km2Html {

		public void setMessagingSystem(MessagingSystem messagingSystem);
		public void genHtmlDoc4File(String modelURI, String destFolderURI, String excludePackages, String documentName);
}
