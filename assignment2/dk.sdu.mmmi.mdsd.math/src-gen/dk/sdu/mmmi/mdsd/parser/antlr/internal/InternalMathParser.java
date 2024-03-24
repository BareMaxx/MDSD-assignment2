package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var '", "' = '", "'let '", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : ( (lv_exp_0_0= ruleExp ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_exp_0_0= ruleExp ) ) )
            // InternalMath.g:78:2: ( (lv_exp_0_0= ruleExp ) )
            {
            // InternalMath.g:78:2: ( (lv_exp_0_0= ruleExp ) )
            // InternalMath.g:79:3: (lv_exp_0_0= ruleExp )
            {
            // InternalMath.g:79:3: (lv_exp_0_0= ruleExp )
            // InternalMath.g:80:4: lv_exp_0_0= ruleExp
            {

            				newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_exp_0_0=ruleExp();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMathExpRule());
            				}
            				set(
            					current,
            					"exp",
            					lv_exp_0_0,
            					"dk.sdu.mmmi.mdsd.Math.Exp");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:100:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:100:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:101:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:107:1: ruleExp returns [EObject current=null] : this_Var_0= ruleVar ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: (this_Var_0= ruleVar )
            // InternalMath.g:114:2: this_Var_0= ruleVar
            {

            		newCompositeNode(grammarAccess.getExpAccess().getVarParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Var_0=ruleVar();

            state._fsp--;


            		current = this_Var_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleVar"
    // InternalMath.g:125:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMath.g:125:44: (iv_ruleVar= ruleVar EOF )
            // InternalMath.g:126:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMath.g:132:1: ruleVar returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus ( ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) ) ) | ( () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) ) ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        EObject this_PlusMinus_0 = null;

        EObject lv_right_5_0 = null;

        EObject lv_right_10_0 = null;



        	enterRule();

        try {
            // InternalMath.g:138:2: ( (this_PlusMinus_0= rulePlusMinus ( ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) ) ) | ( () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) ) ) ) ) )
            // InternalMath.g:139:2: (this_PlusMinus_0= rulePlusMinus ( ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) ) ) | ( () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) ) ) ) )
            {
            // InternalMath.g:139:2: (this_PlusMinus_0= rulePlusMinus ( ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) ) ) | ( () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) ) ) ) )
            // InternalMath.g:140:3: this_PlusMinus_0= rulePlusMinus ( ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) ) ) | ( () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) ) ) )
            {

            			newCompositeNode(grammarAccess.getVarAccess().getPlusMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            			current = this_PlusMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:148:3: ( ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) ) ) | ( () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMath.g:149:4: ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) ) )
                    {
                    // InternalMath.g:149:4: ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) ) )
                    // InternalMath.g:150:5: () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleVar ) )
                    {
                    // InternalMath.g:150:5: ()
                    // InternalMath.g:151:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getVarAccess().getVarLeftAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,11,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getVarAccess().getVarKeyword_1_0_1());
                    				
                    // InternalMath.g:161:5: ( (lv_name_3_0= RULE_ID ) )
                    // InternalMath.g:162:6: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMath.g:162:6: (lv_name_3_0= RULE_ID )
                    // InternalMath.g:163:7: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    							newLeafNode(lv_name_3_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVarRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_0_3());
                    				
                    // InternalMath.g:183:5: ( (lv_right_5_0= ruleVar ) )
                    // InternalMath.g:184:6: (lv_right_5_0= ruleVar )
                    {
                    // InternalMath.g:184:6: (lv_right_5_0= ruleVar )
                    // InternalMath.g:185:7: lv_right_5_0= ruleVar
                    {

                    							newCompositeNode(grammarAccess.getVarAccess().getRightVarParserRuleCall_1_0_4_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_5_0=ruleVar();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVarRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_5_0,
                    								"dk.sdu.mmmi.mdsd.Math.Var");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:204:4: ( () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) ) )
                    {
                    // InternalMath.g:204:4: ( () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) ) )
                    // InternalMath.g:205:5: () otherlv_7= 'let ' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_right_10_0= rulePlusMinus ) )
                    {
                    // InternalMath.g:205:5: ()
                    // InternalMath.g:206:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getVarAccess().getLetLeftAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_7=(Token)match(input,13,FOLLOW_4); 

                    					newLeafNode(otherlv_7, grammarAccess.getVarAccess().getLetKeyword_1_1_1());
                    				
                    // InternalMath.g:216:5: ( (lv_name_8_0= RULE_ID ) )
                    // InternalMath.g:217:6: (lv_name_8_0= RULE_ID )
                    {
                    // InternalMath.g:217:6: (lv_name_8_0= RULE_ID )
                    // InternalMath.g:218:7: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    							newLeafNode(lv_name_8_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVarRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_8_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getVarAccess().getEqualsSignKeyword_1_1_3());
                    				
                    // InternalMath.g:238:5: ( (lv_right_10_0= rulePlusMinus ) )
                    // InternalMath.g:239:6: (lv_right_10_0= rulePlusMinus )
                    {
                    // InternalMath.g:239:6: (lv_right_10_0= rulePlusMinus )
                    // InternalMath.g:240:7: lv_right_10_0= rulePlusMinus
                    {

                    							newCompositeNode(grammarAccess.getVarAccess().getRightPlusMinusParserRuleCall_1_1_4_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_10_0=rulePlusMinus();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVarRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_10_0,
                    								"dk.sdu.mmmi.mdsd.Math.PlusMinus");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:263:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMath.g:263:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMath.g:264:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMath.g:270:1: rulePlusMinus returns [EObject current=null] : (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:276:2: ( (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* ) )
            // InternalMath.g:277:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* )
            {
            // InternalMath.g:277:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* )
            // InternalMath.g:278:3: this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:286:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }
                else if ( (LA2_0==16) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:287:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) )
            	    {
            	    // InternalMath.g:287:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) )
            	    // InternalMath.g:288:5: () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:288:5: ()
            	    // InternalMath.g:289:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalMath.g:299:5: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalMath.g:300:6: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalMath.g:300:6: (lv_right_3_0= ruleTerm )
            	    // InternalMath.g:301:7: lv_right_3_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMath.g:320:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) )
            	    {
            	    // InternalMath.g:320:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) )
            	    // InternalMath.g:321:5: () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:321:5: ()
            	    // InternalMath.g:322:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:332:5: ( (lv_right_6_0= ruleTerm ) )
            	    // InternalMath.g:333:6: (lv_right_6_0= ruleTerm )
            	    {
            	    // InternalMath.g:333:6: (lv_right_6_0= ruleTerm )
            	    // InternalMath.g:334:7: lv_right_6_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_6_0=ruleTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMath.g:357:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMath.g:357:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMath.g:358:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMath.g:364:1: ruleTerm returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:370:2: ( (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) )
            // InternalMath.g:371:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            {
            // InternalMath.g:371:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            // InternalMath.g:372:3: this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:380:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }
                else if ( (LA3_0==18) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:381:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:381:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalMath.g:382:5: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:382:5: ()
            	    // InternalMath.g:383:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getMultLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalMath.g:393:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMath.g:394:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMath.g:394:6: (lv_right_3_0= rulePrimary )
            	    // InternalMath.g:395:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTermRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMath.g:414:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:414:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalMath.g:415:5: () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:415:5: ()
            	    // InternalMath.g:416:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getTermAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:426:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalMath.g:427:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalMath.g:427:6: (lv_right_6_0= rulePrimary )
            	    // InternalMath.g:428:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_right_6_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTermRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:451:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:451:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:452:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:458:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Exp_3 = null;



        	enterRule();

        try {
            // InternalMath.g:464:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) )
            // InternalMath.g:465:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            {
            // InternalMath.g:465:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:466:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:466:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:467:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:467:4: ()
                    // InternalMath.g:468:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMyNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:474:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:475:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:475:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:476:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:494:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    {
                    // InternalMath.g:494:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    // InternalMath.g:495:4: otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Exp_3=ruleExp();

                    state._fsp--;


                    				current = this_Exp_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


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
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});

}