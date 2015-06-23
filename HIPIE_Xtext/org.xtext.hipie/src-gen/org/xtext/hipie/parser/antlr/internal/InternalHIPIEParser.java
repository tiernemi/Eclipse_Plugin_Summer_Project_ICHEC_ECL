package org.xtext.hipie.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.hipie.services.HIPIEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHIPIEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TOKEN", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'NAME'", "'DESCRIPTION'", "'AUTHOR'", "'LICENSE'", "'COPYRIGHT'", "'VERSION'", "'LABEL'", "'ID'", "';'", "'CATEGORY'", "'CLEAN'", "'INPUT'", "'APPEND'", "'LINK'", "'ANALYSIS'", "'CUSTOM'", "'VISUALIZE'", "'OUTPUT'", "','", "'='", "'HEADER'", "'END'", "'INSTANCE'", "':'", "'('", "')'", "'FIELD'", "'ENUM'", "'INPUTS'", "'BOOL'", "'INT'", "'STRING'", "'RECORD'", "'DATASET'", "'GROUP'", "'OPTIONAL'", "'DEFINED'", "'DISABLED'", "'MAPBYTYPE'", "'MAPBYNAME'", "'MANY'", "'FORMFIELD'", "'ENABLE'", "'TYPE'", "'RANGE'", "'DEFAULT'", "'MAXLENGTH'", "'NULL'", "'FIELDLENGTH'", "'ROWS'", "'COLS'", "'_HTML_STYLECLASS'", "'CHECKBOX'", "'RADIO'", "'SELECT'", "'MULTIPLESELECT'", "'TEXTAREA'", "'HIDDEN'", "'TEXT'", "'UNICODE'", "'UNISTR'", "'INTEGER'", "'DECIMAL'", "'NUMERIC'", "'REAL'", "'OUTPUTS'", "'UNSIGNED'", "'QSTRING'", "'VARSTRING'", "'VARUNICODE'", "'DATA'", "'SIDE'", "'LARGE'", "'SMALL'", "'FEW'", "'WUID'", "'FROM'", "'ACTION'", "'GENERATES'", "'ENDGENERATES'", "'INLINE'", "'.'", "'-'", "'SALT'", "'SCOREDSEARCH'", "'PROFILE'", "'CHORO'", "'LINE'", "'TIMELINE'", "'PIE'", "'BAR'", "'TABLE'", "'SLIDER'", "'{'", "'}'", "'SUM'", "'SCALE'", "'TITLE'", "'DATE'", "'PICTURE'", "'STATE'", "'COUNTY'", "'WEIGHT'", "'SIZE'", "'SELECTS'", "'->'", "'X'", "'Y'", "'COLOR'", "'FILTER'", "'VALUE'", "'FILE'", "'RESOURCES'"
    };
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_TOKEN=4;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=5;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=7;

    // delegates
    // delegators


        public InternalHIPIEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHIPIEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHIPIEParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g"; }



     	private HIPIEGrammarAccess grammarAccess;
     	
        public InternalHIPIEParser(TokenStream input, HIPIEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "program";	
       	}
       	
       	@Override
       	protected HIPIEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleprogram"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:67:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:68:2: (iv_ruleprogram= ruleprogram EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:69:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram75);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:76:1: ruleprogram returns [EObject current=null] : ( () ( rulecomposition_header )? ( rulebase_prop )+ ( rulecontract_instance )* ( ruleinput_section )? ( ruleoutput_section )? ( rulevisual_section )* ( rulegenerate_section )? ( rulecustom_section )? ( ruleresource_section )? ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:79:28: ( ( () ( rulecomposition_header )? ( rulebase_prop )+ ( rulecontract_instance )* ( ruleinput_section )? ( ruleoutput_section )? ( rulevisual_section )* ( rulegenerate_section )? ( rulecustom_section )? ( ruleresource_section )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:1: ( () ( rulecomposition_header )? ( rulebase_prop )+ ( rulecontract_instance )* ( ruleinput_section )? ( ruleoutput_section )? ( rulevisual_section )* ( rulegenerate_section )? ( rulecustom_section )? ( ruleresource_section )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:1: ( () ( rulecomposition_header )? ( rulebase_prop )+ ( rulecontract_instance )* ( ruleinput_section )? ( ruleoutput_section )? ( rulevisual_section )* ( rulegenerate_section )? ( rulecustom_section )? ( ruleresource_section )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:2: () ( rulecomposition_header )? ( rulebase_prop )+ ( rulecontract_instance )* ( ruleinput_section )? ( ruleoutput_section )? ( rulevisual_section )* ( rulegenerate_section )? ( rulecustom_section )? ( ruleresource_section )?
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:2: ()
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProgramAccess().getProgramAction_0(),
                        current);
                

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:86:2: ( rulecomposition_header )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:87:5: rulecomposition_header
                    {
                     
                            newCompositeNode(grammarAccess.getProgramAccess().getComposition_headerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecomposition_header_in_ruleprogram136);
                    rulecomposition_header();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:94:3: ( rulebase_prop )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=19)||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:95:5: rulebase_prop
            	    {
            	     
            	            newCompositeNode(grammarAccess.getProgramAccess().getBase_propParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_rulebase_prop_in_ruleprogram154);
            	    rulebase_prop();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:102:3: ( rulecontract_instance )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:103:5: rulecontract_instance
            	    {
            	     
            	            newCompositeNode(grammarAccess.getProgramAccess().getContract_instanceParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_rulecontract_instance_in_ruleprogram172);
            	    rulecontract_instance();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:110:3: ( ruleinput_section )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:111:5: ruleinput_section
                    {
                     
                            newCompositeNode(grammarAccess.getProgramAccess().getInput_sectionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleinput_section_in_ruleprogram190);
                    ruleinput_section();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:118:3: ( ruleoutput_section )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==77) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:119:5: ruleoutput_section
                    {
                     
                            newCompositeNode(grammarAccess.getProgramAccess().getOutput_sectionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleoutput_section_in_ruleprogram208);
                    ruleoutput_section();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:126:3: ( rulevisual_section )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:127:5: rulevisual_section
            	    {
            	     
            	            newCompositeNode(grammarAccess.getProgramAccess().getVisual_sectionParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_rulevisual_section_in_ruleprogram226);
            	    rulevisual_section();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:134:3: ( rulegenerate_section )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==90) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:135:5: rulegenerate_section
                    {
                     
                            newCompositeNode(grammarAccess.getProgramAccess().getGenerate_sectionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulegenerate_section_in_ruleprogram244);
                    rulegenerate_section();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:142:3: ( rulecustom_section )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:143:5: rulecustom_section
                    {
                     
                            newCompositeNode(grammarAccess.getProgramAccess().getCustom_sectionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulecustom_section_in_ruleprogram262);
                    rulecustom_section();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:150:3: ( ruleresource_section )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==124) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:151:5: ruleresource_section
                    {
                     
                            newCompositeNode(grammarAccess.getProgramAccess().getResource_sectionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleresource_section_in_ruleprogram280);
                    ruleresource_section();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRulebase_prop"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:166:1: entryRulebase_prop returns [String current=null] : iv_rulebase_prop= rulebase_prop EOF ;
    public final String entryRulebase_prop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebase_prop = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:167:2: (iv_rulebase_prop= rulebase_prop EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:168:2: iv_rulebase_prop= rulebase_prop EOF
            {
             newCompositeNode(grammarAccess.getBase_propRule()); 
            pushFollow(FOLLOW_rulebase_prop_in_entryRulebase_prop318);
            iv_rulebase_prop=rulebase_prop();

            state._fsp--;

             current =iv_rulebase_prop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebase_prop329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebase_prop"


    // $ANTLR start "rulebase_prop"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:175:1: rulebase_prop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'NAME' | kw= 'DESCRIPTION' | kw= 'AUTHOR' | kw= 'LICENSE' | kw= 'COPYRIGHT' | kw= 'VERSION' | kw= 'LABEL' | kw= 'ID' ) this_value_list_8= rulevalue_list kw= ';' ) | (kw= 'CATEGORY' this_category_type_list_11= rulecategory_type_list kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken rulebase_prop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_list_8 = null;

        AntlrDatatypeRuleToken this_category_type_list_11 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:178:28: ( ( ( (kw= 'NAME' | kw= 'DESCRIPTION' | kw= 'AUTHOR' | kw= 'LICENSE' | kw= 'COPYRIGHT' | kw= 'VERSION' | kw= 'LABEL' | kw= 'ID' ) this_value_list_8= rulevalue_list kw= ';' ) | (kw= 'CATEGORY' this_category_type_list_11= rulecategory_type_list kw= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:179:1: ( ( (kw= 'NAME' | kw= 'DESCRIPTION' | kw= 'AUTHOR' | kw= 'LICENSE' | kw= 'COPYRIGHT' | kw= 'VERSION' | kw= 'LABEL' | kw= 'ID' ) this_value_list_8= rulevalue_list kw= ';' ) | (kw= 'CATEGORY' this_category_type_list_11= rulecategory_type_list kw= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:179:1: ( ( (kw= 'NAME' | kw= 'DESCRIPTION' | kw= 'AUTHOR' | kw= 'LICENSE' | kw= 'COPYRIGHT' | kw= 'VERSION' | kw= 'LABEL' | kw= 'ID' ) this_value_list_8= rulevalue_list kw= ';' ) | (kw= 'CATEGORY' this_category_type_list_11= rulecategory_type_list kw= ';' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=19)) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:179:2: ( (kw= 'NAME' | kw= 'DESCRIPTION' | kw= 'AUTHOR' | kw= 'LICENSE' | kw= 'COPYRIGHT' | kw= 'VERSION' | kw= 'LABEL' | kw= 'ID' ) this_value_list_8= rulevalue_list kw= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:179:2: ( (kw= 'NAME' | kw= 'DESCRIPTION' | kw= 'AUTHOR' | kw= 'LICENSE' | kw= 'COPYRIGHT' | kw= 'VERSION' | kw= 'LABEL' | kw= 'ID' ) this_value_list_8= rulevalue_list kw= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:179:3: (kw= 'NAME' | kw= 'DESCRIPTION' | kw= 'AUTHOR' | kw= 'LICENSE' | kw= 'COPYRIGHT' | kw= 'VERSION' | kw= 'LABEL' | kw= 'ID' ) this_value_list_8= rulevalue_list kw= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:179:3: (kw= 'NAME' | kw= 'DESCRIPTION' | kw= 'AUTHOR' | kw= 'LICENSE' | kw= 'COPYRIGHT' | kw= 'VERSION' | kw= 'LABEL' | kw= 'ID' )
                    int alt10=8;
                    switch ( input.LA(1) ) {
                    case 12:
                        {
                        alt10=1;
                        }
                        break;
                    case 13:
                        {
                        alt10=2;
                        }
                        break;
                    case 14:
                        {
                        alt10=3;
                        }
                        break;
                    case 15:
                        {
                        alt10=4;
                        }
                        break;
                    case 16:
                        {
                        alt10=5;
                        }
                        break;
                    case 17:
                        {
                        alt10=6;
                        }
                        break;
                    case 18:
                        {
                        alt10=7;
                        }
                        break;
                    case 19:
                        {
                        alt10=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:180:2: kw= 'NAME'
                            {
                            kw=(Token)match(input,12,FOLLOW_12_in_rulebase_prop369); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBase_propAccess().getNAMEKeyword_0_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:187:2: kw= 'DESCRIPTION'
                            {
                            kw=(Token)match(input,13,FOLLOW_13_in_rulebase_prop388); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBase_propAccess().getDESCRIPTIONKeyword_0_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:194:2: kw= 'AUTHOR'
                            {
                            kw=(Token)match(input,14,FOLLOW_14_in_rulebase_prop407); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBase_propAccess().getAUTHORKeyword_0_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:201:2: kw= 'LICENSE'
                            {
                            kw=(Token)match(input,15,FOLLOW_15_in_rulebase_prop426); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBase_propAccess().getLICENSEKeyword_0_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:208:2: kw= 'COPYRIGHT'
                            {
                            kw=(Token)match(input,16,FOLLOW_16_in_rulebase_prop445); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBase_propAccess().getCOPYRIGHTKeyword_0_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:215:2: kw= 'VERSION'
                            {
                            kw=(Token)match(input,17,FOLLOW_17_in_rulebase_prop464); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBase_propAccess().getVERSIONKeyword_0_0_5()); 
                                

                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:222:2: kw= 'LABEL'
                            {
                            kw=(Token)match(input,18,FOLLOW_18_in_rulebase_prop483); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBase_propAccess().getLABELKeyword_0_0_6()); 
                                

                            }
                            break;
                        case 8 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:229:2: kw= 'ID'
                            {
                            kw=(Token)match(input,19,FOLLOW_19_in_rulebase_prop502); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBase_propAccess().getIDKeyword_0_0_7()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getBase_propAccess().getValue_listParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulevalue_list_in_rulebase_prop525);
                    this_value_list_8=rulevalue_list();

                    state._fsp--;


                    		current.merge(this_value_list_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,20,FOLLOW_20_in_rulebase_prop543); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBase_propAccess().getSemicolonKeyword_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:252:6: (kw= 'CATEGORY' this_category_type_list_11= rulecategory_type_list kw= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:252:6: (kw= 'CATEGORY' this_category_type_list_11= rulecategory_type_list kw= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:253:2: kw= 'CATEGORY' this_category_type_list_11= rulecategory_type_list kw= ';'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_rulebase_prop564); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBase_propAccess().getCATEGORYKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getBase_propAccess().getCategory_type_listParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulecategory_type_list_in_rulebase_prop586);
                    this_category_type_list_11=rulecategory_type_list();

                    state._fsp--;


                    		current.merge(this_category_type_list_11);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,20,FOLLOW_20_in_rulebase_prop604); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBase_propAccess().getSemicolonKeyword_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebase_prop"


    // $ANTLR start "entryRulecategory_type"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:283:1: entryRulecategory_type returns [String current=null] : iv_rulecategory_type= rulecategory_type EOF ;
    public final String entryRulecategory_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecategory_type = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:284:2: (iv_rulecategory_type= rulecategory_type EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:285:2: iv_rulecategory_type= rulecategory_type EOF
            {
             newCompositeNode(grammarAccess.getCategory_typeRule()); 
            pushFollow(FOLLOW_rulecategory_type_in_entryRulecategory_type646);
            iv_rulecategory_type=rulecategory_type();

            state._fsp--;

             current =iv_rulecategory_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecategory_type657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecategory_type"


    // $ANTLR start "rulecategory_type"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:292:1: rulecategory_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' ) ;
    public final AntlrDatatypeRuleToken rulecategory_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:295:28: ( (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:296:1: (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:296:1: (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            case 26:
                {
                alt12=5;
                }
                break;
            case 27:
                {
                alt12=6;
                }
                break;
            case 28:
                {
                alt12=7;
                }
                break;
            case 29:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:297:2: kw= 'CLEAN'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_rulecategory_type695); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getCLEANKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:304:2: kw= 'INPUT'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulecategory_type714); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getINPUTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:311:2: kw= 'APPEND'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulecategory_type733); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getAPPENDKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:318:2: kw= 'LINK'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulecategory_type752); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getLINKKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:325:2: kw= 'ANALYSIS'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulecategory_type771); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getANALYSISKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:332:2: kw= 'CUSTOM'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulecategory_type790); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getCUSTOMKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:339:2: kw= 'VISUALIZE'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_rulecategory_type809); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getVISUALIZEKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:346:2: kw= 'OUTPUT'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulecategory_type828); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getOUTPUTKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecategory_type"


    // $ANTLR start "entryRulecategory_type_list"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:359:1: entryRulecategory_type_list returns [String current=null] : iv_rulecategory_type_list= rulecategory_type_list EOF ;
    public final String entryRulecategory_type_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecategory_type_list = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:360:2: (iv_rulecategory_type_list= rulecategory_type_list EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:361:2: iv_rulecategory_type_list= rulecategory_type_list EOF
            {
             newCompositeNode(grammarAccess.getCategory_type_listRule()); 
            pushFollow(FOLLOW_rulecategory_type_list_in_entryRulecategory_type_list869);
            iv_rulecategory_type_list=rulecategory_type_list();

            state._fsp--;

             current =iv_rulecategory_type_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecategory_type_list880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecategory_type_list"


    // $ANTLR start "rulecategory_type_list"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:368:1: rulecategory_type_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_category_type_0= rulecategory_type (kw= ',' this_category_type_2= rulecategory_type )* ) ;
    public final AntlrDatatypeRuleToken rulecategory_type_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_category_type_0 = null;

        AntlrDatatypeRuleToken this_category_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:371:28: ( (this_category_type_0= rulecategory_type (kw= ',' this_category_type_2= rulecategory_type )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:372:1: (this_category_type_0= rulecategory_type (kw= ',' this_category_type_2= rulecategory_type )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:372:1: (this_category_type_0= rulecategory_type (kw= ',' this_category_type_2= rulecategory_type )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:373:5: this_category_type_0= rulecategory_type (kw= ',' this_category_type_2= rulecategory_type )*
            {
             
                    newCompositeNode(grammarAccess.getCategory_type_listAccess().getCategory_typeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecategory_type_in_rulecategory_type_list927);
            this_category_type_0=rulecategory_type();

            state._fsp--;


            		current.merge(this_category_type_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:383:1: (kw= ',' this_category_type_2= rulecategory_type )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:384:2: kw= ',' this_category_type_2= rulecategory_type
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_rulecategory_type_list946); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCategory_type_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCategory_type_listAccess().getCategory_typeParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulecategory_type_in_rulecategory_type_list968);
            	    this_category_type_2=rulecategory_type();

            	    state._fsp--;


            	    		current.merge(this_category_type_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecategory_type_list"


    // $ANTLR start "entryRulevalue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:408:1: entryRulevalue returns [String current=null] : iv_rulevalue= rulevalue EOF ;
    public final String entryRulevalue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:409:2: (iv_rulevalue= rulevalue EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:410:2: iv_rulevalue= rulevalue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_rulevalue_in_entryRulevalue1016);
            iv_rulevalue=rulevalue();

            state._fsp--;

             current =iv_rulevalue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue1027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue"


    // $ANTLR start "rulevalue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:417:1: rulevalue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TOKEN_0= RULE_TOKEN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken rulevalue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TOKEN_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:420:28: ( (this_TOKEN_0= RULE_TOKEN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:421:1: (this_TOKEN_0= RULE_TOKEN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:421:1: (this_TOKEN_0= RULE_TOKEN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_TOKEN:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case RULE_STRING:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:421:6: this_TOKEN_0= RULE_TOKEN
                    {
                    this_TOKEN_0=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulevalue1067); 

                    		current.merge(this_TOKEN_0);
                        
                     
                        newLeafNode(this_TOKEN_0, grammarAccess.getValueAccess().getTOKENTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:429:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulevalue1093); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:437:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulevalue1119); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRulevalue_list"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:452:1: entryRulevalue_list returns [String current=null] : iv_rulevalue_list= rulevalue_list EOF ;
    public final String entryRulevalue_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue_list = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:453:2: (iv_rulevalue_list= rulevalue_list EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:454:2: iv_rulevalue_list= rulevalue_list EOF
            {
             newCompositeNode(grammarAccess.getValue_listRule()); 
            pushFollow(FOLLOW_rulevalue_list_in_entryRulevalue_list1165);
            iv_rulevalue_list=rulevalue_list();

            state._fsp--;

             current =iv_rulevalue_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue_list1176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_list"


    // $ANTLR start "rulevalue_list"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:461:1: rulevalue_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_value_0= rulevalue (kw= ',' this_value_2= rulevalue )* ) ;
    public final AntlrDatatypeRuleToken rulevalue_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_0 = null;

        AntlrDatatypeRuleToken this_value_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:464:28: ( (this_value_0= rulevalue (kw= ',' this_value_2= rulevalue )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:465:1: (this_value_0= rulevalue (kw= ',' this_value_2= rulevalue )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:465:1: (this_value_0= rulevalue (kw= ',' this_value_2= rulevalue )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:466:5: this_value_0= rulevalue (kw= ',' this_value_2= rulevalue )*
            {
             
                    newCompositeNode(grammarAccess.getValue_listAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevalue_in_rulevalue_list1223);
            this_value_0=rulevalue();

            state._fsp--;


            		current.merge(this_value_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:476:1: (kw= ',' this_value_2= rulevalue )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    switch ( input.LA(2) ) {
                    case RULE_TOKEN:
                        {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==EOF||(LA15_3>=RULE_TOKEN && LA15_3<=RULE_STRING)||LA15_3==20||LA15_3==30||LA15_3==33||LA15_3==37) ) {
                            alt15=1;
                        }


                        }
                        break;
                    case RULE_INT:
                        {
                        int LA15_4 = input.LA(3);

                        if ( (LA15_4==EOF||(LA15_4>=RULE_TOKEN && LA15_4<=RULE_STRING)||LA15_4==20||LA15_4==30||LA15_4==33||LA15_4==37) ) {
                            alt15=1;
                        }


                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA15_5 = input.LA(3);

                        if ( (LA15_5==EOF||(LA15_5>=RULE_TOKEN && LA15_5<=RULE_STRING)||LA15_5==20||LA15_5==30||LA15_5==33||LA15_5==37) ) {
                            alt15=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:477:2: kw= ',' this_value_2= rulevalue
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_rulevalue_list1242); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getValue_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getValue_listAccess().getValueParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulevalue_in_rulevalue_list1264);
            	    this_value_2=rulevalue();

            	    state._fsp--;


            	    		current.merge(this_value_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_list"


    // $ANTLR start "entryRuleassign"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:503:1: entryRuleassign returns [String current=null] : iv_ruleassign= ruleassign EOF ;
    public final String entryRuleassign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassign = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:504:2: (iv_ruleassign= ruleassign EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:505:2: iv_ruleassign= ruleassign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_ruleassign_in_entryRuleassign1314);
            iv_ruleassign=ruleassign();

            state._fsp--;

             current =iv_ruleassign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassign1325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassign"


    // $ANTLR start "ruleassign"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:512:1: ruleassign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_value_0= rulevalue kw= '=' this_value_list_2= rulevalue_list ) ;
    public final AntlrDatatypeRuleToken ruleassign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_0 = null;

        AntlrDatatypeRuleToken this_value_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:515:28: ( (this_value_0= rulevalue kw= '=' this_value_list_2= rulevalue_list ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:516:1: (this_value_0= rulevalue kw= '=' this_value_list_2= rulevalue_list )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:516:1: (this_value_0= rulevalue kw= '=' this_value_list_2= rulevalue_list )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:517:5: this_value_0= rulevalue kw= '=' this_value_list_2= rulevalue_list
            {
             
                    newCompositeNode(grammarAccess.getAssignAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevalue_in_ruleassign1372);
            this_value_0=rulevalue();

            state._fsp--;


            		current.merge(this_value_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,31,FOLLOW_31_in_ruleassign1390); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAssignAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getAssignAccess().getValue_listParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulevalue_list_in_ruleassign1412);
            this_value_list_2=rulevalue_list();

            state._fsp--;


            		current.merge(this_value_list_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassign"


    // $ANTLR start "entryRuleassign_list"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:552:1: entryRuleassign_list returns [String current=null] : iv_ruleassign_list= ruleassign_list EOF ;
    public final String entryRuleassign_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassign_list = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:553:2: (iv_ruleassign_list= ruleassign_list EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:554:2: iv_ruleassign_list= ruleassign_list EOF
            {
             newCompositeNode(grammarAccess.getAssign_listRule()); 
            pushFollow(FOLLOW_ruleassign_list_in_entryRuleassign_list1458);
            iv_ruleassign_list=ruleassign_list();

            state._fsp--;

             current =iv_ruleassign_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassign_list1469); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassign_list"


    // $ANTLR start "ruleassign_list"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:561:1: ruleassign_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assign_0= ruleassign (kw= ',' this_assign_2= ruleassign )* ) ;
    public final AntlrDatatypeRuleToken ruleassign_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_assign_0 = null;

        AntlrDatatypeRuleToken this_assign_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:564:28: ( (this_assign_0= ruleassign (kw= ',' this_assign_2= ruleassign )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:565:1: (this_assign_0= ruleassign (kw= ',' this_assign_2= ruleassign )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:565:1: (this_assign_0= ruleassign (kw= ',' this_assign_2= ruleassign )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:566:5: this_assign_0= ruleassign (kw= ',' this_assign_2= ruleassign )*
            {
             
                    newCompositeNode(grammarAccess.getAssign_listAccess().getAssignParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleassign_in_ruleassign_list1516);
            this_assign_0=ruleassign();

            state._fsp--;


            		current.merge(this_assign_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:576:1: (kw= ',' this_assign_2= ruleassign )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:577:2: kw= ',' this_assign_2= ruleassign
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleassign_list1535); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getAssign_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getAssign_listAccess().getAssignParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleassign_in_ruleassign_list1557);
            	    this_assign_2=ruleassign();

            	    state._fsp--;


            	    		current.merge(this_assign_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassign_list"


    // $ANTLR start "entryRulecomposition_header"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:601:1: entryRulecomposition_header returns [String current=null] : iv_rulecomposition_header= rulecomposition_header EOF ;
    public final String entryRulecomposition_header() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomposition_header = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:602:2: (iv_rulecomposition_header= rulecomposition_header EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:603:2: iv_rulecomposition_header= rulecomposition_header EOF
            {
             newCompositeNode(grammarAccess.getComposition_headerRule()); 
            pushFollow(FOLLOW_rulecomposition_header_in_entryRulecomposition_header1605);
            iv_rulecomposition_header=rulecomposition_header();

            state._fsp--;

             current =iv_rulecomposition_header.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomposition_header1616); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomposition_header"


    // $ANTLR start "rulecomposition_header"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:610:1: rulecomposition_header returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'HEADER' (this_assign_1= ruleassign )* kw= 'END' ) ;
    public final AntlrDatatypeRuleToken rulecomposition_header() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_assign_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:613:28: ( (kw= 'HEADER' (this_assign_1= ruleassign )* kw= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:614:1: (kw= 'HEADER' (this_assign_1= ruleassign )* kw= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:614:1: (kw= 'HEADER' (this_assign_1= ruleassign )* kw= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:615:2: kw= 'HEADER' (this_assign_1= ruleassign )* kw= 'END'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_rulecomposition_header1654); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getComposition_headerAccess().getHEADERKeyword_0()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:620:1: (this_assign_1= ruleassign )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_TOKEN && LA17_0<=RULE_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:621:5: this_assign_1= ruleassign
            	    {
            	     
            	            newCompositeNode(grammarAccess.getComposition_headerAccess().getAssignParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleassign_in_rulecomposition_header1677);
            	    this_assign_1=ruleassign();

            	    state._fsp--;


            	    		current.merge(this_assign_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            kw=(Token)match(input,33,FOLLOW_33_in_rulecomposition_header1697); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getComposition_headerAccess().getENDKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomposition_header"


    // $ANTLR start "entryRulecontract_instance"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:645:1: entryRulecontract_instance returns [String current=null] : iv_rulecontract_instance= rulecontract_instance EOF ;
    public final String entryRulecontract_instance() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecontract_instance = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:646:2: (iv_rulecontract_instance= rulecontract_instance EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:647:2: iv_rulecontract_instance= rulecontract_instance EOF
            {
             newCompositeNode(grammarAccess.getContract_instanceRule()); 
            pushFollow(FOLLOW_rulecontract_instance_in_entryRulecontract_instance1738);
            iv_rulecontract_instance=rulecontract_instance();

            state._fsp--;

             current =iv_rulecontract_instance.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecontract_instance1749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecontract_instance"


    // $ANTLR start "rulecontract_instance"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:654:1: rulecontract_instance returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'INSTANCE' (this_TOKEN_1= RULE_TOKEN kw= ':' )? this_value_3= rulevalue kw= '(' this_value_5= rulevalue kw= ')' (this_assign_7= ruleassign )* kw= 'END' ) ;
    public final AntlrDatatypeRuleToken rulecontract_instance() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_1=null;
        AntlrDatatypeRuleToken this_value_3 = null;

        AntlrDatatypeRuleToken this_value_5 = null;

        AntlrDatatypeRuleToken this_assign_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:657:28: ( (kw= 'INSTANCE' (this_TOKEN_1= RULE_TOKEN kw= ':' )? this_value_3= rulevalue kw= '(' this_value_5= rulevalue kw= ')' (this_assign_7= ruleassign )* kw= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:658:1: (kw= 'INSTANCE' (this_TOKEN_1= RULE_TOKEN kw= ':' )? this_value_3= rulevalue kw= '(' this_value_5= rulevalue kw= ')' (this_assign_7= ruleassign )* kw= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:658:1: (kw= 'INSTANCE' (this_TOKEN_1= RULE_TOKEN kw= ':' )? this_value_3= rulevalue kw= '(' this_value_5= rulevalue kw= ')' (this_assign_7= ruleassign )* kw= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:659:2: kw= 'INSTANCE' (this_TOKEN_1= RULE_TOKEN kw= ':' )? this_value_3= rulevalue kw= '(' this_value_5= rulevalue kw= ')' (this_assign_7= ruleassign )* kw= 'END'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_rulecontract_instance1787); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getContract_instanceAccess().getINSTANCEKeyword_0()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:664:1: (this_TOKEN_1= RULE_TOKEN kw= ':' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_TOKEN) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==35) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:664:6: this_TOKEN_1= RULE_TOKEN kw= ':'
                    {
                    this_TOKEN_1=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulecontract_instance1803); 

                    		current.merge(this_TOKEN_1);
                        
                     
                        newLeafNode(this_TOKEN_1, grammarAccess.getContract_instanceAccess().getTOKENTerminalRuleCall_1_0()); 
                        
                    kw=(Token)match(input,35,FOLLOW_35_in_rulecontract_instance1821); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getContract_instanceAccess().getColonKeyword_1_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getContract_instanceAccess().getValueParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulevalue_in_rulecontract_instance1845);
            this_value_3=rulevalue();

            state._fsp--;


            		current.merge(this_value_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,36,FOLLOW_36_in_rulecontract_instance1863); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getContract_instanceAccess().getLeftParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getContract_instanceAccess().getValueParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulevalue_in_rulecontract_instance1885);
            this_value_5=rulevalue();

            state._fsp--;


            		current.merge(this_value_5);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,37,FOLLOW_37_in_rulecontract_instance1903); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getContract_instanceAccess().getRightParenthesisKeyword_5()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:711:1: (this_assign_7= ruleassign )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_TOKEN && LA19_0<=RULE_STRING)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:712:5: this_assign_7= ruleassign
            	    {
            	     
            	            newCompositeNode(grammarAccess.getContract_instanceAccess().getAssignParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleassign_in_rulecontract_instance1926);
            	    this_assign_7=ruleassign();

            	    state._fsp--;


            	    		current.merge(this_assign_7);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            kw=(Token)match(input,33,FOLLOW_33_in_rulecontract_instance1946); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getContract_instanceAccess().getENDKeyword_7()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecontract_instance"


    // $ANTLR start "entryRulefield_decl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:736:1: entryRulefield_decl returns [String current=null] : iv_rulefield_decl= rulefield_decl EOF ;
    public final String entryRulefield_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:737:2: (iv_rulefield_decl= rulefield_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:738:2: iv_rulefield_decl= rulefield_decl EOF
            {
             newCompositeNode(grammarAccess.getField_declRule()); 
            pushFollow(FOLLOW_rulefield_decl_in_entryRulefield_decl1987);
            iv_rulefield_decl=rulefield_decl();

            state._fsp--;

             current =iv_rulefield_decl.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_decl1998); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefield_decl"


    // $ANTLR start "rulefield_decl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:745:1: rulefield_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'FIELD' this_TOKEN_1= RULE_TOKEN (this_input_options_2= ruleinput_options )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulefield_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_1=null;
        AntlrDatatypeRuleToken this_input_options_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:748:28: ( (kw= 'FIELD' this_TOKEN_1= RULE_TOKEN (this_input_options_2= ruleinput_options )? kw= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:749:1: (kw= 'FIELD' this_TOKEN_1= RULE_TOKEN (this_input_options_2= ruleinput_options )? kw= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:749:1: (kw= 'FIELD' this_TOKEN_1= RULE_TOKEN (this_input_options_2= ruleinput_options )? kw= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:750:2: kw= 'FIELD' this_TOKEN_1= RULE_TOKEN (this_input_options_2= ruleinput_options )? kw= ';'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_rulefield_decl2036); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getField_declAccess().getFIELDKeyword_0()); 
                
            this_TOKEN_1=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulefield_decl2051); 

            		current.merge(this_TOKEN_1);
                
             
                newLeafNode(this_TOKEN_1, grammarAccess.getField_declAccess().getTOKENTerminalRuleCall_1()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:762:1: (this_input_options_2= ruleinput_options )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:763:5: this_input_options_2= ruleinput_options
                    {
                     
                            newCompositeNode(grammarAccess.getField_declAccess().getInput_optionsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleinput_options_in_rulefield_decl2079);
                    this_input_options_2=ruleinput_options();

                    state._fsp--;


                    		current.merge(this_input_options_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_20_in_rulefield_decl2099); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getField_declAccess().getSemicolonKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_decl"


    // $ANTLR start "entryRuleenum_decl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:787:1: entryRuleenum_decl returns [String current=null] : iv_ruleenum_decl= ruleenum_decl EOF ;
    public final String entryRuleenum_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenum_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:788:2: (iv_ruleenum_decl= ruleenum_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:789:2: iv_ruleenum_decl= ruleenum_decl EOF
            {
             newCompositeNode(grammarAccess.getEnum_declRule()); 
            pushFollow(FOLLOW_ruleenum_decl_in_entryRuleenum_decl2140);
            iv_ruleenum_decl=ruleenum_decl();

            state._fsp--;

             current =iv_ruleenum_decl.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenum_decl2151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenum_decl"


    // $ANTLR start "ruleenum_decl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:796:1: ruleenum_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ENUM' kw= '(' (this_value_list_2= rulevalue_list | this_assign_list_3= ruleassign_list ) kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleenum_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_list_2 = null;

        AntlrDatatypeRuleToken this_assign_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:799:28: ( (kw= 'ENUM' kw= '(' (this_value_list_2= rulevalue_list | this_assign_list_3= ruleassign_list ) kw= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:800:1: (kw= 'ENUM' kw= '(' (this_value_list_2= rulevalue_list | this_assign_list_3= ruleassign_list ) kw= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:800:1: (kw= 'ENUM' kw= '(' (this_value_list_2= rulevalue_list | this_assign_list_3= ruleassign_list ) kw= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:801:2: kw= 'ENUM' kw= '(' (this_value_list_2= rulevalue_list | this_assign_list_3= ruleassign_list ) kw= ')'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleenum_decl2189); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnum_declAccess().getENUMKeyword_0()); 
                
            kw=(Token)match(input,36,FOLLOW_36_in_ruleenum_decl2202); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnum_declAccess().getLeftParenthesisKeyword_1()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:812:1: (this_value_list_2= rulevalue_list | this_assign_list_3= ruleassign_list )
            int alt21=2;
            switch ( input.LA(1) ) {
            case RULE_TOKEN:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==31) ) {
                    alt21=2;
                }
                else if ( (LA21_1==30||LA21_1==37) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==31) ) {
                    alt21=2;
                }
                else if ( (LA21_2==30||LA21_2==37) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==31) ) {
                    alt21=2;
                }
                else if ( (LA21_3==30||LA21_3==37) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:813:5: this_value_list_2= rulevalue_list
                    {
                     
                            newCompositeNode(grammarAccess.getEnum_declAccess().getValue_listParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_rulevalue_list_in_ruleenum_decl2225);
                    this_value_list_2=rulevalue_list();

                    state._fsp--;


                    		current.merge(this_value_list_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:825:5: this_assign_list_3= ruleassign_list
                    {
                     
                            newCompositeNode(grammarAccess.getEnum_declAccess().getAssign_listParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleassign_list_in_ruleenum_decl2258);
                    this_assign_list_3=ruleassign_list();

                    state._fsp--;


                    		current.merge(this_assign_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_37_in_ruleenum_decl2277); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnum_declAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenum_decl"


    // $ANTLR start "entryRuleinput_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:849:1: entryRuleinput_section returns [String current=null] : iv_ruleinput_section= ruleinput_section EOF ;
    public final String entryRuleinput_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinput_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:850:2: (iv_ruleinput_section= ruleinput_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:851:2: iv_ruleinput_section= ruleinput_section EOF
            {
             newCompositeNode(grammarAccess.getInput_sectionRule()); 
            pushFollow(FOLLOW_ruleinput_section_in_entryRuleinput_section2318);
            iv_ruleinput_section=ruleinput_section();

            state._fsp--;

             current =iv_ruleinput_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_section2329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinput_section"


    // $ANTLR start "ruleinput_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:858:1: ruleinput_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'INPUTS' (this_input_value_1= ruleinput_value )+ kw= 'END' ) ;
    public final AntlrDatatypeRuleToken ruleinput_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_input_value_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:861:28: ( (kw= 'INPUTS' (this_input_value_1= ruleinput_value )+ kw= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:862:1: (kw= 'INPUTS' (this_input_value_1= ruleinput_value )+ kw= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:862:1: (kw= 'INPUTS' (this_input_value_1= ruleinput_value )+ kw= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:863:2: kw= 'INPUTS' (this_input_value_1= ruleinput_value )+ kw= 'END'
            {
            kw=(Token)match(input,40,FOLLOW_40_in_ruleinput_section2367); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInput_sectionAccess().getINPUTSKeyword_0()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:868:1: (this_input_value_1= ruleinput_value )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39||(LA22_0>=41 && LA22_0<=46)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:869:5: this_input_value_1= ruleinput_value
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInput_sectionAccess().getInput_valueParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleinput_value_in_ruleinput_section2390);
            	    this_input_value_1=ruleinput_value();

            	    state._fsp--;


            	    		current.merge(this_input_value_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            kw=(Token)match(input,33,FOLLOW_33_in_ruleinput_section2410); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInput_sectionAccess().getENDKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinput_section"


    // $ANTLR start "entryRuleinput_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:893:1: entryRuleinput_value returns [String current=null] : iv_ruleinput_value= ruleinput_value EOF ;
    public final String entryRuleinput_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinput_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:894:2: (iv_ruleinput_value= ruleinput_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:895:2: iv_ruleinput_value= ruleinput_value EOF
            {
             newCompositeNode(grammarAccess.getInput_valueRule()); 
            pushFollow(FOLLOW_ruleinput_value_in_entryRuleinput_value2451);
            iv_ruleinput_value=ruleinput_value();

            state._fsp--;

             current =iv_ruleinput_value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_value2462); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinput_value"


    // $ANTLR start "ruleinput_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:902:1: ruleinput_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' ) this_TOKEN_6= RULE_TOKEN (this_input_options_7= ruleinput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_10= RULE_TOKEN (this_input_options_11= ruleinput_options )? (this_field_decl_12= rulefield_decl )* kw= 'END' ) | (kw= 'GROUP' this_TOKEN_15= RULE_TOKEN (this_input_options_16= ruleinput_options )? (this_input_value_17= ruleinput_value )* kw= 'END' ) ) ;
    public final AntlrDatatypeRuleToken ruleinput_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_6=null;
        Token this_TOKEN_10=null;
        Token this_TOKEN_15=null;
        AntlrDatatypeRuleToken this_enum_decl_2 = null;

        AntlrDatatypeRuleToken this_input_options_7 = null;

        AntlrDatatypeRuleToken this_input_options_11 = null;

        AntlrDatatypeRuleToken this_field_decl_12 = null;

        AntlrDatatypeRuleToken this_input_options_16 = null;

        AntlrDatatypeRuleToken this_input_value_17 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:905:28: ( ( ( (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' ) this_TOKEN_6= RULE_TOKEN (this_input_options_7= ruleinput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_10= RULE_TOKEN (this_input_options_11= ruleinput_options )? (this_field_decl_12= rulefield_decl )* kw= 'END' ) | (kw= 'GROUP' this_TOKEN_15= RULE_TOKEN (this_input_options_16= ruleinput_options )? (this_input_value_17= ruleinput_value )* kw= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:906:1: ( ( (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' ) this_TOKEN_6= RULE_TOKEN (this_input_options_7= ruleinput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_10= RULE_TOKEN (this_input_options_11= ruleinput_options )? (this_field_decl_12= rulefield_decl )* kw= 'END' ) | (kw= 'GROUP' this_TOKEN_15= RULE_TOKEN (this_input_options_16= ruleinput_options )? (this_input_value_17= ruleinput_value )* kw= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:906:1: ( ( (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' ) this_TOKEN_6= RULE_TOKEN (this_input_options_7= ruleinput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_10= RULE_TOKEN (this_input_options_11= ruleinput_options )? (this_field_decl_12= rulefield_decl )* kw= 'END' ) | (kw= 'GROUP' this_TOKEN_15= RULE_TOKEN (this_input_options_16= ruleinput_options )? (this_input_value_17= ruleinput_value )* kw= 'END' ) )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:906:2: ( (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' ) this_TOKEN_6= RULE_TOKEN (this_input_options_7= ruleinput_options )? kw= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:906:2: ( (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' ) this_TOKEN_6= RULE_TOKEN (this_input_options_7= ruleinput_options )? kw= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:906:3: (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' ) this_TOKEN_6= RULE_TOKEN (this_input_options_7= ruleinput_options )? kw= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:906:3: (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' )
                    int alt23=6;
                    switch ( input.LA(1) ) {
                    case 41:
                        {
                        alt23=1;
                        }
                        break;
                    case 42:
                        {
                        alt23=2;
                        }
                        break;
                    case 39:
                        {
                        alt23=3;
                        }
                        break;
                    case 43:
                        {
                        alt23=4;
                        }
                        break;
                    case 44:
                        {
                        alt23=5;
                        }
                        break;
                    case 45:
                        {
                        alt23=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:907:2: kw= 'BOOL'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleinput_value2502); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_valueAccess().getBOOLKeyword_0_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:914:2: kw= 'INT'
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleinput_value2521); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_valueAccess().getINTKeyword_0_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:921:5: this_enum_decl_2= ruleenum_decl
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getEnum_declParserRuleCall_0_0_2()); 
                                
                            pushFollow(FOLLOW_ruleenum_decl_in_ruleinput_value2549);
                            this_enum_decl_2=ruleenum_decl();

                            state._fsp--;


                            		current.merge(this_enum_decl_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:933:2: kw= 'STRING'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleinput_value2573); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_valueAccess().getSTRINGKeyword_0_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:940:2: kw= 'RECORD'
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleinput_value2592); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_valueAccess().getRECORDKeyword_0_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:947:2: kw= 'DATASET'
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleinput_value2611); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_valueAccess().getDATASETKeyword_0_0_5()); 
                                

                            }
                            break;

                    }

                    this_TOKEN_6=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_ruleinput_value2627); 

                    		current.merge(this_TOKEN_6);
                        
                     
                        newLeafNode(this_TOKEN_6, grammarAccess.getInput_valueAccess().getTOKENTerminalRuleCall_0_1()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:959:1: (this_input_options_7= ruleinput_options )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==35) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:960:5: this_input_options_7= ruleinput_options
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getInput_optionsParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value2655);
                            this_input_options_7=ruleinput_options();

                            state._fsp--;


                            		current.merge(this_input_options_7);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,20,FOLLOW_20_in_ruleinput_value2675); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_valueAccess().getSemicolonKeyword_0_3()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:977:6: (kw= 'DATASET' this_TOKEN_10= RULE_TOKEN (this_input_options_11= ruleinput_options )? (this_field_decl_12= rulefield_decl )* kw= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:977:6: (kw= 'DATASET' this_TOKEN_10= RULE_TOKEN (this_input_options_11= ruleinput_options )? (this_field_decl_12= rulefield_decl )* kw= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:978:2: kw= 'DATASET' this_TOKEN_10= RULE_TOKEN (this_input_options_11= ruleinput_options )? (this_field_decl_12= rulefield_decl )* kw= 'END'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleinput_value2696); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_valueAccess().getDATASETKeyword_1_0()); 
                        
                    this_TOKEN_10=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_ruleinput_value2711); 

                    		current.merge(this_TOKEN_10);
                        
                     
                        newLeafNode(this_TOKEN_10, grammarAccess.getInput_valueAccess().getTOKENTerminalRuleCall_1_1()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:990:1: (this_input_options_11= ruleinput_options )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==35) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:991:5: this_input_options_11= ruleinput_options
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getInput_optionsParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value2739);
                            this_input_options_11=ruleinput_options();

                            state._fsp--;


                            		current.merge(this_input_options_11);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1001:3: (this_field_decl_12= rulefield_decl )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==38) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1002:5: this_field_decl_12= rulefield_decl
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getInput_valueAccess().getField_declParserRuleCall_1_3()); 
                    	        
                    	    pushFollow(FOLLOW_rulefield_decl_in_ruleinput_value2769);
                    	    this_field_decl_12=rulefield_decl();

                    	    state._fsp--;


                    	    		current.merge(this_field_decl_12);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    kw=(Token)match(input,33,FOLLOW_33_in_ruleinput_value2789); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_valueAccess().getENDKeyword_1_4()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1019:6: (kw= 'GROUP' this_TOKEN_15= RULE_TOKEN (this_input_options_16= ruleinput_options )? (this_input_value_17= ruleinput_value )* kw= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1019:6: (kw= 'GROUP' this_TOKEN_15= RULE_TOKEN (this_input_options_16= ruleinput_options )? (this_input_value_17= ruleinput_value )* kw= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1020:2: kw= 'GROUP' this_TOKEN_15= RULE_TOKEN (this_input_options_16= ruleinput_options )? (this_input_value_17= ruleinput_value )* kw= 'END'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleinput_value2810); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_valueAccess().getGROUPKeyword_2_0()); 
                        
                    this_TOKEN_15=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_ruleinput_value2825); 

                    		current.merge(this_TOKEN_15);
                        
                     
                        newLeafNode(this_TOKEN_15, grammarAccess.getInput_valueAccess().getTOKENTerminalRuleCall_2_1()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1032:1: (this_input_options_16= ruleinput_options )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==35) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1033:5: this_input_options_16= ruleinput_options
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getInput_optionsParserRuleCall_2_2()); 
                                
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value2853);
                            this_input_options_16=ruleinput_options();

                            state._fsp--;


                            		current.merge(this_input_options_16);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1043:3: (this_input_value_17= ruleinput_value )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==39||(LA28_0>=41 && LA28_0<=46)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1044:5: this_input_value_17= ruleinput_value
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getInput_valueAccess().getInput_valueParserRuleCall_2_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleinput_value_in_ruleinput_value2883);
                    	    this_input_value_17=ruleinput_value();

                    	    state._fsp--;


                    	    		current.merge(this_input_value_17);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    kw=(Token)match(input,33,FOLLOW_33_in_ruleinput_value2903); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_valueAccess().getENDKeyword_2_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinput_value"


    // $ANTLR start "entryRuleinput_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1068:1: entryRuleinput_options returns [String current=null] : iv_ruleinput_options= ruleinput_options EOF ;
    public final String entryRuleinput_options() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinput_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1069:2: (iv_ruleinput_options= ruleinput_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1070:2: iv_ruleinput_options= ruleinput_options EOF
            {
             newCompositeNode(grammarAccess.getInput_optionsRule()); 
            pushFollow(FOLLOW_ruleinput_options_in_entryRuleinput_options2945);
            iv_ruleinput_options=ruleinput_options();

            state._fsp--;

             current =iv_ruleinput_options.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_options2956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinput_options"


    // $ANTLR start "ruleinput_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1077:1: ruleinput_options returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_input_option_1= ruleinput_option (kw= ',' this_input_option_3= ruleinput_option )* ) ;
    public final AntlrDatatypeRuleToken ruleinput_options() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_input_option_1 = null;

        AntlrDatatypeRuleToken this_input_option_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1080:28: ( (kw= ':' this_input_option_1= ruleinput_option (kw= ',' this_input_option_3= ruleinput_option )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1081:1: (kw= ':' this_input_option_1= ruleinput_option (kw= ',' this_input_option_3= ruleinput_option )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1081:1: (kw= ':' this_input_option_1= ruleinput_option (kw= ',' this_input_option_3= ruleinput_option )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1082:2: kw= ':' this_input_option_1= ruleinput_option (kw= ',' this_input_option_3= ruleinput_option )*
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleinput_options2994); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInput_optionsAccess().getColonKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getInput_optionsAccess().getInput_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleinput_option_in_ruleinput_options3016);
            this_input_option_1=ruleinput_option();

            state._fsp--;


            		current.merge(this_input_option_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1098:1: (kw= ',' this_input_option_3= ruleinput_option )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1099:2: kw= ',' this_input_option_3= ruleinput_option
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleinput_options3035); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getInput_optionsAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getInput_optionsAccess().getInput_optionParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleinput_option_in_ruleinput_options3057);
            	    this_input_option_3=ruleinput_option();

            	    state._fsp--;


            	    		current.merge(this_input_option_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinput_options"


    // $ANTLR start "entryRuleinput_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1123:1: entryRuleinput_option returns [String current=null] : iv_ruleinput_option= ruleinput_option EOF ;
    public final String entryRuleinput_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinput_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1124:2: (iv_ruleinput_option= ruleinput_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1125:2: iv_ruleinput_option= ruleinput_option EOF
            {
             newCompositeNode(grammarAccess.getInput_optionRule()); 
            pushFollow(FOLLOW_ruleinput_option_in_entryRuleinput_option3105);
            iv_ruleinput_option=ruleinput_option();

            state._fsp--;

             current =iv_ruleinput_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_option3116); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinput_option"


    // $ANTLR start "ruleinput_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1132:1: ruleinput_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'OPTIONAL' | kw= 'DEFINED' | kw= 'DISABLED' | kw= 'MAPBYTYPE' | kw= 'MAPBYNAME' | kw= 'MANY' ) | (kw= 'FORMFIELD' kw= '(' this_formfield_option_8= ruleformfield_option kw= ')' ) | (kw= 'ENABLE' kw= '(' this_assign_list_12= ruleassign_list kw= ')' ) | (kw= 'TYPE' kw= '(' this_inputtype_options_16= ruleinputtype_options kw= ')' ) | ( (kw= 'RANGE' | kw= 'DEFAULT' | kw= 'MAXLENGTH' | kw= 'DISABLED' | kw= 'DESCRIPTION' | kw= 'NULL' | kw= 'FIELDLENGTH' | kw= 'ROWS' | kw= 'COLS' | kw= '_HTML_STYLECLASS' | kw= 'LABEL' ) kw= '(' this_value_list_30= rulevalue_list kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleinput_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_formfield_option_8 = null;

        AntlrDatatypeRuleToken this_assign_list_12 = null;

        AntlrDatatypeRuleToken this_inputtype_options_16 = null;

        AntlrDatatypeRuleToken this_value_list_30 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1135:28: ( ( (kw= 'OPTIONAL' | kw= 'DEFINED' | kw= 'DISABLED' | kw= 'MAPBYTYPE' | kw= 'MAPBYNAME' | kw= 'MANY' ) | (kw= 'FORMFIELD' kw= '(' this_formfield_option_8= ruleformfield_option kw= ')' ) | (kw= 'ENABLE' kw= '(' this_assign_list_12= ruleassign_list kw= ')' ) | (kw= 'TYPE' kw= '(' this_inputtype_options_16= ruleinputtype_options kw= ')' ) | ( (kw= 'RANGE' | kw= 'DEFAULT' | kw= 'MAXLENGTH' | kw= 'DISABLED' | kw= 'DESCRIPTION' | kw= 'NULL' | kw= 'FIELDLENGTH' | kw= 'ROWS' | kw= 'COLS' | kw= '_HTML_STYLECLASS' | kw= 'LABEL' ) kw= '(' this_value_list_30= rulevalue_list kw= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1136:1: ( (kw= 'OPTIONAL' | kw= 'DEFINED' | kw= 'DISABLED' | kw= 'MAPBYTYPE' | kw= 'MAPBYNAME' | kw= 'MANY' ) | (kw= 'FORMFIELD' kw= '(' this_formfield_option_8= ruleformfield_option kw= ')' ) | (kw= 'ENABLE' kw= '(' this_assign_list_12= ruleassign_list kw= ')' ) | (kw= 'TYPE' kw= '(' this_inputtype_options_16= ruleinputtype_options kw= ')' ) | ( (kw= 'RANGE' | kw= 'DEFAULT' | kw= 'MAXLENGTH' | kw= 'DISABLED' | kw= 'DESCRIPTION' | kw= 'NULL' | kw= 'FIELDLENGTH' | kw= 'ROWS' | kw= 'COLS' | kw= '_HTML_STYLECLASS' | kw= 'LABEL' ) kw= '(' this_value_list_30= rulevalue_list kw= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1136:1: ( (kw= 'OPTIONAL' | kw= 'DEFINED' | kw= 'DISABLED' | kw= 'MAPBYTYPE' | kw= 'MAPBYNAME' | kw= 'MANY' ) | (kw= 'FORMFIELD' kw= '(' this_formfield_option_8= ruleformfield_option kw= ')' ) | (kw= 'ENABLE' kw= '(' this_assign_list_12= ruleassign_list kw= ')' ) | (kw= 'TYPE' kw= '(' this_inputtype_options_16= ruleinputtype_options kw= ')' ) | ( (kw= 'RANGE' | kw= 'DEFAULT' | kw= 'MAXLENGTH' | kw= 'DISABLED' | kw= 'DESCRIPTION' | kw= 'NULL' | kw= 'FIELDLENGTH' | kw= 'ROWS' | kw= 'COLS' | kw= '_HTML_STYLECLASS' | kw= 'LABEL' ) kw= '(' this_value_list_30= rulevalue_list kw= ')' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
            case 50:
            case 51:
            case 52:
                {
                alt33=1;
                }
                break;
            case 49:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==EOF||LA33_2==20||LA33_2==30||LA33_2==33||(LA33_2>=38 && LA33_2<=39)||(LA33_2>=41 && LA33_2<=46)) ) {
                    alt33=1;
                }
                else if ( (LA33_2==36) ) {
                    alt33=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                alt33=2;
                }
                break;
            case 54:
                {
                alt33=3;
                }
                break;
            case 55:
                {
                alt33=4;
                }
                break;
            case 13:
            case 18:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1136:2: (kw= 'OPTIONAL' | kw= 'DEFINED' | kw= 'DISABLED' | kw= 'MAPBYTYPE' | kw= 'MAPBYNAME' | kw= 'MANY' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1136:2: (kw= 'OPTIONAL' | kw= 'DEFINED' | kw= 'DISABLED' | kw= 'MAPBYTYPE' | kw= 'MAPBYNAME' | kw= 'MANY' )
                    int alt31=6;
                    switch ( input.LA(1) ) {
                    case 47:
                        {
                        alt31=1;
                        }
                        break;
                    case 48:
                        {
                        alt31=2;
                        }
                        break;
                    case 49:
                        {
                        alt31=3;
                        }
                        break;
                    case 50:
                        {
                        alt31=4;
                        }
                        break;
                    case 51:
                        {
                        alt31=5;
                        }
                        break;
                    case 52:
                        {
                        alt31=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1137:2: kw= 'OPTIONAL'
                            {
                            kw=(Token)match(input,47,FOLLOW_47_in_ruleinput_option3155); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getOPTIONALKeyword_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1144:2: kw= 'DEFINED'
                            {
                            kw=(Token)match(input,48,FOLLOW_48_in_ruleinput_option3174); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getDEFINEDKeyword_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1151:2: kw= 'DISABLED'
                            {
                            kw=(Token)match(input,49,FOLLOW_49_in_ruleinput_option3193); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getDISABLEDKeyword_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1158:2: kw= 'MAPBYTYPE'
                            {
                            kw=(Token)match(input,50,FOLLOW_50_in_ruleinput_option3212); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getMAPBYTYPEKeyword_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1165:2: kw= 'MAPBYNAME'
                            {
                            kw=(Token)match(input,51,FOLLOW_51_in_ruleinput_option3231); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getMAPBYNAMEKeyword_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1172:2: kw= 'MANY'
                            {
                            kw=(Token)match(input,52,FOLLOW_52_in_ruleinput_option3250); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getMANYKeyword_0_5()); 
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1178:6: (kw= 'FORMFIELD' kw= '(' this_formfield_option_8= ruleformfield_option kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1178:6: (kw= 'FORMFIELD' kw= '(' this_formfield_option_8= ruleformfield_option kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1179:2: kw= 'FORMFIELD' kw= '(' this_formfield_option_8= ruleformfield_option kw= ')'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleinput_option3271); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getFORMFIELDKeyword_1_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleinput_option3284); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInput_optionAccess().getFormfield_optionParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleformfield_option_in_ruleinput_option3306);
                    this_formfield_option_8=ruleformfield_option();

                    state._fsp--;


                    		current.merge(this_formfield_option_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleinput_option3324); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_1_3()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1208:6: (kw= 'ENABLE' kw= '(' this_assign_list_12= ruleassign_list kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1208:6: (kw= 'ENABLE' kw= '(' this_assign_list_12= ruleassign_list kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1209:2: kw= 'ENABLE' kw= '(' this_assign_list_12= ruleassign_list kw= ')'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleinput_option3345); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getENABLEKeyword_2_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleinput_option3358); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInput_optionAccess().getAssign_listParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_ruleassign_list_in_ruleinput_option3380);
                    this_assign_list_12=ruleassign_list();

                    state._fsp--;


                    		current.merge(this_assign_list_12);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleinput_option3398); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_2_3()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1238:6: (kw= 'TYPE' kw= '(' this_inputtype_options_16= ruleinputtype_options kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1238:6: (kw= 'TYPE' kw= '(' this_inputtype_options_16= ruleinputtype_options kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1239:2: kw= 'TYPE' kw= '(' this_inputtype_options_16= ruleinputtype_options kw= ')'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleinput_option3419); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getTYPEKeyword_3_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleinput_option3432); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_3_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInput_optionAccess().getInputtype_optionsParserRuleCall_3_2()); 
                        
                    pushFollow(FOLLOW_ruleinputtype_options_in_ruleinput_option3454);
                    this_inputtype_options_16=ruleinputtype_options();

                    state._fsp--;


                    		current.merge(this_inputtype_options_16);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleinput_option3472); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_3_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1268:6: ( (kw= 'RANGE' | kw= 'DEFAULT' | kw= 'MAXLENGTH' | kw= 'DISABLED' | kw= 'DESCRIPTION' | kw= 'NULL' | kw= 'FIELDLENGTH' | kw= 'ROWS' | kw= 'COLS' | kw= '_HTML_STYLECLASS' | kw= 'LABEL' ) kw= '(' this_value_list_30= rulevalue_list kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1268:6: ( (kw= 'RANGE' | kw= 'DEFAULT' | kw= 'MAXLENGTH' | kw= 'DISABLED' | kw= 'DESCRIPTION' | kw= 'NULL' | kw= 'FIELDLENGTH' | kw= 'ROWS' | kw= 'COLS' | kw= '_HTML_STYLECLASS' | kw= 'LABEL' ) kw= '(' this_value_list_30= rulevalue_list kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1268:7: (kw= 'RANGE' | kw= 'DEFAULT' | kw= 'MAXLENGTH' | kw= 'DISABLED' | kw= 'DESCRIPTION' | kw= 'NULL' | kw= 'FIELDLENGTH' | kw= 'ROWS' | kw= 'COLS' | kw= '_HTML_STYLECLASS' | kw= 'LABEL' ) kw= '(' this_value_list_30= rulevalue_list kw= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1268:7: (kw= 'RANGE' | kw= 'DEFAULT' | kw= 'MAXLENGTH' | kw= 'DISABLED' | kw= 'DESCRIPTION' | kw= 'NULL' | kw= 'FIELDLENGTH' | kw= 'ROWS' | kw= 'COLS' | kw= '_HTML_STYLECLASS' | kw= 'LABEL' )
                    int alt32=11;
                    switch ( input.LA(1) ) {
                    case 56:
                        {
                        alt32=1;
                        }
                        break;
                    case 57:
                        {
                        alt32=2;
                        }
                        break;
                    case 58:
                        {
                        alt32=3;
                        }
                        break;
                    case 49:
                        {
                        alt32=4;
                        }
                        break;
                    case 13:
                        {
                        alt32=5;
                        }
                        break;
                    case 59:
                        {
                        alt32=6;
                        }
                        break;
                    case 60:
                        {
                        alt32=7;
                        }
                        break;
                    case 61:
                        {
                        alt32=8;
                        }
                        break;
                    case 62:
                        {
                        alt32=9;
                        }
                        break;
                    case 63:
                        {
                        alt32=10;
                        }
                        break;
                    case 18:
                        {
                        alt32=11;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1269:2: kw= 'RANGE'
                            {
                            kw=(Token)match(input,56,FOLLOW_56_in_ruleinput_option3494); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getRANGEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1276:2: kw= 'DEFAULT'
                            {
                            kw=(Token)match(input,57,FOLLOW_57_in_ruleinput_option3513); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getDEFAULTKeyword_4_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1283:2: kw= 'MAXLENGTH'
                            {
                            kw=(Token)match(input,58,FOLLOW_58_in_ruleinput_option3532); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getMAXLENGTHKeyword_4_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1290:2: kw= 'DISABLED'
                            {
                            kw=(Token)match(input,49,FOLLOW_49_in_ruleinput_option3551); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getDISABLEDKeyword_4_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1297:2: kw= 'DESCRIPTION'
                            {
                            kw=(Token)match(input,13,FOLLOW_13_in_ruleinput_option3570); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getDESCRIPTIONKeyword_4_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1304:2: kw= 'NULL'
                            {
                            kw=(Token)match(input,59,FOLLOW_59_in_ruleinput_option3589); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getNULLKeyword_4_0_5()); 
                                

                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1311:2: kw= 'FIELDLENGTH'
                            {
                            kw=(Token)match(input,60,FOLLOW_60_in_ruleinput_option3608); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getFIELDLENGTHKeyword_4_0_6()); 
                                

                            }
                            break;
                        case 8 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1318:2: kw= 'ROWS'
                            {
                            kw=(Token)match(input,61,FOLLOW_61_in_ruleinput_option3627); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getROWSKeyword_4_0_7()); 
                                

                            }
                            break;
                        case 9 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1325:2: kw= 'COLS'
                            {
                            kw=(Token)match(input,62,FOLLOW_62_in_ruleinput_option3646); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getCOLSKeyword_4_0_8()); 
                                

                            }
                            break;
                        case 10 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1332:2: kw= '_HTML_STYLECLASS'
                            {
                            kw=(Token)match(input,63,FOLLOW_63_in_ruleinput_option3665); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().get_HTML_STYLECLASSKeyword_4_0_9()); 
                                

                            }
                            break;
                        case 11 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1339:2: kw= 'LABEL'
                            {
                            kw=(Token)match(input,18,FOLLOW_18_in_ruleinput_option3684); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getInput_optionAccess().getLABELKeyword_4_0_10()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,36,FOLLOW_36_in_ruleinput_option3698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_4_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInput_optionAccess().getValue_listParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_rulevalue_list_in_ruleinput_option3720);
                    this_value_list_30=rulevalue_list();

                    state._fsp--;


                    		current.merge(this_value_list_30);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleinput_option3738); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_4_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinput_option"


    // $ANTLR start "entryRuleformfield_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1375:1: entryRuleformfield_option returns [String current=null] : iv_ruleformfield_option= ruleformfield_option EOF ;
    public final String entryRuleformfield_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleformfield_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1376:2: (iv_ruleformfield_option= ruleformfield_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1377:2: iv_ruleformfield_option= ruleformfield_option EOF
            {
             newCompositeNode(grammarAccess.getFormfield_optionRule()); 
            pushFollow(FOLLOW_ruleformfield_option_in_entryRuleformfield_option3780);
            iv_ruleformfield_option=ruleformfield_option();

            state._fsp--;

             current =iv_ruleformfield_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformfield_option3791); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformfield_option"


    // $ANTLR start "ruleformfield_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1384:1: ruleformfield_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' ) ;
    public final AntlrDatatypeRuleToken ruleformfield_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1387:28: ( (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1388:1: (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1388:1: (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' )
            int alt34=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt34=1;
                }
                break;
            case 65:
                {
                alt34=2;
                }
                break;
            case 66:
                {
                alt34=3;
                }
                break;
            case 67:
                {
                alt34=4;
                }
                break;
            case 68:
                {
                alt34=5;
                }
                break;
            case 69:
                {
                alt34=6;
                }
                break;
            case 70:
                {
                alt34=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1389:2: kw= 'CHECKBOX'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleformfield_option3829); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getCHECKBOXKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1396:2: kw= 'RADIO'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleformfield_option3848); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getRADIOKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1403:2: kw= 'SELECT'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleformfield_option3867); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getSELECTKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1410:2: kw= 'MULTIPLESELECT'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleformfield_option3886); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getMULTIPLESELECTKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1417:2: kw= 'TEXTAREA'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleformfield_option3905); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getTEXTAREAKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1424:2: kw= 'HIDDEN'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleformfield_option3924); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getHIDDENKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1431:2: kw= 'TEXT'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleformfield_option3943); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getTEXTKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformfield_option"


    // $ANTLR start "entryRuleinputtype_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1444:1: entryRuleinputtype_option returns [String current=null] : iv_ruleinputtype_option= ruleinputtype_option EOF ;
    public final String entryRuleinputtype_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinputtype_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1445:2: (iv_ruleinputtype_option= ruleinputtype_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1446:2: iv_ruleinputtype_option= ruleinputtype_option EOF
            {
             newCompositeNode(grammarAccess.getInputtype_optionRule()); 
            pushFollow(FOLLOW_ruleinputtype_option_in_entryRuleinputtype_option3984);
            iv_ruleinputtype_option=ruleinputtype_option();

            state._fsp--;

             current =iv_ruleinputtype_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputtype_option3995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinputtype_option"


    // $ANTLR start "ruleinputtype_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1453:1: ruleinputtype_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' ) ;
    public final AntlrDatatypeRuleToken ruleinputtype_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1456:28: ( (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1457:1: (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1457:1: (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt35=1;
                }
                break;
            case 71:
                {
                alt35=2;
                }
                break;
            case 72:
                {
                alt35=3;
                }
                break;
            case 73:
                {
                alt35=4;
                }
                break;
            case 74:
                {
                alt35=5;
                }
                break;
            case 75:
                {
                alt35=6;
                }
                break;
            case 76:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1458:2: kw= 'STRING'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleinputtype_option4033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getSTRINGKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1465:2: kw= 'UNICODE'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleinputtype_option4052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getUNICODEKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1472:2: kw= 'UNISTR'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleinputtype_option4071); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getUNISTRKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1479:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleinputtype_option4090); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getINTEGERKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1486:2: kw= 'DECIMAL'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleinputtype_option4109); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getDECIMALKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1493:2: kw= 'NUMERIC'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleinputtype_option4128); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getNUMERICKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1500:2: kw= 'REAL'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleinputtype_option4147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getREALKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinputtype_option"


    // $ANTLR start "entryRuleinputtype_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1513:1: entryRuleinputtype_options returns [String current=null] : iv_ruleinputtype_options= ruleinputtype_options EOF ;
    public final String entryRuleinputtype_options() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinputtype_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1514:2: (iv_ruleinputtype_options= ruleinputtype_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1515:2: iv_ruleinputtype_options= ruleinputtype_options EOF
            {
             newCompositeNode(grammarAccess.getInputtype_optionsRule()); 
            pushFollow(FOLLOW_ruleinputtype_options_in_entryRuleinputtype_options4188);
            iv_ruleinputtype_options=ruleinputtype_options();

            state._fsp--;

             current =iv_ruleinputtype_options.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputtype_options4199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinputtype_options"


    // $ANTLR start "ruleinputtype_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1522:1: ruleinputtype_options returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* ) ;
    public final AntlrDatatypeRuleToken ruleinputtype_options() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_inputtype_option_0 = null;

        AntlrDatatypeRuleToken this_inputtype_option_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1525:28: ( (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1526:1: (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1526:1: (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1527:5: this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )*
            {
             
                    newCompositeNode(grammarAccess.getInputtype_optionsAccess().getInputtype_optionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleinputtype_option_in_ruleinputtype_options4246);
            this_inputtype_option_0=ruleinputtype_option();

            state._fsp--;


            		current.merge(this_inputtype_option_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1537:1: (kw= ',' this_inputtype_option_2= ruleinputtype_option )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1538:2: kw= ',' this_inputtype_option_2= ruleinputtype_option
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleinputtype_options4265); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getInputtype_optionsAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getInputtype_optionsAccess().getInputtype_optionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleinputtype_option_in_ruleinputtype_options4287);
            	    this_inputtype_option_2=ruleinputtype_option();

            	    state._fsp--;


            	    		current.merge(this_inputtype_option_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinputtype_options"


    // $ANTLR start "entryRuleoutput_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1562:1: entryRuleoutput_section returns [String current=null] : iv_ruleoutput_section= ruleoutput_section EOF ;
    public final String entryRuleoutput_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoutput_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1563:2: (iv_ruleoutput_section= ruleoutput_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1564:2: iv_ruleoutput_section= ruleoutput_section EOF
            {
             newCompositeNode(grammarAccess.getOutput_sectionRule()); 
            pushFollow(FOLLOW_ruleoutput_section_in_entryRuleoutput_section4335);
            iv_ruleoutput_section=ruleoutput_section();

            state._fsp--;

             current =iv_ruleoutput_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_section4346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoutput_section"


    // $ANTLR start "ruleoutput_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1571:1: ruleoutput_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OUTPUTS' (this_output_value_1= ruleoutput_value )+ kw= 'END' ) ;
    public final AntlrDatatypeRuleToken ruleoutput_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_output_value_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1574:28: ( (kw= 'OUTPUTS' (this_output_value_1= ruleoutput_value )+ kw= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1575:1: (kw= 'OUTPUTS' (this_output_value_1= ruleoutput_value )+ kw= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1575:1: (kw= 'OUTPUTS' (this_output_value_1= ruleoutput_value )+ kw= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1576:2: kw= 'OUTPUTS' (this_output_value_1= ruleoutput_value )+ kw= 'END'
            {
            kw=(Token)match(input,77,FOLLOW_77_in_ruleoutput_section4384); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOutput_sectionAccess().getOUTPUTSKeyword_0()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1581:1: (this_output_value_1= ruleoutput_value )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_TOKEN && LA37_0<=RULE_STRING)||(LA37_0>=41 && LA37_0<=43)||LA37_0==45||LA37_0==89) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1582:5: this_output_value_1= ruleoutput_value
            	    {
            	     
            	            newCompositeNode(grammarAccess.getOutput_sectionAccess().getOutput_valueParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleoutput_value_in_ruleoutput_section4407);
            	    this_output_value_1=ruleoutput_value();

            	    state._fsp--;


            	    		current.merge(this_output_value_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            kw=(Token)match(input,33,FOLLOW_33_in_ruleoutput_section4427); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOutput_sectionAccess().getENDKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoutput_section"


    // $ANTLR start "entryRuleeclfield_type"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1608:1: entryRuleeclfield_type returns [String current=null] : iv_ruleeclfield_type= ruleeclfield_type EOF ;
    public final String entryRuleeclfield_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleeclfield_type = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1609:2: (iv_ruleeclfield_type= ruleeclfield_type EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1610:2: iv_ruleeclfield_type= ruleeclfield_type EOF
            {
             newCompositeNode(grammarAccess.getEclfield_typeRule()); 
            pushFollow(FOLLOW_ruleeclfield_type_in_entryRuleeclfield_type4470);
            iv_ruleeclfield_type=ruleeclfield_type();

            state._fsp--;

             current =iv_ruleeclfield_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleeclfield_type4481); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleeclfield_type"


    // $ANTLR start "ruleeclfield_type"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1617:1: ruleeclfield_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'INTEGER' | kw= 'UNSIGNED' | kw= 'STRING' | kw= 'QSTRING' | kw= 'VARSTRING' | kw= 'UNICODE' | kw= 'VARUNICODE' ) (this_INT_7= RULE_INT )? ) | (kw= 'DATA' | kw= 'REAL' ) ) ;
    public final AntlrDatatypeRuleToken ruleeclfield_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1620:28: ( ( ( (kw= 'INTEGER' | kw= 'UNSIGNED' | kw= 'STRING' | kw= 'QSTRING' | kw= 'VARSTRING' | kw= 'UNICODE' | kw= 'VARUNICODE' ) (this_INT_7= RULE_INT )? ) | (kw= 'DATA' | kw= 'REAL' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1621:1: ( ( (kw= 'INTEGER' | kw= 'UNSIGNED' | kw= 'STRING' | kw= 'QSTRING' | kw= 'VARSTRING' | kw= 'UNICODE' | kw= 'VARUNICODE' ) (this_INT_7= RULE_INT )? ) | (kw= 'DATA' | kw= 'REAL' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1621:1: ( ( (kw= 'INTEGER' | kw= 'UNSIGNED' | kw= 'STRING' | kw= 'QSTRING' | kw= 'VARSTRING' | kw= 'UNICODE' | kw= 'VARUNICODE' ) (this_INT_7= RULE_INT )? ) | (kw= 'DATA' | kw= 'REAL' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43||LA41_0==71||LA41_0==73||(LA41_0>=78 && LA41_0<=81)) ) {
                alt41=1;
            }
            else if ( (LA41_0==76||LA41_0==82) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1621:2: ( (kw= 'INTEGER' | kw= 'UNSIGNED' | kw= 'STRING' | kw= 'QSTRING' | kw= 'VARSTRING' | kw= 'UNICODE' | kw= 'VARUNICODE' ) (this_INT_7= RULE_INT )? )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1621:2: ( (kw= 'INTEGER' | kw= 'UNSIGNED' | kw= 'STRING' | kw= 'QSTRING' | kw= 'VARSTRING' | kw= 'UNICODE' | kw= 'VARUNICODE' ) (this_INT_7= RULE_INT )? )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1621:3: (kw= 'INTEGER' | kw= 'UNSIGNED' | kw= 'STRING' | kw= 'QSTRING' | kw= 'VARSTRING' | kw= 'UNICODE' | kw= 'VARUNICODE' ) (this_INT_7= RULE_INT )?
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1621:3: (kw= 'INTEGER' | kw= 'UNSIGNED' | kw= 'STRING' | kw= 'QSTRING' | kw= 'VARSTRING' | kw= 'UNICODE' | kw= 'VARUNICODE' )
                    int alt38=7;
                    switch ( input.LA(1) ) {
                    case 73:
                        {
                        alt38=1;
                        }
                        break;
                    case 78:
                        {
                        alt38=2;
                        }
                        break;
                    case 43:
                        {
                        alt38=3;
                        }
                        break;
                    case 79:
                        {
                        alt38=4;
                        }
                        break;
                    case 80:
                        {
                        alt38=5;
                        }
                        break;
                    case 71:
                        {
                        alt38=6;
                        }
                        break;
                    case 81:
                        {
                        alt38=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1622:2: kw= 'INTEGER'
                            {
                            kw=(Token)match(input,73,FOLLOW_73_in_ruleeclfield_type4521); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getINTEGERKeyword_0_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1629:2: kw= 'UNSIGNED'
                            {
                            kw=(Token)match(input,78,FOLLOW_78_in_ruleeclfield_type4540); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getUNSIGNEDKeyword_0_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1636:2: kw= 'STRING'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleeclfield_type4559); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getSTRINGKeyword_0_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1643:2: kw= 'QSTRING'
                            {
                            kw=(Token)match(input,79,FOLLOW_79_in_ruleeclfield_type4578); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getQSTRINGKeyword_0_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1650:2: kw= 'VARSTRING'
                            {
                            kw=(Token)match(input,80,FOLLOW_80_in_ruleeclfield_type4597); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getVARSTRINGKeyword_0_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1657:2: kw= 'UNICODE'
                            {
                            kw=(Token)match(input,71,FOLLOW_71_in_ruleeclfield_type4616); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getUNICODEKeyword_0_0_5()); 
                                

                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1664:2: kw= 'VARUNICODE'
                            {
                            kw=(Token)match(input,81,FOLLOW_81_in_ruleeclfield_type4635); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getVARUNICODEKeyword_0_0_6()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1669:2: (this_INT_7= RULE_INT )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_INT) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1669:7: this_INT_7= RULE_INT
                            {
                            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleeclfield_type4652); 

                            		current.merge(this_INT_7);
                                
                             
                                newLeafNode(this_INT_7, grammarAccess.getEclfield_typeAccess().getINTTerminalRuleCall_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1677:6: (kw= 'DATA' | kw= 'REAL' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1677:6: (kw= 'DATA' | kw= 'REAL' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==82) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==76) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1678:2: kw= 'DATA'
                            {
                            kw=(Token)match(input,82,FOLLOW_82_in_ruleeclfield_type4680); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getDATAKeyword_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1685:2: kw= 'REAL'
                            {
                            kw=(Token)match(input,76,FOLLOW_76_in_ruleeclfield_type4699); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEclfield_typeAccess().getREALKeyword_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleeclfield_type"


    // $ANTLR start "entryRuleecloutput_decl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1698:1: entryRuleecloutput_decl returns [String current=null] : iv_ruleecloutput_decl= ruleecloutput_decl EOF ;
    public final String entryRuleecloutput_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleecloutput_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1699:2: (iv_ruleecloutput_decl= ruleecloutput_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1700:2: iv_ruleecloutput_decl= ruleecloutput_decl EOF
            {
             newCompositeNode(grammarAccess.getEcloutput_declRule()); 
            pushFollow(FOLLOW_ruleecloutput_decl_in_entryRuleecloutput_decl4741);
            iv_ruleecloutput_decl=ruleecloutput_decl();

            state._fsp--;

             current =iv_ruleecloutput_decl.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecloutput_decl4752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleecloutput_decl"


    // $ANTLR start "ruleecloutput_decl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1707:1: ruleecloutput_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_eclfield_type_0= ruleeclfield_type this_TOKEN_1= RULE_TOKEN (this_output_options_2= ruleoutput_options )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleecloutput_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TOKEN_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_eclfield_type_0 = null;

        AntlrDatatypeRuleToken this_output_options_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1710:28: ( (this_eclfield_type_0= ruleeclfield_type this_TOKEN_1= RULE_TOKEN (this_output_options_2= ruleoutput_options )? kw= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1711:1: (this_eclfield_type_0= ruleeclfield_type this_TOKEN_1= RULE_TOKEN (this_output_options_2= ruleoutput_options )? kw= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1711:1: (this_eclfield_type_0= ruleeclfield_type this_TOKEN_1= RULE_TOKEN (this_output_options_2= ruleoutput_options )? kw= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1712:5: this_eclfield_type_0= ruleeclfield_type this_TOKEN_1= RULE_TOKEN (this_output_options_2= ruleoutput_options )? kw= ';'
            {
             
                    newCompositeNode(grammarAccess.getEcloutput_declAccess().getEclfield_typeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleeclfield_type_in_ruleecloutput_decl4799);
            this_eclfield_type_0=ruleeclfield_type();

            state._fsp--;


            		current.merge(this_eclfield_type_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_TOKEN_1=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_ruleecloutput_decl4819); 

            		current.merge(this_TOKEN_1);
                
             
                newLeafNode(this_TOKEN_1, grammarAccess.getEcloutput_declAccess().getTOKENTerminalRuleCall_1()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1729:1: (this_output_options_2= ruleoutput_options )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1730:5: this_output_options_2= ruleoutput_options
                    {
                     
                            newCompositeNode(grammarAccess.getEcloutput_declAccess().getOutput_optionsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleoutput_options_in_ruleecloutput_decl4847);
                    this_output_options_2=ruleoutput_options();

                    state._fsp--;


                    		current.merge(this_output_options_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_20_in_ruleecloutput_decl4867); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEcloutput_declAccess().getSemicolonKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleecloutput_decl"


    // $ANTLR start "entryRuleoutput_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1754:1: entryRuleoutput_option returns [String current=null] : iv_ruleoutput_option= ruleoutput_option EOF ;
    public final String entryRuleoutput_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoutput_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1755:2: (iv_ruleoutput_option= ruleoutput_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1756:2: iv_ruleoutput_option= ruleoutput_option EOF
            {
             newCompositeNode(grammarAccess.getOutput_optionRule()); 
            pushFollow(FOLLOW_ruleoutput_option_in_entryRuleoutput_option4908);
            iv_ruleoutput_option=ruleoutput_option();

            state._fsp--;

             current =iv_ruleoutput_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_option4919); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoutput_option"


    // $ANTLR start "ruleoutput_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1763:1: ruleoutput_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'SIDE' | kw= 'LARGE' | kw= 'SMALL' | kw= 'FEW' | kw= 'WUID' ) | (kw= 'FROM' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ')' ) | (kw= 'DESCRIPTION' kw= '(' this_value_11= rulevalue kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleoutput_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_7=null;
        AntlrDatatypeRuleToken this_value_11 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1766:28: ( ( (kw= 'SIDE' | kw= 'LARGE' | kw= 'SMALL' | kw= 'FEW' | kw= 'WUID' ) | (kw= 'FROM' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ')' ) | (kw= 'DESCRIPTION' kw= '(' this_value_11= rulevalue kw= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1767:1: ( (kw= 'SIDE' | kw= 'LARGE' | kw= 'SMALL' | kw= 'FEW' | kw= 'WUID' ) | (kw= 'FROM' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ')' ) | (kw= 'DESCRIPTION' kw= '(' this_value_11= rulevalue kw= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1767:1: ( (kw= 'SIDE' | kw= 'LARGE' | kw= 'SMALL' | kw= 'FEW' | kw= 'WUID' ) | (kw= 'FROM' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ')' ) | (kw= 'DESCRIPTION' kw= '(' this_value_11= rulevalue kw= ')' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt44=1;
                }
                break;
            case 88:
                {
                alt44=2;
                }
                break;
            case 13:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1767:2: (kw= 'SIDE' | kw= 'LARGE' | kw= 'SMALL' | kw= 'FEW' | kw= 'WUID' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1767:2: (kw= 'SIDE' | kw= 'LARGE' | kw= 'SMALL' | kw= 'FEW' | kw= 'WUID' )
                    int alt43=5;
                    switch ( input.LA(1) ) {
                    case 83:
                        {
                        alt43=1;
                        }
                        break;
                    case 84:
                        {
                        alt43=2;
                        }
                        break;
                    case 85:
                        {
                        alt43=3;
                        }
                        break;
                    case 86:
                        {
                        alt43=4;
                        }
                        break;
                    case 87:
                        {
                        alt43=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }

                    switch (alt43) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1768:2: kw= 'SIDE'
                            {
                            kw=(Token)match(input,83,FOLLOW_83_in_ruleoutput_option4958); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_optionAccess().getSIDEKeyword_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1775:2: kw= 'LARGE'
                            {
                            kw=(Token)match(input,84,FOLLOW_84_in_ruleoutput_option4977); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_optionAccess().getLARGEKeyword_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1782:2: kw= 'SMALL'
                            {
                            kw=(Token)match(input,85,FOLLOW_85_in_ruleoutput_option4996); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_optionAccess().getSMALLKeyword_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1789:2: kw= 'FEW'
                            {
                            kw=(Token)match(input,86,FOLLOW_86_in_ruleoutput_option5015); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_optionAccess().getFEWKeyword_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1796:2: kw= 'WUID'
                            {
                            kw=(Token)match(input,87,FOLLOW_87_in_ruleoutput_option5034); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_optionAccess().getWUIDKeyword_0_4()); 
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1802:6: (kw= 'FROM' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1802:6: (kw= 'FROM' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1803:2: kw= 'FROM' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ')'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleoutput_option5055); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_optionAccess().getFROMKeyword_1_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleoutput_option5068); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_optionAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    this_TOKEN_7=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_ruleoutput_option5083); 

                    		current.merge(this_TOKEN_7);
                        
                     
                        newLeafNode(this_TOKEN_7, grammarAccess.getOutput_optionAccess().getTOKENTerminalRuleCall_1_2()); 
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleoutput_option5101); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_optionAccess().getRightParenthesisKeyword_1_3()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1828:6: (kw= 'DESCRIPTION' kw= '(' this_value_11= rulevalue kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1828:6: (kw= 'DESCRIPTION' kw= '(' this_value_11= rulevalue kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1829:2: kw= 'DESCRIPTION' kw= '(' this_value_11= rulevalue kw= ')'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleoutput_option5122); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_optionAccess().getDESCRIPTIONKeyword_2_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleoutput_option5135); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_optionAccess().getLeftParenthesisKeyword_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getOutput_optionAccess().getValueParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_rulevalue_in_ruleoutput_option5157);
                    this_value_11=rulevalue();

                    state._fsp--;


                    		current.merge(this_value_11);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleoutput_option5175); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_optionAccess().getRightParenthesisKeyword_2_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoutput_option"


    // $ANTLR start "entryRuleoutput_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1865:1: entryRuleoutput_options returns [String current=null] : iv_ruleoutput_options= ruleoutput_options EOF ;
    public final String entryRuleoutput_options() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoutput_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1866:2: (iv_ruleoutput_options= ruleoutput_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1867:2: iv_ruleoutput_options= ruleoutput_options EOF
            {
             newCompositeNode(grammarAccess.getOutput_optionsRule()); 
            pushFollow(FOLLOW_ruleoutput_options_in_entryRuleoutput_options5217);
            iv_ruleoutput_options=ruleoutput_options();

            state._fsp--;

             current =iv_ruleoutput_options.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_options5228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoutput_options"


    // $ANTLR start "ruleoutput_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1874:1: ruleoutput_options returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_output_option_1= ruleoutput_option (kw= ',' this_output_option_3= ruleoutput_option )* ) ;
    public final AntlrDatatypeRuleToken ruleoutput_options() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_output_option_1 = null;

        AntlrDatatypeRuleToken this_output_option_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1877:28: ( (kw= ':' this_output_option_1= ruleoutput_option (kw= ',' this_output_option_3= ruleoutput_option )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1878:1: (kw= ':' this_output_option_1= ruleoutput_option (kw= ',' this_output_option_3= ruleoutput_option )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1878:1: (kw= ':' this_output_option_1= ruleoutput_option (kw= ',' this_output_option_3= ruleoutput_option )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1879:2: kw= ':' this_output_option_1= ruleoutput_option (kw= ',' this_output_option_3= ruleoutput_option )*
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleoutput_options5266); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOutput_optionsAccess().getColonKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getOutput_optionsAccess().getOutput_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleoutput_option_in_ruleoutput_options5288);
            this_output_option_1=ruleoutput_option();

            state._fsp--;


            		current.merge(this_output_option_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1895:1: (kw= ',' this_output_option_3= ruleoutput_option )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==30) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1896:2: kw= ',' this_output_option_3= ruleoutput_option
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleoutput_options5307); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getOutput_optionsAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getOutput_optionsAccess().getOutput_optionParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleoutput_option_in_ruleoutput_options5329);
            	    this_output_option_3=ruleoutput_option();

            	    state._fsp--;


            	    		current.merge(this_output_option_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoutput_options"


    // $ANTLR start "entryRuleoutput_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1920:1: entryRuleoutput_value returns [String current=null] : iv_ruleoutput_value= ruleoutput_value EOF ;
    public final String entryRuleoutput_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoutput_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1921:2: (iv_ruleoutput_value= ruleoutput_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1922:2: iv_ruleoutput_value= ruleoutput_value EOF
            {
             newCompositeNode(grammarAccess.getOutput_valueRule()); 
            pushFollow(FOLLOW_ruleoutput_value_in_entryRuleoutput_value5377);
            iv_ruleoutput_value=ruleoutput_value();

            state._fsp--;

             current =iv_ruleoutput_value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_value5388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoutput_value"


    // $ANTLR start "ruleoutput_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1929:1: ruleoutput_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )? this_value_4= rulevalue (this_output_options_5= ruleoutput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_8= RULE_TOKEN (this_output_base_9= ruleoutput_base )? (this_output_options_10= ruleoutput_options )? (this_ecloutput_decl_11= ruleecloutput_decl )* kw= 'END' ) | (kw= 'DATASET' this_TOKEN_14= RULE_TOKEN (this_output_base_15= ruleoutput_base )? (this_output_options_16= ruleoutput_options )? kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken ruleoutput_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_8=null;
        Token this_TOKEN_14=null;
        AntlrDatatypeRuleToken this_value_4 = null;

        AntlrDatatypeRuleToken this_output_options_5 = null;

        AntlrDatatypeRuleToken this_output_base_9 = null;

        AntlrDatatypeRuleToken this_output_options_10 = null;

        AntlrDatatypeRuleToken this_ecloutput_decl_11 = null;

        AntlrDatatypeRuleToken this_output_base_15 = null;

        AntlrDatatypeRuleToken this_output_options_16 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1932:28: ( ( ( (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )? this_value_4= rulevalue (this_output_options_5= ruleoutput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_8= RULE_TOKEN (this_output_base_9= ruleoutput_base )? (this_output_options_10= ruleoutput_options )? (this_ecloutput_decl_11= ruleecloutput_decl )* kw= 'END' ) | (kw= 'DATASET' this_TOKEN_14= RULE_TOKEN (this_output_base_15= ruleoutput_base )? (this_output_options_16= ruleoutput_options )? kw= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1933:1: ( ( (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )? this_value_4= rulevalue (this_output_options_5= ruleoutput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_8= RULE_TOKEN (this_output_base_9= ruleoutput_base )? (this_output_options_10= ruleoutput_options )? (this_ecloutput_decl_11= ruleecloutput_decl )* kw= 'END' ) | (kw= 'DATASET' this_TOKEN_14= RULE_TOKEN (this_output_base_15= ruleoutput_base )? (this_output_options_16= ruleoutput_options )? kw= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1933:1: ( ( (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )? this_value_4= rulevalue (this_output_options_5= ruleoutput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_8= RULE_TOKEN (this_output_base_9= ruleoutput_base )? (this_output_options_10= ruleoutput_options )? (this_ecloutput_decl_11= ruleecloutput_decl )* kw= 'END' ) | (kw= 'DATASET' this_TOKEN_14= RULE_TOKEN (this_output_base_15= ruleoutput_base )? (this_output_options_16= ruleoutput_options )? kw= ';' ) )
            int alt53=3;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1933:2: ( (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )? this_value_4= rulevalue (this_output_options_5= ruleoutput_options )? kw= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1933:2: ( (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )? this_value_4= rulevalue (this_output_options_5= ruleoutput_options )? kw= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1933:3: (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )? this_value_4= rulevalue (this_output_options_5= ruleoutput_options )? kw= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1933:3: (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )?
                    int alt46=5;
                    switch ( input.LA(1) ) {
                        case 41:
                            {
                            alt46=1;
                            }
                            break;
                        case 42:
                            {
                            alt46=2;
                            }
                            break;
                        case 43:
                            {
                            alt46=3;
                            }
                            break;
                        case 89:
                            {
                            alt46=4;
                            }
                            break;
                    }

                    switch (alt46) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1934:2: kw= 'BOOL'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleoutput_value5428); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_valueAccess().getBOOLKeyword_0_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1941:2: kw= 'INT'
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleoutput_value5447); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_valueAccess().getINTKeyword_0_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1948:2: kw= 'STRING'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleoutput_value5466); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_valueAccess().getSTRINGKeyword_0_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1955:2: kw= 'ACTION'
                            {
                            kw=(Token)match(input,89,FOLLOW_89_in_ruleoutput_value5485); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOutput_valueAccess().getACTIONKeyword_0_0_3()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getOutput_valueAccess().getValueParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulevalue_in_ruleoutput_value5509);
                    this_value_4=rulevalue();

                    state._fsp--;


                    		current.merge(this_value_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:1: (this_output_options_5= ruleoutput_options )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==35) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1972:5: this_output_options_5= ruleoutput_options
                            {
                             
                                    newCompositeNode(grammarAccess.getOutput_valueAccess().getOutput_optionsParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleoutput_options_in_ruleoutput_value5537);
                            this_output_options_5=ruleoutput_options();

                            state._fsp--;


                            		current.merge(this_output_options_5);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,20,FOLLOW_20_in_ruleoutput_value5557); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_0_3()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1989:6: (kw= 'DATASET' this_TOKEN_8= RULE_TOKEN (this_output_base_9= ruleoutput_base )? (this_output_options_10= ruleoutput_options )? (this_ecloutput_decl_11= ruleecloutput_decl )* kw= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1989:6: (kw= 'DATASET' this_TOKEN_8= RULE_TOKEN (this_output_base_9= ruleoutput_base )? (this_output_options_10= ruleoutput_options )? (this_ecloutput_decl_11= ruleecloutput_decl )* kw= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1990:2: kw= 'DATASET' this_TOKEN_8= RULE_TOKEN (this_output_base_9= ruleoutput_base )? (this_output_options_10= ruleoutput_options )? (this_ecloutput_decl_11= ruleecloutput_decl )* kw= 'END'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleoutput_value5578); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_valueAccess().getDATASETKeyword_1_0()); 
                        
                    this_TOKEN_8=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_ruleoutput_value5593); 

                    		current.merge(this_TOKEN_8);
                        
                     
                        newLeafNode(this_TOKEN_8, grammarAccess.getOutput_valueAccess().getTOKENTerminalRuleCall_1_1()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2002:1: (this_output_base_9= ruleoutput_base )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==36) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2003:5: this_output_base_9= ruleoutput_base
                            {
                             
                                    newCompositeNode(grammarAccess.getOutput_valueAccess().getOutput_baseParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_ruleoutput_base_in_ruleoutput_value5621);
                            this_output_base_9=ruleoutput_base();

                            state._fsp--;


                            		current.merge(this_output_base_9);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2013:3: (this_output_options_10= ruleoutput_options )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==35) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2014:5: this_output_options_10= ruleoutput_options
                            {
                             
                                    newCompositeNode(grammarAccess.getOutput_valueAccess().getOutput_optionsParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_ruleoutput_options_in_ruleoutput_value5651);
                            this_output_options_10=ruleoutput_options();

                            state._fsp--;


                            		current.merge(this_output_options_10);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2024:3: (this_ecloutput_decl_11= ruleecloutput_decl )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==43||LA50_0==71||LA50_0==73||LA50_0==76||(LA50_0>=78 && LA50_0<=82)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2025:5: this_ecloutput_decl_11= ruleecloutput_decl
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOutput_valueAccess().getEcloutput_declParserRuleCall_1_4()); 
                    	        
                    	    pushFollow(FOLLOW_ruleecloutput_decl_in_ruleoutput_value5681);
                    	    this_ecloutput_decl_11=ruleecloutput_decl();

                    	    state._fsp--;


                    	    		current.merge(this_ecloutput_decl_11);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    kw=(Token)match(input,33,FOLLOW_33_in_ruleoutput_value5701); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_valueAccess().getENDKeyword_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2042:6: (kw= 'DATASET' this_TOKEN_14= RULE_TOKEN (this_output_base_15= ruleoutput_base )? (this_output_options_16= ruleoutput_options )? kw= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2042:6: (kw= 'DATASET' this_TOKEN_14= RULE_TOKEN (this_output_base_15= ruleoutput_base )? (this_output_options_16= ruleoutput_options )? kw= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2043:2: kw= 'DATASET' this_TOKEN_14= RULE_TOKEN (this_output_base_15= ruleoutput_base )? (this_output_options_16= ruleoutput_options )? kw= ';'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleoutput_value5722); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_valueAccess().getDATASETKeyword_2_0()); 
                        
                    this_TOKEN_14=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_ruleoutput_value5737); 

                    		current.merge(this_TOKEN_14);
                        
                     
                        newLeafNode(this_TOKEN_14, grammarAccess.getOutput_valueAccess().getTOKENTerminalRuleCall_2_1()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2055:1: (this_output_base_15= ruleoutput_base )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==36) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2056:5: this_output_base_15= ruleoutput_base
                            {
                             
                                    newCompositeNode(grammarAccess.getOutput_valueAccess().getOutput_baseParserRuleCall_2_2()); 
                                
                            pushFollow(FOLLOW_ruleoutput_base_in_ruleoutput_value5765);
                            this_output_base_15=ruleoutput_base();

                            state._fsp--;


                            		current.merge(this_output_base_15);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2066:3: (this_output_options_16= ruleoutput_options )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==35) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2067:5: this_output_options_16= ruleoutput_options
                            {
                             
                                    newCompositeNode(grammarAccess.getOutput_valueAccess().getOutput_optionsParserRuleCall_2_3()); 
                                
                            pushFollow(FOLLOW_ruleoutput_options_in_ruleoutput_value5795);
                            this_output_options_16=ruleoutput_options();

                            state._fsp--;


                            		current.merge(this_output_options_16);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,20,FOLLOW_20_in_ruleoutput_value5815); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_2_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoutput_value"


    // $ANTLR start "entryRuleoutput_base"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2091:1: entryRuleoutput_base returns [String current=null] : iv_ruleoutput_base= ruleoutput_base EOF ;
    public final String entryRuleoutput_base() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoutput_base = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2092:2: (iv_ruleoutput_base= ruleoutput_base EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2093:2: iv_ruleoutput_base= ruleoutput_base EOF
            {
             newCompositeNode(grammarAccess.getOutput_baseRule()); 
            pushFollow(FOLLOW_ruleoutput_base_in_entryRuleoutput_base5857);
            iv_ruleoutput_base=ruleoutput_base();

            state._fsp--;

             current =iv_ruleoutput_base.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_base5868); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoutput_base"


    // $ANTLR start "ruleoutput_base"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2100:1: ruleoutput_base returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_TOKEN_1= RULE_TOKEN kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleoutput_base() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2103:28: ( (kw= '(' this_TOKEN_1= RULE_TOKEN kw= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2104:1: (kw= '(' this_TOKEN_1= RULE_TOKEN kw= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2104:1: (kw= '(' this_TOKEN_1= RULE_TOKEN kw= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2105:2: kw= '(' this_TOKEN_1= RULE_TOKEN kw= ')'
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleoutput_base5906); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOutput_baseAccess().getLeftParenthesisKeyword_0()); 
                
            this_TOKEN_1=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_ruleoutput_base5921); 

            		current.merge(this_TOKEN_1);
                
             
                newLeafNode(this_TOKEN_1, grammarAccess.getOutput_baseAccess().getTOKENTerminalRuleCall_1()); 
                
            kw=(Token)match(input,37,FOLLOW_37_in_ruleoutput_base5939); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOutput_baseAccess().getRightParenthesisKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoutput_base"


    // $ANTLR start "entryRulegenerate_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2131:1: entryRulegenerate_section returns [String current=null] : iv_rulegenerate_section= rulegenerate_section EOF ;
    public final String entryRulegenerate_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegenerate_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2132:2: (iv_rulegenerate_section= rulegenerate_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2133:2: iv_rulegenerate_section= rulegenerate_section EOF
            {
             newCompositeNode(grammarAccess.getGenerate_sectionRule()); 
            pushFollow(FOLLOW_rulegenerate_section_in_entryRulegenerate_section5980);
            iv_rulegenerate_section=rulegenerate_section();

            state._fsp--;

             current =iv_rulegenerate_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_section5991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegenerate_section"


    // $ANTLR start "rulegenerate_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2140:1: rulegenerate_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'GENERATES' this_generate_body_1= rulegenerate_body kw= 'ENDGENERATES' ) ;
    public final AntlrDatatypeRuleToken rulegenerate_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_generate_body_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2143:28: ( (kw= 'GENERATES' this_generate_body_1= rulegenerate_body kw= 'ENDGENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2144:1: (kw= 'GENERATES' this_generate_body_1= rulegenerate_body kw= 'ENDGENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2144:1: (kw= 'GENERATES' this_generate_body_1= rulegenerate_body kw= 'ENDGENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2145:2: kw= 'GENERATES' this_generate_body_1= rulegenerate_body kw= 'ENDGENERATES'
            {
            kw=(Token)match(input,90,FOLLOW_90_in_rulegenerate_section6029); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGenerate_sectionAccess().getGENERATESKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getGenerate_sectionAccess().getGenerate_bodyParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulegenerate_body_in_rulegenerate_section6051);
            this_generate_body_1=rulegenerate_body();

            state._fsp--;


            		current.merge(this_generate_body_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,91,FOLLOW_91_in_rulegenerate_section6069); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGenerate_sectionAccess().getENDGENERATESKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegenerate_section"


    // $ANTLR start "entryRulegenerate_body"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2175:1: entryRulegenerate_body returns [String current=null] : iv_rulegenerate_body= rulegenerate_body EOF ;
    public final String entryRulegenerate_body() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegenerate_body = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2176:2: (iv_rulegenerate_body= rulegenerate_body EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2177:2: iv_rulegenerate_body= rulegenerate_body EOF
            {
             newCompositeNode(grammarAccess.getGenerate_bodyRule()); 
            pushFollow(FOLLOW_rulegenerate_body_in_entryRulegenerate_body6110);
            iv_rulegenerate_body=rulegenerate_body();

            state._fsp--;

             current =iv_rulegenerate_body.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_body6121); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegenerate_body"


    // $ANTLR start "rulegenerate_body"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2184:1: rulegenerate_body returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'INLINE' (kw= '.' | kw= '-' )+ ) | (kw= 'SALT' kw= '(' this_TOKEN_5= RULE_TOKEN kw= ')' kw= ':' (kw= 'SCOREDSEARCH' | kw= 'PROFILE' ) ) ) ;
    public final AntlrDatatypeRuleToken rulegenerate_body() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2187:28: ( ( (kw= 'INLINE' (kw= '.' | kw= '-' )+ ) | (kw= 'SALT' kw= '(' this_TOKEN_5= RULE_TOKEN kw= ')' kw= ':' (kw= 'SCOREDSEARCH' | kw= 'PROFILE' ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2188:1: ( (kw= 'INLINE' (kw= '.' | kw= '-' )+ ) | (kw= 'SALT' kw= '(' this_TOKEN_5= RULE_TOKEN kw= ')' kw= ':' (kw= 'SCOREDSEARCH' | kw= 'PROFILE' ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2188:1: ( (kw= 'INLINE' (kw= '.' | kw= '-' )+ ) | (kw= 'SALT' kw= '(' this_TOKEN_5= RULE_TOKEN kw= ')' kw= ':' (kw= 'SCOREDSEARCH' | kw= 'PROFILE' ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==92) ) {
                alt56=1;
            }
            else if ( (LA56_0==95) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2188:2: (kw= 'INLINE' (kw= '.' | kw= '-' )+ )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2188:2: (kw= 'INLINE' (kw= '.' | kw= '-' )+ )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2189:2: kw= 'INLINE' (kw= '.' | kw= '-' )+
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_rulegenerate_body6160); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getINLINEKeyword_0_0()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2194:1: (kw= '.' | kw= '-' )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=3;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==93) ) {
                            alt54=1;
                        }
                        else if ( (LA54_0==94) ) {
                            alt54=2;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2195:2: kw= '.'
                    	    {
                    	    kw=(Token)match(input,93,FOLLOW_93_in_rulegenerate_body6174); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getFullStopKeyword_0_1_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2202:2: kw= '-'
                    	    {
                    	    kw=(Token)match(input,94,FOLLOW_94_in_rulegenerate_body6193); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getHyphenMinusKeyword_0_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2208:6: (kw= 'SALT' kw= '(' this_TOKEN_5= RULE_TOKEN kw= ')' kw= ':' (kw= 'SCOREDSEARCH' | kw= 'PROFILE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2208:6: (kw= 'SALT' kw= '(' this_TOKEN_5= RULE_TOKEN kw= ')' kw= ':' (kw= 'SCOREDSEARCH' | kw= 'PROFILE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2209:2: kw= 'SALT' kw= '(' this_TOKEN_5= RULE_TOKEN kw= ')' kw= ':' (kw= 'SCOREDSEARCH' | kw= 'PROFILE' )
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_rulegenerate_body6216); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getSALTKeyword_1_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulegenerate_body6229); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    this_TOKEN_5=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulegenerate_body6244); 

                    		current.merge(this_TOKEN_5);
                        
                     
                        newLeafNode(this_TOKEN_5, grammarAccess.getGenerate_bodyAccess().getTOKENTerminalRuleCall_1_2()); 
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_rulegenerate_body6262); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getRightParenthesisKeyword_1_3()); 
                        
                    kw=(Token)match(input,35,FOLLOW_35_in_rulegenerate_body6275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getColonKeyword_1_4()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2239:1: (kw= 'SCOREDSEARCH' | kw= 'PROFILE' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==96) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==97) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2240:2: kw= 'SCOREDSEARCH'
                            {
                            kw=(Token)match(input,96,FOLLOW_96_in_rulegenerate_body6289); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getSCOREDSEARCHKeyword_1_5_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2247:2: kw= 'PROFILE'
                            {
                            kw=(Token)match(input,97,FOLLOW_97_in_rulegenerate_body6308); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getGenerate_bodyAccess().getPROFILEKeyword_1_5_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegenerate_body"


    // $ANTLR start "entryRulevisual_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2260:1: entryRulevisual_section returns [String current=null] : iv_rulevisual_section= rulevisual_section EOF ;
    public final String entryRulevisual_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevisual_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2261:2: (iv_rulevisual_section= rulevisual_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2262:2: iv_rulevisual_section= rulevisual_section EOF
            {
             newCompositeNode(grammarAccess.getVisual_sectionRule()); 
            pushFollow(FOLLOW_rulevisual_section_in_entryRulevisual_section6351);
            iv_rulevisual_section=rulevisual_section();

            state._fsp--;

             current =iv_rulevisual_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_section6362); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevisual_section"


    // $ANTLR start "rulevisual_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2269:1: rulevisual_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'VISUALIZE' this_TOKEN_1= RULE_TOKEN (this_visual_section_options_2= rulevisual_section_options )? (this_visualization_3= rulevisualization )+ kw= 'END' ) ;
    public final AntlrDatatypeRuleToken rulevisual_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_1=null;
        AntlrDatatypeRuleToken this_visual_section_options_2 = null;

        AntlrDatatypeRuleToken this_visualization_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2272:28: ( (kw= 'VISUALIZE' this_TOKEN_1= RULE_TOKEN (this_visual_section_options_2= rulevisual_section_options )? (this_visualization_3= rulevisualization )+ kw= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2273:1: (kw= 'VISUALIZE' this_TOKEN_1= RULE_TOKEN (this_visual_section_options_2= rulevisual_section_options )? (this_visualization_3= rulevisualization )+ kw= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2273:1: (kw= 'VISUALIZE' this_TOKEN_1= RULE_TOKEN (this_visual_section_options_2= rulevisual_section_options )? (this_visualization_3= rulevisualization )+ kw= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2274:2: kw= 'VISUALIZE' this_TOKEN_1= RULE_TOKEN (this_visual_section_options_2= rulevisual_section_options )? (this_visualization_3= rulevisualization )+ kw= 'END'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_rulevisual_section6400); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVisual_sectionAccess().getVISUALIZEKeyword_0()); 
                
            this_TOKEN_1=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulevisual_section6415); 

            		current.merge(this_TOKEN_1);
                
             
                newLeafNode(this_TOKEN_1, grammarAccess.getVisual_sectionAccess().getTOKENTerminalRuleCall_1()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2286:1: (this_visual_section_options_2= rulevisual_section_options )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==35) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2287:5: this_visual_section_options_2= rulevisual_section_options
                    {
                     
                            newCompositeNode(grammarAccess.getVisual_sectionAccess().getVisual_section_optionsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulevisual_section_options_in_rulevisual_section6443);
                    this_visual_section_options_2=rulevisual_section_options();

                    state._fsp--;


                    		current.merge(this_visual_section_options_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2297:3: (this_visualization_3= rulevisualization )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=98 && LA58_0<=104)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2298:5: this_visualization_3= rulevisualization
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVisual_sectionAccess().getVisualizationParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_rulevisualization_in_rulevisual_section6473);
            	    this_visualization_3=rulevisualization();

            	    state._fsp--;


            	    		current.merge(this_visualization_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            kw=(Token)match(input,33,FOLLOW_33_in_rulevisual_section6493); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVisual_sectionAccess().getENDKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevisual_section"


    // $ANTLR start "entryRulevisualization"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2322:1: entryRulevisualization returns [String current=null] : iv_rulevisualization= rulevisualization EOF ;
    public final String entryRulevisualization() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevisualization = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2323:2: (iv_rulevisualization= rulevisualization EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2324:2: iv_rulevisualization= rulevisualization EOF
            {
             newCompositeNode(grammarAccess.getVisualizationRule()); 
            pushFollow(FOLLOW_rulevisualization_in_entryRulevisualization6534);
            iv_rulevisualization=rulevisualization();

            state._fsp--;

             current =iv_rulevisualization.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisualization6545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevisualization"


    // $ANTLR start "rulevisualization"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2331:1: rulevisualization returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'CHORO' | kw= 'LINE' | kw= 'TIMELINE' | kw= 'PIE' | kw= 'BAR' | kw= 'TABLE' ) this_TOKEN_6= RULE_TOKEN kw= '(' this_vis_basis_8= rulevis_basis kw= ')' (this_visual_options_10= rulevisual_options )? kw= ';' ) | (kw= 'SLIDER' this_TOKEN_13= RULE_TOKEN (this_visual_options_14= rulevisual_options )? kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken rulevisualization() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_6=null;
        Token this_TOKEN_13=null;
        AntlrDatatypeRuleToken this_vis_basis_8 = null;

        AntlrDatatypeRuleToken this_visual_options_10 = null;

        AntlrDatatypeRuleToken this_visual_options_14 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2334:28: ( ( ( (kw= 'CHORO' | kw= 'LINE' | kw= 'TIMELINE' | kw= 'PIE' | kw= 'BAR' | kw= 'TABLE' ) this_TOKEN_6= RULE_TOKEN kw= '(' this_vis_basis_8= rulevis_basis kw= ')' (this_visual_options_10= rulevisual_options )? kw= ';' ) | (kw= 'SLIDER' this_TOKEN_13= RULE_TOKEN (this_visual_options_14= rulevisual_options )? kw= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2335:1: ( ( (kw= 'CHORO' | kw= 'LINE' | kw= 'TIMELINE' | kw= 'PIE' | kw= 'BAR' | kw= 'TABLE' ) this_TOKEN_6= RULE_TOKEN kw= '(' this_vis_basis_8= rulevis_basis kw= ')' (this_visual_options_10= rulevisual_options )? kw= ';' ) | (kw= 'SLIDER' this_TOKEN_13= RULE_TOKEN (this_visual_options_14= rulevisual_options )? kw= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2335:1: ( ( (kw= 'CHORO' | kw= 'LINE' | kw= 'TIMELINE' | kw= 'PIE' | kw= 'BAR' | kw= 'TABLE' ) this_TOKEN_6= RULE_TOKEN kw= '(' this_vis_basis_8= rulevis_basis kw= ')' (this_visual_options_10= rulevisual_options )? kw= ';' ) | (kw= 'SLIDER' this_TOKEN_13= RULE_TOKEN (this_visual_options_14= rulevisual_options )? kw= ';' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=98 && LA62_0<=103)) ) {
                alt62=1;
            }
            else if ( (LA62_0==104) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2335:2: ( (kw= 'CHORO' | kw= 'LINE' | kw= 'TIMELINE' | kw= 'PIE' | kw= 'BAR' | kw= 'TABLE' ) this_TOKEN_6= RULE_TOKEN kw= '(' this_vis_basis_8= rulevis_basis kw= ')' (this_visual_options_10= rulevisual_options )? kw= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2335:2: ( (kw= 'CHORO' | kw= 'LINE' | kw= 'TIMELINE' | kw= 'PIE' | kw= 'BAR' | kw= 'TABLE' ) this_TOKEN_6= RULE_TOKEN kw= '(' this_vis_basis_8= rulevis_basis kw= ')' (this_visual_options_10= rulevisual_options )? kw= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2335:3: (kw= 'CHORO' | kw= 'LINE' | kw= 'TIMELINE' | kw= 'PIE' | kw= 'BAR' | kw= 'TABLE' ) this_TOKEN_6= RULE_TOKEN kw= '(' this_vis_basis_8= rulevis_basis kw= ')' (this_visual_options_10= rulevisual_options )? kw= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2335:3: (kw= 'CHORO' | kw= 'LINE' | kw= 'TIMELINE' | kw= 'PIE' | kw= 'BAR' | kw= 'TABLE' )
                    int alt59=6;
                    switch ( input.LA(1) ) {
                    case 98:
                        {
                        alt59=1;
                        }
                        break;
                    case 99:
                        {
                        alt59=2;
                        }
                        break;
                    case 100:
                        {
                        alt59=3;
                        }
                        break;
                    case 101:
                        {
                        alt59=4;
                        }
                        break;
                    case 102:
                        {
                        alt59=5;
                        }
                        break;
                    case 103:
                        {
                        alt59=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2336:2: kw= 'CHORO'
                            {
                            kw=(Token)match(input,98,FOLLOW_98_in_rulevisualization6585); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisualizationAccess().getCHOROKeyword_0_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2343:2: kw= 'LINE'
                            {
                            kw=(Token)match(input,99,FOLLOW_99_in_rulevisualization6604); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisualizationAccess().getLINEKeyword_0_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2350:2: kw= 'TIMELINE'
                            {
                            kw=(Token)match(input,100,FOLLOW_100_in_rulevisualization6623); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisualizationAccess().getTIMELINEKeyword_0_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2357:2: kw= 'PIE'
                            {
                            kw=(Token)match(input,101,FOLLOW_101_in_rulevisualization6642); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisualizationAccess().getPIEKeyword_0_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2364:2: kw= 'BAR'
                            {
                            kw=(Token)match(input,102,FOLLOW_102_in_rulevisualization6661); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisualizationAccess().getBARKeyword_0_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2371:2: kw= 'TABLE'
                            {
                            kw=(Token)match(input,103,FOLLOW_103_in_rulevisualization6680); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisualizationAccess().getTABLEKeyword_0_0_5()); 
                                

                            }
                            break;

                    }

                    this_TOKEN_6=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulevisualization6696); 

                    		current.merge(this_TOKEN_6);
                        
                     
                        newLeafNode(this_TOKEN_6, grammarAccess.getVisualizationAccess().getTOKENTerminalRuleCall_0_1()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulevisualization6714); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisualizationAccess().getLeftParenthesisKeyword_0_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getVisualizationAccess().getVis_basisParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_rulevis_basis_in_rulevisualization6736);
                    this_vis_basis_8=rulevis_basis();

                    state._fsp--;


                    		current.merge(this_vis_basis_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_rulevisualization6754); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisualizationAccess().getRightParenthesisKeyword_0_4()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2406:1: (this_visual_options_10= rulevisual_options )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==35) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2407:5: this_visual_options_10= rulevisual_options
                            {
                             
                                    newCompositeNode(grammarAccess.getVisualizationAccess().getVisual_optionsParserRuleCall_0_5()); 
                                
                            pushFollow(FOLLOW_rulevisual_options_in_rulevisualization6777);
                            this_visual_options_10=rulevisual_options();

                            state._fsp--;


                            		current.merge(this_visual_options_10);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,20,FOLLOW_20_in_rulevisualization6797); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisualizationAccess().getSemicolonKeyword_0_6()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2424:6: (kw= 'SLIDER' this_TOKEN_13= RULE_TOKEN (this_visual_options_14= rulevisual_options )? kw= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2424:6: (kw= 'SLIDER' this_TOKEN_13= RULE_TOKEN (this_visual_options_14= rulevisual_options )? kw= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2425:2: kw= 'SLIDER' this_TOKEN_13= RULE_TOKEN (this_visual_options_14= rulevisual_options )? kw= ';'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_rulevisualization6818); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisualizationAccess().getSLIDERKeyword_1_0()); 
                        
                    this_TOKEN_13=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulevisualization6833); 

                    		current.merge(this_TOKEN_13);
                        
                     
                        newLeafNode(this_TOKEN_13, grammarAccess.getVisualizationAccess().getTOKENTerminalRuleCall_1_1()); 
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2437:1: (this_visual_options_14= rulevisual_options )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==35) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2438:5: this_visual_options_14= rulevisual_options
                            {
                             
                                    newCompositeNode(grammarAccess.getVisualizationAccess().getVisual_optionsParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_rulevisual_options_in_rulevisualization6861);
                            this_visual_options_14=rulevisual_options();

                            state._fsp--;


                            		current.merge(this_visual_options_14);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,20,FOLLOW_20_in_rulevisualization6881); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisualizationAccess().getSemicolonKeyword_1_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevisualization"


    // $ANTLR start "entryRulevis_basis"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2462:1: entryRulevis_basis returns [String current=null] : iv_rulevis_basis= rulevis_basis EOF ;
    public final String entryRulevis_basis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevis_basis = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2463:2: (iv_rulevis_basis= rulevis_basis EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2464:2: iv_rulevis_basis= rulevis_basis EOF
            {
             newCompositeNode(grammarAccess.getVis_basisRule()); 
            pushFollow(FOLLOW_rulevis_basis_in_entryRulevis_basis6923);
            iv_rulevis_basis=rulevis_basis();

            state._fsp--;

             current =iv_rulevis_basis.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevis_basis6934); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevis_basis"


    // $ANTLR start "rulevis_basis"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2471:1: rulevis_basis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TOKEN_0= RULE_TOKEN (this_vis_basis_qualifiers_1= rulevis_basis_qualifiers )? ) ;
    public final AntlrDatatypeRuleToken rulevis_basis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TOKEN_0=null;
        AntlrDatatypeRuleToken this_vis_basis_qualifiers_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2474:28: ( (this_TOKEN_0= RULE_TOKEN (this_vis_basis_qualifiers_1= rulevis_basis_qualifiers )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2475:1: (this_TOKEN_0= RULE_TOKEN (this_vis_basis_qualifiers_1= rulevis_basis_qualifiers )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2475:1: (this_TOKEN_0= RULE_TOKEN (this_vis_basis_qualifiers_1= rulevis_basis_qualifiers )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2475:6: this_TOKEN_0= RULE_TOKEN (this_vis_basis_qualifiers_1= rulevis_basis_qualifiers )?
            {
            this_TOKEN_0=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulevis_basis6974); 

            		current.merge(this_TOKEN_0);
                
             
                newLeafNode(this_TOKEN_0, grammarAccess.getVis_basisAccess().getTOKENTerminalRuleCall_0()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2482:1: (this_vis_basis_qualifiers_1= rulevis_basis_qualifiers )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==105) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2483:5: this_vis_basis_qualifiers_1= rulevis_basis_qualifiers
                    {
                     
                            newCompositeNode(grammarAccess.getVis_basisAccess().getVis_basis_qualifiersParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulevis_basis_qualifiers_in_rulevis_basis7002);
                    this_vis_basis_qualifiers_1=rulevis_basis_qualifiers();

                    state._fsp--;


                    		current.merge(this_vis_basis_qualifiers_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevis_basis"


    // $ANTLR start "entryRulevis_basis_qualifiers"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2501:1: entryRulevis_basis_qualifiers returns [String current=null] : iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF ;
    public final String entryRulevis_basis_qualifiers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevis_basis_qualifiers = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2502:2: (iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2503:2: iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF
            {
             newCompositeNode(grammarAccess.getVis_basis_qualifiersRule()); 
            pushFollow(FOLLOW_rulevis_basis_qualifiers_in_entryRulevis_basis_qualifiers7050);
            iv_rulevis_basis_qualifiers=rulevis_basis_qualifiers();

            state._fsp--;

             current =iv_rulevis_basis_qualifiers.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevis_basis_qualifiers7061); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevis_basis_qualifiers"


    // $ANTLR start "rulevis_basis_qualifiers"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2510:1: rulevis_basis_qualifiers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_function_1= rulefunction (kw= ',' this_function_3= rulefunction )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulevis_basis_qualifiers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_function_1 = null;

        AntlrDatatypeRuleToken this_function_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2513:28: ( (kw= '{' this_function_1= rulefunction (kw= ',' this_function_3= rulefunction )* kw= '}' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2514:1: (kw= '{' this_function_1= rulefunction (kw= ',' this_function_3= rulefunction )* kw= '}' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2514:1: (kw= '{' this_function_1= rulefunction (kw= ',' this_function_3= rulefunction )* kw= '}' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2515:2: kw= '{' this_function_1= rulefunction (kw= ',' this_function_3= rulefunction )* kw= '}'
            {
            kw=(Token)match(input,105,FOLLOW_105_in_rulevis_basis_qualifiers7099); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVis_basis_qualifiersAccess().getLeftCurlyBracketKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVis_basis_qualifiersAccess().getFunctionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulefunction_in_rulevis_basis_qualifiers7121);
            this_function_1=rulefunction();

            state._fsp--;


            		current.merge(this_function_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2531:1: (kw= ',' this_function_3= rulefunction )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==30) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2532:2: kw= ',' this_function_3= rulefunction
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_rulevis_basis_qualifiers7140); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVis_basis_qualifiersAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getVis_basis_qualifiersAccess().getFunctionParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulefunction_in_rulevis_basis_qualifiers7162);
            	    this_function_3=rulefunction();

            	    state._fsp--;


            	    		current.merge(this_function_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            kw=(Token)match(input,106,FOLLOW_106_in_rulevis_basis_qualifiers7182); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVis_basis_qualifiersAccess().getRightCurlyBracketKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevis_basis_qualifiers"


    // $ANTLR start "entryRulefunction"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2562:1: entryRulefunction returns [String current=null] : iv_rulefunction= rulefunction EOF ;
    public final String entryRulefunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2563:2: (iv_rulefunction= rulefunction EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2564:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction7223);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction7234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2571:1: rulefunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_value_0= rulevalue | (kw= 'SUM' kw= '(' this_TOKEN_3= RULE_TOKEN kw= ')' ) | (kw= 'SCALE' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ',' this_INT_9= RULE_INT kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulefunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_3=null;
        Token this_TOKEN_7=null;
        Token this_INT_9=null;
        AntlrDatatypeRuleToken this_value_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2574:28: ( (this_value_0= rulevalue | (kw= 'SUM' kw= '(' this_TOKEN_3= RULE_TOKEN kw= ')' ) | (kw= 'SCALE' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ',' this_INT_9= RULE_INT kw= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2575:1: (this_value_0= rulevalue | (kw= 'SUM' kw= '(' this_TOKEN_3= RULE_TOKEN kw= ')' ) | (kw= 'SCALE' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ',' this_INT_9= RULE_INT kw= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2575:1: (this_value_0= rulevalue | (kw= 'SUM' kw= '(' this_TOKEN_3= RULE_TOKEN kw= ')' ) | (kw= 'SCALE' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ',' this_INT_9= RULE_INT kw= ')' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case RULE_TOKEN:
            case RULE_INT:
            case RULE_STRING:
                {
                alt65=1;
                }
                break;
            case 107:
                {
                alt65=2;
                }
                break;
            case 108:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2576:5: this_value_0= rulevalue
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionAccess().getValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevalue_in_rulefunction7281);
                    this_value_0=rulevalue();

                    state._fsp--;


                    		current.merge(this_value_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2587:6: (kw= 'SUM' kw= '(' this_TOKEN_3= RULE_TOKEN kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2587:6: (kw= 'SUM' kw= '(' this_TOKEN_3= RULE_TOKEN kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2588:2: kw= 'SUM' kw= '(' this_TOKEN_3= RULE_TOKEN kw= ')'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_rulefunction7306); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getSUMKeyword_1_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulefunction7319); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    this_TOKEN_3=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulefunction7334); 

                    		current.merge(this_TOKEN_3);
                        
                     
                        newLeafNode(this_TOKEN_3, grammarAccess.getFunctionAccess().getTOKENTerminalRuleCall_1_2()); 
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_rulefunction7352); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_3()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2613:6: (kw= 'SCALE' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ',' this_INT_9= RULE_INT kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2613:6: (kw= 'SCALE' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ',' this_INT_9= RULE_INT kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2614:2: kw= 'SCALE' kw= '(' this_TOKEN_7= RULE_TOKEN kw= ',' this_INT_9= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_rulefunction7373); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getSCALEKeyword_2_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulefunction7386); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_1()); 
                        
                    this_TOKEN_7=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulefunction7401); 

                    		current.merge(this_TOKEN_7);
                        
                     
                        newLeafNode(this_TOKEN_7, grammarAccess.getFunctionAccess().getTOKENTerminalRuleCall_2_2()); 
                        
                    kw=(Token)match(input,30,FOLLOW_30_in_rulefunction7419); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getCommaKeyword_2_3()); 
                        
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulefunction7434); 

                    		current.merge(this_INT_9);
                        
                     
                        newLeafNode(this_INT_9, grammarAccess.getFunctionAccess().getINTTerminalRuleCall_2_4()); 
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_rulefunction7452); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRulevisual_section_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2659:1: entryRulevisual_section_options returns [String current=null] : iv_rulevisual_section_options= rulevisual_section_options EOF ;
    public final String entryRulevisual_section_options() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevisual_section_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2660:2: (iv_rulevisual_section_options= rulevisual_section_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2661:2: iv_rulevisual_section_options= rulevisual_section_options EOF
            {
             newCompositeNode(grammarAccess.getVisual_section_optionsRule()); 
            pushFollow(FOLLOW_rulevisual_section_options_in_entryRulevisual_section_options7494);
            iv_rulevisual_section_options=rulevisual_section_options();

            state._fsp--;

             current =iv_rulevisual_section_options.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_section_options7505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevisual_section_options"


    // $ANTLR start "rulevisual_section_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2668:1: rulevisual_section_options returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_visual_section_option_1= rulevisual_section_option (kw= ',' this_visual_section_option_3= rulevisual_section_option )* ) ;
    public final AntlrDatatypeRuleToken rulevisual_section_options() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_visual_section_option_1 = null;

        AntlrDatatypeRuleToken this_visual_section_option_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2671:28: ( (kw= ':' this_visual_section_option_1= rulevisual_section_option (kw= ',' this_visual_section_option_3= rulevisual_section_option )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2672:1: (kw= ':' this_visual_section_option_1= rulevisual_section_option (kw= ',' this_visual_section_option_3= rulevisual_section_option )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2672:1: (kw= ':' this_visual_section_option_1= rulevisual_section_option (kw= ',' this_visual_section_option_3= rulevisual_section_option )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2673:2: kw= ':' this_visual_section_option_1= rulevisual_section_option (kw= ',' this_visual_section_option_3= rulevisual_section_option )*
            {
            kw=(Token)match(input,35,FOLLOW_35_in_rulevisual_section_options7543); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVisual_section_optionsAccess().getColonKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVisual_section_optionsAccess().getVisual_section_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevisual_section_option_in_rulevisual_section_options7565);
            this_visual_section_option_1=rulevisual_section_option();

            state._fsp--;


            		current.merge(this_visual_section_option_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2689:1: (kw= ',' this_visual_section_option_3= rulevisual_section_option )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==30) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2690:2: kw= ',' this_visual_section_option_3= rulevisual_section_option
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_rulevisual_section_options7584); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVisual_section_optionsAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getVisual_section_optionsAccess().getVisual_section_optionParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulevisual_section_option_in_rulevisual_section_options7606);
            	    this_visual_section_option_3=rulevisual_section_option();

            	    state._fsp--;


            	    		current.merge(this_visual_section_option_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevisual_section_options"


    // $ANTLR start "entryRulevisual_section_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2714:1: entryRulevisual_section_option returns [String current=null] : iv_rulevisual_section_option= rulevisual_section_option EOF ;
    public final String entryRulevisual_section_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevisual_section_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2715:2: (iv_rulevisual_section_option= rulevisual_section_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2716:2: iv_rulevisual_section_option= rulevisual_section_option EOF
            {
             newCompositeNode(grammarAccess.getVisual_section_optionRule()); 
            pushFollow(FOLLOW_rulevisual_section_option_in_entryRulevisual_section_option7654);
            iv_rulevisual_section_option=rulevisual_section_option();

            state._fsp--;

             current =iv_rulevisual_section_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_section_option7665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevisual_section_option"


    // $ANTLR start "rulevisual_section_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2723:1: rulevisual_section_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LABEL' kw= '(' this_value_2= rulevalue kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulevisual_section_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2726:28: ( (kw= 'LABEL' kw= '(' this_value_2= rulevalue kw= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2727:1: (kw= 'LABEL' kw= '(' this_value_2= rulevalue kw= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2727:1: (kw= 'LABEL' kw= '(' this_value_2= rulevalue kw= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2728:2: kw= 'LABEL' kw= '(' this_value_2= rulevalue kw= ')'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_rulevisual_section_option7703); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVisual_section_optionAccess().getLABELKeyword_0()); 
                
            kw=(Token)match(input,36,FOLLOW_36_in_rulevisual_section_option7716); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVisual_section_optionAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getVisual_section_optionAccess().getValueParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulevalue_in_rulevisual_section_option7738);
            this_value_2=rulevalue();

            state._fsp--;


            		current.merge(this_value_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,37,FOLLOW_37_in_rulevisual_section_option7756); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVisual_section_optionAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevisual_section_option"


    // $ANTLR start "entryRulevisual_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2764:1: entryRulevisual_options returns [String current=null] : iv_rulevisual_options= rulevisual_options EOF ;
    public final String entryRulevisual_options() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevisual_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2765:2: (iv_rulevisual_options= rulevisual_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2766:2: iv_rulevisual_options= rulevisual_options EOF
            {
             newCompositeNode(grammarAccess.getVisual_optionsRule()); 
            pushFollow(FOLLOW_rulevisual_options_in_entryRulevisual_options7797);
            iv_rulevisual_options=rulevisual_options();

            state._fsp--;

             current =iv_rulevisual_options.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_options7808); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevisual_options"


    // $ANTLR start "rulevisual_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2773:1: rulevisual_options returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_visual_option_1= rulevisual_option (kw= ',' this_visual_option_3= rulevisual_option )* ) ;
    public final AntlrDatatypeRuleToken rulevisual_options() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_visual_option_1 = null;

        AntlrDatatypeRuleToken this_visual_option_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2776:28: ( (kw= ':' this_visual_option_1= rulevisual_option (kw= ',' this_visual_option_3= rulevisual_option )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2777:1: (kw= ':' this_visual_option_1= rulevisual_option (kw= ',' this_visual_option_3= rulevisual_option )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2777:1: (kw= ':' this_visual_option_1= rulevisual_option (kw= ',' this_visual_option_3= rulevisual_option )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2778:2: kw= ':' this_visual_option_1= rulevisual_option (kw= ',' this_visual_option_3= rulevisual_option )*
            {
            kw=(Token)match(input,35,FOLLOW_35_in_rulevisual_options7846); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVisual_optionsAccess().getColonKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVisual_optionsAccess().getVisual_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevisual_option_in_rulevisual_options7868);
            this_visual_option_1=rulevisual_option();

            state._fsp--;


            		current.merge(this_visual_option_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2794:1: (kw= ',' this_visual_option_3= rulevisual_option )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==30) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2795:2: kw= ',' this_visual_option_3= rulevisual_option
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_rulevisual_options7887); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVisual_optionsAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getVisual_optionsAccess().getVisual_optionParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulevisual_option_in_rulevisual_options7909);
            	    this_visual_option_3=rulevisual_option();

            	    state._fsp--;


            	    		current.merge(this_visual_option_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevisual_options"


    // $ANTLR start "entryRulevisual_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2819:1: entryRulevisual_option returns [String current=null] : iv_rulevisual_option= rulevisual_option EOF ;
    public final String entryRulevisual_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevisual_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2820:2: (iv_rulevisual_option= rulevisual_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2821:2: iv_rulevisual_option= rulevisual_option EOF
            {
             newCompositeNode(grammarAccess.getVisual_optionRule()); 
            pushFollow(FOLLOW_rulevisual_option_in_entryRulevisual_option7957);
            iv_rulevisual_option=rulevisual_option();

            state._fsp--;

             current =iv_rulevisual_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_option7968); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevisual_option"


    // $ANTLR start "rulevisual_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2828:1: rulevisual_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'TITLE' | kw= 'DATE' | kw= 'DESCRIPTION' | kw= 'PICTURE' | kw= 'STATE' | kw= 'COUNTY' | kw= 'WEIGHT' | kw= 'SIZE' ) kw= '(' this_function_9= rulefunction kw= ')' ) | (this_visual_multival_11= rulevisual_multival kw= '(' this_function_13= rulefunction (kw= ',' this_function_15= rulefunction )* kw= ')' ) | (kw= 'SELECTS' kw= '(' this_TOKEN_19= RULE_TOKEN kw= '->' this_TOKEN_21= RULE_TOKEN kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulevisual_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TOKEN_19=null;
        Token this_TOKEN_21=null;
        AntlrDatatypeRuleToken this_function_9 = null;

        AntlrDatatypeRuleToken this_visual_multival_11 = null;

        AntlrDatatypeRuleToken this_function_13 = null;

        AntlrDatatypeRuleToken this_function_15 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2831:28: ( ( ( (kw= 'TITLE' | kw= 'DATE' | kw= 'DESCRIPTION' | kw= 'PICTURE' | kw= 'STATE' | kw= 'COUNTY' | kw= 'WEIGHT' | kw= 'SIZE' ) kw= '(' this_function_9= rulefunction kw= ')' ) | (this_visual_multival_11= rulevisual_multival kw= '(' this_function_13= rulefunction (kw= ',' this_function_15= rulefunction )* kw= ')' ) | (kw= 'SELECTS' kw= '(' this_TOKEN_19= RULE_TOKEN kw= '->' this_TOKEN_21= RULE_TOKEN kw= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2832:1: ( ( (kw= 'TITLE' | kw= 'DATE' | kw= 'DESCRIPTION' | kw= 'PICTURE' | kw= 'STATE' | kw= 'COUNTY' | kw= 'WEIGHT' | kw= 'SIZE' ) kw= '(' this_function_9= rulefunction kw= ')' ) | (this_visual_multival_11= rulevisual_multival kw= '(' this_function_13= rulefunction (kw= ',' this_function_15= rulefunction )* kw= ')' ) | (kw= 'SELECTS' kw= '(' this_TOKEN_19= RULE_TOKEN kw= '->' this_TOKEN_21= RULE_TOKEN kw= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2832:1: ( ( (kw= 'TITLE' | kw= 'DATE' | kw= 'DESCRIPTION' | kw= 'PICTURE' | kw= 'STATE' | kw= 'COUNTY' | kw= 'WEIGHT' | kw= 'SIZE' ) kw= '(' this_function_9= rulefunction kw= ')' ) | (this_visual_multival_11= rulevisual_multival kw= '(' this_function_13= rulefunction (kw= ',' this_function_15= rulefunction )* kw= ')' ) | (kw= 'SELECTS' kw= '(' this_TOKEN_19= RULE_TOKEN kw= '->' this_TOKEN_21= RULE_TOKEN kw= ')' ) )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 13:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
                {
                alt70=1;
                }
                break;
            case 18:
            case 56:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
                {
                alt70=2;
                }
                break;
            case 116:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2832:2: ( (kw= 'TITLE' | kw= 'DATE' | kw= 'DESCRIPTION' | kw= 'PICTURE' | kw= 'STATE' | kw= 'COUNTY' | kw= 'WEIGHT' | kw= 'SIZE' ) kw= '(' this_function_9= rulefunction kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2832:2: ( (kw= 'TITLE' | kw= 'DATE' | kw= 'DESCRIPTION' | kw= 'PICTURE' | kw= 'STATE' | kw= 'COUNTY' | kw= 'WEIGHT' | kw= 'SIZE' ) kw= '(' this_function_9= rulefunction kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2832:3: (kw= 'TITLE' | kw= 'DATE' | kw= 'DESCRIPTION' | kw= 'PICTURE' | kw= 'STATE' | kw= 'COUNTY' | kw= 'WEIGHT' | kw= 'SIZE' ) kw= '(' this_function_9= rulefunction kw= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2832:3: (kw= 'TITLE' | kw= 'DATE' | kw= 'DESCRIPTION' | kw= 'PICTURE' | kw= 'STATE' | kw= 'COUNTY' | kw= 'WEIGHT' | kw= 'SIZE' )
                    int alt68=8;
                    switch ( input.LA(1) ) {
                    case 109:
                        {
                        alt68=1;
                        }
                        break;
                    case 110:
                        {
                        alt68=2;
                        }
                        break;
                    case 13:
                        {
                        alt68=3;
                        }
                        break;
                    case 111:
                        {
                        alt68=4;
                        }
                        break;
                    case 112:
                        {
                        alt68=5;
                        }
                        break;
                    case 113:
                        {
                        alt68=6;
                        }
                        break;
                    case 114:
                        {
                        alt68=7;
                        }
                        break;
                    case 115:
                        {
                        alt68=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2833:2: kw= 'TITLE'
                            {
                            kw=(Token)match(input,109,FOLLOW_109_in_rulevisual_option8008); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisual_optionAccess().getTITLEKeyword_0_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2840:2: kw= 'DATE'
                            {
                            kw=(Token)match(input,110,FOLLOW_110_in_rulevisual_option8027); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisual_optionAccess().getDATEKeyword_0_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2847:2: kw= 'DESCRIPTION'
                            {
                            kw=(Token)match(input,13,FOLLOW_13_in_rulevisual_option8046); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisual_optionAccess().getDESCRIPTIONKeyword_0_0_2()); 
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2854:2: kw= 'PICTURE'
                            {
                            kw=(Token)match(input,111,FOLLOW_111_in_rulevisual_option8065); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisual_optionAccess().getPICTUREKeyword_0_0_3()); 
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2861:2: kw= 'STATE'
                            {
                            kw=(Token)match(input,112,FOLLOW_112_in_rulevisual_option8084); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisual_optionAccess().getSTATEKeyword_0_0_4()); 
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2868:2: kw= 'COUNTY'
                            {
                            kw=(Token)match(input,113,FOLLOW_113_in_rulevisual_option8103); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisual_optionAccess().getCOUNTYKeyword_0_0_5()); 
                                

                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2875:2: kw= 'WEIGHT'
                            {
                            kw=(Token)match(input,114,FOLLOW_114_in_rulevisual_option8122); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisual_optionAccess().getWEIGHTKeyword_0_0_6()); 
                                

                            }
                            break;
                        case 8 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2882:2: kw= 'SIZE'
                            {
                            kw=(Token)match(input,115,FOLLOW_115_in_rulevisual_option8141); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getVisual_optionAccess().getSIZEKeyword_0_0_7()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,36,FOLLOW_36_in_rulevisual_option8155); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_0_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getVisual_optionAccess().getFunctionParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_rulefunction_in_rulevisual_option8177);
                    this_function_9=rulefunction();

                    state._fsp--;


                    		current.merge(this_function_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_rulevisual_option8195); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getRightParenthesisKeyword_0_3()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2911:6: (this_visual_multival_11= rulevisual_multival kw= '(' this_function_13= rulefunction (kw= ',' this_function_15= rulefunction )* kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2911:6: (this_visual_multival_11= rulevisual_multival kw= '(' this_function_13= rulefunction (kw= ',' this_function_15= rulefunction )* kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2912:5: this_visual_multival_11= rulevisual_multival kw= '(' this_function_13= rulefunction (kw= ',' this_function_15= rulefunction )* kw= ')'
                    {
                     
                            newCompositeNode(grammarAccess.getVisual_optionAccess().getVisual_multivalParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulevisual_multival_in_rulevisual_option8225);
                    this_visual_multival_11=rulevisual_multival();

                    state._fsp--;


                    		current.merge(this_visual_multival_11);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulevisual_option8243); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getVisual_optionAccess().getFunctionParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_rulefunction_in_rulevisual_option8265);
                    this_function_13=rulefunction();

                    state._fsp--;


                    		current.merge(this_function_13);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2939:1: (kw= ',' this_function_15= rulefunction )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==30) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2940:2: kw= ',' this_function_15= rulefunction
                    	    {
                    	    kw=(Token)match(input,30,FOLLOW_30_in_rulevisual_option8284); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getCommaKeyword_1_3_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getVisual_optionAccess().getFunctionParserRuleCall_1_3_1()); 
                    	        
                    	    pushFollow(FOLLOW_rulefunction_in_rulevisual_option8306);
                    	    this_function_15=rulefunction();

                    	    state._fsp--;


                    	    		current.merge(this_function_15);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    kw=(Token)match(input,37,FOLLOW_37_in_rulevisual_option8326); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getRightParenthesisKeyword_1_4()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2963:6: (kw= 'SELECTS' kw= '(' this_TOKEN_19= RULE_TOKEN kw= '->' this_TOKEN_21= RULE_TOKEN kw= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2963:6: (kw= 'SELECTS' kw= '(' this_TOKEN_19= RULE_TOKEN kw= '->' this_TOKEN_21= RULE_TOKEN kw= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2964:2: kw= 'SELECTS' kw= '(' this_TOKEN_19= RULE_TOKEN kw= '->' this_TOKEN_21= RULE_TOKEN kw= ')'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_rulevisual_option8347); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getSELECTSKeyword_2_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_rulevisual_option8360); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_2_1()); 
                        
                    this_TOKEN_19=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulevisual_option8375); 

                    		current.merge(this_TOKEN_19);
                        
                     
                        newLeafNode(this_TOKEN_19, grammarAccess.getVisual_optionAccess().getTOKENTerminalRuleCall_2_2()); 
                        
                    kw=(Token)match(input,117,FOLLOW_117_in_rulevisual_option8393); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getHyphenMinusGreaterThanSignKeyword_2_3()); 
                        
                    this_TOKEN_21=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulevisual_option8408); 

                    		current.merge(this_TOKEN_21);
                        
                     
                        newLeafNode(this_TOKEN_21, grammarAccess.getVisual_optionAccess().getTOKENTerminalRuleCall_2_4()); 
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_rulevisual_option8426); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_optionAccess().getRightParenthesisKeyword_2_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevisual_option"


    // $ANTLR start "entryRulevisual_multival"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3009:1: entryRulevisual_multival returns [String current=null] : iv_rulevisual_multival= rulevisual_multival EOF ;
    public final String entryRulevisual_multival() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevisual_multival = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3010:2: (iv_rulevisual_multival= rulevisual_multival EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3011:2: iv_rulevisual_multival= rulevisual_multival EOF
            {
             newCompositeNode(grammarAccess.getVisual_multivalRule()); 
            pushFollow(FOLLOW_rulevisual_multival_in_entryRulevisual_multival8468);
            iv_rulevisual_multival=rulevisual_multival();

            state._fsp--;

             current =iv_rulevisual_multival.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_multival8479); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevisual_multival"


    // $ANTLR start "rulevisual_multival"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3018:1: rulevisual_multival returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'X' | kw= 'Y' | kw= 'COLOR' | kw= 'RANGE' | kw= 'FILTER' | kw= 'LABEL' | kw= 'VALUE' ) ;
    public final AntlrDatatypeRuleToken rulevisual_multival() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3021:28: ( (kw= 'X' | kw= 'Y' | kw= 'COLOR' | kw= 'RANGE' | kw= 'FILTER' | kw= 'LABEL' | kw= 'VALUE' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3022:1: (kw= 'X' | kw= 'Y' | kw= 'COLOR' | kw= 'RANGE' | kw= 'FILTER' | kw= 'LABEL' | kw= 'VALUE' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3022:1: (kw= 'X' | kw= 'Y' | kw= 'COLOR' | kw= 'RANGE' | kw= 'FILTER' | kw= 'LABEL' | kw= 'VALUE' )
            int alt71=7;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt71=1;
                }
                break;
            case 119:
                {
                alt71=2;
                }
                break;
            case 120:
                {
                alt71=3;
                }
                break;
            case 56:
                {
                alt71=4;
                }
                break;
            case 121:
                {
                alt71=5;
                }
                break;
            case 18:
                {
                alt71=6;
                }
                break;
            case 122:
                {
                alt71=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3023:2: kw= 'X'
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_rulevisual_multival8517); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_multivalAccess().getXKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3030:2: kw= 'Y'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_rulevisual_multival8536); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_multivalAccess().getYKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3037:2: kw= 'COLOR'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_rulevisual_multival8555); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_multivalAccess().getCOLORKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3044:2: kw= 'RANGE'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_rulevisual_multival8574); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_multivalAccess().getRANGEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3051:2: kw= 'FILTER'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_rulevisual_multival8593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_multivalAccess().getFILTERKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3058:2: kw= 'LABEL'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_rulevisual_multival8612); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_multivalAccess().getLABELKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3065:2: kw= 'VALUE'
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_rulevisual_multival8631); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisual_multivalAccess().getVALUEKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevisual_multival"


    // $ANTLR start "entryRulecustom_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3078:1: entryRulecustom_section returns [String current=null] : iv_rulecustom_section= rulecustom_section EOF ;
    public final String entryRulecustom_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecustom_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3079:2: (iv_rulecustom_section= rulecustom_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3080:2: iv_rulecustom_section= rulecustom_section EOF
            {
             newCompositeNode(grammarAccess.getCustom_sectionRule()); 
            pushFollow(FOLLOW_rulecustom_section_in_entryRulecustom_section8672);
            iv_rulecustom_section=rulecustom_section();

            state._fsp--;

             current =iv_rulecustom_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecustom_section8683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecustom_section"


    // $ANTLR start "rulecustom_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3087:1: rulecustom_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CUSTOM' (this_custom_value_1= rulecustom_value )* kw= 'END' ) ;
    public final AntlrDatatypeRuleToken rulecustom_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_custom_value_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3090:28: ( (kw= 'CUSTOM' (this_custom_value_1= rulecustom_value )* kw= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3091:1: (kw= 'CUSTOM' (this_custom_value_1= rulecustom_value )* kw= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3091:1: (kw= 'CUSTOM' (this_custom_value_1= rulecustom_value )* kw= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3092:2: kw= 'CUSTOM' (this_custom_value_1= rulecustom_value )* kw= 'END'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_rulecustom_section8721); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCustom_sectionAccess().getCUSTOMKeyword_0()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3097:1: (this_custom_value_1= rulecustom_value )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_TOKEN) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3098:5: this_custom_value_1= rulecustom_value
            	    {
            	     
            	            newCompositeNode(grammarAccess.getCustom_sectionAccess().getCustom_valueParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_rulecustom_value_in_rulecustom_section8744);
            	    this_custom_value_1=rulecustom_value();

            	    state._fsp--;


            	    		current.merge(this_custom_value_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            kw=(Token)match(input,33,FOLLOW_33_in_rulecustom_section8764); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCustom_sectionAccess().getENDKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecustom_section"


    // $ANTLR start "entryRulecustom_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3122:1: entryRulecustom_value returns [String current=null] : iv_rulecustom_value= rulecustom_value EOF ;
    public final String entryRulecustom_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecustom_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3123:2: (iv_rulecustom_value= rulecustom_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3124:2: iv_rulecustom_value= rulecustom_value EOF
            {
             newCompositeNode(grammarAccess.getCustom_valueRule()); 
            pushFollow(FOLLOW_rulecustom_value_in_entryRulecustom_value8805);
            iv_rulecustom_value=rulecustom_value();

            state._fsp--;

             current =iv_rulecustom_value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecustom_value8816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecustom_value"


    // $ANTLR start "rulecustom_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3131:1: rulecustom_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TOKEN_0= RULE_TOKEN this_value_1= rulevalue kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulecustom_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TOKEN_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_value_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3134:28: ( (this_TOKEN_0= RULE_TOKEN this_value_1= rulevalue kw= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3135:1: (this_TOKEN_0= RULE_TOKEN this_value_1= rulevalue kw= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3135:1: (this_TOKEN_0= RULE_TOKEN this_value_1= rulevalue kw= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3135:6: this_TOKEN_0= RULE_TOKEN this_value_1= rulevalue kw= ';'
            {
            this_TOKEN_0=(Token)match(input,RULE_TOKEN,FOLLOW_RULE_TOKEN_in_rulecustom_value8856); 

            		current.merge(this_TOKEN_0);
                
             
                newLeafNode(this_TOKEN_0, grammarAccess.getCustom_valueAccess().getTOKENTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getCustom_valueAccess().getValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevalue_in_rulecustom_value8883);
            this_value_1=rulevalue();

            state._fsp--;


            		current.merge(this_value_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,20,FOLLOW_20_in_rulecustom_value8901); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCustom_valueAccess().getSemicolonKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecustom_value"


    // $ANTLR start "entryRuleresource_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3167:1: entryRuleresource_option returns [String current=null] : iv_ruleresource_option= ruleresource_option EOF ;
    public final String entryRuleresource_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleresource_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3168:2: (iv_ruleresource_option= ruleresource_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3169:2: iv_ruleresource_option= ruleresource_option EOF
            {
             newCompositeNode(grammarAccess.getResource_optionRule()); 
            pushFollow(FOLLOW_ruleresource_option_in_entryRuleresource_option8942);
            iv_ruleresource_option=ruleresource_option();

            state._fsp--;

             current =iv_ruleresource_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_option8953); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleresource_option"


    // $ANTLR start "ruleresource_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3176:1: ruleresource_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'DESCRIPTION' | kw= 'FILE' | kw= 'LABEL' | kw= '_HTML_STYLECLASS' ) kw= '(' this_value_5= rulevalue kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleresource_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3179:28: ( ( (kw= 'DESCRIPTION' | kw= 'FILE' | kw= 'LABEL' | kw= '_HTML_STYLECLASS' ) kw= '(' this_value_5= rulevalue kw= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3180:1: ( (kw= 'DESCRIPTION' | kw= 'FILE' | kw= 'LABEL' | kw= '_HTML_STYLECLASS' ) kw= '(' this_value_5= rulevalue kw= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3180:1: ( (kw= 'DESCRIPTION' | kw= 'FILE' | kw= 'LABEL' | kw= '_HTML_STYLECLASS' ) kw= '(' this_value_5= rulevalue kw= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3180:2: (kw= 'DESCRIPTION' | kw= 'FILE' | kw= 'LABEL' | kw= '_HTML_STYLECLASS' ) kw= '(' this_value_5= rulevalue kw= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3180:2: (kw= 'DESCRIPTION' | kw= 'FILE' | kw= 'LABEL' | kw= '_HTML_STYLECLASS' )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt73=1;
                }
                break;
            case 123:
                {
                alt73=2;
                }
                break;
            case 18:
                {
                alt73=3;
                }
                break;
            case 63:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3181:2: kw= 'DESCRIPTION'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleresource_option8992); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getResource_optionAccess().getDESCRIPTIONKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3188:2: kw= 'FILE'
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleresource_option9011); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getResource_optionAccess().getFILEKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3195:2: kw= 'LABEL'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleresource_option9030); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getResource_optionAccess().getLABELKeyword_0_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3202:2: kw= '_HTML_STYLECLASS'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleresource_option9049); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getResource_optionAccess().get_HTML_STYLECLASSKeyword_0_3()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,36,FOLLOW_36_in_ruleresource_option9063); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getResource_optionAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getResource_optionAccess().getValueParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulevalue_in_ruleresource_option9085);
            this_value_5=rulevalue();

            state._fsp--;


            		current.merge(this_value_5);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,37,FOLLOW_37_in_ruleresource_option9103); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getResource_optionAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleresource_option"


    // $ANTLR start "entryRuleresource_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3238:1: entryRuleresource_options returns [String current=null] : iv_ruleresource_options= ruleresource_options EOF ;
    public final String entryRuleresource_options() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleresource_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3239:2: (iv_ruleresource_options= ruleresource_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3240:2: iv_ruleresource_options= ruleresource_options EOF
            {
             newCompositeNode(grammarAccess.getResource_optionsRule()); 
            pushFollow(FOLLOW_ruleresource_options_in_entryRuleresource_options9144);
            iv_ruleresource_options=ruleresource_options();

            state._fsp--;

             current =iv_ruleresource_options.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_options9155); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleresource_options"


    // $ANTLR start "ruleresource_options"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3247:1: ruleresource_options returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_resource_option_0= ruleresource_option (kw= ',' this_resource_option_2= ruleresource_option )* ) ;
    public final AntlrDatatypeRuleToken ruleresource_options() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_resource_option_0 = null;

        AntlrDatatypeRuleToken this_resource_option_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3250:28: ( (this_resource_option_0= ruleresource_option (kw= ',' this_resource_option_2= ruleresource_option )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3251:1: (this_resource_option_0= ruleresource_option (kw= ',' this_resource_option_2= ruleresource_option )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3251:1: (this_resource_option_0= ruleresource_option (kw= ',' this_resource_option_2= ruleresource_option )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3252:5: this_resource_option_0= ruleresource_option (kw= ',' this_resource_option_2= ruleresource_option )*
            {
             
                    newCompositeNode(grammarAccess.getResource_optionsAccess().getResource_optionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleresource_option_in_ruleresource_options9202);
            this_resource_option_0=ruleresource_option();

            state._fsp--;


            		current.merge(this_resource_option_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3262:1: (kw= ',' this_resource_option_2= ruleresource_option )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==30) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3263:2: kw= ',' this_resource_option_2= ruleresource_option
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleresource_options9221); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getResource_optionsAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getResource_optionsAccess().getResource_optionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleresource_option_in_ruleresource_options9243);
            	    this_resource_option_2=ruleresource_option();

            	    state._fsp--;


            	    		current.merge(this_resource_option_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleresource_options"


    // $ANTLR start "entryRuleresource_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3287:1: entryRuleresource_value returns [String current=null] : iv_ruleresource_value= ruleresource_value EOF ;
    public final String entryRuleresource_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleresource_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3288:2: (iv_ruleresource_value= ruleresource_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3289:2: iv_ruleresource_value= ruleresource_value EOF
            {
             newCompositeNode(grammarAccess.getResource_valueRule()); 
            pushFollow(FOLLOW_ruleresource_value_in_entryRuleresource_value9291);
            iv_ruleresource_value=ruleresource_value();

            state._fsp--;

             current =iv_ruleresource_value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_value9302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleresource_value"


    // $ANTLR start "ruleresource_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3296:1: ruleresource_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_value_0= rulevalue kw= ':' (this_resource_options_2= ruleresource_options )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleresource_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_value_0 = null;

        AntlrDatatypeRuleToken this_resource_options_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3299:28: ( (this_value_0= rulevalue kw= ':' (this_resource_options_2= ruleresource_options )? kw= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3300:1: (this_value_0= rulevalue kw= ':' (this_resource_options_2= ruleresource_options )? kw= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3300:1: (this_value_0= rulevalue kw= ':' (this_resource_options_2= ruleresource_options )? kw= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3301:5: this_value_0= rulevalue kw= ':' (this_resource_options_2= ruleresource_options )? kw= ';'
            {
             
                    newCompositeNode(grammarAccess.getResource_valueAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevalue_in_ruleresource_value9349);
            this_value_0=rulevalue();

            state._fsp--;


            		current.merge(this_value_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,35,FOLLOW_35_in_ruleresource_value9367); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getResource_valueAccess().getColonKeyword_1()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3317:1: (this_resource_options_2= ruleresource_options )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==13||LA75_0==18||LA75_0==63||LA75_0==123) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3318:5: this_resource_options_2= ruleresource_options
                    {
                     
                            newCompositeNode(grammarAccess.getResource_valueAccess().getResource_optionsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleresource_options_in_ruleresource_value9390);
                    this_resource_options_2=ruleresource_options();

                    state._fsp--;


                    		current.merge(this_resource_options_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_20_in_ruleresource_value9410); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getResource_valueAccess().getSemicolonKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleresource_value"


    // $ANTLR start "entryRuleresource_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3342:1: entryRuleresource_section returns [String current=null] : iv_ruleresource_section= ruleresource_section EOF ;
    public final String entryRuleresource_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleresource_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3343:2: (iv_ruleresource_section= ruleresource_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3344:2: iv_ruleresource_section= ruleresource_section EOF
            {
             newCompositeNode(grammarAccess.getResource_sectionRule()); 
            pushFollow(FOLLOW_ruleresource_section_in_entryRuleresource_section9451);
            iv_ruleresource_section=ruleresource_section();

            state._fsp--;

             current =iv_ruleresource_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_section9462); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleresource_section"


    // $ANTLR start "ruleresource_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3351:1: ruleresource_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RESOURCES' (this_resource_value_1= ruleresource_value )+ kw= 'END' ) ;
    public final AntlrDatatypeRuleToken ruleresource_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_resource_value_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3354:28: ( (kw= 'RESOURCES' (this_resource_value_1= ruleresource_value )+ kw= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3355:1: (kw= 'RESOURCES' (this_resource_value_1= ruleresource_value )+ kw= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3355:1: (kw= 'RESOURCES' (this_resource_value_1= ruleresource_value )+ kw= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3356:2: kw= 'RESOURCES' (this_resource_value_1= ruleresource_value )+ kw= 'END'
            {
            kw=(Token)match(input,124,FOLLOW_124_in_ruleresource_section9500); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getResource_sectionAccess().getRESOURCESKeyword_0()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3361:1: (this_resource_value_1= ruleresource_value )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=RULE_TOKEN && LA76_0<=RULE_STRING)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3362:5: this_resource_value_1= ruleresource_value
            	    {
            	     
            	            newCompositeNode(grammarAccess.getResource_sectionAccess().getResource_valueParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleresource_value_in_ruleresource_section9523);
            	    this_resource_value_1=ruleresource_value();

            	    state._fsp--;


            	    		current.merge(this_resource_value_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
            } while (true);

            kw=(Token)match(input,33,FOLLOW_33_in_ruleresource_section9543); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getResource_sectionAccess().getENDKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleresource_section"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA29_eotS =
        "\u009e\uffff";
    static final String DFA29_eofS =
        "\u009e\uffff";
    static final String DFA29_minS =
        "\1\47\1\uffff\1\4\1\uffff\1\24\1\15\1\uffff\6\24\15\44\1\15\1\4\1\100\1\4\1\53\6\24\15\44\3\36\7\45\3\37\7\36\1\4\1\100\1\4\1\53\1\4\2\24\1\4\1\53\1\24\3\36\7\45\3\37\24\36\1\4\2\24\1\4\1\53\1\24\1\4\1\24\20\36\1\4\1\24\1\4\6\36\2\4\6\36\1\4\3\36";
    static final String DFA29_maxS =
        "\1\56\1\uffff\1\4\1\uffff\1\46\1\77\1\uffff\6\46\15\44\1\77\1\6\1\106\1\6\1\114\6\46\15\44\12\45\3\37\7\45\1\6\1\106\1\6\1\114\1\6\2\46\1\6\1\114\1\46\12\45\3\37\24\45\1\6\2\46\1\6\1\114\1\46\1\6\1\46\20\45\1\6\1\46\1\6\6\45\2\6\6\45\1\6\3\45";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\2\uffff\1\2\u0097\uffff";
    static final String DFA29_specialS =
        "\u009e\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\1\uffff\4\1\1\2\1\3",
            "",
            "\1\4",
            "",
            "\1\1\14\uffff\1\6\1\uffff\1\5\2\uffff\1\6",
            "\1\23\4\uffff\1\31\34\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26\1\27\1\30",
            "",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\2\uffff\1\33\1\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\53\4\uffff\1\61\34\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\57\1\60",
            "\1\62\1\63\1\64",
            "\1\65\1\66\1\67\1\70\1\71\1\72\1\73",
            "\1\74\1\75\1\76",
            "\1\77\33\uffff\1\100\1\101\1\102\1\103\1\104\1\105",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\2\uffff\1\106\1\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\106",
            "\1\106",
            "\1\106",
            "\1\106",
            "\1\106",
            "\1\106",
            "\1\106",
            "\1\106",
            "\1\106",
            "\1\106",
            "\1\112\6\uffff\1\113",
            "\1\112\6\uffff\1\113",
            "\1\112\6\uffff\1\113",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\115",
            "\1\115",
            "\1\115",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\120\1\121\1\122",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131",
            "\1\132\1\133\1\134",
            "\1\135\33\uffff\1\136\1\137\1\140\1\141\1\142\1\143",
            "\1\144\1\145\1\146",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\147\1\150\1\151",
            "\1\152\33\uffff\1\153\1\154\1\155\1\156\1\157\1\160",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\163",
            "\1\163",
            "\1\163",
            "\1\163",
            "\1\163",
            "\1\163",
            "\1\163",
            "\1\164",
            "\1\164",
            "\1\164",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\112\6\uffff\1\113",
            "\1\112\6\uffff\1\113",
            "\1\112\6\uffff\1\113",
            "\1\167\6\uffff\1\170",
            "\1\167\6\uffff\1\170",
            "\1\167\6\uffff\1\170",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\116\6\uffff\1\117",
            "\1\171\1\172\1\173",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\174\1\175\1\176",
            "\1\177\33\uffff\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\u0086\1\u0087\1\u0088",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\u0089\6\uffff\1\u008a",
            "\1\u0089\6\uffff\1\u008a",
            "\1\u0089\6\uffff\1\u008a",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\165\6\uffff\1\166",
            "\1\167\1\u008b\5\uffff\1\170",
            "\1\167\1\u008b\5\uffff\1\170",
            "\1\167\1\u008b\5\uffff\1\170",
            "\1\u008c\1\u008d\1\u008e",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\u008f\1\u0090\1\u0091",
            "\1\u0089\1\u0092\5\uffff\1\u008a",
            "\1\u0089\1\u0092\5\uffff\1\u008a",
            "\1\u0089\1\u0092\5\uffff\1\u008a",
            "\1\u0093\6\uffff\1\170",
            "\1\u0093\6\uffff\1\170",
            "\1\u0093\6\uffff\1\170",
            "\1\u0094\1\u0095\1\u0096",
            "\1\u0097\1\u0098\1\u0099",
            "\1\u009a\6\uffff\1\u008a",
            "\1\u009a\6\uffff\1\u008a",
            "\1\u009a\6\uffff\1\u008a",
            "\1\u0093\1\u008b\5\uffff\1\170",
            "\1\u0093\1\u008b\5\uffff\1\170",
            "\1\u0093\1\u008b\5\uffff\1\170",
            "\1\u009b\1\u009c\1\u009d",
            "\1\u009a\1\u0092\5\uffff\1\u008a",
            "\1\u009a\1\u0092\5\uffff\1\u008a",
            "\1\u009a\1\u0092\5\uffff\1\u008a"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "906:1: ( ( (kw= 'BOOL' | kw= 'INT' | this_enum_decl_2= ruleenum_decl | kw= 'STRING' | kw= 'RECORD' | kw= 'DATASET' ) this_TOKEN_6= RULE_TOKEN (this_input_options_7= ruleinput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_10= RULE_TOKEN (this_input_options_11= ruleinput_options )? (this_field_decl_12= rulefield_decl )* kw= 'END' ) | (kw= 'GROUP' this_TOKEN_15= RULE_TOKEN (this_input_options_16= ruleinput_options )? (this_input_value_17= ruleinput_value )* kw= 'END' ) )";
        }
    }
    static final String DFA53_eotS =
        "\51\uffff";
    static final String DFA53_eofS =
        "\51\uffff";
    static final String DFA53_minS =
        "\1\4\1\uffff\1\4\1\24\1\4\1\15\2\uffff\1\45\5\24\2\44\1\24\1\15\2\4\5\24\2\44\4\45\2\4\2\24\4\45\2\24";
    static final String DFA53_maxS =
        "\1\131\1\uffff\1\4\1\122\1\4\1\130\2\uffff\1\45\5\122\2\44\1\122\1\130\1\4\1\6\5\122\2\44\4\45\1\4\1\6\2\122\4\45\2\122";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\4\uffff\1\3\1\2\41\uffff";
    static final String DFA53_specialS =
        "\51\uffff}>";
    static final String[] DFA53_transitionS = {
            "\3\1\42\uffff\3\1\1\uffff\1\2\53\uffff\1\1",
            "",
            "\1\3",
            "\1\6\14\uffff\1\7\1\uffff\1\5\1\4\6\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\10",
            "\1\17\105\uffff\1\11\1\12\1\13\1\14\1\15\1\16",
            "",
            "",
            "\1\20",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\22",
            "\1\23",
            "\1\6\14\uffff\1\7\1\uffff\1\5\7\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\32\105\uffff\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\33",
            "\1\34\1\35\1\36",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\44\1\45\1\46",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7",
            "\1\6\11\uffff\1\21\2\uffff\1\7\11\uffff\1\7\33\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff\5\7"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "1933:1: ( ( (kw= 'BOOL' | kw= 'INT' | kw= 'STRING' | kw= 'ACTION' )? this_value_4= rulevalue (this_output_options_5= ruleoutput_options )? kw= ';' ) | (kw= 'DATASET' this_TOKEN_8= RULE_TOKEN (this_output_base_9= ruleoutput_base )? (this_output_options_10= ruleoutput_options )? (this_ecloutput_decl_11= ruleecloutput_decl )* kw= 'END' ) | (kw= 'DATASET' this_TOKEN_14= RULE_TOKEN (this_output_base_15= ruleoutput_base )? (this_output_options_16= ruleoutput_options )? kw= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomposition_header_in_ruleprogram136 = new BitSet(new long[]{0x00000000002FF000L});
    public static final BitSet FOLLOW_rulebase_prop_in_ruleprogram154 = new BitSet(new long[]{0x00000104182FF002L,0x1000000004002000L});
    public static final BitSet FOLLOW_rulecontract_instance_in_ruleprogram172 = new BitSet(new long[]{0x0000010418000002L,0x1000000004002000L});
    public static final BitSet FOLLOW_ruleinput_section_in_ruleprogram190 = new BitSet(new long[]{0x0000000018000002L,0x1000000004002000L});
    public static final BitSet FOLLOW_ruleoutput_section_in_ruleprogram208 = new BitSet(new long[]{0x0000000018000002L,0x1000000004000000L});
    public static final BitSet FOLLOW_rulevisual_section_in_ruleprogram226 = new BitSet(new long[]{0x0000000018000002L,0x1000000004000000L});
    public static final BitSet FOLLOW_rulegenerate_section_in_ruleprogram244 = new BitSet(new long[]{0x0000000008000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_rulecustom_section_in_ruleprogram262 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleresource_section_in_ruleprogram280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebase_prop_in_entryRulebase_prop318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebase_prop329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulebase_prop369 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_13_in_rulebase_prop388 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14_in_rulebase_prop407 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_15_in_rulebase_prop426 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_16_in_rulebase_prop445 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_17_in_rulebase_prop464 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_18_in_rulebase_prop483 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_19_in_rulebase_prop502 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_rulebase_prop525 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulebase_prop543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulebase_prop564 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_rulecategory_type_list_in_rulebase_prop586 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulebase_prop604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecategory_type_in_entryRulecategory_type646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecategory_type657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulecategory_type695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulecategory_type714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulecategory_type733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulecategory_type752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulecategory_type771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulecategory_type790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulecategory_type809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulecategory_type828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecategory_type_list_in_entryRulecategory_type_list869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecategory_type_list880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecategory_type_in_rulecategory_type_list927 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulecategory_type_list946 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_rulecategory_type_in_rulecategory_type_list968 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulevalue_in_entryRulevalue1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulevalue1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulevalue1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulevalue1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_list_in_entryRulevalue_list1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue_list1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_rulevalue_list1223 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevalue_list1242 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulevalue_list1264 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleassign_in_entryRuleassign1314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassign1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_ruleassign1372 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleassign1390 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleassign1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassign_list_in_entryRuleassign_list1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassign_list1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassign_in_ruleassign_list1516 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleassign_list1535 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleassign_in_ruleassign_list1557 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulecomposition_header_in_entryRulecomposition_header1605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomposition_header1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulecomposition_header1654 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleassign_in_rulecomposition_header1677 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_33_in_rulecomposition_header1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontract_instance_in_entryRulecontract_instance1738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecontract_instance1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulecontract_instance1787 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulecontract_instance1803 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulecontract_instance1821 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulecontract_instance1845 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulecontract_instance1863 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulecontract_instance1885 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulecontract_instance1903 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleassign_in_rulecontract_instance1926 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_33_in_rulecontract_instance1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_decl_in_entryRulefield_decl1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_decl1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulefield_decl2036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulefield_decl2051 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleinput_options_in_rulefield_decl2079 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulefield_decl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenum_decl_in_entryRuleenum_decl2140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenum_decl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleenum_decl2189 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleenum_decl2202 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleenum_decl2225 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleassign_list_in_ruleenum_decl2258 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleenum_decl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinput_section_in_entryRuleinput_section2318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_section2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleinput_section2367 = new BitSet(new long[]{0x00007E8000000000L});
    public static final BitSet FOLLOW_ruleinput_value_in_ruleinput_section2390 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_33_in_ruleinput_section2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinput_value_in_entryRuleinput_value2451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_value2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleinput_value2502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_42_in_ruleinput_value2521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleenum_decl_in_ruleinput_value2549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_43_in_ruleinput_value2573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_44_in_ruleinput_value2592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45_in_ruleinput_value2611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_ruleinput_value2627 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value2655 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleinput_value2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleinput_value2696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_ruleinput_value2711 = new BitSet(new long[]{0x0000004A00000000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value2739 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rulefield_decl_in_ruleinput_value2769 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_33_in_ruleinput_value2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleinput_value2810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_ruleinput_value2825 = new BitSet(new long[]{0x00007E8A00000000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value2853 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_ruleinput_value_in_ruleinput_value2883 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_33_in_ruleinput_value2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinput_options_in_entryRuleinput_options2945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_options2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleinput_options2994 = new BitSet(new long[]{0xFFFF800000042000L});
    public static final BitSet FOLLOW_ruleinput_option_in_ruleinput_options3016 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleinput_options3035 = new BitSet(new long[]{0xFFFF800000042000L});
    public static final BitSet FOLLOW_ruleinput_option_in_ruleinput_options3057 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleinput_option_in_entryRuleinput_option3105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_option3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleinput_option3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleinput_option3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleinput_option3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleinput_option3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleinput_option3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleinput_option3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleinput_option3271 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option3284 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleformfield_option_in_ruleinput_option3306 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleinput_option3345 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option3358 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleassign_list_in_ruleinput_option3380 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleinput_option3419 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option3432 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleinputtype_options_in_ruleinput_option3454 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleinput_option3494 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_57_in_ruleinput_option3513 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_58_in_ruleinput_option3532 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_49_in_ruleinput_option3551 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13_in_ruleinput_option3570 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_59_in_ruleinput_option3589 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_60_in_ruleinput_option3608 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_61_in_ruleinput_option3627 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_62_in_ruleinput_option3646 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63_in_ruleinput_option3665 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleinput_option3684 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option3698 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleinput_option3720 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformfield_option_in_entryRuleformfield_option3780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformfield_option3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleformfield_option3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleformfield_option3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleformfield_option3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleformfield_option3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleformfield_option3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleformfield_option3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleformfield_option3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_entryRuleinputtype_option3984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputtype_option3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleinputtype_option4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleinputtype_option4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleinputtype_option4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleinputtype_option4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleinputtype_option4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleinputtype_option4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleinputtype_option4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_options_in_entryRuleinputtype_options4188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputtype_options4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_ruleinputtype_options4246 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleinputtype_options4265 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_ruleinputtype_options4287 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleoutput_section_in_entryRuleoutput_section4335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_section4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleoutput_section4384 = new BitSet(new long[]{0x00002E0000000070L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleoutput_value_in_ruleoutput_section4407 = new BitSet(new long[]{0x00002E0200000070L,0x0000000002000000L});
    public static final BitSet FOLLOW_33_in_ruleoutput_section4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeclfield_type_in_entryRuleeclfield_type4470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeclfield_type4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleeclfield_type4521 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_78_in_ruleeclfield_type4540 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_43_in_ruleeclfield_type4559 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_79_in_ruleeclfield_type4578 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_80_in_ruleeclfield_type4597 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_71_in_ruleeclfield_type4616 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_81_in_ruleeclfield_type4635 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleeclfield_type4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleeclfield_type4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleeclfield_type4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecloutput_decl_in_entryRuleecloutput_decl4741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecloutput_decl4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeclfield_type_in_ruleecloutput_decl4799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_ruleecloutput_decl4819 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleoutput_options_in_ruleecloutput_decl4847 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleecloutput_decl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutput_option_in_entryRuleoutput_option4908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_option4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleoutput_option4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleoutput_option4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleoutput_option4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleoutput_option5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleoutput_option5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleoutput_option5055 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleoutput_option5068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_ruleoutput_option5083 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleoutput_option5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleoutput_option5122 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleoutput_option5135 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleoutput_option5157 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleoutput_option5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutput_options_in_entryRuleoutput_options5217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_options5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleoutput_options5266 = new BitSet(new long[]{0x0000000000002000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleoutput_option_in_ruleoutput_options5288 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleoutput_options5307 = new BitSet(new long[]{0x0000000000002000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleoutput_option_in_ruleoutput_options5329 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleoutput_value_in_entryRuleoutput_value5377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_value5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleoutput_value5428 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_42_in_ruleoutput_value5447 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_43_in_ruleoutput_value5466 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_89_in_ruleoutput_value5485 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleoutput_value5509 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleoutput_options_in_ruleoutput_value5537 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleoutput_value5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleoutput_value5578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_ruleoutput_value5593 = new BitSet(new long[]{0x0000081A00000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_ruleoutput_base_in_ruleoutput_value5621 = new BitSet(new long[]{0x0000080A00000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_ruleoutput_options_in_ruleoutput_value5651 = new BitSet(new long[]{0x0000080200000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_ruleecloutput_decl_in_ruleoutput_value5681 = new BitSet(new long[]{0x0000080200000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_33_in_ruleoutput_value5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleoutput_value5722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_ruleoutput_value5737 = new BitSet(new long[]{0x0000001800100000L});
    public static final BitSet FOLLOW_ruleoutput_base_in_ruleoutput_value5765 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleoutput_options_in_ruleoutput_value5795 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleoutput_value5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutput_base_in_entryRuleoutput_base5857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_base5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleoutput_base5906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_ruleoutput_base5921 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleoutput_base5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_section_in_entryRulegenerate_section5980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_section5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulegenerate_section6029 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_rulegenerate_body_in_rulegenerate_section6051 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_rulegenerate_section6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_body_in_entryRulegenerate_body6110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_body6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulegenerate_body6160 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_93_in_rulegenerate_body6174 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_94_in_rulegenerate_body6193 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_95_in_rulegenerate_body6216 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulegenerate_body6229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulegenerate_body6244 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulegenerate_body6262 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulegenerate_body6275 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_96_in_rulegenerate_body6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rulegenerate_body6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_section_in_entryRulevisual_section6351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_section6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulevisual_section6400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulevisual_section6415 = new BitSet(new long[]{0x0000000800000000L,0x000001FC00000000L});
    public static final BitSet FOLLOW_rulevisual_section_options_in_rulevisual_section6443 = new BitSet(new long[]{0x0000000800000000L,0x000001FC00000000L});
    public static final BitSet FOLLOW_rulevisualization_in_rulevisual_section6473 = new BitSet(new long[]{0x0000000A00000000L,0x000001FC00000000L});
    public static final BitSet FOLLOW_33_in_rulevisual_section6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisualization_in_entryRulevisualization6534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisualization6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rulevisualization6585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_99_in_rulevisualization6604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_100_in_rulevisualization6623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_101_in_rulevisualization6642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_102_in_rulevisualization6661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_103_in_rulevisualization6680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulevisualization6696 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisualization6714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulevis_basis_in_rulevisualization6736 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisualization6754 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulevisual_options_in_rulevisualization6777 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulevisualization6797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rulevisualization6818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulevisualization6833 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulevisual_options_in_rulevisualization6861 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulevisualization6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevis_basis_in_entryRulevis_basis6923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevis_basis6934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulevis_basis6974 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulevis_basis_qualifiers_in_rulevis_basis7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevis_basis_qualifiers_in_entryRulevis_basis_qualifiers7050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevis_basis_qualifiers7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rulevis_basis_qualifiers7099 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevis_basis_qualifiers7121 = new BitSet(new long[]{0x0000000040000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_30_in_rulevis_basis_qualifiers7140 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevis_basis_qualifiers7162 = new BitSet(new long[]{0x0000000040000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_rulevis_basis_qualifiers7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction7223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_rulefunction7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rulefunction7306 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunction7319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulefunction7334 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rulefunction7373 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunction7386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulefunction7401 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulefunction7419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulefunction7434 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_section_options_in_entryRulevisual_section_options7494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_section_options7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulevisual_section_options7543 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_rulevisual_section_options7565 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevisual_section_options7584 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_rulevisual_section_options7606 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_entryRulevisual_section_option7654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_section_option7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulevisual_section_option7703 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_section_option7716 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulevisual_section_option7738 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_section_option7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_options_in_entryRulevisual_options7797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_options7808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulevisual_options7846 = new BitSet(new long[]{0x0100000000042000L,0x07DFE00000000000L});
    public static final BitSet FOLLOW_rulevisual_option_in_rulevisual_options7868 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevisual_options7887 = new BitSet(new long[]{0x0100000000042000L,0x07DFE00000000000L});
    public static final BitSet FOLLOW_rulevisual_option_in_rulevisual_options7909 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulevisual_option_in_entryRulevisual_option7957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_option7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rulevisual_option8008 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_110_in_rulevisual_option8027 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13_in_rulevisual_option8046 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_111_in_rulevisual_option8065 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_112_in_rulevisual_option8084 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_113_in_rulevisual_option8103 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_114_in_rulevisual_option8122 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_115_in_rulevisual_option8141 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option8155 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option8177 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_multival_in_rulevisual_option8225 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option8243 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option8265 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_30_in_rulevisual_option8284 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option8306 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rulevisual_option8347 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option8360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulevisual_option8375 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_rulevisual_option8393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulevisual_option8408 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option8426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_multival_in_entryRulevisual_multival8468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_multival8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_rulevisual_multival8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_rulevisual_multival8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_rulevisual_multival8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulevisual_multival8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_rulevisual_multival8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulevisual_multival8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_rulevisual_multival8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecustom_section_in_entryRulecustom_section8672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecustom_section8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulecustom_section8721 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rulecustom_value_in_rulecustom_section8744 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_rulecustom_section8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecustom_value_in_entryRulecustom_value8805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecustom_value8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOKEN_in_rulecustom_value8856 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulecustom_value8883 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulecustom_value8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_option_in_entryRuleresource_option8942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_option8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleresource_option8992 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_123_in_ruleresource_option9011 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleresource_option9030 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63_in_ruleresource_option9049 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleresource_option9063 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleresource_option9085 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleresource_option9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_options_in_entryRuleresource_options9144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_options9155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_option_in_ruleresource_options9202 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleresource_options9221 = new BitSet(new long[]{0x8000000000042000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleresource_option_in_ruleresource_options9243 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleresource_value_in_entryRuleresource_value9291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_value9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_ruleresource_value9349 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleresource_value9367 = new BitSet(new long[]{0x8000000000142000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleresource_options_in_ruleresource_value9390 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleresource_value9410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_section_in_entryRuleresource_section9451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_section9462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleresource_section9500 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleresource_value_in_ruleresource_section9523 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_33_in_ruleresource_section9543 = new BitSet(new long[]{0x0000000000000002L});

}