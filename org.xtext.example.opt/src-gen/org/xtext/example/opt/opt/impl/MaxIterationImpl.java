/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.opt.opt.MaxIteration;
import org.xtext.example.opt.opt.OptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.impl.MaxIterationImpl#getMaxiteration <em>Maxiteration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaxIterationImpl extends TypeImpl implements MaxIteration
{
  /**
   * The default value of the '{@link #getMaxiteration() <em>Maxiteration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxiteration()
   * @generated
   * @ordered
   */
  protected static final int MAXITERATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxiteration() <em>Maxiteration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxiteration()
   * @generated
   * @ordered
   */
  protected int maxiteration = MAXITERATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaxIterationImpl()
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
    return OptPackage.Literals.MAX_ITERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxiteration()
  {
    return maxiteration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxiteration(int newMaxiteration)
  {
    int oldMaxiteration = maxiteration;
    maxiteration = newMaxiteration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.MAX_ITERATION__MAXITERATION, oldMaxiteration, maxiteration));
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
      case OptPackage.MAX_ITERATION__MAXITERATION:
        return getMaxiteration();
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
      case OptPackage.MAX_ITERATION__MAXITERATION:
        setMaxiteration((Integer)newValue);
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
      case OptPackage.MAX_ITERATION__MAXITERATION:
        setMaxiteration(MAXITERATION_EDEFAULT);
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
      case OptPackage.MAX_ITERATION__MAXITERATION:
        return maxiteration != MAXITERATION_EDEFAULT;
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
    result.append(" (maxiteration: ");
    result.append(maxiteration);
    result.append(')');
    return result.toString();
  }

} //MaxIterationImpl
