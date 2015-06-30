/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>contract instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.contract_instance#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.contract_instance#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.contract_instance#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.contract_instance#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getcontract_instance()
 * @model
 * @generated
 */
public interface contract_instance extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getcontract_instance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.contract_instance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getcontract_instance_Vals()
   * @model containment="true"
   * @generated
   */
  EList<value> getVals();

  /**
   * Returns the value of the '<em><b>Vars</b></em>' reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getcontract_instance_Vars()
   * @model
   * @generated
   */
  EList<value> getVars();

  /**
   * Returns the value of the '<em><b>Assigns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.assign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getcontract_instance_Assigns()
   * @model containment="true"
   * @generated
   */
  EList<assign> getAssigns();

} // contract_instance
