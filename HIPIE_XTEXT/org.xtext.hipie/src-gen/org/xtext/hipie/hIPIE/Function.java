/**
 */
package org.xtext.hipie.hIPIE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.Function#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Function#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends QFunction
{
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

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(int)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getFunction_Type()
   * @model
   * @generated
   */
  int getType();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Function#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(int value);

} // Function
