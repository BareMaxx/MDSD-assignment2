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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'var'", "'='", "'external'", "'('", "','", "')'", "'int'", "'let'", "'in'", "'end'", "'+'", "'-'", "'*'", "'/'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "Program";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMath.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMath.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMath.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMath.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externals_2_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )* ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )* )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )* )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_externals_2_0= ruleExternal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:102:4: (lv_externals_2_0= ruleExternal )
            	    {
            	    // InternalMath.g:102:4: (lv_externals_2_0= ruleExternal )
            	    // InternalMath.g:103:5: lv_externals_2_0= ruleExternal
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExternalsExternalParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externals_2_0=ruleExternal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externals",
            	    						lv_externals_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.External");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:120:3: ( (lv_exp_3_0= ruleVar ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:121:4: (lv_exp_3_0= ruleVar )
            	    {
            	    // InternalMath.g:121:4: (lv_exp_3_0= ruleVar )
            	    // InternalMath.g:122:5: lv_exp_3_0= ruleVar
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExpVarParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_exp_3_0=ruleVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exp",
            	    						lv_exp_3_0,
            	    						"dk.sdu.mmmi.mdsd.Math.Var");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleVar"
    // InternalMath.g:143:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMath.g:143:44: (iv_ruleVar= ruleVar EOF )
            // InternalMath.g:144:2: iv_ruleVar= ruleVar EOF
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
    // InternalMath.g:150:1: ruleVar returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:156:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) ) ) )
            // InternalMath.g:157:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) ) )
            {
            // InternalMath.g:157:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) ) )
            // InternalMath.g:158:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarAccess().getVarKeyword_0());
            		
            // InternalMath.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVarAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:184:3: ( (lv_expression_3_0= rulePlusMinus ) )
            // InternalMath.g:185:4: (lv_expression_3_0= rulePlusMinus )
            {
            // InternalMath.g:185:4: (lv_expression_3_0= rulePlusMinus )
            // InternalMath.g:186:5: lv_expression_3_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getVarAccess().getExpressionPlusMinusParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=rulePlusMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.PlusMinus");
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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleExternal"
    // InternalMath.g:207:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalMath.g:207:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalMath.g:208:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalMath.g:214:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleCool ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleCool ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_params_3_0 = null;

        AntlrDatatypeRuleToken lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:220:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleCool ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleCool ) ) )* )? otherlv_6= ')' ) )
            // InternalMath.g:221:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleCool ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleCool ) ) )* )? otherlv_6= ')' )
            {
            // InternalMath.g:221:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleCool ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleCool ) ) )* )? otherlv_6= ')' )
            // InternalMath.g:222:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleCool ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleCool ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
            		
            // InternalMath.g:226:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:227:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:227:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:228:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:248:3: ( ( (lv_params_3_0= ruleCool ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleCool ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:249:4: ( (lv_params_3_0= ruleCool ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleCool ) ) )*
                    {
                    // InternalMath.g:249:4: ( (lv_params_3_0= ruleCool ) )
                    // InternalMath.g:250:5: (lv_params_3_0= ruleCool )
                    {
                    // InternalMath.g:250:5: (lv_params_3_0= ruleCool )
                    // InternalMath.g:251:6: lv_params_3_0= ruleCool
                    {

                    						newCompositeNode(grammarAccess.getExternalAccess().getParamsCoolParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_params_3_0=ruleCool();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"dk.sdu.mmmi.mdsd.Math.Cool");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:268:4: (otherlv_4= ',' ( (lv_params_5_0= ruleCool ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMath.g:269:5: otherlv_4= ',' ( (lv_params_5_0= ruleCool ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMath.g:273:5: ( (lv_params_5_0= ruleCool ) )
                    	    // InternalMath.g:274:6: (lv_params_5_0= ruleCool )
                    	    {
                    	    // InternalMath.g:274:6: (lv_params_5_0= ruleCool )
                    	    // InternalMath.g:275:7: lv_params_5_0= ruleCool
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalAccess().getParamsCoolParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_params_5_0=ruleCool();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"dk.sdu.mmmi.mdsd.Math.Cool");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleCool"
    // InternalMath.g:302:1: entryRuleCool returns [String current=null] : iv_ruleCool= ruleCool EOF ;
    public final String entryRuleCool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCool = null;


        try {
            // InternalMath.g:302:44: (iv_ruleCool= ruleCool EOF )
            // InternalMath.g:303:2: iv_ruleCool= ruleCool EOF
            {
             newCompositeNode(grammarAccess.getCoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCool=ruleCool();

            state._fsp--;

             current =iv_ruleCool.getText(); 
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
    // $ANTLR end "entryRuleCool"


    // $ANTLR start "ruleCool"
    // InternalMath.g:309:1: ruleCool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'int' ;
    public final AntlrDatatypeRuleToken ruleCool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMath.g:315:2: (kw= 'int' )
            // InternalMath.g:316:2: kw= 'int'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCoolAccess().getIntKeyword());
            	

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
    // $ANTLR end "ruleCool"


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:324:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalMath.g:324:44: (iv_ruleLet= ruleLet EOF )
            // InternalMath.g:325:2: iv_ruleLet= ruleLet EOF
            {
             newCompositeNode(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLet=ruleLet();

            state._fsp--;

             current =iv_ruleLet; 
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
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMath.g:331:1: ruleLet returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:337:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end' ) )
            // InternalMath.g:338:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:338:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end' )
            // InternalMath.g:339:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetAccess().getLetKeyword_0());
            		
            // InternalMath.g:343:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:344:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:344:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:345:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLetAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:365:3: ( (lv_binding_3_0= rulePlusMinus ) )
            // InternalMath.g:366:4: (lv_binding_3_0= rulePlusMinus )
            {
            // InternalMath.g:366:4: (lv_binding_3_0= rulePlusMinus )
            // InternalMath.g:367:5: lv_binding_3_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getLetAccess().getBindingPlusMinusParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_binding_3_0=rulePlusMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getLetAccess().getInKeyword_4());
            		
            // InternalMath.g:388:3: ( (lv_body_5_0= rulePlusMinus ) )
            // InternalMath.g:389:4: (lv_body_5_0= rulePlusMinus )
            {
            // InternalMath.g:389:4: (lv_body_5_0= rulePlusMinus )
            // InternalMath.g:390:5: lv_body_5_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getLetAccess().getBodyPlusMinusParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_body_5_0=rulePlusMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:415:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMath.g:415:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMath.g:416:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalMath.g:422:1: rulePlusMinus returns [EObject current=null] : (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:428:2: ( (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* ) )
            // InternalMath.g:429:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* )
            {
            // InternalMath.g:429:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* )
            // InternalMath.g:430:3: this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:438:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }
                else if ( (LA5_0==23) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:439:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) )
            	    {
            	    // InternalMath.g:439:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) )
            	    // InternalMath.g:440:5: () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:440:5: ()
            	    // InternalMath.g:441:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_7); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalMath.g:451:5: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalMath.g:452:6: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalMath.g:452:6: (lv_right_3_0= ruleTerm )
            	    // InternalMath.g:453:7: lv_right_3_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
            	    // InternalMath.g:472:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) )
            	    {
            	    // InternalMath.g:472:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) )
            	    // InternalMath.g:473:5: () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:473:5: ()
            	    // InternalMath.g:474:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,23,FOLLOW_7); 

            	    					newLeafNode(otherlv_5, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:484:5: ( (lv_right_6_0= ruleTerm ) )
            	    // InternalMath.g:485:6: (lv_right_6_0= ruleTerm )
            	    {
            	    // InternalMath.g:485:6: (lv_right_6_0= ruleTerm )
            	    // InternalMath.g:486:7: lv_right_6_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
            	    break loop5;
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
    // InternalMath.g:509:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMath.g:509:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMath.g:510:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalMath.g:516:1: ruleTerm returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:522:2: ( (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) )
            // InternalMath.g:523:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            {
            // InternalMath.g:523:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            // InternalMath.g:524:3: this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:532:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }
                else if ( (LA6_0==25) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:533:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:533:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalMath.g:534:5: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:534:5: ()
            	    // InternalMath.g:535:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getMultLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_7); 

            	    					newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalMath.g:545:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMath.g:546:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMath.g:546:6: (lv_right_3_0= rulePrimary )
            	    // InternalMath.g:547:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    // InternalMath.g:566:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:566:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalMath.g:567:5: () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:567:5: ()
            	    // InternalMath.g:568:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,25,FOLLOW_7); 

            	    					newLeafNode(otherlv_5, grammarAccess.getTermAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:578:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalMath.g:579:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalMath.g:579:6: (lv_right_6_0= rulePrimary )
            	    // InternalMath.g:580:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    break loop6;
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


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:603:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:603:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:604:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:610:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:616:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:617:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:617:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:618:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:618:3: (otherlv_0= RULE_ID )
            // InternalMath.g:619:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleParenthesies"
    // InternalMath.g:633:1: entryRuleParenthesies returns [EObject current=null] : iv_ruleParenthesies= ruleParenthesies EOF ;
    public final EObject entryRuleParenthesies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesies = null;


        try {
            // InternalMath.g:633:53: (iv_ruleParenthesies= ruleParenthesies EOF )
            // InternalMath.g:634:2: iv_ruleParenthesies= ruleParenthesies EOF
            {
             newCompositeNode(grammarAccess.getParenthesiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesies=ruleParenthesies();

            state._fsp--;

             current =iv_ruleParenthesies; 
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
    // $ANTLR end "entryRuleParenthesies"


    // $ANTLR start "ruleParenthesies"
    // InternalMath.g:640:1: ruleParenthesies returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_body_2_0= rulePlusMinus ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesies() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:646:2: ( ( () otherlv_1= '(' ( (lv_body_2_0= rulePlusMinus ) ) otherlv_3= ')' ) )
            // InternalMath.g:647:2: ( () otherlv_1= '(' ( (lv_body_2_0= rulePlusMinus ) ) otherlv_3= ')' )
            {
            // InternalMath.g:647:2: ( () otherlv_1= '(' ( (lv_body_2_0= rulePlusMinus ) ) otherlv_3= ')' )
            // InternalMath.g:648:3: () otherlv_1= '(' ( (lv_body_2_0= rulePlusMinus ) ) otherlv_3= ')'
            {
            // InternalMath.g:648:3: ()
            // InternalMath.g:649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesiesAccess().getParAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:659:3: ( (lv_body_2_0= rulePlusMinus ) )
            // InternalMath.g:660:4: (lv_body_2_0= rulePlusMinus )
            {
            // InternalMath.g:660:4: (lv_body_2_0= rulePlusMinus )
            // InternalMath.g:661:5: lv_body_2_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getParenthesiesAccess().getBodyPlusMinusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_2_0=rulePlusMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesiesRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesiesAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParenthesies"


    // $ANTLR start "entryRuleFunc"
    // InternalMath.g:686:1: entryRuleFunc returns [EObject current=null] : iv_ruleFunc= ruleFunc EOF ;
    public final EObject entryRuleFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunc = null;


        try {
            // InternalMath.g:686:45: (iv_ruleFunc= ruleFunc EOF )
            // InternalMath.g:687:2: iv_ruleFunc= ruleFunc EOF
            {
             newCompositeNode(grammarAccess.getFuncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunc=ruleFunc();

            state._fsp--;

             current =iv_ruleFunc; 
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
    // $ANTLR end "entryRuleFunc"


    // $ANTLR start "ruleFunc"
    // InternalMath.g:693:1: ruleFunc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:699:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')' ) )
            // InternalMath.g:700:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')' )
            {
            // InternalMath.g:700:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')' )
            // InternalMath.g:701:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')'
            {
            // InternalMath.g:701:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMath.g:702:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMath.g:702:4: (lv_name_0_0= RULE_ID )
            // InternalMath.g:703:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFuncAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:723:3: ( ( (lv_args_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||LA8_0==15||LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMath.g:724:4: ( (lv_args_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) ) )*
                    {
                    // InternalMath.g:724:4: ( (lv_args_2_0= rulePlusMinus ) )
                    // InternalMath.g:725:5: (lv_args_2_0= rulePlusMinus )
                    {
                    // InternalMath.g:725:5: (lv_args_2_0= rulePlusMinus )
                    // InternalMath.g:726:6: lv_args_2_0= rulePlusMinus
                    {

                    						newCompositeNode(grammarAccess.getFuncAccess().getArgsPlusMinusParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_args_2_0=rulePlusMinus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_2_0,
                    							"dk.sdu.mmmi.mdsd.Math.PlusMinus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:743:4: (otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMath.g:744:5: otherlv_3= ',' ( (lv_args_4_0= rulePlusMinus ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFuncAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMath.g:748:5: ( (lv_args_4_0= rulePlusMinus ) )
                    	    // InternalMath.g:749:6: (lv_args_4_0= rulePlusMinus )
                    	    {
                    	    // InternalMath.g:749:6: (lv_args_4_0= rulePlusMinus )
                    	    // InternalMath.g:750:7: lv_args_4_0= rulePlusMinus
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncAccess().getArgsPlusMinusParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_args_4_0=rulePlusMinus();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFuncRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_4_0,
                    	    								"dk.sdu.mmmi.mdsd.Math.PlusMinus");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFuncAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunc"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:777:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:777:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:778:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMath.g:784:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesies_2= ruleParenthesies | this_VariableUse_3= ruleVariableUse | this_Let_4= ruleLet | this_Func_5= ruleFunc ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Parenthesies_2 = null;

        EObject this_VariableUse_3 = null;

        EObject this_Let_4 = null;

        EObject this_Func_5 = null;



        	enterRule();

        try {
            // InternalMath.g:790:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesies_2= ruleParenthesies | this_VariableUse_3= ruleVariableUse | this_Let_4= ruleLet | this_Func_5= ruleFunc ) )
            // InternalMath.g:791:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesies_2= ruleParenthesies | this_VariableUse_3= ruleVariableUse | this_Let_4= ruleLet | this_Func_5= ruleFunc )
            {
            // InternalMath.g:791:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesies_2= ruleParenthesies | this_VariableUse_3= ruleVariableUse | this_Let_4= ruleLet | this_Func_5= ruleFunc )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==15) ) {
                    alt9=5;
                }
                else if ( (LA9_3==EOF||LA9_3==12||(LA9_3>=16 && LA9_3<=17)||(LA9_3>=20 && LA9_3<=25)) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMath.g:792:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:792:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:793:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:793:4: ()
                    // InternalMath.g:794:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMyNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:800:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:801:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:801:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:802:6: lv_value_1_0= RULE_INT
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
                    // InternalMath.g:820:3: this_Parenthesies_2= ruleParenthesies
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesiesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesies_2=ruleParenthesies();

                    state._fsp--;


                    			current = this_Parenthesies_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:829:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:838:3: this_Let_4= ruleLet
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Let_4=ruleLet();

                    state._fsp--;


                    			current = this_Let_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:847:3: this_Func_5= ruleFunc
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFuncParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Func_5=ruleFunc();

                    state._fsp--;


                    			current = this_Func_5;
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
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000088030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000A8030L});

}