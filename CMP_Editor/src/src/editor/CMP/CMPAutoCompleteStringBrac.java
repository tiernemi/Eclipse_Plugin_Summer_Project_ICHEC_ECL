package src.editor.CMP;

import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class CMPAutoCompleteStringBrac implements IAutoEditStrategy
{ 
	
	@Override
	public void customizeDocumentCommand(IDocument document, DocumentCommand command)
	{
        // Add string autocompletes here
    }
}