package org.xtext.example.opt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.opt.services.OptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'optimizer'", "'{'", "'objective'", "';'", "'stoppingcriteria'", "'optimizationmethod'", "'seed'", "'minmax'", "'}'", "'evolutionarystrategies'", "'mu'", "'lambda'", "'sigma'", "'strategy'", "'variable'", "':'", "'group'", "'['", "','", "']'", "'simulation'", "'modelFolder'", "'functionname'", "'initialization'", "'modelType'", "'+'", "'-'", "'*'", "'/'", "'%'", "'function'", "'convergence'", "'convergencethreshold'", "'.'", "'convergencerange'", "'duration'", "'durationtime'", "'endtime'", "'maxiteration'", "'threshold'", "'thresholdvalue'", "'COMMA'", "'PLUS'", "'FACTOR'", "'RESPONSE'", "'BOOLEAN'", "'INTEGER'", "'DECIMAL'", "'STRING'", "'Min'", "'Max'", "'STATIC'", "'CONTINUOUS'", "'DISCRETEEVENT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalOptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOpt.g"; }



     	private OptGrammarAccess grammarAccess;

        public InternalOptParser(TokenStream input, OptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOpt.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOpt.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOpt.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOpt.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalOpt.g:78:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalOpt.g:79:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalOpt.g:79:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==21||LA1_0==26||LA1_0==32||(LA1_0>=42 && LA1_0<=43)||LA1_0==47||(LA1_0>=49 && LA1_0<=51)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOpt.g:80:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalOpt.g:80:3: (lv_elements_0_0= ruleType )
            	    // InternalOpt.g:81:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.opt.Opt.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalOpt.g:101:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalOpt.g:101:45: (iv_ruleType= ruleType EOF )
            // InternalOpt.g:102:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalOpt.g:108:1: ruleType returns [EObject current=null] : (this_Optimizer_0= ruleOptimizer | this_Variable_1= ruleVariable | this_Simulation_2= ruleSimulation | this_Function_3= ruleFunction | this_EvolutionaryStrategies_4= ruleEvolutionaryStrategies | this_Convergence_5= ruleConvergence | this_Duration_6= ruleDuration | this_EndTime_7= ruleEndTime | this_MaxIteration_8= ruleMaxIteration | this_Threshold_9= ruleThreshold ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Optimizer_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Simulation_2 = null;

        EObject this_Function_3 = null;

        EObject this_EvolutionaryStrategies_4 = null;

        EObject this_Convergence_5 = null;

        EObject this_Duration_6 = null;

        EObject this_EndTime_7 = null;

        EObject this_MaxIteration_8 = null;

        EObject this_Threshold_9 = null;



        	enterRule();

        try {
            // InternalOpt.g:114:2: ( (this_Optimizer_0= ruleOptimizer | this_Variable_1= ruleVariable | this_Simulation_2= ruleSimulation | this_Function_3= ruleFunction | this_EvolutionaryStrategies_4= ruleEvolutionaryStrategies | this_Convergence_5= ruleConvergence | this_Duration_6= ruleDuration | this_EndTime_7= ruleEndTime | this_MaxIteration_8= ruleMaxIteration | this_Threshold_9= ruleThreshold ) )
            // InternalOpt.g:115:2: (this_Optimizer_0= ruleOptimizer | this_Variable_1= ruleVariable | this_Simulation_2= ruleSimulation | this_Function_3= ruleFunction | this_EvolutionaryStrategies_4= ruleEvolutionaryStrategies | this_Convergence_5= ruleConvergence | this_Duration_6= ruleDuration | this_EndTime_7= ruleEndTime | this_MaxIteration_8= ruleMaxIteration | this_Threshold_9= ruleThreshold )
            {
            // InternalOpt.g:115:2: (this_Optimizer_0= ruleOptimizer | this_Variable_1= ruleVariable | this_Simulation_2= ruleSimulation | this_Function_3= ruleFunction | this_EvolutionaryStrategies_4= ruleEvolutionaryStrategies | this_Convergence_5= ruleConvergence | this_Duration_6= ruleDuration | this_EndTime_7= ruleEndTime | this_MaxIteration_8= ruleMaxIteration | this_Threshold_9= ruleThreshold )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 42:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 43:
                {
                alt2=6;
                }
                break;
            case 47:
                {
                alt2=7;
                }
                break;
            case 49:
                {
                alt2=8;
                }
                break;
            case 50:
                {
                alt2=9;
                }
                break;
            case 51:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOpt.g:116:3: this_Optimizer_0= ruleOptimizer
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getOptimizerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Optimizer_0=ruleOptimizer();

                    state._fsp--;


                    			current = this_Optimizer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOpt.g:125:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOpt.g:134:3: this_Simulation_2= ruleSimulation
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSimulationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Simulation_2=ruleSimulation();

                    state._fsp--;


                    			current = this_Simulation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOpt.g:143:3: this_Function_3= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getFunctionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_3=ruleFunction();

                    state._fsp--;


                    			current = this_Function_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOpt.g:152:3: this_EvolutionaryStrategies_4= ruleEvolutionaryStrategies
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEvolutionaryStrategiesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvolutionaryStrategies_4=ruleEvolutionaryStrategies();

                    state._fsp--;


                    			current = this_EvolutionaryStrategies_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOpt.g:161:3: this_Convergence_5= ruleConvergence
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getConvergenceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Convergence_5=ruleConvergence();

                    state._fsp--;


                    			current = this_Convergence_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOpt.g:170:3: this_Duration_6= ruleDuration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDurationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Duration_6=ruleDuration();

                    state._fsp--;


                    			current = this_Duration_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOpt.g:179:3: this_EndTime_7= ruleEndTime
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEndTimeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndTime_7=ruleEndTime();

                    state._fsp--;


                    			current = this_EndTime_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOpt.g:188:3: this_MaxIteration_8= ruleMaxIteration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMaxIterationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxIteration_8=ruleMaxIteration();

                    state._fsp--;


                    			current = this_MaxIteration_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalOpt.g:197:3: this_Threshold_9= ruleThreshold
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getThresholdParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Threshold_9=ruleThreshold();

                    state._fsp--;


                    			current = this_Threshold_9;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleOptimizer"
    // InternalOpt.g:209:1: entryRuleOptimizer returns [EObject current=null] : iv_ruleOptimizer= ruleOptimizer EOF ;
    public final EObject entryRuleOptimizer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptimizer = null;


        try {
            // InternalOpt.g:209:50: (iv_ruleOptimizer= ruleOptimizer EOF )
            // InternalOpt.g:210:2: iv_ruleOptimizer= ruleOptimizer EOF
            {
             newCompositeNode(grammarAccess.getOptimizerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptimizer=ruleOptimizer();

            state._fsp--;

             current =iv_ruleOptimizer; 
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
    // $ANTLR end "entryRuleOptimizer"


    // $ANTLR start "ruleOptimizer"
    // InternalOpt.g:216:1: ruleOptimizer returns [EObject current=null] : (otherlv_0= 'optimizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objective' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'stoppingcriteria' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'optimizationmethod' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'seed' ( (lv_seed_13_0= RULE_INT ) ) otherlv_14= ';' otherlv_15= 'minmax' ( (lv_minmax_16_0= ruleMinMax ) ) otherlv_17= ';' otherlv_18= '}' ) ;
    public final EObject ruleOptimizer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_seed_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Enumerator lv_minmax_16_0 = null;



        	enterRule();

        try {
            // InternalOpt.g:222:2: ( (otherlv_0= 'optimizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objective' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'stoppingcriteria' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'optimizationmethod' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'seed' ( (lv_seed_13_0= RULE_INT ) ) otherlv_14= ';' otherlv_15= 'minmax' ( (lv_minmax_16_0= ruleMinMax ) ) otherlv_17= ';' otherlv_18= '}' ) )
            // InternalOpt.g:223:2: (otherlv_0= 'optimizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objective' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'stoppingcriteria' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'optimizationmethod' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'seed' ( (lv_seed_13_0= RULE_INT ) ) otherlv_14= ';' otherlv_15= 'minmax' ( (lv_minmax_16_0= ruleMinMax ) ) otherlv_17= ';' otherlv_18= '}' )
            {
            // InternalOpt.g:223:2: (otherlv_0= 'optimizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objective' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'stoppingcriteria' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'optimizationmethod' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'seed' ( (lv_seed_13_0= RULE_INT ) ) otherlv_14= ';' otherlv_15= 'minmax' ( (lv_minmax_16_0= ruleMinMax ) ) otherlv_17= ';' otherlv_18= '}' )
            // InternalOpt.g:224:3: otherlv_0= 'optimizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objective' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'stoppingcriteria' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'optimizationmethod' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'seed' ( (lv_seed_13_0= RULE_INT ) ) otherlv_14= ';' otherlv_15= 'minmax' ( (lv_minmax_16_0= ruleMinMax ) ) otherlv_17= ';' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOptimizerAccess().getOptimizerKeyword_0());
            		
            // InternalOpt.g:228:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:229:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:229:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:230:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOptimizerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptimizerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getOptimizerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getOptimizerAccess().getObjectiveKeyword_3());
            		
            // InternalOpt.g:254:3: ( (otherlv_4= RULE_ID ) )
            // InternalOpt.g:255:4: (otherlv_4= RULE_ID )
            {
            // InternalOpt.g:255:4: (otherlv_4= RULE_ID )
            // InternalOpt.g:256:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptimizerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_4, grammarAccess.getOptimizerAccess().getObjectiveObjectiveCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getOptimizerAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getOptimizerAccess().getStoppingcriteriaKeyword_6());
            		
            // InternalOpt.g:275:3: ( (otherlv_7= RULE_ID ) )
            // InternalOpt.g:276:4: (otherlv_7= RULE_ID )
            {
            // InternalOpt.g:276:4: (otherlv_7= RULE_ID )
            // InternalOpt.g:277:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptimizerRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_7, grammarAccess.getOptimizerAccess().getStoppingcriteriaStopping_CriteriaCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getOptimizerAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getOptimizerAccess().getOptimizationmethodKeyword_9());
            		
            // InternalOpt.g:296:3: ( (otherlv_10= RULE_ID ) )
            // InternalOpt.g:297:4: (otherlv_10= RULE_ID )
            {
            // InternalOpt.g:297:4: (otherlv_10= RULE_ID )
            // InternalOpt.g:298:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptimizerRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_10, grammarAccess.getOptimizerAccess().getOptimizationmethodOptimizationMethodCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getOptimizerAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getOptimizerAccess().getSeedKeyword_12());
            		
            // InternalOpt.g:317:3: ( (lv_seed_13_0= RULE_INT ) )
            // InternalOpt.g:318:4: (lv_seed_13_0= RULE_INT )
            {
            // InternalOpt.g:318:4: (lv_seed_13_0= RULE_INT )
            // InternalOpt.g:319:5: lv_seed_13_0= RULE_INT
            {
            lv_seed_13_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_seed_13_0, grammarAccess.getOptimizerAccess().getSeedINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptimizerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"seed",
            						lv_seed_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getOptimizerAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getOptimizerAccess().getMinmaxKeyword_15());
            		
            // InternalOpt.g:343:3: ( (lv_minmax_16_0= ruleMinMax ) )
            // InternalOpt.g:344:4: (lv_minmax_16_0= ruleMinMax )
            {
            // InternalOpt.g:344:4: (lv_minmax_16_0= ruleMinMax )
            // InternalOpt.g:345:5: lv_minmax_16_0= ruleMinMax
            {

            					newCompositeNode(grammarAccess.getOptimizerAccess().getMinmaxMinMaxEnumRuleCall_16_0());
            				
            pushFollow(FOLLOW_7);
            lv_minmax_16_0=ruleMinMax();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptimizerRule());
            					}
            					set(
            						current,
            						"minmax",
            						lv_minmax_16_0,
            						"org.xtext.example.opt.Opt.MinMax");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_17, grammarAccess.getOptimizerAccess().getSemicolonKeyword_17());
            		
            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getOptimizerAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleOptimizer"


    // $ANTLR start "entryRuleEvolutionaryStrategies"
    // InternalOpt.g:374:1: entryRuleEvolutionaryStrategies returns [EObject current=null] : iv_ruleEvolutionaryStrategies= ruleEvolutionaryStrategies EOF ;
    public final EObject entryRuleEvolutionaryStrategies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolutionaryStrategies = null;


        try {
            // InternalOpt.g:374:63: (iv_ruleEvolutionaryStrategies= ruleEvolutionaryStrategies EOF )
            // InternalOpt.g:375:2: iv_ruleEvolutionaryStrategies= ruleEvolutionaryStrategies EOF
            {
             newCompositeNode(grammarAccess.getEvolutionaryStrategiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvolutionaryStrategies=ruleEvolutionaryStrategies();

            state._fsp--;

             current =iv_ruleEvolutionaryStrategies; 
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
    // $ANTLR end "entryRuleEvolutionaryStrategies"


    // $ANTLR start "ruleEvolutionaryStrategies"
    // InternalOpt.g:381:1: ruleEvolutionaryStrategies returns [EObject current=null] : (otherlv_0= 'evolutionarystrategies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'mu' ( (lv_mu_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'lambda' ( (lv_lambda_7_0= RULE_INT ) ) otherlv_8= ';' otherlv_9= 'sigma' ( (lv_sigma_10_0= RULE_DECIMAL ) ) otherlv_11= ';' otherlv_12= 'strategy' ( (lv_strategy_13_0= ruleESStrategy ) ) otherlv_14= ';' otherlv_15= '}' ) ;
    public final EObject ruleEvolutionaryStrategies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_mu_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_lambda_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_sigma_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_strategy_13_0 = null;



        	enterRule();

        try {
            // InternalOpt.g:387:2: ( (otherlv_0= 'evolutionarystrategies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'mu' ( (lv_mu_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'lambda' ( (lv_lambda_7_0= RULE_INT ) ) otherlv_8= ';' otherlv_9= 'sigma' ( (lv_sigma_10_0= RULE_DECIMAL ) ) otherlv_11= ';' otherlv_12= 'strategy' ( (lv_strategy_13_0= ruleESStrategy ) ) otherlv_14= ';' otherlv_15= '}' ) )
            // InternalOpt.g:388:2: (otherlv_0= 'evolutionarystrategies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'mu' ( (lv_mu_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'lambda' ( (lv_lambda_7_0= RULE_INT ) ) otherlv_8= ';' otherlv_9= 'sigma' ( (lv_sigma_10_0= RULE_DECIMAL ) ) otherlv_11= ';' otherlv_12= 'strategy' ( (lv_strategy_13_0= ruleESStrategy ) ) otherlv_14= ';' otherlv_15= '}' )
            {
            // InternalOpt.g:388:2: (otherlv_0= 'evolutionarystrategies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'mu' ( (lv_mu_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'lambda' ( (lv_lambda_7_0= RULE_INT ) ) otherlv_8= ';' otherlv_9= 'sigma' ( (lv_sigma_10_0= RULE_DECIMAL ) ) otherlv_11= ';' otherlv_12= 'strategy' ( (lv_strategy_13_0= ruleESStrategy ) ) otherlv_14= ';' otherlv_15= '}' )
            // InternalOpt.g:389:3: otherlv_0= 'evolutionarystrategies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'mu' ( (lv_mu_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'lambda' ( (lv_lambda_7_0= RULE_INT ) ) otherlv_8= ';' otherlv_9= 'sigma' ( (lv_sigma_10_0= RULE_DECIMAL ) ) otherlv_11= ';' otherlv_12= 'strategy' ( (lv_strategy_13_0= ruleESStrategy ) ) otherlv_14= ';' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvolutionaryStrategiesAccess().getEvolutionarystrategiesKeyword_0());
            		
            // InternalOpt.g:393:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:394:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:394:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:395:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvolutionaryStrategiesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionaryStrategiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getEvolutionaryStrategiesAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEvolutionaryStrategiesAccess().getMuKeyword_3());
            		
            // InternalOpt.g:419:3: ( (lv_mu_4_0= RULE_INT ) )
            // InternalOpt.g:420:4: (lv_mu_4_0= RULE_INT )
            {
            // InternalOpt.g:420:4: (lv_mu_4_0= RULE_INT )
            // InternalOpt.g:421:5: lv_mu_4_0= RULE_INT
            {
            lv_mu_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_mu_4_0, grammarAccess.getEvolutionaryStrategiesAccess().getMuINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionaryStrategiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mu",
            						lv_mu_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getEvolutionaryStrategiesAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getEvolutionaryStrategiesAccess().getLambdaKeyword_6());
            		
            // InternalOpt.g:445:3: ( (lv_lambda_7_0= RULE_INT ) )
            // InternalOpt.g:446:4: (lv_lambda_7_0= RULE_INT )
            {
            // InternalOpt.g:446:4: (lv_lambda_7_0= RULE_INT )
            // InternalOpt.g:447:5: lv_lambda_7_0= RULE_INT
            {
            lv_lambda_7_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_lambda_7_0, grammarAccess.getEvolutionaryStrategiesAccess().getLambdaINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionaryStrategiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lambda",
            						lv_lambda_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getEvolutionaryStrategiesAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getEvolutionaryStrategiesAccess().getSigmaKeyword_9());
            		
            // InternalOpt.g:471:3: ( (lv_sigma_10_0= RULE_DECIMAL ) )
            // InternalOpt.g:472:4: (lv_sigma_10_0= RULE_DECIMAL )
            {
            // InternalOpt.g:472:4: (lv_sigma_10_0= RULE_DECIMAL )
            // InternalOpt.g:473:5: lv_sigma_10_0= RULE_DECIMAL
            {
            lv_sigma_10_0=(Token)match(input,RULE_DECIMAL,FOLLOW_7); 

            					newLeafNode(lv_sigma_10_0, grammarAccess.getEvolutionaryStrategiesAccess().getSigmaDECIMALTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionaryStrategiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sigma",
            						lv_sigma_10_0,
            						"org.xtext.example.opt.Opt.DECIMAL");
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getEvolutionaryStrategiesAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getEvolutionaryStrategiesAccess().getStrategyKeyword_12());
            		
            // InternalOpt.g:497:3: ( (lv_strategy_13_0= ruleESStrategy ) )
            // InternalOpt.g:498:4: (lv_strategy_13_0= ruleESStrategy )
            {
            // InternalOpt.g:498:4: (lv_strategy_13_0= ruleESStrategy )
            // InternalOpt.g:499:5: lv_strategy_13_0= ruleESStrategy
            {

            					newCompositeNode(grammarAccess.getEvolutionaryStrategiesAccess().getStrategyESStrategyEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_7);
            lv_strategy_13_0=ruleESStrategy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionaryStrategiesRule());
            					}
            					set(
            						current,
            						"strategy",
            						lv_strategy_13_0,
            						"org.xtext.example.opt.Opt.ESStrategy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getEvolutionaryStrategiesAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEvolutionaryStrategiesAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleEvolutionaryStrategies"


    // $ANTLR start "entryRuleVariable"
    // InternalOpt.g:528:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalOpt.g:528:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalOpt.g:529:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalOpt.g:535:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_DECIMAL ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_DECIMAL ) ) otherlv_10= ']' )? otherlv_11= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_lowValue_7_0=null;
        Token otherlv_8=null;
        Token lv_highValue_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_group_5_0 = null;



        	enterRule();

        try {
            // InternalOpt.g:541:2: ( (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_DECIMAL ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_DECIMAL ) ) otherlv_10= ']' )? otherlv_11= ';' ) )
            // InternalOpt.g:542:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_DECIMAL ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_DECIMAL ) ) otherlv_10= ']' )? otherlv_11= ';' )
            {
            // InternalOpt.g:542:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_DECIMAL ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_DECIMAL ) ) otherlv_10= ']' )? otherlv_11= ';' )
            // InternalOpt.g:543:3: otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_DECIMAL ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_DECIMAL ) ) otherlv_10= ']' )? otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalOpt.g:547:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:548:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:548:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:549:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            // InternalOpt.g:569:3: ( (lv_type_3_0= ruleVariableType ) )
            // InternalOpt.g:570:4: (lv_type_3_0= ruleVariableType )
            {
            // InternalOpt.g:570:4: (lv_type_3_0= ruleVariableType )
            // InternalOpt.g:571:5: lv_type_3_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeVariableTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_3_0=ruleVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.opt.Opt.VariableType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getGroupKeyword_4());
            		
            // InternalOpt.g:592:3: ( (lv_group_5_0= ruleVariableGroup ) )
            // InternalOpt.g:593:4: (lv_group_5_0= ruleVariableGroup )
            {
            // InternalOpt.g:593:4: (lv_group_5_0= ruleVariableGroup )
            // InternalOpt.g:594:5: lv_group_5_0= ruleVariableGroup
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getGroupVariableGroupEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_group_5_0=ruleVariableGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"group",
            						lv_group_5_0,
            						"org.xtext.example.opt.Opt.VariableGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpt.g:611:3: (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_DECIMAL ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_DECIMAL ) ) otherlv_10= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOpt.g:612:4: otherlv_6= '[' ( (lv_lowValue_7_0= RULE_DECIMAL ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_DECIMAL ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalOpt.g:616:4: ( (lv_lowValue_7_0= RULE_DECIMAL ) )
                    // InternalOpt.g:617:5: (lv_lowValue_7_0= RULE_DECIMAL )
                    {
                    // InternalOpt.g:617:5: (lv_lowValue_7_0= RULE_DECIMAL )
                    // InternalOpt.g:618:6: lv_lowValue_7_0= RULE_DECIMAL
                    {
                    lv_lowValue_7_0=(Token)match(input,RULE_DECIMAL,FOLLOW_26); 

                    						newLeafNode(lv_lowValue_7_0, grammarAccess.getVariableAccess().getLowValueDECIMALTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowValue",
                    							lv_lowValue_7_0,
                    							"org.xtext.example.opt.Opt.DECIMAL");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getCommaKeyword_6_2());
                    			
                    // InternalOpt.g:638:4: ( (lv_highValue_9_0= RULE_DECIMAL ) )
                    // InternalOpt.g:639:5: (lv_highValue_9_0= RULE_DECIMAL )
                    {
                    // InternalOpt.g:639:5: (lv_highValue_9_0= RULE_DECIMAL )
                    // InternalOpt.g:640:6: lv_highValue_9_0= RULE_DECIMAL
                    {
                    lv_highValue_9_0=(Token)match(input,RULE_DECIMAL,FOLLOW_27); 

                    						newLeafNode(lv_highValue_9_0, grammarAccess.getVariableAccess().getHighValueDECIMALTerminalRuleCall_6_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"highValue",
                    							lv_highValue_9_0,
                    							"org.xtext.example.opt.Opt.DECIMAL");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getVariableAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSimulation"
    // InternalOpt.g:669:1: entryRuleSimulation returns [EObject current=null] : iv_ruleSimulation= ruleSimulation EOF ;
    public final EObject entryRuleSimulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulation = null;


        try {
            // InternalOpt.g:669:51: (iv_ruleSimulation= ruleSimulation EOF )
            // InternalOpt.g:670:2: iv_ruleSimulation= ruleSimulation EOF
            {
             newCompositeNode(grammarAccess.getSimulationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimulation=ruleSimulation();

            state._fsp--;

             current =iv_ruleSimulation; 
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
    // $ANTLR end "entryRuleSimulation"


    // $ANTLR start "ruleSimulation"
    // InternalOpt.g:676:1: ruleSimulation returns [EObject current=null] : (otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFolder' ( (lv_modelFileFolderPath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'functionname' ( (lv_functionName_7_0= RULE_STRING ) ) otherlv_8= ';' otherlv_9= 'initialization' ( (lv_initialization_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'modelType' ( (lv_modelType_13_0= ruleSimModelType ) ) otherlv_14= ';' otherlv_15= '}' ) ;
    public final EObject ruleSimulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_modelFileFolderPath_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_functionName_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_initialization_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_modelType_13_0 = null;



        	enterRule();

        try {
            // InternalOpt.g:682:2: ( (otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFolder' ( (lv_modelFileFolderPath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'functionname' ( (lv_functionName_7_0= RULE_STRING ) ) otherlv_8= ';' otherlv_9= 'initialization' ( (lv_initialization_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'modelType' ( (lv_modelType_13_0= ruleSimModelType ) ) otherlv_14= ';' otherlv_15= '}' ) )
            // InternalOpt.g:683:2: (otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFolder' ( (lv_modelFileFolderPath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'functionname' ( (lv_functionName_7_0= RULE_STRING ) ) otherlv_8= ';' otherlv_9= 'initialization' ( (lv_initialization_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'modelType' ( (lv_modelType_13_0= ruleSimModelType ) ) otherlv_14= ';' otherlv_15= '}' )
            {
            // InternalOpt.g:683:2: (otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFolder' ( (lv_modelFileFolderPath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'functionname' ( (lv_functionName_7_0= RULE_STRING ) ) otherlv_8= ';' otherlv_9= 'initialization' ( (lv_initialization_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'modelType' ( (lv_modelType_13_0= ruleSimModelType ) ) otherlv_14= ';' otherlv_15= '}' )
            // InternalOpt.g:684:3: otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFolder' ( (lv_modelFileFolderPath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'functionname' ( (lv_functionName_7_0= RULE_STRING ) ) otherlv_8= ';' otherlv_9= 'initialization' ( (lv_initialization_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'modelType' ( (lv_modelType_13_0= ruleSimModelType ) ) otherlv_14= ';' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimulationAccess().getSimulationKeyword_0());
            		
            // InternalOpt.g:688:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:689:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:689:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:690:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSimulationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimulationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getSimulationAccess().getModelFolderKeyword_3());
            		
            // InternalOpt.g:714:3: ( (lv_modelFileFolderPath_4_0= RULE_STRING ) )
            // InternalOpt.g:715:4: (lv_modelFileFolderPath_4_0= RULE_STRING )
            {
            // InternalOpt.g:715:4: (lv_modelFileFolderPath_4_0= RULE_STRING )
            // InternalOpt.g:716:5: lv_modelFileFolderPath_4_0= RULE_STRING
            {
            lv_modelFileFolderPath_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_modelFileFolderPath_4_0, grammarAccess.getSimulationAccess().getModelFileFolderPathSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimulationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modelFileFolderPath",
            						lv_modelFileFolderPath_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getSimulationAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getSimulationAccess().getFunctionnameKeyword_6());
            		
            // InternalOpt.g:740:3: ( (lv_functionName_7_0= RULE_STRING ) )
            // InternalOpt.g:741:4: (lv_functionName_7_0= RULE_STRING )
            {
            // InternalOpt.g:741:4: (lv_functionName_7_0= RULE_STRING )
            // InternalOpt.g:742:5: lv_functionName_7_0= RULE_STRING
            {
            lv_functionName_7_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_functionName_7_0, grammarAccess.getSimulationAccess().getFunctionNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimulationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"functionName",
            						lv_functionName_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_8, grammarAccess.getSimulationAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_9, grammarAccess.getSimulationAccess().getInitializationKeyword_9());
            		
            // InternalOpt.g:766:3: ( (lv_initialization_10_0= RULE_STRING ) )
            // InternalOpt.g:767:4: (lv_initialization_10_0= RULE_STRING )
            {
            // InternalOpt.g:767:4: (lv_initialization_10_0= RULE_STRING )
            // InternalOpt.g:768:5: lv_initialization_10_0= RULE_STRING
            {
            lv_initialization_10_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_initialization_10_0, grammarAccess.getSimulationAccess().getInitializationSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimulationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initialization",
            						lv_initialization_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_11, grammarAccess.getSimulationAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,36,FOLLOW_33); 

            			newLeafNode(otherlv_12, grammarAccess.getSimulationAccess().getModelTypeKeyword_12());
            		
            // InternalOpt.g:792:3: ( (lv_modelType_13_0= ruleSimModelType ) )
            // InternalOpt.g:793:4: (lv_modelType_13_0= ruleSimModelType )
            {
            // InternalOpt.g:793:4: (lv_modelType_13_0= ruleSimModelType )
            // InternalOpt.g:794:5: lv_modelType_13_0= ruleSimModelType
            {

            					newCompositeNode(grammarAccess.getSimulationAccess().getModelTypeSimModelTypeEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_7);
            lv_modelType_13_0=ruleSimModelType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimulationRule());
            					}
            					set(
            						current,
            						"modelType",
            						lv_modelType_13_0,
            						"org.xtext.example.opt.Opt.SimModelType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getSimulationAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleSimulation"


    // $ANTLR start "entryRuleOperator"
    // InternalOpt.g:823:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalOpt.g:823:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalOpt.g:824:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalOpt.g:830:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOpt.g:836:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) )
            // InternalOpt.g:837:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalOpt.g:837:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 40:
                {
                alt4=4;
                }
                break;
            case 41:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOpt.g:838:3: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOpt.g:844:3: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOpt.g:850:3: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOpt.g:856:3: kw= '/'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOpt.g:862:3: kw= '%'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPercentSignKeyword_4());
                    		

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleAtomic"
    // InternalOpt.g:871:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalOpt.g:871:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalOpt.g:872:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalOpt.g:878:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DECIMAL ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOpt.g:884:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DECIMAL ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) )
            // InternalOpt.g:885:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DECIMAL ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            {
            // InternalOpt.g:885:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DECIMAL ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalOpt.g:886:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalOpt.g:886:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalOpt.g:887:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalOpt.g:887:4: ()
                    // InternalOpt.g:888:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalOpt.g:894:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalOpt.g:895:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalOpt.g:895:5: (lv_value_1_0= RULE_INT )
                    // InternalOpt.g:896:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
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
                    // InternalOpt.g:914:3: ( () ( (lv_value_3_0= RULE_DECIMAL ) ) )
                    {
                    // InternalOpt.g:914:3: ( () ( (lv_value_3_0= RULE_DECIMAL ) ) )
                    // InternalOpt.g:915:4: () ( (lv_value_3_0= RULE_DECIMAL ) )
                    {
                    // InternalOpt.g:915:4: ()
                    // InternalOpt.g:916:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDecimalConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalOpt.g:922:4: ( (lv_value_3_0= RULE_DECIMAL ) )
                    // InternalOpt.g:923:5: (lv_value_3_0= RULE_DECIMAL )
                    {
                    // InternalOpt.g:923:5: (lv_value_3_0= RULE_DECIMAL )
                    // InternalOpt.g:924:6: lv_value_3_0= RULE_DECIMAL
                    {
                    lv_value_3_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueDECIMALTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.example.opt.Opt.DECIMAL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOpt.g:942:3: ( () ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalOpt.g:942:3: ( () ( (otherlv_5= RULE_ID ) ) )
                    // InternalOpt.g:943:4: () ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalOpt.g:943:4: ()
                    // InternalOpt.g:944:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalOpt.g:950:4: ( (otherlv_5= RULE_ID ) )
                    // InternalOpt.g:951:5: (otherlv_5= RULE_ID )
                    {
                    // InternalOpt.g:951:5: (otherlv_5= RULE_ID )
                    // InternalOpt.g:952:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_2_1_0());
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleFunction"
    // InternalOpt.g:968:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalOpt.g:968:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalOpt.g:969:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalOpt.g:975:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_function1_3_0= ruleExpression ) ) otherlv_4= ';' otherlv_5= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_function1_3_0 = null;



        	enterRule();

        try {
            // InternalOpt.g:981:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_function1_3_0= ruleExpression ) ) otherlv_4= ';' otherlv_5= '}' ) )
            // InternalOpt.g:982:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_function1_3_0= ruleExpression ) ) otherlv_4= ';' otherlv_5= '}' )
            {
            // InternalOpt.g:982:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_function1_3_0= ruleExpression ) ) otherlv_4= ';' otherlv_5= '}' )
            // InternalOpt.g:983:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_function1_3_0= ruleExpression ) ) otherlv_4= ';' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalOpt.g:987:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:988:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:988:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:989:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOpt.g:1009:3: ( (lv_function1_3_0= ruleExpression ) )
            // InternalOpt.g:1010:4: (lv_function1_3_0= ruleExpression )
            {
            // InternalOpt.g:1010:4: (lv_function1_3_0= ruleExpression )
            // InternalOpt.g:1011:5: lv_function1_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getFunction1ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_function1_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"function1",
            						lv_function1_3_0,
            						"org.xtext.example.opt.Opt.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleExpression"
    // InternalOpt.g:1040:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalOpt.g:1040:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalOpt.g:1041:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalOpt.g:1047:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleAtomic ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalOpt.g:1053:2: ( ( ( (lv_left_0_0= ruleAtomic ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) )
            // InternalOpt.g:1054:2: ( ( (lv_left_0_0= ruleAtomic ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            {
            // InternalOpt.g:1054:2: ( ( (lv_left_0_0= ruleAtomic ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            // InternalOpt.g:1055:3: ( (lv_left_0_0= ruleAtomic ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            {
            // InternalOpt.g:1055:3: ( (lv_left_0_0= ruleAtomic ) )
            // InternalOpt.g:1056:4: (lv_left_0_0= ruleAtomic )
            {
            // InternalOpt.g:1056:4: (lv_left_0_0= ruleAtomic )
            // InternalOpt.g:1057:5: lv_left_0_0= ruleAtomic
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftAtomicParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_left_0_0=ruleAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.opt.Opt.Atomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpt.g:1074:3: ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=37 && LA6_0<=41)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOpt.g:1075:4: ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) )
                    {
                    // InternalOpt.g:1075:4: ( (lv_operator_1_0= ruleOperator ) )
                    // InternalOpt.g:1076:5: (lv_operator_1_0= ruleOperator )
                    {
                    // InternalOpt.g:1076:5: (lv_operator_1_0= ruleOperator )
                    // InternalOpt.g:1077:6: lv_operator_1_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOperatorOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_operator_1_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"org.xtext.example.opt.Opt.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOpt.g:1094:4: ( (lv_right_2_0= ruleExpression ) )
                    // InternalOpt.g:1095:5: (lv_right_2_0= ruleExpression )
                    {
                    // InternalOpt.g:1095:5: (lv_right_2_0= ruleExpression )
                    // InternalOpt.g:1096:6: lv_right_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.example.opt.Opt.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConvergence"
    // InternalOpt.g:1118:1: entryRuleConvergence returns [EObject current=null] : iv_ruleConvergence= ruleConvergence EOF ;
    public final EObject entryRuleConvergence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConvergence = null;


        try {
            // InternalOpt.g:1118:52: (iv_ruleConvergence= ruleConvergence EOF )
            // InternalOpt.g:1119:2: iv_ruleConvergence= ruleConvergence EOF
            {
             newCompositeNode(grammarAccess.getConvergenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConvergence=ruleConvergence();

            state._fsp--;

             current =iv_ruleConvergence; 
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
    // $ANTLR end "entryRuleConvergence"


    // $ANTLR start "ruleConvergence"
    // InternalOpt.g:1125:1: ruleConvergence returns [EObject current=null] : (otherlv_0= 'convergence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'convergencethreshold' ( (lv_convergenceThreshold_4_0= RULE_INT ) ) otherlv_5= '.' this_INT_6= RULE_INT otherlv_7= ';' ) (otherlv_8= 'convergencerange' ( (lv_convergencerange_9_0= RULE_INT ) ) otherlv_10= ';' ) otherlv_11= '}' ) ;
    public final EObject ruleConvergence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_convergenceThreshold_4_0=null;
        Token otherlv_5=null;
        Token this_INT_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_convergencerange_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalOpt.g:1131:2: ( (otherlv_0= 'convergence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'convergencethreshold' ( (lv_convergenceThreshold_4_0= RULE_INT ) ) otherlv_5= '.' this_INT_6= RULE_INT otherlv_7= ';' ) (otherlv_8= 'convergencerange' ( (lv_convergencerange_9_0= RULE_INT ) ) otherlv_10= ';' ) otherlv_11= '}' ) )
            // InternalOpt.g:1132:2: (otherlv_0= 'convergence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'convergencethreshold' ( (lv_convergenceThreshold_4_0= RULE_INT ) ) otherlv_5= '.' this_INT_6= RULE_INT otherlv_7= ';' ) (otherlv_8= 'convergencerange' ( (lv_convergencerange_9_0= RULE_INT ) ) otherlv_10= ';' ) otherlv_11= '}' )
            {
            // InternalOpt.g:1132:2: (otherlv_0= 'convergence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'convergencethreshold' ( (lv_convergenceThreshold_4_0= RULE_INT ) ) otherlv_5= '.' this_INT_6= RULE_INT otherlv_7= ';' ) (otherlv_8= 'convergencerange' ( (lv_convergencerange_9_0= RULE_INT ) ) otherlv_10= ';' ) otherlv_11= '}' )
            // InternalOpt.g:1133:3: otherlv_0= 'convergence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'convergencethreshold' ( (lv_convergenceThreshold_4_0= RULE_INT ) ) otherlv_5= '.' this_INT_6= RULE_INT otherlv_7= ';' ) (otherlv_8= 'convergencerange' ( (lv_convergencerange_9_0= RULE_INT ) ) otherlv_10= ';' ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConvergenceAccess().getConvergenceKeyword_0());
            		
            // InternalOpt.g:1137:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:1138:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:1138:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:1139:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConvergenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConvergenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getConvergenceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOpt.g:1159:3: (otherlv_3= 'convergencethreshold' ( (lv_convergenceThreshold_4_0= RULE_INT ) ) otherlv_5= '.' this_INT_6= RULE_INT otherlv_7= ';' )
            // InternalOpt.g:1160:4: otherlv_3= 'convergencethreshold' ( (lv_convergenceThreshold_4_0= RULE_INT ) ) otherlv_5= '.' this_INT_6= RULE_INT otherlv_7= ';'
            {
            otherlv_3=(Token)match(input,44,FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getConvergenceAccess().getConvergencethresholdKeyword_3_0());
            			
            // InternalOpt.g:1164:4: ( (lv_convergenceThreshold_4_0= RULE_INT ) )
            // InternalOpt.g:1165:5: (lv_convergenceThreshold_4_0= RULE_INT )
            {
            // InternalOpt.g:1165:5: (lv_convergenceThreshold_4_0= RULE_INT )
            // InternalOpt.g:1166:6: lv_convergenceThreshold_4_0= RULE_INT
            {
            lv_convergenceThreshold_4_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            						newLeafNode(lv_convergenceThreshold_4_0, grammarAccess.getConvergenceAccess().getConvergenceThresholdINTTerminalRuleCall_3_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConvergenceRule());
            						}
            						setWithLastConsumed(
            							current,
            							"convergenceThreshold",
            							lv_convergenceThreshold_4_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_11); 

            				newLeafNode(otherlv_5, grammarAccess.getConvergenceAccess().getFullStopKeyword_3_2());
            			
            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_7); 

            				newLeafNode(this_INT_6, grammarAccess.getConvergenceAccess().getINTTerminalRuleCall_3_3());
            			
            otherlv_7=(Token)match(input,15,FOLLOW_38); 

            				newLeafNode(otherlv_7, grammarAccess.getConvergenceAccess().getSemicolonKeyword_3_4());
            			

            }

            // InternalOpt.g:1195:3: (otherlv_8= 'convergencerange' ( (lv_convergencerange_9_0= RULE_INT ) ) otherlv_10= ';' )
            // InternalOpt.g:1196:4: otherlv_8= 'convergencerange' ( (lv_convergencerange_9_0= RULE_INT ) ) otherlv_10= ';'
            {
            otherlv_8=(Token)match(input,46,FOLLOW_11); 

            				newLeafNode(otherlv_8, grammarAccess.getConvergenceAccess().getConvergencerangeKeyword_4_0());
            			
            // InternalOpt.g:1200:4: ( (lv_convergencerange_9_0= RULE_INT ) )
            // InternalOpt.g:1201:5: (lv_convergencerange_9_0= RULE_INT )
            {
            // InternalOpt.g:1201:5: (lv_convergencerange_9_0= RULE_INT )
            // InternalOpt.g:1202:6: lv_convergencerange_9_0= RULE_INT
            {
            lv_convergencerange_9_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            						newLeafNode(lv_convergencerange_9_0, grammarAccess.getConvergenceAccess().getConvergencerangeINTTerminalRuleCall_4_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConvergenceRule());
            						}
            						setWithLastConsumed(
            							current,
            							"convergencerange",
            							lv_convergencerange_9_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_14); 

            				newLeafNode(otherlv_10, grammarAccess.getConvergenceAccess().getSemicolonKeyword_4_2());
            			

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConvergenceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConvergence"


    // $ANTLR start "entryRuleDuration"
    // InternalOpt.g:1231:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalOpt.g:1231:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalOpt.g:1232:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalOpt.g:1238:1: ruleDuration returns [EObject current=null] : (otherlv_0= 'duration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'durationtime' ( (lv_durationtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}' ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_durationtime_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalOpt.g:1244:2: ( (otherlv_0= 'duration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'durationtime' ( (lv_durationtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}' ) )
            // InternalOpt.g:1245:2: (otherlv_0= 'duration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'durationtime' ( (lv_durationtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}' )
            {
            // InternalOpt.g:1245:2: (otherlv_0= 'duration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'durationtime' ( (lv_durationtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}' )
            // InternalOpt.g:1246:3: otherlv_0= 'duration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'durationtime' ( (lv_durationtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDurationAccess().getDurationKeyword_0());
            		
            // InternalOpt.g:1250:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:1251:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:1251:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:1252:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDurationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getDurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOpt.g:1272:3: (otherlv_3= 'durationtime' ( (lv_durationtime_4_0= RULE_STRING ) ) otherlv_5= ';' )
            // InternalOpt.g:1273:4: otherlv_3= 'durationtime' ( (lv_durationtime_4_0= RULE_STRING ) ) otherlv_5= ';'
            {
            otherlv_3=(Token)match(input,48,FOLLOW_29); 

            				newLeafNode(otherlv_3, grammarAccess.getDurationAccess().getDurationtimeKeyword_3_0());
            			
            // InternalOpt.g:1277:4: ( (lv_durationtime_4_0= RULE_STRING ) )
            // InternalOpt.g:1278:5: (lv_durationtime_4_0= RULE_STRING )
            {
            // InternalOpt.g:1278:5: (lv_durationtime_4_0= RULE_STRING )
            // InternalOpt.g:1279:6: lv_durationtime_4_0= RULE_STRING
            {
            lv_durationtime_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            						newLeafNode(lv_durationtime_4_0, grammarAccess.getDurationAccess().getDurationtimeSTRINGTerminalRuleCall_3_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getDurationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"durationtime",
            							lv_durationtime_4_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_14); 

            				newLeafNode(otherlv_5, grammarAccess.getDurationAccess().getSemicolonKeyword_3_2());
            			

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDurationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleEndTime"
    // InternalOpt.g:1308:1: entryRuleEndTime returns [EObject current=null] : iv_ruleEndTime= ruleEndTime EOF ;
    public final EObject entryRuleEndTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndTime = null;


        try {
            // InternalOpt.g:1308:48: (iv_ruleEndTime= ruleEndTime EOF )
            // InternalOpt.g:1309:2: iv_ruleEndTime= ruleEndTime EOF
            {
             newCompositeNode(grammarAccess.getEndTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndTime=ruleEndTime();

            state._fsp--;

             current =iv_ruleEndTime; 
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
    // $ANTLR end "entryRuleEndTime"


    // $ANTLR start "ruleEndTime"
    // InternalOpt.g:1315:1: ruleEndTime returns [EObject current=null] : (otherlv_0= 'endtime' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'endtime' ( (lv_endtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}' ) ;
    public final EObject ruleEndTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_endtime_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalOpt.g:1321:2: ( (otherlv_0= 'endtime' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'endtime' ( (lv_endtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}' ) )
            // InternalOpt.g:1322:2: (otherlv_0= 'endtime' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'endtime' ( (lv_endtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}' )
            {
            // InternalOpt.g:1322:2: (otherlv_0= 'endtime' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'endtime' ( (lv_endtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}' )
            // InternalOpt.g:1323:3: otherlv_0= 'endtime' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'endtime' ( (lv_endtime_4_0= RULE_STRING ) ) otherlv_5= ';' ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEndTimeAccess().getEndtimeKeyword_0());
            		
            // InternalOpt.g:1327:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:1328:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:1328:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:1329:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEndTimeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getEndTimeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOpt.g:1349:3: (otherlv_3= 'endtime' ( (lv_endtime_4_0= RULE_STRING ) ) otherlv_5= ';' )
            // InternalOpt.g:1350:4: otherlv_3= 'endtime' ( (lv_endtime_4_0= RULE_STRING ) ) otherlv_5= ';'
            {
            otherlv_3=(Token)match(input,49,FOLLOW_29); 

            				newLeafNode(otherlv_3, grammarAccess.getEndTimeAccess().getEndtimeKeyword_3_0());
            			
            // InternalOpt.g:1354:4: ( (lv_endtime_4_0= RULE_STRING ) )
            // InternalOpt.g:1355:5: (lv_endtime_4_0= RULE_STRING )
            {
            // InternalOpt.g:1355:5: (lv_endtime_4_0= RULE_STRING )
            // InternalOpt.g:1356:6: lv_endtime_4_0= RULE_STRING
            {
            lv_endtime_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            						newLeafNode(lv_endtime_4_0, grammarAccess.getEndTimeAccess().getEndtimeSTRINGTerminalRuleCall_3_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEndTimeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"endtime",
            							lv_endtime_4_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_14); 

            				newLeafNode(otherlv_5, grammarAccess.getEndTimeAccess().getSemicolonKeyword_3_2());
            			

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEndTimeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEndTime"


    // $ANTLR start "entryRuleMaxIteration"
    // InternalOpt.g:1385:1: entryRuleMaxIteration returns [EObject current=null] : iv_ruleMaxIteration= ruleMaxIteration EOF ;
    public final EObject entryRuleMaxIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxIteration = null;


        try {
            // InternalOpt.g:1385:53: (iv_ruleMaxIteration= ruleMaxIteration EOF )
            // InternalOpt.g:1386:2: iv_ruleMaxIteration= ruleMaxIteration EOF
            {
             newCompositeNode(grammarAccess.getMaxIterationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxIteration=ruleMaxIteration();

            state._fsp--;

             current =iv_ruleMaxIteration; 
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
    // $ANTLR end "entryRuleMaxIteration"


    // $ANTLR start "ruleMaxIteration"
    // InternalOpt.g:1392:1: ruleMaxIteration returns [EObject current=null] : (otherlv_0= 'maxiteration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_maxiteration_3_0= RULE_INT ) ) otherlv_4= ';' otherlv_5= '}' ) ;
    public final EObject ruleMaxIteration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_maxiteration_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOpt.g:1398:2: ( (otherlv_0= 'maxiteration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_maxiteration_3_0= RULE_INT ) ) otherlv_4= ';' otherlv_5= '}' ) )
            // InternalOpt.g:1399:2: (otherlv_0= 'maxiteration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_maxiteration_3_0= RULE_INT ) ) otherlv_4= ';' otherlv_5= '}' )
            {
            // InternalOpt.g:1399:2: (otherlv_0= 'maxiteration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_maxiteration_3_0= RULE_INT ) ) otherlv_4= ';' otherlv_5= '}' )
            // InternalOpt.g:1400:3: otherlv_0= 'maxiteration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_maxiteration_3_0= RULE_INT ) ) otherlv_4= ';' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxIterationAccess().getMaxiterationKeyword_0());
            		
            // InternalOpt.g:1404:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:1405:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:1405:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:1406:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMaxIterationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxIterationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxIterationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOpt.g:1426:3: ( (lv_maxiteration_3_0= RULE_INT ) )
            // InternalOpt.g:1427:4: (lv_maxiteration_3_0= RULE_INT )
            {
            // InternalOpt.g:1427:4: (lv_maxiteration_3_0= RULE_INT )
            // InternalOpt.g:1428:5: lv_maxiteration_3_0= RULE_INT
            {
            lv_maxiteration_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_maxiteration_3_0, grammarAccess.getMaxIterationAccess().getMaxiterationINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxIterationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxiteration",
            						lv_maxiteration_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getMaxIterationAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMaxIterationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMaxIteration"


    // $ANTLR start "entryRuleThreshold"
    // InternalOpt.g:1456:1: entryRuleThreshold returns [EObject current=null] : iv_ruleThreshold= ruleThreshold EOF ;
    public final EObject entryRuleThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreshold = null;


        try {
            // InternalOpt.g:1456:50: (iv_ruleThreshold= ruleThreshold EOF )
            // InternalOpt.g:1457:2: iv_ruleThreshold= ruleThreshold EOF
            {
             newCompositeNode(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreshold=ruleThreshold();

            state._fsp--;

             current =iv_ruleThreshold; 
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
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // InternalOpt.g:1463:1: ruleThreshold returns [EObject current=null] : (otherlv_0= 'threshold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'thresholdvalue' ( (lv_thresholdvalue_4_0= RULE_DECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' ) ;
    public final EObject ruleThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_thresholdvalue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalOpt.g:1469:2: ( (otherlv_0= 'threshold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'thresholdvalue' ( (lv_thresholdvalue_4_0= RULE_DECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' ) )
            // InternalOpt.g:1470:2: (otherlv_0= 'threshold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'thresholdvalue' ( (lv_thresholdvalue_4_0= RULE_DECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' )
            {
            // InternalOpt.g:1470:2: (otherlv_0= 'threshold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'thresholdvalue' ( (lv_thresholdvalue_4_0= RULE_DECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' )
            // InternalOpt.g:1471:3: otherlv_0= 'threshold' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'thresholdvalue' ( (lv_thresholdvalue_4_0= RULE_DECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getThresholdAccess().getThresholdKeyword_0());
            		
            // InternalOpt.g:1475:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOpt.g:1476:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOpt.g:1476:4: (lv_name_1_0= RULE_ID )
            // InternalOpt.g:1477:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getThresholdAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThresholdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getThresholdAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOpt.g:1497:3: (otherlv_3= 'thresholdvalue' ( (lv_thresholdvalue_4_0= RULE_DECIMAL ) ) otherlv_5= ';' )
            // InternalOpt.g:1498:4: otherlv_3= 'thresholdvalue' ( (lv_thresholdvalue_4_0= RULE_DECIMAL ) ) otherlv_5= ';'
            {
            otherlv_3=(Token)match(input,52,FOLLOW_18); 

            				newLeafNode(otherlv_3, grammarAccess.getThresholdAccess().getThresholdvalueKeyword_3_0());
            			
            // InternalOpt.g:1502:4: ( (lv_thresholdvalue_4_0= RULE_DECIMAL ) )
            // InternalOpt.g:1503:5: (lv_thresholdvalue_4_0= RULE_DECIMAL )
            {
            // InternalOpt.g:1503:5: (lv_thresholdvalue_4_0= RULE_DECIMAL )
            // InternalOpt.g:1504:6: lv_thresholdvalue_4_0= RULE_DECIMAL
            {
            lv_thresholdvalue_4_0=(Token)match(input,RULE_DECIMAL,FOLLOW_7); 

            						newLeafNode(lv_thresholdvalue_4_0, grammarAccess.getThresholdAccess().getThresholdvalueDECIMALTerminalRuleCall_3_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getThresholdRule());
            						}
            						setWithLastConsumed(
            							current,
            							"thresholdvalue",
            							lv_thresholdvalue_4_0,
            							"org.xtext.example.opt.Opt.DECIMAL");
            					

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_14); 

            				newLeafNode(otherlv_5, grammarAccess.getThresholdAccess().getSemicolonKeyword_3_2());
            			

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getThresholdAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "ruleESStrategy"
    // InternalOpt.g:1533:1: ruleESStrategy returns [Enumerator current=null] : ( (enumLiteral_0= 'COMMA' ) | (enumLiteral_1= 'PLUS' ) ) ;
    public final Enumerator ruleESStrategy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOpt.g:1539:2: ( ( (enumLiteral_0= 'COMMA' ) | (enumLiteral_1= 'PLUS' ) ) )
            // InternalOpt.g:1540:2: ( (enumLiteral_0= 'COMMA' ) | (enumLiteral_1= 'PLUS' ) )
            {
            // InternalOpt.g:1540:2: ( (enumLiteral_0= 'COMMA' ) | (enumLiteral_1= 'PLUS' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==53) ) {
                alt7=1;
            }
            else if ( (LA7_0==54) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOpt.g:1541:3: (enumLiteral_0= 'COMMA' )
                    {
                    // InternalOpt.g:1541:3: (enumLiteral_0= 'COMMA' )
                    // InternalOpt.g:1542:4: enumLiteral_0= 'COMMA'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getESStrategyAccess().getCOMMAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getESStrategyAccess().getCOMMAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpt.g:1549:3: (enumLiteral_1= 'PLUS' )
                    {
                    // InternalOpt.g:1549:3: (enumLiteral_1= 'PLUS' )
                    // InternalOpt.g:1550:4: enumLiteral_1= 'PLUS'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getESStrategyAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getESStrategyAccess().getPLUSEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleESStrategy"


    // $ANTLR start "ruleVariableGroup"
    // InternalOpt.g:1560:1: ruleVariableGroup returns [Enumerator current=null] : ( (enumLiteral_0= 'FACTOR' ) | (enumLiteral_1= 'RESPONSE' ) ) ;
    public final Enumerator ruleVariableGroup() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOpt.g:1566:2: ( ( (enumLiteral_0= 'FACTOR' ) | (enumLiteral_1= 'RESPONSE' ) ) )
            // InternalOpt.g:1567:2: ( (enumLiteral_0= 'FACTOR' ) | (enumLiteral_1= 'RESPONSE' ) )
            {
            // InternalOpt.g:1567:2: ( (enumLiteral_0= 'FACTOR' ) | (enumLiteral_1= 'RESPONSE' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            else if ( (LA8_0==56) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOpt.g:1568:3: (enumLiteral_0= 'FACTOR' )
                    {
                    // InternalOpt.g:1568:3: (enumLiteral_0= 'FACTOR' )
                    // InternalOpt.g:1569:4: enumLiteral_0= 'FACTOR'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVariableGroupAccess().getFACTOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVariableGroupAccess().getFACTOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpt.g:1576:3: (enumLiteral_1= 'RESPONSE' )
                    {
                    // InternalOpt.g:1576:3: (enumLiteral_1= 'RESPONSE' )
                    // InternalOpt.g:1577:4: enumLiteral_1= 'RESPONSE'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getVariableGroupAccess().getRESPONSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVariableGroupAccess().getRESPONSEEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleVariableGroup"


    // $ANTLR start "ruleVariableType"
    // InternalOpt.g:1587:1: ruleVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'DECIMAL' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator ruleVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOpt.g:1593:2: ( ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'DECIMAL' ) | (enumLiteral_3= 'STRING' ) ) )
            // InternalOpt.g:1594:2: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'DECIMAL' ) | (enumLiteral_3= 'STRING' ) )
            {
            // InternalOpt.g:1594:2: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'DECIMAL' ) | (enumLiteral_3= 'STRING' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt9=1;
                }
                break;
            case 58:
                {
                alt9=2;
                }
                break;
            case 59:
                {
                alt9=3;
                }
                break;
            case 60:
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
                    // InternalOpt.g:1595:3: (enumLiteral_0= 'BOOLEAN' )
                    {
                    // InternalOpt.g:1595:3: (enumLiteral_0= 'BOOLEAN' )
                    // InternalOpt.g:1596:4: enumLiteral_0= 'BOOLEAN'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVariableTypeAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpt.g:1603:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalOpt.g:1603:3: (enumLiteral_1= 'INTEGER' )
                    // InternalOpt.g:1604:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVariableTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpt.g:1611:3: (enumLiteral_2= 'DECIMAL' )
                    {
                    // InternalOpt.g:1611:3: (enumLiteral_2= 'DECIMAL' )
                    // InternalOpt.g:1612:4: enumLiteral_2= 'DECIMAL'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getDECIMALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVariableTypeAccess().getDECIMALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOpt.g:1619:3: (enumLiteral_3= 'STRING' )
                    {
                    // InternalOpt.g:1619:3: (enumLiteral_3= 'STRING' )
                    // InternalOpt.g:1620:4: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVariableTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "ruleMinMax"
    // InternalOpt.g:1630:1: ruleMinMax returns [Enumerator current=null] : ( (enumLiteral_0= 'Min' ) | (enumLiteral_1= 'Max' ) ) ;
    public final Enumerator ruleMinMax() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOpt.g:1636:2: ( ( (enumLiteral_0= 'Min' ) | (enumLiteral_1= 'Max' ) ) )
            // InternalOpt.g:1637:2: ( (enumLiteral_0= 'Min' ) | (enumLiteral_1= 'Max' ) )
            {
            // InternalOpt.g:1637:2: ( (enumLiteral_0= 'Min' ) | (enumLiteral_1= 'Max' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==61) ) {
                alt10=1;
            }
            else if ( (LA10_0==62) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOpt.g:1638:3: (enumLiteral_0= 'Min' )
                    {
                    // InternalOpt.g:1638:3: (enumLiteral_0= 'Min' )
                    // InternalOpt.g:1639:4: enumLiteral_0= 'Min'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMinMaxAccess().getMinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMinMaxAccess().getMinEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpt.g:1646:3: (enumLiteral_1= 'Max' )
                    {
                    // InternalOpt.g:1646:3: (enumLiteral_1= 'Max' )
                    // InternalOpt.g:1647:4: enumLiteral_1= 'Max'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getMinMaxAccess().getMaxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMinMaxAccess().getMaxEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleMinMax"


    // $ANTLR start "ruleSimModelType"
    // InternalOpt.g:1657:1: ruleSimModelType returns [Enumerator current=null] : ( (enumLiteral_0= 'STATIC' ) | (enumLiteral_1= 'CONTINUOUS' ) | (enumLiteral_2= 'DISCRETEEVENT' ) ) ;
    public final Enumerator ruleSimModelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOpt.g:1663:2: ( ( (enumLiteral_0= 'STATIC' ) | (enumLiteral_1= 'CONTINUOUS' ) | (enumLiteral_2= 'DISCRETEEVENT' ) ) )
            // InternalOpt.g:1664:2: ( (enumLiteral_0= 'STATIC' ) | (enumLiteral_1= 'CONTINUOUS' ) | (enumLiteral_2= 'DISCRETEEVENT' ) )
            {
            // InternalOpt.g:1664:2: ( (enumLiteral_0= 'STATIC' ) | (enumLiteral_1= 'CONTINUOUS' ) | (enumLiteral_2= 'DISCRETEEVENT' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt11=1;
                }
                break;
            case 64:
                {
                alt11=2;
                }
                break;
            case 65:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOpt.g:1665:3: (enumLiteral_0= 'STATIC' )
                    {
                    // InternalOpt.g:1665:3: (enumLiteral_0= 'STATIC' )
                    // InternalOpt.g:1666:4: enumLiteral_0= 'STATIC'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSimModelTypeAccess().getSTATICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimModelTypeAccess().getSTATICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpt.g:1673:3: (enumLiteral_1= 'CONTINUOUS' )
                    {
                    // InternalOpt.g:1673:3: (enumLiteral_1= 'CONTINUOUS' )
                    // InternalOpt.g:1674:4: enumLiteral_1= 'CONTINUOUS'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getSimModelTypeAccess().getCONTINUOUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimModelTypeAccess().getCONTINUOUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpt.g:1681:3: (enumLiteral_2= 'DISCRETEEVENT' )
                    {
                    // InternalOpt.g:1681:3: (enumLiteral_2= 'DISCRETEEVENT' )
                    // InternalOpt.g:1682:4: enumLiteral_2= 'DISCRETEEVENT'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getSimModelTypeAccess().getDISCRETEEVENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimModelTypeAccess().getDISCRETEEVENTEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleSimModelType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000E8C0104201002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});

}