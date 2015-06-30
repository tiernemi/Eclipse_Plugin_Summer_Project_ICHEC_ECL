/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.value#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.value#getInt_val <em>Int val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.value#getStr_val <em>Str val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.value#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue()
 * @model
 * @generated
 */
public interface value extends out_type, custom_value, resource_value
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.value#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue_Int_val()
   * @model
   * @generated
   */
  int getInt_val();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.value#getInt_val <em>Int val</em>}' attribute.
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue_Str_val()
   * @model
   * @generated
   */
  String getStr_val();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.value#getStr_val <em>Str val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str val</em>' attribute.
   * @see #getStr_val()
   * @generated
   */
  void setStr_val(String value);

  /**
   * Returns the value of the '<em><b>Res ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.resource_options}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvalue_Res_ops()
   * @model containment="true"
   * @generated
   */
  EList<resource_options> getRes_ops();

} // value
