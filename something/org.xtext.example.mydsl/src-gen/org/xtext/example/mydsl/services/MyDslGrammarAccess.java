/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Container");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContainerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cContainsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContainsABCParserRuleCall_1_0 = (RuleCall)cContainsAssignment_1.eContents().get(0);
		
		//Container: "container" contains = ABC;
		@Override public ParserRule getRule() { return rule; }
		
		//"container" contains = ABC
		public Group getGroup() { return cGroup; }
		
		//"container"
		public Keyword getContainerKeyword_0() { return cContainerKeyword_0; }
		
		//contains = ABC
		public Assignment getContainsAssignment_1() { return cContainsAssignment_1; }
		
		//ABC
		public RuleCall getContainsABCParserRuleCall_1_0() { return cContainsABCParserRuleCall_1_0; }
	}
	public class ABCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ABC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Action cBCDAction_0_0_0 = (Action)cGroup_0_0.eContents().get(0);
		private final Keyword cBCDKeyword_0_0_1 = (Keyword)cGroup_0_0.eContents().get(1);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Action cCDEAction_0_1_0 = (Action)cGroup_0_1.eContents().get(0);
		private final Keyword cCDEKeyword_0_1_1 = (Keyword)cGroup_0_1.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ABC: ({BCD} 'BCD' | {CDE} 'CDE') name = ID;
		@Override public ParserRule getRule() { return rule; }
		
		//({BCD} 'BCD' | {CDE} 'CDE') name = ID
		public Group getGroup() { return cGroup; }
		
		//({BCD} 'BCD' | {CDE} 'CDE')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//{BCD} 'BCD'
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//{BCD}
		public Action getBCDAction_0_0_0() { return cBCDAction_0_0_0; }
		
		//'BCD'
		public Keyword getBCDKeyword_0_0_1() { return cBCDKeyword_0_0_1; }
		
		//{CDE} 'CDE'
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//{CDE}
		public Action getCDEAction_0_1_0() { return cCDEAction_0_1_0; }
		
		//'CDE'
		public Keyword getCDEKeyword_0_1_1() { return cCDEKeyword_0_1_1; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final ContainerElements pContainer;
	private final ABCElements pABC;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pContainer = new ContainerElements();
		this.pABC = new ABCElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Container: "container" contains = ABC;
	public ContainerElements getContainerAccess() {
		return pContainer;
	}
	
	public ParserRule getContainerRule() {
		return getContainerAccess().getRule();
	}
	
	//ABC: ({BCD} 'BCD' | {CDE} 'CDE') name = ID;
	public ABCElements getABCAccess() {
		return pABC;
	}
	
	public ParserRule getABCRule() {
		return getABCAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}