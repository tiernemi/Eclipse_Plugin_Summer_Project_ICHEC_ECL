/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.field_decl#getInput_internal <em>Input internal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getfield_decl()
 * @model
 * @generated
 */
public interface field_decl extends pos_viz_data
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getfield_decl_Input_internal()
   * @model containment="true"
   * @generated
   */
  EList<input_options> getInput_internal();

} // field_decl
