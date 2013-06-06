/**
 */
package kmLogo.VM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kmLogo.VM.Segment#getOrigin <em>Origin</em>}</li>
 *   <li>{@link kmLogo.VM.Segment#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see kmLogo.VM.VMPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends EObject
{
  /**
   * Returns the value of the '<em><b>Origin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Origin</em>' reference.
   * @see #setOrigin(Point)
   * @see kmLogo.VM.VMPackage#getSegment_Origin()
   * @model required="true"
   * @generated
   */
  Point getOrigin();

  /**
   * Sets the value of the '{@link kmLogo.VM.Segment#getOrigin <em>Origin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Origin</em>' reference.
   * @see #getOrigin()
   * @generated
   */
  void setOrigin(Point value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(Point)
   * @see kmLogo.VM.VMPackage#getSegment_Destination()
   * @model required="true"
   * @generated
   */
  Point getDestination();

  /**
   * Sets the value of the '{@link kmLogo.VM.Segment#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(Point value);

} // Segment
