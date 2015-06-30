/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.assign#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.assign#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.assign#getAssign_internal <em>Assign internal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getassign()
 * @model
 * @generated
 */
public interface assign extends assign_list
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getassign_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.assign#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.value_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getassign_Vals()
   * @model containment="true"
   * @generated
   */
  EList<value_list> getVals();

  /**
   * Returns the value of the '<em><b>Assign internal</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.assign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign internal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign internal</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getassign_Assign_internal()
   * @model containment="true"
   * @generated
   */
  EList<assign> getAssign_internal();

} // assign
