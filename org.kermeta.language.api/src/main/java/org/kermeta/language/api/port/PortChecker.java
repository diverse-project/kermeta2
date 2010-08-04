/* $Id$
 * Project    : org.kermeta.language.api
 * File       : PortChecker.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 juil. 2010
 * Authors : 
 *           Jacques Falcou <jacques.falcou@inria.fr> 
 */
package org.kermeta.language.api.port;

import java.util.Collection;

import kermeta.exceptions.ConstraintsDiagnostic;
import org.kermeta.language.structure.ModelingUnit;

public interface PortChecker {

	public ConstraintsDiagnostic check(ModelingUnit mu);
	
}
