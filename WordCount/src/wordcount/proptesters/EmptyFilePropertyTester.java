package wordcount.proptesters;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

public class EmptyFilePropertyTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "name.file.empty";
	public static final String PROPERTY_IS_ECL_FILE_NOT_EMPTY= "IsECLFileNotEmpty";
	
	public EmptyFilePropertyTester() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {		
		if (PROPERTY_IS_ECL_FILE_NOT_EMPTY.equals(property)) 
		{
			if (receiver instanceof IFile)
			{
				IFile ecl_file = (IFile) receiver ;
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
						return false ;
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
			
			return false ;
		}
		else
			return false ;
	}

}