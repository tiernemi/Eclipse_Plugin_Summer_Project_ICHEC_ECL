/**
 */
package org.xtext.hipie.hIPIE.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.resource_options;
import org.xtext.hipie.hIPIE.value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getInt_val <em>Int val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getStr_val <em>Str val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class valueImpl extends out_typeImpl implements value
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getRes_ops() <em>Res ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes_ops()
   * @generated
   * @ordered
   */
  protected EList<resource_options> res_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected valueImpl()
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
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VALUE__NAME, oldName, name));
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
  public EList<resource_options> getRes_ops()
  {
    if (res_ops == null)
    {
      res_ops = new EObjectContainmentEList<resource_options>(resource_options.class, this, HIPIEPackage.VALUE__RES_OPS);
    }
    return res_ops;
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
        return ((InternalEList<?>)getRes_ops()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VALUE__NAME:
        return getName();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HIPIEPackage.VALUE__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VALUE__INT_VAL:
        setInt_val((Integer)newValue);
        return;
      case HIPIEPackage.VALUE__STR_VAL:
        setStr_val((String)newValue);
        return;
      case HIPIEPackage.VALUE__RES_OPS:
        getRes_ops().clear();
        getRes_ops().addAll((Collection<? extends resource_options>)newValue);
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
      case HIPIEPackage.VALUE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VALUE__INT_VAL:
        setInt_val(INT_VAL_EDEFAULT);
        return;
      case HIPIEPackage.VALUE__STR_VAL:
        setStr_val(STR_VAL_EDEFAULT);
        return;
      case HIPIEPackage.VALUE__RES_OPS:
        getRes_ops().clear();
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
      case HIPIEPackage.VALUE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VALUE__INT_VAL:
        return int_val != INT_VAL_EDEFAULT;
      case HIPIEPackage.VALUE__STR_VAL:
        return STR_VAL_EDEFAULT == null ? str_val != null : !STR_VAL_EDEFAULT.equals(str_val);
      case HIPIEPackage.VALUE__RES_OPS:
        return res_ops != null && !res_ops.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", int_val: ");
    result.append(int_val);
    result.append(", str_val: ");
    result.append(str_val);
    result.append(')');
    return result.toString();
  }

} //valueImpl
