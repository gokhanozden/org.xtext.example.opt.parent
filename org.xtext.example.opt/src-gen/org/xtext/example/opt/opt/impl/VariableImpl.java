/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.opt.opt.OptPackage;
import org.xtext.example.opt.opt.Variable;
import org.xtext.example.opt.opt.VariableGroup;
import org.xtext.example.opt.opt.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.VariableImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.VariableImpl#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.VariableImpl#getHighValue <em>High Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends TypeImpl implements Variable
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final VariableType TYPE_EDEFAULT = VariableType.BOOLEAN;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected VariableType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected static final VariableGroup GROUP_EDEFAULT = VariableGroup.FACTOR;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected VariableGroup group = GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowValue()
   * @generated
   * @ordered
   */
  protected static final String LOW_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowValue()
   * @generated
   * @ordered
   */
  protected String lowValue = LOW_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighValue()
   * @generated
   * @ordered
   */
  protected static final String HIGH_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighValue()
   * @generated
   * @ordered
   */
  protected String highValue = HIGH_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return OptPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(VariableType newType)
  {
    VariableType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.VARIABLE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableGroup getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroup(VariableGroup newGroup)
  {
    VariableGroup oldGroup = group;
    group = newGroup == null ? GROUP_EDEFAULT : newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.VARIABLE__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLowValue()
  {
    return lowValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowValue(String newLowValue)
  {
    String oldLowValue = lowValue;
    lowValue = newLowValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.VARIABLE__LOW_VALUE, oldLowValue, lowValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHighValue()
  {
    return highValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighValue(String newHighValue)
  {
    String oldHighValue = highValue;
    highValue = newHighValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.VARIABLE__HIGH_VALUE, oldHighValue, highValue));
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
      case OptPackage.VARIABLE__TYPE:
        return getType();
      case OptPackage.VARIABLE__GROUP:
        return getGroup();
      case OptPackage.VARIABLE__LOW_VALUE:
        return getLowValue();
      case OptPackage.VARIABLE__HIGH_VALUE:
        return getHighValue();
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
      case OptPackage.VARIABLE__TYPE:
        setType((VariableType)newValue);
        return;
      case OptPackage.VARIABLE__GROUP:
        setGroup((VariableGroup)newValue);
        return;
      case OptPackage.VARIABLE__LOW_VALUE:
        setLowValue((String)newValue);
        return;
      case OptPackage.VARIABLE__HIGH_VALUE:
        setHighValue((String)newValue);
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
      case OptPackage.VARIABLE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case OptPackage.VARIABLE__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case OptPackage.VARIABLE__LOW_VALUE:
        setLowValue(LOW_VALUE_EDEFAULT);
        return;
      case OptPackage.VARIABLE__HIGH_VALUE:
        setHighValue(HIGH_VALUE_EDEFAULT);
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
      case OptPackage.VARIABLE__TYPE:
        return type != TYPE_EDEFAULT;
      case OptPackage.VARIABLE__GROUP:
        return group != GROUP_EDEFAULT;
      case OptPackage.VARIABLE__LOW_VALUE:
        return LOW_VALUE_EDEFAULT == null ? lowValue != null : !LOW_VALUE_EDEFAULT.equals(lowValue);
      case OptPackage.VARIABLE__HIGH_VALUE:
        return HIGH_VALUE_EDEFAULT == null ? highValue != null : !HIGH_VALUE_EDEFAULT.equals(highValue);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", group: ");
    result.append(group);
    result.append(", lowValue: ");
    result.append(lowValue);
    result.append(", highValue: ");
    result.append(highValue);
    result.append(')');
    return result.toString();
  }

} //VariableImpl
