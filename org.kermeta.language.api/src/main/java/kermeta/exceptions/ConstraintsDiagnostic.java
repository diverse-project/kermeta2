/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.exceptions;

import kermeta.standard.Bag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.exceptions.ConstraintsDiagnostic#getSetConstraints <em>Set Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.exceptions.ExceptionsPackage#getConstraintsDiagnostic()
 * @model annotation="kermeta CompilerIgnore='true'"
 * @generated
 */
public interface ConstraintsDiagnostic extends
		kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Set Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Constraints</em>' containment reference.
	 * @see #setSetConstraints(Bag)
	 * @see kermeta.exceptions.ExceptionsPackage#getConstraintsDiagnostic_SetConstraints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Bag<ConstraintViolatedInv> getSetConstraints();

	/**
	 * Sets the value of the '{@link kermeta.exceptions.ConstraintsDiagnostic#getSetConstraints <em>Set Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Constraints</em>' containment reference.
	 * @see #getSetConstraints()
	 * @generated
	 */
	void setSetConstraints(Bag<ConstraintViolatedInv> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t//BIft:collect\n\nkermeta.standard.Sequence<kermeta.persistence.EMFResource> result_ft102 = null;\n\n\tresult_ft102 = ((kermeta.standard.Sequence<kermeta.persistence.EMFResource>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft102 = this.getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_396 = false;\n\twhile( !idLoopCond_396 ) {\n\tidLoopCond_396 = it_ft102.isOff();\n\tif ( idLoopCond_396 ) {\n\t} else {\n\nkermeta.persistence.EMFResource result_lambda_ft102 = null;\n//BIle:collector\nkermeta.exceptions.ConstraintViolatedInv constraint_lbdExp102 = it_ft102.next();\n\n\tresult_lambda_ft102 = ((kermeta.persistence.EMFResource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containingResourceSwitcher(constraint_lbdExp102.getConstraintAppliedTo()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.persistence.EMFResource\")));\n//EIle:collector\n\n\tresult_ft102.add(result_lambda_ft102);\n}\n\t}\n}\n\n//EIft:collect\n\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.EMFResource> it_ft101 = result_ft102.asSet().iterator();\n\tjava.lang.Boolean idLoopCond_397 = false;\n\twhile( !idLoopCond_397 ) {\n\tidLoopCond_397 = it_ft101.isOff();\n\tif ( idLoopCond_397 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.persistence.EMFResource resource_lbdExp101 = it_ft101.next();\n\n\tresource_lbdExp101.clean();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft103 = this.getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_398 = false;\n\twhile( !idLoopCond_398 ) {\n\tidLoopCond_398 = it_ft103.isOff();\n\tif ( idLoopCond_398 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.exceptions.ConstraintViolatedInv c_lbdExp103 = it_ft103.next();\n\n\tkermeta.persistence.EMFResource resource = ((kermeta.persistence.EMFResource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containingResourceSwitcher(c_lbdExp103.getConstraintAppliedTo()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.persistence.EMFResource\")));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(c_lbdExp103.getMessage(), \" in file \"), resource.getUri()));\n\n\tresource.mark(c_lbdExp103.getMessage());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void prettyPrint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.getSetConstraints().add(cons);\n'"
	 * @generated
	 */
	void add(ConstraintViolatedInv cons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.exceptions.ConstraintsDiagnostic result = null;\n\n\tthis.setSetConstraints(((kermeta.standard.Bag<kermeta.exceptions.ConstraintViolatedInv>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag())));\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	ConstraintsDiagnostic initialize();

} // ConstraintsDiagnostic
