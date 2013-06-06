/**
 */
package kmLogo.VM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kmLogo.VM.VMFactory
 * @model kind="package"
 * @generated
 */
public interface VMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "VM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kmLogo.ecore/VM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "VM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VMPackage eINSTANCE = kmLogo.VM.impl.VMPackageImpl.init();

  /**
   * The meta object id for the '{@link kmLogo.VM.impl.TurtleImpl <em>Turtle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kmLogo.VM.impl.TurtleImpl
   * @see kmLogo.VM.impl.VMPackageImpl#getTurtle()
   * @generated
   */
  int TURTLE = 0;

  /**
   * The feature id for the '<em><b>Position</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURTLE__POSITION = 0;

  /**
   * The feature id for the '<em><b>Drawings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURTLE__DRAWINGS = 1;

  /**
   * The feature id for the '<em><b>Heading</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURTLE__HEADING = 2;

  /**
   * The feature id for the '<em><b>Pen Up</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURTLE__PEN_UP = 3;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURTLE__POINTS = 4;

  /**
   * The number of structural features of the '<em>Turtle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURTLE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link kmLogo.VM.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kmLogo.VM.impl.PointImpl
   * @see kmLogo.VM.impl.VMPackageImpl#getPoint()
   * @generated
   */
  int POINT = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__Y = 1;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link kmLogo.VM.impl.SegmentImpl <em>Segment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kmLogo.VM.impl.SegmentImpl
   * @see kmLogo.VM.impl.VMPackageImpl#getSegment()
   * @generated
   */
  int SEGMENT = 2;

  /**
   * The feature id for the '<em><b>Origin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT__ORIGIN = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Segment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEGMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '<em>Integer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kmLogo.VM.impl.VMPackageImpl#getInteger()
   * @generated
   */
  int INTEGER = 3;

  /**
   * The meta object id for the '<em>Boolean</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Boolean
   * @see kmLogo.VM.impl.VMPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 4;

  /**
   * The meta object id for the '<em>Double</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kmLogo.VM.impl.VMPackageImpl#getDouble()
   * @generated
   */
  int DOUBLE = 5;


  /**
   * Returns the meta object for class '{@link kmLogo.VM.Turtle <em>Turtle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Turtle</em>'.
   * @see kmLogo.VM.Turtle
   * @generated
   */
  EClass getTurtle();

  /**
   * Returns the meta object for the reference '{@link kmLogo.VM.Turtle#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Position</em>'.
   * @see kmLogo.VM.Turtle#getPosition()
   * @see #getTurtle()
   * @generated
   */
  EReference getTurtle_Position();

  /**
   * Returns the meta object for the containment reference list '{@link kmLogo.VM.Turtle#getDrawings <em>Drawings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Drawings</em>'.
   * @see kmLogo.VM.Turtle#getDrawings()
   * @see #getTurtle()
   * @generated
   */
  EReference getTurtle_Drawings();

  /**
   * Returns the meta object for the attribute '{@link kmLogo.VM.Turtle#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Heading</em>'.
   * @see kmLogo.VM.Turtle#getHeading()
   * @see #getTurtle()
   * @generated
   */
  EAttribute getTurtle_Heading();

  /**
   * Returns the meta object for the attribute '{@link kmLogo.VM.Turtle#getPenUp <em>Pen Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pen Up</em>'.
   * @see kmLogo.VM.Turtle#getPenUp()
   * @see #getTurtle()
   * @generated
   */
  EAttribute getTurtle_PenUp();

  /**
   * Returns the meta object for the containment reference list '{@link kmLogo.VM.Turtle#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see kmLogo.VM.Turtle#getPoints()
   * @see #getTurtle()
   * @generated
   */
  EReference getTurtle_Points();

  /**
   * Returns the meta object for class '{@link kmLogo.VM.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see kmLogo.VM.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link kmLogo.VM.Point#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see kmLogo.VM.Point#getX()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_X();

  /**
   * Returns the meta object for the attribute '{@link kmLogo.VM.Point#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see kmLogo.VM.Point#getY()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Y();

  /**
   * Returns the meta object for class '{@link kmLogo.VM.Segment <em>Segment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Segment</em>'.
   * @see kmLogo.VM.Segment
   * @generated
   */
  EClass getSegment();

  /**
   * Returns the meta object for the reference '{@link kmLogo.VM.Segment#getOrigin <em>Origin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Origin</em>'.
   * @see kmLogo.VM.Segment#getOrigin()
   * @see #getSegment()
   * @generated
   */
  EReference getSegment_Origin();

  /**
   * Returns the meta object for the reference '{@link kmLogo.VM.Segment#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see kmLogo.VM.Segment#getDestination()
   * @see #getSegment()
   * @generated
   */
  EReference getSegment_Destination();

  /**
   * Returns the meta object for data type '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Integer</em>'.
   * @model instanceClass="int"
   * @generated
   */
  EDataType getInteger();

  /**
   * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Boolean</em>'.
   * @see java.lang.Boolean
   * @model instanceClass="java.lang.Boolean"
   * @generated
   */
  EDataType getBoolean();

  /**
   * Returns the meta object for data type '<em>Double</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Double</em>'.
   * @model instanceClass="double"
   * @generated
   */
  EDataType getDouble();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VMFactory getVMFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link kmLogo.VM.impl.TurtleImpl <em>Turtle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kmLogo.VM.impl.TurtleImpl
     * @see kmLogo.VM.impl.VMPackageImpl#getTurtle()
     * @generated
     */
    EClass TURTLE = eINSTANCE.getTurtle();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TURTLE__POSITION = eINSTANCE.getTurtle_Position();

    /**
     * The meta object literal for the '<em><b>Drawings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TURTLE__DRAWINGS = eINSTANCE.getTurtle_Drawings();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TURTLE__HEADING = eINSTANCE.getTurtle_Heading();

    /**
     * The meta object literal for the '<em><b>Pen Up</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TURTLE__PEN_UP = eINSTANCE.getTurtle_PenUp();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TURTLE__POINTS = eINSTANCE.getTurtle_Points();

    /**
     * The meta object literal for the '{@link kmLogo.VM.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kmLogo.VM.impl.PointImpl
     * @see kmLogo.VM.impl.VMPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__X = eINSTANCE.getPoint_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__Y = eINSTANCE.getPoint_Y();

    /**
     * The meta object literal for the '{@link kmLogo.VM.impl.SegmentImpl <em>Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kmLogo.VM.impl.SegmentImpl
     * @see kmLogo.VM.impl.VMPackageImpl#getSegment()
     * @generated
     */
    EClass SEGMENT = eINSTANCE.getSegment();

    /**
     * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEGMENT__ORIGIN = eINSTANCE.getSegment_Origin();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEGMENT__DESTINATION = eINSTANCE.getSegment_Destination();

    /**
     * The meta object literal for the '<em>Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kmLogo.VM.impl.VMPackageImpl#getInteger()
     * @generated
     */
    EDataType INTEGER = eINSTANCE.getInteger();

    /**
     * The meta object literal for the '<em>Boolean</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Boolean
     * @see kmLogo.VM.impl.VMPackageImpl#getBoolean()
     * @generated
     */
    EDataType BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '<em>Double</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kmLogo.VM.impl.VMPackageImpl#getDouble()
     * @generated
     */
    EDataType DOUBLE = eINSTANCE.getDouble();

  }

} //VMPackage
