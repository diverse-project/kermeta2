/**
 */
package org.kermeta.language.sample.logo.model.logoASM.impl;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.language.sample.logo.model.logoASM.LogoASMPackage;
import org.kermeta.language.sample.logo.model.logoASM.Primitive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PrimitiveImpl extends InstructionImpl implements Primitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogoASMPackage.Literals.PRIMITIVE;
	}

} //PrimitiveImpl