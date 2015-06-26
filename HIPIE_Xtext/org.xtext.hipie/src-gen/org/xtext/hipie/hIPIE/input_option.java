/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>input option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.input_option#getInput_internal <em>Input internal</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.input_option#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.input_option#getAssigns_internal <em>Assigns internal</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.input_option#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getinput_option()
 * @model
 * @generated
 */
public interface input_option extends input_options
{
  /**
   * Returns the value of the '<em><b>Input internal</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.input_option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input internal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input internal</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getinput_option_Input_internal()
   * @model containment="true"
   * @generated
   */
  EList<input_option> getInput_internal();

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getinput_option_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.input_option#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Assigns internal</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.assign_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns internal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns internal</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getinput_option_Assigns_internal()
   * @model containment="true"
   * @generated
   */
  EList<assign_list> getAssigns_internal();

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getinput_option_Vals()
   * @model containment="true"
   * @generated
   */
  EList<value_list> getVals();

} // input_option
