/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viz Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VizAssign#getVal_l <em>Val l</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VizAssign#getVal_r <em>Val r</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVizAssign()
 * @model
 * @generated
 */
public interface VizAssign extends EObject
{
  /**
   * Returns the value of the '<em><b>Val l</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val l</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val l</em>' containment reference.
   * @see #setVal_l(Value)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVizAssign_Val_l()
   * @model containment="true"
   * @generated
   */
  Value getVal_l();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VizAssign#getVal_l <em>Val l</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val l</em>' containment reference.
   * @see #getVal_l()
   * @generated
   */
  void setVal_l(Value value);

  /**
   * Returns the value of the '<em><b>Val r</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val r</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val r</em>' containment reference.
   * @see #setVal_r(ValueList)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVizAssign_Val_r()
   * @model containment="true"
   * @generated
   */
  ValueList getVal_r();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VizAssign#getVal_r <em>Val r</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val r</em>' containment reference.
   * @see #getVal_r()
   * @generated
   */
  void setVal_r(ValueList value);

} // VizAssign
