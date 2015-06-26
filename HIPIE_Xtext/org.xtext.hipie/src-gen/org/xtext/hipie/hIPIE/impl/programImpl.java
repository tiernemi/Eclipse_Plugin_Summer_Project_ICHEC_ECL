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

import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.base_prop;
import org.xtext.hipie.hIPIE.composition_header;
import org.xtext.hipie.hIPIE.contract_instance;
import org.xtext.hipie.hIPIE.custom_section;
import org.xtext.hipie.hIPIE.generate_section;
import org.xtext.hipie.hIPIE.input_section;
import org.xtext.hipie.hIPIE.output_section;
import org.xtext.hipie.hIPIE.program;
import org.xtext.hipie.hIPIE.resource_section;
import org.xtext.hipie.hIPIE.visual_section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getComposition_Header <em>Composition Header</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getBase_Props <em>Base Props</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getContract_Instances <em>Contract Instances</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getInput_Section <em>Input Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getOutput_Section <em>Output Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getVisual_Section <em>Visual Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getGenerate_Section <em>Generate Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getCustom_Section <em>Custom Section</em>}</li>
 *   <li>{@link org.xtext.hipie.hIPIE.impl.programImpl#getResource_Section <em>Resource Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class programImpl extends MinimalEObjectImpl.Container implements program
{
  /**
   * The cached value of the '{@link #getComposition_Header() <em>Composition Header</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition_Header()
   * @generated
   * @ordered
   */
  protected EList<composition_header> composition_Header;

  /**
   * The cached value of the '{@link #getBase_Props() <em>Base Props</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase_Props()
   * @generated
   * @ordered
   */
  protected EList<base_prop> base_Props;

  /**
   * The cached value of the '{@link #getContract_Instances() <em>Contract Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContract_Instances()
   * @generated
   * @ordered
   */
  protected EList<contract_instance> contract_Instances;

  /**
   * The cached value of the '{@link #getInput_Section() <em>Input Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput_Section()
   * @generated
   * @ordered
   */
  protected EList<input_section> input_Section;

  /**
   * The cached value of the '{@link #getOutput_Section() <em>Output Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput_Section()
   * @generated
   * @ordered
   */
  protected EList<output_section> output_Section;

  /**
   * The cached value of the '{@link #getVisual_Section() <em>Visual Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisual_Section()
   * @generated
   * @ordered
   */
  protected EList<visual_section> visual_Section;

  /**
   * The cached value of the '{@link #getGenerate_Section() <em>Generate Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerate_Section()
   * @generated
   * @ordered
   */
  protected EList<generate_section> generate_Section;

  /**
   * The cached value of the '{@link #getCustom_Section() <em>Custom Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustom_Section()
   * @generated
   * @ordered
   */
  protected EList<custom_section> custom_Section;

  /**
   * The cached value of the '{@link #getResource_Section() <em>Resource Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource_Section()
   * @generated
   * @ordered
   */
  protected EList<resource_section> resource_Section;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected programImpl()
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
  public EList<composition_header> getComposition_Header()
  {
    if (composition_Header == null)
    {
      composition_Header = new EObjectContainmentEList<composition_header>(composition_header.class, this, HIPIEPackage.PROGRAM__COMPOSITION_HEADER);
    }
    return composition_Header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<base_prop> getBase_Props()
  {
    if (base_Props == null)
    {
      base_Props = new EObjectContainmentEList<base_prop>(base_prop.class, this, HIPIEPackage.PROGRAM__BASE_PROPS);
    }
    return base_Props;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<contract_instance> getContract_Instances()
  {
    if (contract_Instances == null)
    {
      contract_Instances = new EObjectContainmentEList<contract_instance>(contract_instance.class, this, HIPIEPackage.PROGRAM__CONTRACT_INSTANCES);
    }
    return contract_Instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<input_section> getInput_Section()
  {
    if (input_Section == null)
    {
      input_Section = new EObjectContainmentEList<input_section>(input_section.class, this, HIPIEPackage.PROGRAM__INPUT_SECTION);
    }
    return input_Section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<output_section> getOutput_Section()
  {
    if (output_Section == null)
    {
      output_Section = new EObjectContainmentEList<output_section>(output_section.class, this, HIPIEPackage.PROGRAM__OUTPUT_SECTION);
    }
    return output_Section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<visual_section> getVisual_Section()
  {
    if (visual_Section == null)
    {
      visual_Section = new EObjectContainmentEList<visual_section>(visual_section.class, this, HIPIEPackage.PROGRAM__VISUAL_SECTION);
    }
    return visual_Section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<generate_section> getGenerate_Section()
  {
    if (generate_Section == null)
    {
      generate_Section = new EObjectContainmentEList<generate_section>(generate_section.class, this, HIPIEPackage.PROGRAM__GENERATE_SECTION);
    }
    return generate_Section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<custom_section> getCustom_Section()
  {
    if (custom_Section == null)
    {
      custom_Section = new EObjectContainmentEList<custom_section>(custom_section.class, this, HIPIEPackage.PROGRAM__CUSTOM_SECTION);
    }
    return custom_Section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<resource_section> getResource_Section()
  {
    if (resource_Section == null)
    {
      resource_Section = new EObjectContainmentEList<resource_section>(resource_section.class, this, HIPIEPackage.PROGRAM__RESOURCE_SECTION);
    }
    return resource_Section;
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
        return ((InternalEList<?>)getComposition_Header()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        return ((InternalEList<?>)getBase_Props()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        return ((InternalEList<?>)getContract_Instances()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        return ((InternalEList<?>)getInput_Section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        return ((InternalEList<?>)getOutput_Section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        return ((InternalEList<?>)getVisual_Section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        return ((InternalEList<?>)getGenerate_Section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        return ((InternalEList<?>)getCustom_Section()).basicRemove(otherEnd, msgs);
      case HIPIEPackage.PROGRAM__RESOURCE_SECTION:
        return ((InternalEList<?>)getResource_Section()).basicRemove(otherEnd, msgs);
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
        return getComposition_Header();
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        return getBase_Props();
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        return getContract_Instances();
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        return getInput_Section();
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        return getOutput_Section();
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        return getVisual_Section();
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        return getGenerate_Section();
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        return getCustom_Section();
      case HIPIEPackage.PROGRAM__RESOURCE_SECTION:
        return getResource_Section();
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
        getComposition_Header().clear();
        getComposition_Header().addAll((Collection<? extends composition_header>)newValue);
        return;
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        getBase_Props().clear();
        getBase_Props().addAll((Collection<? extends base_prop>)newValue);
        return;
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        getContract_Instances().clear();
        getContract_Instances().addAll((Collection<? extends contract_instance>)newValue);
        return;
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        getInput_Section().clear();
        getInput_Section().addAll((Collection<? extends input_section>)newValue);
        return;
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        getOutput_Section().clear();
        getOutput_Section().addAll((Collection<? extends output_section>)newValue);
        return;
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        getVisual_Section().clear();
        getVisual_Section().addAll((Collection<? extends visual_section>)newValue);
        return;
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        getGenerate_Section().clear();
        getGenerate_Section().addAll((Collection<? extends generate_section>)newValue);
        return;
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        getCustom_Section().clear();
        getCustom_Section().addAll((Collection<? extends custom_section>)newValue);
        return;
      case HIPIEPackage.PROGRAM__RESOURCE_SECTION:
        getResource_Section().clear();
        getResource_Section().addAll((Collection<? extends resource_section>)newValue);
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
        getComposition_Header().clear();
        return;
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        getBase_Props().clear();
        return;
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        getContract_Instances().clear();
        return;
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        getInput_Section().clear();
        return;
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        getOutput_Section().clear();
        return;
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        getVisual_Section().clear();
        return;
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        getGenerate_Section().clear();
        return;
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        getCustom_Section().clear();
        return;
      case HIPIEPackage.PROGRAM__RESOURCE_SECTION:
        getResource_Section().clear();
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
        return composition_Header != null && !composition_Header.isEmpty();
      case HIPIEPackage.PROGRAM__BASE_PROPS:
        return base_Props != null && !base_Props.isEmpty();
      case HIPIEPackage.PROGRAM__CONTRACT_INSTANCES:
        return contract_Instances != null && !contract_Instances.isEmpty();
      case HIPIEPackage.PROGRAM__INPUT_SECTION:
        return input_Section != null && !input_Section.isEmpty();
      case HIPIEPackage.PROGRAM__OUTPUT_SECTION:
        return output_Section != null && !output_Section.isEmpty();
      case HIPIEPackage.PROGRAM__VISUAL_SECTION:
        return visual_Section != null && !visual_Section.isEmpty();
      case HIPIEPackage.PROGRAM__GENERATE_SECTION:
        return generate_Section != null && !generate_Section.isEmpty();
      case HIPIEPackage.PROGRAM__CUSTOM_SECTION:
        return custom_Section != null && !custom_Section.isEmpty();
      case HIPIEPackage.PROGRAM__RESOURCE_SECTION:
        return resource_Section != null && !resource_Section.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //programImpl
