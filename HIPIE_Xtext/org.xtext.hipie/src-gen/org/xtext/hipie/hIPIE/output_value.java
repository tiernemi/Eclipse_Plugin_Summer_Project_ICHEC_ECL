/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>output value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.output_value#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getoutput_value()
 * @model
 * @generated
 */
public interface output_value extends EObject
{
  /**
   * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.output_options}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getoutput_value_Ops()
   * @model containment="true"
   * @generated
   */
  EList<output_options> getOps();

} // output_value
