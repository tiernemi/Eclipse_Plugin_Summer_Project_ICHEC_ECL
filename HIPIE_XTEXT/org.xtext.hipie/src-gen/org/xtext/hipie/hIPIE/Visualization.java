/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.Visualization#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Visualization#getInput <em>Input</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.Visualization#getVis_op <em>Vis op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualization()
 * @model
 * @generated
 */
public interface Visualization extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualization_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Visualization#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(VisBasis)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualization_Input()
   * @model containment="true"
   * @generated
   */
  VisBasis getInput();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Visualization#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(VisBasis value);

  /**
   * Returns the value of the '<em><b>Vis op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vis op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vis op</em>' containment reference.
   * @see #setVis_op(VisualOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualization_Vis_op()
   * @model containment="true"
   * @generated
   */
  VisualOptions getVis_op();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.Visualization#getVis_op <em>Vis op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vis op</em>' containment reference.
   * @see #getVis_op()
   * @generated
   */
  void setVis_op(VisualOptions value);

} // Visualization
