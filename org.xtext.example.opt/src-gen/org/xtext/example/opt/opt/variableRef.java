/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.variableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.opt.opt.OptPackage#getvariableRef()
 * @model
 * @generated
 */
public interface variableRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see org.xtext.example.opt.opt.OptPackage#getvariableRef_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.variableRef#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // variableRef
