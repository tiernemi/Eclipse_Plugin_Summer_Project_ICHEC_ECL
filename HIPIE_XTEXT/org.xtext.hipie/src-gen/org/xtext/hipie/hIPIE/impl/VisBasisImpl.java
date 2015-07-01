/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.OutDataset;
import org.xtext.hipie.hIPIE.VisBasis;
import org.xtext.hipie.hIPIE.VisBasisQualifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vis Basis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisBasisImpl#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisBasisImpl#getQuals <em>Quals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisBasisImpl extends MinimalEObjectImpl.Container implements VisBasis
{
  /**
   * The cached value of the '{@link #getBasis() <em>Basis</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasis()
   * @generated
   * @ordered
   */
  protected OutDataset basis;

  /**
   * The cached value of the '{@link #getQuals() <em>Quals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuals()
   * @generated
   * @ordered
   */
  protected VisBasisQualifiers quals;

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
  public OutDataset getBasis()
  {
    if (basis != null && basis.eIsProxy())
    {
      InternalEObject oldBasis = (InternalEObject)basis;
      basis = (OutDataset)eResolveProxy(oldBasis);
      if (basis != oldBasis)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HIPIEPackage.VIS_BASIS__BASIS, oldBasis, basis));
      }
    }
    return basis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutDataset basicGetBasis()
  {
    return basis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasis(OutDataset newBasis)
  {
    OutDataset oldBasis = basis;
    basis = newBasis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIS_BASIS__BASIS, oldBasis, basis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisBasisQualifiers getQuals()
  {
    return quals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuals(VisBasisQualifiers newQuals, NotificationChain msgs)
  {
    VisBasisQualifiers oldQuals = quals;
    quals = newQuals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIS_BASIS__QUALS, oldQuals, newQuals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuals(VisBasisQualifiers newQuals)
  {
    if (newQuals != quals)
    {
      NotificationChain msgs = null;
      if (quals != null)
        msgs = ((InternalEObject)quals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VIS_BASIS__QUALS, null, msgs);
      if (newQuals != null)
        msgs = ((InternalEObject)newQuals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VIS_BASIS__QUALS, null, msgs);
      msgs = basicSetQuals(newQuals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIS_BASIS__QUALS, newQuals, newQuals));
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
        return basicSetQuals(null, msgs);
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
      case HIPIEPackage.VIS_BASIS__BASIS:
        if (resolve) return getBasis();
        return basicGetBasis();
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HIPIEPackage.VIS_BASIS__BASIS:
        setBasis((OutDataset)newValue);
        return;
      case HIPIEPackage.VIS_BASIS__QUALS:
        setQuals((VisBasisQualifiers)newValue);
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
      case HIPIEPackage.VIS_BASIS__BASIS:
        setBasis((OutDataset)null);
        return;
      case HIPIEPackage.VIS_BASIS__QUALS:
        setQuals((VisBasisQualifiers)null);
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
      case HIPIEPackage.VIS_BASIS__BASIS:
        return basis != null;
      case HIPIEPackage.VIS_BASIS__QUALS:
        return quals != null;
    }
    return super.eIsSet(featureID);
  }

} //VisBasisImpl
