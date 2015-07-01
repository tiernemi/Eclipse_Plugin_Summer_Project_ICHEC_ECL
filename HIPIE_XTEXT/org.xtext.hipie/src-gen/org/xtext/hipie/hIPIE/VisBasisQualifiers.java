/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vis Basis Qualifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VisBasisQualifiers#getFuncs <em>Funcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasisQualifiers()
 * @model
 * @generated
 */
public interface VisBasisQualifiers extends EObject
{
  /**
   * Returns the value of the '<em><b>Funcs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funcs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funcs</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisBasisQualifiers_Funcs()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFuncs();

} // VisBasisQualifiers
