package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:53:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleContainer EOF )
            // InternalMyDsl.g:55:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:62:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Container__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Container__Group__0 )
            // InternalMyDsl.g:69:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleABC"
    // InternalMyDsl.g:78:1: entryRuleABC : ruleABC EOF ;
    public final void entryRuleABC() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleABC EOF )
            // InternalMyDsl.g:80:1: ruleABC EOF
            {
             before(grammarAccess.getABCRule()); 
            pushFollow(FOLLOW_1);
            ruleABC();

            state._fsp--;

             after(grammarAccess.getABCRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleABC"


    // $ANTLR start "ruleABC"
    // InternalMyDsl.g:87:1: ruleABC : ( ( rule__ABC__Group__0 ) ) ;
    public final void ruleABC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ABC__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ABC__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ABC__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__ABC__Group__0 )
            {
             before(grammarAccess.getABCAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__ABC__Group__0 )
            // InternalMyDsl.g:94:4: rule__ABC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ABC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getABCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleABC"


    // $ANTLR start "rule__ABC__Alternatives_0"
    // InternalMyDsl.g:102:1: rule__ABC__Alternatives_0 : ( ( ( rule__ABC__Group_0_0__0 ) ) | ( ( rule__ABC__Group_0_1__0 ) ) );
    public final void rule__ABC__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:106:1: ( ( ( rule__ABC__Group_0_0__0 ) ) | ( ( rule__ABC__Group_0_1__0 ) ) )
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
                    // InternalMyDsl.g:107:2: ( ( rule__ABC__Group_0_0__0 ) )
                    {
                    // InternalMyDsl.g:107:2: ( ( rule__ABC__Group_0_0__0 ) )
                    // InternalMyDsl.g:108:3: ( rule__ABC__Group_0_0__0 )
                    {
                     before(grammarAccess.getABCAccess().getGroup_0_0()); 
                    // InternalMyDsl.g:109:3: ( rule__ABC__Group_0_0__0 )
                    // InternalMyDsl.g:109:4: rule__ABC__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ABC__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getABCAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:113:2: ( ( rule__ABC__Group_0_1__0 ) )
                    {
                    // InternalMyDsl.g:113:2: ( ( rule__ABC__Group_0_1__0 ) )
                    // InternalMyDsl.g:114:3: ( rule__ABC__Group_0_1__0 )
                    {
                     before(grammarAccess.getABCAccess().getGroup_0_1()); 
                    // InternalMyDsl.g:115:3: ( rule__ABC__Group_0_1__0 )
                    // InternalMyDsl.g:115:4: rule__ABC__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ABC__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getABCAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Alternatives_0"


    // $ANTLR start "rule__Container__Group__0"
    // InternalMyDsl.g:123:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:127:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalMyDsl.g:128:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalMyDsl.g:135:1: rule__Container__Group__0__Impl : ( 'container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:139:1: ( ( 'container' ) )
            // InternalMyDsl.g:140:1: ( 'container' )
            {
            // InternalMyDsl.g:140:1: ( 'container' )
            // InternalMyDsl.g:141:2: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalMyDsl.g:150:1: rule__Container__Group__1 : rule__Container__Group__1__Impl ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:154:1: ( rule__Container__Group__1__Impl )
            // InternalMyDsl.g:155:2: rule__Container__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalMyDsl.g:161:1: rule__Container__Group__1__Impl : ( ( rule__Container__ContainsAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:165:1: ( ( ( rule__Container__ContainsAssignment_1 ) ) )
            // InternalMyDsl.g:166:1: ( ( rule__Container__ContainsAssignment_1 ) )
            {
            // InternalMyDsl.g:166:1: ( ( rule__Container__ContainsAssignment_1 ) )
            // InternalMyDsl.g:167:2: ( rule__Container__ContainsAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getContainsAssignment_1()); 
            // InternalMyDsl.g:168:2: ( rule__Container__ContainsAssignment_1 )
            // InternalMyDsl.g:168:3: rule__Container__ContainsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__ContainsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getContainsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__ABC__Group__0"
    // InternalMyDsl.g:177:1: rule__ABC__Group__0 : rule__ABC__Group__0__Impl rule__ABC__Group__1 ;
    public final void rule__ABC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( rule__ABC__Group__0__Impl rule__ABC__Group__1 )
            // InternalMyDsl.g:182:2: rule__ABC__Group__0__Impl rule__ABC__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ABC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ABC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group__0"


    // $ANTLR start "rule__ABC__Group__0__Impl"
    // InternalMyDsl.g:189:1: rule__ABC__Group__0__Impl : ( ( rule__ABC__Alternatives_0 ) ) ;
    public final void rule__ABC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:193:1: ( ( ( rule__ABC__Alternatives_0 ) ) )
            // InternalMyDsl.g:194:1: ( ( rule__ABC__Alternatives_0 ) )
            {
            // InternalMyDsl.g:194:1: ( ( rule__ABC__Alternatives_0 ) )
            // InternalMyDsl.g:195:2: ( rule__ABC__Alternatives_0 )
            {
             before(grammarAccess.getABCAccess().getAlternatives_0()); 
            // InternalMyDsl.g:196:2: ( rule__ABC__Alternatives_0 )
            // InternalMyDsl.g:196:3: rule__ABC__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ABC__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getABCAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group__0__Impl"


    // $ANTLR start "rule__ABC__Group__1"
    // InternalMyDsl.g:204:1: rule__ABC__Group__1 : rule__ABC__Group__1__Impl ;
    public final void rule__ABC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:1: ( rule__ABC__Group__1__Impl )
            // InternalMyDsl.g:209:2: rule__ABC__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ABC__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group__1"


    // $ANTLR start "rule__ABC__Group__1__Impl"
    // InternalMyDsl.g:215:1: rule__ABC__Group__1__Impl : ( ( rule__ABC__NameAssignment_1 ) ) ;
    public final void rule__ABC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:219:1: ( ( ( rule__ABC__NameAssignment_1 ) ) )
            // InternalMyDsl.g:220:1: ( ( rule__ABC__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:220:1: ( ( rule__ABC__NameAssignment_1 ) )
            // InternalMyDsl.g:221:2: ( rule__ABC__NameAssignment_1 )
            {
             before(grammarAccess.getABCAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:222:2: ( rule__ABC__NameAssignment_1 )
            // InternalMyDsl.g:222:3: rule__ABC__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ABC__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getABCAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group__1__Impl"


    // $ANTLR start "rule__ABC__Group_0_0__0"
    // InternalMyDsl.g:231:1: rule__ABC__Group_0_0__0 : rule__ABC__Group_0_0__0__Impl rule__ABC__Group_0_0__1 ;
    public final void rule__ABC__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:235:1: ( rule__ABC__Group_0_0__0__Impl rule__ABC__Group_0_0__1 )
            // InternalMyDsl.g:236:2: rule__ABC__Group_0_0__0__Impl rule__ABC__Group_0_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ABC__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ABC__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group_0_0__0"


    // $ANTLR start "rule__ABC__Group_0_0__0__Impl"
    // InternalMyDsl.g:243:1: rule__ABC__Group_0_0__0__Impl : ( () ) ;
    public final void rule__ABC__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:247:1: ( ( () ) )
            // InternalMyDsl.g:248:1: ( () )
            {
            // InternalMyDsl.g:248:1: ( () )
            // InternalMyDsl.g:249:2: ()
            {
             before(grammarAccess.getABCAccess().getBCDAction_0_0_0()); 
            // InternalMyDsl.g:250:2: ()
            // InternalMyDsl.g:250:3: 
            {
            }

             after(grammarAccess.getABCAccess().getBCDAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group_0_0__0__Impl"


    // $ANTLR start "rule__ABC__Group_0_0__1"
    // InternalMyDsl.g:258:1: rule__ABC__Group_0_0__1 : rule__ABC__Group_0_0__1__Impl ;
    public final void rule__ABC__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:262:1: ( rule__ABC__Group_0_0__1__Impl )
            // InternalMyDsl.g:263:2: rule__ABC__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ABC__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group_0_0__1"


    // $ANTLR start "rule__ABC__Group_0_0__1__Impl"
    // InternalMyDsl.g:269:1: rule__ABC__Group_0_0__1__Impl : ( 'BCD' ) ;
    public final void rule__ABC__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:1: ( ( 'BCD' ) )
            // InternalMyDsl.g:274:1: ( 'BCD' )
            {
            // InternalMyDsl.g:274:1: ( 'BCD' )
            // InternalMyDsl.g:275:2: 'BCD'
            {
             before(grammarAccess.getABCAccess().getBCDKeyword_0_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getABCAccess().getBCDKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group_0_0__1__Impl"


    // $ANTLR start "rule__ABC__Group_0_1__0"
    // InternalMyDsl.g:285:1: rule__ABC__Group_0_1__0 : rule__ABC__Group_0_1__0__Impl rule__ABC__Group_0_1__1 ;
    public final void rule__ABC__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( rule__ABC__Group_0_1__0__Impl rule__ABC__Group_0_1__1 )
            // InternalMyDsl.g:290:2: rule__ABC__Group_0_1__0__Impl rule__ABC__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ABC__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ABC__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group_0_1__0"


    // $ANTLR start "rule__ABC__Group_0_1__0__Impl"
    // InternalMyDsl.g:297:1: rule__ABC__Group_0_1__0__Impl : ( () ) ;
    public final void rule__ABC__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:301:1: ( ( () ) )
            // InternalMyDsl.g:302:1: ( () )
            {
            // InternalMyDsl.g:302:1: ( () )
            // InternalMyDsl.g:303:2: ()
            {
             before(grammarAccess.getABCAccess().getCDEAction_0_1_0()); 
            // InternalMyDsl.g:304:2: ()
            // InternalMyDsl.g:304:3: 
            {
            }

             after(grammarAccess.getABCAccess().getCDEAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group_0_1__0__Impl"


    // $ANTLR start "rule__ABC__Group_0_1__1"
    // InternalMyDsl.g:312:1: rule__ABC__Group_0_1__1 : rule__ABC__Group_0_1__1__Impl ;
    public final void rule__ABC__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:1: ( rule__ABC__Group_0_1__1__Impl )
            // InternalMyDsl.g:317:2: rule__ABC__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ABC__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group_0_1__1"


    // $ANTLR start "rule__ABC__Group_0_1__1__Impl"
    // InternalMyDsl.g:323:1: rule__ABC__Group_0_1__1__Impl : ( 'CDE' ) ;
    public final void rule__ABC__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:327:1: ( ( 'CDE' ) )
            // InternalMyDsl.g:328:1: ( 'CDE' )
            {
            // InternalMyDsl.g:328:1: ( 'CDE' )
            // InternalMyDsl.g:329:2: 'CDE'
            {
             before(grammarAccess.getABCAccess().getCDEKeyword_0_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getABCAccess().getCDEKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__Group_0_1__1__Impl"


    // $ANTLR start "rule__Container__ContainsAssignment_1"
    // InternalMyDsl.g:339:1: rule__Container__ContainsAssignment_1 : ( ruleABC ) ;
    public final void rule__Container__ContainsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( ( ruleABC ) )
            // InternalMyDsl.g:344:2: ( ruleABC )
            {
            // InternalMyDsl.g:344:2: ( ruleABC )
            // InternalMyDsl.g:345:3: ruleABC
            {
             before(grammarAccess.getContainerAccess().getContainsABCParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleABC();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContainsABCParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ContainsAssignment_1"


    // $ANTLR start "rule__ABC__NameAssignment_1"
    // InternalMyDsl.g:354:1: rule__ABC__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ABC__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:359:2: ( RULE_ID )
            {
            // InternalMyDsl.g:359:2: ( RULE_ID )
            // InternalMyDsl.g:360:3: RULE_ID
            {
             before(grammarAccess.getABCAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getABCAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABC__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}