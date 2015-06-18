package wordcount.proptesters;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;


public class EmptyPropertyTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "name.editor.empty";
	public static final String PROPERTY_IS_Ecl_Empty= "IsECLEmpty";
	
	public EmptyPropertyTester() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {		
		if (PROPERTY_IS_Ecl_Empty.equals(property)) 
		{
			
			IEditorPart ecl_editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor() ;
			if (ecl_editor instanceof ITextEditor && ecl_editor != null)
			{
				ITextEditor ecl_editor_text = (ITextEditor) ecl_editor ;
				IDocument ecl_editor_content = (IDocument) ecl_editor_text.getDocumentProvider().getDocument(ecl_editor_text.getEditorInput()) ;
				String ecl_text = ecl_editor_content.get();
		
				for (int i=0 ; i<ecl_text.length() ; ++i)
				{
					if (Character.isWhitespace(ecl_text.charAt(i)) != true)
						return true ;
				}
				return false ;
			}
			else
				return false ;
		}
		else 
			return false;
	}

}
