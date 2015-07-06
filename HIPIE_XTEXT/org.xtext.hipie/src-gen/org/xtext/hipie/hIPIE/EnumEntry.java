/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.EnumEntry#getVal_l <em>Val l</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.EnumEntry#getVal_r <em>Val r</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumEntry()
 * @model
 * @generated
 */
public interface EnumEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Val l</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val l</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val l</em>' containment reference.
   * @see #setVal_l(Value)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumEntry_Val_l()
   * @model containment="true"
   * @generated
   */
  Value getVal_l();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.EnumEntry#getVal_l <em>Val l</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val l</em>' containment reference.
   * @see #getVal_l()
   * @generated
   */
  void setVal_l(Value value);

  /**
   * Returns the value of the '<em><b>Val r</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val r</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val r</em>' containment reference.
   * @see #setVal_r(Value)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getEnumEntry_Val_r()
   * @model containment="true"
   * @generated
   */
  Value getVal_r();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.EnumEntry#getVal_r <em>Val r</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val r</em>' containment reference.
   * @see #getVal_r()
   * @generated
   */
  void setVal_r(Value value);

} // EnumEntry
