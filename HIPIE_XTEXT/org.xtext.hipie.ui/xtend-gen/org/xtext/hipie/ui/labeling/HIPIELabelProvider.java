/**
 * generated by Xtext
 */
package org.xtext.hipie.ui.labeling;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.xtext.hipie.hIPIE.BaseProp;
import org.xtext.hipie.hIPIE.CategoryType;
import org.xtext.hipie.hIPIE.CategoryTypeList;
import org.xtext.hipie.hIPIE.OutDataset;
import org.xtext.hipie.hIPIE.OutputOption;
import org.xtext.hipie.hIPIE.OutputOptions;
import org.xtext.hipie.hIPIE.Value;
import org.xtext.hipie.hIPIE.ValueList;
import org.xtext.hipie.hIPIE.VisBasis;
import org.xtext.hipie.hIPIE.VisBasisParens;
import org.xtext.hipie.hIPIE.VisName;
import org.xtext.hipie.hIPIE.VisualSection;
import org.xtext.hipie.hIPIE.Visualization;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class HIPIELabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public HIPIELabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Value v) {
    String _xifexpression = null;
    String _name = v.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      String _xifexpression_1 = null;
      String _str_val = v.getStr_val();
      boolean _notEquals = (!Objects.equal(_str_val, null));
      if (_notEquals) {
        String _str_val_1 = v.getStr_val();
        _xifexpression_1 = ("STRING : " + _str_val_1);
      } else {
        int _int_val = v.getInt_val();
        _xifexpression_1 = ("INT : " + Integer.valueOf(_int_val));
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String text(final BaseProp base) {
    String _xblockexpression = null;
    {
      String out_string = "";
      ValueList _val_list = base.getVal_list();
      boolean _notEquals = (!Objects.equal(_val_list, null));
      if (_notEquals) {
        ValueList _val_list_1 = base.getVal_list();
        EList<Value> _vals = _val_list_1.getVals();
        int _size = _vals.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for (final Integer i : _doubleDotLessThan) {
          ValueList _val_list_2 = base.getVal_list();
          EList<Value> _vals_1 = _val_list_2.getVals();
          Value _get = _vals_1.get((i).intValue());
          String _name = _get.getName();
          boolean _notEquals_1 = (!Objects.equal(_name, null));
          if (_notEquals_1) {
            int _length = out_string.length();
            boolean _notEquals_2 = (_length != 0);
            if (_notEquals_2) {
              String _out_string = out_string;
              out_string = (_out_string + ", ");
            }
            String _out_string_1 = out_string;
            ValueList _val_list_3 = base.getVal_list();
            EList<Value> _vals_2 = _val_list_3.getVals();
            Value _get_1 = _vals_2.get((i).intValue());
            String _name_1 = _get_1.getName();
            out_string = (_out_string_1 + _name_1);
          } else {
            ValueList _val_list_4 = base.getVal_list();
            EList<Value> _vals_3 = _val_list_4.getVals();
            Value _get_2 = _vals_3.get((i).intValue());
            String _str_val = _get_2.getStr_val();
            boolean _notEquals_3 = (!Objects.equal(_str_val, null));
            if (_notEquals_3) {
              int _length_1 = out_string.length();
              boolean _notEquals_4 = (_length_1 != 0);
              if (_notEquals_4) {
                String _out_string_2 = out_string;
                out_string = (_out_string_2 + ", ");
              }
              String _out_string_3 = out_string;
              ValueList _val_list_5 = base.getVal_list();
              EList<Value> _vals_4 = _val_list_5.getVals();
              Value _get_3 = _vals_4.get((i).intValue());
              String _str_val_1 = _get_3.getStr_val();
              out_string = (_out_string_3 + _str_val_1);
            } else {
              int _length_2 = out_string.length();
              boolean _notEquals_5 = (_length_2 != 0);
              if (_notEquals_5) {
                String _out_string_4 = out_string;
                out_string = (_out_string_4 + ", ");
              }
              String _out_string_5 = out_string;
              ValueList _val_list_6 = base.getVal_list();
              EList<Value> _vals_5 = _val_list_6.getVals();
              Value _get_4 = _vals_5.get((i).intValue());
              int _int_val = _get_4.getInt_val();
              out_string = (_out_string_5 + Integer.valueOf(_int_val));
            }
          }
        }
      }
      CategoryTypeList _cat_list = base.getCat_list();
      boolean _notEquals_6 = (!Objects.equal(_cat_list, null));
      if (_notEquals_6) {
        CategoryTypeList _cat_list_1 = base.getCat_list();
        EList<CategoryType> _cats = _cat_list_1.getCats();
        int _size_1 = _cats.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
        for (final Integer i_1 : _doubleDotLessThan_1) {
          CategoryTypeList _cat_list_2 = base.getCat_list();
          EList<CategoryType> _cats_1 = _cat_list_2.getCats();
          CategoryType _get_5 = _cats_1.get((i_1).intValue());
          boolean _notEquals_7 = (!Objects.equal(_get_5, null));
          if (_notEquals_7) {
            int _length_3 = out_string.length();
            boolean _notEquals_8 = (_length_3 != 0);
            if (_notEquals_8) {
              String _out_string_6 = out_string;
              out_string = (_out_string_6 + ", ");
            }
            String _out_string_7 = out_string;
            CategoryTypeList _cat_list_3 = base.getCat_list();
            EList<CategoryType> _cats_2 = _cat_list_3.getCats();
            CategoryType _get_6 = _cats_2.get((i_1).intValue());
            String _name_2 = _get_6.getName();
            out_string = (_out_string_7 + _name_2);
          }
        }
      }
      String _name_3 = base.getName();
      String _plus = (_name_3 + " : ");
      _xblockexpression = (_plus + out_string);
    }
    return _xblockexpression;
  }
  
  public String text(final OutDataset out_dataset) {
    String _xblockexpression = null;
    {
      String out_string = "";
      OutputOptions _ops = out_dataset.getOps();
      EList<OutputOption> _output_ops = _ops.getOutput_ops();
      int _size = _output_ops.size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        OutputOptions _ops_1 = out_dataset.getOps();
        EList<OutputOption> _output_ops_1 = _ops_1.getOutput_ops();
        OutputOption _get = _output_ops_1.get((i).intValue());
        String _atr = _get.getAtr();
        boolean _notEquals = (!Objects.equal(_atr, null));
        if (_notEquals) {
          int _length = out_string.length();
          boolean _notEquals_1 = (_length != 0);
          if (_notEquals_1) {
            String _out_string = out_string;
            out_string = (_out_string + ", ");
          }
          String _out_string_1 = out_string;
          OutputOptions _ops_2 = out_dataset.getOps();
          EList<OutputOption> _output_ops_2 = _ops_2.getOutput_ops();
          OutputOption _get_1 = _output_ops_2.get((i).intValue());
          String _atr_1 = _get_1.getAtr();
          out_string = (_out_string_1 + _atr_1);
        }
      }
      String _name = out_dataset.getName();
      String _plus = (_name + " : ");
      _xblockexpression = (_plus + out_string);
    }
    return _xblockexpression;
  }
  
  public String text(final Visualization vis) {
    String _xblockexpression = null;
    {
      VisName _type = vis.getType();
      String vis_type = _type.getName();
      String out_string = "";
      String vis_basis = "";
      VisBasisParens _parens = vis.getParens();
      boolean _notEquals = (!Objects.equal(_parens, null));
      if (_notEquals) {
        VisBasisParens _parens_1 = vis.getParens();
        VisBasis _input = _parens_1.getInput();
        OutDataset _basis = _input.getBasis();
        String _name = _basis.getName();
        vis_basis = _name;
      }
      String _name_1 = vis.getName();
      String _plus = (_name_1 + " : ");
      String _plus_1 = (_plus + vis_type);
      String _plus_2 = (_plus_1 + " - ");
      String _plus_3 = (_plus_2 + vis_basis);
      _xblockexpression = out_string = _plus_3;
    }
    return _xblockexpression;
  }
  
  public String text(final VisualSection vis) {
    String _xblockexpression = null;
    {
      String sec_name = vis.getSection_name();
      String sec_id = vis.getName();
      _xblockexpression = ((sec_name + " : ") + sec_id);
    }
    return _xblockexpression;
  }
}
