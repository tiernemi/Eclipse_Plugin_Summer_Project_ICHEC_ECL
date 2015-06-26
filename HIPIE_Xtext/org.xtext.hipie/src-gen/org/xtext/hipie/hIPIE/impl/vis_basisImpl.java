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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.dataset;
import org.xtext.hipie.hIPIE.vis_basis;
import org.xtext.hipie.hIPIE.vis_basis_qualifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>vis basis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.vis_basisImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.vis_basisImpl#getQuals <em>Quals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class vis_basisImpl extends MinimalEObjectImpl.Container implements vis_basis
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<dataset> vars;

  /**
   * The cached value of the '{@link #getQuals() <em>Quals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuals()
   * @generated
   * @ordered
   */
  protected EList<vis_basis_qualifiers> quals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected vis_basisImpl()
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
    return HIPIEPackage.Literals.VIS_BASIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<dataset> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<dataset>(dataset.class, this, HIPIEPackage.VIS_BASIS__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<vis_basis_qualifiers> getQuals()
  {
    if (quals == null)
    {
      quals = new EObjectContainmentEList<vis_basis_qualifiers>(vis_basis_qualifiers.class, this, HIPIEPackage.VIS_BASIS__QUALS);
    }
    return quals;
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
      case HIPIEPackage.VIS_BASIS__QUALS:
        return ((InternalEList<?>)getQuals()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VIS_BASIS__VARS:
        return getVars();
      case HIPIEPackage.VIS_BASIS__QUALS:
        return getQuals();
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
      case HIPIEPackage.VIS_BASIS__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends dataset>)newValue);
        return;
      case HIPIEPackage.VIS_BASIS__QUALS:
        getQuals().clear();
        getQuals().addAll((Collection<? extends vis_basis_qualifiers>)newValue);
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
      case HIPIEPackage.VIS_BASIS__VARS:
        getVars().clear();
        return;
      case HIPIEPackage.VIS_BASIS__QUALS:
        getQuals().clear();
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
      case HIPIEPackage.VIS_BASIS__VARS:
        return vars != null && !vars.isEmpty();
      case HIPIEPackage.VIS_BASIS__QUALS:
        return quals != null && !quals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //vis_basisImpl
