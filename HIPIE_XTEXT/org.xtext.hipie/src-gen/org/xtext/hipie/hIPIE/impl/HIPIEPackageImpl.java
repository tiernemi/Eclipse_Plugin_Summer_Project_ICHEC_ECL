/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.hipie.hIPIE.Assign;
import org.xtext.hipie.hIPIE.AssignList;
import org.xtext.hipie.hIPIE.BaseProp;
import org.xtext.hipie.hIPIE.Bool;
import org.xtext.hipie.hIPIE.CategoryTypeList;
import org.xtext.hipie.hIPIE.CompositionHeader;
import org.xtext.hipie.hIPIE.ContractInstance;
import org.xtext.hipie.hIPIE.CustomSection;
import org.xtext.hipie.hIPIE.CustomValue;
import org.xtext.hipie.hIPIE.Dataset;
import org.xtext.hipie.hIPIE.Datatype;
import org.xtext.hipie.hIPIE.ECLData;
import org.xtext.hipie.hIPIE.ECLInteger;
import org.xtext.hipie.hIPIE.ECLOutputDecl;
import org.xtext.hipie.hIPIE.ECLQstring;
import org.xtext.hipie.hIPIE.ECLReal;
import org.xtext.hipie.hIPIE.ECLString;
import org.xtext.hipie.hIPIE.ECLUnicode;
import org.xtext.hipie.hIPIE.ECLUnsigned;
import org.xtext.hipie.hIPIE.ECLVarstring;
import org.xtext.hipie.hIPIE.ECLVarunicode;
import org.xtext.hipie.hIPIE.ECLfieldType;
import org.xtext.hipie.hIPIE.EnumDecl;
import org.xtext.hipie.hIPIE.FieldDecl;
import org.xtext.hipie.hIPIE.Function;
import org.xtext.hipie.hIPIE.GenerateBodyInline;
import org.xtext.hipie.hIPIE.GenerateBodySalt;
import org.xtext.hipie.hIPIE.GenerateSection;
import org.xtext.hipie.hIPIE.Group;
import org.xtext.hipie.hIPIE.HIPIEFactory;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputOption;
import org.xtext.hipie.hIPIE.InputOptions;
import org.xtext.hipie.hIPIE.InputSection;
import org.xtext.hipie.hIPIE.InputValue;
import org.xtext.hipie.hIPIE.IntVar;
import org.xtext.hipie.hIPIE.OutDataset;
import org.xtext.hipie.hIPIE.OutType;
import org.xtext.hipie.hIPIE.OutfieldDecl;
import org.xtext.hipie.hIPIE.OutputBase;
import org.xtext.hipie.hIPIE.OutputOption;
import org.xtext.hipie.hIPIE.OutputOptions;
import org.xtext.hipie.hIPIE.OutputSection;
import org.xtext.hipie.hIPIE.OutputValue;
import org.xtext.hipie.hIPIE.PosVizData;
import org.xtext.hipie.hIPIE.Program;
import org.xtext.hipie.hIPIE.Record;
import org.xtext.hipie.hIPIE.ResourceOption;
import org.xtext.hipie.hIPIE.ResourceOptions;
import org.xtext.hipie.hIPIE.ResourceSection;
import org.xtext.hipie.hIPIE.ResourceValue;
import org.xtext.hipie.hIPIE.StringVar;
import org.xtext.hipie.hIPIE.Value;
import org.xtext.hipie.hIPIE.ValueList;
import org.xtext.hipie.hIPIE.VisBasis;
import org.xtext.hipie.hIPIE.VisBasisQualifiers;
import org.xtext.hipie.hIPIE.VisualMultival;
import org.xtext.hipie.hIPIE.VisualOption;
import org.xtext.hipie.hIPIE.VisualOptions;
import org.xtext.hipie.hIPIE.VisualSection;
import org.xtext.hipie.hIPIE.VisualSectionOption;
import org.xtext.hipie.hIPIE.VisualSectionOptions;
import org.xtext.hipie.hIPIE.Visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HIPIEPackageImpl extends EPackageImpl implements HIPIEPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basePropEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryTypeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contractInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intVarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringVarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outfieldDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclIntegerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclUnsignedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclQstringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclVarstringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclUnicodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclVarunicodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclRealEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecLfieldTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass posVizDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclOutputDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outDatasetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputBaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generateSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generateBodyInlineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generateBodySaltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visBasisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visBasisQualifiersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualSectionOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualSectionOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualMultivalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceSectionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.hipie.hIPIE.HIPIEPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HIPIEPackageImpl()
  {
    super(eNS_URI, HIPIEFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link HIPIEPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HIPIEPackage init()
  {
    if (isInited) return (HIPIEPackage)EPackage.Registry.INSTANCE.getEPackage(HIPIEPackage.eNS_URI);

    // Obtain or create and register package
    HIPIEPackageImpl theHIPIEPackage = (HIPIEPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HIPIEPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HIPIEPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theHIPIEPackage.createPackageContents();

    // Initialize created meta-data
    theHIPIEPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHIPIEPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HIPIEPackage.eNS_URI, theHIPIEPackage);
    return theHIPIEPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Composition_header()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Base_props()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Contract_instances()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Input_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Output_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Visual_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Generate_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Custom_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Sesource_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseProp()
  {
    return basePropEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBaseProp_Name()
  {
    return (EAttribute)basePropEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseProp_Val_list()
  {
    return (EReference)basePropEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseProp_Cat_list()
  {
    return (EReference)basePropEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategoryTypeList()
  {
    return categoryTypeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryTypeList_Cats()
  {
    return (EAttribute)categoryTypeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Name()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Int_val()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Str_val()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValue_Res_ops()
  {
    return (EReference)valueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueList()
  {
    return valueListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueList_Vals()
  {
    return (EReference)valueListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssign()
  {
    return assignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssign_Name()
  {
    return (EAttribute)assignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssign_Vals()
  {
    return (EReference)assignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignList()
  {
    return assignListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignList_Assigns()
  {
    return (EReference)assignListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionHeader()
  {
    return compositionHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompositionHeader_Name()
  {
    return (EAttribute)compositionHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositionHeader_Assigns()
  {
    return (EReference)compositionHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContractInstance()
  {
    return contractInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractInstance_Sec_name()
  {
    return (EAttribute)contractInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractInstance_Vals()
  {
    return (EReference)contractInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractInstance_Vars()
  {
    return (EReference)contractInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractInstance_Assigns()
  {
    return (EReference)contractInstanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldDecl()
  {
    return fieldDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDecl_Input_ops()
  {
    return (EReference)fieldDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumDecl()
  {
    return enumDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumDecl_Enum_dec()
  {
    return (EAttribute)enumDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDecl_Vals()
  {
    return (EReference)enumDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDecl_Assigns()
  {
    return (EReference)enumDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputSection()
  {
    return inputSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputSection_Name()
  {
    return (EAttribute)inputSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputSection_Inputs()
  {
    return (EReference)inputSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBool()
  {
    return boolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBool_Name()
  {
    return (EAttribute)boolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntVar()
  {
    return intVarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntVar_Name()
  {
    return (EAttribute)intVarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringVar()
  {
    return stringVarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringVar_Name()
  {
    return (EAttribute)stringVarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecord()
  {
    return recordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_Name()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataset()
  {
    return datasetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataset_Name()
  {
    return (EAttribute)datasetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataset_Fields()
  {
    return (EReference)datasetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroup_Name()
  {
    return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_Vals()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatype()
  {
    return datatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputValue()
  {
    return inputValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputValue_Input_op_list()
  {
    return (EReference)inputValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputOptions()
  {
    return inputOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputOptions_Input_ops()
  {
    return (EReference)inputOptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputOption()
  {
    return inputOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputOption_Name()
  {
    return (EAttribute)inputOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputOption_Assigns_list()
  {
    return (EReference)inputOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputOption_Vals()
  {
    return (EReference)inputOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputSection()
  {
    return outputSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputSection_Name()
  {
    return (EAttribute)outputSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputSection_Outputs()
  {
    return (EReference)outputSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutfieldDecl()
  {
    return outfieldDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutfieldDecl_Fields()
  {
    return (EReference)outfieldDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLInteger()
  {
    return eclIntegerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLUnsigned()
  {
    return eclUnsignedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLString()
  {
    return eclStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLQstring()
  {
    return eclQstringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLVarstring()
  {
    return eclVarstringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLUnicode()
  {
    return eclUnicodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLVarunicode()
  {
    return eclVarunicodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLData()
  {
    return eclDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLReal()
  {
    return eclRealEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLfieldType()
  {
    return ecLfieldTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getECLfieldType_Options()
  {
    return (EReference)ecLfieldTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPosVizData()
  {
    return posVizDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPosVizData_Name()
  {
    return (EAttribute)posVizDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLOutputDecl()
  {
    return eclOutputDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputOption()
  {
    return outputOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputOption_Name()
  {
    return (EAttribute)outputOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputOption_Vars()
  {
    return (EReference)outputOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputOption_Vals()
  {
    return (EReference)outputOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputOptions()
  {
    return outputOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputOptions_Output_ops()
  {
    return (EReference)outputOptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutType()
  {
    return outTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutType_Val()
  {
    return (EReference)outTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutType_Ops()
  {
    return (EReference)outTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutDataset()
  {
    return outDatasetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutDataset_Name()
  {
    return (EAttribute)outDatasetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutDataset_Out_base()
  {
    return (EReference)outDatasetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutDataset_Ops()
  {
    return (EReference)outDatasetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutDataset_Ecl_vars()
  {
    return (EReference)outDatasetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputValue()
  {
    return outputValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputBase()
  {
    return outputBaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputBase_Base()
  {
    return (EReference)outputBaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenerateSection()
  {
    return generateSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenerateSection_Name()
  {
    return (EAttribute)generateSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenerateBodyInline()
  {
    return generateBodyInlineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenerateBodySalt()
  {
    return generateBodySaltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualSection()
  {
    return visualSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisualSection_Sec_name()
  {
    return (EAttribute)visualSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualSection_Vis_ops()
  {
    return (EReference)visualSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualSection_Vis_elements()
  {
    return (EReference)visualSectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualization()
  {
    return visualizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisualization_Name()
  {
    return (EAttribute)visualizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualization_Input()
  {
    return (EReference)visualizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualization_Vis_op()
  {
    return (EReference)visualizationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisBasis()
  {
    return visBasisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisBasis_Basis()
  {
    return (EReference)visBasisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisBasis_Quals()
  {
    return (EReference)visBasisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisBasisQualifiers()
  {
    return visBasisQualifiersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisBasisQualifiers_Funcs()
  {
    return (EReference)visBasisQualifiersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Vars()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Vals()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualSectionOptions()
  {
    return visualSectionOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualSectionOptions_Vis_ops()
  {
    return (EReference)visualSectionOptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualSectionOption()
  {
    return visualSectionOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisualSectionOption_Name()
  {
    return (EAttribute)visualSectionOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualSectionOption_Vals()
  {
    return (EReference)visualSectionOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualOptions()
  {
    return visualOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualOptions_Vis_ops()
  {
    return (EReference)visualOptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualOption()
  {
    return visualOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisualOption_Name()
  {
    return (EAttribute)visualOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualOption_Funcs()
  {
    return (EReference)visualOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualOption_Vis_mult()
  {
    return (EReference)visualOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualMultival()
  {
    return visualMultivalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisualMultival_Name()
  {
    return (EAttribute)visualMultivalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomSection()
  {
    return customSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomSection_Name()
  {
    return (EAttribute)customSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomSection_Cust_vals()
  {
    return (EReference)customSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomValue()
  {
    return customValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceOption()
  {
    return resourceOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceOption_Name()
  {
    return (EAttribute)resourceOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceOption_Vals()
  {
    return (EReference)resourceOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceOptions()
  {
    return resourceOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceOptions_Res_ops()
  {
    return (EReference)resourceOptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceValue()
  {
    return resourceValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceSection()
  {
    return resourceSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceSection_Name()
  {
    return (EAttribute)resourceSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceSection_Res_vals()
  {
    return (EReference)resourceSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HIPIEFactory getHIPIEFactory()
  {
    return (HIPIEFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__COMPOSITION_HEADER);
    createEReference(programEClass, PROGRAM__BASE_PROPS);
    createEReference(programEClass, PROGRAM__CONTRACT_INSTANCES);
    createEReference(programEClass, PROGRAM__INPUT_SECTION);
    createEReference(programEClass, PROGRAM__OUTPUT_SECTION);
    createEReference(programEClass, PROGRAM__VISUAL_SECTION);
    createEReference(programEClass, PROGRAM__GENERATE_SECTION);
    createEReference(programEClass, PROGRAM__CUSTOM_SECTION);
    createEReference(programEClass, PROGRAM__SESOURCE_SECTION);

    basePropEClass = createEClass(BASE_PROP);
    createEAttribute(basePropEClass, BASE_PROP__NAME);
    createEReference(basePropEClass, BASE_PROP__VAL_LIST);
    createEReference(basePropEClass, BASE_PROP__CAT_LIST);

    categoryTypeListEClass = createEClass(CATEGORY_TYPE_LIST);
    createEAttribute(categoryTypeListEClass, CATEGORY_TYPE_LIST__CATS);

    valueEClass = createEClass(VALUE);
    createEAttribute(valueEClass, VALUE__NAME);
    createEAttribute(valueEClass, VALUE__INT_VAL);
    createEAttribute(valueEClass, VALUE__STR_VAL);
    createEReference(valueEClass, VALUE__RES_OPS);

    valueListEClass = createEClass(VALUE_LIST);
    createEReference(valueListEClass, VALUE_LIST__VALS);

    assignEClass = createEClass(ASSIGN);
    createEAttribute(assignEClass, ASSIGN__NAME);
    createEReference(assignEClass, ASSIGN__VALS);

    assignListEClass = createEClass(ASSIGN_LIST);
    createEReference(assignListEClass, ASSIGN_LIST__ASSIGNS);

    compositionHeaderEClass = createEClass(COMPOSITION_HEADER);
    createEAttribute(compositionHeaderEClass, COMPOSITION_HEADER__NAME);
    createEReference(compositionHeaderEClass, COMPOSITION_HEADER__ASSIGNS);

    contractInstanceEClass = createEClass(CONTRACT_INSTANCE);
    createEAttribute(contractInstanceEClass, CONTRACT_INSTANCE__SEC_NAME);
    createEReference(contractInstanceEClass, CONTRACT_INSTANCE__VALS);
    createEReference(contractInstanceEClass, CONTRACT_INSTANCE__VARS);
    createEReference(contractInstanceEClass, CONTRACT_INSTANCE__ASSIGNS);

    fieldDeclEClass = createEClass(FIELD_DECL);
    createEReference(fieldDeclEClass, FIELD_DECL__INPUT_OPS);

    enumDeclEClass = createEClass(ENUM_DECL);
    createEAttribute(enumDeclEClass, ENUM_DECL__ENUM_DEC);
    createEReference(enumDeclEClass, ENUM_DECL__VALS);
    createEReference(enumDeclEClass, ENUM_DECL__ASSIGNS);

    inputSectionEClass = createEClass(INPUT_SECTION);
    createEAttribute(inputSectionEClass, INPUT_SECTION__NAME);
    createEReference(inputSectionEClass, INPUT_SECTION__INPUTS);

    boolEClass = createEClass(BOOL);
    createEAttribute(boolEClass, BOOL__NAME);

    intVarEClass = createEClass(INT_VAR);
    createEAttribute(intVarEClass, INT_VAR__NAME);

    stringVarEClass = createEClass(STRING_VAR);
    createEAttribute(stringVarEClass, STRING_VAR__NAME);

    recordEClass = createEClass(RECORD);
    createEAttribute(recordEClass, RECORD__NAME);

    datasetEClass = createEClass(DATASET);
    createEAttribute(datasetEClass, DATASET__NAME);
    createEReference(datasetEClass, DATASET__FIELDS);

    groupEClass = createEClass(GROUP);
    createEAttribute(groupEClass, GROUP__NAME);
    createEReference(groupEClass, GROUP__VALS);

    datatypeEClass = createEClass(DATATYPE);

    inputValueEClass = createEClass(INPUT_VALUE);
    createEReference(inputValueEClass, INPUT_VALUE__INPUT_OP_LIST);

    inputOptionsEClass = createEClass(INPUT_OPTIONS);
    createEReference(inputOptionsEClass, INPUT_OPTIONS__INPUT_OPS);

    inputOptionEClass = createEClass(INPUT_OPTION);
    createEAttribute(inputOptionEClass, INPUT_OPTION__NAME);
    createEReference(inputOptionEClass, INPUT_OPTION__ASSIGNS_LIST);
    createEReference(inputOptionEClass, INPUT_OPTION__VALS);

    outputSectionEClass = createEClass(OUTPUT_SECTION);
    createEAttribute(outputSectionEClass, OUTPUT_SECTION__NAME);
    createEReference(outputSectionEClass, OUTPUT_SECTION__OUTPUTS);

    outfieldDeclEClass = createEClass(OUTFIELD_DECL);
    createEReference(outfieldDeclEClass, OUTFIELD_DECL__FIELDS);

    eclIntegerEClass = createEClass(ECL_INTEGER);

    eclUnsignedEClass = createEClass(ECL_UNSIGNED);

    eclStringEClass = createEClass(ECL_STRING);

    eclQstringEClass = createEClass(ECL_QSTRING);

    eclVarstringEClass = createEClass(ECL_VARSTRING);

    eclUnicodeEClass = createEClass(ECL_UNICODE);

    eclVarunicodeEClass = createEClass(ECL_VARUNICODE);

    eclDataEClass = createEClass(ECL_DATA);

    eclRealEClass = createEClass(ECL_REAL);

    ecLfieldTypeEClass = createEClass(EC_LFIELD_TYPE);
    createEReference(ecLfieldTypeEClass, EC_LFIELD_TYPE__OPTIONS);

    posVizDataEClass = createEClass(POS_VIZ_DATA);
    createEAttribute(posVizDataEClass, POS_VIZ_DATA__NAME);

    eclOutputDeclEClass = createEClass(ECL_OUTPUT_DECL);

    outputOptionEClass = createEClass(OUTPUT_OPTION);
    createEAttribute(outputOptionEClass, OUTPUT_OPTION__NAME);
    createEReference(outputOptionEClass, OUTPUT_OPTION__VARS);
    createEReference(outputOptionEClass, OUTPUT_OPTION__VALS);

    outputOptionsEClass = createEClass(OUTPUT_OPTIONS);
    createEReference(outputOptionsEClass, OUTPUT_OPTIONS__OUTPUT_OPS);

    outTypeEClass = createEClass(OUT_TYPE);
    createEReference(outTypeEClass, OUT_TYPE__VAL);
    createEReference(outTypeEClass, OUT_TYPE__OPS);

    outDatasetEClass = createEClass(OUT_DATASET);
    createEAttribute(outDatasetEClass, OUT_DATASET__NAME);
    createEReference(outDatasetEClass, OUT_DATASET__OUT_BASE);
    createEReference(outDatasetEClass, OUT_DATASET__OPS);
    createEReference(outDatasetEClass, OUT_DATASET__ECL_VARS);

    outputValueEClass = createEClass(OUTPUT_VALUE);

    outputBaseEClass = createEClass(OUTPUT_BASE);
    createEReference(outputBaseEClass, OUTPUT_BASE__BASE);

    generateSectionEClass = createEClass(GENERATE_SECTION);
    createEAttribute(generateSectionEClass, GENERATE_SECTION__NAME);

    generateBodyInlineEClass = createEClass(GENERATE_BODY_INLINE);

    generateBodySaltEClass = createEClass(GENERATE_BODY_SALT);

    visualSectionEClass = createEClass(VISUAL_SECTION);
    createEAttribute(visualSectionEClass, VISUAL_SECTION__SEC_NAME);
    createEReference(visualSectionEClass, VISUAL_SECTION__VIS_OPS);
    createEReference(visualSectionEClass, VISUAL_SECTION__VIS_ELEMENTS);

    visualizationEClass = createEClass(VISUALIZATION);
    createEAttribute(visualizationEClass, VISUALIZATION__NAME);
    createEReference(visualizationEClass, VISUALIZATION__INPUT);
    createEReference(visualizationEClass, VISUALIZATION__VIS_OP);

    visBasisEClass = createEClass(VIS_BASIS);
    createEReference(visBasisEClass, VIS_BASIS__BASIS);
    createEReference(visBasisEClass, VIS_BASIS__QUALS);

    visBasisQualifiersEClass = createEClass(VIS_BASIS_QUALIFIERS);
    createEReference(visBasisQualifiersEClass, VIS_BASIS_QUALIFIERS__FUNCS);

    functionEClass = createEClass(FUNCTION);
    createEReference(functionEClass, FUNCTION__VARS);
    createEReference(functionEClass, FUNCTION__VALS);

    visualSectionOptionsEClass = createEClass(VISUAL_SECTION_OPTIONS);
    createEReference(visualSectionOptionsEClass, VISUAL_SECTION_OPTIONS__VIS_OPS);

    visualSectionOptionEClass = createEClass(VISUAL_SECTION_OPTION);
    createEAttribute(visualSectionOptionEClass, VISUAL_SECTION_OPTION__NAME);
    createEReference(visualSectionOptionEClass, VISUAL_SECTION_OPTION__VALS);

    visualOptionsEClass = createEClass(VISUAL_OPTIONS);
    createEReference(visualOptionsEClass, VISUAL_OPTIONS__VIS_OPS);

    visualOptionEClass = createEClass(VISUAL_OPTION);
    createEAttribute(visualOptionEClass, VISUAL_OPTION__NAME);
    createEReference(visualOptionEClass, VISUAL_OPTION__FUNCS);
    createEReference(visualOptionEClass, VISUAL_OPTION__VIS_MULT);

    visualMultivalEClass = createEClass(VISUAL_MULTIVAL);
    createEAttribute(visualMultivalEClass, VISUAL_MULTIVAL__NAME);

    customSectionEClass = createEClass(CUSTOM_SECTION);
    createEAttribute(customSectionEClass, CUSTOM_SECTION__NAME);
    createEReference(customSectionEClass, CUSTOM_SECTION__CUST_VALS);

    customValueEClass = createEClass(CUSTOM_VALUE);

    resourceOptionEClass = createEClass(RESOURCE_OPTION);
    createEAttribute(resourceOptionEClass, RESOURCE_OPTION__NAME);
    createEReference(resourceOptionEClass, RESOURCE_OPTION__VALS);

    resourceOptionsEClass = createEClass(RESOURCE_OPTIONS);
    createEReference(resourceOptionsEClass, RESOURCE_OPTIONS__RES_OPS);

    resourceValueEClass = createEClass(RESOURCE_VALUE);

    resourceSectionEClass = createEClass(RESOURCE_SECTION);
    createEAttribute(resourceSectionEClass, RESOURCE_SECTION__NAME);
    createEReference(resourceSectionEClass, RESOURCE_SECTION__RES_VALS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    valueEClass.getESuperTypes().add(this.getCustomValue());
    valueEClass.getESuperTypes().add(this.getResourceValue());
    fieldDeclEClass.getESuperTypes().add(this.getPosVizData());
    enumDeclEClass.getESuperTypes().add(this.getInputValue());
    boolEClass.getESuperTypes().add(this.getDatatype());
    boolEClass.getESuperTypes().add(this.getInputValue());
    boolEClass.getESuperTypes().add(this.getOutfieldDecl());
    intVarEClass.getESuperTypes().add(this.getDatatype());
    intVarEClass.getESuperTypes().add(this.getInputValue());
    intVarEClass.getESuperTypes().add(this.getOutfieldDecl());
    stringVarEClass.getESuperTypes().add(this.getDatatype());
    stringVarEClass.getESuperTypes().add(this.getInputValue());
    stringVarEClass.getESuperTypes().add(this.getOutfieldDecl());
    recordEClass.getESuperTypes().add(this.getDatatype());
    recordEClass.getESuperTypes().add(this.getInputValue());
    datasetEClass.getESuperTypes().add(this.getDatatype());
    datasetEClass.getESuperTypes().add(this.getInputValue());
    groupEClass.getESuperTypes().add(this.getInputValue());
    eclIntegerEClass.getESuperTypes().add(this.getECLfieldType());
    eclUnsignedEClass.getESuperTypes().add(this.getECLfieldType());
    eclStringEClass.getESuperTypes().add(this.getECLfieldType());
    eclQstringEClass.getESuperTypes().add(this.getECLfieldType());
    eclVarstringEClass.getESuperTypes().add(this.getECLfieldType());
    eclUnicodeEClass.getESuperTypes().add(this.getECLfieldType());
    eclVarunicodeEClass.getESuperTypes().add(this.getECLfieldType());
    eclDataEClass.getESuperTypes().add(this.getECLfieldType());
    eclRealEClass.getESuperTypes().add(this.getECLfieldType());
    ecLfieldTypeEClass.getESuperTypes().add(this.getPosVizData());
    ecLfieldTypeEClass.getESuperTypes().add(this.getECLOutputDecl());
    outTypeEClass.getESuperTypes().add(this.getOutputValue());
    outDatasetEClass.getESuperTypes().add(this.getOutputValue());
    generateBodyInlineEClass.getESuperTypes().add(this.getGenerateSection());
    generateBodySaltEClass.getESuperTypes().add(this.getGenerateSection());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Composition_header(), this.getCompositionHeader(), null, "composition_header", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Base_props(), this.getBaseProp(), null, "base_props", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Contract_instances(), this.getContractInstance(), null, "contract_instances", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Input_section(), this.getInputSection(), null, "input_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Output_section(), this.getOutputSection(), null, "output_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Visual_section(), this.getVisualSection(), null, "visual_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Generate_section(), this.getGenerateSection(), null, "generate_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Custom_section(), this.getCustomSection(), null, "custom_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Sesource_section(), this.getResourceSection(), null, "sesource_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basePropEClass, BaseProp.class, "BaseProp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBaseProp_Name(), ecorePackage.getEString(), "name", null, 0, 1, BaseProp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseProp_Val_list(), this.getValueList(), null, "val_list", null, 0, 1, BaseProp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseProp_Cat_list(), this.getCategoryTypeList(), null, "cat_list", null, 0, 1, BaseProp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryTypeListEClass, CategoryTypeList.class, "CategoryTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCategoryTypeList_Cats(), ecorePackage.getEString(), "cats", null, 0, -1, CategoryTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValue_Int_val(), ecorePackage.getEInt(), "int_val", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValue_Str_val(), ecorePackage.getEString(), "str_val", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValue_Res_ops(), this.getResourceOptions(), null, "res_ops", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueListEClass, ValueList.class, "ValueList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueList_Vals(), this.getValue(), null, "vals", null, 0, -1, ValueList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignEClass, Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssign_Name(), ecorePackage.getEString(), "name", null, 0, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssign_Vals(), this.getValueList(), null, "vals", null, 0, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignListEClass, AssignList.class, "AssignList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignList_Assigns(), this.getAssign(), null, "assigns", null, 0, -1, AssignList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositionHeaderEClass, CompositionHeader.class, "CompositionHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompositionHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, CompositionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositionHeader_Assigns(), this.getAssign(), null, "assigns", null, 0, -1, CompositionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contractInstanceEClass, ContractInstance.class, "ContractInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContractInstance_Sec_name(), ecorePackage.getEString(), "sec_name", null, 0, 1, ContractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractInstance_Vals(), this.getValue(), null, "vals", null, 0, -1, ContractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractInstance_Vars(), this.getValue(), null, "vars", null, 0, -1, ContractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractInstance_Assigns(), this.getAssign(), null, "assigns", null, 0, -1, ContractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldDeclEClass, FieldDecl.class, "FieldDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldDecl_Input_ops(), this.getInputOptions(), null, "input_ops", null, 0, 1, FieldDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumDeclEClass, EnumDecl.class, "EnumDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumDecl_Enum_dec(), ecorePackage.getEString(), "enum_dec", null, 0, 1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumDecl_Vals(), this.getValueList(), null, "vals", null, 0, -1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumDecl_Assigns(), this.getAssignList(), null, "assigns", null, 0, -1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputSectionEClass, InputSection.class, "InputSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputSection_Inputs(), this.getInputValue(), null, "inputs", null, 0, -1, InputSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBool_Name(), ecorePackage.getEString(), "name", null, 0, 1, Bool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intVarEClass, IntVar.class, "IntVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringVarEClass, StringVar.class, "StringVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, StringVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecord_Name(), ecorePackage.getEString(), "name", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataset_Fields(), this.getFieldDecl(), null, "fields", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroup_Vals(), this.getInputValue(), null, "vals", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputValue_Input_op_list(), this.getInputOptions(), null, "input_op_list", null, 0, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputOptionsEClass, InputOptions.class, "InputOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputOptions_Input_ops(), this.getInputOption(), null, "input_ops", null, 0, -1, InputOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputOptionEClass, InputOption.class, "InputOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputOption_Assigns_list(), this.getAssignList(), null, "assigns_list", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputOption_Vals(), this.getValueList(), null, "vals", null, 0, -1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputSectionEClass, OutputSection.class, "OutputSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutputSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutputSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputSection_Outputs(), this.getOutputValue(), null, "outputs", null, 0, -1, OutputSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outfieldDeclEClass, OutfieldDecl.class, "OutfieldDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutfieldDecl_Fields(), this.getFieldDecl(), null, "fields", null, 0, -1, OutfieldDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eclIntegerEClass, ECLInteger.class, "ECLInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclUnsignedEClass, ECLUnsigned.class, "ECLUnsigned", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclStringEClass, ECLString.class, "ECLString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclQstringEClass, ECLQstring.class, "ECLQstring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclVarstringEClass, ECLVarstring.class, "ECLVarstring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclUnicodeEClass, ECLUnicode.class, "ECLUnicode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclVarunicodeEClass, ECLVarunicode.class, "ECLVarunicode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclDataEClass, ECLData.class, "ECLData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclRealEClass, ECLReal.class, "ECLReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecLfieldTypeEClass, ECLfieldType.class, "ECLfieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getECLfieldType_Options(), this.getOutputOptions(), null, "options", null, 0, 1, ECLfieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(posVizDataEClass, PosVizData.class, "PosVizData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPosVizData_Name(), ecorePackage.getEString(), "name", null, 0, 1, PosVizData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eclOutputDeclEClass, ECLOutputDecl.class, "ECLOutputDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputOptionEClass, OutputOption.class, "OutputOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutputOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputOption_Vars(), this.getDatatype(), null, "vars", null, 0, 1, OutputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputOption_Vals(), this.getValue(), null, "vals", null, 0, 1, OutputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputOptionsEClass, OutputOptions.class, "OutputOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputOptions_Output_ops(), this.getOutputOption(), null, "output_ops", null, 0, -1, OutputOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outTypeEClass, OutType.class, "OutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutType_Val(), this.getValue(), null, "val", null, 0, 1, OutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutType_Ops(), this.getOutputOptions(), null, "ops", null, 0, 1, OutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outDatasetEClass, OutDataset.class, "OutDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutDataset_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutDataset_Out_base(), this.getOutputBase(), null, "out_base", null, 0, 1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutDataset_Ops(), this.getOutputOptions(), null, "ops", null, 0, -1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutDataset_Ecl_vars(), this.getECLOutputDecl(), null, "ecl_vars", null, 0, -1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputValueEClass, OutputValue.class, "OutputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputBaseEClass, OutputBase.class, "OutputBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputBase_Base(), this.getDatatype(), null, "base", null, 0, 1, OutputBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generateSectionEClass, GenerateSection.class, "GenerateSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenerateSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenerateSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generateBodyInlineEClass, GenerateBodyInline.class, "GenerateBodyInline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(generateBodySaltEClass, GenerateBodySalt.class, "GenerateBodySalt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visualSectionEClass, VisualSection.class, "VisualSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisualSection_Sec_name(), ecorePackage.getEString(), "sec_name", null, 0, 1, VisualSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualSection_Vis_ops(), this.getVisualSectionOptions(), null, "vis_ops", null, 0, 1, VisualSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualSection_Vis_elements(), this.getVisualization(), null, "vis_elements", null, 0, -1, VisualSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualizationEClass, Visualization.class, "Visualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisualization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualization_Input(), this.getVisBasis(), null, "input", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualization_Vis_op(), this.getVisualOptions(), null, "vis_op", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visBasisEClass, VisBasis.class, "VisBasis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisBasis_Basis(), this.getOutDataset(), null, "basis", null, 0, 1, VisBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisBasis_Quals(), this.getVisBasisQualifiers(), null, "quals", null, 0, 1, VisBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visBasisQualifiersEClass, VisBasisQualifiers.class, "VisBasisQualifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisBasisQualifiers_Funcs(), this.getFunction(), null, "funcs", null, 0, -1, VisBasisQualifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_Vars(), this.getPosVizData(), null, "vars", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Vals(), this.getValue(), null, "vals", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualSectionOptionsEClass, VisualSectionOptions.class, "VisualSectionOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisualSectionOptions_Vis_ops(), this.getVisualSectionOption(), null, "vis_ops", null, 0, -1, VisualSectionOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualSectionOptionEClass, VisualSectionOption.class, "VisualSectionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisualSectionOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, VisualSectionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualSectionOption_Vals(), this.getValue(), null, "vals", null, 0, 1, VisualSectionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualOptionsEClass, VisualOptions.class, "VisualOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisualOptions_Vis_ops(), this.getVisualOption(), null, "vis_ops", null, 0, -1, VisualOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualOptionEClass, VisualOption.class, "VisualOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisualOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualOption_Funcs(), this.getFunction(), null, "funcs", null, 0, -1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualOption_Vis_mult(), this.getVisualMultival(), null, "vis_mult", null, 0, 1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualMultivalEClass, VisualMultival.class, "VisualMultival", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisualMultival_Name(), ecorePackage.getEString(), "name", null, 0, 1, VisualMultival.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customSectionEClass, CustomSection.class, "CustomSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomSection_Cust_vals(), this.getCustomValue(), null, "cust_vals", null, 0, -1, CustomSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customValueEClass, CustomValue.class, "CustomValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceOptionEClass, ResourceOption.class, "ResourceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceOption_Vals(), this.getValue(), null, "vals", null, 0, 1, ResourceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceOptionsEClass, ResourceOptions.class, "ResourceOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResourceOptions_Res_ops(), this.getResourceOption(), null, "res_ops", null, 0, -1, ResourceOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceValueEClass, ResourceValue.class, "ResourceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceSectionEClass, ResourceSection.class, "ResourceSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceSection_Res_vals(), this.getResourceValue(), null, "res_vals", null, 0, -1, ResourceSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HIPIEPackageImpl
