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
import org.xtext.hipie.hIPIE.field_decl;
import org.xtext.hipie.hIPIE.input_options;
import org.xtext.hipie.hIPIE.input_value;
import org.xtext.hipie.hIPIE.outfield_decl;
import org.xtext.hipie.hIPIE.string_var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>string var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.string_varImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.string_varImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.string_varImpl#getInput_ops <em>Input ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class string_varImpl extends datatypeImpl implements string_var
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
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<field_decl> fields;

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
  protected string_varImpl()
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
    return HIPIEPackage.Literals.STRING_VAR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.STRING_VAR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<field_decl> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<field_decl>(field_decl.class, this, HIPIEPackage.STRING_VAR__FIELDS);
    }
    return fields;
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
      input_ops = new EObjectContainmentEList<input_options>(input_options.class, this, HIPIEPackage.STRING_VAR__INPUT_OPS);
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
      case HIPIEPackage.STRING_VAR__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.STRING_VAR__INPUT_OPS:
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
      case HIPIEPackage.STRING_VAR__NAME:
        return getName();
      case HIPIEPackage.STRING_VAR__FIELDS:
        return getFields();
      case HIPIEPackage.STRING_VAR__INPUT_OPS:
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
      case HIPIEPackage.STRING_VAR__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.STRING_VAR__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends field_decl>)newValue);
        return;
      case HIPIEPackage.STRING_VAR__INPUT_OPS:
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
      case HIPIEPackage.STRING_VAR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.STRING_VAR__FIELDS:
        getFields().clear();
        return;
      case HIPIEPackage.STRING_VAR__INPUT_OPS:
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
      case HIPIEPackage.STRING_VAR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.STRING_VAR__FIELDS:
        return fields != null && !fields.isEmpty();
      case HIPIEPackage.STRING_VAR__INPUT_OPS:
        return input_ops != null && !input_ops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == input_value.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.STRING_VAR__NAME: return HIPIEPackage.INPUT_VALUE__NAME;
        default: return -1;
      }
    }
    if (baseClass == outfield_decl.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.STRING_VAR__FIELDS: return HIPIEPackage.OUTFIELD_DECL__FIELDS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == input_value.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.INPUT_VALUE__NAME: return HIPIEPackage.STRING_VAR__NAME;
        default: return -1;
      }
    }
    if (baseClass == outfield_decl.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.OUTFIELD_DECL__FIELDS: return HIPIEPackage.STRING_VAR__FIELDS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //string_varImpl
