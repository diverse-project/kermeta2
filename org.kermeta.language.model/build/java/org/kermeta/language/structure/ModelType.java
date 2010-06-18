/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type of a model, consisting of a set of included type definitions.
 * For historical reason, this is both a type and a TypeDefinition, mainly due to the fact that a ModelDefinition isn't a GenericTypeDefinition (maybe this should be discussed again ?)
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelType#getIncludedTypeDefinition <em>Included Type Definition</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelType#getOwnedPackages <em>Owned Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends Type, TypeDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Included Type Definition</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included Type Definition</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelType_IncludedTypeDefinition()
	 * @model
	 * @generated
	 */
	EList<TypeDefinition> getIncludedTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Kermeta V2, a ModelDefinition can either defines its own TypeDefinition (through the ownedPackages reference)
	 * or refer to external definition (through the includedTypeDefinition reference) (need to be discused)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Packages</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelType_OwnedPackages()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<org.kermeta.language.structure.Package> getOwnedPackages();

} // ModelType
