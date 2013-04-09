/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaLayoutInformationAdapter implements org.eclipse.emf.common.notify.Adapter {
	
	private org.eclipse.emf.common.notify.Notifier target;
	private java.util.List<org.kermeta.language.emftexteditor.mopp.KermetaLayoutInformation> layoutInformations = new java.util.ArrayList<org.kermeta.language.emftexteditor.mopp.KermetaLayoutInformation>();
	
	public org.eclipse.emf.common.notify.Notifier getTarget() {
		return target;
	}
	
	public boolean isAdapterForType(java.lang.Object type) {
		return false;
	}
	
	public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
	}
	
	public void setTarget(org.eclipse.emf.common.notify.Notifier newTarget) {
		this.target = newTarget;
	}
	
	public java.util.List<org.kermeta.language.emftexteditor.mopp.KermetaLayoutInformation> getLayoutInformations() {
		return layoutInformations;
	}
	
	public void addLayoutInformation(org.kermeta.language.emftexteditor.mopp.KermetaLayoutInformation layoutInformation) {
		layoutInformations.add(layoutInformation);
	}
	
	public void replaceProxy(org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (org.kermeta.language.emftexteditor.mopp.KermetaLayoutInformation layoutInformation : layoutInformations) {
			layoutInformation.replaceProxy(proxy, target);
		}
	}
	
}
