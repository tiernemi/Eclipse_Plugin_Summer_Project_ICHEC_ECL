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

import org.xtext.hipie.hIPIE.ECLOutputDecl;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.OutputOptions;
import org.xtext.hipie.hIPIE.Service;
import org.xtext.hipie.hIPIE.ServiceInputSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ServiceImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ServiceImpl#getServ <em>Serv</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ServiceImpl#getEcl_vars <em>Ecl vars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends OutputValueImpl implements Service
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
   * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected OutputOptions ops;

  /**
   * The cached value of the '{@link #getServ() <em>Serv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServ()
   * @generated
   * @ordered
   */
  protected ServiceInputSection serv;

  /**
   * The cached value of the '{@link #getEcl_vars() <em>Ecl vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcl_vars()
   * @generated
   * @ordered
   */
  protected EList<ECLOutputDecl> ecl_vars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
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
    return HIPIEPackage.Literals.SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputOptions getOps()
  {
    return ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOps(OutputOptions newOps, NotificationChain msgs)
  {
    OutputOptions oldOps = ops;
    ops = newOps;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.SERVICE__OPS, oldOps, newOps);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOps(OutputOptions newOps)
  {
    if (newOps != ops)
    {
      NotificationChain msgs = null;
      if (ops != null)
        msgs = ((InternalEObject)ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.SERVICE__OPS, null, msgs);
      if (newOps != null)
        msgs = ((InternalEObject)newOps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.SERVICE__OPS, null, msgs);
      msgs = basicSetOps(newOps, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.SERVICE__OPS, newOps, newOps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceInputSection getServ()
  {
    return serv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetServ(ServiceInputSection newServ, NotificationChain msgs)
  {
    ServiceInputSection oldServ = serv;
    serv = newServ;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.SERVICE__SERV, oldServ, newServ);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServ(ServiceInputSection newServ)
  {
    if (newServ != serv)
    {
      NotificationChain msgs = null;
      if (serv != null)
        msgs = ((InternalEObject)serv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.SERVICE__SERV, null, msgs);
      if (newServ != null)
        msgs = ((InternalEObject)newServ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.SERVICE__SERV, null, msgs);
      msgs = basicSetServ(newServ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.SERVICE__SERV, newServ, newServ));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ECLOutputDecl> getEcl_vars()
  {
    if (ecl_vars == null)
    {
      ecl_vars = new EObjectContainmentEList<ECLOutputDecl>(ECLOutputDecl.class, this, HIPIEPackage.SERVICE__ECL_VARS);
    }
    return ecl_vars;
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
      case HIPIEPackage.SERVICE__OPS:
        return basicSetOps(null, msgs);
      case HIPIEPackage.SERVICE__SERV:
        return basicSetServ(null, msgs);
      case HIPIEPackage.SERVICE__ECL_VARS:
        return ((InternalEList<?>)getEcl_vars()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.SERVICE__NAME:
        return getName();
      case HIPIEPackage.SERVICE__OPS:
        return getOps();
      case HIPIEPackage.SERVICE__SERV:
        return getServ();
      case HIPIEPackage.SERVICE__ECL_VARS:
        return getEcl_vars();
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
      case HIPIEPackage.SERVICE__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.SERVICE__OPS:
        setOps((OutputOptions)newValue);
        return;
      case HIPIEPackage.SERVICE__SERV:
        setServ((ServiceInputSection)newValue);
        return;
      case HIPIEPackage.SERVICE__ECL_VARS:
        getEcl_vars().clear();
        getEcl_vars().addAll((Collection<? extends ECLOutputDecl>)newValue);
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
      case HIPIEPackage.SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.SERVICE__OPS:
        setOps((OutputOptions)null);
        return;
      case HIPIEPackage.SERVICE__SERV:
        setServ((ServiceInputSection)null);
        return;
      case HIPIEPackage.SERVICE__ECL_VARS:
        getEcl_vars().clear();
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
      case HIPIEPackage.SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.SERVICE__OPS:
        return ops != null;
      case HIPIEPackage.SERVICE__SERV:
        return serv != null;
      case HIPIEPackage.SERVICE__ECL_VARS:
        return ecl_vars != null && !ecl_vars.isEmpty();
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

} //ServiceImpl
