/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.dataset#getInput_ops <em>Input ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.dataset#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.dataset#getOut_base <em>Out base</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.dataset#getEcl_vars <em>Ecl vars</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.dataset#getOp_base <em>Op base</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getdataset()
 * @model
 * @generated
 */
public interface dataset extends datatype, input_value, output_value
{
  /**
   * Returns the value of the '<em><b>Input ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.input_options}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getdataset_Input_ops()
   * @model containment="true"
   * @generated
   */
  EList<input_options> getInput_ops();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.field_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getdataset_Fields()
   * @model containment="true"
   * @generated
   */
  EList<field_decl> getFields();

  /**
   * Returns the value of the '<em><b>Out base</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.outputbase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out base</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out base</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getdataset_Out_base()
   * @model containment="true"
   * @generated
   */
  EList<outputbase> getOut_base();

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getdataset_Ecl_vars()
   * @model containment="true"
   * @generated
   */
  EList<ecloutput_decl> getEcl_vars();

  /**
   * Returns the value of the '<em><b>Op base</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.outputbase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op base</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op base</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getdataset_Op_base()
   * @model containment="true"
   * @generated
   */
  EList<outputbase> getOp_base();

} // dataset
