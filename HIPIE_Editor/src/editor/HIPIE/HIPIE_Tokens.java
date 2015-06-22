package editor.HIPIE;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Display;


public class HIPIE_Tokens {
	
	public static Device current_display = Display.getCurrent() ;
	public static Map<String , Color> color_dic ;
	public static Map<String , Token> token_dic ;
	
	static 
	{
		color_dic = new HashMap<String , Color>() ;
		color_dic.put("Dark_Blue", new Color(current_display, 0, 0, 128)) ;
		color_dic.put("Light_Blue", new Color(current_display, 0, 154, 205)) ;
		color_dic.put("Fire_Brick" , new Color(current_display, 255, 51, 51)) ;
		color_dic.put("Purple" , new Color(current_display, 145, 44, 238)) ;
		color_dic.put("Purple" , new Color(current_display, 145, 44, 238)) ;

		
		token_dic = new HashMap<String , Token>() ;
		token_dic.put("Section_Div", new Token(new TextAttribute(color_dic.get("Dark_Blue"), null , SWT.BOLD))) ;
		token_dic.put("Indicators", new Token(new TextAttribute(color_dic.get("Light_Blue")))) ;
		token_dic.put("Objects", new Token(new TextAttribute(color_dic.get("Fire_Brick") , null , SWT.BOLD))) ;
		token_dic.put("String-like",  new Token(new TextAttribute(color_dic.get("Purple")))) ;
	}

}
