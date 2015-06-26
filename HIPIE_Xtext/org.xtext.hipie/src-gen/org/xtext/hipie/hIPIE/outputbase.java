/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>outputbase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.outputbase#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getoutputbase()
 * @model
 * @generated
 */
public interface outputbase extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' reference.
   * @see #setActions(datatype)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getoutputbase_Actions()
   * @model
   * @generated
   */
  datatype getActions();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.outputbase#getActions <em>Actions</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actions</em>' reference.
   * @see #getActions()
   * @generated
   */
  void setActions(datatype value);

} // outputbase
