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
import org.xtext.hipie.hIPIE.ServiceInputSection;
import org.xtext.hipie.hIPIE.ServiceInputValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Input Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ServiceInputSectionImpl#getServs <em>Servs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInputSectionImpl extends MinimalEObjectImpl.Container implements ServiceInputSection
{
  /**
   * The cached value of the '{@link #getServs() <em>Servs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServs()
   * @generated
   * @ordered
   */
  protected EList<ServiceInputValue> servs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceInputSectionImpl()
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
    return HIPIEPackage.Literals.SERVICE_INPUT_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceInputValue> getServs()
  {
    if (servs == null)
    {
      servs = new EObjectContainmentEList<ServiceInputValue>(ServiceInputValue.class, this, HIPIEPackage.SERVICE_INPUT_SECTION__SERVS);
    }
    return servs;
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
      case HIPIEPackage.SERVICE_INPUT_SECTION__SERVS:
        return ((InternalEList<?>)getServs()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.SERVICE_INPUT_SECTION__SERVS:
        return getServs();
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
      case HIPIEPackage.SERVICE_INPUT_SECTION__SERVS:
        getServs().clear();
        getServs().addAll((Collection<? extends ServiceInputValue>)newValue);
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
      case HIPIEPackage.SERVICE_INPUT_SECTION__SERVS:
        getServs().clear();
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
      case HIPIEPackage.SERVICE_INPUT_SECTION__SERVS:
        return servs != null && !servs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ServiceInputSectionImpl
