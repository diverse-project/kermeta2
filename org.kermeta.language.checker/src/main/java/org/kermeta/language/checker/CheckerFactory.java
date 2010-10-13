/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.checker;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.language.checker.CheckerPackage
 * @generated
 */
public interface CheckerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CheckerFactory eINSTANCE = org.kermeta.language.checker.impl.CheckerFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Checker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checker</em>'.
	 * @generated
	 */
	Checker createChecker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CheckerPackage getCheckerPackage();

} //CheckerFactory
