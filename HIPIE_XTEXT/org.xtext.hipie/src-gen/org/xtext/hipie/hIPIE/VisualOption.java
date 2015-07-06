/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualOption#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualOption#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualOption#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualOption#getVis_cust <em>Vis cust</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualOption#getVisibility_op <em>Visibility op</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.VisualOption#getAssigns <em>Assigns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualOption()
 * @model
 * @generated
 */
public interface VisualOption extends EObject
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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualOption_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualOption#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Funcs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funcs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funcs</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualOption_Funcs()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFuncs();

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference.
   * @see #setDecl(VizEnumDecl)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualOption_Decl()
   * @model containment="true"
   * @generated
   */
  VizEnumDecl getDecl();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualOption#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(VizEnumDecl value);

  /**
   * Returns the value of the '<em><b>Vis cust</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vis cust</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vis cust</em>' containment reference.
   * @see #setVis_cust(VisualCustomOption)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualOption_Vis_cust()
   * @model containment="true"
   * @generated
   */
  VisualCustomOption getVis_cust();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualOption#getVis_cust <em>Vis cust</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vis cust</em>' containment reference.
   * @see #getVis_cust()
   * @generated
   */
  void setVis_cust(VisualCustomOption value);

  /**
   * Returns the value of the '<em><b>Visibility op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility op</em>' containment reference.
   * @see #setVisibility_op(VisibilityOption)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualOption_Visibility_op()
   * @model containment="true"
   * @generated
   */
  VisibilityOption getVisibility_op();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.VisualOption#getVisibility_op <em>Visibility op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility op</em>' containment reference.
   * @see #getVisibility_op()
   * @generated
   */
  void setVisibility_op(VisibilityOption value);

  /**
   * Returns the value of the '<em><b>Assigns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.AssignList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigns</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getVisualOption_Assigns()
   * @model containment="true"
   * @generated
   */
  EList<AssignList> getAssigns();

} // VisualOption
