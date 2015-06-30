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
      case HIPIEPackage.PROGRAM: return createprogram();
      case HIPIEPackage.BASE_PROP: return createbase_prop();
      case HIPIEPackage.CATEGORY_TYPE_LIST: return createcategory_type_list();
      case HIPIEPackage.VALUE: return createvalue();
      case HIPIEPackage.VALUE_LIST: return createvalue_list();
      case HIPIEPackage.ASSIGN: return createassign();
      case HIPIEPackage.ASSIGN_LIST: return createassign_list();
      case HIPIEPackage.COMPOSITION_HEADER: return createcomposition_header();
      case HIPIEPackage.CONTRACT_INSTANCE: return createcontract_instance();
      case HIPIEPackage.FIELD_DECL: return createfield_decl();
      case HIPIEPackage.ENUM_DECL: return createenum_decl();
      case HIPIEPackage.INPUT_SECTION: return createInputSection();
      case HIPIEPackage.BOOL: return createbool();
      case HIPIEPackage.INT_VAR: return createint_var();
      case HIPIEPackage.STRING_VAR: return createstring_var();
      case HIPIEPackage.RECORD: return createrecord();
      case HIPIEPackage.DATASET: return createdataset();
      case HIPIEPackage.GROUP: return creategroup();
      case HIPIEPackage.DATATYPE: return createdatatype();
      case HIPIEPackage.INPUT_VALUE: return createinput_value();
      case HIPIEPackage.INPUT_OPTIONS: return createinput_options();
      case HIPIEPackage.INPUT_OPTION: return createinput_option();
      case HIPIEPackage.OUTPUT_SECTION: return createOutputSection();
      case HIPIEPackage.OUTFIELD_DECL: return createoutfield_decl();
      case HIPIEPackage.ECL_INTEGER: return createecl_integer();
      case HIPIEPackage.ECL_UNSIGNED: return createecl_unsigned();
      case HIPIEPackage.ECL_STRING: return createecl_string();
      case HIPIEPackage.ECL_QSTRING: return createecl_qstring();
      case HIPIEPackage.ECL_VARSTRING: return createecl_varstring();
      case HIPIEPackage.ECL_UNICODE: return createecl_unicode();
      case HIPIEPackage.ECL_VARUNICODE: return createecl_varunicode();
      case HIPIEPackage.ECL_DATA: return createecl_data();
      case HIPIEPackage.ECL_REAL: return createecl_real();
      case HIPIEPackage.ECLFIELD_TYPE: return createeclfield_type();
      case HIPIEPackage.POS_VIZ_DATA: return createpos_viz_data();
      case HIPIEPackage.ECLOUTPUT_DECL: return createecloutput_decl();
      case HIPIEPackage.OUTPUT_OPTION: return createOutputOption();
      case HIPIEPackage.OUTPUT_OPTIONS: return createOutputOptions();
      case HIPIEPackage.OUT_TYPE: return createout_type();
      case HIPIEPackage.OUT_DATASET: return createout_dataset();
      case HIPIEPackage.OUTPUT_VALUE: return createoutput_value();
      case HIPIEPackage.OUTPUTBASE: return createoutputbase();
      case HIPIEPackage.GENERATE_SECTION: return creategenerate_section();
      case HIPIEPackage.GENERATE_BODY_INLINE: return creategenerate_body_inline();
      case HIPIEPackage.GENERATE_BODY_SALT: return creategenerate_body_salt();
      case HIPIEPackage.VISUAL_SECTION: return createVisualSection();
      case HIPIEPackage.VISUALIZATION: return createvisualization();
      case HIPIEPackage.VIS_BASIS: return createVisBasis();
      case HIPIEPackage.VIS_BASIS_QUALIFIERS: return createvis_basis_qualifiers();
      case HIPIEPackage.FUNCTION: return createfunction();
      case HIPIEPackage.VISUAL_SECTION_OPTIONS: return createvisual_section_options();
      case HIPIEPackage.VISUAL_SECTION_OPTION: return createvisual_section_option();
      case HIPIEPackage.VISUAL_OPTIONS: return createvisual_options();
      case HIPIEPackage.VISUAL_OPTION: return createvisual_option();
      case HIPIEPackage.VISUAL_MULTIVAL: return createvisual_multival();
      case HIPIEPackage.CUSTOM_SECTION: return createcustom_section();
      case HIPIEPackage.CUSTOM_VALUE: return createcustom_value();
      case HIPIEPackage.RESOURCE_OPTION: return createresource_option();
      case HIPIEPackage.RESOURCE_OPTIONS: return createresource_options();
      case HIPIEPackage.RESOURCE_VALUE: return createresource_value();
      case HIPIEPackage.RESOURCE_SECTION: return createresource_section();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program createprogram()
  {
    programImpl program = new programImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public base_prop createbase_prop()
  {
    base_propImpl base_prop = new base_propImpl();
    return base_prop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public category_type_list createcategory_type_list()
  {
    category_type_listImpl category_type_list = new category_type_listImpl();
    return category_type_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public value createvalue()
  {
    valueImpl value = new valueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public value_list createvalue_list()
  {
    value_listImpl value_list = new value_listImpl();
    return value_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assign createassign()
  {
    assignImpl assign = new assignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assign_list createassign_list()
  {
    assign_listImpl assign_list = new assign_listImpl();
    return assign_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public composition_header createcomposition_header()
  {
    composition_headerImpl composition_header = new composition_headerImpl();
    return composition_header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public contract_instance createcontract_instance()
  {
    contract_instanceImpl contract_instance = new contract_instanceImpl();
    return contract_instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_decl createfield_decl()
  {
    field_declImpl field_decl = new field_declImpl();
    return field_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enum_decl createenum_decl()
  {
    enum_declImpl enum_decl = new enum_declImpl();
    return enum_decl;
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
  public bool createbool()
  {
    boolImpl bool = new boolImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int_var createint_var()
  {
    int_varImpl int_var = new int_varImpl();
    return int_var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public string_var createstring_var()
  {
    string_varImpl string_var = new string_varImpl();
    return string_var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public record createrecord()
  {
    recordImpl record = new recordImpl();
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dataset createdataset()
  {
    datasetImpl dataset = new datasetImpl();
    return dataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public group creategroup()
  {
    groupImpl group = new groupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public datatype createdatatype()
  {
    datatypeImpl datatype = new datatypeImpl();
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public input_value createinput_value()
  {
    input_valueImpl input_value = new input_valueImpl();
    return input_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public input_options createinput_options()
  {
    input_optionsImpl input_options = new input_optionsImpl();
    return input_options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public input_option createinput_option()
  {
    input_optionImpl input_option = new input_optionImpl();
    return input_option;
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
  public outfield_decl createoutfield_decl()
  {
    outfield_declImpl outfield_decl = new outfield_declImpl();
    return outfield_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_integer createecl_integer()
  {
    ecl_integerImpl ecl_integer = new ecl_integerImpl();
    return ecl_integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_unsigned createecl_unsigned()
  {
    ecl_unsignedImpl ecl_unsigned = new ecl_unsignedImpl();
    return ecl_unsigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_string createecl_string()
  {
    ecl_stringImpl ecl_string = new ecl_stringImpl();
    return ecl_string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_qstring createecl_qstring()
  {
    ecl_qstringImpl ecl_qstring = new ecl_qstringImpl();
    return ecl_qstring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_varstring createecl_varstring()
  {
    ecl_varstringImpl ecl_varstring = new ecl_varstringImpl();
    return ecl_varstring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_unicode createecl_unicode()
  {
    ecl_unicodeImpl ecl_unicode = new ecl_unicodeImpl();
    return ecl_unicode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_varunicode createecl_varunicode()
  {
    ecl_varunicodeImpl ecl_varunicode = new ecl_varunicodeImpl();
    return ecl_varunicode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_data createecl_data()
  {
    ecl_dataImpl ecl_data = new ecl_dataImpl();
    return ecl_data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecl_real createecl_real()
  {
    ecl_realImpl ecl_real = new ecl_realImpl();
    return ecl_real;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public eclfield_type createeclfield_type()
  {
    eclfield_typeImpl eclfield_type = new eclfield_typeImpl();
    return eclfield_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pos_viz_data createpos_viz_data()
  {
    pos_viz_dataImpl pos_viz_data = new pos_viz_dataImpl();
    return pos_viz_data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecloutput_decl createecloutput_decl()
  {
    ecloutput_declImpl ecloutput_decl = new ecloutput_declImpl();
    return ecloutput_decl;
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
  public out_type createout_type()
  {
    out_typeImpl out_type = new out_typeImpl();
    return out_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public out_dataset createout_dataset()
  {
    out_datasetImpl out_dataset = new out_datasetImpl();
    return out_dataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public output_value createoutput_value()
  {
    output_valueImpl output_value = new output_valueImpl();
    return output_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public outputbase createoutputbase()
  {
    outputbaseImpl outputbase = new outputbaseImpl();
    return outputbase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public generate_section creategenerate_section()
  {
    generate_sectionImpl generate_section = new generate_sectionImpl();
    return generate_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public generate_body_inline creategenerate_body_inline()
  {
    generate_body_inlineImpl generate_body_inline = new generate_body_inlineImpl();
    return generate_body_inline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public generate_body_salt creategenerate_body_salt()
  {
    generate_body_saltImpl generate_body_salt = new generate_body_saltImpl();
    return generate_body_salt;
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
  public visualization createvisualization()
  {
    visualizationImpl visualization = new visualizationImpl();
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
  public vis_basis_qualifiers createvis_basis_qualifiers()
  {
    vis_basis_qualifiersImpl vis_basis_qualifiers = new vis_basis_qualifiersImpl();
    return vis_basis_qualifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function createfunction()
  {
    functionImpl function = new functionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public visual_section_options createvisual_section_options()
  {
    visual_section_optionsImpl visual_section_options = new visual_section_optionsImpl();
    return visual_section_options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public visual_section_option createvisual_section_option()
  {
    visual_section_optionImpl visual_section_option = new visual_section_optionImpl();
    return visual_section_option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public visual_options createvisual_options()
  {
    visual_optionsImpl visual_options = new visual_optionsImpl();
    return visual_options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public visual_option createvisual_option()
  {
    visual_optionImpl visual_option = new visual_optionImpl();
    return visual_option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public visual_multival createvisual_multival()
  {
    visual_multivalImpl visual_multival = new visual_multivalImpl();
    return visual_multival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public custom_section createcustom_section()
  {
    custom_sectionImpl custom_section = new custom_sectionImpl();
    return custom_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public custom_value createcustom_value()
  {
    custom_valueImpl custom_value = new custom_valueImpl();
    return custom_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public resource_option createresource_option()
  {
    resource_optionImpl resource_option = new resource_optionImpl();
    return resource_option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public resource_options createresource_options()
  {
    resource_optionsImpl resource_options = new resource_optionsImpl();
    return resource_options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public resource_value createresource_value()
  {
    resource_valueImpl resource_value = new resource_valueImpl();
    return resource_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public resource_section createresource_section()
  {
    resource_sectionImpl resource_section = new resource_sectionImpl();
    return resource_section;
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
