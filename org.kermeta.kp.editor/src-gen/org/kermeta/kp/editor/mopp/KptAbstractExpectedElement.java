/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class KptAbstractExpectedElement implements org.kermeta.kp.editor.IKptExpectedElement {
	
	private java.util.Set<org.kermeta.kp.editor.IKptExpectedElement> followers = new java.util.LinkedHashSet<org.kermeta.kp.editor.IKptExpectedElement>();
	
	public KptAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(org.kermeta.kp.editor.IKptExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKptExpectedElement> getFollowers() {
		return followers;
	}
	
}
