/*
* generated by Xtext
*/
package org.kermeta.language.sample.logo.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.kermeta.language.sample.logo.services.LogoTextualSyntaxGrammarAccess;

public class LogoTextualSyntaxParser extends AbstractContentAssistParser {
	
	@Inject
	private LogoTextualSyntaxGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.kermeta.language.sample.logo.ui.contentassist.antlr.internal.InternalLogoTextualSyntaxParser createParser() {
		org.kermeta.language.sample.logo.ui.contentassist.antlr.internal.InternalLogoTextualSyntaxParser result = new org.kermeta.language.sample.logo.ui.contentassist.antlr.internal.InternalLogoTextualSyntaxParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getBInstructionAccess().getAlternatives(), "rule__BInstruction__Alternatives");
					put(grammarAccess.getIfAccess().getAlternatives(), "rule__If__Alternatives");
					put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0(), "rule__ComparisonExpression__Alternatives_1_0");
					put(grammarAccess.getAddExpressionAccess().getAlternatives_1_0(), "rule__AddExpression__Alternatives_1_0");
					put(grammarAccess.getMultExpressionAccess().getAlternatives_1_0(), "rule__MultExpression__Alternatives_1_0");
					put(grammarAccess.getLiteralsExpressionAccess().getAlternatives(), "rule__LiteralsExpression__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getLogoProgramAccess().getGroup(), "rule__LogoProgram__Group__0");
					put(grammarAccess.getBackAccess().getGroup(), "rule__Back__Group__0");
					put(grammarAccess.getForwardAccess().getGroup(), "rule__Forward__Group__0");
					put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
					put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
					put(grammarAccess.getPenDownAccess().getGroup(), "rule__PenDown__Group__0");
					put(grammarAccess.getPenUpAccess().getGroup(), "rule__PenUp__Group__0");
					put(grammarAccess.getClearAccess().getGroup(), "rule__Clear__Group__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getProcCallAccess().getGroup(), "rule__ProcCall__Group__0");
					put(grammarAccess.getProcCallAccess().getGroup_3(), "rule__ProcCall__Group_3__0");
					put(grammarAccess.getProcDeclarationAccess().getGroup(), "rule__ProcDeclaration__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getIfAccess().getGroup_0(), "rule__If__Group_0__0");
					put(grammarAccess.getIfAccess().getGroup_1(), "rule__If__Group_1__0");
					put(grammarAccess.getRepeatAccess().getGroup(), "rule__Repeat__Group__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getParameterCallAccess().getGroup(), "rule__ParameterCall__Group__0");
					put(grammarAccess.getEqualExpressionAccess().getGroup(), "rule__EqualExpression__Group__0");
					put(grammarAccess.getEqualExpressionAccess().getGroup_1(), "rule__EqualExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0(), "rule__ComparisonExpression__Group_1_0_0__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1(), "rule__ComparisonExpression__Group_1_0_1__0");
					put(grammarAccess.getAddExpressionAccess().getGroup(), "rule__AddExpression__Group__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1(), "rule__AddExpression__Group_1__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1_0_0(), "rule__AddExpression__Group_1_0_0__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1_0_1(), "rule__AddExpression__Group_1_0_1__0");
					put(grammarAccess.getMultExpressionAccess().getGroup(), "rule__MultExpression__Group__0");
					put(grammarAccess.getMultExpressionAccess().getGroup_1(), "rule__MultExpression__Group_1__0");
					put(grammarAccess.getMultExpressionAccess().getGroup_1_0_0(), "rule__MultExpression__Group_1_0_0__0");
					put(grammarAccess.getMultExpressionAccess().getGroup_1_0_1(), "rule__MultExpression__Group_1_0_1__0");
					put(grammarAccess.getLiteralsExpressionAccess().getGroup_2(), "rule__LiteralsExpression__Group_2__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_1(), "rule__LogoProgram__InstructionsAssignment_1");
					put(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_2(), "rule__LogoProgram__InstructionsAssignment_2");
					put(grammarAccess.getBackAccess().getStepsAssignment_1(), "rule__Back__StepsAssignment_1");
					put(grammarAccess.getForwardAccess().getStepsAssignment_1(), "rule__Forward__StepsAssignment_1");
					put(grammarAccess.getLeftAccess().getAngleAssignment_2(), "rule__Left__AngleAssignment_2");
					put(grammarAccess.getRightAccess().getAngleAssignment_2(), "rule__Right__AngleAssignment_2");
					put(grammarAccess.getConstantAccess().getIntegerValueAssignment_1(), "rule__Constant__IntegerValueAssignment_1");
					put(grammarAccess.getProcCallAccess().getDeclarationAssignment_0(), "rule__ProcCall__DeclarationAssignment_0");
					put(grammarAccess.getProcCallAccess().getActualArgsAssignment_2(), "rule__ProcCall__ActualArgsAssignment_2");
					put(grammarAccess.getProcCallAccess().getActualArgsAssignment_3_1(), "rule__ProcCall__ActualArgsAssignment_3_1");
					put(grammarAccess.getProcDeclarationAccess().getNameAssignment_2(), "rule__ProcDeclaration__NameAssignment_2");
					put(grammarAccess.getProcDeclarationAccess().getArgsAssignment_3(), "rule__ProcDeclaration__ArgsAssignment_3");
					put(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_4(), "rule__ProcDeclaration__InstructionsAssignment_4");
					put(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_5(), "rule__ProcDeclaration__InstructionsAssignment_5");
					put(grammarAccess.getBlockAccess().getInstructionsAssignment_2(), "rule__Block__InstructionsAssignment_2");
					put(grammarAccess.getIfAccess().getConditionAssignment_0_1(), "rule__If__ConditionAssignment_0_1");
					put(grammarAccess.getIfAccess().getThenPartAssignment_0_2(), "rule__If__ThenPartAssignment_0_2");
					put(grammarAccess.getIfAccess().getElsePartAssignment_0_3(), "rule__If__ElsePartAssignment_0_3");
					put(grammarAccess.getIfAccess().getConditionAssignment_1_1(), "rule__If__ConditionAssignment_1_1");
					put(grammarAccess.getIfAccess().getThenPartAssignment_1_2(), "rule__If__ThenPartAssignment_1_2");
					put(grammarAccess.getRepeatAccess().getConditionAssignment_1(), "rule__Repeat__ConditionAssignment_1");
					put(grammarAccess.getRepeatAccess().getBlockAssignment_2(), "rule__Repeat__BlockAssignment_2");
					put(grammarAccess.getWhileAccess().getConditionAssignment_1(), "rule__While__ConditionAssignment_1");
					put(grammarAccess.getWhileAccess().getBlockAssignment_2(), "rule__While__BlockAssignment_2");
					put(grammarAccess.getParameterCallAccess().getParameterAssignment_1(), "rule__ParameterCall__ParameterAssignment_1");
					put(grammarAccess.getEqualExpressionAccess().getRhsAssignment_1_2(), "rule__EqualExpression__RhsAssignment_1_2");
					put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1(), "rule__ComparisonExpression__RhsAssignment_1_1");
					put(grammarAccess.getAddExpressionAccess().getRhsAssignment_1_1(), "rule__AddExpression__RhsAssignment_1_1");
					put(grammarAccess.getMultExpressionAccess().getRhsAssignment_1_1(), "rule__MultExpression__RhsAssignment_1_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.kermeta.language.sample.logo.ui.contentassist.antlr.internal.InternalLogoTextualSyntaxParser typedParser = (org.kermeta.language.sample.logo.ui.contentassist.antlr.internal.InternalLogoTextualSyntaxParser) parser;
			typedParser.entryRuleLogoProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LogoTextualSyntaxGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LogoTextualSyntaxGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
