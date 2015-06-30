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
import org.xtext.hipie.hIPIE.VisualSection;
import org.xtext.hipie.hIPIE.visual_section_options;
import org.xtext.hipie.hIPIE.visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualSectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualSectionImpl#getVis_ops <em>Vis ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualSectionImpl#getVis_elements <em>Vis elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualSectionImpl extends MinimalEObjectImpl.Container implements VisualSection
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
   * The cached value of the '{@link #getVis_ops() <em>Vis ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_ops()
   * @generated
   * @ordered
   */
  protected EList<visual_section_options> vis_ops;

  /**
   * The cached value of the '{@link #getVis_elements() <em>Vis elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_elements()
   * @generated
   * @ordered
   */
  protected EList<visualization> vis_elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisualSectionImpl()
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
    return HIPIEPackage.Literals.VISUAL_SECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<visual_section_options> getVis_ops()
  {
    if (vis_ops == null)
    {
      vis_ops = new EObjectContainmentEList<visual_section_options>(visual_section_options.class, this, HIPIEPackage.VISUAL_SECTION__VIS_OPS);
    }
    return vis_ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<visualization> getVis_elements()
  {
    if (vis_elements == null)
    {
      vis_elements = new EObjectContainmentEList<visualization>(visualization.class, this, HIPIEPackage.VISUAL_SECTION__VIS_ELEMENTS);
    }
    return vis_elements;
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
      case HIPIEPackage.VISUAL_SECTION__VIS_OPS:
        return ((InternalEList<?>)getVis_ops()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VISUAL_SECTION__VIS_ELEMENTS:
        return ((InternalEList<?>)getVis_elements()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VISUAL_SECTION__NAME:
        return getName();
      case HIPIEPackage.VISUAL_SECTION__VIS_OPS:
        return getVis_ops();
      case HIPIEPackage.VISUAL_SECTION__VIS_ELEMENTS:
        return getVis_elements();
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
      case HIPIEPackage.VISUAL_SECTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VISUAL_SECTION__VIS_OPS:
        getVis_ops().clear();
        getVis_ops().addAll((Collection<? extends visual_section_options>)newValue);
        return;
      case HIPIEPackage.VISUAL_SECTION__VIS_ELEMENTS:
        getVis_elements().clear();
        getVis_elements().addAll((Collection<? extends visualization>)newValue);
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
      case HIPIEPackage.VISUAL_SECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VISUAL_SECTION__VIS_OPS:
        getVis_ops().clear();
        return;
      case HIPIEPackage.VISUAL_SECTION__VIS_ELEMENTS:
        getVis_elements().clear();
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
      case HIPIEPackage.VISUAL_SECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VISUAL_SECTION__VIS_OPS:
        return vis_ops != null && !vis_ops.isEmpty();
      case HIPIEPackage.VISUAL_SECTION__VIS_ELEMENTS:
        return vis_elements != null && !vis_elements.isEmpty();
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

} //VisualSectionImpl
