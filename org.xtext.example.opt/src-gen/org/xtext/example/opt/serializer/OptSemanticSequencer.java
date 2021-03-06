/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.opt.opt.Convergence;
import org.xtext.example.opt.opt.DecimalConstant;
import org.xtext.example.opt.opt.Duration;
import org.xtext.example.opt.opt.EndTime;
import org.xtext.example.opt.opt.EvolutionaryStrategies;
import org.xtext.example.opt.opt.Expression;
import org.xtext.example.opt.opt.Function;
import org.xtext.example.opt.opt.IntConstant;
import org.xtext.example.opt.opt.MaxIteration;
import org.xtext.example.opt.opt.Model;
import org.xtext.example.opt.opt.OptPackage;
import org.xtext.example.opt.opt.Optimizer;
import org.xtext.example.opt.opt.Simulation;
import org.xtext.example.opt.opt.Threshold;
import org.xtext.example.opt.opt.Variable;
import org.xtext.example.opt.opt.variableRef;
import org.xtext.example.opt.services.OptGrammarAccess;

@SuppressWarnings("all")
public class OptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OptGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OptPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OptPackage.CONVERGENCE:
				sequence_Convergence(context, (Convergence) semanticObject); 
				return; 
			case OptPackage.DECIMAL_CONSTANT:
				sequence_Atomic(context, (DecimalConstant) semanticObject); 
				return; 
			case OptPackage.DURATION:
				sequence_Duration(context, (Duration) semanticObject); 
				return; 
			case OptPackage.END_TIME:
				sequence_EndTime(context, (EndTime) semanticObject); 
				return; 
			case OptPackage.EVOLUTIONARY_STRATEGIES:
				sequence_EvolutionaryStrategies(context, (EvolutionaryStrategies) semanticObject); 
				return; 
			case OptPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case OptPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case OptPackage.INT_CONSTANT:
				sequence_Atomic(context, (IntConstant) semanticObject); 
				return; 
			case OptPackage.MAX_ITERATION:
				sequence_MaxIteration(context, (MaxIteration) semanticObject); 
				return; 
			case OptPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case OptPackage.OPTIMIZER:
				sequence_Optimizer(context, (Optimizer) semanticObject); 
				return; 
			case OptPackage.SIMULATION:
				sequence_Simulation(context, (Simulation) semanticObject); 
				return; 
			case OptPackage.THRESHOLD:
				sequence_Threshold(context, (Threshold) semanticObject); 
				return; 
			case OptPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case OptPackage.VARIABLE_REF:
				sequence_Atomic(context, (variableRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Atomic returns DecimalConstant
	 *
	 * Constraint:
	 *     value=DECIMAL
	 */
	protected void sequence_Atomic(ISerializationContext context, DecimalConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.DECIMAL_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.DECIMAL_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueDECIMALTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns IntConstant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(ISerializationContext context, IntConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.INT_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns variableRef
	 *
	 * Constraint:
	 *     variable=[Variable|ID]
	 */
	protected void sequence_Atomic(ISerializationContext context, variableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.VARIABLE_REF__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_2_1_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Convergence
	 *     Stopping_Criteria returns Convergence
	 *     Convergence returns Convergence
	 *
	 * Constraint:
	 *     (name=ID convergenceThreshold=INT convergencerange=INT)
	 */
	protected void sequence_Convergence(ISerializationContext context, Convergence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.CONVERGENCE__CONVERGENCE_THRESHOLD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.CONVERGENCE__CONVERGENCE_THRESHOLD));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.CONVERGENCE__CONVERGENCERANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.CONVERGENCE__CONVERGENCERANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConvergenceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConvergenceAccess().getConvergenceThresholdINTTerminalRuleCall_3_1_0(), semanticObject.getConvergenceThreshold());
		feeder.accept(grammarAccess.getConvergenceAccess().getConvergencerangeINTTerminalRuleCall_4_1_0(), semanticObject.getConvergencerange());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Duration
	 *     Stopping_Criteria returns Duration
	 *     Duration returns Duration
	 *
	 * Constraint:
	 *     (name=ID durationtime=STRING)
	 */
	protected void sequence_Duration(ISerializationContext context, Duration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.DURATION__DURATIONTIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.DURATION__DURATIONTIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDurationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDurationAccess().getDurationtimeSTRINGTerminalRuleCall_3_1_0(), semanticObject.getDurationtime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns EndTime
	 *     Stopping_Criteria returns EndTime
	 *     EndTime returns EndTime
	 *
	 * Constraint:
	 *     (name=ID endtime=STRING)
	 */
	protected void sequence_EndTime(ISerializationContext context, EndTime semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.END_TIME__ENDTIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.END_TIME__ENDTIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEndTimeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEndTimeAccess().getEndtimeSTRINGTerminalRuleCall_3_1_0(), semanticObject.getEndtime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns EvolutionaryStrategies
	 *     OptimizationMethod returns EvolutionaryStrategies
	 *     EvolutionaryStrategies returns EvolutionaryStrategies
	 *
	 * Constraint:
	 *     (name=ID mu=INT lambda=INT sigma=DECIMAL strategy=ESStrategy)
	 */
	protected void sequence_EvolutionaryStrategies(ISerializationContext context, EvolutionaryStrategies semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.EVOLUTIONARY_STRATEGIES__MU) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.EVOLUTIONARY_STRATEGIES__MU));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.EVOLUTIONARY_STRATEGIES__LAMBDA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.EVOLUTIONARY_STRATEGIES__LAMBDA));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.EVOLUTIONARY_STRATEGIES__SIGMA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.EVOLUTIONARY_STRATEGIES__SIGMA));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.EVOLUTIONARY_STRATEGIES__STRATEGY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.EVOLUTIONARY_STRATEGIES__STRATEGY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvolutionaryStrategiesAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEvolutionaryStrategiesAccess().getMuINTTerminalRuleCall_4_0(), semanticObject.getMu());
		feeder.accept(grammarAccess.getEvolutionaryStrategiesAccess().getLambdaINTTerminalRuleCall_7_0(), semanticObject.getLambda());
		feeder.accept(grammarAccess.getEvolutionaryStrategiesAccess().getSigmaDECIMALTerminalRuleCall_10_0(), semanticObject.getSigma());
		feeder.accept(grammarAccess.getEvolutionaryStrategiesAccess().getStrategyESStrategyEnumRuleCall_13_0(), semanticObject.getStrategy());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (left=Atomic (operator=Operator right=Expression)?)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Function
	 *     Objective returns Function
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=ID function1=Expression)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.FUNCTION__FUNCTION1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.FUNCTION__FUNCTION1));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionAccess().getFunction1ExpressionParserRuleCall_3_0(), semanticObject.getFunction1());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns MaxIteration
	 *     Stopping_Criteria returns MaxIteration
	 *     MaxIteration returns MaxIteration
	 *
	 * Constraint:
	 *     (name=ID maxiteration=INT)
	 */
	protected void sequence_MaxIteration(ISerializationContext context, MaxIteration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.MAX_ITERATION__MAXITERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.MAX_ITERATION__MAXITERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMaxIterationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMaxIterationAccess().getMaxiterationINTTerminalRuleCall_3_0(), semanticObject.getMaxiteration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=Type+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Optimizer
	 *     Optimizer returns Optimizer
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         objective=[Objective|ID] 
	 *         stoppingcriteria=[Stopping_Criteria|ID] 
	 *         optimizationmethod=[OptimizationMethod|ID] 
	 *         seed=INT 
	 *         minmax=MinMax
	 *     )
	 */
	protected void sequence_Optimizer(ISerializationContext context, Optimizer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.OPTIMIZER__OBJECTIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.OPTIMIZER__OBJECTIVE));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.OPTIMIZER__STOPPINGCRITERIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.OPTIMIZER__STOPPINGCRITERIA));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.OPTIMIZER__OPTIMIZATIONMETHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.OPTIMIZER__OPTIMIZATIONMETHOD));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.OPTIMIZER__SEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.OPTIMIZER__SEED));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.OPTIMIZER__MINMAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.OPTIMIZER__MINMAX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOptimizerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOptimizerAccess().getObjectiveObjectiveIDTerminalRuleCall_4_0_1(), semanticObject.getObjective());
		feeder.accept(grammarAccess.getOptimizerAccess().getStoppingcriteriaStopping_CriteriaIDTerminalRuleCall_7_0_1(), semanticObject.getStoppingcriteria());
		feeder.accept(grammarAccess.getOptimizerAccess().getOptimizationmethodOptimizationMethodIDTerminalRuleCall_10_0_1(), semanticObject.getOptimizationmethod());
		feeder.accept(grammarAccess.getOptimizerAccess().getSeedINTTerminalRuleCall_13_0(), semanticObject.getSeed());
		feeder.accept(grammarAccess.getOptimizerAccess().getMinmaxMinMaxEnumRuleCall_16_0(), semanticObject.getMinmax());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Simulation
	 *     Objective returns Simulation
	 *     Simulation returns Simulation
	 *
	 * Constraint:
	 *     (name=ID modelFileFolderPath=STRING functionName=STRING initialization=STRING modelType=SimModelType)
	 */
	protected void sequence_Simulation(ISerializationContext context, Simulation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.SIMULATION__MODEL_FILE_FOLDER_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.SIMULATION__MODEL_FILE_FOLDER_PATH));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.SIMULATION__FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.SIMULATION__FUNCTION_NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.SIMULATION__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.SIMULATION__INITIALIZATION));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.SIMULATION__MODEL_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.SIMULATION__MODEL_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimulationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSimulationAccess().getModelFileFolderPathSTRINGTerminalRuleCall_4_0(), semanticObject.getModelFileFolderPath());
		feeder.accept(grammarAccess.getSimulationAccess().getFunctionNameSTRINGTerminalRuleCall_7_0(), semanticObject.getFunctionName());
		feeder.accept(grammarAccess.getSimulationAccess().getInitializationSTRINGTerminalRuleCall_10_0(), semanticObject.getInitialization());
		feeder.accept(grammarAccess.getSimulationAccess().getModelTypeSimModelTypeEnumRuleCall_13_0(), semanticObject.getModelType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Threshold
	 *     Stopping_Criteria returns Threshold
	 *     Threshold returns Threshold
	 *
	 * Constraint:
	 *     (name=ID thresholdvalue=DECIMAL)
	 */
	protected void sequence_Threshold(ISerializationContext context, Threshold semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, OptPackage.Literals.THRESHOLD__THRESHOLDVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OptPackage.Literals.THRESHOLD__THRESHOLDVALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThresholdAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getThresholdAccess().getThresholdvalueDECIMALTerminalRuleCall_3_1_0(), semanticObject.getThresholdvalue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=ID type=VariableType group=VariableGroup (lowValue=DECIMAL highValue=DECIMAL)?)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
