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
import org.xtext.hipie.hIPIE.VisualSectionOptions;
import org.xtext.hipie.hIPIE.Visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualSectionImpl#getSection_name <em>Section name</em>}</li>
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
   * The default value of the '{@link #getSection_name() <em>Section name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection_name()
   * @generated
   * @ordered
   */
  protected static final String SECTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSection_name() <em>Section name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection_name()
   * @generated
   * @ordered
   */
  protected String section_name = SECTION_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getVis_ops() <em>Vis ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_ops()
   * @generated
   * @ordered
   */
  protected VisualSectionOptions vis_ops;

  /**
   * The cached value of the '{@link #getVis_elements() <em>Vis elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_elements()
   * @generated
   * @ordered
   */
  protected EList<Visualization> vis_elements;

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
  public String getSection_name()
  {
    return section_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSection_name(String newSection_name)
  {
    String oldSection_name = section_name;
    section_name = newSection_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION__SECTION_NAME, oldSection_name, section_name));
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
  public VisualSectionOptions getVis_ops()
  {
    return vis_ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVis_ops(VisualSectionOptions newVis_ops, NotificationChain msgs)
  {
    VisualSectionOptions oldVis_ops = vis_ops;
    vis_ops = newVis_ops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION__VIS_OPS, oldVis_ops, newVis_ops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVis_ops(VisualSectionOptions newVis_ops)
  {
    if (newVis_ops != vis_ops)
    {
      NotificationChain msgs = null;
      if (vis_ops != null)
        msgs = ((InternalEObject)vis_ops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_SECTION__VIS_OPS, null, msgs);
      if (newVis_ops != null)
        msgs = ((InternalEObject)newVis_ops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_SECTION__VIS_OPS, null, msgs);
      msgs = basicSetVis_ops(newVis_ops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION__VIS_OPS, newVis_ops, newVis_ops));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Visualization> getVis_elements()
  {
    if (vis_elements == null)
    {
      vis_elements = new EObjectContainmentEList<Visualization>(Visualization.class, this, HIPIEPackage.VISUAL_SECTION__VIS_ELEMENTS);
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
        return basicSetVis_ops(null, msgs);
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
      case HIPIEPackage.VISUAL_SECTION__SECTION_NAME:
        return getSection_name();
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
      case HIPIEPackage.VISUAL_SECTION__SECTION_NAME:
        setSection_name((String)newValue);
        return;
      case HIPIEPackage.VISUAL_SECTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VISUAL_SECTION__VIS_OPS:
        setVis_ops((VisualSectionOptions)newValue);
        return;
      case HIPIEPackage.VISUAL_SECTION__VIS_ELEMENTS:
        getVis_elements().clear();
        getVis_elements().addAll((Collection<? extends Visualization>)newValue);
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
      case HIPIEPackage.VISUAL_SECTION__SECTION_NAME:
        setSection_name(SECTION_NAME_EDEFAULT);
        return;
      case HIPIEPackage.VISUAL_SECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VISUAL_SECTION__VIS_OPS:
        setVis_ops((VisualSectionOptions)null);
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
      case HIPIEPackage.VISUAL_SECTION__SECTION_NAME:
        return SECTION_NAME_EDEFAULT == null ? section_name != null : !SECTION_NAME_EDEFAULT.equals(section_name);
      case HIPIEPackage.VISUAL_SECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VISUAL_SECTION__VIS_OPS:
        return vis_ops != null;
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
    result.append(" (section_name: ");
    result.append(section_name);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VisualSectionImpl
