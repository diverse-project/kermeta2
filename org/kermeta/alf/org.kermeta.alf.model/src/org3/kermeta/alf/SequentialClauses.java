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
 * A representation of the model object '<em><b>Sequential Clauses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.SequentialClauses#getConccurentClauses <em>Conccurent Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getSequentialClauses()
 * @model
 * @generated
 */
public interface SequentialClauses extends EObject {
	/**
	 * Returns the value of the '<em><b>Conccurent Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link org3.kermeta.alf.ConcurrentClauses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conccurent Clauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conccurent Clauses</em>' containment reference list.
	 * @see org3.kermeta.alf.AlfPackage#getSequentialClauses_ConccurentClauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcurrentClauses> getConccurentClauses();

} // SequentialClauses
