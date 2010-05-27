/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mailing Lists Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.MailingListsType#getMailingList <em>Mailing List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.maven.pom._4._0._0Package#getMailingListsType()
 * @model extendedMetaData="name='mailingLists_._type' kind='elementOnly'"
 * @generated
 */
public interface MailingListsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mailing List</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.maven.pom._4._0.MailingList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mailing List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mailing List</em>' containment reference list.
	 * @see org.apache.maven.pom._4._0._0Package#getMailingListsType_MailingList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mailingList' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MailingList> getMailingList();

} // MailingListsType
