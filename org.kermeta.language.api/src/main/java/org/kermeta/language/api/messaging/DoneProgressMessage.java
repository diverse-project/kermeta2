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
 * Message that informs a ProgressMonitor that a given progressGroup has ended.
 */
public class DoneProgressMessage extends ProgressMessage {

	public DoneProgressMessage(String message, UserLevel userLevel,
			String messageGroup, Throwable senderTrace, String progressGroupId) {
		super(message, userLevel, messageGroup, senderTrace, progressGroupId);
	}

}
