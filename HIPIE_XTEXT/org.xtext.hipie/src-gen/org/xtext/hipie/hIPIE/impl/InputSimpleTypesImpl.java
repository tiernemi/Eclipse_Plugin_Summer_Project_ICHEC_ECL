/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputOptions;
import org.xtext.hipie.hIPIE.InputSimpleTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Simple Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputSimpleTypesImpl#getInput_op_list <em>Input op list</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputSimpleTypesImpl#getIn_ops <em>In ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputSimpleTypesImpl extends DatatypeImpl implements InputSimpleTypes
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
   * The cached value of the '{@link #getIn_ops() <em>In ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn_ops()
   * @generated
   * @ordered
   */
  protected InputOptions in_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputSimpleTypesImpl()
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
    return HIPIEPackage.Literals.INPUT_SIMPLE_TYPES;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST, oldInput_op_list, newInput_op_list);
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
        msgs = ((InternalEObject)input_op_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST, null, msgs);
      if (newInput_op_list != null)
        msgs = ((InternalEObject)newInput_op_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST, null, msgs);
      msgs = basicSetInput_op_list(newInput_op_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST, newInput_op_list, newInput_op_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputOptions getIn_ops()
  {
    return in_ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIn_ops(InputOptions newIn_ops, NotificationChain msgs)
  {
    InputOptions oldIn_ops = in_ops;
    in_ops = newIn_ops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS, oldIn_ops, newIn_ops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn_ops(InputOptions newIn_ops)
  {
    if (newIn_ops != in_ops)
    {
      NotificationChain msgs = null;
      if (in_ops != null)
        msgs = ((InternalEObject)in_ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS, null, msgs);
      if (newIn_ops != null)
        msgs = ((InternalEObject)newIn_ops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS, null, msgs);
      msgs = basicSetIn_ops(newIn_ops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS, newIn_ops, newIn_ops));
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
      case HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST:
        return basicSetInput_op_list(null, msgs);
      case HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS:
        return basicSetIn_ops(null, msgs);
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
      case HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST:
        return getInput_op_list();
      case HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS:
        return getIn_ops();
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
      case HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST:
        setInput_op_list((InputOptions)newValue);
        return;
      case HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS:
        setIn_ops((InputOptions)newValue);
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
      case HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST:
        setInput_op_list((InputOptions)null);
        return;
      case HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS:
        setIn_ops((InputOptions)null);
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
      case HIPIEPackage.INPUT_SIMPLE_TYPES__INPUT_OP_LIST:
        return input_op_list != null;
      case HIPIEPackage.INPUT_SIMPLE_TYPES__IN_OPS:
        return in_ops != null;
    }
    return super.eIsSet(featureID);
  }

} //InputSimpleTypesImpl
