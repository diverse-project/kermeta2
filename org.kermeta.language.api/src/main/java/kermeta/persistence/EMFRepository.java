/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.persistence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.persistence.EMFRepository#getUseInterpreterInternalResources <em>Use Interpreter Internal Resources</em>}</li>
 *   <li>{@link kermeta.persistence.EMFRepository#getIgnoreLoadErrorUnknownMetaclass <em>Ignore Load Error Unknown Metaclass</em>}</li>
 *   <li>{@link kermeta.persistence.EMFRepository#getIgnoreAllLoadErrors <em>Ignore All Load Errors</em>}</li>
 *   <li>{@link kermeta.persistence.EMFRepository#getIgnoreLoadErrorUnknownProperty <em>Ignore Load Error Unknown Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.persistence.PersistencePackage#getEMFRepository()
 * @model annotation="kermeta documentation='/**\n * Repository that stores and manages resources that come from EMF\n \052/'"
 *        annotation="kermeta CompilerIgnore='true'"
 * @generated
 */
public interface EMFRepository extends Repository {
	/**
	 * Returns the value of the '<em><b>Use Interpreter Internal Resources</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Interpreter Internal Resources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Interpreter Internal Resources</em>' attribute.
	 * @see #setUseInterpreterInternalResources(Boolean)
	 * @see kermeta.persistence.PersistencePackage#getEMFRepository_UseInterpreterInternalResources()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/** \n\t * If true, tells to the save of the resources that they should also integrate the resources from Kermeta interpreter itself\n\t * this is useful for example to make a dependency to framework.km\n\t * by default, not setting this is considered as false.\n\t \052/'"
	 * @generated
	 */
	Boolean getUseInterpreterInternalResources();

	/**
	 * Sets the value of the '{@link kermeta.persistence.EMFRepository#getUseInterpreterInternalResources <em>Use Interpreter Internal Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Interpreter Internal Resources</em>' attribute.
	 * @see #getUseInterpreterInternalResources()
	 * @generated
	 */
	void setUseInterpreterInternalResources(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Load Error Unknown Metaclass</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Load Error Unknown Metaclass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Load Error Unknown Metaclass</em>' attribute.
	 * @see #setIgnoreLoadErrorUnknownMetaclass(Boolean)
	 * @see kermeta.persistence.PersistencePackage#getEMFRepository_IgnoreLoadErrorUnknownMetaclass()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * When loading the Resources, \n\t * if there are some errors due to an unknown metaclass while loading some objects, the loader try to ignore them\n\t * by default, not setting this attribute is considered as false.\n\t \052/'"
	 * @generated
	 */
	Boolean getIgnoreLoadErrorUnknownMetaclass();

	/**
	 * Sets the value of the '{@link kermeta.persistence.EMFRepository#getIgnoreLoadErrorUnknownMetaclass <em>Ignore Load Error Unknown Metaclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Load Error Unknown Metaclass</em>' attribute.
	 * @see #getIgnoreLoadErrorUnknownMetaclass()
	 * @generated
	 */
	void setIgnoreLoadErrorUnknownMetaclass(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore All Load Errors</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore All Load Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore All Load Errors</em>' attribute.
	 * @see #setIgnoreAllLoadErrors(Boolean)
	 * @see kermeta.persistence.PersistencePackage#getEMFRepository_IgnoreAllLoadErrors()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * When loading the Resources, \n\t * if there are some errors while loading some objects, the loader can try to ignore them\n\t * setting this attribute to true is equivalent to setting ignoreLoadErrorUnknownMetaclass and ignoreLoadErrorUnknownProperty to true\n\t * by default, not setting this attribute is considered as false.\n\t \052/'"
	 * @generated
	 */
	Boolean getIgnoreAllLoadErrors();

	/**
	 * Sets the value of the '{@link kermeta.persistence.EMFRepository#getIgnoreAllLoadErrors <em>Ignore All Load Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore All Load Errors</em>' attribute.
	 * @see #getIgnoreAllLoadErrors()
	 * @generated
	 */
	void setIgnoreAllLoadErrors(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Load Error Unknown Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Load Error Unknown Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Load Error Unknown Property</em>' attribute.
	 * @see #setIgnoreLoadErrorUnknownProperty(Boolean)
	 * @see kermeta.persistence.PersistencePackage#getEMFRepository_IgnoreLoadErrorUnknownProperty()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * When loading the Resources, \n\t * if there are some errors due to an unknown property while loading some objects (ie. the metaclass is known but it cannot retreive\n\t * the given reference or attribute in the ClassDefinition, the loader try to ignore them\n\t * by default, not setting this attribute is considered as false.\n\t \052/'"
	 * @generated
	 */
	Boolean getIgnoreLoadErrorUnknownProperty();

	/**
	 * Sets the value of the '{@link kermeta.persistence.EMFRepository#getIgnoreLoadErrorUnknownProperty <em>Ignore Load Error Unknown Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Load Error Unknown Property</em>' attribute.
	 * @see #getIgnoreLoadErrorUnknownProperty()
	 * @generated
	 */
	void setIgnoreLoadErrorUnknownProperty(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="kermeta.standard.JavaString" mm_uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Overrides Repository.createResource(String, String)\n\t * Create a new resource for a model given by its uri, \n\t * which meta-model is stored in file given by mm_uri\n\t * If file already exists, you\'ll be able to call the load method to concretly load the model\n\t * otherwise, you can only call the save method\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::persistence::Repository'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\t//BIft:collect\n\nkermeta.standard.Sequence<java.lang.String> result_ft78 = null;\n\n\tresult_ft78 = ((kermeta.standard.Sequence<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.persistence.Resource> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.persistence.Resource>convertAsSet(this.getResources()).iterator();\n\tjava.lang.Boolean idLoopCond_325 = false;\n\twhile( !idLoopCond_325 ) {\n\tidLoopCond_325 = it_ft78.isOff();\n\tif ( idLoopCond_325 ) {\n\t} else {\n\njava.lang.String result_lambda_ft78 = null;\n//BIle:collector\nkermeta.persistence.Resource r_lbdExp78 = it_ft78.next();\n\n\tresult_lambda_ft78 = r_lbdExp78.getUri();\n//EIle:collector\n\n\tresult_ft78.add(result_lambda_ft78);\n}\n\t}\n}\n\n//EIft:collect\njava.lang.Boolean idIfCond_324 = false;\n\tidIfCond_324 = kermeta.standard.helper.BooleanWrapper.not(result_ft78.contains(uri));\n\n\tif( idIfCond_324 ) {\n\n\tresult = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.createResource(this, uri, mm_uri), \"kermeta.persistence.Resource\");\n}\n else {\n\n\tkermeta.exceptions.ResourceCreateException e = ((kermeta.exceptions.ResourceCreateException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getResourceCreateException()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Trying to create a resource already existing at \", uri), \".\\n\"), \"Remove existing resource from repository first, or use \\\"getResource\\\" operation.\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Resource createResource(String uri, String mm_uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mm_uriDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t  * Register the content of the given ecore file into EMF registry\n\t  * Once registered, EMF will be able to load and save models conformant to this ecore file\n\t  * Warning: if the NSURI you wish to register is already, registered (either statically or due to a previous call)\n\t  *  it will do nothing. Ie. modification in the ecore file will not be taken into account unless you manually unregister it.\t    \n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.RepositoryUtil.registerEcoreFile(mm_uri);\n'"
	 * @generated
	 */
	void registerEcoreFile(String mm_uri);

} // EMFRepository
