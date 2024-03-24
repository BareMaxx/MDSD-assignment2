package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleMathExp EOF )
            // InternalMath.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:62:1: ruleMathExp : ( ( rule__MathExp__ExpAssignment ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__MathExp__ExpAssignment ) ) )
            // InternalMath.g:67:2: ( ( rule__MathExp__ExpAssignment ) )
            {
            // InternalMath.g:67:2: ( ( rule__MathExp__ExpAssignment ) )
            // InternalMath.g:68:3: ( rule__MathExp__ExpAssignment )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment()); 
            // InternalMath.g:69:3: ( rule__MathExp__ExpAssignment )
            // InternalMath.g:69:4: rule__MathExp__ExpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment()); 

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:78:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleExp EOF )
            // InternalMath.g:80:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:87:1: ruleExp : ( ruleVar ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ruleVar ) )
            // InternalMath.g:92:2: ( ruleVar )
            {
            // InternalMath.g:92:2: ( ruleVar )
            // InternalMath.g:93:3: ruleVar
            {
             before(grammarAccess.getExpAccess().getVarParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getExpAccess().getVarParserRuleCall()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleVar"
    // InternalMath.g:103:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleVar EOF )
            // InternalMath.g:105:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMath.g:112:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Var__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Var__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Var__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Var__Group__0 )
            // InternalMath.g:119:4: rule__Var__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getGroup()); 

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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:128:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( rulePlusMinus EOF )
            // InternalMath.g:130:1: rulePlusMinus EOF
            {
             before(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getPlusMinusRule()); 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMath.g:137:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalMath.g:143:3: ( rule__PlusMinus__Group__0 )
            {
             before(grammarAccess.getPlusMinusAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__PlusMinus__Group__0 )
            // InternalMath.g:144:4: rule__PlusMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMath.g:153:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( ruleTerm EOF )
            // InternalMath.g:155:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMath.g:162:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMath.g:167:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMath.g:167:2: ( ( rule__Term__Group__0 ) )
            // InternalMath.g:168:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMath.g:169:3: ( rule__Term__Group__0 )
            // InternalMath.g:169:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:178:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( rulePrimary EOF )
            // InternalMath.g:180:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:187:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:192:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:192:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:193:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:194:3: ( rule__Primary__Alternatives )
            // InternalMath.g:194:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "rule__Var__Alternatives_1"
    // InternalMath.g:202:1: rule__Var__Alternatives_1 : ( ( ( rule__Var__Group_1_0__0 ) ) | ( ( rule__Var__Group_1_1__0 ) ) );
    public final void rule__Var__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:206:1: ( ( ( rule__Var__Group_1_0__0 ) ) | ( ( rule__Var__Group_1_1__0 ) ) )
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
                    // InternalMath.g:207:2: ( ( rule__Var__Group_1_0__0 ) )
                    {
                    // InternalMath.g:207:2: ( ( rule__Var__Group_1_0__0 ) )
                    // InternalMath.g:208:3: ( rule__Var__Group_1_0__0 )
                    {
                     before(grammarAccess.getVarAccess().getGroup_1_0()); 
                    // InternalMath.g:209:3: ( rule__Var__Group_1_0__0 )
                    // InternalMath.g:209:4: rule__Var__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:213:2: ( ( rule__Var__Group_1_1__0 ) )
                    {
                    // InternalMath.g:213:2: ( ( rule__Var__Group_1_1__0 ) )
                    // InternalMath.g:214:3: ( rule__Var__Group_1_1__0 )
                    {
                     before(grammarAccess.getVarAccess().getGroup_1_1()); 
                    // InternalMath.g:215:3: ( rule__Var__Group_1_1__0 )
                    // InternalMath.g:215:4: rule__Var__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Var__Alternatives_1"


    // $ANTLR start "rule__PlusMinus__Alternatives_1"
    // InternalMath.g:223:1: rule__PlusMinus__Alternatives_1 : ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:227:1: ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:228:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    {
                    // InternalMath.g:228:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    // InternalMath.g:229:3: ( rule__PlusMinus__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 
                    // InternalMath.g:230:3: ( rule__PlusMinus__Group_1_0__0 )
                    // InternalMath.g:230:4: rule__PlusMinus__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:234:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    {
                    // InternalMath.g:234:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    // InternalMath.g:235:3: ( rule__PlusMinus__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_1()); 
                    // InternalMath.g:236:3: ( rule__PlusMinus__Group_1_1__0 )
                    // InternalMath.g:236:4: rule__PlusMinus__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__PlusMinus__Alternatives_1"


    // $ANTLR start "rule__Term__Alternatives_1"
    // InternalMath.g:244:1: rule__Term__Alternatives_1 : ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) );
    public final void rule__Term__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:248:1: ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:249:2: ( ( rule__Term__Group_1_0__0 ) )
                    {
                    // InternalMath.g:249:2: ( ( rule__Term__Group_1_0__0 ) )
                    // InternalMath.g:250:3: ( rule__Term__Group_1_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0()); 
                    // InternalMath.g:251:3: ( rule__Term__Group_1_0__0 )
                    // InternalMath.g:251:4: rule__Term__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:255:2: ( ( rule__Term__Group_1_1__0 ) )
                    {
                    // InternalMath.g:255:2: ( ( rule__Term__Group_1_1__0 ) )
                    // InternalMath.g:256:3: ( rule__Term__Group_1_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_1()); 
                    // InternalMath.g:257:3: ( rule__Term__Group_1_1__0 )
                    // InternalMath.g:257:4: rule__Term__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Term__Alternatives_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:265:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:269:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) )
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
                    // InternalMath.g:270:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMath.g:270:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMath.g:271:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMath.g:272:3: ( rule__Primary__Group_0__0 )
                    // InternalMath.g:272:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:276:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMath.g:276:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMath.g:277:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMath.g:278:3: ( rule__Primary__Group_1__0 )
                    // InternalMath.g:278:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Var__Group__0"
    // InternalMath.g:286:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:290:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalMath.g:291:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Var__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__1();

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
    // $ANTLR end "rule__Var__Group__0"


    // $ANTLR start "rule__Var__Group__0__Impl"
    // InternalMath.g:298:1: rule__Var__Group__0__Impl : ( rulePlusMinus ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:302:1: ( ( rulePlusMinus ) )
            // InternalMath.g:303:1: ( rulePlusMinus )
            {
            // InternalMath.g:303:1: ( rulePlusMinus )
            // InternalMath.g:304:2: rulePlusMinus
            {
             before(grammarAccess.getVarAccess().getPlusMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getVarAccess().getPlusMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__Var__Group__0__Impl"


    // $ANTLR start "rule__Var__Group__1"
    // InternalMath.g:313:1: rule__Var__Group__1 : rule__Var__Group__1__Impl ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:317:1: ( rule__Var__Group__1__Impl )
            // InternalMath.g:318:2: rule__Var__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__1__Impl();

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
    // $ANTLR end "rule__Var__Group__1"


    // $ANTLR start "rule__Var__Group__1__Impl"
    // InternalMath.g:324:1: rule__Var__Group__1__Impl : ( ( rule__Var__Alternatives_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:328:1: ( ( ( rule__Var__Alternatives_1 ) ) )
            // InternalMath.g:329:1: ( ( rule__Var__Alternatives_1 ) )
            {
            // InternalMath.g:329:1: ( ( rule__Var__Alternatives_1 ) )
            // InternalMath.g:330:2: ( rule__Var__Alternatives_1 )
            {
             before(grammarAccess.getVarAccess().getAlternatives_1()); 
            // InternalMath.g:331:2: ( rule__Var__Alternatives_1 )
            // InternalMath.g:331:3: rule__Var__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Var__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Var__Group__1__Impl"


    // $ANTLR start "rule__Var__Group_1_0__0"
    // InternalMath.g:340:1: rule__Var__Group_1_0__0 : rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1 ;
    public final void rule__Var__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:344:1: ( rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1 )
            // InternalMath.g:345:2: rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Var__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1_0__1();

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
    // $ANTLR end "rule__Var__Group_1_0__0"


    // $ANTLR start "rule__Var__Group_1_0__0__Impl"
    // InternalMath.g:352:1: rule__Var__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Var__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:356:1: ( ( () ) )
            // InternalMath.g:357:1: ( () )
            {
            // InternalMath.g:357:1: ( () )
            // InternalMath.g:358:2: ()
            {
             before(grammarAccess.getVarAccess().getVarLeftAction_1_0_0()); 
            // InternalMath.g:359:2: ()
            // InternalMath.g:359:3: 
            {
            }

             after(grammarAccess.getVarAccess().getVarLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1_0__0__Impl"


    // $ANTLR start "rule__Var__Group_1_0__1"
    // InternalMath.g:367:1: rule__Var__Group_1_0__1 : rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2 ;
    public final void rule__Var__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:371:1: ( rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2 )
            // InternalMath.g:372:2: rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Var__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1_0__2();

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
    // $ANTLR end "rule__Var__Group_1_0__1"


    // $ANTLR start "rule__Var__Group_1_0__1__Impl"
    // InternalMath.g:379:1: rule__Var__Group_1_0__1__Impl : ( 'var ' ) ;
    public final void rule__Var__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:383:1: ( ( 'var ' ) )
            // InternalMath.g:384:1: ( 'var ' )
            {
            // InternalMath.g:384:1: ( 'var ' )
            // InternalMath.g:385:2: 'var '
            {
             before(grammarAccess.getVarAccess().getVarKeyword_1_0_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getVarKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Var__Group_1_0__1__Impl"


    // $ANTLR start "rule__Var__Group_1_0__2"
    // InternalMath.g:394:1: rule__Var__Group_1_0__2 : rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3 ;
    public final void rule__Var__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:398:1: ( rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3 )
            // InternalMath.g:399:2: rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3
            {
            pushFollow(FOLLOW_6);
            rule__Var__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1_0__3();

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
    // $ANTLR end "rule__Var__Group_1_0__2"


    // $ANTLR start "rule__Var__Group_1_0__2__Impl"
    // InternalMath.g:406:1: rule__Var__Group_1_0__2__Impl : ( ( rule__Var__NameAssignment_1_0_2 ) ) ;
    public final void rule__Var__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:410:1: ( ( ( rule__Var__NameAssignment_1_0_2 ) ) )
            // InternalMath.g:411:1: ( ( rule__Var__NameAssignment_1_0_2 ) )
            {
            // InternalMath.g:411:1: ( ( rule__Var__NameAssignment_1_0_2 ) )
            // InternalMath.g:412:2: ( rule__Var__NameAssignment_1_0_2 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1_0_2()); 
            // InternalMath.g:413:2: ( rule__Var__NameAssignment_1_0_2 )
            // InternalMath.g:413:3: rule__Var__NameAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Var__NameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Var__Group_1_0__2__Impl"


    // $ANTLR start "rule__Var__Group_1_0__3"
    // InternalMath.g:421:1: rule__Var__Group_1_0__3 : rule__Var__Group_1_0__3__Impl rule__Var__Group_1_0__4 ;
    public final void rule__Var__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:425:1: ( rule__Var__Group_1_0__3__Impl rule__Var__Group_1_0__4 )
            // InternalMath.g:426:2: rule__Var__Group_1_0__3__Impl rule__Var__Group_1_0__4
            {
            pushFollow(FOLLOW_7);
            rule__Var__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1_0__4();

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
    // $ANTLR end "rule__Var__Group_1_0__3"


    // $ANTLR start "rule__Var__Group_1_0__3__Impl"
    // InternalMath.g:433:1: rule__Var__Group_1_0__3__Impl : ( ' = ' ) ;
    public final void rule__Var__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:437:1: ( ( ' = ' ) )
            // InternalMath.g:438:1: ( ' = ' )
            {
            // InternalMath.g:438:1: ( ' = ' )
            // InternalMath.g:439:2: ' = '
            {
             before(grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_0_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_0_3()); 

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
    // $ANTLR end "rule__Var__Group_1_0__3__Impl"


    // $ANTLR start "rule__Var__Group_1_0__4"
    // InternalMath.g:448:1: rule__Var__Group_1_0__4 : rule__Var__Group_1_0__4__Impl ;
    public final void rule__Var__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:452:1: ( rule__Var__Group_1_0__4__Impl )
            // InternalMath.g:453:2: rule__Var__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group_1_0__4__Impl();

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
    // $ANTLR end "rule__Var__Group_1_0__4"


    // $ANTLR start "rule__Var__Group_1_0__4__Impl"
    // InternalMath.g:459:1: rule__Var__Group_1_0__4__Impl : ( ( rule__Var__RightAssignment_1_0_4 ) ) ;
    public final void rule__Var__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:463:1: ( ( ( rule__Var__RightAssignment_1_0_4 ) ) )
            // InternalMath.g:464:1: ( ( rule__Var__RightAssignment_1_0_4 ) )
            {
            // InternalMath.g:464:1: ( ( rule__Var__RightAssignment_1_0_4 ) )
            // InternalMath.g:465:2: ( rule__Var__RightAssignment_1_0_4 )
            {
             before(grammarAccess.getVarAccess().getRightAssignment_1_0_4()); 
            // InternalMath.g:466:2: ( rule__Var__RightAssignment_1_0_4 )
            // InternalMath.g:466:3: rule__Var__RightAssignment_1_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Var__RightAssignment_1_0_4();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getRightAssignment_1_0_4()); 

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
    // $ANTLR end "rule__Var__Group_1_0__4__Impl"


    // $ANTLR start "rule__Var__Group_1_1__0"
    // InternalMath.g:475:1: rule__Var__Group_1_1__0 : rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1 ;
    public final void rule__Var__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:479:1: ( rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1 )
            // InternalMath.g:480:2: rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Var__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1_1__1();

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
    // $ANTLR end "rule__Var__Group_1_1__0"


    // $ANTLR start "rule__Var__Group_1_1__0__Impl"
    // InternalMath.g:487:1: rule__Var__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Var__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:491:1: ( ( () ) )
            // InternalMath.g:492:1: ( () )
            {
            // InternalMath.g:492:1: ( () )
            // InternalMath.g:493:2: ()
            {
             before(grammarAccess.getVarAccess().getLetLeftAction_1_1_0()); 
            // InternalMath.g:494:2: ()
            // InternalMath.g:494:3: 
            {
            }

             after(grammarAccess.getVarAccess().getLetLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1_1__0__Impl"


    // $ANTLR start "rule__Var__Group_1_1__1"
    // InternalMath.g:502:1: rule__Var__Group_1_1__1 : rule__Var__Group_1_1__1__Impl rule__Var__Group_1_1__2 ;
    public final void rule__Var__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:506:1: ( rule__Var__Group_1_1__1__Impl rule__Var__Group_1_1__2 )
            // InternalMath.g:507:2: rule__Var__Group_1_1__1__Impl rule__Var__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Var__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1_1__2();

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
    // $ANTLR end "rule__Var__Group_1_1__1"


    // $ANTLR start "rule__Var__Group_1_1__1__Impl"
    // InternalMath.g:514:1: rule__Var__Group_1_1__1__Impl : ( 'let ' ) ;
    public final void rule__Var__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:518:1: ( ( 'let ' ) )
            // InternalMath.g:519:1: ( 'let ' )
            {
            // InternalMath.g:519:1: ( 'let ' )
            // InternalMath.g:520:2: 'let '
            {
             before(grammarAccess.getVarAccess().getLetKeyword_1_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getLetKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Var__Group_1_1__1__Impl"


    // $ANTLR start "rule__Var__Group_1_1__2"
    // InternalMath.g:529:1: rule__Var__Group_1_1__2 : rule__Var__Group_1_1__2__Impl rule__Var__Group_1_1__3 ;
    public final void rule__Var__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:533:1: ( rule__Var__Group_1_1__2__Impl rule__Var__Group_1_1__3 )
            // InternalMath.g:534:2: rule__Var__Group_1_1__2__Impl rule__Var__Group_1_1__3
            {
            pushFollow(FOLLOW_8);
            rule__Var__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1_1__3();

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
    // $ANTLR end "rule__Var__Group_1_1__2"


    // $ANTLR start "rule__Var__Group_1_1__2__Impl"
    // InternalMath.g:541:1: rule__Var__Group_1_1__2__Impl : ( ( rule__Var__NameAssignment_1_1_2 ) ) ;
    public final void rule__Var__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:545:1: ( ( ( rule__Var__NameAssignment_1_1_2 ) ) )
            // InternalMath.g:546:1: ( ( rule__Var__NameAssignment_1_1_2 ) )
            {
            // InternalMath.g:546:1: ( ( rule__Var__NameAssignment_1_1_2 ) )
            // InternalMath.g:547:2: ( rule__Var__NameAssignment_1_1_2 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1_1_2()); 
            // InternalMath.g:548:2: ( rule__Var__NameAssignment_1_1_2 )
            // InternalMath.g:548:3: rule__Var__NameAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var__NameAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Var__Group_1_1__2__Impl"


    // $ANTLR start "rule__Var__Group_1_1__3"
    // InternalMath.g:556:1: rule__Var__Group_1_1__3 : rule__Var__Group_1_1__3__Impl rule__Var__Group_1_1__4 ;
    public final void rule__Var__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:560:1: ( rule__Var__Group_1_1__3__Impl rule__Var__Group_1_1__4 )
            // InternalMath.g:561:2: rule__Var__Group_1_1__3__Impl rule__Var__Group_1_1__4
            {
            pushFollow(FOLLOW_7);
            rule__Var__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1_1__4();

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
    // $ANTLR end "rule__Var__Group_1_1__3"


    // $ANTLR start "rule__Var__Group_1_1__3__Impl"
    // InternalMath.g:568:1: rule__Var__Group_1_1__3__Impl : ( '=' ) ;
    public final void rule__Var__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:572:1: ( ( '=' ) )
            // InternalMath.g:573:1: ( '=' )
            {
            // InternalMath.g:573:1: ( '=' )
            // InternalMath.g:574:2: '='
            {
             before(grammarAccess.getVarAccess().getEqualsSignKeyword_1_1_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getEqualsSignKeyword_1_1_3()); 

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
    // $ANTLR end "rule__Var__Group_1_1__3__Impl"


    // $ANTLR start "rule__Var__Group_1_1__4"
    // InternalMath.g:583:1: rule__Var__Group_1_1__4 : rule__Var__Group_1_1__4__Impl ;
    public final void rule__Var__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:587:1: ( rule__Var__Group_1_1__4__Impl )
            // InternalMath.g:588:2: rule__Var__Group_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group_1_1__4__Impl();

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
    // $ANTLR end "rule__Var__Group_1_1__4"


    // $ANTLR start "rule__Var__Group_1_1__4__Impl"
    // InternalMath.g:594:1: rule__Var__Group_1_1__4__Impl : ( ( rule__Var__RightAssignment_1_1_4 ) ) ;
    public final void rule__Var__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:598:1: ( ( ( rule__Var__RightAssignment_1_1_4 ) ) )
            // InternalMath.g:599:1: ( ( rule__Var__RightAssignment_1_1_4 ) )
            {
            // InternalMath.g:599:1: ( ( rule__Var__RightAssignment_1_1_4 ) )
            // InternalMath.g:600:2: ( rule__Var__RightAssignment_1_1_4 )
            {
             before(grammarAccess.getVarAccess().getRightAssignment_1_1_4()); 
            // InternalMath.g:601:2: ( rule__Var__RightAssignment_1_1_4 )
            // InternalMath.g:601:3: rule__Var__RightAssignment_1_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Var__RightAssignment_1_1_4();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getRightAssignment_1_1_4()); 

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
    // $ANTLR end "rule__Var__Group_1_1__4__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalMath.g:610:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:614:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalMath.g:615:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PlusMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1();

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
    // $ANTLR end "rule__PlusMinus__Group__0"


    // $ANTLR start "rule__PlusMinus__Group__0__Impl"
    // InternalMath.g:622:1: rule__PlusMinus__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:626:1: ( ( ruleTerm ) )
            // InternalMath.g:627:1: ( ruleTerm )
            {
            // InternalMath.g:627:1: ( ruleTerm )
            // InternalMath.g:628:2: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group__1"
    // InternalMath.g:637:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:641:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalMath.g:642:2: rule__PlusMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group__1"


    // $ANTLR start "rule__PlusMinus__Group__1__Impl"
    // InternalMath.g:648:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Alternatives_1 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:652:1: ( ( ( rule__PlusMinus__Alternatives_1 )* ) )
            // InternalMath.g:653:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            {
            // InternalMath.g:653:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            // InternalMath.g:654:2: ( rule__PlusMinus__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives_1()); 
            // InternalMath.g:655:2: ( rule__PlusMinus__Alternatives_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:655:3: rule__PlusMinus__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PlusMinus__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPlusMinusAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__0"
    // InternalMath.g:664:1: rule__PlusMinus__Group_1_0__0 : rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 ;
    public final void rule__PlusMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:668:1: ( rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 )
            // InternalMath.g:669:2: rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__PlusMinus__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0__0__Impl"
    // InternalMath.g:676:1: rule__PlusMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:680:1: ( ( () ) )
            // InternalMath.g:681:1: ( () )
            {
            // InternalMath.g:681:1: ( () )
            // InternalMath.g:682:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0()); 
            // InternalMath.g:683:2: ()
            // InternalMath.g:683:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__1"
    // InternalMath.g:691:1: rule__PlusMinus__Group_1_0__1 : rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 ;
    public final void rule__PlusMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:695:1: ( rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 )
            // InternalMath.g:696:2: rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__PlusMinus__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__2();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0__1__Impl"
    // InternalMath.g:703:1: rule__PlusMinus__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:707:1: ( ( '+' ) )
            // InternalMath.g:708:1: ( '+' )
            {
            // InternalMath.g:708:1: ( '+' )
            // InternalMath.g:709:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1_0__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__2"
    // InternalMath.g:718:1: rule__PlusMinus__Group_1_0__2 : rule__PlusMinus__Group_1_0__2__Impl ;
    public final void rule__PlusMinus__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:722:1: ( rule__PlusMinus__Group_1_0__2__Impl )
            // InternalMath.g:723:2: rule__PlusMinus__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0__2"


    // $ANTLR start "rule__PlusMinus__Group_1_0__2__Impl"
    // InternalMath.g:729:1: rule__PlusMinus__Group_1_0__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinus__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:733:1: ( ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:734:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:734:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            // InternalMath.g:735:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:736:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            // InternalMath.g:736:3: rule__PlusMinus__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1_0__2__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__0"
    // InternalMath.g:745:1: rule__PlusMinus__Group_1_1__0 : rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 ;
    public final void rule__PlusMinus__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:749:1: ( rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 )
            // InternalMath.g:750:2: rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__PlusMinus__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1_1__0__Impl"
    // InternalMath.g:757:1: rule__PlusMinus__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:761:1: ( ( () ) )
            // InternalMath.g:762:1: ( () )
            {
            // InternalMath.g:762:1: ( () )
            // InternalMath.g:763:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0()); 
            // InternalMath.g:764:2: ()
            // InternalMath.g:764:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__1"
    // InternalMath.g:772:1: rule__PlusMinus__Group_1_1__1 : rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 ;
    public final void rule__PlusMinus__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:776:1: ( rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 )
            // InternalMath.g:777:2: rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__PlusMinus__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__2();

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
    // $ANTLR end "rule__PlusMinus__Group_1_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1_1__1__Impl"
    // InternalMath.g:784:1: rule__PlusMinus__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:788:1: ( ( '-' ) )
            // InternalMath.g:789:1: ( '-' )
            {
            // InternalMath.g:789:1: ( '-' )
            // InternalMath.g:790:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1_1__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__2"
    // InternalMath.g:799:1: rule__PlusMinus__Group_1_1__2 : rule__PlusMinus__Group_1_1__2__Impl ;
    public final void rule__PlusMinus__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:803:1: ( rule__PlusMinus__Group_1_1__2__Impl )
            // InternalMath.g:804:2: rule__PlusMinus__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1_1__2"


    // $ANTLR start "rule__PlusMinus__Group_1_1__2__Impl"
    // InternalMath.g:810:1: rule__PlusMinus__Group_1_1__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinus__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:814:1: ( ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:815:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:815:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            // InternalMath.g:816:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:817:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            // InternalMath.g:817:3: rule__PlusMinus__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1_1__2__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalMath.g:826:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:830:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMath.g:831:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

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
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalMath.g:838:1: rule__Term__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:842:1: ( ( rulePrimary ) )
            // InternalMath.g:843:1: ( rulePrimary )
            {
            // InternalMath.g:843:1: ( rulePrimary )
            // InternalMath.g:844:2: rulePrimary
            {
             before(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalMath.g:853:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:857:1: ( rule__Term__Group__1__Impl )
            // InternalMath.g:858:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

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
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalMath.g:864:1: rule__Term__Group__1__Impl : ( ( rule__Term__Alternatives_1 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:868:1: ( ( ( rule__Term__Alternatives_1 )* ) )
            // InternalMath.g:869:1: ( ( rule__Term__Alternatives_1 )* )
            {
            // InternalMath.g:869:1: ( ( rule__Term__Alternatives_1 )* )
            // InternalMath.g:870:2: ( rule__Term__Alternatives_1 )*
            {
             before(grammarAccess.getTermAccess().getAlternatives_1()); 
            // InternalMath.g:871:2: ( rule__Term__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:871:3: rule__Term__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Term__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__0"
    // InternalMath.g:880:1: rule__Term__Group_1_0__0 : rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 ;
    public final void rule__Term__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:884:1: ( rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 )
            // InternalMath.g:885:2: rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Term__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__1();

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
    // $ANTLR end "rule__Term__Group_1_0__0"


    // $ANTLR start "rule__Term__Group_1_0__0__Impl"
    // InternalMath.g:892:1: rule__Term__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:896:1: ( ( () ) )
            // InternalMath.g:897:1: ( () )
            {
            // InternalMath.g:897:1: ( () )
            // InternalMath.g:898:2: ()
            {
             before(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 
            // InternalMath.g:899:2: ()
            // InternalMath.g:899:3: 
            {
            }

             after(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0__1"
    // InternalMath.g:907:1: rule__Term__Group_1_0__1 : rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 ;
    public final void rule__Term__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:911:1: ( rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 )
            // InternalMath.g:912:2: rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Term__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__2();

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
    // $ANTLR end "rule__Term__Group_1_0__1"


    // $ANTLR start "rule__Term__Group_1_0__1__Impl"
    // InternalMath.g:919:1: rule__Term__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:923:1: ( ( '*' ) )
            // InternalMath.g:924:1: ( '*' )
            {
            // InternalMath.g:924:1: ( '*' )
            // InternalMath.g:925:2: '*'
            {
             before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Term__Group_1_0__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__2"
    // InternalMath.g:934:1: rule__Term__Group_1_0__2 : rule__Term__Group_1_0__2__Impl ;
    public final void rule__Term__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:938:1: ( rule__Term__Group_1_0__2__Impl )
            // InternalMath.g:939:2: rule__Term__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Term__Group_1_0__2"


    // $ANTLR start "rule__Term__Group_1_0__2__Impl"
    // InternalMath.g:945:1: rule__Term__Group_1_0__2__Impl : ( ( rule__Term__RightAssignment_1_0_2 ) ) ;
    public final void rule__Term__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:949:1: ( ( ( rule__Term__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:950:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:950:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            // InternalMath.g:951:2: ( rule__Term__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:952:2: ( rule__Term__RightAssignment_1_0_2 )
            // InternalMath.g:952:3: rule__Term__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Term__Group_1_0__2__Impl"


    // $ANTLR start "rule__Term__Group_1_1__0"
    // InternalMath.g:961:1: rule__Term__Group_1_1__0 : rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 ;
    public final void rule__Term__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:965:1: ( rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 )
            // InternalMath.g:966:2: rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Term__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__1();

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
    // $ANTLR end "rule__Term__Group_1_1__0"


    // $ANTLR start "rule__Term__Group_1_1__0__Impl"
    // InternalMath.g:973:1: rule__Term__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:977:1: ( ( () ) )
            // InternalMath.g:978:1: ( () )
            {
            // InternalMath.g:978:1: ( () )
            // InternalMath.g:979:2: ()
            {
             before(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 
            // InternalMath.g:980:2: ()
            // InternalMath.g:980:3: 
            {
            }

             after(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1_1__1"
    // InternalMath.g:988:1: rule__Term__Group_1_1__1 : rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 ;
    public final void rule__Term__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:992:1: ( rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 )
            // InternalMath.g:993:2: rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Term__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__2();

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
    // $ANTLR end "rule__Term__Group_1_1__1"


    // $ANTLR start "rule__Term__Group_1_1__1__Impl"
    // InternalMath.g:1000:1: rule__Term__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1004:1: ( ( '/' ) )
            // InternalMath.g:1005:1: ( '/' )
            {
            // InternalMath.g:1005:1: ( '/' )
            // InternalMath.g:1006:2: '/'
            {
             before(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Term__Group_1_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_1__2"
    // InternalMath.g:1015:1: rule__Term__Group_1_1__2 : rule__Term__Group_1_1__2__Impl ;
    public final void rule__Term__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1019:1: ( rule__Term__Group_1_1__2__Impl )
            // InternalMath.g:1020:2: rule__Term__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Term__Group_1_1__2"


    // $ANTLR start "rule__Term__Group_1_1__2__Impl"
    // InternalMath.g:1026:1: rule__Term__Group_1_1__2__Impl : ( ( rule__Term__RightAssignment_1_1_2 ) ) ;
    public final void rule__Term__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1030:1: ( ( ( rule__Term__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:1031:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:1031:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            // InternalMath.g:1032:2: ( rule__Term__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:1033:2: ( rule__Term__RightAssignment_1_1_2 )
            // InternalMath.g:1033:3: rule__Term__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Term__Group_1_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMath.g:1042:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1046:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMath.g:1047:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMath.g:1054:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1058:1: ( ( () ) )
            // InternalMath.g:1059:1: ( () )
            {
            // InternalMath.g:1059:1: ( () )
            // InternalMath.g:1060:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); 
            // InternalMath.g:1061:2: ()
            // InternalMath.g:1061:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMath.g:1069:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1073:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMath.g:1074:2: rule__Primary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMath.g:1080:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1084:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMath.g:1085:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMath.g:1085:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMath.g:1086:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMath.g:1087:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMath.g:1087:3: rule__Primary__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMath.g:1096:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1100:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMath.g:1101:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMath.g:1108:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1112:1: ( ( '(' ) )
            // InternalMath.g:1113:1: ( '(' )
            {
            // InternalMath.g:1113:1: ( '(' )
            // InternalMath.g:1114:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMath.g:1123:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1127:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMath.g:1128:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMath.g:1135:1: rule__Primary__Group_1__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1139:1: ( ( ruleExp ) )
            // InternalMath.g:1140:1: ( ruleExp )
            {
            // InternalMath.g:1140:1: ( ruleExp )
            // InternalMath.g:1141:2: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMath.g:1150:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1154:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMath.g:1155:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMath.g:1161:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1165:1: ( ( ')' ) )
            // InternalMath.g:1166:1: ( ')' )
            {
            // InternalMath.g:1166:1: ( ')' )
            // InternalMath.g:1167:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__MathExp__ExpAssignment"
    // InternalMath.g:1177:1: rule__MathExp__ExpAssignment : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1181:1: ( ( ruleExp ) )
            // InternalMath.g:1182:2: ( ruleExp )
            {
            // InternalMath.g:1182:2: ( ruleExp )
            // InternalMath.g:1183:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0()); 

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
    // $ANTLR end "rule__MathExp__ExpAssignment"


    // $ANTLR start "rule__Var__NameAssignment_1_0_2"
    // InternalMath.g:1192:1: rule__Var__NameAssignment_1_0_2 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1196:1: ( ( RULE_ID ) )
            // InternalMath.g:1197:2: ( RULE_ID )
            {
            // InternalMath.g:1197:2: ( RULE_ID )
            // InternalMath.g:1198:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Var__NameAssignment_1_0_2"


    // $ANTLR start "rule__Var__RightAssignment_1_0_4"
    // InternalMath.g:1207:1: rule__Var__RightAssignment_1_0_4 : ( ruleVar ) ;
    public final void rule__Var__RightAssignment_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1211:1: ( ( ruleVar ) )
            // InternalMath.g:1212:2: ( ruleVar )
            {
            // InternalMath.g:1212:2: ( ruleVar )
            // InternalMath.g:1213:3: ruleVar
            {
             before(grammarAccess.getVarAccess().getRightVarParserRuleCall_1_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarAccess().getRightVarParserRuleCall_1_0_4_0()); 

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
    // $ANTLR end "rule__Var__RightAssignment_1_0_4"


    // $ANTLR start "rule__Var__NameAssignment_1_1_2"
    // InternalMath.g:1222:1: rule__Var__NameAssignment_1_1_2 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1226:1: ( ( RULE_ID ) )
            // InternalMath.g:1227:2: ( RULE_ID )
            {
            // InternalMath.g:1227:2: ( RULE_ID )
            // InternalMath.g:1228:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Var__NameAssignment_1_1_2"


    // $ANTLR start "rule__Var__RightAssignment_1_1_4"
    // InternalMath.g:1237:1: rule__Var__RightAssignment_1_1_4 : ( rulePlusMinus ) ;
    public final void rule__Var__RightAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1241:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1242:2: ( rulePlusMinus )
            {
            // InternalMath.g:1242:2: ( rulePlusMinus )
            // InternalMath.g:1243:3: rulePlusMinus
            {
             before(grammarAccess.getVarAccess().getRightPlusMinusParserRuleCall_1_1_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getVarAccess().getRightPlusMinusParserRuleCall_1_1_4_0()); 

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
    // $ANTLR end "rule__Var__RightAssignment_1_1_4"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_0_2"
    // InternalMath.g:1252:1: rule__PlusMinus__RightAssignment_1_0_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1256:1: ( ( ruleTerm ) )
            // InternalMath.g:1257:2: ( ruleTerm )
            {
            // InternalMath.g:1257:2: ( ruleTerm )
            // InternalMath.g:1258:3: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_0_2"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_1_2"
    // InternalMath.g:1267:1: rule__PlusMinus__RightAssignment_1_1_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1271:1: ( ( ruleTerm ) )
            // InternalMath.g:1272:2: ( ruleTerm )
            {
            // InternalMath.g:1272:2: ( ruleTerm )
            // InternalMath.g:1273:3: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_1_2"


    // $ANTLR start "rule__Term__RightAssignment_1_0_2"
    // InternalMath.g:1282:1: rule__Term__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1286:1: ( ( rulePrimary ) )
            // InternalMath.g:1287:2: ( rulePrimary )
            {
            // InternalMath.g:1287:2: ( rulePrimary )
            // InternalMath.g:1288:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Term__RightAssignment_1_0_2"


    // $ANTLR start "rule__Term__RightAssignment_1_1_2"
    // InternalMath.g:1297:1: rule__Term__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1301:1: ( ( rulePrimary ) )
            // InternalMath.g:1302:2: ( rulePrimary )
            {
            // InternalMath.g:1302:2: ( rulePrimary )
            // InternalMath.g:1303:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Term__RightAssignment_1_1_2"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalMath.g:1312:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1316:1: ( ( RULE_INT ) )
            // InternalMath.g:1317:2: ( RULE_INT )
            {
            // InternalMath.g:1317:2: ( RULE_INT )
            // InternalMath.g:1318:3: RULE_INT
            {
             before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Primary__ValueAssignment_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});

}