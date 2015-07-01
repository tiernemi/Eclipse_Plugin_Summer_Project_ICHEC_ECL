/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.InputValue#getInput_op_list <em>Input op list</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputValue()
 * @model
 * @generated
 */
public interface InputValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input op list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input op list</em>' containment reference.
   * @see #setInput_op_list(InputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputValue_Input_op_list()
   * @model containment="true"
   * @generated
   */
  InputOptions getInput_op_list();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.InputValue#getInput_op_list <em>Input op list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input op list</em>' containment reference.
   * @see #getInput_op_list()
   * @generated
   */
  void setInput_op_list(InputOptions value);

} // InputValue
