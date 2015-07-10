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
 *   <li>{@link org.xtext.hipie.hIPIE.VisualSection#getSection_name <em>Section name</em>}</li>
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
   * Returns the value of the '<em><b>Section name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Section name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Section name</em>' attribute.
   * @see #setSection_name(String)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSection_Section_name()
   * @model
   * @generated
   */
  String getSection_name();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualSection#getSection_name <em>Section name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Section name</em>' attribute.
   * @see #getSection_name()
   * @generated
   */
  void setSection_name(String value);

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
   * Returns the value of the '<em><b>Vis ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vis ops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vis ops</em>' containment reference.
   * @see #setVis_ops(VisualSectionOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSection_Vis_ops()
   * @model containment="true"
   * @generated
   */
  VisualSectionOptions getVis_ops();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualSection#getVis_ops <em>Vis ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vis ops</em>' containment reference.
   * @see #getVis_ops()
   * @generated
   */
  void setVis_ops(VisualSectionOptions value);

  /**
   * Returns the value of the '<em><b>Vis elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.Visualization}.
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
  EList<Visualization> getVis_elements();

} // VisualSection
