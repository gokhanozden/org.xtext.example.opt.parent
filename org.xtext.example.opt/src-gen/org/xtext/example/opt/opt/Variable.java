/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.Variable#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.Variable#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.Variable#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.Variable#getHighValue <em>High Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.opt.opt.OptPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Type
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.opt.opt.VariableType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.opt.opt.VariableType
   * @see #setType(VariableType)
   * @see org.xtext.example.opt.opt.OptPackage#getVariable_Type()
   * @model
   * @generated
   */
  VariableType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Variable#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.opt.opt.VariableType
   * @see #getType()
   * @generated
   */
  void setType(VariableType value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.opt.opt.VariableGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute.
   * @see org.xtext.example.opt.opt.VariableGroup
   * @see #setGroup(VariableGroup)
   * @see org.xtext.example.opt.opt.OptPackage#getVariable_Group()
   * @model
   * @generated
   */
  VariableGroup getGroup();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Variable#getGroup <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' attribute.
   * @see org.xtext.example.opt.opt.VariableGroup
   * @see #getGroup()
   * @generated
   */
  void setGroup(VariableGroup value);

  /**
   * Returns the value of the '<em><b>Low Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low Value</em>' attribute.
   * @see #setLowValue(String)
   * @see org.xtext.example.opt.opt.OptPackage#getVariable_LowValue()
   * @model
   * @generated
   */
  String getLowValue();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Variable#getLowValue <em>Low Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low Value</em>' attribute.
   * @see #getLowValue()
   * @generated
   */
  void setLowValue(String value);

  /**
   * Returns the value of the '<em><b>High Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>High Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>High Value</em>' attribute.
   * @see #setHighValue(String)
   * @see org.xtext.example.opt.opt.OptPackage#getVariable_HighValue()
   * @model
   * @generated
   */
  String getHighValue();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Variable#getHighValue <em>High Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High Value</em>' attribute.
   * @see #getHighValue()
   * @generated
   */
  void setHighValue(String value);

} // Variable
