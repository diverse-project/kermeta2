/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.ConditionalOrExpression;
import alfDsl.ConditionalTestExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Test Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.ConditionalTestExpressionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link alfDsl.impl.ConditionalTestExpressionImpl#getWhenTrue <em>When True</em>}</li>
 *   <li>{@link alfDsl.impl.ConditionalTestExpressionImpl#getWhenFalse <em>When False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalTestExpressionImpl extends ExpressionImpl implements ConditionalTestExpression {
	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected ConditionalOrExpression exp;

	/**
	 * The cached value of the '{@link #getWhenTrue() <em>When True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenTrue()
	 * @generated
	 * @ordered
	 */
	protected ConditionalTestExpression whenTrue;

	/**
	 * The cached value of the '{@link #getWhenFalse() <em>When False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenFalse()
	 * @generated
	 * @ordered
	 */
	protected ConditionalTestExpression whenFalse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalTestExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.CONDITIONAL_TEST_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOrExpression getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(ConditionalOrExpression newExp, NotificationChain msgs) {
		ConditionalOrExpression oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP, oldExp, newExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExp(ConditionalOrExpression newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP, newExp, newExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalTestExpression getWhenTrue() {
		return whenTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenTrue(ConditionalTestExpression newWhenTrue, NotificationChain msgs) {
		ConditionalTestExpression oldWhenTrue = whenTrue;
		whenTrue = newWhenTrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE, oldWhenTrue, newWhenTrue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenTrue(ConditionalTestExpression newWhenTrue) {
		if (newWhenTrue != whenTrue) {
			NotificationChain msgs = null;
			if (whenTrue != null)
				msgs = ((InternalEObject)whenTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE, null, msgs);
			if (newWhenTrue != null)
				msgs = ((InternalEObject)newWhenTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE, null, msgs);
			msgs = basicSetWhenTrue(newWhenTrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE, newWhenTrue, newWhenTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalTestExpression getWhenFalse() {
		return whenFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenFalse(ConditionalTestExpression newWhenFalse, NotificationChain msgs) {
		ConditionalTestExpression oldWhenFalse = whenFalse;
		whenFalse = newWhenFalse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE, oldWhenFalse, newWhenFalse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenFalse(ConditionalTestExpression newWhenFalse) {
		if (newWhenFalse != whenFalse) {
			NotificationChain msgs = null;
			if (whenFalse != null)
				msgs = ((InternalEObject)whenFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE, null, msgs);
			if (newWhenFalse != null)
				msgs = ((InternalEObject)newWhenFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE, null, msgs);
			msgs = basicSetWhenFalse(newWhenFalse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE, newWhenFalse, newWhenFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP:
				return basicSetExp(null, msgs);
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE:
				return basicSetWhenTrue(null, msgs);
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE:
				return basicSetWhenFalse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP:
				return getExp();
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE:
				return getWhenTrue();
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE:
				return getWhenFalse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP:
				setExp((ConditionalOrExpression)newValue);
				return;
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE:
				setWhenTrue((ConditionalTestExpression)newValue);
				return;
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE:
				setWhenFalse((ConditionalTestExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP:
				setExp((ConditionalOrExpression)null);
				return;
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE:
				setWhenTrue((ConditionalTestExpression)null);
				return;
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE:
				setWhenFalse((ConditionalTestExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__EXP:
				return exp != null;
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE:
				return whenTrue != null;
			case AlfDslPackage.CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE:
				return whenFalse != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalTestExpressionImpl
