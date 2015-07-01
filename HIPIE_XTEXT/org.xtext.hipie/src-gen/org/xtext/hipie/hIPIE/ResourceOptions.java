/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.ResourceOptions#getRes_ops <em>Res ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getResourceOptions()
 * @model
 * @generated
 */
public interface ResourceOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Res ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ResourceOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getResourceOptions_Res_ops()
   * @model containment="true"
   * @generated
   */
  EList<ResourceOption> getRes_ops();

} // ResourceOptions
