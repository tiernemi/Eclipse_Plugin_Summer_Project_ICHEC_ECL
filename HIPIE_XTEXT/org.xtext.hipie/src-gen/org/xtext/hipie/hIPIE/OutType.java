/**
 */
package org.xtext.hipie.hIPIE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.OutType#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.OutType#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutType()
 * @model
 * @generated
 */
public interface OutType extends OutputValue
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(Value)
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutType_Val()
   * @model containment="true"
   * @generated
   */
  Value getVal();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutType#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(Value value);

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
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#getOutType_Ops()
   * @model containment="true"
   * @generated
   */
  OutputOptions getOps();

  /**
   * Sets the value of the '{@link org.xtext.hipie.hIPIE.OutType#getOps <em>Ops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ops</em>' containment reference.
   * @see #getOps()
   * @generated
   */
  void setOps(OutputOptions value);

} // OutType
