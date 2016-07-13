/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.opt.opt.Convergence;
import org.xtext.example.opt.opt.OptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convergence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.impl.ConvergenceImpl#getConvergenceThreshold <em>Convergence Threshold</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.ConvergenceImpl#getConvergencerange <em>Convergencerange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConvergenceImpl extends TypeImpl implements Convergence
{
  /**
   * The default value of the '{@link #getConvergenceThreshold() <em>Convergence Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConvergenceThreshold()
   * @generated
   * @ordered
   */
  protected static final int CONVERGENCE_THRESHOLD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getConvergenceThreshold() <em>Convergence Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConvergenceThreshold()
   * @generated
   * @ordered
   */
  protected int convergenceThreshold = CONVERGENCE_THRESHOLD_EDEFAULT;

  /**
   * The default value of the '{@link #getConvergencerange() <em>Convergencerange</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConvergencerange()
   * @generated
   * @ordered
   */
  protected static final int CONVERGENCERANGE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getConvergencerange() <em>Convergencerange</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConvergencerange()
   * @generated
   * @ordered
   */
  protected int convergencerange = CONVERGENCERANGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConvergenceImpl()
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
    return OptPackage.Literals.CONVERGENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getConvergenceThreshold()
  {
    return convergenceThreshold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConvergenceThreshold(int newConvergenceThreshold)
  {
    int oldConvergenceThreshold = convergenceThreshold;
    convergenceThreshold = newConvergenceThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.CONVERGENCE__CONVERGENCE_THRESHOLD, oldConvergenceThreshold, convergenceThreshold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getConvergencerange()
  {
    return convergencerange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConvergencerange(int newConvergencerange)
  {
    int oldConvergencerange = convergencerange;
    convergencerange = newConvergencerange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.CONVERGENCE__CONVERGENCERANGE, oldConvergencerange, convergencerange));
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
      case OptPackage.CONVERGENCE__CONVERGENCE_THRESHOLD:
        return getConvergenceThreshold();
      case OptPackage.CONVERGENCE__CONVERGENCERANGE:
        return getConvergencerange();
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
      case OptPackage.CONVERGENCE__CONVERGENCE_THRESHOLD:
        setConvergenceThreshold((Integer)newValue);
        return;
      case OptPackage.CONVERGENCE__CONVERGENCERANGE:
        setConvergencerange((Integer)newValue);
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
      case OptPackage.CONVERGENCE__CONVERGENCE_THRESHOLD:
        setConvergenceThreshold(CONVERGENCE_THRESHOLD_EDEFAULT);
        return;
      case OptPackage.CONVERGENCE__CONVERGENCERANGE:
        setConvergencerange(CONVERGENCERANGE_EDEFAULT);
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
      case OptPackage.CONVERGENCE__CONVERGENCE_THRESHOLD:
        return convergenceThreshold != CONVERGENCE_THRESHOLD_EDEFAULT;
      case OptPackage.CONVERGENCE__CONVERGENCERANGE:
        return convergencerange != CONVERGENCERANGE_EDEFAULT;
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
    result.append(" (convergenceThreshold: ");
    result.append(convergenceThreshold);
    result.append(", convergencerange: ");
    result.append(convergencerange);
    result.append(')');
    return result.toString();
  }

} //ConvergenceImpl