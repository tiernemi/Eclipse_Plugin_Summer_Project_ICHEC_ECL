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

import org.xtext.hipie.hIPIE.Bool;
import org.xtext.hipie.hIPIE.FieldDecl;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputOptions;
import org.xtext.hipie.hIPIE.InputValue;
import org.xtext.hipie.hIPIE.OutfieldDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.BoolImpl#getInput_op_list <em>Input op list</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.BoolImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.BoolImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoolImpl extends DatatypeImpl implements Bool
{
  /**
   * The cached value of the '{@link #getInput_op_list() <em>Input op list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput_op_list()
   * @generated
   * @ordered
   */
  protected InputOptions input_op_list;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<FieldDecl> fields;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoolImpl()
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
    return HIPIEPackage.Literals.BOOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputOptions getInput_op_list()
  {
    return input_op_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput_op_list(InputOptions newInput_op_list, NotificationChain msgs)
  {
    InputOptions oldInput_op_list = input_op_list;
    input_op_list = newInput_op_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.BOOL__INPUT_OP_LIST, oldInput_op_list, newInput_op_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput_op_list(InputOptions newInput_op_list)
  {
    if (newInput_op_list != input_op_list)
    {
      NotificationChain msgs = null;
      if (input_op_list != null)
        msgs = ((InternalEObject)input_op_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.BOOL__INPUT_OP_LIST, null, msgs);
      if (newInput_op_list != null)
        msgs = ((InternalEObject)newInput_op_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.BOOL__INPUT_OP_LIST, null, msgs);
      msgs = basicSetInput_op_list(newInput_op_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.BOOL__INPUT_OP_LIST, newInput_op_list, newInput_op_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldDecl> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<FieldDecl>(FieldDecl.class, this, HIPIEPackage.BOOL__FIELDS);
    }
    return fields;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.BOOL__NAME, oldName, name));
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
      case HIPIEPackage.BOOL__INPUT_OP_LIST:
        return basicSetInput_op_list(null, msgs);
      case HIPIEPackage.BOOL__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.BOOL__INPUT_OP_LIST:
        return getInput_op_list();
      case HIPIEPackage.BOOL__FIELDS:
        return getFields();
      case HIPIEPackage.BOOL__NAME:
        return getName();
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
      case HIPIEPackage.BOOL__INPUT_OP_LIST:
        setInput_op_list((InputOptions)newValue);
        return;
      case HIPIEPackage.BOOL__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends FieldDecl>)newValue);
        return;
      case HIPIEPackage.BOOL__NAME:
        setName((String)newValue);
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
      case HIPIEPackage.BOOL__INPUT_OP_LIST:
        setInput_op_list((InputOptions)null);
        return;
      case HIPIEPackage.BOOL__FIELDS:
        getFields().clear();
        return;
      case HIPIEPackage.BOOL__NAME:
        setName(NAME_EDEFAULT);
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
      case HIPIEPackage.BOOL__INPUT_OP_LIST:
        return input_op_list != null;
      case HIPIEPackage.BOOL__FIELDS:
        return fields != null && !fields.isEmpty();
      case HIPIEPackage.BOOL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    if (baseClass == InputValue.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.BOOL__INPUT_OP_LIST: return HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST;
        default: return -1;
      }
    }
    if (baseClass == OutfieldDecl.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.BOOL__FIELDS: return HIPIEPackage.OUTFIELD_DECL__FIELDS;
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
    if (baseClass == InputValue.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST: return HIPIEPackage.BOOL__INPUT_OP_LIST;
        default: return -1;
      }
    }
    if (baseClass == OutfieldDecl.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.OUTFIELD_DECL__FIELDS: return HIPIEPackage.BOOL__FIELDS;
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

} //BoolImpl
