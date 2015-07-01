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
import org.xtext.hipie.hIPIE.ResourceOption;
import org.xtext.hipie.hIPIE.ResourceOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ResourceOptionsImpl#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceOptionsImpl extends MinimalEObjectImpl.Container implements ResourceOptions
{
  /**
   * The cached value of the '{@link #getRes_ops() <em>Res ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes_ops()
   * @generated
   * @ordered
   */
  protected EList<ResourceOption> res_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceOptionsImpl()
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
    return HIPIEPackage.Literals.RESOURCE_OPTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceOption> getRes_ops()
  {
    if (res_ops == null)
    {
      res_ops = new EObjectContainmentEList<ResourceOption>(ResourceOption.class, this, HIPIEPackage.RESOURCE_OPTIONS__RES_OPS);
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
      case HIPIEPackage.RESOURCE_OPTIONS__RES_OPS:
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
      case HIPIEPackage.RESOURCE_OPTIONS__RES_OPS:
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
      case HIPIEPackage.RESOURCE_OPTIONS__RES_OPS:
        getRes_ops().clear();
        getRes_ops().addAll((Collection<? extends ResourceOption>)newValue);
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
      case HIPIEPackage.RESOURCE_OPTIONS__RES_OPS:
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
      case HIPIEPackage.RESOURCE_OPTIONS__RES_OPS:
        return res_ops != null && !res_ops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ResourceOptionsImpl
