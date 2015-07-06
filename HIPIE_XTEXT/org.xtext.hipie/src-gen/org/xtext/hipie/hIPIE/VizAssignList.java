/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viz Assign List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VizAssignList#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVizAssignList()
 * @model
 * @generated
 */
public interface VizAssignList extends EObject
{
  /**
   * Returns the value of the '<em><b>Assigns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.VizAssign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVizAssignList_Assigns()
   * @model containment="true"
   * @generated
   */
  EList<VizAssign> getAssigns();

} // VizAssignList
