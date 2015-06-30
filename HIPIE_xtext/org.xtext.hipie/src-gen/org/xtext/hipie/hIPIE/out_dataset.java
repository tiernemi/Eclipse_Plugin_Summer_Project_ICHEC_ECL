/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>out dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.out_dataset#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.out_dataset#getOut_base <em>Out base</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.out_dataset#getOps <em>Ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.out_dataset#getEcl_vars <em>Ecl vars</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getout_dataset()
 * @model
 * @generated
 */
public interface out_dataset extends output_value
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getout_dataset_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.out_dataset#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Out base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out base</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out base</em>' containment reference.
   * @see #setOut_base(outputbase)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getout_dataset_Out_base()
   * @model containment="true"
   * @generated
   */
  outputbase getOut_base();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.out_dataset#getOut_base <em>Out base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out base</em>' containment reference.
   * @see #getOut_base()
   * @generated
   */
  void setOut_base(outputbase value);

  /**
   * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.OutputOptions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getout_dataset_Ops()
   * @model containment="true"
   * @generated
   */
  EList<OutputOptions> getOps();

  /**
   * Returns the value of the '<em><b>Ecl vars</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ecloutput_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecl vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecl vars</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getout_dataset_Ecl_vars()
   * @model containment="true"
   * @generated
   */
  EList<ecloutput_decl> getEcl_vars();

} // out_dataset
