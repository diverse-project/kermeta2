/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaNewFileContentProvider {
	
	public org.kermeta.language.emftexteditor.IKermetaMetaInformation getMetaInformation() {
		return new org.kermeta.language.emftexteditor.mopp.KermetaMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getModelingUnit(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getModel(),
			org.kermeta.language.structure.StructurePackage.eINSTANCE.getMultiplicityElement(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new org.kermeta.language.emftexteditor.util.KermetaMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		org.kermeta.language.emftexteditor.IKermetaTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			org.kermeta.language.emftexteditor.mopp.KermetaPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new org.kermeta.language.emftexteditor.mopp.KermetaResource());
	}
	
}
