/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.OutputValue#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputValue()
 * @model
 * @generated
 */
public interface OutputValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' containment reference.
   * @see #setOps(OutputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputValue_Ops()
   * @model containment="true"
   * @generated
   */
  OutputOptions getOps();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutputValue#getOps <em>Ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ops</em>' containment reference.
   * @see #getOps()
   * @generated
   */
  void setOps(OutputOptions value);

} // OutputValue
