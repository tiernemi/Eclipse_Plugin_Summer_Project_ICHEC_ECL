/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.ResourceOptions;
import org.xtext.hipie.hIPIE.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ValueImpl#getInt_val <em>Int val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ValueImpl#getStr_val <em>Str val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ValueImpl#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends SelectEventImpl implements Value
{
  /**
   * The default value of the '{@link #getInt_val() <em>Int val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt_val()
   * @generated
   * @ordered
   */
  protected static final int INT_VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInt_val() <em>Int val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt_val()
   * @generated
   * @ordered
   */
  protected int int_val = INT_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getStr_val() <em>Str val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr_val()
   * @generated
   * @ordered
   */
  protected static final String STR_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr_val() <em>Str val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr_val()
   * @generated
   * @ordered
   */
  protected String str_val = STR_VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRes_ops() <em>Res ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes_ops()
   * @generated
   * @ordered
   */
  protected ResourceOptions res_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueImpl()
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
    return HIPIEPackage.Literals.VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInt_val()
  {
    return int_val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt_val(int newInt_val)
  {
    int oldInt_val = int_val;
    int_val = newInt_val;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VALUE__INT_VAL, oldInt_val, int_val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStr_val()
  {
    return str_val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr_val(String newStr_val)
  {
    String oldStr_val = str_val;
    str_val = newStr_val;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VALUE__STR_VAL, oldStr_val, str_val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOptions getRes_ops()
  {
    return res_ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRes_ops(ResourceOptions newRes_ops, NotificationChain msgs)
  {
    ResourceOptions oldRes_ops = res_ops;
    res_ops = newRes_ops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VALUE__RES_OPS, oldRes_ops, newRes_ops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRes_ops(ResourceOptions newRes_ops)
  {
    if (newRes_ops != res_ops)
    {
      NotificationChain msgs = null;
      if (res_ops != null)
        msgs = ((InternalEObject)res_ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VALUE__RES_OPS, null, msgs);
      if (newRes_ops != null)
        msgs = ((InternalEObject)newRes_ops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VALUE__RES_OPS, null, msgs);
      msgs = basicSetRes_ops(newRes_ops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VALUE__RES_OPS, newRes_ops, newRes_ops));
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
      case HIPIEPackage.VALUE__RES_OPS:
        return basicSetRes_ops(null, msgs);
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
      case HIPIEPackage.VALUE__INT_VAL:
        return getInt_val();
      case HIPIEPackage.VALUE__STR_VAL:
        return getStr_val();
      case HIPIEPackage.VALUE__RES_OPS:
        return getRes_ops();
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
      case HIPIEPackage.VALUE__INT_VAL:
        setInt_val((Integer)newValue);
        return;
      case HIPIEPackage.VALUE__STR_VAL:
        setStr_val((String)newValue);
        return;
      case HIPIEPackage.VALUE__RES_OPS:
        setRes_ops((ResourceOptions)newValue);
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
      case HIPIEPackage.VALUE__INT_VAL:
        setInt_val(INT_VAL_EDEFAULT);
        return;
      case HIPIEPackage.VALUE__STR_VAL:
        setStr_val(STR_VAL_EDEFAULT);
        return;
      case HIPIEPackage.VALUE__RES_OPS:
        setRes_ops((ResourceOptions)null);
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
      case HIPIEPackage.VALUE__INT_VAL:
        return int_val != INT_VAL_EDEFAULT;
      case HIPIEPackage.VALUE__STR_VAL:
        return STR_VAL_EDEFAULT == null ? str_val != null : !STR_VAL_EDEFAULT.equals(str_val);
      case HIPIEPackage.VALUE__RES_OPS:
        return res_ops != null;
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
    result.append(" (int_val: ");
    result.append(int_val);
    result.append(", str_val: ");
    result.append(str_val);
    result.append(')');
    return result.toString();
  }

} //ValueImpl
