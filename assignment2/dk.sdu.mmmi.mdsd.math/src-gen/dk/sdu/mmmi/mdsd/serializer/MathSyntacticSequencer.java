/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MathSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MathGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Let_EndKeyword_1_2_1_0_or_EndKeyword_1_2_1_1;
	protected AbstractElementAlias match_Let_EqualsSignKeyword_1_0_3_1_or_SpaceEqualsSignSpaceKeyword_1_0_3_0;
	protected AbstractElementAlias match_Let_LetKeyword_1_0_1_0_or_LetKeyword_1_0_1_1;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_2_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MathGrammarAccess) access;
		match_Let_EndKeyword_1_2_1_0_or_EndKeyword_1_2_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLetAccess().getEndKeyword_1_2_1_0()), new TokenAlias(false, false, grammarAccess.getLetAccess().getEndKeyword_1_2_1_1()));
		match_Let_EqualsSignKeyword_1_0_3_1_or_SpaceEqualsSignSpaceKeyword_1_0_3_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLetAccess().getEqualsSignKeyword_1_0_3_1()), new TokenAlias(false, false, grammarAccess.getLetAccess().getSpaceEqualsSignSpaceKeyword_1_0_3_0()));
		match_Let_LetKeyword_1_0_1_0_or_LetKeyword_1_0_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLetAccess().getLetKeyword_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getLetAccess().getLetKeyword_1_0_1_1()));
		match_Primary_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
		match_Primary_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Let_EndKeyword_1_2_1_0_or_EndKeyword_1_2_1_1.equals(syntax))
				emit_Let_EndKeyword_1_2_1_0_or_EndKeyword_1_2_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Let_EqualsSignKeyword_1_0_3_1_or_SpaceEqualsSignSpaceKeyword_1_0_3_0.equals(syntax))
				emit_Let_EqualsSignKeyword_1_0_3_1_or_SpaceEqualsSignSpaceKeyword_1_0_3_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Let_LetKeyword_1_0_1_0_or_LetKeyword_1_0_1_1.equals(syntax))
				emit_Let_LetKeyword_1_0_1_0_or_LetKeyword_1_0_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'end' | ' end '
	 *
	 * This ambiguous syntax occurs at:
	 *     {End.left=} (ambiguity) right=PlusMinus
	 
	 * </pre>
	 */
	protected void emit_Let_EndKeyword_1_2_1_0_or_EndKeyword_1_2_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ' = ' | '='
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) right=PlusMinus
	 
	 * </pre>
	 */
	protected void emit_Let_EqualsSignKeyword_1_0_3_1_or_SpaceEqualsSignSpaceKeyword_1_0_3_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'let ' | ' let '
	 *
	 * This ambiguous syntax occurs at:
	 *     {Let.left=} (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_Let_LetKeyword_1_0_1_0_or_LetKeyword_1_0_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) value=ID
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) {Div.left=}
	 *     (rule start) (ambiguity) {End.left=}
	 *     (rule start) (ambiguity) {In.left=}
	 *     (rule start) (ambiguity) {Let.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 *     (rule start) (ambiguity) {Var.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Div.left=}
	 *     (rule start) (ambiguity) {End.left=}
	 *     (rule start) (ambiguity) {In.left=}
	 *     (rule start) (ambiguity) {Let.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 *     (rule start) (ambiguity) {Var.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
