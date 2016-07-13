/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.Simulation#getModelFileFolderPath <em>Model File Folder Path</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.Simulation#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.Simulation#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.Simulation#getModelType <em>Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.opt.opt.OptPackage#getSimulation()
 * @model
 * @generated
 */
public interface Simulation extends Type, Objective
{
  /**
   * Returns the value of the '<em><b>Model File Folder Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model File Folder Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model File Folder Path</em>' attribute.
   * @see #setModelFileFolderPath(String)
   * @see org.xtext.example.opt.opt.OptPackage#getSimulation_ModelFileFolderPath()
   * @model
   * @generated
   */
  String getModelFileFolderPath();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Simulation#getModelFileFolderPath <em>Model File Folder Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model File Folder Path</em>' attribute.
   * @see #getModelFileFolderPath()
   * @generated
   */
  void setModelFileFolderPath(String value);

  /**
   * Returns the value of the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' attribute.
   * @see #setFunctionName(String)
   * @see org.xtext.example.opt.opt.OptPackage#getSimulation_FunctionName()
   * @model
   * @generated
   */
  String getFunctionName();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Simulation#getFunctionName <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Name</em>' attribute.
   * @see #getFunctionName()
   * @generated
   */
  void setFunctionName(String value);

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' attribute.
   * @see #setInitialization(String)
   * @see org.xtext.example.opt.opt.OptPackage#getSimulation_Initialization()
   * @model
   * @generated
   */
  String getInitialization();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Simulation#getInitialization <em>Initialization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' attribute.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(String value);

  /**
   * Returns the value of the '<em><b>Model Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.opt.opt.SimModelType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Type</em>' attribute.
   * @see org.xtext.example.opt.opt.SimModelType
   * @see #setModelType(SimModelType)
   * @see org.xtext.example.opt.opt.OptPackage#getSimulation_ModelType()
   * @model
   * @generated
   */
  SimModelType getModelType();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Simulation#getModelType <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Type</em>' attribute.
   * @see org.xtext.example.opt.opt.SimModelType
   * @see #getModelType()
   * @generated
   */
  void setModelType(SimModelType value);

} // Simulation
