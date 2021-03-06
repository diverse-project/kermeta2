/* $Id: KermetaTokenScanner.java 13210 2010-10-27 16:27:58Z hrambelo $
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 22 oct. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.language.texteditor.eclipse.internal;

import org.eclipse.core.resources.IFile;

/**
 * Interface in charge of adding behaviour to Kermeta Scanner 
 */
public interface KermetaTokenScanner extends org.eclipse.jface.text.rules.ITokenScanner {

	/**
	 * Notify other components (e.g. marker, logger, ...) that there's no error after lexing the file
	 */
	void notifyFileClear();
	
	/**
	 * Notify other components (e.g. marker, logger, ...) whether there're some errors detected in the file after lexing
	 */
	void notifyFileHasError();
	
	/**
	 * Return the status of the file
	 * @return true if the file has errors, false otherwise
	 */
	boolean isFileOnError();
	
	/**
	 * Set the status of the file to a new value
	 * @param fileHasError the new boolean value
	 */
	void setFileHasError(final boolean fileHasError);
	
	/**
	 * Return the current IFile
	 */
	IFile getCurrentFile();
}
