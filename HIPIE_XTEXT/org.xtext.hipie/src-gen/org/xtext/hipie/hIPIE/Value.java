/**
 */
package org.xtext.hipie.hIPIE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.Value#getInt_val <em>Int val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Value#getStr_val <em>Str val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Value#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends SelectEvent, CustomValue, ResourceValue
{
  /**
   * Returns the value of the '<em><b>Int val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int val</em>' attribute.
   * @see #setInt_val(int)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getValue_Int_val()
   * @model
   * @generated
   */
  int getInt_val();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Value#getInt_val <em>Int val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int val</em>' attribute.
   * @see #getInt_val()
   * @generated
   */
  void setInt_val(int value);

  /**
   * Returns the value of the '<em><b>Str val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str val</em>' attribute.
   * @see #setStr_val(String)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getValue_Str_val()
   * @model
   * @generated
   */
  String getStr_val();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Value#getStr_val <em>Str val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str val</em>' attribute.
   * @see #getStr_val()
   * @generated
   */
  void setStr_val(String value);

  /**
   * Returns the value of the '<em><b>Res ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res ops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res ops</em>' containment reference.
   * @see #setRes_ops(ResourceOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getValue_Res_ops()
   * @model containment="true"
   * @generated
   */
  ResourceOptions getRes_ops();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Value#getRes_ops <em>Res ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Res ops</em>' containment reference.
   * @see #getRes_ops()
   * @generated
   */
  void setRes_ops(ResourceOptions value);

} // Value
