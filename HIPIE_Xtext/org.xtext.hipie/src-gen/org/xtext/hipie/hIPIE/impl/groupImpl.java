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
import org.xtext.hipie.hIPIE.group;
import org.xtext.hipie.hIPIE.input_options;
import org.xtext.hipie.hIPIE.input_value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.groupImpl#getInput_internal <em>Input internal</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.groupImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class groupImpl extends input_valueImpl implements group
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
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<input_value> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected groupImpl()
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
    return HIPIEPackage.Literals.GROUP;
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
      input_internal = new EObjectContainmentEList<input_options>(input_options.class, this, HIPIEPackage.GROUP__INPUT_INTERNAL);
    }
    return input_internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<input_value> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<input_value>(input_value.class, this, HIPIEPackage.GROUP__VALUES);
    }
    return values;
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
      case HIPIEPackage.GROUP__INPUT_INTERNAL:
        return ((InternalEList<?>)getInput_internal()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.GROUP__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.GROUP__INPUT_INTERNAL:
        return getInput_internal();
      case HIPIEPackage.GROUP__VALUES:
        return getValues();
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
      case HIPIEPackage.GROUP__INPUT_INTERNAL:
        getInput_internal().clear();
        getInput_internal().addAll((Collection<? extends input_options>)newValue);
        return;
      case HIPIEPackage.GROUP__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends input_value>)newValue);
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
      case HIPIEPackage.GROUP__INPUT_INTERNAL:
        getInput_internal().clear();
        return;
      case HIPIEPackage.GROUP__VALUES:
        getValues().clear();
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
      case HIPIEPackage.GROUP__INPUT_INTERNAL:
        return input_internal != null && !input_internal.isEmpty();
      case HIPIEPackage.GROUP__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //groupImpl
