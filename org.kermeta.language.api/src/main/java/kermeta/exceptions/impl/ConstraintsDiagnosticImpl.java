/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ConstraintViolatedInv;
import kermeta.exceptions.ConstraintsDiagnostic;
import kermeta.exceptions.ExceptionsPackage;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.Bag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.exceptions.impl.ConstraintsDiagnosticImpl#getSetConstraints <em>Set Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintsDiagnosticImpl extends ObjectImpl implements
		ConstraintsDiagnostic {
	/**
	 * The cached value of the '{@link #getSetConstraints() <em>Set Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetConstraints()
	 * @generated
	 * @ordered
	 */
	protected Bag<ConstraintViolatedInv> setConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsDiagnosticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.CONSTRAINTS_DIAGNOSTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Bag<ConstraintViolatedInv> getSetConstraints() {
		if (setConstraints != null && setConstraints.eIsProxy()) {
			InternalEObject oldSetConstraints = (InternalEObject) setConstraints;
			setConstraints = (Bag<ConstraintViolatedInv>) eResolveProxy(oldSetConstraints);
			if (setConstraints != oldSetConstraints) {
				InternalEObject newSetConstraints = (InternalEObject) setConstraints;
				NotificationChain msgs = oldSetConstraints
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
								null, null);
				if (newSetConstraints.eInternalContainer() == null) {
					msgs = newSetConstraints
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
							oldSetConstraints, setConstraints));
			}
		}
		return setConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<ConstraintViolatedInv> basicGetSetConstraints() {
		return setConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetConstraints(
			Bag<ConstraintViolatedInv> newSetConstraints, NotificationChain msgs) {
		Bag<ConstraintViolatedInv> oldSetConstraints = setConstraints;
		setConstraints = newSetConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
					oldSetConstraints, newSetConstraints);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetConstraints(Bag<ConstraintViolatedInv> newSetConstraints) {
		if (newSetConstraints != setConstraints) {
			NotificationChain msgs = null;
			if (setConstraints != null)
				msgs = ((InternalEObject) setConstraints)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
								null, msgs);
			if (newSetConstraints != null)
				msgs = ((InternalEObject) newSetConstraints)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
								null, msgs);
			msgs = basicSetSetConstraints(newSetConstraints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS,
					newSetConstraints, newSetConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void prettyPrint() {

		//BIft:each

		//BIft:collect

		kermeta.standard.Sequence<kermeta.persistence.EMFResource> result_ft102 = null;

		result_ft102 = ((kermeta.standard.Sequence<kermeta.persistence.EMFResource>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft102 = this
					.getSetConstraints().iterator();
			java.lang.Boolean idLoopCond_396 = false;
			while (!idLoopCond_396) {
				idLoopCond_396 = it_ft102.isOff();
				if (idLoopCond_396) {
				} else {

					kermeta.persistence.EMFResource result_lambda_ft102 = null;
					//BIle:collector
					kermeta.exceptions.ConstraintViolatedInv constraint_lbdExp102 = it_ft102
							.next();

					result_lambda_ft102 = ((kermeta.persistence.EMFResource) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containingResourceSwitcher(constraint_lbdExp102
													.getConstraintAppliedTo()),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.persistence.EMFResource")));
					//EIle:collector

					result_ft102.add(result_lambda_ft102);
				}
			}
		}

		//EIft:collect

		{

			kermeta.standard.Iterator<kermeta.persistence.EMFResource> it_ft101 = result_ft102
					.asSet().iterator();
			java.lang.Boolean idLoopCond_397 = false;
			while (!idLoopCond_397) {
				idLoopCond_397 = it_ft101.isOff();
				if (idLoopCond_397) {
				} else {

					//BIle:func
					kermeta.persistence.EMFResource resource_lbdExp101 = it_ft101
							.next();

					resource_lbdExp101.clean();
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft103 = this
					.getSetConstraints().iterator();
			java.lang.Boolean idLoopCond_398 = false;
			while (!idLoopCond_398) {
				idLoopCond_398 = it_ft103.isOff();
				if (idLoopCond_398) {
				} else {

					//BIle:func
					kermeta.exceptions.ConstraintViolatedInv c_lbdExp103 = it_ft103
							.next();

					kermeta.persistence.EMFResource resource = ((kermeta.persistence.EMFResource) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containingResourceSwitcher(c_lbdExp103
													.getConstraintAppliedTo()),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.persistence.EMFResource")));

					org.kermeta.compil.runtime.helper.io.StdIOUtil
							.getInstance()
							.writeln(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	c_lbdExp103
																			.getMessage(),
																	" in file "),
													resource.getUri()));

					resource.mark(c_lbdExp103.getMessage());
					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(ConstraintViolatedInv cons) {

		this.getSetConstraints().add(cons);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsDiagnostic initialize() {

		kermeta.exceptions.ConstraintsDiagnostic result = null;

		this
				.setSetConstraints(((kermeta.standard.Bag<kermeta.exceptions.ConstraintViolatedInv>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.standard.StandardPackage.eINSTANCE
								.getBag())));

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			return basicSetSetConstraints(null, msgs);
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
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			if (resolve)
				return getSetConstraints();
			return basicGetSetConstraints();
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
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			setSetConstraints((Bag<ConstraintViolatedInv>) newValue);
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
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			setSetConstraints((Bag<ConstraintViolatedInv>) null);
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
		case ExceptionsPackage.CONSTRAINTS_DIAGNOSTIC__SET_CONSTRAINTS:
			return setConstraints != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintsDiagnosticImpl
