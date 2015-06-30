/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualSection#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualSection#getVis_ops <em>Vis ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualSection#getVis_elements <em>Vis elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSection()
 * @model
 * @generated
 */
public interface VisualSection extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualSection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vis ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.visual_section_options}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vis ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vis ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSection_Vis_ops()
   * @model containment="true"
   * @generated
   */
  EList<visual_section_options> getVis_ops();

  /**
   * Returns the value of the '<em><b>Vis elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.visualization}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vis elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vis elements</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSection_Vis_elements()
   * @model containment="true"
   * @generated
   */
  EList<visualization> getVis_elements();

} // VisualSection
