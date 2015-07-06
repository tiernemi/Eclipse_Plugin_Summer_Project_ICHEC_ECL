/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kel Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.KelBase#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.KelBase#getInput_op_list <em>Input op list</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.KelBase#getKel_ops <em>Kel ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelBase()
 * @model
 * @generated
 */
public interface KelBase extends Datatype, InputValue
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelBase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.KelBase#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input op list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input op list</em>' containment reference.
   * @see #setInput_op_list(InputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelBase_Input_op_list()
   * @model containment="true"
   * @generated
   */
  InputOptions getInput_op_list();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.KelBase#getInput_op_list <em>Input op list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input op list</em>' containment reference.
   * @see #getInput_op_list()
   * @generated
   */
  void setInput_op_list(InputOptions value);

  /**
   * Returns the value of the '<em><b>Kel ops</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kel ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kel ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelBase_Kel_ops()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getKel_ops();

} // KelBase
