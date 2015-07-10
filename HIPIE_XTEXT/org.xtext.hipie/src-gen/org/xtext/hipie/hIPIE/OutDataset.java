/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.OutDataset#getOptions <em>Options</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutDataset#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutDataset#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutDataset#getOut_base <em>Out base</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutDataset#getOps <em>Ops</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutDataset#getEcl_vars <em>Ecl vars</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutDataset()
 * @model
 * @generated
 */
public interface OutDataset extends NestedDatasetDecl, OutputValue
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(OutputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutDataset_Options()
   * @model containment="true"
   * @generated
   */
  OutputOptions getOptions();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutDataset#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(OutputOptions value);

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ECLOutputDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutDataset_Decl()
   * @model containment="true"
   * @generated
   */
  EList<ECLOutputDecl> getDecl();

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutDataset_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutDataset#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Out base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out base</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out base</em>' containment reference.
   * @see #setOut_base(OutputBase)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutDataset_Out_base()
   * @model containment="true"
   * @generated
   */
  OutputBase getOut_base();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutDataset#getOut_base <em>Out base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out base</em>' containment reference.
   * @see #getOut_base()
   * @generated
   */
  void setOut_base(OutputBase value);

  /**
   * Returns the value of the '<em><b>Ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' containment reference.
   * @see #setOps(OutputOptions)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutDataset_Ops()
   * @model containment="true"
   * @generated
   */
  OutputOptions getOps();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutDataset#getOps <em>Ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ops</em>' containment reference.
   * @see #getOps()
   * @generated
   */
  void setOps(OutputOptions value);

  /**
   * Returns the value of the '<em><b>Ecl vars</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hipie.hIPIE.ECLOutputDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecl vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecl vars</em>' containment reference list.
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutDataset_Ecl_vars()
   * @model containment="true"
   * @generated
   */
  EList<ECLOutputDecl> getEcl_vars();

} // OutDataset
