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
        program program = (program)theEObject;
        T result = caseprogram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.BASE_PROP:
      {
        base_prop base_prop = (base_prop)theEObject;
        T result = casebase_prop(base_prop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CATEGORY_TYPE_LIST:
      {
        category_type_list category_type_list = (category_type_list)theEObject;
        T result = casecategory_type_list(category_type_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VALUE:
      {
        value value = (value)theEObject;
        T result = casevalue(value);
        if (result == null) result = casevalue_list(value);
        if (result == null) result = caseassign(value);
        if (result == null) result = caseout_type(value);
        if (result == null) result = casefunction(value);
        if (result == null) result = casecustom_value(value);
        if (result == null) result = caseresource_value(value);
        if (result == null) result = caseassign_list(value);
        if (result == null) result = caseoutput_value(value);
        if (result == null) result = casevis_basis_qualifiers(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VALUE_LIST:
      {
        value_list value_list = (value_list)theEObject;
        T result = casevalue_list(value_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ASSIGN:
      {
        assign assign = (assign)theEObject;
        T result = caseassign(assign);
        if (result == null) result = caseassign_list(assign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ASSIGN_LIST:
      {
        assign_list assign_list = (assign_list)theEObject;
        T result = caseassign_list(assign_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.COMPOSITION_HEADER:
      {
        composition_header composition_header = (composition_header)theEObject;
        T result = casecomposition_header(composition_header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CONTRACT_INSTANCE:
      {
        contract_instance contract_instance = (contract_instance)theEObject;
        T result = casecontract_instance(contract_instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.FIELD_DECL:
      {
        field_decl field_decl = (field_decl)theEObject;
        T result = casefield_decl(field_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ENUM_DECL:
      {
        enum_decl enum_decl = (enum_decl)theEObject;
        T result = caseenum_decl(enum_decl);
        if (result == null) result = caseinput_value(enum_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_SECTION:
      {
        input_section input_section = (input_section)theEObject;
        T result = caseinput_section(input_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.BOOL:
      {
        bool bool = (bool)theEObject;
        T result = casebool(bool);
        if (result == null) result = casedatatype(bool);
        if (result == null) result = caseinput_value(bool);
        if (result == null) result = caseoutfield_decl(bool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INT_VAR:
      {
        int_var int_var = (int_var)theEObject;
        T result = caseint_var(int_var);
        if (result == null) result = casedatatype(int_var);
        if (result == null) result = caseinput_value(int_var);
        if (result == null) result = caseoutfield_decl(int_var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.STRING_VAR:
      {
        string_var string_var = (string_var)theEObject;
        T result = casestring_var(string_var);
        if (result == null) result = casedatatype(string_var);
        if (result == null) result = caseinput_value(string_var);
        if (result == null) result = caseoutfield_decl(string_var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RECORD:
      {
        record record = (record)theEObject;
        T result = caserecord(record);
        if (result == null) result = casedatatype(record);
        if (result == null) result = caseinput_value(record);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.DATASET:
      {
        dataset dataset = (dataset)theEObject;
        T result = casedataset(dataset);
        if (result == null) result = casedatatype(dataset);
        if (result == null) result = caseinput_value(dataset);
        if (result == null) result = caseoutput_value(dataset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GROUP:
      {
        group group = (group)theEObject;
        T result = casegroup(group);
        if (result == null) result = caseinput_value(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.DATATYPE:
      {
        datatype datatype = (datatype)theEObject;
        T result = casedatatype(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_VALUE:
      {
        input_value input_value = (input_value)theEObject;
        T result = caseinput_value(input_value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_OPTIONS:
      {
        input_options input_options = (input_options)theEObject;
        T result = caseinput_options(input_options);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.INPUT_OPTION:
      {
        input_option input_option = (input_option)theEObject;
        T result = caseinput_option(input_option);
        if (result == null) result = caseinput_options(input_option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_SECTION:
      {
        output_section output_section = (output_section)theEObject;
        T result = caseoutput_section(output_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTFIELD_DECL:
      {
        outfield_decl outfield_decl = (outfield_decl)theEObject;
        T result = caseoutfield_decl(outfield_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_INTEGER:
      {
        ecl_integer ecl_integer = (ecl_integer)theEObject;
        T result = caseecl_integer(ecl_integer);
        if (result == null) result = caseeclfield_type(ecl_integer);
        if (result == null) result = caseecloutput_decl(ecl_integer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_UNSIGNED:
      {
        ecl_unsigned ecl_unsigned = (ecl_unsigned)theEObject;
        T result = caseecl_unsigned(ecl_unsigned);
        if (result == null) result = caseeclfield_type(ecl_unsigned);
        if (result == null) result = caseecloutput_decl(ecl_unsigned);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_STRING:
      {
        ecl_string ecl_string = (ecl_string)theEObject;
        T result = caseecl_string(ecl_string);
        if (result == null) result = caseeclfield_type(ecl_string);
        if (result == null) result = caseecloutput_decl(ecl_string);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_QSTRING:
      {
        ecl_qstring ecl_qstring = (ecl_qstring)theEObject;
        T result = caseecl_qstring(ecl_qstring);
        if (result == null) result = caseeclfield_type(ecl_qstring);
        if (result == null) result = caseecloutput_decl(ecl_qstring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_VARSTRING:
      {
        ecl_varstring ecl_varstring = (ecl_varstring)theEObject;
        T result = caseecl_varstring(ecl_varstring);
        if (result == null) result = caseeclfield_type(ecl_varstring);
        if (result == null) result = caseecloutput_decl(ecl_varstring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_UNICODE:
      {
        ecl_unicode ecl_unicode = (ecl_unicode)theEObject;
        T result = caseecl_unicode(ecl_unicode);
        if (result == null) result = caseeclfield_type(ecl_unicode);
        if (result == null) result = caseecloutput_decl(ecl_unicode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_VARUNICODE:
      {
        ecl_varunicode ecl_varunicode = (ecl_varunicode)theEObject;
        T result = caseecl_varunicode(ecl_varunicode);
        if (result == null) result = caseeclfield_type(ecl_varunicode);
        if (result == null) result = caseecloutput_decl(ecl_varunicode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_DATA:
      {
        ecl_data ecl_data = (ecl_data)theEObject;
        T result = caseecl_data(ecl_data);
        if (result == null) result = caseeclfield_type(ecl_data);
        if (result == null) result = caseecloutput_decl(ecl_data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECL_REAL:
      {
        ecl_real ecl_real = (ecl_real)theEObject;
        T result = caseecl_real(ecl_real);
        if (result == null) result = caseeclfield_type(ecl_real);
        if (result == null) result = caseecloutput_decl(ecl_real);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECLFIELD_TYPE:
      {
        eclfield_type eclfield_type = (eclfield_type)theEObject;
        T result = caseeclfield_type(eclfield_type);
        if (result == null) result = caseecloutput_decl(eclfield_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.ECLOUTPUT_DECL:
      {
        ecloutput_decl ecloutput_decl = (ecloutput_decl)theEObject;
        T result = caseecloutput_decl(ecloutput_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_OPTION:
      {
        output_option output_option = (output_option)theEObject;
        T result = caseoutput_option(output_option);
        if (result == null) result = caseoutput_options(output_option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_OPTIONS:
      {
        output_options output_options = (output_options)theEObject;
        T result = caseoutput_options(output_options);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUT_TYPE:
      {
        out_type out_type = (out_type)theEObject;
        T result = caseout_type(out_type);
        if (result == null) result = caseoutput_value(out_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUT_VALUE:
      {
        output_value output_value = (output_value)theEObject;
        T result = caseoutput_value(output_value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.OUTPUTBASE:
      {
        outputbase outputbase = (outputbase)theEObject;
        T result = caseoutputbase(outputbase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GENERATE_SECTION:
      {
        generate_section generate_section = (generate_section)theEObject;
        T result = casegenerate_section(generate_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GENERATE_BODY_INLINE:
      {
        generate_body_inline generate_body_inline = (generate_body_inline)theEObject;
        T result = casegenerate_body_inline(generate_body_inline);
        if (result == null) result = casegenerate_section(generate_body_inline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.GENERATE_BODY_SALT:
      {
        generate_body_salt generate_body_salt = (generate_body_salt)theEObject;
        T result = casegenerate_body_salt(generate_body_salt);
        if (result == null) result = casegenerate_section(generate_body_salt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_SECTION:
      {
        visual_section visual_section = (visual_section)theEObject;
        T result = casevisual_section(visual_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUALIZATION:
      {
        visualization visualization = (visualization)theEObject;
        T result = casevisualization(visualization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIS_BASIS:
      {
        vis_basis vis_basis = (vis_basis)theEObject;
        T result = casevis_basis(vis_basis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VIS_BASIS_QUALIFIERS:
      {
        vis_basis_qualifiers vis_basis_qualifiers = (vis_basis_qualifiers)theEObject;
        T result = casevis_basis_qualifiers(vis_basis_qualifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.FUNCTION:
      {
        function function = (function)theEObject;
        T result = casefunction(function);
        if (result == null) result = casevis_basis_qualifiers(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_SECTION_OPTIONS:
      {
        visual_section_options visual_section_options = (visual_section_options)theEObject;
        T result = casevisual_section_options(visual_section_options);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_SECTION_OPTION:
      {
        visual_section_option visual_section_option = (visual_section_option)theEObject;
        T result = casevisual_section_option(visual_section_option);
        if (result == null) result = casevisual_section_options(visual_section_option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_OPTIONS:
      {
        visual_options visual_options = (visual_options)theEObject;
        T result = casevisual_options(visual_options);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_OPTION:
      {
        visual_option visual_option = (visual_option)theEObject;
        T result = casevisual_option(visual_option);
        if (result == null) result = casevisual_options(visual_option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.VISUAL_MULTIVAL:
      {
        visual_multival visual_multival = (visual_multival)theEObject;
        T result = casevisual_multival(visual_multival);
        if (result == null) result = casevisual_option(visual_multival);
        if (result == null) result = casevisual_options(visual_multival);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CUSTOM_SECTION:
      {
        custom_section custom_section = (custom_section)theEObject;
        T result = casecustom_section(custom_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.CUSTOM_VALUE:
      {
        custom_value custom_value = (custom_value)theEObject;
        T result = casecustom_value(custom_value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_OPTION:
      {
        resource_option resource_option = (resource_option)theEObject;
        T result = caseresource_option(resource_option);
        if (result == null) result = caseresource_options(resource_option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_OPTIONS:
      {
        resource_options resource_options = (resource_options)theEObject;
        T result = caseresource_options(resource_options);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_VALUE:
      {
        resource_value resource_value = (resource_value)theEObject;
        T result = caseresource_value(resource_value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HIPIEPackage.RESOURCE_SECTION:
      {
        resource_section resource_section = (resource_section)theEObject;
        T result = caseresource_section(resource_section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprogram(program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>base prop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>base prop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebase_prop(base_prop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>category type list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>category type list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecategory_type_list(category_type_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevalue(value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>value list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>value list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevalue_list(value_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassign(assign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assign list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assign list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassign_list(assign_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>composition header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>composition header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecomposition_header(composition_header object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>contract instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>contract instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecontract_instance(contract_instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>field decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefield_decl(field_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enum decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enum decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenum_decl(enum_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>input section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>input section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinput_section(input_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebool(bool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>int var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>int var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseint_var(int_var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>string var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>string var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestring_var(string_var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>record</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>record</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserecord(record object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>dataset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>dataset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedataset(dataset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegroup(group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedatatype(datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>input value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>input value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinput_value(input_value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>input options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>input options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinput_options(input_options object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>input option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>input option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinput_option(input_option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>output section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>output section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoutput_section(output_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>outfield decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>outfield decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoutfield_decl(outfield_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_integer(ecl_integer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl unsigned</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl unsigned</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_unsigned(ecl_unsigned object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl string</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl string</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_string(ecl_string object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl qstring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl qstring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_qstring(ecl_qstring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl varstring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl varstring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_varstring(ecl_varstring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl unicode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl unicode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_unicode(ecl_unicode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl varunicode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl varunicode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_varunicode(ecl_varunicode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_data(ecl_data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecl real</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecl real</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecl_real(ecl_real object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>eclfield type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>eclfield type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseeclfield_type(eclfield_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ecloutput decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ecloutput decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseecloutput_decl(ecloutput_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>output option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>output option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoutput_option(output_option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>output options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>output options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoutput_options(output_options object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>out type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>out type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseout_type(out_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>output value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>output value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoutput_value(output_value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>outputbase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>outputbase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoutputbase(outputbase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>generate section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>generate section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegenerate_section(generate_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>generate body inline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>generate body inline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegenerate_body_inline(generate_body_inline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>generate body salt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>generate body salt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegenerate_body_salt(generate_body_salt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>visual section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>visual section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevisual_section(visual_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>visualization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>visualization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevisualization(visualization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>vis basis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>vis basis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevis_basis(vis_basis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>vis basis qualifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>vis basis qualifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevis_basis_qualifiers(vis_basis_qualifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction(function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>visual section options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>visual section options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevisual_section_options(visual_section_options object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>visual section option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>visual section option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevisual_section_option(visual_section_option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>visual options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>visual options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevisual_options(visual_options object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>visual option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>visual option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevisual_option(visual_option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>visual multival</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>visual multival</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevisual_multival(visual_multival object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>custom section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>custom section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecustom_section(custom_section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>custom value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>custom value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecustom_value(custom_value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>resource option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>resource option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseresource_option(resource_option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>resource options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>resource options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseresource_options(resource_options object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>resource value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>resource value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseresource_value(resource_value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>resource section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>resource section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseresource_section(resource_section object)
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
