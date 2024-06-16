package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'container'", "'BCD'", "'CDE'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Container";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:64:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:64:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:65:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:71:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_contains_1_0= ruleABC ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_contains_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'container' ( (lv_contains_1_0= ruleABC ) ) ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'container' ( (lv_contains_1_0= ruleABC ) ) )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'container' ( (lv_contains_1_0= ruleABC ) ) )
            // InternalMyDsl.g:79:3: otherlv_0= 'container' ( (lv_contains_1_0= ruleABC ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_contains_1_0= ruleABC ) )
            // InternalMyDsl.g:84:4: (lv_contains_1_0= ruleABC )
            {
            // InternalMyDsl.g:84:4: (lv_contains_1_0= ruleABC )
            // InternalMyDsl.g:85:5: lv_contains_1_0= ruleABC
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getContainsABCParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_contains_1_0=ruleABC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"contains",
            						lv_contains_1_0,
            						"org.xtext.example.mydsl.MyDsl.ABC");
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleABC"
    // InternalMyDsl.g:106:1: entryRuleABC returns [EObject current=null] : iv_ruleABC= ruleABC EOF ;
    public final EObject entryRuleABC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleABC = null;


        try {
            // InternalMyDsl.g:106:44: (iv_ruleABC= ruleABC EOF )
            // InternalMyDsl.g:107:2: iv_ruleABC= ruleABC EOF
            {
             newCompositeNode(grammarAccess.getABCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleABC=ruleABC();

            state._fsp--;

             current =iv_ruleABC; 
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
    // $ANTLR end "entryRuleABC"


    // $ANTLR start "ruleABC"
    // InternalMyDsl.g:113:1: ruleABC returns [EObject current=null] : ( ( ( () otherlv_1= 'BCD' ) | ( () otherlv_3= 'CDE' ) ) ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleABC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:119:2: ( ( ( ( () otherlv_1= 'BCD' ) | ( () otherlv_3= 'CDE' ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:120:2: ( ( ( () otherlv_1= 'BCD' ) | ( () otherlv_3= 'CDE' ) ) ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:120:2: ( ( ( () otherlv_1= 'BCD' ) | ( () otherlv_3= 'CDE' ) ) ( (lv_name_4_0= RULE_ID ) ) )
            // InternalMyDsl.g:121:3: ( ( () otherlv_1= 'BCD' ) | ( () otherlv_3= 'CDE' ) ) ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalMyDsl.g:121:3: ( ( () otherlv_1= 'BCD' ) | ( () otherlv_3= 'CDE' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
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
                    // InternalMyDsl.g:122:4: ( () otherlv_1= 'BCD' )
                    {
                    // InternalMyDsl.g:122:4: ( () otherlv_1= 'BCD' )
                    // InternalMyDsl.g:123:5: () otherlv_1= 'BCD'
                    {
                    // InternalMyDsl.g:123:5: ()
                    // InternalMyDsl.g:124:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getABCAccess().getBCDAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getABCAccess().getBCDKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:136:4: ( () otherlv_3= 'CDE' )
                    {
                    // InternalMyDsl.g:136:4: ( () otherlv_3= 'CDE' )
                    // InternalMyDsl.g:137:5: () otherlv_3= 'CDE'
                    {
                    // InternalMyDsl.g:137:5: ()
                    // InternalMyDsl.g:138:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getABCAccess().getCDEAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getABCAccess().getCDEKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:150:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:151:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:151:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:152:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getABCAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getABCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleABC"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}