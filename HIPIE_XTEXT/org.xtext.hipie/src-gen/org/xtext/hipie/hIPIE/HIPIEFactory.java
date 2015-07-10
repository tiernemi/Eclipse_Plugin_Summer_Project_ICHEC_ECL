/**
 */
package org.xtext.hipie.hIPIE;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.hipie.hIPIE.HIPIEPackage
 * @generated
 */
public interface HIPIEFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HIPIEFactory eINSTANCE = org.xtext.hipie.hIPIE.impl.HIPIEFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Base Prop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Prop</em>'.
   * @generated
   */
  BaseProp createBaseProp();

  /**
   * Returns a new object of class '<em>Category Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category Type</em>'.
   * @generated
   */
  CategoryType createCategoryType();

  /**
   * Returns a new object of class '<em>Category Type List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category Type List</em>'.
   * @generated
   */
  CategoryTypeList createCategoryTypeList();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Value List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value List</em>'.
   * @generated
   */
  ValueList createValueList();

  /**
   * Returns a new object of class '<em>Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign</em>'.
   * @generated
   */
  Assign createAssign();

  /**
   * Returns a new object of class '<em>Assign List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign List</em>'.
   * @generated
   */
  AssignList createAssignList();

  /**
   * Returns a new object of class '<em>Composition Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Header</em>'.
   * @generated
   */
  CompositionHeader createCompositionHeader();

  /**
   * Returns a new object of class '<em>Instance ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance ID</em>'.
   * @generated
   */
  InstanceID createInstanceID();

  /**
   * Returns a new object of class '<em>Instance Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Options</em>'.
   * @generated
   */
  InstanceOptions createInstanceOptions();

  /**
   * Returns a new object of class '<em>Instance Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Option</em>'.
   * @generated
   */
  InstanceOption createInstanceOption();

  /**
   * Returns a new object of class '<em>Contract Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contract Instance</em>'.
   * @generated
   */
  ContractInstance createContractInstance();

  /**
   * Returns a new object of class '<em>Field Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Decl</em>'.
   * @generated
   */
  FieldDecl createFieldDecl();

  /**
   * Returns a new object of class '<em>Kel Attr Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kel Attr Decl</em>'.
   * @generated
   */
  KelAttrDecl createKelAttrDecl();

  /**
   * Returns a new object of class '<em>Kel Entity Decl Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kel Entity Decl Simple</em>'.
   * @generated
   */
  KelEntityDeclSimple createKelEntityDeclSimple();

  /**
   * Returns a new object of class '<em>Kel Entity Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kel Entity Decl</em>'.
   * @generated
   */
  KelEntityDecl createKelEntityDecl();

  /**
   * Returns a new object of class '<em>Enum Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Entry</em>'.
   * @generated
   */
  EnumEntry createEnumEntry();

  /**
   * Returns a new object of class '<em>Enum List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum List</em>'.
   * @generated
   */
  EnumList createEnumList();

  /**
   * Returns a new object of class '<em>Enum Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Decl</em>'.
   * @generated
   */
  EnumDecl createEnumDecl();

  /**
   * Returns a new object of class '<em>Input Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Section</em>'.
   * @generated
   */
  InputSection createInputSection();

  /**
   * Returns a new object of class '<em>Bool</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool</em>'.
   * @generated
   */
  Bool createBool();

  /**
   * Returns a new object of class '<em>Int Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Var</em>'.
   * @generated
   */
  IntVar createIntVar();

  /**
   * Returns a new object of class '<em>String Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Var</em>'.
   * @generated
   */
  StringVar createStringVar();

  /**
   * Returns a new object of class '<em>Dataset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dataset</em>'.
   * @generated
   */
  Dataset createDataset();

  /**
   * Returns a new object of class '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group</em>'.
   * @generated
   */
  Group createGroup();

  /**
   * Returns a new object of class '<em>Real</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real</em>'.
   * @generated
   */
  Real createReal();

  /**
   * Returns a new object of class '<em>Input Simple Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Simple Types</em>'.
   * @generated
   */
  InputSimpleTypes createInputSimpleTypes();

  /**
   * Returns a new object of class '<em>Record</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record</em>'.
   * @generated
   */
  Record createRecord();

  /**
   * Returns a new object of class '<em>Kel Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kel Base</em>'.
   * @generated
   */
  KelBase createKelBase();

  /**
   * Returns a new object of class '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype</em>'.
   * @generated
   */
  Datatype createDatatype();

  /**
   * Returns a new object of class '<em>Input Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Value</em>'.
   * @generated
   */
  InputValue createInputValue();

  /**
   * Returns a new object of class '<em>Input Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Options</em>'.
   * @generated
   */
  InputOptions createInputOptions();

  /**
   * Returns a new object of class '<em>Input Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Option</em>'.
   * @generated
   */
  InputOption createInputOption();

  /**
   * Returns a new object of class '<em>Inputtype Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inputtype Options</em>'.
   * @generated
   */
  InputtypeOptions createInputtypeOptions();

  /**
   * Returns a new object of class '<em>Integrate Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integrate Section</em>'.
   * @generated
   */
  IntegrateSection createIntegrateSection();

  /**
   * Returns a new object of class '<em>Output Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Section</em>'.
   * @generated
   */
  OutputSection createOutputSection();

  /**
   * Returns a new object of class '<em>Outfield Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Outfield Decl</em>'.
   * @generated
   */
  OutfieldDecl createOutfieldDecl();

  /**
   * Returns a new object of class '<em>ECL Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Integer</em>'.
   * @generated
   */
  ECLInteger createECLInteger();

  /**
   * Returns a new object of class '<em>ECL Unsigned</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Unsigned</em>'.
   * @generated
   */
  ECLUnsigned createECLUnsigned();

  /**
   * Returns a new object of class '<em>ECL String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL String</em>'.
   * @generated
   */
  ECLString createECLString();

  /**
   * Returns a new object of class '<em>ECL Qstring</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Qstring</em>'.
   * @generated
   */
  ECLQstring createECLQstring();

  /**
   * Returns a new object of class '<em>ECL Varstring</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Varstring</em>'.
   * @generated
   */
  ECLVarstring createECLVarstring();

  /**
   * Returns a new object of class '<em>ECL Unicode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Unicode</em>'.
   * @generated
   */
  ECLUnicode createECLUnicode();

  /**
   * Returns a new object of class '<em>ECL Varunicode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Varunicode</em>'.
   * @generated
   */
  ECLVarunicode createECLVarunicode();

  /**
   * Returns a new object of class '<em>ECL Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Data</em>'.
   * @generated
   */
  ECLData createECLData();

  /**
   * Returns a new object of class '<em>ECL Real</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Real</em>'.
   * @generated
   */
  ECLReal createECLReal();

  /**
   * Returns a new object of class '<em>ECL Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Boolean</em>'.
   * @generated
   */
  ECLBoolean createECLBoolean();

  /**
   * Returns a new object of class '<em>ECL Num Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Num Type</em>'.
   * @generated
   */
  ECLNumType createECLNumType();

  /**
   * Returns a new object of class '<em>ECL Dec Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Dec Type</em>'.
   * @generated
   */
  ECLDecType createECLDecType();

  /**
   * Returns a new object of class '<em>EC Lfield Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EC Lfield Type</em>'.
   * @generated
   */
  ECLfieldType createECLfieldType();

  /**
   * Returns a new object of class '<em>ECL Output Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECL Output Decl</em>'.
   * @generated
   */
  ECLOutputDecl createECLOutputDecl();

  /**
   * Returns a new object of class '<em>Service Input Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Input Value</em>'.
   * @generated
   */
  ServiceInputValue createServiceInputValue();

  /**
   * Returns a new object of class '<em>Service Input Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Input Section</em>'.
   * @generated
   */
  ServiceInputSection createServiceInputSection();

  /**
   * Returns a new object of class '<em>Nested Dataset Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Dataset Decl</em>'.
   * @generated
   */
  NestedDatasetDecl createNestedDatasetDecl();

  /**
   * Returns a new object of class '<em>Output Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Option</em>'.
   * @generated
   */
  OutputOption createOutputOption();

  /**
   * Returns a new object of class '<em>Output Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Options</em>'.
   * @generated
   */
  OutputOptions createOutputOptions();

  /**
   * Returns a new object of class '<em>Out Type Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Out Type Simple</em>'.
   * @generated
   */
  OutTypeSimple createOutTypeSimple();

  /**
   * Returns a new object of class '<em>Out Dataset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Out Dataset</em>'.
   * @generated
   */
  OutDataset createOutDataset();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Output Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Value</em>'.
   * @generated
   */
  OutputValue createOutputValue();

  /**
   * Returns a new object of class '<em>Output Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Base</em>'.
   * @generated
   */
  OutputBase createOutputBase();

  /**
   * Returns a new object of class '<em>Permissions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Permissions</em>'.
   * @generated
   */
  Permissions createPermissions();

  /**
   * Returns a new object of class '<em>Permission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Permission</em>'.
   * @generated
   */
  Permission createPermission();

  /**
   * Returns a new object of class '<em>Custom Permission Level</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Permission Level</em>'.
   * @generated
   */
  CustomPermissionLevel createCustomPermissionLevel();

  /**
   * Returns a new object of class '<em>Generate Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generate Section</em>'.
   * @generated
   */
  GenerateSection createGenerateSection();

  /**
   * Returns a new object of class '<em>Generate Body Inline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generate Body Inline</em>'.
   * @generated
   */
  GenerateBodyInline createGenerateBodyInline();

  /**
   * Returns a new object of class '<em>Generate Body Salt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generate Body Salt</em>'.
   * @generated
   */
  GenerateBodySalt createGenerateBodySalt();

  /**
   * Returns a new object of class '<em>Generate Body Kel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generate Body Kel</em>'.
   * @generated
   */
  GenerateBodyKel createGenerateBodyKel();

  /**
   * Returns a new object of class '<em>Visual Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Section</em>'.
   * @generated
   */
  VisualSection createVisualSection();

  /**
   * Returns a new object of class '<em>Vis Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vis Name</em>'.
   * @generated
   */
  VisName createVisName();

  /**
   * Returns a new object of class '<em>Vis Input Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vis Input Value</em>'.
   * @generated
   */
  VisInputValue createVisInputValue();

  /**
   * Returns a new object of class '<em>Vis Basis Parens</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vis Basis Parens</em>'.
   * @generated
   */
  VisBasisParens createVisBasisParens();

  /**
   * Returns a new object of class '<em>Visualization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visualization</em>'.
   * @generated
   */
  Visualization createVisualization();

  /**
   * Returns a new object of class '<em>Vis Basis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vis Basis</em>'.
   * @generated
   */
  VisBasis createVisBasis();

  /**
   * Returns a new object of class '<em>Vis Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vis Filter</em>'.
   * @generated
   */
  VisFilter createVisFilter();

  /**
   * Returns a new object of class '<em>Vis Basis Qualifiers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vis Basis Qualifiers</em>'.
   * @generated
   */
  VisBasisQualifiers createVisBasisQualifiers();

  /**
   * Returns a new object of class '<em>Pos Viz Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pos Viz Data</em>'.
   * @generated
   */
  PosVizData createPosVizData();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>QFunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QFunction</em>'.
   * @generated
   */
  QFunction createQFunction();

  /**
   * Returns a new object of class '<em>Nest Basis Qualifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nest Basis Qualifier</em>'.
   * @generated
   */
  NestBasisQualifier createNestBasisQualifier();

  /**
   * Returns a new object of class '<em>Visual Section Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Section Options</em>'.
   * @generated
   */
  VisualSectionOptions createVisualSectionOptions();

  /**
   * Returns a new object of class '<em>Visual Section Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Section Option</em>'.
   * @generated
   */
  VisualSectionOption createVisualSectionOption();

  /**
   * Returns a new object of class '<em>Viz Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viz Assign</em>'.
   * @generated
   */
  VizAssign createVizAssign();

  /**
   * Returns a new object of class '<em>Viz Assign List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viz Assign List</em>'.
   * @generated
   */
  VizAssignList createVizAssignList();

  /**
   * Returns a new object of class '<em>Viz Enum Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viz Enum Decl</em>'.
   * @generated
   */
  VizEnumDecl createVizEnumDecl();

  /**
   * Returns a new object of class '<em>Visual Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Options</em>'.
   * @generated
   */
  VisualOptions createVisualOptions();

  /**
   * Returns a new object of class '<em>Visual Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Option</em>'.
   * @generated
   */
  VisualOption createVisualOption();

  /**
   * Returns a new object of class '<em>Select Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Event</em>'.
   * @generated
   */
  SelectEvent createSelectEvent();

  /**
   * Returns a new object of class '<em>Select Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Option</em>'.
   * @generated
   */
  SelectOption createSelectOption();

  /**
   * Returns a new object of class '<em>Link Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Option</em>'.
   * @generated
   */
  LinkOption createLinkOption();

  /**
   * Returns a new object of class '<em>Visual Multival</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Multival</em>'.
   * @generated
   */
  VisualMultival createVisualMultival();

  /**
   * Returns a new object of class '<em>Visibility Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visibility Option</em>'.
   * @generated
   */
  VisibilityOption createVisibilityOption();

  /**
   * Returns a new object of class '<em>Visual Custom Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Custom Option</em>'.
   * @generated
   */
  VisualCustomOption createVisualCustomOption();

  /**
   * Returns a new object of class '<em>Custom Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Section</em>'.
   * @generated
   */
  CustomSection createCustomSection();

  /**
   * Returns a new object of class '<em>Custom Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Value</em>'.
   * @generated
   */
  CustomValue createCustomValue();

  /**
   * Returns a new object of class '<em>Resource Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Type</em>'.
   * @generated
   */
  ResourceType createResourceType();

  /**
   * Returns a new object of class '<em>Resource Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Option</em>'.
   * @generated
   */
  ResourceOption createResourceOption();

  /**
   * Returns a new object of class '<em>Resource Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Options</em>'.
   * @generated
   */
  ResourceOptions createResourceOptions();

  /**
   * Returns a new object of class '<em>Resource Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Value</em>'.
   * @generated
   */
  ResourceValue createResourceValue();

  /**
   * Returns a new object of class '<em>Resource Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Section</em>'.
   * @generated
   */
  ResourceSection createResourceSection();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HIPIEPackage getHIPIEPackage();

} //HIPIEFactory
