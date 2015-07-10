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
   * The feature id for the '<em><b>Permissions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PERMISSIONS = 2;

  /**
   * The feature id for the '<em><b>Input section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INPUT_SECTION = 3;

  /**
   * The feature id for the '<em><b>Contract instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CONTRACT_INSTANCES = 4;

  /**
   * The feature id for the '<em><b>Output section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__OUTPUT_SECTION = 5;

  /**
   * The feature id for the '<em><b>Integrate section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INTEGRATE_SECTION = 6;

  /**
   * The feature id for the '<em><b>Visual section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__VISUAL_SECTION = 7;

  /**
   * The feature id for the '<em><b>Generate section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__GENERATE_SECTION = 8;

  /**
   * The feature id for the '<em><b>Custom section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CUSTOM_SECTION = 9;

  /**
   * The feature id for the '<em><b>Resource section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__RESOURCE_SECTION = 10;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 11;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CategoryTypeImpl <em>Category Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CategoryTypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCategoryType()
   * @generated
   */
  int CATEGORY_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Category Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CategoryTypeListImpl <em>Category Type List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CategoryTypeListImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCategoryTypeList()
   * @generated
   */
  int CATEGORY_TYPE_LIST = 3;

  /**
   * The feature id for the '<em><b>Cats</b></em>' containment reference list.
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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualOptionImpl <em>Visual Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualOption()
   * @generated
   */
  int VISUAL_OPTION = 87;

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
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__DECL = 2;

  /**
   * The feature id for the '<em><b>Vis cust</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__VIS_CUST = 3;

  /**
   * The feature id for the '<em><b>Visibility op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__VISIBILITY_OP = 4;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION__ASSIGNS = 5;

  /**
   * The number of structural features of the '<em>Visual Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_OPTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.SelectOptionImpl <em>Select Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.SelectOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getSelectOption()
   * @generated
   */
  int SELECT_OPTION = 89;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OPTION__NAME = VISUAL_OPTION__NAME;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OPTION__FUNCS = VISUAL_OPTION__FUNCS;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OPTION__DECL = VISUAL_OPTION__DECL;

  /**
   * The feature id for the '<em><b>Vis cust</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OPTION__VIS_CUST = VISUAL_OPTION__VIS_CUST;

  /**
   * The feature id for the '<em><b>Visibility op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OPTION__VISIBILITY_OP = VISUAL_OPTION__VISIBILITY_OP;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OPTION__ASSIGNS = VISUAL_OPTION__ASSIGNS;

  /**
   * The feature id for the '<em><b>Maps</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OPTION__MAPS = VISUAL_OPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OPTION_FEATURE_COUNT = VISUAL_OPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.SelectEventImpl <em>Select Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.SelectEventImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getSelectEvent()
   * @generated
   */
  int SELECT_EVENT = 88;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EVENT__NAME = SELECT_OPTION__NAME;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EVENT__FUNCS = SELECT_OPTION__FUNCS;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EVENT__DECL = SELECT_OPTION__DECL;

  /**
   * The feature id for the '<em><b>Vis cust</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EVENT__VIS_CUST = SELECT_OPTION__VIS_CUST;

  /**
   * The feature id for the '<em><b>Visibility op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EVENT__VISIBILITY_OP = SELECT_OPTION__VISIBILITY_OP;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EVENT__ASSIGNS = SELECT_OPTION__ASSIGNS;

  /**
   * The feature id for the '<em><b>Maps</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EVENT__MAPS = SELECT_OPTION__MAPS;

  /**
   * The number of structural features of the '<em>Select Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EVENT_FEATURE_COUNT = SELECT_OPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getValue()
   * @generated
   */
  int VALUE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NAME = SELECT_EVENT__NAME;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__FUNCS = SELECT_EVENT__FUNCS;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__DECL = SELECT_EVENT__DECL;

  /**
   * The feature id for the '<em><b>Vis cust</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VIS_CUST = SELECT_EVENT__VIS_CUST;

  /**
   * The feature id for the '<em><b>Visibility op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VISIBILITY_OP = SELECT_EVENT__VISIBILITY_OP;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__ASSIGNS = SELECT_EVENT__ASSIGNS;

  /**
   * The feature id for the '<em><b>Maps</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__MAPS = SELECT_EVENT__MAPS;

  /**
   * The feature id for the '<em><b>Int val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__INT_VAL = SELECT_EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Str val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__STR_VAL = SELECT_EVENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Res ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__RES_OPS = SELECT_EVENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = SELECT_EVENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InstanceOptionImpl <em>Instance Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InstanceOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInstanceOption()
   * @generated
   */
  int INSTANCE_OPTION = 11;

  /**
   * The number of structural features of the '<em>Instance Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OPTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ValueListImpl <em>Value List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ValueListImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getValueList()
   * @generated
   */
  int VALUE_LIST = 5;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST__VALS = INSTANCE_OPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST_FEATURE_COUNT = INSTANCE_OPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.AssignImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 6;

  /**
   * The feature id for the '<em><b>Vals l</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VALS_L = 0;

  /**
   * The feature id for the '<em><b>Vals r</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VALS_R = 1;

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
  int ASSIGN_LIST = 7;

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
  int COMPOSITION_HEADER = 8;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InstanceIDImpl <em>Instance ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InstanceIDImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInstanceID()
   * @generated
   */
  int INSTANCE_ID = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>Instance ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InstanceOptionsImpl <em>Instance Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InstanceOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInstanceOptions()
   * @generated
   */
  int INSTANCE_OPTIONS = 10;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OPTIONS__IN_OPS = 0;

  /**
   * The number of structural features of the '<em>Instance Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ContractInstanceImpl <em>Contract Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ContractInstanceImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getContractInstance()
   * @generated
   */
  int CONTRACT_INSTANCE = 12;

  /**
   * The feature id for the '<em><b>Sec name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE__SEC_NAME = 0;

  /**
   * The feature id for the '<em><b>Inst Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE__INST_ID = 1;

  /**
   * The feature id for the '<em><b>Instance ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_INSTANCE__INSTANCE_OPS = 2;

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
  int POS_VIZ_DATA = 77;

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
  int FIELD_DECL = 13;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.KelAttrDeclImpl <em>Kel Attr Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.KelAttrDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getKelAttrDecl()
   * @generated
   */
  int KEL_ATTR_DECL = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ATTR_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ATTR_DECL__INPUT_OPS = 1;

  /**
   * The number of structural features of the '<em>Kel Attr Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ATTR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.KelEntityDeclSimpleImpl <em>Kel Entity Decl Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.KelEntityDeclSimpleImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getKelEntityDeclSimple()
   * @generated
   */
  int KEL_ENTITY_DECL_SIMPLE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ENTITY_DECL_SIMPLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ENTITY_DECL_SIMPLE__INPUT_OPS = 1;

  /**
   * The number of structural features of the '<em>Kel Entity Decl Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ENTITY_DECL_SIMPLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.KelEntityDeclImpl <em>Kel Entity Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.KelEntityDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getKelEntityDecl()
   * @generated
   */
  int KEL_ENTITY_DECL = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ENTITY_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Input ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ENTITY_DECL__INPUT_OPS = 1;

  /**
   * The feature id for the '<em><b>Attrdecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ENTITY_DECL__ATTRDECL = 2;

  /**
   * The number of structural features of the '<em>Kel Entity Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_ENTITY_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.EnumEntryImpl <em>Enum Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.EnumEntryImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getEnumEntry()
   * @generated
   */
  int ENUM_ENTRY = 17;

  /**
   * The feature id for the '<em><b>Val l</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTRY__VAL_L = 0;

  /**
   * The feature id for the '<em><b>Val r</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTRY__VAL_R = 1;

  /**
   * The number of structural features of the '<em>Enum Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.EnumListImpl <em>Enum List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.EnumListImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getEnumList()
   * @generated
   */
  int ENUM_LIST = 18;

  /**
   * The feature id for the '<em><b>En ents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIST__EN_ENTS = 0;

  /**
   * The number of structural features of the '<em>Enum List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.DatatypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 30;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputSimpleTypesImpl <em>Input Simple Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputSimpleTypesImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputSimpleTypes()
   * @generated
   */
  int INPUT_SIMPLE_TYPES = 27;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SIMPLE_TYPES__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SIMPLE_TYPES__IN_OPS = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Input Simple Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SIMPLE_TYPES_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.EnumDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getEnumDecl()
   * @generated
   */
  int ENUM_DECL = 19;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__INPUT_OP_LIST = INPUT_SIMPLE_TYPES__INPUT_OP_LIST;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__IN_OPS = INPUT_SIMPLE_TYPES__IN_OPS;

  /**
   * The feature id for the '<em><b>Enum dec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__ENUM_DEC = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enum list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__ENUM_LIST = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL_FEATURE_COUNT = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputSectionImpl <em>Input Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputSection()
   * @generated
   */
  int INPUT_SECTION = 20;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.BoolImpl <em>Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.BoolImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getBool()
   * @generated
   */
  int BOOL = 21;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__INPUT_OP_LIST = INPUT_SIMPLE_TYPES__INPUT_OP_LIST;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__IN_OPS = INPUT_SIMPLE_TYPES__IN_OPS;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__FIELDS = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__NAME = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FEATURE_COUNT = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.IntVarImpl <em>Int Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.IntVarImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getIntVar()
   * @generated
   */
  int INT_VAR = 22;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__INPUT_OP_LIST = INPUT_SIMPLE_TYPES__INPUT_OP_LIST;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__IN_OPS = INPUT_SIMPLE_TYPES__IN_OPS;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__FIELDS = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR__NAME = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Int Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAR_FEATURE_COUNT = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.StringVarImpl <em>String Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.StringVarImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getStringVar()
   * @generated
   */
  int STRING_VAR = 23;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__INPUT_OP_LIST = INPUT_SIMPLE_TYPES__INPUT_OP_LIST;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__IN_OPS = INPUT_SIMPLE_TYPES__IN_OPS;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__FIELDS = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR__NAME = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR_FEATURE_COUNT = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.DatasetImpl <em>Dataset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.DatasetImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getDataset()
   * @generated
   */
  int DATASET = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 1;

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
  int GROUP = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__VALS = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.RealImpl <em>Real</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.RealImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getReal()
   * @generated
   */
  int REAL = 26;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL__INPUT_OP_LIST = INPUT_SIMPLE_TYPES__INPUT_OP_LIST;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL__IN_OPS = INPUT_SIMPLE_TYPES__IN_OPS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL__NAME = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FEATURE_COUNT = INPUT_SIMPLE_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.RecordImpl <em>Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.RecordImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getRecord()
   * @generated
   */
  int RECORD = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.KelBaseImpl <em>Kel Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.KelBaseImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getKelBase()
   * @generated
   */
  int KEL_BASE = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_BASE__NAME = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input op list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_BASE__INPUT_OP_LIST = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Kel ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_BASE__KEL_OPS = DATATYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Kel Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEL_BASE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputValueImpl <em>Input Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputValue()
   * @generated
   */
  int INPUT_VALUE = 31;

  /**
   * The number of structural features of the '<em>Input Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputOptionsImpl <em>Input Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputOptions()
   * @generated
   */
  int INPUT_OPTIONS = 32;

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
  int INPUT_OPTION = 33;

  /**
   * The feature id for the '<em><b>Atr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__ATR = 0;

  /**
   * The feature id for the '<em><b>Form</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__FORM = 1;

  /**
   * The feature id for the '<em><b>Form op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__FORM_OP = 2;

  /**
   * The feature id for the '<em><b>Enab</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__ENAB = 3;

  /**
   * The feature id for the '<em><b>Assigns list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__ASSIGNS_LIST = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__TYPE = 5;

  /**
   * The feature id for the '<em><b>Type op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__TYPE_OP = 6;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION__VALS = 7;

  /**
   * The number of structural features of the '<em>Input Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPTION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.InputtypeOptionsImpl <em>Inputtype Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.InputtypeOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputtypeOptions()
   * @generated
   */
  int INPUTTYPE_OPTIONS = 34;

  /**
   * The feature id for the '<em><b>In type op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUTTYPE_OPTIONS__IN_TYPE_OP = 0;

  /**
   * The number of structural features of the '<em>Inputtype Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUTTYPE_OPTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.IntegrateSectionImpl <em>Integrate Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.IntegrateSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getIntegrateSection()
   * @generated
   */
  int INTEGRATE_SECTION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATE_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATE_SECTION__OUTPUTS = 1;

  /**
   * The number of structural features of the '<em>Integrate Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATE_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputSectionImpl <em>Output Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputSection()
   * @generated
   */
  int OUTPUT_SECTION = 36;

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
  int OUTFIELD_DECL = 37;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLOutputDeclImpl <em>ECL Output Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLOutputDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLOutputDecl()
   * @generated
   */
  int ECL_OUTPUT_DECL = 51;

  /**
   * The number of structural features of the '<em>ECL Output Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_OUTPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl <em>EC Lfield Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLfieldTypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLfieldType()
   * @generated
   */
  int EC_LFIELD_TYPE = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_LFIELD_TYPE__NAME = ECL_OUTPUT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_LFIELD_TYPE__OPTIONS = ECL_OUTPUT_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_LFIELD_TYPE__IN_OPS = ECL_OUTPUT_DECL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>EC Lfield Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_LFIELD_TYPE_FEATURE_COUNT = ECL_OUTPUT_DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLIntegerImpl <em>ECL Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLIntegerImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLInteger()
   * @generated
   */
  int ECL_INTEGER = 38;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_INTEGER__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

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
  int ECL_UNSIGNED = 39;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNSIGNED__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

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
  int ECL_STRING = 40;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_STRING__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

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
  int ECL_QSTRING = 41;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_QSTRING__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

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
  int ECL_VARSTRING = 42;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARSTRING__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

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
  int ECL_UNICODE = 43;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_UNICODE__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

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
  int ECL_VARUNICODE = 44;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_VARUNICODE__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

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
  int ECL_DATA = 45;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DATA__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

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
  int ECL_REAL = 46;

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
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REAL__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

  /**
   * The number of structural features of the '<em>ECL Real</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REAL_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLBooleanImpl <em>ECL Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLBooleanImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLBoolean()
   * @generated
   */
  int ECL_BOOLEAN = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_BOOLEAN__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_BOOLEAN__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_BOOLEAN__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

  /**
   * The number of structural features of the '<em>ECL Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_BOOLEAN_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLNumTypeImpl <em>ECL Num Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLNumTypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLNumType()
   * @generated
   */
  int ECL_NUM_TYPE = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_NUM_TYPE__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_NUM_TYPE__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_NUM_TYPE__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

  /**
   * The number of structural features of the '<em>ECL Num Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_NUM_TYPE_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ECLDecTypeImpl <em>ECL Dec Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ECLDecTypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLDecType()
   * @generated
   */
  int ECL_DEC_TYPE = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DEC_TYPE__NAME = EC_LFIELD_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DEC_TYPE__OPTIONS = EC_LFIELD_TYPE__OPTIONS;

  /**
   * The feature id for the '<em><b>In ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DEC_TYPE__IN_OPS = EC_LFIELD_TYPE__IN_OPS;

  /**
   * The number of structural features of the '<em>ECL Dec Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_DEC_TYPE_FEATURE_COUNT = EC_LFIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ServiceInputValueImpl <em>Service Input Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ServiceInputValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getServiceInputValue()
   * @generated
   */
  int SERVICE_INPUT_VALUE = 52;

  /**
   * The number of structural features of the '<em>Service Input Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_INPUT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ServiceInputSectionImpl <em>Service Input Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ServiceInputSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getServiceInputSection()
   * @generated
   */
  int SERVICE_INPUT_SECTION = 53;

  /**
   * The feature id for the '<em><b>Servs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_INPUT_SECTION__SERVS = 0;

  /**
   * The number of structural features of the '<em>Service Input Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_INPUT_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.NestedDatasetDeclImpl <em>Nested Dataset Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.NestedDatasetDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getNestedDatasetDecl()
   * @generated
   */
  int NESTED_DATASET_DECL = 54;

  /**
   * The number of structural features of the '<em>Nested Dataset Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_DATASET_DECL_FEATURE_COUNT = ECL_OUTPUT_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputOptionImpl <em>Output Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputOption()
   * @generated
   */
  int OUTPUT_OPTION = 55;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Atr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__ATR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__NAME = 2;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__ASSIGNS = 3;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION__VALS = 4;

  /**
   * The number of structural features of the '<em>Output Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputOptionsImpl <em>Output Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputOptions()
   * @generated
   */
  int OUTPUT_OPTIONS = 56;

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
  int OUTPUT_VALUE = 60;

  /**
   * The number of structural features of the '<em>Output Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutTypeSimpleImpl <em>Out Type Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutTypeSimpleImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutTypeSimple()
   * @generated
   */
  int OUT_TYPE_SIMPLE = 57;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TYPE_SIMPLE__TYPE = OUTPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TYPE_SIMPLE__VALS = OUTPUT_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Out Type Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TYPE_SIMPLE_FEATURE_COUNT = OUTPUT_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutDatasetImpl <em>Out Dataset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutDatasetImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutDataset()
   * @generated
   */
  int OUT_DATASET = 58;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__OPTIONS = NESTED_DATASET_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__DECL = NESTED_DATASET_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__NAME = NESTED_DATASET_DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Out base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__OUT_BASE = NESTED_DATASET_DECL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__OPS = NESTED_DATASET_DECL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ecl vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET__ECL_VARS = NESTED_DATASET_DECL_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Out Dataset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_DATASET_FEATURE_COUNT = NESTED_DATASET_DECL_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ServiceImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getService()
   * @generated
   */
  int SERVICE = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = OUTPUT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__OPS = OUTPUT_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Serv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERV = OUTPUT_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ecl vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__ECL_VARS = OUTPUT_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = OUTPUT_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.OutputBaseImpl <em>Output Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.OutputBaseImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutputBase()
   * @generated
   */
  int OUTPUT_BASE = 61;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.PermissionsImpl <em>Permissions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.PermissionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getPermissions()
   * @generated
   */
  int PERMISSIONS = 62;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSIONS__NAME = 0;

  /**
   * The feature id for the '<em><b>Perms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSIONS__PERMS = 1;

  /**
   * The number of structural features of the '<em>Permissions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.PermissionImpl <em>Permission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.PermissionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getPermission()
   * @generated
   */
  int PERMISSION = 63;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Cust levs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__CUST_LEVS = 1;

  /**
   * The number of structural features of the '<em>Permission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CustomPermissionLevelImpl <em>Custom Permission Level</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CustomPermissionLevelImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCustomPermissionLevel()
   * @generated
   */
  int CUSTOM_PERMISSION_LEVEL = 64;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_PERMISSION_LEVEL__VALS = 0;

  /**
   * The number of structural features of the '<em>Custom Permission Level</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_PERMISSION_LEVEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.GenerateSectionImpl <em>Generate Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.GenerateSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateSection()
   * @generated
   */
  int GENERATE_SECTION = 65;

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
  int GENERATE_BODY_INLINE = 66;

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
  int GENERATE_BODY_SALT = 67;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.GenerateBodyKelImpl <em>Generate Body Kel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.GenerateBodyKelImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateBodyKel()
   * @generated
   */
  int GENERATE_BODY_KEL = 68;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_BODY_KEL__NAME = GENERATE_SECTION__NAME;

  /**
   * The number of structural features of the '<em>Generate Body Kel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_BODY_KEL_FEATURE_COUNT = GENERATE_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualSectionImpl <em>Visual Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualSection()
   * @generated
   */
  int VISUAL_SECTION = 69;

  /**
   * The feature id for the '<em><b>Section name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION__SECTION_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION__NAME = 1;

  /**
   * The feature id for the '<em><b>Vis ops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION__VIS_OPS = 2;

  /**
   * The feature id for the '<em><b>Vis elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION__VIS_ELEMENTS = 3;

  /**
   * The number of structural features of the '<em>Visual Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisNameImpl <em>Vis Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisNameImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisName()
   * @generated
   */
  int VIS_NAME = 70;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Vis Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisInputValueImpl <em>Vis Input Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisInputValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisInputValue()
   * @generated
   */
  int VIS_INPUT_VALUE = 71;

  /**
   * The number of structural features of the '<em>Vis Input Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_INPUT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisBasisParensImpl <em>Vis Basis Parens</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisBasisParensImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisBasisParens()
   * @generated
   */
  int VIS_BASIS_PARENS = 72;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_PARENS__INPUT = 0;

  /**
   * The number of structural features of the '<em>Vis Basis Parens</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_PARENS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualizationImpl <em>Visualization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualizationImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualization()
   * @generated
   */
  int VISUALIZATION = 73;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Parens</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__PARENS = 2;

  /**
   * The feature id for the '<em><b>Vis op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__VIS_OP = 3;

  /**
   * The feature id for the '<em><b>Input val</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__INPUT_VAL = 4;

  /**
   * The number of structural features of the '<em>Visualization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisBasisImpl <em>Vis Basis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisBasisImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisBasis()
   * @generated
   */
  int VIS_BASIS = 74;

  /**
   * The feature id for the '<em><b>Basis</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS__BASIS = 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS__FILTER = 1;

  /**
   * The feature id for the '<em><b>Quals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS__QUALS = 2;

  /**
   * The number of structural features of the '<em>Vis Basis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisFilterImpl <em>Vis Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisFilterImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisFilter()
   * @generated
   */
  int VIS_FILTER = 75;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_FILTER__VALS = 0;

  /**
   * The number of structural features of the '<em>Vis Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_FILTER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.QFunctionImpl <em>QFunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.QFunctionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getQFunction()
   * @generated
   */
  int QFUNCTION = 79;

  /**
   * The number of structural features of the '<em>QFunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QFUNCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.NestBasisQualifierImpl <em>Nest Basis Qualifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.NestBasisQualifierImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getNestBasisQualifier()
   * @generated
   */
  int NEST_BASIS_QUALIFIER = 80;

  /**
   * The number of structural features of the '<em>Nest Basis Qualifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEST_BASIS_QUALIFIER_FEATURE_COUNT = QFUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl <em>Vis Basis Qualifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisBasisQualifiersImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisBasisQualifiers()
   * @generated
   */
  int VIS_BASIS_QUALIFIERS = 76;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_QUALIFIERS__FUNCS = NEST_BASIS_QUALIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qfuncs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_QUALIFIERS__QFUNCS = NEST_BASIS_QUALIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Vis Basis Qualifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIS_BASIS_QUALIFIERS_FEATURE_COUNT = NEST_BASIS_QUALIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.FunctionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 78;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__VALS = QFUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TYPE = QFUNCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = QFUNCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualSectionOptionsImpl <em>Visual Section Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualSectionOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualSectionOptions()
   * @generated
   */
  int VISUAL_SECTION_OPTIONS = 81;

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
  int VISUAL_SECTION_OPTION = 82;

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
   * The feature id for the '<em><b>Assigns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION__ASSIGNS = 2;

  /**
   * The number of structural features of the '<em>Visual Section Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_SECTION_OPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VizAssignImpl <em>Viz Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VizAssignImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVizAssign()
   * @generated
   */
  int VIZ_ASSIGN = 83;

  /**
   * The feature id for the '<em><b>Val l</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIZ_ASSIGN__VAL_L = 0;

  /**
   * The feature id for the '<em><b>Val r</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIZ_ASSIGN__VAL_R = 1;

  /**
   * The number of structural features of the '<em>Viz Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIZ_ASSIGN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VizAssignListImpl <em>Viz Assign List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VizAssignListImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVizAssignList()
   * @generated
   */
  int VIZ_ASSIGN_LIST = 84;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIZ_ASSIGN_LIST__ASSIGNS = 0;

  /**
   * The number of structural features of the '<em>Viz Assign List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIZ_ASSIGN_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VizEnumDeclImpl <em>Viz Enum Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VizEnumDeclImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVizEnumDecl()
   * @generated
   */
  int VIZ_ENUM_DECL = 85;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIZ_ENUM_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIZ_ENUM_DECL__ASSIGNS = 1;

  /**
   * The number of structural features of the '<em>Viz Enum Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIZ_ENUM_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualOptionsImpl <em>Visual Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualOptions()
   * @generated
   */
  int VISUAL_OPTIONS = 86;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.LinkOptionImpl <em>Link Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.LinkOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getLinkOption()
   * @generated
   */
  int LINK_OPTION = 90;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPTION__NAME = VISUAL_OPTION__NAME;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPTION__FUNCS = VISUAL_OPTION__FUNCS;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPTION__DECL = VISUAL_OPTION__DECL;

  /**
   * The feature id for the '<em><b>Vis cust</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPTION__VIS_CUST = VISUAL_OPTION__VIS_CUST;

  /**
   * The feature id for the '<em><b>Visibility op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPTION__VISIBILITY_OP = VISUAL_OPTION__VISIBILITY_OP;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPTION__ASSIGNS = VISUAL_OPTION__ASSIGNS;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPTION__OPS = VISUAL_OPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Link Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPTION_FEATURE_COUNT = VISUAL_OPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualMultivalImpl <em>Visual Multival</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualMultivalImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualMultival()
   * @generated
   */
  int VISUAL_MULTIVAL = 91;

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
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL__DECL = VISUAL_OPTION__DECL;

  /**
   * The feature id for the '<em><b>Vis cust</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL__VIS_CUST = VISUAL_OPTION__VIS_CUST;

  /**
   * The feature id for the '<em><b>Visibility op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL__VISIBILITY_OP = VISUAL_OPTION__VISIBILITY_OP;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL__ASSIGNS = VISUAL_OPTION__ASSIGNS;

  /**
   * The number of structural features of the '<em>Visual Multival</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_MULTIVAL_FEATURE_COUNT = VISUAL_OPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisibilityOptionImpl <em>Visibility Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisibilityOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisibilityOption()
   * @generated
   */
  int VISIBILITY_OPTION = 92;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_OPTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Visibility Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_OPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.VisualCustomOptionImpl <em>Visual Custom Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.VisualCustomOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualCustomOption()
   * @generated
   */
  int VISUAL_CUSTOM_OPTION = 93;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_CUSTOM_OPTION__NAME = VISUAL_OPTION__NAME;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_CUSTOM_OPTION__FUNCS = VISUAL_OPTION__FUNCS;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_CUSTOM_OPTION__DECL = VISUAL_OPTION__DECL;

  /**
   * The feature id for the '<em><b>Vis cust</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_CUSTOM_OPTION__VIS_CUST = VISUAL_OPTION__VIS_CUST;

  /**
   * The feature id for the '<em><b>Visibility op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_CUSTOM_OPTION__VISIBILITY_OP = VISUAL_OPTION__VISIBILITY_OP;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_CUSTOM_OPTION__ASSIGNS = VISUAL_OPTION__ASSIGNS;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_CUSTOM_OPTION__VALS = VISUAL_OPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Visual Custom Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_CUSTOM_OPTION_FEATURE_COUNT = VISUAL_OPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CustomSectionImpl <em>Custom Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CustomSectionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCustomSection()
   * @generated
   */
  int CUSTOM_SECTION = 94;

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
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.CustomValueImpl <em>Custom Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.CustomValueImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCustomValue()
   * @generated
   */
  int CUSTOM_VALUE = 95;

  /**
   * The number of structural features of the '<em>Custom Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ResourceTypeImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceType()
   * @generated
   */
  int RESOURCE_TYPE = 96;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Resource Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ResourceOptionImpl <em>Resource Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ResourceOptionImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceOption()
   * @generated
   */
  int RESOURCE_OPTION = 97;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION__VALS = 0;

  /**
   * The number of structural features of the '<em>Resource Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.hipie.hIPIE.impl.ResourceOptionsImpl <em>Resource Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.hipie.hIPIE.impl.ResourceOptionsImpl
   * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceOptions()
   * @generated
   */
  int RESOURCE_OPTIONS = 98;

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
  int RESOURCE_VALUE = 99;

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
  int RESOURCE_SECTION = 100;

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Program#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Permissions</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getPermissions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Permissions();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Program#getIntegrate_section <em>Integrate section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integrate section</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getIntegrate_section()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Integrate_section();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Program#getResource_section <em>Resource section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource section</em>'.
   * @see org.xtext.hipie.hIPIE.Program#getResource_section()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Resource_section();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.CategoryType <em>Category Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category Type</em>'.
   * @see org.xtext.hipie.hIPIE.CategoryType
   * @generated
   */
  EClass getCategoryType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.CategoryType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.CategoryType#getName()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Name();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.CategoryTypeList#getCats <em>Cats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cats</em>'.
   * @see org.xtext.hipie.hIPIE.CategoryTypeList#getCats()
   * @see #getCategoryTypeList()
   * @generated
   */
  EReference getCategoryTypeList_Cats();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Assign#getVals_l <em>Vals l</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vals l</em>'.
   * @see org.xtext.hipie.hIPIE.Assign#getVals_l()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Vals_l();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Assign#getVals_r <em>Vals r</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vals r</em>'.
   * @see org.xtext.hipie.hIPIE.Assign#getVals_r()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Vals_r();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InstanceID <em>Instance ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance ID</em>'.
   * @see org.xtext.hipie.hIPIE.InstanceID
   * @generated
   */
  EClass getInstanceID();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.InstanceID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.InstanceID#getName()
   * @see #getInstanceID()
   * @generated
   */
  EAttribute getInstanceID_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InstanceOptions <em>Instance Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Options</em>'.
   * @see org.xtext.hipie.hIPIE.InstanceOptions
   * @generated
   */
  EClass getInstanceOptions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.InstanceOptions#getIn_ops <em>In ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>In ops</em>'.
   * @see org.xtext.hipie.hIPIE.InstanceOptions#getIn_ops()
   * @see #getInstanceOptions()
   * @generated
   */
  EReference getInstanceOptions_In_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InstanceOption <em>Instance Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Option</em>'.
   * @see org.xtext.hipie.hIPIE.InstanceOption
   * @generated
   */
  EClass getInstanceOption();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.ContractInstance#getInstId <em>Inst Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inst Id</em>'.
   * @see org.xtext.hipie.hIPIE.ContractInstance#getInstId()
   * @see #getContractInstance()
   * @generated
   */
  EReference getContractInstance_InstId();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.ContractInstance#getInstance_ops <em>Instance ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instance ops</em>'.
   * @see org.xtext.hipie.hIPIE.ContractInstance#getInstance_ops()
   * @see #getContractInstance()
   * @generated
   */
  EReference getContractInstance_Instance_ops();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.KelAttrDecl <em>Kel Attr Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kel Attr Decl</em>'.
   * @see org.xtext.hipie.hIPIE.KelAttrDecl
   * @generated
   */
  EClass getKelAttrDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.KelAttrDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.KelAttrDecl#getName()
   * @see #getKelAttrDecl()
   * @generated
   */
  EAttribute getKelAttrDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.KelAttrDecl#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.KelAttrDecl#getInput_ops()
   * @see #getKelAttrDecl()
   * @generated
   */
  EReference getKelAttrDecl_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.KelEntityDeclSimple <em>Kel Entity Decl Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kel Entity Decl Simple</em>'.
   * @see org.xtext.hipie.hIPIE.KelEntityDeclSimple
   * @generated
   */
  EClass getKelEntityDeclSimple();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.KelEntityDeclSimple#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.KelEntityDeclSimple#getName()
   * @see #getKelEntityDeclSimple()
   * @generated
   */
  EAttribute getKelEntityDeclSimple_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.KelEntityDeclSimple#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.KelEntityDeclSimple#getInput_ops()
   * @see #getKelEntityDeclSimple()
   * @generated
   */
  EReference getKelEntityDeclSimple_Input_ops();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.KelEntityDecl <em>Kel Entity Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kel Entity Decl</em>'.
   * @see org.xtext.hipie.hIPIE.KelEntityDecl
   * @generated
   */
  EClass getKelEntityDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.KelEntityDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.KelEntityDecl#getName()
   * @see #getKelEntityDecl()
   * @generated
   */
  EAttribute getKelEntityDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.KelEntityDecl#getInput_ops <em>Input ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input ops</em>'.
   * @see org.xtext.hipie.hIPIE.KelEntityDecl#getInput_ops()
   * @see #getKelEntityDecl()
   * @generated
   */
  EReference getKelEntityDecl_Input_ops();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.KelEntityDecl#getAttrdecl <em>Attrdecl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attrdecl</em>'.
   * @see org.xtext.hipie.hIPIE.KelEntityDecl#getAttrdecl()
   * @see #getKelEntityDecl()
   * @generated
   */
  EReference getKelEntityDecl_Attrdecl();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.EnumEntry <em>Enum Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Entry</em>'.
   * @see org.xtext.hipie.hIPIE.EnumEntry
   * @generated
   */
  EClass getEnumEntry();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.EnumEntry#getVal_l <em>Val l</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val l</em>'.
   * @see org.xtext.hipie.hIPIE.EnumEntry#getVal_l()
   * @see #getEnumEntry()
   * @generated
   */
  EReference getEnumEntry_Val_l();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.EnumEntry#getVal_r <em>Val r</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val r</em>'.
   * @see org.xtext.hipie.hIPIE.EnumEntry#getVal_r()
   * @see #getEnumEntry()
   * @generated
   */
  EReference getEnumEntry_Val_r();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.EnumList <em>Enum List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum List</em>'.
   * @see org.xtext.hipie.hIPIE.EnumList
   * @generated
   */
  EClass getEnumList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.EnumList#getEn_ents <em>En ents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>En ents</em>'.
   * @see org.xtext.hipie.hIPIE.EnumList#getEn_ents()
   * @see #getEnumList()
   * @generated
   */
  EReference getEnumList_En_ents();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.EnumDecl#getEnum_list <em>Enum list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum list</em>'.
   * @see org.xtext.hipie.hIPIE.EnumDecl#getEnum_list()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_Enum_list();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Dataset#getInput_op_list <em>Input op list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input op list</em>'.
   * @see org.xtext.hipie.hIPIE.Dataset#getInput_op_list()
   * @see #getDataset()
   * @generated
   */
  EReference getDataset_Input_op_list();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Group#getInput_op_list <em>Input op list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input op list</em>'.
   * @see org.xtext.hipie.hIPIE.Group#getInput_op_list()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Input_op_list();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Real <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real</em>'.
   * @see org.xtext.hipie.hIPIE.Real
   * @generated
   */
  EClass getReal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Real#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Real#getName()
   * @see #getReal()
   * @generated
   */
  EAttribute getReal_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InputSimpleTypes <em>Input Simple Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Simple Types</em>'.
   * @see org.xtext.hipie.hIPIE.InputSimpleTypes
   * @generated
   */
  EClass getInputSimpleTypes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.InputSimpleTypes#getInput_op_list <em>Input op list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input op list</em>'.
   * @see org.xtext.hipie.hIPIE.InputSimpleTypes#getInput_op_list()
   * @see #getInputSimpleTypes()
   * @generated
   */
  EReference getInputSimpleTypes_Input_op_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.InputSimpleTypes#getIn_ops <em>In ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In ops</em>'.
   * @see org.xtext.hipie.hIPIE.InputSimpleTypes#getIn_ops()
   * @see #getInputSimpleTypes()
   * @generated
   */
  EReference getInputSimpleTypes_In_ops();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Record#getInput_op_list <em>Input op list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input op list</em>'.
   * @see org.xtext.hipie.hIPIE.Record#getInput_op_list()
   * @see #getRecord()
   * @generated
   */
  EReference getRecord_Input_op_list();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.KelBase <em>Kel Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kel Base</em>'.
   * @see org.xtext.hipie.hIPIE.KelBase
   * @generated
   */
  EClass getKelBase();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.KelBase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.KelBase#getName()
   * @see #getKelBase()
   * @generated
   */
  EAttribute getKelBase_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.KelBase#getInput_op_list <em>Input op list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input op list</em>'.
   * @see org.xtext.hipie.hIPIE.KelBase#getInput_op_list()
   * @see #getKelBase()
   * @generated
   */
  EReference getKelBase_Input_op_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.KelBase#getKel_ops <em>Kel ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kel ops</em>'.
   * @see org.xtext.hipie.hIPIE.KelBase#getKel_ops()
   * @see #getKelBase()
   * @generated
   */
  EReference getKelBase_Kel_ops();

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
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.InputOption#getAtr <em>Atr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atr</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getAtr()
   * @see #getInputOption()
   * @generated
   */
  EAttribute getInputOption_Atr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.InputOption#getForm <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Form</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getForm()
   * @see #getInputOption()
   * @generated
   */
  EAttribute getInputOption_Form();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.InputOption#getForm_op <em>Form op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Form op</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getForm_op()
   * @see #getInputOption()
   * @generated
   */
  EAttribute getInputOption_Form_op();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.InputOption#getEnab <em>Enab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enab</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getEnab()
   * @see #getInputOption()
   * @generated
   */
  EAttribute getInputOption_Enab();

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
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.InputOption#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getType()
   * @see #getInputOption()
   * @generated
   */
  EAttribute getInputOption_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.InputOption#getType_op <em>Type op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type op</em>'.
   * @see org.xtext.hipie.hIPIE.InputOption#getType_op()
   * @see #getInputOption()
   * @generated
   */
  EReference getInputOption_Type_op();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.InputtypeOptions <em>Inputtype Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inputtype Options</em>'.
   * @see org.xtext.hipie.hIPIE.InputtypeOptions
   * @generated
   */
  EClass getInputtypeOptions();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.hipie.hIPIE.InputtypeOptions#getIn_type_op <em>In type op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>In type op</em>'.
   * @see org.xtext.hipie.hIPIE.InputtypeOptions#getIn_type_op()
   * @see #getInputtypeOptions()
   * @generated
   */
  EAttribute getInputtypeOptions_In_type_op();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.IntegrateSection <em>Integrate Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integrate Section</em>'.
   * @see org.xtext.hipie.hIPIE.IntegrateSection
   * @generated
   */
  EClass getIntegrateSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.IntegrateSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.IntegrateSection#getName()
   * @see #getIntegrateSection()
   * @generated
   */
  EAttribute getIntegrateSection_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.IntegrateSection#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see org.xtext.hipie.hIPIE.IntegrateSection#getOutputs()
   * @see #getIntegrateSection()
   * @generated
   */
  EReference getIntegrateSection_Outputs();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLBoolean <em>ECL Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Boolean</em>'.
   * @see org.xtext.hipie.hIPIE.ECLBoolean
   * @generated
   */
  EClass getECLBoolean();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLNumType <em>ECL Num Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Num Type</em>'.
   * @see org.xtext.hipie.hIPIE.ECLNumType
   * @generated
   */
  EClass getECLNumType();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ECLDecType <em>ECL Dec Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECL Dec Type</em>'.
   * @see org.xtext.hipie.hIPIE.ECLDecType
   * @generated
   */
  EClass getECLDecType();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.ECLfieldType#getIn_ops <em>In ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In ops</em>'.
   * @see org.xtext.hipie.hIPIE.ECLfieldType#getIn_ops()
   * @see #getECLfieldType()
   * @generated
   */
  EReference getECLfieldType_In_ops();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ServiceInputValue <em>Service Input Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Input Value</em>'.
   * @see org.xtext.hipie.hIPIE.ServiceInputValue
   * @generated
   */
  EClass getServiceInputValue();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ServiceInputSection <em>Service Input Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Input Section</em>'.
   * @see org.xtext.hipie.hIPIE.ServiceInputSection
   * @generated
   */
  EClass getServiceInputSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.ServiceInputSection#getServs <em>Servs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servs</em>'.
   * @see org.xtext.hipie.hIPIE.ServiceInputSection#getServs()
   * @see #getServiceInputSection()
   * @generated
   */
  EReference getServiceInputSection_Servs();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.NestedDatasetDecl <em>Nested Dataset Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Dataset Decl</em>'.
   * @see org.xtext.hipie.hIPIE.NestedDatasetDecl
   * @generated
   */
  EClass getNestedDatasetDecl();

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
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.OutputOption#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOption#getType()
   * @see #getOutputOption()
   * @generated
   */
  EAttribute getOutputOption_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.OutputOption#getAtr <em>Atr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atr</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOption#getAtr()
   * @see #getOutputOption()
   * @generated
   */
  EAttribute getOutputOption_Atr();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.OutputOption#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.OutputOption#getAssigns()
   * @see #getOutputOption()
   * @generated
   */
  EReference getOutputOption_Assigns();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.OutTypeSimple <em>Out Type Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Type Simple</em>'.
   * @see org.xtext.hipie.hIPIE.OutTypeSimple
   * @generated
   */
  EClass getOutTypeSimple();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.OutTypeSimple#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.hipie.hIPIE.OutTypeSimple#getType()
   * @see #getOutTypeSimple()
   * @generated
   */
  EAttribute getOutTypeSimple_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.OutTypeSimple#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.OutTypeSimple#getVals()
   * @see #getOutTypeSimple()
   * @generated
   */
  EReference getOutTypeSimple_Vals();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.OutDataset#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Options</em>'.
   * @see org.xtext.hipie.hIPIE.OutDataset#getOptions()
   * @see #getOutDataset()
   * @generated
   */
  EReference getOutDataset_Options();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.OutDataset#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl</em>'.
   * @see org.xtext.hipie.hIPIE.OutDataset#getDecl()
   * @see #getOutDataset()
   * @generated
   */
  EReference getOutDataset_Decl();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.OutDataset#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ops</em>'.
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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see org.xtext.hipie.hIPIE.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Service#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ops</em>'.
   * @see org.xtext.hipie.hIPIE.Service#getOps()
   * @see #getService()
   * @generated
   */
  EReference getService_Ops();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Service#getServ <em>Serv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Serv</em>'.
   * @see org.xtext.hipie.hIPIE.Service#getServ()
   * @see #getService()
   * @generated
   */
  EReference getService_Serv();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Service#getEcl_vars <em>Ecl vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ecl vars</em>'.
   * @see org.xtext.hipie.hIPIE.Service#getEcl_vars()
   * @see #getService()
   * @generated
   */
  EReference getService_Ecl_vars();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Permissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Permissions</em>'.
   * @see org.xtext.hipie.hIPIE.Permissions
   * @generated
   */
  EClass getPermissions();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Permissions#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Permissions#getName()
   * @see #getPermissions()
   * @generated
   */
  EAttribute getPermissions_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Permissions#getPerms <em>Perms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Perms</em>'.
   * @see org.xtext.hipie.hIPIE.Permissions#getPerms()
   * @see #getPermissions()
   * @generated
   */
  EReference getPermissions_Perms();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Permission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Permission</em>'.
   * @see org.xtext.hipie.hIPIE.Permission
   * @generated
   */
  EClass getPermission();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Permission#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.Permission#getName()
   * @see #getPermission()
   * @generated
   */
  EAttribute getPermission_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Permission#getCust_levs <em>Cust levs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cust levs</em>'.
   * @see org.xtext.hipie.hIPIE.Permission#getCust_levs()
   * @see #getPermission()
   * @generated
   */
  EReference getPermission_Cust_levs();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.CustomPermissionLevel <em>Custom Permission Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Permission Level</em>'.
   * @see org.xtext.hipie.hIPIE.CustomPermissionLevel
   * @generated
   */
  EClass getCustomPermissionLevel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.CustomPermissionLevel#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.CustomPermissionLevel#getVals()
   * @see #getCustomPermissionLevel()
   * @generated
   */
  EReference getCustomPermissionLevel_Vals();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.GenerateBodyKel <em>Generate Body Kel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generate Body Kel</em>'.
   * @see org.xtext.hipie.hIPIE.GenerateBodyKel
   * @generated
   */
  EClass getGenerateBodyKel();

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
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VisualSection#getSection_name <em>Section name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Section name</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSection#getSection_name()
   * @see #getVisualSection()
   * @generated
   */
  EAttribute getVisualSection_Section_name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VisualSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSection#getName()
   * @see #getVisualSection()
   * @generated
   */
  EAttribute getVisualSection_Name();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisName <em>Vis Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vis Name</em>'.
   * @see org.xtext.hipie.hIPIE.VisName
   * @generated
   */
  EClass getVisName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VisName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.VisName#getName()
   * @see #getVisName()
   * @generated
   */
  EAttribute getVisName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisInputValue <em>Vis Input Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vis Input Value</em>'.
   * @see org.xtext.hipie.hIPIE.VisInputValue
   * @generated
   */
  EClass getVisInputValue();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisBasisParens <em>Vis Basis Parens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vis Basis Parens</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasisParens
   * @generated
   */
  EClass getVisBasisParens();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisBasisParens#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasisParens#getInput()
   * @see #getVisBasisParens()
   * @generated
   */
  EReference getVisBasisParens_Input();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Visualization#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.hipie.hIPIE.Visualization#getType()
   * @see #getVisualization()
   * @generated
   */
  EReference getVisualization_Type();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.Visualization#getParens <em>Parens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parens</em>'.
   * @see org.xtext.hipie.hIPIE.Visualization#getParens()
   * @see #getVisualization()
   * @generated
   */
  EReference getVisualization_Parens();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.Visualization#getInput_val <em>Input val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input val</em>'.
   * @see org.xtext.hipie.hIPIE.Visualization#getInput_val()
   * @see #getVisualization()
   * @generated
   */
  EReference getVisualization_Input_val();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisBasis#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasis#getFilter()
   * @see #getVisBasis()
   * @generated
   */
  EReference getVisBasis_Filter();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisFilter <em>Vis Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vis Filter</em>'.
   * @see org.xtext.hipie.hIPIE.VisFilter
   * @generated
   */
  EClass getVisFilter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VisFilter#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see org.xtext.hipie.hIPIE.VisFilter#getVals()
   * @see #getVisFilter()
   * @generated
   */
  EReference getVisFilter_Vals();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisBasisQualifiers#getFuncs <em>Funcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Funcs</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasisQualifiers#getFuncs()
   * @see #getVisBasisQualifiers()
   * @generated
   */
  EReference getVisBasisQualifiers_Funcs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VisBasisQualifiers#getQfuncs <em>Qfuncs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qfuncs</em>'.
   * @see org.xtext.hipie.hIPIE.VisBasisQualifiers#getQfuncs()
   * @see #getVisBasisQualifiers()
   * @generated
   */
  EReference getVisBasisQualifiers_Qfuncs();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.hipie.hIPIE.Function
   * @generated
   */
  EClass getFunction();

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
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.Function#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.hipie.hIPIE.Function#getType()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.QFunction <em>QFunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QFunction</em>'.
   * @see org.xtext.hipie.hIPIE.QFunction
   * @generated
   */
  EClass getQFunction();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.NestBasisQualifier <em>Nest Basis Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nest Basis Qualifier</em>'.
   * @see org.xtext.hipie.hIPIE.NestBasisQualifier
   * @generated
   */
  EClass getNestBasisQualifier();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisualSectionOption#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.VisualSectionOption#getAssigns()
   * @see #getVisualSectionOption()
   * @generated
   */
  EReference getVisualSectionOption_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VizAssign <em>Viz Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viz Assign</em>'.
   * @see org.xtext.hipie.hIPIE.VizAssign
   * @generated
   */
  EClass getVizAssign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VizAssign#getVal_l <em>Val l</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val l</em>'.
   * @see org.xtext.hipie.hIPIE.VizAssign#getVal_l()
   * @see #getVizAssign()
   * @generated
   */
  EReference getVizAssign_Val_l();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VizAssign#getVal_r <em>Val r</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val r</em>'.
   * @see org.xtext.hipie.hIPIE.VizAssign#getVal_r()
   * @see #getVizAssign()
   * @generated
   */
  EReference getVizAssign_Val_r();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VizAssignList <em>Viz Assign List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viz Assign List</em>'.
   * @see org.xtext.hipie.hIPIE.VizAssignList
   * @generated
   */
  EClass getVizAssignList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VizAssignList#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.VizAssignList#getAssigns()
   * @see #getVizAssignList()
   * @generated
   */
  EReference getVizAssignList_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VizEnumDecl <em>Viz Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viz Enum Decl</em>'.
   * @see org.xtext.hipie.hIPIE.VizEnumDecl
   * @generated
   */
  EClass getVizEnumDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VizEnumDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.VizEnumDecl#getName()
   * @see #getVizEnumDecl()
   * @generated
   */
  EAttribute getVizEnumDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VizEnumDecl#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.VizEnumDecl#getAssigns()
   * @see #getVizEnumDecl()
   * @generated
   */
  EReference getVizEnumDecl_Assigns();

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
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisualOption#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOption#getDecl()
   * @see #getVisualOption()
   * @generated
   */
  EReference getVisualOption_Decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisualOption#getVis_cust <em>Vis cust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vis cust</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOption#getVis_cust()
   * @see #getVisualOption()
   * @generated
   */
  EReference getVisualOption_Vis_cust();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.hipie.hIPIE.VisualOption#getVisibility_op <em>Visibility op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility op</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOption#getVisibility_op()
   * @see #getVisualOption()
   * @generated
   */
  EReference getVisualOption_Visibility_op();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.VisualOption#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see org.xtext.hipie.hIPIE.VisualOption#getAssigns()
   * @see #getVisualOption()
   * @generated
   */
  EReference getVisualOption_Assigns();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.SelectEvent <em>Select Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Event</em>'.
   * @see org.xtext.hipie.hIPIE.SelectEvent
   * @generated
   */
  EClass getSelectEvent();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.SelectOption <em>Select Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Option</em>'.
   * @see org.xtext.hipie.hIPIE.SelectOption
   * @generated
   */
  EClass getSelectOption();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.hipie.hIPIE.SelectOption#getMaps <em>Maps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Maps</em>'.
   * @see org.xtext.hipie.hIPIE.SelectOption#getMaps()
   * @see #getSelectOption()
   * @generated
   */
  EAttribute getSelectOption_Maps();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.LinkOption <em>Link Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Option</em>'.
   * @see org.xtext.hipie.hIPIE.LinkOption
   * @generated
   */
  EClass getLinkOption();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.hipie.hIPIE.LinkOption#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ops</em>'.
   * @see org.xtext.hipie.hIPIE.LinkOption#getOps()
   * @see #getLinkOption()
   * @generated
   */
  EReference getLinkOption_Ops();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisibilityOption <em>Visibility Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visibility Option</em>'.
   * @see org.xtext.hipie.hIPIE.VisibilityOption
   * @generated
   */
  EClass getVisibilityOption();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.VisibilityOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.VisibilityOption#getName()
   * @see #getVisibilityOption()
   * @generated
   */
  EAttribute getVisibilityOption_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.VisualCustomOption <em>Visual Custom Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visual Custom Option</em>'.
   * @see org.xtext.hipie.hIPIE.VisualCustomOption
   * @generated
   */
  EClass getVisualCustomOption();

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
   * Returns the meta object for class '{@link org.xtext.hipie.hIPIE.ResourceType <em>Resource Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Type</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceType
   * @generated
   */
  EClass getResourceType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.hipie.hIPIE.ResourceType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.hipie.hIPIE.ResourceType#getName()
   * @see #getResourceType()
   * @generated
   */
  EAttribute getResourceType_Name();

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
     * The meta object literal for the '<em><b>Permissions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PERMISSIONS = eINSTANCE.getProgram_Permissions();

    /**
     * The meta object literal for the '<em><b>Input section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INPUT_SECTION = eINSTANCE.getProgram_Input_section();

    /**
     * The meta object literal for the '<em><b>Contract instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CONTRACT_INSTANCES = eINSTANCE.getProgram_Contract_instances();

    /**
     * The meta object literal for the '<em><b>Output section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__OUTPUT_SECTION = eINSTANCE.getProgram_Output_section();

    /**
     * The meta object literal for the '<em><b>Integrate section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INTEGRATE_SECTION = eINSTANCE.getProgram_Integrate_section();

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
     * The meta object literal for the '<em><b>Resource section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__RESOURCE_SECTION = eINSTANCE.getProgram_Resource_section();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.CategoryTypeImpl <em>Category Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.CategoryTypeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCategoryType()
     * @generated
     */
    EClass CATEGORY_TYPE = eINSTANCE.getCategoryType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY_TYPE__NAME = eINSTANCE.getCategoryType_Name();

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
     * The meta object literal for the '<em><b>Cats</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY_TYPE_LIST__CATS = eINSTANCE.getCategoryTypeList_Cats();

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
     * The meta object literal for the '<em><b>Vals l</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__VALS_L = eINSTANCE.getAssign_Vals_l();

    /**
     * The meta object literal for the '<em><b>Vals r</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__VALS_R = eINSTANCE.getAssign_Vals_r();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InstanceIDImpl <em>Instance ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InstanceIDImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInstanceID()
     * @generated
     */
    EClass INSTANCE_ID = eINSTANCE.getInstanceID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE_ID__NAME = eINSTANCE.getInstanceID_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InstanceOptionsImpl <em>Instance Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InstanceOptionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInstanceOptions()
     * @generated
     */
    EClass INSTANCE_OPTIONS = eINSTANCE.getInstanceOptions();

    /**
     * The meta object literal for the '<em><b>In ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OPTIONS__IN_OPS = eINSTANCE.getInstanceOptions_In_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InstanceOptionImpl <em>Instance Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InstanceOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInstanceOption()
     * @generated
     */
    EClass INSTANCE_OPTION = eINSTANCE.getInstanceOption();

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
     * The meta object literal for the '<em><b>Inst Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_INSTANCE__INST_ID = eINSTANCE.getContractInstance_InstId();

    /**
     * The meta object literal for the '<em><b>Instance ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_INSTANCE__INSTANCE_OPS = eINSTANCE.getContractInstance_Instance_ops();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.KelAttrDeclImpl <em>Kel Attr Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.KelAttrDeclImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getKelAttrDecl()
     * @generated
     */
    EClass KEL_ATTR_DECL = eINSTANCE.getKelAttrDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEL_ATTR_DECL__NAME = eINSTANCE.getKelAttrDecl_Name();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEL_ATTR_DECL__INPUT_OPS = eINSTANCE.getKelAttrDecl_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.KelEntityDeclSimpleImpl <em>Kel Entity Decl Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.KelEntityDeclSimpleImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getKelEntityDeclSimple()
     * @generated
     */
    EClass KEL_ENTITY_DECL_SIMPLE = eINSTANCE.getKelEntityDeclSimple();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEL_ENTITY_DECL_SIMPLE__NAME = eINSTANCE.getKelEntityDeclSimple_Name();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEL_ENTITY_DECL_SIMPLE__INPUT_OPS = eINSTANCE.getKelEntityDeclSimple_Input_ops();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.KelEntityDeclImpl <em>Kel Entity Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.KelEntityDeclImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getKelEntityDecl()
     * @generated
     */
    EClass KEL_ENTITY_DECL = eINSTANCE.getKelEntityDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEL_ENTITY_DECL__NAME = eINSTANCE.getKelEntityDecl_Name();

    /**
     * The meta object literal for the '<em><b>Input ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEL_ENTITY_DECL__INPUT_OPS = eINSTANCE.getKelEntityDecl_Input_ops();

    /**
     * The meta object literal for the '<em><b>Attrdecl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEL_ENTITY_DECL__ATTRDECL = eINSTANCE.getKelEntityDecl_Attrdecl();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.EnumEntryImpl <em>Enum Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.EnumEntryImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getEnumEntry()
     * @generated
     */
    EClass ENUM_ENTRY = eINSTANCE.getEnumEntry();

    /**
     * The meta object literal for the '<em><b>Val l</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ENTRY__VAL_L = eINSTANCE.getEnumEntry_Val_l();

    /**
     * The meta object literal for the '<em><b>Val r</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ENTRY__VAL_R = eINSTANCE.getEnumEntry_Val_r();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.EnumListImpl <em>Enum List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.EnumListImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getEnumList()
     * @generated
     */
    EClass ENUM_LIST = eINSTANCE.getEnumList();

    /**
     * The meta object literal for the '<em><b>En ents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LIST__EN_ENTS = eINSTANCE.getEnumList_En_ents();

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
     * The meta object literal for the '<em><b>Enum list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__ENUM_LIST = eINSTANCE.getEnumDecl_Enum_list();

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
     * The meta object literal for the '<em><b>Input op list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASET__INPUT_OP_LIST = eINSTANCE.getDataset_Input_op_list();

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
     * The meta object literal for the '<em><b>Input op list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__INPUT_OP_LIST = eINSTANCE.getGroup_Input_op_list();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__VALS = eINSTANCE.getGroup_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.RealImpl <em>Real</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.RealImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getReal()
     * @generated
     */
    EClass REAL = eINSTANCE.getReal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL__NAME = eINSTANCE.getReal_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InputSimpleTypesImpl <em>Input Simple Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InputSimpleTypesImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputSimpleTypes()
     * @generated
     */
    EClass INPUT_SIMPLE_TYPES = eINSTANCE.getInputSimpleTypes();

    /**
     * The meta object literal for the '<em><b>Input op list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_SIMPLE_TYPES__INPUT_OP_LIST = eINSTANCE.getInputSimpleTypes_Input_op_list();

    /**
     * The meta object literal for the '<em><b>In ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_SIMPLE_TYPES__IN_OPS = eINSTANCE.getInputSimpleTypes_In_ops();

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
     * The meta object literal for the '<em><b>Input op list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD__INPUT_OP_LIST = eINSTANCE.getRecord_Input_op_list();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.KelBaseImpl <em>Kel Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.KelBaseImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getKelBase()
     * @generated
     */
    EClass KEL_BASE = eINSTANCE.getKelBase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEL_BASE__NAME = eINSTANCE.getKelBase_Name();

    /**
     * The meta object literal for the '<em><b>Input op list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEL_BASE__INPUT_OP_LIST = eINSTANCE.getKelBase_Input_op_list();

    /**
     * The meta object literal for the '<em><b>Kel ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEL_BASE__KEL_OPS = eINSTANCE.getKelBase_Kel_ops();

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
     * The meta object literal for the '<em><b>Atr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPTION__ATR = eINSTANCE.getInputOption_Atr();

    /**
     * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPTION__FORM = eINSTANCE.getInputOption_Form();

    /**
     * The meta object literal for the '<em><b>Form op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPTION__FORM_OP = eINSTANCE.getInputOption_Form_op();

    /**
     * The meta object literal for the '<em><b>Enab</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPTION__ENAB = eINSTANCE.getInputOption_Enab();

    /**
     * The meta object literal for the '<em><b>Assigns list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTION__ASSIGNS_LIST = eINSTANCE.getInputOption_Assigns_list();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPTION__TYPE = eINSTANCE.getInputOption_Type();

    /**
     * The meta object literal for the '<em><b>Type op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTION__TYPE_OP = eINSTANCE.getInputOption_Type_op();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPTION__VALS = eINSTANCE.getInputOption_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.InputtypeOptionsImpl <em>Inputtype Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.InputtypeOptionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getInputtypeOptions()
     * @generated
     */
    EClass INPUTTYPE_OPTIONS = eINSTANCE.getInputtypeOptions();

    /**
     * The meta object literal for the '<em><b>In type op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUTTYPE_OPTIONS__IN_TYPE_OP = eINSTANCE.getInputtypeOptions_In_type_op();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.IntegrateSectionImpl <em>Integrate Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.IntegrateSectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getIntegrateSection()
     * @generated
     */
    EClass INTEGRATE_SECTION = eINSTANCE.getIntegrateSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGRATE_SECTION__NAME = eINSTANCE.getIntegrateSection_Name();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATE_SECTION__OUTPUTS = eINSTANCE.getIntegrateSection_Outputs();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLBooleanImpl <em>ECL Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLBooleanImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLBoolean()
     * @generated
     */
    EClass ECL_BOOLEAN = eINSTANCE.getECLBoolean();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLNumTypeImpl <em>ECL Num Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLNumTypeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLNumType()
     * @generated
     */
    EClass ECL_NUM_TYPE = eINSTANCE.getECLNumType();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ECLDecTypeImpl <em>ECL Dec Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ECLDecTypeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getECLDecType()
     * @generated
     */
    EClass ECL_DEC_TYPE = eINSTANCE.getECLDecType();

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
     * The meta object literal for the '<em><b>In ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EC_LFIELD_TYPE__IN_OPS = eINSTANCE.getECLfieldType_In_ops();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ServiceInputValueImpl <em>Service Input Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ServiceInputValueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getServiceInputValue()
     * @generated
     */
    EClass SERVICE_INPUT_VALUE = eINSTANCE.getServiceInputValue();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ServiceInputSectionImpl <em>Service Input Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ServiceInputSectionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getServiceInputSection()
     * @generated
     */
    EClass SERVICE_INPUT_SECTION = eINSTANCE.getServiceInputSection();

    /**
     * The meta object literal for the '<em><b>Servs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_INPUT_SECTION__SERVS = eINSTANCE.getServiceInputSection_Servs();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.NestedDatasetDeclImpl <em>Nested Dataset Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.NestedDatasetDeclImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getNestedDatasetDecl()
     * @generated
     */
    EClass NESTED_DATASET_DECL = eINSTANCE.getNestedDatasetDecl();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPTION__TYPE = eINSTANCE.getOutputOption_Type();

    /**
     * The meta object literal for the '<em><b>Atr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPTION__ATR = eINSTANCE.getOutputOption_Atr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPTION__NAME = eINSTANCE.getOutputOption_Name();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPTION__ASSIGNS = eINSTANCE.getOutputOption_Assigns();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.OutTypeSimpleImpl <em>Out Type Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.OutTypeSimpleImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getOutTypeSimple()
     * @generated
     */
    EClass OUT_TYPE_SIMPLE = eINSTANCE.getOutTypeSimple();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUT_TYPE_SIMPLE__TYPE = eINSTANCE.getOutTypeSimple_Type();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_TYPE_SIMPLE__VALS = eINSTANCE.getOutTypeSimple_Vals();

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
     * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_DATASET__OPTIONS = eINSTANCE.getOutDataset_Options();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_DATASET__DECL = eINSTANCE.getOutDataset_Decl();

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
     * The meta object literal for the '<em><b>Ops</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ServiceImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Ops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__OPS = eINSTANCE.getService_Ops();

    /**
     * The meta object literal for the '<em><b>Serv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__SERV = eINSTANCE.getService_Serv();

    /**
     * The meta object literal for the '<em><b>Ecl vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__ECL_VARS = eINSTANCE.getService_Ecl_vars();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.PermissionsImpl <em>Permissions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.PermissionsImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getPermissions()
     * @generated
     */
    EClass PERMISSIONS = eINSTANCE.getPermissions();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERMISSIONS__NAME = eINSTANCE.getPermissions_Name();

    /**
     * The meta object literal for the '<em><b>Perms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERMISSIONS__PERMS = eINSTANCE.getPermissions_Perms();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.PermissionImpl <em>Permission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.PermissionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getPermission()
     * @generated
     */
    EClass PERMISSION = eINSTANCE.getPermission();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERMISSION__NAME = eINSTANCE.getPermission_Name();

    /**
     * The meta object literal for the '<em><b>Cust levs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERMISSION__CUST_LEVS = eINSTANCE.getPermission_Cust_levs();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.CustomPermissionLevelImpl <em>Custom Permission Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.CustomPermissionLevelImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getCustomPermissionLevel()
     * @generated
     */
    EClass CUSTOM_PERMISSION_LEVEL = eINSTANCE.getCustomPermissionLevel();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_PERMISSION_LEVEL__VALS = eINSTANCE.getCustomPermissionLevel_Vals();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.GenerateBodyKelImpl <em>Generate Body Kel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.GenerateBodyKelImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getGenerateBodyKel()
     * @generated
     */
    EClass GENERATE_BODY_KEL = eINSTANCE.getGenerateBodyKel();

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
     * The meta object literal for the '<em><b>Section name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_SECTION__SECTION_NAME = eINSTANCE.getVisualSection_Section_name();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_SECTION__NAME = eINSTANCE.getVisualSection_Name();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisNameImpl <em>Vis Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisNameImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisName()
     * @generated
     */
    EClass VIS_NAME = eINSTANCE.getVisName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIS_NAME__NAME = eINSTANCE.getVisName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisInputValueImpl <em>Vis Input Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisInputValueImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisInputValue()
     * @generated
     */
    EClass VIS_INPUT_VALUE = eINSTANCE.getVisInputValue();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisBasisParensImpl <em>Vis Basis Parens</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisBasisParensImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisBasisParens()
     * @generated
     */
    EClass VIS_BASIS_PARENS = eINSTANCE.getVisBasisParens();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS_PARENS__INPUT = eINSTANCE.getVisBasisParens_Input();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__TYPE = eINSTANCE.getVisualization_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUALIZATION__NAME = eINSTANCE.getVisualization_Name();

    /**
     * The meta object literal for the '<em><b>Parens</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__PARENS = eINSTANCE.getVisualization_Parens();

    /**
     * The meta object literal for the '<em><b>Vis op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__VIS_OP = eINSTANCE.getVisualization_Vis_op();

    /**
     * The meta object literal for the '<em><b>Input val</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__INPUT_VAL = eINSTANCE.getVisualization_Input_val();

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
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS__FILTER = eINSTANCE.getVisBasis_Filter();

    /**
     * The meta object literal for the '<em><b>Quals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS__QUALS = eINSTANCE.getVisBasis_Quals();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisFilterImpl <em>Vis Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisFilterImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisFilter()
     * @generated
     */
    EClass VIS_FILTER = eINSTANCE.getVisFilter();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_FILTER__VALS = eINSTANCE.getVisFilter_Vals();

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
     * The meta object literal for the '<em><b>Funcs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS_QUALIFIERS__FUNCS = eINSTANCE.getVisBasisQualifiers_Funcs();

    /**
     * The meta object literal for the '<em><b>Qfuncs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIS_BASIS_QUALIFIERS__QFUNCS = eINSTANCE.getVisBasisQualifiers_Qfuncs();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.FunctionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__VALS = eINSTANCE.getFunction_Vals();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__TYPE = eINSTANCE.getFunction_Type();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.QFunctionImpl <em>QFunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.QFunctionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getQFunction()
     * @generated
     */
    EClass QFUNCTION = eINSTANCE.getQFunction();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.NestBasisQualifierImpl <em>Nest Basis Qualifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.NestBasisQualifierImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getNestBasisQualifier()
     * @generated
     */
    EClass NEST_BASIS_QUALIFIER = eINSTANCE.getNestBasisQualifier();

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
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_SECTION_OPTION__ASSIGNS = eINSTANCE.getVisualSectionOption_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VizAssignImpl <em>Viz Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VizAssignImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVizAssign()
     * @generated
     */
    EClass VIZ_ASSIGN = eINSTANCE.getVizAssign();

    /**
     * The meta object literal for the '<em><b>Val l</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIZ_ASSIGN__VAL_L = eINSTANCE.getVizAssign_Val_l();

    /**
     * The meta object literal for the '<em><b>Val r</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIZ_ASSIGN__VAL_R = eINSTANCE.getVizAssign_Val_r();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VizAssignListImpl <em>Viz Assign List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VizAssignListImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVizAssignList()
     * @generated
     */
    EClass VIZ_ASSIGN_LIST = eINSTANCE.getVizAssignList();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIZ_ASSIGN_LIST__ASSIGNS = eINSTANCE.getVizAssignList_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VizEnumDeclImpl <em>Viz Enum Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VizEnumDeclImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVizEnumDecl()
     * @generated
     */
    EClass VIZ_ENUM_DECL = eINSTANCE.getVizEnumDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIZ_ENUM_DECL__NAME = eINSTANCE.getVizEnumDecl_Name();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIZ_ENUM_DECL__ASSIGNS = eINSTANCE.getVizEnumDecl_Assigns();

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
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTION__DECL = eINSTANCE.getVisualOption_Decl();

    /**
     * The meta object literal for the '<em><b>Vis cust</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTION__VIS_CUST = eINSTANCE.getVisualOption_Vis_cust();

    /**
     * The meta object literal for the '<em><b>Visibility op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTION__VISIBILITY_OP = eINSTANCE.getVisualOption_Visibility_op();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUAL_OPTION__ASSIGNS = eINSTANCE.getVisualOption_Assigns();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.SelectEventImpl <em>Select Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.SelectEventImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getSelectEvent()
     * @generated
     */
    EClass SELECT_EVENT = eINSTANCE.getSelectEvent();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.SelectOptionImpl <em>Select Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.SelectOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getSelectOption()
     * @generated
     */
    EClass SELECT_OPTION = eINSTANCE.getSelectOption();

    /**
     * The meta object literal for the '<em><b>Maps</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_OPTION__MAPS = eINSTANCE.getSelectOption_Maps();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.LinkOptionImpl <em>Link Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.LinkOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getLinkOption()
     * @generated
     */
    EClass LINK_OPTION = eINSTANCE.getLinkOption();

    /**
     * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_OPTION__OPS = eINSTANCE.getLinkOption_Ops();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisibilityOptionImpl <em>Visibility Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisibilityOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisibilityOption()
     * @generated
     */
    EClass VISIBILITY_OPTION = eINSTANCE.getVisibilityOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISIBILITY_OPTION__NAME = eINSTANCE.getVisibilityOption_Name();

    /**
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.VisualCustomOptionImpl <em>Visual Custom Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.VisualCustomOptionImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getVisualCustomOption()
     * @generated
     */
    EClass VISUAL_CUSTOM_OPTION = eINSTANCE.getVisualCustomOption();

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
     * The meta object literal for the '{@link org.xtext.hipie.hIPIE.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.hipie.hIPIE.impl.ResourceTypeImpl
     * @see org.xtext.hipie.hIPIE.impl.HIPIEPackageImpl#getResourceType()
     * @generated
     */
    EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getResourceType_Name();

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
