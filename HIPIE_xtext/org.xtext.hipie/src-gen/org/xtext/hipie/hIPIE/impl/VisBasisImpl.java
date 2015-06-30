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

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.VisBasis;
import org.xtext.hipie.hIPIE.out_dataset;
import org.xtext.hipie.hIPIE.vis_basis_qualifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vis Basis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisBasisImpl#getAssigned <em>Assigned</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisBasisImpl#getQuals <em>Quals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisBasisImpl extends MinimalEObjectImpl.Container implements VisBasis
{
  /**
   * The cached value of the '{@link #getAssigned() <em>Assigned</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigned()
   * @generated
   * @ordered
   */
  protected out_dataset assigned;

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
  protected VisBasisImpl()
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
  public out_dataset getAssigned()
  {
    if (assigned != null && assigned.eIsProxy())
    {
      InternalEObject oldAssigned = (InternalEObject)assigned;
      assigned = (out_dataset)eResolveProxy(oldAssigned);
      if (assigned != oldAssigned)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HIPIEPackage.VIS_BASIS__ASSIGNED, oldAssigned, assigned));
      }
    }
    return assigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public out_dataset basicGetAssigned()
  {
    return assigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssigned(out_dataset newAssigned)
  {
    out_dataset oldAssigned = assigned;
    assigned = newAssigned;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIS_BASIS__ASSIGNED, oldAssigned, assigned));
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
      case HIPIEPackage.VIS_BASIS__ASSIGNED:
        if (resolve) return getAssigned();
        return basicGetAssigned();
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
      case HIPIEPackage.VIS_BASIS__ASSIGNED:
        setAssigned((out_dataset)newValue);
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
      case HIPIEPackage.VIS_BASIS__ASSIGNED:
        setAssigned((out_dataset)null);
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
      case HIPIEPackage.VIS_BASIS__ASSIGNED:
        return assigned != null;
      case HIPIEPackage.VIS_BASIS__QUALS:
        return quals != null && !quals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VisBasisImpl
