/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

// An element that is expected at a given position in a resource
// stream.
public interface IKermetaExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(org.kermeta.language.emftexteditor.IKermetaExpectedElement follower);
	public java.util.Collection<org.kermeta.language.emftexteditor.IKermetaExpectedElement> getFollowers();
}
