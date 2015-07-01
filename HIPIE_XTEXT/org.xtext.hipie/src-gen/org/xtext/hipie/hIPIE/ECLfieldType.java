/**
 */
package org.xtext.hipie.hIPIE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EC Lfield Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.ECLfieldType#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getECLfieldType()
 * @model
 * @generated
 */
public interface ECLfieldType extends PosVizData, ECLOutputDecl
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(OutputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getECLfieldType_Options()
   * @model containment="true"
   * @generated
   */
  OutputOptions getOptions();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.ECLfieldType#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(OutputOptions value);

} // ECLfieldType
