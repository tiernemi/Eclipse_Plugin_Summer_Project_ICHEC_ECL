/**
 * generated by Xtext
 */
package org.xtext.hipie.validation;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.xtext.hipie.hIPIE.BaseProp;
import org.xtext.hipie.hIPIE.HIPIEPackage;
import org.xtext.hipie.hIPIE.Value;
import org.xtext.hipie.hIPIE.ValueList;
import org.xtext.hipie.validation.AbstractHIPIEValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class HIPIEValidator extends AbstractHIPIEValidator {
  public final static String INVALID_NAME = "Argument should be a string.";
  
  @Check
  public void checkIfBPString(final BaseProp base) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    String _name = base.getName();
    boolean _equals = Objects.equal(_name, "LABEL");
    if (_equals) {
      _or_3 = true;
    } else {
      String _name_1 = base.getName();
      boolean _equals_1 = Objects.equal(_name_1, "DESCRIPTION");
      _or_3 = _equals_1;
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      String _name_2 = base.getName();
      boolean _equals_2 = Objects.equal(_name_2, "AUTHOR");
      _or_2 = _equals_2;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      String _name_3 = base.getName();
      boolean _equals_3 = Objects.equal(_name_3, "COPYRIGHT");
      _or_1 = _equals_3;
    }
    if (_or_1) {
      _or = true;
    } else {
      String _name_4 = base.getName();
      boolean _equals_4 = Objects.equal(_name_4, "LICENSE");
      _or = _equals_4;
    }
    if (_or) {
      ValueList _val_list = base.getVal_list();
      EList<Value> _vals = _val_list.getVals();
      int _size = _vals.size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        ValueList _val_list_1 = base.getVal_list();
        EList<Value> _vals_1 = _val_list_1.getVals();
        Value _get = _vals_1.get((i).intValue());
        String _str_val = _get.getStr_val();
        boolean _equals_5 = Objects.equal(_str_val, null);
        if (_equals_5) {
          EReference _baseProp_Val_list = HIPIEPackage.eINSTANCE.getBaseProp_Val_list();
          this.error("Input should be a string.", _baseProp_Val_list);
          return;
        }
      }
    }
    return;
  }
}