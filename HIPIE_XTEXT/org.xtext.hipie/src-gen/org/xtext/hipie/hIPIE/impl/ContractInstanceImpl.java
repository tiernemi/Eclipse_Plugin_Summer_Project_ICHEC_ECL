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

import org.xtext.hipie.hIPIE.Assign;
import org.xtext.hipie.hIPIE.ContractInstance;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl#getSec_name <em>Sec name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractInstanceImpl extends MinimalEObjectImpl.Container implements ContractInstance
{
  /**
   * The default value of the '{@link #getSec_name() <em>Sec name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSec_name()
   * @generated
   * @ordered
   */
  protected static final String SEC_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSec_name() <em>Sec name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSec_name()
   * @generated
   * @ordered
   */
  protected String sec_name = SEC_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected EList<Value> vals;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<Value> vars;

  /**
   * The cached value of the '{@link #getAssigns() <em>Assigns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns()
   * @generated
   * @ordered
   */
  protected EList<Assign> assigns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractInstanceImpl()
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
  public String getSec_name()
  {
    return sec_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSec_name(String newSec_name)
  {
    String oldSec_name = sec_name;
    sec_name = newSec_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.CONTRACT_INSTANCE__SEC_NAME, oldSec_name, sec_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getVals()
  {
    if (vals == null)
    {
      vals = new EObjectContainmentEList<Value>(Value.class, this, HIPIEPackage.CONTRACT_INSTANCE__VALS);
    }
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<Value>(Value.class, this, HIPIEPackage.CONTRACT_INSTANCE__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assign> getAssigns()
  {
    if (assigns == null)
    {
      assigns = new EObjectContainmentEList<Assign>(Assign.class, this, HIPIEPackage.CONTRACT_INSTANCE__ASSIGNS);
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
      case HIPIEPackage.CONTRACT_INSTANCE__SEC_NAME:
        return getSec_name();
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
      case HIPIEPackage.CONTRACT_INSTANCE__SEC_NAME:
        setSec_name((String)newValue);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends Value>)newValue);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends Value>)newValue);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__ASSIGNS:
        getAssigns().clear();
        getAssigns().addAll((Collection<? extends Assign>)newValue);
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
      case HIPIEPackage.CONTRACT_INSTANCE__SEC_NAME:
        setSec_name(SEC_NAME_EDEFAULT);
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
      case HIPIEPackage.CONTRACT_INSTANCE__SEC_NAME:
        return SEC_NAME_EDEFAULT == null ? sec_name != null : !SEC_NAME_EDEFAULT.equals(sec_name);
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
    result.append(" (sec_name: ");
    result.append(sec_name);
    result.append(')');
    return result.toString();
  }

} //ContractInstanceImpl
