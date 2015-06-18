package wordcount.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;

import java.lang.Character ;

public class WordCount_Handler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart ecl_editor = HandlerUtil.getActiveEditor(event) ;
		if (ecl_editor instanceof ITextEditor && ecl_editor != null)
		{
			ITextEditor ecl_editor_text = (ITextEditor) ecl_editor ;
			IDocument ecl_editor_content = (IDocument) ecl_editor_text.getDocumentProvider().getDocument(ecl_editor_text.getEditorInput()) ;
			String ecl_text = ecl_editor_content.get();
		
			int word_count = 0 ;
			boolean in_word = false ;
			for (int i=0 ; i<ecl_text.length() ; ++i)
			{
				if (Character.isLetterOrDigit(ecl_text.charAt(i)) && in_word==false)
				{
					++word_count ;
					in_word = true ;
				}
				if (Character.isWhitespace(ecl_text.charAt(i)) && in_word)
				{
					in_word = false ;
				}
			}
		
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event) ;
			MessageDialog.openInformation(
					window.getShell(),
					"Word Count",
					"Document contains " + Integer.toString(word_count) + " words.");
		}
		return null ;
	}

	@Override
	public boolean isEnabled() {
		return true ;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true; 
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
