/**
 */
package org.xtext.hipie.hIPIE.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.hipie.hIPIE.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.hipie.hIPIE.HIPIEPackage
 * @generated
 */
public class HIPIESwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HIPIEPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HIPIESwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = HIPIEPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case HIPIEPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.BASE_PROP:
      {
        BaseProp baseProp = (BaseProp)theEObject;
        T result = caseBaseProp(baseProp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CATEGORY_TYPE:
      {
        CategoryType categoryType = (CategoryType)theEObject;
        T result = caseCategoryType(categoryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CATEGORY_TYPE_LIST:
      {
        CategoryTypeList categoryTypeList = (CategoryTypeList)theEObject;
        T result = caseCategoryTypeList(categoryTypeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseSelectEvent(value);
        if (result == null) result = caseCustomValue(value);
        if (result == null) result = caseResourceValue(value);
        if (result == null) result = caseSelectOption(value);
        if (result == null) result = caseVisualOption(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VALUE_LIST:
      {
        ValueList valueList = (ValueList)theEObject;
        T result = caseValueList(valueList);
        if (result == null) result = caseInstanceOption(valueList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ASSIGN:
      {
        Assign assign = (Assign)theEObject;
        T result = caseAssign(assign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ASSIGN_LIST:
      {
        AssignList assignList = (AssignList)theEObject;
        T result = caseAssignList(assignList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.COMPOSITION_HEADER:
      {
        CompositionHeader compositionHeader = (CompositionHeader)theEObject;
        T result = caseCompositionHeader(compositionHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INSTANCE_ID:
      {
        InstanceID instanceID = (InstanceID)theEObject;
        T result = caseInstanceID(instanceID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INSTANCE_OPTIONS:
      {
        InstanceOptions instanceOptions = (InstanceOptions)theEObject;
        T result = caseInstanceOptions(instanceOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INSTANCE_OPTION:
      {
        InstanceOption instanceOption = (InstanceOption)theEObject;
        T result = caseInstanceOption(instanceOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CONTRACT_INSTANCE:
      {
        ContractInstance contractInstance = (ContractInstance)theEObject;
        T result = caseContractInstance(contractInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.FIELD_DECL:
      {
        FieldDecl fieldDecl = (FieldDecl)theEObject;
        T result = caseFieldDecl(fieldDecl);
        if (result == null) result = casePosVizData(fieldDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.KEL_ATTR_DECL:
      {
        KelAttrDecl kelAttrDecl = (KelAttrDecl)theEObject;
        T result = caseKelAttrDecl(kelAttrDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.KEL_ENTITY_DECL_SIMPLE:
      {
        KelEntityDeclSimple kelEntityDeclSimple = (KelEntityDeclSimple)theEObject;
        T result = caseKelEntityDeclSimple(kelEntityDeclSimple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.KEL_ENTITY_DECL:
      {
        KelEntityDecl kelEntityDecl = (KelEntityDecl)theEObject;
        T result = caseKelEntityDecl(kelEntityDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ENUM_ENTRY:
      {
        EnumEntry enumEntry = (EnumEntry)theEObject;
        T result = caseEnumEntry(enumEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ENUM_LIST:
      {
        EnumList enumList = (EnumList)theEObject;
        T result = caseEnumList(enumList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ENUM_DECL:
      {
        EnumDecl enumDecl = (EnumDecl)theEObject;
        T result = caseEnumDecl(enumDecl);
        if (result == null) result = caseInputSimpleTypes(enumDecl);
        if (result == null) result = caseDatatype(enumDecl);
        if (result == null) result = caseInputValue(enumDecl);
        if (result == null) result = caseVisInputValue(enumDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_SECTION:
      {
        InputSection inputSection = (InputSection)theEObject;
        T result = caseInputSection(inputSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.BOOL:
      {
        Bool bool = (Bool)theEObject;
        T result = caseBool(bool);
        if (result == null) result = caseInputSimpleTypes(bool);
        if (result == null) result = caseOutfieldDecl(bool);
        if (result == null) result = caseDatatype(bool);
        if (result == null) result = caseInputValue(bool);
        if (result == null) result = caseVisInputValue(bool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INT_VAR:
      {
        IntVar intVar = (IntVar)theEObject;
        T result = caseIntVar(intVar);
        if (result == null) result = caseInputSimpleTypes(intVar);
        if (result == null) result = caseOutfieldDecl(intVar);
        if (result == null) result = caseDatatype(intVar);
        if (result == null) result = caseInputValue(intVar);
        if (result == null) result = caseVisInputValue(intVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.STRING_VAR:
      {
        StringVar stringVar = (StringVar)theEObject;
        T result = caseStringVar(stringVar);
        if (result == null) result = caseInputSimpleTypes(stringVar);
        if (result == null) result = caseOutfieldDecl(stringVar);
        if (result == null) result = caseDatatype(stringVar);
        if (result == null) result = caseInputValue(stringVar);
        if (result == null) result = caseVisInputValue(stringVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.DATASET:
      {
        Dataset dataset = (Dataset)theEObject;
        T result = caseDataset(dataset);
        if (result == null) result = caseDatatype(dataset);
        if (result == null) result = caseInputValue(dataset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = caseDatatype(group);
        if (result == null) result = caseInputValue(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.REAL:
      {
        Real real = (Real)theEObject;
        T result = caseReal(real);
        if (result == null) result = caseInputSimpleTypes(real);
        if (result == null) result = caseDatatype(real);
        if (result == null) result = caseInputValue(real);
        if (result == null) result = caseVisInputValue(real);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_SIMPLE_TYPES:
      {
        InputSimpleTypes inputSimpleTypes = (InputSimpleTypes)theEObject;
        T result = caseInputSimpleTypes(inputSimpleTypes);
        if (result == null) result = caseDatatype(inputSimpleTypes);
        if (result == null) result = caseInputValue(inputSimpleTypes);
        if (result == null) result = caseVisInputValue(inputSimpleTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RECORD:
      {
        Record record = (Record)theEObject;
        T result = caseRecord(record);
        if (result == null) result = caseDatatype(record);
        if (result == null) result = caseInputValue(record);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.KEL_BASE:
      {
        KelBase kelBase = (KelBase)theEObject;
        T result = caseKelBase(kelBase);
        if (result == null) result = caseDatatype(kelBase);
        if (result == null) result = caseInputValue(kelBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_VALUE:
      {
        InputValue inputValue = (InputValue)theEObject;
        T result = caseInputValue(inputValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_OPTIONS:
      {
        InputOptions inputOptions = (InputOptions)theEObject;
        T result = caseInputOptions(inputOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_OPTION:
      {
        InputOption inputOption = (InputOption)theEObject;
        T result = caseInputOption(inputOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUTTYPE_OPTIONS:
      {
        InputtypeOptions inputtypeOptions = (InputtypeOptions)theEObject;
        T result = caseInputtypeOptions(inputtypeOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INTEGRATE_SECTION:
      {
        IntegrateSection integrateSection = (IntegrateSection)theEObject;
        T result = caseIntegrateSection(integrateSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_SECTION:
      {
        OutputSection outputSection = (OutputSection)theEObject;
        T result = caseOutputSection(outputSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTFIELD_DECL:
      {
        OutfieldDecl outfieldDecl = (OutfieldDecl)theEObject;
        T result = caseOutfieldDecl(outfieldDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_INTEGER:
      {
        ECLInteger eclInteger = (ECLInteger)theEObject;
        T result = caseECLInteger(eclInteger);
        if (result == null) result = caseECLfieldType(eclInteger);
        if (result == null) result = caseECLOutputDecl(eclInteger);
        if (result == null) result = caseServiceInputValue(eclInteger);
        if (result == null) result = casePosVizData(eclInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_UNSIGNED:
      {
        ECLUnsigned eclUnsigned = (ECLUnsigned)theEObject;
        T result = caseECLUnsigned(eclUnsigned);
        if (result == null) result = caseECLfieldType(eclUnsigned);
        if (result == null) result = caseECLOutputDecl(eclUnsigned);
        if (result == null) result = caseServiceInputValue(eclUnsigned);
        if (result == null) result = casePosVizData(eclUnsigned);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_STRING:
      {
        ECLString eclString = (ECLString)theEObject;
        T result = caseECLString(eclString);
        if (result == null) result = caseECLfieldType(eclString);
        if (result == null) result = caseECLOutputDecl(eclString);
        if (result == null) result = caseServiceInputValue(eclString);
        if (result == null) result = casePosVizData(eclString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_QSTRING:
      {
        ECLQstring eclQstring = (ECLQstring)theEObject;
        T result = caseECLQstring(eclQstring);
        if (result == null) result = caseECLfieldType(eclQstring);
        if (result == null) result = caseECLOutputDecl(eclQstring);
        if (result == null) result = caseServiceInputValue(eclQstring);
        if (result == null) result = casePosVizData(eclQstring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_VARSTRING:
      {
        ECLVarstring eclVarstring = (ECLVarstring)theEObject;
        T result = caseECLVarstring(eclVarstring);
        if (result == null) result = caseECLfieldType(eclVarstring);
        if (result == null) result = caseECLOutputDecl(eclVarstring);
        if (result == null) result = caseServiceInputValue(eclVarstring);
        if (result == null) result = casePosVizData(eclVarstring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_UNICODE:
      {
        ECLUnicode eclUnicode = (ECLUnicode)theEObject;
        T result = caseECLUnicode(eclUnicode);
        if (result == null) result = caseECLfieldType(eclUnicode);
        if (result == null) result = caseECLOutputDecl(eclUnicode);
        if (result == null) result = caseServiceInputValue(eclUnicode);
        if (result == null) result = casePosVizData(eclUnicode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_VARUNICODE:
      {
        ECLVarunicode eclVarunicode = (ECLVarunicode)theEObject;
        T result = caseECLVarunicode(eclVarunicode);
        if (result == null) result = caseECLfieldType(eclVarunicode);
        if (result == null) result = caseECLOutputDecl(eclVarunicode);
        if (result == null) result = caseServiceInputValue(eclVarunicode);
        if (result == null) result = casePosVizData(eclVarunicode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_DATA:
      {
        ECLData eclData = (ECLData)theEObject;
        T result = caseECLData(eclData);
        if (result == null) result = caseECLfieldType(eclData);
        if (result == null) result = caseECLOutputDecl(eclData);
        if (result == null) result = caseServiceInputValue(eclData);
        if (result == null) result = casePosVizData(eclData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_REAL:
      {
        ECLReal eclReal = (ECLReal)theEObject;
        T result = caseECLReal(eclReal);
        if (result == null) result = caseECLfieldType(eclReal);
        if (result == null) result = caseECLOutputDecl(eclReal);
        if (result == null) result = caseServiceInputValue(eclReal);
        if (result == null) result = casePosVizData(eclReal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_BOOLEAN:
      {
        ECLBoolean eclBoolean = (ECLBoolean)theEObject;
        T result = caseECLBoolean(eclBoolean);
        if (result == null) result = caseECLfieldType(eclBoolean);
        if (result == null) result = caseECLOutputDecl(eclBoolean);
        if (result == null) result = caseServiceInputValue(eclBoolean);
        if (result == null) result = casePosVizData(eclBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_NUM_TYPE:
      {
        ECLNumType eclNumType = (ECLNumType)theEObject;
        T result = caseECLNumType(eclNumType);
        if (result == null) result = caseECLfieldType(eclNumType);
        if (result == null) result = caseECLOutputDecl(eclNumType);
        if (result == null) result = caseServiceInputValue(eclNumType);
        if (result == null) result = casePosVizData(eclNumType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_DEC_TYPE:
      {
        ECLDecType eclDecType = (ECLDecType)theEObject;
        T result = caseECLDecType(eclDecType);
        if (result == null) result = caseECLfieldType(eclDecType);
        if (result == null) result = caseECLOutputDecl(eclDecType);
        if (result == null) result = caseServiceInputValue(eclDecType);
        if (result == null) result = casePosVizData(eclDecType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.EC_LFIELD_TYPE:
      {
        ECLfieldType ecLfieldType = (ECLfieldType)theEObject;
        T result = caseECLfieldType(ecLfieldType);
        if (result == null) result = caseECLOutputDecl(ecLfieldType);
        if (result == null) result = caseServiceInputValue(ecLfieldType);
        if (result == null) result = casePosVizData(ecLfieldType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_OUTPUT_DECL:
      {
        ECLOutputDecl eclOutputDecl = (ECLOutputDecl)theEObject;
        T result = caseECLOutputDecl(eclOutputDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.SERVICE_INPUT_VALUE:
      {
        ServiceInputValue serviceInputValue = (ServiceInputValue)theEObject;
        T result = caseServiceInputValue(serviceInputValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.SERVICE_INPUT_SECTION:
      {
        ServiceInputSection serviceInputSection = (ServiceInputSection)theEObject;
        T result = caseServiceInputSection(serviceInputSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.NESTED_DATASET_DECL:
      {
        NestedDatasetDecl nestedDatasetDecl = (NestedDatasetDecl)theEObject;
        T result = caseNestedDatasetDecl(nestedDatasetDecl);
        if (result == null) result = caseECLOutputDecl(nestedDatasetDecl);
        if (result == null) result = caseServiceInputValue(nestedDatasetDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_OPTION:
      {
        OutputOption outputOption = (OutputOption)theEObject;
        T result = caseOutputOption(outputOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_OPTIONS:
      {
        OutputOptions outputOptions = (OutputOptions)theEObject;
        T result = caseOutputOptions(outputOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUT_TYPE_SIMPLE:
      {
        OutTypeSimple outTypeSimple = (OutTypeSimple)theEObject;
        T result = caseOutTypeSimple(outTypeSimple);
        if (result == null) result = caseOutputValue(outTypeSimple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUT_DATASET:
      {
        OutDataset outDataset = (OutDataset)theEObject;
        T result = caseOutDataset(outDataset);
        if (result == null) result = caseNestedDatasetDecl(outDataset);
        if (result == null) result = caseOutputValue(outDataset);
        if (result == null) result = caseECLOutputDecl(outDataset);
        if (result == null) result = caseServiceInputValue(outDataset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = caseOutputValue(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_VALUE:
      {
        OutputValue outputValue = (OutputValue)theEObject;
        T result = caseOutputValue(outputValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_BASE:
      {
        OutputBase outputBase = (OutputBase)theEObject;
        T result = caseOutputBase(outputBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.PERMISSIONS:
      {
        Permissions permissions = (Permissions)theEObject;
        T result = casePermissions(permissions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.PERMISSION:
      {
        Permission permission = (Permission)theEObject;
        T result = casePermission(permission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CUSTOM_PERMISSION_LEVEL:
      {
        CustomPermissionLevel customPermissionLevel = (CustomPermissionLevel)theEObject;
        T result = caseCustomPermissionLevel(customPermissionLevel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GENERATE_SECTION:
      {
        GenerateSection generateSection = (GenerateSection)theEObject;
        T result = caseGenerateSection(generateSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GENERATE_BODY_INLINE:
      {
        GenerateBodyInline generateBodyInline = (GenerateBodyInline)theEObject;
        T result = caseGenerateBodyInline(generateBodyInline);
        if (result == null) result = caseGenerateSection(generateBodyInline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GENERATE_BODY_SALT:
      {
        GenerateBodySalt generateBodySalt = (GenerateBodySalt)theEObject;
        T result = caseGenerateBodySalt(generateBodySalt);
        if (result == null) result = caseGenerateSection(generateBodySalt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GENERATE_BODY_KEL:
      {
        GenerateBodyKel generateBodyKel = (GenerateBodyKel)theEObject;
        T result = caseGenerateBodyKel(generateBodyKel);
        if (result == null) result = caseGenerateSection(generateBodyKel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_SECTION:
      {
        VisualSection visualSection = (VisualSection)theEObject;
        T result = caseVisualSection(visualSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIS_NAME:
      {
        VisName visName = (VisName)theEObject;
        T result = caseVisName(visName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIS_INPUT_VALUE:
      {
        VisInputValue visInputValue = (VisInputValue)theEObject;
        T result = caseVisInputValue(visInputValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIS_BASIS_PARENS:
      {
        VisBasisParens visBasisParens = (VisBasisParens)theEObject;
        T result = caseVisBasisParens(visBasisParens);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUALIZATION:
      {
        Visualization visualization = (Visualization)theEObject;
        T result = caseVisualization(visualization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIS_BASIS:
      {
        VisBasis visBasis = (VisBasis)theEObject;
        T result = caseVisBasis(visBasis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIS_FILTER:
      {
        VisFilter visFilter = (VisFilter)theEObject;
        T result = caseVisFilter(visFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIS_BASIS_QUALIFIERS:
      {
        VisBasisQualifiers visBasisQualifiers = (VisBasisQualifiers)theEObject;
        T result = caseVisBasisQualifiers(visBasisQualifiers);
        if (result == null) result = caseNestBasisQualifier(visBasisQualifiers);
        if (result == null) result = caseQFunction(visBasisQualifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.POS_VIZ_DATA:
      {
        PosVizData posVizData = (PosVizData)theEObject;
        T result = casePosVizData(posVizData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseQFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.QFUNCTION:
      {
        QFunction qFunction = (QFunction)theEObject;
        T result = caseQFunction(qFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.NEST_BASIS_QUALIFIER:
      {
        NestBasisQualifier nestBasisQualifier = (NestBasisQualifier)theEObject;
        T result = caseNestBasisQualifier(nestBasisQualifier);
        if (result == null) result = caseQFunction(nestBasisQualifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_SECTION_OPTIONS:
      {
        VisualSectionOptions visualSectionOptions = (VisualSectionOptions)theEObject;
        T result = caseVisualSectionOptions(visualSectionOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_SECTION_OPTION:
      {
        VisualSectionOption visualSectionOption = (VisualSectionOption)theEObject;
        T result = caseVisualSectionOption(visualSectionOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIZ_ASSIGN:
      {
        VizAssign vizAssign = (VizAssign)theEObject;
        T result = caseVizAssign(vizAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIZ_ASSIGN_LIST:
      {
        VizAssignList vizAssignList = (VizAssignList)theEObject;
        T result = caseVizAssignList(vizAssignList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIZ_ENUM_DECL:
      {
        VizEnumDecl vizEnumDecl = (VizEnumDecl)theEObject;
        T result = caseVizEnumDecl(vizEnumDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_OPTIONS:
      {
        VisualOptions visualOptions = (VisualOptions)theEObject;
        T result = caseVisualOptions(visualOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_OPTION:
      {
        VisualOption visualOption = (VisualOption)theEObject;
        T result = caseVisualOption(visualOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.SELECT_EVENT:
      {
        SelectEvent selectEvent = (SelectEvent)theEObject;
        T result = caseSelectEvent(selectEvent);
        if (result == null) result = caseSelectOption(selectEvent);
        if (result == null) result = caseVisualOption(selectEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.SELECT_OPTION:
      {
        SelectOption selectOption = (SelectOption)theEObject;
        T result = caseSelectOption(selectOption);
        if (result == null) result = caseVisualOption(selectOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.LINK_OPTION:
      {
        LinkOption linkOption = (LinkOption)theEObject;
        T result = caseLinkOption(linkOption);
        if (result == null) result = caseVisualOption(linkOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_MULTIVAL:
      {
        VisualMultival visualMultival = (VisualMultival)theEObject;
        T result = caseVisualMultival(visualMultival);
        if (result == null) result = caseVisualOption(visualMultival);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISIBILITY_OPTION:
      {
        VisibilityOption visibilityOption = (VisibilityOption)theEObject;
        T result = caseVisibilityOption(visibilityOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_CUSTOM_OPTION:
      {
        VisualCustomOption visualCustomOption = (VisualCustomOption)theEObject;
        T result = caseVisualCustomOption(visualCustomOption);
        if (result == null) result = caseVisualOption(visualCustomOption);
        if (result == null) result = caseResourceOption(visualCustomOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CUSTOM_SECTION:
      {
        CustomSection customSection = (CustomSection)theEObject;
        T result = caseCustomSection(customSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CUSTOM_VALUE:
      {
        CustomValue customValue = (CustomValue)theEObject;
        T result = caseCustomValue(customValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_TYPE:
      {
        ResourceType resourceType = (ResourceType)theEObject;
        T result = caseResourceType(resourceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_OPTION:
      {
        ResourceOption resourceOption = (ResourceOption)theEObject;
        T result = caseResourceOption(resourceOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_OPTIONS:
      {
        ResourceOptions resourceOptions = (ResourceOptions)theEObject;
        T result = caseResourceOptions(resourceOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_VALUE:
      {
        ResourceValue resourceValue = (ResourceValue)theEObject;
        T result = caseResourceValue(resourceValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_SECTION:
      {
        ResourceSection resourceSection = (ResourceSection)theEObject;
        T result = caseResourceSection(resourceSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Prop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Prop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseProp(BaseProp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategoryType(CategoryType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category Type List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category Type List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategoryTypeList(CategoryTypeList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueList(ValueList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssign(Assign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignList(AssignList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionHeader(CompositionHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceID(InstanceID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceOptions(InstanceOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceOption(InstanceOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contract Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contract Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContractInstance(ContractInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldDecl(FieldDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kel Attr Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kel Attr Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKelAttrDecl(KelAttrDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kel Entity Decl Simple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kel Entity Decl Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKelEntityDeclSimple(KelEntityDeclSimple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kel Entity Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kel Entity Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKelEntityDecl(KelEntityDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumEntry(EnumEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumList(EnumList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDecl(EnumDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputSection(InputSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBool(Bool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntVar(IntVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringVar(StringVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataset(Dataset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReal(Real object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Simple Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Simple Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputSimpleTypes(InputSimpleTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecord(Record object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kel Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kel Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKelBase(KelBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatype(Datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputValue(InputValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputOptions(InputOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputOption(InputOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inputtype Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inputtype Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputtypeOptions(InputtypeOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integrate Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integrate Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegrateSection(IntegrateSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputSection(OutputSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outfield Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outfield Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutfieldDecl(OutfieldDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLInteger(ECLInteger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Unsigned</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Unsigned</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLUnsigned(ECLUnsigned object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLString(ECLString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Qstring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Qstring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLQstring(ECLQstring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Varstring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Varstring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLVarstring(ECLVarstring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Unicode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Unicode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLUnicode(ECLUnicode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Varunicode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Varunicode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLVarunicode(ECLVarunicode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLData(ECLData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Real</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Real</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLReal(ECLReal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLBoolean(ECLBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Num Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Num Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLNumType(ECLNumType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Dec Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Dec Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLDecType(ECLDecType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EC Lfield Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EC Lfield Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLfieldType(ECLfieldType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECL Output Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECL Output Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECLOutputDecl(ECLOutputDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Input Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Input Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceInputValue(ServiceInputValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Input Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Input Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceInputSection(ServiceInputSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Dataset Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Dataset Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedDatasetDecl(NestedDatasetDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputOption(OutputOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputOptions(OutputOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Type Simple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Type Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutTypeSimple(OutTypeSimple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Dataset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Dataset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutDataset(OutDataset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputValue(OutputValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputBase(OutputBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Permissions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Permissions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePermissions(Permissions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePermission(Permission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Permission Level</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Permission Level</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomPermissionLevel(CustomPermissionLevel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generate Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generate Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenerateSection(GenerateSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generate Body Inline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generate Body Inline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenerateBodyInline(GenerateBodyInline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generate Body Salt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generate Body Salt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenerateBodySalt(GenerateBodySalt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generate Body Kel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generate Body Kel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenerateBodyKel(GenerateBodyKel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualSection(VisualSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vis Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vis Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisName(VisName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vis Input Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vis Input Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisInputValue(VisInputValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vis Basis Parens</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vis Basis Parens</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisBasisParens(VisBasisParens object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visualization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visualization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualization(Visualization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vis Basis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vis Basis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisBasis(VisBasis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vis Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vis Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisFilter(VisFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vis Basis Qualifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vis Basis Qualifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisBasisQualifiers(VisBasisQualifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pos Viz Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pos Viz Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePosVizData(PosVizData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QFunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QFunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQFunction(QFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nest Basis Qualifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nest Basis Qualifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestBasisQualifier(NestBasisQualifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual Section Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Section Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualSectionOptions(VisualSectionOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual Section Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Section Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualSectionOption(VisualSectionOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Viz Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viz Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVizAssign(VizAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Viz Assign List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viz Assign List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVizAssignList(VizAssignList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Viz Enum Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viz Enum Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVizEnumDecl(VizEnumDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualOptions(VisualOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualOption(VisualOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectEvent(SelectEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectOption(SelectOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkOption(LinkOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual Multival</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Multival</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualMultival(VisualMultival object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visibility Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visibility Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisibilityOption(VisibilityOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual Custom Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Custom Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualCustomOption(VisualCustomOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomSection(CustomSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomValue(CustomValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceType(ResourceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceOption(ResourceOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceOptions(ResourceOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceValue(ResourceValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceSection(ResourceSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //HIPIESwitch
