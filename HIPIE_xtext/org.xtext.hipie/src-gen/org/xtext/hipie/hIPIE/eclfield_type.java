/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>eclfield type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.eclfield_type#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#geteclfield_type()
 * @model
 * @generated
 */
public interface eclfield_type extends pos_viz_data, ecloutput_decl
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.OutputOptions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#geteclfield_type_Options()
   * @model containment="true"
   * @generated
   */
  EList<OutputOptions> getOptions();

} // eclfield_type
