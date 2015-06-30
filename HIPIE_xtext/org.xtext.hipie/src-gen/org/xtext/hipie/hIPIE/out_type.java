/**
 */
package org.xtext.hipie.hIPIE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>out type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.out_type#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getout_type()
 * @model
 * @generated
 */
public interface out_type extends output_value
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getout_type_Ops()
   * @model containment="true"
   * @generated
   */
  OutputOptions getOps();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.out_type#getOps <em>Ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ops</em>' containment reference.
   * @see #getOps()
   * @generated
   */
  void setOps(OutputOptions value);

} // out_type
