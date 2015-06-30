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
import org.xtext.hipie.hIPIE.function;
import org.xtext.hipie.hIPIE.visual_option;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>visual option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.visual_optionImpl#getVis_ops <em>Vis ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.visual_optionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.visual_optionImpl#getFuncs <em>Funcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class visual_optionImpl extends visual_optionsImpl implements visual_option
{
  /**
   * The cached value of the '{@link #getVis_ops() <em>Vis ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_ops()
   * @generated
   * @ordered
   */
  protected EList<visual_option> vis_ops;

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
   * The cached value of the '{@link #getFuncs() <em>Funcs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncs()
   * @generated
   * @ordered
   */
  protected EList<function> funcs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected visual_optionImpl()
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
    return HIPIEPackage.Literals.VISUAL_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<visual_option> getVis_ops()
  {
    if (vis_ops == null)
    {
      vis_ops = new EObjectContainmentEList<visual_option>(visual_option.class, this, HIPIEPackage.VISUAL_OPTION__VIS_OPS);
    }
    return vis_ops;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__NAME, oldName, name));
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
      funcs = new EObjectContainmentEList<function>(function.class, this, HIPIEPackage.VISUAL_OPTION__FUNCS);
    }
    return funcs;
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
      case HIPIEPackage.VISUAL_OPTION__VIS_OPS:
        return ((InternalEList<?>)getVis_ops()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return ((InternalEList<?>)getFuncs()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VISUAL_OPTION__VIS_OPS:
        return getVis_ops();
      case HIPIEPackage.VISUAL_OPTION__NAME:
        return getName();
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return getFuncs();
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
      case HIPIEPackage.VISUAL_OPTION__VIS_OPS:
        getVis_ops().clear();
        getVis_ops().addAll((Collection<? extends visual_option>)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        getFuncs().clear();
        getFuncs().addAll((Collection<? extends function>)newValue);
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
      case HIPIEPackage.VISUAL_OPTION__VIS_OPS:
        getVis_ops().clear();
        return;
      case HIPIEPackage.VISUAL_OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        getFuncs().clear();
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
      case HIPIEPackage.VISUAL_OPTION__VIS_OPS:
        return vis_ops != null && !vis_ops.isEmpty();
      case HIPIEPackage.VISUAL_OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return funcs != null && !funcs.isEmpty();
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

} //visual_optionImpl
