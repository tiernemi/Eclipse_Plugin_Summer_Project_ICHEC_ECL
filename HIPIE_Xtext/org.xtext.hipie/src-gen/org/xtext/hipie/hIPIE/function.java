/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.function#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.function#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getfunction()
 * @model
 * @generated
 */
public interface function extends vis_basis_qualifiers
{
  /**
   * Returns the value of the '<em><b>Funcs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funcs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funcs</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getfunction_Funcs()
   * @model containment="true"
   * @generated
   */
  EList<function> getFuncs();

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getfunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // function
