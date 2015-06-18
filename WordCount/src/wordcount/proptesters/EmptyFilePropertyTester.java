package wordcount.proptesters;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;

public class EmptyFilePropertyTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "name.file.empty";
	public static final String PROPERTY_IS_Ecl_Empty= "IsECLFileEmpty";
	
	public EmptyFilePropertyTester() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {		
		if (PROPERTY_IS_Ecl_Empty.equals(property)) 
		{
			ISelection ecl_file_select = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection() ;
			
			if (ecl_file_select instanceof TreeSelection)
			{
				TreeSelection tree_select = (TreeSelection) ecl_file_select ;
				Object[] selection_list = tree_select.toArray() ;

				for (int i=0 ; i<selection_list.length ; ++i)
				{
					if (selection_list[i] instanceof IFile)
					{
						IFile ecl_file = (IFile) Platform.getAdapterManager().getAdapter(selection_list[i], IFile.class) ;
						try {
							InputStream contents = ecl_file.getContents();
							Scanner stream_scanner = new Scanner(contents,"UTF-8") ;
							
							String streamString = " " ;
							if (stream_scanner.hasNext())
								streamString = stream_scanner.useDelimiter("\\Z").next() ;
							
							for (int j=0 ; j<streamString.length() ; ++j)
							{
								if (Character.isWhitespace(streamString.charAt(j)) != true)
								{
									stream_scanner.close();
									contents.close();
									return true ;
								}
							}
							stream_scanner.close();
							contents.close();
						} 
						catch (CoreException e) 
						{
							e.printStackTrace();
						} 
						catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
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