/*$Id: $
* Project : org.kermeta.language.api
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 août 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.api.messaging;

/**
 * Message for initializing a progression
 * if nbWorkUnit is not set (nbWorkUnit == 0 ) the task size is supposed unknown
 * With some message processing component, if a second InitProgressMessage is received before a DoneProgressMessage, 
 * the Progress monitor will be reset to the second value (including the cancellableProcess object) 
 */
public class InitProgressMessage extends ProgressMessage {
	
	/**
	 * Number of work unit for the progress monitor associated to the progressGroupId
	 */
	protected int nbWorkUnit=0;
	
	/**
	 * Object that must be notified if the user asks for a cancellation of a task supervised by a ProgressMonitor
	 */
	protected CancellableProcess cancellableProcess=null;

	/**
	 * @param message
	 * @param userLevel
	 * @param messageGroup
	 * @param senderTrace
	 * @param progressGroupId
	 * @param nbWorkUnit
	 * @param cancellableProcess
	 */
	public InitProgressMessage(String message, UserLevel userLevel,
			String messageGroup, Throwable senderTrace, String progressGroupId,
			int nbWorkUnit, CancellableProcess cancellableProcess) {
		super(message, userLevel, messageGroup, senderTrace, progressGroupId);
		this.nbWorkUnit = nbWorkUnit;
		this.cancellableProcess = cancellableProcess;
	}
	
	
}
