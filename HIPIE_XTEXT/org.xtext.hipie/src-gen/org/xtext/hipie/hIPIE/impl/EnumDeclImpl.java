/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.hipie.hIPIE.EnumDecl;
import org.xtext.hipie.hIPIE.EnumList;
import org.xtext.hipie.hIPIE.HIPIEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.EnumDeclImpl#getEnum_dec <em>Enum dec</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.EnumDeclImpl#getEnum_list <em>Enum list</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumDeclImpl extends InputSimpleTypesImpl implements EnumDecl
{
  /**
   * The default value of the '{@link #getEnum_dec() <em>Enum dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum_dec()
   * @generated
   * @ordered
   */
  protected static final String ENUM_DEC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnum_dec() <em>Enum dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum_dec()
   * @generated
   * @ordered
   */
  protected String enum_dec = ENUM_DEC_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnum_list() <em>Enum list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum_list()
   * @generated
   * @ordered
   */
  protected EnumList enum_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumDeclImpl()
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
    return HIPIEPackage.Literals.ENUM_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnum_dec()
  {
    return enum_dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnum_dec(String newEnum_dec)
  {
    String oldEnum_dec = enum_dec;
    enum_dec = newEnum_dec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.ENUM_DECL__ENUM_DEC, oldEnum_dec, enum_dec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumList getEnum_list()
  {
    return enum_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnum_list(EnumList newEnum_list, NotificationChain msgs)
  {
    EnumList oldEnum_list = enum_list;
    enum_list = newEnum_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.ENUM_DECL__ENUM_LIST, oldEnum_list, newEnum_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnum_list(EnumList newEnum_list)
  {
    if (newEnum_list != enum_list)
    {
      NotificationChain msgs = null;
      if (enum_list != null)
        msgs = ((InternalEObject)enum_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ENUM_DECL__ENUM_LIST, null, msgs);
      if (newEnum_list != null)
        msgs = ((InternalEObject)newEnum_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.ENUM_DECL__ENUM_LIST, null, msgs);
      msgs = basicSetEnum_list(newEnum_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.ENUM_DECL__ENUM_LIST, newEnum_list, newEnum_list));
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
      case HIPIEPackage.ENUM_DECL__ENUM_LIST:
        return basicSetEnum_list(null, msgs);
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
      case HIPIEPackage.ENUM_DECL__ENUM_DEC:
        return getEnum_dec();
      case HIPIEPackage.ENUM_DECL__ENUM_LIST:
        return getEnum_list();
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
      case HIPIEPackage.ENUM_DECL__ENUM_DEC:
        setEnum_dec((String)newValue);
        return;
      case HIPIEPackage.ENUM_DECL__ENUM_LIST:
        setEnum_list((EnumList)newValue);
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
      case HIPIEPackage.ENUM_DECL__ENUM_DEC:
        setEnum_dec(ENUM_DEC_EDEFAULT);
        return;
      case HIPIEPackage.ENUM_DECL__ENUM_LIST:
        setEnum_list((EnumList)null);
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
      case HIPIEPackage.ENUM_DECL__ENUM_DEC:
        return ENUM_DEC_EDEFAULT == null ? enum_dec != null : !ENUM_DEC_EDEFAULT.equals(enum_dec);
      case HIPIEPackage.ENUM_DECL__ENUM_LIST:
        return enum_list != null;
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
    result.append(" (enum_dec: ");
    result.append(enum_dec);
    result.append(')');
    return result.toString();
  }

} //EnumDeclImpl
