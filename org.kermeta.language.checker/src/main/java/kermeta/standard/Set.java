/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kermeta.standard;

import java.lang.Boolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getSet()
 * @model annotation="kermeta documentation='/**\n * A Set is a non-ordered collection that contains distinct elements\n * (with regards to the G.equals(Object) operation)\n \052/'"
 *        annotation="kermeta CompilerIgnore='true'"
 * @generated
 */
public interface Set<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set corresponding to the intersection of the Set elements\n\t * with the current Set\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_231 = false;\n\twhile( !idLoopCond_231 ) {\n\tidLoopCond_231 = it.isOff();\n\tif ( idLoopCond_231 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_232 = false;\n\tidIfCond_232 = elements.contains(elem);\n\n\tif( idIfCond_232 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersection(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set corresponding to the difference between the\n\t * current Set and the Set elements, ie all elements contained by \n\t * the current Set that do not appear in the elements Set \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_233 = false;\n\twhile( !idLoopCond_233 ) {\n\tidLoopCond_233 = it.isOff();\n\tif ( idLoopCond_233 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_234 = false;\n\tidIfCond_234 = kermeta.standard.helper.BooleanWrapper.not(elements.contains(elem));\n\n\tif( idIfCond_234 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> minus(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.remove(G)\n\t * Removes the element from the Set if it is contained by the Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft60 = null;\n\n\tG elem_ft60 = null;\n\n\tresult_ft60 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft60 = this.iterator();\n\tjava.lang.Boolean idLoopCond_235 = false;\n\twhile( !idLoopCond_235 ) {\n\tidLoopCond_235 = kermeta.standard.helper.BooleanWrapper.or(it_ft60.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft60, null));\n\tif ( idLoopCond_235 ) {\n\t} else {\n\n\telem_ft60 = it_ft60.next();\n\n\tjava.lang.Boolean idIfCond_236 = false;\n//BIle:detector\nG e_lbdExp60 = elem_ft60;\n\n\tidIfCond_236 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp60, element);\n//EIle:detector\n\n\n\tif( idIfCond_236 ) {\n\n\tresult_ft60 = elem_ft60;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft60;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_237 = false;\n\tidIfCond_237 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_237 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Overrides Object.equals(Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_238 = false;\n\tidIfCond_238 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element));\n\n\tif( idIfCond_238 ) {\n\n\tjava.lang.Boolean idIfCond_239 = false;\n\tidIfCond_239 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_239 ) {\n\n\tkermeta.standard.Collection<G> collection = null;\n\n\tcollection = (kermeta.standard.Collection<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(element, \"kermeta.standard.Collection<G>\");\n\n\tjava.lang.Boolean idIfCond_240 = false;\n\tidIfCond_240 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), collection.size());\n\n\tif( idIfCond_240 ) {\n\n\tG elem = null;\n\n\tjava.lang.Boolean ok = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_241 = false;\n\twhile( !idLoopCond_241 ) {\n\tidLoopCond_241 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(ok));\n\tif ( idLoopCond_241 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_242 = false;\n\tidIfCond_242 = kermeta.standard.helper.BooleanWrapper.not(collection.contains(elem));\n\n\tif( idIfCond_242 ) {\n\n\tok = false;\n}\n\n}\n\t}\n}\n\n\n\tisEqual = ok;\n}\n\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.add(G)\n\t * Adds elt to the Set if it is not already contained by the\n\t * Set, does nothing otherwise\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_243 = false;\n\tidIfCond_243 = kermeta.standard.helper.BooleanWrapper.not(this.contains(element));\n\n\tif( idIfCond_243 ) {\n\n\tsuper.add(element);\n}\n\n'"
	 * @generated
	 */
	void add(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asSequence()\n\t * Returns a new Sequence composed of all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tkermeta.standard.Sequence<G> s = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a ordered set of the bag elements sorted using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t \052/'"
	 *        annotation="kermeta documentation='/**\n\t * Recursive sort of the given (ordered) set using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t \052/'"
	 *        annotation="kermeta documentation='/**\n\t * Internal concatenation tool for recursive \'quickSort()\' method\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\tresult.addAll(less);\n\n\tresult.addAll(pivot);\n\n\tresult.addAll(greater);\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> concatenate(OrderedSet<G> less, OrderedSet<G> pivot,
			OrderedSet<G> greater);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set which contents corresponds to the symmetric\n\t * difference between current Set and Set s, ie all elements of\n\t * each Set that do not appear in the other one\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> res = s.minus(this);\n\n\tresult = this.minus(s);\n\n\tresult.addAll(res);\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> symmetricDifference(Set<G> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set which content includes all non-Collection elements\n\t * of the current Set, and, for each Collection element of the current\n\t * Set, as many elements as the Collection contains\n\t * Duplicates are removed\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tjava.lang.Boolean idIfCond_244 = false;\n\tidIfCond_244 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_244 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft61 = this.iterator();\n\tjava.lang.Boolean idLoopCond_245 = false;\n\twhile( !idLoopCond_245 ) {\n\tidLoopCond_245 = it_ft61.isOff();\n\tif ( idLoopCond_245 ) {\n\t} else {\n\n\t//BIle:func\nG e_lbdExp61 = it_ft61.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(e_lbdExp61, \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\tres.addAll(col);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<kermeta.language.structure.Object> flatten();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asOrderedSet()\n\t * Returns a new OrderedSet that contains all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tkermeta.standard.OrderedSet<G> s = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asBag()\n\t * Returns a new Bag composed of all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set corresponding to the union of the Set elements\n\t * with the current Set\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tresult.addAll(this);\n\n\tresult.addAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> union(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asSet()\n\t * Returns a new Set composed of all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> asSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Bag corresponding to the union of the Bag elements\n\t * with the current Set\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\tresult.addAll(this);\n\n\tresult.addAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> unionWithBag(Bag<G> elements);

} // Set
