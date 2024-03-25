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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'let '", "' let '", "' = '", "'='", "'end'", "' end '", "'var '", "' in '", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:128:1: entryRuleLet : ruleLet EOF ;
    public final void entryRuleLet() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleLet EOF )
            // InternalMath.g:130:1: ruleLet EOF
            {
             before(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            ruleLet();

            state._fsp--;

             after(grammarAccess.getLetRule()); 
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
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMath.g:137:1: ruleLet : ( ( rule__Let__Group__0 ) ) ;
    public final void ruleLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__Let__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__Let__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__Let__Group__0 ) )
            // InternalMath.g:143:3: ( rule__Let__Group__0 )
            {
             before(grammarAccess.getLetAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__Let__Group__0 )
            // InternalMath.g:144:4: rule__Let__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getGroup()); 

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
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:153:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( rulePlusMinus EOF )
            // InternalMath.g:155:1: rulePlusMinus EOF
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
    // InternalMath.g:162:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalMath.g:167:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalMath.g:167:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalMath.g:168:3: ( rule__PlusMinus__Group__0 )
            {
             before(grammarAccess.getPlusMinusAccess().getGroup()); 
            // InternalMath.g:169:3: ( rule__PlusMinus__Group__0 )
            // InternalMath.g:169:4: rule__PlusMinus__Group__0
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
    // InternalMath.g:178:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( ruleTerm EOF )
            // InternalMath.g:180:1: ruleTerm EOF
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
    // InternalMath.g:187:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMath.g:192:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMath.g:192:2: ( ( rule__Term__Group__0 ) )
            // InternalMath.g:193:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMath.g:194:3: ( rule__Term__Group__0 )
            // InternalMath.g:194:4: rule__Term__Group__0
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
    // InternalMath.g:203:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( rulePrimary EOF )
            // InternalMath.g:205:1: rulePrimary EOF
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
    // InternalMath.g:212:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:217:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:217:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:218:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:219:3: ( rule__Primary__Alternatives )
            // InternalMath.g:219:4: rule__Primary__Alternatives
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


    // $ANTLR start "rule__Let__Alternatives_1"
    // InternalMath.g:227:1: rule__Let__Alternatives_1 : ( ( ( rule__Let__Group_1_0__0 ) ) | ( ( rule__Let__Group_1_1__0 ) ) | ( ( rule__Let__Group_1_2__0 ) ) );
    public final void rule__Let__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:231:1: ( ( ( rule__Let__Group_1_0__0 ) ) | ( ( rule__Let__Group_1_1__0 ) ) | ( ( rule__Let__Group_1_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 15:
            case 16:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMath.g:232:2: ( ( rule__Let__Group_1_0__0 ) )
                    {
                    // InternalMath.g:232:2: ( ( rule__Let__Group_1_0__0 ) )
                    // InternalMath.g:233:3: ( rule__Let__Group_1_0__0 )
                    {
                     before(grammarAccess.getLetAccess().getGroup_1_0()); 
                    // InternalMath.g:234:3: ( rule__Let__Group_1_0__0 )
                    // InternalMath.g:234:4: rule__Let__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Let__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:238:2: ( ( rule__Let__Group_1_1__0 ) )
                    {
                    // InternalMath.g:238:2: ( ( rule__Let__Group_1_1__0 ) )
                    // InternalMath.g:239:3: ( rule__Let__Group_1_1__0 )
                    {
                     before(grammarAccess.getLetAccess().getGroup_1_1()); 
                    // InternalMath.g:240:3: ( rule__Let__Group_1_1__0 )
                    // InternalMath.g:240:4: rule__Let__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Let__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:244:2: ( ( rule__Let__Group_1_2__0 ) )
                    {
                    // InternalMath.g:244:2: ( ( rule__Let__Group_1_2__0 ) )
                    // InternalMath.g:245:3: ( rule__Let__Group_1_2__0 )
                    {
                     before(grammarAccess.getLetAccess().getGroup_1_2()); 
                    // InternalMath.g:246:3: ( rule__Let__Group_1_2__0 )
                    // InternalMath.g:246:4: rule__Let__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Let__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Let__Alternatives_1"


    // $ANTLR start "rule__Let__Alternatives_1_0_1"
    // InternalMath.g:254:1: rule__Let__Alternatives_1_0_1 : ( ( 'let ' ) | ( ' let ' ) );
    public final void rule__Let__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:258:1: ( ( 'let ' ) | ( ' let ' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:259:2: ( 'let ' )
                    {
                    // InternalMath.g:259:2: ( 'let ' )
                    // InternalMath.g:260:3: 'let '
                    {
                     before(grammarAccess.getLetAccess().getLetKeyword_1_0_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getLetKeyword_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:265:2: ( ' let ' )
                    {
                    // InternalMath.g:265:2: ( ' let ' )
                    // InternalMath.g:266:3: ' let '
                    {
                     before(grammarAccess.getLetAccess().getLetKeyword_1_0_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getLetKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Let__Alternatives_1_0_1"


    // $ANTLR start "rule__Let__Alternatives_1_0_3"
    // InternalMath.g:275:1: rule__Let__Alternatives_1_0_3 : ( ( ' = ' ) | ( '=' ) );
    public final void rule__Let__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:279:1: ( ( ' = ' ) | ( '=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:280:2: ( ' = ' )
                    {
                    // InternalMath.g:280:2: ( ' = ' )
                    // InternalMath.g:281:3: ' = '
                    {
                     before(grammarAccess.getLetAccess().getSpaceEqualsSignSpaceKeyword_1_0_3_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getSpaceEqualsSignSpaceKeyword_1_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:286:2: ( '=' )
                    {
                    // InternalMath.g:286:2: ( '=' )
                    // InternalMath.g:287:3: '='
                    {
                     before(grammarAccess.getLetAccess().getEqualsSignKeyword_1_0_3_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getEqualsSignKeyword_1_0_3_1()); 

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
    // $ANTLR end "rule__Let__Alternatives_1_0_3"


    // $ANTLR start "rule__Let__Alternatives_1_2_1"
    // InternalMath.g:296:1: rule__Let__Alternatives_1_2_1 : ( ( 'end' ) | ( ' end ' ) );
    public final void rule__Let__Alternatives_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:300:1: ( ( 'end' ) | ( ' end ' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:301:2: ( 'end' )
                    {
                    // InternalMath.g:301:2: ( 'end' )
                    // InternalMath.g:302:3: 'end'
                    {
                     before(grammarAccess.getLetAccess().getEndKeyword_1_2_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getEndKeyword_1_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:307:2: ( ' end ' )
                    {
                    // InternalMath.g:307:2: ( ' end ' )
                    // InternalMath.g:308:3: ' end '
                    {
                     before(grammarAccess.getLetAccess().getEndKeyword_1_2_1_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getEndKeyword_1_2_1_1()); 

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
    // $ANTLR end "rule__Let__Alternatives_1_2_1"


    // $ANTLR start "rule__PlusMinus__Alternatives_1"
    // InternalMath.g:317:1: rule__PlusMinus__Alternatives_1 : ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:321:1: ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:322:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    {
                    // InternalMath.g:322:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    // InternalMath.g:323:3: ( rule__PlusMinus__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 
                    // InternalMath.g:324:3: ( rule__PlusMinus__Group_1_0__0 )
                    // InternalMath.g:324:4: rule__PlusMinus__Group_1_0__0
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
                    // InternalMath.g:328:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    {
                    // InternalMath.g:328:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    // InternalMath.g:329:3: ( rule__PlusMinus__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_1()); 
                    // InternalMath.g:330:3: ( rule__PlusMinus__Group_1_1__0 )
                    // InternalMath.g:330:4: rule__PlusMinus__Group_1_1__0
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
    // InternalMath.g:338:1: rule__Term__Alternatives_1 : ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) );
    public final void rule__Term__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:342:1: ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMath.g:343:2: ( ( rule__Term__Group_1_0__0 ) )
                    {
                    // InternalMath.g:343:2: ( ( rule__Term__Group_1_0__0 ) )
                    // InternalMath.g:344:3: ( rule__Term__Group_1_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0()); 
                    // InternalMath.g:345:3: ( rule__Term__Group_1_0__0 )
                    // InternalMath.g:345:4: rule__Term__Group_1_0__0
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
                    // InternalMath.g:349:2: ( ( rule__Term__Group_1_1__0 ) )
                    {
                    // InternalMath.g:349:2: ( ( rule__Term__Group_1_1__0 ) )
                    // InternalMath.g:350:3: ( rule__Term__Group_1_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_1()); 
                    // InternalMath.g:351:3: ( rule__Term__Group_1_1__0 )
                    // InternalMath.g:351:4: rule__Term__Group_1_1__0
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
    // InternalMath.g:359:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:363:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMath.g:364:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMath.g:364:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMath.g:365:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMath.g:366:3: ( rule__Primary__Group_0__0 )
                    // InternalMath.g:366:4: rule__Primary__Group_0__0
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
                    // InternalMath.g:370:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMath.g:370:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMath.g:371:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMath.g:372:3: ( rule__Primary__Group_1__0 )
                    // InternalMath.g:372:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:376:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalMath.g:376:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalMath.g:377:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalMath.g:378:3: ( rule__Primary__Group_2__0 )
                    // InternalMath.g:378:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

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
    // InternalMath.g:386:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:390:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalMath.g:391:2: rule__Var__Group__0__Impl rule__Var__Group__1
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
    // InternalMath.g:398:1: rule__Var__Group__0__Impl : ( ruleLet ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:402:1: ( ( ruleLet ) )
            // InternalMath.g:403:1: ( ruleLet )
            {
            // InternalMath.g:403:1: ( ruleLet )
            // InternalMath.g:404:2: ruleLet
            {
             before(grammarAccess.getVarAccess().getLetParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLet();

            state._fsp--;

             after(grammarAccess.getVarAccess().getLetParserRuleCall_0()); 

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
    // InternalMath.g:413:1: rule__Var__Group__1 : rule__Var__Group__1__Impl ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:417:1: ( rule__Var__Group__1__Impl )
            // InternalMath.g:418:2: rule__Var__Group__1__Impl
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
    // InternalMath.g:424:1: rule__Var__Group__1__Impl : ( ( rule__Var__Group_1__0 )* ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:428:1: ( ( ( rule__Var__Group_1__0 )* ) )
            // InternalMath.g:429:1: ( ( rule__Var__Group_1__0 )* )
            {
            // InternalMath.g:429:1: ( ( rule__Var__Group_1__0 )* )
            // InternalMath.g:430:2: ( rule__Var__Group_1__0 )*
            {
             before(grammarAccess.getVarAccess().getGroup_1()); 
            // InternalMath.g:431:2: ( rule__Var__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:431:3: rule__Var__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Var__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getVarAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Var__Group_1__0"
    // InternalMath.g:440:1: rule__Var__Group_1__0 : rule__Var__Group_1__0__Impl rule__Var__Group_1__1 ;
    public final void rule__Var__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:444:1: ( rule__Var__Group_1__0__Impl rule__Var__Group_1__1 )
            // InternalMath.g:445:2: rule__Var__Group_1__0__Impl rule__Var__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Var__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1__1();

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
    // $ANTLR end "rule__Var__Group_1__0"


    // $ANTLR start "rule__Var__Group_1__0__Impl"
    // InternalMath.g:452:1: rule__Var__Group_1__0__Impl : ( () ) ;
    public final void rule__Var__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:456:1: ( ( () ) )
            // InternalMath.g:457:1: ( () )
            {
            // InternalMath.g:457:1: ( () )
            // InternalMath.g:458:2: ()
            {
             before(grammarAccess.getVarAccess().getVarLeftAction_1_0()); 
            // InternalMath.g:459:2: ()
            // InternalMath.g:459:3: 
            {
            }

             after(grammarAccess.getVarAccess().getVarLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__0__Impl"


    // $ANTLR start "rule__Var__Group_1__1"
    // InternalMath.g:467:1: rule__Var__Group_1__1 : rule__Var__Group_1__1__Impl rule__Var__Group_1__2 ;
    public final void rule__Var__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:471:1: ( rule__Var__Group_1__1__Impl rule__Var__Group_1__2 )
            // InternalMath.g:472:2: rule__Var__Group_1__1__Impl rule__Var__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Var__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1__2();

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
    // $ANTLR end "rule__Var__Group_1__1"


    // $ANTLR start "rule__Var__Group_1__1__Impl"
    // InternalMath.g:479:1: rule__Var__Group_1__1__Impl : ( 'var ' ) ;
    public final void rule__Var__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:483:1: ( ( 'var ' ) )
            // InternalMath.g:484:1: ( 'var ' )
            {
            // InternalMath.g:484:1: ( 'var ' )
            // InternalMath.g:485:2: 'var '
            {
             before(grammarAccess.getVarAccess().getVarKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getVarKeyword_1_1()); 

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
    // $ANTLR end "rule__Var__Group_1__1__Impl"


    // $ANTLR start "rule__Var__Group_1__2"
    // InternalMath.g:494:1: rule__Var__Group_1__2 : rule__Var__Group_1__2__Impl rule__Var__Group_1__3 ;
    public final void rule__Var__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:498:1: ( rule__Var__Group_1__2__Impl rule__Var__Group_1__3 )
            // InternalMath.g:499:2: rule__Var__Group_1__2__Impl rule__Var__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__Var__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1__3();

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
    // $ANTLR end "rule__Var__Group_1__2"


    // $ANTLR start "rule__Var__Group_1__2__Impl"
    // InternalMath.g:506:1: rule__Var__Group_1__2__Impl : ( ( rule__Var__NameAssignment_1_2 ) ) ;
    public final void rule__Var__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:510:1: ( ( ( rule__Var__NameAssignment_1_2 ) ) )
            // InternalMath.g:511:1: ( ( rule__Var__NameAssignment_1_2 ) )
            {
            // InternalMath.g:511:1: ( ( rule__Var__NameAssignment_1_2 ) )
            // InternalMath.g:512:2: ( rule__Var__NameAssignment_1_2 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1_2()); 
            // InternalMath.g:513:2: ( rule__Var__NameAssignment_1_2 )
            // InternalMath.g:513:3: rule__Var__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1_2()); 

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
    // $ANTLR end "rule__Var__Group_1__2__Impl"


    // $ANTLR start "rule__Var__Group_1__3"
    // InternalMath.g:521:1: rule__Var__Group_1__3 : rule__Var__Group_1__3__Impl rule__Var__Group_1__4 ;
    public final void rule__Var__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:525:1: ( rule__Var__Group_1__3__Impl rule__Var__Group_1__4 )
            // InternalMath.g:526:2: rule__Var__Group_1__3__Impl rule__Var__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__Var__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1__4();

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
    // $ANTLR end "rule__Var__Group_1__3"


    // $ANTLR start "rule__Var__Group_1__3__Impl"
    // InternalMath.g:533:1: rule__Var__Group_1__3__Impl : ( ' = ' ) ;
    public final void rule__Var__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:537:1: ( ( ' = ' ) )
            // InternalMath.g:538:1: ( ' = ' )
            {
            // InternalMath.g:538:1: ( ' = ' )
            // InternalMath.g:539:2: ' = '
            {
             before(grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_3()); 

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
    // $ANTLR end "rule__Var__Group_1__3__Impl"


    // $ANTLR start "rule__Var__Group_1__4"
    // InternalMath.g:548:1: rule__Var__Group_1__4 : rule__Var__Group_1__4__Impl ;
    public final void rule__Var__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:552:1: ( rule__Var__Group_1__4__Impl )
            // InternalMath.g:553:2: rule__Var__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group_1__4__Impl();

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
    // $ANTLR end "rule__Var__Group_1__4"


    // $ANTLR start "rule__Var__Group_1__4__Impl"
    // InternalMath.g:559:1: rule__Var__Group_1__4__Impl : ( ( rule__Var__RightAssignment_1_4 ) ) ;
    public final void rule__Var__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:563:1: ( ( ( rule__Var__RightAssignment_1_4 ) ) )
            // InternalMath.g:564:1: ( ( rule__Var__RightAssignment_1_4 ) )
            {
            // InternalMath.g:564:1: ( ( rule__Var__RightAssignment_1_4 ) )
            // InternalMath.g:565:2: ( rule__Var__RightAssignment_1_4 )
            {
             before(grammarAccess.getVarAccess().getRightAssignment_1_4()); 
            // InternalMath.g:566:2: ( rule__Var__RightAssignment_1_4 )
            // InternalMath.g:566:3: rule__Var__RightAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Var__RightAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getRightAssignment_1_4()); 

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
    // $ANTLR end "rule__Var__Group_1__4__Impl"


    // $ANTLR start "rule__Let__Group__0"
    // InternalMath.g:575:1: rule__Let__Group__0 : rule__Let__Group__0__Impl rule__Let__Group__1 ;
    public final void rule__Let__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:579:1: ( rule__Let__Group__0__Impl rule__Let__Group__1 )
            // InternalMath.g:580:2: rule__Let__Group__0__Impl rule__Let__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Let__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__1();

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
    // $ANTLR end "rule__Let__Group__0"


    // $ANTLR start "rule__Let__Group__0__Impl"
    // InternalMath.g:587:1: rule__Let__Group__0__Impl : ( rulePlusMinus ) ;
    public final void rule__Let__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:591:1: ( ( rulePlusMinus ) )
            // InternalMath.g:592:1: ( rulePlusMinus )
            {
            // InternalMath.g:592:1: ( rulePlusMinus )
            // InternalMath.g:593:2: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getPlusMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getPlusMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__Let__Group__0__Impl"


    // $ANTLR start "rule__Let__Group__1"
    // InternalMath.g:602:1: rule__Let__Group__1 : rule__Let__Group__1__Impl ;
    public final void rule__Let__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:606:1: ( rule__Let__Group__1__Impl )
            // InternalMath.g:607:2: rule__Let__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__1__Impl();

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
    // $ANTLR end "rule__Let__Group__1"


    // $ANTLR start "rule__Let__Group__1__Impl"
    // InternalMath.g:613:1: rule__Let__Group__1__Impl : ( ( rule__Let__Alternatives_1 )* ) ;
    public final void rule__Let__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:617:1: ( ( ( rule__Let__Alternatives_1 )* ) )
            // InternalMath.g:618:1: ( ( rule__Let__Alternatives_1 )* )
            {
            // InternalMath.g:618:1: ( ( rule__Let__Alternatives_1 )* )
            // InternalMath.g:619:2: ( rule__Let__Alternatives_1 )*
            {
             before(grammarAccess.getLetAccess().getAlternatives_1()); 
            // InternalMath.g:620:2: ( rule__Let__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=12)||(LA9_0>=15 && LA9_0<=16)||LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMath.g:620:3: rule__Let__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Let__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLetAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Let__Group__1__Impl"


    // $ANTLR start "rule__Let__Group_1_0__0"
    // InternalMath.g:629:1: rule__Let__Group_1_0__0 : rule__Let__Group_1_0__0__Impl rule__Let__Group_1_0__1 ;
    public final void rule__Let__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:633:1: ( rule__Let__Group_1_0__0__Impl rule__Let__Group_1_0__1 )
            // InternalMath.g:634:2: rule__Let__Group_1_0__0__Impl rule__Let__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Let__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__1();

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
    // $ANTLR end "rule__Let__Group_1_0__0"


    // $ANTLR start "rule__Let__Group_1_0__0__Impl"
    // InternalMath.g:641:1: rule__Let__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Let__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:645:1: ( ( () ) )
            // InternalMath.g:646:1: ( () )
            {
            // InternalMath.g:646:1: ( () )
            // InternalMath.g:647:2: ()
            {
             before(grammarAccess.getLetAccess().getLetLeftAction_1_0_0()); 
            // InternalMath.g:648:2: ()
            // InternalMath.g:648:3: 
            {
            }

             after(grammarAccess.getLetAccess().getLetLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__0__Impl"


    // $ANTLR start "rule__Let__Group_1_0__1"
    // InternalMath.g:656:1: rule__Let__Group_1_0__1 : rule__Let__Group_1_0__1__Impl rule__Let__Group_1_0__2 ;
    public final void rule__Let__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:660:1: ( rule__Let__Group_1_0__1__Impl rule__Let__Group_1_0__2 )
            // InternalMath.g:661:2: rule__Let__Group_1_0__1__Impl rule__Let__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Let__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__2();

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
    // $ANTLR end "rule__Let__Group_1_0__1"


    // $ANTLR start "rule__Let__Group_1_0__1__Impl"
    // InternalMath.g:668:1: rule__Let__Group_1_0__1__Impl : ( ( rule__Let__Alternatives_1_0_1 ) ) ;
    public final void rule__Let__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:672:1: ( ( ( rule__Let__Alternatives_1_0_1 ) ) )
            // InternalMath.g:673:1: ( ( rule__Let__Alternatives_1_0_1 ) )
            {
            // InternalMath.g:673:1: ( ( rule__Let__Alternatives_1_0_1 ) )
            // InternalMath.g:674:2: ( rule__Let__Alternatives_1_0_1 )
            {
             before(grammarAccess.getLetAccess().getAlternatives_1_0_1()); 
            // InternalMath.g:675:2: ( rule__Let__Alternatives_1_0_1 )
            // InternalMath.g:675:3: rule__Let__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Let__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getAlternatives_1_0_1()); 

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
    // $ANTLR end "rule__Let__Group_1_0__1__Impl"


    // $ANTLR start "rule__Let__Group_1_0__2"
    // InternalMath.g:683:1: rule__Let__Group_1_0__2 : rule__Let__Group_1_0__2__Impl rule__Let__Group_1_0__3 ;
    public final void rule__Let__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:687:1: ( rule__Let__Group_1_0__2__Impl rule__Let__Group_1_0__3 )
            // InternalMath.g:688:2: rule__Let__Group_1_0__2__Impl rule__Let__Group_1_0__3
            {
            pushFollow(FOLLOW_11);
            rule__Let__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__3();

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
    // $ANTLR end "rule__Let__Group_1_0__2"


    // $ANTLR start "rule__Let__Group_1_0__2__Impl"
    // InternalMath.g:695:1: rule__Let__Group_1_0__2__Impl : ( ( rule__Let__NameAssignment_1_0_2 ) ) ;
    public final void rule__Let__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:699:1: ( ( ( rule__Let__NameAssignment_1_0_2 ) ) )
            // InternalMath.g:700:1: ( ( rule__Let__NameAssignment_1_0_2 ) )
            {
            // InternalMath.g:700:1: ( ( rule__Let__NameAssignment_1_0_2 ) )
            // InternalMath.g:701:2: ( rule__Let__NameAssignment_1_0_2 )
            {
             before(grammarAccess.getLetAccess().getNameAssignment_1_0_2()); 
            // InternalMath.g:702:2: ( rule__Let__NameAssignment_1_0_2 )
            // InternalMath.g:702:3: rule__Let__NameAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Let__NameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getNameAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Let__Group_1_0__2__Impl"


    // $ANTLR start "rule__Let__Group_1_0__3"
    // InternalMath.g:710:1: rule__Let__Group_1_0__3 : rule__Let__Group_1_0__3__Impl rule__Let__Group_1_0__4 ;
    public final void rule__Let__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:714:1: ( rule__Let__Group_1_0__3__Impl rule__Let__Group_1_0__4 )
            // InternalMath.g:715:2: rule__Let__Group_1_0__3__Impl rule__Let__Group_1_0__4
            {
            pushFollow(FOLLOW_7);
            rule__Let__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__4();

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
    // $ANTLR end "rule__Let__Group_1_0__3"


    // $ANTLR start "rule__Let__Group_1_0__3__Impl"
    // InternalMath.g:722:1: rule__Let__Group_1_0__3__Impl : ( ( rule__Let__Alternatives_1_0_3 ) ) ;
    public final void rule__Let__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:726:1: ( ( ( rule__Let__Alternatives_1_0_3 ) ) )
            // InternalMath.g:727:1: ( ( rule__Let__Alternatives_1_0_3 ) )
            {
            // InternalMath.g:727:1: ( ( rule__Let__Alternatives_1_0_3 ) )
            // InternalMath.g:728:2: ( rule__Let__Alternatives_1_0_3 )
            {
             before(grammarAccess.getLetAccess().getAlternatives_1_0_3()); 
            // InternalMath.g:729:2: ( rule__Let__Alternatives_1_0_3 )
            // InternalMath.g:729:3: rule__Let__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Let__Alternatives_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getAlternatives_1_0_3()); 

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
    // $ANTLR end "rule__Let__Group_1_0__3__Impl"


    // $ANTLR start "rule__Let__Group_1_0__4"
    // InternalMath.g:737:1: rule__Let__Group_1_0__4 : rule__Let__Group_1_0__4__Impl ;
    public final void rule__Let__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:741:1: ( rule__Let__Group_1_0__4__Impl )
            // InternalMath.g:742:2: rule__Let__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__4__Impl();

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
    // $ANTLR end "rule__Let__Group_1_0__4"


    // $ANTLR start "rule__Let__Group_1_0__4__Impl"
    // InternalMath.g:748:1: rule__Let__Group_1_0__4__Impl : ( ( rule__Let__RightAssignment_1_0_4 ) ) ;
    public final void rule__Let__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:752:1: ( ( ( rule__Let__RightAssignment_1_0_4 ) ) )
            // InternalMath.g:753:1: ( ( rule__Let__RightAssignment_1_0_4 ) )
            {
            // InternalMath.g:753:1: ( ( rule__Let__RightAssignment_1_0_4 ) )
            // InternalMath.g:754:2: ( rule__Let__RightAssignment_1_0_4 )
            {
             before(grammarAccess.getLetAccess().getRightAssignment_1_0_4()); 
            // InternalMath.g:755:2: ( rule__Let__RightAssignment_1_0_4 )
            // InternalMath.g:755:3: rule__Let__RightAssignment_1_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Let__RightAssignment_1_0_4();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getRightAssignment_1_0_4()); 

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
    // $ANTLR end "rule__Let__Group_1_0__4__Impl"


    // $ANTLR start "rule__Let__Group_1_1__0"
    // InternalMath.g:764:1: rule__Let__Group_1_1__0 : rule__Let__Group_1_1__0__Impl rule__Let__Group_1_1__1 ;
    public final void rule__Let__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:768:1: ( rule__Let__Group_1_1__0__Impl rule__Let__Group_1_1__1 )
            // InternalMath.g:769:2: rule__Let__Group_1_1__0__Impl rule__Let__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Let__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_1__1();

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
    // $ANTLR end "rule__Let__Group_1_1__0"


    // $ANTLR start "rule__Let__Group_1_1__0__Impl"
    // InternalMath.g:776:1: rule__Let__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Let__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:780:1: ( ( () ) )
            // InternalMath.g:781:1: ( () )
            {
            // InternalMath.g:781:1: ( () )
            // InternalMath.g:782:2: ()
            {
             before(grammarAccess.getLetAccess().getInLeftAction_1_1_0()); 
            // InternalMath.g:783:2: ()
            // InternalMath.g:783:3: 
            {
            }

             after(grammarAccess.getLetAccess().getInLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_1__0__Impl"


    // $ANTLR start "rule__Let__Group_1_1__1"
    // InternalMath.g:791:1: rule__Let__Group_1_1__1 : rule__Let__Group_1_1__1__Impl rule__Let__Group_1_1__2 ;
    public final void rule__Let__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:795:1: ( rule__Let__Group_1_1__1__Impl rule__Let__Group_1_1__2 )
            // InternalMath.g:796:2: rule__Let__Group_1_1__1__Impl rule__Let__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Let__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_1__2();

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
    // $ANTLR end "rule__Let__Group_1_1__1"


    // $ANTLR start "rule__Let__Group_1_1__1__Impl"
    // InternalMath.g:803:1: rule__Let__Group_1_1__1__Impl : ( ' in ' ) ;
    public final void rule__Let__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:807:1: ( ( ' in ' ) )
            // InternalMath.g:808:1: ( ' in ' )
            {
            // InternalMath.g:808:1: ( ' in ' )
            // InternalMath.g:809:2: ' in '
            {
             before(grammarAccess.getLetAccess().getInKeyword_1_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getInKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Let__Group_1_1__1__Impl"


    // $ANTLR start "rule__Let__Group_1_1__2"
    // InternalMath.g:818:1: rule__Let__Group_1_1__2 : rule__Let__Group_1_1__2__Impl ;
    public final void rule__Let__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:822:1: ( rule__Let__Group_1_1__2__Impl )
            // InternalMath.g:823:2: rule__Let__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Let__Group_1_1__2"


    // $ANTLR start "rule__Let__Group_1_1__2__Impl"
    // InternalMath.g:829:1: rule__Let__Group_1_1__2__Impl : ( ( rule__Let__RightAssignment_1_1_2 ) ) ;
    public final void rule__Let__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:833:1: ( ( ( rule__Let__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:834:1: ( ( rule__Let__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:834:1: ( ( rule__Let__RightAssignment_1_1_2 ) )
            // InternalMath.g:835:2: ( rule__Let__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getLetAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:836:2: ( rule__Let__RightAssignment_1_1_2 )
            // InternalMath.g:836:3: rule__Let__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Let__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Let__Group_1_1__2__Impl"


    // $ANTLR start "rule__Let__Group_1_2__0"
    // InternalMath.g:845:1: rule__Let__Group_1_2__0 : rule__Let__Group_1_2__0__Impl rule__Let__Group_1_2__1 ;
    public final void rule__Let__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:849:1: ( rule__Let__Group_1_2__0__Impl rule__Let__Group_1_2__1 )
            // InternalMath.g:850:2: rule__Let__Group_1_2__0__Impl rule__Let__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Let__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_2__1();

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
    // $ANTLR end "rule__Let__Group_1_2__0"


    // $ANTLR start "rule__Let__Group_1_2__0__Impl"
    // InternalMath.g:857:1: rule__Let__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Let__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:861:1: ( ( () ) )
            // InternalMath.g:862:1: ( () )
            {
            // InternalMath.g:862:1: ( () )
            // InternalMath.g:863:2: ()
            {
             before(grammarAccess.getLetAccess().getEndLeftAction_1_2_0()); 
            // InternalMath.g:864:2: ()
            // InternalMath.g:864:3: 
            {
            }

             after(grammarAccess.getLetAccess().getEndLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_2__0__Impl"


    // $ANTLR start "rule__Let__Group_1_2__1"
    // InternalMath.g:872:1: rule__Let__Group_1_2__1 : rule__Let__Group_1_2__1__Impl rule__Let__Group_1_2__2 ;
    public final void rule__Let__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:876:1: ( rule__Let__Group_1_2__1__Impl rule__Let__Group_1_2__2 )
            // InternalMath.g:877:2: rule__Let__Group_1_2__1__Impl rule__Let__Group_1_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Let__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_2__2();

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
    // $ANTLR end "rule__Let__Group_1_2__1"


    // $ANTLR start "rule__Let__Group_1_2__1__Impl"
    // InternalMath.g:884:1: rule__Let__Group_1_2__1__Impl : ( ( rule__Let__Alternatives_1_2_1 ) ) ;
    public final void rule__Let__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:888:1: ( ( ( rule__Let__Alternatives_1_2_1 ) ) )
            // InternalMath.g:889:1: ( ( rule__Let__Alternatives_1_2_1 ) )
            {
            // InternalMath.g:889:1: ( ( rule__Let__Alternatives_1_2_1 ) )
            // InternalMath.g:890:2: ( rule__Let__Alternatives_1_2_1 )
            {
             before(grammarAccess.getLetAccess().getAlternatives_1_2_1()); 
            // InternalMath.g:891:2: ( rule__Let__Alternatives_1_2_1 )
            // InternalMath.g:891:3: rule__Let__Alternatives_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Let__Alternatives_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getAlternatives_1_2_1()); 

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
    // $ANTLR end "rule__Let__Group_1_2__1__Impl"


    // $ANTLR start "rule__Let__Group_1_2__2"
    // InternalMath.g:899:1: rule__Let__Group_1_2__2 : rule__Let__Group_1_2__2__Impl ;
    public final void rule__Let__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:903:1: ( rule__Let__Group_1_2__2__Impl )
            // InternalMath.g:904:2: rule__Let__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Let__Group_1_2__2"


    // $ANTLR start "rule__Let__Group_1_2__2__Impl"
    // InternalMath.g:910:1: rule__Let__Group_1_2__2__Impl : ( ( rule__Let__RightAssignment_1_2_2 ) ) ;
    public final void rule__Let__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:914:1: ( ( ( rule__Let__RightAssignment_1_2_2 ) ) )
            // InternalMath.g:915:1: ( ( rule__Let__RightAssignment_1_2_2 ) )
            {
            // InternalMath.g:915:1: ( ( rule__Let__RightAssignment_1_2_2 ) )
            // InternalMath.g:916:2: ( rule__Let__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getLetAccess().getRightAssignment_1_2_2()); 
            // InternalMath.g:917:2: ( rule__Let__RightAssignment_1_2_2 )
            // InternalMath.g:917:3: rule__Let__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Let__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getRightAssignment_1_2_2()); 

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
    // $ANTLR end "rule__Let__Group_1_2__2__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalMath.g:926:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:930:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalMath.g:931:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMath.g:938:1: rule__PlusMinus__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:942:1: ( ( ruleTerm ) )
            // InternalMath.g:943:1: ( ruleTerm )
            {
            // InternalMath.g:943:1: ( ruleTerm )
            // InternalMath.g:944:2: ruleTerm
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
    // InternalMath.g:953:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:957:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalMath.g:958:2: rule__PlusMinus__Group__1__Impl
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
    // InternalMath.g:964:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Alternatives_1 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:968:1: ( ( ( rule__PlusMinus__Alternatives_1 )* ) )
            // InternalMath.g:969:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            {
            // InternalMath.g:969:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            // InternalMath.g:970:2: ( rule__PlusMinus__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives_1()); 
            // InternalMath.g:971:2: ( rule__PlusMinus__Alternatives_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=19 && LA10_0<=20)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMath.g:971:3: rule__PlusMinus__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PlusMinus__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMath.g:980:1: rule__PlusMinus__Group_1_0__0 : rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 ;
    public final void rule__PlusMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:984:1: ( rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 )
            // InternalMath.g:985:2: rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMath.g:992:1: rule__PlusMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:996:1: ( ( () ) )
            // InternalMath.g:997:1: ( () )
            {
            // InternalMath.g:997:1: ( () )
            // InternalMath.g:998:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0()); 
            // InternalMath.g:999:2: ()
            // InternalMath.g:999:3: 
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
    // InternalMath.g:1007:1: rule__PlusMinus__Group_1_0__1 : rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 ;
    public final void rule__PlusMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1011:1: ( rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 )
            // InternalMath.g:1012:2: rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2
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
    // InternalMath.g:1019:1: rule__PlusMinus__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1023:1: ( ( '+' ) )
            // InternalMath.g:1024:1: ( '+' )
            {
            // InternalMath.g:1024:1: ( '+' )
            // InternalMath.g:1025:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMath.g:1034:1: rule__PlusMinus__Group_1_0__2 : rule__PlusMinus__Group_1_0__2__Impl ;
    public final void rule__PlusMinus__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1038:1: ( rule__PlusMinus__Group_1_0__2__Impl )
            // InternalMath.g:1039:2: rule__PlusMinus__Group_1_0__2__Impl
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
    // InternalMath.g:1045:1: rule__PlusMinus__Group_1_0__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinus__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1049:1: ( ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:1050:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:1050:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            // InternalMath.g:1051:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:1052:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            // InternalMath.g:1052:3: rule__PlusMinus__RightAssignment_1_0_2
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
    // InternalMath.g:1061:1: rule__PlusMinus__Group_1_1__0 : rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 ;
    public final void rule__PlusMinus__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1065:1: ( rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 )
            // InternalMath.g:1066:2: rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMath.g:1073:1: rule__PlusMinus__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1077:1: ( ( () ) )
            // InternalMath.g:1078:1: ( () )
            {
            // InternalMath.g:1078:1: ( () )
            // InternalMath.g:1079:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0()); 
            // InternalMath.g:1080:2: ()
            // InternalMath.g:1080:3: 
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
    // InternalMath.g:1088:1: rule__PlusMinus__Group_1_1__1 : rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 ;
    public final void rule__PlusMinus__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1092:1: ( rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 )
            // InternalMath.g:1093:2: rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2
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
    // InternalMath.g:1100:1: rule__PlusMinus__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1104:1: ( ( '-' ) )
            // InternalMath.g:1105:1: ( '-' )
            {
            // InternalMath.g:1105:1: ( '-' )
            // InternalMath.g:1106:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMath.g:1115:1: rule__PlusMinus__Group_1_1__2 : rule__PlusMinus__Group_1_1__2__Impl ;
    public final void rule__PlusMinus__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1119:1: ( rule__PlusMinus__Group_1_1__2__Impl )
            // InternalMath.g:1120:2: rule__PlusMinus__Group_1_1__2__Impl
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
    // InternalMath.g:1126:1: rule__PlusMinus__Group_1_1__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinus__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1130:1: ( ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:1131:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:1131:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            // InternalMath.g:1132:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:1133:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            // InternalMath.g:1133:3: rule__PlusMinus__RightAssignment_1_1_2
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
    // InternalMath.g:1142:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1146:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMath.g:1147:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMath.g:1154:1: rule__Term__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1158:1: ( ( rulePrimary ) )
            // InternalMath.g:1159:1: ( rulePrimary )
            {
            // InternalMath.g:1159:1: ( rulePrimary )
            // InternalMath.g:1160:2: rulePrimary
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
    // InternalMath.g:1169:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1173:1: ( rule__Term__Group__1__Impl )
            // InternalMath.g:1174:2: rule__Term__Group__1__Impl
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
    // InternalMath.g:1180:1: rule__Term__Group__1__Impl : ( ( rule__Term__Alternatives_1 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1184:1: ( ( ( rule__Term__Alternatives_1 )* ) )
            // InternalMath.g:1185:1: ( ( rule__Term__Alternatives_1 )* )
            {
            // InternalMath.g:1185:1: ( ( rule__Term__Alternatives_1 )* )
            // InternalMath.g:1186:2: ( rule__Term__Alternatives_1 )*
            {
             before(grammarAccess.getTermAccess().getAlternatives_1()); 
            // InternalMath.g:1187:2: ( rule__Term__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=21 && LA11_0<=22)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMath.g:1187:3: rule__Term__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Term__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMath.g:1196:1: rule__Term__Group_1_0__0 : rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 ;
    public final void rule__Term__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1200:1: ( rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 )
            // InternalMath.g:1201:2: rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMath.g:1208:1: rule__Term__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1212:1: ( ( () ) )
            // InternalMath.g:1213:1: ( () )
            {
            // InternalMath.g:1213:1: ( () )
            // InternalMath.g:1214:2: ()
            {
             before(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 
            // InternalMath.g:1215:2: ()
            // InternalMath.g:1215:3: 
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
    // InternalMath.g:1223:1: rule__Term__Group_1_0__1 : rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 ;
    public final void rule__Term__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1227:1: ( rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 )
            // InternalMath.g:1228:2: rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2
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
    // InternalMath.g:1235:1: rule__Term__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1239:1: ( ( '*' ) )
            // InternalMath.g:1240:1: ( '*' )
            {
            // InternalMath.g:1240:1: ( '*' )
            // InternalMath.g:1241:2: '*'
            {
             before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMath.g:1250:1: rule__Term__Group_1_0__2 : rule__Term__Group_1_0__2__Impl ;
    public final void rule__Term__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1254:1: ( rule__Term__Group_1_0__2__Impl )
            // InternalMath.g:1255:2: rule__Term__Group_1_0__2__Impl
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
    // InternalMath.g:1261:1: rule__Term__Group_1_0__2__Impl : ( ( rule__Term__RightAssignment_1_0_2 ) ) ;
    public final void rule__Term__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1265:1: ( ( ( rule__Term__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:1266:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:1266:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            // InternalMath.g:1267:2: ( rule__Term__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:1268:2: ( rule__Term__RightAssignment_1_0_2 )
            // InternalMath.g:1268:3: rule__Term__RightAssignment_1_0_2
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
    // InternalMath.g:1277:1: rule__Term__Group_1_1__0 : rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 ;
    public final void rule__Term__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1281:1: ( rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 )
            // InternalMath.g:1282:2: rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMath.g:1289:1: rule__Term__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1293:1: ( ( () ) )
            // InternalMath.g:1294:1: ( () )
            {
            // InternalMath.g:1294:1: ( () )
            // InternalMath.g:1295:2: ()
            {
             before(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 
            // InternalMath.g:1296:2: ()
            // InternalMath.g:1296:3: 
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
    // InternalMath.g:1304:1: rule__Term__Group_1_1__1 : rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 ;
    public final void rule__Term__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1308:1: ( rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 )
            // InternalMath.g:1309:2: rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2
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
    // InternalMath.g:1316:1: rule__Term__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1320:1: ( ( '/' ) )
            // InternalMath.g:1321:1: ( '/' )
            {
            // InternalMath.g:1321:1: ( '/' )
            // InternalMath.g:1322:2: '/'
            {
             before(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMath.g:1331:1: rule__Term__Group_1_1__2 : rule__Term__Group_1_1__2__Impl ;
    public final void rule__Term__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1335:1: ( rule__Term__Group_1_1__2__Impl )
            // InternalMath.g:1336:2: rule__Term__Group_1_1__2__Impl
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
    // InternalMath.g:1342:1: rule__Term__Group_1_1__2__Impl : ( ( rule__Term__RightAssignment_1_1_2 ) ) ;
    public final void rule__Term__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1346:1: ( ( ( rule__Term__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:1347:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:1347:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            // InternalMath.g:1348:2: ( rule__Term__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:1349:2: ( rule__Term__RightAssignment_1_1_2 )
            // InternalMath.g:1349:3: rule__Term__RightAssignment_1_1_2
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
    // InternalMath.g:1358:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1362:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMath.g:1363:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMath.g:1370:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1374:1: ( ( () ) )
            // InternalMath.g:1375:1: ( () )
            {
            // InternalMath.g:1375:1: ( () )
            // InternalMath.g:1376:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); 
            // InternalMath.g:1377:2: ()
            // InternalMath.g:1377:3: 
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
    // InternalMath.g:1385:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1389:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMath.g:1390:2: rule__Primary__Group_0__1__Impl
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
    // InternalMath.g:1396:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1400:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMath.g:1401:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMath.g:1401:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMath.g:1402:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMath.g:1403:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMath.g:1403:3: rule__Primary__ValueAssignment_0_1
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
    // InternalMath.g:1412:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1416:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMath.g:1417:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMath.g:1424:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1428:1: ( ( () ) )
            // InternalMath.g:1429:1: ( () )
            {
            // InternalMath.g:1429:1: ( () )
            // InternalMath.g:1430:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getMyStringAction_1_0()); 
            // InternalMath.g:1431:2: ()
            // InternalMath.g:1431:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getMyStringAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMath.g:1439:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1443:1: ( rule__Primary__Group_1__1__Impl )
            // InternalMath.g:1444:2: rule__Primary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1__Impl();

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
    // InternalMath.g:1450:1: rule__Primary__Group_1__1__Impl : ( ( rule__Primary__ValueAssignment_1_1 ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1454:1: ( ( ( rule__Primary__ValueAssignment_1_1 ) ) )
            // InternalMath.g:1455:1: ( ( rule__Primary__ValueAssignment_1_1 ) )
            {
            // InternalMath.g:1455:1: ( ( rule__Primary__ValueAssignment_1_1 ) )
            // InternalMath.g:1456:2: ( rule__Primary__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); 
            // InternalMath.g:1457:2: ( rule__Primary__ValueAssignment_1_1 )
            // InternalMath.g:1457:3: rule__Primary__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); 

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


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalMath.g:1466:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1470:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalMath.g:1471:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalMath.g:1478:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1482:1: ( ( '(' ) )
            // InternalMath.g:1483:1: ( '(' )
            {
            // InternalMath.g:1483:1: ( '(' )
            // InternalMath.g:1484:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalMath.g:1493:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1497:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalMath.g:1498:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalMath.g:1505:1: rule__Primary__Group_2__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1509:1: ( ( ruleExp ) )
            // InternalMath.g:1510:1: ( ruleExp )
            {
            // InternalMath.g:1510:1: ( ruleExp )
            // InternalMath.g:1511:2: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalMath.g:1520:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1524:1: ( rule__Primary__Group_2__2__Impl )
            // InternalMath.g:1525:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalMath.g:1531:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1535:1: ( ( ')' ) )
            // InternalMath.g:1536:1: ( ')' )
            {
            // InternalMath.g:1536:1: ( ')' )
            // InternalMath.g:1537:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__MathExp__ExpAssignment"
    // InternalMath.g:1547:1: rule__MathExp__ExpAssignment : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1551:1: ( ( ruleExp ) )
            // InternalMath.g:1552:2: ( ruleExp )
            {
            // InternalMath.g:1552:2: ( ruleExp )
            // InternalMath.g:1553:3: ruleExp
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


    // $ANTLR start "rule__Var__NameAssignment_1_2"
    // InternalMath.g:1562:1: rule__Var__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1566:1: ( ( RULE_ID ) )
            // InternalMath.g:1567:2: ( RULE_ID )
            {
            // InternalMath.g:1567:2: ( RULE_ID )
            // InternalMath.g:1568:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Var__NameAssignment_1_2"


    // $ANTLR start "rule__Var__RightAssignment_1_4"
    // InternalMath.g:1577:1: rule__Var__RightAssignment_1_4 : ( ruleLet ) ;
    public final void rule__Var__RightAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1581:1: ( ( ruleLet ) )
            // InternalMath.g:1582:2: ( ruleLet )
            {
            // InternalMath.g:1582:2: ( ruleLet )
            // InternalMath.g:1583:3: ruleLet
            {
             before(grammarAccess.getVarAccess().getRightLetParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLet();

            state._fsp--;

             after(grammarAccess.getVarAccess().getRightLetParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Var__RightAssignment_1_4"


    // $ANTLR start "rule__Let__NameAssignment_1_0_2"
    // InternalMath.g:1592:1: rule__Let__NameAssignment_1_0_2 : ( RULE_ID ) ;
    public final void rule__Let__NameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1596:1: ( ( RULE_ID ) )
            // InternalMath.g:1597:2: ( RULE_ID )
            {
            // InternalMath.g:1597:2: ( RULE_ID )
            // InternalMath.g:1598:3: RULE_ID
            {
             before(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Let__NameAssignment_1_0_2"


    // $ANTLR start "rule__Let__RightAssignment_1_0_4"
    // InternalMath.g:1607:1: rule__Let__RightAssignment_1_0_4 : ( rulePlusMinus ) ;
    public final void rule__Let__RightAssignment_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1611:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1612:2: ( rulePlusMinus )
            {
            // InternalMath.g:1612:2: ( rulePlusMinus )
            // InternalMath.g:1613:3: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_0_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_0_4_0()); 

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
    // $ANTLR end "rule__Let__RightAssignment_1_0_4"


    // $ANTLR start "rule__Let__RightAssignment_1_1_2"
    // InternalMath.g:1622:1: rule__Let__RightAssignment_1_1_2 : ( rulePlusMinus ) ;
    public final void rule__Let__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1626:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1627:2: ( rulePlusMinus )
            {
            // InternalMath.g:1627:2: ( rulePlusMinus )
            // InternalMath.g:1628:3: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Let__RightAssignment_1_1_2"


    // $ANTLR start "rule__Let__RightAssignment_1_2_2"
    // InternalMath.g:1637:1: rule__Let__RightAssignment_1_2_2 : ( rulePlusMinus ) ;
    public final void rule__Let__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1641:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1642:2: ( rulePlusMinus )
            {
            // InternalMath.g:1642:2: ( rulePlusMinus )
            // InternalMath.g:1643:3: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__Let__RightAssignment_1_2_2"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_0_2"
    // InternalMath.g:1652:1: rule__PlusMinus__RightAssignment_1_0_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1656:1: ( ( ruleTerm ) )
            // InternalMath.g:1657:2: ( ruleTerm )
            {
            // InternalMath.g:1657:2: ( ruleTerm )
            // InternalMath.g:1658:3: ruleTerm
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
    // InternalMath.g:1667:1: rule__PlusMinus__RightAssignment_1_1_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1671:1: ( ( ruleTerm ) )
            // InternalMath.g:1672:2: ( ruleTerm )
            {
            // InternalMath.g:1672:2: ( ruleTerm )
            // InternalMath.g:1673:3: ruleTerm
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
    // InternalMath.g:1682:1: rule__Term__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1686:1: ( ( rulePrimary ) )
            // InternalMath.g:1687:2: ( rulePrimary )
            {
            // InternalMath.g:1687:2: ( rulePrimary )
            // InternalMath.g:1688:3: rulePrimary
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
    // InternalMath.g:1697:1: rule__Term__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1701:1: ( ( rulePrimary ) )
            // InternalMath.g:1702:2: ( rulePrimary )
            {
            // InternalMath.g:1702:2: ( rulePrimary )
            // InternalMath.g:1703:3: rulePrimary
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
    // InternalMath.g:1712:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1716:1: ( ( RULE_INT ) )
            // InternalMath.g:1717:2: ( RULE_INT )
            {
            // InternalMath.g:1717:2: ( RULE_INT )
            // InternalMath.g:1718:3: RULE_INT
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


    // $ANTLR start "rule__Primary__ValueAssignment_1_1"
    // InternalMath.g:1727:1: rule__Primary__ValueAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Primary__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1731:1: ( ( RULE_ID ) )
            // InternalMath.g:1732:2: ( RULE_ID )
            {
            // InternalMath.g:1732:2: ( RULE_ID )
            // InternalMath.g:1733:3: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Primary__ValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000059800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000059802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});

}