package editor_code;


import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class ECLAutoindent implements IAutoEditStrategy
{ 
	
	@Override
	public void customizeDocumentCommand(IDocument document, DocumentCommand command)
	{
        if (command.text.equals("{"))
        {
        	try {
        		int  line = document.getLineOfOffset(command.offset);
        		String indent = getIndentOfLine(document, line);
        		System.out.println(indent.length()) ;
                command.text = "\r\n" + indent + "{" + "\n" +indent + "\n" +indent + "}" ;
        	}

        	catch (BadLocationException ex)
        	{
        		command.text = "\n" + "{" + "\r\n\n" + "}";
        	}
            configureCommand(command, document);
        }
    }

    private void configureCommand(DocumentCommand command, IDocument document )
    {
        command.shiftsCaret = false;
    }
    
    public static  int findEndOfWhiteSpace(IDocument document, int offset, int end) 
            throws BadLocationException
        {
               while (offset < end) {
                   char c= document.getChar(offset);
                   if (c != ' ' & c !=  '\t') {
                       return offset;
                   }
                   offset++;
               }
               return end;
        }

     public static String getIndentOfLine(IDocument document, int line)
                throws BadLocationException
        {
            if (line > -1)
            {
                int start = document.getLineOffset(line);
                int end = start + document.getLineLength(line) - 1;
                int whiteend = findEndOfWhiteSpace(document, start, end);
                return document.get(start, whiteend - start);
            }
            else
            {
                return "";
            }
        }
}