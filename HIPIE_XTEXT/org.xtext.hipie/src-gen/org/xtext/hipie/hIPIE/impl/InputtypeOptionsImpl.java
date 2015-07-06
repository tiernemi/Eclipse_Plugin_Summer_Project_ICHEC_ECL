/**
 */
package org.xtext.hipie.hIPIE.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputtypeOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inputtype Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputtypeOptionsImpl#getIn_type_op <em>In type op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputtypeOptionsImpl extends MinimalEObjectImpl.Container implements InputtypeOptions
{
  /**
   * The cached value of the '{@link #getIn_type_op() <em>In type op</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn_type_op()
   * @generated
   * @ordered
   */
  protected EList<String> in_type_op;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputtypeOptionsImpl()
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
    return HIPIEPackage.Literals.INPUTTYPE_OPTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIn_type_op()
  {
    if (in_type_op == null)
    {
      in_type_op = new EDataTypeEList<String>(String.class, this, HIPIEPackage.INPUTTYPE_OPTIONS__IN_TYPE_OP);
    }
    return in_type_op;
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
      case HIPIEPackage.INPUTTYPE_OPTIONS__IN_TYPE_OP:
        return getIn_type_op();
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
      case HIPIEPackage.INPUTTYPE_OPTIONS__IN_TYPE_OP:
        getIn_type_op().clear();
        getIn_type_op().addAll((Collection<? extends String>)newValue);
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
      case HIPIEPackage.INPUTTYPE_OPTIONS__IN_TYPE_OP:
        getIn_type_op().clear();
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
      case HIPIEPackage.INPUTTYPE_OPTIONS__IN_TYPE_OP:
        return in_type_op != null && !in_type_op.isEmpty();
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
    result.append(" (in_type_op: ");
    result.append(in_type_op);
    result.append(')');
    return result.toString();
  }

} //InputtypeOptionsImpl
