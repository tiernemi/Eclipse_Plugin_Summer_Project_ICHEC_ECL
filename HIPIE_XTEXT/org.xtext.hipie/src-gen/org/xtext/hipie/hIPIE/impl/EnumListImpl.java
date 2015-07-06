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

import org.xtext.hipie.hIPIE.EnumEntry;
import org.xtext.hipie.hIPIE.EnumList;
import org.xtext.hipie.hIPIE.HIPIEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.EnumListImpl#getEn_ents <em>En ents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumListImpl extends MinimalEObjectImpl.Container implements EnumList
{
  /**
   * The cached value of the '{@link #getEn_ents() <em>En ents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEn_ents()
   * @generated
   * @ordered
   */
  protected EList<EnumEntry> en_ents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumListImpl()
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
    return HIPIEPackage.Literals.ENUM_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumEntry> getEn_ents()
  {
    if (en_ents == null)
    {
      en_ents = new EObjectContainmentEList<EnumEntry>(EnumEntry.class, this, HIPIEPackage.ENUM_LIST__EN_ENTS);
    }
    return en_ents;
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
      case HIPIEPackage.ENUM_LIST__EN_ENTS:
        return ((InternalEList<?>)getEn_ents()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.ENUM_LIST__EN_ENTS:
        return getEn_ents();
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
      case HIPIEPackage.ENUM_LIST__EN_ENTS:
        getEn_ents().clear();
        getEn_ents().addAll((Collection<? extends EnumEntry>)newValue);
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
      case HIPIEPackage.ENUM_LIST__EN_ENTS:
        getEn_ents().clear();
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
      case HIPIEPackage.ENUM_LIST__EN_ENTS:
        return en_ents != null && !en_ents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumListImpl
