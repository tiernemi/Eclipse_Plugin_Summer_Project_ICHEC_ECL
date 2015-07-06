/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kel Entity Decl Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.KelEntityDeclSimple#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.KelEntityDeclSimple#getInput_ops <em>Input ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelEntityDeclSimple()
 * @model
 * @generated
 */
public interface KelEntityDeclSimple extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelEntityDeclSimple_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.KelEntityDeclSimple#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getKelEntityDeclSimple_Input_ops()
   * @model containment="true"
   * @generated
   */
  InputOptions getInput_ops();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.KelEntityDeclSimple#getInput_ops <em>Input ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input ops</em>' containment reference.
   * @see #getInput_ops()
   * @generated
   */
  void setInput_ops(InputOptions value);

} // KelEntityDeclSimple
