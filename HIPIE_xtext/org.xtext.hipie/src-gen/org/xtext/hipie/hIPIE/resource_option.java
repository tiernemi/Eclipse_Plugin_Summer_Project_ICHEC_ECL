/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>resource option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.resource_option#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.resource_option#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.resource_option#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getresource_option()
 * @model
 * @generated
 */
public interface resource_option extends resource_options
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getresource_option_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.resource_option#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getresource_option_Vals()
   * @model containment="true"
   * @generated
   */
  EList<value> getVals();

  /**
   * Returns the value of the '<em><b>Res ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.resource_option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getresource_option_Res_ops()
   * @model containment="true"
   * @generated
   */
  EList<resource_option> getRes_ops();

} // resource_option
