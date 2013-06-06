/**
 */
package kmLogo.VM.impl;

import kmLogo.VM.Point;
import kmLogo.VM.Segment;
import kmLogo.VM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kmLogo.VM.impl.SegmentImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link kmLogo.VM.impl.SegmentImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentImpl extends EObjectImpl implements Segment
{
  /**
   * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrigin()
   * @generated
   * @ordered
   */
  protected Point origin;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected Point destination;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SegmentImpl()
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
    return VMPackage.Literals.SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getOrigin()
  {
    if (origin != null && origin.eIsProxy())
    {
      InternalEObject oldOrigin = (InternalEObject)origin;
      origin = (Point)eResolveProxy(oldOrigin);
      if (origin != oldOrigin)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.SEGMENT__ORIGIN, oldOrigin, origin));
      }
    }
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point basicGetOrigin()
  {
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrigin(Point newOrigin)
  {
    Point oldOrigin = origin;
    origin = newOrigin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.SEGMENT__ORIGIN, oldOrigin, origin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getDestination()
  {
    if (destination != null && destination.eIsProxy())
    {
      InternalEObject oldDestination = (InternalEObject)destination;
      destination = (Point)eResolveProxy(oldDestination);
      if (destination != oldDestination)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.SEGMENT__DESTINATION, oldDestination, destination));
      }
    }
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point basicGetDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(Point newDestination)
  {
    Point oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.SEGMENT__DESTINATION, oldDestination, destination));
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
      case VMPackage.SEGMENT__ORIGIN:
        if (resolve) return getOrigin();
        return basicGetOrigin();
      case VMPackage.SEGMENT__DESTINATION:
        if (resolve) return getDestination();
        return basicGetDestination();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VMPackage.SEGMENT__ORIGIN:
        setOrigin((Point)newValue);
        return;
      case VMPackage.SEGMENT__DESTINATION:
        setDestination((Point)newValue);
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
      case VMPackage.SEGMENT__ORIGIN:
        setOrigin((Point)null);
        return;
      case VMPackage.SEGMENT__DESTINATION:
        setDestination((Point)null);
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
      case VMPackage.SEGMENT__ORIGIN:
        return origin != null;
      case VMPackage.SEGMENT__DESTINATION:
        return destination != null;
    }
    return super.eIsSet(featureID);
  }

} //SegmentImpl
