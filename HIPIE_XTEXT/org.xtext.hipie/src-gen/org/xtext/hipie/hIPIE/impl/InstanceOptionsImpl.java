/**
 */
package org.xtext.hipie.hIPIE.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InstanceOption;
import org.xtext.hipie.hIPIE.InstanceOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InstanceOptionsImpl#getIn_ops <em>In ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceOptionsImpl extends MinimalEObjectImpl.Container implements InstanceOptions
{
  /**
   * The cached value of the '{@link #getIn_ops() <em>In ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn_ops()
   * @generated
   * @ordered
   */
  protected EList<InstanceOption> in_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceOptionsImpl()
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
    return HIPIEPackage.Literals.INSTANCE_OPTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InstanceOption> getIn_ops()
  {
    if (in_ops == null)
    {
      in_ops = new EObjectContainmentEList<InstanceOption>(InstanceOption.class, this, HIPIEPackage.INSTANCE_OPTIONS__IN_OPS);
    }
    return in_ops;
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
      case HIPIEPackage.INSTANCE_OPTIONS__IN_OPS:
        return ((InternalEList<?>)getIn_ops()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.INSTANCE_OPTIONS__IN_OPS:
        return getIn_ops();
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
      case HIPIEPackage.INSTANCE_OPTIONS__IN_OPS:
        getIn_ops().clear();
        getIn_ops().addAll((Collection<? extends InstanceOption>)newValue);
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
      case HIPIEPackage.INSTANCE_OPTIONS__IN_OPS:
        getIn_ops().clear();
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
      case HIPIEPackage.INSTANCE_OPTIONS__IN_OPS:
        return in_ops != null && !in_ops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InstanceOptionsImpl
