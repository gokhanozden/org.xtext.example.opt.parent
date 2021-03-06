/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.opt.opt.OptPackage;
import org.xtext.example.opt.opt.SimModelType;
import org.xtext.example.opt.opt.Simulation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.impl.SimulationImpl#getModelFileFolderPath <em>Model File Folder Path</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.SimulationImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.SimulationImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.SimulationImpl#getModelType <em>Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulationImpl extends TypeImpl implements Simulation
{
  /**
   * The default value of the '{@link #getModelFileFolderPath() <em>Model File Folder Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFileFolderPath()
   * @generated
   * @ordered
   */
  protected static final String MODEL_FILE_FOLDER_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelFileFolderPath() <em>Model File Folder Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFileFolderPath()
   * @generated
   * @ordered
   */
  protected String modelFileFolderPath = MODEL_FILE_FOLDER_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected String functionName = FUNCTION_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialization()
   * @generated
   * @ordered
   */
  protected static final String INITIALIZATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialization()
   * @generated
   * @ordered
   */
  protected String initialization = INITIALIZATION_EDEFAULT;

  /**
   * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelType()
   * @generated
   * @ordered
   */
  protected static final SimModelType MODEL_TYPE_EDEFAULT = SimModelType.STATIC;

  /**
   * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelType()
   * @generated
   * @ordered
   */
  protected SimModelType modelType = MODEL_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimulationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OptPackage.Literals.SIMULATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelFileFolderPath()
  {
    return modelFileFolderPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelFileFolderPath(String newModelFileFolderPath)
  {
    String oldModelFileFolderPath = modelFileFolderPath;
    modelFileFolderPath = newModelFileFolderPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.SIMULATION__MODEL_FILE_FOLDER_PATH, oldModelFileFolderPath, modelFileFolderPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunctionName()
  {
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionName(String newFunctionName)
  {
    String oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.SIMULATION__FUNCTION_NAME, oldFunctionName, functionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInitialization()
  {
    return initialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialization(String newInitialization)
  {
    String oldInitialization = initialization;
    initialization = newInitialization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.SIMULATION__INITIALIZATION, oldInitialization, initialization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimModelType getModelType()
  {
    return modelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelType(SimModelType newModelType)
  {
    SimModelType oldModelType = modelType;
    modelType = newModelType == null ? MODEL_TYPE_EDEFAULT : newModelType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.SIMULATION__MODEL_TYPE, oldModelType, modelType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OptPackage.SIMULATION__MODEL_FILE_FOLDER_PATH:
        return getModelFileFolderPath();
      case OptPackage.SIMULATION__FUNCTION_NAME:
        return getFunctionName();
      case OptPackage.SIMULATION__INITIALIZATION:
        return getInitialization();
      case OptPackage.SIMULATION__MODEL_TYPE:
        return getModelType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OptPackage.SIMULATION__MODEL_FILE_FOLDER_PATH:
        setModelFileFolderPath((String)newValue);
        return;
      case OptPackage.SIMULATION__FUNCTION_NAME:
        setFunctionName((String)newValue);
        return;
      case OptPackage.SIMULATION__INITIALIZATION:
        setInitialization((String)newValue);
        return;
      case OptPackage.SIMULATION__MODEL_TYPE:
        setModelType((SimModelType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OptPackage.SIMULATION__MODEL_FILE_FOLDER_PATH:
        setModelFileFolderPath(MODEL_FILE_FOLDER_PATH_EDEFAULT);
        return;
      case OptPackage.SIMULATION__FUNCTION_NAME:
        setFunctionName(FUNCTION_NAME_EDEFAULT);
        return;
      case OptPackage.SIMULATION__INITIALIZATION:
        setInitialization(INITIALIZATION_EDEFAULT);
        return;
      case OptPackage.SIMULATION__MODEL_TYPE:
        setModelType(MODEL_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OptPackage.SIMULATION__MODEL_FILE_FOLDER_PATH:
        return MODEL_FILE_FOLDER_PATH_EDEFAULT == null ? modelFileFolderPath != null : !MODEL_FILE_FOLDER_PATH_EDEFAULT.equals(modelFileFolderPath);
      case OptPackage.SIMULATION__FUNCTION_NAME:
        return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
      case OptPackage.SIMULATION__INITIALIZATION:
        return INITIALIZATION_EDEFAULT == null ? initialization != null : !INITIALIZATION_EDEFAULT.equals(initialization);
      case OptPackage.SIMULATION__MODEL_TYPE:
        return modelType != MODEL_TYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (modelFileFolderPath: ");
    result.append(modelFileFolderPath);
    result.append(", functionName: ");
    result.append(functionName);
    result.append(", initialization: ");
    result.append(initialization);
    result.append(", modelType: ");
    result.append(modelType);
    result.append(')');
    return result.toString();
  }

} //SimulationImpl
