/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.hipie.hIPIE.AssignList;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.Value;
import org.xtext.hipie.hIPIE.VisualSectionOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Section Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualSectionOptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualSectionOptionImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualSectionOptionImpl#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualSectionOptionImpl extends MinimalEObjectImpl.Container implements VisualSectionOption
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
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected Value vals;

  /**
   * The cached value of the '{@link #getAssigns() <em>Assigns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns()
   * @generated
   * @ordered
   */
  protected AssignList assigns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisualSectionOptionImpl()
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
    return HIPIEPackage.Literals.VISUAL_SECTION_OPTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION_OPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVals()
  {
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVals(Value newVals, NotificationChain msgs)
  {
    Value oldVals = vals;
    vals = newVals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION_OPTION__VALS, oldVals, newVals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVals(Value newVals)
  {
    if (newVals != vals)
    {
      NotificationChain msgs = null;
      if (vals != null)
        msgs = ((InternalEObject)vals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_SECTION_OPTION__VALS, null, msgs);
      if (newVals != null)
        msgs = ((InternalEObject)newVals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_SECTION_OPTION__VALS, null, msgs);
      msgs = basicSetVals(newVals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION_OPTION__VALS, newVals, newVals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignList getAssigns()
  {
    return assigns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssigns(AssignList newAssigns, NotificationChain msgs)
  {
    AssignList oldAssigns = assigns;
    assigns = newAssigns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS, oldAssigns, newAssigns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssigns(AssignList newAssigns)
  {
    if (newAssigns != assigns)
    {
      NotificationChain msgs = null;
      if (assigns != null)
        msgs = ((InternalEObject)assigns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS, null, msgs);
      if (newAssigns != null)
        msgs = ((InternalEObject)newAssigns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS, null, msgs);
      msgs = basicSetAssigns(newAssigns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS, newAssigns, newAssigns));
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
      case HIPIEPackage.VISUAL_SECTION_OPTION__VALS:
        return basicSetVals(null, msgs);
      case HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS:
        return basicSetAssigns(null, msgs);
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
      case HIPIEPackage.VISUAL_SECTION_OPTION__NAME:
        return getName();
      case HIPIEPackage.VISUAL_SECTION_OPTION__VALS:
        return getVals();
      case HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS:
        return getAssigns();
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
      case HIPIEPackage.VISUAL_SECTION_OPTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VISUAL_SECTION_OPTION__VALS:
        setVals((Value)newValue);
        return;
      case HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS:
        setAssigns((AssignList)newValue);
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
      case HIPIEPackage.VISUAL_SECTION_OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VISUAL_SECTION_OPTION__VALS:
        setVals((Value)null);
        return;
      case HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS:
        setAssigns((AssignList)null);
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
      case HIPIEPackage.VISUAL_SECTION_OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VISUAL_SECTION_OPTION__VALS:
        return vals != null;
      case HIPIEPackage.VISUAL_SECTION_OPTION__ASSIGNS:
        return assigns != null;
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

} //VisualSectionOptionImpl