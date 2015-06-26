/**
 */
package org.xtext.hipie.hIPIE.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.hipie.hIPIE.HIPIEFactory;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.assign;
import org.xtext.hipie.hIPIE.assign_list;
import org.xtext.hipie.hIPIE.base_prop;
import org.xtext.hipie.hIPIE.bool;
import org.xtext.hipie.hIPIE.category_type_list;
import org.xtext.hipie.hIPIE.composition_header;
import org.xtext.hipie.hIPIE.contract_instance;
import org.xtext.hipie.hIPIE.custom_section;
import org.xtext.hipie.hIPIE.custom_value;
import org.xtext.hipie.hIPIE.dataset;
import org.xtext.hipie.hIPIE.datatype;
import org.xtext.hipie.hIPIE.ecl_data;
import org.xtext.hipie.hIPIE.ecl_integer;
import org.xtext.hipie.hIPIE.ecl_qstring;
import org.xtext.hipie.hIPIE.ecl_real;
import org.xtext.hipie.hIPIE.ecl_string;
import org.xtext.hipie.hIPIE.ecl_unicode;
import org.xtext.hipie.hIPIE.ecl_unsigned;
import org.xtext.hipie.hIPIE.ecl_varstring;
import org.xtext.hipie.hIPIE.ecl_varunicode;
import org.xtext.hipie.hIPIE.eclfield_type;
import org.xtext.hipie.hIPIE.ecloutput_decl;
import org.xtext.hipie.hIPIE.enum_decl;
import org.xtext.hipie.hIPIE.field_decl;
import org.xtext.hipie.hIPIE.function;
import org.xtext.hipie.hIPIE.generate_body_inline;
import org.xtext.hipie.hIPIE.generate_body_salt;
import org.xtext.hipie.hIPIE.generate_section;
import org.xtext.hipie.hIPIE.group;
import org.xtext.hipie.hIPIE.input_option;
import org.xtext.hipie.hIPIE.input_options;
import org.xtext.hipie.hIPIE.input_section;
import org.xtext.hipie.hIPIE.input_value;
import org.xtext.hipie.hIPIE.int_var;
import org.xtext.hipie.hIPIE.out_type;
import org.xtext.hipie.hIPIE.outfield_decl;
import org.xtext.hipie.hIPIE.output_option;
import org.xtext.hipie.hIPIE.output_options;
import org.xtext.hipie.hIPIE.output_section;
import org.xtext.hipie.hIPIE.output_value;
import org.xtext.hipie.hIPIE.outputbase;
import org.xtext.hipie.hIPIE.program;
import org.xtext.hipie.hIPIE.record;
import org.xtext.hipie.hIPIE.resource_option;
import org.xtext.hipie.hIPIE.resource_options;
import org.xtext.hipie.hIPIE.resource_section;
import org.xtext.hipie.hIPIE.resource_value;
import org.xtext.hipie.hIPIE.string_var;
import org.xtext.hipie.hIPIE.value;
import org.xtext.hipie.hIPIE.value_list;
import org.xtext.hipie.hIPIE.vis_basis;
import org.xtext.hipie.hIPIE.vis_basis_qualifiers;
import org.xtext.hipie.hIPIE.visual_multival;
import org.xtext.hipie.hIPIE.visual_option;
import org.xtext.hipie.hIPIE.visual_options;
import org.xtext.hipie.hIPIE.visual_section;
import org.xtext.hipie.hIPIE.visual_section_option;
import org.xtext.hipie.hIPIE.visual_section_options;
import org.xtext.hipie.hIPIE.visualization;

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
  private EClass base_propEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass category_type_listEClass = null;

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
  private EClass value_listEClass = null;

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
  private EClass assign_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass composition_headerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contract_instanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass field_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass input_sectionEClass = null;

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
  private EClass int_varEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass string_varEClass = null;

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
  private EClass input_valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass input_optionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass input_optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass output_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outfield_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_integerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_unsignedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_stringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_qstringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_varstringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_unicodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_varunicodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_dataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecl_realEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclfield_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecloutput_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass output_optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass output_optionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass out_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass output_valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputbaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generate_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generate_body_inlineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generate_body_saltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visual_sectionEClass = null;

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
  private EClass vis_basisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vis_basis_qualifiersEClass = null;

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
  private EClass visual_section_optionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visual_section_optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visual_optionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visual_optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visual_multivalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass custom_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass custom_valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resource_optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resource_optionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resource_valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resource_sectionEClass = null;

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
  public EClass getprogram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Composition_Header()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Base_Props()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Contract_Instances()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Input_Section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Output_Section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Visual_Section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Generate_Section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Custom_Section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Resource_Section()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbase_prop()
  {
    return base_propEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbase_prop_Name()
  {
    return (EAttribute)base_propEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbase_prop_Vals()
  {
    return (EReference)base_propEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbase_prop_Cats()
  {
    return (EReference)base_propEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcategory_type_list()
  {
    return category_type_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcategory_type_list_Name()
  {
    return (EAttribute)category_type_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvalue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvalue_Type()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalue_Vals()
  {
    return (EReference)valueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalue_Res_ops()
  {
    return (EReference)valueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvalue_list()
  {
    return value_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getassign()
  {
    return assignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassign_Assign_internal()
  {
    return (EReference)assignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getassign_list()
  {
    return assign_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcomposition_header()
  {
    return composition_headerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomposition_header_Name()
  {
    return (EAttribute)composition_headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcomposition_header_Assigns()
  {
    return (EReference)composition_headerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcontract_instance()
  {
    return contract_instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcontract_instance_Name()
  {
    return (EAttribute)contract_instanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcontract_instance_Vals()
  {
    return (EReference)contract_instanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcontract_instance_Vars()
  {
    return (EReference)contract_instanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcontract_instance_Assigns()
  {
    return (EReference)contract_instanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfield_decl()
  {
    return field_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfield_decl_Name()
  {
    return (EAttribute)field_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_decl_Input_internal()
  {
    return (EReference)field_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenum_decl()
  {
    return enum_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getenum_decl_Vals()
  {
    return (EReference)enum_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getenum_decl_Assigns()
  {
    return (EReference)enum_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getenum_decl_Input_ops()
  {
    return (EReference)enum_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinput_section()
  {
    return input_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinput_section_Name()
  {
    return (EAttribute)input_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinput_section_Inputs()
  {
    return (EReference)input_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbool()
  {
    return boolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbool_Input_ops()
  {
    return (EReference)boolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getint_var()
  {
    return int_varEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getint_var_Input_ops()
  {
    return (EReference)int_varEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstring_var()
  {
    return string_varEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstring_var_Input_ops()
  {
    return (EReference)string_varEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrecord()
  {
    return recordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrecord_Input_ops()
  {
    return (EReference)recordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdataset()
  {
    return datasetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdataset_Input_ops()
  {
    return (EReference)datasetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdataset_Fields()
  {
    return (EReference)datasetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdataset_Out_base()
  {
    return (EReference)datasetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdataset_Ecl_vars()
  {
    return (EReference)datasetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdataset_Op_base()
  {
    return (EReference)datasetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgroup_Input_internal()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgroup_Values()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdatatype()
  {
    return datatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinput_value()
  {
    return input_valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinput_value_Name()
  {
    return (EAttribute)input_valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinput_options()
  {
    return input_optionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinput_option()
  {
    return input_optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinput_option_Input_internal()
  {
    return (EReference)input_optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinput_option_Name()
  {
    return (EAttribute)input_optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinput_option_Assigns_internal()
  {
    return (EReference)input_optionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinput_option_Vals()
  {
    return (EReference)input_optionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoutput_section()
  {
    return output_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getoutput_section_Name()
  {
    return (EAttribute)output_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getoutput_section_Outputs()
  {
    return (EReference)output_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoutfield_decl()
  {
    return outfield_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getoutfield_decl_Fields()
  {
    return (EReference)outfield_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_integer()
  {
    return ecl_integerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_unsigned()
  {
    return ecl_unsignedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_string()
  {
    return ecl_stringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_qstring()
  {
    return ecl_qstringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_varstring()
  {
    return ecl_varstringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_unicode()
  {
    return ecl_unicodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_varunicode()
  {
    return ecl_varunicodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_data()
  {
    return ecl_dataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecl_real()
  {
    return ecl_realEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass geteclfield_type()
  {
    return eclfield_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference geteclfield_type_Options()
  {
    return (EReference)eclfield_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geteclfield_type_Name()
  {
    return (EAttribute)eclfield_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getecloutput_decl()
  {
    return ecloutput_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoutput_option()
  {
    return output_optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getoutput_option_Name()
  {
    return (EAttribute)output_optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getoutput_option_Vars()
  {
    return (EReference)output_optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getoutput_option_Vals()
  {
    return (EReference)output_optionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getoutput_option_Output_internal()
  {
    return (EReference)output_optionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoutput_options()
  {
    return output_optionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getout_type()
  {
    return out_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoutput_value()
  {
    return output_valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getoutput_value_Ops()
  {
    return (EReference)output_valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoutputbase()
  {
    return outputbaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getoutputbase_Actions()
  {
    return (EReference)outputbaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgenerate_section()
  {
    return generate_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgenerate_section_Name()
  {
    return (EAttribute)generate_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgenerate_body_inline()
  {
    return generate_body_inlineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgenerate_body_salt()
  {
    return generate_body_saltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvisual_section()
  {
    return visual_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvisual_section_Name()
  {
    return (EAttribute)visual_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvisual_section_Vis_ops()
  {
    return (EReference)visual_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvisual_section_Vis_elements()
  {
    return (EReference)visual_sectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvisualization()
  {
    return visualizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvisualization_Name()
  {
    return (EAttribute)visualizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvisualization_Inputs()
  {
    return (EReference)visualizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvisualization_Vis_ops()
  {
    return (EReference)visualizationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvis_basis()
  {
    return vis_basisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvis_basis_Vars()
  {
    return (EReference)vis_basisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvis_basis_Quals()
  {
    return (EReference)vis_basisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvis_basis_qualifiers()
  {
    return vis_basis_qualifiersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_Funcs()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvisual_section_options()
  {
    return visual_section_optionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvisual_section_option()
  {
    return visual_section_optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvisual_section_option_Vis_ops()
  {
    return (EReference)visual_section_optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvisual_section_option_Name()
  {
    return (EAttribute)visual_section_optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvisual_section_option_Vals()
  {
    return (EReference)visual_section_optionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvisual_options()
  {
    return visual_optionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvisual_option()
  {
    return visual_optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvisual_option_Vis_ops()
  {
    return (EReference)visual_optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvisual_option_Name()
  {
    return (EAttribute)visual_optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvisual_option_Funcs()
  {
    return (EReference)visual_optionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvisual_multival()
  {
    return visual_multivalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcustom_section()
  {
    return custom_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcustom_section_Name()
  {
    return (EAttribute)custom_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcustom_section_Cust_vals()
  {
    return (EReference)custom_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcustom_value()
  {
    return custom_valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getresource_option()
  {
    return resource_optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getresource_option_Name()
  {
    return (EAttribute)resource_optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getresource_option_Vals()
  {
    return (EReference)resource_optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getresource_option_Res_ops()
  {
    return (EReference)resource_optionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getresource_options()
  {
    return resource_optionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getresource_value()
  {
    return resource_valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getresource_section()
  {
    return resource_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getresource_section_Name()
  {
    return (EAttribute)resource_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getresource_section_Res_vals()
  {
    return (EReference)resource_sectionEClass.getEStructuralFeatures().get(1);
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
    createEReference(programEClass, PROGRAM__RESOURCE_SECTION);

    base_propEClass = createEClass(BASE_PROP);
    createEAttribute(base_propEClass, BASE_PROP__NAME);
    createEReference(base_propEClass, BASE_PROP__VALS);
    createEReference(base_propEClass, BASE_PROP__CATS);

    category_type_listEClass = createEClass(CATEGORY_TYPE_LIST);
    createEAttribute(category_type_listEClass, CATEGORY_TYPE_LIST__NAME);

    valueEClass = createEClass(VALUE);
    createEAttribute(valueEClass, VALUE__TYPE);
    createEReference(valueEClass, VALUE__VALS);
    createEReference(valueEClass, VALUE__RES_OPS);

    value_listEClass = createEClass(VALUE_LIST);

    assignEClass = createEClass(ASSIGN);
    createEReference(assignEClass, ASSIGN__ASSIGN_INTERNAL);

    assign_listEClass = createEClass(ASSIGN_LIST);

    composition_headerEClass = createEClass(COMPOSITION_HEADER);
    createEAttribute(composition_headerEClass, COMPOSITION_HEADER__NAME);
    createEReference(composition_headerEClass, COMPOSITION_HEADER__ASSIGNS);

    contract_instanceEClass = createEClass(CONTRACT_INSTANCE);
    createEAttribute(contract_instanceEClass, CONTRACT_INSTANCE__NAME);
    createEReference(contract_instanceEClass, CONTRACT_INSTANCE__VALS);
    createEReference(contract_instanceEClass, CONTRACT_INSTANCE__VARS);
    createEReference(contract_instanceEClass, CONTRACT_INSTANCE__ASSIGNS);

    field_declEClass = createEClass(FIELD_DECL);
    createEAttribute(field_declEClass, FIELD_DECL__NAME);
    createEReference(field_declEClass, FIELD_DECL__INPUT_INTERNAL);

    enum_declEClass = createEClass(ENUM_DECL);
    createEReference(enum_declEClass, ENUM_DECL__VALS);
    createEReference(enum_declEClass, ENUM_DECL__ASSIGNS);
    createEReference(enum_declEClass, ENUM_DECL__INPUT_OPS);

    input_sectionEClass = createEClass(INPUT_SECTION);
    createEAttribute(input_sectionEClass, INPUT_SECTION__NAME);
    createEReference(input_sectionEClass, INPUT_SECTION__INPUTS);

    boolEClass = createEClass(BOOL);
    createEReference(boolEClass, BOOL__INPUT_OPS);

    int_varEClass = createEClass(INT_VAR);
    createEReference(int_varEClass, INT_VAR__INPUT_OPS);

    string_varEClass = createEClass(STRING_VAR);
    createEReference(string_varEClass, STRING_VAR__INPUT_OPS);

    recordEClass = createEClass(RECORD);
    createEReference(recordEClass, RECORD__INPUT_OPS);

    datasetEClass = createEClass(DATASET);
    createEReference(datasetEClass, DATASET__INPUT_OPS);
    createEReference(datasetEClass, DATASET__FIELDS);
    createEReference(datasetEClass, DATASET__OUT_BASE);
    createEReference(datasetEClass, DATASET__ECL_VARS);
    createEReference(datasetEClass, DATASET__OP_BASE);

    groupEClass = createEClass(GROUP);
    createEReference(groupEClass, GROUP__INPUT_INTERNAL);
    createEReference(groupEClass, GROUP__VALUES);

    datatypeEClass = createEClass(DATATYPE);

    input_valueEClass = createEClass(INPUT_VALUE);
    createEAttribute(input_valueEClass, INPUT_VALUE__NAME);

    input_optionsEClass = createEClass(INPUT_OPTIONS);

    input_optionEClass = createEClass(INPUT_OPTION);
    createEReference(input_optionEClass, INPUT_OPTION__INPUT_INTERNAL);
    createEAttribute(input_optionEClass, INPUT_OPTION__NAME);
    createEReference(input_optionEClass, INPUT_OPTION__ASSIGNS_INTERNAL);
    createEReference(input_optionEClass, INPUT_OPTION__VALS);

    output_sectionEClass = createEClass(OUTPUT_SECTION);
    createEAttribute(output_sectionEClass, OUTPUT_SECTION__NAME);
    createEReference(output_sectionEClass, OUTPUT_SECTION__OUTPUTS);

    outfield_declEClass = createEClass(OUTFIELD_DECL);
    createEReference(outfield_declEClass, OUTFIELD_DECL__FIELDS);

    ecl_integerEClass = createEClass(ECL_INTEGER);

    ecl_unsignedEClass = createEClass(ECL_UNSIGNED);

    ecl_stringEClass = createEClass(ECL_STRING);

    ecl_qstringEClass = createEClass(ECL_QSTRING);

    ecl_varstringEClass = createEClass(ECL_VARSTRING);

    ecl_unicodeEClass = createEClass(ECL_UNICODE);

    ecl_varunicodeEClass = createEClass(ECL_VARUNICODE);

    ecl_dataEClass = createEClass(ECL_DATA);

    ecl_realEClass = createEClass(ECL_REAL);

    eclfield_typeEClass = createEClass(ECLFIELD_TYPE);
    createEReference(eclfield_typeEClass, ECLFIELD_TYPE__OPTIONS);
    createEAttribute(eclfield_typeEClass, ECLFIELD_TYPE__NAME);

    ecloutput_declEClass = createEClass(ECLOUTPUT_DECL);

    output_optionEClass = createEClass(OUTPUT_OPTION);
    createEAttribute(output_optionEClass, OUTPUT_OPTION__NAME);
    createEReference(output_optionEClass, OUTPUT_OPTION__VARS);
    createEReference(output_optionEClass, OUTPUT_OPTION__VALS);
    createEReference(output_optionEClass, OUTPUT_OPTION__OUTPUT_INTERNAL);

    output_optionsEClass = createEClass(OUTPUT_OPTIONS);

    out_typeEClass = createEClass(OUT_TYPE);

    output_valueEClass = createEClass(OUTPUT_VALUE);
    createEReference(output_valueEClass, OUTPUT_VALUE__OPS);

    outputbaseEClass = createEClass(OUTPUTBASE);
    createEReference(outputbaseEClass, OUTPUTBASE__ACTIONS);

    generate_sectionEClass = createEClass(GENERATE_SECTION);
    createEAttribute(generate_sectionEClass, GENERATE_SECTION__NAME);

    generate_body_inlineEClass = createEClass(GENERATE_BODY_INLINE);

    generate_body_saltEClass = createEClass(GENERATE_BODY_SALT);

    visual_sectionEClass = createEClass(VISUAL_SECTION);
    createEAttribute(visual_sectionEClass, VISUAL_SECTION__NAME);
    createEReference(visual_sectionEClass, VISUAL_SECTION__VIS_OPS);
    createEReference(visual_sectionEClass, VISUAL_SECTION__VIS_ELEMENTS);

    visualizationEClass = createEClass(VISUALIZATION);
    createEAttribute(visualizationEClass, VISUALIZATION__NAME);
    createEReference(visualizationEClass, VISUALIZATION__INPUTS);
    createEReference(visualizationEClass, VISUALIZATION__VIS_OPS);

    vis_basisEClass = createEClass(VIS_BASIS);
    createEReference(vis_basisEClass, VIS_BASIS__VARS);
    createEReference(vis_basisEClass, VIS_BASIS__QUALS);

    vis_basis_qualifiersEClass = createEClass(VIS_BASIS_QUALIFIERS);

    functionEClass = createEClass(FUNCTION);
    createEReference(functionEClass, FUNCTION__FUNCS);
    createEAttribute(functionEClass, FUNCTION__NAME);

    visual_section_optionsEClass = createEClass(VISUAL_SECTION_OPTIONS);

    visual_section_optionEClass = createEClass(VISUAL_SECTION_OPTION);
    createEReference(visual_section_optionEClass, VISUAL_SECTION_OPTION__VIS_OPS);
    createEAttribute(visual_section_optionEClass, VISUAL_SECTION_OPTION__NAME);
    createEReference(visual_section_optionEClass, VISUAL_SECTION_OPTION__VALS);

    visual_optionsEClass = createEClass(VISUAL_OPTIONS);

    visual_optionEClass = createEClass(VISUAL_OPTION);
    createEReference(visual_optionEClass, VISUAL_OPTION__VIS_OPS);
    createEAttribute(visual_optionEClass, VISUAL_OPTION__NAME);
    createEReference(visual_optionEClass, VISUAL_OPTION__FUNCS);

    visual_multivalEClass = createEClass(VISUAL_MULTIVAL);

    custom_sectionEClass = createEClass(CUSTOM_SECTION);
    createEAttribute(custom_sectionEClass, CUSTOM_SECTION__NAME);
    createEReference(custom_sectionEClass, CUSTOM_SECTION__CUST_VALS);

    custom_valueEClass = createEClass(CUSTOM_VALUE);

    resource_optionEClass = createEClass(RESOURCE_OPTION);
    createEAttribute(resource_optionEClass, RESOURCE_OPTION__NAME);
    createEReference(resource_optionEClass, RESOURCE_OPTION__VALS);
    createEReference(resource_optionEClass, RESOURCE_OPTION__RES_OPS);

    resource_optionsEClass = createEClass(RESOURCE_OPTIONS);

    resource_valueEClass = createEClass(RESOURCE_VALUE);

    resource_sectionEClass = createEClass(RESOURCE_SECTION);
    createEAttribute(resource_sectionEClass, RESOURCE_SECTION__NAME);
    createEReference(resource_sectionEClass, RESOURCE_SECTION__RES_VALS);
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
    valueEClass.getESuperTypes().add(this.getvalue_list());
    valueEClass.getESuperTypes().add(this.getassign());
    valueEClass.getESuperTypes().add(this.getout_type());
    valueEClass.getESuperTypes().add(this.getfunction());
    valueEClass.getESuperTypes().add(this.getcustom_value());
    valueEClass.getESuperTypes().add(this.getresource_value());
    assignEClass.getESuperTypes().add(this.getassign_list());
    enum_declEClass.getESuperTypes().add(this.getinput_value());
    boolEClass.getESuperTypes().add(this.getdatatype());
    boolEClass.getESuperTypes().add(this.getinput_value());
    boolEClass.getESuperTypes().add(this.getoutfield_decl());
    int_varEClass.getESuperTypes().add(this.getdatatype());
    int_varEClass.getESuperTypes().add(this.getinput_value());
    int_varEClass.getESuperTypes().add(this.getoutfield_decl());
    string_varEClass.getESuperTypes().add(this.getdatatype());
    string_varEClass.getESuperTypes().add(this.getinput_value());
    string_varEClass.getESuperTypes().add(this.getoutfield_decl());
    recordEClass.getESuperTypes().add(this.getdatatype());
    recordEClass.getESuperTypes().add(this.getinput_value());
    datasetEClass.getESuperTypes().add(this.getdatatype());
    datasetEClass.getESuperTypes().add(this.getinput_value());
    datasetEClass.getESuperTypes().add(this.getoutput_value());
    groupEClass.getESuperTypes().add(this.getinput_value());
    input_optionEClass.getESuperTypes().add(this.getinput_options());
    ecl_integerEClass.getESuperTypes().add(this.geteclfield_type());
    ecl_unsignedEClass.getESuperTypes().add(this.geteclfield_type());
    ecl_stringEClass.getESuperTypes().add(this.geteclfield_type());
    ecl_qstringEClass.getESuperTypes().add(this.geteclfield_type());
    ecl_varstringEClass.getESuperTypes().add(this.geteclfield_type());
    ecl_unicodeEClass.getESuperTypes().add(this.geteclfield_type());
    ecl_varunicodeEClass.getESuperTypes().add(this.geteclfield_type());
    ecl_dataEClass.getESuperTypes().add(this.geteclfield_type());
    ecl_realEClass.getESuperTypes().add(this.geteclfield_type());
    eclfield_typeEClass.getESuperTypes().add(this.getecloutput_decl());
    output_optionEClass.getESuperTypes().add(this.getoutput_options());
    out_typeEClass.getESuperTypes().add(this.getoutput_value());
    generate_body_inlineEClass.getESuperTypes().add(this.getgenerate_section());
    generate_body_saltEClass.getESuperTypes().add(this.getgenerate_section());
    functionEClass.getESuperTypes().add(this.getvis_basis_qualifiers());
    visual_section_optionEClass.getESuperTypes().add(this.getvisual_section_options());
    visual_optionEClass.getESuperTypes().add(this.getvisual_options());
    visual_multivalEClass.getESuperTypes().add(this.getvisual_option());
    resource_optionEClass.getESuperTypes().add(this.getresource_options());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, program.class, "program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getprogram_Composition_Header(), this.getcomposition_header(), null, "Composition_Header", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Base_Props(), this.getbase_prop(), null, "Base_Props", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Contract_Instances(), this.getcontract_instance(), null, "Contract_Instances", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Input_Section(), this.getinput_section(), null, "Input_Section", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Output_Section(), this.getoutput_section(), null, "Output_Section", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Visual_Section(), this.getvisual_section(), null, "Visual_Section", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Generate_Section(), this.getgenerate_section(), null, "Generate_Section", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Custom_Section(), this.getcustom_section(), null, "Custom_Section", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Resource_Section(), this.getresource_section(), null, "Resource_Section", null, 0, -1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(base_propEClass, base_prop.class, "base_prop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbase_prop_Name(), ecorePackage.getEString(), "name", null, 0, 1, base_prop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbase_prop_Vals(), this.getvalue_list(), null, "vals", null, 0, -1, base_prop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbase_prop_Cats(), this.getcategory_type_list(), null, "cats", null, 0, -1, base_prop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(category_type_listEClass, category_type_list.class, "category_type_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcategory_type_list_Name(), ecorePackage.getEString(), "name", null, 0, 1, category_type_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, value.class, "value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvalue_Type(), ecorePackage.getEInt(), "type", null, 0, 1, value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvalue_Vals(), this.getvalue_list(), null, "vals", null, 0, -1, value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvalue_Res_ops(), this.getresource_options(), null, "res_ops", null, 0, -1, value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(value_listEClass, value_list.class, "value_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignEClass, assign.class, "assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getassign_Assign_internal(), this.getassign(), null, "assign_internal", null, 0, -1, assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assign_listEClass, assign_list.class, "assign_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(composition_headerEClass, composition_header.class, "composition_header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcomposition_header_Name(), ecorePackage.getEString(), "name", null, 0, 1, composition_header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcomposition_header_Assigns(), this.getassign(), null, "assigns", null, 0, -1, composition_header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contract_instanceEClass, contract_instance.class, "contract_instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcontract_instance_Name(), ecorePackage.getEString(), "name", null, 0, 1, contract_instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcontract_instance_Vals(), this.getvalue(), null, "vals", null, 0, -1, contract_instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcontract_instance_Vars(), this.getvalue(), null, "vars", null, 0, -1, contract_instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcontract_instance_Assigns(), this.getassign(), null, "assigns", null, 0, -1, contract_instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(field_declEClass, field_decl.class, "field_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfield_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, field_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfield_decl_Input_internal(), this.getinput_options(), null, "input_internal", null, 0, -1, field_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enum_declEClass, enum_decl.class, "enum_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getenum_decl_Vals(), this.getvalue_list(), null, "vals", null, 0, -1, enum_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getenum_decl_Assigns(), this.getassign_list(), null, "assigns", null, 0, -1, enum_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getenum_decl_Input_ops(), this.getinput_options(), null, "input_ops", null, 0, -1, enum_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(input_sectionEClass, input_section.class, "input_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinput_section_Name(), ecorePackage.getEString(), "name", null, 0, 1, input_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinput_section_Inputs(), this.getinput_value(), null, "inputs", null, 0, -1, input_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolEClass, bool.class, "bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbool_Input_ops(), this.getinput_options(), null, "input_ops", null, 0, -1, bool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(int_varEClass, int_var.class, "int_var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getint_var_Input_ops(), this.getinput_options(), null, "input_ops", null, 0, -1, int_var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(string_varEClass, string_var.class, "string_var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstring_var_Input_ops(), this.getinput_options(), null, "input_ops", null, 0, -1, string_var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordEClass, record.class, "record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrecord_Input_ops(), this.getinput_options(), null, "input_ops", null, 0, -1, record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datasetEClass, dataset.class, "dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdataset_Input_ops(), this.getinput_options(), null, "input_ops", null, 0, -1, dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdataset_Fields(), this.getfield_decl(), null, "fields", null, 0, -1, dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdataset_Out_base(), this.getoutputbase(), null, "out_base", null, 0, -1, dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdataset_Ecl_vars(), this.getecloutput_decl(), null, "ecl_vars", null, 0, -1, dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdataset_Op_base(), this.getoutputbase(), null, "op_base", null, 0, -1, dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, group.class, "group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgroup_Input_internal(), this.getinput_options(), null, "input_internal", null, 0, -1, group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgroup_Values(), this.getinput_value(), null, "values", null, 0, -1, group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datatypeEClass, datatype.class, "datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(input_valueEClass, input_value.class, "input_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinput_value_Name(), ecorePackage.getEString(), "name", null, 0, 1, input_value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(input_optionsEClass, input_options.class, "input_options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(input_optionEClass, input_option.class, "input_option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinput_option_Input_internal(), this.getinput_option(), null, "input_internal", null, 0, -1, input_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinput_option_Name(), ecorePackage.getEString(), "name", null, 0, 1, input_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinput_option_Assigns_internal(), this.getassign_list(), null, "assigns_internal", null, 0, -1, input_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinput_option_Vals(), this.getvalue_list(), null, "vals", null, 0, -1, input_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(output_sectionEClass, output_section.class, "output_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getoutput_section_Name(), ecorePackage.getEString(), "name", null, 0, 1, output_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getoutput_section_Outputs(), this.getoutput_value(), null, "outputs", null, 0, -1, output_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outfield_declEClass, outfield_decl.class, "outfield_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getoutfield_decl_Fields(), this.getfield_decl(), null, "fields", null, 0, -1, outfield_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ecl_integerEClass, ecl_integer.class, "ecl_integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecl_unsignedEClass, ecl_unsigned.class, "ecl_unsigned", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecl_stringEClass, ecl_string.class, "ecl_string", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecl_qstringEClass, ecl_qstring.class, "ecl_qstring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecl_varstringEClass, ecl_varstring.class, "ecl_varstring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecl_unicodeEClass, ecl_unicode.class, "ecl_unicode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecl_varunicodeEClass, ecl_varunicode.class, "ecl_varunicode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecl_dataEClass, ecl_data.class, "ecl_data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ecl_realEClass, ecl_real.class, "ecl_real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclfield_typeEClass, eclfield_type.class, "eclfield_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(geteclfield_type_Options(), this.getoutput_options(), null, "options", null, 0, -1, eclfield_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(geteclfield_type_Name(), ecorePackage.getEString(), "name", null, 0, 1, eclfield_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ecloutput_declEClass, ecloutput_decl.class, "ecloutput_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(output_optionEClass, output_option.class, "output_option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getoutput_option_Name(), ecorePackage.getEString(), "name", null, 0, 1, output_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getoutput_option_Vars(), this.getdatatype(), null, "vars", null, 0, -1, output_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getoutput_option_Vals(), this.getvalue(), null, "vals", null, 0, -1, output_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getoutput_option_Output_internal(), this.getoutput_option(), null, "output_internal", null, 0, -1, output_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(output_optionsEClass, output_options.class, "output_options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(out_typeEClass, out_type.class, "out_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(output_valueEClass, output_value.class, "output_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getoutput_value_Ops(), this.getoutput_options(), null, "ops", null, 0, -1, output_value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputbaseEClass, outputbase.class, "outputbase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getoutputbase_Actions(), this.getdatatype(), null, "actions", null, 0, 1, outputbase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generate_sectionEClass, generate_section.class, "generate_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getgenerate_section_Name(), ecorePackage.getEString(), "name", null, 0, 1, generate_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generate_body_inlineEClass, generate_body_inline.class, "generate_body_inline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(generate_body_saltEClass, generate_body_salt.class, "generate_body_salt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visual_sectionEClass, visual_section.class, "visual_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvisual_section_Name(), ecorePackage.getEString(), "name", null, 0, 1, visual_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvisual_section_Vis_ops(), this.getvisual_section_options(), null, "vis_ops", null, 0, -1, visual_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvisual_section_Vis_elements(), this.getvisualization(), null, "vis_elements", null, 0, -1, visual_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visualizationEClass, visualization.class, "visualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvisualization_Name(), ecorePackage.getEString(), "name", null, 0, 1, visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvisualization_Inputs(), this.getvis_basis(), null, "inputs", null, 0, -1, visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvisualization_Vis_ops(), this.getvisual_options(), null, "vis_ops", null, 0, -1, visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vis_basisEClass, vis_basis.class, "vis_basis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvis_basis_Vars(), this.getdatatype(), null, "vars", null, 0, -1, vis_basis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvis_basis_Quals(), this.getvis_basis_qualifiers(), null, "quals", null, 0, -1, vis_basis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vis_basis_qualifiersEClass, vis_basis_qualifiers.class, "vis_basis_qualifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionEClass, function.class, "function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunction_Funcs(), this.getfunction(), null, "funcs", null, 0, -1, function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visual_section_optionsEClass, visual_section_options.class, "visual_section_options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visual_section_optionEClass, visual_section_option.class, "visual_section_option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvisual_section_option_Vis_ops(), this.getvisual_section_option(), null, "vis_ops", null, 0, -1, visual_section_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvisual_section_option_Name(), ecorePackage.getEString(), "name", null, 0, 1, visual_section_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvisual_section_option_Vals(), this.getvalue(), null, "vals", null, 0, -1, visual_section_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visual_optionsEClass, visual_options.class, "visual_options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visual_optionEClass, visual_option.class, "visual_option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvisual_option_Vis_ops(), this.getvisual_option(), null, "vis_ops", null, 0, -1, visual_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvisual_option_Name(), ecorePackage.getEString(), "name", null, 0, 1, visual_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvisual_option_Funcs(), this.getfunction(), null, "funcs", null, 0, -1, visual_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visual_multivalEClass, visual_multival.class, "visual_multival", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(custom_sectionEClass, custom_section.class, "custom_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcustom_section_Name(), ecorePackage.getEString(), "name", null, 0, 1, custom_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcustom_section_Cust_vals(), this.getcustom_value(), null, "cust_vals", null, 0, -1, custom_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(custom_valueEClass, custom_value.class, "custom_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resource_optionEClass, resource_option.class, "resource_option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getresource_option_Name(), ecorePackage.getEString(), "name", null, 0, 1, resource_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getresource_option_Vals(), this.getvalue(), null, "vals", null, 0, -1, resource_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getresource_option_Res_ops(), this.getresource_option(), null, "res_ops", null, 0, -1, resource_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resource_optionsEClass, resource_options.class, "resource_options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resource_valueEClass, resource_value.class, "resource_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resource_sectionEClass, resource_section.class, "resource_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getresource_section_Name(), ecorePackage.getEString(), "name", null, 0, 1, resource_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getresource_section_Res_vals(), this.getresource_value(), null, "res_vals", null, 0, -1, resource_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HIPIEPackageImpl
