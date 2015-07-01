/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputOptions;
import org.xtext.hipie.hIPIE.InputValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputValueImpl#getInput_op_list <em>Input op list</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputValueImpl extends MinimalEObjectImpl.Container implements InputValue
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputValueImpl()
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
    return HIPIEPackage.Literals.INPUT_VALUE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST, oldInput_op_list, newInput_op_list);
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
        msgs = ((InternalEObject)input_op_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST, null, msgs);
      if (newInput_op_list != null)
        msgs = ((InternalEObject)newInput_op_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST, null, msgs);
      msgs = basicSetInput_op_list(newInput_op_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST, newInput_op_list, newInput_op_list));
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
      case HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST:
        return basicSetInput_op_list(null, msgs);
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
      case HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST:
        return getInput_op_list();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST:
        setInput_op_list((InputOptions)newValue);
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
      case HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST:
        setInput_op_list((InputOptions)null);
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
      case HIPIEPackage.INPUT_VALUE__INPUT_OP_LIST:
        return input_op_list != null;
    }
    return super.eIsSet(featureID);
  }

} //InputValueImpl
