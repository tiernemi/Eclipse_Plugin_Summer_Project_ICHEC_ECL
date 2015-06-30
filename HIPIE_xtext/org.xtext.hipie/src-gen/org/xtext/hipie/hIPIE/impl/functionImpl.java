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
import org.xtext.hipie.hIPIE.function;
import org.xtext.hipie.hIPIE.pos_viz_data;
import org.xtext.hipie.hIPIE.value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.functionImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.functionImpl#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class functionImpl extends MinimalEObjectImpl.Container implements function
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<pos_viz_data> vars;

  /**
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected EList<value> vals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected functionImpl()
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
    return HIPIEPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<pos_viz_data> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<pos_viz_data>(pos_viz_data.class, this, HIPIEPackage.FUNCTION__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<value> getVals()
  {
    if (vals == null)
    {
      vals = new EObjectContainmentEList<value>(value.class, this, HIPIEPackage.FUNCTION__VALS);
    }
    return vals;
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
      case HIPIEPackage.FUNCTION__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.FUNCTION__VARS:
        return getVars();
      case HIPIEPackage.FUNCTION__VALS:
        return getVals();
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
      case HIPIEPackage.FUNCTION__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends pos_viz_data>)newValue);
        return;
      case HIPIEPackage.FUNCTION__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends value>)newValue);
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
      case HIPIEPackage.FUNCTION__VARS:
        getVars().clear();
        return;
      case HIPIEPackage.FUNCTION__VALS:
        getVals().clear();
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
      case HIPIEPackage.FUNCTION__VARS:
        return vars != null && !vars.isEmpty();
      case HIPIEPackage.FUNCTION__VALS:
        return vals != null && !vals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //functionImpl
