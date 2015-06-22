package src.editor.CMP;

import org.eclipse.ui.editors.text.TextEditor;


public class CMP_editor extends TextEditor {
	
	public static final String ID = "CMP_editor.editor" ;
	
	public CMP_editor()
	{
		;
	}
	
	@Override
	protected void initializeEditor() 
	{
	    super.initializeEditor();
	    setSourceViewerConfiguration(new CMPSourceViewerConfig());
	}

}
