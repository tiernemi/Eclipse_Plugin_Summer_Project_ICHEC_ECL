/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.hipie.hIPIE.Assign;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.Value;
import org.xtext.hipie.hIPIE.ValueList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.AssignImpl#getVals_l <em>Vals l</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.AssignImpl#getVals_r <em>Vals r</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignImpl extends MinimalEObjectImpl.Container implements Assign
{
  /**
   * The cached value of the '{@link #getVals_l() <em>Vals l</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals_l()
   * @generated
   * @ordered
   */
  protected Value vals_l;

  /**
   * The cached value of the '{@link #getVals_r() <em>Vals r</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals_r()
   * @generated
   * @ordered
   */
  protected ValueList vals_r;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignImpl()
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
    return HIPIEPackage.Literals.ASSIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVals_l()
  {
    return vals_l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVals_l(Value newVals_l, NotificationChain msgs)
  {
    Value oldVals_l = vals_l;
    vals_l = newVals_l;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.ASSIGN__VALS_L, oldVals_l, newVals_l);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVals_l(Value newVals_l)
  {
    if (newVals_l != vals_l)
    {
      NotificationChain msgs = null;
      if (vals_l != null)
        msgs = ((InternalEObject)vals_l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ASSIGN__VALS_L, null, msgs);
      if (newVals_l != null)
        msgs = ((InternalEObject)newVals_l).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ASSIGN__VALS_L, null, msgs);
      msgs = basicSetVals_l(newVals_l, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.ASSIGN__VALS_L, newVals_l, newVals_l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueList getVals_r()
  {
    return vals_r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVals_r(ValueList newVals_r, NotificationChain msgs)
  {
    ValueList oldVals_r = vals_r;
    vals_r = newVals_r;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.ASSIGN__VALS_R, oldVals_r, newVals_r);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVals_r(ValueList newVals_r)
  {
    if (newVals_r != vals_r)
    {
      NotificationChain msgs = null;
      if (vals_r != null)
        msgs = ((InternalEObject)vals_r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ASSIGN__VALS_R, null, msgs);
      if (newVals_r != null)
        msgs = ((InternalEObject)newVals_r).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ASSIGN__VALS_R, null, msgs);
      msgs = basicSetVals_r(newVals_r, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.ASSIGN__VALS_R, newVals_r, newVals_r));
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
      case HIPIEPackage.ASSIGN__VALS_L:
        return basicSetVals_l(null, msgs);
      case HIPIEPackage.ASSIGN__VALS_R:
        return basicSetVals_r(null, msgs);
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
      case HIPIEPackage.ASSIGN__VALS_L:
        return getVals_l();
      case HIPIEPackage.ASSIGN__VALS_R:
        return getVals_r();
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
      case HIPIEPackage.ASSIGN__VALS_L:
        setVals_l((Value)newValue);
        return;
      case HIPIEPackage.ASSIGN__VALS_R:
        setVals_r((ValueList)newValue);
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
      case HIPIEPackage.ASSIGN__VALS_L:
        setVals_l((Value)null);
        return;
      case HIPIEPackage.ASSIGN__VALS_R:
        setVals_r((ValueList)null);
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
      case HIPIEPackage.ASSIGN__VALS_L:
        return vals_l != null;
      case HIPIEPackage.ASSIGN__VALS_R:
        return vals_r != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignImpl
