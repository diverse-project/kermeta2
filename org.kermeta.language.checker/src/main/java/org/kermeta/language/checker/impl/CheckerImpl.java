/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.checker.impl;

import kermeta.language.structure.ModelingUnit;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.language.checker.Checker;
import org.kermeta.language.checker.CheckerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CheckerImpl extends ObjectImpl implements Checker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CheckerPackage.Literals.CHECKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void check(ModelingUnit mu) {

		kermeta.exceptions.ConstraintsDiagnostic res = mu
				.getViolatedConstraints();

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft104 = res
					.getSetConstraints().iterator();
			java.lang.Boolean idLoopCond_409 = false;
			while (!idLoopCond_409) {
				idLoopCond_409 = it_ft104.isOff();
				if (idLoopCond_409) {
				} else {

					//BIle:func
					kermeta.exceptions.ConstraintViolatedInv c_lbdExp104 = it_ft104
							.next();

					org.kermeta.compil.runtime.helper.io.StdIOUtil
							.getInstance().writeln(c_lbdExp104.getMessage());
					//EIle:func

				}
			}
		}

		//EIft:each

	}

} //CheckerImpl
