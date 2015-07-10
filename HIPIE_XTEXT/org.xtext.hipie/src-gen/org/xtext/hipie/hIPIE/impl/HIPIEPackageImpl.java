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
import org.xtext.hipie.hIPIE.CategoryType;
import org.xtext.hipie.hIPIE.CategoryTypeList;
import org.xtext.hipie.hIPIE.CompositionHeader;
import org.xtext.hipie.hIPIE.ContractInstance;
import org.xtext.hipie.hIPIE.CustomPermissionLevel;
import org.xtext.hipie.hIPIE.CustomSection;
import org.xtext.hipie.hIPIE.CustomValue;
import org.xtext.hipie.hIPIE.Dataset;
import org.xtext.hipie.hIPIE.Datatype;
import org.xtext.hipie.hIPIE.ECLBoolean;
import org.xtext.hipie.hIPIE.ECLData;
import org.xtext.hipie.hIPIE.ECLDecType;
import org.xtext.hipie.hIPIE.ECLInteger;
import org.xtext.hipie.hIPIE.ECLNumType;
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
import org.xtext.hipie.hIPIE.EnumEntry;
import org.xtext.hipie.hIPIE.EnumList;
import org.xtext.hipie.hIPIE.FieldDecl;
import org.xtext.hipie.hIPIE.Function;
import org.xtext.hipie.hIPIE.GenerateBodyInline;
import org.xtext.hipie.hIPIE.GenerateBodyKel;
import org.xtext.hipie.hIPIE.GenerateBodySalt;
import org.xtext.hipie.hIPIE.GenerateSection;
import org.xtext.hipie.hIPIE.Group;
import org.xtext.hipie.hIPIE.HIPIEFactory;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputOption;
import org.xtext.hipie.hIPIE.InputOptions;
import org.xtext.hipie.hIPIE.InputSection;
import org.xtext.hipie.hIPIE.InputSimpleTypes;
import org.xtext.hipie.hIPIE.InputValue;
import org.xtext.hipie.hIPIE.InputtypeOptions;
import org.xtext.hipie.hIPIE.InstanceID;
import org.xtext.hipie.hIPIE.InstanceOption;
import org.xtext.hipie.hIPIE.InstanceOptions;
import org.xtext.hipie.hIPIE.IntVar;
import org.xtext.hipie.hIPIE.IntegrateSection;
import org.xtext.hipie.hIPIE.KelAttrDecl;
import org.xtext.hipie.hIPIE.KelBase;
import org.xtext.hipie.hIPIE.KelEntityDecl;
import org.xtext.hipie.hIPIE.KelEntityDeclSimple;
import org.xtext.hipie.hIPIE.LinkOption;
import org.xtext.hipie.hIPIE.NestBasisQualifier;
import org.xtext.hipie.hIPIE.NestedDatasetDecl;
import org.xtext.hipie.hIPIE.OutDataset;
import org.xtext.hipie.hIPIE.OutTypeSimple;
import org.xtext.hipie.hIPIE.OutfieldDecl;
import org.xtext.hipie.hIPIE.OutputBase;
import org.xtext.hipie.hIPIE.OutputOption;
import org.xtext.hipie.hIPIE.OutputOptions;
import org.xtext.hipie.hIPIE.OutputSection;
import org.xtext.hipie.hIPIE.OutputValue;
import org.xtext.hipie.hIPIE.Permission;
import org.xtext.hipie.hIPIE.Permissions;
import org.xtext.hipie.hIPIE.PosVizData;
import org.xtext.hipie.hIPIE.Program;
import org.xtext.hipie.hIPIE.QFunction;
import org.xtext.hipie.hIPIE.Real;
import org.xtext.hipie.hIPIE.Record;
import org.xtext.hipie.hIPIE.ResourceOption;
import org.xtext.hipie.hIPIE.ResourceOptions;
import org.xtext.hipie.hIPIE.ResourceSection;
import org.xtext.hipie.hIPIE.ResourceType;
import org.xtext.hipie.hIPIE.ResourceValue;
import org.xtext.hipie.hIPIE.SelectEvent;
import org.xtext.hipie.hIPIE.SelectOption;
import org.xtext.hipie.hIPIE.Service;
import org.xtext.hipie.hIPIE.ServiceInputSection;
import org.xtext.hipie.hIPIE.ServiceInputValue;
import org.xtext.hipie.hIPIE.StringVar;
import org.xtext.hipie.hIPIE.Value;
import org.xtext.hipie.hIPIE.ValueList;
import org.xtext.hipie.hIPIE.VisBasis;
import org.xtext.hipie.hIPIE.VisBasisParens;
import org.xtext.hipie.hIPIE.VisBasisQualifiers;
import org.xtext.hipie.hIPIE.VisFilter;
import org.xtext.hipie.hIPIE.VisInputValue;
import org.xtext.hipie.hIPIE.VisName;
import org.xtext.hipie.hIPIE.VisibilityOption;
import org.xtext.hipie.hIPIE.VisualCustomOption;
import org.xtext.hipie.hIPIE.VisualMultival;
import org.xtext.hipie.hIPIE.VisualOption;
import org.xtext.hipie.hIPIE.VisualOptions;
import org.xtext.hipie.hIPIE.VisualSection;
import org.xtext.hipie.hIPIE.VisualSectionOption;
import org.xtext.hipie.hIPIE.VisualSectionOptions;
import org.xtext.hipie.hIPIE.Visualization;
import org.xtext.hipie.hIPIE.VizAssign;
import org.xtext.hipie.hIPIE.VizAssignList;
import org.xtext.hipie.hIPIE.VizEnumDecl;

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
  private EClass categoryTypeEClass = null;

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
  private EClass instanceIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceOptionEClass = null;

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
  private EClass kelAttrDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kelEntityDeclSimpleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kelEntityDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumListEClass = null;

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
  private EClass realEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputSimpleTypesEClass = null;

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
  private EClass kelBaseEClass = null;

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
  private EClass inputtypeOptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integrateSectionEClass = null;

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
  private EClass eclBooleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclNumTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclDecTypeEClass = null;

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
  private EClass eclOutputDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceInputValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceInputSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedDatasetDeclEClass = null;

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
  private EClass outTypeSimpleEClass = null;

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
  private EClass serviceEClass = null;

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
  private EClass permissionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass permissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customPermissionLevelEClass = null;

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
  private EClass generateBodyKelEClass = null;

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
  private EClass visNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visInputValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visBasisParensEClass = null;

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
  private EClass visFilterEClass = null;

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
  private EClass posVizDataEClass = null;

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
  private EClass qFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestBasisQualifierEClass = null;

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
  private EClass vizAssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vizAssignListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vizEnumDeclEClass = null;

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
  private EClass selectEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkOptionEClass = null;

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
  private EClass visibilityOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualCustomOptionEClass = null;

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
  private EClass resourceTypeEClass = null;

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
  public EReference getProgram_Permissions()
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
  public EReference getProgram_Contract_instances()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Output_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Integrate_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Visual_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Generate_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Custom_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Resource_section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(10);
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
  public EClass getCategoryType()
  {
    return categoryTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Name()
  {
    return (EAttribute)categoryTypeEClass.getEStructuralFeatures().get(0);
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
  public EReference getCategoryTypeList_Cats()
  {
    return (EReference)categoryTypeListEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getValue_Int_val()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Str_val()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValue_Res_ops()
  {
    return (EReference)valueEClass.getEStructuralFeatures().get(2);
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
  public EReference getAssign_Vals_l()
  {
    return (EReference)assignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssign_Vals_r()
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
  public EClass getInstanceID()
  {
    return instanceIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstanceID_Name()
  {
    return (EAttribute)instanceIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceOptions()
  {
    return instanceOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceOptions_In_ops()
  {
    return (EReference)instanceOptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceOption()
  {
    return instanceOptionEClass;
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
  public EReference getContractInstance_InstId()
  {
    return (EReference)contractInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractInstance_Instance_ops()
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
  public EClass getKelAttrDecl()
  {
    return kelAttrDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKelAttrDecl_Name()
  {
    return (EAttribute)kelAttrDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKelAttrDecl_Input_ops()
  {
    return (EReference)kelAttrDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKelEntityDeclSimple()
  {
    return kelEntityDeclSimpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKelEntityDeclSimple_Name()
  {
    return (EAttribute)kelEntityDeclSimpleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKelEntityDeclSimple_Input_ops()
  {
    return (EReference)kelEntityDeclSimpleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKelEntityDecl()
  {
    return kelEntityDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKelEntityDecl_Name()
  {
    return (EAttribute)kelEntityDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKelEntityDecl_Input_ops()
  {
    return (EReference)kelEntityDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKelEntityDecl_Attrdecl()
  {
    return (EReference)kelEntityDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumEntry()
  {
    return enumEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumEntry_Val_l()
  {
    return (EReference)enumEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumEntry_Val_r()
  {
    return (EReference)enumEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumList()
  {
    return enumListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumList_En_ents()
  {
    return (EReference)enumListEClass.getEStructuralFeatures().get(0);
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
  public EReference getEnumDecl_Enum_list()
  {
    return (EReference)enumDeclEClass.getEStructuralFeatures().get(1);
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
  public EReference getDataset_Input_op_list()
  {
    return (EReference)datasetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataset_Fields()
  {
    return (EReference)datasetEClass.getEStructuralFeatures().get(2);
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
  public EReference getGroup_Input_op_list()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_Vals()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReal()
  {
    return realEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReal_Name()
  {
    return (EAttribute)realEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputSimpleTypes()
  {
    return inputSimpleTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputSimpleTypes_Input_op_list()
  {
    return (EReference)inputSimpleTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputSimpleTypes_In_ops()
  {
    return (EReference)inputSimpleTypesEClass.getEStructuralFeatures().get(1);
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
  public EReference getRecord_Input_op_list()
  {
    return (EReference)recordEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKelBase()
  {
    return kelBaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKelBase_Name()
  {
    return (EAttribute)kelBaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKelBase_Input_op_list()
  {
    return (EReference)kelBaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKelBase_Kel_ops()
  {
    return (EReference)kelBaseEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getInputOption_Atr()
  {
    return (EAttribute)inputOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputOption_Form()
  {
    return (EAttribute)inputOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputOption_Form_op()
  {
    return (EAttribute)inputOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputOption_Enab()
  {
    return (EAttribute)inputOptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputOption_Assigns_list()
  {
    return (EReference)inputOptionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputOption_Type()
  {
    return (EAttribute)inputOptionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputOption_Type_op()
  {
    return (EReference)inputOptionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputOption_Vals()
  {
    return (EReference)inputOptionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputtypeOptions()
  {
    return inputtypeOptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputtypeOptions_In_type_op()
  {
    return (EAttribute)inputtypeOptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegrateSection()
  {
    return integrateSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegrateSection_Name()
  {
    return (EAttribute)integrateSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegrateSection_Outputs()
  {
    return (EReference)integrateSectionEClass.getEStructuralFeatures().get(1);
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
  public EClass getECLBoolean()
  {
    return eclBooleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLNumType()
  {
    return eclNumTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECLDecType()
  {
    return eclDecTypeEClass;
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
  public EReference getECLfieldType_In_ops()
  {
    return (EReference)ecLfieldTypeEClass.getEStructuralFeatures().get(1);
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
  public EClass getServiceInputValue()
  {
    return serviceInputValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceInputSection()
  {
    return serviceInputSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceInputSection_Servs()
  {
    return (EReference)serviceInputSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedDatasetDecl()
  {
    return nestedDatasetDeclEClass;
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
  public EAttribute getOutputOption_Type()
  {
    return (EAttribute)outputOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputOption_Atr()
  {
    return (EAttribute)outputOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputOption_Name()
  {
    return (EAttribute)outputOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputOption_Assigns()
  {
    return (EReference)outputOptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputOption_Vals()
  {
    return (EReference)outputOptionEClass.getEStructuralFeatures().get(4);
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
  public EClass getOutTypeSimple()
  {
    return outTypeSimpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutTypeSimple_Type()
  {
    return (EAttribute)outTypeSimpleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutTypeSimple_Vals()
  {
    return (EReference)outTypeSimpleEClass.getEStructuralFeatures().get(1);
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
  public EReference getOutDataset_Options()
  {
    return (EReference)outDatasetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutDataset_Decl()
  {
    return (EReference)outDatasetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutDataset_Name()
  {
    return (EAttribute)outDatasetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutDataset_Out_base()
  {
    return (EReference)outDatasetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutDataset_Ops()
  {
    return (EReference)outDatasetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutDataset_Ecl_vars()
  {
    return (EReference)outDatasetEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Ops()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Serv()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Ecl_vars()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(3);
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
  public EClass getPermissions()
  {
    return permissionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPermissions_Name()
  {
    return (EAttribute)permissionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPermissions_Perms()
  {
    return (EReference)permissionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPermission()
  {
    return permissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPermission_Name()
  {
    return (EAttribute)permissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPermission_Cust_levs()
  {
    return (EReference)permissionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomPermissionLevel()
  {
    return customPermissionLevelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomPermissionLevel_Vals()
  {
    return (EReference)customPermissionLevelEClass.getEStructuralFeatures().get(0);
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
  public EClass getGenerateBodyKel()
  {
    return generateBodyKelEClass;
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
  public EAttribute getVisualSection_Section_name()
  {
    return (EAttribute)visualSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisualSection_Name()
  {
    return (EAttribute)visualSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualSection_Vis_ops()
  {
    return (EReference)visualSectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualSection_Vis_elements()
  {
    return (EReference)visualSectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisName()
  {
    return visNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisName_Name()
  {
    return (EAttribute)visNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisInputValue()
  {
    return visInputValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisBasisParens()
  {
    return visBasisParensEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisBasisParens_Input()
  {
    return (EReference)visBasisParensEClass.getEStructuralFeatures().get(0);
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
  public EReference getVisualization_Type()
  {
    return (EReference)visualizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisualization_Name()
  {
    return (EAttribute)visualizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualization_Parens()
  {
    return (EReference)visualizationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualization_Vis_op()
  {
    return (EReference)visualizationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualization_Input_val()
  {
    return (EReference)visualizationEClass.getEStructuralFeatures().get(4);
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
  public EReference getVisBasis_Filter()
  {
    return (EReference)visBasisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisBasis_Quals()
  {
    return (EReference)visBasisEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisFilter()
  {
    return visFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisFilter_Vals()
  {
    return (EReference)visFilterEClass.getEStructuralFeatures().get(0);
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
  public EReference getVisBasisQualifiers_Qfuncs()
  {
    return (EReference)visBasisQualifiersEClass.getEStructuralFeatures().get(1);
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
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Vals()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Type()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQFunction()
  {
    return qFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestBasisQualifier()
  {
    return nestBasisQualifierEClass;
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
  public EReference getVisualSectionOption_Assigns()
  {
    return (EReference)visualSectionOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVizAssign()
  {
    return vizAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVizAssign_Val_l()
  {
    return (EReference)vizAssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVizAssign_Val_r()
  {
    return (EReference)vizAssignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVizAssignList()
  {
    return vizAssignListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVizAssignList_Assigns()
  {
    return (EReference)vizAssignListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVizEnumDecl()
  {
    return vizEnumDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVizEnumDecl_Name()
  {
    return (EAttribute)vizEnumDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVizEnumDecl_Assigns()
  {
    return (EReference)vizEnumDeclEClass.getEStructuralFeatures().get(1);
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
  public EReference getVisualOption_Decl()
  {
    return (EReference)visualOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualOption_Vis_cust()
  {
    return (EReference)visualOptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualOption_Visibility_op()
  {
    return (EReference)visualOptionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualOption_Assigns()
  {
    return (EReference)visualOptionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectEvent()
  {
    return selectEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectOption()
  {
    return selectOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectOption_Maps()
  {
    return (EAttribute)selectOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkOption()
  {
    return linkOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkOption_Ops()
  {
    return (EReference)linkOptionEClass.getEStructuralFeatures().get(0);
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
  public EClass getVisibilityOption()
  {
    return visibilityOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisibilityOption_Name()
  {
    return (EAttribute)visibilityOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualCustomOption()
  {
    return visualCustomOptionEClass;
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
  public EClass getResourceType()
  {
    return resourceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceType_Name()
  {
    return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(0);
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
  public EReference getResourceOption_Vals()
  {
    return (EReference)resourceOptionEClass.getEStructuralFeatures().get(0);
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
    createEReference(programEClass, PROGRAM__PERMISSIONS);
    createEReference(programEClass, PROGRAM__INPUT_SECTION);
    createEReference(programEClass, PROGRAM__CONTRACT_INSTANCES);
    createEReference(programEClass, PROGRAM__OUTPUT_SECTION);
    createEReference(programEClass, PROGRAM__INTEGRATE_SECTION);
    createEReference(programEClass, PROGRAM__VISUAL_SECTION);
    createEReference(programEClass, PROGRAM__GENERATE_SECTION);
    createEReference(programEClass, PROGRAM__CUSTOM_SECTION);
    createEReference(programEClass, PROGRAM__RESOURCE_SECTION);

    basePropEClass = createEClass(BASE_PROP);
    createEAttribute(basePropEClass, BASE_PROP__NAME);
    createEReference(basePropEClass, BASE_PROP__VAL_LIST);
    createEReference(basePropEClass, BASE_PROP__CAT_LIST);

    categoryTypeEClass = createEClass(CATEGORY_TYPE);
    createEAttribute(categoryTypeEClass, CATEGORY_TYPE__NAME);

    categoryTypeListEClass = createEClass(CATEGORY_TYPE_LIST);
    createEReference(categoryTypeListEClass, CATEGORY_TYPE_LIST__CATS);

    valueEClass = createEClass(VALUE);
    createEAttribute(valueEClass, VALUE__INT_VAL);
    createEAttribute(valueEClass, VALUE__STR_VAL);
    createEReference(valueEClass, VALUE__RES_OPS);

    valueListEClass = createEClass(VALUE_LIST);
    createEReference(valueListEClass, VALUE_LIST__VALS);

    assignEClass = createEClass(ASSIGN);
    createEReference(assignEClass, ASSIGN__VALS_L);
    createEReference(assignEClass, ASSIGN__VALS_R);

    assignListEClass = createEClass(ASSIGN_LIST);
    createEReference(assignListEClass, ASSIGN_LIST__ASSIGNS);

    compositionHeaderEClass = createEClass(COMPOSITION_HEADER);
    createEAttribute(compositionHeaderEClass, COMPOSITION_HEADER__NAME);
    createEReference(compositionHeaderEClass, COMPOSITION_HEADER__ASSIGNS);

    instanceIDEClass = createEClass(INSTANCE_ID);
    createEAttribute(instanceIDEClass, INSTANCE_ID__NAME);

    instanceOptionsEClass = createEClass(INSTANCE_OPTIONS);
    createEReference(instanceOptionsEClass, INSTANCE_OPTIONS__IN_OPS);

    instanceOptionEClass = createEClass(INSTANCE_OPTION);

    contractInstanceEClass = createEClass(CONTRACT_INSTANCE);
    createEAttribute(contractInstanceEClass, CONTRACT_INSTANCE__SEC_NAME);
    createEReference(contractInstanceEClass, CONTRACT_INSTANCE__INST_ID);
    createEReference(contractInstanceEClass, CONTRACT_INSTANCE__INSTANCE_OPS);
    createEReference(contractInstanceEClass, CONTRACT_INSTANCE__ASSIGNS);

    fieldDeclEClass = createEClass(FIELD_DECL);
    createEReference(fieldDeclEClass, FIELD_DECL__INPUT_OPS);

    kelAttrDeclEClass = createEClass(KEL_ATTR_DECL);
    createEAttribute(kelAttrDeclEClass, KEL_ATTR_DECL__NAME);
    createEReference(kelAttrDeclEClass, KEL_ATTR_DECL__INPUT_OPS);

    kelEntityDeclSimpleEClass = createEClass(KEL_ENTITY_DECL_SIMPLE);
    createEAttribute(kelEntityDeclSimpleEClass, KEL_ENTITY_DECL_SIMPLE__NAME);
    createEReference(kelEntityDeclSimpleEClass, KEL_ENTITY_DECL_SIMPLE__INPUT_OPS);

    kelEntityDeclEClass = createEClass(KEL_ENTITY_DECL);
    createEAttribute(kelEntityDeclEClass, KEL_ENTITY_DECL__NAME);
    createEReference(kelEntityDeclEClass, KEL_ENTITY_DECL__INPUT_OPS);
    createEReference(kelEntityDeclEClass, KEL_ENTITY_DECL__ATTRDECL);

    enumEntryEClass = createEClass(ENUM_ENTRY);
    createEReference(enumEntryEClass, ENUM_ENTRY__VAL_L);
    createEReference(enumEntryEClass, ENUM_ENTRY__VAL_R);

    enumListEClass = createEClass(ENUM_LIST);
    createEReference(enumListEClass, ENUM_LIST__EN_ENTS);

    enumDeclEClass = createEClass(ENUM_DECL);
    createEAttribute(enumDeclEClass, ENUM_DECL__ENUM_DEC);
    createEReference(enumDeclEClass, ENUM_DECL__ENUM_LIST);

    inputSectionEClass = createEClass(INPUT_SECTION);
    createEAttribute(inputSectionEClass, INPUT_SECTION__NAME);
    createEReference(inputSectionEClass, INPUT_SECTION__INPUTS);

    boolEClass = createEClass(BOOL);
    createEAttribute(boolEClass, BOOL__NAME);

    intVarEClass = createEClass(INT_VAR);
    createEAttribute(intVarEClass, INT_VAR__NAME);

    stringVarEClass = createEClass(STRING_VAR);
    createEAttribute(stringVarEClass, STRING_VAR__NAME);

    datasetEClass = createEClass(DATASET);
    createEAttribute(datasetEClass, DATASET__NAME);
    createEReference(datasetEClass, DATASET__INPUT_OP_LIST);
    createEReference(datasetEClass, DATASET__FIELDS);

    groupEClass = createEClass(GROUP);
    createEAttribute(groupEClass, GROUP__NAME);
    createEReference(groupEClass, GROUP__INPUT_OP_LIST);
    createEReference(groupEClass, GROUP__VALS);

    realEClass = createEClass(REAL);
    createEAttribute(realEClass, REAL__NAME);

    inputSimpleTypesEClass = createEClass(INPUT_SIMPLE_TYPES);
    createEReference(inputSimpleTypesEClass, INPUT_SIMPLE_TYPES__INPUT_OP_LIST);
    createEReference(inputSimpleTypesEClass, INPUT_SIMPLE_TYPES__IN_OPS);

    recordEClass = createEClass(RECORD);
    createEAttribute(recordEClass, RECORD__NAME);
    createEReference(recordEClass, RECORD__INPUT_OP_LIST);

    kelBaseEClass = createEClass(KEL_BASE);
    createEAttribute(kelBaseEClass, KEL_BASE__NAME);
    createEReference(kelBaseEClass, KEL_BASE__INPUT_OP_LIST);
    createEReference(kelBaseEClass, KEL_BASE__KEL_OPS);

    datatypeEClass = createEClass(DATATYPE);

    inputValueEClass = createEClass(INPUT_VALUE);

    inputOptionsEClass = createEClass(INPUT_OPTIONS);
    createEReference(inputOptionsEClass, INPUT_OPTIONS__INPUT_OPS);

    inputOptionEClass = createEClass(INPUT_OPTION);
    createEAttribute(inputOptionEClass, INPUT_OPTION__ATR);
    createEAttribute(inputOptionEClass, INPUT_OPTION__FORM);
    createEAttribute(inputOptionEClass, INPUT_OPTION__FORM_OP);
    createEAttribute(inputOptionEClass, INPUT_OPTION__ENAB);
    createEReference(inputOptionEClass, INPUT_OPTION__ASSIGNS_LIST);
    createEAttribute(inputOptionEClass, INPUT_OPTION__TYPE);
    createEReference(inputOptionEClass, INPUT_OPTION__TYPE_OP);
    createEReference(inputOptionEClass, INPUT_OPTION__VALS);

    inputtypeOptionsEClass = createEClass(INPUTTYPE_OPTIONS);
    createEAttribute(inputtypeOptionsEClass, INPUTTYPE_OPTIONS__IN_TYPE_OP);

    integrateSectionEClass = createEClass(INTEGRATE_SECTION);
    createEAttribute(integrateSectionEClass, INTEGRATE_SECTION__NAME);
    createEReference(integrateSectionEClass, INTEGRATE_SECTION__OUTPUTS);

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

    eclBooleanEClass = createEClass(ECL_BOOLEAN);

    eclNumTypeEClass = createEClass(ECL_NUM_TYPE);

    eclDecTypeEClass = createEClass(ECL_DEC_TYPE);

    ecLfieldTypeEClass = createEClass(EC_LFIELD_TYPE);
    createEReference(ecLfieldTypeEClass, EC_LFIELD_TYPE__OPTIONS);
    createEReference(ecLfieldTypeEClass, EC_LFIELD_TYPE__IN_OPS);

    eclOutputDeclEClass = createEClass(ECL_OUTPUT_DECL);

    serviceInputValueEClass = createEClass(SERVICE_INPUT_VALUE);

    serviceInputSectionEClass = createEClass(SERVICE_INPUT_SECTION);
    createEReference(serviceInputSectionEClass, SERVICE_INPUT_SECTION__SERVS);

    nestedDatasetDeclEClass = createEClass(NESTED_DATASET_DECL);

    outputOptionEClass = createEClass(OUTPUT_OPTION);
    createEAttribute(outputOptionEClass, OUTPUT_OPTION__TYPE);
    createEAttribute(outputOptionEClass, OUTPUT_OPTION__ATR);
    createEAttribute(outputOptionEClass, OUTPUT_OPTION__NAME);
    createEReference(outputOptionEClass, OUTPUT_OPTION__ASSIGNS);
    createEReference(outputOptionEClass, OUTPUT_OPTION__VALS);

    outputOptionsEClass = createEClass(OUTPUT_OPTIONS);
    createEReference(outputOptionsEClass, OUTPUT_OPTIONS__OUTPUT_OPS);

    outTypeSimpleEClass = createEClass(OUT_TYPE_SIMPLE);
    createEAttribute(outTypeSimpleEClass, OUT_TYPE_SIMPLE__TYPE);
    createEReference(outTypeSimpleEClass, OUT_TYPE_SIMPLE__VALS);

    outDatasetEClass = createEClass(OUT_DATASET);
    createEReference(outDatasetEClass, OUT_DATASET__OPTIONS);
    createEReference(outDatasetEClass, OUT_DATASET__DECL);
    createEAttribute(outDatasetEClass, OUT_DATASET__NAME);
    createEReference(outDatasetEClass, OUT_DATASET__OUT_BASE);
    createEReference(outDatasetEClass, OUT_DATASET__OPS);
    createEReference(outDatasetEClass, OUT_DATASET__ECL_VARS);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__NAME);
    createEReference(serviceEClass, SERVICE__OPS);
    createEReference(serviceEClass, SERVICE__SERV);
    createEReference(serviceEClass, SERVICE__ECL_VARS);

    outputValueEClass = createEClass(OUTPUT_VALUE);

    outputBaseEClass = createEClass(OUTPUT_BASE);
    createEReference(outputBaseEClass, OUTPUT_BASE__BASE);

    permissionsEClass = createEClass(PERMISSIONS);
    createEAttribute(permissionsEClass, PERMISSIONS__NAME);
    createEReference(permissionsEClass, PERMISSIONS__PERMS);

    permissionEClass = createEClass(PERMISSION);
    createEAttribute(permissionEClass, PERMISSION__NAME);
    createEReference(permissionEClass, PERMISSION__CUST_LEVS);

    customPermissionLevelEClass = createEClass(CUSTOM_PERMISSION_LEVEL);
    createEReference(customPermissionLevelEClass, CUSTOM_PERMISSION_LEVEL__VALS);

    generateSectionEClass = createEClass(GENERATE_SECTION);
    createEAttribute(generateSectionEClass, GENERATE_SECTION__NAME);

    generateBodyInlineEClass = createEClass(GENERATE_BODY_INLINE);

    generateBodySaltEClass = createEClass(GENERATE_BODY_SALT);

    generateBodyKelEClass = createEClass(GENERATE_BODY_KEL);

    visualSectionEClass = createEClass(VISUAL_SECTION);
    createEAttribute(visualSectionEClass, VISUAL_SECTION__SECTION_NAME);
    createEAttribute(visualSectionEClass, VISUAL_SECTION__NAME);
    createEReference(visualSectionEClass, VISUAL_SECTION__VIS_OPS);
    createEReference(visualSectionEClass, VISUAL_SECTION__VIS_ELEMENTS);

    visNameEClass = createEClass(VIS_NAME);
    createEAttribute(visNameEClass, VIS_NAME__NAME);

    visInputValueEClass = createEClass(VIS_INPUT_VALUE);

    visBasisParensEClass = createEClass(VIS_BASIS_PARENS);
    createEReference(visBasisParensEClass, VIS_BASIS_PARENS__INPUT);

    visualizationEClass = createEClass(VISUALIZATION);
    createEReference(visualizationEClass, VISUALIZATION__TYPE);
    createEAttribute(visualizationEClass, VISUALIZATION__NAME);
    createEReference(visualizationEClass, VISUALIZATION__PARENS);
    createEReference(visualizationEClass, VISUALIZATION__VIS_OP);
    createEReference(visualizationEClass, VISUALIZATION__INPUT_VAL);

    visBasisEClass = createEClass(VIS_BASIS);
    createEReference(visBasisEClass, VIS_BASIS__BASIS);
    createEReference(visBasisEClass, VIS_BASIS__FILTER);
    createEReference(visBasisEClass, VIS_BASIS__QUALS);

    visFilterEClass = createEClass(VIS_FILTER);
    createEReference(visFilterEClass, VIS_FILTER__VALS);

    visBasisQualifiersEClass = createEClass(VIS_BASIS_QUALIFIERS);
    createEReference(visBasisQualifiersEClass, VIS_BASIS_QUALIFIERS__FUNCS);
    createEReference(visBasisQualifiersEClass, VIS_BASIS_QUALIFIERS__QFUNCS);

    posVizDataEClass = createEClass(POS_VIZ_DATA);
    createEAttribute(posVizDataEClass, POS_VIZ_DATA__NAME);

    functionEClass = createEClass(FUNCTION);
    createEReference(functionEClass, FUNCTION__VALS);
    createEAttribute(functionEClass, FUNCTION__TYPE);

    qFunctionEClass = createEClass(QFUNCTION);

    nestBasisQualifierEClass = createEClass(NEST_BASIS_QUALIFIER);

    visualSectionOptionsEClass = createEClass(VISUAL_SECTION_OPTIONS);
    createEReference(visualSectionOptionsEClass, VISUAL_SECTION_OPTIONS__VIS_OPS);

    visualSectionOptionEClass = createEClass(VISUAL_SECTION_OPTION);
    createEAttribute(visualSectionOptionEClass, VISUAL_SECTION_OPTION__NAME);
    createEReference(visualSectionOptionEClass, VISUAL_SECTION_OPTION__VALS);
    createEReference(visualSectionOptionEClass, VISUAL_SECTION_OPTION__ASSIGNS);

    vizAssignEClass = createEClass(VIZ_ASSIGN);
    createEReference(vizAssignEClass, VIZ_ASSIGN__VAL_L);
    createEReference(vizAssignEClass, VIZ_ASSIGN__VAL_R);

    vizAssignListEClass = createEClass(VIZ_ASSIGN_LIST);
    createEReference(vizAssignListEClass, VIZ_ASSIGN_LIST__ASSIGNS);

    vizEnumDeclEClass = createEClass(VIZ_ENUM_DECL);
    createEAttribute(vizEnumDeclEClass, VIZ_ENUM_DECL__NAME);
    createEReference(vizEnumDeclEClass, VIZ_ENUM_DECL__ASSIGNS);

    visualOptionsEClass = createEClass(VISUAL_OPTIONS);
    createEReference(visualOptionsEClass, VISUAL_OPTIONS__VIS_OPS);

    visualOptionEClass = createEClass(VISUAL_OPTION);
    createEAttribute(visualOptionEClass, VISUAL_OPTION__NAME);
    createEReference(visualOptionEClass, VISUAL_OPTION__FUNCS);
    createEReference(visualOptionEClass, VISUAL_OPTION__DECL);
    createEReference(visualOptionEClass, VISUAL_OPTION__VIS_CUST);
    createEReference(visualOptionEClass, VISUAL_OPTION__VISIBILITY_OP);
    createEReference(visualOptionEClass, VISUAL_OPTION__ASSIGNS);

    selectEventEClass = createEClass(SELECT_EVENT);

    selectOptionEClass = createEClass(SELECT_OPTION);
    createEAttribute(selectOptionEClass, SELECT_OPTION__MAPS);

    linkOptionEClass = createEClass(LINK_OPTION);
    createEReference(linkOptionEClass, LINK_OPTION__OPS);

    visualMultivalEClass = createEClass(VISUAL_MULTIVAL);

    visibilityOptionEClass = createEClass(VISIBILITY_OPTION);
    createEAttribute(visibilityOptionEClass, VISIBILITY_OPTION__NAME);

    visualCustomOptionEClass = createEClass(VISUAL_CUSTOM_OPTION);

    customSectionEClass = createEClass(CUSTOM_SECTION);
    createEAttribute(customSectionEClass, CUSTOM_SECTION__NAME);
    createEReference(customSectionEClass, CUSTOM_SECTION__CUST_VALS);

    customValueEClass = createEClass(CUSTOM_VALUE);

    resourceTypeEClass = createEClass(RESOURCE_TYPE);
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__NAME);

    resourceOptionEClass = createEClass(RESOURCE_OPTION);
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
    valueEClass.getESuperTypes().add(this.getSelectEvent());
    valueEClass.getESuperTypes().add(this.getCustomValue());
    valueEClass.getESuperTypes().add(this.getResourceValue());
    valueListEClass.getESuperTypes().add(this.getInstanceOption());
    fieldDeclEClass.getESuperTypes().add(this.getPosVizData());
    enumDeclEClass.getESuperTypes().add(this.getInputSimpleTypes());
    boolEClass.getESuperTypes().add(this.getInputSimpleTypes());
    boolEClass.getESuperTypes().add(this.getOutfieldDecl());
    intVarEClass.getESuperTypes().add(this.getInputSimpleTypes());
    intVarEClass.getESuperTypes().add(this.getOutfieldDecl());
    stringVarEClass.getESuperTypes().add(this.getInputSimpleTypes());
    stringVarEClass.getESuperTypes().add(this.getOutfieldDecl());
    datasetEClass.getESuperTypes().add(this.getDatatype());
    datasetEClass.getESuperTypes().add(this.getInputValue());
    groupEClass.getESuperTypes().add(this.getDatatype());
    groupEClass.getESuperTypes().add(this.getInputValue());
    realEClass.getESuperTypes().add(this.getInputSimpleTypes());
    inputSimpleTypesEClass.getESuperTypes().add(this.getDatatype());
    inputSimpleTypesEClass.getESuperTypes().add(this.getInputValue());
    inputSimpleTypesEClass.getESuperTypes().add(this.getVisInputValue());
    recordEClass.getESuperTypes().add(this.getDatatype());
    recordEClass.getESuperTypes().add(this.getInputValue());
    kelBaseEClass.getESuperTypes().add(this.getDatatype());
    kelBaseEClass.getESuperTypes().add(this.getInputValue());
    eclIntegerEClass.getESuperTypes().add(this.getECLfieldType());
    eclUnsignedEClass.getESuperTypes().add(this.getECLfieldType());
    eclStringEClass.getESuperTypes().add(this.getECLfieldType());
    eclQstringEClass.getESuperTypes().add(this.getECLfieldType());
    eclVarstringEClass.getESuperTypes().add(this.getECLfieldType());
    eclUnicodeEClass.getESuperTypes().add(this.getECLfieldType());
    eclVarunicodeEClass.getESuperTypes().add(this.getECLfieldType());
    eclDataEClass.getESuperTypes().add(this.getECLfieldType());
    eclRealEClass.getESuperTypes().add(this.getECLfieldType());
    eclBooleanEClass.getESuperTypes().add(this.getECLfieldType());
    eclNumTypeEClass.getESuperTypes().add(this.getECLfieldType());
    eclDecTypeEClass.getESuperTypes().add(this.getECLfieldType());
    ecLfieldTypeEClass.getESuperTypes().add(this.getECLOutputDecl());
    ecLfieldTypeEClass.getESuperTypes().add(this.getServiceInputValue());
    ecLfieldTypeEClass.getESuperTypes().add(this.getPosVizData());
    nestedDatasetDeclEClass.getESuperTypes().add(this.getECLOutputDecl());
    nestedDatasetDeclEClass.getESuperTypes().add(this.getServiceInputValue());
    outTypeSimpleEClass.getESuperTypes().add(this.getOutputValue());
    outDatasetEClass.getESuperTypes().add(this.getNestedDatasetDecl());
    outDatasetEClass.getESuperTypes().add(this.getOutputValue());
    serviceEClass.getESuperTypes().add(this.getOutputValue());
    generateBodyInlineEClass.getESuperTypes().add(this.getGenerateSection());
    generateBodySaltEClass.getESuperTypes().add(this.getGenerateSection());
    generateBodyKelEClass.getESuperTypes().add(this.getGenerateSection());
    visBasisQualifiersEClass.getESuperTypes().add(this.getNestBasisQualifier());
    functionEClass.getESuperTypes().add(this.getQFunction());
    nestBasisQualifierEClass.getESuperTypes().add(this.getQFunction());
    selectEventEClass.getESuperTypes().add(this.getSelectOption());
    selectOptionEClass.getESuperTypes().add(this.getVisualOption());
    linkOptionEClass.getESuperTypes().add(this.getVisualOption());
    visualMultivalEClass.getESuperTypes().add(this.getVisualOption());
    visualCustomOptionEClass.getESuperTypes().add(this.getVisualOption());
    visualCustomOptionEClass.getESuperTypes().add(this.getResourceOption());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Composition_header(), this.getCompositionHeader(), null, "composition_header", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Base_props(), this.getBaseProp(), null, "base_props", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Permissions(), this.getPermissions(), null, "permissions", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Input_section(), this.getInputSection(), null, "input_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Contract_instances(), this.getContractInstance(), null, "contract_instances", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Output_section(), this.getOutputSection(), null, "output_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Integrate_section(), this.getIntegrateSection(), null, "integrate_section", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Visual_section(), this.getVisualSection(), null, "visual_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Generate_section(), this.getGenerateSection(), null, "generate_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Custom_section(), this.getCustomSection(), null, "custom_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Resource_section(), this.getResourceSection(), null, "resource_section", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basePropEClass, BaseProp.class, "BaseProp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBaseProp_Name(), ecorePackage.getEString(), "name", null, 0, 1, BaseProp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseProp_Val_list(), this.getValueList(), null, "val_list", null, 0, 1, BaseProp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseProp_Cat_list(), this.getCategoryTypeList(), null, "cat_list", null, 0, 1, BaseProp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryTypeEClass, CategoryType.class, "CategoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCategoryType_Name(), ecorePackage.getEString(), "name", null, 0, 1, CategoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryTypeListEClass, CategoryTypeList.class, "CategoryTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCategoryTypeList_Cats(), this.getCategoryType(), null, "cats", null, 0, -1, CategoryTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValue_Int_val(), ecorePackage.getEInt(), "int_val", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValue_Str_val(), ecorePackage.getEString(), "str_val", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValue_Res_ops(), this.getResourceOptions(), null, "res_ops", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueListEClass, ValueList.class, "ValueList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueList_Vals(), this.getValue(), null, "vals", null, 0, -1, ValueList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignEClass, Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssign_Vals_l(), this.getValue(), null, "vals_l", null, 0, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssign_Vals_r(), this.getValueList(), null, "vals_r", null, 0, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignListEClass, AssignList.class, "AssignList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignList_Assigns(), this.getAssign(), null, "assigns", null, 0, -1, AssignList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositionHeaderEClass, CompositionHeader.class, "CompositionHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompositionHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, CompositionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositionHeader_Assigns(), this.getAssign(), null, "assigns", null, 0, -1, CompositionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceIDEClass, InstanceID.class, "InstanceID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstanceID_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstanceID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceOptionsEClass, InstanceOptions.class, "InstanceOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceOptions_In_ops(), this.getInstanceOption(), null, "in_ops", null, 0, -1, InstanceOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceOptionEClass, InstanceOption.class, "InstanceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(contractInstanceEClass, ContractInstance.class, "ContractInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContractInstance_Sec_name(), ecorePackage.getEString(), "sec_name", null, 0, 1, ContractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractInstance_InstId(), this.getInstanceID(), null, "instId", null, 0, 1, ContractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractInstance_Instance_ops(), this.getInstanceOptions(), null, "instance_ops", null, 0, 1, ContractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractInstance_Assigns(), this.getAssign(), null, "assigns", null, 0, -1, ContractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldDeclEClass, FieldDecl.class, "FieldDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldDecl_Input_ops(), this.getInputOptions(), null, "input_ops", null, 0, 1, FieldDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kelAttrDeclEClass, KelAttrDecl.class, "KelAttrDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKelAttrDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, KelAttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKelAttrDecl_Input_ops(), this.getInputOptions(), null, "input_ops", null, 0, 1, KelAttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kelEntityDeclSimpleEClass, KelEntityDeclSimple.class, "KelEntityDeclSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKelEntityDeclSimple_Name(), ecorePackage.getEString(), "name", null, 0, 1, KelEntityDeclSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKelEntityDeclSimple_Input_ops(), this.getInputOptions(), null, "input_ops", null, 0, 1, KelEntityDeclSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kelEntityDeclEClass, KelEntityDecl.class, "KelEntityDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKelEntityDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, KelEntityDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKelEntityDecl_Input_ops(), this.getInputOptions(), null, "input_ops", null, 0, 1, KelEntityDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKelEntityDecl_Attrdecl(), this.getKelAttrDecl(), null, "attrdecl", null, 0, 1, KelEntityDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEntryEClass, EnumEntry.class, "EnumEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumEntry_Val_l(), this.getValue(), null, "val_l", null, 0, 1, EnumEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumEntry_Val_r(), this.getValue(), null, "val_r", null, 0, 1, EnumEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumListEClass, EnumList.class, "EnumList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumList_En_ents(), this.getEnumEntry(), null, "en_ents", null, 0, -1, EnumList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumDeclEClass, EnumDecl.class, "EnumDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumDecl_Enum_dec(), ecorePackage.getEString(), "enum_dec", null, 0, 1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumDecl_Enum_list(), this.getEnumList(), null, "enum_list", null, 0, 1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputSectionEClass, InputSection.class, "InputSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputSection_Inputs(), this.getInputValue(), null, "inputs", null, 0, -1, InputSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBool_Name(), ecorePackage.getEString(), "name", null, 0, 1, Bool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intVarEClass, IntVar.class, "IntVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringVarEClass, StringVar.class, "StringVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, StringVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataset_Input_op_list(), this.getInputOptions(), null, "input_op_list", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataset_Fields(), this.getFieldDecl(), null, "fields", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroup_Input_op_list(), this.getInputOptions(), null, "input_op_list", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroup_Vals(), this.getInputValue(), null, "vals", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realEClass, Real.class, "Real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Real.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputSimpleTypesEClass, InputSimpleTypes.class, "InputSimpleTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputSimpleTypes_Input_op_list(), this.getInputOptions(), null, "input_op_list", null, 0, 1, InputSimpleTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputSimpleTypes_In_ops(), this.getInputOptions(), null, "in_ops", null, 0, 1, InputSimpleTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecord_Name(), ecorePackage.getEString(), "name", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecord_Input_op_list(), this.getInputOptions(), null, "input_op_list", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kelBaseEClass, KelBase.class, "KelBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKelBase_Name(), ecorePackage.getEString(), "name", null, 0, 1, KelBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKelBase_Input_op_list(), this.getInputOptions(), null, "input_op_list", null, 0, 1, KelBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKelBase_Kel_ops(), ecorePackage.getEObject(), null, "kel_ops", null, 0, -1, KelBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputOptionsEClass, InputOptions.class, "InputOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputOptions_Input_ops(), this.getInputOption(), null, "input_ops", null, 0, -1, InputOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputOptionEClass, InputOption.class, "InputOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputOption_Atr(), ecorePackage.getEString(), "atr", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInputOption_Form(), ecorePackage.getEString(), "form", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInputOption_Form_op(), ecorePackage.getEString(), "form_op", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInputOption_Enab(), ecorePackage.getEString(), "enab", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputOption_Assigns_list(), this.getAssignList(), null, "assigns_list", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInputOption_Type(), ecorePackage.getEString(), "type", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputOption_Type_op(), this.getInputtypeOptions(), null, "type_op", null, 0, 1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputOption_Vals(), this.getValueList(), null, "vals", null, 0, -1, InputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputtypeOptionsEClass, InputtypeOptions.class, "InputtypeOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputtypeOptions_In_type_op(), ecorePackage.getEString(), "in_type_op", null, 0, -1, InputtypeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integrateSectionEClass, IntegrateSection.class, "IntegrateSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegrateSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntegrateSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegrateSection_Outputs(), this.getOutputValue(), null, "outputs", null, 0, -1, IntegrateSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(eclBooleanEClass, ECLBoolean.class, "ECLBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclNumTypeEClass, ECLNumType.class, "ECLNumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclDecTypeEClass, ECLDecType.class, "ECLDecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecLfieldTypeEClass, ECLfieldType.class, "ECLfieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getECLfieldType_Options(), this.getOutputOptions(), null, "options", null, 0, 1, ECLfieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getECLfieldType_In_ops(), this.getInputOptions(), null, "in_ops", null, 0, 1, ECLfieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eclOutputDeclEClass, ECLOutputDecl.class, "ECLOutputDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serviceInputValueEClass, ServiceInputValue.class, "ServiceInputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serviceInputSectionEClass, ServiceInputSection.class, "ServiceInputSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceInputSection_Servs(), this.getServiceInputValue(), null, "servs", null, 0, -1, ServiceInputSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nestedDatasetDeclEClass, NestedDatasetDecl.class, "NestedDatasetDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputOptionEClass, OutputOption.class, "OutputOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutputOption_Type(), ecorePackage.getEString(), "type", null, 0, 1, OutputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputOption_Atr(), ecorePackage.getEString(), "atr", null, 0, 1, OutputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputOption_Assigns(), this.getAssignList(), null, "assigns", null, 0, 1, OutputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputOption_Vals(), ecorePackage.getEObject(), null, "vals", null, 0, 1, OutputOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputOptionsEClass, OutputOptions.class, "OutputOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputOptions_Output_ops(), this.getOutputOption(), null, "output_ops", null, 0, -1, OutputOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outTypeSimpleEClass, OutTypeSimple.class, "OutTypeSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutTypeSimple_Type(), ecorePackage.getEString(), "type", null, 0, 1, OutTypeSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutTypeSimple_Vals(), this.getValue(), null, "vals", null, 0, 1, OutTypeSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outDatasetEClass, OutDataset.class, "OutDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutDataset_Options(), this.getOutputOptions(), null, "options", null, 0, 1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutDataset_Decl(), this.getECLOutputDecl(), null, "decl", null, 0, -1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutDataset_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutDataset_Out_base(), this.getOutputBase(), null, "out_base", null, 0, 1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutDataset_Ops(), this.getOutputOptions(), null, "ops", null, 0, 1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutDataset_Ecl_vars(), this.getECLOutputDecl(), null, "ecl_vars", null, 0, -1, OutDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Ops(), this.getOutputOptions(), null, "ops", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Serv(), this.getServiceInputSection(), null, "serv", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Ecl_vars(), this.getECLOutputDecl(), null, "ecl_vars", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputValueEClass, OutputValue.class, "OutputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputBaseEClass, OutputBase.class, "OutputBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputBase_Base(), this.getDatatype(), null, "base", null, 0, 1, OutputBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(permissionsEClass, Permissions.class, "Permissions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPermissions_Name(), ecorePackage.getEString(), "name", null, 0, 1, Permissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPermissions_Perms(), this.getPermission(), null, "perms", null, 0, -1, Permissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPermission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPermission_Cust_levs(), this.getCustomPermissionLevel(), null, "cust_levs", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customPermissionLevelEClass, CustomPermissionLevel.class, "CustomPermissionLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomPermissionLevel_Vals(), this.getValue(), null, "vals", null, 0, -1, CustomPermissionLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generateSectionEClass, GenerateSection.class, "GenerateSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenerateSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenerateSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generateBodyInlineEClass, GenerateBodyInline.class, "GenerateBodyInline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(generateBodySaltEClass, GenerateBodySalt.class, "GenerateBodySalt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(generateBodyKelEClass, GenerateBodyKel.class, "GenerateBodyKel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visualSectionEClass, VisualSection.class, "VisualSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisualSection_Section_name(), ecorePackage.getEString(), "section_name", null, 0, 1, VisualSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVisualSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, VisualSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualSection_Vis_ops(), this.getVisualSectionOptions(), null, "vis_ops", null, 0, 1, VisualSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualSection_Vis_elements(), this.getVisualization(), null, "vis_elements", null, 0, -1, VisualSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visNameEClass, VisName.class, "VisName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisName_Name(), ecorePackage.getEString(), "name", null, 0, 1, VisName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visInputValueEClass, VisInputValue.class, "VisInputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visBasisParensEClass, VisBasisParens.class, "VisBasisParens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisBasisParens_Input(), this.getVisBasis(), null, "input", null, 0, 1, VisBasisParens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualizationEClass, Visualization.class, "Visualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisualization_Type(), this.getVisName(), null, "type", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVisualization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualization_Parens(), this.getVisBasisParens(), null, "parens", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualization_Vis_op(), this.getVisualOptions(), null, "vis_op", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualization_Input_val(), this.getVisInputValue(), null, "input_val", null, 0, -1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visBasisEClass, VisBasis.class, "VisBasis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisBasis_Basis(), this.getOutDataset(), null, "basis", null, 0, 1, VisBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisBasis_Filter(), this.getVisFilter(), null, "filter", null, 0, 1, VisBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisBasis_Quals(), this.getVisBasisQualifiers(), null, "quals", null, 0, 1, VisBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visFilterEClass, VisFilter.class, "VisFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisFilter_Vals(), this.getValue(), null, "vals", null, 0, -1, VisFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visBasisQualifiersEClass, VisBasisQualifiers.class, "VisBasisQualifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisBasisQualifiers_Funcs(), this.getFunction(), null, "funcs", null, 0, 1, VisBasisQualifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisBasisQualifiers_Qfuncs(), this.getQFunction(), null, "qfuncs", null, 0, -1, VisBasisQualifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(posVizDataEClass, PosVizData.class, "PosVizData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPosVizData_Name(), ecorePackage.getEString(), "name", null, 0, 1, PosVizData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_Vals(), this.getValue(), null, "vals", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_Type(), ecorePackage.getEInt(), "type", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qFunctionEClass, QFunction.class, "QFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nestBasisQualifierEClass, NestBasisQualifier.class, "NestBasisQualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visualSectionOptionsEClass, VisualSectionOptions.class, "VisualSectionOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisualSectionOptions_Vis_ops(), this.getVisualSectionOption(), null, "vis_ops", null, 0, -1, VisualSectionOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualSectionOptionEClass, VisualSectionOption.class, "VisualSectionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisualSectionOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, VisualSectionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualSectionOption_Vals(), this.getValue(), null, "vals", null, 0, 1, VisualSectionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualSectionOption_Assigns(), this.getAssignList(), null, "assigns", null, 0, 1, VisualSectionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vizAssignEClass, VizAssign.class, "VizAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVizAssign_Val_l(), this.getValue(), null, "val_l", null, 0, 1, VizAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVizAssign_Val_r(), this.getValueList(), null, "val_r", null, 0, 1, VizAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vizAssignListEClass, VizAssignList.class, "VizAssignList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVizAssignList_Assigns(), this.getVizAssign(), null, "assigns", null, 0, -1, VizAssignList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vizEnumDeclEClass, VizEnumDecl.class, "VizEnumDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVizEnumDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, VizEnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVizEnumDecl_Assigns(), this.getVizAssignList(), null, "assigns", null, 0, 1, VizEnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualOptionsEClass, VisualOptions.class, "VisualOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisualOptions_Vis_ops(), this.getVisualOption(), null, "vis_ops", null, 0, -1, VisualOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualOptionEClass, VisualOption.class, "VisualOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisualOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualOption_Funcs(), this.getFunction(), null, "funcs", null, 0, -1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualOption_Decl(), this.getVizEnumDecl(), null, "decl", null, 0, 1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualOption_Vis_cust(), this.getVisualCustomOption(), null, "vis_cust", null, 0, 1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualOption_Visibility_op(), this.getVisibilityOption(), null, "visibility_op", null, 0, 1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVisualOption_Assigns(), this.getAssignList(), null, "assigns", null, 0, -1, VisualOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectEventEClass, SelectEvent.class, "SelectEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectOptionEClass, SelectOption.class, "SelectOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectOption_Maps(), ecorePackage.getEString(), "maps", null, 0, -1, SelectOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkOptionEClass, LinkOption.class, "LinkOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinkOption_Ops(), this.getVisualOption(), null, "ops", null, 0, -1, LinkOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualMultivalEClass, VisualMultival.class, "VisualMultival", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visibilityOptionEClass, VisibilityOption.class, "VisibilityOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisibilityOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, VisibilityOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualCustomOptionEClass, VisualCustomOption.class, "VisualCustomOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(customSectionEClass, CustomSection.class, "CustomSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomSection_Cust_vals(), this.getCustomValue(), null, "cust_vals", null, 0, -1, CustomSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customValueEClass, CustomValue.class, "CustomValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceOptionEClass, ResourceOption.class, "ResourceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
