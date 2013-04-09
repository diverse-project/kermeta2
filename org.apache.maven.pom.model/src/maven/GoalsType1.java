/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package maven;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goals Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maven.GoalsType1#getGoal <em>Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see maven.MavenPackage#getGoalsType1()
 * @model extendedMetaData="name='goals_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface GoalsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute list.
	 * @see maven.MavenPackage#getGoalsType1_Goal()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='goal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getGoal();

} // GoalsType1
