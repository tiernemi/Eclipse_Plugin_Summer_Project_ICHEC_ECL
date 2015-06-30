/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getComposition_Header <em>Composition Header</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getBase_Props <em>Base Props</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getContract_Instances <em>Contract Instances</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getInput_Section <em>Input Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getOutput_Section <em>Output Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getVisual_Section <em>Visual Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getGenerate_Section <em>Generate Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getCustom_Section <em>Custom Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.program#getResource_Section <em>Resource Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram()
 * @model
 * @generated
 */
public interface program extends EObject
{
  /**
   * Returns the value of the '<em><b>Composition Header</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.composition_header}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composition Header</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition Header</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Composition_Header()
   * @model containment="true"
   * @generated
   */
  EList<composition_header> getComposition_Header();

  /**
   * Returns the value of the '<em><b>Base Props</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.base_prop}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Props</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Props</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Base_Props()
   * @model containment="true"
   * @generated
   */
  EList<base_prop> getBase_Props();

  /**
   * Returns the value of the '<em><b>Contract Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.contract_instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contract Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract Instances</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Contract_Instances()
   * @model containment="true"
   * @generated
   */
  EList<contract_instance> getContract_Instances();

  /**
   * Returns the value of the '<em><b>Input Section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.InputSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Input_Section()
   * @model containment="true"
   * @generated
   */
  EList<InputSection> getInput_Section();

  /**
   * Returns the value of the '<em><b>Output Section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.OutputSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Output_Section()
   * @model containment="true"
   * @generated
   */
  EList<OutputSection> getOutput_Section();

  /**
   * Returns the value of the '<em><b>Visual Section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.VisualSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visual Section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visual Section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Visual_Section()
   * @model containment="true"
   * @generated
   */
  EList<VisualSection> getVisual_Section();

  /**
   * Returns the value of the '<em><b>Generate Section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.generate_section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate Section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Generate_Section()
   * @model containment="true"
   * @generated
   */
  EList<generate_section> getGenerate_Section();

  /**
   * Returns the value of the '<em><b>Custom Section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.custom_section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Custom_Section()
   * @model containment="true"
   * @generated
   */
  EList<custom_section> getCustom_Section();

  /**
   * Returns the value of the '<em><b>Resource Section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.resource_section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getprogram_Resource_Section()
   * @model containment="true"
   * @generated
   */
  EList<resource_section> getResource_Section();

} // program
