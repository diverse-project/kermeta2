/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.language.structure;

import kermeta.exceptions.ConstraintsDiagnostic;

import kermeta.persistence.Resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Object#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOid <em>Oid</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getInternalContainingResource <em>Internal Containing Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getObject()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='Object definition: all entities of Kermeta metamodel explicitly inherit from Object'"
 *        annotation="kermeta EMF_needProperty='name=oid javaClass=java.lang.Integer'"
 *        annotation="kermeta EMF_needProperty='name=internalContainingResource classDefinitionQN=kermeta::persistence::Resource'"
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Tag}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Tag#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getObject_Tag()
	 * @see kermeta.language.structure.Tag#getObject
	 * @model opposite="object"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='An Object can be tagged by a Tag. \nThey are typically used to put comments/documentation on the object'"
	 * @generated
	 */
	EList<Tag> getTag();

	/**
	 * Returns the value of the '<em><b>Owned Tags</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tags</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getObject_OwnedTags()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='An object can contains a Tag.  \nBe careful, owning a tag doesn\'t means that the tag applies to the Object\nTo know which Tags apply to the object use the \"tag\" reference'"
	 * @generated
	 */
	EList<Tag> getOwnedTags();

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(Integer)
	 * @see kermeta.language.structure.StructurePackage#getObject_Oid()
	 * @model dataType="kermeta.language.structure.KermetaProperty_Object_oid"
	 * @generated
	 */
	Integer getOid();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(Integer value);

	/**
	 * Returns the value of the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Containing Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Containing Resource</em>' reference.
	 * @see #setInternalContainingResource(Resource)
	 * @see kermeta.language.structure.StructurePackage#getObject_InternalContainingResource()
	 * @model
	 * @generated
	 */
	Resource getInternalContainingResource();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getInternalContainingResource <em>Internal Containing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Containing Resource</em>' reference.
	 * @see #getInternalContainingResource()
	 * @generated
	 */
	void setInternalContainingResource(Resource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Checks a constraint invariant defined for the metaclass of the Object\n\t * You can use PropertyConstraint for checking structural constraints associated to a property\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Integer minusOne = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\tkermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterClassDefinition();\n\n\tjava.lang.Boolean idIfCond_301 = false;\n\tidIfCond_301 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(invariant, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PropertyConstraint\"));\n\n\tif( idIfCond_301 ) {\n\n\tkermeta.language.structure.Property prop = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(invariant, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PropertyConstraint\"))).getProperty();\n\n\tkermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop);\n\n\tjava.lang.Boolean idIfCond_302 = false;\n\tidIfCond_302 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v);\n\n\tif( idIfCond_302 ) {\n\n\tjava.lang.Boolean idIfCond_303 = false;\n\tidIfCond_303 = kermeta.standard.helper.IntegerWrapper.equals(prop.getLower(), 1);\n\n\tif( idIfCond_303 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(this);\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Invariant lower bound of \", cd.getName()), \"_\"), prop.getName()), \"_\"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(prop.getType())), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\te.setFailedConstraint(invariant);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_304 = false;\n\tidIfCond_304 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_304 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> coll = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\")));\n\n\tjava.lang.Boolean idIfCond_305 = false;\n\tidIfCond_305 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(prop.getUpper(), minusOne), kermeta.standard.helper.IntegerWrapper.isGreater(coll.size(), prop.getUpper()));\n\n\tif( idIfCond_305 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(this);\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Invariant upper bound of \", cd.getName()), \"_\"), prop.getName()), \"_\"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(prop.getType())), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\te.setFailedConstraint(invariant);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_306 = false;\n\tidIfCond_306 = kermeta.standard.helper.IntegerWrapper.isLower(coll.size(), prop.getLower());\n\n\tif( idIfCond_306 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(this);\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Invariant lower bound of \", cd.getName()), \"_\"), prop.getName()), \"_\"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(prop.getType())), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\te.setFailedConstraint(invariant);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n}\n\n}\n else {\n\n\t{\ntry {\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariant(this, invariant);\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_1 ) {\nboolean caught_1 = false;\nif( ex_switcher_1.getRealException() instanceof kermeta.exceptions.RuntimeError ) {\ncaught_1 = true;\nkermeta.exceptions.RuntimeError error = (kermeta.exceptions.RuntimeError) ex_switcher_1.getRealException();\nkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));e.setConstraintAppliedTo(this);e.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Invariant violated on \", org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)), \"runtime error (probably due to another failed constraint or an error in the code of the constraint)\"));e.setFailedConstraint(invariant);e.setNestedException(error);\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\nif( !caught_1 ) { throw ex_switcher_1; }\n\n}\n}\n}\n\n'"
	 * @generated
	 */
	void checkInvariant(Constraint invariant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * True if the <code>~property</code> of the object has been set\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isSet(this, property), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSet(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Returns the instances of the given property for this Object.\n\t *\n\t * Example : \n\t * <pre>\n\t * class A { reference attr : String }\n\t * </pre>\n\t * Using A :\n\t * <pre>\n\t * operation getAProp() is do\n\t *    var a : A\n\t *    var s : String\n\t *    var the_attr : Property init self.getMetaClass.ownedAttribute.one\n\t *    s ?= a.get(the_attr)\n\t * end\n\t * </pre>\n\t * The user has to cast\n\t * the result of this method according to the type and the upper multiplicity\n\t * of this property. If upper multiplicity > 1, than the effective type of the \n\t * result is a Sequence<ThePropertyName>. Otherwise, the type corresponds to \n\t * the name of the given Property (i.e the type of the property instance).\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, property);\n\nreturn result;\n'"
	 * @generated
	 */
	Object get(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the current Object is an instance of the given Class\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.equalsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this), cl);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isKindOf(kermeta.language.structure.Class cl);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * semantic equality,\n\t * if you wish to test for object identity you need to use the method oid\n\t * ex: x.oid == y.oid\n\t * by default, (ie. if not overloaded), the equals method for class Object implements \n\t * the most discriminating possible equivalence relation on objects; that is, for any non-null \n\t * reference values x and y, this method returns true if and only if x and y refer to the same \n\t * object (x.oid == y.oid has the value true). \n\t *\n\t * note1: the operator == is mapped to this \n\t * note2: overloading this operation have some impact on the behavior on collection and hashtable that rely on it\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this, element), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta documentation='/**\n\t * Returns the Class object that is the metaclass of current Object\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Class result = null;\n\n\tresult = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass( this ), \"kermeta.language.structure.Class\");\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Class getMetaClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Sets the <code>element</code> to the <code>~property</code> of the object \n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_307 = false;\n\tidIfCond_307 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element, property.getType());\n\n\tif( idIfCond_307 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, element);\n}\n else {\n\n\tkermeta.language.structure.EnumerationLiteral v = null;\n\n\tv = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(element, \"kermeta.language.structure.EnumerationLiteral\");\n\n\tjava.lang.Boolean idIfCond_308 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft74 = null;\n\n\tjava.lang.Boolean idIfCond_309 = false;\n\tidIfCond_309 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(v, null);\n\n\tif( idIfCond_309 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object e_lbdExp74 = null;\n\n\tresult_ft74 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(property.getType(), v.getEnumeration());\n//EIle:right\n\n}\n else {\n\n\tresult_ft74 = false;\n}\n\n\n//CEC\nidIfCond_308 = result_ft74;\n//EIft:andThen\n\n\n\tif( idIfCond_308 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, v);\n}\n else {\n\n\tkermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIncompatibleTypeError()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"IncompatibleTypeError : Cannot set property \", property.getName()), \" of object \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)), \" to \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(element)), \".\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n'"
	 * @generated
	 */
	void set(Property property, Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the Object is currently in a\n\t * frozen state\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isFrozen(this), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFrozen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Runs checking of invariants defined for the metaclass of the Object\n\t * Also check the multiplicity of attributes (except derived and transient attributes)\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterClassDefinition();\n\n\tjava.lang.Boolean idIfCond_310 = false;\n\tidIfCond_310 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd));\n\n\tif( idIfCond_310 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_311 = false;\n\twhile( !idLoopCond_311 ) {\n\tidLoopCond_311 = it_ft75.isOff();\n\tif ( idLoopCond_311 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp75 = it_ft75.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft76 = null;\n\n\tjava.lang.Boolean test_ft76 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(p_lbdExp75.getTag()).iterator();\n\tjava.lang.Boolean idLoopCond_313 = false;\n\twhile( !idLoopCond_313 ) {\n\tidLoopCond_313 = kermeta.standard.helper.BooleanWrapper.or(it_ft76.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft76, false));\n\tif ( idLoopCond_313 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft76 = null;\n//BIle:func\nkermeta.language.structure.Tag t_lbdExp76 = it_ft76.next();\n\n\tresult_lambda_ft76 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp76.getName(), \"ecore.isTransient\");\n//EIle:func\n\n\ttest_ft76 = kermeta.standard.helper.BooleanWrapper.or(test_ft76, result_lambda_ft76);\n}\n\t}\n}\n\n\n\tresult_ft76 = test_ft76;\n//EIft:exists\njava.lang.Boolean idIfCond_312 = false;\n\tidIfCond_312 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft76), kermeta.standard.helper.BooleanWrapper.not(p_lbdExp75.getIsDerived()));\n\n\tif( idIfCond_312 ) {\n\n\tkermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, p_lbdExp75);\n\n\tjava.lang.Boolean idIfCond_314 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft77 = null;\n\n\tjava.lang.Boolean idIfCond_315 = false;\n\tidIfCond_315 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_315 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object f_lbdExp77 = null;\n\n\tresult_ft77 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n//EIle:right\n\n}\n else {\n\n\tresult_ft77 = false;\n}\n\n\n//CEC\nidIfCond_314 = result_ft77;\n//EIft:andThen\n\n\n\tif( idIfCond_314 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\")));\n\n\tjava.lang.Boolean idIfCond_316 = false;\n\tidIfCond_316 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(p_lbdExp75.getUpper(), org.kermeta.compil.runtime.helper.language.ObjectUtil.convertAsObject(kermeta.standard.helper.IntegerWrapper.uminus(1))), kermeta.standard.helper.IntegerWrapper.isGreater(c.size(), p_lbdExp75.getUpper()));\n\n\tif( idIfCond_316 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(((kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Object\"))));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv upper bound of \", cd.getName()), \".\"), p_lbdExp75.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_317 = false;\n\tidIfCond_317 = kermeta.standard.helper.IntegerWrapper.isLower(c.size(), p_lbdExp75.getLower());\n\n\tif( idIfCond_317 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(((kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Object\"))));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp75.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_318 = false;\n\tidIfCond_318 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.equals(p_lbdExp75.getLower(), 1), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_318 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setConstraintAppliedTo(((kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Object\"))));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp75.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariants(this);\n'"
	 * @generated
	 */
	void checkInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * code used in hashtable in order to identify an object in the hashtable keys\n\t * This system is similar to the hashcode used in java. Please refer to java documentation\n\t * for more information about hashcode\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.hashcode(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer hashcode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta documentation='/**\n\t * Checks all the invariants for this object and return a complete diagnostic.\n\t * This also includes the structural constraints associated to the properties.\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.exceptions.ConstraintsDiagnostic result = null;\n\n\tkermeta.exceptions.ConstraintsDiagnostic contraintes = ((kermeta.exceptions.ConstraintsDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintsDiagnostic())).initialize();\n\n\tkermeta.language.structure.ClassDefinition cd = null;\n\n\tcd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterClassDefinition();\n\n\tjava.lang.Boolean idIfCond_319 = false;\n\tidIfCond_319 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd));\n\n\tif( idIfCond_319 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_320 = false;\n\twhile( !idLoopCond_320 ) {\n\tidLoopCond_320 = it_ft78.isOff();\n\tif ( idLoopCond_320 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint invariant_lbdExp78 = it_ft78.next();\ntry {\n\tthis.checkInvariant(invariant_lbdExp78);\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_2 ) {\nboolean caught_2 = false;\nif( ex_switcher_2.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv ) {\ncaught_2 = true;\nkermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_2.getRealException();\norg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"    \", e.getMessage()));contraintes.add(e);\n}\nif( !caught_2 ) { throw ex_switcher_2; }\n\n}\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft79 = cd.getCachedAllAttribute().iterator();\n\tjava.lang.Boolean idLoopCond_321 = false;\n\twhile( !idLoopCond_321 ) {\n\tidLoopCond_321 = it_ft79.isOff();\n\tif ( idLoopCond_321 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp79 = it_ft79.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft80 = null;\n\n\tjava.lang.Boolean test_ft80 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(prop_lbdExp79.getTag()).iterator();\n\tjava.lang.Boolean idLoopCond_323 = false;\n\twhile( !idLoopCond_323 ) {\n\tidLoopCond_323 = kermeta.standard.helper.BooleanWrapper.or(it_ft80.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft80, false));\n\tif ( idLoopCond_323 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft80 = null;\n//BIle:func\nkermeta.language.structure.Tag t_lbdExp80 = it_ft80.next();\n\n\tresult_lambda_ft80 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp80.getName(), \"ecore.isTransient\");\n//EIle:func\n\n\ttest_ft80 = kermeta.standard.helper.BooleanWrapper.or(test_ft80, result_lambda_ft80);\n}\n\t}\n}\n\n\n\tresult_ft80 = test_ft80;\n//EIft:exists\njava.lang.Boolean idIfCond_322 = false;\n\tidIfCond_322 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft80), kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp79.getIsDerived()));\n\n\tif( idIfCond_322 ) {\n\n\tkermeta.language.structure.PropertyConstraint constraint = prop_lbdExp79.getPropertyConstraint();\n\n\tjava.lang.Boolean idIfCond_324 = false;\n\tidIfCond_324 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(constraint);\n\n\tif( idIfCond_324 ) {\n\n\tconstraint = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getPropertyConstraint()));\n\n\tjava.lang.Boolean idIfCond_325 = false;\n\tidIfCond_325 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(prop_lbdExp79.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_325 ) {\n\n\tconstraint.setName(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(cd.getName(), \"_\"), prop_lbdExp79.getName()), \"_\"), ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(prop_lbdExp79.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().getName()));\n}\n else {\n\n\tconstraint.setName(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(cd.getName(), \"_\"), prop_lbdExp79.getName()), \"_\"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(prop_lbdExp79.getType())));\n}\n\n\n\tconstraint.setProperty(prop_lbdExp79);\n}\n\n\n\t{\ntry {\n\tthis.checkInvariant(constraint);\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_3 ) {\nboolean caught_3 = false;\nif( ex_switcher_3.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv ) {\ncaught_3 = true;\nkermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_3.getRealException();\ncontraintes.add(e);\n}\nif( !caught_3 ) { throw ex_switcher_3; }\n\n}\n}\n\n\tjava.lang.Boolean idIfCond_326 = false;\n\tidIfCond_326 = kermeta.standard.helper.BooleanWrapper.and(prop_lbdExp79.getIsComposite(), prop_lbdExp79.getViolatedConstraintsMustDrillDown());\n\n\tif( idIfCond_326 ) {\n\n\tkermeta.language.structure.Object propValue = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp79);\n\n\tjava.lang.Boolean idIfCond_327 = false;\n\tidIfCond_327 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(propValue));\n\n\tif( idIfCond_327 ) {\n\n\tjava.lang.Boolean idIfCond_328 = false;\n\tidIfCond_328 = kermeta.standard.helper.IntegerWrapper.equals(prop_lbdExp79.getUpper(), 1);\n\n\tif( idIfCond_328 ) {\n\n\tjava.lang.Boolean idIfCond_329 = false;\n\tidIfCond_329 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(propValue, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.EnumerationLiteral\")));\n\n\tif( idIfCond_329 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft81 = propValue.getViolatedConstraints().getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_330 = false;\n\twhile( !idLoopCond_330 ) {\n\tidLoopCond_330 = it_ft81.isOff();\n\tif ( idLoopCond_330 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.exceptions.ConstraintViolatedInv v_lbdExp81 = it_ft81.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"    \", v_lbdExp81.getMessage()));\n\n\tcontraintes.add(v_lbdExp81);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;\n\n\tsubObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(propValue, \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft82 = subObjInstances.iterator();\n\tjava.lang.Boolean idLoopCond_331 = false;\n\twhile( !idLoopCond_331 ) {\n\tidLoopCond_331 = it_ft82.isOff();\n\tif ( idLoopCond_331 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object aSubObjInstance_lbdExp82 = it_ft82.next();\n\n\tjava.lang.Boolean idIfCond_332 = false;\n\tidIfCond_332 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(aSubObjInstance_lbdExp82, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.EnumerationLiteral\")));\n\n\tif( idIfCond_332 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft83 = aSubObjInstance_lbdExp82.getViolatedConstraints().getSetConstraints().iterator();\n\tjava.lang.Boolean idLoopCond_333 = false;\n\twhile( !idLoopCond_333 ) {\n\tidLoopCond_333 = it_ft83.isOff();\n\tif ( idLoopCond_333 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.exceptions.ConstraintViolatedInv v_lbdExp83 = it_ft83.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"    \", v_lbdExp83.getMessage()));\n\n\tcontraintes.add(v_lbdExp83);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = contraintes;\n\nreturn result;\n'"
	 * @generated
	 */
	ConstraintsDiagnostic getViolatedConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the Object is Void\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * See kermeta::language::structure::Object.equals(Object)\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this, element));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNotEqual(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Freeze the Object\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);\n'"
	 * @generated
	 */
	void freeze();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns the Object that contains current Object, void if the Object has\n\t * no container\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Object container();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Remove the element set as the <code>~property</code> of the object.\n\t * The <code>isSet(~property)</code> method will then return False\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this, property);\n'"
	 * @generated
	 */
	void unset(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Returns the unique Oid of the Object\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getOID(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer oid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns the Resource currently containing (directly or indirectly) the Object \n\t * or void if the object belongs to no Resource\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\tresult = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getContainingResource(this), \"kermeta.persistence.Resource\");\n\nreturn result;\n'"
	 * @generated
	 */
	Resource containingResource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the current Object conforms to given Type\n\t * This means: is this object an instance of this type, or is it an instance of its subtype \n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, type.getClass().getName()), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstanceOf(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Implementation of OCL like cast. It returns self if the object object conforms to the type given as parameter.\n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta WrapperValueTypeSelfExpression='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_334 = false;\n\tidIfCond_334 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, type);\n\n\tif( idIfCond_334 ) {\n\n\tresult = this;\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getTypeCastError())) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object asType(kermeta.language.structure.Class type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Recursively runs checking of invariants defined for the metaclass of the Object\n\t * and its supertypes\n\t * Ignores derived attributes. \n\t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_335 = false;\n\tidIfCond_335 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this, null);\n\n\tif( idIfCond_335 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariantsSwitcher(this);\n\n\tkermeta.language.structure.ClassDefinition cd = null;\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft84 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_336 = false;\n\twhile( !idLoopCond_336 ) {\n\tidLoopCond_336 = it_ft84.isOff();\n\tif ( idLoopCond_336 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp84 = it_ft84.next();\n\n\tjava.lang.Boolean idIfCond_337 = false;\n\tidIfCond_337 = kermeta.standard.helper.BooleanWrapper.and(prop_lbdExp84.getIsComposite(), kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp84.getIsDerived()));\n\n\tif( idIfCond_337 ) {\n\n\tjava.lang.Boolean idIfCond_338 = false;\n\tidIfCond_338 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp84)));\n\n\tif( idIfCond_338 ) {\n\n\tjava.lang.Boolean idIfCond_339 = false;\n//BIft:exists\n\njava.lang.Boolean result_ft85 = null;\n\n\tjava.lang.Boolean test_ft85 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft85 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp84)).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_340 = false;\n\twhile( !idLoopCond_340 ) {\n\tidLoopCond_340 = kermeta.standard.helper.BooleanWrapper.or(it_ft85.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft85, false));\n\tif ( idLoopCond_340 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft85 = null;\n//BIle:func\nkermeta.language.structure.Type t_lbdExp85 = it_ft85.next();\n\n\tjava.lang.Boolean idIfCond_341 = false;\n\tidIfCond_341 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp85, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_341 ) {\n\n\tresult_lambda_ft85 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp85, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), \"kermeta::standard::Collection\");\n}\n else {\n\n\tresult_lambda_ft85 = false;\n}\n\n//EIle:func\n\n\ttest_ft85 = kermeta.standard.helper.BooleanWrapper.or(test_ft85, result_lambda_ft85);\n}\n\t}\n}\n\n\n\tresult_ft85 = test_ft85;\n\n//CEC\nidIfCond_339 = result_ft85;\n//EIft:exists\n\n\n\tif( idIfCond_339 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;\n\n\tsubObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp84), \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft86 = subObjInstances.iterator();\n\tjava.lang.Boolean idLoopCond_342 = false;\n\twhile( !idLoopCond_342 ) {\n\tidLoopCond_342 = it_ft86.isOff();\n\tif ( idLoopCond_342 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object aSubObjInstances_lbdExp86 = it_ft86.next();\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp86);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp84));\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void checkAllInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n \t * Implements Object.toString()\n \t * Returns a String of form [qn:oid] where \'qn\' is the qualified name of\n \t * the object type, and oid the unique ID of the object\n \t \052/'"
	 *        annotation="kermeta CompilerIgnore='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"[\", org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition().qualifiedName()), \":\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(this))), \"]\");\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

} // Object
