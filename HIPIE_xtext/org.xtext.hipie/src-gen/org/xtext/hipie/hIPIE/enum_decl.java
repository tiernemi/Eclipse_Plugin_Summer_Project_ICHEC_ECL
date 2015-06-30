/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enum decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.enum_decl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.enum_decl#getAssigns <em>Assigns</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.enum_decl#getInput_ops <em>Input ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getenum_decl()
 * @model
 * @generated
 */
public interface enum_decl extends input_value
{
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getenum_decl_Vals()
   * @model containment="true"
   * @generated
   */
  EList<value_list> getVals();

  /**
   * Returns the value of the '<em><b>Assigns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.assign_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getenum_decl_Assigns()
   * @model containment="true"
   * @generated
   */
  EList<assign_list> getAssigns();

  /**
   * Returns the value of the '<em><b>Input ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.input_options}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getenum_decl_Input_ops()
   * @model containment="true"
   * @generated
   */
  EList<input_options> getInput_ops();

} // enum_decl
