/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.language.emftexteditor.mopp;

public class KermetaTokenStyleInformationProvider {
	
	public class TokenStyleImpl implements org.kermeta.language.emftexteditor.IKermetaTokenStyle {
		
		private int[] color;
		private boolean bold;
		private boolean italic;
		private boolean strikethrough;
		private boolean underline;
		
		public TokenStyleImpl(int[] color, boolean bold, boolean italic, boolean striketrough, boolean underline) {
			super();
			this.color = color;
			this.bold = bold;
			this.italic = italic;
			this.strikethrough = striketrough;
			this.underline = underline;
		}
		
		public int[] getColorAsRGB() {
			return color;
		}
		
		public boolean isBold() {
			return bold;
		}
		
		public boolean isItalic() {
			return italic;
		}
		
		public boolean isStrikethrough() {
			return strikethrough;
		}
		
		public boolean isUnderline() {
			return underline;
		}
	}
	
	public org.kermeta.language.emftexteditor.IKermetaTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		if ("SL_COMMENT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x34, 0x80, 0x17}, false, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x34, 0x80, 0x17}, false, false, false, false);
		}
		if ("STRING_LITERAL".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x66, 0x98, 0xFF}, false, false, false, false);
		}
		if ("package".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("class".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("operation".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("aspect".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("is".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("do".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("end".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("raise".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("rescue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("init".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("var".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("from".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("until".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("loop".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("if".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("then".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("else".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("enumeration".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("attribute".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("kermeta".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x00, 0x00}, false, false, false, false);
		}
		if (":".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x00, 0x00}, false, false, false, false);
		}
		if ("::".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x00, 0x00}, false, false, false, false);
		}
		if ("using".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("require".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("abstract".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("inherits".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("reference".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("property".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("getter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("setter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Void".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Object".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("tag".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ownedTags".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Model".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ModelType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("typeContainer".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("includedTypeDefinition".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("TypeVariableBinding".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("containedType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("variable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("type".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("MultiplicityElement".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("lower".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("upper".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("TypeDefinition".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Tag".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("value".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("object".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectTypeVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("supertype".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ModelTypeVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("virtualType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("VirtualType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("classDefinition".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("modelType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("typeParamBinding".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ProductType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("FunctionType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("left".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("right".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("result".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("super".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("self".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("-".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("extern".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("EmptyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("staticType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("LambdaExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("parameters".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("body".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("LambdaParameter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x2A, 0x00, 0xFF}, false, false, false, false);
		}
		return null;
	}
	
}
