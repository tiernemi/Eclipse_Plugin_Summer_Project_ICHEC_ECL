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

import org.xtext.hipie.hIPIE.AssignList;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputOption;
import org.xtext.hipie.hIPIE.InputtypeOptions;
import org.xtext.hipie.hIPIE.ValueList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputOptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputOptionImpl#getForm_op <em>Form op</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputOptionImpl#getAssigns_list <em>Assigns list</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputOptionImpl#getType_op <em>Type op</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.InputOptionImpl#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOptionImpl extends MinimalEObjectImpl.Container implements InputOption
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
   * The default value of the '{@link #getForm_op() <em>Form op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm_op()
   * @generated
   * @ordered
   */
  protected static final String FORM_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForm_op() <em>Form op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm_op()
   * @generated
   * @ordered
   */
  protected String form_op = FORM_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssigns_list() <em>Assigns list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns_list()
   * @generated
   * @ordered
   */
  protected AssignList assigns_list;

  /**
   * The cached value of the '{@link #getType_op() <em>Type op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_op()
   * @generated
   * @ordered
   */
  protected InputtypeOptions type_op;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputOptionImpl()
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
    return HIPIEPackage.Literals.INPUT_OPTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_OPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getForm_op()
  {
    return form_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForm_op(String newForm_op)
  {
    String oldForm_op = form_op;
    form_op = newForm_op;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_OPTION__FORM_OP, oldForm_op, form_op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignList getAssigns_list()
  {
    return assigns_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssigns_list(AssignList newAssigns_list, NotificationChain msgs)
  {
    AssignList oldAssigns_list = assigns_list;
    assigns_list = newAssigns_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST, oldAssigns_list, newAssigns_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssigns_list(AssignList newAssigns_list)
  {
    if (newAssigns_list != assigns_list)
    {
      NotificationChain msgs = null;
      if (assigns_list != null)
        msgs = ((InternalEObject)assigns_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST, null, msgs);
      if (newAssigns_list != null)
        msgs = ((InternalEObject)newAssigns_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST, null, msgs);
      msgs = basicSetAssigns_list(newAssigns_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST, newAssigns_list, newAssigns_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputtypeOptions getType_op()
  {
    return type_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_op(InputtypeOptions newType_op, NotificationChain msgs)
  {
    InputtypeOptions oldType_op = type_op;
    type_op = newType_op;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_OPTION__TYPE_OP, oldType_op, newType_op);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_op(InputtypeOptions newType_op)
  {
    if (newType_op != type_op)
    {
      NotificationChain msgs = null;
      if (type_op != null)
        msgs = ((InternalEObject)type_op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_OPTION__TYPE_OP, null, msgs);
      if (newType_op != null)
        msgs = ((InternalEObject)newType_op).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.INPUT_OPTION__TYPE_OP, null, msgs);
      msgs = basicSetType_op(newType_op, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.INPUT_OPTION__TYPE_OP, newType_op, newType_op));
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
      vals = new EObjectContainmentEList<ValueList>(ValueList.class, this, HIPIEPackage.INPUT_OPTION__VALS);
    }
    return vals;
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
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST:
        return basicSetAssigns_list(null, msgs);
      case HIPIEPackage.INPUT_OPTION__TYPE_OP:
        return basicSetType_op(null, msgs);
      case HIPIEPackage.INPUT_OPTION__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.INPUT_OPTION__NAME:
        return getName();
      case HIPIEPackage.INPUT_OPTION__FORM_OP:
        return getForm_op();
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST:
        return getAssigns_list();
      case HIPIEPackage.INPUT_OPTION__TYPE_OP:
        return getType_op();
      case HIPIEPackage.INPUT_OPTION__VALS:
        return getVals();
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
      case HIPIEPackage.INPUT_OPTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.INPUT_OPTION__FORM_OP:
        setForm_op((String)newValue);
        return;
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST:
        setAssigns_list((AssignList)newValue);
        return;
      case HIPIEPackage.INPUT_OPTION__TYPE_OP:
        setType_op((InputtypeOptions)newValue);
        return;
      case HIPIEPackage.INPUT_OPTION__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends ValueList>)newValue);
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
      case HIPIEPackage.INPUT_OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.INPUT_OPTION__FORM_OP:
        setForm_op(FORM_OP_EDEFAULT);
        return;
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST:
        setAssigns_list((AssignList)null);
        return;
      case HIPIEPackage.INPUT_OPTION__TYPE_OP:
        setType_op((InputtypeOptions)null);
        return;
      case HIPIEPackage.INPUT_OPTION__VALS:
        getVals().clear();
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
      case HIPIEPackage.INPUT_OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.INPUT_OPTION__FORM_OP:
        return FORM_OP_EDEFAULT == null ? form_op != null : !FORM_OP_EDEFAULT.equals(form_op);
      case HIPIEPackage.INPUT_OPTION__ASSIGNS_LIST:
        return assigns_list != null;
      case HIPIEPackage.INPUT_OPTION__TYPE_OP:
        return type_op != null;
      case HIPIEPackage.INPUT_OPTION__VALS:
        return vals != null && !vals.isEmpty();
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
    result.append(", form_op: ");
    result.append(form_op);
    result.append(')');
    return result.toString();
  }

} //InputOptionImpl
