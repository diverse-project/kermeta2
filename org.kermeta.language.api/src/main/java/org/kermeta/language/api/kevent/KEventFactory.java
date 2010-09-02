package org.kermeta.language.api.kevent;

import org.kermeta.language.api.event.KEvent;
import org.kermeta.language.api.event.KResourceChangeEvent;
import org.kermeta.language.api.messaging.InfoMessage;
import org.kermeta.language.api.messaging.UnifiedMessage;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.messaging.UnifiedMessage.UserLevel;
	/**
	 * This class is a factory for KermetaMessage. It is used as a singleton.
	 * It contains convenient operations to build most simplified variants of usual messages
	 *
	 */
public class KEventFactory {
		
		/**
		 * Instance of the singleton factory
		 */
		protected static KEventFactory instance = new KEventFactory();
		
		/**
		 * Retrieve the factory instance
		 * @return
		 */
		public static KEventFactory getInstance() {
			return instance;
		}
		
		public KEvent createSimpleEvent(String url) {
			KEvent evt = new KResourceChangeEvent(url);
			return evt;
		}
}
