/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.ContractInstance#getSec_name <em>Sec name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.ContractInstance#getInstId <em>Inst Id</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.ContractInstance#getInstance_ops <em>Instance ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.ContractInstance#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getContractInstance()
 * @model
 * @generated
 */
public interface ContractInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Sec name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sec name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sec name</em>' attribute.
   * @see #setSec_name(String)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getContractInstance_Sec_name()
   * @model
   * @generated
   */
  String getSec_name();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.ContractInstance#getSec_name <em>Sec name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sec name</em>' attribute.
   * @see #getSec_name()
   * @generated
   */
  void setSec_name(String value);

  /**
   * Returns the value of the '<em><b>Inst Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inst Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inst Id</em>' containment reference.
   * @see #setInstId(InstanceID)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getContractInstance_InstId()
   * @model containment="true"
   * @generated
   */
  InstanceID getInstId();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.ContractInstance#getInstId <em>Inst Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inst Id</em>' containment reference.
   * @see #getInstId()
   * @generated
   */
  void setInstId(InstanceID value);

  /**
   * Returns the value of the '<em><b>Instance ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance ops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance ops</em>' containment reference.
   * @see #setInstance_ops(InstanceOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getContractInstance_Instance_ops()
   * @model containment="true"
   * @generated
   */
  InstanceOptions getInstance_ops();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.ContractInstance#getInstance_ops <em>Instance ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance ops</em>' containment reference.
   * @see #getInstance_ops()
   * @generated
   */
  void setInstance_ops(InstanceOptions value);

  /**
   * Returns the value of the '<em><b>Assigns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.Assign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getContractInstance_Assigns()
   * @model containment="true"
   * @generated
   */
  EList<Assign> getAssigns();

} // ContractInstance
