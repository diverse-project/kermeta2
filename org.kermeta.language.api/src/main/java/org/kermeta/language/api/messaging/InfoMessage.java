/*$Id: $
* Project : org.kermeta.language.api
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 aout 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.api.messaging;


/**
 * Simple message for informational  event
 *
 */
public class InfoMessage extends UnifiedMessage {

	public InfoMessage(String message, UserLevel userLevel,
			String messageGroup, Throwable senderTrace) {
		super(message, userLevel, messageGroup, senderTrace);
	}

}
