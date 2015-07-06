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
import org.xtext.hipie.hIPIE.KelAttrDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kel Attr Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.KelAttrDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.KelAttrDeclImpl#getInput_ops <em>Input ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KelAttrDeclImpl extends MinimalEObjectImpl.Container implements KelAttrDecl
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
  protected KelAttrDeclImpl()
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
    return HIPIEPackage.Literals.KEL_ATTR_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.KEL_ATTR_DECL__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS, oldInput_ops, newInput_ops);
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
        msgs = ((InternalEObject)input_ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS, null, msgs);
      if (newInput_ops != null)
        msgs = ((InternalEObject)newInput_ops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS, null, msgs);
      msgs = basicSetInput_ops(newInput_ops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS, newInput_ops, newInput_ops));
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
      case HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS:
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
      case HIPIEPackage.KEL_ATTR_DECL__NAME:
        return getName();
      case HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS:
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
      case HIPIEPackage.KEL_ATTR_DECL__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS:
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
      case HIPIEPackage.KEL_ATTR_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS:
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
      case HIPIEPackage.KEL_ATTR_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.KEL_ATTR_DECL__INPUT_OPS:
        return input_ops != null;
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

} //KelAttrDeclImpl
