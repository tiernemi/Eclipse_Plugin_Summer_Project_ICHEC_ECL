// As barebones as you can get Text Editor //

package editor_code;

import org.eclipse.ui.editors.text.TextEditor;

public class Ecl_editor extends TextEditor {
	
	public static final String ID = "ecl_editor.editor" ;
	
	public Ecl_editor()
	{
		;
	}
	
	@Override
	protected void initializeEditor() 
	{
	    super.initializeEditor();
	    setSourceViewerConfiguration(new ECLSourceViewerConfig());
	}

}
