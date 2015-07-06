/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vis Basis Qualifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VisBasisQualifiers#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisBasisQualifiers#getQfuncs <em>Qfuncs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasisQualifiers()
 * @model
 * @generated
 */
public interface VisBasisQualifiers extends NestBasisQualifier
{
  /**
   * Returns the value of the '<em><b>Funcs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funcs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funcs</em>' containment reference.
   * @see #setFuncs(Function)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasisQualifiers_Funcs()
   * @model containment="true"
   * @generated
   */
  Function getFuncs();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisBasisQualifiers#getFuncs <em>Funcs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Funcs</em>' containment reference.
   * @see #getFuncs()
   * @generated
   */
  void setFuncs(Function value);

  /**
   * Returns the value of the '<em><b>Qfuncs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.QFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qfuncs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qfuncs</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasisQualifiers_Qfuncs()
   * @model containment="true"
   * @generated
   */
  EList<QFunction> getQfuncs();

} // VisBasisQualifiers
