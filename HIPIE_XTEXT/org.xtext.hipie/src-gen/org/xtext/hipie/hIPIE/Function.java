/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.Function#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Function#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' reference.
   * @see #setVars(PosVizData)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getFunction_Vars()
   * @model
   * @generated
   */
  PosVizData getVars();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Function#getVars <em>Vars</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' reference.
   * @see #getVars()
   * @generated
   */
  void setVars(PosVizData value);

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference.
   * @see #setVals(Value)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getFunction_Vals()
   * @model containment="true"
   * @generated
   */
  Value getVals();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Function#getVals <em>Vals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vals</em>' containment reference.
   * @see #getVals()
   * @generated
   */
  void setVals(Value value);

} // Function
