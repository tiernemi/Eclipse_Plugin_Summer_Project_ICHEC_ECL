/**
 */
package org.xtext.hipie.hIPIE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.EnumDecl#getEnum_dec <em>Enum dec</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.EnumDecl#getEnum_list <em>Enum list</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumDecl()
 * @model
 * @generated
 */
public interface EnumDecl extends InputSimpleTypes
{
  /**
   * Returns the value of the '<em><b>Enum dec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum dec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum dec</em>' attribute.
   * @see #setEnum_dec(String)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumDecl_Enum_dec()
   * @model
   * @generated
   */
  String getEnum_dec();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.EnumDecl#getEnum_dec <em>Enum dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum dec</em>' attribute.
   * @see #getEnum_dec()
   * @generated
   */
  void setEnum_dec(String value);

  /**
   * Returns the value of the '<em><b>Enum list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum list</em>' containment reference.
   * @see #setEnum_list(EnumList)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumDecl_Enum_list()
   * @model containment="true"
   * @generated
   */
  EnumList getEnum_list();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.EnumDecl#getEnum_list <em>Enum list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum list</em>' containment reference.
   * @see #getEnum_list()
   * @generated
   */
  void setEnum_list(EnumList value);

} // EnumDecl
