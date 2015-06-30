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
   * Returns a new object of class '<em>program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>program</em>'.
   * @generated
   */
  program createprogram();

  /**
   * Returns a new object of class '<em>base prop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>base prop</em>'.
   * @generated
   */
  base_prop createbase_prop();

  /**
   * Returns a new object of class '<em>category type list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>category type list</em>'.
   * @generated
   */
  category_type_list createcategory_type_list();

  /**
   * Returns a new object of class '<em>value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>value</em>'.
   * @generated
   */
  value createvalue();

  /**
   * Returns a new object of class '<em>value list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>value list</em>'.
   * @generated
   */
  value_list createvalue_list();

  /**
   * Returns a new object of class '<em>assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>assign</em>'.
   * @generated
   */
  assign createassign();

  /**
   * Returns a new object of class '<em>assign list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>assign list</em>'.
   * @generated
   */
  assign_list createassign_list();

  /**
   * Returns a new object of class '<em>composition header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>composition header</em>'.
   * @generated
   */
  composition_header createcomposition_header();

  /**
   * Returns a new object of class '<em>contract instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>contract instance</em>'.
   * @generated
   */
  contract_instance createcontract_instance();

  /**
   * Returns a new object of class '<em>field decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field decl</em>'.
   * @generated
   */
  field_decl createfield_decl();

  /**
   * Returns a new object of class '<em>enum decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enum decl</em>'.
   * @generated
   */
  enum_decl createenum_decl();

  /**
   * Returns a new object of class '<em>Input Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Section</em>'.
   * @generated
   */
  InputSection createInputSection();

  /**
   * Returns a new object of class '<em>bool</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bool</em>'.
   * @generated
   */
  bool createbool();

  /**
   * Returns a new object of class '<em>int var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>int var</em>'.
   * @generated
   */
  int_var createint_var();

  /**
   * Returns a new object of class '<em>string var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>string var</em>'.
   * @generated
   */
  string_var createstring_var();

  /**
   * Returns a new object of class '<em>record</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>record</em>'.
   * @generated
   */
  record createrecord();

  /**
   * Returns a new object of class '<em>dataset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>dataset</em>'.
   * @generated
   */
  dataset createdataset();

  /**
   * Returns a new object of class '<em>group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>group</em>'.
   * @generated
   */
  group creategroup();

  /**
   * Returns a new object of class '<em>datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>datatype</em>'.
   * @generated
   */
  datatype createdatatype();

  /**
   * Returns a new object of class '<em>input value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>input value</em>'.
   * @generated
   */
  input_value createinput_value();

  /**
   * Returns a new object of class '<em>input options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>input options</em>'.
   * @generated
   */
  input_options createinput_options();

  /**
   * Returns a new object of class '<em>input option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>input option</em>'.
   * @generated
   */
  input_option createinput_option();

  /**
   * Returns a new object of class '<em>Output Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Section</em>'.
   * @generated
   */
  OutputSection createOutputSection();

  /**
   * Returns a new object of class '<em>outfield decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>outfield decl</em>'.
   * @generated
   */
  outfield_decl createoutfield_decl();

  /**
   * Returns a new object of class '<em>ecl integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl integer</em>'.
   * @generated
   */
  ecl_integer createecl_integer();

  /**
   * Returns a new object of class '<em>ecl unsigned</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl unsigned</em>'.
   * @generated
   */
  ecl_unsigned createecl_unsigned();

  /**
   * Returns a new object of class '<em>ecl string</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl string</em>'.
   * @generated
   */
  ecl_string createecl_string();

  /**
   * Returns a new object of class '<em>ecl qstring</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl qstring</em>'.
   * @generated
   */
  ecl_qstring createecl_qstring();

  /**
   * Returns a new object of class '<em>ecl varstring</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl varstring</em>'.
   * @generated
   */
  ecl_varstring createecl_varstring();

  /**
   * Returns a new object of class '<em>ecl unicode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl unicode</em>'.
   * @generated
   */
  ecl_unicode createecl_unicode();

  /**
   * Returns a new object of class '<em>ecl varunicode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl varunicode</em>'.
   * @generated
   */
  ecl_varunicode createecl_varunicode();

  /**
   * Returns a new object of class '<em>ecl data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl data</em>'.
   * @generated
   */
  ecl_data createecl_data();

  /**
   * Returns a new object of class '<em>ecl real</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecl real</em>'.
   * @generated
   */
  ecl_real createecl_real();

  /**
   * Returns a new object of class '<em>eclfield type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>eclfield type</em>'.
   * @generated
   */
  eclfield_type createeclfield_type();

  /**
   * Returns a new object of class '<em>pos viz data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pos viz data</em>'.
   * @generated
   */
  pos_viz_data createpos_viz_data();

  /**
   * Returns a new object of class '<em>ecloutput decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ecloutput decl</em>'.
   * @generated
   */
  ecloutput_decl createecloutput_decl();

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
   * Returns a new object of class '<em>out type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>out type</em>'.
   * @generated
   */
  out_type createout_type();

  /**
   * Returns a new object of class '<em>out dataset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>out dataset</em>'.
   * @generated
   */
  out_dataset createout_dataset();

  /**
   * Returns a new object of class '<em>output value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>output value</em>'.
   * @generated
   */
  output_value createoutput_value();

  /**
   * Returns a new object of class '<em>outputbase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>outputbase</em>'.
   * @generated
   */
  outputbase createoutputbase();

  /**
   * Returns a new object of class '<em>generate section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>generate section</em>'.
   * @generated
   */
  generate_section creategenerate_section();

  /**
   * Returns a new object of class '<em>generate body inline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>generate body inline</em>'.
   * @generated
   */
  generate_body_inline creategenerate_body_inline();

  /**
   * Returns a new object of class '<em>generate body salt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>generate body salt</em>'.
   * @generated
   */
  generate_body_salt creategenerate_body_salt();

  /**
   * Returns a new object of class '<em>Visual Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Section</em>'.
   * @generated
   */
  VisualSection createVisualSection();

  /**
   * Returns a new object of class '<em>visualization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>visualization</em>'.
   * @generated
   */
  visualization createvisualization();

  /**
   * Returns a new object of class '<em>Vis Basis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vis Basis</em>'.
   * @generated
   */
  VisBasis createVisBasis();

  /**
   * Returns a new object of class '<em>vis basis qualifiers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>vis basis qualifiers</em>'.
   * @generated
   */
  vis_basis_qualifiers createvis_basis_qualifiers();

  /**
   * Returns a new object of class '<em>function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function</em>'.
   * @generated
   */
  function createfunction();

  /**
   * Returns a new object of class '<em>visual section options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>visual section options</em>'.
   * @generated
   */
  visual_section_options createvisual_section_options();

  /**
   * Returns a new object of class '<em>visual section option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>visual section option</em>'.
   * @generated
   */
  visual_section_option createvisual_section_option();

  /**
   * Returns a new object of class '<em>visual options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>visual options</em>'.
   * @generated
   */
  visual_options createvisual_options();

  /**
   * Returns a new object of class '<em>visual option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>visual option</em>'.
   * @generated
   */
  visual_option createvisual_option();

  /**
   * Returns a new object of class '<em>visual multival</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>visual multival</em>'.
   * @generated
   */
  visual_multival createvisual_multival();

  /**
   * Returns a new object of class '<em>custom section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>custom section</em>'.
   * @generated
   */
  custom_section createcustom_section();

  /**
   * Returns a new object of class '<em>custom value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>custom value</em>'.
   * @generated
   */
  custom_value createcustom_value();

  /**
   * Returns a new object of class '<em>resource option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>resource option</em>'.
   * @generated
   */
  resource_option createresource_option();

  /**
   * Returns a new object of class '<em>resource options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>resource options</em>'.
   * @generated
   */
  resource_options createresource_options();

  /**
   * Returns a new object of class '<em>resource value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>resource value</em>'.
   * @generated
   */
  resource_value createresource_value();

  /**
   * Returns a new object of class '<em>resource section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>resource section</em>'.
   * @generated
   */
  resource_section createresource_section();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HIPIEPackage getHIPIEPackage();

} //HIPIEFactory
