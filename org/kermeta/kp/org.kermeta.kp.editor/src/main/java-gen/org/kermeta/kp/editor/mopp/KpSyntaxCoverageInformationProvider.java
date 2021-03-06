/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(),
			org.kermeta.kp.KpPackage.eINSTANCE.getPackageEquivalence(),
			org.kermeta.kp.KpPackage.eINSTANCE.getImportFile(),
			org.kermeta.kp.KpPackage.eINSTANCE.getImportProject(),
			org.kermeta.kp.KpPackage.eINSTANCE.getImportProjectSources(),
			org.kermeta.kp.KpPackage.eINSTANCE.getReusableResource(),
			org.kermeta.kp.KpPackage.eINSTANCE.getRequiredType(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(),
		};
	}
	
}
