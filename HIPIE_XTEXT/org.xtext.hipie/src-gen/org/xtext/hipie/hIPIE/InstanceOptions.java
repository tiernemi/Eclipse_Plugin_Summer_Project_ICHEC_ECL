/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.InstanceOptions#getIn_ops <em>In ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInstanceOptions()
 * @model
 * @generated
 */
public interface InstanceOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>In ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.InstanceOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInstanceOptions_In_ops()
   * @model containment="true"
   * @generated
   */
  EList<InstanceOption> getIn_ops();

} // InstanceOptions
