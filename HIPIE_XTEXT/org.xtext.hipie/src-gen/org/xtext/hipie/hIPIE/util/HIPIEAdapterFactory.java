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
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseBaseProp(BaseProp object)
      {
        return createBasePropAdapter();
      }
      @Override
      public Adapter caseCategoryTypeList(CategoryTypeList object)
      {
        return createCategoryTypeListAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseValueList(ValueList object)
      {
        return createValueListAdapter();
      }
      @Override
      public Adapter caseAssign(Assign object)
      {
        return createAssignAdapter();
      }
      @Override
      public Adapter caseAssignList(AssignList object)
      {
        return createAssignListAdapter();
      }
      @Override
      public Adapter caseCompositionHeader(CompositionHeader object)
      {
        return createCompositionHeaderAdapter();
      }
      @Override
      public Adapter caseContractInstance(ContractInstance object)
      {
        return createContractInstanceAdapter();
      }
      @Override
      public Adapter caseFieldDecl(FieldDecl object)
      {
        return createFieldDeclAdapter();
      }
      @Override
      public Adapter caseEnumDecl(EnumDecl object)
      {
        return createEnumDeclAdapter();
      }
      @Override
      public Adapter caseInputSection(InputSection object)
      {
        return createInputSectionAdapter();
      }
      @Override
      public Adapter caseBool(Bool object)
      {
        return createBoolAdapter();
      }
      @Override
      public Adapter caseIntVar(IntVar object)
      {
        return createIntVarAdapter();
      }
      @Override
      public Adapter caseStringVar(StringVar object)
      {
        return createStringVarAdapter();
      }
      @Override
      public Adapter caseRecord(Record object)
      {
        return createRecordAdapter();
      }
      @Override
      public Adapter caseDataset(Dataset object)
      {
        return createDatasetAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter caseDatatype(Datatype object)
      {
        return createDatatypeAdapter();
      }
      @Override
      public Adapter caseInputValue(InputValue object)
      {
        return createInputValueAdapter();
      }
      @Override
      public Adapter caseInputOptions(InputOptions object)
      {
        return createInputOptionsAdapter();
      }
      @Override
      public Adapter caseInputOption(InputOption object)
      {
        return createInputOptionAdapter();
      }
      @Override
      public Adapter caseOutputSection(OutputSection object)
      {
        return createOutputSectionAdapter();
      }
      @Override
      public Adapter caseOutfieldDecl(OutfieldDecl object)
      {
        return createOutfieldDeclAdapter();
      }
      @Override
      public Adapter caseECLInteger(ECLInteger object)
      {
        return createECLIntegerAdapter();
      }
      @Override
      public Adapter caseECLUnsigned(ECLUnsigned object)
      {
        return createECLUnsignedAdapter();
      }
      @Override
      public Adapter caseECLString(ECLString object)
      {
        return createECLStringAdapter();
      }
      @Override
      public Adapter caseECLQstring(ECLQstring object)
      {
        return createECLQstringAdapter();
      }
      @Override
      public Adapter caseECLVarstring(ECLVarstring object)
      {
        return createECLVarstringAdapter();
      }
      @Override
      public Adapter caseECLUnicode(ECLUnicode object)
      {
        return createECLUnicodeAdapter();
      }
      @Override
      public Adapter caseECLVarunicode(ECLVarunicode object)
      {
        return createECLVarunicodeAdapter();
      }
      @Override
      public Adapter caseECLData(ECLData object)
      {
        return createECLDataAdapter();
      }
      @Override
      public Adapter caseECLReal(ECLReal object)
      {
        return createECLRealAdapter();
      }
      @Override
      public Adapter caseECLfieldType(ECLfieldType object)
      {
        return createECLfieldTypeAdapter();
      }
      @Override
      public Adapter casePosVizData(PosVizData object)
      {
        return createPosVizDataAdapter();
      }
      @Override
      public Adapter caseECLOutputDecl(ECLOutputDecl object)
      {
        return createECLOutputDeclAdapter();
      }
      @Override
      public Adapter caseOutputOption(OutputOption object)
      {
        return createOutputOptionAdapter();
      }
      @Override
      public Adapter caseOutputOptions(OutputOptions object)
      {
        return createOutputOptionsAdapter();
      }
      @Override
      public Adapter caseOutType(OutType object)
      {
        return createOutTypeAdapter();
      }
      @Override
      public Adapter caseOutDataset(OutDataset object)
      {
        return createOutDatasetAdapter();
      }
      @Override
      public Adapter caseOutputValue(OutputValue object)
      {
        return createOutputValueAdapter();
      }
      @Override
      public Adapter caseOutputBase(OutputBase object)
      {
        return createOutputBaseAdapter();
      }
      @Override
      public Adapter caseGenerateSection(GenerateSection object)
      {
        return createGenerateSectionAdapter();
      }
      @Override
      public Adapter caseGenerateBodyInline(GenerateBodyInline object)
      {
        return createGenerateBodyInlineAdapter();
      }
      @Override
      public Adapter caseGenerateBodySalt(GenerateBodySalt object)
      {
        return createGenerateBodySaltAdapter();
      }
      @Override
      public Adapter caseVisualSection(VisualSection object)
      {
        return createVisualSectionAdapter();
      }
      @Override
      public Adapter caseVisualization(Visualization object)
      {
        return createVisualizationAdapter();
      }
      @Override
      public Adapter caseVisBasis(VisBasis object)
      {
        return createVisBasisAdapter();
      }
      @Override
      public Adapter caseVisBasisQualifiers(VisBasisQualifiers object)
      {
        return createVisBasisQualifiersAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseVisualSectionOptions(VisualSectionOptions object)
      {
        return createVisualSectionOptionsAdapter();
      }
      @Override
      public Adapter caseVisualSectionOption(VisualSectionOption object)
      {
        return createVisualSectionOptionAdapter();
      }
      @Override
      public Adapter caseVisualOptions(VisualOptions object)
      {
        return createVisualOptionsAdapter();
      }
      @Override
      public Adapter caseVisualOption(VisualOption object)
      {
        return createVisualOptionAdapter();
      }
      @Override
      public Adapter caseVisualMultival(VisualMultival object)
      {
        return createVisualMultivalAdapter();
      }
      @Override
      public Adapter caseCustomSection(CustomSection object)
      {
        return createCustomSectionAdapter();
      }
      @Override
      public Adapter caseCustomValue(CustomValue object)
      {
        return createCustomValueAdapter();
      }
      @Override
      public Adapter caseResourceOption(ResourceOption object)
      {
        return createResourceOptionAdapter();
      }
      @Override
      public Adapter caseResourceOptions(ResourceOptions object)
      {
        return createResourceOptionsAdapter();
      }
      @Override
      public Adapter caseResourceValue(ResourceValue object)
      {
        return createResourceValueAdapter();
      }
      @Override
      public Adapter caseResourceSection(ResourceSection object)
      {
        return createResourceSectionAdapter();
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
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.BaseProp <em>Base Prop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.BaseProp
   * @generated
   */
  public Adapter createBasePropAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.CategoryTypeList <em>Category Type List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.CategoryTypeList
   * @generated
   */
  public Adapter createCategoryTypeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ValueList <em>Value List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ValueList
   * @generated
   */
  public Adapter createValueListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Assign
   * @generated
   */
  public Adapter createAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.AssignList <em>Assign List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.AssignList
   * @generated
   */
  public Adapter createAssignListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.CompositionHeader <em>Composition Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.CompositionHeader
   * @generated
   */
  public Adapter createCompositionHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ContractInstance <em>Contract Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ContractInstance
   * @generated
   */
  public Adapter createContractInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.FieldDecl <em>Field Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.FieldDecl
   * @generated
   */
  public Adapter createFieldDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.EnumDecl <em>Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.EnumDecl
   * @generated
   */
  public Adapter createEnumDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.InputSection <em>Input Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.InputSection
   * @generated
   */
  public Adapter createInputSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Bool
   * @generated
   */
  public Adapter createBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.IntVar <em>Int Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.IntVar
   * @generated
   */
  public Adapter createIntVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.StringVar <em>String Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.StringVar
   * @generated
   */
  public Adapter createStringVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Record <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Record
   * @generated
   */
  public Adapter createRecordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Dataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Dataset
   * @generated
   */
  public Adapter createDatasetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Datatype
   * @generated
   */
  public Adapter createDatatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.InputValue <em>Input Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.InputValue
   * @generated
   */
  public Adapter createInputValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.InputOptions <em>Input Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.InputOptions
   * @generated
   */
  public Adapter createInputOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.InputOption <em>Input Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.InputOption
   * @generated
   */
  public Adapter createInputOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.OutputSection <em>Output Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.OutputSection
   * @generated
   */
  public Adapter createOutputSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.OutfieldDecl <em>Outfield Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.OutfieldDecl
   * @generated
   */
  public Adapter createOutfieldDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLInteger <em>ECL Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLInteger
   * @generated
   */
  public Adapter createECLIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLUnsigned <em>ECL Unsigned</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLUnsigned
   * @generated
   */
  public Adapter createECLUnsignedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLString <em>ECL String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLString
   * @generated
   */
  public Adapter createECLStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLQstring <em>ECL Qstring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLQstring
   * @generated
   */
  public Adapter createECLQstringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLVarstring <em>ECL Varstring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLVarstring
   * @generated
   */
  public Adapter createECLVarstringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLUnicode <em>ECL Unicode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLUnicode
   * @generated
   */
  public Adapter createECLUnicodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLVarunicode <em>ECL Varunicode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLVarunicode
   * @generated
   */
  public Adapter createECLVarunicodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLData <em>ECL Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLData
   * @generated
   */
  public Adapter createECLDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLReal <em>ECL Real</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLReal
   * @generated
   */
  public Adapter createECLRealAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLfieldType <em>EC Lfield Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLfieldType
   * @generated
   */
  public Adapter createECLfieldTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.PosVizData <em>Pos Viz Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.PosVizData
   * @generated
   */
  public Adapter createPosVizDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ECLOutputDecl <em>ECL Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ECLOutputDecl
   * @generated
   */
  public Adapter createECLOutputDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.OutputOption <em>Output Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.OutputOption
   * @generated
   */
  public Adapter createOutputOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.OutputOptions <em>Output Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.OutputOptions
   * @generated
   */
  public Adapter createOutputOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.OutType <em>Out Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.OutType
   * @generated
   */
  public Adapter createOutTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.OutDataset <em>Out Dataset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.OutDataset
   * @generated
   */
  public Adapter createOutDatasetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.OutputValue <em>Output Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.OutputValue
   * @generated
   */
  public Adapter createOutputValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.OutputBase <em>Output Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.OutputBase
   * @generated
   */
  public Adapter createOutputBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.GenerateSection <em>Generate Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.GenerateSection
   * @generated
   */
  public Adapter createGenerateSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.GenerateBodyInline <em>Generate Body Inline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.GenerateBodyInline
   * @generated
   */
  public Adapter createGenerateBodyInlineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.GenerateBodySalt <em>Generate Body Salt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.GenerateBodySalt
   * @generated
   */
  public Adapter createGenerateBodySaltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.VisualSection <em>Visual Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.VisualSection
   * @generated
   */
  public Adapter createVisualSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Visualization <em>Visualization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Visualization
   * @generated
   */
  public Adapter createVisualizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.VisBasis <em>Vis Basis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.VisBasis
   * @generated
   */
  public Adapter createVisBasisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.VisBasisQualifiers <em>Vis Basis Qualifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.VisBasisQualifiers
   * @generated
   */
  public Adapter createVisBasisQualifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.VisualSectionOptions <em>Visual Section Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.VisualSectionOptions
   * @generated
   */
  public Adapter createVisualSectionOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.VisualSectionOption <em>Visual Section Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.VisualSectionOption
   * @generated
   */
  public Adapter createVisualSectionOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.VisualOptions <em>Visual Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.VisualOptions
   * @generated
   */
  public Adapter createVisualOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.VisualOption <em>Visual Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.VisualOption
   * @generated
   */
  public Adapter createVisualOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.VisualMultival <em>Visual Multival</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.VisualMultival
   * @generated
   */
  public Adapter createVisualMultivalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.CustomSection <em>Custom Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.CustomSection
   * @generated
   */
  public Adapter createCustomSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.CustomValue <em>Custom Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.CustomValue
   * @generated
   */
  public Adapter createCustomValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ResourceOption <em>Resource Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ResourceOption
   * @generated
   */
  public Adapter createResourceOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ResourceOptions <em>Resource Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ResourceOptions
   * @generated
   */
  public Adapter createResourceOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ResourceValue <em>Resource Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ResourceValue
   * @generated
   */
  public Adapter createResourceValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.hipie.hIPIE.ResourceSection <em>Resource Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.hipie.hIPIE.ResourceSection
   * @generated
   */
  public Adapter createResourceSectionAdapter()
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
