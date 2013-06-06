/**
 */
package kmLogo.VM.impl;

import java.util.Collection;

import kmLogo.VM.Point;
import kmLogo.VM.Segment;
import kmLogo.VM.Turtle;
import kmLogo.VM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turtle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kmLogo.VM.impl.TurtleImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link kmLogo.VM.impl.TurtleImpl#getDrawings <em>Drawings</em>}</li>
 *   <li>{@link kmLogo.VM.impl.TurtleImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link kmLogo.VM.impl.TurtleImpl#getPenUp <em>Pen Up</em>}</li>
 *   <li>{@link kmLogo.VM.impl.TurtleImpl#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TurtleImpl extends EObjectImpl implements Turtle
{
  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Point position;

  /**
   * The cached value of the '{@link #getDrawings() <em>Drawings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrawings()
   * @generated
   * @ordered
   */
  protected EList<Segment> drawings;

  /**
   * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeading()
   * @generated
   * @ordered
   */
  protected static final int HEADING_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeading()
   * @generated
   * @ordered
   */
  protected int heading = HEADING_EDEFAULT;

  /**
   * The default value of the '{@link #getPenUp() <em>Pen Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPenUp()
   * @generated
   * @ordered
   */
  protected static final Boolean PEN_UP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPenUp() <em>Pen Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPenUp()
   * @generated
   * @ordered
   */
  protected Boolean penUp = PEN_UP_EDEFAULT;

  /**
   * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoints()
   * @generated
   * @ordered
   */
  protected EList<Point> points;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TurtleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VMPackage.Literals.TURTLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getPosition()
  {
    if (position != null && position.eIsProxy())
    {
      InternalEObject oldPosition = (InternalEObject)position;
      position = (Point)eResolveProxy(oldPosition);
      if (position != oldPosition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.TURTLE__POSITION, oldPosition, position));
      }
    }
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point basicGetPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Point newPosition)
  {
    Point oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.TURTLE__POSITION, oldPosition, position));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Segment> getDrawings()
  {
    if (drawings == null)
    {
      drawings = new EObjectContainmentEList<Segment>(Segment.class, this, VMPackage.TURTLE__DRAWINGS);
    }
    return drawings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeading()
  {
    return heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeading(int newHeading)
  {
    int oldHeading = heading;
    heading = newHeading;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.TURTLE__HEADING, oldHeading, heading));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getPenUp()
  {
    return penUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPenUp(Boolean newPenUp)
  {
    Boolean oldPenUp = penUp;
    penUp = newPenUp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.TURTLE__PEN_UP, oldPenUp, penUp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Point> getPoints()
  {
    if (points == null)
    {
      points = new EObjectContainmentEList<Point>(Point.class, this, VMPackage.TURTLE__POINTS);
    }
    return points;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VMPackage.TURTLE__DRAWINGS:
        return ((InternalEList<?>)getDrawings()).basicRemove(otherEnd, msgs);
      case VMPackage.TURTLE__POINTS:
        return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VMPackage.TURTLE__POSITION:
        if (resolve) return getPosition();
        return basicGetPosition();
      case VMPackage.TURTLE__DRAWINGS:
        return getDrawings();
      case VMPackage.TURTLE__HEADING:
        return getHeading();
      case VMPackage.TURTLE__PEN_UP:
        return getPenUp();
      case VMPackage.TURTLE__POINTS:
        return getPoints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VMPackage.TURTLE__POSITION:
        setPosition((Point)newValue);
        return;
      case VMPackage.TURTLE__DRAWINGS:
        getDrawings().clear();
        getDrawings().addAll((Collection<? extends Segment>)newValue);
        return;
      case VMPackage.TURTLE__HEADING:
        setHeading((Integer)newValue);
        return;
      case VMPackage.TURTLE__PEN_UP:
        setPenUp((Boolean)newValue);
        return;
      case VMPackage.TURTLE__POINTS:
        getPoints().clear();
        getPoints().addAll((Collection<? extends Point>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VMPackage.TURTLE__POSITION:
        setPosition((Point)null);
        return;
      case VMPackage.TURTLE__DRAWINGS:
        getDrawings().clear();
        return;
      case VMPackage.TURTLE__HEADING:
        setHeading(HEADING_EDEFAULT);
        return;
      case VMPackage.TURTLE__PEN_UP:
        setPenUp(PEN_UP_EDEFAULT);
        return;
      case VMPackage.TURTLE__POINTS:
        getPoints().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VMPackage.TURTLE__POSITION:
        return position != null;
      case VMPackage.TURTLE__DRAWINGS:
        return drawings != null && !drawings.isEmpty();
      case VMPackage.TURTLE__HEADING:
        return heading != HEADING_EDEFAULT;
      case VMPackage.TURTLE__PEN_UP:
        return PEN_UP_EDEFAULT == null ? penUp != null : !PEN_UP_EDEFAULT.equals(penUp);
      case VMPackage.TURTLE__POINTS:
        return points != null && !points.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (heading: ");
    result.append(heading);
    result.append(", penUp: ");
    result.append(penUp);
    result.append(')');
    return result.toString();
  }

} //TurtleImpl
