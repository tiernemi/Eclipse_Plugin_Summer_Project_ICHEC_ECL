/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.Permission#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Permission#getCust_levs <em>Cust levs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getPermission_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Permission#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cust levs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.CustomPermissionLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cust levs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cust levs</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getPermission_Cust_levs()
   * @model containment="true"
   * @generated
   */
  EList<CustomPermissionLevel> getCust_levs();

} // Permission
