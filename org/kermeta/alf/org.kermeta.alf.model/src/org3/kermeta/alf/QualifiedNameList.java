/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.QualifiedNameList#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getQualifiedNameList()
 * @model
 * @generated
 */
public interface QualifiedNameList extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' containment reference list.
	 * The list contents are of type {@link org3.kermeta.alf.QualifiedNameWithBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' containment reference list.
	 * @see org3.kermeta.alf.AlfPackage#getQualifiedNameList_QualifiedName()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualifiedNameWithBinding> getQualifiedName();

} // QualifiedNameList
