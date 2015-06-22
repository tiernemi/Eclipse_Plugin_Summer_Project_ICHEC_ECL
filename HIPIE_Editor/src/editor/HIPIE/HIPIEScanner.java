package editor.HIPIE;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

class HIPIEScanner extends RuleBasedScanner {
	
    public HIPIEScanner() {
       WordRule rule = new WordRule(new IWordDetector() {
          public boolean isWordStart(char c) { 
     //  	return Character.isJavaIdentifierStart(c); 
        	  return true ;
          }
          public boolean isWordPart(char c) {   
          	return Character.isJavaIdentifierPart(c); 
          }
       });
      
       
       for (int i=0 ; i<HIPIE_Keywords.indicators.length ; ++i)
    	   rule.addWord(HIPIE_Keywords.indicators[i] , HIPIE_Tokens.token_dic.get("Indicators"));
       for (int i=0 ; i<HIPIE_Keywords.section_divs.length ; ++i)
    	   rule.addWord(HIPIE_Keywords.section_divs[i] , HIPIE_Tokens.token_dic.get("Section_Div"));
       for (int i=0 ; i<HIPIE_Keywords.objects.length ; ++i)
    	   rule.addWord(HIPIE_Keywords.objects[i] , HIPIE_Tokens.token_dic.get("Objects"));
       
       
       setRules(new IRule[] {
          rule,
          new SingleLineRule("%", "%", HIPIE_Tokens.token_dic.get("String-like"), '\\'),
          new SingleLineRule("\"", "\"", HIPIE_Tokens.token_dic.get("String-like"), '\\'),
          new SingleLineRule("'", "'", HIPIE_Tokens.token_dic.get("String-like"), '\\'),

          new WhitespaceRule(new IWhitespaceDetector() {
             public boolean isWhitespace(char c) {
                return Character.isWhitespace(c);
             }
          }),
       });
       
    }
 }
