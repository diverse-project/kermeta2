/*$Id : ExpressionImpl.java v 1.3 May 8, 2010 9:38:46 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model
* File : 	ExpressionImpl.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.language.sample.logo.model.kmLogo.ASM.impl;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.language.sample.logo.model.kmLogo.ASM.ASMPackage;
import org.kermeta.language.sample.logo.model.kmLogo.ASM.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionImpl extends InstructionImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASMPackage.Literals.EXPRESSION;
	}

} //ExpressionImpl
