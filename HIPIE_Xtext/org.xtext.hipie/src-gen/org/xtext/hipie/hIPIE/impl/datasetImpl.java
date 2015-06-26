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
import org.xtext.hipie.hIPIE.dataset;
import org.xtext.hipie.hIPIE.ecloutput_decl;
import org.xtext.hipie.hIPIE.field_decl;
import org.xtext.hipie.hIPIE.input_options;
import org.xtext.hipie.hIPIE.input_value;
import org.xtext.hipie.hIPIE.output_options;
import org.xtext.hipie.hIPIE.output_value;
import org.xtext.hipie.hIPIE.outputbase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.datasetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.datasetImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.datasetImpl#getInput_ops <em>Input ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.datasetImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.datasetImpl#getOut_base <em>Out base</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.datasetImpl#getEcl_vars <em>Ecl vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.datasetImpl#getOp_base <em>Op base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class datasetImpl extends datatypeImpl implements dataset
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
   * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected EList<output_options> ops;

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
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<field_decl> fields;

  /**
   * The cached value of the '{@link #getOut_base() <em>Out base</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut_base()
   * @generated
   * @ordered
   */
  protected EList<outputbase> out_base;

  /**
   * The cached value of the '{@link #getEcl_vars() <em>Ecl vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcl_vars()
   * @generated
   * @ordered
   */
  protected EList<ecloutput_decl> ecl_vars;

  /**
   * The cached value of the '{@link #getOp_base() <em>Op base</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp_base()
   * @generated
   * @ordered
   */
  protected EList<outputbase> op_base;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected datasetImpl()
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
    return HIPIEPackage.Literals.DATASET;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.DATASET__NAME, oldName, name));
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
      ops = new EObjectContainmentEList<output_options>(output_options.class, this, HIPIEPackage.DATASET__OPS);
    }
    return ops;
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
      input_ops = new EObjectContainmentEList<input_options>(input_options.class, this, HIPIEPackage.DATASET__INPUT_OPS);
    }
    return input_ops;
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
      fields = new EObjectContainmentEList<field_decl>(field_decl.class, this, HIPIEPackage.DATASET__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<outputbase> getOut_base()
  {
    if (out_base == null)
    {
      out_base = new EObjectContainmentEList<outputbase>(outputbase.class, this, HIPIEPackage.DATASET__OUT_BASE);
    }
    return out_base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ecloutput_decl> getEcl_vars()
  {
    if (ecl_vars == null)
    {
      ecl_vars = new EObjectContainmentEList<ecloutput_decl>(ecloutput_decl.class, this, HIPIEPackage.DATASET__ECL_VARS);
    }
    return ecl_vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<outputbase> getOp_base()
  {
    if (op_base == null)
    {
      op_base = new EObjectContainmentEList<outputbase>(outputbase.class, this, HIPIEPackage.DATASET__OP_BASE);
    }
    return op_base;
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
      case HIPIEPackage.DATASET__OPS:
        return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.DATASET__INPUT_OPS:
        return ((InternalEList<?>)getInput_ops()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.DATASET__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.DATASET__OUT_BASE:
        return ((InternalEList<?>)getOut_base()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.DATASET__ECL_VARS:
        return ((InternalEList<?>)getEcl_vars()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.DATASET__OP_BASE:
        return ((InternalEList<?>)getOp_base()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.DATASET__NAME:
        return getName();
      case HIPIEPackage.DATASET__OPS:
        return getOps();
      case HIPIEPackage.DATASET__INPUT_OPS:
        return getInput_ops();
      case HIPIEPackage.DATASET__FIELDS:
        return getFields();
      case HIPIEPackage.DATASET__OUT_BASE:
        return getOut_base();
      case HIPIEPackage.DATASET__ECL_VARS:
        return getEcl_vars();
      case HIPIEPackage.DATASET__OP_BASE:
        return getOp_base();
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
      case HIPIEPackage.DATASET__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.DATASET__OPS:
        getOps().clear();
        getOps().addAll((Collection<? extends output_options>)newValue);
        return;
      case HIPIEPackage.DATASET__INPUT_OPS:
        getInput_ops().clear();
        getInput_ops().addAll((Collection<? extends input_options>)newValue);
        return;
      case HIPIEPackage.DATASET__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends field_decl>)newValue);
        return;
      case HIPIEPackage.DATASET__OUT_BASE:
        getOut_base().clear();
        getOut_base().addAll((Collection<? extends outputbase>)newValue);
        return;
      case HIPIEPackage.DATASET__ECL_VARS:
        getEcl_vars().clear();
        getEcl_vars().addAll((Collection<? extends ecloutput_decl>)newValue);
        return;
      case HIPIEPackage.DATASET__OP_BASE:
        getOp_base().clear();
        getOp_base().addAll((Collection<? extends outputbase>)newValue);
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
      case HIPIEPackage.DATASET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.DATASET__OPS:
        getOps().clear();
        return;
      case HIPIEPackage.DATASET__INPUT_OPS:
        getInput_ops().clear();
        return;
      case HIPIEPackage.DATASET__FIELDS:
        getFields().clear();
        return;
      case HIPIEPackage.DATASET__OUT_BASE:
        getOut_base().clear();
        return;
      case HIPIEPackage.DATASET__ECL_VARS:
        getEcl_vars().clear();
        return;
      case HIPIEPackage.DATASET__OP_BASE:
        getOp_base().clear();
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
      case HIPIEPackage.DATASET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.DATASET__OPS:
        return ops != null && !ops.isEmpty();
      case HIPIEPackage.DATASET__INPUT_OPS:
        return input_ops != null && !input_ops.isEmpty();
      case HIPIEPackage.DATASET__FIELDS:
        return fields != null && !fields.isEmpty();
      case HIPIEPackage.DATASET__OUT_BASE:
        return out_base != null && !out_base.isEmpty();
      case HIPIEPackage.DATASET__ECL_VARS:
        return ecl_vars != null && !ecl_vars.isEmpty();
      case HIPIEPackage.DATASET__OP_BASE:
        return op_base != null && !op_base.isEmpty();
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
        case HIPIEPackage.DATASET__NAME: return HIPIEPackage.INPUT_VALUE__NAME;
        default: return -1;
      }
    }
    if (baseClass == output_value.class)
    {
      switch (derivedFeatureID)
      {
        case HIPIEPackage.DATASET__OPS: return HIPIEPackage.OUTPUT_VALUE__OPS;
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
        case HIPIEPackage.INPUT_VALUE__NAME: return HIPIEPackage.DATASET__NAME;
        default: return -1;
      }
    }
    if (baseClass == output_value.class)
    {
      switch (baseFeatureID)
      {
        case HIPIEPackage.OUTPUT_VALUE__OPS: return HIPIEPackage.DATASET__OPS;
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

} //datasetImpl
