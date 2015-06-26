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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.vis_basis;
import org.xtext.hipie.hIPIE.visual_options;
import org.xtext.hipie.hIPIE.visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.visualizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.visualizationImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.visualizationImpl#getVis_ops <em>Vis ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class visualizationImpl extends MinimalEObjectImpl.Container implements visualization
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
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<vis_basis> inputs;

  /**
   * The cached value of the '{@link #getVis_ops() <em>Vis ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_ops()
   * @generated
   * @ordered
   */
  protected EList<visual_options> vis_ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected visualizationImpl()
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
    return HIPIEPackage.Literals.VISUALIZATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUALIZATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<vis_basis> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<vis_basis>(vis_basis.class, this, HIPIEPackage.VISUALIZATION__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<visual_options> getVis_ops()
  {
    if (vis_ops == null)
    {
      vis_ops = new EObjectContainmentEList<visual_options>(visual_options.class, this, HIPIEPackage.VISUALIZATION__VIS_OPS);
    }
    return vis_ops;
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
      case HIPIEPackage.VISUALIZATION__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VISUALIZATION__VIS_OPS:
        return ((InternalEList<?>)getVis_ops()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VISUALIZATION__NAME:
        return getName();
      case HIPIEPackage.VISUALIZATION__INPUTS:
        return getInputs();
      case HIPIEPackage.VISUALIZATION__VIS_OPS:
        return getVis_ops();
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
      case HIPIEPackage.VISUALIZATION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VISUALIZATION__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends vis_basis>)newValue);
        return;
      case HIPIEPackage.VISUALIZATION__VIS_OPS:
        getVis_ops().clear();
        getVis_ops().addAll((Collection<? extends visual_options>)newValue);
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
      case HIPIEPackage.VISUALIZATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VISUALIZATION__INPUTS:
        getInputs().clear();
        return;
      case HIPIEPackage.VISUALIZATION__VIS_OPS:
        getVis_ops().clear();
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
      case HIPIEPackage.VISUALIZATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VISUALIZATION__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case HIPIEPackage.VISUALIZATION__VIS_OPS:
        return vis_ops != null && !vis_ops.isEmpty();
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

} //visualizationImpl
