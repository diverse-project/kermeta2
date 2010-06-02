/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaProblem implements org.kermeta.language.emftexteditor.IKermetaProblem {
	
	private java.lang.String message;
	private org.kermeta.language.emftexteditor.KermetaEProblemType type;
	
	public KermetaProblem(java.lang.String message, org.kermeta.language.emftexteditor.KermetaEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public org.kermeta.language.emftexteditor.KermetaEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
