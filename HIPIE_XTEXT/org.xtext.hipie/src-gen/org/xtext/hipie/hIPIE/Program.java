/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getComposition_header <em>Composition header</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getBase_props <em>Base props</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getContract_instances <em>Contract instances</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getInput_section <em>Input section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getOutput_section <em>Output section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getVisual_section <em>Visual section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getGenerate_section <em>Generate section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getCustom_section <em>Custom section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Program#getSesource_section <em>Sesource section</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Composition header</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.CompositionHeader}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composition header</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition header</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Composition_header()
   * @model containment="true"
   * @generated
   */
  EList<CompositionHeader> getComposition_header();

  /**
   * Returns the value of the '<em><b>Base props</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.BaseProp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base props</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base props</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Base_props()
   * @model containment="true"
   * @generated
   */
  EList<BaseProp> getBase_props();

  /**
   * Returns the value of the '<em><b>Contract instances</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ContractInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contract instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract instances</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Contract_instances()
   * @model containment="true"
   * @generated
   */
  EList<ContractInstance> getContract_instances();

  /**
   * Returns the value of the '<em><b>Input section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.InputSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Input_section()
   * @model containment="true"
   * @generated
   */
  EList<InputSection> getInput_section();

  /**
   * Returns the value of the '<em><b>Output section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.OutputSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Output_section()
   * @model containment="true"
   * @generated
   */
  EList<OutputSection> getOutput_section();

  /**
   * Returns the value of the '<em><b>Visual section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.VisualSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visual section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visual section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Visual_section()
   * @model containment="true"
   * @generated
   */
  EList<VisualSection> getVisual_section();

  /**
   * Returns the value of the '<em><b>Generate section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.GenerateSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Generate_section()
   * @model containment="true"
   * @generated
   */
  EList<GenerateSection> getGenerate_section();

  /**
   * Returns the value of the '<em><b>Custom section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.CustomSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Custom_section()
   * @model containment="true"
   * @generated
   */
  EList<CustomSection> getCustom_section();

  /**
   * Returns the value of the '<em><b>Sesource section</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ResourceSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sesource section</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sesource section</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getProgram_Sesource_section()
   * @model containment="true"
   * @generated
   */
  EList<ResourceSection> getSesource_section();

} // Program
