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

import org.xtext.hipie.hIPIE.AssignList;
import org.xtext.hipie.hIPIE.EnumDecl;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.ValueList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.EnumDeclImpl#getEnum_dec <em>Enum dec</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.EnumDeclImpl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.EnumDeclImpl#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumDeclImpl extends InputValueImpl implements EnumDecl
{
  /**
   * The default value of the '{@link #getEnum_dec() <em>Enum dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum_dec()
   * @generated
   * @ordered
   */
  protected static final String ENUM_DEC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnum_dec() <em>Enum dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum_dec()
   * @generated
   * @ordered
   */
  protected String enum_dec = ENUM_DEC_EDEFAULT;

  /**
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected EList<ValueList> vals;

  /**
   * The cached value of the '{@link #getAssigns() <em>Assigns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns()
   * @generated
   * @ordered
   */
  protected EList<AssignList> assigns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumDeclImpl()
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
    return HIPIEPackage.Literals.ENUM_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnum_dec()
  {
    return enum_dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnum_dec(String newEnum_dec)
  {
    String oldEnum_dec = enum_dec;
    enum_dec = newEnum_dec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.ENUM_DECL__ENUM_DEC, oldEnum_dec, enum_dec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValueList> getVals()
  {
    if (vals == null)
    {
      vals = new EObjectContainmentEList<ValueList>(ValueList.class, this, HIPIEPackage.ENUM_DECL__VALS);
    }
    return vals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AssignList> getAssigns()
  {
    if (assigns == null)
    {
      assigns = new EObjectContainmentEList<AssignList>(AssignList.class, this, HIPIEPackage.ENUM_DECL__ASSIGNS);
    }
    return assigns;
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
      case HIPIEPackage.ENUM_DECL__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        return ((InternalEList<?>)getAssigns()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.ENUM_DECL__ENUM_DEC:
        return getEnum_dec();
      case HIPIEPackage.ENUM_DECL__VALS:
        return getVals();
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        return getAssigns();
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
      case HIPIEPackage.ENUM_DECL__ENUM_DEC:
        setEnum_dec((String)newValue);
        return;
      case HIPIEPackage.ENUM_DECL__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends ValueList>)newValue);
        return;
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        getAssigns().clear();
        getAssigns().addAll((Collection<? extends AssignList>)newValue);
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
      case HIPIEPackage.ENUM_DECL__ENUM_DEC:
        setEnum_dec(ENUM_DEC_EDEFAULT);
        return;
      case HIPIEPackage.ENUM_DECL__VALS:
        getVals().clear();
        return;
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        getAssigns().clear();
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
      case HIPIEPackage.ENUM_DECL__ENUM_DEC:
        return ENUM_DEC_EDEFAULT == null ? enum_dec != null : !ENUM_DEC_EDEFAULT.equals(enum_dec);
      case HIPIEPackage.ENUM_DECL__VALS:
        return vals != null && !vals.isEmpty();
      case HIPIEPackage.ENUM_DECL__ASSIGNS:
        return assigns != null && !assigns.isEmpty();
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
    result.append(" (enum_dec: ");
    result.append(enum_dec);
    result.append(')');
    return result.toString();
  }

} //EnumDeclImpl
