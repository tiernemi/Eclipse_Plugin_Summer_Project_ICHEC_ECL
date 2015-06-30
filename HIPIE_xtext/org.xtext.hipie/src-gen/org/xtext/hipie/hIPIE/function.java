/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.function#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.function#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getfunction()
 * @model
 * @generated
 */
public interface function extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.pos_viz_data}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getfunction_Vars()
   * @model
   * @generated
   */
  EList<pos_viz_data> getVars();

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getfunction_Vals()
   * @model containment="true"
   * @generated
   */
  EList<value> getVals();

} // function
