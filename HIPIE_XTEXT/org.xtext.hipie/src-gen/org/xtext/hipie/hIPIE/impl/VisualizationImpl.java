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
import org.xtext.hipie.hIPIE.VisBasisParens;
import org.xtext.hipie.hIPIE.VisInputValue;
import org.xtext.hipie.hIPIE.VisualOptions;
import org.xtext.hipie.hIPIE.Visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualizationImpl#getParens <em>Parens</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualizationImpl#getVis_op <em>Vis op</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualizationImpl#getInput_val <em>Input val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualizationImpl extends MinimalEObjectImpl.Container implements Visualization
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
   * The cached value of the '{@link #getParens() <em>Parens</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParens()
   * @generated
   * @ordered
   */
  protected VisBasisParens parens;

  /**
   * The cached value of the '{@link #getVis_op() <em>Vis op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_op()
   * @generated
   * @ordered
   */
  protected VisualOptions vis_op;

  /**
   * The cached value of the '{@link #getInput_val() <em>Input val</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput_val()
   * @generated
   * @ordered
   */
  protected EList<VisInputValue> input_val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisualizationImpl()
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
  public VisBasisParens getParens()
  {
    return parens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParens(VisBasisParens newParens, NotificationChain msgs)
  {
    VisBasisParens oldParens = parens;
    parens = newParens;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUALIZATION__PARENS, oldParens, newParens);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParens(VisBasisParens newParens)
  {
    if (newParens != parens)
    {
      NotificationChain msgs = null;
      if (parens != null)
        msgs = ((InternalEObject)parens).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUALIZATION__PARENS, null, msgs);
      if (newParens != null)
        msgs = ((InternalEObject)newParens).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUALIZATION__PARENS, null, msgs);
      msgs = basicSetParens(newParens, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUALIZATION__PARENS, newParens, newParens));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualOptions getVis_op()
  {
    return vis_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVis_op(VisualOptions newVis_op, NotificationChain msgs)
  {
    VisualOptions oldVis_op = vis_op;
    vis_op = newVis_op;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUALIZATION__VIS_OP, oldVis_op, newVis_op);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVis_op(VisualOptions newVis_op)
  {
    if (newVis_op != vis_op)
    {
      NotificationChain msgs = null;
      if (vis_op != null)
        msgs = ((InternalEObject)vis_op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUALIZATION__VIS_OP, null, msgs);
      if (newVis_op != null)
        msgs = ((InternalEObject)newVis_op).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUALIZATION__VIS_OP, null, msgs);
      msgs = basicSetVis_op(newVis_op, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUALIZATION__VIS_OP, newVis_op, newVis_op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VisInputValue> getInput_val()
  {
    if (input_val == null)
    {
      input_val = new EObjectContainmentEList<VisInputValue>(VisInputValue.class, this, HIPIEPackage.VISUALIZATION__INPUT_VAL);
    }
    return input_val;
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
      case HIPIEPackage.VISUALIZATION__PARENS:
        return basicSetParens(null, msgs);
      case HIPIEPackage.VISUALIZATION__VIS_OP:
        return basicSetVis_op(null, msgs);
      case HIPIEPackage.VISUALIZATION__INPUT_VAL:
        return ((InternalEList<?>)getInput_val()).basicRemove(otherEnd, msgs);
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
      case HIPIEPackage.VISUALIZATION__PARENS:
        return getParens();
      case HIPIEPackage.VISUALIZATION__VIS_OP:
        return getVis_op();
      case HIPIEPackage.VISUALIZATION__INPUT_VAL:
        return getInput_val();
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
      case HIPIEPackage.VISUALIZATION__PARENS:
        setParens((VisBasisParens)newValue);
        return;
      case HIPIEPackage.VISUALIZATION__VIS_OP:
        setVis_op((VisualOptions)newValue);
        return;
      case HIPIEPackage.VISUALIZATION__INPUT_VAL:
        getInput_val().clear();
        getInput_val().addAll((Collection<? extends VisInputValue>)newValue);
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
      case HIPIEPackage.VISUALIZATION__PARENS:
        setParens((VisBasisParens)null);
        return;
      case HIPIEPackage.VISUALIZATION__VIS_OP:
        setVis_op((VisualOptions)null);
        return;
      case HIPIEPackage.VISUALIZATION__INPUT_VAL:
        getInput_val().clear();
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
      case HIPIEPackage.VISUALIZATION__PARENS:
        return parens != null;
      case HIPIEPackage.VISUALIZATION__VIS_OP:
        return vis_op != null;
      case HIPIEPackage.VISUALIZATION__INPUT_VAL:
        return input_val != null && !input_val.isEmpty();
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

} //VisualizationImpl
