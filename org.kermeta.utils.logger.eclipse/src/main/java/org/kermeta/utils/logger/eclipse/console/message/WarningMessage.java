/*$Id: WarningMessage.java,v 1.4 2007-11-30 08:05:33 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.utils.logger.eclipse.console.message;


public class WarningMessage extends ConsoleMessage {

	public WarningMessage(String content) {
		super(content, ConsoleMessage.WARNING);
	}
	
}
