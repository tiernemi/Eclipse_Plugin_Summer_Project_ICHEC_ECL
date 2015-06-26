/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>resource section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.resource_section#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.resource_section#getRes_vals <em>Res vals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getresource_section()
 * @model
 * @generated
 */
public interface resource_section extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getresource_section_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.resource_section#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Res vals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.resource_value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res vals</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getresource_section_Res_vals()
   * @model containment="true"
   * @generated
   */
  EList<resource_value> getRes_vals();

} // resource_section
