/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.persistence.impl;

import kermeta.persistence.EMFResource;
import kermeta.persistence.PersistencePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMFResourceImpl extends ResourceImpl implements EMFResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.EMF_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clean() {

		{

			org.kermeta.compil.runtime.helper.io.MarkerHelper.cleanFile(this
					.getUri());
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save() {

		java.lang.Boolean idIfCond_35 = false;
		idIfCond_35 = this.getIsReadOnly();

		if (idIfCond_35) {

			kermeta.exceptions.ResourceSaveException e = ((kermeta.exceptions.ResourceSaveException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getResourceSaveException()));

			e
					.setMessage(kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													"Cannot save a readonly resource. Probably this resource was indirectly loaded when loading another resource. \n",
													"If you really intend to save this resource, you can set isReadOnly to false, but you must ensure to do so before any resource save.\n"),
									"Note : setting isReadOnly to false on the metamodel may lead to unpredictable results"));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		org.kermeta.compil.runtime.helper.persistence.Saver.save(this,
				getUri(), getMetaModelURI());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(kermeta.language.structure.Object instance) {

		java.lang.Boolean idIfCond_36 = false;
		idIfCond_36 = this.contains(instance);

		if (idIfCond_36) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.unSetContainingResource(instance);

			kermeta.standard.helper.SetSuper.super_remove(this, instance);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveWithNewURI(String new_uri) {

		org.kermeta.compil.runtime.helper.persistence.Saver.save(this, new_uri,
				getMetaModelURI());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean saveAndValidateWithEMF() {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.ResourceUtil
								.save(this, this.uri, metaModelURI, "EMF",
										this, true), "java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void load() {

		this.clear();

		org.kermeta.compil.runtime.helper.persistence.Loader.load(this,
				getUri(), getMetaModelURI());

		java.lang.Boolean idIfCond_37 = false;
		idIfCond_37 = kermeta.standard.helper.IntegerWrapper.equals(
				this.size(), 0);

		if (idIfCond_37) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
					.writeln("Resource load failed!");

			kermeta.exceptions.ResourceLoadException e = ((kermeta.exceptions.ResourceLoadException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getResourceLoadException()));

			e
					.setMessage(kermeta.standard.helper.StringWrapper
							.plus(
									"Resource load failed, no object was created in this resource from ",
									this.getUri()));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mark(String message) {

		{

			org.kermeta.compil.runtime.helper.io.MarkerHelper.markFile(this
					.getUri(), message);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(kermeta.language.structure.Object instance) {

		//BIft:select

		kermeta.standard.Sequence<kermeta.persistence.Resource> result_ft15 = null;

		kermeta.persistence.Resource elem_ft15 = null;

		result_ft15 = ((kermeta.standard.Sequence<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getRepository().getResources()).iterator();
			java.lang.Boolean idLoopCond_39 = false;
			while (!idLoopCond_39) {
				idLoopCond_39 = it_ft15.isOff();
				if (idLoopCond_39) {
				} else {

					elem_ft15 = it_ft15.next();

					java.lang.Boolean idIfCond_40 = false;
					//BIle:selector
					kermeta.persistence.Resource r_lbdExp15 = elem_ft15;

					idIfCond_40 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(r_lbdExp15,
													this), r_lbdExp15
											.contains(instance));
					//EIle:selector

					if (idIfCond_40) {

						result_ft15.add(elem_ft15);
					}

				}
			}
		}

		//EIft:select
		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft14 = result_ft15
					.iterator();
			java.lang.Boolean idLoopCond_38 = false;
			while (!idLoopCond_38) {
				idLoopCond_38 = it_ft14.isOff();
				if (idLoopCond_38) {
				} else {

					//BIle:func
					kermeta.persistence.Resource r_lbdExp14 = it_ft14.next();

					org.kermeta.compil.runtime.helper.io.StdIOUtil
							.getInstance()
							.writeln(
									"DVK ! another resource of the same repository was containing this element");

					r_lbdExp14.remove(instance);
					//EIle:func

				}
			}
		}

		//EIft:each

		org.kermeta.compil.runtime.helper.language.ObjectUtil
				.setContainingResource(instance, this);

		kermeta.standard.helper.SetSuper.super_add(this, instance);

	}

} //EMFResourceImpl
