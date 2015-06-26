/**
 */
package org.xtext.hipie.hIPIE.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.hipie.hIPIE.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.hipie.hIPIE.HIPIEPackage
 * @generated
 */
public class HIPIEAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HIPIEPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HIPIEAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = HIPIEPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HIPIESwitch<Adapter> modelSwitch =
    new HIPIESwitch<Adapter>()
    {
      @Override
      public Adapter caseprogram(program object)
      {
        return createprogramAdapter();
      }
      @Override
      public Adapter casebase_prop(base_prop object)
      {
        return createbase_propAdapter();
      }
      @Override
      public Adapter casecategory_type_list(category_type_list object)
      {
        return createcategory_type_listAdapter();
      }
      @Override
      public Adapter casevalue(value object)
      {
        return createvalueAdapter();
      }
      @Override
      public Adapter casevalue_list(value_list object)
      {
        return createvalue_listAdapter();
      }
      @Override
      public Adapter caseassign(assign object)
      {
        return createassignAdapter();
      }
      @Override
      public Adapter caseassign_list(assign_list object)
      {
        return createassign_listAdapter();
      }
      @Override
      public Adapter casecomposition_header(composition_header object)
      {
        return createcomposition_headerAdapter();
      }
      @Override
      public Adapter casecontract_instance(contract_instance object)
      {
        return createcontract_instanceAdapter();
      }
      @Override
      public Adapter casefield_decl(field_decl object)
      {
        return createfield_declAdapter();
      }
      @Override
      public Adapter caseenum_decl(enum_decl object)
      {
        return createenum_declAdapter();
      }
      @Override
      public Adapter caseinput_section(input_section object)
      {
        return createinput_sectionAdapter();
      }
      @Override
      public Adapter casebool(bool object)
      {
        return createboolAdapter();
      }
      @Override
      public Adapter caseint_var(int_var object)
      {
        return createint_varAdapter();
      }
      @Override
      public Adapter casestring_var(string_var object)
      {
        return createstring_varAdapter();
      }
      @Override
      public Adapter caserecord(record object)
      {
        return createrecordAdapter();
      }
      @Override
      public Adapter casedataset(dataset object)
      {
        return createdatasetAdapter();
      }
      @Override
      public Adapter casegroup(group object)
      {
        return creategroupAdapter();
      }
      @Override
      public Adapter casedatatype(datatype object)
      {
        return createdatatypeAdapter();
      }
      @Override
      public Adapter caseinput_value(input_value object)
      {
        return createinput_valueAdapter();
      }
      @Override
      public Adapter caseinput_options(input_options object)
      {
        return createinput_optionsAdapter();
      }
      @Override
      public Adapter caseinput_option(input_option object)
      {
        return createinput_optionAdapter();
      }
      @Override
      public Adapter caseoutput_section(output_section object)
      {
        return createoutput_sectionAdapter();
      }
      @Override
      public Adapter caseoutfield_decl(outfield_decl object)
      {
        return createoutfield_declAdapter();
      }
      @Override
      public Adapter caseecl_integer(ecl_integer object)
      {
        return createecl_integerAdapter();
      }
      @Override
      public Adapter caseecl_unsigned(ecl_unsigned object)
      {
        return createecl_unsignedAdapter();
      }
      @Override
      public Adapter caseecl_string(ecl_string object)
      {
        return createecl_stringAdapter();
      }
      @Override
      public Adapter caseecl_qstring(ecl_qstring object)
      {
        return createecl_qstringAdapter();
      }
      @Override
      public Adapter caseecl_varstring(ecl_varstring object)
      {
        return createecl_varstringAdapter();
      }
      @Override
      public Adapter caseecl_unicode(ecl_unicode object)
      {
        return createecl_unicodeAdapter();
      }
      @Override
      public Adapter caseecl_varunicode(ecl_varunicode object)
      {
        return createecl_varunicodeAdapter();
      }
      @Override
      public Adapter caseecl_data(ecl_data object)
      {
        return createecl_dataAdapter();
      }
      @Override
      public Adapter caseecl_real(ecl_real object)
      {
        return createecl_realAdapter();
      }
      @Override
      public Adapter caseeclfield_type(eclfield_type object)
      {
        return createeclfield_typeAdapter();
      }
      @Override
      public Adapter caseecloutput_decl(ecloutput_decl object)
      {
        return createecloutput_declAdapter();
      }
      @Override
      public Adapter caseoutput_option(output_option object)
      {
        return createoutput_optionAdapter();
      }
      @Override
      public Adapter caseoutput_options(output_options object)
      {
        return createoutput_optionsAdapter();
      }
      @Override
      public Adapter caseout_type(out_type object)
      {
        return createout_typeAdapter();
      }
      @Override
      public Adapter caseoutput_value(output_value object)
      {
        return createoutput_valueAdapter();
      }
      @Override
      public Adapter caseoutputbase(outputbase object)
      {
        return createoutputbaseAdapter();
      }
      @Override
      public Adapter casegenerate_section(generate_section object)
      {
        return creategenerate_sectionAdapter();
      }
      @Override
      public Adapter casegenerate_body_inline(generate_body_inline object)
      {
        return creategenerate_body_inlineAdapter();
      }
      @Override
      public Adapter casegenerate_body_salt(generate_body_salt object)
      {
        return creategenerate_body_saltAdapter();
      }
      @Override
      public Adapter casevisual_section(visual_section object)
      {
        return createvisual_sectionAdapter();
      }
      @Override
      public Adapter casevisualization(visualization object)
      {
        return createvisualizationAdapter();
      }
      @Override
      public Adapter casevis_basis(vis_basis object)
      {
        return createvis_basisAdapter();
      }
      @Override
      public Adapter casevis_basis_qualifiers(vis_basis_qualifiers object)
      {
        return createvis_basis_qualifiersAdapter();
      }
      @Override
      public Adapter casefunction(function object)
      {
        return createfunctionAdapter();
      }
      @Override
      public Adapter casevisual_section_options(visual_section_options object)
      {
        return createvisual_section_optionsAdapter();
      }
      @Override
      public Adapter casevisual_section_option(visual_section_option object)
      {
        return createvisual_section_optionAdapter();
      }
      @Override
      public Adapter casevisual_options(visual_options object)
      {
        return createvisual_optionsAdapter();
      }
      @Override
      public Adapter casevisual_option(visual_option object)
      {
        return createvisual_optionAdapter();
      }
      @Override
      public Adapter casevisual_multival(visual_multival object)
      {
        return createvisual_multivalAdapter();
      }
      @Override
      public Adapter casecustom_section(custom_section object)
      {
        return createcustom_sectionAdapter();
      }
      @Override
      public Adapter casecustom_value(custom_value object)
      {
        return createcustom_valueAdapter();
      }
      @Override
      public Adapter caseresource_option(resource_option object)
      {
        return createresource_optionAdapter();
      }
      @Override
      public Adapter caseresource_options(resource_options object)
      {
        return createresource_optionsAdapter();
      }
      @Override
      public Adapter caseresource_value(resource_value object)
      {
        return createresource_valueAdapter();
      }
      @Override
      public Adapter caseresource_section(resource_section object)
      {
        return createresource_sectionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.program <em>program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.program
   * @generated
   */
  public Adapter createprogramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.base_prop <em>base prop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.base_prop
   * @generated
   */
  public Adapter createbase_propAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.category_type_list <em>category type list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.category_type_list
   * @generated
   */
  public Adapter createcategory_type_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.value <em>value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.value
   * @generated
   */
  public Adapter createvalueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.value_list <em>value list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.value_list
   * @generated
   */
  public Adapter createvalue_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.assign <em>assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.assign
   * @generated
   */
  public Adapter createassignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.assign_list <em>assign list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.assign_list
   * @generated
   */
  public Adapter createassign_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.composition_header <em>composition header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.composition_header
   * @generated
   */
  public Adapter createcomposition_headerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.contract_instance <em>contract instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.contract_instance
   * @generated
   */
  public Adapter createcontract_instanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.field_decl <em>field decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.field_decl
   * @generated
   */
  public Adapter createfield_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.enum_decl <em>enum decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.enum_decl
   * @generated
   */
  public Adapter createenum_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.input_section <em>input section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.input_section
   * @generated
   */
  public Adapter createinput_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.bool <em>bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.bool
   * @generated
   */
  public Adapter createboolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.int_var <em>int var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.int_var
   * @generated
   */
  public Adapter createint_varAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.string_var <em>string var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.string_var
   * @generated
   */
  public Adapter createstring_varAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.record <em>record</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.record
   * @generated
   */
  public Adapter createrecordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.dataset <em>dataset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.dataset
   * @generated
   */
  public Adapter createdatasetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.group <em>group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.group
   * @generated
   */
  public Adapter creategroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.datatype <em>datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.datatype
   * @generated
   */
  public Adapter createdatatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.input_value <em>input value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.input_value
   * @generated
   */
  public Adapter createinput_valueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.input_options <em>input options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.input_options
   * @generated
   */
  public Adapter createinput_optionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.input_option <em>input option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.input_option
   * @generated
   */
  public Adapter createinput_optionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.output_section <em>output section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.output_section
   * @generated
   */
  public Adapter createoutput_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.outfield_decl <em>outfield decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.outfield_decl
   * @generated
   */
  public Adapter createoutfield_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_integer <em>ecl integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_integer
   * @generated
   */
  public Adapter createecl_integerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_unsigned <em>ecl unsigned</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_unsigned
   * @generated
   */
  public Adapter createecl_unsignedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_string <em>ecl string</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_string
   * @generated
   */
  public Adapter createecl_stringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_qstring <em>ecl qstring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_qstring
   * @generated
   */
  public Adapter createecl_qstringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_varstring <em>ecl varstring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_varstring
   * @generated
   */
  public Adapter createecl_varstringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_unicode <em>ecl unicode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_unicode
   * @generated
   */
  public Adapter createecl_unicodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_varunicode <em>ecl varunicode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_varunicode
   * @generated
   */
  public Adapter createecl_varunicodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_data <em>ecl data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_data
   * @generated
   */
  public Adapter createecl_dataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecl_real <em>ecl real</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecl_real
   * @generated
   */
  public Adapter createecl_realAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.eclfield_type <em>eclfield type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.eclfield_type
   * @generated
   */
  public Adapter createeclfield_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ecloutput_decl <em>ecloutput decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ecloutput_decl
   * @generated
   */
  public Adapter createecloutput_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.output_option <em>output option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.output_option
   * @generated
   */
  public Adapter createoutput_optionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.output_options <em>output options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.output_options
   * @generated
   */
  public Adapter createoutput_optionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.out_type <em>out type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.out_type
   * @generated
   */
  public Adapter createout_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.output_value <em>output value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.output_value
   * @generated
   */
  public Adapter createoutput_valueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.outputbase <em>outputbase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.outputbase
   * @generated
   */
  public Adapter createoutputbaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.generate_section <em>generate section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.generate_section
   * @generated
   */
  public Adapter creategenerate_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.generate_body_inline <em>generate body inline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.generate_body_inline
   * @generated
   */
  public Adapter creategenerate_body_inlineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.generate_body_salt <em>generate body salt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.generate_body_salt
   * @generated
   */
  public Adapter creategenerate_body_saltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.visual_section <em>visual section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.visual_section
   * @generated
   */
  public Adapter createvisual_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.visualization <em>visualization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.visualization
   * @generated
   */
  public Adapter createvisualizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.vis_basis <em>vis basis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.vis_basis
   * @generated
   */
  public Adapter createvis_basisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.vis_basis_qualifiers <em>vis basis qualifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.vis_basis_qualifiers
   * @generated
   */
  public Adapter createvis_basis_qualifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.function <em>function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.function
   * @generated
   */
  public Adapter createfunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.visual_section_options <em>visual section options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.visual_section_options
   * @generated
   */
  public Adapter createvisual_section_optionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.visual_section_option <em>visual section option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.visual_section_option
   * @generated
   */
  public Adapter createvisual_section_optionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.visual_options <em>visual options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.visual_options
   * @generated
   */
  public Adapter createvisual_optionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.visual_option <em>visual option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.visual_option
   * @generated
   */
  public Adapter createvisual_optionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.visual_multival <em>visual multival</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.visual_multival
   * @generated
   */
  public Adapter createvisual_multivalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.custom_section <em>custom section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.custom_section
   * @generated
   */
  public Adapter createcustom_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.custom_value <em>custom value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.custom_value
   * @generated
   */
  public Adapter createcustom_valueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.resource_option <em>resource option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.resource_option
   * @generated
   */
  public Adapter createresource_optionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.resource_options <em>resource options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.resource_options
   * @generated
   */
  public Adapter createresource_optionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.resource_value <em>resource value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.resource_value
   * @generated
   */
  public Adapter createresource_valueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.resource_section <em>resource section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.resource_section
   * @generated
   */
  public Adapter createresource_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //HIPIEAdapterFactory
