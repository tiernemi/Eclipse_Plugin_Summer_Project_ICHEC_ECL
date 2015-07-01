/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Section Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualSectionOptions#getVis_ops <em>Vis ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSectionOptions()
 * @model
 * @generated
 */
public interface VisualSectionOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Vis ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.VisualSectionOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vis ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vis ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSectionOptions_Vis_ops()
   * @model containment="true"
   * @generated
   */
  EList<VisualSectionOption> getVis_ops();

} // VisualSectionOptions
