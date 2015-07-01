/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.EnumDecl#getEnum_dec <em>Enum dec</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.EnumDecl#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.EnumDecl#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumDecl()
 * @model
 * @generated
 */
public interface EnumDecl extends InputValue
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
   * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ValueList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumDecl_Vals()
   * @model containment="true"
   * @generated
   */
  EList<ValueList> getVals();

  /**
   * Returns the value of the '<em><b>Assigns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.AssignList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumDecl_Assigns()
   * @model containment="true"
   * @generated
   */
  EList<AssignList> getAssigns();

} // EnumDecl
