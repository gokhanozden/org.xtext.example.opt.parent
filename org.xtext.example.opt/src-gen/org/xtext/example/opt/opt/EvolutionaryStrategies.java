/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolutionary Strategies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.EvolutionaryStrategies#getMu <em>Mu</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.EvolutionaryStrategies#getLambda <em>Lambda</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.EvolutionaryStrategies#getSigma <em>Sigma</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.EvolutionaryStrategies#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.opt.opt.OptPackage#getEvolutionaryStrategies()
 * @model
 * @generated
 */
public interface EvolutionaryStrategies extends Type, OptimizationMethod
{
  /**
   * Returns the value of the '<em><b>Mu</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mu</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mu</em>' attribute.
   * @see #setMu(int)
   * @see org.xtext.example.opt.opt.OptPackage#getEvolutionaryStrategies_Mu()
   * @model
   * @generated
   */
  int getMu();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.EvolutionaryStrategies#getMu <em>Mu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mu</em>' attribute.
   * @see #getMu()
   * @generated
   */
  void setMu(int value);

  /**
   * Returns the value of the '<em><b>Lambda</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lambda</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lambda</em>' attribute.
   * @see #setLambda(int)
   * @see org.xtext.example.opt.opt.OptPackage#getEvolutionaryStrategies_Lambda()
   * @model
   * @generated
   */
  int getLambda();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.EvolutionaryStrategies#getLambda <em>Lambda</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lambda</em>' attribute.
   * @see #getLambda()
   * @generated
   */
  void setLambda(int value);

  /**
   * Returns the value of the '<em><b>Sigma</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sigma</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sigma</em>' attribute.
   * @see #setSigma(String)
   * @see org.xtext.example.opt.opt.OptPackage#getEvolutionaryStrategies_Sigma()
   * @model
   * @generated
   */
  String getSigma();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.EvolutionaryStrategies#getSigma <em>Sigma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sigma</em>' attribute.
   * @see #getSigma()
   * @generated
   */
  void setSigma(String value);

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.opt.opt.ESStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' attribute.
   * @see org.xtext.example.opt.opt.ESStrategy
   * @see #setStrategy(ESStrategy)
   * @see org.xtext.example.opt.opt.OptPackage#getEvolutionaryStrategies_Strategy()
   * @model
   * @generated
   */
  ESStrategy getStrategy();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.EvolutionaryStrategies#getStrategy <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' attribute.
   * @see org.xtext.example.opt.opt.ESStrategy
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(ESStrategy value);

} // EvolutionaryStrategies
