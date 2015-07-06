/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.hipie.hIPIE.EnumEntry;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.EnumEntryImpl#getVal_l <em>Val l</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.EnumEntryImpl#getVal_r <em>Val r</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumEntryImpl extends MinimalEObjectImpl.Container implements EnumEntry
{
  /**
   * The cached value of the '{@link #getVal_l() <em>Val l</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_l()
   * @generated
   * @ordered
   */
  protected Value val_l;

  /**
   * The cached value of the '{@link #getVal_r() <em>Val r</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_r()
   * @generated
   * @ordered
   */
  protected Value val_r;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumEntryImpl()
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
    return HIPIEPackage.Literals.ENUM_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVal_l()
  {
    return val_l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal_l(Value newVal_l, NotificationChain msgs)
  {
    Value oldVal_l = val_l;
    val_l = newVal_l;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.ENUM_ENTRY__VAL_L, oldVal_l, newVal_l);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal_l(Value newVal_l)
  {
    if (newVal_l != val_l)
    {
      NotificationChain msgs = null;
      if (val_l != null)
        msgs = ((InternalEObject)val_l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ENUM_ENTRY__VAL_L, null, msgs);
      if (newVal_l != null)
        msgs = ((InternalEObject)newVal_l).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ENUM_ENTRY__VAL_L, null, msgs);
      msgs = basicSetVal_l(newVal_l, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.ENUM_ENTRY__VAL_L, newVal_l, newVal_l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVal_r()
  {
    return val_r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal_r(Value newVal_r, NotificationChain msgs)
  {
    Value oldVal_r = val_r;
    val_r = newVal_r;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.ENUM_ENTRY__VAL_R, oldVal_r, newVal_r);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal_r(Value newVal_r)
  {
    if (newVal_r != val_r)
    {
      NotificationChain msgs = null;
      if (val_r != null)
        msgs = ((InternalEObject)val_r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ENUM_ENTRY__VAL_R, null, msgs);
      if (newVal_r != null)
        msgs = ((InternalEObject)newVal_r).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ENUM_ENTRY__VAL_R, null, msgs);
      msgs = basicSetVal_r(newVal_r, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.ENUM_ENTRY__VAL_R, newVal_r, newVal_r));
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
      case HIPIEPackage.ENUM_ENTRY__VAL_L:
        return basicSetVal_l(null, msgs);
      case HIPIEPackage.ENUM_ENTRY__VAL_R:
        return basicSetVal_r(null, msgs);
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
      case HIPIEPackage.ENUM_ENTRY__VAL_L:
        return getVal_l();
      case HIPIEPackage.ENUM_ENTRY__VAL_R:
        return getVal_r();
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
      case HIPIEPackage.ENUM_ENTRY__VAL_L:
        setVal_l((Value)newValue);
        return;
      case HIPIEPackage.ENUM_ENTRY__VAL_R:
        setVal_r((Value)newValue);
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
      case HIPIEPackage.ENUM_ENTRY__VAL_L:
        setVal_l((Value)null);
        return;
      case HIPIEPackage.ENUM_ENTRY__VAL_R:
        setVal_r((Value)null);
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
      case HIPIEPackage.ENUM_ENTRY__VAL_L:
        return val_l != null;
      case HIPIEPackage.ENUM_ENTRY__VAL_R:
        return val_r != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumEntryImpl
