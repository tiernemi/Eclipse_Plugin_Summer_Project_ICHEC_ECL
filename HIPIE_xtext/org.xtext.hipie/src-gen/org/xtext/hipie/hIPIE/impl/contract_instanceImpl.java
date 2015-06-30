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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.assign;
import org.xtext.hipie.hIPIE.contract_instance;
import org.xtext.hipie.hIPIE.value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>contract instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.contract_instanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.contract_instanceImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.contract_instanceImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.contract_instanceImpl#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class contract_instanceImpl extends MinimalEObjectImpl.Container implements contract_instance
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
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<value> vars;

  /**
   * The cached value of the '{@link #getAssigns() <em>Assigns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns()
   * @generated
   * @ordered
   */
  protected EList<assign> assigns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected contract_instanceImpl()
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
    return HIPIEPackage.Literals.CONTRACT_INSTANCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.CONTRACT_INSTANCE__NAME, oldName, name));
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
      vals = new EObjectContainmentEList<value>(value.class, this, HIPIEPackage.CONTRACT_INSTANCE__VALS);
    }
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<value> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<value>(value.class, this, HIPIEPackage.CONTRACT_INSTANCE__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<assign> getAssigns()
  {
    if (assigns == null)
    {
      assigns = new EObjectContainmentEList<assign>(assign.class, this, HIPIEPackage.CONTRACT_INSTANCE__ASSIGNS);
    }
    return assigns;
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
      case HIPIEPackage.CONTRACT_INSTANCE__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.CONTRACT_INSTANCE__ASSIGNS:
        return ((InternalEList<?>)getAssigns()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.CONTRACT_INSTANCE__NAME:
        return getName();
      case HIPIEPackage.CONTRACT_INSTANCE__VALS:
        return getVals();
      case HIPIEPackage.CONTRACT_INSTANCE__VARS:
        return getVars();
      case HIPIEPackage.CONTRACT_INSTANCE__ASSIGNS:
        return getAssigns();
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
      case HIPIEPackage.CONTRACT_INSTANCE__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends value>)newValue);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends value>)newValue);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__ASSIGNS:
        getAssigns().clear();
        getAssigns().addAll((Collection<? extends assign>)newValue);
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
      case HIPIEPackage.CONTRACT_INSTANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__VALS:
        getVals().clear();
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__VARS:
        getVars().clear();
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__ASSIGNS:
        getAssigns().clear();
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
      case HIPIEPackage.CONTRACT_INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.CONTRACT_INSTANCE__VALS:
        return vals != null && !vals.isEmpty();
      case HIPIEPackage.CONTRACT_INSTANCE__VARS:
        return vars != null && !vars.isEmpty();
      case HIPIEPackage.CONTRACT_INSTANCE__ASSIGNS:
        return assigns != null && !assigns.isEmpty();
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

} //contract_instanceImpl
