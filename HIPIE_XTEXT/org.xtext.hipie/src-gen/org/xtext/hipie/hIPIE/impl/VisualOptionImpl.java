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

import org.xtext.hipie.hIPIE.Function;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.VisualMultival;
import org.xtext.hipie.hIPIE.VisualOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getVis_mult <em>Vis mult</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualOptionImpl extends MinimalEObjectImpl.Container implements VisualOption
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
   * The cached value of the '{@link #getFuncs() <em>Funcs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncs()
   * @generated
   * @ordered
   */
  protected EList<Function> funcs;

  /**
   * The cached value of the '{@link #getVis_mult() <em>Vis mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_mult()
   * @generated
   * @ordered
   */
  protected VisualMultival vis_mult;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisualOptionImpl()
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
  public EList<Function> getFuncs()
  {
    if (funcs == null)
    {
      funcs = new EObjectContainmentEList<Function>(Function.class, this, HIPIEPackage.VISUAL_OPTION__FUNCS);
    }
    return funcs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualMultival getVis_mult()
  {
    return vis_mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVis_mult(VisualMultival newVis_mult, NotificationChain msgs)
  {
    VisualMultival oldVis_mult = vis_mult;
    vis_mult = newVis_mult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__VIS_MULT, oldVis_mult, newVis_mult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVis_mult(VisualMultival newVis_mult)
  {
    if (newVis_mult != vis_mult)
    {
      NotificationChain msgs = null;
      if (vis_mult != null)
        msgs = ((InternalEObject)vis_mult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_OPTION__VIS_MULT, null, msgs);
      if (newVis_mult != null)
        msgs = ((InternalEObject)newVis_mult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_OPTION__VIS_MULT, null, msgs);
      msgs = basicSetVis_mult(newVis_mult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__VIS_MULT, newVis_mult, newVis_mult));
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
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return ((InternalEList<?>)getFuncs()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VISUAL_OPTION__VIS_MULT:
        return basicSetVis_mult(null, msgs);
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
      case HIPIEPackage.VISUAL_OPTION__NAME:
        return getName();
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return getFuncs();
      case HIPIEPackage.VISUAL_OPTION__VIS_MULT:
        return getVis_mult();
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
      case HIPIEPackage.VISUAL_OPTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        getFuncs().clear();
        getFuncs().addAll((Collection<? extends Function>)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__VIS_MULT:
        setVis_mult((VisualMultival)newValue);
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
      case HIPIEPackage.VISUAL_OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        getFuncs().clear();
        return;
      case HIPIEPackage.VISUAL_OPTION__VIS_MULT:
        setVis_mult((VisualMultival)null);
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
      case HIPIEPackage.VISUAL_OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return funcs != null && !funcs.isEmpty();
      case HIPIEPackage.VISUAL_OPTION__VIS_MULT:
        return vis_mult != null;
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

} //VisualOptionImpl
