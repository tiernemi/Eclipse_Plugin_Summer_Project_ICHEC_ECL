/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.CategoryTypeList#getCats <em>Cats</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getCategoryTypeList()
 * @model
 * @generated
 */
public interface CategoryTypeList extends EObject
{
  /**
   * Returns the value of the '<em><b>Cats</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.CategoryType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cats</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cats</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getCategoryTypeList_Cats()
   * @model containment="true"
   * @generated
   */
  EList<CategoryType> getCats();

} // CategoryTypeList
