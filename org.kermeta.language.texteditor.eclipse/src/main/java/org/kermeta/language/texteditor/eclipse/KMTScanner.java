package org.kermeta.language.texteditor.eclipse;

import org.eclipse.jface.text.rules.*;
import org.eclipse.jface.text.*;

public class KMTScanner implements ITokenScanner {

	public KMTScanner(ColorManager manager) {
		IToken procInstr =
			new Token(
				new TextAttribute(
					manager.getColor(IKMTColorConstants.PROC_INSTR)));

		/*IRule[] rules = new IRule[2];
		//Add rule for processing instructions
		rules[0] = new SingleLineRule("<?", "?>", procInstr);
		// Add generic whitespace rule.
		rules[1] = new WhitespaceRule(new XMLWhitespaceDetector());

		setRules(rules);*/
	}

	@Override
	public int getTokenLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTokenOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IToken nextToken() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRange(IDocument document, int offset, int length) {
		// TODO Auto-generated method stub
		
	}
}
