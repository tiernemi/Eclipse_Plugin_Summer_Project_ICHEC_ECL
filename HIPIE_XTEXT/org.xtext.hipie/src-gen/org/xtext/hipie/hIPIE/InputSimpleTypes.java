/**
 */
package org.xtext.hipie.hIPIE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Simple Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.InputSimpleTypes#getInput_op_list <em>Input op list</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.InputSimpleTypes#getIn_ops <em>In ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputSimpleTypes()
 * @model
 * @generated
 */
public interface InputSimpleTypes extends Datatype, InputValue, VisInputValue
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputSimpleTypes_Input_op_list()
   * @model containment="true"
   * @generated
   */
  InputOptions getInput_op_list();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.InputSimpleTypes#getInput_op_list <em>Input op list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input op list</em>' containment reference.
   * @see #getInput_op_list()
   * @generated
   */
  void setInput_op_list(InputOptions value);

  /**
   * Returns the value of the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In ops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In ops</em>' containment reference.
   * @see #setIn_ops(InputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputSimpleTypes_In_ops()
   * @model containment="true"
   * @generated
   */
  InputOptions getIn_ops();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.InputSimpleTypes#getIn_ops <em>In ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In ops</em>' containment reference.
   * @see #getIn_ops()
   * @generated
   */
  void setIn_ops(InputOptions value);

} // InputSimpleTypes
