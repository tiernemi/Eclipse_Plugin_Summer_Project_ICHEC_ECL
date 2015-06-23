/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.hipie.hIPIE.HIPIEFactory
 * @model kind="package"
 * @generated
 */
public interface HIPIEPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hIPIE";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/hipie/HIPIE";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hIPIE";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HIPIEPackage eINSTANCE = org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.programImpl <em>program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.programImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getprogram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The number of structural features of the '<em>program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.program <em>program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>program</em>'.
   * @see org.xtext.hipie.hIPIE.program
   * @generated
   */
  EClass getprogram();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HIPIEFactory getHIPIEFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.programImpl <em>program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.programImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getprogram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getprogram();

  }

} //HIPIEPackage
