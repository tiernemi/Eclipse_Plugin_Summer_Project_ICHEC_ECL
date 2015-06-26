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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ECL_CODE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'NAME'", "'DESCRIPTION'", "'AUTHOR'", "'LICENSE'", "'COPYRIGHT'", "'VERSION'", "'LABEL'", "'ID'", "';'", "'CATEGORY'", "'CLEAN'", "'INPUT'", "'APPEND'", "'LINK'", "'ANALYSIS'", "'CUSTOM'", "'VISUALIZE'", "'OUTPUT'", "','", "'='", "'HEADER'", "'END'", "'INSTANCE'", "':'", "'('", "')'", "'FIELD'", "'ENUM'", "'INPUTS'", "'BOOL'", "'INT'", "'STRING'", "'RECORD'", "'DATASET'", "'GROUP'", "'OPTIONAL'", "'DEFINED'", "'DISABLED'", "'MAPBYTYPE'", "'MAPBYNAME'", "'MANY'", "'FORMFIELD'", "'ENABLE'", "'TYPE'", "'RANGE'", "'DEFAULT'", "'MAXLENGTH'", "'NULL'", "'FIELDLENGTH'", "'ROWS'", "'COLS'", "'_HTML_STYLECLASS'", "'CHECKBOX'", "'RADIO'", "'SELECT'", "'MULTIPLESELECT'", "'TEXTAREA'", "'HIDDEN'", "'TEXT'", "'UNICODE'", "'UNISTR'", "'INTEGER'", "'DECIMAL'", "'NUMERIC'", "'REAL'", "'OUTPUTS'", "'UNSIGNED'", "'QSTRING'", "'VARSTRING'", "'VARUNICODE'", "'DATA'", "'SIDE'", "'LARGE'", "'SMALL'", "'FEW'", "'WUID'", "'FROM'", "'ACTION'", "'GENERATES'", "'ENDGENERATES'", "'INLINE'", "'.'", "'{'", "'}'", "'-'", "'SALT'", "'SCOREDSEARCH'", "'PROFILE'", "'CHORO'", "'LINE'", "'TIMELINE'", "'PIE'", "'BAR'", "'TABLE'", "'SLIDER'", "'SUM'", "'SCALE'", "'TITLE'", "'DATE'", "'PICTURE'", "'STATE'", "'COUNTY'", "'WEIGHT'", "'SIZE'", "'SELECTS'", "'->'", "'X'", "'Y'", "'COLOR'", "'FILTER'", "'VALUE'", "'FILE'", "'RESOURCES'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_ECL_CODE=8;
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:76:1: ruleprogram returns [EObject current=null] : ( ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleinput_section ) )? ( (lv_Output_Section_4_0= ruleoutput_section ) )? ( (lv_Visual_Section_5_0= rulevisual_section ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )? ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        EObject lv_Composition_Header_0_0 = null;

        EObject lv_Base_Props_1_0 = null;

        EObject lv_Contract_Instances_2_0 = null;

        EObject lv_Input_Section_3_0 = null;

        EObject lv_Output_Section_4_0 = null;

        EObject lv_Visual_Section_5_0 = null;

        EObject lv_Generate_Section_6_0 = null;

        EObject lv_Custom_Section_7_0 = null;

        EObject lv_Resource_Section_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:79:28: ( ( ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleinput_section ) )? ( (lv_Output_Section_4_0= ruleoutput_section ) )? ( (lv_Visual_Section_5_0= rulevisual_section ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:1: ( ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleinput_section ) )? ( (lv_Output_Section_4_0= ruleoutput_section ) )? ( (lv_Visual_Section_5_0= rulevisual_section ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:1: ( ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleinput_section ) )? ( (lv_Output_Section_4_0= ruleoutput_section ) )? ( (lv_Visual_Section_5_0= rulevisual_section ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:2: ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleinput_section ) )? ( (lv_Output_Section_4_0= ruleoutput_section ) )? ( (lv_Visual_Section_5_0= rulevisual_section ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )?
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:2: ( (lv_Composition_Header_0_0= rulecomposition_header ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:81:1: (lv_Composition_Header_0_0= rulecomposition_header )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:81:1: (lv_Composition_Header_0_0= rulecomposition_header )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:82:3: lv_Composition_Header_0_0= rulecomposition_header
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getComposition_HeaderComposition_headerParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecomposition_header_in_ruleprogram131);
                    lv_Composition_Header_0_0=rulecomposition_header();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"Composition_Header",
                            		lv_Composition_Header_0_0, 
                            		"composition_header");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:98:3: ( (lv_Base_Props_1_0= rulebase_prop ) )+
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:99:1: (lv_Base_Props_1_0= rulebase_prop )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:99:1: (lv_Base_Props_1_0= rulebase_prop )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:100:3: lv_Base_Props_1_0= rulebase_prop
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getBase_PropsBase_propParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulebase_prop_in_ruleprogram153);
            	    lv_Base_Props_1_0=rulebase_prop();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Base_Props",
            	            		lv_Base_Props_1_0, 
            	            		"base_prop");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:116:3: ( (lv_Contract_Instances_2_0= rulecontract_instance ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:117:1: (lv_Contract_Instances_2_0= rulecontract_instance )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:117:1: (lv_Contract_Instances_2_0= rulecontract_instance )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:118:3: lv_Contract_Instances_2_0= rulecontract_instance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getContract_InstancesContract_instanceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecontract_instance_in_ruleprogram175);
            	    lv_Contract_Instances_2_0=rulecontract_instance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Contract_Instances",
            	            		lv_Contract_Instances_2_0, 
            	            		"contract_instance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:134:3: ( (lv_Input_Section_3_0= ruleinput_section ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:135:1: (lv_Input_Section_3_0= ruleinput_section )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:135:1: (lv_Input_Section_3_0= ruleinput_section )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:136:3: lv_Input_Section_3_0= ruleinput_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getInput_SectionInput_sectionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleinput_section_in_ruleprogram197);
                    lv_Input_Section_3_0=ruleinput_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"Input_Section",
                            		lv_Input_Section_3_0, 
                            		"input_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:152:3: ( (lv_Output_Section_4_0= ruleoutput_section ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==77) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:153:1: (lv_Output_Section_4_0= ruleoutput_section )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:153:1: (lv_Output_Section_4_0= ruleoutput_section )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:154:3: lv_Output_Section_4_0= ruleoutput_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getOutput_SectionOutput_sectionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleoutput_section_in_ruleprogram219);
                    lv_Output_Section_4_0=ruleoutput_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"Output_Section",
                            		lv_Output_Section_4_0, 
                            		"output_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:170:3: ( (lv_Visual_Section_5_0= rulevisual_section ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:171:1: (lv_Visual_Section_5_0= rulevisual_section )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:171:1: (lv_Visual_Section_5_0= rulevisual_section )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:172:3: lv_Visual_Section_5_0= rulevisual_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getVisual_SectionVisual_sectionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevisual_section_in_ruleprogram241);
            	    lv_Visual_Section_5_0=rulevisual_section();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Visual_Section",
            	            		lv_Visual_Section_5_0, 
            	            		"visual_section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:188:3: ( (lv_Generate_Section_6_0= rulegenerate_section ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==90) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:189:1: (lv_Generate_Section_6_0= rulegenerate_section )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:189:1: (lv_Generate_Section_6_0= rulegenerate_section )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:190:3: lv_Generate_Section_6_0= rulegenerate_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getGenerate_SectionGenerate_sectionParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_rulegenerate_section_in_ruleprogram263);
                    lv_Generate_Section_6_0=rulegenerate_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"Generate_Section",
                            		lv_Generate_Section_6_0, 
                            		"generate_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:206:3: ( (lv_Custom_Section_7_0= rulecustom_section ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:207:1: (lv_Custom_Section_7_0= rulecustom_section )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:207:1: (lv_Custom_Section_7_0= rulecustom_section )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:208:3: lv_Custom_Section_7_0= rulecustom_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getCustom_SectionCustom_sectionParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_rulecustom_section_in_ruleprogram285);
                    lv_Custom_Section_7_0=rulecustom_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"Custom_Section",
                            		lv_Custom_Section_7_0, 
                            		"custom_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:224:3: ( (lv_Resource_Section_8_0= ruleresource_section ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==124) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:225:1: (lv_Resource_Section_8_0= ruleresource_section )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:225:1: (lv_Resource_Section_8_0= ruleresource_section )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:226:3: lv_Resource_Section_8_0= ruleresource_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getResource_SectionResource_sectionParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleresource_section_in_ruleprogram307);
                    lv_Resource_Section_8_0=ruleresource_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"Resource_Section",
                            		lv_Resource_Section_8_0, 
                            		"resource_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:250:1: entryRulebase_prop returns [EObject current=null] : iv_rulebase_prop= rulebase_prop EOF ;
    public final EObject entryRulebase_prop() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebase_prop = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:251:2: (iv_rulebase_prop= rulebase_prop EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:252:2: iv_rulebase_prop= rulebase_prop EOF
            {
             newCompositeNode(grammarAccess.getBase_propRule()); 
            pushFollow(FOLLOW_rulebase_prop_in_entryRulebase_prop344);
            iv_rulebase_prop=rulebase_prop();

            state._fsp--;

             current =iv_rulebase_prop; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebase_prop354); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:259:1: rulebase_prop returns [EObject current=null] : ( ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_vals_8_0= rulevalue_list ) ) otherlv_9= ';' ) | ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cats_11_0= rulecategory_type_list ) ) otherlv_12= ';' ) ) ;
    public final EObject rulebase_prop() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token lv_name_6_0=null;
        Token lv_name_7_0=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_12=null;
        EObject lv_vals_8_0 = null;

        EObject lv_cats_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:262:28: ( ( ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_vals_8_0= rulevalue_list ) ) otherlv_9= ';' ) | ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cats_11_0= rulecategory_type_list ) ) otherlv_12= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:1: ( ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_vals_8_0= rulevalue_list ) ) otherlv_9= ';' ) | ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cats_11_0= rulecategory_type_list ) ) otherlv_12= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:1: ( ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_vals_8_0= rulevalue_list ) ) otherlv_9= ';' ) | ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cats_11_0= rulecategory_type_list ) ) otherlv_12= ';' ) )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:2: ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_vals_8_0= rulevalue_list ) ) otherlv_9= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:2: ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_vals_8_0= rulevalue_list ) ) otherlv_9= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:3: ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_vals_8_0= rulevalue_list ) ) otherlv_9= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:3: ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) )
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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:4: ( (lv_name_0_0= 'NAME' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:4: ( (lv_name_0_0= 'NAME' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:264:1: (lv_name_0_0= 'NAME' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:264:1: (lv_name_0_0= 'NAME' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:265:3: lv_name_0_0= 'NAME'
                            {
                            lv_name_0_0=(Token)match(input,12,FOLLOW_12_in_rulebase_prop399); 

                                    newLeafNode(lv_name_0_0, grammarAccess.getBase_propAccess().getNameNAMEKeyword_0_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBase_propRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_0_0, "NAME");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:279:6: ( (lv_name_1_0= 'DESCRIPTION' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:279:6: ( (lv_name_1_0= 'DESCRIPTION' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:280:1: (lv_name_1_0= 'DESCRIPTION' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:280:1: (lv_name_1_0= 'DESCRIPTION' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:281:3: lv_name_1_0= 'DESCRIPTION'
                            {
                            lv_name_1_0=(Token)match(input,13,FOLLOW_13_in_rulebase_prop436); 

                                    newLeafNode(lv_name_1_0, grammarAccess.getBase_propAccess().getNameDESCRIPTIONKeyword_0_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBase_propRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_1_0, "DESCRIPTION");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:295:6: ( (lv_name_2_0= 'AUTHOR' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:295:6: ( (lv_name_2_0= 'AUTHOR' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:296:1: (lv_name_2_0= 'AUTHOR' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:296:1: (lv_name_2_0= 'AUTHOR' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:297:3: lv_name_2_0= 'AUTHOR'
                            {
                            lv_name_2_0=(Token)match(input,14,FOLLOW_14_in_rulebase_prop473); 

                                    newLeafNode(lv_name_2_0, grammarAccess.getBase_propAccess().getNameAUTHORKeyword_0_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBase_propRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_0, "AUTHOR");
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:311:6: ( (lv_name_3_0= 'LICENSE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:311:6: ( (lv_name_3_0= 'LICENSE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:312:1: (lv_name_3_0= 'LICENSE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:312:1: (lv_name_3_0= 'LICENSE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:313:3: lv_name_3_0= 'LICENSE'
                            {
                            lv_name_3_0=(Token)match(input,15,FOLLOW_15_in_rulebase_prop510); 

                                    newLeafNode(lv_name_3_0, grammarAccess.getBase_propAccess().getNameLICENSEKeyword_0_0_3_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBase_propRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_3_0, "LICENSE");
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:327:6: ( (lv_name_4_0= 'COPYRIGHT' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:327:6: ( (lv_name_4_0= 'COPYRIGHT' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:328:1: (lv_name_4_0= 'COPYRIGHT' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:328:1: (lv_name_4_0= 'COPYRIGHT' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:329:3: lv_name_4_0= 'COPYRIGHT'
                            {
                            lv_name_4_0=(Token)match(input,16,FOLLOW_16_in_rulebase_prop547); 

                                    newLeafNode(lv_name_4_0, grammarAccess.getBase_propAccess().getNameCOPYRIGHTKeyword_0_0_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBase_propRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_4_0, "COPYRIGHT");
                            	    

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:343:6: ( (lv_name_5_0= 'VERSION' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:343:6: ( (lv_name_5_0= 'VERSION' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:344:1: (lv_name_5_0= 'VERSION' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:344:1: (lv_name_5_0= 'VERSION' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:345:3: lv_name_5_0= 'VERSION'
                            {
                            lv_name_5_0=(Token)match(input,17,FOLLOW_17_in_rulebase_prop584); 

                                    newLeafNode(lv_name_5_0, grammarAccess.getBase_propAccess().getNameVERSIONKeyword_0_0_5_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBase_propRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_5_0, "VERSION");
                            	    

                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:359:6: ( (lv_name_6_0= 'LABEL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:359:6: ( (lv_name_6_0= 'LABEL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:360:1: (lv_name_6_0= 'LABEL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:360:1: (lv_name_6_0= 'LABEL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:361:3: lv_name_6_0= 'LABEL'
                            {
                            lv_name_6_0=(Token)match(input,18,FOLLOW_18_in_rulebase_prop621); 

                                    newLeafNode(lv_name_6_0, grammarAccess.getBase_propAccess().getNameLABELKeyword_0_0_6_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBase_propRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_6_0, "LABEL");
                            	    

                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:375:6: ( (lv_name_7_0= 'ID' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:375:6: ( (lv_name_7_0= 'ID' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:376:1: (lv_name_7_0= 'ID' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:376:1: (lv_name_7_0= 'ID' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:377:3: lv_name_7_0= 'ID'
                            {
                            lv_name_7_0=(Token)match(input,19,FOLLOW_19_in_rulebase_prop658); 

                                    newLeafNode(lv_name_7_0, grammarAccess.getBase_propAccess().getNameIDKeyword_0_0_7_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBase_propRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_7_0, "ID");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:390:3: ( (lv_vals_8_0= rulevalue_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:391:1: (lv_vals_8_0= rulevalue_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:391:1: (lv_vals_8_0= rulevalue_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:392:3: lv_vals_8_0= rulevalue_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getBase_propAccess().getValsValue_listParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_list_in_rulebase_prop693);
                    lv_vals_8_0=rulevalue_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBase_propRule());
                    	        }
                           		add(
                           			current, 
                           			"vals",
                            		lv_vals_8_0, 
                            		"value_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_rulebase_prop705); 

                        	newLeafNode(otherlv_9, grammarAccess.getBase_propAccess().getSemicolonKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:413:6: ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cats_11_0= rulecategory_type_list ) ) otherlv_12= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:413:6: ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cats_11_0= rulecategory_type_list ) ) otherlv_12= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:413:7: ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cats_11_0= rulecategory_type_list ) ) otherlv_12= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:413:7: ( (lv_name_10_0= 'CATEGORY' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:414:1: (lv_name_10_0= 'CATEGORY' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:414:1: (lv_name_10_0= 'CATEGORY' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:415:3: lv_name_10_0= 'CATEGORY'
                    {
                    lv_name_10_0=(Token)match(input,21,FOLLOW_21_in_rulebase_prop731); 

                            newLeafNode(lv_name_10_0, grammarAccess.getBase_propAccess().getNameCATEGORYKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBase_propRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_10_0, "CATEGORY");
                    	    

                    }


                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:428:2: ( (lv_cats_11_0= rulecategory_type_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:429:1: (lv_cats_11_0= rulecategory_type_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:429:1: (lv_cats_11_0= rulecategory_type_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:430:3: lv_cats_11_0= rulecategory_type_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getBase_propAccess().getCatsCategory_type_listParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulecategory_type_list_in_rulebase_prop765);
                    lv_cats_11_0=rulecategory_type_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBase_propRule());
                    	        }
                           		add(
                           			current, 
                           			"cats",
                            		lv_cats_11_0, 
                            		"category_type_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_rulebase_prop777); 

                        	newLeafNode(otherlv_12, grammarAccess.getBase_propAccess().getSemicolonKeyword_1_2());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:458:1: entryRulecategory_type returns [String current=null] : iv_rulecategory_type= rulecategory_type EOF ;
    public final String entryRulecategory_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecategory_type = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:459:2: (iv_rulecategory_type= rulecategory_type EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:460:2: iv_rulecategory_type= rulecategory_type EOF
            {
             newCompositeNode(grammarAccess.getCategory_typeRule()); 
            pushFollow(FOLLOW_rulecategory_type_in_entryRulecategory_type815);
            iv_rulecategory_type=rulecategory_type();

            state._fsp--;

             current =iv_rulecategory_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecategory_type826); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:467:1: rulecategory_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' ) ;
    public final AntlrDatatypeRuleToken rulecategory_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:470:28: ( (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:471:1: (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:471:1: (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:472:2: kw= 'CLEAN'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_rulecategory_type864); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getCLEANKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:479:2: kw= 'INPUT'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulecategory_type883); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getINPUTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:486:2: kw= 'APPEND'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulecategory_type902); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getAPPENDKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:493:2: kw= 'LINK'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulecategory_type921); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getLINKKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:500:2: kw= 'ANALYSIS'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulecategory_type940); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getANALYSISKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:507:2: kw= 'CUSTOM'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulecategory_type959); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getCUSTOMKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:514:2: kw= 'VISUALIZE'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_rulecategory_type978); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCategory_typeAccess().getVISUALIZEKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:521:2: kw= 'OUTPUT'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulecategory_type997); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:534:1: entryRulecategory_type_list returns [EObject current=null] : iv_rulecategory_type_list= rulecategory_type_list EOF ;
    public final EObject entryRulecategory_type_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecategory_type_list = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:535:2: (iv_rulecategory_type_list= rulecategory_type_list EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:536:2: iv_rulecategory_type_list= rulecategory_type_list EOF
            {
             newCompositeNode(grammarAccess.getCategory_type_listRule()); 
            pushFollow(FOLLOW_rulecategory_type_list_in_entryRulecategory_type_list1037);
            iv_rulecategory_type_list=rulecategory_type_list();

            state._fsp--;

             current =iv_rulecategory_type_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecategory_type_list1047); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:543:1: rulecategory_type_list returns [EObject current=null] : ( ( (lv_name_0_0= rulecategory_type ) ) (otherlv_1= ',' rulecategory_type )* ) ;
    public final EObject rulecategory_type_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:546:28: ( ( ( (lv_name_0_0= rulecategory_type ) ) (otherlv_1= ',' rulecategory_type )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:547:1: ( ( (lv_name_0_0= rulecategory_type ) ) (otherlv_1= ',' rulecategory_type )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:547:1: ( ( (lv_name_0_0= rulecategory_type ) ) (otherlv_1= ',' rulecategory_type )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:547:2: ( (lv_name_0_0= rulecategory_type ) ) (otherlv_1= ',' rulecategory_type )*
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:547:2: ( (lv_name_0_0= rulecategory_type ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:548:1: (lv_name_0_0= rulecategory_type )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:548:1: (lv_name_0_0= rulecategory_type )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:549:3: lv_name_0_0= rulecategory_type
            {
             
            	        newCompositeNode(grammarAccess.getCategory_type_listAccess().getNameCategory_typeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecategory_type_in_rulecategory_type_list1093);
            lv_name_0_0=rulecategory_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategory_type_listRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"category_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:565:2: (otherlv_1= ',' rulecategory_type )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:565:4: otherlv_1= ',' rulecategory_type
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulecategory_type_list1106); 

            	        	newLeafNode(otherlv_1, grammarAccess.getCategory_type_listAccess().getCommaKeyword_1_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getCategory_type_listAccess().getCategory_typeParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulecategory_type_in_rulecategory_type_list1122);
            	    rulecategory_type();

            	    state._fsp--;

            	     
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:585:1: entryRulevalue returns [EObject current=null] : iv_rulevalue= rulevalue EOF ;
    public final EObject entryRulevalue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:586:2: (iv_rulevalue= rulevalue EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:587:2: iv_rulevalue= rulevalue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_rulevalue_in_entryRulevalue1159);
            iv_rulevalue=rulevalue();

            state._fsp--;

             current =iv_rulevalue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue1169); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:594:1: rulevalue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_type_1_0= RULE_INT ) ) | ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject rulevalue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:597:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_type_1_0= RULE_INT ) ) | ( (lv_name_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:598:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_type_1_0= RULE_INT ) ) | ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:598:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_type_1_0= RULE_INT ) ) | ( (lv_name_2_0= RULE_STRING ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:598:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:598:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:599:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:599:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:600:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevalue1211); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:617:6: ( (lv_type_1_0= RULE_INT ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:617:6: ( (lv_type_1_0= RULE_INT ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:618:1: (lv_type_1_0= RULE_INT )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:618:1: (lv_type_1_0= RULE_INT )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:619:3: lv_type_1_0= RULE_INT
                    {
                    lv_type_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulevalue1239); 

                    			newLeafNode(lv_type_1_0, grammarAccess.getValueAccess().getTypeINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:636:6: ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:636:6: ( (lv_name_2_0= RULE_STRING ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:637:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:637:1: (lv_name_2_0= RULE_STRING )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:638:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulevalue1267); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getValueAccess().getNameSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRulevalue_list"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:662:1: entryRulevalue_list returns [EObject current=null] : iv_rulevalue_list= rulevalue_list EOF ;
    public final EObject entryRulevalue_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_list = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:663:2: (iv_rulevalue_list= rulevalue_list EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:664:2: iv_rulevalue_list= rulevalue_list EOF
            {
             newCompositeNode(grammarAccess.getValue_listRule()); 
            pushFollow(FOLLOW_rulevalue_list_in_entryRulevalue_list1308);
            iv_rulevalue_list=rulevalue_list();

            state._fsp--;

             current =iv_rulevalue_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue_list1318); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:671:1: rulevalue_list returns [EObject current=null] : (this_value_0= rulevalue (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )* ) ;
    public final EObject rulevalue_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_value_0 = null;

        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:674:28: ( (this_value_0= rulevalue (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:675:1: (this_value_0= rulevalue (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:675:1: (this_value_0= rulevalue (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:676:5: this_value_0= rulevalue (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getValue_listAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevalue_in_rulevalue_list1365);
            this_value_0=rulevalue();

            state._fsp--;

             
                    current = this_value_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:684:1: (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    switch ( input.LA(2) ) {
                    case RULE_ID:
                        {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==EOF||(LA15_3>=RULE_ID && LA15_3<=RULE_STRING)||LA15_3==20||LA15_3==30||LA15_3==33||LA15_3==37) ) {
                            alt15=1;
                        }


                        }
                        break;
                    case RULE_INT:
                        {
                        int LA15_4 = input.LA(3);

                        if ( (LA15_4==EOF||(LA15_4>=RULE_ID && LA15_4<=RULE_STRING)||LA15_4==20||LA15_4==30||LA15_4==33||LA15_4==37) ) {
                            alt15=1;
                        }


                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA15_5 = input.LA(3);

                        if ( (LA15_5==EOF||(LA15_5>=RULE_ID && LA15_5<=RULE_STRING)||LA15_5==20||LA15_5==30||LA15_5==33||LA15_5==37) ) {
                            alt15=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:684:3: otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulevalue_list1377); 

            	        	newLeafNode(otherlv_1, grammarAccess.getValue_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:688:1: ( (lv_vals_2_0= rulevalue ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:689:1: (lv_vals_2_0= rulevalue )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:689:1: (lv_vals_2_0= rulevalue )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:690:3: lv_vals_2_0= rulevalue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValue_listAccess().getValsValueParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevalue_in_rulevalue_list1398);
            	    lv_vals_2_0=rulevalue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValue_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vals",
            	            		lv_vals_2_0, 
            	            		"value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:716:1: entryRuleassign returns [EObject current=null] : iv_ruleassign= ruleassign EOF ;
    public final EObject entryRuleassign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassign = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:717:2: (iv_ruleassign= ruleassign EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:718:2: iv_ruleassign= ruleassign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_ruleassign_in_entryRuleassign1438);
            iv_ruleassign=ruleassign();

            state._fsp--;

             current =iv_ruleassign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassign1448); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:725:1: ruleassign returns [EObject current=null] : (this_value_0= rulevalue otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) ) ) ;
    public final EObject ruleassign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_value_0 = null;

        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:728:28: ( (this_value_0= rulevalue otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:729:1: (this_value_0= rulevalue otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:729:1: (this_value_0= rulevalue otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:730:5: this_value_0= rulevalue otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) )
            {
             
                    newCompositeNode(grammarAccess.getAssignAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevalue_in_ruleassign1495);
            this_value_0=rulevalue();

            state._fsp--;

             
                    current = this_value_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleassign1506); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:742:1: ( (lv_vals_2_0= rulevalue_list ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:743:1: (lv_vals_2_0= rulevalue_list )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:743:1: (lv_vals_2_0= rulevalue_list )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:744:3: lv_vals_2_0= rulevalue_list
            {
             
            	        newCompositeNode(grammarAccess.getAssignAccess().getValsValue_listParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_list_in_ruleassign1527);
            lv_vals_2_0=rulevalue_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignRule());
            	        }
                   		add(
                   			current, 
                   			"vals",
                    		lv_vals_2_0, 
                    		"value_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleassign"


    // $ANTLR start "entryRuleassign_list"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:768:1: entryRuleassign_list returns [EObject current=null] : iv_ruleassign_list= ruleassign_list EOF ;
    public final EObject entryRuleassign_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassign_list = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:769:2: (iv_ruleassign_list= ruleassign_list EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:770:2: iv_ruleassign_list= ruleassign_list EOF
            {
             newCompositeNode(grammarAccess.getAssign_listRule()); 
            pushFollow(FOLLOW_ruleassign_list_in_entryRuleassign_list1563);
            iv_ruleassign_list=ruleassign_list();

            state._fsp--;

             current =iv_ruleassign_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassign_list1573); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:777:1: ruleassign_list returns [EObject current=null] : (this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )* ) ;
    public final EObject ruleassign_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_assign_0 = null;

        EObject lv_assign_internal_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:780:28: ( (this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:781:1: (this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:781:1: (this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:782:5: this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAssign_listAccess().getAssignParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleassign_in_ruleassign_list1620);
            this_assign_0=ruleassign();

            state._fsp--;

             
                    current = this_assign_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:790:1: (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:790:3: otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleassign_list1632); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAssign_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:794:1: ( (lv_assign_internal_2_0= ruleassign ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:795:1: (lv_assign_internal_2_0= ruleassign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:795:1: (lv_assign_internal_2_0= ruleassign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:796:3: lv_assign_internal_2_0= ruleassign
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssign_listAccess().getAssign_internalAssignParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleassign_in_ruleassign_list1653);
            	    lv_assign_internal_2_0=ruleassign();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssign_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assign_internal",
            	            		lv_assign_internal_2_0, 
            	            		"assign");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:820:1: entryRulecomposition_header returns [EObject current=null] : iv_rulecomposition_header= rulecomposition_header EOF ;
    public final EObject entryRulecomposition_header() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomposition_header = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:821:2: (iv_rulecomposition_header= rulecomposition_header EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:822:2: iv_rulecomposition_header= rulecomposition_header EOF
            {
             newCompositeNode(grammarAccess.getComposition_headerRule()); 
            pushFollow(FOLLOW_rulecomposition_header_in_entryRulecomposition_header1691);
            iv_rulecomposition_header=rulecomposition_header();

            state._fsp--;

             current =iv_rulecomposition_header; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomposition_header1701); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:829:1: rulecomposition_header returns [EObject current=null] : ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END' ) ;
    public final EObject rulecomposition_header() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_assigns_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:832:28: ( ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:833:1: ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:833:1: ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:833:2: ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:833:2: ( (lv_name_0_0= 'HEADER' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:834:1: (lv_name_0_0= 'HEADER' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:834:1: (lv_name_0_0= 'HEADER' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:835:3: lv_name_0_0= 'HEADER'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_32_in_rulecomposition_header1744); 

                    newLeafNode(lv_name_0_0, grammarAccess.getComposition_headerAccess().getNameHEADERKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComposition_headerRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "HEADER");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:848:2: ( (lv_assigns_1_0= ruleassign ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:849:1: (lv_assigns_1_0= ruleassign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:849:1: (lv_assigns_1_0= ruleassign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:850:3: lv_assigns_1_0= ruleassign
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComposition_headerAccess().getAssignsAssignParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleassign_in_rulecomposition_header1778);
            	    lv_assigns_1_0=ruleassign();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComposition_headerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assigns",
            	            		lv_assigns_1_0, 
            	            		"assign");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulecomposition_header1791); 

                	newLeafNode(otherlv_2, grammarAccess.getComposition_headerAccess().getENDKeyword_2());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:878:1: entryRulecontract_instance returns [EObject current=null] : iv_rulecontract_instance= rulecontract_instance EOF ;
    public final EObject entryRulecontract_instance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecontract_instance = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:879:2: (iv_rulecontract_instance= rulecontract_instance EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:880:2: iv_rulecontract_instance= rulecontract_instance EOF
            {
             newCompositeNode(grammarAccess.getContract_instanceRule()); 
            pushFollow(FOLLOW_rulecontract_instance_in_entryRulecontract_instance1827);
            iv_rulecontract_instance=rulecontract_instance();

            state._fsp--;

             current =iv_rulecontract_instance; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecontract_instance1837); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:887:1: rulecontract_instance returns [EObject current=null] : ( ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END' ) ;
    public final EObject rulecontract_instance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_vals_3_0 = null;

        EObject lv_assigns_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:890:28: ( ( ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:891:1: ( ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:891:1: ( ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:891:2: ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:891:2: ( (lv_name_0_0= 'INSTANCE' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:892:1: (lv_name_0_0= 'INSTANCE' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:892:1: (lv_name_0_0= 'INSTANCE' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:893:3: lv_name_0_0= 'INSTANCE'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_34_in_rulecontract_instance1880); 

                    newLeafNode(lv_name_0_0, grammarAccess.getContract_instanceAccess().getNameINSTANCEKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContract_instanceRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "INSTANCE");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:906:2: (this_ID_1= RULE_ID otherlv_2= ':' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==35) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:906:3: this_ID_1= RULE_ID otherlv_2= ':'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecontract_instance1905); 
                     
                        newLeafNode(this_ID_1, grammarAccess.getContract_instanceAccess().getIDTerminalRuleCall_1_0()); 
                        
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_rulecontract_instance1916); 

                        	newLeafNode(otherlv_2, grammarAccess.getContract_instanceAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:914:3: ( (lv_vals_3_0= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:915:1: (lv_vals_3_0= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:915:1: (lv_vals_3_0= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:916:3: lv_vals_3_0= rulevalue
            {
             
            	        newCompositeNode(grammarAccess.getContract_instanceAccess().getValsValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_in_rulecontract_instance1939);
            lv_vals_3_0=rulevalue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContract_instanceRule());
            	        }
                   		add(
                   			current, 
                   			"vals",
                    		lv_vals_3_0, 
                    		"value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_rulecontract_instance1951); 

                	newLeafNode(otherlv_4, grammarAccess.getContract_instanceAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:936:1: ( (otherlv_5= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:937:1: (otherlv_5= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:937:1: (otherlv_5= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:938:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContract_instanceRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecontract_instance1971); 

            		newLeafNode(otherlv_5, grammarAccess.getContract_instanceAccess().getVarsValueCrossReference_4_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_rulecontract_instance1983); 

                	newLeafNode(otherlv_6, grammarAccess.getContract_instanceAccess().getRightParenthesisKeyword_5());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:953:1: ( (lv_assigns_7_0= ruleassign ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:954:1: (lv_assigns_7_0= ruleassign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:954:1: (lv_assigns_7_0= ruleassign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:955:3: lv_assigns_7_0= ruleassign
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContract_instanceAccess().getAssignsAssignParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleassign_in_rulecontract_instance2004);
            	    lv_assigns_7_0=ruleassign();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContract_instanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assigns",
            	            		lv_assigns_7_0, 
            	            		"assign");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_8=(Token)match(input,33,FOLLOW_33_in_rulecontract_instance2017); 

                	newLeafNode(otherlv_8, grammarAccess.getContract_instanceAccess().getENDKeyword_7());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:983:1: entryRulefield_decl returns [EObject current=null] : iv_rulefield_decl= rulefield_decl EOF ;
    public final EObject entryRulefield_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:984:2: (iv_rulefield_decl= rulefield_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:985:2: iv_rulefield_decl= rulefield_decl EOF
            {
             newCompositeNode(grammarAccess.getField_declRule()); 
            pushFollow(FOLLOW_rulefield_decl_in_entryRulefield_decl2053);
            iv_rulefield_decl=rulefield_decl();

            state._fsp--;

             current =iv_rulefield_decl; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_decl2063); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:992:1: rulefield_decl returns [EObject current=null] : (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';' ) ;
    public final EObject rulefield_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_input_internal_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:995:28: ( (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:996:1: (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:996:1: (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:996:3: otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulefield_decl2100); 

                	newLeafNode(otherlv_0, grammarAccess.getField_declAccess().getFIELDKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1000:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1001:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1001:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1002:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefield_decl2117); 

            			newLeafNode(lv_name_1_0, grammarAccess.getField_declAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getField_declRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1018:2: ( (lv_input_internal_2_0= ruleinput_options ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1019:1: (lv_input_internal_2_0= ruleinput_options )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1019:1: (lv_input_internal_2_0= ruleinput_options )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1020:3: lv_input_internal_2_0= ruleinput_options
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_declAccess().getInput_internalInput_optionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleinput_options_in_rulefield_decl2143);
                    lv_input_internal_2_0=ruleinput_options();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getField_declRule());
                    	        }
                           		add(
                           			current, 
                           			"input_internal",
                            		lv_input_internal_2_0, 
                            		"input_options");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulefield_decl2156); 

                	newLeafNode(otherlv_3, grammarAccess.getField_declAccess().getSemicolonKeyword_3());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1048:1: entryRuleenum_decl returns [EObject current=null] : iv_ruleenum_decl= ruleenum_decl EOF ;
    public final EObject entryRuleenum_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenum_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1049:2: (iv_ruleenum_decl= ruleenum_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1050:2: iv_ruleenum_decl= ruleenum_decl EOF
            {
             newCompositeNode(grammarAccess.getEnum_declRule()); 
            pushFollow(FOLLOW_ruleenum_decl_in_entryRuleenum_decl2192);
            iv_ruleenum_decl=ruleenum_decl();

            state._fsp--;

             current =iv_ruleenum_decl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenum_decl2202); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1057:1: ruleenum_decl returns [EObject current=null] : ( ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleenum_decl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_vals_2_0 = null;

        EObject lv_assigns_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1060:28: ( ( ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1061:1: ( ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1061:1: ( ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1061:2: ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1061:2: ( (lv_name_0_0= 'ENUM' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1062:1: (lv_name_0_0= 'ENUM' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1062:1: (lv_name_0_0= 'ENUM' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1063:3: lv_name_0_0= 'ENUM'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_39_in_ruleenum_decl2245); 

                    newLeafNode(lv_name_0_0, grammarAccess.getEnum_declAccess().getNameENUMKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnum_declRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "ENUM");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleenum_decl2270); 

                	newLeafNode(otherlv_1, grammarAccess.getEnum_declAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1080:1: ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
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

                if ( (LA21_3==30||LA21_3==37) ) {
                    alt21=1;
                }
                else if ( (LA21_3==31) ) {
                    alt21=2;
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1080:2: ( (lv_vals_2_0= rulevalue_list ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1080:2: ( (lv_vals_2_0= rulevalue_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1081:1: (lv_vals_2_0= rulevalue_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1081:1: (lv_vals_2_0= rulevalue_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1082:3: lv_vals_2_0= rulevalue_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnum_declAccess().getValsValue_listParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_list_in_ruleenum_decl2292);
                    lv_vals_2_0=rulevalue_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnum_declRule());
                    	        }
                           		add(
                           			current, 
                           			"vals",
                            		lv_vals_2_0, 
                            		"value_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1099:6: ( (lv_assigns_3_0= ruleassign_list ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1099:6: ( (lv_assigns_3_0= ruleassign_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1100:1: (lv_assigns_3_0= ruleassign_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1100:1: (lv_assigns_3_0= ruleassign_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1101:3: lv_assigns_3_0= ruleassign_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnum_declAccess().getAssignsAssign_listParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleassign_list_in_ruleenum_decl2319);
                    lv_assigns_3_0=ruleassign_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnum_declRule());
                    	        }
                           		add(
                           			current, 
                           			"assigns",
                            		lv_assigns_3_0, 
                            		"assign_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleenum_decl2332); 

                	newLeafNode(otherlv_4, grammarAccess.getEnum_declAccess().getRightParenthesisKeyword_3());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1129:1: entryRuleinput_section returns [EObject current=null] : iv_ruleinput_section= ruleinput_section EOF ;
    public final EObject entryRuleinput_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinput_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1130:2: (iv_ruleinput_section= ruleinput_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1131:2: iv_ruleinput_section= ruleinput_section EOF
            {
             newCompositeNode(grammarAccess.getInput_sectionRule()); 
            pushFollow(FOLLOW_ruleinput_section_in_entryRuleinput_section2368);
            iv_ruleinput_section=ruleinput_section();

            state._fsp--;

             current =iv_ruleinput_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_section2378); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1138:1: ruleinput_section returns [EObject current=null] : ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END' ) ;
    public final EObject ruleinput_section() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_inputs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1141:28: ( ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1142:1: ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1142:1: ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1142:2: ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1142:2: ( (lv_name_0_0= 'INPUTS' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1143:1: (lv_name_0_0= 'INPUTS' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1143:1: (lv_name_0_0= 'INPUTS' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1144:3: lv_name_0_0= 'INPUTS'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_40_in_ruleinput_section2421); 

                    newLeafNode(lv_name_0_0, grammarAccess.getInput_sectionAccess().getNameINPUTSKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInput_sectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "INPUTS");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1157:2: ( (lv_inputs_1_0= ruleinput_value ) )+
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1158:1: (lv_inputs_1_0= ruleinput_value )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1158:1: (lv_inputs_1_0= ruleinput_value )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1159:3: lv_inputs_1_0= ruleinput_value
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInput_sectionAccess().getInputsInput_valueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleinput_value_in_ruleinput_section2455);
            	    lv_inputs_1_0=ruleinput_value();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInput_sectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inputs",
            	            		lv_inputs_1_0, 
            	            		"input_value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleinput_section2468); 

                	newLeafNode(otherlv_2, grammarAccess.getInput_sectionAccess().getENDKeyword_2());
                

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


    // $ANTLR start "entryRulebool"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1187:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1188:2: (iv_rulebool= rulebool EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1189:2: iv_rulebool= rulebool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_rulebool_in_entryRulebool2504);
            iv_rulebool=rulebool();

            state._fsp--;

             current =iv_rulebool; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebool2514); 

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
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1196:1: rulebool returns [EObject current=null] : (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1199:28: ( (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1200:1: (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1200:1: (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1200:3: otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_rulebool2551); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolAccess().getBOOLKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1204:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1205:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1205:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1206:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebool2568); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBoolAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleint_var"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1230:1: entryRuleint_var returns [EObject current=null] : iv_ruleint_var= ruleint_var EOF ;
    public final EObject entryRuleint_var() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint_var = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1231:2: (iv_ruleint_var= ruleint_var EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1232:2: iv_ruleint_var= ruleint_var EOF
            {
             newCompositeNode(grammarAccess.getInt_varRule()); 
            pushFollow(FOLLOW_ruleint_var_in_entryRuleint_var2609);
            iv_ruleint_var=ruleint_var();

            state._fsp--;

             current =iv_ruleint_var; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleint_var2619); 

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
    // $ANTLR end "entryRuleint_var"


    // $ANTLR start "ruleint_var"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1239:1: ruleint_var returns [EObject current=null] : (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleint_var() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1242:28: ( (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1243:1: (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1243:1: (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1243:3: otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleint_var2656); 

                	newLeafNode(otherlv_0, grammarAccess.getInt_varAccess().getINTKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1247:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1248:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1248:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1249:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleint_var2673); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInt_varAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInt_varRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleint_var"


    // $ANTLR start "entryRulestring_var"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1273:1: entryRulestring_var returns [EObject current=null] : iv_rulestring_var= rulestring_var EOF ;
    public final EObject entryRulestring_var() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring_var = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1274:2: (iv_rulestring_var= rulestring_var EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1275:2: iv_rulestring_var= rulestring_var EOF
            {
             newCompositeNode(grammarAccess.getString_varRule()); 
            pushFollow(FOLLOW_rulestring_var_in_entryRulestring_var2714);
            iv_rulestring_var=rulestring_var();

            state._fsp--;

             current =iv_rulestring_var; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestring_var2724); 

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
    // $ANTLR end "entryRulestring_var"


    // $ANTLR start "rulestring_var"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1282:1: rulestring_var returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulestring_var() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1285:28: ( (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1286:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1286:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1286:3: otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_rulestring_var2761); 

                	newLeafNode(otherlv_0, grammarAccess.getString_varAccess().getSTRINGKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1290:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1291:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1291:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1292:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestring_var2778); 

            			newLeafNode(lv_name_1_0, grammarAccess.getString_varAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getString_varRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulestring_var"


    // $ANTLR start "entryRulerecord"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1316:1: entryRulerecord returns [EObject current=null] : iv_rulerecord= rulerecord EOF ;
    public final EObject entryRulerecord() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1317:2: (iv_rulerecord= rulerecord EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1318:2: iv_rulerecord= rulerecord EOF
            {
             newCompositeNode(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_rulerecord_in_entryRulerecord2819);
            iv_rulerecord=rulerecord();

            state._fsp--;

             current =iv_rulerecord; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord2829); 

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
    // $ANTLR end "entryRulerecord"


    // $ANTLR start "rulerecord"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1325:1: rulerecord returns [EObject current=null] : (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulerecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1328:28: ( (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1329:1: (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1329:1: (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1329:3: otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_rulerecord2866); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordAccess().getRECORDKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1333:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1334:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1334:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1335:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulerecord2883); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulerecord"


    // $ANTLR start "entryRuledataset"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1359:1: entryRuledataset returns [EObject current=null] : iv_ruledataset= ruledataset EOF ;
    public final EObject entryRuledataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledataset = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1360:2: (iv_ruledataset= ruledataset EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1361:2: iv_ruledataset= ruledataset EOF
            {
             newCompositeNode(grammarAccess.getDatasetRule()); 
            pushFollow(FOLLOW_ruledataset_in_entryRuledataset2924);
            iv_ruledataset=ruledataset();

            state._fsp--;

             current =iv_ruledataset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledataset2934); 

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
    // $ANTLR end "entryRuledataset"


    // $ANTLR start "ruledataset"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1368:1: ruledataset returns [EObject current=null] : (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruledataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1371:28: ( (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1372:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1372:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1372:3: otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruledataset2971); 

                	newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getDATASETKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1376:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1377:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1377:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1378:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledataset2988); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDatasetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatasetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruledataset"


    // $ANTLR start "entryRulegroup"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1402:1: entryRulegroup returns [EObject current=null] : iv_rulegroup= rulegroup EOF ;
    public final EObject entryRulegroup() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroup = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1403:2: (iv_rulegroup= rulegroup EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1404:2: iv_rulegroup= rulegroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_rulegroup_in_entryRulegroup3029);
            iv_rulegroup=rulegroup();

            state._fsp--;

             current =iv_rulegroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup3039); 

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
    // $ANTLR end "entryRulegroup"


    // $ANTLR start "rulegroup"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1411:1: rulegroup returns [EObject current=null] : (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulegroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1414:28: ( (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1415:1: (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1415:1: (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1415:3: otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulegroup3076); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGROUPKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1419:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1420:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1420:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1421:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegroup3093); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulegroup"


    // $ANTLR start "entryRuleinput_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1447:1: entryRuleinput_value returns [EObject current=null] : iv_ruleinput_value= ruleinput_value EOF ;
    public final EObject entryRuleinput_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinput_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1448:2: (iv_ruleinput_value= ruleinput_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1449:2: iv_ruleinput_value= ruleinput_value EOF
            {
             newCompositeNode(grammarAccess.getInput_valueRule()); 
            pushFollow(FOLLOW_ruleinput_value_in_entryRuleinput_value3136);
            iv_ruleinput_value=ruleinput_value();

            state._fsp--;

             current =iv_ruleinput_value; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_value3146); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1456:1: ruleinput_value returns [EObject current=null] : ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) ) ;
    public final EObject ruleinput_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        EObject this_bool_0 = null;

        EObject this_int_var_1 = null;

        EObject this_enum_decl_2 = null;

        EObject this_string_var_3 = null;

        EObject this_record_4 = null;

        EObject this_dataset_5 = null;

        EObject lv_input_ops_6_0 = null;

        EObject this_dataset_8 = null;

        EObject lv_input_ops_9_0 = null;

        EObject lv_fields_10_0 = null;

        EObject this_group_12 = null;

        EObject lv_input_internal_13_0 = null;

        EObject lv_values_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1459:28: ( ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1460:1: ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1460:1: ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1460:2: ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1460:2: ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1460:3: (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1460:3: (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset )
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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1461:5: this_bool_0= rulebool
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getBoolParserRuleCall_0_0_0()); 
                                
                            pushFollow(FOLLOW_rulebool_in_ruleinput_value3195);
                            this_bool_0=rulebool();

                            state._fsp--;

                             
                                    current = this_bool_0; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1471:5: this_int_var_1= ruleint_var
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getInt_varParserRuleCall_0_0_1()); 
                                
                            pushFollow(FOLLOW_ruleint_var_in_ruleinput_value3222);
                            this_int_var_1=ruleint_var();

                            state._fsp--;

                             
                                    current = this_int_var_1; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1481:5: this_enum_decl_2= ruleenum_decl
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getEnum_declParserRuleCall_0_0_2()); 
                                
                            pushFollow(FOLLOW_ruleenum_decl_in_ruleinput_value3249);
                            this_enum_decl_2=ruleenum_decl();

                            state._fsp--;

                             
                                    current = this_enum_decl_2; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1491:5: this_string_var_3= rulestring_var
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getString_varParserRuleCall_0_0_3()); 
                                
                            pushFollow(FOLLOW_rulestring_var_in_ruleinput_value3276);
                            this_string_var_3=rulestring_var();

                            state._fsp--;

                             
                                    current = this_string_var_3; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1501:5: this_record_4= rulerecord
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getRecordParserRuleCall_0_0_4()); 
                                
                            pushFollow(FOLLOW_rulerecord_in_ruleinput_value3303);
                            this_record_4=rulerecord();

                            state._fsp--;

                             
                                    current = this_record_4; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1511:5: this_dataset_5= ruledataset
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getDatasetParserRuleCall_0_0_5()); 
                                
                            pushFollow(FOLLOW_ruledataset_in_ruleinput_value3330);
                            this_dataset_5=ruledataset();

                            state._fsp--;

                             
                                    current = this_dataset_5; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1519:2: ( (lv_input_ops_6_0= ruleinput_options ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==35) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1520:1: (lv_input_ops_6_0= ruleinput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1520:1: (lv_input_ops_6_0= ruleinput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1521:3: lv_input_ops_6_0= ruleinput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getInput_valueAccess().getInput_opsInput_optionsParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value3351);
                            lv_input_ops_6_0=ruleinput_options();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInput_valueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"input_ops",
                                    		lv_input_ops_6_0, 
                                    		"input_options");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleinput_value3364); 

                        	newLeafNode(otherlv_7, grammarAccess.getInput_valueAccess().getSemicolonKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1542:6: (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1542:6: (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1543:5: this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END'
                    {
                     
                            newCompositeNode(grammarAccess.getInput_valueAccess().getDatasetParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruledataset_in_ruleinput_value3394);
                    this_dataset_8=ruledataset();

                    state._fsp--;

                     
                            current = this_dataset_8; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1551:1: ( (lv_input_ops_9_0= ruleinput_options ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==35) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1552:1: (lv_input_ops_9_0= ruleinput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1552:1: (lv_input_ops_9_0= ruleinput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1553:3: lv_input_ops_9_0= ruleinput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getInput_valueAccess().getInput_opsInput_optionsParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value3414);
                            lv_input_ops_9_0=ruleinput_options();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInput_valueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"input_ops",
                                    		lv_input_ops_9_0, 
                                    		"input_options");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1569:3: ( (lv_fields_10_0= rulefield_decl ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==38) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1570:1: (lv_fields_10_0= rulefield_decl )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1570:1: (lv_fields_10_0= rulefield_decl )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1571:3: lv_fields_10_0= rulefield_decl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInput_valueAccess().getFieldsField_declParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulefield_decl_in_ruleinput_value3436);
                    	    lv_fields_10_0=rulefield_decl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInput_valueRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fields",
                    	            		lv_fields_10_0, 
                    	            		"field_decl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleinput_value3449); 

                        	newLeafNode(otherlv_11, grammarAccess.getInput_valueAccess().getENDKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1592:6: (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1592:6: (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1593:5: this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END'
                    {
                     
                            newCompositeNode(grammarAccess.getInput_valueAccess().getGroupParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_rulegroup_in_ruleinput_value3479);
                    this_group_12=rulegroup();

                    state._fsp--;

                     
                            current = this_group_12; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1601:1: ( (lv_input_internal_13_0= ruleinput_options ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==35) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1602:1: (lv_input_internal_13_0= ruleinput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1602:1: (lv_input_internal_13_0= ruleinput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1603:3: lv_input_internal_13_0= ruleinput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getInput_valueAccess().getInput_internalInput_optionsParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value3499);
                            lv_input_internal_13_0=ruleinput_options();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInput_valueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"input_internal",
                                    		lv_input_internal_13_0, 
                                    		"input_options");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1619:3: ( (lv_values_14_0= ruleinput_value ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==39||(LA28_0>=41 && LA28_0<=46)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1620:1: (lv_values_14_0= ruleinput_value )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1620:1: (lv_values_14_0= ruleinput_value )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1621:3: lv_values_14_0= ruleinput_value
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInput_valueAccess().getValuesInput_valueParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleinput_value_in_ruleinput_value3521);
                    	    lv_values_14_0=ruleinput_value();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInput_valueRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_14_0, 
                    	            		"input_value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,33,FOLLOW_33_in_ruleinput_value3534); 

                        	newLeafNode(otherlv_15, grammarAccess.getInput_valueAccess().getENDKeyword_2_3());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1649:1: entryRuleinput_options returns [EObject current=null] : iv_ruleinput_options= ruleinput_options EOF ;
    public final EObject entryRuleinput_options() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinput_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1650:2: (iv_ruleinput_options= ruleinput_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1651:2: iv_ruleinput_options= ruleinput_options EOF
            {
             newCompositeNode(grammarAccess.getInput_optionsRule()); 
            pushFollow(FOLLOW_ruleinput_options_in_entryRuleinput_options3571);
            iv_ruleinput_options=ruleinput_options();

            state._fsp--;

             current =iv_ruleinput_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_options3581); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1658:1: ruleinput_options returns [EObject current=null] : (otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )* ) ;
    public final EObject ruleinput_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_input_option_1 = null;

        EObject lv_input_internal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1661:28: ( (otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1662:1: (otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1662:1: (otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1662:3: otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleinput_options3618); 

                	newLeafNode(otherlv_0, grammarAccess.getInput_optionsAccess().getColonKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getInput_optionsAccess().getInput_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleinput_option_in_ruleinput_options3640);
            this_input_option_1=ruleinput_option();

            state._fsp--;

             
                    current = this_input_option_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1675:1: (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1675:3: otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleinput_options3652); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInput_optionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1679:1: ( (lv_input_internal_3_0= ruleinput_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1680:1: (lv_input_internal_3_0= ruleinput_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1680:1: (lv_input_internal_3_0= ruleinput_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1681:3: lv_input_internal_3_0= ruleinput_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInput_optionsAccess().getInput_internalInput_optionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleinput_option_in_ruleinput_options3673);
            	    lv_input_internal_3_0=ruleinput_option();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInput_optionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"input_internal",
            	            		lv_input_internal_3_0, 
            	            		"input_option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1705:1: entryRuleinput_option returns [EObject current=null] : iv_ruleinput_option= ruleinput_option EOF ;
    public final EObject entryRuleinput_option() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinput_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1706:2: (iv_ruleinput_option= ruleinput_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1707:2: iv_ruleinput_option= ruleinput_option EOF
            {
             newCompositeNode(grammarAccess.getInput_optionRule()); 
            pushFollow(FOLLOW_ruleinput_option_in_entryRuleinput_option3711);
            iv_ruleinput_option=ruleinput_option();

            state._fsp--;

             current =iv_ruleinput_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_option3721); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1714:1: ruleinput_option returns [EObject current=null] : ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' ) ) ;
    public final EObject ruleinput_option() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_name_18_0=null;
        Token lv_name_19_0=null;
        Token lv_name_20_0=null;
        Token lv_name_21_0=null;
        Token lv_name_22_0=null;
        Token lv_name_23_0=null;
        Token lv_name_24_0=null;
        Token lv_name_25_0=null;
        Token lv_name_26_0=null;
        Token lv_name_27_0=null;
        Token lv_name_28_0=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_assigns_internal_12_0 = null;

        EObject lv_vals_30_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1717:28: ( ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1718:1: ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1718:1: ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' ) )
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

                if ( (LA33_2==36) ) {
                    alt33=5;
                }
                else if ( (LA33_2==EOF||LA33_2==20||LA33_2==30||LA33_2==33||(LA33_2>=38 && LA33_2<=39)||(LA33_2>=41 && LA33_2<=46)) ) {
                    alt33=1;
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1718:2: ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1718:2: ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) )
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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1718:3: ( (lv_name_0_0= 'OPTIONAL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1718:3: ( (lv_name_0_0= 'OPTIONAL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1719:1: (lv_name_0_0= 'OPTIONAL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1719:1: (lv_name_0_0= 'OPTIONAL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1720:3: lv_name_0_0= 'OPTIONAL'
                            {
                            lv_name_0_0=(Token)match(input,47,FOLLOW_47_in_ruleinput_option3765); 

                                    newLeafNode(lv_name_0_0, grammarAccess.getInput_optionAccess().getNameOPTIONALKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_0_0, "OPTIONAL");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1734:6: ( (lv_name_1_0= 'DEFINED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1734:6: ( (lv_name_1_0= 'DEFINED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1735:1: (lv_name_1_0= 'DEFINED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1735:1: (lv_name_1_0= 'DEFINED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1736:3: lv_name_1_0= 'DEFINED'
                            {
                            lv_name_1_0=(Token)match(input,48,FOLLOW_48_in_ruleinput_option3802); 

                                    newLeafNode(lv_name_1_0, grammarAccess.getInput_optionAccess().getNameDEFINEDKeyword_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_1_0, "DEFINED");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1750:6: ( (lv_name_2_0= 'DISABLED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1750:6: ( (lv_name_2_0= 'DISABLED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1751:1: (lv_name_2_0= 'DISABLED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1751:1: (lv_name_2_0= 'DISABLED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1752:3: lv_name_2_0= 'DISABLED'
                            {
                            lv_name_2_0=(Token)match(input,49,FOLLOW_49_in_ruleinput_option3839); 

                                    newLeafNode(lv_name_2_0, grammarAccess.getInput_optionAccess().getNameDISABLEDKeyword_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_0, "DISABLED");
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1766:6: ( (lv_name_3_0= 'MAPBYTYPE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1766:6: ( (lv_name_3_0= 'MAPBYTYPE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1767:1: (lv_name_3_0= 'MAPBYTYPE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1767:1: (lv_name_3_0= 'MAPBYTYPE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1768:3: lv_name_3_0= 'MAPBYTYPE'
                            {
                            lv_name_3_0=(Token)match(input,50,FOLLOW_50_in_ruleinput_option3876); 

                                    newLeafNode(lv_name_3_0, grammarAccess.getInput_optionAccess().getNameMAPBYTYPEKeyword_0_3_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_3_0, "MAPBYTYPE");
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1782:6: ( (lv_name_4_0= 'MAPBYNAME' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1782:6: ( (lv_name_4_0= 'MAPBYNAME' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1783:1: (lv_name_4_0= 'MAPBYNAME' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1783:1: (lv_name_4_0= 'MAPBYNAME' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1784:3: lv_name_4_0= 'MAPBYNAME'
                            {
                            lv_name_4_0=(Token)match(input,51,FOLLOW_51_in_ruleinput_option3913); 

                                    newLeafNode(lv_name_4_0, grammarAccess.getInput_optionAccess().getNameMAPBYNAMEKeyword_0_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_4_0, "MAPBYNAME");
                            	    

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1798:6: ( (lv_name_5_0= 'MANY' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1798:6: ( (lv_name_5_0= 'MANY' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1799:1: (lv_name_5_0= 'MANY' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1799:1: (lv_name_5_0= 'MANY' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1800:3: lv_name_5_0= 'MANY'
                            {
                            lv_name_5_0=(Token)match(input,52,FOLLOW_52_in_ruleinput_option3950); 

                                    newLeafNode(lv_name_5_0, grammarAccess.getInput_optionAccess().getNameMANYKeyword_0_5_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_5_0, "MANY");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1814:6: ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1814:6: ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1814:7: ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1814:7: ( (lv_name_6_0= 'FORMFIELD' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1815:1: (lv_name_6_0= 'FORMFIELD' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1815:1: (lv_name_6_0= 'FORMFIELD' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1816:3: lv_name_6_0= 'FORMFIELD'
                    {
                    lv_name_6_0=(Token)match(input,53,FOLLOW_53_in_ruleinput_option3989); 

                            newLeafNode(lv_name_6_0, grammarAccess.getInput_optionAccess().getNameFORMFIELDKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_6_0, "FORMFIELD");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleinput_option4014); 

                        	newLeafNode(otherlv_7, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_1_1());
                        
                     
                            newCompositeNode(grammarAccess.getInput_optionAccess().getFormfield_optionParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleformfield_option_in_ruleinput_option4030);
                    ruleformfield_option();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleinput_option4041); 

                        	newLeafNode(otherlv_9, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1846:6: ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1846:6: ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1846:7: ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1846:7: ( (lv_name_10_0= 'ENABLE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1847:1: (lv_name_10_0= 'ENABLE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1847:1: (lv_name_10_0= 'ENABLE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1848:3: lv_name_10_0= 'ENABLE'
                    {
                    lv_name_10_0=(Token)match(input,54,FOLLOW_54_in_ruleinput_option4067); 

                            newLeafNode(lv_name_10_0, grammarAccess.getInput_optionAccess().getNameENABLEKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_10_0, "ENABLE");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleinput_option4092); 

                        	newLeafNode(otherlv_11, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1865:1: ( (lv_assigns_internal_12_0= ruleassign_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1866:1: (lv_assigns_internal_12_0= ruleassign_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1866:1: (lv_assigns_internal_12_0= ruleassign_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1867:3: lv_assigns_internal_12_0= ruleassign_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getInput_optionAccess().getAssigns_internalAssign_listParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleassign_list_in_ruleinput_option4113);
                    lv_assigns_internal_12_0=ruleassign_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInput_optionRule());
                    	        }
                           		add(
                           			current, 
                           			"assigns_internal",
                            		lv_assigns_internal_12_0, 
                            		"assign_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleinput_option4125); 

                        	newLeafNode(otherlv_13, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1888:6: ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1888:6: ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1888:7: ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1888:7: ( (lv_name_14_0= 'TYPE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1889:1: (lv_name_14_0= 'TYPE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1889:1: (lv_name_14_0= 'TYPE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1890:3: lv_name_14_0= 'TYPE'
                    {
                    lv_name_14_0=(Token)match(input,55,FOLLOW_55_in_ruleinput_option4151); 

                            newLeafNode(lv_name_14_0, grammarAccess.getInput_optionAccess().getNameTYPEKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_14_0, "TYPE");
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,36,FOLLOW_36_in_ruleinput_option4176); 

                        	newLeafNode(otherlv_15, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_3_1());
                        
                     
                            newCompositeNode(grammarAccess.getInput_optionAccess().getInputtype_optionsParserRuleCall_3_2()); 
                        
                    pushFollow(FOLLOW_ruleinputtype_options_in_ruleinput_option4192);
                    ruleinputtype_options();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_17=(Token)match(input,37,FOLLOW_37_in_ruleinput_option4203); 

                        	newLeafNode(otherlv_17, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_3_3());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1920:6: ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1920:6: ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1920:7: ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1920:7: ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) )
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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1920:8: ( (lv_name_18_0= 'RANGE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1920:8: ( (lv_name_18_0= 'RANGE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1921:1: (lv_name_18_0= 'RANGE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1921:1: (lv_name_18_0= 'RANGE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1922:3: lv_name_18_0= 'RANGE'
                            {
                            lv_name_18_0=(Token)match(input,56,FOLLOW_56_in_ruleinput_option4230); 

                                    newLeafNode(lv_name_18_0, grammarAccess.getInput_optionAccess().getNameRANGEKeyword_4_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_18_0, "RANGE");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1936:6: ( (lv_name_19_0= 'DEFAULT' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1936:6: ( (lv_name_19_0= 'DEFAULT' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1937:1: (lv_name_19_0= 'DEFAULT' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1937:1: (lv_name_19_0= 'DEFAULT' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1938:3: lv_name_19_0= 'DEFAULT'
                            {
                            lv_name_19_0=(Token)match(input,57,FOLLOW_57_in_ruleinput_option4267); 

                                    newLeafNode(lv_name_19_0, grammarAccess.getInput_optionAccess().getNameDEFAULTKeyword_4_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_19_0, "DEFAULT");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1952:6: ( (lv_name_20_0= 'MAXLENGTH' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1952:6: ( (lv_name_20_0= 'MAXLENGTH' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1953:1: (lv_name_20_0= 'MAXLENGTH' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1953:1: (lv_name_20_0= 'MAXLENGTH' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1954:3: lv_name_20_0= 'MAXLENGTH'
                            {
                            lv_name_20_0=(Token)match(input,58,FOLLOW_58_in_ruleinput_option4304); 

                                    newLeafNode(lv_name_20_0, grammarAccess.getInput_optionAccess().getNameMAXLENGTHKeyword_4_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_20_0, "MAXLENGTH");
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1968:6: ( (lv_name_21_0= 'DISABLED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1968:6: ( (lv_name_21_0= 'DISABLED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1969:1: (lv_name_21_0= 'DISABLED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1969:1: (lv_name_21_0= 'DISABLED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1970:3: lv_name_21_0= 'DISABLED'
                            {
                            lv_name_21_0=(Token)match(input,49,FOLLOW_49_in_ruleinput_option4341); 

                                    newLeafNode(lv_name_21_0, grammarAccess.getInput_optionAccess().getNameDISABLEDKeyword_4_0_3_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_21_0, "DISABLED");
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1984:6: ( (lv_name_22_0= 'DESCRIPTION' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1984:6: ( (lv_name_22_0= 'DESCRIPTION' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1985:1: (lv_name_22_0= 'DESCRIPTION' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1985:1: (lv_name_22_0= 'DESCRIPTION' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1986:3: lv_name_22_0= 'DESCRIPTION'
                            {
                            lv_name_22_0=(Token)match(input,13,FOLLOW_13_in_ruleinput_option4378); 

                                    newLeafNode(lv_name_22_0, grammarAccess.getInput_optionAccess().getNameDESCRIPTIONKeyword_4_0_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_22_0, "DESCRIPTION");
                            	    

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2000:6: ( (lv_name_23_0= 'NULL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2000:6: ( (lv_name_23_0= 'NULL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2001:1: (lv_name_23_0= 'NULL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2001:1: (lv_name_23_0= 'NULL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2002:3: lv_name_23_0= 'NULL'
                            {
                            lv_name_23_0=(Token)match(input,59,FOLLOW_59_in_ruleinput_option4415); 

                                    newLeafNode(lv_name_23_0, grammarAccess.getInput_optionAccess().getNameNULLKeyword_4_0_5_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_23_0, "NULL");
                            	    

                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2016:6: ( (lv_name_24_0= 'FIELDLENGTH' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2016:6: ( (lv_name_24_0= 'FIELDLENGTH' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2017:1: (lv_name_24_0= 'FIELDLENGTH' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2017:1: (lv_name_24_0= 'FIELDLENGTH' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2018:3: lv_name_24_0= 'FIELDLENGTH'
                            {
                            lv_name_24_0=(Token)match(input,60,FOLLOW_60_in_ruleinput_option4452); 

                                    newLeafNode(lv_name_24_0, grammarAccess.getInput_optionAccess().getNameFIELDLENGTHKeyword_4_0_6_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_24_0, "FIELDLENGTH");
                            	    

                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2032:6: ( (lv_name_25_0= 'ROWS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2032:6: ( (lv_name_25_0= 'ROWS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2033:1: (lv_name_25_0= 'ROWS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2033:1: (lv_name_25_0= 'ROWS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2034:3: lv_name_25_0= 'ROWS'
                            {
                            lv_name_25_0=(Token)match(input,61,FOLLOW_61_in_ruleinput_option4489); 

                                    newLeafNode(lv_name_25_0, grammarAccess.getInput_optionAccess().getNameROWSKeyword_4_0_7_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_25_0, "ROWS");
                            	    

                            }


                            }


                            }
                            break;
                        case 9 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2048:6: ( (lv_name_26_0= 'COLS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2048:6: ( (lv_name_26_0= 'COLS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2049:1: (lv_name_26_0= 'COLS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2049:1: (lv_name_26_0= 'COLS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2050:3: lv_name_26_0= 'COLS'
                            {
                            lv_name_26_0=(Token)match(input,62,FOLLOW_62_in_ruleinput_option4526); 

                                    newLeafNode(lv_name_26_0, grammarAccess.getInput_optionAccess().getNameCOLSKeyword_4_0_8_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_26_0, "COLS");
                            	    

                            }


                            }


                            }
                            break;
                        case 10 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2064:6: ( (lv_name_27_0= '_HTML_STYLECLASS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2064:6: ( (lv_name_27_0= '_HTML_STYLECLASS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2065:1: (lv_name_27_0= '_HTML_STYLECLASS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2065:1: (lv_name_27_0= '_HTML_STYLECLASS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2066:3: lv_name_27_0= '_HTML_STYLECLASS'
                            {
                            lv_name_27_0=(Token)match(input,63,FOLLOW_63_in_ruleinput_option4563); 

                                    newLeafNode(lv_name_27_0, grammarAccess.getInput_optionAccess().getName_HTML_STYLECLASSKeyword_4_0_9_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_27_0, "_HTML_STYLECLASS");
                            	    

                            }


                            }


                            }
                            break;
                        case 11 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2080:6: ( (lv_name_28_0= 'LABEL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2080:6: ( (lv_name_28_0= 'LABEL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2081:1: (lv_name_28_0= 'LABEL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2081:1: (lv_name_28_0= 'LABEL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2082:3: lv_name_28_0= 'LABEL'
                            {
                            lv_name_28_0=(Token)match(input,18,FOLLOW_18_in_ruleinput_option4600); 

                                    newLeafNode(lv_name_28_0, grammarAccess.getInput_optionAccess().getNameLABELKeyword_4_0_10_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_28_0, "LABEL");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,36,FOLLOW_36_in_ruleinput_option4626); 

                        	newLeafNode(otherlv_29, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2099:1: ( (lv_vals_30_0= rulevalue_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2100:1: (lv_vals_30_0= rulevalue_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2100:1: (lv_vals_30_0= rulevalue_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2101:3: lv_vals_30_0= rulevalue_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getInput_optionAccess().getValsValue_listParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_list_in_ruleinput_option4647);
                    lv_vals_30_0=rulevalue_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInput_optionRule());
                    	        }
                           		add(
                           			current, 
                           			"vals",
                            		lv_vals_30_0, 
                            		"value_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_31=(Token)match(input,37,FOLLOW_37_in_ruleinput_option4659); 

                        	newLeafNode(otherlv_31, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_4_3());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2129:1: entryRuleformfield_option returns [String current=null] : iv_ruleformfield_option= ruleformfield_option EOF ;
    public final String entryRuleformfield_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleformfield_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2130:2: (iv_ruleformfield_option= ruleformfield_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2131:2: iv_ruleformfield_option= ruleformfield_option EOF
            {
             newCompositeNode(grammarAccess.getFormfield_optionRule()); 
            pushFollow(FOLLOW_ruleformfield_option_in_entryRuleformfield_option4697);
            iv_ruleformfield_option=ruleformfield_option();

            state._fsp--;

             current =iv_ruleformfield_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformfield_option4708); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2138:1: ruleformfield_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' ) ;
    public final AntlrDatatypeRuleToken ruleformfield_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2141:28: ( (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2142:1: (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2142:1: (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2143:2: kw= 'CHECKBOX'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleformfield_option4746); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getCHECKBOXKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2150:2: kw= 'RADIO'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleformfield_option4765); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getRADIOKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2157:2: kw= 'SELECT'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleformfield_option4784); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getSELECTKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2164:2: kw= 'MULTIPLESELECT'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleformfield_option4803); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getMULTIPLESELECTKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2171:2: kw= 'TEXTAREA'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleformfield_option4822); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getTEXTAREAKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2178:2: kw= 'HIDDEN'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleformfield_option4841); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getHIDDENKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2185:2: kw= 'TEXT'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleformfield_option4860); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2198:1: entryRuleinputtype_option returns [String current=null] : iv_ruleinputtype_option= ruleinputtype_option EOF ;
    public final String entryRuleinputtype_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinputtype_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2199:2: (iv_ruleinputtype_option= ruleinputtype_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2200:2: iv_ruleinputtype_option= ruleinputtype_option EOF
            {
             newCompositeNode(grammarAccess.getInputtype_optionRule()); 
            pushFollow(FOLLOW_ruleinputtype_option_in_entryRuleinputtype_option4901);
            iv_ruleinputtype_option=ruleinputtype_option();

            state._fsp--;

             current =iv_ruleinputtype_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputtype_option4912); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2207:1: ruleinputtype_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' ) ;
    public final AntlrDatatypeRuleToken ruleinputtype_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2210:28: ( (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2211:1: (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2211:1: (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2212:2: kw= 'STRING'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleinputtype_option4950); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getSTRINGKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2219:2: kw= 'UNICODE'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleinputtype_option4969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getUNICODEKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2226:2: kw= 'UNISTR'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleinputtype_option4988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getUNISTRKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2233:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleinputtype_option5007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getINTEGERKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2240:2: kw= 'DECIMAL'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleinputtype_option5026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getDECIMALKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2247:2: kw= 'NUMERIC'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleinputtype_option5045); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getNUMERICKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2254:2: kw= 'REAL'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleinputtype_option5064); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2267:1: entryRuleinputtype_options returns [String current=null] : iv_ruleinputtype_options= ruleinputtype_options EOF ;
    public final String entryRuleinputtype_options() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinputtype_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2268:2: (iv_ruleinputtype_options= ruleinputtype_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2269:2: iv_ruleinputtype_options= ruleinputtype_options EOF
            {
             newCompositeNode(grammarAccess.getInputtype_optionsRule()); 
            pushFollow(FOLLOW_ruleinputtype_options_in_entryRuleinputtype_options5105);
            iv_ruleinputtype_options=ruleinputtype_options();

            state._fsp--;

             current =iv_ruleinputtype_options.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputtype_options5116); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2276:1: ruleinputtype_options returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* ) ;
    public final AntlrDatatypeRuleToken ruleinputtype_options() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_inputtype_option_0 = null;

        AntlrDatatypeRuleToken this_inputtype_option_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2279:28: ( (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2280:1: (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2280:1: (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2281:5: this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )*
            {
             
                    newCompositeNode(grammarAccess.getInputtype_optionsAccess().getInputtype_optionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleinputtype_option_in_ruleinputtype_options5163);
            this_inputtype_option_0=ruleinputtype_option();

            state._fsp--;


            		current.merge(this_inputtype_option_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2291:1: (kw= ',' this_inputtype_option_2= ruleinputtype_option )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2292:2: kw= ',' this_inputtype_option_2= ruleinputtype_option
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleinputtype_options5182); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getInputtype_optionsAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getInputtype_optionsAccess().getInputtype_optionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleinputtype_option_in_ruleinputtype_options5204);
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2316:1: entryRuleoutput_section returns [EObject current=null] : iv_ruleoutput_section= ruleoutput_section EOF ;
    public final EObject entryRuleoutput_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2317:2: (iv_ruleoutput_section= ruleoutput_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2318:2: iv_ruleoutput_section= ruleoutput_section EOF
            {
             newCompositeNode(grammarAccess.getOutput_sectionRule()); 
            pushFollow(FOLLOW_ruleoutput_section_in_entryRuleoutput_section5251);
            iv_ruleoutput_section=ruleoutput_section();

            state._fsp--;

             current =iv_ruleoutput_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_section5261); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2325:1: ruleoutput_section returns [EObject current=null] : ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END' ) ;
    public final EObject ruleoutput_section() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_outputs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2328:28: ( ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2329:1: ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2329:1: ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2329:2: ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2329:2: ( (lv_name_0_0= 'OUTPUTS' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2330:1: (lv_name_0_0= 'OUTPUTS' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2330:1: (lv_name_0_0= 'OUTPUTS' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2331:3: lv_name_0_0= 'OUTPUTS'
            {
            lv_name_0_0=(Token)match(input,77,FOLLOW_77_in_ruleoutput_section5304); 

                    newLeafNode(lv_name_0_0, grammarAccess.getOutput_sectionAccess().getNameOUTPUTSKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutput_sectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "OUTPUTS");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2344:2: ( (lv_outputs_1_0= ruleoutput_value ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_STRING)||(LA37_0>=41 && LA37_0<=43)||LA37_0==45||LA37_0==89) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2345:1: (lv_outputs_1_0= ruleoutput_value )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2345:1: (lv_outputs_1_0= ruleoutput_value )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2346:3: lv_outputs_1_0= ruleoutput_value
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutput_sectionAccess().getOutputsOutput_valueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleoutput_value_in_ruleoutput_section5338);
            	    lv_outputs_1_0=ruleoutput_value();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutput_sectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"outputs",
            	            		lv_outputs_1_0, 
            	            		"output_value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleoutput_section5351); 

                	newLeafNode(otherlv_2, grammarAccess.getOutput_sectionAccess().getENDKeyword_2());
                

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


    // $ANTLR start "entryRuleecl_integer"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2376:1: entryRuleecl_integer returns [EObject current=null] : iv_ruleecl_integer= ruleecl_integer EOF ;
    public final EObject entryRuleecl_integer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_integer = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2377:2: (iv_ruleecl_integer= ruleecl_integer EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2378:2: iv_ruleecl_integer= ruleecl_integer EOF
            {
             newCompositeNode(grammarAccess.getEcl_integerRule()); 
            pushFollow(FOLLOW_ruleecl_integer_in_entryRuleecl_integer5389);
            iv_ruleecl_integer=ruleecl_integer();

            state._fsp--;

             current =iv_ruleecl_integer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_integer5399); 

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
    // $ANTLR end "entryRuleecl_integer"


    // $ANTLR start "ruleecl_integer"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2385:1: ruleecl_integer returns [EObject current=null] : (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_integer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2388:28: ( (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2389:1: (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2389:1: (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2389:3: otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleecl_integer5436); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_integerAccess().getINTEGERKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2393:1: (this_INT_1= RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2393:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_integer5448); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_integerAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2397:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2398:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2398:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2399:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_integer5466); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEcl_integerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_integerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_integer"


    // $ANTLR start "entryRuleecl_unsigned"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2423:1: entryRuleecl_unsigned returns [EObject current=null] : iv_ruleecl_unsigned= ruleecl_unsigned EOF ;
    public final EObject entryRuleecl_unsigned() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_unsigned = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2424:2: (iv_ruleecl_unsigned= ruleecl_unsigned EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2425:2: iv_ruleecl_unsigned= ruleecl_unsigned EOF
            {
             newCompositeNode(grammarAccess.getEcl_unsignedRule()); 
            pushFollow(FOLLOW_ruleecl_unsigned_in_entryRuleecl_unsigned5507);
            iv_ruleecl_unsigned=ruleecl_unsigned();

            state._fsp--;

             current =iv_ruleecl_unsigned; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_unsigned5517); 

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
    // $ANTLR end "entryRuleecl_unsigned"


    // $ANTLR start "ruleecl_unsigned"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2432:1: ruleecl_unsigned returns [EObject current=null] : (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_unsigned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2435:28: ( (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2436:1: (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2436:1: (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2436:3: otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleecl_unsigned5554); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_unsignedAccess().getUNSIGNEDKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2440:1: (this_INT_1= RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2440:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_unsigned5566); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_unsignedAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2444:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2445:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2445:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2446:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_unsigned5584); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEcl_unsignedAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_unsignedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_unsigned"


    // $ANTLR start "entryRuleecl_string"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2470:1: entryRuleecl_string returns [EObject current=null] : iv_ruleecl_string= ruleecl_string EOF ;
    public final EObject entryRuleecl_string() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_string = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2471:2: (iv_ruleecl_string= ruleecl_string EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2472:2: iv_ruleecl_string= ruleecl_string EOF
            {
             newCompositeNode(grammarAccess.getEcl_stringRule()); 
            pushFollow(FOLLOW_ruleecl_string_in_entryRuleecl_string5625);
            iv_ruleecl_string=ruleecl_string();

            state._fsp--;

             current =iv_ruleecl_string; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_string5635); 

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
    // $ANTLR end "entryRuleecl_string"


    // $ANTLR start "ruleecl_string"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2479:1: ruleecl_string returns [EObject current=null] : (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_string() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2482:28: ( (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2483:1: (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2483:1: (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2483:3: otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleecl_string5672); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_stringAccess().getSTRINGKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2487:1: (this_INT_1= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2487:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_string5684); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_stringAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2491:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2492:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2492:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2493:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_string5702); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEcl_stringAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_stringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_string"


    // $ANTLR start "entryRuleecl_qstring"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2517:1: entryRuleecl_qstring returns [EObject current=null] : iv_ruleecl_qstring= ruleecl_qstring EOF ;
    public final EObject entryRuleecl_qstring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_qstring = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2518:2: (iv_ruleecl_qstring= ruleecl_qstring EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2519:2: iv_ruleecl_qstring= ruleecl_qstring EOF
            {
             newCompositeNode(grammarAccess.getEcl_qstringRule()); 
            pushFollow(FOLLOW_ruleecl_qstring_in_entryRuleecl_qstring5743);
            iv_ruleecl_qstring=ruleecl_qstring();

            state._fsp--;

             current =iv_ruleecl_qstring; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_qstring5753); 

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
    // $ANTLR end "entryRuleecl_qstring"


    // $ANTLR start "ruleecl_qstring"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2526:1: ruleecl_qstring returns [EObject current=null] : (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_qstring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2529:28: ( (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2530:1: (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2530:1: (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2530:3: otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleecl_qstring5790); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_qstringAccess().getQSTRINGKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2534:1: (this_INT_1= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2534:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_qstring5802); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_qstringAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2538:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2539:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2539:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2540:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_qstring5820); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEcl_qstringAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_qstringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_qstring"


    // $ANTLR start "entryRuleecl_varstring"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2564:1: entryRuleecl_varstring returns [EObject current=null] : iv_ruleecl_varstring= ruleecl_varstring EOF ;
    public final EObject entryRuleecl_varstring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_varstring = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2565:2: (iv_ruleecl_varstring= ruleecl_varstring EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2566:2: iv_ruleecl_varstring= ruleecl_varstring EOF
            {
             newCompositeNode(grammarAccess.getEcl_varstringRule()); 
            pushFollow(FOLLOW_ruleecl_varstring_in_entryRuleecl_varstring5861);
            iv_ruleecl_varstring=ruleecl_varstring();

            state._fsp--;

             current =iv_ruleecl_varstring; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_varstring5871); 

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
    // $ANTLR end "entryRuleecl_varstring"


    // $ANTLR start "ruleecl_varstring"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2573:1: ruleecl_varstring returns [EObject current=null] : (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_varstring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2576:28: ( (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2577:1: (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2577:1: (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2577:3: otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleecl_varstring5908); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_varstringAccess().getVARSTRINGKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2581:1: (this_INT_1= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2581:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_varstring5920); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_varstringAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2585:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2586:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2586:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2587:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_varstring5938); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEcl_varstringAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_varstringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_varstring"


    // $ANTLR start "entryRuleecl_unicode"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2611:1: entryRuleecl_unicode returns [EObject current=null] : iv_ruleecl_unicode= ruleecl_unicode EOF ;
    public final EObject entryRuleecl_unicode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_unicode = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2612:2: (iv_ruleecl_unicode= ruleecl_unicode EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2613:2: iv_ruleecl_unicode= ruleecl_unicode EOF
            {
             newCompositeNode(grammarAccess.getEcl_unicodeRule()); 
            pushFollow(FOLLOW_ruleecl_unicode_in_entryRuleecl_unicode5979);
            iv_ruleecl_unicode=ruleecl_unicode();

            state._fsp--;

             current =iv_ruleecl_unicode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_unicode5989); 

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
    // $ANTLR end "entryRuleecl_unicode"


    // $ANTLR start "ruleecl_unicode"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2620:1: ruleecl_unicode returns [EObject current=null] : (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_unicode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2623:28: ( (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2624:1: (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2624:1: (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2624:3: otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleecl_unicode6026); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_unicodeAccess().getUNICODEKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2628:1: (this_INT_1= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2628:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_unicode6038); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_unicodeAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2632:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2633:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2633:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2634:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_unicode6056); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEcl_unicodeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_unicodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_unicode"


    // $ANTLR start "entryRuleecl_varunicode"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2658:1: entryRuleecl_varunicode returns [EObject current=null] : iv_ruleecl_varunicode= ruleecl_varunicode EOF ;
    public final EObject entryRuleecl_varunicode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_varunicode = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2659:2: (iv_ruleecl_varunicode= ruleecl_varunicode EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2660:2: iv_ruleecl_varunicode= ruleecl_varunicode EOF
            {
             newCompositeNode(grammarAccess.getEcl_varunicodeRule()); 
            pushFollow(FOLLOW_ruleecl_varunicode_in_entryRuleecl_varunicode6097);
            iv_ruleecl_varunicode=ruleecl_varunicode();

            state._fsp--;

             current =iv_ruleecl_varunicode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_varunicode6107); 

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
    // $ANTLR end "entryRuleecl_varunicode"


    // $ANTLR start "ruleecl_varunicode"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2667:1: ruleecl_varunicode returns [EObject current=null] : (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_varunicode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2670:28: ( (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2671:1: (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2671:1: (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2671:3: otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleecl_varunicode6144); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_varunicodeAccess().getVARUNICODEKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2675:1: (this_INT_1= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2675:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_varunicode6156); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_varunicodeAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2679:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2680:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2680:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2681:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_varunicode6174); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEcl_varunicodeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_varunicodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_varunicode"


    // $ANTLR start "entryRuleecl_data"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2705:1: entryRuleecl_data returns [EObject current=null] : iv_ruleecl_data= ruleecl_data EOF ;
    public final EObject entryRuleecl_data() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_data = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2706:2: (iv_ruleecl_data= ruleecl_data EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2707:2: iv_ruleecl_data= ruleecl_data EOF
            {
             newCompositeNode(grammarAccess.getEcl_dataRule()); 
            pushFollow(FOLLOW_ruleecl_data_in_entryRuleecl_data6215);
            iv_ruleecl_data=ruleecl_data();

            state._fsp--;

             current =iv_ruleecl_data; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_data6225); 

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
    // $ANTLR end "entryRuleecl_data"


    // $ANTLR start "ruleecl_data"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2714:1: ruleecl_data returns [EObject current=null] : (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_data() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2717:28: ( (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2718:1: (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2718:1: (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2718:3: otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleecl_data6262); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_dataAccess().getDATAKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2722:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2723:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2723:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2724:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_data6279); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEcl_dataAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_dataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_data"


    // $ANTLR start "entryRuleecl_real"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2748:1: entryRuleecl_real returns [EObject current=null] : iv_ruleecl_real= ruleecl_real EOF ;
    public final EObject entryRuleecl_real() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_real = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2749:2: (iv_ruleecl_real= ruleecl_real EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2750:2: iv_ruleecl_real= ruleecl_real EOF
            {
             newCompositeNode(grammarAccess.getEcl_realRule()); 
            pushFollow(FOLLOW_ruleecl_real_in_entryRuleecl_real6320);
            iv_ruleecl_real=ruleecl_real();

            state._fsp--;

             current =iv_ruleecl_real; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_real6330); 

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
    // $ANTLR end "entryRuleecl_real"


    // $ANTLR start "ruleecl_real"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2757:1: ruleecl_real returns [EObject current=null] : (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_real() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2760:28: ( (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2761:1: (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2761:1: (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2761:3: otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleecl_real6367); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_realAccess().getREALKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2765:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2766:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2766:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2767:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_real6384); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEcl_realAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEcl_realRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleecl_real"


    // $ANTLR start "entryRuleeclfield_type"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2791:1: entryRuleeclfield_type returns [EObject current=null] : iv_ruleeclfield_type= ruleeclfield_type EOF ;
    public final EObject entryRuleeclfield_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleeclfield_type = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2792:2: (iv_ruleeclfield_type= ruleeclfield_type EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2793:2: iv_ruleeclfield_type= ruleeclfield_type EOF
            {
             newCompositeNode(grammarAccess.getEclfield_typeRule()); 
            pushFollow(FOLLOW_ruleeclfield_type_in_entryRuleeclfield_type6425);
            iv_ruleeclfield_type=ruleeclfield_type();

            state._fsp--;

             current =iv_ruleeclfield_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleeclfield_type6435); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2800:1: ruleeclfield_type returns [EObject current=null] : (this_ecl_integer_0= ruleecl_integer | this_ecl_qstring_1= ruleecl_qstring | this_ecl_string_2= ruleecl_string | this_ecl_real_3= ruleecl_real | this_ecl_unicode_4= ruleecl_unicode | this_ecl_data_5= ruleecl_data | this_ecl_varstring_6= ruleecl_varstring | this_ecl_varunicode_7= ruleecl_varunicode | this_ecl_unsigned_8= ruleecl_unsigned ) ;
    public final EObject ruleeclfield_type() throws RecognitionException {
        EObject current = null;

        EObject this_ecl_integer_0 = null;

        EObject this_ecl_qstring_1 = null;

        EObject this_ecl_string_2 = null;

        EObject this_ecl_real_3 = null;

        EObject this_ecl_unicode_4 = null;

        EObject this_ecl_data_5 = null;

        EObject this_ecl_varstring_6 = null;

        EObject this_ecl_varunicode_7 = null;

        EObject this_ecl_unsigned_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2803:28: ( (this_ecl_integer_0= ruleecl_integer | this_ecl_qstring_1= ruleecl_qstring | this_ecl_string_2= ruleecl_string | this_ecl_real_3= ruleecl_real | this_ecl_unicode_4= ruleecl_unicode | this_ecl_data_5= ruleecl_data | this_ecl_varstring_6= ruleecl_varstring | this_ecl_varunicode_7= ruleecl_varunicode | this_ecl_unsigned_8= ruleecl_unsigned ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2804:1: (this_ecl_integer_0= ruleecl_integer | this_ecl_qstring_1= ruleecl_qstring | this_ecl_string_2= ruleecl_string | this_ecl_real_3= ruleecl_real | this_ecl_unicode_4= ruleecl_unicode | this_ecl_data_5= ruleecl_data | this_ecl_varstring_6= ruleecl_varstring | this_ecl_varunicode_7= ruleecl_varunicode | this_ecl_unsigned_8= ruleecl_unsigned )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2804:1: (this_ecl_integer_0= ruleecl_integer | this_ecl_qstring_1= ruleecl_qstring | this_ecl_string_2= ruleecl_string | this_ecl_real_3= ruleecl_real | this_ecl_unicode_4= ruleecl_unicode | this_ecl_data_5= ruleecl_data | this_ecl_varstring_6= ruleecl_varstring | this_ecl_varunicode_7= ruleecl_varunicode | this_ecl_unsigned_8= ruleecl_unsigned )
            int alt45=9;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt45=1;
                }
                break;
            case 79:
                {
                alt45=2;
                }
                break;
            case 43:
                {
                alt45=3;
                }
                break;
            case 76:
                {
                alt45=4;
                }
                break;
            case 71:
                {
                alt45=5;
                }
                break;
            case 82:
                {
                alt45=6;
                }
                break;
            case 80:
                {
                alt45=7;
                }
                break;
            case 81:
                {
                alt45=8;
                }
                break;
            case 78:
                {
                alt45=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2805:5: this_ecl_integer_0= ruleecl_integer
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_integerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleecl_integer_in_ruleeclfield_type6482);
                    this_ecl_integer_0=ruleecl_integer();

                    state._fsp--;

                     
                            current = this_ecl_integer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2815:5: this_ecl_qstring_1= ruleecl_qstring
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_qstringParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleecl_qstring_in_ruleeclfield_type6509);
                    this_ecl_qstring_1=ruleecl_qstring();

                    state._fsp--;

                     
                            current = this_ecl_qstring_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2825:5: this_ecl_string_2= ruleecl_string
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_stringParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleecl_string_in_ruleeclfield_type6536);
                    this_ecl_string_2=ruleecl_string();

                    state._fsp--;

                     
                            current = this_ecl_string_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2835:5: this_ecl_real_3= ruleecl_real
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_realParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleecl_real_in_ruleeclfield_type6563);
                    this_ecl_real_3=ruleecl_real();

                    state._fsp--;

                     
                            current = this_ecl_real_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2845:5: this_ecl_unicode_4= ruleecl_unicode
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_unicodeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleecl_unicode_in_ruleeclfield_type6590);
                    this_ecl_unicode_4=ruleecl_unicode();

                    state._fsp--;

                     
                            current = this_ecl_unicode_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2855:5: this_ecl_data_5= ruleecl_data
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_dataParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleecl_data_in_ruleeclfield_type6617);
                    this_ecl_data_5=ruleecl_data();

                    state._fsp--;

                     
                            current = this_ecl_data_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2865:5: this_ecl_varstring_6= ruleecl_varstring
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_varstringParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleecl_varstring_in_ruleeclfield_type6644);
                    this_ecl_varstring_6=ruleecl_varstring();

                    state._fsp--;

                     
                            current = this_ecl_varstring_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2875:5: this_ecl_varunicode_7= ruleecl_varunicode
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_varunicodeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleecl_varunicode_in_ruleeclfield_type6671);
                    this_ecl_varunicode_7=ruleecl_varunicode();

                    state._fsp--;

                     
                            current = this_ecl_varunicode_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2885:5: this_ecl_unsigned_8= ruleecl_unsigned
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_unsignedParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleecl_unsigned_in_ruleeclfield_type6698);
                    this_ecl_unsigned_8=ruleecl_unsigned();

                    state._fsp--;

                     
                            current = this_ecl_unsigned_8; 
                            afterParserOrEnumRuleCall();
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2901:1: entryRuleecloutput_decl returns [EObject current=null] : iv_ruleecloutput_decl= ruleecloutput_decl EOF ;
    public final EObject entryRuleecloutput_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecloutput_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2902:2: (iv_ruleecloutput_decl= ruleecloutput_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2903:2: iv_ruleecloutput_decl= ruleecloutput_decl EOF
            {
             newCompositeNode(grammarAccess.getEcloutput_declRule()); 
            pushFollow(FOLLOW_ruleecloutput_decl_in_entryRuleecloutput_decl6733);
            iv_ruleecloutput_decl=ruleecloutput_decl();

            state._fsp--;

             current =iv_ruleecloutput_decl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecloutput_decl6743); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2910:1: ruleecloutput_decl returns [EObject current=null] : (this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleoutput_options ) )? otherlv_2= ';' ) ;
    public final EObject ruleecloutput_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_eclfield_type_0 = null;

        EObject lv_options_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2913:28: ( (this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleoutput_options ) )? otherlv_2= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2914:1: (this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleoutput_options ) )? otherlv_2= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2914:1: (this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleoutput_options ) )? otherlv_2= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2915:5: this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleoutput_options ) )? otherlv_2= ';'
            {
             
                    newCompositeNode(grammarAccess.getEcloutput_declAccess().getEclfield_typeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleeclfield_type_in_ruleecloutput_decl6790);
            this_eclfield_type_0=ruleeclfield_type();

            state._fsp--;

             
                    current = this_eclfield_type_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2923:1: ( (lv_options_1_0= ruleoutput_options ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2924:1: (lv_options_1_0= ruleoutput_options )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2924:1: (lv_options_1_0= ruleoutput_options )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2925:3: lv_options_1_0= ruleoutput_options
                    {
                     
                    	        newCompositeNode(grammarAccess.getEcloutput_declAccess().getOptionsOutput_optionsParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleoutput_options_in_ruleecloutput_decl6810);
                    lv_options_1_0=ruleoutput_options();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEcloutput_declRule());
                    	        }
                           		add(
                           			current, 
                           			"options",
                            		lv_options_1_0, 
                            		"output_options");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleecloutput_decl6823); 

                	newLeafNode(otherlv_2, grammarAccess.getEcloutput_declAccess().getSemicolonKeyword_2());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2953:1: entryRuleoutput_option returns [EObject current=null] : iv_ruleoutput_option= ruleoutput_option EOF ;
    public final EObject entryRuleoutput_option() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2954:2: (iv_ruleoutput_option= ruleoutput_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2955:2: iv_ruleoutput_option= ruleoutput_option EOF
            {
             newCompositeNode(grammarAccess.getOutput_optionRule()); 
            pushFollow(FOLLOW_ruleoutput_option_in_entryRuleoutput_option6859);
            iv_ruleoutput_option=ruleoutput_option();

            state._fsp--;

             current =iv_ruleoutput_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_option6869); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2962:1: ruleoutput_option returns [EObject current=null] : ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleoutput_option() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_vals_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2965:28: ( ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2966:1: ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2966:1: ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt48=1;
                }
                break;
            case 88:
                {
                alt48=2;
                }
                break;
            case 13:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2966:2: ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2966:2: ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) )
                    int alt47=5;
                    switch ( input.LA(1) ) {
                    case 83:
                        {
                        alt47=1;
                        }
                        break;
                    case 84:
                        {
                        alt47=2;
                        }
                        break;
                    case 85:
                        {
                        alt47=3;
                        }
                        break;
                    case 86:
                        {
                        alt47=4;
                        }
                        break;
                    case 87:
                        {
                        alt47=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2966:3: ( (lv_name_0_0= 'SIDE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2966:3: ( (lv_name_0_0= 'SIDE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2967:1: (lv_name_0_0= 'SIDE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2967:1: (lv_name_0_0= 'SIDE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2968:3: lv_name_0_0= 'SIDE'
                            {
                            lv_name_0_0=(Token)match(input,83,FOLLOW_83_in_ruleoutput_option6913); 

                                    newLeafNode(lv_name_0_0, grammarAccess.getOutput_optionAccess().getNameSIDEKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_0_0, "SIDE");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2982:6: ( (lv_name_1_0= 'LARGE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2982:6: ( (lv_name_1_0= 'LARGE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2983:1: (lv_name_1_0= 'LARGE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2983:1: (lv_name_1_0= 'LARGE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2984:3: lv_name_1_0= 'LARGE'
                            {
                            lv_name_1_0=(Token)match(input,84,FOLLOW_84_in_ruleoutput_option6950); 

                                    newLeafNode(lv_name_1_0, grammarAccess.getOutput_optionAccess().getNameLARGEKeyword_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_1_0, "LARGE");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2998:6: ( (lv_name_2_0= 'SMALL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2998:6: ( (lv_name_2_0= 'SMALL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2999:1: (lv_name_2_0= 'SMALL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2999:1: (lv_name_2_0= 'SMALL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3000:3: lv_name_2_0= 'SMALL'
                            {
                            lv_name_2_0=(Token)match(input,85,FOLLOW_85_in_ruleoutput_option6987); 

                                    newLeafNode(lv_name_2_0, grammarAccess.getOutput_optionAccess().getNameSMALLKeyword_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_0, "SMALL");
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3014:6: ( (lv_name_3_0= 'FEW' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3014:6: ( (lv_name_3_0= 'FEW' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3015:1: (lv_name_3_0= 'FEW' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3015:1: (lv_name_3_0= 'FEW' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3016:3: lv_name_3_0= 'FEW'
                            {
                            lv_name_3_0=(Token)match(input,86,FOLLOW_86_in_ruleoutput_option7024); 

                                    newLeafNode(lv_name_3_0, grammarAccess.getOutput_optionAccess().getNameFEWKeyword_0_3_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_3_0, "FEW");
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3030:6: ( (lv_name_4_0= 'WUID' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3030:6: ( (lv_name_4_0= 'WUID' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3031:1: (lv_name_4_0= 'WUID' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3031:1: (lv_name_4_0= 'WUID' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3032:3: lv_name_4_0= 'WUID'
                            {
                            lv_name_4_0=(Token)match(input,87,FOLLOW_87_in_ruleoutput_option7061); 

                                    newLeafNode(lv_name_4_0, grammarAccess.getOutput_optionAccess().getNameWUIDKeyword_0_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutput_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_4_0, "WUID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3046:6: ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3046:6: ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3046:7: ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3046:7: ( (lv_name_5_0= 'FROM' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3047:1: (lv_name_5_0= 'FROM' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3047:1: (lv_name_5_0= 'FROM' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3048:3: lv_name_5_0= 'FROM'
                    {
                    lv_name_5_0=(Token)match(input,88,FOLLOW_88_in_ruleoutput_option7100); 

                            newLeafNode(lv_name_5_0, grammarAccess.getOutput_optionAccess().getNameFROMKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutput_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_5_0, "FROM");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleoutput_option7125); 

                        	newLeafNode(otherlv_6, grammarAccess.getOutput_optionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3065:1: ( (otherlv_7= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3066:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3066:1: (otherlv_7= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3067:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutput_optionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleoutput_option7145); 

                    		newLeafNode(otherlv_7, grammarAccess.getOutput_optionAccess().getVarsDatatypeCrossReference_1_2_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleoutput_option7157); 

                        	newLeafNode(otherlv_8, grammarAccess.getOutput_optionAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3083:6: ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3083:6: ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3083:7: ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3083:7: ( (lv_name_9_0= 'DESCRIPTION' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3084:1: (lv_name_9_0= 'DESCRIPTION' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3084:1: (lv_name_9_0= 'DESCRIPTION' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3085:3: lv_name_9_0= 'DESCRIPTION'
                    {
                    lv_name_9_0=(Token)match(input,13,FOLLOW_13_in_ruleoutput_option7183); 

                            newLeafNode(lv_name_9_0, grammarAccess.getOutput_optionAccess().getNameDESCRIPTIONKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutput_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_9_0, "DESCRIPTION");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleoutput_option7208); 

                        	newLeafNode(otherlv_10, grammarAccess.getOutput_optionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3102:1: ( (lv_vals_11_0= rulevalue ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3103:1: (lv_vals_11_0= rulevalue )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3103:1: (lv_vals_11_0= rulevalue )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3104:3: lv_vals_11_0= rulevalue
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutput_optionAccess().getValsValueParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_in_ruleoutput_option7229);
                    lv_vals_11_0=rulevalue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutput_optionRule());
                    	        }
                           		add(
                           			current, 
                           			"vals",
                            		lv_vals_11_0, 
                            		"value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleoutput_option7241); 

                        	newLeafNode(otherlv_12, grammarAccess.getOutput_optionAccess().getRightParenthesisKeyword_2_3());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3132:1: entryRuleoutput_options returns [EObject current=null] : iv_ruleoutput_options= ruleoutput_options EOF ;
    public final EObject entryRuleoutput_options() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3133:2: (iv_ruleoutput_options= ruleoutput_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3134:2: iv_ruleoutput_options= ruleoutput_options EOF
            {
             newCompositeNode(grammarAccess.getOutput_optionsRule()); 
            pushFollow(FOLLOW_ruleoutput_options_in_entryRuleoutput_options7278);
            iv_ruleoutput_options=ruleoutput_options();

            state._fsp--;

             current =iv_ruleoutput_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_options7288); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3141:1: ruleoutput_options returns [EObject current=null] : (otherlv_0= ':' this_output_option_1= ruleoutput_option (otherlv_2= ',' ( (lv_output_internal_3_0= ruleoutput_option ) ) )* ) ;
    public final EObject ruleoutput_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_output_option_1 = null;

        EObject lv_output_internal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3144:28: ( (otherlv_0= ':' this_output_option_1= ruleoutput_option (otherlv_2= ',' ( (lv_output_internal_3_0= ruleoutput_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3145:1: (otherlv_0= ':' this_output_option_1= ruleoutput_option (otherlv_2= ',' ( (lv_output_internal_3_0= ruleoutput_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3145:1: (otherlv_0= ':' this_output_option_1= ruleoutput_option (otherlv_2= ',' ( (lv_output_internal_3_0= ruleoutput_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3145:3: otherlv_0= ':' this_output_option_1= ruleoutput_option (otherlv_2= ',' ( (lv_output_internal_3_0= ruleoutput_option ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleoutput_options7325); 

                	newLeafNode(otherlv_0, grammarAccess.getOutput_optionsAccess().getColonKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getOutput_optionsAccess().getOutput_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleoutput_option_in_ruleoutput_options7347);
            this_output_option_1=ruleoutput_option();

            state._fsp--;

             
                    current = this_output_option_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3158:1: (otherlv_2= ',' ( (lv_output_internal_3_0= ruleoutput_option ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==30) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3158:3: otherlv_2= ',' ( (lv_output_internal_3_0= ruleoutput_option ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleoutput_options7359); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOutput_optionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3162:1: ( (lv_output_internal_3_0= ruleoutput_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3163:1: (lv_output_internal_3_0= ruleoutput_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3163:1: (lv_output_internal_3_0= ruleoutput_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3164:3: lv_output_internal_3_0= ruleoutput_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutput_optionsAccess().getOutput_internalOutput_optionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleoutput_option_in_ruleoutput_options7380);
            	    lv_output_internal_3_0=ruleoutput_option();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutput_optionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"output_internal",
            	            		lv_output_internal_3_0, 
            	            		"output_option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
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


    // $ANTLR start "entryRuleout_type"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3188:1: entryRuleout_type returns [EObject current=null] : iv_ruleout_type= ruleout_type EOF ;
    public final EObject entryRuleout_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleout_type = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3189:2: (iv_ruleout_type= ruleout_type EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3190:2: iv_ruleout_type= ruleout_type EOF
            {
             newCompositeNode(grammarAccess.getOut_typeRule()); 
            pushFollow(FOLLOW_ruleout_type_in_entryRuleout_type7418);
            iv_ruleout_type=ruleout_type();

            state._fsp--;

             current =iv_ruleout_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleout_type7428); 

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
    // $ANTLR end "entryRuleout_type"


    // $ANTLR start "ruleout_type"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3197:1: ruleout_type returns [EObject current=null] : ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue ) ;
    public final EObject ruleout_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_value_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3200:28: ( ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3201:1: ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3201:1: ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3201:2: (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3201:2: (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )?
            int alt50=5;
            switch ( input.LA(1) ) {
                case 41:
                    {
                    alt50=1;
                    }
                    break;
                case 42:
                    {
                    alt50=2;
                    }
                    break;
                case 43:
                    {
                    alt50=3;
                    }
                    break;
                case 89:
                    {
                    alt50=4;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3201:4: otherlv_0= 'BOOL'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleout_type7466); 

                        	newLeafNode(otherlv_0, grammarAccess.getOut_typeAccess().getBOOLKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3206:7: otherlv_1= 'INT'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleout_type7484); 

                        	newLeafNode(otherlv_1, grammarAccess.getOut_typeAccess().getINTKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3211:7: otherlv_2= 'STRING'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleout_type7502); 

                        	newLeafNode(otherlv_2, grammarAccess.getOut_typeAccess().getSTRINGKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3216:7: otherlv_3= 'ACTION'
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_89_in_ruleout_type7520); 

                        	newLeafNode(otherlv_3, grammarAccess.getOut_typeAccess().getACTIONKeyword_0_3());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getOut_typeAccess().getValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevalue_in_ruleout_type7544);
            this_value_4=rulevalue();

            state._fsp--;

             
                    current = this_value_4; 
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
    // $ANTLR end "ruleout_type"


    // $ANTLR start "entryRuleoutput_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3237:1: entryRuleoutput_value returns [EObject current=null] : iv_ruleoutput_value= ruleoutput_value EOF ;
    public final EObject entryRuleoutput_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3238:2: (iv_ruleoutput_value= ruleoutput_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3239:2: iv_ruleoutput_value= ruleoutput_value EOF
            {
             newCompositeNode(grammarAccess.getOutput_valueRule()); 
            pushFollow(FOLLOW_ruleoutput_value_in_entryRuleoutput_value7579);
            iv_ruleoutput_value=ruleoutput_value();

            state._fsp--;

             current =iv_ruleoutput_value; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_value7589); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3246:1: ruleoutput_value returns [EObject current=null] : ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleoutput_options ) )? otherlv_2= ';' ) | (this_dataset_3= ruledataset ( (lv_out_base_4_0= ruleoutputbase ) )? ( (lv_ops_5_0= ruleoutput_options ) )? ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )* otherlv_7= 'END' ) | (this_dataset_8= ruledataset ( (lv_op_base_9_0= ruleoutputbase ) )? ( (lv_ops_10_0= ruleoutput_options ) )? otherlv_11= ';' ) ) ;
    public final EObject ruleoutput_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject this_out_type_0 = null;

        EObject lv_ops_1_0 = null;

        EObject this_dataset_3 = null;

        EObject lv_out_base_4_0 = null;

        EObject lv_ops_5_0 = null;

        EObject lv_ecl_vars_6_0 = null;

        EObject this_dataset_8 = null;

        EObject lv_op_base_9_0 = null;

        EObject lv_ops_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3249:28: ( ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleoutput_options ) )? otherlv_2= ';' ) | (this_dataset_3= ruledataset ( (lv_out_base_4_0= ruleoutputbase ) )? ( (lv_ops_5_0= ruleoutput_options ) )? ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )* otherlv_7= 'END' ) | (this_dataset_8= ruledataset ( (lv_op_base_9_0= ruleoutputbase ) )? ( (lv_ops_10_0= ruleoutput_options ) )? otherlv_11= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3250:1: ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleoutput_options ) )? otherlv_2= ';' ) | (this_dataset_3= ruledataset ( (lv_out_base_4_0= ruleoutputbase ) )? ( (lv_ops_5_0= ruleoutput_options ) )? ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )* otherlv_7= 'END' ) | (this_dataset_8= ruledataset ( (lv_op_base_9_0= ruleoutputbase ) )? ( (lv_ops_10_0= ruleoutput_options ) )? otherlv_11= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3250:1: ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleoutput_options ) )? otherlv_2= ';' ) | (this_dataset_3= ruledataset ( (lv_out_base_4_0= ruleoutputbase ) )? ( (lv_ops_5_0= ruleoutput_options ) )? ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )* otherlv_7= 'END' ) | (this_dataset_8= ruledataset ( (lv_op_base_9_0= ruleoutputbase ) )? ( (lv_ops_10_0= ruleoutput_options ) )? otherlv_11= ';' ) )
            int alt57=3;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3250:2: (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleoutput_options ) )? otherlv_2= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3250:2: (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleoutput_options ) )? otherlv_2= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3251:5: this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleoutput_options ) )? otherlv_2= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getOutput_valueAccess().getOut_typeParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleout_type_in_ruleoutput_value7637);
                    this_out_type_0=ruleout_type();

                    state._fsp--;

                     
                            current = this_out_type_0; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3259:1: ( (lv_ops_1_0= ruleoutput_options ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==35) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3260:1: (lv_ops_1_0= ruleoutput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3260:1: (lv_ops_1_0= ruleoutput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3261:3: lv_ops_1_0= ruleoutput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getOutput_valueAccess().getOpsOutput_optionsParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleoutput_options_in_ruleoutput_value7657);
                            lv_ops_1_0=ruleoutput_options();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"ops",
                                    		lv_ops_1_0, 
                                    		"output_options");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleoutput_value7670); 

                        	newLeafNode(otherlv_2, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3282:6: (this_dataset_3= ruledataset ( (lv_out_base_4_0= ruleoutputbase ) )? ( (lv_ops_5_0= ruleoutput_options ) )? ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )* otherlv_7= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3282:6: (this_dataset_3= ruledataset ( (lv_out_base_4_0= ruleoutputbase ) )? ( (lv_ops_5_0= ruleoutput_options ) )? ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )* otherlv_7= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3283:5: this_dataset_3= ruledataset ( (lv_out_base_4_0= ruleoutputbase ) )? ( (lv_ops_5_0= ruleoutput_options ) )? ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )* otherlv_7= 'END'
                    {
                     
                            newCompositeNode(grammarAccess.getOutput_valueAccess().getDatasetParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruledataset_in_ruleoutput_value7700);
                    this_dataset_3=ruledataset();

                    state._fsp--;

                     
                            current = this_dataset_3; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3291:1: ( (lv_out_base_4_0= ruleoutputbase ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==36) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3292:1: (lv_out_base_4_0= ruleoutputbase )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3292:1: (lv_out_base_4_0= ruleoutputbase )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3293:3: lv_out_base_4_0= ruleoutputbase
                            {
                             
                            	        newCompositeNode(grammarAccess.getOutput_valueAccess().getOut_baseOutputbaseParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleoutputbase_in_ruleoutput_value7720);
                            lv_out_base_4_0=ruleoutputbase();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"out_base",
                                    		lv_out_base_4_0, 
                                    		"outputbase");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3309:3: ( (lv_ops_5_0= ruleoutput_options ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==35) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3310:1: (lv_ops_5_0= ruleoutput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3310:1: (lv_ops_5_0= ruleoutput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3311:3: lv_ops_5_0= ruleoutput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getOutput_valueAccess().getOpsOutput_optionsParserRuleCall_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleoutput_options_in_ruleoutput_value7742);
                            lv_ops_5_0=ruleoutput_options();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"ops",
                                    		lv_ops_5_0, 
                                    		"output_options");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3327:3: ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==43||LA54_0==71||LA54_0==73||LA54_0==76||(LA54_0>=78 && LA54_0<=82)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3328:1: (lv_ecl_vars_6_0= ruleecloutput_decl )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3328:1: (lv_ecl_vars_6_0= ruleecloutput_decl )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3329:3: lv_ecl_vars_6_0= ruleecloutput_decl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOutput_valueAccess().getEcl_varsEcloutput_declParserRuleCall_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleecloutput_decl_in_ruleoutput_value7764);
                    	    lv_ecl_vars_6_0=ruleecloutput_decl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ecl_vars",
                    	            		lv_ecl_vars_6_0, 
                    	            		"ecloutput_decl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleoutput_value7777); 

                        	newLeafNode(otherlv_7, grammarAccess.getOutput_valueAccess().getENDKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3350:6: (this_dataset_8= ruledataset ( (lv_op_base_9_0= ruleoutputbase ) )? ( (lv_ops_10_0= ruleoutput_options ) )? otherlv_11= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3350:6: (this_dataset_8= ruledataset ( (lv_op_base_9_0= ruleoutputbase ) )? ( (lv_ops_10_0= ruleoutput_options ) )? otherlv_11= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3351:5: this_dataset_8= ruledataset ( (lv_op_base_9_0= ruleoutputbase ) )? ( (lv_ops_10_0= ruleoutput_options ) )? otherlv_11= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getOutput_valueAccess().getDatasetParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruledataset_in_ruleoutput_value7807);
                    this_dataset_8=ruledataset();

                    state._fsp--;

                     
                            current = this_dataset_8; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3359:1: ( (lv_op_base_9_0= ruleoutputbase ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==36) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3360:1: (lv_op_base_9_0= ruleoutputbase )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3360:1: (lv_op_base_9_0= ruleoutputbase )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3361:3: lv_op_base_9_0= ruleoutputbase
                            {
                             
                            	        newCompositeNode(grammarAccess.getOutput_valueAccess().getOp_baseOutputbaseParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleoutputbase_in_ruleoutput_value7827);
                            lv_op_base_9_0=ruleoutputbase();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"op_base",
                                    		lv_op_base_9_0, 
                                    		"outputbase");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3377:3: ( (lv_ops_10_0= ruleoutput_options ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==35) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3378:1: (lv_ops_10_0= ruleoutput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3378:1: (lv_ops_10_0= ruleoutput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3379:3: lv_ops_10_0= ruleoutput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getOutput_valueAccess().getOpsOutput_optionsParserRuleCall_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleoutput_options_in_ruleoutput_value7849);
                            lv_ops_10_0=ruleoutput_options();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"ops",
                                    		lv_ops_10_0, 
                                    		"output_options");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleoutput_value7862); 

                        	newLeafNode(otherlv_11, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_2_3());
                        

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


    // $ANTLR start "entryRuleoutputbase"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3407:1: entryRuleoutputbase returns [EObject current=null] : iv_ruleoutputbase= ruleoutputbase EOF ;
    public final EObject entryRuleoutputbase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutputbase = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3408:2: (iv_ruleoutputbase= ruleoutputbase EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3409:2: iv_ruleoutputbase= ruleoutputbase EOF
            {
             newCompositeNode(grammarAccess.getOutputbaseRule()); 
            pushFollow(FOLLOW_ruleoutputbase_in_entryRuleoutputbase7899);
            iv_ruleoutputbase=ruleoutputbase();

            state._fsp--;

             current =iv_ruleoutputbase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutputbase7909); 

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
    // $ANTLR end "entryRuleoutputbase"


    // $ANTLR start "ruleoutputbase"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3416:1: ruleoutputbase returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleoutputbase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3419:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3420:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3420:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3420:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleoutputbase7946); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputbaseAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3424:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3425:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3425:1: (otherlv_1= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3426:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputbaseRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleoutputbase7966); 

            		newLeafNode(otherlv_1, grammarAccess.getOutputbaseAccess().getActionsDatasetCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleoutputbase7978); 

                	newLeafNode(otherlv_2, grammarAccess.getOutputbaseAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleoutputbase"


    // $ANTLR start "entryRulegenerate_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3449:1: entryRulegenerate_section returns [EObject current=null] : iv_rulegenerate_section= rulegenerate_section EOF ;
    public final EObject entryRulegenerate_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegenerate_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3450:2: (iv_rulegenerate_section= rulegenerate_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3451:2: iv_rulegenerate_section= rulegenerate_section EOF
            {
             newCompositeNode(grammarAccess.getGenerate_sectionRule()); 
            pushFollow(FOLLOW_rulegenerate_section_in_entryRulegenerate_section8014);
            iv_rulegenerate_section=rulegenerate_section();

            state._fsp--;

             current =iv_rulegenerate_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_section8024); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3458:1: rulegenerate_section returns [EObject current=null] : ( ( (lv_name_0_0= 'GENERATES' ) ) ( (lv_body_1_0= rulegenerate_body ) ) otherlv_2= 'ENDGENERATES' ) ;
    public final EObject rulegenerate_section() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3461:28: ( ( ( (lv_name_0_0= 'GENERATES' ) ) ( (lv_body_1_0= rulegenerate_body ) ) otherlv_2= 'ENDGENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3462:1: ( ( (lv_name_0_0= 'GENERATES' ) ) ( (lv_body_1_0= rulegenerate_body ) ) otherlv_2= 'ENDGENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3462:1: ( ( (lv_name_0_0= 'GENERATES' ) ) ( (lv_body_1_0= rulegenerate_body ) ) otherlv_2= 'ENDGENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3462:2: ( (lv_name_0_0= 'GENERATES' ) ) ( (lv_body_1_0= rulegenerate_body ) ) otherlv_2= 'ENDGENERATES'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3462:2: ( (lv_name_0_0= 'GENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3463:1: (lv_name_0_0= 'GENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3463:1: (lv_name_0_0= 'GENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3464:3: lv_name_0_0= 'GENERATES'
            {
            lv_name_0_0=(Token)match(input,90,FOLLOW_90_in_rulegenerate_section8067); 

                    newLeafNode(lv_name_0_0, grammarAccess.getGenerate_sectionAccess().getNameGENERATESKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenerate_sectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "GENERATES");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3477:2: ( (lv_body_1_0= rulegenerate_body ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3478:1: (lv_body_1_0= rulegenerate_body )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3478:1: (lv_body_1_0= rulegenerate_body )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3479:3: lv_body_1_0= rulegenerate_body
            {
             
            	        newCompositeNode(grammarAccess.getGenerate_sectionAccess().getBodyGenerate_bodyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulegenerate_body_in_rulegenerate_section8101);
            lv_body_1_0=rulegenerate_body();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGenerate_sectionRule());
            	        }
                   		add(
                   			current, 
                   			"body",
                    		lv_body_1_0, 
                    		"generate_body");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,91,FOLLOW_91_in_rulegenerate_section8113); 

                	newLeafNode(otherlv_2, grammarAccess.getGenerate_sectionAccess().getENDGENERATESKeyword_2());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3507:1: entryRulegenerate_body returns [EObject current=null] : iv_rulegenerate_body= rulegenerate_body EOF ;
    public final EObject entryRulegenerate_body() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegenerate_body = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3508:2: (iv_rulegenerate_body= rulegenerate_body EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3509:2: iv_rulegenerate_body= rulegenerate_body EOF
            {
             newCompositeNode(grammarAccess.getGenerate_bodyRule()); 
            pushFollow(FOLLOW_rulegenerate_body_in_entryRulegenerate_body8149);
            iv_rulegenerate_body=rulegenerate_body();

            state._fsp--;

             current =iv_rulegenerate_body; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_body8159); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3516:1: rulegenerate_body returns [EObject current=null] : ( ( ( (lv_name_0_0= 'INLINE' ) ) (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_WS_3= RULE_WS | this_STRING_4= RULE_STRING | this_ECL_CODE_5= RULE_ECL_CODE | otherlv_6= ';' | otherlv_7= '.' | otherlv_8= '(' | otherlv_9= ')' | otherlv_10= ',' | otherlv_11= ':' | otherlv_12= '=' | otherlv_13= '{' | otherlv_14= '}' | otherlv_15= '-' )* ) | ( ( (lv_name_16_0= 'SALT' ) ) otherlv_17= '(' this_ID_18= RULE_ID otherlv_19= ')' otherlv_20= ':' (otherlv_21= 'SCOREDSEARCH' | otherlv_22= 'PROFILE' ) ) ) ;
    public final EObject rulegenerate_body() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_WS_3=null;
        Token this_STRING_4=null;
        Token this_ECL_CODE_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_name_16_0=null;
        Token otherlv_17=null;
        Token this_ID_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3519:28: ( ( ( ( (lv_name_0_0= 'INLINE' ) ) (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_WS_3= RULE_WS | this_STRING_4= RULE_STRING | this_ECL_CODE_5= RULE_ECL_CODE | otherlv_6= ';' | otherlv_7= '.' | otherlv_8= '(' | otherlv_9= ')' | otherlv_10= ',' | otherlv_11= ':' | otherlv_12= '=' | otherlv_13= '{' | otherlv_14= '}' | otherlv_15= '-' )* ) | ( ( (lv_name_16_0= 'SALT' ) ) otherlv_17= '(' this_ID_18= RULE_ID otherlv_19= ')' otherlv_20= ':' (otherlv_21= 'SCOREDSEARCH' | otherlv_22= 'PROFILE' ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3520:1: ( ( ( (lv_name_0_0= 'INLINE' ) ) (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_WS_3= RULE_WS | this_STRING_4= RULE_STRING | this_ECL_CODE_5= RULE_ECL_CODE | otherlv_6= ';' | otherlv_7= '.' | otherlv_8= '(' | otherlv_9= ')' | otherlv_10= ',' | otherlv_11= ':' | otherlv_12= '=' | otherlv_13= '{' | otherlv_14= '}' | otherlv_15= '-' )* ) | ( ( (lv_name_16_0= 'SALT' ) ) otherlv_17= '(' this_ID_18= RULE_ID otherlv_19= ')' otherlv_20= ':' (otherlv_21= 'SCOREDSEARCH' | otherlv_22= 'PROFILE' ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3520:1: ( ( ( (lv_name_0_0= 'INLINE' ) ) (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_WS_3= RULE_WS | this_STRING_4= RULE_STRING | this_ECL_CODE_5= RULE_ECL_CODE | otherlv_6= ';' | otherlv_7= '.' | otherlv_8= '(' | otherlv_9= ')' | otherlv_10= ',' | otherlv_11= ':' | otherlv_12= '=' | otherlv_13= '{' | otherlv_14= '}' | otherlv_15= '-' )* ) | ( ( (lv_name_16_0= 'SALT' ) ) otherlv_17= '(' this_ID_18= RULE_ID otherlv_19= ')' otherlv_20= ':' (otherlv_21= 'SCOREDSEARCH' | otherlv_22= 'PROFILE' ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==92) ) {
                alt60=1;
            }
            else if ( (LA60_0==97) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3520:2: ( ( (lv_name_0_0= 'INLINE' ) ) (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_WS_3= RULE_WS | this_STRING_4= RULE_STRING | this_ECL_CODE_5= RULE_ECL_CODE | otherlv_6= ';' | otherlv_7= '.' | otherlv_8= '(' | otherlv_9= ')' | otherlv_10= ',' | otherlv_11= ':' | otherlv_12= '=' | otherlv_13= '{' | otherlv_14= '}' | otherlv_15= '-' )* )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3520:2: ( ( (lv_name_0_0= 'INLINE' ) ) (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_WS_3= RULE_WS | this_STRING_4= RULE_STRING | this_ECL_CODE_5= RULE_ECL_CODE | otherlv_6= ';' | otherlv_7= '.' | otherlv_8= '(' | otherlv_9= ')' | otherlv_10= ',' | otherlv_11= ':' | otherlv_12= '=' | otherlv_13= '{' | otherlv_14= '}' | otherlv_15= '-' )* )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3520:3: ( (lv_name_0_0= 'INLINE' ) ) (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_WS_3= RULE_WS | this_STRING_4= RULE_STRING | this_ECL_CODE_5= RULE_ECL_CODE | otherlv_6= ';' | otherlv_7= '.' | otherlv_8= '(' | otherlv_9= ')' | otherlv_10= ',' | otherlv_11= ':' | otherlv_12= '=' | otherlv_13= '{' | otherlv_14= '}' | otherlv_15= '-' )*
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3520:3: ( (lv_name_0_0= 'INLINE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3521:1: (lv_name_0_0= 'INLINE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3521:1: (lv_name_0_0= 'INLINE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3522:3: lv_name_0_0= 'INLINE'
                    {
                    lv_name_0_0=(Token)match(input,92,FOLLOW_92_in_rulegenerate_body8203); 

                            newLeafNode(lv_name_0_0, grammarAccess.getGenerate_bodyAccess().getNameINLINEKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGenerate_bodyRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "INLINE");
                    	    

                    }


                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3535:2: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_WS_3= RULE_WS | this_STRING_4= RULE_STRING | this_ECL_CODE_5= RULE_ECL_CODE | otherlv_6= ';' | otherlv_7= '.' | otherlv_8= '(' | otherlv_9= ')' | otherlv_10= ',' | otherlv_11= ':' | otherlv_12= '=' | otherlv_13= '{' | otherlv_14= '}' | otherlv_15= '-' )*
                    loop58:
                    do {
                        int alt58=16;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            alt58=1;
                            }
                            break;
                        case RULE_INT:
                            {
                            alt58=2;
                            }
                            break;
                        case RULE_WS:
                            {
                            alt58=3;
                            }
                            break;
                        case RULE_STRING:
                            {
                            alt58=4;
                            }
                            break;
                        case RULE_ECL_CODE:
                            {
                            alt58=5;
                            }
                            break;
                        case 20:
                            {
                            alt58=6;
                            }
                            break;
                        case 93:
                            {
                            alt58=7;
                            }
                            break;
                        case 36:
                            {
                            alt58=8;
                            }
                            break;
                        case 37:
                            {
                            alt58=9;
                            }
                            break;
                        case 30:
                            {
                            alt58=10;
                            }
                            break;
                        case 35:
                            {
                            alt58=11;
                            }
                            break;
                        case 31:
                            {
                            alt58=12;
                            }
                            break;
                        case 94:
                            {
                            alt58=13;
                            }
                            break;
                        case 95:
                            {
                            alt58=14;
                            }
                            break;
                        case 96:
                            {
                            alt58=15;
                            }
                            break;

                        }

                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3535:3: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegenerate_body8228); 
                    	     
                    	        newLeafNode(this_ID_1, grammarAccess.getGenerate_bodyAccess().getIDTerminalRuleCall_0_1_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3540:6: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulegenerate_body8244); 
                    	     
                    	        newLeafNode(this_INT_2, grammarAccess.getGenerate_bodyAccess().getINTTerminalRuleCall_0_1_1()); 
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3545:6: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulegenerate_body8260); 
                    	     
                    	        newLeafNode(this_WS_3, grammarAccess.getGenerate_bodyAccess().getWSTerminalRuleCall_0_1_2()); 
                    	        

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3550:6: this_STRING_4= RULE_STRING
                    	    {
                    	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulegenerate_body8276); 
                    	     
                    	        newLeafNode(this_STRING_4, grammarAccess.getGenerate_bodyAccess().getSTRINGTerminalRuleCall_0_1_3()); 
                    	        

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3555:6: this_ECL_CODE_5= RULE_ECL_CODE
                    	    {
                    	    this_ECL_CODE_5=(Token)match(input,RULE_ECL_CODE,FOLLOW_RULE_ECL_CODE_in_rulegenerate_body8292); 
                    	     
                    	        newLeafNode(this_ECL_CODE_5, grammarAccess.getGenerate_bodyAccess().getECL_CODETerminalRuleCall_0_1_4()); 
                    	        

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3560:7: otherlv_6= ';'
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_rulegenerate_body8309); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getGenerate_bodyAccess().getSemicolonKeyword_0_1_5());
                    	        

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3565:7: otherlv_7= '.'
                    	    {
                    	    otherlv_7=(Token)match(input,93,FOLLOW_93_in_rulegenerate_body8327); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getGenerate_bodyAccess().getFullStopKeyword_0_1_6());
                    	        

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3570:7: otherlv_8= '('
                    	    {
                    	    otherlv_8=(Token)match(input,36,FOLLOW_36_in_rulegenerate_body8345); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getGenerate_bodyAccess().getLeftParenthesisKeyword_0_1_7());
                    	        

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3575:7: otherlv_9= ')'
                    	    {
                    	    otherlv_9=(Token)match(input,37,FOLLOW_37_in_rulegenerate_body8363); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getGenerate_bodyAccess().getRightParenthesisKeyword_0_1_8());
                    	        

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3580:7: otherlv_10= ','
                    	    {
                    	    otherlv_10=(Token)match(input,30,FOLLOW_30_in_rulegenerate_body8381); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getGenerate_bodyAccess().getCommaKeyword_0_1_9());
                    	        

                    	    }
                    	    break;
                    	case 11 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3585:7: otherlv_11= ':'
                    	    {
                    	    otherlv_11=(Token)match(input,35,FOLLOW_35_in_rulegenerate_body8399); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getGenerate_bodyAccess().getColonKeyword_0_1_10());
                    	        

                    	    }
                    	    break;
                    	case 12 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3590:7: otherlv_12= '='
                    	    {
                    	    otherlv_12=(Token)match(input,31,FOLLOW_31_in_rulegenerate_body8417); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getGenerate_bodyAccess().getEqualsSignKeyword_0_1_11());
                    	        

                    	    }
                    	    break;
                    	case 13 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3595:7: otherlv_13= '{'
                    	    {
                    	    otherlv_13=(Token)match(input,94,FOLLOW_94_in_rulegenerate_body8435); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getGenerate_bodyAccess().getLeftCurlyBracketKeyword_0_1_12());
                    	        

                    	    }
                    	    break;
                    	case 14 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3600:7: otherlv_14= '}'
                    	    {
                    	    otherlv_14=(Token)match(input,95,FOLLOW_95_in_rulegenerate_body8453); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getGenerate_bodyAccess().getRightCurlyBracketKeyword_0_1_13());
                    	        

                    	    }
                    	    break;
                    	case 15 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3605:7: otherlv_15= '-'
                    	    {
                    	    otherlv_15=(Token)match(input,96,FOLLOW_96_in_rulegenerate_body8471); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getGenerate_bodyAccess().getHyphenMinusKeyword_0_1_14());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3610:6: ( ( (lv_name_16_0= 'SALT' ) ) otherlv_17= '(' this_ID_18= RULE_ID otherlv_19= ')' otherlv_20= ':' (otherlv_21= 'SCOREDSEARCH' | otherlv_22= 'PROFILE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3610:6: ( ( (lv_name_16_0= 'SALT' ) ) otherlv_17= '(' this_ID_18= RULE_ID otherlv_19= ')' otherlv_20= ':' (otherlv_21= 'SCOREDSEARCH' | otherlv_22= 'PROFILE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3610:7: ( (lv_name_16_0= 'SALT' ) ) otherlv_17= '(' this_ID_18= RULE_ID otherlv_19= ')' otherlv_20= ':' (otherlv_21= 'SCOREDSEARCH' | otherlv_22= 'PROFILE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3610:7: ( (lv_name_16_0= 'SALT' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3611:1: (lv_name_16_0= 'SALT' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3611:1: (lv_name_16_0= 'SALT' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3612:3: lv_name_16_0= 'SALT'
                    {
                    lv_name_16_0=(Token)match(input,97,FOLLOW_97_in_rulegenerate_body8499); 

                            newLeafNode(lv_name_16_0, grammarAccess.getGenerate_bodyAccess().getNameSALTKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGenerate_bodyRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_16_0, "SALT");
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,36,FOLLOW_36_in_rulegenerate_body8524); 

                        	newLeafNode(otherlv_17, grammarAccess.getGenerate_bodyAccess().getLeftParenthesisKeyword_1_1());
                        
                    this_ID_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegenerate_body8535); 
                     
                        newLeafNode(this_ID_18, grammarAccess.getGenerate_bodyAccess().getIDTerminalRuleCall_1_2()); 
                        
                    otherlv_19=(Token)match(input,37,FOLLOW_37_in_rulegenerate_body8546); 

                        	newLeafNode(otherlv_19, grammarAccess.getGenerate_bodyAccess().getRightParenthesisKeyword_1_3());
                        
                    otherlv_20=(Token)match(input,35,FOLLOW_35_in_rulegenerate_body8558); 

                        	newLeafNode(otherlv_20, grammarAccess.getGenerate_bodyAccess().getColonKeyword_1_4());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3641:1: (otherlv_21= 'SCOREDSEARCH' | otherlv_22= 'PROFILE' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==98) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==99) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3641:3: otherlv_21= 'SCOREDSEARCH'
                            {
                            otherlv_21=(Token)match(input,98,FOLLOW_98_in_rulegenerate_body8571); 

                                	newLeafNode(otherlv_21, grammarAccess.getGenerate_bodyAccess().getSCOREDSEARCHKeyword_1_5_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3646:7: otherlv_22= 'PROFILE'
                            {
                            otherlv_22=(Token)match(input,99,FOLLOW_99_in_rulegenerate_body8589); 

                                	newLeafNode(otherlv_22, grammarAccess.getGenerate_bodyAccess().getPROFILEKeyword_1_5_1());
                                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3658:1: entryRulevisual_section returns [EObject current=null] : iv_rulevisual_section= rulevisual_section EOF ;
    public final EObject entryRulevisual_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3659:2: (iv_rulevisual_section= rulevisual_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3660:2: iv_rulevisual_section= rulevisual_section EOF
            {
             newCompositeNode(grammarAccess.getVisual_sectionRule()); 
            pushFollow(FOLLOW_rulevisual_section_in_entryRulevisual_section8627);
            iv_rulevisual_section=rulevisual_section();

            state._fsp--;

             current =iv_rulevisual_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_section8637); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3667:1: rulevisual_section returns [EObject current=null] : ( ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END' ) ;
    public final EObject rulevisual_section() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_ID_1=null;
        Token otherlv_4=null;
        EObject lv_vis_ops_2_0 = null;

        EObject lv_vis_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3670:28: ( ( ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3671:1: ( ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3671:1: ( ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3671:2: ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3671:2: ( (lv_name_0_0= 'VISUALIZE' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3672:1: (lv_name_0_0= 'VISUALIZE' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3672:1: (lv_name_0_0= 'VISUALIZE' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3673:3: lv_name_0_0= 'VISUALIZE'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_rulevisual_section8680); 

                    newLeafNode(lv_name_0_0, grammarAccess.getVisual_sectionAccess().getNameVISUALIZEKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVisual_sectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "VISUALIZE");
            	    

            }


            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisual_section8704); 
             
                newLeafNode(this_ID_1, grammarAccess.getVisual_sectionAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3690:1: ( (lv_vis_ops_2_0= rulevisual_section_options ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==35) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3691:1: (lv_vis_ops_2_0= rulevisual_section_options )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3691:1: (lv_vis_ops_2_0= rulevisual_section_options )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3692:3: lv_vis_ops_2_0= rulevisual_section_options
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisual_sectionAccess().getVis_opsVisual_section_optionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevisual_section_options_in_rulevisual_section8724);
                    lv_vis_ops_2_0=rulevisual_section_options();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVisual_sectionRule());
                    	        }
                           		add(
                           			current, 
                           			"vis_ops",
                            		lv_vis_ops_2_0, 
                            		"visual_section_options");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3708:3: ( (lv_vis_elements_3_0= rulevisualization ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=100 && LA62_0<=106)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3709:1: (lv_vis_elements_3_0= rulevisualization )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3709:1: (lv_vis_elements_3_0= rulevisualization )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3710:3: lv_vis_elements_3_0= rulevisualization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVisual_sectionAccess().getVis_elementsVisualizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevisualization_in_rulevisual_section8746);
            	    lv_vis_elements_3_0=rulevisualization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVisual_sectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vis_elements",
            	            		lv_vis_elements_3_0, 
            	            		"visualization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_rulevisual_section8759); 

                	newLeafNode(otherlv_4, grammarAccess.getVisual_sectionAccess().getENDKeyword_4());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3738:1: entryRulevisualization returns [EObject current=null] : iv_rulevisualization= rulevisualization EOF ;
    public final EObject entryRulevisualization() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisualization = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3739:2: (iv_rulevisualization= rulevisualization EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3740:2: iv_rulevisualization= rulevisualization EOF
            {
             newCompositeNode(grammarAccess.getVisualizationRule()); 
            pushFollow(FOLLOW_rulevisualization_in_entryRulevisualization8795);
            iv_rulevisualization=rulevisualization();

            state._fsp--;

             current =iv_rulevisualization; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisualization8805); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3747:1: rulevisualization returns [EObject current=null] : ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= rulevis_basis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' ) ) ;
    public final EObject rulevisualization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_15=null;
        EObject lv_inputs_8_0 = null;

        EObject lv_vis_ops_10_0 = null;

        EObject lv_vis_ops_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3750:28: ( ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= rulevis_basis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3751:1: ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= rulevis_basis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3751:1: ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= rulevis_basis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=100 && LA66_0<=105)) ) {
                alt66=1;
            }
            else if ( (LA66_0==106) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3751:2: ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= rulevis_basis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3751:2: ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= rulevis_basis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3751:3: (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= rulevis_basis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3751:3: (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' )
                    int alt63=6;
                    switch ( input.LA(1) ) {
                    case 100:
                        {
                        alt63=1;
                        }
                        break;
                    case 101:
                        {
                        alt63=2;
                        }
                        break;
                    case 102:
                        {
                        alt63=3;
                        }
                        break;
                    case 103:
                        {
                        alt63=4;
                        }
                        break;
                    case 104:
                        {
                        alt63=5;
                        }
                        break;
                    case 105:
                        {
                        alt63=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }

                    switch (alt63) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3751:5: otherlv_0= 'CHORO'
                            {
                            otherlv_0=(Token)match(input,100,FOLLOW_100_in_rulevisualization8844); 

                                	newLeafNode(otherlv_0, grammarAccess.getVisualizationAccess().getCHOROKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3756:7: otherlv_1= 'LINE'
                            {
                            otherlv_1=(Token)match(input,101,FOLLOW_101_in_rulevisualization8862); 

                                	newLeafNode(otherlv_1, grammarAccess.getVisualizationAccess().getLINEKeyword_0_0_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3761:7: otherlv_2= 'TIMELINE'
                            {
                            otherlv_2=(Token)match(input,102,FOLLOW_102_in_rulevisualization8880); 

                                	newLeafNode(otherlv_2, grammarAccess.getVisualizationAccess().getTIMELINEKeyword_0_0_2());
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3766:7: otherlv_3= 'PIE'
                            {
                            otherlv_3=(Token)match(input,103,FOLLOW_103_in_rulevisualization8898); 

                                	newLeafNode(otherlv_3, grammarAccess.getVisualizationAccess().getPIEKeyword_0_0_3());
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3771:7: otherlv_4= 'BAR'
                            {
                            otherlv_4=(Token)match(input,104,FOLLOW_104_in_rulevisualization8916); 

                                	newLeafNode(otherlv_4, grammarAccess.getVisualizationAccess().getBARKeyword_0_0_4());
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3776:7: otherlv_5= 'TABLE'
                            {
                            otherlv_5=(Token)match(input,105,FOLLOW_105_in_rulevisualization8934); 

                                	newLeafNode(otherlv_5, grammarAccess.getVisualizationAccess().getTABLEKeyword_0_0_5());
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3780:2: ( (lv_name_6_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3781:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3781:1: (lv_name_6_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3782:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisualization8952); 

                    			newLeafNode(lv_name_6_0, grammarAccess.getVisualizationAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisualizationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_rulevisualization8969); 

                        	newLeafNode(otherlv_7, grammarAccess.getVisualizationAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3802:1: ( (lv_inputs_8_0= rulevis_basis ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3803:1: (lv_inputs_8_0= rulevis_basis )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3803:1: (lv_inputs_8_0= rulevis_basis )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3804:3: lv_inputs_8_0= rulevis_basis
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisualizationAccess().getInputsVis_basisParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulevis_basis_in_rulevisualization8990);
                    lv_inputs_8_0=rulevis_basis();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_8_0, 
                            		"vis_basis");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_rulevisualization9002); 

                        	newLeafNode(otherlv_9, grammarAccess.getVisualizationAccess().getRightParenthesisKeyword_0_4());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3824:1: ( (lv_vis_ops_10_0= rulevisual_options ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==35) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3825:1: (lv_vis_ops_10_0= rulevisual_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3825:1: (lv_vis_ops_10_0= rulevisual_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3826:3: lv_vis_ops_10_0= rulevisual_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getVisualizationAccess().getVis_opsVisual_optionsParserRuleCall_0_5_0()); 
                            	    
                            pushFollow(FOLLOW_rulevisual_options_in_rulevisualization9023);
                            lv_vis_ops_10_0=rulevisual_options();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"vis_ops",
                                    		lv_vis_ops_10_0, 
                                    		"visual_options");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_rulevisualization9036); 

                        	newLeafNode(otherlv_11, grammarAccess.getVisualizationAccess().getSemicolonKeyword_0_6());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3847:6: (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3847:6: (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3847:8: otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';'
                    {
                    otherlv_12=(Token)match(input,106,FOLLOW_106_in_rulevisualization9056); 

                        	newLeafNode(otherlv_12, grammarAccess.getVisualizationAccess().getSLIDERKeyword_1_0());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3851:1: ( (lv_name_13_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3852:1: (lv_name_13_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3852:1: (lv_name_13_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3853:3: lv_name_13_0= RULE_ID
                    {
                    lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisualization9073); 

                    			newLeafNode(lv_name_13_0, grammarAccess.getVisualizationAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisualizationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_13_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3869:2: ( (lv_vis_ops_14_0= rulevisual_options ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==35) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3870:1: (lv_vis_ops_14_0= rulevisual_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3870:1: (lv_vis_ops_14_0= rulevisual_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3871:3: lv_vis_ops_14_0= rulevisual_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getVisualizationAccess().getVis_opsVisual_optionsParserRuleCall_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_rulevisual_options_in_rulevisualization9099);
                            lv_vis_ops_14_0=rulevisual_options();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"vis_ops",
                                    		lv_vis_ops_14_0, 
                                    		"visual_options");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,20,FOLLOW_20_in_rulevisualization9112); 

                        	newLeafNode(otherlv_15, grammarAccess.getVisualizationAccess().getSemicolonKeyword_1_3());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3899:1: entryRulevis_basis returns [EObject current=null] : iv_rulevis_basis= rulevis_basis EOF ;
    public final EObject entryRulevis_basis() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevis_basis = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3900:2: (iv_rulevis_basis= rulevis_basis EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3901:2: iv_rulevis_basis= rulevis_basis EOF
            {
             newCompositeNode(grammarAccess.getVis_basisRule()); 
            pushFollow(FOLLOW_rulevis_basis_in_entryRulevis_basis9149);
            iv_rulevis_basis=rulevis_basis();

            state._fsp--;

             current =iv_rulevis_basis; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevis_basis9159); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3908:1: rulevis_basis returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )? ) ;
    public final EObject rulevis_basis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_quals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3911:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3912:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3912:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3912:2: ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )?
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3912:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3913:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3913:1: (otherlv_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3914:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVis_basisRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevis_basis9204); 

            		newLeafNode(otherlv_0, grammarAccess.getVis_basisAccess().getVarsDatasetCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3925:2: ( (lv_quals_1_0= rulevis_basis_qualifiers ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==94) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3926:1: (lv_quals_1_0= rulevis_basis_qualifiers )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3926:1: (lv_quals_1_0= rulevis_basis_qualifiers )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3927:3: lv_quals_1_0= rulevis_basis_qualifiers
                    {
                     
                    	        newCompositeNode(grammarAccess.getVis_basisAccess().getQualsVis_basis_qualifiersParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevis_basis_qualifiers_in_rulevis_basis9225);
                    lv_quals_1_0=rulevis_basis_qualifiers();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVis_basisRule());
                    	        }
                           		add(
                           			current, 
                           			"quals",
                            		lv_quals_1_0, 
                            		"vis_basis_qualifiers");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3951:1: entryRulevis_basis_qualifiers returns [EObject current=null] : iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF ;
    public final EObject entryRulevis_basis_qualifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevis_basis_qualifiers = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3952:2: (iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3953:2: iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF
            {
             newCompositeNode(grammarAccess.getVis_basis_qualifiersRule()); 
            pushFollow(FOLLOW_rulevis_basis_qualifiers_in_entryRulevis_basis_qualifiers9262);
            iv_rulevis_basis_qualifiers=rulevis_basis_qualifiers();

            state._fsp--;

             current =iv_rulevis_basis_qualifiers; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevis_basis_qualifiers9272); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3960:1: rulevis_basis_qualifiers returns [EObject current=null] : (otherlv_0= '{' this_function_1= rulefunction (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}' ) ;
    public final EObject rulevis_basis_qualifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_function_1 = null;

        EObject lv_funcs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3963:28: ( (otherlv_0= '{' this_function_1= rulefunction (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3964:1: (otherlv_0= '{' this_function_1= rulefunction (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3964:1: (otherlv_0= '{' this_function_1= rulefunction (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3964:3: otherlv_0= '{' this_function_1= rulefunction (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_rulevis_basis_qualifiers9309); 

                	newLeafNode(otherlv_0, grammarAccess.getVis_basis_qualifiersAccess().getLeftCurlyBracketKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getVis_basis_qualifiersAccess().getFunctionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulefunction_in_rulevis_basis_qualifiers9331);
            this_function_1=rulefunction();

            state._fsp--;

             
                    current = this_function_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3977:1: (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==30) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3977:3: otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulevis_basis_qualifiers9343); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVis_basis_qualifiersAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3981:1: ( (lv_funcs_3_0= rulefunction ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3982:1: (lv_funcs_3_0= rulefunction )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3982:1: (lv_funcs_3_0= rulefunction )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3983:3: lv_funcs_3_0= rulefunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVis_basis_qualifiersAccess().getFuncsFunctionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulefunction_in_rulevis_basis_qualifiers9364);
            	    lv_funcs_3_0=rulefunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVis_basis_qualifiersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"funcs",
            	            		lv_funcs_3_0, 
            	            		"function");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_4=(Token)match(input,95,FOLLOW_95_in_rulevis_basis_qualifiers9378); 

                	newLeafNode(otherlv_4, grammarAccess.getVis_basis_qualifiersAccess().getRightCurlyBracketKeyword_3());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4011:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4012:2: (iv_rulefunction= rulefunction EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4013:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction9414);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction9424); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4020:1: rulefunction returns [EObject current=null] : (this_value_0= rulevalue | (otherlv_1= 'SUM' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ) | (otherlv_5= 'SCALE' otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ',' this_INT_9= RULE_INT otherlv_10= ')' ) ) ;
    public final EObject rulefunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token this_INT_9=null;
        Token otherlv_10=null;
        EObject this_value_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4023:28: ( (this_value_0= rulevalue | (otherlv_1= 'SUM' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ) | (otherlv_5= 'SCALE' otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ',' this_INT_9= RULE_INT otherlv_10= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4024:1: (this_value_0= rulevalue | (otherlv_1= 'SUM' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ) | (otherlv_5= 'SCALE' otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ',' this_INT_9= RULE_INT otherlv_10= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4024:1: (this_value_0= rulevalue | (otherlv_1= 'SUM' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ) | (otherlv_5= 'SCALE' otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ',' this_INT_9= RULE_INT otherlv_10= ')' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt69=1;
                }
                break;
            case 107:
                {
                alt69=2;
                }
                break;
            case 108:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4025:5: this_value_0= rulevalue
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionAccess().getValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevalue_in_rulefunction9471);
                    this_value_0=rulevalue();

                    state._fsp--;

                     
                            current = this_value_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4034:6: (otherlv_1= 'SUM' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4034:6: (otherlv_1= 'SUM' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4034:8: otherlv_1= 'SUM' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,107,FOLLOW_107_in_rulefunction9489); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getSUMKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_rulefunction9501); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4042:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4043:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4043:1: (lv_name_3_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4044:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction9518); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_rulefunction9535); 

                        	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4065:6: (otherlv_5= 'SCALE' otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ',' this_INT_9= RULE_INT otherlv_10= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4065:6: (otherlv_5= 'SCALE' otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ',' this_INT_9= RULE_INT otherlv_10= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4065:8: otherlv_5= 'SCALE' otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ',' this_INT_9= RULE_INT otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,108,FOLLOW_108_in_rulefunction9555); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getSCALEKeyword_2_0());
                        
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_rulefunction9567); 

                        	newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4073:1: ( (lv_name_7_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4074:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4074:1: (lv_name_7_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4075:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction9584); 

                    			newLeafNode(lv_name_7_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_rulefunction9601); 

                        	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getCommaKeyword_2_3());
                        
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulefunction9612); 
                     
                        newLeafNode(this_INT_9, grammarAccess.getFunctionAccess().getINTTerminalRuleCall_2_4()); 
                        
                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_rulefunction9623); 

                        	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_5());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4111:1: entryRulevisual_section_options returns [EObject current=null] : iv_rulevisual_section_options= rulevisual_section_options EOF ;
    public final EObject entryRulevisual_section_options() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_section_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4112:2: (iv_rulevisual_section_options= rulevisual_section_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4113:2: iv_rulevisual_section_options= rulevisual_section_options EOF
            {
             newCompositeNode(grammarAccess.getVisual_section_optionsRule()); 
            pushFollow(FOLLOW_rulevisual_section_options_in_entryRulevisual_section_options9660);
            iv_rulevisual_section_options=rulevisual_section_options();

            state._fsp--;

             current =iv_rulevisual_section_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_section_options9670); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4120:1: rulevisual_section_options returns [EObject current=null] : (otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )* ) ;
    public final EObject rulevisual_section_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_visual_section_option_1 = null;

        EObject lv_vis_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4123:28: ( (otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4124:1: (otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4124:1: (otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4124:3: otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulevisual_section_options9707); 

                	newLeafNode(otherlv_0, grammarAccess.getVisual_section_optionsAccess().getColonKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getVisual_section_optionsAccess().getVisual_section_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevisual_section_option_in_rulevisual_section_options9729);
            this_visual_section_option_1=rulevisual_section_option();

            state._fsp--;

             
                    current = this_visual_section_option_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4137:1: (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==30) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4137:3: otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulevisual_section_options9741); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVisual_section_optionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4141:1: ( (lv_vis_ops_3_0= rulevisual_section_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4142:1: (lv_vis_ops_3_0= rulevisual_section_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4142:1: (lv_vis_ops_3_0= rulevisual_section_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4143:3: lv_vis_ops_3_0= rulevisual_section_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVisual_section_optionsAccess().getVis_opsVisual_section_optionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevisual_section_option_in_rulevisual_section_options9762);
            	    lv_vis_ops_3_0=rulevisual_section_option();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVisual_section_optionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vis_ops",
            	            		lv_vis_ops_3_0, 
            	            		"visual_section_option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4167:1: entryRulevisual_section_option returns [EObject current=null] : iv_rulevisual_section_option= rulevisual_section_option EOF ;
    public final EObject entryRulevisual_section_option() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_section_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4168:2: (iv_rulevisual_section_option= rulevisual_section_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4169:2: iv_rulevisual_section_option= rulevisual_section_option EOF
            {
             newCompositeNode(grammarAccess.getVisual_section_optionRule()); 
            pushFollow(FOLLOW_rulevisual_section_option_in_entryRulevisual_section_option9800);
            iv_rulevisual_section_option=rulevisual_section_option();

            state._fsp--;

             current =iv_rulevisual_section_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_section_option9810); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4176:1: rulevisual_section_option returns [EObject current=null] : ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')' ) ;
    public final EObject rulevisual_section_option() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4179:28: ( ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4180:1: ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4180:1: ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4180:2: ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4180:2: ( (lv_name_0_0= 'LABEL' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4181:1: (lv_name_0_0= 'LABEL' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4181:1: (lv_name_0_0= 'LABEL' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4182:3: lv_name_0_0= 'LABEL'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_rulevisual_section_option9853); 

                    newLeafNode(lv_name_0_0, grammarAccess.getVisual_section_optionAccess().getNameLABELKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVisual_section_optionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "LABEL");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_rulevisual_section_option9878); 

                	newLeafNode(otherlv_1, grammarAccess.getVisual_section_optionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4199:1: ( (lv_vals_2_0= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4200:1: (lv_vals_2_0= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4200:1: (lv_vals_2_0= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4201:3: lv_vals_2_0= rulevalue
            {
             
            	        newCompositeNode(grammarAccess.getVisual_section_optionAccess().getValsValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_in_rulevisual_section_option9899);
            lv_vals_2_0=rulevalue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVisual_section_optionRule());
            	        }
                   		add(
                   			current, 
                   			"vals",
                    		lv_vals_2_0, 
                    		"value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_rulevisual_section_option9911); 

                	newLeafNode(otherlv_3, grammarAccess.getVisual_section_optionAccess().getRightParenthesisKeyword_3());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4229:1: entryRulevisual_options returns [EObject current=null] : iv_rulevisual_options= rulevisual_options EOF ;
    public final EObject entryRulevisual_options() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4230:2: (iv_rulevisual_options= rulevisual_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4231:2: iv_rulevisual_options= rulevisual_options EOF
            {
             newCompositeNode(grammarAccess.getVisual_optionsRule()); 
            pushFollow(FOLLOW_rulevisual_options_in_entryRulevisual_options9947);
            iv_rulevisual_options=rulevisual_options();

            state._fsp--;

             current =iv_rulevisual_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_options9957); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4238:1: rulevisual_options returns [EObject current=null] : (otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )* ) ;
    public final EObject rulevisual_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_visual_option_1 = null;

        EObject lv_vis_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4241:28: ( (otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4242:1: (otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4242:1: (otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4242:3: otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulevisual_options9994); 

                	newLeafNode(otherlv_0, grammarAccess.getVisual_optionsAccess().getColonKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getVisual_optionsAccess().getVisual_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevisual_option_in_rulevisual_options10016);
            this_visual_option_1=rulevisual_option();

            state._fsp--;

             
                    current = this_visual_option_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4255:1: (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==30) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4255:3: otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulevisual_options10028); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVisual_optionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4259:1: ( (lv_vis_ops_3_0= rulevisual_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4260:1: (lv_vis_ops_3_0= rulevisual_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4260:1: (lv_vis_ops_3_0= rulevisual_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4261:3: lv_vis_ops_3_0= rulevisual_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVisual_optionsAccess().getVis_opsVisual_optionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevisual_option_in_rulevisual_options10049);
            	    lv_vis_ops_3_0=rulevisual_option();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVisual_optionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vis_ops",
            	            		lv_vis_ops_3_0, 
            	            		"visual_option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4285:1: entryRulevisual_option returns [EObject current=null] : iv_rulevisual_option= rulevisual_option EOF ;
    public final EObject entryRulevisual_option() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4286:2: (iv_rulevisual_option= rulevisual_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4287:2: iv_rulevisual_option= rulevisual_option EOF
            {
             newCompositeNode(grammarAccess.getVisual_optionRule()); 
            pushFollow(FOLLOW_rulevisual_option_in_entryRulevisual_option10087);
            iv_rulevisual_option=rulevisual_option();

            state._fsp--;

             current =iv_rulevisual_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_option10097); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4294:1: rulevisual_option returns [EObject current=null] : ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' ) | (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) ) ;
    public final EObject rulevisual_option() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token lv_name_6_0=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token this_ID_19=null;
        Token otherlv_20=null;
        Token this_ID_21=null;
        Token otherlv_22=null;
        EObject lv_funcs_9_0 = null;

        EObject this_visual_multival_11 = null;

        EObject lv_funcs_13_0 = null;

        EObject lv_funcs_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4297:28: ( ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' ) | (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4298:1: ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' ) | (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4298:1: ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' ) | (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) )
            int alt74=3;
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
                alt74=1;
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
                alt74=2;
                }
                break;
            case 116:
                {
                alt74=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4298:2: ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4298:2: ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4298:3: ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4298:3: ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) )
                    int alt72=8;
                    switch ( input.LA(1) ) {
                    case 109:
                        {
                        alt72=1;
                        }
                        break;
                    case 110:
                        {
                        alt72=2;
                        }
                        break;
                    case 13:
                        {
                        alt72=3;
                        }
                        break;
                    case 111:
                        {
                        alt72=4;
                        }
                        break;
                    case 112:
                        {
                        alt72=5;
                        }
                        break;
                    case 113:
                        {
                        alt72=6;
                        }
                        break;
                    case 114:
                        {
                        alt72=7;
                        }
                        break;
                    case 115:
                        {
                        alt72=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }

                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4298:4: ( (lv_name_0_0= 'TITLE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4298:4: ( (lv_name_0_0= 'TITLE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4299:1: (lv_name_0_0= 'TITLE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4299:1: (lv_name_0_0= 'TITLE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4300:3: lv_name_0_0= 'TITLE'
                            {
                            lv_name_0_0=(Token)match(input,109,FOLLOW_109_in_rulevisual_option10142); 

                                    newLeafNode(lv_name_0_0, grammarAccess.getVisual_optionAccess().getNameTITLEKeyword_0_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVisual_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_0_0, "TITLE");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4314:6: ( (lv_name_1_0= 'DATE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4314:6: ( (lv_name_1_0= 'DATE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4315:1: (lv_name_1_0= 'DATE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4315:1: (lv_name_1_0= 'DATE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4316:3: lv_name_1_0= 'DATE'
                            {
                            lv_name_1_0=(Token)match(input,110,FOLLOW_110_in_rulevisual_option10179); 

                                    newLeafNode(lv_name_1_0, grammarAccess.getVisual_optionAccess().getNameDATEKeyword_0_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVisual_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_1_0, "DATE");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4330:6: ( (lv_name_2_0= 'DESCRIPTION' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4330:6: ( (lv_name_2_0= 'DESCRIPTION' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4331:1: (lv_name_2_0= 'DESCRIPTION' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4331:1: (lv_name_2_0= 'DESCRIPTION' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4332:3: lv_name_2_0= 'DESCRIPTION'
                            {
                            lv_name_2_0=(Token)match(input,13,FOLLOW_13_in_rulevisual_option10216); 

                                    newLeafNode(lv_name_2_0, grammarAccess.getVisual_optionAccess().getNameDESCRIPTIONKeyword_0_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVisual_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_0, "DESCRIPTION");
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4346:6: ( (lv_name_3_0= 'PICTURE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4346:6: ( (lv_name_3_0= 'PICTURE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4347:1: (lv_name_3_0= 'PICTURE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4347:1: (lv_name_3_0= 'PICTURE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4348:3: lv_name_3_0= 'PICTURE'
                            {
                            lv_name_3_0=(Token)match(input,111,FOLLOW_111_in_rulevisual_option10253); 

                                    newLeafNode(lv_name_3_0, grammarAccess.getVisual_optionAccess().getNamePICTUREKeyword_0_0_3_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVisual_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_3_0, "PICTURE");
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4362:6: ( (lv_name_4_0= 'STATE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4362:6: ( (lv_name_4_0= 'STATE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4363:1: (lv_name_4_0= 'STATE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4363:1: (lv_name_4_0= 'STATE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4364:3: lv_name_4_0= 'STATE'
                            {
                            lv_name_4_0=(Token)match(input,112,FOLLOW_112_in_rulevisual_option10290); 

                                    newLeafNode(lv_name_4_0, grammarAccess.getVisual_optionAccess().getNameSTATEKeyword_0_0_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVisual_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_4_0, "STATE");
                            	    

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4378:6: ( (lv_name_5_0= 'COUNTY' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4378:6: ( (lv_name_5_0= 'COUNTY' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4379:1: (lv_name_5_0= 'COUNTY' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4379:1: (lv_name_5_0= 'COUNTY' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4380:3: lv_name_5_0= 'COUNTY'
                            {
                            lv_name_5_0=(Token)match(input,113,FOLLOW_113_in_rulevisual_option10327); 

                                    newLeafNode(lv_name_5_0, grammarAccess.getVisual_optionAccess().getNameCOUNTYKeyword_0_0_5_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVisual_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_5_0, "COUNTY");
                            	    

                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4394:6: ( (lv_name_6_0= 'WEIGHT' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4394:6: ( (lv_name_6_0= 'WEIGHT' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4395:1: (lv_name_6_0= 'WEIGHT' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4395:1: (lv_name_6_0= 'WEIGHT' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4396:3: lv_name_6_0= 'WEIGHT'
                            {
                            lv_name_6_0=(Token)match(input,114,FOLLOW_114_in_rulevisual_option10364); 

                                    newLeafNode(lv_name_6_0, grammarAccess.getVisual_optionAccess().getNameWEIGHTKeyword_0_0_6_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVisual_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_6_0, "WEIGHT");
                            	    

                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4410:6: ( (lv_name_7_0= 'SIZE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4410:6: ( (lv_name_7_0= 'SIZE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4411:1: (lv_name_7_0= 'SIZE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4411:1: (lv_name_7_0= 'SIZE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4412:3: lv_name_7_0= 'SIZE'
                            {
                            lv_name_7_0=(Token)match(input,115,FOLLOW_115_in_rulevisual_option10401); 

                                    newLeafNode(lv_name_7_0, grammarAccess.getVisual_optionAccess().getNameSIZEKeyword_0_0_7_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVisual_optionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_7_0, "SIZE");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_rulevisual_option10427); 

                        	newLeafNode(otherlv_8, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4429:1: ( (lv_funcs_9_0= rulefunction ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4430:1: (lv_funcs_9_0= rulefunction )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4430:1: (lv_funcs_9_0= rulefunction )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4431:3: lv_funcs_9_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisual_optionAccess().getFuncsFunctionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_rulevisual_option10448);
                    lv_funcs_9_0=rulefunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVisual_optionRule());
                    	        }
                           		add(
                           			current, 
                           			"funcs",
                            		lv_funcs_9_0, 
                            		"function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_rulevisual_option10460); 

                        	newLeafNode(otherlv_10, grammarAccess.getVisual_optionAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4452:6: (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4452:6: (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4453:5: this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')'
                    {
                     
                            newCompositeNode(grammarAccess.getVisual_optionAccess().getVisual_multivalParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulevisual_multival_in_rulevisual_option10490);
                    this_visual_multival_11=rulevisual_multival();

                    state._fsp--;

                     
                            current = this_visual_multival_11; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_12=(Token)match(input,36,FOLLOW_36_in_rulevisual_option10501); 

                        	newLeafNode(otherlv_12, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4465:1: ( (lv_funcs_13_0= rulefunction ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4466:1: (lv_funcs_13_0= rulefunction )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4466:1: (lv_funcs_13_0= rulefunction )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4467:3: lv_funcs_13_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisual_optionAccess().getFuncsFunctionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_rulevisual_option10522);
                    lv_funcs_13_0=rulefunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVisual_optionRule());
                    	        }
                           		add(
                           			current, 
                           			"funcs",
                            		lv_funcs_13_0, 
                            		"function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4483:2: (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==30) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4483:4: otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) )
                    	    {
                    	    otherlv_14=(Token)match(input,30,FOLLOW_30_in_rulevisual_option10535); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getVisual_optionAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4487:1: ( (lv_funcs_15_0= rulefunction ) )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4488:1: (lv_funcs_15_0= rulefunction )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4488:1: (lv_funcs_15_0= rulefunction )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4489:3: lv_funcs_15_0= rulefunction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVisual_optionAccess().getFuncsFunctionParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulefunction_in_rulevisual_option10556);
                    	    lv_funcs_15_0=rulefunction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVisual_optionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"funcs",
                    	            		lv_funcs_15_0, 
                    	            		"function");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,37,FOLLOW_37_in_rulevisual_option10570); 

                        	newLeafNode(otherlv_16, grammarAccess.getVisual_optionAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4510:6: ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4510:6: ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4510:7: ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4510:7: ( (lv_name_17_0= 'SELECTS' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4511:1: (lv_name_17_0= 'SELECTS' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4511:1: (lv_name_17_0= 'SELECTS' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4512:3: lv_name_17_0= 'SELECTS'
                    {
                    lv_name_17_0=(Token)match(input,116,FOLLOW_116_in_rulevisual_option10596); 

                            newLeafNode(lv_name_17_0, grammarAccess.getVisual_optionAccess().getNameSELECTSKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_17_0, "SELECTS");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_rulevisual_option10621); 

                        	newLeafNode(otherlv_18, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_2_1());
                        
                    this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisual_option10632); 
                     
                        newLeafNode(this_ID_19, grammarAccess.getVisual_optionAccess().getIDTerminalRuleCall_2_2()); 
                        
                    otherlv_20=(Token)match(input,117,FOLLOW_117_in_rulevisual_option10643); 

                        	newLeafNode(otherlv_20, grammarAccess.getVisual_optionAccess().getHyphenMinusGreaterThanSignKeyword_2_3());
                        
                    this_ID_21=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisual_option10654); 
                     
                        newLeafNode(this_ID_21, grammarAccess.getVisual_optionAccess().getIDTerminalRuleCall_2_4()); 
                        
                    otherlv_22=(Token)match(input,37,FOLLOW_37_in_rulevisual_option10665); 

                        	newLeafNode(otherlv_22, grammarAccess.getVisual_optionAccess().getRightParenthesisKeyword_2_5());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4553:1: entryRulevisual_multival returns [EObject current=null] : iv_rulevisual_multival= rulevisual_multival EOF ;
    public final EObject entryRulevisual_multival() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_multival = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4554:2: (iv_rulevisual_multival= rulevisual_multival EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4555:2: iv_rulevisual_multival= rulevisual_multival EOF
            {
             newCompositeNode(grammarAccess.getVisual_multivalRule()); 
            pushFollow(FOLLOW_rulevisual_multival_in_entryRulevisual_multival10702);
            iv_rulevisual_multival=rulevisual_multival();

            state._fsp--;

             current =iv_rulevisual_multival; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_multival10712); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4562:1: rulevisual_multival returns [EObject current=null] : ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) ) ;
    public final EObject rulevisual_multival() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token lv_name_6_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4565:28: ( ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4566:1: ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4566:1: ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) )
            int alt75=7;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt75=1;
                }
                break;
            case 119:
                {
                alt75=2;
                }
                break;
            case 120:
                {
                alt75=3;
                }
                break;
            case 56:
                {
                alt75=4;
                }
                break;
            case 121:
                {
                alt75=5;
                }
                break;
            case 18:
                {
                alt75=6;
                }
                break;
            case 122:
                {
                alt75=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4566:2: ( (lv_name_0_0= 'X' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4566:2: ( (lv_name_0_0= 'X' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4567:1: (lv_name_0_0= 'X' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4567:1: (lv_name_0_0= 'X' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4568:3: lv_name_0_0= 'X'
                    {
                    lv_name_0_0=(Token)match(input,118,FOLLOW_118_in_rulevisual_multival10755); 

                            newLeafNode(lv_name_0_0, grammarAccess.getVisual_multivalAccess().getNameXKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_multivalRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "X");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4582:6: ( (lv_name_1_0= 'Y' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4582:6: ( (lv_name_1_0= 'Y' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4583:1: (lv_name_1_0= 'Y' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4583:1: (lv_name_1_0= 'Y' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4584:3: lv_name_1_0= 'Y'
                    {
                    lv_name_1_0=(Token)match(input,119,FOLLOW_119_in_rulevisual_multival10792); 

                            newLeafNode(lv_name_1_0, grammarAccess.getVisual_multivalAccess().getNameYKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_multivalRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "Y");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4598:6: ( (lv_name_2_0= 'COLOR' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4598:6: ( (lv_name_2_0= 'COLOR' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4599:1: (lv_name_2_0= 'COLOR' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4599:1: (lv_name_2_0= 'COLOR' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4600:3: lv_name_2_0= 'COLOR'
                    {
                    lv_name_2_0=(Token)match(input,120,FOLLOW_120_in_rulevisual_multival10829); 

                            newLeafNode(lv_name_2_0, grammarAccess.getVisual_multivalAccess().getNameCOLORKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_multivalRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "COLOR");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4614:6: ( (lv_name_3_0= 'RANGE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4614:6: ( (lv_name_3_0= 'RANGE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4615:1: (lv_name_3_0= 'RANGE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4615:1: (lv_name_3_0= 'RANGE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4616:3: lv_name_3_0= 'RANGE'
                    {
                    lv_name_3_0=(Token)match(input,56,FOLLOW_56_in_rulevisual_multival10866); 

                            newLeafNode(lv_name_3_0, grammarAccess.getVisual_multivalAccess().getNameRANGEKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_multivalRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "RANGE");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4630:6: ( (lv_name_4_0= 'FILTER' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4630:6: ( (lv_name_4_0= 'FILTER' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4631:1: (lv_name_4_0= 'FILTER' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4631:1: (lv_name_4_0= 'FILTER' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4632:3: lv_name_4_0= 'FILTER'
                    {
                    lv_name_4_0=(Token)match(input,121,FOLLOW_121_in_rulevisual_multival10903); 

                            newLeafNode(lv_name_4_0, grammarAccess.getVisual_multivalAccess().getNameFILTERKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_multivalRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_4_0, "FILTER");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4646:6: ( (lv_name_5_0= 'LABEL' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4646:6: ( (lv_name_5_0= 'LABEL' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4647:1: (lv_name_5_0= 'LABEL' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4647:1: (lv_name_5_0= 'LABEL' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4648:3: lv_name_5_0= 'LABEL'
                    {
                    lv_name_5_0=(Token)match(input,18,FOLLOW_18_in_rulevisual_multival10940); 

                            newLeafNode(lv_name_5_0, grammarAccess.getVisual_multivalAccess().getNameLABELKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_multivalRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_5_0, "LABEL");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4662:6: ( (lv_name_6_0= 'VALUE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4662:6: ( (lv_name_6_0= 'VALUE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4663:1: (lv_name_6_0= 'VALUE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4663:1: (lv_name_6_0= 'VALUE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4664:3: lv_name_6_0= 'VALUE'
                    {
                    lv_name_6_0=(Token)match(input,122,FOLLOW_122_in_rulevisual_multival10977); 

                            newLeafNode(lv_name_6_0, grammarAccess.getVisual_multivalAccess().getNameVALUEKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_multivalRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_6_0, "VALUE");
                    	    

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
    // $ANTLR end "rulevisual_multival"


    // $ANTLR start "entryRulecustom_section"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4685:1: entryRulecustom_section returns [EObject current=null] : iv_rulecustom_section= rulecustom_section EOF ;
    public final EObject entryRulecustom_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecustom_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4686:2: (iv_rulecustom_section= rulecustom_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4687:2: iv_rulecustom_section= rulecustom_section EOF
            {
             newCompositeNode(grammarAccess.getCustom_sectionRule()); 
            pushFollow(FOLLOW_rulecustom_section_in_entryRulecustom_section11026);
            iv_rulecustom_section=rulecustom_section();

            state._fsp--;

             current =iv_rulecustom_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecustom_section11036); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4694:1: rulecustom_section returns [EObject current=null] : ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END' ) ;
    public final EObject rulecustom_section() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_cust_vals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4697:28: ( ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4698:1: ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4698:1: ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4698:2: ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4698:2: ( (lv_name_0_0= 'CUSTOM' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4699:1: (lv_name_0_0= 'CUSTOM' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4699:1: (lv_name_0_0= 'CUSTOM' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4700:3: lv_name_0_0= 'CUSTOM'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_rulecustom_section11079); 

                    newLeafNode(lv_name_0_0, grammarAccess.getCustom_sectionAccess().getNameCUSTOMKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustom_sectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "CUSTOM");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4713:2: ( (lv_cust_vals_1_0= rulecustom_value ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4714:1: (lv_cust_vals_1_0= rulecustom_value )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4714:1: (lv_cust_vals_1_0= rulecustom_value )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4715:3: lv_cust_vals_1_0= rulecustom_value
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustom_sectionAccess().getCust_valsCustom_valueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecustom_value_in_rulecustom_section11113);
            	    lv_cust_vals_1_0=rulecustom_value();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustom_sectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cust_vals",
            	            		lv_cust_vals_1_0, 
            	            		"custom_value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulecustom_section11126); 

                	newLeafNode(otherlv_2, grammarAccess.getCustom_sectionAccess().getENDKeyword_2());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4743:1: entryRulecustom_value returns [EObject current=null] : iv_rulecustom_value= rulecustom_value EOF ;
    public final EObject entryRulecustom_value() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecustom_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4744:2: (iv_rulecustom_value= rulecustom_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4745:2: iv_rulecustom_value= rulecustom_value EOF
            {
             newCompositeNode(grammarAccess.getCustom_valueRule()); 
            pushFollow(FOLLOW_rulecustom_value_in_entryRulecustom_value11162);
            iv_rulecustom_value=rulecustom_value();

            state._fsp--;

             current =iv_rulecustom_value; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecustom_value11172); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4752:1: rulecustom_value returns [EObject current=null] : (this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';' ) ;
    public final EObject rulecustom_value() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_2=null;
        EObject this_value_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4755:28: ( (this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4756:1: (this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4756:1: (this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4756:2: this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecustom_value11208); 
             
                newLeafNode(this_ID_0, grammarAccess.getCustom_valueAccess().getIDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getCustom_valueAccess().getValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevalue_in_rulecustom_value11229);
            this_value_1=rulevalue();

            state._fsp--;

             
                    current = this_value_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulecustom_value11240); 

                	newLeafNode(otherlv_2, grammarAccess.getCustom_valueAccess().getSemicolonKeyword_2());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4781:1: entryRuleresource_option returns [EObject current=null] : iv_ruleresource_option= ruleresource_option EOF ;
    public final EObject entryRuleresource_option() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresource_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4782:2: (iv_ruleresource_option= ruleresource_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4783:2: iv_ruleresource_option= ruleresource_option EOF
            {
             newCompositeNode(grammarAccess.getResource_optionRule()); 
            pushFollow(FOLLOW_ruleresource_option_in_entryRuleresource_option11276);
            iv_ruleresource_option=ruleresource_option();

            state._fsp--;

             current =iv_ruleresource_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_option11286); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4790:1: ruleresource_option returns [EObject current=null] : ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')' ) ;
    public final EObject ruleresource_option() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_vals_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4793:28: ( ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4794:1: ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4794:1: ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4794:2: ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4794:2: ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt77=1;
                }
                break;
            case 123:
                {
                alt77=2;
                }
                break;
            case 18:
                {
                alt77=3;
                }
                break;
            case 63:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4794:3: ( (lv_name_0_0= 'DESCRIPTION' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4794:3: ( (lv_name_0_0= 'DESCRIPTION' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4795:1: (lv_name_0_0= 'DESCRIPTION' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4795:1: (lv_name_0_0= 'DESCRIPTION' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4796:3: lv_name_0_0= 'DESCRIPTION'
                    {
                    lv_name_0_0=(Token)match(input,13,FOLLOW_13_in_ruleresource_option11330); 

                            newLeafNode(lv_name_0_0, grammarAccess.getResource_optionAccess().getNameDESCRIPTIONKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResource_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "DESCRIPTION");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4810:6: ( (lv_name_1_0= 'FILE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4810:6: ( (lv_name_1_0= 'FILE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4811:1: (lv_name_1_0= 'FILE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4811:1: (lv_name_1_0= 'FILE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4812:3: lv_name_1_0= 'FILE'
                    {
                    lv_name_1_0=(Token)match(input,123,FOLLOW_123_in_ruleresource_option11367); 

                            newLeafNode(lv_name_1_0, grammarAccess.getResource_optionAccess().getNameFILEKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResource_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "FILE");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4826:6: ( (lv_name_2_0= 'LABEL' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4826:6: ( (lv_name_2_0= 'LABEL' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4827:1: (lv_name_2_0= 'LABEL' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4827:1: (lv_name_2_0= 'LABEL' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4828:3: lv_name_2_0= 'LABEL'
                    {
                    lv_name_2_0=(Token)match(input,18,FOLLOW_18_in_ruleresource_option11404); 

                            newLeafNode(lv_name_2_0, grammarAccess.getResource_optionAccess().getNameLABELKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResource_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "LABEL");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4842:6: ( (lv_name_3_0= '_HTML_STYLECLASS' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4842:6: ( (lv_name_3_0= '_HTML_STYLECLASS' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4843:1: (lv_name_3_0= '_HTML_STYLECLASS' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4843:1: (lv_name_3_0= '_HTML_STYLECLASS' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4844:3: lv_name_3_0= '_HTML_STYLECLASS'
                    {
                    lv_name_3_0=(Token)match(input,63,FOLLOW_63_in_ruleresource_option11441); 

                            newLeafNode(lv_name_3_0, grammarAccess.getResource_optionAccess().getName_HTML_STYLECLASSKeyword_0_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResource_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "_HTML_STYLECLASS");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleresource_option11467); 

                	newLeafNode(otherlv_4, grammarAccess.getResource_optionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4861:1: ( (lv_vals_5_0= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4862:1: (lv_vals_5_0= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4862:1: (lv_vals_5_0= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4863:3: lv_vals_5_0= rulevalue
            {
             
            	        newCompositeNode(grammarAccess.getResource_optionAccess().getValsValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_in_ruleresource_option11488);
            lv_vals_5_0=rulevalue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResource_optionRule());
            	        }
                   		add(
                   			current, 
                   			"vals",
                    		lv_vals_5_0, 
                    		"value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleresource_option11500); 

                	newLeafNode(otherlv_6, grammarAccess.getResource_optionAccess().getRightParenthesisKeyword_3());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4891:1: entryRuleresource_options returns [EObject current=null] : iv_ruleresource_options= ruleresource_options EOF ;
    public final EObject entryRuleresource_options() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresource_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4892:2: (iv_ruleresource_options= ruleresource_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4893:2: iv_ruleresource_options= ruleresource_options EOF
            {
             newCompositeNode(grammarAccess.getResource_optionsRule()); 
            pushFollow(FOLLOW_ruleresource_options_in_entryRuleresource_options11536);
            iv_ruleresource_options=ruleresource_options();

            state._fsp--;

             current =iv_ruleresource_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_options11546); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4900:1: ruleresource_options returns [EObject current=null] : (this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )* ) ;
    public final EObject ruleresource_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_resource_option_0 = null;

        EObject lv_res_ops_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4903:28: ( (this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4904:1: (this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4904:1: (this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4905:5: this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getResource_optionsAccess().getResource_optionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleresource_option_in_ruleresource_options11593);
            this_resource_option_0=ruleresource_option();

            state._fsp--;

             
                    current = this_resource_option_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4913:1: (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==30) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4913:3: otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleresource_options11605); 

            	        	newLeafNode(otherlv_1, grammarAccess.getResource_optionsAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4917:1: ( (lv_res_ops_2_0= ruleresource_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4918:1: (lv_res_ops_2_0= ruleresource_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4918:1: (lv_res_ops_2_0= ruleresource_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4919:3: lv_res_ops_2_0= ruleresource_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResource_optionsAccess().getRes_opsResource_optionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleresource_option_in_ruleresource_options11626);
            	    lv_res_ops_2_0=ruleresource_option();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResource_optionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"res_ops",
            	            		lv_res_ops_2_0, 
            	            		"resource_option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4943:1: entryRuleresource_value returns [EObject current=null] : iv_ruleresource_value= ruleresource_value EOF ;
    public final EObject entryRuleresource_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresource_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4944:2: (iv_ruleresource_value= ruleresource_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4945:2: iv_ruleresource_value= ruleresource_value EOF
            {
             newCompositeNode(grammarAccess.getResource_valueRule()); 
            pushFollow(FOLLOW_ruleresource_value_in_entryRuleresource_value11664);
            iv_ruleresource_value=ruleresource_value();

            state._fsp--;

             current =iv_ruleresource_value; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_value11674); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4952:1: ruleresource_value returns [EObject current=null] : (this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';' ) ;
    public final EObject ruleresource_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_value_0 = null;

        EObject lv_res_ops_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4955:28: ( (this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4956:1: (this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4956:1: (this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4957:5: this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';'
            {
             
                    newCompositeNode(grammarAccess.getResource_valueAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevalue_in_ruleresource_value11721);
            this_value_0=rulevalue();

            state._fsp--;

             
                    current = this_value_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleresource_value11732); 

                	newLeafNode(otherlv_1, grammarAccess.getResource_valueAccess().getColonKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4969:1: ( (lv_res_ops_2_0= ruleresource_options ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==13||LA79_0==18||LA79_0==63||LA79_0==123) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4970:1: (lv_res_ops_2_0= ruleresource_options )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4970:1: (lv_res_ops_2_0= ruleresource_options )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4971:3: lv_res_ops_2_0= ruleresource_options
                    {
                     
                    	        newCompositeNode(grammarAccess.getResource_valueAccess().getRes_opsResource_optionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleresource_options_in_ruleresource_value11753);
                    lv_res_ops_2_0=ruleresource_options();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResource_valueRule());
                    	        }
                           		add(
                           			current, 
                           			"res_ops",
                            		lv_res_ops_2_0, 
                            		"resource_options");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleresource_value11766); 

                	newLeafNode(otherlv_3, grammarAccess.getResource_valueAccess().getSemicolonKeyword_3());
                

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4999:1: entryRuleresource_section returns [EObject current=null] : iv_ruleresource_section= ruleresource_section EOF ;
    public final EObject entryRuleresource_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresource_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5000:2: (iv_ruleresource_section= ruleresource_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5001:2: iv_ruleresource_section= ruleresource_section EOF
            {
             newCompositeNode(grammarAccess.getResource_sectionRule()); 
            pushFollow(FOLLOW_ruleresource_section_in_entryRuleresource_section11802);
            iv_ruleresource_section=ruleresource_section();

            state._fsp--;

             current =iv_ruleresource_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_section11812); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5008:1: ruleresource_section returns [EObject current=null] : ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END' ) ;
    public final EObject ruleresource_section() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_res_vals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5011:28: ( ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5012:1: ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5012:1: ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5012:2: ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5012:2: ( (lv_name_0_0= 'RESOURCES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5013:1: (lv_name_0_0= 'RESOURCES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5013:1: (lv_name_0_0= 'RESOURCES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5014:3: lv_name_0_0= 'RESOURCES'
            {
            lv_name_0_0=(Token)match(input,124,FOLLOW_124_in_ruleresource_section11855); 

                    newLeafNode(lv_name_0_0, grammarAccess.getResource_sectionAccess().getNameRESOURCESKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResource_sectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "RESOURCES");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5027:2: ( (lv_res_vals_1_0= ruleresource_value ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=RULE_ID && LA80_0<=RULE_STRING)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5028:1: (lv_res_vals_1_0= ruleresource_value )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5028:1: (lv_res_vals_1_0= ruleresource_value )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5029:3: lv_res_vals_1_0= ruleresource_value
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResource_sectionAccess().getRes_valsResource_valueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleresource_value_in_ruleresource_section11889);
            	    lv_res_vals_1_0=ruleresource_value();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResource_sectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"res_vals",
            	            		lv_res_vals_1_0, 
            	            		"resource_value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleresource_section11902); 

                	newLeafNode(otherlv_2, grammarAccess.getResource_sectionAccess().getENDKeyword_2());
                

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
    protected DFA57 dfa57 = new DFA57(this);
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
            return "1460:1: ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) )";
        }
    }
    static final String DFA57_eotS =
        "\51\uffff";
    static final String DFA57_eofS =
        "\51\uffff";
    static final String DFA57_minS =
        "\1\4\1\uffff\1\4\1\24\1\4\1\15\2\uffff\1\45\5\24\2\44\1\24\1\15\2\4\5\24\2\44\4\45\2\4\2\24\4\45\2\24";
    static final String DFA57_maxS =
        "\1\131\1\uffff\1\4\1\122\1\4\1\130\2\uffff\1\45\5\122\2\44\1\122\1\130\1\4\1\6\5\122\2\44\4\45\1\4\1\6\2\122\4\45\2\122";
    static final String DFA57_acceptS =
        "\1\uffff\1\1\4\uffff\1\3\1\2\41\uffff";
    static final String DFA57_specialS =
        "\51\uffff}>";
    static final String[] DFA57_transitionS = {
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3250:1: ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleoutput_options ) )? otherlv_2= ';' ) | (this_dataset_3= ruledataset ( (lv_out_base_4_0= ruleoutputbase ) )? ( (lv_ops_5_0= ruleoutput_options ) )? ( (lv_ecl_vars_6_0= ruleecloutput_decl ) )* otherlv_7= 'END' ) | (this_dataset_8= ruledataset ( (lv_op_base_9_0= ruleoutputbase ) )? ( (lv_ops_10_0= ruleoutput_options ) )? otherlv_11= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomposition_header_in_ruleprogram131 = new BitSet(new long[]{0x00000000002FF000L});
    public static final BitSet FOLLOW_rulebase_prop_in_ruleprogram153 = new BitSet(new long[]{0x00000104182FF002L,0x1000000004002000L});
    public static final BitSet FOLLOW_rulecontract_instance_in_ruleprogram175 = new BitSet(new long[]{0x0000010418000002L,0x1000000004002000L});
    public static final BitSet FOLLOW_ruleinput_section_in_ruleprogram197 = new BitSet(new long[]{0x0000000018000002L,0x1000000004002000L});
    public static final BitSet FOLLOW_ruleoutput_section_in_ruleprogram219 = new BitSet(new long[]{0x0000000018000002L,0x1000000004000000L});
    public static final BitSet FOLLOW_rulevisual_section_in_ruleprogram241 = new BitSet(new long[]{0x0000000018000002L,0x1000000004000000L});
    public static final BitSet FOLLOW_rulegenerate_section_in_ruleprogram263 = new BitSet(new long[]{0x0000000008000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_rulecustom_section_in_ruleprogram285 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleresource_section_in_ruleprogram307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebase_prop_in_entryRulebase_prop344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebase_prop354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulebase_prop399 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_13_in_rulebase_prop436 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14_in_rulebase_prop473 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_15_in_rulebase_prop510 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_16_in_rulebase_prop547 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_17_in_rulebase_prop584 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_18_in_rulebase_prop621 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_19_in_rulebase_prop658 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_rulebase_prop693 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulebase_prop705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulebase_prop731 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_rulecategory_type_list_in_rulebase_prop765 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulebase_prop777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecategory_type_in_entryRulecategory_type815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecategory_type826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulecategory_type864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulecategory_type883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulecategory_type902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulecategory_type921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulecategory_type940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulecategory_type959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulecategory_type978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulecategory_type997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecategory_type_list_in_entryRulecategory_type_list1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecategory_type_list1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecategory_type_in_rulecategory_type_list1093 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulecategory_type_list1106 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_rulecategory_type_in_rulecategory_type_list1122 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulevalue_in_entryRulevalue1159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevalue1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulevalue1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulevalue1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_list_in_entryRulevalue_list1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue_list1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_rulevalue_list1365 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevalue_list1377 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulevalue_list1398 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleassign_in_entryRuleassign1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassign1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_ruleassign1495 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleassign1506 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleassign1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassign_list_in_entryRuleassign_list1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassign_list1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassign_in_ruleassign_list1620 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleassign_list1632 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleassign_in_ruleassign_list1653 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulecomposition_header_in_entryRulecomposition_header1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomposition_header1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulecomposition_header1744 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleassign_in_rulecomposition_header1778 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_33_in_rulecomposition_header1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontract_instance_in_entryRulecontract_instance1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecontract_instance1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulecontract_instance1880 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecontract_instance1905 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulecontract_instance1916 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulecontract_instance1939 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulecontract_instance1951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecontract_instance1971 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulecontract_instance1983 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleassign_in_rulecontract_instance2004 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_33_in_rulecontract_instance2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_decl_in_entryRulefield_decl2053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_decl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulefield_decl2100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefield_decl2117 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleinput_options_in_rulefield_decl2143 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulefield_decl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenum_decl_in_entryRuleenum_decl2192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenum_decl2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleenum_decl2245 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleenum_decl2270 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleenum_decl2292 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleassign_list_in_ruleenum_decl2319 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleenum_decl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinput_section_in_entryRuleinput_section2368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_section2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleinput_section2421 = new BitSet(new long[]{0x00007E8000000000L});
    public static final BitSet FOLLOW_ruleinput_value_in_ruleinput_section2455 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_33_in_ruleinput_section2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_entryRulebool2504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebool2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulebool2551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebool2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleint_var_in_entryRuleint_var2609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleint_var2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleint_var2656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleint_var2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestring_var_in_entryRulestring_var2714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestring_var2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulestring_var2761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestring_var2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_in_entryRulerecord2819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulerecord2866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulerecord2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledataset_in_entryRuledataset2924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledataset2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruledataset2971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledataset2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_entryRulegroup3029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulegroup3076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegroup3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinput_value_in_entryRuleinput_value3136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_value3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_ruleinput_value3195 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleint_var_in_ruleinput_value3222 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleenum_decl_in_ruleinput_value3249 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulestring_var_in_ruleinput_value3276 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulerecord_in_ruleinput_value3303 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruledataset_in_ruleinput_value3330 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value3351 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleinput_value3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledataset_in_ruleinput_value3394 = new BitSet(new long[]{0x0000004A00000000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value3414 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rulefield_decl_in_ruleinput_value3436 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_33_in_ruleinput_value3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_ruleinput_value3479 = new BitSet(new long[]{0x00007E8A00000000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value3499 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_ruleinput_value_in_ruleinput_value3521 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_33_in_ruleinput_value3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinput_options_in_entryRuleinput_options3571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_options3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleinput_options3618 = new BitSet(new long[]{0xFFFF800000042000L});
    public static final BitSet FOLLOW_ruleinput_option_in_ruleinput_options3640 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleinput_options3652 = new BitSet(new long[]{0xFFFF800000042000L});
    public static final BitSet FOLLOW_ruleinput_option_in_ruleinput_options3673 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleinput_option_in_entryRuleinput_option3711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_option3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleinput_option3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleinput_option3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleinput_option3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleinput_option3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleinput_option3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleinput_option3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleinput_option3989 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option4014 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleformfield_option_in_ruleinput_option4030 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleinput_option4067 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option4092 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleassign_list_in_ruleinput_option4113 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleinput_option4151 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option4176 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleinputtype_options_in_ruleinput_option4192 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleinput_option4230 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_57_in_ruleinput_option4267 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_58_in_ruleinput_option4304 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_49_in_ruleinput_option4341 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13_in_ruleinput_option4378 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_59_in_ruleinput_option4415 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_60_in_ruleinput_option4452 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_61_in_ruleinput_option4489 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_62_in_ruleinput_option4526 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63_in_ruleinput_option4563 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleinput_option4600 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option4626 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleinput_option4647 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformfield_option_in_entryRuleformfield_option4697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformfield_option4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleformfield_option4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleformfield_option4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleformfield_option4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleformfield_option4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleformfield_option4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleformfield_option4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleformfield_option4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_entryRuleinputtype_option4901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputtype_option4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleinputtype_option4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleinputtype_option4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleinputtype_option4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleinputtype_option5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleinputtype_option5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleinputtype_option5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleinputtype_option5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_options_in_entryRuleinputtype_options5105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputtype_options5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_ruleinputtype_options5163 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleinputtype_options5182 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_ruleinputtype_options5204 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleoutput_section_in_entryRuleoutput_section5251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_section5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleoutput_section5304 = new BitSet(new long[]{0x00003E8000000070L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleoutput_value_in_ruleoutput_section5338 = new BitSet(new long[]{0x00003E8200000070L,0x0000000002000000L});
    public static final BitSet FOLLOW_33_in_ruleoutput_section5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_integer_in_entryRuleecl_integer5389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_integer5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleecl_integer5436 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_integer5448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_integer5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_unsigned_in_entryRuleecl_unsigned5507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_unsigned5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleecl_unsigned5554 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_unsigned5566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_unsigned5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_string_in_entryRuleecl_string5625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_string5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleecl_string5672 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_string5684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_string5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_qstring_in_entryRuleecl_qstring5743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_qstring5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleecl_qstring5790 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_qstring5802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_qstring5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_varstring_in_entryRuleecl_varstring5861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_varstring5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleecl_varstring5908 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_varstring5920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_varstring5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_unicode_in_entryRuleecl_unicode5979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_unicode5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleecl_unicode6026 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_unicode6038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_unicode6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_varunicode_in_entryRuleecl_varunicode6097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_varunicode6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleecl_varunicode6144 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_varunicode6156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_varunicode6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_data_in_entryRuleecl_data6215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_data6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleecl_data6262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_data6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_real_in_entryRuleecl_real6320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_real6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleecl_real6367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_real6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeclfield_type_in_entryRuleeclfield_type6425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeclfield_type6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_integer_in_ruleeclfield_type6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_qstring_in_ruleeclfield_type6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_string_in_ruleeclfield_type6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_real_in_ruleeclfield_type6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_unicode_in_ruleeclfield_type6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_data_in_ruleeclfield_type6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_varstring_in_ruleeclfield_type6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_varunicode_in_ruleeclfield_type6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_unsigned_in_ruleeclfield_type6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecloutput_decl_in_entryRuleecloutput_decl6733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecloutput_decl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeclfield_type_in_ruleecloutput_decl6790 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleoutput_options_in_ruleecloutput_decl6810 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleecloutput_decl6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutput_option_in_entryRuleoutput_option6859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_option6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleoutput_option6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleoutput_option6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleoutput_option6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleoutput_option7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleoutput_option7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleoutput_option7100 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleoutput_option7125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleoutput_option7145 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleoutput_option7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleoutput_option7183 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleoutput_option7208 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleoutput_option7229 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleoutput_option7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutput_options_in_entryRuleoutput_options7278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_options7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleoutput_options7325 = new BitSet(new long[]{0x0000000000002000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleoutput_option_in_ruleoutput_options7347 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleoutput_options7359 = new BitSet(new long[]{0x0000000000002000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleoutput_option_in_ruleoutput_options7380 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleout_type_in_entryRuleout_type7418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleout_type7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleout_type7466 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_42_in_ruleout_type7484 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_43_in_ruleout_type7502 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_89_in_ruleout_type7520 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleout_type7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutput_value_in_entryRuleoutput_value7579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_value7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleout_type_in_ruleoutput_value7637 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleoutput_options_in_ruleoutput_value7657 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleoutput_value7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledataset_in_ruleoutput_value7700 = new BitSet(new long[]{0x0000081A00000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_ruleoutputbase_in_ruleoutput_value7720 = new BitSet(new long[]{0x0000080A00000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_ruleoutput_options_in_ruleoutput_value7742 = new BitSet(new long[]{0x0000080200000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_ruleecloutput_decl_in_ruleoutput_value7764 = new BitSet(new long[]{0x0000080200000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_33_in_ruleoutput_value7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledataset_in_ruleoutput_value7807 = new BitSet(new long[]{0x0000001800100000L});
    public static final BitSet FOLLOW_ruleoutputbase_in_ruleoutput_value7827 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleoutput_options_in_ruleoutput_value7849 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleoutput_value7862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutputbase_in_entryRuleoutputbase7899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutputbase7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleoutputbase7946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleoutputbase7966 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleoutputbase7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_section_in_entryRulegenerate_section8014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_section8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulegenerate_section8067 = new BitSet(new long[]{0x0000000000000000L,0x0000000210000000L});
    public static final BitSet FOLLOW_rulegenerate_body_in_rulegenerate_section8101 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_rulegenerate_section8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_body_in_entryRulegenerate_body8149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_body8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulegenerate_body8203 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegenerate_body8228 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_RULE_INT_in_rulegenerate_body8244 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_RULE_WS_in_rulegenerate_body8260 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulegenerate_body8276 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_RULE_ECL_CODE_in_rulegenerate_body8292 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_20_in_rulegenerate_body8309 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_93_in_rulegenerate_body8327 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_36_in_rulegenerate_body8345 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_37_in_rulegenerate_body8363 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_30_in_rulegenerate_body8381 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_35_in_rulegenerate_body8399 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_31_in_rulegenerate_body8417 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_94_in_rulegenerate_body8435 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_95_in_rulegenerate_body8453 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_96_in_rulegenerate_body8471 = new BitSet(new long[]{0x00000038C01001F2L,0x00000001E0000000L});
    public static final BitSet FOLLOW_97_in_rulegenerate_body8499 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulegenerate_body8524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegenerate_body8535 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulegenerate_body8546 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulegenerate_body8558 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_rulegenerate_body8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rulegenerate_body8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_section_in_entryRulevisual_section8627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_section8637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulevisual_section8680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisual_section8704 = new BitSet(new long[]{0x0000000800000000L,0x000007F000000000L});
    public static final BitSet FOLLOW_rulevisual_section_options_in_rulevisual_section8724 = new BitSet(new long[]{0x0000000800000000L,0x000007F000000000L});
    public static final BitSet FOLLOW_rulevisualization_in_rulevisual_section8746 = new BitSet(new long[]{0x0000000A00000000L,0x000007F000000000L});
    public static final BitSet FOLLOW_33_in_rulevisual_section8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisualization_in_entryRulevisualization8795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisualization8805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rulevisualization8844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_101_in_rulevisualization8862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_102_in_rulevisualization8880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_103_in_rulevisualization8898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_104_in_rulevisualization8916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_105_in_rulevisualization8934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisualization8952 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisualization8969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulevis_basis_in_rulevisualization8990 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisualization9002 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulevisual_options_in_rulevisualization9023 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulevisualization9036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rulevisualization9056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisualization9073 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulevisual_options_in_rulevisualization9099 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulevisualization9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevis_basis_in_entryRulevis_basis9149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevis_basis9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevis_basis9204 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_rulevis_basis_qualifiers_in_rulevis_basis9225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevis_basis_qualifiers_in_entryRulevis_basis_qualifiers9262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevis_basis_qualifiers9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulevis_basis_qualifiers9309 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevis_basis_qualifiers9331 = new BitSet(new long[]{0x0000000040000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_rulevis_basis_qualifiers9343 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevis_basis_qualifiers9364 = new BitSet(new long[]{0x0000000040000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_rulevis_basis_qualifiers9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction9414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_rulefunction9471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rulefunction9489 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunction9501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction9518 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rulefunction9555 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunction9567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction9584 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulefunction9601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulefunction9612 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_section_options_in_entryRulevisual_section_options9660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_section_options9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulevisual_section_options9707 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_rulevisual_section_options9729 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevisual_section_options9741 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_rulevisual_section_options9762 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_entryRulevisual_section_option9800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_section_option9810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulevisual_section_option9853 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_section_option9878 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulevisual_section_option9899 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_section_option9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_options_in_entryRulevisual_options9947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_options9957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulevisual_options9994 = new BitSet(new long[]{0x0100000000042000L,0x07DFE00000000000L});
    public static final BitSet FOLLOW_rulevisual_option_in_rulevisual_options10016 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevisual_options10028 = new BitSet(new long[]{0x0100000000042000L,0x07DFE00000000000L});
    public static final BitSet FOLLOW_rulevisual_option_in_rulevisual_options10049 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulevisual_option_in_entryRulevisual_option10087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_option10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rulevisual_option10142 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_110_in_rulevisual_option10179 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13_in_rulevisual_option10216 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_111_in_rulevisual_option10253 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_112_in_rulevisual_option10290 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_113_in_rulevisual_option10327 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_114_in_rulevisual_option10364 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_115_in_rulevisual_option10401 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option10427 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option10448 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option10460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_multival_in_rulevisual_option10490 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option10501 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option10522 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_30_in_rulevisual_option10535 = new BitSet(new long[]{0x0000000000000070L,0x0000180000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option10556 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option10570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rulevisual_option10596 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option10621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisual_option10632 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_rulevisual_option10643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisual_option10654 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option10665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_multival_in_entryRulevisual_multival10702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_multival10712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_rulevisual_multival10755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_rulevisual_multival10792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_rulevisual_multival10829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulevisual_multival10866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_rulevisual_multival10903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulevisual_multival10940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_rulevisual_multival10977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecustom_section_in_entryRulecustom_section11026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecustom_section11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulecustom_section11079 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rulecustom_value_in_rulecustom_section11113 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_rulecustom_section11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecustom_value_in_entryRulecustom_value11162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecustom_value11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecustom_value11208 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulecustom_value11229 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulecustom_value11240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_option_in_entryRuleresource_option11276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_option11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleresource_option11330 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_123_in_ruleresource_option11367 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleresource_option11404 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63_in_ruleresource_option11441 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleresource_option11467 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleresource_option11488 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleresource_option11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_options_in_entryRuleresource_options11536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_options11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_option_in_ruleresource_options11593 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleresource_options11605 = new BitSet(new long[]{0x8000000000042000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleresource_option_in_ruleresource_options11626 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleresource_value_in_entryRuleresource_value11664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_value11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_ruleresource_value11721 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleresource_value11732 = new BitSet(new long[]{0x8000000000142000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleresource_options_in_ruleresource_value11753 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleresource_value11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_section_in_entryRuleresource_section11802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_section11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleresource_section11855 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleresource_value_in_ruleresource_section11889 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_33_in_ruleresource_section11902 = new BitSet(new long[]{0x0000000000000002L});

}