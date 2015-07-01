/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.hipie.hIPIE.FieldDecl;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.FieldDeclImpl#getInput_ops <em>Input ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldDeclImpl extends PosVizDataImpl implements FieldDecl
{
  /**
   * The cached value of the '{@link #getInput_ops() <em>Input ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput_ops()
   * @generated
   * @ordered
   */
  protected InputOptions input_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldDeclImpl()
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
  public InputOptions getInput_ops()
  {
    return input_ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput_ops(InputOptions newInput_ops, NotificationChain msgs)
  {
    InputOptions oldInput_ops = input_ops;
    input_ops = newInput_ops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.FIELD_DECL__INPUT_OPS, oldInput_ops, newInput_ops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput_ops(InputOptions newInput_ops)
  {
    if (newInput_ops != input_ops)
    {
      NotificationChain msgs = null;
      if (input_ops != null)
        msgs = ((InternalEObject)input_ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.FIELD_DECL__INPUT_OPS, null, msgs);
      if (newInput_ops != null)
        msgs = ((InternalEObject)newInput_ops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.FIELD_DECL__INPUT_OPS, null, msgs);
      msgs = basicSetInput_ops(newInput_ops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.FIELD_DECL__INPUT_OPS, newInput_ops, newInput_ops));
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
      case HIPIEPackage.FIELD_DECL__INPUT_OPS:
        return basicSetInput_ops(null, msgs);
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
      case HIPIEPackage.FIELD_DECL__INPUT_OPS:
        return getInput_ops();
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
      case HIPIEPackage.FIELD_DECL__INPUT_OPS:
        setInput_ops((InputOptions)newValue);
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
      case HIPIEPackage.FIELD_DECL__INPUT_OPS:
        setInput_ops((InputOptions)null);
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
      case HIPIEPackage.FIELD_DECL__INPUT_OPS:
        return input_ops != null;
    }
    return super.eIsSet(featureID);
  }

} //FieldDeclImpl
