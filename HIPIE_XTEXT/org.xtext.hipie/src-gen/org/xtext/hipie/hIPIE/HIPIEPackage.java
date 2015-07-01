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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ProgramImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Composition header</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__COMPOSITION_HEADER = 0;

  /**
   * The feature id for the '<em><b>Base props</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__BASE_PROPS = 1;

  /**
   * The feature id for the '<em><b>Contract instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CONTRACT_INSTANCES = 2;

  /**
   * The feature id for the '<em><b>Input section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INPUT_SECTION = 3;

  /**
   * The feature id for the '<em><b>Output section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__OUTPUT_SECTION = 4;

  /**
   * The feature id for the '<em><b>Visual section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__VISUAL_SECTION = 5;

  /**
   * The feature id for the '<em><b>Generate section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__GENERATE_SECTION = 6;

  /**
   * The feature id for the '<em><b>Custom section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CUSTOM_SECTION = 7;

  /**
   * The feature id for the '<em><b>Sesource section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SESOURCE_SECTION = 8;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.BasePropImpl <em>Base Prop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.BasePropImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getBaseProp()
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
   * The feature id for the '<em><b>Val list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_PROP__VAL_LIST = 1;

  /**
   * The feature id for the '<em><b>Cat list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_PROP__CAT_LIST = 2;

  /**
   * The number of structural features of the '<em>Base Prop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_PROP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CategoryTypeListImpl <em>Category Type List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CategoryTypeListImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCategoryTypeList()
   * @generated
   */
  int CATEGORY_TYPE_LIST = 2;

  /**
   * The feature id for the '<em><b>Cats</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE_LIST__CATS = 0;

  /**
   * The number of structural features of the '<em>Category Type List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CustomValueImpl <em>Custom Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CustomValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCustomValue()
   * @generated
   */
  int CUSTOM_VALUE = 56;

  /**
   * The number of structural features of the '<em>Custom Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NAME = CUSTOM_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Int val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__INT_VAL = CUSTOM_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Str val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__STR_VAL = CUSTOM_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Res ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__RES_OPS = CUSTOM_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = CUSTOM_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ValueListImpl <em>Value List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ValueListImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getValueList()
   * @generated
   */
  int VALUE_LIST = 4;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST__VALS = 0;

  /**
   * The number of structural features of the '<em>Value List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.AssignImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__NAME = 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VALS = 1;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.AssignListImpl <em>Assign List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.AssignListImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getAssignList()
   * @generated
   */
  int ASSIGN_LIST = 6;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_LIST__ASSIGNS = 0;

  /**
   * The number of structural features of the '<em>Assign List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CompositionHeaderImpl <em>Composition Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CompositionHeaderImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCompositionHeader()
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
   * The number of structural features of the '<em>Composition Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl <em>Contract Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ContractInstanceImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getContractInstance()
   * @generated
   */
  int CONTRACT_INSTANCE = 8;

  /**
   * The feature id for the '<em><b>Sec name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE__SEC_NAME = 0;

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
   * The number of structural features of the '<em>Contract Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.PosVizDataImpl <em>Pos Viz Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.PosVizDataImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getPosVizData()
   * @generated
   */
  int POS_VIZ_DATA = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POS_VIZ_DATA__NAME = 0;

  /**
   * The number of structural features of the '<em>Pos Viz Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POS_VIZ_DATA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.FieldDeclImpl <em>Field Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.FieldDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getFieldDecl()
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
  int FIELD_DECL__NAME = POS_VIZ_DATA__NAME;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__INPUT_OPS = POS_VIZ_DATA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL_FEATURE_COUNT = POS_VIZ_DATA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputValueImpl <em>Input Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputValue()
   * @generated
   */
  int INPUT_VALUE = 19;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_VALUE__INPUT_OP_LIST = 0;

  /**
   * The number of structural features of the '<em>Input Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.EnumDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getEnumDecl()
   * @generated
   */
  int ENUM_DECL = 10;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__INPUT_OP_LIST = INPUT_VALUE__INPUT_OP_LIST;

  /**
   * The feature id for the '<em><b>Enum dec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__ENUM_DEC = INPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__VALS = INPUT_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__ASSIGNS = INPUT_VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL_FEATURE_COUNT = INPUT_VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputSectionImpl <em>Input Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputSection()
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
   * The number of structural features of the '<em>Input Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.DatatypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 18;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.BoolImpl <em>Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.BoolImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getBool()
   * @generated
   */
  int BOOL = 12;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__FIELDS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__NAME = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.IntVarImpl <em>Int Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.IntVarImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getIntVar()
   * @generated
   */
  int INT_VAR = 13;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__FIELDS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__NAME = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Int Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.StringVarImpl <em>String Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.StringVarImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getStringVar()
   * @generated
   */
  int STRING_VAR = 14;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__FIELDS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__NAME = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.RecordImpl <em>Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.RecordImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getRecord()
   * @generated
   */
  int RECORD = 15;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__NAME = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.DatasetImpl <em>Dataset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.DatasetImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getDataset()
   * @generated
   */
  int DATASET = 16;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__NAME = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__FIELDS = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dataset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.GroupImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 17;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__INPUT_OP_LIST = INPUT_VALUE__INPUT_OP_LIST;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = INPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__VALS = INPUT_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = INPUT_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputOptionsImpl <em>Input Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputOptions()
   * @generated
   */
  int INPUT_OPTIONS = 20;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTIONS__INPUT_OPS = 0;

  /**
   * The number of structural features of the '<em>Input Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputOptionImpl <em>Input Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputOption()
   * @generated
   */
  int INPUT_OPTION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Assigns list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__ASSIGNS_LIST = 1;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__VALS = 2;

  /**
   * The number of structural features of the '<em>Input Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputSectionImpl <em>Output Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputSection()
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
   * The number of structural features of the '<em>Output Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutfieldDeclImpl <em>Outfield Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutfieldDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutfieldDecl()
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
   * The number of structural features of the '<em>Outfield Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTFIELD_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl <em>EC Lfield Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLfieldType()
   * @generated
   */
  int EC_LFIELD_TYPE = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_LFIELD_TYPE__NAME = POS_VIZ_DATA__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_LFIELD_TYPE__OPTIONS = POS_VIZ_DATA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EC Lfield Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_LFIELD_TYPE_FEATURE_COUNT = POS_VIZ_DATA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLIntegerImpl <em>ECL Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLIntegerImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLInteger()
   * @generated
   */
  int ECL_INTEGER = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_INTEGER__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_INTEGER__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_INTEGER_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLUnsignedImpl <em>ECL Unsigned</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLUnsignedImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLUnsigned()
   * @generated
   */
  int ECL_UNSIGNED = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNSIGNED__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNSIGNED__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL Unsigned</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNSIGNED_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLStringImpl <em>ECL String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLStringImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLString()
   * @generated
   */
  int ECL_STRING = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_STRING__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_STRING__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_STRING_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLQstringImpl <em>ECL Qstring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLQstringImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLQstring()
   * @generated
   */
  int ECL_QSTRING = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_QSTRING__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_QSTRING__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL Qstring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_QSTRING_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLVarstringImpl <em>ECL Varstring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLVarstringImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLVarstring()
   * @generated
   */
  int ECL_VARSTRING = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARSTRING__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARSTRING__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL Varstring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARSTRING_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLUnicodeImpl <em>ECL Unicode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLUnicodeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLUnicode()
   * @generated
   */
  int ECL_UNICODE = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNICODE__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNICODE__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL Unicode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNICODE_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLVarunicodeImpl <em>ECL Varunicode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLVarunicodeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLVarunicode()
   * @generated
   */
  int ECL_VARUNICODE = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARUNICODE__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARUNICODE__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL Varunicode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARUNICODE_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLDataImpl <em>ECL Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLDataImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLData()
   * @generated
   */
  int ECL_DATA = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DATA__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DATA__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DATA_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLRealImpl <em>ECL Real</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLRealImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLReal()
   * @generated
   */
  int ECL_REAL = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REAL__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REAL__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The number of structural features of the '<em>ECL Real</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REAL_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLOutputDeclImpl <em>ECL Output Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLOutputDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLOutputDecl()
   * @generated
   */
  int ECL_OUTPUT_DECL = 35;

  /**
   * The number of structural features of the '<em>ECL Output Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_OUTPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputOptionImpl <em>Output Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputOption()
   * @generated
   */
  int OUTPUT_OPTION = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__VARS = 1;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__VALS = 2;

  /**
   * The number of structural features of the '<em>Output Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputOptionsImpl <em>Output Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputOptions()
   * @generated
   */
  int OUTPUT_OPTIONS = 37;

  /**
   * The feature id for the '<em><b>Output ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTIONS__OUTPUT_OPS = 0;

  /**
   * The number of structural features of the '<em>Output Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputValueImpl <em>Output Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputValue()
   * @generated
   */
  int OUTPUT_VALUE = 40;

  /**
   * The number of structural features of the '<em>Output Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutTypeImpl <em>Out Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutTypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutType()
   * @generated
   */
  int OUT_TYPE = 38;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TYPE__VAL = OUTPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TYPE__OPS = OUTPUT_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Out Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TYPE_FEATURE_COUNT = OUTPUT_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutDatasetImpl <em>Out Dataset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutDatasetImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutDataset()
   * @generated
   */
  int OUT_DATASET = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__NAME = OUTPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Out base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__OUT_BASE = OUTPUT_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__OPS = OUTPUT_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ecl vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__ECL_VARS = OUTPUT_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Out Dataset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET_FEATURE_COUNT = OUTPUT_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputBaseImpl <em>Output Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputBaseImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputBase()
   * @generated
   */
  int OUTPUT_BASE = 41;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_BASE__BASE = 0;

  /**
   * The number of structural features of the '<em>Output Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_BASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.GenerateSectionImpl <em>Generate Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.GenerateSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateSection()
   * @generated
   */
  int GENERATE_SECTION = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_SECTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Generate Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.GenerateBodyInlineImpl <em>Generate Body Inline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.GenerateBodyInlineImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateBodyInline()
   * @generated
   */
  int GENERATE_BODY_INLINE = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_BODY_INLINE__NAME = GENERATE_SECTION__NAME;

  /**
   * The number of structural features of the '<em>Generate Body Inline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_BODY_INLINE_FEATURE_COUNT = GENERATE_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.GenerateBodySaltImpl <em>Generate Body Salt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.GenerateBodySaltImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateBodySalt()
   * @generated
   */
  int GENERATE_BODY_SALT = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_BODY_SALT__NAME = GENERATE_SECTION__NAME;

  /**
   * The number of structural features of the '<em>Generate Body Salt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_BODY_SALT_FEATURE_COUNT = GENERATE_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualSectionImpl <em>Visual Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualSection()
   * @generated
   */
  int VISUAL_SECTION = 45;

  /**
   * The feature id for the '<em><b>Sec name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION__SEC_NAME = 0;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference.
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
   * The number of structural features of the '<em>Visual Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualizationImpl <em>Visualization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualizationImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualization()
   * @generated
   */
  int VISUALIZATION = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__INPUT = 1;

  /**
   * The feature id for the '<em><b>Vis op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__VIS_OP = 2;

  /**
   * The number of structural features of the '<em>Visualization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisBasisImpl <em>Vis Basis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisBasisImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisBasis()
   * @generated
   */
  int VIS_BASIS = 47;

  /**
   * The feature id for the '<em><b>Basis</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS__BASIS = 0;

  /**
   * The feature id for the '<em><b>Quals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS__QUALS = 1;

  /**
   * The number of structural features of the '<em>Vis Basis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl <em>Vis Basis Qualifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisBasisQualifiers()
   * @generated
   */
  int VIS_BASIS_QUALIFIERS = 48;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_QUALIFIERS__FUNCS = 0;

  /**
   * The number of structural features of the '<em>Vis Basis Qualifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_QUALIFIERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.FunctionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 49;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__VARS = 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__VALS = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualSectionOptionsImpl <em>Visual Section Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualSectionOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualSectionOptions()
   * @generated
   */
  int VISUAL_SECTION_OPTIONS = 50;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTIONS__VIS_OPS = 0;

  /**
   * The number of structural features of the '<em>Visual Section Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualSectionOptionImpl <em>Visual Section Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualSectionOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualSectionOption()
   * @generated
   */
  int VISUAL_SECTION_OPTION = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION__VALS = 1;

  /**
   * The number of structural features of the '<em>Visual Section Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualOptionsImpl <em>Visual Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualOptions()
   * @generated
   */
  int VISUAL_OPTIONS = 52;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTIONS__VIS_OPS = 0;

  /**
   * The number of structural features of the '<em>Visual Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl <em>Visual Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualOption()
   * @generated
   */
  int VISUAL_OPTION = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__FUNCS = 1;

  /**
   * The feature id for the '<em><b>Vis mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__VIS_MULT = 2;

  /**
   * The number of structural features of the '<em>Visual Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualMultivalImpl <em>Visual Multival</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualMultivalImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualMultival()
   * @generated
   */
  int VISUAL_MULTIVAL = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL__NAME = 0;

  /**
   * The number of structural features of the '<em>Visual Multival</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CustomSectionImpl <em>Custom Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CustomSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCustomSection()
   * @generated
   */
  int CUSTOM_SECTION = 55;

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
   * The number of structural features of the '<em>Custom Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ResourceOptionImpl <em>Resource Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ResourceOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceOption()
   * @generated
   */
  int RESOURCE_OPTION = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION__VALS = 1;

  /**
   * The number of structural features of the '<em>Resource Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ResourceOptionsImpl <em>Resource Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ResourceOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceOptions()
   * @generated
   */
  int RESOURCE_OPTIONS = 58;

  /**
   * The feature id for the '<em><b>Res ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTIONS__RES_OPS = 0;

  /**
   * The number of structural features of the '<em>Resource Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ResourceValueImpl <em>Resource Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ResourceValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceValue()
   * @generated
   */
  int RESOURCE_VALUE = 59;

  /**
   * The number of structural features of the '<em>Resource Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ResourceSectionImpl <em>Resource Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ResourceSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceSection()
   * @generated
   */
  int RESOURCE_SECTION = 60;

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
   * The number of structural features of the '<em>Resource Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_SECTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.hipie.hIPIE.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getComposition_header <em>Composition header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Composition header</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getComposition_header()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Composition_header();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getBase_props <em>Base props</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Base props</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getBase_props()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Base_props();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getContract_instances <em>Contract instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contract instances</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getContract_instances()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Contract_instances();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getInput_section <em>Input section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input section</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getInput_section()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Input_section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getOutput_section <em>Output section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output section</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getOutput_section()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Output_section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getVisual_section <em>Visual section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Visual section</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getVisual_section()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Visual_section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getGenerate_section <em>Generate section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generate section</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getGenerate_section()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Generate_section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getCustom_section <em>Custom section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Custom section</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getCustom_section()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Custom_section();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getSesource_section <em>Sesource section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sesource section</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getSesource_section()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Sesource_section();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.BaseProp <em>Base Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Prop</em>'.
   * @see org.xtext.hipie.hIPIE.BaseProp
   * @generated
   */
  EClass getBaseProp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.BaseProp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.BaseProp#getName()
   * @see #getBaseProp()
   * @generated
   */
  EAttribute getBaseProp_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.BaseProp#getVal_list <em>Val list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val list</em>'.
   * @see org.xtext.hipie.hIPIE.BaseProp#getVal_list()
   * @see #getBaseProp()
   * @generated
   */
  EReference getBaseProp_Val_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.BaseProp#getCat_list <em>Cat list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cat list</em>'.
   * @see org.xtext.hipie.hIPIE.BaseProp#getCat_list()
   * @see #getBaseProp()
   * @generated
   */
  EReference getBaseProp_Cat_list();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.CategoryTypeList <em>Category Type List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category Type List</em>'.
   * @see org.xtext.hipie.hIPIE.CategoryTypeList
   * @generated
   */
  EClass getCategoryTypeList();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.hipie.hIPIE.CategoryTypeList#getCats <em>Cats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cats</em>'.
   * @see org.xtext.hipie.hIPIE.CategoryTypeList#getCats()
   * @see #getCategoryTypeList()
   * @generated
   */
  EAttribute getCategoryTypeList_Cats();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.xtext.hipie.hIPIE.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Value#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Value#getName()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Value#getInt_val <em>Int val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int val</em>'.
   * @see org.xtext.hipie.hIPIE.Value#getInt_val()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Int_val();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Value#getStr_val <em>Str val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str val</em>'.
   * @see org.xtext.hipie.hIPIE.Value#getStr_val()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Str_val();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Value#getRes_ops <em>Res ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Res ops</em>'.
   * @see org.xtext.hipie.hIPIE.Value#getRes_ops()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Res_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ValueList <em>Value List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value List</em>'.
   * @see org.xtext.hipie.hIPIE.ValueList
   * @generated
   */
  EClass getValueList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.ValueList#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.ValueList#getVals()
   * @see #getValueList()
   * @generated
   */
  EReference getValueList_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign</em>'.
   * @see org.xtext.hipie.hIPIE.Assign
   * @generated
   */
  EClass getAssign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Assign#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Assign#getName()
   * @see #getAssign()
   * @generated
   */
  EAttribute getAssign_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Assign#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.Assign#getVals()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.AssignList <em>Assign List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign List</em>'.
   * @see org.xtext.hipie.hIPIE.AssignList
   * @generated
   */
  EClass getAssignList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.AssignList#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.AssignList#getAssigns()
   * @see #getAssignList()
   * @generated
   */
  EReference getAssignList_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.CompositionHeader <em>Composition Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Header</em>'.
   * @see org.xtext.hipie.hIPIE.CompositionHeader
   * @generated
   */
  EClass getCompositionHeader();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.CompositionHeader#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.CompositionHeader#getName()
   * @see #getCompositionHeader()
   * @generated
   */
  EAttribute getCompositionHeader_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.CompositionHeader#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.CompositionHeader#getAssigns()
   * @see #getCompositionHeader()
   * @generated
   */
  EReference getCompositionHeader_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ContractInstance <em>Contract Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contract Instance</em>'.
   * @see org.xtext.hipie.hIPIE.ContractInstance
   * @generated
   */
  EClass getContractInstance();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.ContractInstance#getSec_name <em>Sec name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sec name</em>'.
   * @see org.xtext.hipie.hIPIE.ContractInstance#getSec_name()
   * @see #getContractInstance()
   * @generated
   */
  EAttribute getContractInstance_Sec_name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.ContractInstance#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.ContractInstance#getVals()
   * @see #getContractInstance()
   * @generated
   */
  EReference getContractInstance_Vals();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.hipie.hIPIE.ContractInstance#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see org.xtext.hipie.hIPIE.ContractInstance#getVars()
   * @see #getContractInstance()
   * @generated
   */
  EReference getContractInstance_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.ContractInstance#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.ContractInstance#getAssigns()
   * @see #getContractInstance()
   * @generated
   */
  EReference getContractInstance_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.FieldDecl <em>Field Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Decl</em>'.
   * @see org.xtext.hipie.hIPIE.FieldDecl
   * @generated
   */
  EClass getFieldDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.FieldDecl#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.FieldDecl#getInput_ops()
   * @see #getFieldDecl()
   * @generated
   */
  EReference getFieldDecl_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.EnumDecl <em>Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Decl</em>'.
   * @see org.xtext.hipie.hIPIE.EnumDecl
   * @generated
   */
  EClass getEnumDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.EnumDecl#getEnum_dec <em>Enum dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enum dec</em>'.
   * @see org.xtext.hipie.hIPIE.EnumDecl#getEnum_dec()
   * @see #getEnumDecl()
   * @generated
   */
  EAttribute getEnumDecl_Enum_dec();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.EnumDecl#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.EnumDecl#getVals()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_Vals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.EnumDecl#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.EnumDecl#getAssigns()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InputSection <em>Input Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Section</em>'.
   * @see org.xtext.hipie.hIPIE.InputSection
   * @generated
   */
  EClass getInputSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.InputSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.InputSection#getName()
   * @see #getInputSection()
   * @generated
   */
  EAttribute getInputSection_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.InputSection#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see org.xtext.hipie.hIPIE.InputSection#getInputs()
   * @see #getInputSection()
   * @generated
   */
  EReference getInputSection_Inputs();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool</em>'.
   * @see org.xtext.hipie.hIPIE.Bool
   * @generated
   */
  EClass getBool();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Bool#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Bool#getName()
   * @see #getBool()
   * @generated
   */
  EAttribute getBool_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.IntVar <em>Int Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Var</em>'.
   * @see org.xtext.hipie.hIPIE.IntVar
   * @generated
   */
  EClass getIntVar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.IntVar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.IntVar#getName()
   * @see #getIntVar()
   * @generated
   */
  EAttribute getIntVar_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.StringVar <em>String Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Var</em>'.
   * @see org.xtext.hipie.hIPIE.StringVar
   * @generated
   */
  EClass getStringVar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.StringVar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.StringVar#getName()
   * @see #getStringVar()
   * @generated
   */
  EAttribute getStringVar_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Record <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record</em>'.
   * @see org.xtext.hipie.hIPIE.Record
   * @generated
   */
  EClass getRecord();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Record#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Record#getName()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Dataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dataset</em>'.
   * @see org.xtext.hipie.hIPIE.Dataset
   * @generated
   */
  EClass getDataset();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Dataset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Dataset#getName()
   * @see #getDataset()
   * @generated
   */
  EAttribute getDataset_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Dataset#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.xtext.hipie.hIPIE.Dataset#getFields()
   * @see #getDataset()
   * @generated
   */
  EReference getDataset_Fields();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see org.xtext.hipie.hIPIE.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Group#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.Group#getVals()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see org.xtext.hipie.hIPIE.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InputValue <em>Input Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Value</em>'.
   * @see org.xtext.hipie.hIPIE.InputValue
   * @generated
   */
  EClass getInputValue();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.InputValue#getInput_op_list <em>Input op list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input op list</em>'.
   * @see org.xtext.hipie.hIPIE.InputValue#getInput_op_list()
   * @see #getInputValue()
   * @generated
   */
  EReference getInputValue_Input_op_list();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InputOptions <em>Input Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Options</em>'.
   * @see org.xtext.hipie.hIPIE.InputOptions
   * @generated
   */
  EClass getInputOptions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.InputOptions#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.InputOptions#getInput_ops()
   * @see #getInputOptions()
   * @generated
   */
  EReference getInputOptions_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InputOption <em>Input Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Option</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption
   * @generated
   */
  EClass getInputOption();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.InputOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getName()
   * @see #getInputOption()
   * @generated
   */
  EAttribute getInputOption_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.InputOption#getAssigns_list <em>Assigns list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assigns list</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getAssigns_list()
   * @see #getInputOption()
   * @generated
   */
  EReference getInputOption_Assigns_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.InputOption#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getVals()
   * @see #getInputOption()
   * @generated
   */
  EReference getInputOption_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutputSection <em>Output Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Section</em>'.
   * @see org.xtext.hipie.hIPIE.OutputSection
   * @generated
   */
  EClass getOutputSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.OutputSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.OutputSection#getName()
   * @see #getOutputSection()
   * @generated
   */
  EAttribute getOutputSection_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.OutputSection#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see org.xtext.hipie.hIPIE.OutputSection#getOutputs()
   * @see #getOutputSection()
   * @generated
   */
  EReference getOutputSection_Outputs();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutfieldDecl <em>Outfield Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outfield Decl</em>'.
   * @see org.xtext.hipie.hIPIE.OutfieldDecl
   * @generated
   */
  EClass getOutfieldDecl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.OutfieldDecl#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.xtext.hipie.hIPIE.OutfieldDecl#getFields()
   * @see #getOutfieldDecl()
   * @generated
   */
  EReference getOutfieldDecl_Fields();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLInteger <em>ECL Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Integer</em>'.
   * @see org.xtext.hipie.hIPIE.ECLInteger
   * @generated
   */
  EClass getECLInteger();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLUnsigned <em>ECL Unsigned</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Unsigned</em>'.
   * @see org.xtext.hipie.hIPIE.ECLUnsigned
   * @generated
   */
  EClass getECLUnsigned();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLString <em>ECL String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL String</em>'.
   * @see org.xtext.hipie.hIPIE.ECLString
   * @generated
   */
  EClass getECLString();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLQstring <em>ECL Qstring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Qstring</em>'.
   * @see org.xtext.hipie.hIPIE.ECLQstring
   * @generated
   */
  EClass getECLQstring();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLVarstring <em>ECL Varstring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Varstring</em>'.
   * @see org.xtext.hipie.hIPIE.ECLVarstring
   * @generated
   */
  EClass getECLVarstring();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLUnicode <em>ECL Unicode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Unicode</em>'.
   * @see org.xtext.hipie.hIPIE.ECLUnicode
   * @generated
   */
  EClass getECLUnicode();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLVarunicode <em>ECL Varunicode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Varunicode</em>'.
   * @see org.xtext.hipie.hIPIE.ECLVarunicode
   * @generated
   */
  EClass getECLVarunicode();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLData <em>ECL Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Data</em>'.
   * @see org.xtext.hipie.hIPIE.ECLData
   * @generated
   */
  EClass getECLData();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLReal <em>ECL Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Real</em>'.
   * @see org.xtext.hipie.hIPIE.ECLReal
   * @generated
   */
  EClass getECLReal();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLfieldType <em>EC Lfield Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EC Lfield Type</em>'.
   * @see org.xtext.hipie.hIPIE.ECLfieldType
   * @generated
   */
  EClass getECLfieldType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.ECLfieldType#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Options</em>'.
   * @see org.xtext.hipie.hIPIE.ECLfieldType#getOptions()
   * @see #getECLfieldType()
   * @generated
   */
  EReference getECLfieldType_Options();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.PosVizData <em>Pos Viz Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pos Viz Data</em>'.
   * @see org.xtext.hipie.hIPIE.PosVizData
   * @generated
   */
  EClass getPosVizData();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.PosVizData#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.PosVizData#getName()
   * @see #getPosVizData()
   * @generated
   */
  EAttribute getPosVizData_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLOutputDecl <em>ECL Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Output Decl</em>'.
   * @see org.xtext.hipie.hIPIE.ECLOutputDecl
   * @generated
   */
  EClass getECLOutputDecl();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutputOption <em>Output Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Option</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOption
   * @generated
   */
  EClass getOutputOption();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.OutputOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOption#getName()
   * @see #getOutputOption()
   * @generated
   */
  EAttribute getOutputOption_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.hipie.hIPIE.OutputOption#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Vars</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOption#getVars()
   * @see #getOutputOption()
   * @generated
   */
  EReference getOutputOption_Vars();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.OutputOption#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOption#getVals()
   * @see #getOutputOption()
   * @generated
   */
  EReference getOutputOption_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutputOptions <em>Output Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Options</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOptions
   * @generated
   */
  EClass getOutputOptions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.OutputOptions#getOutput_ops <em>Output ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output ops</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOptions#getOutput_ops()
   * @see #getOutputOptions()
   * @generated
   */
  EReference getOutputOptions_Output_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutType <em>Out Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Type</em>'.
   * @see org.xtext.hipie.hIPIE.OutType
   * @generated
   */
  EClass getOutType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.OutType#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.xtext.hipie.hIPIE.OutType#getVal()
   * @see #getOutType()
   * @generated
   */
  EReference getOutType_Val();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.OutType#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ops</em>'.
   * @see org.xtext.hipie.hIPIE.OutType#getOps()
   * @see #getOutType()
   * @generated
   */
  EReference getOutType_Ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutDataset <em>Out Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Dataset</em>'.
   * @see org.xtext.hipie.hIPIE.OutDataset
   * @generated
   */
  EClass getOutDataset();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.OutDataset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.OutDataset#getName()
   * @see #getOutDataset()
   * @generated
   */
  EAttribute getOutDataset_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.OutDataset#getOut_base <em>Out base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out base</em>'.
   * @see org.xtext.hipie.hIPIE.OutDataset#getOut_base()
   * @see #getOutDataset()
   * @generated
   */
  EReference getOutDataset_Out_base();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.OutDataset#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ops</em>'.
   * @see org.xtext.hipie.hIPIE.OutDataset#getOps()
   * @see #getOutDataset()
   * @generated
   */
  EReference getOutDataset_Ops();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.OutDataset#getEcl_vars <em>Ecl vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ecl vars</em>'.
   * @see org.xtext.hipie.hIPIE.OutDataset#getEcl_vars()
   * @see #getOutDataset()
   * @generated
   */
  EReference getOutDataset_Ecl_vars();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutputValue <em>Output Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Value</em>'.
   * @see org.xtext.hipie.hIPIE.OutputValue
   * @generated
   */
  EClass getOutputValue();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutputBase <em>Output Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Base</em>'.
   * @see org.xtext.hipie.hIPIE.OutputBase
   * @generated
   */
  EClass getOutputBase();

  /**
   * Returns the meta object for the reference '{@link org.xtext.hipie.hIPIE.OutputBase#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base</em>'.
   * @see org.xtext.hipie.hIPIE.OutputBase#getBase()
   * @see #getOutputBase()
   * @generated
   */
  EReference getOutputBase_Base();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.GenerateSection <em>Generate Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generate Section</em>'.
   * @see org.xtext.hipie.hIPIE.GenerateSection
   * @generated
   */
  EClass getGenerateSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.GenerateSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.GenerateSection#getName()
   * @see #getGenerateSection()
   * @generated
   */
  EAttribute getGenerateSection_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.GenerateBodyInline <em>Generate Body Inline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generate Body Inline</em>'.
   * @see org.xtext.hipie.hIPIE.GenerateBodyInline
   * @generated
   */
  EClass getGenerateBodyInline();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.GenerateBodySalt <em>Generate Body Salt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generate Body Salt</em>'.
   * @see org.xtext.hipie.hIPIE.GenerateBodySalt
   * @generated
   */
  EClass getGenerateBodySalt();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisualSection <em>Visual Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visual Section</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSection
   * @generated
   */
  EClass getVisualSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VisualSection#getSec_name <em>Sec name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sec name</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSection#getSec_name()
   * @see #getVisualSection()
   * @generated
   */
  EAttribute getVisualSection_Sec_name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisualSection#getVis_ops <em>Vis ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vis ops</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSection#getVis_ops()
   * @see #getVisualSection()
   * @generated
   */
  EReference getVisualSection_Vis_ops();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VisualSection#getVis_elements <em>Vis elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vis elements</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSection#getVis_elements()
   * @see #getVisualSection()
   * @generated
   */
  EReference getVisualSection_Vis_elements();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Visualization <em>Visualization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visualization</em>'.
   * @see org.xtext.hipie.hIPIE.Visualization
   * @generated
   */
  EClass getVisualization();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Visualization#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Visualization#getName()
   * @see #getVisualization()
   * @generated
   */
  EAttribute getVisualization_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Visualization#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.xtext.hipie.hIPIE.Visualization#getInput()
   * @see #getVisualization()
   * @generated
   */
  EReference getVisualization_Input();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Visualization#getVis_op <em>Vis op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vis op</em>'.
   * @see org.xtext.hipie.hIPIE.Visualization#getVis_op()
   * @see #getVisualization()
   * @generated
   */
  EReference getVisualization_Vis_op();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisBasis <em>Vis Basis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vis Basis</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasis
   * @generated
   */
  EClass getVisBasis();

  /**
   * Returns the meta object for the reference '{@link org.xtext.hipie.hIPIE.VisBasis#getBasis <em>Basis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Basis</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasis#getBasis()
   * @see #getVisBasis()
   * @generated
   */
  EReference getVisBasis_Basis();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisBasis#getQuals <em>Quals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quals</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasis#getQuals()
   * @see #getVisBasis()
   * @generated
   */
  EReference getVisBasis_Quals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisBasisQualifiers <em>Vis Basis Qualifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vis Basis Qualifiers</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasisQualifiers
   * @generated
   */
  EClass getVisBasisQualifiers();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VisBasisQualifiers#getFuncs <em>Funcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Funcs</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasisQualifiers#getFuncs()
   * @see #getVisBasisQualifiers()
   * @generated
   */
  EReference getVisBasisQualifiers_Funcs();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.hipie.hIPIE.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the reference '{@link org.xtext.hipie.hIPIE.Function#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Vars</em>'.
   * @see org.xtext.hipie.hIPIE.Function#getVars()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Vars();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Function#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.Function#getVals()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisualSectionOptions <em>Visual Section Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visual Section Options</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSectionOptions
   * @generated
   */
  EClass getVisualSectionOptions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VisualSectionOptions#getVis_ops <em>Vis ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vis ops</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSectionOptions#getVis_ops()
   * @see #getVisualSectionOptions()
   * @generated
   */
  EReference getVisualSectionOptions_Vis_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisualSectionOption <em>Visual Section Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visual Section Option</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSectionOption
   * @generated
   */
  EClass getVisualSectionOption();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VisualSectionOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSectionOption#getName()
   * @see #getVisualSectionOption()
   * @generated
   */
  EAttribute getVisualSectionOption_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisualSectionOption#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSectionOption#getVals()
   * @see #getVisualSectionOption()
   * @generated
   */
  EReference getVisualSectionOption_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisualOptions <em>Visual Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visual Options</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOptions
   * @generated
   */
  EClass getVisualOptions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VisualOptions#getVis_ops <em>Vis ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vis ops</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOptions#getVis_ops()
   * @see #getVisualOptions()
   * @generated
   */
  EReference getVisualOptions_Vis_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisualOption <em>Visual Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visual Option</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOption
   * @generated
   */
  EClass getVisualOption();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VisualOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOption#getName()
   * @see #getVisualOption()
   * @generated
   */
  EAttribute getVisualOption_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VisualOption#getFuncs <em>Funcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Funcs</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOption#getFuncs()
   * @see #getVisualOption()
   * @generated
   */
  EReference getVisualOption_Funcs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisualOption#getVis_mult <em>Vis mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vis mult</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOption#getVis_mult()
   * @see #getVisualOption()
   * @generated
   */
  EReference getVisualOption_Vis_mult();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisualMultival <em>Visual Multival</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visual Multival</em>'.
   * @see org.xtext.hipie.hIPIE.VisualMultival
   * @generated
   */
  EClass getVisualMultival();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VisualMultival#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.VisualMultival#getName()
   * @see #getVisualMultival()
   * @generated
   */
  EAttribute getVisualMultival_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.CustomSection <em>Custom Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Section</em>'.
   * @see org.xtext.hipie.hIPIE.CustomSection
   * @generated
   */
  EClass getCustomSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.CustomSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.CustomSection#getName()
   * @see #getCustomSection()
   * @generated
   */
  EAttribute getCustomSection_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.CustomSection#getCust_vals <em>Cust vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cust vals</em>'.
   * @see org.xtext.hipie.hIPIE.CustomSection#getCust_vals()
   * @see #getCustomSection()
   * @generated
   */
  EReference getCustomSection_Cust_vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.CustomValue <em>Custom Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Value</em>'.
   * @see org.xtext.hipie.hIPIE.CustomValue
   * @generated
   */
  EClass getCustomValue();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ResourceOption <em>Resource Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Option</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceOption
   * @generated
   */
  EClass getResourceOption();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.ResourceOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceOption#getName()
   * @see #getResourceOption()
   * @generated
   */
  EAttribute getResourceOption_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.ResourceOption#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceOption#getVals()
   * @see #getResourceOption()
   * @generated
   */
  EReference getResourceOption_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ResourceOptions <em>Resource Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Options</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceOptions
   * @generated
   */
  EClass getResourceOptions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.ResourceOptions#getRes_ops <em>Res ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Res ops</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceOptions#getRes_ops()
   * @see #getResourceOptions()
   * @generated
   */
  EReference getResourceOptions_Res_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ResourceValue <em>Resource Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Value</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceValue
   * @generated
   */
  EClass getResourceValue();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ResourceSection <em>Resource Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Section</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceSection
   * @generated
   */
  EClass getResourceSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.ResourceSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceSection#getName()
   * @see #getResourceSection()
   * @generated
   */
  EAttribute getResourceSection_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.ResourceSection#getRes_vals <em>Res vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Res vals</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceSection#getRes_vals()
   * @see #getResourceSection()
   * @generated
   */
  EReference getResourceSection_Res_vals();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ProgramImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Composition header</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__COMPOSITION_HEADER = eINSTANCE.getProgram_Composition_header();

    /**
     * The meta object literal for the '<em><b>Base props</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__BASE_PROPS = eINSTANCE.getProgram_Base_props();

    /**
     * The meta object literal for the '<em><b>Contract instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CONTRACT_INSTANCES = eINSTANCE.getProgram_Contract_instances();

    /**
     * The meta object literal for the '<em><b>Input section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INPUT_SECTION = eINSTANCE.getProgram_Input_section();

    /**
     * The meta object literal for the '<em><b>Output section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__OUTPUT_SECTION = eINSTANCE.getProgram_Output_section();

    /**
     * The meta object literal for the '<em><b>Visual section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__VISUAL_SECTION = eINSTANCE.getProgram_Visual_section();

    /**
     * The meta object literal for the '<em><b>Generate section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__GENERATE_SECTION = eINSTANCE.getProgram_Generate_section();

    /**
     * The meta object literal for the '<em><b>Custom section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CUSTOM_SECTION = eINSTANCE.getProgram_Custom_section();

    /**
     * The meta object literal for the '<em><b>Sesource section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__SESOURCE_SECTION = eINSTANCE.getProgram_Sesource_section();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.BasePropImpl <em>Base Prop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.BasePropImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getBaseProp()
     * @generated
     */
    EClass BASE_PROP = eINSTANCE.getBaseProp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_PROP__NAME = eINSTANCE.getBaseProp_Name();

    /**
     * The meta object literal for the '<em><b>Val list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_PROP__VAL_LIST = eINSTANCE.getBaseProp_Val_list();

    /**
     * The meta object literal for the '<em><b>Cat list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_PROP__CAT_LIST = eINSTANCE.getBaseProp_Cat_list();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.CategoryTypeListImpl <em>Category Type List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.CategoryTypeListImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCategoryTypeList()
     * @generated
     */
    EClass CATEGORY_TYPE_LIST = eINSTANCE.getCategoryTypeList();

    /**
     * The meta object literal for the '<em><b>Cats</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY_TYPE_LIST__CATS = eINSTANCE.getCategoryTypeList_Cats();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ValueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__NAME = eINSTANCE.getValue_Name();

    /**
     * The meta object literal for the '<em><b>Int val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__INT_VAL = eINSTANCE.getValue_Int_val();

    /**
     * The meta object literal for the '<em><b>Str val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__STR_VAL = eINSTANCE.getValue_Str_val();

    /**
     * The meta object literal for the '<em><b>Res ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__RES_OPS = eINSTANCE.getValue_Res_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ValueListImpl <em>Value List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ValueListImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getValueList()
     * @generated
     */
    EClass VALUE_LIST = eINSTANCE.getValueList();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_LIST__VALS = eINSTANCE.getValueList_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.AssignImpl <em>Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.AssignImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getAssign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getAssign();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGN__NAME = eINSTANCE.getAssign_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__VALS = eINSTANCE.getAssign_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.AssignListImpl <em>Assign List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.AssignListImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getAssignList()
     * @generated
     */
    EClass ASSIGN_LIST = eINSTANCE.getAssignList();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_LIST__ASSIGNS = eINSTANCE.getAssignList_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.CompositionHeaderImpl <em>Composition Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.CompositionHeaderImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCompositionHeader()
     * @generated
     */
    EClass COMPOSITION_HEADER = eINSTANCE.getCompositionHeader();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSITION_HEADER__NAME = eINSTANCE.getCompositionHeader_Name();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITION_HEADER__ASSIGNS = eINSTANCE.getCompositionHeader_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl <em>Contract Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ContractInstanceImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getContractInstance()
     * @generated
     */
    EClass CONTRACT_INSTANCE = eINSTANCE.getContractInstance();

    /**
     * The meta object literal for the '<em><b>Sec name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACT_INSTANCE__SEC_NAME = eINSTANCE.getContractInstance_Sec_name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_INSTANCE__VALS = eINSTANCE.getContractInstance_Vals();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_INSTANCE__VARS = eINSTANCE.getContractInstance_Vars();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_INSTANCE__ASSIGNS = eINSTANCE.getContractInstance_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.FieldDeclImpl <em>Field Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.FieldDeclImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getFieldDecl()
     * @generated
     */
    EClass FIELD_DECL = eINSTANCE.getFieldDecl();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECL__INPUT_OPS = eINSTANCE.getFieldDecl_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.EnumDeclImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getEnumDecl()
     * @generated
     */
    EClass ENUM_DECL = eINSTANCE.getEnumDecl();

    /**
     * The meta object literal for the '<em><b>Enum dec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_DECL__ENUM_DEC = eINSTANCE.getEnumDecl_Enum_dec();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__VALS = eINSTANCE.getEnumDecl_Vals();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__ASSIGNS = eINSTANCE.getEnumDecl_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InputSectionImpl <em>Input Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InputSectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputSection()
     * @generated
     */
    EClass INPUT_SECTION = eINSTANCE.getInputSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_SECTION__NAME = eINSTANCE.getInputSection_Name();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_SECTION__INPUTS = eINSTANCE.getInputSection_Inputs();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.BoolImpl <em>Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.BoolImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getBool()
     * @generated
     */
    EClass BOOL = eINSTANCE.getBool();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL__NAME = eINSTANCE.getBool_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.IntVarImpl <em>Int Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.IntVarImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getIntVar()
     * @generated
     */
    EClass INT_VAR = eINSTANCE.getIntVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VAR__NAME = eINSTANCE.getIntVar_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.StringVarImpl <em>String Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.StringVarImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getStringVar()
     * @generated
     */
    EClass STRING_VAR = eINSTANCE.getStringVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VAR__NAME = eINSTANCE.getStringVar_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.RecordImpl <em>Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.RecordImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getRecord()
     * @generated
     */
    EClass RECORD = eINSTANCE.getRecord();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__NAME = eINSTANCE.getRecord_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.DatasetImpl <em>Dataset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.DatasetImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getDataset()
     * @generated
     */
    EClass DATASET = eINSTANCE.getDataset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATASET__NAME = eINSTANCE.getDataset_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET__FIELDS = eINSTANCE.getDataset_Fields();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.GroupImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__VALS = eINSTANCE.getGroup_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.DatatypeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InputValueImpl <em>Input Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InputValueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputValue()
     * @generated
     */
    EClass INPUT_VALUE = eINSTANCE.getInputValue();

    /**
     * The meta object literal for the '<em><b>Input op list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_VALUE__INPUT_OP_LIST = eINSTANCE.getInputValue_Input_op_list();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InputOptionsImpl <em>Input Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InputOptionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputOptions()
     * @generated
     */
    EClass INPUT_OPTIONS = eINSTANCE.getInputOptions();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTIONS__INPUT_OPS = eINSTANCE.getInputOptions_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InputOptionImpl <em>Input Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InputOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputOption()
     * @generated
     */
    EClass INPUT_OPTION = eINSTANCE.getInputOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPTION__NAME = eINSTANCE.getInputOption_Name();

    /**
     * The meta object literal for the '<em><b>Assigns list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTION__ASSIGNS_LIST = eINSTANCE.getInputOption_Assigns_list();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTION__VALS = eINSTANCE.getInputOption_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutputSectionImpl <em>Output Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutputSectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputSection()
     * @generated
     */
    EClass OUTPUT_SECTION = eINSTANCE.getOutputSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_SECTION__NAME = eINSTANCE.getOutputSection_Name();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_SECTION__OUTPUTS = eINSTANCE.getOutputSection_Outputs();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutfieldDeclImpl <em>Outfield Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutfieldDeclImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutfieldDecl()
     * @generated
     */
    EClass OUTFIELD_DECL = eINSTANCE.getOutfieldDecl();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTFIELD_DECL__FIELDS = eINSTANCE.getOutfieldDecl_Fields();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLIntegerImpl <em>ECL Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLIntegerImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLInteger()
     * @generated
     */
    EClass ECL_INTEGER = eINSTANCE.getECLInteger();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLUnsignedImpl <em>ECL Unsigned</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLUnsignedImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLUnsigned()
     * @generated
     */
    EClass ECL_UNSIGNED = eINSTANCE.getECLUnsigned();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLStringImpl <em>ECL String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLStringImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLString()
     * @generated
     */
    EClass ECL_STRING = eINSTANCE.getECLString();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLQstringImpl <em>ECL Qstring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLQstringImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLQstring()
     * @generated
     */
    EClass ECL_QSTRING = eINSTANCE.getECLQstring();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLVarstringImpl <em>ECL Varstring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLVarstringImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLVarstring()
     * @generated
     */
    EClass ECL_VARSTRING = eINSTANCE.getECLVarstring();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLUnicodeImpl <em>ECL Unicode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLUnicodeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLUnicode()
     * @generated
     */
    EClass ECL_UNICODE = eINSTANCE.getECLUnicode();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLVarunicodeImpl <em>ECL Varunicode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLVarunicodeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLVarunicode()
     * @generated
     */
    EClass ECL_VARUNICODE = eINSTANCE.getECLVarunicode();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLDataImpl <em>ECL Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLDataImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLData()
     * @generated
     */
    EClass ECL_DATA = eINSTANCE.getECLData();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLRealImpl <em>ECL Real</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLRealImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLReal()
     * @generated
     */
    EClass ECL_REAL = eINSTANCE.getECLReal();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl <em>EC Lfield Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLfieldType()
     * @generated
     */
    EClass EC_LFIELD_TYPE = eINSTANCE.getECLfieldType();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EC_LFIELD_TYPE__OPTIONS = eINSTANCE.getECLfieldType_Options();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.PosVizDataImpl <em>Pos Viz Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.PosVizDataImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getPosVizData()
     * @generated
     */
    EClass POS_VIZ_DATA = eINSTANCE.getPosVizData();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POS_VIZ_DATA__NAME = eINSTANCE.getPosVizData_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLOutputDeclImpl <em>ECL Output Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLOutputDeclImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLOutputDecl()
     * @generated
     */
    EClass ECL_OUTPUT_DECL = eINSTANCE.getECLOutputDecl();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutputOptionImpl <em>Output Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutputOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputOption()
     * @generated
     */
    EClass OUTPUT_OPTION = eINSTANCE.getOutputOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPTION__NAME = eINSTANCE.getOutputOption_Name();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPTION__VARS = eINSTANCE.getOutputOption_Vars();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPTION__VALS = eINSTANCE.getOutputOption_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutputOptionsImpl <em>Output Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutputOptionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputOptions()
     * @generated
     */
    EClass OUTPUT_OPTIONS = eINSTANCE.getOutputOptions();

    /**
     * The meta object literal for the '<em><b>Output ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPTIONS__OUTPUT_OPS = eINSTANCE.getOutputOptions_Output_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutTypeImpl <em>Out Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutTypeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutType()
     * @generated
     */
    EClass OUT_TYPE = eINSTANCE.getOutType();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_TYPE__VAL = eINSTANCE.getOutType_Val();

    /**
     * The meta object literal for the '<em><b>Ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_TYPE__OPS = eINSTANCE.getOutType_Ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutDatasetImpl <em>Out Dataset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutDatasetImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutDataset()
     * @generated
     */
    EClass OUT_DATASET = eINSTANCE.getOutDataset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUT_DATASET__NAME = eINSTANCE.getOutDataset_Name();

    /**
     * The meta object literal for the '<em><b>Out base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_DATASET__OUT_BASE = eINSTANCE.getOutDataset_Out_base();

    /**
     * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_DATASET__OPS = eINSTANCE.getOutDataset_Ops();

    /**
     * The meta object literal for the '<em><b>Ecl vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_DATASET__ECL_VARS = eINSTANCE.getOutDataset_Ecl_vars();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutputValueImpl <em>Output Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutputValueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputValue()
     * @generated
     */
    EClass OUTPUT_VALUE = eINSTANCE.getOutputValue();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutputBaseImpl <em>Output Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutputBaseImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputBase()
     * @generated
     */
    EClass OUTPUT_BASE = eINSTANCE.getOutputBase();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_BASE__BASE = eINSTANCE.getOutputBase_Base();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.GenerateSectionImpl <em>Generate Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.GenerateSectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateSection()
     * @generated
     */
    EClass GENERATE_SECTION = eINSTANCE.getGenerateSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATE_SECTION__NAME = eINSTANCE.getGenerateSection_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.GenerateBodyInlineImpl <em>Generate Body Inline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.GenerateBodyInlineImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateBodyInline()
     * @generated
     */
    EClass GENERATE_BODY_INLINE = eINSTANCE.getGenerateBodyInline();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.GenerateBodySaltImpl <em>Generate Body Salt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.GenerateBodySaltImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateBodySalt()
     * @generated
     */
    EClass GENERATE_BODY_SALT = eINSTANCE.getGenerateBodySalt();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisualSectionImpl <em>Visual Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisualSectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualSection()
     * @generated
     */
    EClass VISUAL_SECTION = eINSTANCE.getVisualSection();

    /**
     * The meta object literal for the '<em><b>Sec name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_SECTION__SEC_NAME = eINSTANCE.getVisualSection_Sec_name();

    /**
     * The meta object literal for the '<em><b>Vis ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION__VIS_OPS = eINSTANCE.getVisualSection_Vis_ops();

    /**
     * The meta object literal for the '<em><b>Vis elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION__VIS_ELEMENTS = eINSTANCE.getVisualSection_Vis_elements();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisualizationImpl <em>Visualization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisualizationImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualization()
     * @generated
     */
    EClass VISUALIZATION = eINSTANCE.getVisualization();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUALIZATION__NAME = eINSTANCE.getVisualization_Name();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__INPUT = eINSTANCE.getVisualization_Input();

    /**
     * The meta object literal for the '<em><b>Vis op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__VIS_OP = eINSTANCE.getVisualization_Vis_op();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisBasisImpl <em>Vis Basis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisBasisImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisBasis()
     * @generated
     */
    EClass VIS_BASIS = eINSTANCE.getVisBasis();

    /**
     * The meta object literal for the '<em><b>Basis</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS__BASIS = eINSTANCE.getVisBasis_Basis();

    /**
     * The meta object literal for the '<em><b>Quals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS__QUALS = eINSTANCE.getVisBasis_Quals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl <em>Vis Basis Qualifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisBasisQualifiers()
     * @generated
     */
    EClass VIS_BASIS_QUALIFIERS = eINSTANCE.getVisBasisQualifiers();

    /**
     * The meta object literal for the '<em><b>Funcs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS_QUALIFIERS__FUNCS = eINSTANCE.getVisBasisQualifiers_Funcs();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.FunctionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__VARS = eINSTANCE.getFunction_Vars();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__VALS = eINSTANCE.getFunction_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisualSectionOptionsImpl <em>Visual Section Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisualSectionOptionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualSectionOptions()
     * @generated
     */
    EClass VISUAL_SECTION_OPTIONS = eINSTANCE.getVisualSectionOptions();

    /**
     * The meta object literal for the '<em><b>Vis ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION_OPTIONS__VIS_OPS = eINSTANCE.getVisualSectionOptions_Vis_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisualSectionOptionImpl <em>Visual Section Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisualSectionOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualSectionOption()
     * @generated
     */
    EClass VISUAL_SECTION_OPTION = eINSTANCE.getVisualSectionOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_SECTION_OPTION__NAME = eINSTANCE.getVisualSectionOption_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION_OPTION__VALS = eINSTANCE.getVisualSectionOption_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisualOptionsImpl <em>Visual Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisualOptionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualOptions()
     * @generated
     */
    EClass VISUAL_OPTIONS = eINSTANCE.getVisualOptions();

    /**
     * The meta object literal for the '<em><b>Vis ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTIONS__VIS_OPS = eINSTANCE.getVisualOptions_Vis_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl <em>Visual Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisualOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualOption()
     * @generated
     */
    EClass VISUAL_OPTION = eINSTANCE.getVisualOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_OPTION__NAME = eINSTANCE.getVisualOption_Name();

    /**
     * The meta object literal for the '<em><b>Funcs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTION__FUNCS = eINSTANCE.getVisualOption_Funcs();

    /**
     * The meta object literal for the '<em><b>Vis mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTION__VIS_MULT = eINSTANCE.getVisualOption_Vis_mult();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisualMultivalImpl <em>Visual Multival</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisualMultivalImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualMultival()
     * @generated
     */
    EClass VISUAL_MULTIVAL = eINSTANCE.getVisualMultival();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_MULTIVAL__NAME = eINSTANCE.getVisualMultival_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.CustomSectionImpl <em>Custom Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.CustomSectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCustomSection()
     * @generated
     */
    EClass CUSTOM_SECTION = eINSTANCE.getCustomSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_SECTION__NAME = eINSTANCE.getCustomSection_Name();

    /**
     * The meta object literal for the '<em><b>Cust vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_SECTION__CUST_VALS = eINSTANCE.getCustomSection_Cust_vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.CustomValueImpl <em>Custom Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.CustomValueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCustomValue()
     * @generated
     */
    EClass CUSTOM_VALUE = eINSTANCE.getCustomValue();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ResourceOptionImpl <em>Resource Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ResourceOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceOption()
     * @generated
     */
    EClass RESOURCE_OPTION = eINSTANCE.getResourceOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_OPTION__NAME = eINSTANCE.getResourceOption_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_OPTION__VALS = eINSTANCE.getResourceOption_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ResourceOptionsImpl <em>Resource Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ResourceOptionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceOptions()
     * @generated
     */
    EClass RESOURCE_OPTIONS = eINSTANCE.getResourceOptions();

    /**
     * The meta object literal for the '<em><b>Res ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_OPTIONS__RES_OPS = eINSTANCE.getResourceOptions_Res_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ResourceValueImpl <em>Resource Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ResourceValueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceValue()
     * @generated
     */
    EClass RESOURCE_VALUE = eINSTANCE.getResourceValue();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ResourceSectionImpl <em>Resource Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ResourceSectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceSection()
     * @generated
     */
    EClass RESOURCE_SECTION = eINSTANCE.getResourceSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_SECTION__NAME = eINSTANCE.getResourceSection_Name();

    /**
     * The meta object literal for the '<em><b>Res vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_SECTION__RES_VALS = eINSTANCE.getResourceSection_Res_vals();

  }

} //HIPIEPackage
