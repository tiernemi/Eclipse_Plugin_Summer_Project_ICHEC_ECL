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

import org.xtext.hipie.hIPIE.Function;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.QFunction;
import org.xtext.hipie.hIPIE.VisBasisQualifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vis Basis Qualifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl#getQfuncs <em>Qfuncs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisBasisQualifiersImpl extends NestBasisQualifierImpl implements VisBasisQualifiers
{
  /**
   * The cached value of the '{@link #getFuncs() <em>Funcs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncs()
   * @generated
   * @ordered
   */
  protected Function funcs;

  /**
   * The cached value of the '{@link #getQfuncs() <em>Qfuncs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQfuncs()
   * @generated
   * @ordered
   */
  protected EList<QFunction> qfuncs;

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
  public Function getFuncs()
  {
    return funcs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuncs(Function newFuncs, NotificationChain msgs)
  {
    Function oldFuncs = funcs;
    funcs = newFuncs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS, oldFuncs, newFuncs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuncs(Function newFuncs)
  {
    if (newFuncs != funcs)
    {
      NotificationChain msgs = null;
      if (funcs != null)
        msgs = ((InternalEObject)funcs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS, null, msgs);
      if (newFuncs != null)
        msgs = ((InternalEObject)newFuncs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS, null, msgs);
      msgs = basicSetFuncs(newFuncs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIS_BASIS_QUALIFIERS__FUNCS, newFuncs, newFuncs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QFunction> getQfuncs()
  {
    if (qfuncs == null)
    {
      qfuncs = new EObjectContainmentEList<QFunction>(QFunction.class, this, HIPIEPackage.VIS_BASIS_QUALIFIERS__QFUNCS);
    }
    return qfuncs;
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
        return basicSetFuncs(null, msgs);
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__QFUNCS:
        return ((InternalEList<?>)getQfuncs()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__QFUNCS:
        return getQfuncs();
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
        setFuncs((Function)newValue);
        return;
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__QFUNCS:
        getQfuncs().clear();
        getQfuncs().addAll((Collection<? extends QFunction>)newValue);
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
        setFuncs((Function)null);
        return;
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__QFUNCS:
        getQfuncs().clear();
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
        return funcs != null;
      case HIPIEPackage.VIS_BASIS_QUALIFIERS__QFUNCS:
        return qfuncs != null && !qfuncs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VisBasisQualifiersImpl
