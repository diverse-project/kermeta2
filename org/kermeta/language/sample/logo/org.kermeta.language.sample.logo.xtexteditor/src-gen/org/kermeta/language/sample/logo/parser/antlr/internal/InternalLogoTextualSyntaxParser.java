package org.kermeta.language.sample.logo.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.kermeta.language.sample.logo.services.LogoTextualSyntaxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogoTextualSyntaxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LogoProgram'", "'{'", "'instructions'", "','", "'}'", "'Back'", "'steps'", "'Forward'", "'Left'", "'angle'", "'Right'", "'PenDown'", "'PenUp'", "'Clear'", "'Constant'", "'integerValue'", "'ProcCall'", "'declaration'", "'actualArgs'", "'ProcDeclaration'", "'procCall'", "'('", "')'", "'args'", "'Block'", "'If'", "'condition'", "'thenPart'", "'elsePart'", "'ControlStructure'", "'Repeat'", "'block'", "'While'", "'ParameterCall'", "'parameter'", "'Plus'", "'lhs'", "'rhs'", "'Minus'", "'Mult'", "'Div'", "'Equals'", "'Greater'", "'Lower'", "'-'", "'Parameter'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLogoTextualSyntaxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogoTextualSyntaxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogoTextualSyntaxParser.tokenNames; }
    public String getGrammarFileName() { return "../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g"; }



     	private LogoTextualSyntaxGrammarAccess grammarAccess;
     	
        public InternalLogoTextualSyntaxParser(TokenStream input, LogoTextualSyntaxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LogoProgram";	
       	}
       	
       	@Override
       	protected LogoTextualSyntaxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLogoProgram"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:67:1: entryRuleLogoProgram returns [EObject current=null] : iv_ruleLogoProgram= ruleLogoProgram EOF ;
    public final EObject entryRuleLogoProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogoProgram = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:68:2: (iv_ruleLogoProgram= ruleLogoProgram EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:69:2: iv_ruleLogoProgram= ruleLogoProgram EOF
            {
             newCompositeNode(grammarAccess.getLogoProgramRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram75);
            iv_ruleLogoProgram=ruleLogoProgram();

            state._fsp--;

             current =iv_ruleLogoProgram; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogoProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogoProgram"


    // $ANTLR start "ruleLogoProgram"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:76:1: ruleLogoProgram returns [EObject current=null] : ( () otherlv_1= 'LogoProgram' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleLogoProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_instructions_5_0 = null;

        EObject lv_instructions_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:79:28: ( ( () otherlv_1= 'LogoProgram' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:80:1: ( () otherlv_1= 'LogoProgram' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:80:1: ( () otherlv_1= 'LogoProgram' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:80:2: () otherlv_1= 'LogoProgram' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:80:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLogoProgramAccess().getLogoProgramAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLogoProgram131); 

                	newLeafNode(otherlv_1, grammarAccess.getLogoProgramAccess().getLogoProgramKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLogoProgram143); 

                	newLeafNode(otherlv_2, grammarAccess.getLogoProgramAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:94:1: (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:94:3: otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLogoProgram156); 

                        	newLeafNode(otherlv_3, grammarAccess.getLogoProgramAccess().getInstructionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLogoProgram168); 

                        	newLeafNode(otherlv_4, grammarAccess.getLogoProgramAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:102:1: ( (lv_instructions_5_0= ruleInstruction ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:103:1: (lv_instructions_5_0= ruleInstruction )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:103:1: (lv_instructions_5_0= ruleInstruction )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:104:3: lv_instructions_5_0= ruleInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogoProgramAccess().getInstructionsInstructionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleLogoProgram189);
                    lv_instructions_5_0=ruleInstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogoProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"instructions",
                            		lv_instructions_5_0, 
                            		"Instruction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:120:2: (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:120:4: otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLogoProgram202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getLogoProgramAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:124:1: ( (lv_instructions_7_0= ruleInstruction ) )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:125:1: (lv_instructions_7_0= ruleInstruction )
                    	    {
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:125:1: (lv_instructions_7_0= ruleInstruction )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:126:3: lv_instructions_7_0= ruleInstruction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLogoProgramAccess().getInstructionsInstructionParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleLogoProgram223);
                    	    lv_instructions_7_0=ruleInstruction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLogoProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instructions",
                    	            		lv_instructions_7_0, 
                    	            		"Instruction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLogoProgram237); 

                        	newLeafNode(otherlv_8, grammarAccess.getLogoProgramAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLogoProgram251); 

                	newLeafNode(otherlv_9, grammarAccess.getLogoProgramAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogoProgram"


    // $ANTLR start "entryRuleInstruction"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:158:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:159:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:160:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_entryRuleInstruction287);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstruction297); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:167:1: ruleInstruction returns [EObject current=null] : (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_Constant_7= ruleConstant | this_ProcCall_8= ruleProcCall | this_ProcDeclaration_9= ruleProcDeclaration | this_Block_10= ruleBlock | this_If_11= ruleIf | this_ControlStructure_Impl_12= ruleControlStructure_Impl | this_Repeat_13= ruleRepeat | this_While_14= ruleWhile | this_ParameterCall_15= ruleParameterCall | this_Plus_16= rulePlus | this_Minus_17= ruleMinus | this_Mult_18= ruleMult | this_Div_19= ruleDiv | this_Equals_20= ruleEquals | this_Greater_21= ruleGreater | this_Lower_22= ruleLower ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Back_0 = null;

        EObject this_Forward_1 = null;

        EObject this_Left_2 = null;

        EObject this_Right_3 = null;

        EObject this_PenDown_4 = null;

        EObject this_PenUp_5 = null;

        EObject this_Clear_6 = null;

        EObject this_Constant_7 = null;

        EObject this_ProcCall_8 = null;

        EObject this_ProcDeclaration_9 = null;

        EObject this_Block_10 = null;

        EObject this_If_11 = null;

        EObject this_ControlStructure_Impl_12 = null;

        EObject this_Repeat_13 = null;

        EObject this_While_14 = null;

        EObject this_ParameterCall_15 = null;

        EObject this_Plus_16 = null;

        EObject this_Minus_17 = null;

        EObject this_Mult_18 = null;

        EObject this_Div_19 = null;

        EObject this_Equals_20 = null;

        EObject this_Greater_21 = null;

        EObject this_Lower_22 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:170:28: ( (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_Constant_7= ruleConstant | this_ProcCall_8= ruleProcCall | this_ProcDeclaration_9= ruleProcDeclaration | this_Block_10= ruleBlock | this_If_11= ruleIf | this_ControlStructure_Impl_12= ruleControlStructure_Impl | this_Repeat_13= ruleRepeat | this_While_14= ruleWhile | this_ParameterCall_15= ruleParameterCall | this_Plus_16= rulePlus | this_Minus_17= ruleMinus | this_Mult_18= ruleMult | this_Div_19= ruleDiv | this_Equals_20= ruleEquals | this_Greater_21= ruleGreater | this_Lower_22= ruleLower ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:171:1: (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_Constant_7= ruleConstant | this_ProcCall_8= ruleProcCall | this_ProcDeclaration_9= ruleProcDeclaration | this_Block_10= ruleBlock | this_If_11= ruleIf | this_ControlStructure_Impl_12= ruleControlStructure_Impl | this_Repeat_13= ruleRepeat | this_While_14= ruleWhile | this_ParameterCall_15= ruleParameterCall | this_Plus_16= rulePlus | this_Minus_17= ruleMinus | this_Mult_18= ruleMult | this_Div_19= ruleDiv | this_Equals_20= ruleEquals | this_Greater_21= ruleGreater | this_Lower_22= ruleLower )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:171:1: (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_Constant_7= ruleConstant | this_ProcCall_8= ruleProcCall | this_ProcDeclaration_9= ruleProcDeclaration | this_Block_10= ruleBlock | this_If_11= ruleIf | this_ControlStructure_Impl_12= ruleControlStructure_Impl | this_Repeat_13= ruleRepeat | this_While_14= ruleWhile | this_ParameterCall_15= ruleParameterCall | this_Plus_16= rulePlus | this_Minus_17= ruleMinus | this_Mult_18= ruleMult | this_Div_19= ruleDiv | this_Equals_20= ruleEquals | this_Greater_21= ruleGreater | this_Lower_22= ruleLower )
            int alt3=23;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            case 24:
                {
                alt3=7;
                }
                break;
            case 25:
                {
                alt3=8;
                }
                break;
            case 27:
                {
                alt3=9;
                }
                break;
            case 30:
                {
                alt3=10;
                }
                break;
            case 35:
                {
                alt3=11;
                }
                break;
            case 36:
                {
                alt3=12;
                }
                break;
            case 40:
                {
                alt3=13;
                }
                break;
            case 41:
                {
                alt3=14;
                }
                break;
            case 43:
                {
                alt3=15;
                }
                break;
            case 44:
                {
                alt3=16;
                }
                break;
            case 46:
                {
                alt3=17;
                }
                break;
            case 49:
                {
                alt3=18;
                }
                break;
            case 50:
                {
                alt3=19;
                }
                break;
            case 51:
                {
                alt3=20;
                }
                break;
            case 52:
                {
                alt3=21;
                }
                break;
            case 53:
                {
                alt3=22;
                }
                break;
            case 54:
                {
                alt3=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:172:5: this_Back_0= ruleBack
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getBackParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBack_in_ruleInstruction344);
                    this_Back_0=ruleBack();

                    state._fsp--;

                     
                            current = this_Back_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:182:5: this_Forward_1= ruleForward
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getForwardParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleForward_in_ruleInstruction371);
                    this_Forward_1=ruleForward();

                    state._fsp--;

                     
                            current = this_Forward_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:192:5: this_Left_2= ruleLeft
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLeftParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeft_in_ruleInstruction398);
                    this_Left_2=ruleLeft();

                    state._fsp--;

                     
                            current = this_Left_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:202:5: this_Right_3= ruleRight
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getRightParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRight_in_ruleInstruction425);
                    this_Right_3=ruleRight();

                    state._fsp--;

                     
                            current = this_Right_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:212:5: this_PenDown_4= rulePenDown
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePenDown_in_ruleInstruction452);
                    this_PenDown_4=rulePenDown();

                    state._fsp--;

                     
                            current = this_PenDown_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:222:5: this_PenUp_5= rulePenUp
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePenUp_in_ruleInstruction479);
                    this_PenUp_5=rulePenUp();

                    state._fsp--;

                     
                            current = this_PenUp_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:232:5: this_Clear_6= ruleClear
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getClearParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClear_in_ruleInstruction506);
                    this_Clear_6=ruleClear();

                    state._fsp--;

                     
                            current = this_Clear_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:242:5: this_Constant_7= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getConstantParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_ruleInstruction533);
                    this_Constant_7=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:252:5: this_ProcCall_8= ruleProcCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getProcCallParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_ruleInstruction560);
                    this_ProcCall_8=ruleProcCall();

                    state._fsp--;

                     
                            current = this_ProcCall_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:262:5: this_ProcDeclaration_9= ruleProcDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getProcDeclarationParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcDeclaration_in_ruleInstruction587);
                    this_ProcDeclaration_9=ruleProcDeclaration();

                    state._fsp--;

                     
                            current = this_ProcDeclaration_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:272:5: this_Block_10= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getBlockParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleInstruction614);
                    this_Block_10=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:282:5: this_If_11= ruleIf
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getIfParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIf_in_ruleInstruction641);
                    this_If_11=ruleIf();

                    state._fsp--;

                     
                            current = this_If_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:292:5: this_ControlStructure_Impl_12= ruleControlStructure_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getControlStructure_ImplParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleControlStructure_Impl_in_ruleInstruction668);
                    this_ControlStructure_Impl_12=ruleControlStructure_Impl();

                    state._fsp--;

                     
                            current = this_ControlStructure_Impl_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:302:5: this_Repeat_13= ruleRepeat
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getRepeatParserRuleCall_13()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRepeat_in_ruleInstruction695);
                    this_Repeat_13=ruleRepeat();

                    state._fsp--;

                     
                            current = this_Repeat_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:312:5: this_While_14= ruleWhile
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getWhileParserRuleCall_14()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWhile_in_ruleInstruction722);
                    this_While_14=ruleWhile();

                    state._fsp--;

                     
                            current = this_While_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:322:5: this_ParameterCall_15= ruleParameterCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getParameterCallParserRuleCall_15()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_ruleInstruction749);
                    this_ParameterCall_15=ruleParameterCall();

                    state._fsp--;

                     
                            current = this_ParameterCall_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:332:5: this_Plus_16= rulePlus
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPlusParserRuleCall_16()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePlus_in_ruleInstruction776);
                    this_Plus_16=rulePlus();

                    state._fsp--;

                     
                            current = this_Plus_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:342:5: this_Minus_17= ruleMinus
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getMinusParserRuleCall_17()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMinus_in_ruleInstruction803);
                    this_Minus_17=ruleMinus();

                    state._fsp--;

                     
                            current = this_Minus_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:352:5: this_Mult_18= ruleMult
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getMultParserRuleCall_18()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMult_in_ruleInstruction830);
                    this_Mult_18=ruleMult();

                    state._fsp--;

                     
                            current = this_Mult_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:362:5: this_Div_19= ruleDiv
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getDivParserRuleCall_19()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDiv_in_ruleInstruction857);
                    this_Div_19=ruleDiv();

                    state._fsp--;

                     
                            current = this_Div_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:372:5: this_Equals_20= ruleEquals
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getEqualsParserRuleCall_20()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEquals_in_ruleInstruction884);
                    this_Equals_20=ruleEquals();

                    state._fsp--;

                     
                            current = this_Equals_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:382:5: this_Greater_21= ruleGreater
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGreaterParserRuleCall_21()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGreater_in_ruleInstruction911);
                    this_Greater_21=ruleGreater();

                    state._fsp--;

                     
                            current = this_Greater_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:392:5: this_Lower_22= ruleLower
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLowerParserRuleCall_22()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLower_in_ruleInstruction938);
                    this_Lower_22=ruleLower();

                    state._fsp--;

                     
                            current = this_Lower_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleExpression"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:408:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:409:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:410:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression973);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression983); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:417:1: ruleExpression returns [EObject current=null] : (this_Constant_0= ruleConstant | this_ProcCall_1= ruleProcCall | this_ParameterCall_2= ruleParameterCall | this_Plus_3= rulePlus | this_Minus_4= ruleMinus | this_Mult_5= ruleMult | this_Div_6= ruleDiv | this_Equals_7= ruleEquals | this_Greater_8= ruleGreater | this_Lower_9= ruleLower ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_ProcCall_1 = null;

        EObject this_ParameterCall_2 = null;

        EObject this_Plus_3 = null;

        EObject this_Minus_4 = null;

        EObject this_Mult_5 = null;

        EObject this_Div_6 = null;

        EObject this_Equals_7 = null;

        EObject this_Greater_8 = null;

        EObject this_Lower_9 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:420:28: ( (this_Constant_0= ruleConstant | this_ProcCall_1= ruleProcCall | this_ParameterCall_2= ruleParameterCall | this_Plus_3= rulePlus | this_Minus_4= ruleMinus | this_Mult_5= ruleMult | this_Div_6= ruleDiv | this_Equals_7= ruleEquals | this_Greater_8= ruleGreater | this_Lower_9= ruleLower ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:421:1: (this_Constant_0= ruleConstant | this_ProcCall_1= ruleProcCall | this_ParameterCall_2= ruleParameterCall | this_Plus_3= rulePlus | this_Minus_4= ruleMinus | this_Mult_5= ruleMult | this_Div_6= ruleDiv | this_Equals_7= ruleEquals | this_Greater_8= ruleGreater | this_Lower_9= ruleLower )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:421:1: (this_Constant_0= ruleConstant | this_ProcCall_1= ruleProcCall | this_ParameterCall_2= ruleParameterCall | this_Plus_3= rulePlus | this_Minus_4= ruleMinus | this_Mult_5= ruleMult | this_Div_6= ruleDiv | this_Equals_7= ruleEquals | this_Greater_8= ruleGreater | this_Lower_9= ruleLower )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
            case 46:
                {
                alt4=4;
                }
                break;
            case 49:
                {
                alt4=5;
                }
                break;
            case 50:
                {
                alt4=6;
                }
                break;
            case 51:
                {
                alt4=7;
                }
                break;
            case 52:
                {
                alt4=8;
                }
                break;
            case 53:
                {
                alt4=9;
                }
                break;
            case 54:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:422:5: this_Constant_0= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getConstantParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_ruleExpression1030);
                    this_Constant_0=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:432:5: this_ProcCall_1= ruleProcCall
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getProcCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_ruleExpression1057);
                    this_ProcCall_1=ruleProcCall();

                    state._fsp--;

                     
                            current = this_ProcCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:442:5: this_ParameterCall_2= ruleParameterCall
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getParameterCallParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_ruleExpression1084);
                    this_ParameterCall_2=ruleParameterCall();

                    state._fsp--;

                     
                            current = this_ParameterCall_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:452:5: this_Plus_3= rulePlus
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getPlusParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePlus_in_ruleExpression1111);
                    this_Plus_3=rulePlus();

                    state._fsp--;

                     
                            current = this_Plus_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:462:5: this_Minus_4= ruleMinus
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getMinusParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMinus_in_ruleExpression1138);
                    this_Minus_4=ruleMinus();

                    state._fsp--;

                     
                            current = this_Minus_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:472:5: this_Mult_5= ruleMult
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getMultParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMult_in_ruleExpression1165);
                    this_Mult_5=ruleMult();

                    state._fsp--;

                     
                            current = this_Mult_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:482:5: this_Div_6= ruleDiv
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getDivParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDiv_in_ruleExpression1192);
                    this_Div_6=ruleDiv();

                    state._fsp--;

                     
                            current = this_Div_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:492:5: this_Equals_7= ruleEquals
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getEqualsParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEquals_in_ruleExpression1219);
                    this_Equals_7=ruleEquals();

                    state._fsp--;

                     
                            current = this_Equals_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:502:5: this_Greater_8= ruleGreater
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getGreaterParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGreater_in_ruleExpression1246);
                    this_Greater_8=ruleGreater();

                    state._fsp--;

                     
                            current = this_Greater_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:512:5: this_Lower_9= ruleLower
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getLowerParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLower_in_ruleExpression1273);
                    this_Lower_9=ruleLower();

                    state._fsp--;

                     
                            current = this_Lower_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBack"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:528:1: entryRuleBack returns [EObject current=null] : iv_ruleBack= ruleBack EOF ;
    public final EObject entryRuleBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBack = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:529:2: (iv_ruleBack= ruleBack EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:530:2: iv_ruleBack= ruleBack EOF
            {
             newCompositeNode(grammarAccess.getBackRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBack_in_entryRuleBack1308);
            iv_ruleBack=ruleBack();

            state._fsp--;

             current =iv_ruleBack; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBack1318); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBack"


    // $ANTLR start "ruleBack"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:537:1: ruleBack returns [EObject current=null] : (otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_steps_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:540:28: ( (otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:541:1: (otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:541:1: (otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:541:3: otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBack1355); 

                	newLeafNode(otherlv_0, grammarAccess.getBackAccess().getBackKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBack1367); 

                	newLeafNode(otherlv_1, grammarAccess.getBackAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBack1379); 

                	newLeafNode(otherlv_2, grammarAccess.getBackAccess().getStepsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:553:1: ( (lv_steps_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:554:1: (lv_steps_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:554:1: (lv_steps_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:555:3: lv_steps_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBackAccess().getStepsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBack1400);
            lv_steps_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBackRule());
            	        }
                   		set(
                   			current, 
                   			"steps",
                    		lv_steps_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBack1412); 

                	newLeafNode(otherlv_4, grammarAccess.getBackAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBack"


    // $ANTLR start "entryRuleForward"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:583:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:584:2: (iv_ruleForward= ruleForward EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:585:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForward_in_entryRuleForward1448);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForward1458); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:592:1: ruleForward returns [EObject current=null] : (otherlv_0= 'Forward' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_steps_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:595:28: ( (otherlv_0= 'Forward' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:596:1: (otherlv_0= 'Forward' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:596:1: (otherlv_0= 'Forward' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:596:3: otherlv_0= 'Forward' otherlv_1= '{' otherlv_2= 'steps' ( (lv_steps_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleForward1495); 

                	newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getForwardKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleForward1507); 

                	newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleForward1519); 

                	newLeafNode(otherlv_2, grammarAccess.getForwardAccess().getStepsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:608:1: ( (lv_steps_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:609:1: (lv_steps_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:609:1: (lv_steps_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:610:3: lv_steps_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getForwardAccess().getStepsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForward1540);
            lv_steps_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForwardRule());
            	        }
                   		set(
                   			current, 
                   			"steps",
                    		lv_steps_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleForward1552); 

                	newLeafNode(otherlv_4, grammarAccess.getForwardAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleLeft"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:638:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:639:2: (iv_ruleLeft= ruleLeft EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:640:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeft_in_entryRuleLeft1588);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeft1598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:647:1: ruleLeft returns [EObject current=null] : ( () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_angle_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:650:28: ( ( () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:651:1: ( () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:651:1: ( () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:651:2: () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:651:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:652:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLeftAccess().getLeftAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLeft1644); 

                	newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLeft1656); 

                	newLeafNode(otherlv_2, grammarAccess.getLeftAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:665:1: (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:665:3: otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLeft1669); 

                        	newLeafNode(otherlv_3, grammarAccess.getLeftAccess().getAngleKeyword_3_0());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:669:1: ( (lv_angle_4_0= ruleExpression ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:670:1: (lv_angle_4_0= ruleExpression )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:670:1: (lv_angle_4_0= ruleExpression )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:671:3: lv_angle_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLeftAccess().getAngleExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLeft1690);
                    lv_angle_4_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLeftRule());
                    	        }
                           		set(
                           			current, 
                           			"angle",
                            		lv_angle_4_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLeft1704); 

                	newLeafNode(otherlv_5, grammarAccess.getLeftAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:699:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:700:2: (iv_ruleRight= ruleRight EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:701:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRight_in_entryRuleRight1740);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRight1750); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:708:1: ruleRight returns [EObject current=null] : ( () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_angle_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:711:28: ( ( () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:712:1: ( () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:712:1: ( () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:712:2: () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:712:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:713:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRightAccess().getRightAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRight1796); 

                	newLeafNode(otherlv_1, grammarAccess.getRightAccess().getRightKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRight1808); 

                	newLeafNode(otherlv_2, grammarAccess.getRightAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:726:1: (otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:726:3: otherlv_3= 'angle' ( (lv_angle_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRight1821); 

                        	newLeafNode(otherlv_3, grammarAccess.getRightAccess().getAngleKeyword_3_0());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:730:1: ( (lv_angle_4_0= ruleExpression ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:731:1: (lv_angle_4_0= ruleExpression )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:731:1: (lv_angle_4_0= ruleExpression )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:732:3: lv_angle_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRightAccess().getAngleExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleRight1842);
                    lv_angle_4_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRightRule());
                    	        }
                           		set(
                           			current, 
                           			"angle",
                            		lv_angle_4_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRight1856); 

                	newLeafNode(otherlv_5, grammarAccess.getRightAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRulePenDown"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:760:1: entryRulePenDown returns [EObject current=null] : iv_rulePenDown= rulePenDown EOF ;
    public final EObject entryRulePenDown() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenDown = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:761:2: (iv_rulePenDown= rulePenDown EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:762:2: iv_rulePenDown= rulePenDown EOF
            {
             newCompositeNode(grammarAccess.getPenDownRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePenDown_in_entryRulePenDown1892);
            iv_rulePenDown=rulePenDown();

            state._fsp--;

             current =iv_rulePenDown; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePenDown1902); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePenDown"


    // $ANTLR start "rulePenDown"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:769:1: rulePenDown returns [EObject current=null] : ( () otherlv_1= 'PenDown' ) ;
    public final EObject rulePenDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:772:28: ( ( () otherlv_1= 'PenDown' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:773:1: ( () otherlv_1= 'PenDown' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:773:1: ( () otherlv_1= 'PenDown' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:773:2: () otherlv_1= 'PenDown'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:773:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:774:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPenDownAccess().getPenDownAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePenDown1948); 

                	newLeafNode(otherlv_1, grammarAccess.getPenDownAccess().getPenDownKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePenDown"


    // $ANTLR start "entryRulePenUp"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:791:1: entryRulePenUp returns [EObject current=null] : iv_rulePenUp= rulePenUp EOF ;
    public final EObject entryRulePenUp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenUp = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:792:2: (iv_rulePenUp= rulePenUp EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:793:2: iv_rulePenUp= rulePenUp EOF
            {
             newCompositeNode(grammarAccess.getPenUpRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePenUp_in_entryRulePenUp1984);
            iv_rulePenUp=rulePenUp();

            state._fsp--;

             current =iv_rulePenUp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePenUp1994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePenUp"


    // $ANTLR start "rulePenUp"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:800:1: rulePenUp returns [EObject current=null] : ( () otherlv_1= 'PenUp' ) ;
    public final EObject rulePenUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:803:28: ( ( () otherlv_1= 'PenUp' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:804:1: ( () otherlv_1= 'PenUp' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:804:1: ( () otherlv_1= 'PenUp' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:804:2: () otherlv_1= 'PenUp'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:804:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:805:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPenUpAccess().getPenUpAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePenUp2040); 

                	newLeafNode(otherlv_1, grammarAccess.getPenUpAccess().getPenUpKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePenUp"


    // $ANTLR start "entryRuleClear"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:822:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:823:2: (iv_ruleClear= ruleClear EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:824:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClear_in_entryRuleClear2076);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClear2086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:831:1: ruleClear returns [EObject current=null] : ( () otherlv_1= 'Clear' ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:834:28: ( ( () otherlv_1= 'Clear' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:835:1: ( () otherlv_1= 'Clear' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:835:1: ( () otherlv_1= 'Clear' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:835:2: () otherlv_1= 'Clear'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:835:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:836:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClearAccess().getClearAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClear2132); 

                	newLeafNode(otherlv_1, grammarAccess.getClearAccess().getClearKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleConstant"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:853:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:854:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:855:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant2168);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant2178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:862:1: ruleConstant returns [EObject current=null] : ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'integerValue' ( (lv_integerValue_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_integerValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:865:28: ( ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'integerValue' ( (lv_integerValue_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:866:1: ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'integerValue' ( (lv_integerValue_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:866:1: ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'integerValue' ( (lv_integerValue_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:866:2: () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'integerValue' ( (lv_integerValue_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:866:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:867:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConstant2224); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstantKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstant2236); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:880:1: (otherlv_3= 'integerValue' ( (lv_integerValue_4_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:880:3: otherlv_3= 'integerValue' ( (lv_integerValue_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConstant2249); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getIntegerValueKeyword_3_0());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:884:1: ( (lv_integerValue_4_0= ruleEInt ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:885:1: (lv_integerValue_4_0= ruleEInt )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:885:1: (lv_integerValue_4_0= ruleEInt )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:886:3: lv_integerValue_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getIntegerValueEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstant2270);
                    lv_integerValue_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	        }
                           		set(
                           			current, 
                           			"integerValue",
                            		lv_integerValue_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstant2284); 

                	newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleProcCall"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:914:1: entryRuleProcCall returns [EObject current=null] : iv_ruleProcCall= ruleProcCall EOF ;
    public final EObject entryRuleProcCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcCall = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:915:2: (iv_ruleProcCall= ruleProcCall EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:916:2: iv_ruleProcCall= ruleProcCall EOF
            {
             newCompositeNode(grammarAccess.getProcCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_entryRuleProcCall2320);
            iv_ruleProcCall=ruleProcCall();

            state._fsp--;

             current =iv_ruleProcCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcCall2330); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcCall"


    // $ANTLR start "ruleProcCall"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:923:1: ruleProcCall returns [EObject current=null] : (otherlv_0= 'ProcCall' otherlv_1= '{' otherlv_2= 'declaration' ( ( ruleEString ) ) (otherlv_4= 'actualArgs' otherlv_5= '{' ( (lv_actualArgs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleProcCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_actualArgs_6_0 = null;

        EObject lv_actualArgs_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:926:28: ( (otherlv_0= 'ProcCall' otherlv_1= '{' otherlv_2= 'declaration' ( ( ruleEString ) ) (otherlv_4= 'actualArgs' otherlv_5= '{' ( (lv_actualArgs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:927:1: (otherlv_0= 'ProcCall' otherlv_1= '{' otherlv_2= 'declaration' ( ( ruleEString ) ) (otherlv_4= 'actualArgs' otherlv_5= '{' ( (lv_actualArgs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:927:1: (otherlv_0= 'ProcCall' otherlv_1= '{' otherlv_2= 'declaration' ( ( ruleEString ) ) (otherlv_4= 'actualArgs' otherlv_5= '{' ( (lv_actualArgs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:927:3: otherlv_0= 'ProcCall' otherlv_1= '{' otherlv_2= 'declaration' ( ( ruleEString ) ) (otherlv_4= 'actualArgs' otherlv_5= '{' ( (lv_actualArgs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleProcCall2367); 

                	newLeafNode(otherlv_0, grammarAccess.getProcCallAccess().getProcCallKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProcCall2379); 

                	newLeafNode(otherlv_1, grammarAccess.getProcCallAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleProcCall2391); 

                	newLeafNode(otherlv_2, grammarAccess.getProcCallAccess().getDeclarationKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:939:1: ( ( ruleEString ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:940:1: ( ruleEString )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:940:1: ( ruleEString )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:941:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProcCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getProcCallAccess().getDeclarationProcDeclarationCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcCall2414);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:954:2: (otherlv_4= 'actualArgs' otherlv_5= '{' ( (lv_actualArgs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:954:4: otherlv_4= 'actualArgs' otherlv_5= '{' ( (lv_actualArgs_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleProcCall2427); 

                        	newLeafNode(otherlv_4, grammarAccess.getProcCallAccess().getActualArgsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProcCall2439); 

                        	newLeafNode(otherlv_5, grammarAccess.getProcCallAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:962:1: ( (lv_actualArgs_6_0= ruleExpression ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:963:1: (lv_actualArgs_6_0= ruleExpression )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:963:1: (lv_actualArgs_6_0= ruleExpression )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:964:3: lv_actualArgs_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcCallAccess().getActualArgsExpressionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleProcCall2460);
                    lv_actualArgs_6_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcCallRule());
                    	        }
                           		add(
                           			current, 
                           			"actualArgs",
                            		lv_actualArgs_6_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:980:2: (otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:980:4: otherlv_7= ',' ( (lv_actualArgs_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProcCall2473); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getProcCallAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:984:1: ( (lv_actualArgs_8_0= ruleExpression ) )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:985:1: (lv_actualArgs_8_0= ruleExpression )
                    	    {
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:985:1: (lv_actualArgs_8_0= ruleExpression )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:986:3: lv_actualArgs_8_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcCallAccess().getActualArgsExpressionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleProcCall2494);
                    	    lv_actualArgs_8_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actualArgs",
                    	            		lv_actualArgs_8_0, 
                    	            		"Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcCall2508); 

                        	newLeafNode(otherlv_9, grammarAccess.getProcCallAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcCall2522); 

                	newLeafNode(otherlv_10, grammarAccess.getProcCallAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcCall"


    // $ANTLR start "entryRuleProcDeclaration"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1018:1: entryRuleProcDeclaration returns [EObject current=null] : iv_ruleProcDeclaration= ruleProcDeclaration EOF ;
    public final EObject entryRuleProcDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcDeclaration = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1019:2: (iv_ruleProcDeclaration= ruleProcDeclaration EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1020:2: iv_ruleProcDeclaration= ruleProcDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcDeclaration_in_entryRuleProcDeclaration2558);
            iv_ruleProcDeclaration=ruleProcDeclaration();

            state._fsp--;

             current =iv_ruleProcDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcDeclaration2568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcDeclaration"


    // $ANTLR start "ruleProcDeclaration"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1027:1: ruleProcDeclaration returns [EObject current=null] : ( () otherlv_1= 'ProcDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'procCall' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'args' otherlv_11= '{' ( (lv_args_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'instructions' otherlv_17= '{' ( (lv_instructions_18_0= ruleInstruction ) ) (otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleProcDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_args_12_0 = null;

        EObject lv_args_14_0 = null;

        EObject lv_instructions_18_0 = null;

        EObject lv_instructions_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1030:28: ( ( () otherlv_1= 'ProcDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'procCall' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'args' otherlv_11= '{' ( (lv_args_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'instructions' otherlv_17= '{' ( (lv_instructions_18_0= ruleInstruction ) ) (otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1031:1: ( () otherlv_1= 'ProcDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'procCall' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'args' otherlv_11= '{' ( (lv_args_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'instructions' otherlv_17= '{' ( (lv_instructions_18_0= ruleInstruction ) ) (otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1031:1: ( () otherlv_1= 'ProcDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'procCall' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'args' otherlv_11= '{' ( (lv_args_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'instructions' otherlv_17= '{' ( (lv_instructions_18_0= ruleInstruction ) ) (otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1031:2: () otherlv_1= 'ProcDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'procCall' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'args' otherlv_11= '{' ( (lv_args_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'instructions' otherlv_17= '{' ( (lv_instructions_18_0= ruleInstruction ) ) (otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1031:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1032:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcDeclarationAccess().getProcDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleProcDeclaration2614); 

                	newLeafNode(otherlv_1, grammarAccess.getProcDeclarationAccess().getProcDeclarationKeyword_1());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1041:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1042:1: (lv_name_2_0= ruleEString )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1042:1: (lv_name_2_0= ruleEString )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1043:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcDeclaration2635);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProcDeclaration2647); 

                	newLeafNode(otherlv_3, grammarAccess.getProcDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1063:1: (otherlv_4= 'procCall' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1063:3: otherlv_4= 'procCall' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleProcDeclaration2660); 

                        	newLeafNode(otherlv_4, grammarAccess.getProcDeclarationAccess().getProcCallKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleProcDeclaration2672); 

                        	newLeafNode(otherlv_5, grammarAccess.getProcDeclarationAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1071:1: ( ( ruleEString ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1072:1: ( ruleEString )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1072:1: ( ruleEString )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1073:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcDeclarationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getProcCallProcCallCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcDeclaration2695);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1086:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1086:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProcDeclaration2708); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getProcDeclarationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1090:1: ( ( ruleEString ) )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1091:1: ( ruleEString )
                    	    {
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1091:1: ( ruleEString )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1092:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProcDeclarationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getProcCallProcCallCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcDeclaration2731);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleProcDeclaration2745); 

                        	newLeafNode(otherlv_9, grammarAccess.getProcDeclarationAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1109:3: (otherlv_10= 'args' otherlv_11= '{' ( (lv_args_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) ) )* otherlv_15= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1109:5: otherlv_10= 'args' otherlv_11= '{' ( (lv_args_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleProcDeclaration2760); 

                        	newLeafNode(otherlv_10, grammarAccess.getProcDeclarationAccess().getArgsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProcDeclaration2772); 

                        	newLeafNode(otherlv_11, grammarAccess.getProcDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1117:1: ( (lv_args_12_0= ruleParameter ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1118:1: (lv_args_12_0= ruleParameter )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1118:1: (lv_args_12_0= ruleParameter )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1119:3: lv_args_12_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getArgsParameterParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleProcDeclaration2793);
                    lv_args_12_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_12_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1135:2: (otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1135:4: otherlv_13= ',' ( (lv_args_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProcDeclaration2806); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getProcDeclarationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1139:1: ( (lv_args_14_0= ruleParameter ) )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1140:1: (lv_args_14_0= ruleParameter )
                    	    {
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1140:1: (lv_args_14_0= ruleParameter )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1141:3: lv_args_14_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getArgsParameterParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleProcDeclaration2827);
                    	    lv_args_14_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_14_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcDeclaration2841); 

                        	newLeafNode(otherlv_15, grammarAccess.getProcDeclarationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1161:3: (otherlv_16= 'instructions' otherlv_17= '{' ( (lv_instructions_18_0= ruleInstruction ) ) (otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) ) )* otherlv_21= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1161:5: otherlv_16= 'instructions' otherlv_17= '{' ( (lv_instructions_18_0= ruleInstruction ) ) (otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleProcDeclaration2856); 

                        	newLeafNode(otherlv_16, grammarAccess.getProcDeclarationAccess().getInstructionsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProcDeclaration2868); 

                        	newLeafNode(otherlv_17, grammarAccess.getProcDeclarationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1169:1: ( (lv_instructions_18_0= ruleInstruction ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1170:1: (lv_instructions_18_0= ruleInstruction )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1170:1: (lv_instructions_18_0= ruleInstruction )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1171:3: lv_instructions_18_0= ruleInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getInstructionsInstructionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleProcDeclaration2889);
                    lv_instructions_18_0=ruleInstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"instructions",
                            		lv_instructions_18_0, 
                            		"Instruction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1187:2: (otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1187:4: otherlv_19= ',' ( (lv_instructions_20_0= ruleInstruction ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProcDeclaration2902); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getProcDeclarationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1191:1: ( (lv_instructions_20_0= ruleInstruction ) )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1192:1: (lv_instructions_20_0= ruleInstruction )
                    	    {
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1192:1: (lv_instructions_20_0= ruleInstruction )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1193:3: lv_instructions_20_0= ruleInstruction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getInstructionsInstructionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleProcDeclaration2923);
                    	    lv_instructions_20_0=ruleInstruction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instructions",
                    	            		lv_instructions_20_0, 
                    	            		"Instruction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcDeclaration2937); 

                        	newLeafNode(otherlv_21, grammarAccess.getProcDeclarationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcDeclaration2951); 

                	newLeafNode(otherlv_22, grammarAccess.getProcDeclarationAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcDeclaration"


    // $ANTLR start "entryRuleBlock"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1225:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1226:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1227:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock2987);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock2997); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1234:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_instructions_5_0 = null;

        EObject lv_instructions_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1237:28: ( ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1238:1: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1238:1: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1238:2: () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1238:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBlock3043); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBlockKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBlock3055); 

                	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1252:1: (otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1252:3: otherlv_3= 'instructions' otherlv_4= '{' ( (lv_instructions_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBlock3068); 

                        	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getInstructionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBlock3080); 

                        	newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1260:1: ( (lv_instructions_5_0= ruleInstruction ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1261:1: (lv_instructions_5_0= ruleInstruction )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1261:1: (lv_instructions_5_0= ruleInstruction )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1262:3: lv_instructions_5_0= ruleInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleBlock3101);
                    lv_instructions_5_0=ruleInstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		add(
                           			current, 
                           			"instructions",
                            		lv_instructions_5_0, 
                            		"Instruction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1278:2: (otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1278:4: otherlv_6= ',' ( (lv_instructions_7_0= ruleInstruction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBlock3114); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1282:1: ( (lv_instructions_7_0= ruleInstruction ) )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1283:1: (lv_instructions_7_0= ruleInstruction )
                    	    {
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1283:1: (lv_instructions_7_0= ruleInstruction )
                    	    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1284:3: lv_instructions_7_0= ruleInstruction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleBlock3135);
                    	    lv_instructions_7_0=ruleInstruction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instructions",
                    	            		lv_instructions_7_0, 
                    	            		"Instruction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBlock3149); 

                        	newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBlock3163); 

                	newLeafNode(otherlv_9, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIf"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1316:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1317:2: (iv_ruleIf= ruleIf EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1318:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIf_in_entryRuleIf3199);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIf3209); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1325:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'thenPart' ( (lv_thenPart_5_0= ruleBlock ) ) (otherlv_6= 'elsePart' ( (lv_elsePart_7_0= ruleBlock ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_condition_3_0 = null;

        EObject lv_thenPart_5_0 = null;

        EObject lv_elsePart_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1328:28: ( (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'thenPart' ( (lv_thenPart_5_0= ruleBlock ) ) (otherlv_6= 'elsePart' ( (lv_elsePart_7_0= ruleBlock ) ) )? otherlv_8= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1329:1: (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'thenPart' ( (lv_thenPart_5_0= ruleBlock ) ) (otherlv_6= 'elsePart' ( (lv_elsePart_7_0= ruleBlock ) ) )? otherlv_8= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1329:1: (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'thenPart' ( (lv_thenPart_5_0= ruleBlock ) ) (otherlv_6= 'elsePart' ( (lv_elsePart_7_0= ruleBlock ) ) )? otherlv_8= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1329:3: otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'thenPart' ( (lv_thenPart_5_0= ruleBlock ) ) (otherlv_6= 'elsePart' ( (lv_elsePart_7_0= ruleBlock ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleIf3246); 

                	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIf3258); 

                	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1337:1: (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1337:3: otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleIf3271); 

                        	newLeafNode(otherlv_2, grammarAccess.getIfAccess().getConditionKeyword_2_0());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1341:1: ( (lv_condition_3_0= ruleExpression ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1342:1: (lv_condition_3_0= ruleExpression )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1342:1: (lv_condition_3_0= ruleExpression )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1343:3: lv_condition_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIf3292);
                    lv_condition_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleIf3306); 

                	newLeafNode(otherlv_4, grammarAccess.getIfAccess().getThenPartKeyword_3());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1363:1: ( (lv_thenPart_5_0= ruleBlock ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1364:1: (lv_thenPart_5_0= ruleBlock )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1364:1: (lv_thenPart_5_0= ruleBlock )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1365:3: lv_thenPart_5_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfAccess().getThenPartBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIf3327);
            lv_thenPart_5_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfRule());
            	        }
                   		set(
                   			current, 
                   			"thenPart",
                    		lv_thenPart_5_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1381:2: (otherlv_6= 'elsePart' ( (lv_elsePart_7_0= ruleBlock ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1381:4: otherlv_6= 'elsePart' ( (lv_elsePart_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleIf3340); 

                        	newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElsePartKeyword_5_0());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1385:1: ( (lv_elsePart_7_0= ruleBlock ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1386:1: (lv_elsePart_7_0= ruleBlock )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1386:1: (lv_elsePart_7_0= ruleBlock )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1387:3: lv_elsePart_7_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfAccess().getElsePartBlockParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIf3361);
                    lv_elsePart_7_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfRule());
                    	        }
                           		set(
                           			current, 
                           			"elsePart",
                            		lv_elsePart_7_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIf3375); 

                	newLeafNode(otherlv_8, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleControlStructure_Impl"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1415:1: entryRuleControlStructure_Impl returns [EObject current=null] : iv_ruleControlStructure_Impl= ruleControlStructure_Impl EOF ;
    public final EObject entryRuleControlStructure_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlStructure_Impl = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1416:2: (iv_ruleControlStructure_Impl= ruleControlStructure_Impl EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1417:2: iv_ruleControlStructure_Impl= ruleControlStructure_Impl EOF
            {
             newCompositeNode(grammarAccess.getControlStructure_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleControlStructure_Impl_in_entryRuleControlStructure_Impl3411);
            iv_ruleControlStructure_Impl=ruleControlStructure_Impl();

            state._fsp--;

             current =iv_ruleControlStructure_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleControlStructure_Impl3421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlStructure_Impl"


    // $ANTLR start "ruleControlStructure_Impl"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1424:1: ruleControlStructure_Impl returns [EObject current=null] : ( () otherlv_1= 'ControlStructure' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleControlStructure_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1427:28: ( ( () otherlv_1= 'ControlStructure' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1428:1: ( () otherlv_1= 'ControlStructure' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1428:1: ( () otherlv_1= 'ControlStructure' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1428:2: () otherlv_1= 'ControlStructure' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1428:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1429:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getControlStructure_ImplAccess().getControlStructureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleControlStructure_Impl3467); 

                	newLeafNode(otherlv_1, grammarAccess.getControlStructure_ImplAccess().getControlStructureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleControlStructure_Impl3479); 

                	newLeafNode(otherlv_2, grammarAccess.getControlStructure_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1442:1: (otherlv_3= 'condition' ( (lv_condition_4_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1442:3: otherlv_3= 'condition' ( (lv_condition_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleControlStructure_Impl3492); 

                        	newLeafNode(otherlv_3, grammarAccess.getControlStructure_ImplAccess().getConditionKeyword_3_0());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1446:1: ( (lv_condition_4_0= ruleExpression ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1447:1: (lv_condition_4_0= ruleExpression )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1447:1: (lv_condition_4_0= ruleExpression )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1448:3: lv_condition_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getControlStructure_ImplAccess().getConditionExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleControlStructure_Impl3513);
                    lv_condition_4_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControlStructure_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_4_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleControlStructure_Impl3527); 

                	newLeafNode(otherlv_5, grammarAccess.getControlStructure_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlStructure_Impl"


    // $ANTLR start "entryRuleRepeat"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1476:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1477:2: (iv_ruleRepeat= ruleRepeat EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1478:2: iv_ruleRepeat= ruleRepeat EOF
            {
             newCompositeNode(grammarAccess.getRepeatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRepeat_in_entryRuleRepeat3563);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;

             current =iv_ruleRepeat; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRepeat3573); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1485:1: ruleRepeat returns [EObject current=null] : (otherlv_0= 'Repeat' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_3_0 = null;

        EObject lv_block_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1488:28: ( (otherlv_0= 'Repeat' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1489:1: (otherlv_0= 'Repeat' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1489:1: (otherlv_0= 'Repeat' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1489:3: otherlv_0= 'Repeat' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRepeat3610); 

                	newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRepeat3622); 

                	newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1497:1: (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1497:3: otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRepeat3635); 

                        	newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getConditionKeyword_2_0());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1501:1: ( (lv_condition_3_0= ruleExpression ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1502:1: (lv_condition_3_0= ruleExpression )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1502:1: (lv_condition_3_0= ruleExpression )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1503:3: lv_condition_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepeatAccess().getConditionExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleRepeat3656);
                    lv_condition_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepeatRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRepeat3670); 

                	newLeafNode(otherlv_4, grammarAccess.getRepeatAccess().getBlockKeyword_3());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1523:1: ( (lv_block_5_0= ruleBlock ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1524:1: (lv_block_5_0= ruleBlock )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1524:1: (lv_block_5_0= ruleBlock )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1525:3: lv_block_5_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleRepeat3691);
            lv_block_5_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepeatRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_5_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRepeat3703); 

                	newLeafNode(otherlv_6, grammarAccess.getRepeatAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleWhile"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1553:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1554:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1555:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhile_in_entryRuleWhile3739);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhile3749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1562:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'While' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_3_0 = null;

        EObject lv_block_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1565:28: ( (otherlv_0= 'While' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1566:1: (otherlv_0= 'While' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1566:1: (otherlv_0= 'While' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1566:3: otherlv_0= 'While' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )? otherlv_4= 'block' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleWhile3786); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWhile3798); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1574:1: (otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1574:3: otherlv_2= 'condition' ( (lv_condition_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleWhile3811); 

                        	newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getConditionKeyword_2_0());
                        
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1578:1: ( (lv_condition_3_0= ruleExpression ) )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1579:1: (lv_condition_3_0= ruleExpression )
                    {
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1579:1: (lv_condition_3_0= ruleExpression )
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1580:3: lv_condition_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWhile3832);
                    lv_condition_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhileRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleWhile3846); 

                	newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getBlockKeyword_3());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1600:1: ( (lv_block_5_0= ruleBlock ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1601:1: (lv_block_5_0= ruleBlock )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1601:1: (lv_block_5_0= ruleBlock )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1602:3: lv_block_5_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleWhile3867);
            lv_block_5_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_5_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWhile3879); 

                	newLeafNode(otherlv_6, grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleParameterCall"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1630:1: entryRuleParameterCall returns [EObject current=null] : iv_ruleParameterCall= ruleParameterCall EOF ;
    public final EObject entryRuleParameterCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCall = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1631:2: (iv_ruleParameterCall= ruleParameterCall EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1632:2: iv_ruleParameterCall= ruleParameterCall EOF
            {
             newCompositeNode(grammarAccess.getParameterCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_entryRuleParameterCall3915);
            iv_ruleParameterCall=ruleParameterCall();

            state._fsp--;

             current =iv_ruleParameterCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterCall3925); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterCall"


    // $ANTLR start "ruleParameterCall"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1639:1: ruleParameterCall returns [EObject current=null] : (otherlv_0= 'ParameterCall' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1642:28: ( (otherlv_0= 'ParameterCall' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1643:1: (otherlv_0= 'ParameterCall' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1643:1: (otherlv_0= 'ParameterCall' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1643:3: otherlv_0= 'ParameterCall' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleParameterCall3962); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterCallAccess().getParameterCallKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterCall3974); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterCallAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleParameterCall3986); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterCallAccess().getParameterKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1655:1: ( ( ruleEString ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1656:1: ( ruleEString )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1656:1: ( ruleEString )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1657:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameterCall4009);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParameterCall4021); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterCallAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterCall"


    // $ANTLR start "entryRulePlus"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1682:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1683:2: (iv_rulePlus= rulePlus EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1684:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePlus_in_entryRulePlus4057);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePlus4067); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1691:1: rulePlus returns [EObject current=null] : (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1694:28: ( (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1695:1: (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1695:1: (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1695:3: otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_rulePlus4104); 

                	newLeafNode(otherlv_0, grammarAccess.getPlusAccess().getPlusKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePlus4116); 

                	newLeafNode(otherlv_1, grammarAccess.getPlusAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_rulePlus4128); 

                	newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getLhsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1707:1: ( (lv_lhs_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1708:1: (lv_lhs_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1708:1: (lv_lhs_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1709:3: lv_lhs_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getPlusAccess().getLhsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePlus4149);
            lv_lhs_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlusRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_rulePlus4161); 

                	newLeafNode(otherlv_4, grammarAccess.getPlusAccess().getRhsKeyword_4());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1729:1: ( (lv_rhs_5_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1730:1: (lv_rhs_5_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1730:1: (lv_rhs_5_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1731:3: lv_rhs_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getPlusAccess().getRhsExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePlus4182);
            lv_rhs_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlusRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePlus4194); 

                	newLeafNode(otherlv_6, grammarAccess.getPlusAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1759:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1760:2: (iv_ruleMinus= ruleMinus EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1761:2: iv_ruleMinus= ruleMinus EOF
            {
             newCompositeNode(grammarAccess.getMinusRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinus_in_entryRuleMinus4230);
            iv_ruleMinus=ruleMinus();

            state._fsp--;

             current =iv_ruleMinus; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMinus4240); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1768:1: ruleMinus returns [EObject current=null] : (otherlv_0= 'Minus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1771:28: ( (otherlv_0= 'Minus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1772:1: (otherlv_0= 'Minus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1772:1: (otherlv_0= 'Minus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1772:3: otherlv_0= 'Minus' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMinus4277); 

                	newLeafNode(otherlv_0, grammarAccess.getMinusAccess().getMinusKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMinus4289); 

                	newLeafNode(otherlv_1, grammarAccess.getMinusAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMinus4301); 

                	newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getLhsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1784:1: ( (lv_lhs_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1785:1: (lv_lhs_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1785:1: (lv_lhs_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1786:3: lv_lhs_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMinusAccess().getLhsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMinus4322);
            lv_lhs_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinusRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMinus4334); 

                	newLeafNode(otherlv_4, grammarAccess.getMinusAccess().getRhsKeyword_4());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1806:1: ( (lv_rhs_5_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1807:1: (lv_rhs_5_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1807:1: (lv_rhs_5_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1808:3: lv_rhs_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMinusAccess().getRhsExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMinus4355);
            lv_rhs_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinusRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMinus4367); 

                	newLeafNode(otherlv_6, grammarAccess.getMinusAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleMult"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1836:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1837:2: (iv_ruleMult= ruleMult EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1838:2: iv_ruleMult= ruleMult EOF
            {
             newCompositeNode(grammarAccess.getMultRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMult_in_entryRuleMult4403);
            iv_ruleMult=ruleMult();

            state._fsp--;

             current =iv_ruleMult; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMult4413); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1845:1: ruleMult returns [EObject current=null] : (otherlv_0= 'Mult' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1848:28: ( (otherlv_0= 'Mult' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1849:1: (otherlv_0= 'Mult' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1849:1: (otherlv_0= 'Mult' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1849:3: otherlv_0= 'Mult' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMult4450); 

                	newLeafNode(otherlv_0, grammarAccess.getMultAccess().getMultKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMult4462); 

                	newLeafNode(otherlv_1, grammarAccess.getMultAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMult4474); 

                	newLeafNode(otherlv_2, grammarAccess.getMultAccess().getLhsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1861:1: ( (lv_lhs_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1862:1: (lv_lhs_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1862:1: (lv_lhs_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1863:3: lv_lhs_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultAccess().getLhsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMult4495);
            lv_lhs_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMult4507); 

                	newLeafNode(otherlv_4, grammarAccess.getMultAccess().getRhsKeyword_4());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1883:1: ( (lv_rhs_5_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1884:1: (lv_rhs_5_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1884:1: (lv_rhs_5_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1885:3: lv_rhs_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultAccess().getRhsExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMult4528);
            lv_rhs_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMult4540); 

                	newLeafNode(otherlv_6, grammarAccess.getMultAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleDiv"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1913:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1914:2: (iv_ruleDiv= ruleDiv EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1915:2: iv_ruleDiv= ruleDiv EOF
            {
             newCompositeNode(grammarAccess.getDivRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDiv_in_entryRuleDiv4576);
            iv_ruleDiv=ruleDiv();

            state._fsp--;

             current =iv_ruleDiv; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDiv4586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1922:1: ruleDiv returns [EObject current=null] : (otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1925:28: ( (otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1926:1: (otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1926:1: (otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1926:3: otherlv_0= 'Div' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleDiv4623); 

                	newLeafNode(otherlv_0, grammarAccess.getDivAccess().getDivKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDiv4635); 

                	newLeafNode(otherlv_1, grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDiv4647); 

                	newLeafNode(otherlv_2, grammarAccess.getDivAccess().getLhsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1938:1: ( (lv_lhs_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1939:1: (lv_lhs_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1939:1: (lv_lhs_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1940:3: lv_lhs_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDivAccess().getLhsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDiv4668);
            lv_lhs_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDivRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleDiv4680); 

                	newLeafNode(otherlv_4, grammarAccess.getDivAccess().getRhsKeyword_4());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1960:1: ( (lv_rhs_5_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1961:1: (lv_rhs_5_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1961:1: (lv_rhs_5_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1962:3: lv_rhs_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDivAccess().getRhsExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDiv4701);
            lv_rhs_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDivRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDiv4713); 

                	newLeafNode(otherlv_6, grammarAccess.getDivAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuleEquals"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1990:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1991:2: (iv_ruleEquals= ruleEquals EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1992:2: iv_ruleEquals= ruleEquals EOF
            {
             newCompositeNode(grammarAccess.getEqualsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEquals_in_entryRuleEquals4749);
            iv_ruleEquals=ruleEquals();

            state._fsp--;

             current =iv_ruleEquals; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquals4759); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:1999:1: ruleEquals returns [EObject current=null] : (otherlv_0= 'Equals' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2002:28: ( (otherlv_0= 'Equals' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2003:1: (otherlv_0= 'Equals' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2003:1: (otherlv_0= 'Equals' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2003:3: otherlv_0= 'Equals' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEquals4796); 

                	newLeafNode(otherlv_0, grammarAccess.getEqualsAccess().getEqualsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEquals4808); 

                	newLeafNode(otherlv_1, grammarAccess.getEqualsAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEquals4820); 

                	newLeafNode(otherlv_2, grammarAccess.getEqualsAccess().getLhsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2015:1: ( (lv_lhs_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2016:1: (lv_lhs_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2016:1: (lv_lhs_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2017:3: lv_lhs_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualsAccess().getLhsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEquals4841);
            lv_lhs_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualsRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEquals4853); 

                	newLeafNode(otherlv_4, grammarAccess.getEqualsAccess().getRhsKeyword_4());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2037:1: ( (lv_rhs_5_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2038:1: (lv_rhs_5_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2038:1: (lv_rhs_5_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2039:3: lv_rhs_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualsAccess().getRhsExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEquals4874);
            lv_rhs_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualsRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEquals4886); 

                	newLeafNode(otherlv_6, grammarAccess.getEqualsAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleGreater"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2067:1: entryRuleGreater returns [EObject current=null] : iv_ruleGreater= ruleGreater EOF ;
    public final EObject entryRuleGreater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreater = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2068:2: (iv_ruleGreater= ruleGreater EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2069:2: iv_ruleGreater= ruleGreater EOF
            {
             newCompositeNode(grammarAccess.getGreaterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGreater_in_entryRuleGreater4922);
            iv_ruleGreater=ruleGreater();

            state._fsp--;

             current =iv_ruleGreater; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGreater4932); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreater"


    // $ANTLR start "ruleGreater"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2076:1: ruleGreater returns [EObject current=null] : (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleGreater() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2079:28: ( (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2080:1: (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2080:1: (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2080:3: otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleGreater4969); 

                	newLeafNode(otherlv_0, grammarAccess.getGreaterAccess().getGreaterKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGreater4981); 

                	newLeafNode(otherlv_1, grammarAccess.getGreaterAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleGreater4993); 

                	newLeafNode(otherlv_2, grammarAccess.getGreaterAccess().getLhsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2092:1: ( (lv_lhs_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2093:1: (lv_lhs_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2093:1: (lv_lhs_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2094:3: lv_lhs_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getGreaterAccess().getLhsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGreater5014);
            lv_lhs_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGreaterRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleGreater5026); 

                	newLeafNode(otherlv_4, grammarAccess.getGreaterAccess().getRhsKeyword_4());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2114:1: ( (lv_rhs_5_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2115:1: (lv_rhs_5_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2115:1: (lv_rhs_5_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2116:3: lv_rhs_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getGreaterAccess().getRhsExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGreater5047);
            lv_rhs_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGreaterRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGreater5059); 

                	newLeafNode(otherlv_6, grammarAccess.getGreaterAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreater"


    // $ANTLR start "entryRuleLower"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2144:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2145:2: (iv_ruleLower= ruleLower EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2146:2: iv_ruleLower= ruleLower EOF
            {
             newCompositeNode(grammarAccess.getLowerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLower_in_entryRuleLower5095);
            iv_ruleLower=ruleLower();

            state._fsp--;

             current =iv_ruleLower; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLower5105); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLower"


    // $ANTLR start "ruleLower"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2153:1: ruleLower returns [EObject current=null] : (otherlv_0= 'Lower' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2156:28: ( (otherlv_0= 'Lower' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2157:1: (otherlv_0= 'Lower' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2157:1: (otherlv_0= 'Lower' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2157:3: otherlv_0= 'Lower' otherlv_1= '{' otherlv_2= 'lhs' ( (lv_lhs_3_0= ruleExpression ) ) otherlv_4= 'rhs' ( (lv_rhs_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleLower5142); 

                	newLeafNode(otherlv_0, grammarAccess.getLowerAccess().getLowerKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLower5154); 

                	newLeafNode(otherlv_1, grammarAccess.getLowerAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleLower5166); 

                	newLeafNode(otherlv_2, grammarAccess.getLowerAccess().getLhsKeyword_2());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2169:1: ( (lv_lhs_3_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2170:1: (lv_lhs_3_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2170:1: (lv_lhs_3_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2171:3: lv_lhs_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLowerAccess().getLhsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLower5187);
            lv_lhs_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLowerRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleLower5199); 

                	newLeafNode(otherlv_4, grammarAccess.getLowerAccess().getRhsKeyword_4());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2191:1: ( (lv_rhs_5_0= ruleExpression ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2192:1: (lv_rhs_5_0= ruleExpression )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2192:1: (lv_rhs_5_0= ruleExpression )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2193:3: lv_rhs_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLowerAccess().getRhsExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLower5220);
            lv_rhs_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLowerRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLower5232); 

                	newLeafNode(otherlv_6, grammarAccess.getLowerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLower"


    // $ANTLR start "entryRuleEInt"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2221:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2222:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2223:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt5269);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt5280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2230:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2233:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2234:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2234:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2234:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2234:2: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==55) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2235:2: kw= '-'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEInt5319); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt5336); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2255:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2256:2: (iv_ruleEString= ruleEString EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2257:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString5382);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString5393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2264:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2267:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2268:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2268:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2268:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString5433); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2276:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString5459); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameter"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2291:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2292:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2293:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter5504);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter5514); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2300:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2303:28: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2304:1: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2304:1: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2304:2: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2304:2: ()
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2305:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleParameter5560); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
                
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2314:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2315:1: (lv_name_2_0= ruleEString )
            {
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2315:1: (lv_name_2_0= ruleEString )
            // ../org.kermeta.language.sample.logo.xtexteditor/src-gen/org/kermeta/language/sample/logo/parser/antlr/internal/InternalLogoTextualSyntax.g:2316:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter5581);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogoProgram85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleLogoProgram131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLogoProgram143 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleLogoProgram156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLogoProgram168 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleLogoProgram189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleLogoProgram202 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleLogoProgram223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleLogoProgram237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLogoProgram251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstruction297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBack_in_ruleInstruction344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForward_in_ruleInstruction371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeft_in_ruleInstruction398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRight_in_ruleInstruction425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenDown_in_ruleInstruction452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenUp_in_ruleInstruction479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClear_in_ruleInstruction506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_ruleInstruction533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_ruleInstruction560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcDeclaration_in_ruleInstruction587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleInstruction614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIf_in_ruleInstruction641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleControlStructure_Impl_in_ruleInstruction668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepeat_in_ruleInstruction695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhile_in_ruleInstruction722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_ruleInstruction749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlus_in_ruleInstruction776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinus_in_ruleInstruction803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMult_in_ruleInstruction830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDiv_in_ruleInstruction857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquals_in_ruleInstruction884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreater_in_ruleInstruction911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLower_in_ruleInstruction938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression973 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_ruleExpression1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_ruleExpression1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_ruleExpression1084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlus_in_ruleExpression1111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinus_in_ruleExpression1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMult_in_ruleExpression1165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDiv_in_ruleExpression1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquals_in_ruleExpression1219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreater_in_ruleExpression1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLower_in_ruleExpression1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBack_in_entryRuleBack1308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBack1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleBack1355 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBack1367 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBack1379 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBack1400 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBack1412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForward_in_entryRuleForward1448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForward1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleForward1495 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleForward1507 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleForward1519 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForward1540 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleForward1552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft1588 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeft1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleLeft1644 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLeft1656 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleLeft1669 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLeft1690 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLeft1704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRight_in_entryRuleRight1740 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRight1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleRight1796 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRight1808 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleRight1821 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleRight1842 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRight1856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenDown_in_entryRulePenDown1892 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePenDown1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePenDown1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenUp_in_entryRulePenUp1984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePenUp1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulePenUp2040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClear_in_entryRuleClear2076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClear2086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleClear2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant2178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleConstant2224 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstant2236 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleConstant2249 = new BitSet(new long[]{0x0080000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstant2270 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConstant2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_entryRuleProcCall2320 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcCall2330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleProcCall2367 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProcCall2379 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleProcCall2391 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcCall2414 = new BitSet(new long[]{0x0000000020008000L});
        public static final BitSet FOLLOW_29_in_ruleProcCall2427 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProcCall2439 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleProcCall2460 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleProcCall2473 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleProcCall2494 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleProcCall2508 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProcCall2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcDeclaration_in_entryRuleProcDeclaration2558 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcDeclaration2568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleProcDeclaration2614 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcDeclaration2635 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProcDeclaration2647 = new BitSet(new long[]{0x000000048000A000L});
        public static final BitSet FOLLOW_31_in_ruleProcDeclaration2660 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleProcDeclaration2672 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcDeclaration2695 = new BitSet(new long[]{0x0000000200004000L});
        public static final BitSet FOLLOW_14_in_ruleProcDeclaration2708 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcDeclaration2731 = new BitSet(new long[]{0x0000000200004000L});
        public static final BitSet FOLLOW_33_in_ruleProcDeclaration2745 = new BitSet(new long[]{0x000000040000A000L});
        public static final BitSet FOLLOW_34_in_ruleProcDeclaration2760 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProcDeclaration2772 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleProcDeclaration2793 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleProcDeclaration2806 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleProcDeclaration2827 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleProcDeclaration2841 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleProcDeclaration2856 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProcDeclaration2868 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleProcDeclaration2889 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleProcDeclaration2902 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleProcDeclaration2923 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleProcDeclaration2937 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProcDeclaration2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock2987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock2997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBlock3043 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBlock3055 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleBlock3068 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBlock3080 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleBlock3101 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBlock3114 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleBlock3135 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBlock3149 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBlock3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIf_in_entryRuleIf3199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIf3209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleIf3246 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIf3258 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleIf3271 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIf3292 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleIf3306 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIf3327 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_39_in_ruleIf3340 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIf3361 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIf3375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleControlStructure_Impl_in_entryRuleControlStructure_Impl3411 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleControlStructure_Impl3421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleControlStructure_Impl3467 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleControlStructure_Impl3479 = new BitSet(new long[]{0x0000002000008000L});
        public static final BitSet FOLLOW_37_in_ruleControlStructure_Impl3492 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleControlStructure_Impl3513 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleControlStructure_Impl3527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepeat_in_entryRuleRepeat3563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRepeat3573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleRepeat3610 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRepeat3622 = new BitSet(new long[]{0x0000042000000000L});
        public static final BitSet FOLLOW_37_in_ruleRepeat3635 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleRepeat3656 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleRepeat3670 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleRepeat3691 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRepeat3703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile3739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhile3749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleWhile3786 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWhile3798 = new BitSet(new long[]{0x0000042000000000L});
        public static final BitSet FOLLOW_37_in_ruleWhile3811 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWhile3832 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleWhile3846 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhile3867 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWhile3879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_entryRuleParameterCall3915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterCall3925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleParameterCall3962 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterCall3974 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleParameterCall3986 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameterCall4009 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleParameterCall4021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlus_in_entryRulePlus4057 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePlus4067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rulePlus4104 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePlus4116 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_rulePlus4128 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePlus4149 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_rulePlus4161 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePlus4182 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePlus4194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinus_in_entryRuleMinus4230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMinus4240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleMinus4277 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMinus4289 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleMinus4301 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMinus4322 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleMinus4334 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMinus4355 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMinus4367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMult_in_entryRuleMult4403 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMult4413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleMult4450 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMult4462 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleMult4474 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMult4495 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleMult4507 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMult4528 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMult4540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDiv_in_entryRuleDiv4576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDiv4586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleDiv4623 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDiv4635 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleDiv4647 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDiv4668 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleDiv4680 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDiv4701 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDiv4713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquals_in_entryRuleEquals4749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquals4759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEquals4796 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEquals4808 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleEquals4820 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEquals4841 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleEquals4853 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEquals4874 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEquals4886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreater_in_entryRuleGreater4922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGreater4932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleGreater4969 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGreater4981 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleGreater4993 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGreater5014 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleGreater5026 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGreater5047 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGreater5059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLower_in_entryRuleLower5095 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLower5105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleLower5142 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLower5154 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleLower5166 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLower5187 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleLower5199 = new BitSet(new long[]{0x007E5B184BED0000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLower5220 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLower5232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt5269 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEInt5319 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt5336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString5382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString5393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString5433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString5459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter5514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleParameter5560 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter5581 = new BitSet(new long[]{0x0000000000000002L});
    }


}