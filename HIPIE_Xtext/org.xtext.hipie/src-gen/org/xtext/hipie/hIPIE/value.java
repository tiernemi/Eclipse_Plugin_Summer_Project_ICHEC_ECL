/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.value#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.value#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.value#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue()
 * @model
 * @generated
 */
public interface value extends value_list, assign, out_type, function, custom_value, resource_value
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(int)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue_Type()
   * @model
   * @generated
   */
  int getType();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.value#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(int value);

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue_Vals()
   * @model containment="true"
   * @generated
   */
  EList<value_list> getVals();

  /**
   * Returns the value of the '<em><b>Res ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.resource_options}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue_Res_ops()
   * @model containment="true"
   * @generated
   */
  EList<resource_options> getRes_ops();

} // value
