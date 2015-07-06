/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Service#getServ <em>Serv</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Service#getEcl_vars <em>Ecl vars</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getService()
 * @model
 * @generated
 */
public interface Service extends OutputValue
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Serv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Serv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Serv</em>' containment reference.
   * @see #setServ(ServiceInputSection)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getService_Serv()
   * @model containment="true"
   * @generated
   */
  ServiceInputSection getServ();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Service#getServ <em>Serv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Serv</em>' containment reference.
   * @see #getServ()
   * @generated
   */
  void setServ(ServiceInputSection value);

  /**
   * Returns the value of the '<em><b>Ecl vars</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ECLOutputDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecl vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecl vars</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getService_Ecl_vars()
   * @model containment="true"
   * @generated
   */
  EList<ECLOutputDecl> getEcl_vars();

} // Service
