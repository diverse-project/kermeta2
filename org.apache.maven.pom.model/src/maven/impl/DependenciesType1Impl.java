/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package maven.impl;

import java.util.Collection;

import maven.DependenciesType1;
import maven.Dependency;
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
 * An implementation of the model object '<em><b>Dependencies Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maven.impl.DependenciesType1Impl#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependenciesType1Impl extends EObjectImpl implements DependenciesType1 {
	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenciesType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.DEPENDENCIES_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentEList<Dependency>(Dependency.class, this, MavenPackage.DEPENDENCIES_TYPE1__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MavenPackage.DEPENDENCIES_TYPE1__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
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
			case MavenPackage.DEPENDENCIES_TYPE1__DEPENDENCY:
				return getDependency();
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
			case MavenPackage.DEPENDENCIES_TYPE1__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends Dependency>)newValue);
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
			case MavenPackage.DEPENDENCIES_TYPE1__DEPENDENCY:
				getDependency().clear();
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
			case MavenPackage.DEPENDENCIES_TYPE1__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DependenciesType1Impl
