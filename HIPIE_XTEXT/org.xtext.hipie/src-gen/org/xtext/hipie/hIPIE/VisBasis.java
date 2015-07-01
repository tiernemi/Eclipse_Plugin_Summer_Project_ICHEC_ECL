/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vis Basis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VisBasis#getBasis <em>Basis</em>}</li>
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
   * Returns the value of the '<em><b>Basis</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basis</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basis</em>' reference.
   * @see #setBasis(OutDataset)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasis_Basis()
   * @model
   * @generated
   */
  OutDataset getBasis();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisBasis#getBasis <em>Basis</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basis</em>' reference.
   * @see #getBasis()
   * @generated
   */
  void setBasis(OutDataset value);

  /**
   * Returns the value of the '<em><b>Quals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quals</em>' containment reference.
   * @see #setQuals(VisBasisQualifiers)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasis_Quals()
   * @model containment="true"
   * @generated
   */
  VisBasisQualifiers getQuals();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisBasis#getQuals <em>Quals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quals</em>' containment reference.
   * @see #getQuals()
   * @generated
   */
  void setQuals(VisBasisQualifiers value);

} // VisBasis
