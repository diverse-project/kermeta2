/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

public interface IKermetaBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.kermeta.language.emftexteditor.mopp.KermetaResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
