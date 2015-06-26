/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>visual option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.visual_option#getVis_ops <em>Vis ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.visual_option#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.visual_option#getFuncs <em>Funcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvisual_option()
 * @model
 * @generated
 */
public interface visual_option extends visual_options
{
  /**
   * Returns the value of the '<em><b>Vis ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.visual_option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vis ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vis ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvisual_option_Vis_ops()
   * @model containment="true"
   * @generated
   */
  EList<visual_option> getVis_ops();

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvisual_option_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.visual_option#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Funcs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funcs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funcs</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getvisual_option_Funcs()
   * @model containment="true"
   * @generated
   */
  EList<function> getFuncs();

} // visual_option
