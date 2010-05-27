/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package maven.impl;

import java.util.Collection;

import maven.Developer;
import maven.DevelopersType;
import maven.MavenPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Developers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maven.impl.DevelopersTypeImpl#getDeveloper <em>Developer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopersTypeImpl extends EObjectImpl implements DevelopersType {
	/**
	 * The cached value of the '{@link #getDeveloper() <em>Developer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeveloper()
	 * @generated
	 * @ordered
	 */
	protected EList<Developer> developer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.DEVELOPERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Developer> getDeveloper() {
		if (developer == null) {
			developer = new EObjectContainmentEList<Developer>(Developer.class, this, MavenPackage.DEVELOPERS_TYPE__DEVELOPER);
		}
		return developer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MavenPackage.DEVELOPERS_TYPE__DEVELOPER:
				return ((InternalEList<?>)getDeveloper()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MavenPackage.DEVELOPERS_TYPE__DEVELOPER:
				return getDeveloper();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MavenPackage.DEVELOPERS_TYPE__DEVELOPER:
				getDeveloper().clear();
				getDeveloper().addAll((Collection<? extends Developer>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MavenPackage.DEVELOPERS_TYPE__DEVELOPER:
				getDeveloper().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MavenPackage.DEVELOPERS_TYPE__DEVELOPER:
				return developer != null && !developer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevelopersTypeImpl
