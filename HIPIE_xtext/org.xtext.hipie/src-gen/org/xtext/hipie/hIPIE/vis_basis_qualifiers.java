/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>vis basis qualifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.vis_basis_qualifiers#getFuncs <em>Funcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvis_basis_qualifiers()
 * @model
 * @generated
 */
public interface vis_basis_qualifiers extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvis_basis_qualifiers_Funcs()
   * @model containment="true"
   * @generated
   */
  EList<function> getFuncs();

} // vis_basis_qualifiers
