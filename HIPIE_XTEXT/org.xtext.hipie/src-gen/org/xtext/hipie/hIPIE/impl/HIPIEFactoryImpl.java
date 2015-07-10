/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.hipie.hIPIE.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HIPIEFactoryImpl extends EFactoryImpl implements HIPIEFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HIPIEFactory init()
  {
    try
    {
      HIPIEFactory theHIPIEFactory = (HIPIEFactory)EPackage.Registry.INSTANCE.getEFactory(HIPIEPackage.eNS_URI);
      if (theHIPIEFactory != null)
      {
        return theHIPIEFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HIPIEFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HIPIEFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HIPIEPackage.PROGRAM: return createProgram();
      case HIPIEPackage.BASE_PROP: return createBaseProp();
      case HIPIEPackage.CATEGORY_TYPE: return createCategoryType();
      case HIPIEPackage.CATEGORY_TYPE_LIST: return createCategoryTypeList();
      case HIPIEPackage.VALUE: return createValue();
      case HIPIEPackage.VALUE_LIST: return createValueList();
      case HIPIEPackage.ASSIGN: return createAssign();
      case HIPIEPackage.ASSIGN_LIST: return createAssignList();
      case HIPIEPackage.COMPOSITION_HEADER: return createCompositionHeader();
      case HIPIEPackage.INSTANCE_ID: return createInstanceID();
      case HIPIEPackage.INSTANCE_OPTIONS: return createInstanceOptions();
      case HIPIEPackage.INSTANCE_OPTION: return createInstanceOption();
      case HIPIEPackage.CONTRACT_INSTANCE: return createContractInstance();
      case HIPIEPackage.FIELD_DECL: return createFieldDecl();
      case HIPIEPackage.KEL_ATTR_DECL: return createKelAttrDecl();
      case HIPIEPackage.KEL_ENTITY_DECL_SIMPLE: return createKelEntityDeclSimple();
      case HIPIEPackage.KEL_ENTITY_DECL: return createKelEntityDecl();
      case HIPIEPackage.ENUM_ENTRY: return createEnumEntry();
      case HIPIEPackage.ENUM_LIST: return createEnumList();
      case HIPIEPackage.ENUM_DECL: return createEnumDecl();
      case HIPIEPackage.INPUT_SECTION: return createInputSection();
      case HIPIEPackage.BOOL: return createBool();
      case HIPIEPackage.INT_VAR: return createIntVar();
      case HIPIEPackage.STRING_VAR: return createStringVar();
      case HIPIEPackage.DATASET: return createDataset();
      case HIPIEPackage.GROUP: return createGroup();
      case HIPIEPackage.REAL: return createReal();
      case HIPIEPackage.INPUT_SIMPLE_TYPES: return createInputSimpleTypes();
      case HIPIEPackage.RECORD: return createRecord();
      case HIPIEPackage.KEL_BASE: return createKelBase();
      case HIPIEPackage.DATATYPE: return createDatatype();
      case HIPIEPackage.INPUT_VALUE: return createInputValue();
      case HIPIEPackage.INPUT_OPTIONS: return createInputOptions();
      case HIPIEPackage.INPUT_OPTION: return createInputOption();
      case HIPIEPackage.INPUTTYPE_OPTIONS: return createInputtypeOptions();
      case HIPIEPackage.INTEGRATE_SECTION: return createIntegrateSection();
      case HIPIEPackage.OUTPUT_SECTION: return createOutputSection();
      case HIPIEPackage.OUTFIELD_DECL: return createOutfieldDecl();
      case HIPIEPackage.ECL_INTEGER: return createECLInteger();
      case HIPIEPackage.ECL_UNSIGNED: return createECLUnsigned();
      case HIPIEPackage.ECL_STRING: return createECLString();
      case HIPIEPackage.ECL_QSTRING: return createECLQstring();
      case HIPIEPackage.ECL_VARSTRING: return createECLVarstring();
      case HIPIEPackage.ECL_UNICODE: return createECLUnicode();
      case HIPIEPackage.ECL_VARUNICODE: return createECLVarunicode();
      case HIPIEPackage.ECL_DATA: return createECLData();
      case HIPIEPackage.ECL_REAL: return createECLReal();
      case HIPIEPackage.ECL_BOOLEAN: return createECLBoolean();
      case HIPIEPackage.ECL_NUM_TYPE: return createECLNumType();
      case HIPIEPackage.ECL_DEC_TYPE: return createECLDecType();
      case HIPIEPackage.EC_LFIELD_TYPE: return createECLfieldType();
      case HIPIEPackage.ECL_OUTPUT_DECL: return createECLOutputDecl();
      case HIPIEPackage.SERVICE_INPUT_VALUE: return createServiceInputValue();
      case HIPIEPackage.SERVICE_INPUT_SECTION: return createServiceInputSection();
      case HIPIEPackage.NESTED_DATASET_DECL: return createNestedDatasetDecl();
      case HIPIEPackage.OUTPUT_OPTION: return createOutputOption();
      case HIPIEPackage.OUTPUT_OPTIONS: return createOutputOptions();
      case HIPIEPackage.OUT_TYPE_SIMPLE: return createOutTypeSimple();
      case HIPIEPackage.OUT_DATASET: return createOutDataset();
      case HIPIEPackage.SERVICE: return createService();
      case HIPIEPackage.OUTPUT_VALUE: return createOutputValue();
      case HIPIEPackage.OUTPUT_BASE: return createOutputBase();
      case HIPIEPackage.PERMISSIONS: return createPermissions();
      case HIPIEPackage.PERMISSION: return createPermission();
      case HIPIEPackage.CUSTOM_PERMISSION_LEVEL: return createCustomPermissionLevel();
      case HIPIEPackage.GENERATE_SECTION: return createGenerateSection();
      case HIPIEPackage.GENERATE_BODY_INLINE: return createGenerateBodyInline();
      case HIPIEPackage.GENERATE_BODY_SALT: return createGenerateBodySalt();
      case HIPIEPackage.GENERATE_BODY_KEL: return createGenerateBodyKel();
      case HIPIEPackage.VISUAL_SECTION: return createVisualSection();
      case HIPIEPackage.VIS_NAME: return createVisName();
      case HIPIEPackage.VIS_INPUT_VALUE: return createVisInputValue();
      case HIPIEPackage.VIS_BASIS_PARENS: return createVisBasisParens();
      case HIPIEPackage.VISUALIZATION: return createVisualization();
      case HIPIEPackage.VIS_BASIS: return createVisBasis();
      case HIPIEPackage.VIS_FILTER: return createVisFilter();
      case HIPIEPackage.VIS_BASIS_QUALIFIERS: return createVisBasisQualifiers();
      case HIPIEPackage.POS_VIZ_DATA: return createPosVizData();
      case HIPIEPackage.FUNCTION: return createFunction();
      case HIPIEPackage.QFUNCTION: return createQFunction();
      case HIPIEPackage.NEST_BASIS_QUALIFIER: return createNestBasisQualifier();
      case HIPIEPackage.VISUAL_SECTION_OPTIONS: return createVisualSectionOptions();
      case HIPIEPackage.VISUAL_SECTION_OPTION: return createVisualSectionOption();
      case HIPIEPackage.VIZ_ASSIGN: return createVizAssign();
      case HIPIEPackage.VIZ_ASSIGN_LIST: return createVizAssignList();
      case HIPIEPackage.VIZ_ENUM_DECL: return createVizEnumDecl();
      case HIPIEPackage.VISUAL_OPTIONS: return createVisualOptions();
      case HIPIEPackage.VISUAL_OPTION: return createVisualOption();
      case HIPIEPackage.SELECT_EVENT: return createSelectEvent();
      case HIPIEPackage.SELECT_OPTION: return createSelectOption();
      case HIPIEPackage.LINK_OPTION: return createLinkOption();
      case HIPIEPackage.VISUAL_MULTIVAL: return createVisualMultival();
      case HIPIEPackage.VISIBILITY_OPTION: return createVisibilityOption();
      case HIPIEPackage.VISUAL_CUSTOM_OPTION: return createVisualCustomOption();
      case HIPIEPackage.CUSTOM_SECTION: return createCustomSection();
      case HIPIEPackage.CUSTOM_VALUE: return createCustomValue();
      case HIPIEPackage.RESOURCE_TYPE: return createResourceType();
      case HIPIEPackage.RESOURCE_OPTION: return createResourceOption();
      case HIPIEPackage.RESOURCE_OPTIONS: return createResourceOptions();
      case HIPIEPackage.RESOURCE_VALUE: return createResourceValue();
      case HIPIEPackage.RESOURCE_SECTION: return createResourceSection();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseProp createBaseProp()
  {
    BasePropImpl baseProp = new BasePropImpl();
    return baseProp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryType createCategoryType()
  {
    CategoryTypeImpl categoryType = new CategoryTypeImpl();
    return categoryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryTypeList createCategoryTypeList()
  {
    CategoryTypeListImpl categoryTypeList = new CategoryTypeListImpl();
    return categoryTypeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueList createValueList()
  {
    ValueListImpl valueList = new ValueListImpl();
    return valueList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignList createAssignList()
  {
    AssignListImpl assignList = new AssignListImpl();
    return assignList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionHeader createCompositionHeader()
  {
    CompositionHeaderImpl compositionHeader = new CompositionHeaderImpl();
    return compositionHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceID createInstanceID()
  {
    InstanceIDImpl instanceID = new InstanceIDImpl();
    return instanceID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOptions createInstanceOptions()
  {
    InstanceOptionsImpl instanceOptions = new InstanceOptionsImpl();
    return instanceOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOption createInstanceOption()
  {
    InstanceOptionImpl instanceOption = new InstanceOptionImpl();
    return instanceOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContractInstance createContractInstance()
  {
    ContractInstanceImpl contractInstance = new ContractInstanceImpl();
    return contractInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDecl createFieldDecl()
  {
    FieldDeclImpl fieldDecl = new FieldDeclImpl();
    return fieldDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KelAttrDecl createKelAttrDecl()
  {
    KelAttrDeclImpl kelAttrDecl = new KelAttrDeclImpl();
    return kelAttrDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KelEntityDeclSimple createKelEntityDeclSimple()
  {
    KelEntityDeclSimpleImpl kelEntityDeclSimple = new KelEntityDeclSimpleImpl();
    return kelEntityDeclSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KelEntityDecl createKelEntityDecl()
  {
    KelEntityDeclImpl kelEntityDecl = new KelEntityDeclImpl();
    return kelEntityDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumEntry createEnumEntry()
  {
    EnumEntryImpl enumEntry = new EnumEntryImpl();
    return enumEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumList createEnumList()
  {
    EnumListImpl enumList = new EnumListImpl();
    return enumList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDecl createEnumDecl()
  {
    EnumDeclImpl enumDecl = new EnumDeclImpl();
    return enumDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputSection createInputSection()
  {
    InputSectionImpl inputSection = new InputSectionImpl();
    return inputSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool createBool()
  {
    BoolImpl bool = new BoolImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntVar createIntVar()
  {
    IntVarImpl intVar = new IntVarImpl();
    return intVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringVar createStringVar()
  {
    StringVarImpl stringVar = new StringVarImpl();
    return stringVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dataset createDataset()
  {
    DatasetImpl dataset = new DatasetImpl();
    return dataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Real createReal()
  {
    RealImpl real = new RealImpl();
    return real;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputSimpleTypes createInputSimpleTypes()
  {
    InputSimpleTypesImpl inputSimpleTypes = new InputSimpleTypesImpl();
    return inputSimpleTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Record createRecord()
  {
    RecordImpl record = new RecordImpl();
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KelBase createKelBase()
  {
    KelBaseImpl kelBase = new KelBaseImpl();
    return kelBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype createDatatype()
  {
    DatatypeImpl datatype = new DatatypeImpl();
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputValue createInputValue()
  {
    InputValueImpl inputValue = new InputValueImpl();
    return inputValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputOptions createInputOptions()
  {
    InputOptionsImpl inputOptions = new InputOptionsImpl();
    return inputOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputOption createInputOption()
  {
    InputOptionImpl inputOption = new InputOptionImpl();
    return inputOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputtypeOptions createInputtypeOptions()
  {
    InputtypeOptionsImpl inputtypeOptions = new InputtypeOptionsImpl();
    return inputtypeOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegrateSection createIntegrateSection()
  {
    IntegrateSectionImpl integrateSection = new IntegrateSectionImpl();
    return integrateSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputSection createOutputSection()
  {
    OutputSectionImpl outputSection = new OutputSectionImpl();
    return outputSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutfieldDecl createOutfieldDecl()
  {
    OutfieldDeclImpl outfieldDecl = new OutfieldDeclImpl();
    return outfieldDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLInteger createECLInteger()
  {
    ECLIntegerImpl eclInteger = new ECLIntegerImpl();
    return eclInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLUnsigned createECLUnsigned()
  {
    ECLUnsignedImpl eclUnsigned = new ECLUnsignedImpl();
    return eclUnsigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLString createECLString()
  {
    ECLStringImpl eclString = new ECLStringImpl();
    return eclString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLQstring createECLQstring()
  {
    ECLQstringImpl eclQstring = new ECLQstringImpl();
    return eclQstring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLVarstring createECLVarstring()
  {
    ECLVarstringImpl eclVarstring = new ECLVarstringImpl();
    return eclVarstring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLUnicode createECLUnicode()
  {
    ECLUnicodeImpl eclUnicode = new ECLUnicodeImpl();
    return eclUnicode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLVarunicode createECLVarunicode()
  {
    ECLVarunicodeImpl eclVarunicode = new ECLVarunicodeImpl();
    return eclVarunicode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLData createECLData()
  {
    ECLDataImpl eclData = new ECLDataImpl();
    return eclData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLReal createECLReal()
  {
    ECLRealImpl eclReal = new ECLRealImpl();
    return eclReal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLBoolean createECLBoolean()
  {
    ECLBooleanImpl eclBoolean = new ECLBooleanImpl();
    return eclBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLNumType createECLNumType()
  {
    ECLNumTypeImpl eclNumType = new ECLNumTypeImpl();
    return eclNumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLDecType createECLDecType()
  {
    ECLDecTypeImpl eclDecType = new ECLDecTypeImpl();
    return eclDecType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLfieldType createECLfieldType()
  {
    ECLfieldTypeImpl ecLfieldType = new ECLfieldTypeImpl();
    return ecLfieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECLOutputDecl createECLOutputDecl()
  {
    ECLOutputDeclImpl eclOutputDecl = new ECLOutputDeclImpl();
    return eclOutputDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceInputValue createServiceInputValue()
  {
    ServiceInputValueImpl serviceInputValue = new ServiceInputValueImpl();
    return serviceInputValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceInputSection createServiceInputSection()
  {
    ServiceInputSectionImpl serviceInputSection = new ServiceInputSectionImpl();
    return serviceInputSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedDatasetDecl createNestedDatasetDecl()
  {
    NestedDatasetDeclImpl nestedDatasetDecl = new NestedDatasetDeclImpl();
    return nestedDatasetDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputOption createOutputOption()
  {
    OutputOptionImpl outputOption = new OutputOptionImpl();
    return outputOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputOptions createOutputOptions()
  {
    OutputOptionsImpl outputOptions = new OutputOptionsImpl();
    return outputOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutTypeSimple createOutTypeSimple()
  {
    OutTypeSimpleImpl outTypeSimple = new OutTypeSimpleImpl();
    return outTypeSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutDataset createOutDataset()
  {
    OutDatasetImpl outDataset = new OutDatasetImpl();
    return outDataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputValue createOutputValue()
  {
    OutputValueImpl outputValue = new OutputValueImpl();
    return outputValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputBase createOutputBase()
  {
    OutputBaseImpl outputBase = new OutputBaseImpl();
    return outputBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Permissions createPermissions()
  {
    PermissionsImpl permissions = new PermissionsImpl();
    return permissions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Permission createPermission()
  {
    PermissionImpl permission = new PermissionImpl();
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomPermissionLevel createCustomPermissionLevel()
  {
    CustomPermissionLevelImpl customPermissionLevel = new CustomPermissionLevelImpl();
    return customPermissionLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenerateSection createGenerateSection()
  {
    GenerateSectionImpl generateSection = new GenerateSectionImpl();
    return generateSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenerateBodyInline createGenerateBodyInline()
  {
    GenerateBodyInlineImpl generateBodyInline = new GenerateBodyInlineImpl();
    return generateBodyInline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenerateBodySalt createGenerateBodySalt()
  {
    GenerateBodySaltImpl generateBodySalt = new GenerateBodySaltImpl();
    return generateBodySalt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenerateBodyKel createGenerateBodyKel()
  {
    GenerateBodyKelImpl generateBodyKel = new GenerateBodyKelImpl();
    return generateBodyKel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualSection createVisualSection()
  {
    VisualSectionImpl visualSection = new VisualSectionImpl();
    return visualSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisName createVisName()
  {
    VisNameImpl visName = new VisNameImpl();
    return visName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisInputValue createVisInputValue()
  {
    VisInputValueImpl visInputValue = new VisInputValueImpl();
    return visInputValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisBasisParens createVisBasisParens()
  {
    VisBasisParensImpl visBasisParens = new VisBasisParensImpl();
    return visBasisParens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visualization createVisualization()
  {
    VisualizationImpl visualization = new VisualizationImpl();
    return visualization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisBasis createVisBasis()
  {
    VisBasisImpl visBasis = new VisBasisImpl();
    return visBasis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisFilter createVisFilter()
  {
    VisFilterImpl visFilter = new VisFilterImpl();
    return visFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisBasisQualifiers createVisBasisQualifiers()
  {
    VisBasisQualifiersImpl visBasisQualifiers = new VisBasisQualifiersImpl();
    return visBasisQualifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PosVizData createPosVizData()
  {
    PosVizDataImpl posVizData = new PosVizDataImpl();
    return posVizData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QFunction createQFunction()
  {
    QFunctionImpl qFunction = new QFunctionImpl();
    return qFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestBasisQualifier createNestBasisQualifier()
  {
    NestBasisQualifierImpl nestBasisQualifier = new NestBasisQualifierImpl();
    return nestBasisQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualSectionOptions createVisualSectionOptions()
  {
    VisualSectionOptionsImpl visualSectionOptions = new VisualSectionOptionsImpl();
    return visualSectionOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualSectionOption createVisualSectionOption()
  {
    VisualSectionOptionImpl visualSectionOption = new VisualSectionOptionImpl();
    return visualSectionOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VizAssign createVizAssign()
  {
    VizAssignImpl vizAssign = new VizAssignImpl();
    return vizAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VizAssignList createVizAssignList()
  {
    VizAssignListImpl vizAssignList = new VizAssignListImpl();
    return vizAssignList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VizEnumDecl createVizEnumDecl()
  {
    VizEnumDeclImpl vizEnumDecl = new VizEnumDeclImpl();
    return vizEnumDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualOptions createVisualOptions()
  {
    VisualOptionsImpl visualOptions = new VisualOptionsImpl();
    return visualOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualOption createVisualOption()
  {
    VisualOptionImpl visualOption = new VisualOptionImpl();
    return visualOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectEvent createSelectEvent()
  {
    SelectEventImpl selectEvent = new SelectEventImpl();
    return selectEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectOption createSelectOption()
  {
    SelectOptionImpl selectOption = new SelectOptionImpl();
    return selectOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkOption createLinkOption()
  {
    LinkOptionImpl linkOption = new LinkOptionImpl();
    return linkOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualMultival createVisualMultival()
  {
    VisualMultivalImpl visualMultival = new VisualMultivalImpl();
    return visualMultival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityOption createVisibilityOption()
  {
    VisibilityOptionImpl visibilityOption = new VisibilityOptionImpl();
    return visibilityOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualCustomOption createVisualCustomOption()
  {
    VisualCustomOptionImpl visualCustomOption = new VisualCustomOptionImpl();
    return visualCustomOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomSection createCustomSection()
  {
    CustomSectionImpl customSection = new CustomSectionImpl();
    return customSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomValue createCustomValue()
  {
    CustomValueImpl customValue = new CustomValueImpl();
    return customValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceType createResourceType()
  {
    ResourceTypeImpl resourceType = new ResourceTypeImpl();
    return resourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOption createResourceOption()
  {
    ResourceOptionImpl resourceOption = new ResourceOptionImpl();
    return resourceOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOptions createResourceOptions()
  {
    ResourceOptionsImpl resourceOptions = new ResourceOptionsImpl();
    return resourceOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceValue createResourceValue()
  {
    ResourceValueImpl resourceValue = new ResourceValueImpl();
    return resourceValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceSection createResourceSection()
  {
    ResourceSectionImpl resourceSection = new ResourceSectionImpl();
    return resourceSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HIPIEPackage getHIPIEPackage()
  {
    return (HIPIEPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HIPIEPackage getPackage()
  {
    return HIPIEPackage.eINSTANCE;
  }

} //HIPIEFactoryImpl
