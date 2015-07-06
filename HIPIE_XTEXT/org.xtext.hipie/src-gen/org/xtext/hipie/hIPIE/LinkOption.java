/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.LinkOption#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getLinkOption()
 * @model
 * @generated
 */
public interface LinkOption extends VisualOption
{
  /**
   * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.VisualOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getLinkOption_Ops()
   * @model containment="true"
   * @generated
   */
  EList<VisualOption> getOps();

} // LinkOption
