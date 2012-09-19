/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
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
 *   <li>{@link org.kermeta.language.structure.Metamodel#getOwnedBindings <em>Owned Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Metamodel#getOwnedMetamodels <em>Owned Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends TypeDefinition, ModelingUnit {
	/**
	 * Returns the value of the '<em><b>Owned Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.MetamodelBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getMetamodel_OwnedBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelBinding> getOwnedBindings();

	/**
	 * Returns the value of the '<em><b>Owned Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Metamodels</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getMetamodel_OwnedMetamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getOwnedMetamodels();

} // Metamodel
