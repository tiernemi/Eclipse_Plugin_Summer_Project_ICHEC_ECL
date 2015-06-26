/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>vis basis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.vis_basis#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.vis_basis#getQuals <em>Quals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvis_basis()
 * @model
 * @generated
 */
public interface vis_basis extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.dataset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvis_basis_Vars()
   * @model
   * @generated
   */
  EList<dataset> getVars();

  /**
   * Returns the value of the '<em><b>Quals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.vis_basis_qualifiers}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quals</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvis_basis_Quals()
   * @model containment="true"
   * @generated
   */
  EList<vis_basis_qualifiers> getQuals();

} // vis_basis
