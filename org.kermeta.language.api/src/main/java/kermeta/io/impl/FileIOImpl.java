/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.io.impl;

import kermeta.io.FileIO;
import kermeta.io.IoPackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File IO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FileIOImpl extends ObjectImpl implements FileIO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.FILE_IO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeTextFileWithEncoding(String filename, String text,
			String encoding) {

		java.lang.Boolean idIfCond_360 = false;
		idIfCond_360 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_360) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getFileNotFoundException())));

		}

		org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
				.writeTextFileWithEncoding(filename, text, encoding);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeTextFile(String filename, String text) {

		java.lang.Boolean idIfCond_361 = false;
		idIfCond_361 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_361) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getFileNotFoundException())));

		}

		org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil.writeTextFile(
				filename, text);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String readTextFile(String filename) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_362 = false;
		idIfCond_362 = kermeta.standard.helper.StringWrapper.equals(filename,
				null);

		if (idIfCond_362) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getFileNotFoundException())));

		}

		java.lang.Boolean exists = null;

		java.lang.Boolean isdirectory = null;

		exists = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.fileExists(filename), "java.lang.Boolean");

		isdirectory = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.fileIsDirectory(filename), "java.lang.Boolean");

		java.lang.Boolean idIfCond_363 = false;
		idIfCond_363 = kermeta.standard.helper.BooleanWrapper.not(exists);

		if (idIfCond_363) {

			kermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getFileNotFoundException()));

			e.setMessage(filename);

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		java.lang.Boolean idIfCond_364 = false;
		idIfCond_364 = isdirectory;

		if (idIfCond_364) {

			kermeta.exceptions.FileNotFoundException e = ((kermeta.exceptions.FileNotFoundException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
							.getFileNotFoundException()));

			e.setMessage(kermeta.standard.helper.StringWrapper.plus(filename,
					" is not a file"));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.io.SimpleFileIOUtil
								.readTextFile(filename), "java.lang.String");

		return result;

	}

} //FileIOImpl
