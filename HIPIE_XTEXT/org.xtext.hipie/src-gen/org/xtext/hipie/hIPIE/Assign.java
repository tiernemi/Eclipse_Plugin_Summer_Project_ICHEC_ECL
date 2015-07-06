/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.Assign#getVals_l <em>Vals l</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Assign#getVals_r <em>Vals r</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends EObject
{
  /**
   * Returns the value of the '<em><b>Vals l</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals l</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals l</em>' containment reference.
   * @see #setVals_l(Value)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getAssign_Vals_l()
   * @model containment="true"
   * @generated
   */
  Value getVals_l();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Assign#getVals_l <em>Vals l</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vals l</em>' containment reference.
   * @see #getVals_l()
   * @generated
   */
  void setVals_l(Value value);

  /**
   * Returns the value of the '<em><b>Vals r</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals r</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals r</em>' containment reference.
   * @see #setVals_r(ValueList)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getAssign_Vals_r()
   * @model containment="true"
   * @generated
   */
  ValueList getVals_r();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Assign#getVals_r <em>Vals r</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vals r</em>' containment reference.
   * @see #getVals_r()
   * @generated
   */
  void setVals_r(ValueList value);

} // Assign
