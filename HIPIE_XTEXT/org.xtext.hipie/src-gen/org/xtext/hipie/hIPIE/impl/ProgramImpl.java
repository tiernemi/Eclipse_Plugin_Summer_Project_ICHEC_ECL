/**
 */
package org.xtext.hipie.hIPIE.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.hipie.hIPIE.BaseProp;
import org.xtext.hipie.hIPIE.CompositionHeader;
import org.xtext.hipie.hIPIE.ContractInstance;
import org.xtext.hipie.hIPIE.CustomSection;
import org.xtext.hipie.hIPIE.GenerateSection;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.InputSection;
import org.xtext.hipie.hIPIE.OutputSection;
import org.xtext.hipie.hIPIE.Program;
import org.xtext.hipie.hIPIE.ResourceSection;
import org.xtext.hipie.hIPIE.VisualSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getComposition_header <em>Composition header</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getBase_props <em>Base props</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getContract_instances <em>Contract instances</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getInput_section <em>Input section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getOutput_section <em>Output section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getVisual_section <em>Visual section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getGenerate_section <em>Generate section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getCustom_section <em>Custom section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.ProgramImpl#getSesource_section <em>Sesource section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getComposition_header() <em>Composition header</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition_header()
   * @generated
   * @ordered
   */
  protected EList<CompositionHeader> composition_header;

  /**
   * The cached value of the '{@link #getBase_props() <em>Base props</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase_props()
   * @generated
   * @ordered
   */
  protected EList<BaseProp> base_props;

  /**
   * The cached value of the '{@link #getContract_instances() <em>Contract instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContract_instances()
   * @generated
   * @ordered
   */
  protected EList<ContractInstance> contract_instances;

  /**
   * The cached value of the '{@link #getInput_section() <em>Input section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput_section()
   * @generated
   * @ordered
   */
  protected EList<InputSection> input_section;

  /**
   * The cached value of the '{@link #getOutput_section() <em>Output section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput_section()
   * @generated
   * @ordered
   */
  protected EList<OutputSection> output_section;

  /**
   * The cached value of the '{@link #getVisual_section() <em>Visual section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisual_section()
   * @generated
   * @ordered
   */
  protected EList<VisualSection> visual_section;

  /**
   * The cached value of the '{@link #getGenerate_section() <em>Generate section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerate_section()
   * @generated
   * @ordered
   */
  protected EList<GenerateSection> generate_section;

  /**
   * The cached value of the '{@link #getCustom_section() <em>Custom section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustom_section()
   * @generated
   * @ordered
   */
  protected EList<CustomSection> custom_section;

  /**
   * The cached value of the '{@link #getSesource_section() <em>Sesource section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSesource_section()
   * @generated
   * @ordered
   */
  protected EList<ResourceSection> sesource_section;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HIPIEPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompositionHeader> getComposition_header()
  {
    if (composition_header == null)
    {
      composition_header = new EObjectContainmentEList<CompositionHeader>(CompositionHeader.class, this, HIPIEPackage.PROGRAM__COMPOSITION_HEADER);
    }
    return composition_header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BaseProp> getBase_props()
  {
    if (base_props == null)
    {
      base_props = new EObjectContainmentEList<BaseProp>(BaseProp.class, this, HIPIEPackage.PROGRAM__BASE_PROPS);
    }
    return base_props;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractInstance> getContract_instances()
  {
    if (contract_instances == null)
    {
      contract_instances = new EObjectContainmentEList<ContractInstance>(ContractInstance.class, this, HIPIEPackage.PROGRAM__CONTRACT_INSTANCES);
    }
    return contract_instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InputSection> getInput_section()
  {
    if (input_section == null)
    {
      input_section = new EObjectContainmentEList<InputSection>(InputSection.class, this, HIPIEPackage.PROGRAM__INPUT_SECTION);
    }
    return input_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OutputSection> getOutput_section()
  {
    if (output_section == null)
    {
      output_section = new EObjectContainmentEList<OutputSection>(OutputSection.class, this, HIPIEPackage.PROGRAM__OUTPUT_SECTION);
    }
    return output_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VisualSection> getVisual_section()
  {
    if (visual_section == null)
    {
      visual_section = new EObjectContainmentEList<VisualSection>(VisualSection.class, this, HIPIEPackage.PROGRAM__VISUAL_SECTION);
    }
    return visual_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GenerateSection> getGenerate_section()
  {
    if (generate_section == null)
    {
      generate_section = new EObjectContainmentEList<GenerateSection>(GenerateSection.class, this, HIPIEPackage.PROGRAM__GENERATE_SECTION);
    }
    return generate_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CustomSection> getCustom_section()
  {
    if (custom_section == null)
    {
      custom_section = new EObjectContainmentEList<CustomSection>(CustomSection.class, this, HIPIEPackage.PROGRAM__CUSTOM_SECTION);
    }
    return custom_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceSection> getSesource_section()
  {
    if (sesource_section == null)
    {
      sesource_section = new EObjectContainmentEList<ResourceSection>(ResourceSection.class, this, HIPIEPackage.PROGRAM__SESOURCE_SECTION);
    }
    return sesource_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HIPIEPackage.PROGRAM__COMPOSITION_HEADER:
        return ((InternalEList<?>)getComposition_header()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        return ((InternalEList<?>)getBase_props()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        return ((InternalEList<?>)getContract_instances()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        return ((InternalEList<?>)getInput_section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        return ((InternalEList<?>)getOutput_section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        return ((InternalEList<?>)getVisual_section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        return ((InternalEList<?>)getGenerate_section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        return ((InternalEList<?>)getCustom_section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__SESOURCE_SECTION:
        return ((InternalEList<?>)getSesource_section()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HIPIEPackage.PROGRAM__COMPOSITION_HEADER:
        return getComposition_header();
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        return getBase_props();
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        return getContract_instances();
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        return getInput_section();
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        return getOutput_section();
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        return getVisual_section();
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        return getGenerate_section();
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        return getCustom_section();
      case HIPIEPackage.PROGRAM__SESOURCE_SECTION:
        return getSesource_section();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HIPIEPackage.PROGRAM__COMPOSITION_HEADER:
        getComposition_header().clear();
        getComposition_header().addAll((Collection<? extends CompositionHeader>)newValue);
        return;
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        getBase_props().clear();
        getBase_props().addAll((Collection<? extends BaseProp>)newValue);
        return;
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        getContract_instances().clear();
        getContract_instances().addAll((Collection<? extends ContractInstance>)newValue);
        return;
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        getInput_section().clear();
        getInput_section().addAll((Collection<? extends InputSection>)newValue);
        return;
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        getOutput_section().clear();
        getOutput_section().addAll((Collection<? extends OutputSection>)newValue);
        return;
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        getVisual_section().clear();
        getVisual_section().addAll((Collection<? extends VisualSection>)newValue);
        return;
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        getGenerate_section().clear();
        getGenerate_section().addAll((Collection<? extends GenerateSection>)newValue);
        return;
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        getCustom_section().clear();
        getCustom_section().addAll((Collection<? extends CustomSection>)newValue);
        return;
      case HIPIEPackage.PROGRAM__SESOURCE_SECTION:
        getSesource_section().clear();
        getSesource_section().addAll((Collection<? extends ResourceSection>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HIPIEPackage.PROGRAM__COMPOSITION_HEADER:
        getComposition_header().clear();
        return;
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        getBase_props().clear();
        return;
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        getContract_instances().clear();
        return;
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        getInput_section().clear();
        return;
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        getOutput_section().clear();
        return;
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        getVisual_section().clear();
        return;
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        getGenerate_section().clear();
        return;
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        getCustom_section().clear();
        return;
      case HIPIEPackage.PROGRAM__SESOURCE_SECTION:
        getSesource_section().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HIPIEPackage.PROGRAM__COMPOSITION_HEADER:
        return composition_header != null && !composition_header.isEmpty();
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        return base_props != null && !base_props.isEmpty();
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        return contract_instances != null && !contract_instances.isEmpty();
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        return input_section != null && !input_section.isEmpty();
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        return output_section != null && !output_section.isEmpty();
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        return visual_section != null && !visual_section.isEmpty();
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        return generate_section != null && !generate_section.isEmpty();
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        return custom_section != null && !custom_section.isEmpty();
      case HIPIEPackage.PROGRAM__SESOURCE_SECTION:
        return sesource_section != null && !sesource_section.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
