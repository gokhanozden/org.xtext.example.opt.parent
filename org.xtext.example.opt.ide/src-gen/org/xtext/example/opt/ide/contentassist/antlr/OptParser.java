/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.opt.ide.contentassist.antlr.internal.InternalOptParser;
import org.xtext.example.opt.services.OptGrammarAccess;

public class OptParser extends AbstractContentAssistParser {

	@Inject
	private OptGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalOptParser createParser() {
		InternalOptParser result = new InternalOptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getObjectiveAccess().getAlternatives(), "rule__Objective__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getStopping_CriteriaAccess().getAlternatives(), "rule__Stopping_Criteria__Alternatives");
					put(grammarAccess.getESStrategyAccess().getAlternatives(), "rule__ESStrategy__Alternatives");
					put(grammarAccess.getVariableGroupAccess().getAlternatives(), "rule__VariableGroup__Alternatives");
					put(grammarAccess.getVariableTypeAccess().getAlternatives(), "rule__VariableType__Alternatives");
					put(grammarAccess.getMinMaxAccess().getAlternatives(), "rule__MinMax__Alternatives");
					put(grammarAccess.getSimModelTypeAccess().getAlternatives(), "rule__SimModelType__Alternatives");
					put(grammarAccess.getOptimizerAccess().getGroup(), "rule__Optimizer__Group__0");
					put(grammarAccess.getEvolutionaryStrategiesAccess().getGroup(), "rule__EvolutionaryStrategies__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup_6(), "rule__Variable__Group_6__0");
					put(grammarAccess.getSimulationAccess().getGroup(), "rule__Simulation__Group__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getConvergenceAccess().getGroup(), "rule__Convergence__Group__0");
					put(grammarAccess.getConvergenceAccess().getGroup_3(), "rule__Convergence__Group_3__0");
					put(grammarAccess.getConvergenceAccess().getGroup_4(), "rule__Convergence__Group_4__0");
					put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
					put(grammarAccess.getDurationAccess().getGroup_3(), "rule__Duration__Group_3__0");
					put(grammarAccess.getEndTimeAccess().getGroup(), "rule__EndTime__Group__0");
					put(grammarAccess.getEndTimeAccess().getGroup_3(), "rule__EndTime__Group_3__0");
					put(grammarAccess.getMaxIterationAccess().getGroup(), "rule__MaxIteration__Group__0");
					put(grammarAccess.getThresholdAccess().getGroup(), "rule__Threshold__Group__0");
					put(grammarAccess.getThresholdAccess().getGroup_3(), "rule__Threshold__Group_3__0");
					put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
					put(grammarAccess.getOptimizerAccess().getNameAssignment_1(), "rule__Optimizer__NameAssignment_1");
					put(grammarAccess.getOptimizerAccess().getObjectiveAssignment_4(), "rule__Optimizer__ObjectiveAssignment_4");
					put(grammarAccess.getOptimizerAccess().getStoppingcriteriaAssignment_7(), "rule__Optimizer__StoppingcriteriaAssignment_7");
					put(grammarAccess.getOptimizerAccess().getOptimizationmethodAssignment_10(), "rule__Optimizer__OptimizationmethodAssignment_10");
					put(grammarAccess.getOptimizerAccess().getSeedAssignment_13(), "rule__Optimizer__SeedAssignment_13");
					put(grammarAccess.getOptimizerAccess().getMinmaxAssignment_16(), "rule__Optimizer__MinmaxAssignment_16");
					put(grammarAccess.getEvolutionaryStrategiesAccess().getNameAssignment_1(), "rule__EvolutionaryStrategies__NameAssignment_1");
					put(grammarAccess.getEvolutionaryStrategiesAccess().getMuAssignment_4(), "rule__EvolutionaryStrategies__MuAssignment_4");
					put(grammarAccess.getEvolutionaryStrategiesAccess().getLambdaAssignment_7(), "rule__EvolutionaryStrategies__LambdaAssignment_7");
					put(grammarAccess.getEvolutionaryStrategiesAccess().getSigmaAssignment_10(), "rule__EvolutionaryStrategies__SigmaAssignment_10");
					put(grammarAccess.getEvolutionaryStrategiesAccess().getStrategyAssignment_13(), "rule__EvolutionaryStrategies__StrategyAssignment_13");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
					put(grammarAccess.getVariableAccess().getTypeAssignment_3(), "rule__Variable__TypeAssignment_3");
					put(grammarAccess.getVariableAccess().getGroupAssignment_5(), "rule__Variable__GroupAssignment_5");
					put(grammarAccess.getVariableAccess().getLowValueAssignment_6_1(), "rule__Variable__LowValueAssignment_6_1");
					put(grammarAccess.getVariableAccess().getHighValueAssignment_6_3(), "rule__Variable__HighValueAssignment_6_3");
					put(grammarAccess.getSimulationAccess().getNameAssignment_1(), "rule__Simulation__NameAssignment_1");
					put(grammarAccess.getSimulationAccess().getModelFileFolderPathAssignment_4(), "rule__Simulation__ModelFileFolderPathAssignment_4");
					put(grammarAccess.getSimulationAccess().getFunctionNameAssignment_7(), "rule__Simulation__FunctionNameAssignment_7");
					put(grammarAccess.getSimulationAccess().getInitializationAssignment_10(), "rule__Simulation__InitializationAssignment_10");
					put(grammarAccess.getSimulationAccess().getModelTypeAssignment_13(), "rule__Simulation__ModelTypeAssignment_13");
					put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getVariableAssignment_2_1(), "rule__Atomic__VariableAssignment_2_1");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getFunction1Assignment_3(), "rule__Function__Function1Assignment_3");
					put(grammarAccess.getExpressionAccess().getLeftAssignment_0(), "rule__Expression__LeftAssignment_0");
					put(grammarAccess.getExpressionAccess().getOperatorAssignment_1_0(), "rule__Expression__OperatorAssignment_1_0");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_1(), "rule__Expression__RightAssignment_1_1");
					put(grammarAccess.getConvergenceAccess().getNameAssignment_1(), "rule__Convergence__NameAssignment_1");
					put(grammarAccess.getConvergenceAccess().getConvergenceThresholdAssignment_3_1(), "rule__Convergence__ConvergenceThresholdAssignment_3_1");
					put(grammarAccess.getConvergenceAccess().getConvergencerangeAssignment_4_1(), "rule__Convergence__ConvergencerangeAssignment_4_1");
					put(grammarAccess.getDurationAccess().getNameAssignment_1(), "rule__Duration__NameAssignment_1");
					put(grammarAccess.getDurationAccess().getDurationtimeAssignment_3_1(), "rule__Duration__DurationtimeAssignment_3_1");
					put(grammarAccess.getEndTimeAccess().getNameAssignment_1(), "rule__EndTime__NameAssignment_1");
					put(grammarAccess.getEndTimeAccess().getEndtimeAssignment_3_1(), "rule__EndTime__EndtimeAssignment_3_1");
					put(grammarAccess.getMaxIterationAccess().getNameAssignment_1(), "rule__MaxIteration__NameAssignment_1");
					put(grammarAccess.getMaxIterationAccess().getMaxiterationAssignment_3(), "rule__MaxIteration__MaxiterationAssignment_3");
					put(grammarAccess.getThresholdAccess().getNameAssignment_1(), "rule__Threshold__NameAssignment_1");
					put(grammarAccess.getThresholdAccess().getThresholdvalueAssignment_3_1(), "rule__Threshold__ThresholdvalueAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalOptParser typedParser = (InternalOptParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}