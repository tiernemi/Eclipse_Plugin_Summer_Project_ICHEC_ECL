package wordcount.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class WordCountPackage implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		TreeSelection select = (TreeSelection) HandlerUtil.getCurrentSelection(event) ;

		Object[] selection_list = select.toArray() ;
		IFile[] file_list = new IFile[selection_list.length] ;
		
		for (int i=0 ; i<selection_list.length ; ++i) 
		{
			file_list[i] = (IFile) Platform.getAdapterManager().getAdapter(selection_list[i], IFile.class) ;
			try {
				InputStream contents = file_list[i].getContents() ;
				Scanner stream_scanner = new Scanner(contents,"UTF-8") ;
		        String streamString = stream_scanner.useDelimiter("\\Z").next() ;
		        int word_count = 0 ;
				boolean in_word = false ;
				for (int j=0 ; j<streamString.length() ; ++j)
				{
					if (Character.isLetterOrDigit(streamString.charAt(j)) && in_word==false)
					{
						++word_count ;
						in_word = true ;
					}
					if (Character.isWhitespace(streamString.charAt(j)) && in_word)
					{
						in_word = false ;
					}
				}
				stream_scanner.close();
				contents.close();
			
				IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event) ;
				MessageDialog.openInformation(
						window.getShell(),
						"Word Count",
						"\"" + file_list[i].getName() + "\"" + " contains " + Integer.toString(word_count) + " words."); 
			} catch (CoreException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		return null ;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
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
