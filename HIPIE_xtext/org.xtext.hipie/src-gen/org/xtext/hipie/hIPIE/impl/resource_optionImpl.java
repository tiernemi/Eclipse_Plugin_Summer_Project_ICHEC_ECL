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
import org.xtext.hipie.hIPIE.resource_option;
import org.xtext.hipie.hIPIE.value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>resource option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.resource_optionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.resource_optionImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.resource_optionImpl#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class resource_optionImpl extends resource_optionsImpl implements resource_option
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
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected EList<value> vals;

  /**
   * The cached value of the '{@link #getRes_ops() <em>Res ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes_ops()
   * @generated
   * @ordered
   */
  protected EList<resource_option> res_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected resource_optionImpl()
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
    return HIPIEPackage.Literals.RESOURCE_OPTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.RESOURCE_OPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<value> getVals()
  {
    if (vals == null)
    {
      vals = new EObjectContainmentEList<value>(value.class, this, HIPIEPackage.RESOURCE_OPTION__VALS);
    }
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<resource_option> getRes_ops()
  {
    if (res_ops == null)
    {
      res_ops = new EObjectContainmentEList<resource_option>(resource_option.class, this, HIPIEPackage.RESOURCE_OPTION__RES_OPS);
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
      case HIPIEPackage.RESOURCE_OPTION__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.RESOURCE_OPTION__RES_OPS:
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
      case HIPIEPackage.RESOURCE_OPTION__NAME:
        return getName();
      case HIPIEPackage.RESOURCE_OPTION__VALS:
        return getVals();
      case HIPIEPackage.RESOURCE_OPTION__RES_OPS:
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
      case HIPIEPackage.RESOURCE_OPTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.RESOURCE_OPTION__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends value>)newValue);
        return;
      case HIPIEPackage.RESOURCE_OPTION__RES_OPS:
        getRes_ops().clear();
        getRes_ops().addAll((Collection<? extends resource_option>)newValue);
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
      case HIPIEPackage.RESOURCE_OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.RESOURCE_OPTION__VALS:
        getVals().clear();
        return;
      case HIPIEPackage.RESOURCE_OPTION__RES_OPS:
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
      case HIPIEPackage.RESOURCE_OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.RESOURCE_OPTION__VALS:
        return vals != null && !vals.isEmpty();
      case HIPIEPackage.RESOURCE_OPTION__RES_OPS:
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
    result.append(')');
    return result.toString();
  }

} //resource_optionImpl
