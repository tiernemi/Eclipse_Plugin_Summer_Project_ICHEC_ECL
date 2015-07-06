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
import org.xtext.hipie.hIPIE.Function;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.VisibilityOption;
import org.xtext.hipie.hIPIE.VisualCustomOption;
import org.xtext.hipie.hIPIE.VisualOption;
import org.xtext.hipie.hIPIE.VizEnumDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getVis_cust <em>Vis cust</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getVisibility_op <em>Visibility op</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl#getAssigns <em>Assigns</em>}</li>
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
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected VizEnumDecl decl;

  /**
   * The cached value of the '{@link #getVis_cust() <em>Vis cust</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis_cust()
   * @generated
   * @ordered
   */
  protected VisualCustomOption vis_cust;

  /**
   * The cached value of the '{@link #getVisibility_op() <em>Visibility op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility_op()
   * @generated
   * @ordered
   */
  protected VisibilityOption visibility_op;

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
  public VizEnumDecl getDecl()
  {
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecl(VizEnumDecl newDecl, NotificationChain msgs)
  {
    VizEnumDecl oldDecl = decl;
    decl = newDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__DECL, oldDecl, newDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecl(VizEnumDecl newDecl)
  {
    if (newDecl != decl)
    {
      NotificationChain msgs = null;
      if (decl != null)
        msgs = ((InternalEObject)decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_OPTION__DECL, null, msgs);
      if (newDecl != null)
        msgs = ((InternalEObject)newDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_OPTION__DECL, null, msgs);
      msgs = basicSetDecl(newDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__DECL, newDecl, newDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualCustomOption getVis_cust()
  {
    return vis_cust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVis_cust(VisualCustomOption newVis_cust, NotificationChain msgs)
  {
    VisualCustomOption oldVis_cust = vis_cust;
    vis_cust = newVis_cust;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__VIS_CUST, oldVis_cust, newVis_cust);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVis_cust(VisualCustomOption newVis_cust)
  {
    if (newVis_cust != vis_cust)
    {
      NotificationChain msgs = null;
      if (vis_cust != null)
        msgs = ((InternalEObject)vis_cust).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_OPTION__VIS_CUST, null, msgs);
      if (newVis_cust != null)
        msgs = ((InternalEObject)newVis_cust).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_OPTION__VIS_CUST, null, msgs);
      msgs = basicSetVis_cust(newVis_cust, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__VIS_CUST, newVis_cust, newVis_cust));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityOption getVisibility_op()
  {
    return visibility_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVisibility_op(VisibilityOption newVisibility_op, NotificationChain msgs)
  {
    VisibilityOption oldVisibility_op = visibility_op;
    visibility_op = newVisibility_op;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP, oldVisibility_op, newVisibility_op);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility_op(VisibilityOption newVisibility_op)
  {
    if (newVisibility_op != visibility_op)
    {
      NotificationChain msgs = null;
      if (visibility_op != null)
        msgs = ((InternalEObject)visibility_op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP, null, msgs);
      if (newVisibility_op != null)
        msgs = ((InternalEObject)newVisibility_op).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP, null, msgs);
      msgs = basicSetVisibility_op(newVisibility_op, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP, newVisibility_op, newVisibility_op));
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
      assigns = new EObjectContainmentEList<AssignList>(AssignList.class, this, HIPIEPackage.VISUAL_OPTION__ASSIGNS);
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
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return ((InternalEList<?>)getFuncs()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.VISUAL_OPTION__DECL:
        return basicSetDecl(null, msgs);
      case HIPIEPackage.VISUAL_OPTION__VIS_CUST:
        return basicSetVis_cust(null, msgs);
      case HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP:
        return basicSetVisibility_op(null, msgs);
      case HIPIEPackage.VISUAL_OPTION__ASSIGNS:
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
      case HIPIEPackage.VISUAL_OPTION__NAME:
        return getName();
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return getFuncs();
      case HIPIEPackage.VISUAL_OPTION__DECL:
        return getDecl();
      case HIPIEPackage.VISUAL_OPTION__VIS_CUST:
        return getVis_cust();
      case HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP:
        return getVisibility_op();
      case HIPIEPackage.VISUAL_OPTION__ASSIGNS:
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
      case HIPIEPackage.VISUAL_OPTION__NAME:
        setName((String)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        getFuncs().clear();
        getFuncs().addAll((Collection<? extends Function>)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__DECL:
        setDecl((VizEnumDecl)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__VIS_CUST:
        setVis_cust((VisualCustomOption)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP:
        setVisibility_op((VisibilityOption)newValue);
        return;
      case HIPIEPackage.VISUAL_OPTION__ASSIGNS:
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
      case HIPIEPackage.VISUAL_OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        getFuncs().clear();
        return;
      case HIPIEPackage.VISUAL_OPTION__DECL:
        setDecl((VizEnumDecl)null);
        return;
      case HIPIEPackage.VISUAL_OPTION__VIS_CUST:
        setVis_cust((VisualCustomOption)null);
        return;
      case HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP:
        setVisibility_op((VisibilityOption)null);
        return;
      case HIPIEPackage.VISUAL_OPTION__ASSIGNS:
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
      case HIPIEPackage.VISUAL_OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HIPIEPackage.VISUAL_OPTION__FUNCS:
        return funcs != null && !funcs.isEmpty();
      case HIPIEPackage.VISUAL_OPTION__DECL:
        return decl != null;
      case HIPIEPackage.VISUAL_OPTION__VIS_CUST:
        return vis_cust != null;
      case HIPIEPackage.VISUAL_OPTION__VISIBILITY_OP:
        return visibility_op != null;
      case HIPIEPackage.VISUAL_OPTION__ASSIGNS:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VisualOptionImpl
