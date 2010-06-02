/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

// java.lang.Exception class to represent invalid content types for parser instances.
//
// @see org.kermeta.language.emftexteditor.IKermetaOptions.RESOURCE_CONTENT_TYPE
public class KermetaUnexpectedContentTypeException extends org.antlr.runtime.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  KermetaUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
}
