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

import org.xtext.hipie.hIPIE.Function;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.VisBasisQualifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vis Basis Qualifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl#getFuncs <em>Funcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisBasisQualifiersImpl extends MinimalEObjectImpl.Container implements VisBasisQualifiers
{
  /**
   * The cached value of the '{@link #getFuncs() <em>Funcs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncs()
   * @generated
   * @ordered
   */
  protected EList<Function> funcs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisBasisQualifiersImpl()
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
    return HIPIEPackage.Literals.VIS_BASIS_QUALIFIERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function> getFuncs()
  {
    if (funcs == null)
    {
      funcs = new EObjectContainmentEList<Function>(Function.class, this, HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS);
    }
    return funcs;
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
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS:
        return ((InternalEList<?>)getFuncs()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS:
        return getFuncs();
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
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS:
        getFuncs().clear();
        getFuncs().addAll((Collection<? extends Function>)newValue);
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
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS:
        getFuncs().clear();
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
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS:
        return funcs != null && !funcs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VisBasisQualifiersImpl
