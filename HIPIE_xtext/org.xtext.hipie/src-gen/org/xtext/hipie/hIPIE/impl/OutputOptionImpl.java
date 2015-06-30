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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.OutputOption;
import org.xtext.hipie.hIPIE.datatype;
import org.xtext.hipie.hIPIE.value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutputOptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutputOptionImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutputOptionImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.OutputOptionImpl#getOutput_internal <em>Output internal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputOptionImpl extends OutputOptionsImpl implements OutputOption
{
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
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<datatype> vars;

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
   * The cached value of the '{@link #getOutput_internal() <em>Output internal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput_internal()
   * @generated
   * @ordered
   */
  protected EList<OutputOption> output_internal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputOptionImpl()
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
    return HIPIEPackage.Literals.OUTPUT_OPTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.OUTPUT_OPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<datatype> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<datatype>(datatype.class, this, HIPIEPackage.OUTPUT_OPTION__VARS);
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
      vals = new EObjectContainmentEList<value>(value.class, this, HIPIEPackage.OUTPUT_OPTION__VALS);
    }
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OutputOption> getOutput_internal()
  {
    if (output_internal == null)
    {
      output_internal = new EObjectContainmentEList<OutputOption>(OutputOption.class, this, HIPIEPackage.OUTPUT_OPTION__OUTPUT_INTERNAL);
    }
    return output_internal;
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
      case HIPIEPackage.OUTPUT_OPTION__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.OUTPUT_OPTION__OUTPUT_INTERNAL:
        return ((InternalEList<?>)getOutput_internal()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.OUTPUT_OPTION__NAME:
        return getName();
      case HIPIEPackage.OUTPUT_OPTION__VARS:
        return getVars();
      case HIPIEPackage.OUTPUT_OPTION__VALS:
        return getVals();
      case HIPIEPackage.OUTPUT_OPTION__OUTPUT_INTERNAL:
        return getOutput_internal();
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
      case HIPIEPackage.OUTPUT_OPTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.OUTPUT_OPTION__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends datatype>)newValue);
        return;
      case HIPIEPackage.OUTPUT_OPTION__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends value>)newValue);
        return;
      case HIPIEPackage.OUTPUT_OPTION__OUTPUT_INTERNAL:
        getOutput_internal().clear();
        getOutput_internal().addAll((Collection<? extends OutputOption>)newValue);
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
      case HIPIEPackage.OUTPUT_OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.OUTPUT_OPTION__VARS:
        getVars().clear();
        return;
      case HIPIEPackage.OUTPUT_OPTION__VALS:
        getVals().clear();
        return;
      case HIPIEPackage.OUTPUT_OPTION__OUTPUT_INTERNAL:
        getOutput_internal().clear();
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
      case HIPIEPackage.OUTPUT_OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.OUTPUT_OPTION__VARS:
        return vars != null && !vars.isEmpty();
      case HIPIEPackage.OUTPUT_OPTION__VALS:
        return vals != null && !vals.isEmpty();
      case HIPIEPackage.OUTPUT_OPTION__OUTPUT_INTERNAL:
        return output_internal != null && !output_internal.isEmpty();
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

} //OutputOptionImpl
