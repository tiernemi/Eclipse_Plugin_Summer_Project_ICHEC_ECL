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
import org.xtext.hipie.hIPIE.assign;
import org.xtext.hipie.hIPIE.assign_list;
import org.xtext.hipie.hIPIE.custom_value;
import org.xtext.hipie.hIPIE.function;
import org.xtext.hipie.hIPIE.out_type;
import org.xtext.hipie.hIPIE.output_options;
import org.xtext.hipie.hIPIE.output_value;
import org.xtext.hipie.hIPIE.resource_options;
import org.xtext.hipie.hIPIE.resource_value;
import org.xtext.hipie.hIPIE.value;
import org.xtext.hipie.hIPIE.value_list;
import org.xtext.hipie.hIPIE.vis_basis_qualifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getAssign_internal <em>Assign internal</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.valueImpl#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class valueImpl extends value_listImpl implements value
{
  /**
   * The cached value of the '{@link #getAssign_internal() <em>Assign internal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign_internal()
   * @generated
   * @ordered
   */
  protected EList<assign> assign_internal;

  /**
   * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected EList<output_options> ops;

  /**
   * The cached value of the '{@link #getFuncs() <em>Funcs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncs()
   * @generated
   * @ordered
   */
  protected EList<function> funcs;

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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final int TYPE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected int type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getRes_ops() <em>Res ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes_ops()
   * @generated
   * @ordered
   */
  protected EList<resource_options> res_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected valueImpl()
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
    return HIPIEPackage.Literals.VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<assign> getAssign_internal()
  {
    if (assign_internal == null)
    {
      assign_internal = new EObjectContainmentEList<assign>(assign.class, this, HIPIEPackage.VALUE__ASSIGN_INTERNAL);
    }
    return assign_internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<output_options> getOps()
  {
    if (ops == null)
    {
      ops = new EObjectContainmentEList<output_options>(output_options.class, this, HIPIEPackage.VALUE__OPS);
    }
    return ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<function> getFuncs()
  {
    if (funcs == null)
    {
      funcs = new EObjectContainmentEList<function>(function.class, this, HIPIEPackage.VALUE__FUNCS);
    }
    return funcs;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VALUE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(int newType)
  {
    int oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VALUE__TYPE, oldType, type));
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
      vals = new EObjectContainmentEList<value_list>(value_list.class, this, HIPIEPackage.VALUE__VALS);
    }
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<resource_options> getRes_ops()
  {
    if (res_ops == null)
    {
      res_ops = new EObjectContainmentEList<resource_options>(resource_options.class, this, HIPIEPackage.VALUE__RES_OPS);
    }
    return res_ops;
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
      case HIPIEPackage.VALUE__ASSIGN_INTERNAL:
        return ((InternalEList<?>)getAssign_internal()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VALUE__OPS:
        return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VALUE__FUNCS:
        return ((InternalEList<?>)getFuncs()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VALUE__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VALUE__RES_OPS:
        return ((InternalEList<?>)getRes_ops()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VALUE__ASSIGN_INTERNAL:
        return getAssign_internal();
      case HIPIEPackage.VALUE__OPS:
        return getOps();
      case HIPIEPackage.VALUE__FUNCS:
        return getFuncs();
      case HIPIEPackage.VALUE__NAME:
        return getName();
      case HIPIEPackage.VALUE__TYPE:
        return getType();
      case HIPIEPackage.VALUE__VALS:
        return getVals();
      case HIPIEPackage.VALUE__RES_OPS:
        return getRes_ops();
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
      case HIPIEPackage.VALUE__ASSIGN_INTERNAL:
        getAssign_internal().clear();
        getAssign_internal().addAll((Collection<? extends assign>)newValue);
        return;
      case HIPIEPackage.VALUE__OPS:
        getOps().clear();
        getOps().addAll((Collection<? extends output_options>)newValue);
        return;
      case HIPIEPackage.VALUE__FUNCS:
        getFuncs().clear();
        getFuncs().addAll((Collection<? extends function>)newValue);
        return;
      case HIPIEPackage.VALUE__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VALUE__TYPE:
        setType((Integer)newValue);
        return;
      case HIPIEPackage.VALUE__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends value_list>)newValue);
        return;
      case HIPIEPackage.VALUE__RES_OPS:
        getRes_ops().clear();
        getRes_ops().addAll((Collection<? extends resource_options>)newValue);
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
      case HIPIEPackage.VALUE__ASSIGN_INTERNAL:
        getAssign_internal().clear();
        return;
      case HIPIEPackage.VALUE__OPS:
        getOps().clear();
        return;
      case HIPIEPackage.VALUE__FUNCS:
        getFuncs().clear();
        return;
      case HIPIEPackage.VALUE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VALUE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case HIPIEPackage.VALUE__VALS:
        getVals().clear();
        return;
      case HIPIEPackage.VALUE__RES_OPS:
        getRes_ops().clear();
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
      case HIPIEPackage.VALUE__ASSIGN_INTERNAL:
        return assign_internal != null && !assign_internal.isEmpty();
      case HIPIEPackage.VALUE__OPS:
        return ops != null && !ops.isEmpty();
      case HIPIEPackage.VALUE__FUNCS:
        return funcs != null && !funcs.isEmpty();
      case HIPIEPackage.VALUE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VALUE__TYPE:
        return type != TYPE_EDEFAULT;
      case HIPIEPackage.VALUE__VALS:
        return vals != null && !vals.isEmpty();
      case HIPIEPackage.VALUE__RES_OPS:
        return res_ops != null && !res_ops.isEmpty();
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
    if (baseClass == assign_list.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == assign.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.VALUE__ASSIGN_INTERNAL: return HIPIEPackage.ASSIGN__ASSIGN_INTERNAL;
        default: return -1;
      }
    }
    if (baseClass == output_value.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.VALUE__OPS: return HIPIEPackage.OUTPUT_VALUE__OPS;
        default: return -1;
      }
    }
    if (baseClass == out_type.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == vis_basis_qualifiers.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == function.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.VALUE__FUNCS: return HIPIEPackage.FUNCTION__FUNCS;
        case HIPIEPackage.VALUE__NAME: return HIPIEPackage.FUNCTION__NAME;
        default: return -1;
      }
    }
    if (baseClass == custom_value.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == resource_value.class)
    {
      switch (derivedFeatureID)
      {
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
    if (baseClass == assign_list.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == assign.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.ASSIGN__ASSIGN_INTERNAL: return HIPIEPackage.VALUE__ASSIGN_INTERNAL;
        default: return -1;
      }
    }
    if (baseClass == output_value.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.OUTPUT_VALUE__OPS: return HIPIEPackage.VALUE__OPS;
        default: return -1;
      }
    }
    if (baseClass == out_type.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == vis_basis_qualifiers.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == function.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.FUNCTION__FUNCS: return HIPIEPackage.VALUE__FUNCS;
        case HIPIEPackage.FUNCTION__NAME: return HIPIEPackage.VALUE__NAME;
        default: return -1;
      }
    }
    if (baseClass == custom_value.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == resource_value.class)
    {
      switch (baseFeatureID)
      {
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
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //valueImpl
