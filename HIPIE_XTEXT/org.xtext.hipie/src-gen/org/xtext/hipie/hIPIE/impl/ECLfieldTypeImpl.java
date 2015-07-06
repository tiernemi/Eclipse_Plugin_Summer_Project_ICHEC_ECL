/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.hipie.hIPIE.ECLfieldType;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputOptions;
import org.xtext.hipie.hIPIE.OutputOptions;
import org.xtext.hipie.hIPIE.PosVizData;
import org.xtext.hipie.hIPIE.ServiceInputValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EC Lfield Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl#getIn_ops <em>In ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECLfieldTypeImpl extends ECLOutputDeclImpl implements ECLfieldType
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
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected OutputOptions options;

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
  protected ECLfieldTypeImpl()
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
    return HIPIEPackage.Literals.EC_LFIELD_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.EC_LFIELD_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputOptions getOptions()
  {
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptions(OutputOptions newOptions, NotificationChain msgs)
  {
    OutputOptions oldOptions = options;
    options = newOptions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.EC_LFIELD_TYPE__OPTIONS, oldOptions, newOptions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptions(OutputOptions newOptions)
  {
    if (newOptions != options)
    {
      NotificationChain msgs = null;
      if (options != null)
        msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.EC_LFIELD_TYPE__OPTIONS, null, msgs);
      if (newOptions != null)
        msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.EC_LFIELD_TYPE__OPTIONS, null, msgs);
      msgs = basicSetOptions(newOptions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.EC_LFIELD_TYPE__OPTIONS, newOptions, newOptions));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.EC_LFIELD_TYPE__IN_OPS, oldIn_ops, newIn_ops);
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
        msgs = ((InternalEObject)in_ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.EC_LFIELD_TYPE__IN_OPS, null, msgs);
      if (newIn_ops != null)
        msgs = ((InternalEObject)newIn_ops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.EC_LFIELD_TYPE__IN_OPS, null, msgs);
      msgs = basicSetIn_ops(newIn_ops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.EC_LFIELD_TYPE__IN_OPS, newIn_ops, newIn_ops));
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
      case HIPIEPackage.EC_LFIELD_TYPE__OPTIONS:
        return basicSetOptions(null, msgs);
      case HIPIEPackage.EC_LFIELD_TYPE__IN_OPS:
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
      case HIPIEPackage.EC_LFIELD_TYPE__NAME:
        return getName();
      case HIPIEPackage.EC_LFIELD_TYPE__OPTIONS:
        return getOptions();
      case HIPIEPackage.EC_LFIELD_TYPE__IN_OPS:
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
      case HIPIEPackage.EC_LFIELD_TYPE__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.EC_LFIELD_TYPE__OPTIONS:
        setOptions((OutputOptions)newValue);
        return;
      case HIPIEPackage.EC_LFIELD_TYPE__IN_OPS:
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
      case HIPIEPackage.EC_LFIELD_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.EC_LFIELD_TYPE__OPTIONS:
        setOptions((OutputOptions)null);
        return;
      case HIPIEPackage.EC_LFIELD_TYPE__IN_OPS:
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
      case HIPIEPackage.EC_LFIELD_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.EC_LFIELD_TYPE__OPTIONS:
        return options != null;
      case HIPIEPackage.EC_LFIELD_TYPE__IN_OPS:
        return in_ops != null;
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
    if (baseClass == ServiceInputValue.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PosVizData.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.EC_LFIELD_TYPE__NAME: return HIPIEPackage.POS_VIZ_DATA__NAME;
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
    if (baseClass == ServiceInputValue.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PosVizData.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.POS_VIZ_DATA__NAME: return HIPIEPackage.EC_LFIELD_TYPE__NAME;
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

} //ECLfieldTypeImpl
