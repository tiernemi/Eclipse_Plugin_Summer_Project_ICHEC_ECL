/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.OutputSection#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutputSection#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputSection()
 * @model
 * @generated
 */
public interface OutputSection extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputSection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutputSection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.OutputValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutputSection_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<OutputValue> getOutputs();

} // OutputSection