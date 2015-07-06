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
import org.xtext.hipie.hIPIE.VizAssignList;
import org.xtext.hipie.hIPIE.VizEnumDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viz Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VizEnumDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VizEnumDeclImpl#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VizEnumDeclImpl extends MinimalEObjectImpl.Container implements VizEnumDecl
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
   * The cached value of the '{@link #getAssigns() <em>Assigns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns()
   * @generated
   * @ordered
   */
  protected VizAssignList assigns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VizEnumDeclImpl()
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
    return HIPIEPackage.Literals.VIZ_ENUM_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIZ_ENUM_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VizAssignList getAssigns()
  {
    return assigns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssigns(VizAssignList newAssigns, NotificationChain msgs)
  {
    VizAssignList oldAssigns = assigns;
    assigns = newAssigns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS, oldAssigns, newAssigns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssigns(VizAssignList newAssigns)
  {
    if (newAssigns != assigns)
    {
      NotificationChain msgs = null;
      if (assigns != null)
        msgs = ((InternalEObject)assigns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS, null, msgs);
      if (newAssigns != null)
        msgs = ((InternalEObject)newAssigns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS, null, msgs);
      msgs = basicSetAssigns(newAssigns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS, newAssigns, newAssigns));
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
      case HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS:
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
      case HIPIEPackage.VIZ_ENUM_DECL__NAME:
        return getName();
      case HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS:
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
      case HIPIEPackage.VIZ_ENUM_DECL__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS:
        setAssigns((VizAssignList)newValue);
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
      case HIPIEPackage.VIZ_ENUM_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS:
        setAssigns((VizAssignList)null);
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
      case HIPIEPackage.VIZ_ENUM_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VIZ_ENUM_DECL__ASSIGNS:
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

} //VizEnumDeclImpl
