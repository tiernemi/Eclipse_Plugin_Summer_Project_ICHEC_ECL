package src.editor.CMP;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

class CMPScanner extends RuleBasedScanner {
	
    public CMPScanner() {
       WordRule rule = new WordRule(new IWordDetector() {
          public boolean isWordStart(char c) { 
     //  	return Character.isJavaIdentifierStart(c); 
        	  return true ;
          }
          public boolean isWordPart(char c) {   
          	return Character.isJavaIdentifierPart(c); 
          }
       });
      
       
       // Add to keywords to rule here
 
       
       setRules(new IRule[] {
          rule,
          new WhitespaceRule(new IWhitespaceDetector() {
             public boolean isWhitespace(char c) {
                return Character.isWhitespace(c);
             }
          }),
       });
       
    }
 }
