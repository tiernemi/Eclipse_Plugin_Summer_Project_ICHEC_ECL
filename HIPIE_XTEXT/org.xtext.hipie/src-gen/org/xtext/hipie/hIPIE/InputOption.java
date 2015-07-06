/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.InputOption#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.InputOption#getForm_op <em>Form op</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.InputOption#getAssigns_list <em>Assigns list</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.InputOption#getType_op <em>Type op</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.InputOption#getVals <em>Vals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputOption()
 * @model
 * @generated
 */
public interface InputOption extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputOption_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.InputOption#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Form op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form op</em>' attribute.
   * @see #setForm_op(String)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputOption_Form_op()
   * @model
   * @generated
   */
  String getForm_op();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.InputOption#getForm_op <em>Form op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form op</em>' attribute.
   * @see #getForm_op()
   * @generated
   */
  void setForm_op(String value);

  /**
   * Returns the value of the '<em><b>Assigns list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns list</em>' containment reference.
   * @see #setAssigns_list(AssignList)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputOption_Assigns_list()
   * @model containment="true"
   * @generated
   */
  AssignList getAssigns_list();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.InputOption#getAssigns_list <em>Assigns list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assigns list</em>' containment reference.
   * @see #getAssigns_list()
   * @generated
   */
  void setAssigns_list(AssignList value);

  /**
   * Returns the value of the '<em><b>Type op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type op</em>' containment reference.
   * @see #setType_op(InputtypeOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputOption_Type_op()
   * @model containment="true"
   * @generated
   */
  InputtypeOptions getType_op();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.InputOption#getType_op <em>Type op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type op</em>' containment reference.
   * @see #getType_op()
   * @generated
   */
  void setType_op(InputtypeOptions value);

  /**
   * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ValueList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vals</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getInputOption_Vals()
   * @model containment="true"
   * @generated
   */
  EList<ValueList> getVals();

} // InputOption
