/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor;

/**
 * A token that is returned by ITextLexer instances. Each token has a name, a
 * length and is found at a certain offset in a document.
 */
public interface IKermetaTextToken {
	
	/**
	 * Returns the name (i.e., the type) of this token.
	 */
	public String getName();
	
	/**
	 * Returns the offset at which the token was found in the document.
	 */
	public int getOffset();
	
	/**
	 * Returns the length of this token.
	 */
	public int getLength();
	
	/**
	 * Returns false if the token is not usable for syntax highlighting. The EOF (End
	 * of File) token is an example for such a token.
	 */
	public boolean canBeUsedForSyntaxHighlighting();
	
	/**
	 * Returns the text of this token
	 */
	public String getText();
	
}
