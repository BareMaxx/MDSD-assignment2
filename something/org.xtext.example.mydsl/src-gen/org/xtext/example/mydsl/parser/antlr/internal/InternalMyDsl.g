/*
 * generated by Xtext 2.33.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleContainer
entryRuleContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerRule()); }
	iv_ruleContainer=ruleContainer
	{ $current=$iv_ruleContainer.current; }
	EOF;

// Rule Container
ruleContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='container'
		{
			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContainerAccess().getContainsABCParserRuleCall_1_0());
				}
				lv_contains_1_0=ruleABC
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainerRule());
					}
					set(
						$current,
						"contains",
						lv_contains_1_0,
						"org.xtext.example.mydsl.MyDsl.ABC");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleABC
entryRuleABC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getABCRule()); }
	iv_ruleABC=ruleABC
	{ $current=$iv_ruleABC.current; }
	EOF;

// Rule ABC
ruleABC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getABCAccess().getBCDAction_0_0_0(),
							$current);
					}
				)
				otherlv_1='BCD'
				{
					newLeafNode(otherlv_1, grammarAccess.getABCAccess().getBCDKeyword_0_0_1());
				}
			)
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getABCAccess().getCDEAction_0_1_0(),
							$current);
					}
				)
				otherlv_3='CDE'
				{
					newLeafNode(otherlv_3, grammarAccess.getABCAccess().getCDEKeyword_0_1_1());
				}
			)
		)
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getABCAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getABCRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;