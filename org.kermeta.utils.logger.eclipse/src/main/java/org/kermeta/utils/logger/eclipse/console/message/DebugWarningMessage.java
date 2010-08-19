/*$Id: OKMessage.java,v 1.1 2007-11-30 08:05:33 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	InfoMessage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.utils.logger.eclipse.console.message;

public class DebugWarningMessage extends ConsoleMessage {

	public DebugWarningMessage(String content) {
		super(content, ConsoleMessage.DEBUG_WARNING);
	}
	
}
