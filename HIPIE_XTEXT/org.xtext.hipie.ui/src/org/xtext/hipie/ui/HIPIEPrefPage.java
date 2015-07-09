package org.xtext.hipie.ui ;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;

public class HIPIEPrefPage extends LanguageRootPreferencePage {
    @Override
    protected void createFieldEditors() {
        addField(new StringFieldEditor("Compiler Location", "&Label:", getFieldEditorParent()));
    }
    @Override
    public void init(IWorkbench workbench) {
        getPreferenceStore().setDefault("Compiler Location", "default-value");
    }
}