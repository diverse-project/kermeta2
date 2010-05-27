/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The modeling unit is the root of any kermeta model. It contains packages, requires and usings.
 * It also reference others modeling unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelingUnit#getUsings <em>Usings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model
 * @generated
 */
public interface ModelingUnit extends org.kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * root packages contained by this ModelingUnit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit_Packages()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<org.kermeta.language.structure.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Require}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of "require" statements associated with this ModelingUnit. Ie. list of the other
	 * files required to run this unit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit_Requires()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Require> getRequires();

	/**
	 * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Using}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of "using" statement associated with this ModelingUnit. Ie. list of "syntatic shortcut"
	 * that can be used within this unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit_Usings()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Using> getUsings();

} // ModelingUnit
