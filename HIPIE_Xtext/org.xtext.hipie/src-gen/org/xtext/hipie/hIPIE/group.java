/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.group#getInput_internal <em>Input internal</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.group#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getgroup()
 * @model
 * @generated
 */
public interface group extends input_value
{
  /**
   * Returns the value of the '<em><b>Input internal</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.input_options}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input internal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input internal</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getgroup_Input_internal()
   * @model containment="true"
   * @generated
   */
  EList<input_options> getInput_internal();

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.input_value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getgroup_Values()
   * @model containment="true"
   * @generated
   */
  EList<input_value> getValues();

} // group
