/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.hipie.hIPIE.BaseProp;
import org.xtext.hipie.hIPIE.CategoryTypeList;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.ValueList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Prop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.BasePropImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.BasePropImpl#getVal_list <em>Val list</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.BasePropImpl#getCat_list <em>Cat list</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasePropImpl extends MinimalEObjectImpl.Container implements BaseProp
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
   * The cached value of the '{@link #getVal_list() <em>Val list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_list()
   * @generated
   * @ordered
   */
  protected ValueList val_list;

  /**
   * The cached value of the '{@link #getCat_list() <em>Cat list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCat_list()
   * @generated
   * @ordered
   */
  protected CategoryTypeList cat_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasePropImpl()
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
    return HIPIEPackage.Literals.BASE_PROP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.BASE_PROP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueList getVal_list()
  {
    return val_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal_list(ValueList newVal_list, NotificationChain msgs)
  {
    ValueList oldVal_list = val_list;
    val_list = newVal_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.BASE_PROP__VAL_LIST, oldVal_list, newVal_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal_list(ValueList newVal_list)
  {
    if (newVal_list != val_list)
    {
      NotificationChain msgs = null;
      if (val_list != null)
        msgs = ((InternalEObject)val_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.BASE_PROP__VAL_LIST, null, msgs);
      if (newVal_list != null)
        msgs = ((InternalEObject)newVal_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.BASE_PROP__VAL_LIST, null, msgs);
      msgs = basicSetVal_list(newVal_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.BASE_PROP__VAL_LIST, newVal_list, newVal_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryTypeList getCat_list()
  {
    return cat_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCat_list(CategoryTypeList newCat_list, NotificationChain msgs)
  {
    CategoryTypeList oldCat_list = cat_list;
    cat_list = newCat_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.BASE_PROP__CAT_LIST, oldCat_list, newCat_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCat_list(CategoryTypeList newCat_list)
  {
    if (newCat_list != cat_list)
    {
      NotificationChain msgs = null;
      if (cat_list != null)
        msgs = ((InternalEObject)cat_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.BASE_PROP__CAT_LIST, null, msgs);
      if (newCat_list != null)
        msgs = ((InternalEObject)newCat_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.BASE_PROP__CAT_LIST, null, msgs);
      msgs = basicSetCat_list(newCat_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.BASE_PROP__CAT_LIST, newCat_list, newCat_list));
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
      case HIPIEPackage.BASE_PROP__VAL_LIST:
        return basicSetVal_list(null, msgs);
      case HIPIEPackage.BASE_PROP__CAT_LIST:
        return basicSetCat_list(null, msgs);
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
      case HIPIEPackage.BASE_PROP__NAME:
        return getName();
      case HIPIEPackage.BASE_PROP__VAL_LIST:
        return getVal_list();
      case HIPIEPackage.BASE_PROP__CAT_LIST:
        return getCat_list();
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
      case HIPIEPackage.BASE_PROP__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.BASE_PROP__VAL_LIST:
        setVal_list((ValueList)newValue);
        return;
      case HIPIEPackage.BASE_PROP__CAT_LIST:
        setCat_list((CategoryTypeList)newValue);
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
      case HIPIEPackage.BASE_PROP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.BASE_PROP__VAL_LIST:
        setVal_list((ValueList)null);
        return;
      case HIPIEPackage.BASE_PROP__CAT_LIST:
        setCat_list((CategoryTypeList)null);
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
      case HIPIEPackage.BASE_PROP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.BASE_PROP__VAL_LIST:
        return val_list != null;
      case HIPIEPackage.BASE_PROP__CAT_LIST:
        return cat_list != null;
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
    result.append(')');
    return result.toString();
  }

} //BasePropImpl
