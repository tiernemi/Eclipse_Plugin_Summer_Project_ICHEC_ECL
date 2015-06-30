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
import org.xtext.hipie.hIPIE.assign;
import org.xtext.hipie.hIPIE.value_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.assignImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.assignImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.assignImpl#getAssign_internal <em>Assign internal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class assignImpl extends assign_listImpl implements assign
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
  protected EList<value_list> vals;

  /**
   * The cached value of the '{@link #getAssign_internal() <em>Assign internal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign_internal()
   * @generated
   * @ordered
   */
  protected EList<assign> assign_internal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected assignImpl()
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.ASSIGN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<value_list> getVals()
  {
    if (vals == null)
    {
      vals = new EObjectContainmentEList<value_list>(value_list.class, this, HIPIEPackage.ASSIGN__VALS);
    }
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<assign> getAssign_internal()
  {
    if (assign_internal == null)
    {
      assign_internal = new EObjectContainmentEList<assign>(assign.class, this, HIPIEPackage.ASSIGN__ASSIGN_INTERNAL);
    }
    return assign_internal;
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
      case HIPIEPackage.ASSIGN__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.ASSIGN__ASSIGN_INTERNAL:
        return ((InternalEList<?>)getAssign_internal()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.ASSIGN__NAME:
        return getName();
      case HIPIEPackage.ASSIGN__VALS:
        return getVals();
      case HIPIEPackage.ASSIGN__ASSIGN_INTERNAL:
        return getAssign_internal();
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
      case HIPIEPackage.ASSIGN__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.ASSIGN__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends value_list>)newValue);
        return;
      case HIPIEPackage.ASSIGN__ASSIGN_INTERNAL:
        getAssign_internal().clear();
        getAssign_internal().addAll((Collection<? extends assign>)newValue);
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
      case HIPIEPackage.ASSIGN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.ASSIGN__VALS:
        getVals().clear();
        return;
      case HIPIEPackage.ASSIGN__ASSIGN_INTERNAL:
        getAssign_internal().clear();
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
      case HIPIEPackage.ASSIGN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.ASSIGN__VALS:
        return vals != null && !vals.isEmpty();
      case HIPIEPackage.ASSIGN__ASSIGN_INTERNAL:
        return assign_internal != null && !assign_internal.isEmpty();
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

} //assignImpl
