/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputtype Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.InputtypeOptions#getIn_type_op <em>In type op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputtypeOptions()
 * @model
 * @generated
 */
public interface InputtypeOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>In type op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In type op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In type op</em>' attribute list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputtypeOptions_In_type_op()
   * @model unique="false"
   * @generated
   */
  EList<String> getIn_type_op();

} // InputtypeOptions
