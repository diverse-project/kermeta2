/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaBracketInformationProvider {
	
	public class BracketPair implements org.kermeta.language.emftexteditor.IKermetaBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.kermeta.language.emftexteditor.IKermetaBracketPair> getBracketPairs() {
		java.util.Collection<org.kermeta.language.emftexteditor.IKermetaBracketPair> result = new java.util.ArrayList<org.kermeta.language.emftexteditor.IKermetaBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}
