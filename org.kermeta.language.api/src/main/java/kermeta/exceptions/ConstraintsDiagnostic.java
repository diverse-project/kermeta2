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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t//BIft:collect\n\nkermeta.standard.Sequence<kermeta.persistence.EMFResource> result_ft91 = null;\n\n\tresult_ft91 = ((kermeta.standard.Sequence<kermeta.persistence.EMFResource>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft91 = this.getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_352 = false;\n\twhile( !idLoopCond_352 ) {\n\tidLoopCond_352 = it_ft91.isOff();\n\tif ( idLoopCond_352 ) {\n\t} else {\n\nkermeta.persistence.EMFResource result_lambda_ft91 = null;\n//BIle:collector\nkermeta.exceptions.ConstraintViolatedInv constraint_lbdExp91 = it_ft91.next();\n\n\tresult_lambda_ft91 = ((kermeta.persistence.EMFResource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containingResourceSwitcher(constraint_lbdExp91.getConstraintAppliedTo()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.persistence.EMFResource\")));\n//EIle:collector\n\n\tresult_ft91.add(result_lambda_ft91);\n}\n\t}\n}\n\n//EIft:collect\n\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.EMFResource> it_ft90 = result_ft91.asSet().iterator();\n\tjava.lang.Boolean idLoopCond_353 = false;\n\twhile( !idLoopCond_353 ) {\n\tidLoopCond_353 = it_ft90.isOff();\n\tif ( idLoopCond_353 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.persistence.EMFResource resource_lbdExp90 = it_ft90.next();\n\n\tresource_lbdExp90.clean();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft92 = this.getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_354 = false;\n\twhile( !idLoopCond_354 ) {\n\tidLoopCond_354 = it_ft92.isOff();\n\tif ( idLoopCond_354 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.exceptions.ConstraintViolatedInv c_lbdExp92 = it_ft92.next();\n\n\tkermeta.persistence.EMFResource resource = ((kermeta.persistence.EMFResource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containingResourceSwitcher(c_lbdExp92.getConstraintAppliedTo()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.persistence.EMFResource\")));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(c_lbdExp92.getMessage(), \" in file \"), resource.getUri()));\n\n\tresource.mark(c_lbdExp92.getMessage());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
