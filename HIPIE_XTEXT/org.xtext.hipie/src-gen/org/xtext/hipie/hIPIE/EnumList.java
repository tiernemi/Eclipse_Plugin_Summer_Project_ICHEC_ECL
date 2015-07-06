/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.EnumList#getEn_ents <em>En ents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumList()
 * @model
 * @generated
 */
public interface EnumList extends EObject
{
  /**
   * Returns the value of the '<em><b>En ents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.EnumEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>En ents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>En ents</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumList_En_ents()
   * @model containment="true"
   * @generated
   */
  EList<EnumEntry> getEn_ents();

} // EnumList
