/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IKermetaExpectedElement {
	
	public java.lang.String getTokenName();
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	public void addFollower(org.kermeta.language.emftexteditor.IKermetaExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	public java.util.Collection<org.kermeta.language.emftexteditor.util.KermetaPair<org.kermeta.language.emftexteditor.IKermetaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
}
