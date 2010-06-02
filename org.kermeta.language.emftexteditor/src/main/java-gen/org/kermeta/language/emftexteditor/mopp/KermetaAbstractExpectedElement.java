/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class KermetaAbstractExpectedElement implements org.kermeta.language.emftexteditor.IKermetaExpectedElement {
	
	private java.util.Set<org.kermeta.language.emftexteditor.IKermetaExpectedElement> followers = new java.util.LinkedHashSet<org.kermeta.language.emftexteditor.IKermetaExpectedElement>();
	
	public KermetaAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(org.kermeta.language.emftexteditor.IKermetaExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<org.kermeta.language.emftexteditor.IKermetaExpectedElement> getFollowers() {
		return followers;
	}
	
}
