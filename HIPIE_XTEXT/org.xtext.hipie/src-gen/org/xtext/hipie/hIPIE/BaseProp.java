/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Prop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.BaseProp#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.BaseProp#getVal_list <em>Val list</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.BaseProp#getCat_list <em>Cat list</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getBaseProp()
 * @model
 * @generated
 */
public interface BaseProp extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getBaseProp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.BaseProp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Val list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val list</em>' containment reference.
   * @see #setVal_list(ValueList)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getBaseProp_Val_list()
   * @model containment="true"
   * @generated
   */
  ValueList getVal_list();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.BaseProp#getVal_list <em>Val list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val list</em>' containment reference.
   * @see #getVal_list()
   * @generated
   */
  void setVal_list(ValueList value);

  /**
   * Returns the value of the '<em><b>Cat list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cat list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cat list</em>' containment reference.
   * @see #setCat_list(CategoryTypeList)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getBaseProp_Cat_list()
   * @model containment="true"
   * @generated
   */
  CategoryTypeList getCat_list();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.BaseProp#getCat_list <em>Cat list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cat list</em>' containment reference.
   * @see #getCat_list()
   * @generated
   */
  void setCat_list(CategoryTypeList value);

} // BaseProp
