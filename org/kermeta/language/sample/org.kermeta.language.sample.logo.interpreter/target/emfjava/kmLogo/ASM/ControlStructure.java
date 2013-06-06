/**
 */
package kmLogo.ASM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kmLogo.ASM.ControlStructure#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see kmLogo.ASM.ASMPackage#getControlStructure()
 * @model
 * @generated
 */
public interface ControlStructure extends Instruction
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see kmLogo.ASM.ASMPackage#getControlStructure_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link kmLogo.ASM.ControlStructure#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

} // ControlStructure
