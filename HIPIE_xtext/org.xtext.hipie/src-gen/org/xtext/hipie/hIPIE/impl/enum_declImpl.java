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
import org.xtext.hipie.hIPIE.assign_list;
import org.xtext.hipie.hIPIE.enum_decl;
import org.xtext.hipie.hIPIE.input_options;
import org.xtext.hipie.hIPIE.value_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enum decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.enum_declImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.enum_declImpl#getAssigns <em>Assigns</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.enum_declImpl#getInput_ops <em>Input ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enum_declImpl extends input_valueImpl implements enum_decl
{
  /**
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected EList<value_list> vals;

  /**
   * The cached value of the '{@link #getAssigns() <em>Assigns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns()
   * @generated
   * @ordered
   */
  protected EList<assign_list> assigns;

  /**
   * The cached value of the '{@link #getInput_ops() <em>Input ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput_ops()
   * @generated
   * @ordered
   */
  protected EList<input_options> input_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected enum_declImpl()
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
    return HIPIEPackage.Literals.ENUM_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<value_list> getVals()
  {
    if (vals == null)
    {
      vals = new EObjectContainmentEList<value_list>(value_list.class, this, HIPIEPackage.ENUM_DECL__VALS);
    }
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<assign_list> getAssigns()
  {
    if (assigns == null)
    {
      assigns = new EObjectContainmentEList<assign_list>(assign_list.class, this, HIPIEPackage.ENUM_DECL__ASSIGNS);
    }
    return assigns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<input_options> getInput_ops()
  {
    if (input_ops == null)
    {
      input_ops = new EObjectContainmentEList<input_options>(input_options.class, this, HIPIEPackage.ENUM_DECL__INPUT_OPS);
    }
    return input_ops;
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
      case HIPIEPackage.ENUM_DECL__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        return ((InternalEList<?>)getAssigns()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.ENUM_DECL__INPUT_OPS:
        return ((InternalEList<?>)getInput_ops()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.ENUM_DECL__VALS:
        return getVals();
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        return getAssigns();
      case HIPIEPackage.ENUM_DECL__INPUT_OPS:
        return getInput_ops();
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
      case HIPIEPackage.ENUM_DECL__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends value_list>)newValue);
        return;
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        getAssigns().clear();
        getAssigns().addAll((Collection<? extends assign_list>)newValue);
        return;
      case HIPIEPackage.ENUM_DECL__INPUT_OPS:
        getInput_ops().clear();
        getInput_ops().addAll((Collection<? extends input_options>)newValue);
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
      case HIPIEPackage.ENUM_DECL__VALS:
        getVals().clear();
        return;
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        getAssigns().clear();
        return;
      case HIPIEPackage.ENUM_DECL__INPUT_OPS:
        getInput_ops().clear();
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
      case HIPIEPackage.ENUM_DECL__VALS:
        return vals != null && !vals.isEmpty();
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        return assigns != null && !assigns.isEmpty();
      case HIPIEPackage.ENUM_DECL__INPUT_OPS:
        return input_ops != null && !input_ops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //enum_declImpl
