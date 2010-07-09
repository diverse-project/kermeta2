/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class KermetaAbstractExpectedElement implements org.kermeta.language.emftexteditor.IKermetaExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<org.kermeta.language.emftexteditor.util.KermetaPair<org.kermeta.language.emftexteditor.IKermetaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<org.kermeta.language.emftexteditor.util.KermetaPair<org.kermeta.language.emftexteditor.IKermetaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public KermetaAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.kermeta.language.emftexteditor.IKermetaExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new org.kermeta.language.emftexteditor.util.KermetaPair<org.kermeta.language.emftexteditor.IKermetaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.kermeta.language.emftexteditor.util.KermetaPair<org.kermeta.language.emftexteditor.IKermetaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
