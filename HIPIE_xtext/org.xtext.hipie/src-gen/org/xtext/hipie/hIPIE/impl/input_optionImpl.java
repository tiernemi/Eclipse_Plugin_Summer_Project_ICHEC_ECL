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

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.assign_list;
import org.xtext.hipie.hIPIE.input_option;
import org.xtext.hipie.hIPIE.value_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>input option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.input_optionImpl#getInput_internal <em>Input internal</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.input_optionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.input_optionImpl#getAssigns_internal <em>Assigns internal</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.input_optionImpl#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class input_optionImpl extends input_optionsImpl implements input_option
{
  /**
   * The cached value of the '{@link #getInput_internal() <em>Input internal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput_internal()
   * @generated
   * @ordered
   */
  protected EList<input_option> input_internal;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssigns_internal() <em>Assigns internal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns_internal()
   * @generated
   * @ordered
   */
  protected EList<assign_list> assigns_internal;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected input_optionImpl()
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
    return HIPIEPackage.Literals.INPUT_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<input_option> getInput_internal()
  {
    if (input_internal == null)
    {
      input_internal = new EObjectContainmentEList<input_option>(input_option.class, this, HIPIEPackage.INPUT_OPTION__INPUT_INTERNAL);
    }
    return input_internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_OPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<assign_list> getAssigns_internal()
  {
    if (assigns_internal == null)
    {
      assigns_internal = new EObjectContainmentEList<assign_list>(assign_list.class, this, HIPIEPackage.INPUT_OPTION__ASSIGNS_INTERNAL);
    }
    return assigns_internal;
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
      vals = new EObjectContainmentEList<value_list>(value_list.class, this, HIPIEPackage.INPUT_OPTION__VALS);
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
      case HIPIEPackage.INPUT_OPTION__INPUT_INTERNAL:
        return ((InternalEList<?>)getInput_internal()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_INTERNAL:
        return ((InternalEList<?>)getAssigns_internal()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.INPUT_OPTION__VALS:
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
      case HIPIEPackage.INPUT_OPTION__INPUT_INTERNAL:
        return getInput_internal();
      case HIPIEPackage.INPUT_OPTION__NAME:
        return getName();
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_INTERNAL:
        return getAssigns_internal();
      case HIPIEPackage.INPUT_OPTION__VALS:
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
      case HIPIEPackage.INPUT_OPTION__INPUT_INTERNAL:
        getInput_internal().clear();
        getInput_internal().addAll((Collection<? extends input_option>)newValue);
        return;
      case HIPIEPackage.INPUT_OPTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_INTERNAL:
        getAssigns_internal().clear();
        getAssigns_internal().addAll((Collection<? extends assign_list>)newValue);
        return;
      case HIPIEPackage.INPUT_OPTION__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends value_list>)newValue);
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
      case HIPIEPackage.INPUT_OPTION__INPUT_INTERNAL:
        getInput_internal().clear();
        return;
      case HIPIEPackage.INPUT_OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_INTERNAL:
        getAssigns_internal().clear();
        return;
      case HIPIEPackage.INPUT_OPTION__VALS:
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
      case HIPIEPackage.INPUT_OPTION__INPUT_INTERNAL:
        return input_internal != null && !input_internal.isEmpty();
      case HIPIEPackage.INPUT_OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_INTERNAL:
        return assigns_internal != null && !assigns_internal.isEmpty();
      case HIPIEPackage.INPUT_OPTION__VALS:
        return vals != null && !vals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //input_optionImpl
