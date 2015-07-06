/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Input Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.ServiceInputSection#getServs <em>Servs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getServiceInputSection()
 * @model
 * @generated
 */
public interface ServiceInputSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Servs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ServiceInputValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servs</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getServiceInputSection_Servs()
   * @model containment="true"
   * @generated
   */
  EList<ServiceInputValue> getServs();

} // ServiceInputSection
