package editor.HIPIE;

import org.eclipse.ui.editors.text.TextEditor;


public class HIPIE_editor extends TextEditor {
	
	public static final String ID = "HIPIE_editor.editor" ;
	
	public HIPIE_editor()
	{
		;
	}
	
	@Override
	protected void initializeEditor() 
	{
	    super.initializeEditor();
	    setSourceViewerConfiguration(new HIPIESourceViewerConfig());
	}

}
