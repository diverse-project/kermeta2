/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvttemplate.impl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionType;
import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;
import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.CollectionTemplateExp;
import fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage;

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
 * An implementation of the model object '<em><b>Collection Template Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.impl.CollectionTemplateExpImpl#getMember <em>Member</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.impl.CollectionTemplateExpImpl#getReferredCollectionType <em>Referred Collection Type</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.impl.CollectionTemplateExpImpl#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionTemplateExpImpl extends TemplateExpImpl implements CollectionTemplateExp {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList member;

	/**
	 * The cached value of the '{@link #getReferredCollectionType() <em>Referred Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredCollectionType()
	 * @generated
	 * @ordered
	 */
	protected CollectionType referredCollectionType;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected Variable rest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTemplateExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvttemplatePackage.Literals.COLLECTION_TEMPLATE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMember() {
		if (member == null) {
			member = new EObjectContainmentEList(OclExpression.class, this, QvttemplatePackage.COLLECTION_TEMPLATE_EXP__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType getReferredCollectionType() {
		if (referredCollectionType != null && referredCollectionType.eIsProxy()) {
			InternalEObject oldReferredCollectionType = (InternalEObject)referredCollectionType;
			referredCollectionType = (CollectionType)eResolveProxy(oldReferredCollectionType);
			if (referredCollectionType != oldReferredCollectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE, oldReferredCollectionType, referredCollectionType));
			}
		}
		return referredCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType basicGetReferredCollectionType() {
		return referredCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredCollectionType(CollectionType newReferredCollectionType) {
		CollectionType oldReferredCollectionType = referredCollectionType;
		referredCollectionType = newReferredCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE, oldReferredCollectionType, referredCollectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRest() {
		if (rest != null && rest.eIsProxy()) {
			InternalEObject oldRest = (InternalEObject)rest;
			rest = (Variable)eResolveProxy(oldRest);
			if (rest != oldRest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REST, oldRest, rest));
			}
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRest() {
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRest(Variable newRest) {
		Variable oldRest = rest;
		rest = newRest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REST, oldRest, rest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__MEMBER:
				return ((InternalEList)getMember()).basicRemove(otherEnd, msgs);
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
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__MEMBER:
				return getMember();
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE:
				if (resolve) return getReferredCollectionType();
				return basicGetReferredCollectionType();
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REST:
				if (resolve) return getRest();
				return basicGetRest();
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
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__MEMBER:
				getMember().clear();
				getMember().addAll((Collection)newValue);
				return;
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE:
				setReferredCollectionType((CollectionType)newValue);
				return;
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REST:
				setRest((Variable)newValue);
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
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__MEMBER:
				getMember().clear();
				return;
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE:
				setReferredCollectionType((CollectionType)null);
				return;
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REST:
				setRest((Variable)null);
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
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__MEMBER:
				return member != null && !member.isEmpty();
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE:
				return referredCollectionType != null;
			case QvttemplatePackage.COLLECTION_TEMPLATE_EXP__REST:
				return rest != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionTemplateExpImpl
