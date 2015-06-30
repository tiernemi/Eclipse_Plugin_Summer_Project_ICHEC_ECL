/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.OutputOption#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutputOption#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutputOption#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutputOption#getOutput_internal <em>Output internal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputOption()
 * @model
 * @generated
 */
public interface OutputOption extends OutputOptions
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputOption_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutputOption#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.datatype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputOption_Vars()
   * @model
   * @generated
   */
  EList<datatype> getVars();

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputOption_Vals()
   * @model containment="true"
   * @generated
   */
  EList<value> getVals();

  /**
   * Returns the value of the '<em><b>Output internal</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.OutputOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output internal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output internal</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputOption_Output_internal()
   * @model containment="true"
   * @generated
   */
  EList<OutputOption> getOutput_internal();

} // OutputOption
