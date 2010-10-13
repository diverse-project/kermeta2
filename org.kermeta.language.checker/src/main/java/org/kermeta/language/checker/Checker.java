/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.checker;

import kermeta.language.structure.ModelingUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.kermeta.language.checker.CheckerPackage#getChecker()
 * @model
 * @generated
 */
public interface Checker extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.exceptions.ConstraintsDiagnostic res = mu.getViolatedConstraints();\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft104 = res.getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_409 = false;\n\twhile( !idLoopCond_409 ) {\n\tidLoopCond_409 = it_ft104.isOff();\n\tif ( idLoopCond_409 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.exceptions.ConstraintViolatedInv c_lbdExp104 = it_ft104.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(c_lbdExp104.getMessage());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void check(ModelingUnit mu);

} // Checker
