/**
 */
package org.xtext.hipie.hIPIE.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.field_decl;
import org.xtext.hipie.hIPIE.input_options;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>field decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.field_declImpl#getInput_internal <em>Input internal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class field_declImpl extends pos_viz_dataImpl implements field_decl
{
  /**
   * The cached value of the '{@link #getInput_internal() <em>Input internal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput_internal()
   * @generated
   * @ordered
   */
  protected EList<input_options> input_internal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected field_declImpl()
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
    return HIPIEPackage.Literals.FIELD_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<input_options> getInput_internal()
  {
    if (input_internal == null)
    {
      input_internal = new EObjectContainmentEList<input_options>(input_options.class, this, HIPIEPackage.FIELD_DECL__INPUT_INTERNAL);
    }
    return input_internal;
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
      case HIPIEPackage.FIELD_DECL__INPUT_INTERNAL:
        return ((InternalEList<?>)getInput_internal()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.FIELD_DECL__INPUT_INTERNAL:
        return getInput_internal();
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
      case HIPIEPackage.FIELD_DECL__INPUT_INTERNAL:
        getInput_internal().clear();
        getInput_internal().addAll((Collection<? extends input_options>)newValue);
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
      case HIPIEPackage.FIELD_DECL__INPUT_INTERNAL:
        getInput_internal().clear();
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
      case HIPIEPackage.FIELD_DECL__INPUT_INTERNAL:
        return input_internal != null && !input_internal.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //field_declImpl
