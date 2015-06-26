/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
   * The feature id for the '<em><b>Composition Header</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__COMPOSITION_HEADER = 0;

  /**
   * The feature id for the '<em><b>Base Props</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__BASE_PROPS = 1;

  /**
   * The feature id for the '<em><b>Contract Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CONTRACT_INSTANCES = 2;

  /**
   * The feature id for the '<em><b>Input Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INPUT_SECTION = 3;

  /**
   * The feature id for the '<em><b>Output Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__OUTPUT_SECTION = 4;

  /**
   * The feature id for the '<em><b>Visual Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__VISUAL_SECTION = 5;

  /**
   * The feature id for the '<em><b>Generate Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__GENERATE_SECTION = 6;

  /**
   * The feature id for the '<em><b>Custom Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CUSTOM_SECTION = 7;

  /**
   * The feature id for the '<em><b>Resource Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__RESOURCE_SECTION = 8;

  /**
   * The number of structural features of the '<em>program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.base_propImpl <em>base prop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.base_propImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getbase_prop()
   * @generated
   */
  int BASE_PROP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_PROP__NAME = 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_PROP__VALS = 1;

  /**
   * The feature id for the '<em><b>Cats</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_PROP__CATS = 2;

  /**
   * The number of structural features of the '<em>base prop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_PROP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.category_type_listImpl <em>category type list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.category_type_listImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcategory_type_list()
   * @generated
   */
  int CATEGORY_TYPE_LIST = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE_LIST__NAME = 0;

  /**
   * The number of structural features of the '<em>category type list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.value_listImpl <em>value list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.value_listImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvalue_list()
   * @generated
   */
  int VALUE_LIST = 4;

  /**
   * The number of structural features of the '<em>value list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.valueImpl <em>value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.valueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvalue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The feature id for the '<em><b>Assign internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__ASSIGN_INTERNAL = VALUE_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__OPS = VALUE_LIST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__FUNCS = VALUE_LIST_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NAME = VALUE_LIST_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__TYPE = VALUE_LIST_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VALS = VALUE_LIST_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Res ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__RES_OPS = VALUE_LIST_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = VALUE_LIST_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.assign_listImpl <em>assign list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.assign_listImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getassign_list()
   * @generated
   */
  int ASSIGN_LIST = 6;

  /**
   * The number of structural features of the '<em>assign list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.assignImpl <em>assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.assignImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getassign()
   * @generated
   */
  int ASSIGN = 5;

  /**
   * The feature id for the '<em><b>Assign internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__ASSIGN_INTERNAL = ASSIGN_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = ASSIGN_LIST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.composition_headerImpl <em>composition header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.composition_headerImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcomposition_header()
   * @generated
   */
  int COMPOSITION_HEADER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_HEADER__NAME = 0;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_HEADER__ASSIGNS = 1;

  /**
   * The number of structural features of the '<em>composition header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.contract_instanceImpl <em>contract instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.contract_instanceImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcontract_instance()
   * @generated
   */
  int CONTRACT_INSTANCE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE__VALS = 1;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE__VARS = 2;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE__ASSIGNS = 3;

  /**
   * The number of structural features of the '<em>contract instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.field_declImpl <em>field decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.field_declImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getfield_decl()
   * @generated
   */
  int FIELD_DECL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Input internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__INPUT_INTERNAL = 1;

  /**
   * The number of structural features of the '<em>field decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.input_valueImpl <em>input value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.input_valueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getinput_value()
   * @generated
   */
  int INPUT_VALUE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>input value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.enum_declImpl <em>enum decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.enum_declImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getenum_decl()
   * @generated
   */
  int ENUM_DECL = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__NAME = INPUT_VALUE__NAME;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__VALS = INPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__ASSIGNS = INPUT_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__INPUT_OPS = INPUT_VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>enum decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL_FEATURE_COUNT = INPUT_VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.input_sectionImpl <em>input section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.input_sectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getinput_section()
   * @generated
   */
  int INPUT_SECTION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SECTION__INPUTS = 1;

  /**
   * The number of structural features of the '<em>input section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.datatypeImpl <em>datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.datatypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getdatatype()
   * @generated
   */
  int DATATYPE = 18;

  /**
   * The number of structural features of the '<em>datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.boolImpl <em>bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.boolImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getbool()
   * @generated
   */
  int BOOL = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__FIELDS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__INPUT_OPS = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.int_varImpl <em>int var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.int_varImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getint_var()
   * @generated
   */
  int INT_VAR = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__FIELDS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__INPUT_OPS = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>int var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.string_varImpl <em>string var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.string_varImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getstring_var()
   * @generated
   */
  int STRING_VAR = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__FIELDS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__INPUT_OPS = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>string var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.recordImpl <em>record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.recordImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getrecord()
   * @generated
   */
  int RECORD = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__INPUT_OPS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.datasetImpl <em>dataset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.datasetImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getdataset()
   * @generated
   */
  int DATASET = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__OPS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__INPUT_OPS = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__FIELDS = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Out base</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__OUT_BASE = DATATYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ecl vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__ECL_VARS = DATATYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Op base</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__OP_BASE = DATATYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>dataset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.groupImpl <em>group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.groupImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getgroup()
   * @generated
   */
  int GROUP = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = INPUT_VALUE__NAME;

  /**
   * The feature id for the '<em><b>Input internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__INPUT_INTERNAL = INPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__VALUES = INPUT_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = INPUT_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.input_optionsImpl <em>input options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.input_optionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getinput_options()
   * @generated
   */
  int INPUT_OPTIONS = 20;

  /**
   * The number of structural features of the '<em>input options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.input_optionImpl <em>input option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.input_optionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getinput_option()
   * @generated
   */
  int INPUT_OPTION = 21;

  /**
   * The feature id for the '<em><b>Input internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__INPUT_INTERNAL = INPUT_OPTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__NAME = INPUT_OPTIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Assigns internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__ASSIGNS_INTERNAL = INPUT_OPTIONS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__VALS = INPUT_OPTIONS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>input option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION_FEATURE_COUNT = INPUT_OPTIONS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.output_sectionImpl <em>output section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.output_sectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutput_section()
   * @generated
   */
  int OUTPUT_SECTION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SECTION__OUTPUTS = 1;

  /**
   * The number of structural features of the '<em>output section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.outfield_declImpl <em>outfield decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.outfield_declImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutfield_decl()
   * @generated
   */
  int OUTFIELD_DECL = 23;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTFIELD_DECL__FIELDS = 0;

  /**
   * The number of structural features of the '<em>outfield decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTFIELD_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecloutput_declImpl <em>ecloutput decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecloutput_declImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecloutput_decl()
   * @generated
   */
  int ECLOUTPUT_DECL = 34;

  /**
   * The number of structural features of the '<em>ecloutput decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLOUTPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.eclfield_typeImpl <em>eclfield type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.eclfield_typeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#geteclfield_type()
   * @generated
   */
  int ECLFIELD_TYPE = 33;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLFIELD_TYPE__OPTIONS = ECLOUTPUT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLFIELD_TYPE__NAME = ECLOUTPUT_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>eclfield type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLFIELD_TYPE_FEATURE_COUNT = ECLOUTPUT_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_integerImpl <em>ecl integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_integerImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_integer()
   * @generated
   */
  int ECL_INTEGER = 24;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_INTEGER__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_INTEGER__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_INTEGER_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_unsignedImpl <em>ecl unsigned</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_unsignedImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_unsigned()
   * @generated
   */
  int ECL_UNSIGNED = 25;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNSIGNED__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNSIGNED__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl unsigned</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNSIGNED_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_stringImpl <em>ecl string</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_stringImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_string()
   * @generated
   */
  int ECL_STRING = 26;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_STRING__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_STRING__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl string</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_STRING_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_qstringImpl <em>ecl qstring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_qstringImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_qstring()
   * @generated
   */
  int ECL_QSTRING = 27;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_QSTRING__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_QSTRING__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl qstring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_QSTRING_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_varstringImpl <em>ecl varstring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_varstringImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_varstring()
   * @generated
   */
  int ECL_VARSTRING = 28;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARSTRING__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARSTRING__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl varstring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARSTRING_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_unicodeImpl <em>ecl unicode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_unicodeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_unicode()
   * @generated
   */
  int ECL_UNICODE = 29;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNICODE__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNICODE__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl unicode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNICODE_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_varunicodeImpl <em>ecl varunicode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_varunicodeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_varunicode()
   * @generated
   */
  int ECL_VARUNICODE = 30;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARUNICODE__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARUNICODE__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl varunicode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARUNICODE_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_dataImpl <em>ecl data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_dataImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_data()
   * @generated
   */
  int ECL_DATA = 31;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DATA__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DATA__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DATA_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ecl_realImpl <em>ecl real</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ecl_realImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_real()
   * @generated
   */
  int ECL_REAL = 32;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REAL__OPTIONS = ECLFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REAL__NAME = ECLFIELD_TYPE__NAME;

  /**
   * The number of structural features of the '<em>ecl real</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REAL_FEATURE_COUNT = ECLFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.output_optionsImpl <em>output options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.output_optionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutput_options()
   * @generated
   */
  int OUTPUT_OPTIONS = 36;

  /**
   * The number of structural features of the '<em>output options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.output_optionImpl <em>output option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.output_optionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutput_option()
   * @generated
   */
  int OUTPUT_OPTION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__NAME = OUTPUT_OPTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__VARS = OUTPUT_OPTIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__VALS = OUTPUT_OPTIONS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Output internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__OUTPUT_INTERNAL = OUTPUT_OPTIONS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>output option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION_FEATURE_COUNT = OUTPUT_OPTIONS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.output_valueImpl <em>output value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.output_valueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutput_value()
   * @generated
   */
  int OUTPUT_VALUE = 38;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_VALUE__OPS = 0;

  /**
   * The number of structural features of the '<em>output value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.out_typeImpl <em>out type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.out_typeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getout_type()
   * @generated
   */
  int OUT_TYPE = 37;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TYPE__OPS = OUTPUT_VALUE__OPS;

  /**
   * The number of structural features of the '<em>out type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TYPE_FEATURE_COUNT = OUTPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.outputbaseImpl <em>outputbase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.outputbaseImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutputbase()
   * @generated
   */
  int OUTPUTBASE = 39;

  /**
   * The feature id for the '<em><b>Actions</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUTBASE__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>outputbase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUTBASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.generate_sectionImpl <em>generate section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.generate_sectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getgenerate_section()
   * @generated
   */
  int GENERATE_SECTION = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_SECTION__BODY = 1;

  /**
   * The number of structural features of the '<em>generate section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.generate_bodyImpl <em>generate body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.generate_bodyImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getgenerate_body()
   * @generated
   */
  int GENERATE_BODY = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_BODY__NAME = 0;

  /**
   * The number of structural features of the '<em>generate body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.visual_sectionImpl <em>visual section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.visual_sectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_section()
   * @generated
   */
  int VISUAL_SECTION = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION__VIS_OPS = 1;

  /**
   * The feature id for the '<em><b>Vis elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION__VIS_ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>visual section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.visualizationImpl <em>visualization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.visualizationImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisualization()
   * @generated
   */
  int VISUALIZATION = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__INPUTS = 1;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__VIS_OPS = 2;

  /**
   * The number of structural features of the '<em>visualization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.vis_basisImpl <em>vis basis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.vis_basisImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvis_basis()
   * @generated
   */
  int VIS_BASIS = 44;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS__VARS = 0;

  /**
   * The feature id for the '<em><b>Quals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS__QUALS = 1;

  /**
   * The number of structural features of the '<em>vis basis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.vis_basis_qualifiersImpl <em>vis basis qualifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.vis_basis_qualifiersImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvis_basis_qualifiers()
   * @generated
   */
  int VIS_BASIS_QUALIFIERS = 45;

  /**
   * The number of structural features of the '<em>vis basis qualifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_QUALIFIERS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.functionImpl <em>function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.functionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getfunction()
   * @generated
   */
  int FUNCTION = 46;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FUNCS = VIS_BASIS_QUALIFIERS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = VIS_BASIS_QUALIFIERS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = VIS_BASIS_QUALIFIERS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.visual_section_optionsImpl <em>visual section options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.visual_section_optionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_section_options()
   * @generated
   */
  int VISUAL_SECTION_OPTIONS = 47;

  /**
   * The number of structural features of the '<em>visual section options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.visual_section_optionImpl <em>visual section option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.visual_section_optionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_section_option()
   * @generated
   */
  int VISUAL_SECTION_OPTION = 48;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION__VIS_OPS = VISUAL_SECTION_OPTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION__NAME = VISUAL_SECTION_OPTIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION__VALS = VISUAL_SECTION_OPTIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>visual section option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION_FEATURE_COUNT = VISUAL_SECTION_OPTIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.visual_optionsImpl <em>visual options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.visual_optionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_options()
   * @generated
   */
  int VISUAL_OPTIONS = 49;

  /**
   * The number of structural features of the '<em>visual options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.visual_optionImpl <em>visual option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.visual_optionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_option()
   * @generated
   */
  int VISUAL_OPTION = 50;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__VIS_OPS = VISUAL_OPTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__NAME = VISUAL_OPTIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__FUNCS = VISUAL_OPTIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>visual option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION_FEATURE_COUNT = VISUAL_OPTIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.visual_multivalImpl <em>visual multival</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.visual_multivalImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_multival()
   * @generated
   */
  int VISUAL_MULTIVAL = 51;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL__VIS_OPS = VISUAL_OPTION__VIS_OPS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL__NAME = VISUAL_OPTION__NAME;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL__FUNCS = VISUAL_OPTION__FUNCS;

  /**
   * The number of structural features of the '<em>visual multival</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL_FEATURE_COUNT = VISUAL_OPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.custom_sectionImpl <em>custom section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.custom_sectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcustom_section()
   * @generated
   */
  int CUSTOM_SECTION = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Cust vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_SECTION__CUST_VALS = 1;

  /**
   * The number of structural features of the '<em>custom section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.custom_valueImpl <em>custom value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.custom_valueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcustom_value()
   * @generated
   */
  int CUSTOM_VALUE = 53;

  /**
   * The number of structural features of the '<em>custom value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.resource_optionsImpl <em>resource options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.resource_optionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getresource_options()
   * @generated
   */
  int RESOURCE_OPTIONS = 55;

  /**
   * The number of structural features of the '<em>resource options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.resource_optionImpl <em>resource option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.resource_optionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getresource_option()
   * @generated
   */
  int RESOURCE_OPTION = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION__NAME = RESOURCE_OPTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION__VALS = RESOURCE_OPTIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Res ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION__RES_OPS = RESOURCE_OPTIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>resource option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION_FEATURE_COUNT = RESOURCE_OPTIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.resource_valueImpl <em>resource value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.resource_valueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getresource_value()
   * @generated
   */
  int RESOURCE_VALUE = 56;

  /**
   * The number of structural features of the '<em>resource value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.resource_sectionImpl <em>resource section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.resource_sectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getresource_section()
   * @generated
   */
  int RESOURCE_SECTION = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Res vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_SECTION__RES_VALS = 1;

  /**
   * The number of structural features of the '<em>resource section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_SECTION_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getComposition_Header <em>Composition Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Composition Header</em>'.
   * @see org.xtext.hipie.hIPIE.program#getComposition_Header()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Composition_Header();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getBase_Props <em>Base Props</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Base Props</em>'.
   * @see org.xtext.hipie.hIPIE.program#getBase_Props()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Base_Props();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getContract_Instances <em>Contract Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contract Instances</em>'.
   * @see org.xtext.hipie.hIPIE.program#getContract_Instances()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Contract_Instances();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getInput_Section <em>Input Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input Section</em>'.
   * @see org.xtext.hipie.hIPIE.program#getInput_Section()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Input_Section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getOutput_Section <em>Output Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output Section</em>'.
   * @see org.xtext.hipie.hIPIE.program#getOutput_Section()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Output_Section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getVisual_Section <em>Visual Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Visual Section</em>'.
   * @see org.xtext.hipie.hIPIE.program#getVisual_Section()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Visual_Section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getGenerate_Section <em>Generate Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generate Section</em>'.
   * @see org.xtext.hipie.hIPIE.program#getGenerate_Section()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Generate_Section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getCustom_Section <em>Custom Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Custom Section</em>'.
   * @see org.xtext.hipie.hIPIE.program#getCustom_Section()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Custom_Section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.program#getResource_Section <em>Resource Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource Section</em>'.
   * @see org.xtext.hipie.hIPIE.program#getResource_Section()
   * @see #getprogram()
   * @generated
   */
  EReference getprogram_Resource_Section();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.base_prop <em>base prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>base prop</em>'.
   * @see org.xtext.hipie.hIPIE.base_prop
   * @generated
   */
  EClass getbase_prop();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.base_prop#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.base_prop#getName()
   * @see #getbase_prop()
   * @generated
   */
  EAttribute getbase_prop_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.base_prop#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.base_prop#getVals()
   * @see #getbase_prop()
   * @generated
   */
  EReference getbase_prop_Vals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.base_prop#getCats <em>Cats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cats</em>'.
   * @see org.xtext.hipie.hIPIE.base_prop#getCats()
   * @see #getbase_prop()
   * @generated
   */
  EReference getbase_prop_Cats();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.category_type_list <em>category type list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>category type list</em>'.
   * @see org.xtext.hipie.hIPIE.category_type_list
   * @generated
   */
  EClass getcategory_type_list();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.category_type_list#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.category_type_list#getName()
   * @see #getcategory_type_list()
   * @generated
   */
  EAttribute getcategory_type_list_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.value <em>value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>value</em>'.
   * @see org.xtext.hipie.hIPIE.value
   * @generated
   */
  EClass getvalue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.value#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.hipie.hIPIE.value#getType()
   * @see #getvalue()
   * @generated
   */
  EAttribute getvalue_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.value#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.value#getVals()
   * @see #getvalue()
   * @generated
   */
  EReference getvalue_Vals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.value#getRes_ops <em>Res ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Res ops</em>'.
   * @see org.xtext.hipie.hIPIE.value#getRes_ops()
   * @see #getvalue()
   * @generated
   */
  EReference getvalue_Res_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.value_list <em>value list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>value list</em>'.
   * @see org.xtext.hipie.hIPIE.value_list
   * @generated
   */
  EClass getvalue_list();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.assign <em>assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assign</em>'.
   * @see org.xtext.hipie.hIPIE.assign
   * @generated
   */
  EClass getassign();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.assign#getAssign_internal <em>Assign internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assign internal</em>'.
   * @see org.xtext.hipie.hIPIE.assign#getAssign_internal()
   * @see #getassign()
   * @generated
   */
  EReference getassign_Assign_internal();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.assign_list <em>assign list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assign list</em>'.
   * @see org.xtext.hipie.hIPIE.assign_list
   * @generated
   */
  EClass getassign_list();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.composition_header <em>composition header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>composition header</em>'.
   * @see org.xtext.hipie.hIPIE.composition_header
   * @generated
   */
  EClass getcomposition_header();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.composition_header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.composition_header#getName()
   * @see #getcomposition_header()
   * @generated
   */
  EAttribute getcomposition_header_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.composition_header#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.composition_header#getAssigns()
   * @see #getcomposition_header()
   * @generated
   */
  EReference getcomposition_header_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.contract_instance <em>contract instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>contract instance</em>'.
   * @see org.xtext.hipie.hIPIE.contract_instance
   * @generated
   */
  EClass getcontract_instance();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.contract_instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.contract_instance#getName()
   * @see #getcontract_instance()
   * @generated
   */
  EAttribute getcontract_instance_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.contract_instance#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.contract_instance#getVals()
   * @see #getcontract_instance()
   * @generated
   */
  EReference getcontract_instance_Vals();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.hipie.hIPIE.contract_instance#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see org.xtext.hipie.hIPIE.contract_instance#getVars()
   * @see #getcontract_instance()
   * @generated
   */
  EReference getcontract_instance_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.contract_instance#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.contract_instance#getAssigns()
   * @see #getcontract_instance()
   * @generated
   */
  EReference getcontract_instance_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.field_decl <em>field decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field decl</em>'.
   * @see org.xtext.hipie.hIPIE.field_decl
   * @generated
   */
  EClass getfield_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.field_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.field_decl#getName()
   * @see #getfield_decl()
   * @generated
   */
  EAttribute getfield_decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.field_decl#getInput_internal <em>Input internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input internal</em>'.
   * @see org.xtext.hipie.hIPIE.field_decl#getInput_internal()
   * @see #getfield_decl()
   * @generated
   */
  EReference getfield_decl_Input_internal();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.enum_decl <em>enum decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enum decl</em>'.
   * @see org.xtext.hipie.hIPIE.enum_decl
   * @generated
   */
  EClass getenum_decl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.enum_decl#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.enum_decl#getVals()
   * @see #getenum_decl()
   * @generated
   */
  EReference getenum_decl_Vals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.enum_decl#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.enum_decl#getAssigns()
   * @see #getenum_decl()
   * @generated
   */
  EReference getenum_decl_Assigns();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.enum_decl#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.enum_decl#getInput_ops()
   * @see #getenum_decl()
   * @generated
   */
  EReference getenum_decl_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.input_section <em>input section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>input section</em>'.
   * @see org.xtext.hipie.hIPIE.input_section
   * @generated
   */
  EClass getinput_section();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.input_section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.input_section#getName()
   * @see #getinput_section()
   * @generated
   */
  EAttribute getinput_section_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.input_section#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see org.xtext.hipie.hIPIE.input_section#getInputs()
   * @see #getinput_section()
   * @generated
   */
  EReference getinput_section_Inputs();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.bool <em>bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bool</em>'.
   * @see org.xtext.hipie.hIPIE.bool
   * @generated
   */
  EClass getbool();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.bool#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.bool#getInput_ops()
   * @see #getbool()
   * @generated
   */
  EReference getbool_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.int_var <em>int var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>int var</em>'.
   * @see org.xtext.hipie.hIPIE.int_var
   * @generated
   */
  EClass getint_var();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.int_var#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.int_var#getInput_ops()
   * @see #getint_var()
   * @generated
   */
  EReference getint_var_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.string_var <em>string var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>string var</em>'.
   * @see org.xtext.hipie.hIPIE.string_var
   * @generated
   */
  EClass getstring_var();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.string_var#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.string_var#getInput_ops()
   * @see #getstring_var()
   * @generated
   */
  EReference getstring_var_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.record <em>record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>record</em>'.
   * @see org.xtext.hipie.hIPIE.record
   * @generated
   */
  EClass getrecord();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.record#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.record#getInput_ops()
   * @see #getrecord()
   * @generated
   */
  EReference getrecord_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.dataset <em>dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>dataset</em>'.
   * @see org.xtext.hipie.hIPIE.dataset
   * @generated
   */
  EClass getdataset();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.dataset#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.dataset#getInput_ops()
   * @see #getdataset()
   * @generated
   */
  EReference getdataset_Input_ops();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.dataset#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.xtext.hipie.hIPIE.dataset#getFields()
   * @see #getdataset()
   * @generated
   */
  EReference getdataset_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.dataset#getOut_base <em>Out base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Out base</em>'.
   * @see org.xtext.hipie.hIPIE.dataset#getOut_base()
   * @see #getdataset()
   * @generated
   */
  EReference getdataset_Out_base();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.dataset#getEcl_vars <em>Ecl vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ecl vars</em>'.
   * @see org.xtext.hipie.hIPIE.dataset#getEcl_vars()
   * @see #getdataset()
   * @generated
   */
  EReference getdataset_Ecl_vars();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.dataset#getOp_base <em>Op base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op base</em>'.
   * @see org.xtext.hipie.hIPIE.dataset#getOp_base()
   * @see #getdataset()
   * @generated
   */
  EReference getdataset_Op_base();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.group <em>group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>group</em>'.
   * @see org.xtext.hipie.hIPIE.group
   * @generated
   */
  EClass getgroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.group#getInput_internal <em>Input internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input internal</em>'.
   * @see org.xtext.hipie.hIPIE.group#getInput_internal()
   * @see #getgroup()
   * @generated
   */
  EReference getgroup_Input_internal();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.group#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.xtext.hipie.hIPIE.group#getValues()
   * @see #getgroup()
   * @generated
   */
  EReference getgroup_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.datatype <em>datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>datatype</em>'.
   * @see org.xtext.hipie.hIPIE.datatype
   * @generated
   */
  EClass getdatatype();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.input_value <em>input value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>input value</em>'.
   * @see org.xtext.hipie.hIPIE.input_value
   * @generated
   */
  EClass getinput_value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.input_value#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.input_value#getName()
   * @see #getinput_value()
   * @generated
   */
  EAttribute getinput_value_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.input_options <em>input options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>input options</em>'.
   * @see org.xtext.hipie.hIPIE.input_options
   * @generated
   */
  EClass getinput_options();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.input_option <em>input option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>input option</em>'.
   * @see org.xtext.hipie.hIPIE.input_option
   * @generated
   */
  EClass getinput_option();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.input_option#getInput_internal <em>Input internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input internal</em>'.
   * @see org.xtext.hipie.hIPIE.input_option#getInput_internal()
   * @see #getinput_option()
   * @generated
   */
  EReference getinput_option_Input_internal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.input_option#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.input_option#getName()
   * @see #getinput_option()
   * @generated
   */
  EAttribute getinput_option_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.input_option#getAssigns_internal <em>Assigns internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns internal</em>'.
   * @see org.xtext.hipie.hIPIE.input_option#getAssigns_internal()
   * @see #getinput_option()
   * @generated
   */
  EReference getinput_option_Assigns_internal();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.input_option#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.input_option#getVals()
   * @see #getinput_option()
   * @generated
   */
  EReference getinput_option_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.output_section <em>output section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>output section</em>'.
   * @see org.xtext.hipie.hIPIE.output_section
   * @generated
   */
  EClass getoutput_section();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.output_section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.output_section#getName()
   * @see #getoutput_section()
   * @generated
   */
  EAttribute getoutput_section_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.output_section#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see org.xtext.hipie.hIPIE.output_section#getOutputs()
   * @see #getoutput_section()
   * @generated
   */
  EReference getoutput_section_Outputs();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.outfield_decl <em>outfield decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>outfield decl</em>'.
   * @see org.xtext.hipie.hIPIE.outfield_decl
   * @generated
   */
  EClass getoutfield_decl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.outfield_decl#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.xtext.hipie.hIPIE.outfield_decl#getFields()
   * @see #getoutfield_decl()
   * @generated
   */
  EReference getoutfield_decl_Fields();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_integer <em>ecl integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl integer</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_integer
   * @generated
   */
  EClass getecl_integer();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_unsigned <em>ecl unsigned</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl unsigned</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_unsigned
   * @generated
   */
  EClass getecl_unsigned();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_string <em>ecl string</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl string</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_string
   * @generated
   */
  EClass getecl_string();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_qstring <em>ecl qstring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl qstring</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_qstring
   * @generated
   */
  EClass getecl_qstring();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_varstring <em>ecl varstring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl varstring</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_varstring
   * @generated
   */
  EClass getecl_varstring();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_unicode <em>ecl unicode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl unicode</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_unicode
   * @generated
   */
  EClass getecl_unicode();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_varunicode <em>ecl varunicode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl varunicode</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_varunicode
   * @generated
   */
  EClass getecl_varunicode();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_data <em>ecl data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl data</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_data
   * @generated
   */
  EClass getecl_data();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecl_real <em>ecl real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecl real</em>'.
   * @see org.xtext.hipie.hIPIE.ecl_real
   * @generated
   */
  EClass getecl_real();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.eclfield_type <em>eclfield type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>eclfield type</em>'.
   * @see org.xtext.hipie.hIPIE.eclfield_type
   * @generated
   */
  EClass geteclfield_type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.eclfield_type#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see org.xtext.hipie.hIPIE.eclfield_type#getOptions()
   * @see #geteclfield_type()
   * @generated
   */
  EReference geteclfield_type_Options();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.eclfield_type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.eclfield_type#getName()
   * @see #geteclfield_type()
   * @generated
   */
  EAttribute geteclfield_type_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ecloutput_decl <em>ecloutput decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ecloutput decl</em>'.
   * @see org.xtext.hipie.hIPIE.ecloutput_decl
   * @generated
   */
  EClass getecloutput_decl();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.output_option <em>output option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>output option</em>'.
   * @see org.xtext.hipie.hIPIE.output_option
   * @generated
   */
  EClass getoutput_option();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.output_option#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.output_option#getName()
   * @see #getoutput_option()
   * @generated
   */
  EAttribute getoutput_option_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.hipie.hIPIE.output_option#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see org.xtext.hipie.hIPIE.output_option#getVars()
   * @see #getoutput_option()
   * @generated
   */
  EReference getoutput_option_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.output_option#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.output_option#getVals()
   * @see #getoutput_option()
   * @generated
   */
  EReference getoutput_option_Vals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.output_option#getOutput_internal <em>Output internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output internal</em>'.
   * @see org.xtext.hipie.hIPIE.output_option#getOutput_internal()
   * @see #getoutput_option()
   * @generated
   */
  EReference getoutput_option_Output_internal();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.output_options <em>output options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>output options</em>'.
   * @see org.xtext.hipie.hIPIE.output_options
   * @generated
   */
  EClass getoutput_options();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.out_type <em>out type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>out type</em>'.
   * @see org.xtext.hipie.hIPIE.out_type
   * @generated
   */
  EClass getout_type();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.output_value <em>output value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>output value</em>'.
   * @see org.xtext.hipie.hIPIE.output_value
   * @generated
   */
  EClass getoutput_value();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.output_value#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ops</em>'.
   * @see org.xtext.hipie.hIPIE.output_value#getOps()
   * @see #getoutput_value()
   * @generated
   */
  EReference getoutput_value_Ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.outputbase <em>outputbase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>outputbase</em>'.
   * @see org.xtext.hipie.hIPIE.outputbase
   * @generated
   */
  EClass getoutputbase();

  /**
   * Returns the meta object for the reference '{@link org.xtext.hipie.hIPIE.outputbase#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actions</em>'.
   * @see org.xtext.hipie.hIPIE.outputbase#getActions()
   * @see #getoutputbase()
   * @generated
   */
  EReference getoutputbase_Actions();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.generate_section <em>generate section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>generate section</em>'.
   * @see org.xtext.hipie.hIPIE.generate_section
   * @generated
   */
  EClass getgenerate_section();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.generate_section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.generate_section#getName()
   * @see #getgenerate_section()
   * @generated
   */
  EAttribute getgenerate_section_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.generate_section#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.hipie.hIPIE.generate_section#getBody()
   * @see #getgenerate_section()
   * @generated
   */
  EReference getgenerate_section_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.generate_body <em>generate body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>generate body</em>'.
   * @see org.xtext.hipie.hIPIE.generate_body
   * @generated
   */
  EClass getgenerate_body();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.generate_body#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.generate_body#getName()
   * @see #getgenerate_body()
   * @generated
   */
  EAttribute getgenerate_body_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.visual_section <em>visual section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>visual section</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section
   * @generated
   */
  EClass getvisual_section();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.visual_section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section#getName()
   * @see #getvisual_section()
   * @generated
   */
  EAttribute getvisual_section_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.visual_section#getVis_ops <em>Vis ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vis ops</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section#getVis_ops()
   * @see #getvisual_section()
   * @generated
   */
  EReference getvisual_section_Vis_ops();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.visual_section#getVis_elements <em>Vis elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vis elements</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section#getVis_elements()
   * @see #getvisual_section()
   * @generated
   */
  EReference getvisual_section_Vis_elements();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.visualization <em>visualization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>visualization</em>'.
   * @see org.xtext.hipie.hIPIE.visualization
   * @generated
   */
  EClass getvisualization();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.visualization#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.visualization#getName()
   * @see #getvisualization()
   * @generated
   */
  EAttribute getvisualization_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.visualization#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see org.xtext.hipie.hIPIE.visualization#getInputs()
   * @see #getvisualization()
   * @generated
   */
  EReference getvisualization_Inputs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.visualization#getVis_ops <em>Vis ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vis ops</em>'.
   * @see org.xtext.hipie.hIPIE.visualization#getVis_ops()
   * @see #getvisualization()
   * @generated
   */
  EReference getvisualization_Vis_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.vis_basis <em>vis basis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vis basis</em>'.
   * @see org.xtext.hipie.hIPIE.vis_basis
   * @generated
   */
  EClass getvis_basis();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.hipie.hIPIE.vis_basis#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see org.xtext.hipie.hIPIE.vis_basis#getVars()
   * @see #getvis_basis()
   * @generated
   */
  EReference getvis_basis_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.vis_basis#getQuals <em>Quals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quals</em>'.
   * @see org.xtext.hipie.hIPIE.vis_basis#getQuals()
   * @see #getvis_basis()
   * @generated
   */
  EReference getvis_basis_Quals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.vis_basis_qualifiers <em>vis basis qualifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vis basis qualifiers</em>'.
   * @see org.xtext.hipie.hIPIE.vis_basis_qualifiers
   * @generated
   */
  EClass getvis_basis_qualifiers();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.function <em>function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function</em>'.
   * @see org.xtext.hipie.hIPIE.function
   * @generated
   */
  EClass getfunction();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.function#getFuncs <em>Funcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Funcs</em>'.
   * @see org.xtext.hipie.hIPIE.function#getFuncs()
   * @see #getfunction()
   * @generated
   */
  EReference getfunction_Funcs();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.function#getName()
   * @see #getfunction()
   * @generated
   */
  EAttribute getfunction_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.visual_section_options <em>visual section options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>visual section options</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section_options
   * @generated
   */
  EClass getvisual_section_options();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.visual_section_option <em>visual section option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>visual section option</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section_option
   * @generated
   */
  EClass getvisual_section_option();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.visual_section_option#getVis_ops <em>Vis ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vis ops</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section_option#getVis_ops()
   * @see #getvisual_section_option()
   * @generated
   */
  EReference getvisual_section_option_Vis_ops();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.visual_section_option#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section_option#getName()
   * @see #getvisual_section_option()
   * @generated
   */
  EAttribute getvisual_section_option_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.visual_section_option#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.visual_section_option#getVals()
   * @see #getvisual_section_option()
   * @generated
   */
  EReference getvisual_section_option_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.visual_options <em>visual options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>visual options</em>'.
   * @see org.xtext.hipie.hIPIE.visual_options
   * @generated
   */
  EClass getvisual_options();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.visual_option <em>visual option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>visual option</em>'.
   * @see org.xtext.hipie.hIPIE.visual_option
   * @generated
   */
  EClass getvisual_option();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.visual_option#getVis_ops <em>Vis ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vis ops</em>'.
   * @see org.xtext.hipie.hIPIE.visual_option#getVis_ops()
   * @see #getvisual_option()
   * @generated
   */
  EReference getvisual_option_Vis_ops();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.visual_option#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.visual_option#getName()
   * @see #getvisual_option()
   * @generated
   */
  EAttribute getvisual_option_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.visual_option#getFuncs <em>Funcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Funcs</em>'.
   * @see org.xtext.hipie.hIPIE.visual_option#getFuncs()
   * @see #getvisual_option()
   * @generated
   */
  EReference getvisual_option_Funcs();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.visual_multival <em>visual multival</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>visual multival</em>'.
   * @see org.xtext.hipie.hIPIE.visual_multival
   * @generated
   */
  EClass getvisual_multival();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.custom_section <em>custom section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>custom section</em>'.
   * @see org.xtext.hipie.hIPIE.custom_section
   * @generated
   */
  EClass getcustom_section();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.custom_section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.custom_section#getName()
   * @see #getcustom_section()
   * @generated
   */
  EAttribute getcustom_section_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.custom_section#getCust_vals <em>Cust vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cust vals</em>'.
   * @see org.xtext.hipie.hIPIE.custom_section#getCust_vals()
   * @see #getcustom_section()
   * @generated
   */
  EReference getcustom_section_Cust_vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.custom_value <em>custom value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>custom value</em>'.
   * @see org.xtext.hipie.hIPIE.custom_value
   * @generated
   */
  EClass getcustom_value();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.resource_option <em>resource option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>resource option</em>'.
   * @see org.xtext.hipie.hIPIE.resource_option
   * @generated
   */
  EClass getresource_option();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.resource_option#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.resource_option#getName()
   * @see #getresource_option()
   * @generated
   */
  EAttribute getresource_option_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.resource_option#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.resource_option#getVals()
   * @see #getresource_option()
   * @generated
   */
  EReference getresource_option_Vals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.resource_option#getRes_ops <em>Res ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Res ops</em>'.
   * @see org.xtext.hipie.hIPIE.resource_option#getRes_ops()
   * @see #getresource_option()
   * @generated
   */
  EReference getresource_option_Res_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.resource_options <em>resource options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>resource options</em>'.
   * @see org.xtext.hipie.hIPIE.resource_options
   * @generated
   */
  EClass getresource_options();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.resource_value <em>resource value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>resource value</em>'.
   * @see org.xtext.hipie.hIPIE.resource_value
   * @generated
   */
  EClass getresource_value();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.resource_section <em>resource section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>resource section</em>'.
   * @see org.xtext.hipie.hIPIE.resource_section
   * @generated
   */
  EClass getresource_section();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.resource_section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.resource_section#getName()
   * @see #getresource_section()
   * @generated
   */
  EAttribute getresource_section_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.resource_section#getRes_vals <em>Res vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Res vals</em>'.
   * @see org.xtext.hipie.hIPIE.resource_section#getRes_vals()
   * @see #getresource_section()
   * @generated
   */
  EReference getresource_section_Res_vals();

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

    /**
     * The meta object literal for the '<em><b>Composition Header</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__COMPOSITION_HEADER = eINSTANCE.getprogram_Composition_Header();

    /**
     * The meta object literal for the '<em><b>Base Props</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__BASE_PROPS = eINSTANCE.getprogram_Base_Props();

    /**
     * The meta object literal for the '<em><b>Contract Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CONTRACT_INSTANCES = eINSTANCE.getprogram_Contract_Instances();

    /**
     * The meta object literal for the '<em><b>Input Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INPUT_SECTION = eINSTANCE.getprogram_Input_Section();

    /**
     * The meta object literal for the '<em><b>Output Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__OUTPUT_SECTION = eINSTANCE.getprogram_Output_Section();

    /**
     * The meta object literal for the '<em><b>Visual Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__VISUAL_SECTION = eINSTANCE.getprogram_Visual_Section();

    /**
     * The meta object literal for the '<em><b>Generate Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__GENERATE_SECTION = eINSTANCE.getprogram_Generate_Section();

    /**
     * The meta object literal for the '<em><b>Custom Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CUSTOM_SECTION = eINSTANCE.getprogram_Custom_Section();

    /**
     * The meta object literal for the '<em><b>Resource Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__RESOURCE_SECTION = eINSTANCE.getprogram_Resource_Section();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.base_propImpl <em>base prop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.base_propImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getbase_prop()
     * @generated
     */
    EClass BASE_PROP = eINSTANCE.getbase_prop();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_PROP__NAME = eINSTANCE.getbase_prop_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_PROP__VALS = eINSTANCE.getbase_prop_Vals();

    /**
     * The meta object literal for the '<em><b>Cats</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_PROP__CATS = eINSTANCE.getbase_prop_Cats();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.category_type_listImpl <em>category type list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.category_type_listImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcategory_type_list()
     * @generated
     */
    EClass CATEGORY_TYPE_LIST = eINSTANCE.getcategory_type_list();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY_TYPE_LIST__NAME = eINSTANCE.getcategory_type_list_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.valueImpl <em>value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.valueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvalue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getvalue();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__TYPE = eINSTANCE.getvalue_Type();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__VALS = eINSTANCE.getvalue_Vals();

    /**
     * The meta object literal for the '<em><b>Res ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__RES_OPS = eINSTANCE.getvalue_Res_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.value_listImpl <em>value list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.value_listImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvalue_list()
     * @generated
     */
    EClass VALUE_LIST = eINSTANCE.getvalue_list();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.assignImpl <em>assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.assignImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getassign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getassign();

    /**
     * The meta object literal for the '<em><b>Assign internal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__ASSIGN_INTERNAL = eINSTANCE.getassign_Assign_internal();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.assign_listImpl <em>assign list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.assign_listImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getassign_list()
     * @generated
     */
    EClass ASSIGN_LIST = eINSTANCE.getassign_list();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.composition_headerImpl <em>composition header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.composition_headerImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcomposition_header()
     * @generated
     */
    EClass COMPOSITION_HEADER = eINSTANCE.getcomposition_header();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSITION_HEADER__NAME = eINSTANCE.getcomposition_header_Name();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITION_HEADER__ASSIGNS = eINSTANCE.getcomposition_header_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.contract_instanceImpl <em>contract instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.contract_instanceImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcontract_instance()
     * @generated
     */
    EClass CONTRACT_INSTANCE = eINSTANCE.getcontract_instance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACT_INSTANCE__NAME = eINSTANCE.getcontract_instance_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_INSTANCE__VALS = eINSTANCE.getcontract_instance_Vals();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_INSTANCE__VARS = eINSTANCE.getcontract_instance_Vars();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_INSTANCE__ASSIGNS = eINSTANCE.getcontract_instance_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.field_declImpl <em>field decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.field_declImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getfield_decl()
     * @generated
     */
    EClass FIELD_DECL = eINSTANCE.getfield_decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DECL__NAME = eINSTANCE.getfield_decl_Name();

    /**
     * The meta object literal for the '<em><b>Input internal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECL__INPUT_INTERNAL = eINSTANCE.getfield_decl_Input_internal();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.enum_declImpl <em>enum decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.enum_declImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getenum_decl()
     * @generated
     */
    EClass ENUM_DECL = eINSTANCE.getenum_decl();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__VALS = eINSTANCE.getenum_decl_Vals();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__ASSIGNS = eINSTANCE.getenum_decl_Assigns();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__INPUT_OPS = eINSTANCE.getenum_decl_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.input_sectionImpl <em>input section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.input_sectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getinput_section()
     * @generated
     */
    EClass INPUT_SECTION = eINSTANCE.getinput_section();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_SECTION__NAME = eINSTANCE.getinput_section_Name();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_SECTION__INPUTS = eINSTANCE.getinput_section_Inputs();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.boolImpl <em>bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.boolImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getbool()
     * @generated
     */
    EClass BOOL = eINSTANCE.getbool();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOL__INPUT_OPS = eINSTANCE.getbool_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.int_varImpl <em>int var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.int_varImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getint_var()
     * @generated
     */
    EClass INT_VAR = eINSTANCE.getint_var();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INT_VAR__INPUT_OPS = eINSTANCE.getint_var_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.string_varImpl <em>string var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.string_varImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getstring_var()
     * @generated
     */
    EClass STRING_VAR = eINSTANCE.getstring_var();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_VAR__INPUT_OPS = eINSTANCE.getstring_var_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.recordImpl <em>record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.recordImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getrecord()
     * @generated
     */
    EClass RECORD = eINSTANCE.getrecord();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD__INPUT_OPS = eINSTANCE.getrecord_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.datasetImpl <em>dataset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.datasetImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getdataset()
     * @generated
     */
    EClass DATASET = eINSTANCE.getdataset();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET__INPUT_OPS = eINSTANCE.getdataset_Input_ops();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET__FIELDS = eINSTANCE.getdataset_Fields();

    /**
     * The meta object literal for the '<em><b>Out base</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET__OUT_BASE = eINSTANCE.getdataset_Out_base();

    /**
     * The meta object literal for the '<em><b>Ecl vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET__ECL_VARS = eINSTANCE.getdataset_Ecl_vars();

    /**
     * The meta object literal for the '<em><b>Op base</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET__OP_BASE = eINSTANCE.getdataset_Op_base();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.groupImpl <em>group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.groupImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getgroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getgroup();

    /**
     * The meta object literal for the '<em><b>Input internal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__INPUT_INTERNAL = eINSTANCE.getgroup_Input_internal();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__VALUES = eINSTANCE.getgroup_Values();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.datatypeImpl <em>datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.datatypeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getdatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getdatatype();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.input_valueImpl <em>input value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.input_valueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getinput_value()
     * @generated
     */
    EClass INPUT_VALUE = eINSTANCE.getinput_value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_VALUE__NAME = eINSTANCE.getinput_value_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.input_optionsImpl <em>input options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.input_optionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getinput_options()
     * @generated
     */
    EClass INPUT_OPTIONS = eINSTANCE.getinput_options();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.input_optionImpl <em>input option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.input_optionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getinput_option()
     * @generated
     */
    EClass INPUT_OPTION = eINSTANCE.getinput_option();

    /**
     * The meta object literal for the '<em><b>Input internal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTION__INPUT_INTERNAL = eINSTANCE.getinput_option_Input_internal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPTION__NAME = eINSTANCE.getinput_option_Name();

    /**
     * The meta object literal for the '<em><b>Assigns internal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTION__ASSIGNS_INTERNAL = eINSTANCE.getinput_option_Assigns_internal();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTION__VALS = eINSTANCE.getinput_option_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.output_sectionImpl <em>output section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.output_sectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutput_section()
     * @generated
     */
    EClass OUTPUT_SECTION = eINSTANCE.getoutput_section();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_SECTION__NAME = eINSTANCE.getoutput_section_Name();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_SECTION__OUTPUTS = eINSTANCE.getoutput_section_Outputs();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.outfield_declImpl <em>outfield decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.outfield_declImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutfield_decl()
     * @generated
     */
    EClass OUTFIELD_DECL = eINSTANCE.getoutfield_decl();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTFIELD_DECL__FIELDS = eINSTANCE.getoutfield_decl_Fields();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_integerImpl <em>ecl integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_integerImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_integer()
     * @generated
     */
    EClass ECL_INTEGER = eINSTANCE.getecl_integer();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_unsignedImpl <em>ecl unsigned</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_unsignedImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_unsigned()
     * @generated
     */
    EClass ECL_UNSIGNED = eINSTANCE.getecl_unsigned();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_stringImpl <em>ecl string</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_stringImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_string()
     * @generated
     */
    EClass ECL_STRING = eINSTANCE.getecl_string();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_qstringImpl <em>ecl qstring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_qstringImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_qstring()
     * @generated
     */
    EClass ECL_QSTRING = eINSTANCE.getecl_qstring();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_varstringImpl <em>ecl varstring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_varstringImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_varstring()
     * @generated
     */
    EClass ECL_VARSTRING = eINSTANCE.getecl_varstring();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_unicodeImpl <em>ecl unicode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_unicodeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_unicode()
     * @generated
     */
    EClass ECL_UNICODE = eINSTANCE.getecl_unicode();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_varunicodeImpl <em>ecl varunicode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_varunicodeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_varunicode()
     * @generated
     */
    EClass ECL_VARUNICODE = eINSTANCE.getecl_varunicode();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_dataImpl <em>ecl data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_dataImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_data()
     * @generated
     */
    EClass ECL_DATA = eINSTANCE.getecl_data();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecl_realImpl <em>ecl real</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecl_realImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecl_real()
     * @generated
     */
    EClass ECL_REAL = eINSTANCE.getecl_real();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.eclfield_typeImpl <em>eclfield type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.eclfield_typeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#geteclfield_type()
     * @generated
     */
    EClass ECLFIELD_TYPE = eINSTANCE.geteclfield_type();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLFIELD_TYPE__OPTIONS = eINSTANCE.geteclfield_type_Options();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECLFIELD_TYPE__NAME = eINSTANCE.geteclfield_type_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ecloutput_declImpl <em>ecloutput decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ecloutput_declImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getecloutput_decl()
     * @generated
     */
    EClass ECLOUTPUT_DECL = eINSTANCE.getecloutput_decl();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.output_optionImpl <em>output option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.output_optionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutput_option()
     * @generated
     */
    EClass OUTPUT_OPTION = eINSTANCE.getoutput_option();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPTION__NAME = eINSTANCE.getoutput_option_Name();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPTION__VARS = eINSTANCE.getoutput_option_Vars();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPTION__VALS = eINSTANCE.getoutput_option_Vals();

    /**
     * The meta object literal for the '<em><b>Output internal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPTION__OUTPUT_INTERNAL = eINSTANCE.getoutput_option_Output_internal();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.output_optionsImpl <em>output options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.output_optionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutput_options()
     * @generated
     */
    EClass OUTPUT_OPTIONS = eINSTANCE.getoutput_options();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.out_typeImpl <em>out type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.out_typeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getout_type()
     * @generated
     */
    EClass OUT_TYPE = eINSTANCE.getout_type();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.output_valueImpl <em>output value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.output_valueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutput_value()
     * @generated
     */
    EClass OUTPUT_VALUE = eINSTANCE.getoutput_value();

    /**
     * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_VALUE__OPS = eINSTANCE.getoutput_value_Ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.outputbaseImpl <em>outputbase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.outputbaseImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getoutputbase()
     * @generated
     */
    EClass OUTPUTBASE = eINSTANCE.getoutputbase();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUTBASE__ACTIONS = eINSTANCE.getoutputbase_Actions();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.generate_sectionImpl <em>generate section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.generate_sectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getgenerate_section()
     * @generated
     */
    EClass GENERATE_SECTION = eINSTANCE.getgenerate_section();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATE_SECTION__NAME = eINSTANCE.getgenerate_section_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATE_SECTION__BODY = eINSTANCE.getgenerate_section_Body();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.generate_bodyImpl <em>generate body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.generate_bodyImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getgenerate_body()
     * @generated
     */
    EClass GENERATE_BODY = eINSTANCE.getgenerate_body();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATE_BODY__NAME = eINSTANCE.getgenerate_body_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.visual_sectionImpl <em>visual section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.visual_sectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_section()
     * @generated
     */
    EClass VISUAL_SECTION = eINSTANCE.getvisual_section();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_SECTION__NAME = eINSTANCE.getvisual_section_Name();

    /**
     * The meta object literal for the '<em><b>Vis ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION__VIS_OPS = eINSTANCE.getvisual_section_Vis_ops();

    /**
     * The meta object literal for the '<em><b>Vis elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION__VIS_ELEMENTS = eINSTANCE.getvisual_section_Vis_elements();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.visualizationImpl <em>visualization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.visualizationImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisualization()
     * @generated
     */
    EClass VISUALIZATION = eINSTANCE.getvisualization();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUALIZATION__NAME = eINSTANCE.getvisualization_Name();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__INPUTS = eINSTANCE.getvisualization_Inputs();

    /**
     * The meta object literal for the '<em><b>Vis ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__VIS_OPS = eINSTANCE.getvisualization_Vis_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.vis_basisImpl <em>vis basis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.vis_basisImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvis_basis()
     * @generated
     */
    EClass VIS_BASIS = eINSTANCE.getvis_basis();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS__VARS = eINSTANCE.getvis_basis_Vars();

    /**
     * The meta object literal for the '<em><b>Quals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS__QUALS = eINSTANCE.getvis_basis_Quals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.vis_basis_qualifiersImpl <em>vis basis qualifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.vis_basis_qualifiersImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvis_basis_qualifiers()
     * @generated
     */
    EClass VIS_BASIS_QUALIFIERS = eINSTANCE.getvis_basis_qualifiers();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.functionImpl <em>function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.functionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getfunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getfunction();

    /**
     * The meta object literal for the '<em><b>Funcs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__FUNCS = eINSTANCE.getfunction_Funcs();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getfunction_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.visual_section_optionsImpl <em>visual section options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.visual_section_optionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_section_options()
     * @generated
     */
    EClass VISUAL_SECTION_OPTIONS = eINSTANCE.getvisual_section_options();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.visual_section_optionImpl <em>visual section option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.visual_section_optionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_section_option()
     * @generated
     */
    EClass VISUAL_SECTION_OPTION = eINSTANCE.getvisual_section_option();

    /**
     * The meta object literal for the '<em><b>Vis ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION_OPTION__VIS_OPS = eINSTANCE.getvisual_section_option_Vis_ops();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_SECTION_OPTION__NAME = eINSTANCE.getvisual_section_option_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION_OPTION__VALS = eINSTANCE.getvisual_section_option_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.visual_optionsImpl <em>visual options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.visual_optionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_options()
     * @generated
     */
    EClass VISUAL_OPTIONS = eINSTANCE.getvisual_options();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.visual_optionImpl <em>visual option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.visual_optionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_option()
     * @generated
     */
    EClass VISUAL_OPTION = eINSTANCE.getvisual_option();

    /**
     * The meta object literal for the '<em><b>Vis ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTION__VIS_OPS = eINSTANCE.getvisual_option_Vis_ops();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_OPTION__NAME = eINSTANCE.getvisual_option_Name();

    /**
     * The meta object literal for the '<em><b>Funcs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTION__FUNCS = eINSTANCE.getvisual_option_Funcs();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.visual_multivalImpl <em>visual multival</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.visual_multivalImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getvisual_multival()
     * @generated
     */
    EClass VISUAL_MULTIVAL = eINSTANCE.getvisual_multival();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.custom_sectionImpl <em>custom section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.custom_sectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcustom_section()
     * @generated
     */
    EClass CUSTOM_SECTION = eINSTANCE.getcustom_section();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_SECTION__NAME = eINSTANCE.getcustom_section_Name();

    /**
     * The meta object literal for the '<em><b>Cust vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_SECTION__CUST_VALS = eINSTANCE.getcustom_section_Cust_vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.custom_valueImpl <em>custom value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.custom_valueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getcustom_value()
     * @generated
     */
    EClass CUSTOM_VALUE = eINSTANCE.getcustom_value();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.resource_optionImpl <em>resource option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.resource_optionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getresource_option()
     * @generated
     */
    EClass RESOURCE_OPTION = eINSTANCE.getresource_option();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_OPTION__NAME = eINSTANCE.getresource_option_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_OPTION__VALS = eINSTANCE.getresource_option_Vals();

    /**
     * The meta object literal for the '<em><b>Res ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_OPTION__RES_OPS = eINSTANCE.getresource_option_Res_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.resource_optionsImpl <em>resource options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.resource_optionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getresource_options()
     * @generated
     */
    EClass RESOURCE_OPTIONS = eINSTANCE.getresource_options();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.resource_valueImpl <em>resource value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.resource_valueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getresource_value()
     * @generated
     */
    EClass RESOURCE_VALUE = eINSTANCE.getresource_value();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.resource_sectionImpl <em>resource section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.resource_sectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getresource_section()
     * @generated
     */
    EClass RESOURCE_SECTION = eINSTANCE.getresource_section();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_SECTION__NAME = eINSTANCE.getresource_section_Name();

    /**
     * The meta object literal for the '<em><b>Res vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_SECTION__RES_VALS = eINSTANCE.getresource_section_Res_vals();

  }

} //HIPIEPackage
