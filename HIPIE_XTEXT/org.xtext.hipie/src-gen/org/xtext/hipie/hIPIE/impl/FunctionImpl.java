/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.hipie.hIPIE.Function;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.PosVizData;
import org.xtext.hipie.hIPIE.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.FunctionImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.FunctionImpl#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected PosVizData vars;

  /**
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected Value vals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return HIPIEPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PosVizData getVars()
  {
    if (vars != null && vars.eIsProxy())
    {
      InternalEObject oldVars = (InternalEObject)vars;
      vars = (PosVizData)eResolveProxy(oldVars);
      if (vars != oldVars)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HIPIEPackage.FUNCTION__VARS, oldVars, vars));
      }
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PosVizData basicGetVars()
  {
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVars(PosVizData newVars)
  {
    PosVizData oldVars = vars;
    vars = newVars;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.FUNCTION__VARS, oldVars, vars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVals()
  {
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVals(Value newVals, NotificationChain msgs)
  {
    Value oldVals = vals;
    vals = newVals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.FUNCTION__VALS, oldVals, newVals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVals(Value newVals)
  {
    if (newVals != vals)
    {
      NotificationChain msgs = null;
      if (vals != null)
        msgs = ((InternalEObject)vals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.FUNCTION__VALS, null, msgs);
      if (newVals != null)
        msgs = ((InternalEObject)newVals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.FUNCTION__VALS, null, msgs);
      msgs = basicSetVals(newVals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.FUNCTION__VALS, newVals, newVals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HIPIEPackage.FUNCTION__VALS:
        return basicSetVals(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case HIPIEPackage.FUNCTION__VARS:
        if (resolve) return getVars();
        return basicGetVars();
      case HIPIEPackage.FUNCTION__VALS:
        return getVals();
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
      case HIPIEPackage.FUNCTION__VARS:
        setVars((PosVizData)newValue);
        return;
      case HIPIEPackage.FUNCTION__VALS:
        setVals((Value)newValue);
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
      case HIPIEPackage.FUNCTION__VARS:
        setVars((PosVizData)null);
        return;
      case HIPIEPackage.FUNCTION__VALS:
        setVals((Value)null);
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
      case HIPIEPackage.FUNCTION__VARS:
        return vars != null;
      case HIPIEPackage.FUNCTION__VALS:
        return vals != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionImpl
