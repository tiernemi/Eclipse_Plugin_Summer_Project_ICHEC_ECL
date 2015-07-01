/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.OutputOptions#getOutput_ops <em>Output ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputOptions()
 * @model
 * @generated
 */
public interface OutputOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Output ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.OutputOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputOptions_Output_ops()
   * @model containment="true"
   * @generated
   */
  EList<OutputOption> getOutput_ops();

} // OutputOptions
