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
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.Assign;
import org.xtext.hipie.hIPIE.ContractInstance;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InstanceID;
import org.xtext.hipie.hIPIE.InstanceOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl#getSec_name <em>Sec name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl#getInstId <em>Inst Id</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl#getInstance_ops <em>Instance ops</em>}</li>
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
   * The cached value of the '{@link #getInstId() <em>Inst Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstId()
   * @generated
   * @ordered
   */
  protected InstanceID instId;

  /**
   * The cached value of the '{@link #getInstance_ops() <em>Instance ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance_ops()
   * @generated
   * @ordered
   */
  protected InstanceOptions instance_ops;

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
  public InstanceID getInstId()
  {
    return instId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstId(InstanceID newInstId, NotificationChain msgs)
  {
    InstanceID oldInstId = instId;
    instId = newInstId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.CONTRACT_INSTANCE__INST_ID, oldInstId, newInstId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstId(InstanceID newInstId)
  {
    if (newInstId != instId)
    {
      NotificationChain msgs = null;
      if (instId != null)
        msgs = ((InternalEObject)instId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.CONTRACT_INSTANCE__INST_ID, null, msgs);
      if (newInstId != null)
        msgs = ((InternalEObject)newInstId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.CONTRACT_INSTANCE__INST_ID, null, msgs);
      msgs = basicSetInstId(newInstId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.CONTRACT_INSTANCE__INST_ID, newInstId, newInstId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOptions getInstance_ops()
  {
    return instance_ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstance_ops(InstanceOptions newInstance_ops, NotificationChain msgs)
  {
    InstanceOptions oldInstance_ops = instance_ops;
    instance_ops = newInstance_ops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS, oldInstance_ops, newInstance_ops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance_ops(InstanceOptions newInstance_ops)
  {
    if (newInstance_ops != instance_ops)
    {
      NotificationChain msgs = null;
      if (instance_ops != null)
        msgs = ((InternalEObject)instance_ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS, null, msgs);
      if (newInstance_ops != null)
        msgs = ((InternalEObject)newInstance_ops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS, null, msgs);
      msgs = basicSetInstance_ops(newInstance_ops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS, newInstance_ops, newInstance_ops));
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
      case HIPIEPackage.CONTRACT_INSTANCE__INST_ID:
        return basicSetInstId(null, msgs);
      case HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS:
        return basicSetInstance_ops(null, msgs);
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
      case HIPIEPackage.CONTRACT_INSTANCE__INST_ID:
        return getInstId();
      case HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS:
        return getInstance_ops();
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
      case HIPIEPackage.CONTRACT_INSTANCE__INST_ID:
        setInstId((InstanceID)newValue);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS:
        setInstance_ops((InstanceOptions)newValue);
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
      case HIPIEPackage.CONTRACT_INSTANCE__INST_ID:
        setInstId((InstanceID)null);
        return;
      case HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS:
        setInstance_ops((InstanceOptions)null);
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
      case HIPIEPackage.CONTRACT_INSTANCE__INST_ID:
        return instId != null;
      case HIPIEPackage.CONTRACT_INSTANCE__INSTANCE_OPS:
        return instance_ops != null;
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
