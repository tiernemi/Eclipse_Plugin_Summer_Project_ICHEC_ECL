/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Section Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualSectionOption#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualSectionOption#getVals <em>Vals</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualSectionOption#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSectionOption()
 * @model
 * @generated
 */
public interface VisualSectionOption extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSectionOption_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualSectionOption#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference.
   * @see #setVals(Value)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSectionOption_Vals()
   * @model containment="true"
   * @generated
   */
  Value getVals();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualSectionOption#getVals <em>Vals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vals</em>' containment reference.
   * @see #getVals()
   * @generated
   */
  void setVals(Value value);

  /**
   * Returns the value of the '<em><b>Assigns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns</em>' containment reference.
   * @see #setAssigns(AssignList)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualSectionOption_Assigns()
   * @model containment="true"
   * @generated
   */
  AssignList getAssigns();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualSectionOption#getAssigns <em>Assigns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assigns</em>' containment reference.
   * @see #getAssigns()
   * @generated
   */
  void setAssigns(AssignList value);

} // VisualSectionOption
