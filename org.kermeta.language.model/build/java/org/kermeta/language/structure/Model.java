/**
 * IRISA / INRIA / Universite de Rennes 1
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Is the holder of a set of model elements (Object) that are compatible with the ModelType that has 
 * instantiated this Model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Model#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends org.kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contents of this model...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModel_Contents()
	 * @model changeable="false"
	 * @generated
	 */
	EList<org.kermeta.language.structure.Object> getContents();

} // Model
