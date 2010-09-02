package org.kermeta.language.api.kevent;

import org.kermeta.language.api.kevent.KEvent;
import org.kermeta.language.api.kevent.KResourceChangeEvent;

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
		
		/**
		 * Create a simple KResourceChangeEvent of type CHANGED
		 * @param url : url of the resource
		 * @return a KEvent associated to the change of the resource
		 */
		public KEvent createSimpleEvent(String url) {
			KEvent evt = new KResourceChangeEvent(url, KResourceChangeEvent.ChangeType.CHANGED);
			return evt;
		}
		
		/**
		 * Create a simple KResourceChangeEvent of type ADD
		 * @param url : url of the resource
		 * @return a KEvent associated to the change of the resource
		 */
		public KEvent createSimpleAddEvent(String url) {
			KEvent evt = new KResourceChangeEvent(url, KResourceChangeEvent.ChangeType.ADDED);
			return evt;
		}
		
		/**
		 * Create a simple KResourceChangeEvent of type 
		 * @param url : url of the resource
		 * @return a KEvent associated to the change of the resource
		 */
		public KEvent createSimpleRemoveEvent(String url) {
			KEvent evt = new KResourceChangeEvent(url, KResourceChangeEvent.ChangeType.REMOVED);
			return evt;
		}
}
