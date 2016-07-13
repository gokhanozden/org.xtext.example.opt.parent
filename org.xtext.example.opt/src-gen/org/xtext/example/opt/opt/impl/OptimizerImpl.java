/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.opt.opt.MinMax;
import org.xtext.example.opt.opt.Objective;
import org.xtext.example.opt.opt.OptPackage;
import org.xtext.example.opt.opt.OptimizationMethod;
import org.xtext.example.opt.opt.Optimizer;
import org.xtext.example.opt.opt.Stopping_Criteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.impl.OptimizerImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.OptimizerImpl#getStoppingcriteria <em>Stoppingcriteria</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.OptimizerImpl#getOptimizationmethod <em>Optimizationmethod</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.OptimizerImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.xtext.example.opt.opt.impl.OptimizerImpl#getMinmax <em>Minmax</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptimizerImpl extends TypeImpl implements Optimizer
{
  /**
   * The cached value of the '{@link #getObjective() <em>Objective</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjective()
   * @generated
   * @ordered
   */
  protected Objective objective;

  /**
   * The cached value of the '{@link #getStoppingcriteria() <em>Stoppingcriteria</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStoppingcriteria()
   * @generated
   * @ordered
   */
  protected Stopping_Criteria stoppingcriteria;

  /**
   * The cached value of the '{@link #getOptimizationmethod() <em>Optimizationmethod</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptimizationmethod()
   * @generated
   * @ordered
   */
  protected OptimizationMethod optimizationmethod;

  /**
   * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeed()
   * @generated
   * @ordered
   */
  protected static final int SEED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeed()
   * @generated
   * @ordered
   */
  protected int seed = SEED_EDEFAULT;

  /**
   * The default value of the '{@link #getMinmax() <em>Minmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinmax()
   * @generated
   * @ordered
   */
  protected static final MinMax MINMAX_EDEFAULT = MinMax.MIN;

  /**
   * The cached value of the '{@link #getMinmax() <em>Minmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinmax()
   * @generated
   * @ordered
   */
  protected MinMax minmax = MINMAX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptimizerImpl()
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
    return OptPackage.Literals.OPTIMIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objective getObjective()
  {
    if (objective != null && objective.eIsProxy())
    {
      InternalEObject oldObjective = (InternalEObject)objective;
      objective = (Objective)eResolveProxy(oldObjective);
      if (objective != oldObjective)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptPackage.OPTIMIZER__OBJECTIVE, oldObjective, objective));
      }
    }
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objective basicGetObjective()
  {
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjective(Objective newObjective)
  {
    Objective oldObjective = objective;
    objective = newObjective;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.OPTIMIZER__OBJECTIVE, oldObjective, objective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stopping_Criteria getStoppingcriteria()
  {
    if (stoppingcriteria != null && stoppingcriteria.eIsProxy())
    {
      InternalEObject oldStoppingcriteria = (InternalEObject)stoppingcriteria;
      stoppingcriteria = (Stopping_Criteria)eResolveProxy(oldStoppingcriteria);
      if (stoppingcriteria != oldStoppingcriteria)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptPackage.OPTIMIZER__STOPPINGCRITERIA, oldStoppingcriteria, stoppingcriteria));
      }
    }
    return stoppingcriteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stopping_Criteria basicGetStoppingcriteria()
  {
    return stoppingcriteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStoppingcriteria(Stopping_Criteria newStoppingcriteria)
  {
    Stopping_Criteria oldStoppingcriteria = stoppingcriteria;
    stoppingcriteria = newStoppingcriteria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.OPTIMIZER__STOPPINGCRITERIA, oldStoppingcriteria, stoppingcriteria));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptimizationMethod getOptimizationmethod()
  {
    if (optimizationmethod != null && optimizationmethod.eIsProxy())
    {
      InternalEObject oldOptimizationmethod = (InternalEObject)optimizationmethod;
      optimizationmethod = (OptimizationMethod)eResolveProxy(oldOptimizationmethod);
      if (optimizationmethod != oldOptimizationmethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptPackage.OPTIMIZER__OPTIMIZATIONMETHOD, oldOptimizationmethod, optimizationmethod));
      }
    }
    return optimizationmethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptimizationMethod basicGetOptimizationmethod()
  {
    return optimizationmethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptimizationmethod(OptimizationMethod newOptimizationmethod)
  {
    OptimizationMethod oldOptimizationmethod = optimizationmethod;
    optimizationmethod = newOptimizationmethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.OPTIMIZER__OPTIMIZATIONMETHOD, oldOptimizationmethod, optimizationmethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSeed()
  {
    return seed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeed(int newSeed)
  {
    int oldSeed = seed;
    seed = newSeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.OPTIMIZER__SEED, oldSeed, seed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinMax getMinmax()
  {
    return minmax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinmax(MinMax newMinmax)
  {
    MinMax oldMinmax = minmax;
    minmax = newMinmax == null ? MINMAX_EDEFAULT : newMinmax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptPackage.OPTIMIZER__MINMAX, oldMinmax, minmax));
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
      case OptPackage.OPTIMIZER__OBJECTIVE:
        if (resolve) return getObjective();
        return basicGetObjective();
      case OptPackage.OPTIMIZER__STOPPINGCRITERIA:
        if (resolve) return getStoppingcriteria();
        return basicGetStoppingcriteria();
      case OptPackage.OPTIMIZER__OPTIMIZATIONMETHOD:
        if (resolve) return getOptimizationmethod();
        return basicGetOptimizationmethod();
      case OptPackage.OPTIMIZER__SEED:
        return getSeed();
      case OptPackage.OPTIMIZER__MINMAX:
        return getMinmax();
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
      case OptPackage.OPTIMIZER__OBJECTIVE:
        setObjective((Objective)newValue);
        return;
      case OptPackage.OPTIMIZER__STOPPINGCRITERIA:
        setStoppingcriteria((Stopping_Criteria)newValue);
        return;
      case OptPackage.OPTIMIZER__OPTIMIZATIONMETHOD:
        setOptimizationmethod((OptimizationMethod)newValue);
        return;
      case OptPackage.OPTIMIZER__SEED:
        setSeed((Integer)newValue);
        return;
      case OptPackage.OPTIMIZER__MINMAX:
        setMinmax((MinMax)newValue);
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
      case OptPackage.OPTIMIZER__OBJECTIVE:
        setObjective((Objective)null);
        return;
      case OptPackage.OPTIMIZER__STOPPINGCRITERIA:
        setStoppingcriteria((Stopping_Criteria)null);
        return;
      case OptPackage.OPTIMIZER__OPTIMIZATIONMETHOD:
        setOptimizationmethod((OptimizationMethod)null);
        return;
      case OptPackage.OPTIMIZER__SEED:
        setSeed(SEED_EDEFAULT);
        return;
      case OptPackage.OPTIMIZER__MINMAX:
        setMinmax(MINMAX_EDEFAULT);
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
      case OptPackage.OPTIMIZER__OBJECTIVE:
        return objective != null;
      case OptPackage.OPTIMIZER__STOPPINGCRITERIA:
        return stoppingcriteria != null;
      case OptPackage.OPTIMIZER__OPTIMIZATIONMETHOD:
        return optimizationmethod != null;
      case OptPackage.OPTIMIZER__SEED:
        return seed != SEED_EDEFAULT;
      case OptPackage.OPTIMIZER__MINMAX:
        return minmax != MINMAX_EDEFAULT;
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
    result.append(" (seed: ");
    result.append(seed);
    result.append(", minmax: ");
    result.append(minmax);
    result.append(')');
    return result.toString();
  }

} //OptimizerImpl
