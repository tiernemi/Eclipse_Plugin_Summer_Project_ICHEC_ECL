/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kel Entity Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.KelEntityDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.KelEntityDecl#getInput_ops <em>Input ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.KelEntityDecl#getAttrdecl <em>Attrdecl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelEntityDecl()
 * @model
 * @generated
 */
public interface KelEntityDecl extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelEntityDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.KelEntityDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Input ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input ops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input ops</em>' containment reference.
   * @see #setInput_ops(InputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelEntityDecl_Input_ops()
   * @model containment="true"
   * @generated
   */
  InputOptions getInput_ops();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.KelEntityDecl#getInput_ops <em>Input ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input ops</em>' containment reference.
   * @see #getInput_ops()
   * @generated
   */
  void setInput_ops(InputOptions value);

  /**
   * Returns the value of the '<em><b>Attrdecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrdecl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrdecl</em>' containment reference.
   * @see #setAttrdecl(KelAttrDecl)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelEntityDecl_Attrdecl()
   * @model containment="true"
   * @generated
   */
  KelAttrDecl getAttrdecl();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.KelEntityDecl#getAttrdecl <em>Attrdecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrdecl</em>' containment reference.
   * @see #getAttrdecl()
   * @generated
   */
  void setAttrdecl(KelAttrDecl value);

} // KelEntityDecl
