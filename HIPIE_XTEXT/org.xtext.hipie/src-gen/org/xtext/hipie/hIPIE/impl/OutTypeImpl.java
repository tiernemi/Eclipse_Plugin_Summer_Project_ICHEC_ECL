/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.OutType;
import org.xtext.hipie.hIPIE.OutputOptions;
import org.xtext.hipie.hIPIE.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutTypeImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutTypeImpl#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutTypeImpl extends OutputValueImpl implements OutType
{
  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Value val;

  /**
   * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected OutputOptions ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutTypeImpl()
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
    return HIPIEPackage.Literals.OUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(Value newVal, NotificationChain msgs)
  {
    Value oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.OUT_TYPE__VAL, oldVal, newVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(Value newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.OUT_TYPE__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.OUT_TYPE__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.OUT_TYPE__VAL, newVal, newVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputOptions getOps()
  {
    return ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOps(OutputOptions newOps, NotificationChain msgs)
  {
    OutputOptions oldOps = ops;
    ops = newOps;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.OUT_TYPE__OPS, oldOps, newOps);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOps(OutputOptions newOps)
  {
    if (newOps != ops)
    {
      NotificationChain msgs = null;
      if (ops != null)
        msgs = ((InternalEObject)ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.OUT_TYPE__OPS, null, msgs);
      if (newOps != null)
        msgs = ((InternalEObject)newOps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.OUT_TYPE__OPS, null, msgs);
      msgs = basicSetOps(newOps, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.OUT_TYPE__OPS, newOps, newOps));
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
      case HIPIEPackage.OUT_TYPE__VAL:
        return basicSetVal(null, msgs);
      case HIPIEPackage.OUT_TYPE__OPS:
        return basicSetOps(null, msgs);
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
      case HIPIEPackage.OUT_TYPE__VAL:
        return getVal();
      case HIPIEPackage.OUT_TYPE__OPS:
        return getOps();
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
      case HIPIEPackage.OUT_TYPE__VAL:
        setVal((Value)newValue);
        return;
      case HIPIEPackage.OUT_TYPE__OPS:
        setOps((OutputOptions)newValue);
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
      case HIPIEPackage.OUT_TYPE__VAL:
        setVal((Value)null);
        return;
      case HIPIEPackage.OUT_TYPE__OPS:
        setOps((OutputOptions)null);
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
      case HIPIEPackage.OUT_TYPE__VAL:
        return val != null;
      case HIPIEPackage.OUT_TYPE__OPS:
        return ops != null;
    }
    return super.eIsSet(featureID);
  }

} //OutTypeImpl
