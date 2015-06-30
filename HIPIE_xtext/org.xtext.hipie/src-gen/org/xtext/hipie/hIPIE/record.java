/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.record#getInput_ops <em>Input ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getrecord()
 * @model
 * @generated
 */
public interface record extends datatype, input_value
{
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getrecord_Input_ops()
   * @model containment="true"
   * @generated
   */
  EList<input_options> getInput_ops();

} // record
