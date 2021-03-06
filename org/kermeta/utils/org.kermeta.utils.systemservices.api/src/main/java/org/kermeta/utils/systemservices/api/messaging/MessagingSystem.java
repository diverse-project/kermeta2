/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 04/2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/

package org.kermeta.utils.systemservices.api.messaging;

import java.io.BufferedReader;
import java.net.URL;

import org.kermeta.utils.systemservices.api.reference.Reference;

/**
 * MessagingSystem API
 * This interface is used to be a facade for sending messages coming from any programs to the system
 * The system will be in charge of concretely presenting them in the most appropriate way according to the information kind 
 */
public abstract class MessagingSystem {
	public static enum Kind {
		UserINFO, UserWARNING, UserERROR, DevDEBUG, DevINFO, DevWARNING, DevERROR 
	}
	
	public static int UNKNOWN_NBWORKUNIT = -1;
	
	/** remove old log message from the user view if any */
	public abstract void clearLog();
	
	public abstract void log(Kind msgKind, String message, String messageGroup);
	public abstract void log(Kind msgKind, String message, String messageGroup, Throwable senderTrace);
	public abstract void logProblem(Kind msgKind, String message, String messageGroup, Reference causeObject);
	public abstract void logProblem(Kind msgKind, String message, String messageGroup, Throwable senderTrace, Reference causeObject);
	public abstract void flushProblem(String messageGroup, URL uri);
	public abstract void flushAllProblems(URL uri);
	
	
	public abstract BufferedReader getReader();
	public abstract String readLine();
	public abstract String readLine(String prompt);
	
	
	
	public abstract void initProgress(String progressGroup, String message, String messageGroup, int nbWorkUnit);
	public abstract void progress(String progressGroup, String message, String messageGroup, int workedUnit);
	public abstract void doneProgress(String progressGroup, String message, String messageGroup);
	
	
	// convenient operations for quicker call
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.DevDEBUG, message, messageGroup)
	 */
	public void debug(String message, String messageGroup){
		log(MessagingSystem.Kind.DevDEBUG, message, messageGroup);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.DevINFO, message, messageGroup)
	 */
	public void devInfo(String message, String messageGroup){
		log(MessagingSystem.Kind.DevINFO, message, messageGroup);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserINFO, message, messageGroup)
	 */
	public void info(String message, String messageGroup){
		log(MessagingSystem.Kind.UserINFO, message, messageGroup);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserWARNING, message, messageGroup, senderTrace)
	 */
	public void warn(String message, String messageGroup, Throwable senderTrace){
		log(MessagingSystem.Kind.UserWARNING, message, messageGroup, senderTrace);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserWARNING, message, messageGroup, null)
	 */
	public void warn(String message, String messageGroup){
		log(MessagingSystem.Kind.UserWARNING, message, messageGroup, null);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserERROR, message, messageGroup, senderTrace)
	 */
	public void error(String message, String messageGroup, Throwable senderTrace){
		log(MessagingSystem.Kind.UserERROR, message, messageGroup, senderTrace);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserERROR, message, messageGroup, null)
	 */
	public void error(String message, String messageGroup){
		log(MessagingSystem.Kind.UserERROR, message, messageGroup, null);
	}
	
}
