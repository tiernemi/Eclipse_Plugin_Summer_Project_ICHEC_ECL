/**
 */
package org.xtext.hipie.hIPIE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.FieldDecl#getInput_ops <em>Input ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getFieldDecl()
 * @model
 * @generated
 */
public interface FieldDecl extends PosVizData
{
  /**
   * Returns the value of the '<em><b>Input ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input ops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input ops</em>' containment reference.
   * @see #setInput_ops(InputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getFieldDecl_Input_ops()
   * @model containment="true"
   * @generated
   */
  InputOptions getInput_ops();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.FieldDecl#getInput_ops <em>Input ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input ops</em>' containment reference.
   * @see #getInput_ops()
   * @generated
   */
  void setInput_ops(InputOptions value);

} // FieldDecl
