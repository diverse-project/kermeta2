/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.Expression;
import alfDsl.SwitchClause;
import alfDsl.SwitchDefaultClause;
import alfDsl.SwitchStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.SwitchStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link alfDsl.impl.SwitchStatementImpl#getSwitchClause <em>Switch Clause</em>}</li>
 *   <li>{@link alfDsl.impl.SwitchStatementImpl#getDefaultClause <em>Default Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchStatementImpl extends StatementImpl implements SwitchStatement {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getSwitchClause() <em>Switch Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchClause()
	 * @generated
	 * @ordered
	 */
	protected EList switchClause;

	/**
	 * The cached value of the '{@link #getDefaultClause() <em>Default Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultClause()
	 * @generated
	 * @ordered
	 */
	protected SwitchDefaultClause defaultClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.SWITCH_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.SWITCH_STATEMENT__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.SWITCH_STATEMENT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.SWITCH_STATEMENT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.SWITCH_STATEMENT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSwitchClause() {
		if (switchClause == null) {
			switchClause = new EObjectContainmentEList(SwitchClause.class, this, AlfDslPackage.SWITCH_STATEMENT__SWITCH_CLAUSE);
		}
		return switchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchDefaultClause getDefaultClause() {
		return defaultClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultClause(SwitchDefaultClause newDefaultClause, NotificationChain msgs) {
		SwitchDefaultClause oldDefaultClause = defaultClause;
		defaultClause = newDefaultClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE, oldDefaultClause, newDefaultClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultClause(SwitchDefaultClause newDefaultClause) {
		if (newDefaultClause != defaultClause) {
			NotificationChain msgs = null;
			if (defaultClause != null)
				msgs = ((InternalEObject)defaultClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE, null, msgs);
			if (newDefaultClause != null)
				msgs = ((InternalEObject)newDefaultClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE, null, msgs);
			msgs = basicSetDefaultClause(newDefaultClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE, newDefaultClause, newDefaultClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.SWITCH_STATEMENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case AlfDslPackage.SWITCH_STATEMENT__SWITCH_CLAUSE:
				return ((InternalEList)getSwitchClause()).basicRemove(otherEnd, msgs);
			case AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE:
				return basicSetDefaultClause(null, msgs);
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
			case AlfDslPackage.SWITCH_STATEMENT__EXPRESSION:
				return getExpression();
			case AlfDslPackage.SWITCH_STATEMENT__SWITCH_CLAUSE:
				return getSwitchClause();
			case AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE:
				return getDefaultClause();
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
			case AlfDslPackage.SWITCH_STATEMENT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case AlfDslPackage.SWITCH_STATEMENT__SWITCH_CLAUSE:
				getSwitchClause().clear();
				getSwitchClause().addAll((Collection)newValue);
				return;
			case AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE:
				setDefaultClause((SwitchDefaultClause)newValue);
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
			case AlfDslPackage.SWITCH_STATEMENT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case AlfDslPackage.SWITCH_STATEMENT__SWITCH_CLAUSE:
				getSwitchClause().clear();
				return;
			case AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE:
				setDefaultClause((SwitchDefaultClause)null);
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
			case AlfDslPackage.SWITCH_STATEMENT__EXPRESSION:
				return expression != null;
			case AlfDslPackage.SWITCH_STATEMENT__SWITCH_CLAUSE:
				return switchClause != null && !switchClause.isEmpty();
			case AlfDslPackage.SWITCH_STATEMENT__DEFAULT_CLAUSE:
				return defaultClause != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchStatementImpl