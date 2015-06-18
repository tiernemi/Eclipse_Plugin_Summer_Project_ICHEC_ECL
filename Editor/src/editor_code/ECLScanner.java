package editor_code;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.TextAttribute ;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Display;


class ECLScanner extends RuleBasedScanner {

	private Device current_display = Display.getCurrent() ;
	private Color Red = new Color(current_display , 250 , 10 , 10) ;
	private Color Blue = new Color(current_display , 10 , 250 , 10) ;

	
    public ECLScanner() {
       WordRule rule = new WordRule(new IWordDetector() {
          public boolean isWordStart(char c) { 
       	return Character.isJavaIdentifierStart(c); 
          }
          public boolean isWordPart(char c) {   
          	return Character.isJavaIdentifierPart(c); 
          }
       });
      
       
       
       Token keyword = new Token(new TextAttribute(Red, null , SWT.BOLD)) ;
       Token comment = new Token(new TextAttribute(Red , null , SWT.UNDERLINE_SINGLE ));
       Token string = new Token(new TextAttribute(Blue));
       //add tokens for each reserved word
       rule.addWord("Plop", keyword);
       setRules(new IRule[] {
          rule,
          new SingleLineRule("//", null, comment),
          new SingleLineRule("\"", "\"", string, '\\'),
          new SingleLineRule("'", "'", string, '\\'),
          new WhitespaceRule(new IWhitespaceDetector() {
             public boolean isWhitespace(char c) {
                return Character.isWhitespace(c);
             }
          }),
       });
    }
 }
