/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vis Basis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VisBasis#getAssigned <em>Assigned</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisBasis#getQuals <em>Quals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasis()
 * @model
 * @generated
 */
public interface VisBasis extends EObject
{
  /**
   * Returns the value of the '<em><b>Assigned</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigned</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigned</em>' reference.
   * @see #setAssigned(out_dataset)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasis_Assigned()
   * @model
   * @generated
   */
  out_dataset getAssigned();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisBasis#getAssigned <em>Assigned</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assigned</em>' reference.
   * @see #getAssigned()
   * @generated
   */
  void setAssigned(out_dataset value);

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasis_Quals()
   * @model containment="true"
   * @generated
   */
  EList<vis_basis_qualifiers> getQuals();

} // VisBasis
