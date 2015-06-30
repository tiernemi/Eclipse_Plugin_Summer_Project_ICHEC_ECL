/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>base prop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.base_prop#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.base_prop#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.base_prop#getCats <em>Cats</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getbase_prop()
 * @model
 * @generated
 */
public interface base_prop extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getbase_prop_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.base_prop#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference.
   * @see #setVals(value_list)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getbase_prop_Vals()
   * @model containment="true"
   * @generated
   */
  value_list getVals();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.base_prop#getVals <em>Vals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vals</em>' containment reference.
   * @see #getVals()
   * @generated
   */
  void setVals(value_list value);

  /**
   * Returns the value of the '<em><b>Cats</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.category_type_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cats</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cats</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getbase_prop_Cats()
   * @model containment="true"
   * @generated
   */
  EList<category_type_list> getCats();

} // base_prop
