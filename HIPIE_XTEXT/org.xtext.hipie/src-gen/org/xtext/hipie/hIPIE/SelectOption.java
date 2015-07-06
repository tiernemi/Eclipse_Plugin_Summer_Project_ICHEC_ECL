/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.SelectOption#getMaps <em>Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getSelectOption()
 * @model
 * @generated
 */
public interface SelectOption extends VisualOption
{
  /**
   * Returns the value of the '<em><b>Maps</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maps</em>' attribute list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getSelectOption_Maps()
   * @model unique="false"
   * @generated
   */
  EList<String> getMaps();

} // SelectOption
