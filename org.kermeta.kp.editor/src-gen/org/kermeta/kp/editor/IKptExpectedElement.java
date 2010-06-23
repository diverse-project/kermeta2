/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

// An element that is expected at a given position in a resource
// stream.
public interface IKptExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(org.kermeta.kp.editor.IKptExpectedElement follower);
	public java.util.Collection<org.kermeta.kp.editor.IKptExpectedElement> getFollowers();
}
