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
import org.xtext.hipie.hIPIE.OutDataset;
import org.xtext.hipie.hIPIE.OutputBase;
import org.xtext.hipie.hIPIE.OutputOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutDatasetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutDatasetImpl#getOut_base <em>Out base</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutDatasetImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutDatasetImpl#getEcl_vars <em>Ecl vars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutDatasetImpl extends OutputValueImpl implements OutDataset
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
   * The cached value of the '{@link #getOut_base() <em>Out base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut_base()
   * @generated
   * @ordered
   */
  protected OutputBase out_base;

  /**
   * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected EList<OutputOptions> ops;

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
  protected OutDatasetImpl()
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
    return HIPIEPackage.Literals.OUT_DATASET;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.OUT_DATASET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputBase getOut_base()
  {
    return out_base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOut_base(OutputBase newOut_base, NotificationChain msgs)
  {
    OutputBase oldOut_base = out_base;
    out_base = newOut_base;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.OUT_DATASET__OUT_BASE, oldOut_base, newOut_base);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut_base(OutputBase newOut_base)
  {
    if (newOut_base != out_base)
    {
      NotificationChain msgs = null;
      if (out_base != null)
        msgs = ((InternalEObject)out_base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.OUT_DATASET__OUT_BASE, null, msgs);
      if (newOut_base != null)
        msgs = ((InternalEObject)newOut_base).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.OUT_DATASET__OUT_BASE, null, msgs);
      msgs = basicSetOut_base(newOut_base, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.OUT_DATASET__OUT_BASE, newOut_base, newOut_base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OutputOptions> getOps()
  {
    if (ops == null)
    {
      ops = new EObjectContainmentEList<OutputOptions>(OutputOptions.class, this, HIPIEPackage.OUT_DATASET__OPS);
    }
    return ops;
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
      ecl_vars = new EObjectContainmentEList<ECLOutputDecl>(ECLOutputDecl.class, this, HIPIEPackage.OUT_DATASET__ECL_VARS);
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
      case HIPIEPackage.OUT_DATASET__OUT_BASE:
        return basicSetOut_base(null, msgs);
      case HIPIEPackage.OUT_DATASET__OPS:
        return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.OUT_DATASET__ECL_VARS:
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
      case HIPIEPackage.OUT_DATASET__NAME:
        return getName();
      case HIPIEPackage.OUT_DATASET__OUT_BASE:
        return getOut_base();
      case HIPIEPackage.OUT_DATASET__OPS:
        return getOps();
      case HIPIEPackage.OUT_DATASET__ECL_VARS:
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
      case HIPIEPackage.OUT_DATASET__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.OUT_DATASET__OUT_BASE:
        setOut_base((OutputBase)newValue);
        return;
      case HIPIEPackage.OUT_DATASET__OPS:
        getOps().clear();
        getOps().addAll((Collection<? extends OutputOptions>)newValue);
        return;
      case HIPIEPackage.OUT_DATASET__ECL_VARS:
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
      case HIPIEPackage.OUT_DATASET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.OUT_DATASET__OUT_BASE:
        setOut_base((OutputBase)null);
        return;
      case HIPIEPackage.OUT_DATASET__OPS:
        getOps().clear();
        return;
      case HIPIEPackage.OUT_DATASET__ECL_VARS:
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
      case HIPIEPackage.OUT_DATASET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.OUT_DATASET__OUT_BASE:
        return out_base != null;
      case HIPIEPackage.OUT_DATASET__OPS:
        return ops != null && !ops.isEmpty();
      case HIPIEPackage.OUT_DATASET__ECL_VARS:
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

} //OutDatasetImpl
