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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_GEN_BLOCK", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'NAME'", "'DESCRIPTION'", "'AUTHOR'", "'LICENSE'", "'COPYRIGHT'", "'VERSION'", "'LABEL'", "'ID'", "';'", "'CATEGORY'", "'CLEAN'", "'INPUT'", "'APPEND'", "'LINK'", "'ANALYSIS'", "'CUSTOM'", "'VISUALIZE'", "'OUTPUT'", "','", "'='", "'HEADER'", "'END'", "'INSTANCE'", "':'", "'('", "')'", "'FIELD'", "'ENUM'", "'INPUTS'", "'BOOL'", "'INT'", "'STRING'", "'RECORD'", "'DATASET'", "'GROUP'", "'OPTIONAL'", "'DEFINED'", "'DISABLED'", "'MAPBYTYPE'", "'MAPBYNAME'", "'MANY'", "'FORMFIELD'", "'ENABLE'", "'TYPE'", "'RANGE'", "'DEFAULT'", "'MAXLENGTH'", "'NULL'", "'FIELDLENGTH'", "'ROWS'", "'COLS'", "'_HTML_STYLECLASS'", "'CHECKBOX'", "'RADIO'", "'SELECT'", "'MULTIPLESELECT'", "'TEXTAREA'", "'HIDDEN'", "'TEXT'", "'UNICODE'", "'UNISTR'", "'INTEGER'", "'DECIMAL'", "'NUMERIC'", "'REAL'", "'OUTPUTS'", "'UNSIGNED'", "'QSTRING'", "'VARSTRING'", "'VARUNICODE'", "'DATA'", "'SIDE'", "'LARGE'", "'SMALL'", "'FEW'", "'WUID'", "'FROM'", "'ACTION'", "'GENERATES'", "'SALT'", "'SCOREDSEARCH'", "'PROFILE'", "'ENDGENERATES'", "'CHORO'", "'LINE'", "'TIMELINE'", "'PIE'", "'BAR'", "'TABLE'", "'SLIDER'", "'{'", "'}'", "'SUM'", "'SCALE'", "'TITLE'", "'DATE'", "'PICTURE'", "'STATE'", "'COUNTY'", "'WEIGHT'", "'SIZE'", "'SELECTS'", "'->'", "'X'", "'Y'", "'COLOR'", "'FILTER'", "'VALUE'", "'FILE'", "'RESOURCES'"
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
    public static final int RULE_GEN_BLOCK=7;
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
    public static final int RULE_WS=8;

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:76:1: ruleprogram returns [EObject current=null] : ( ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleInputSection ) )? ( (lv_Output_Section_4_0= ruleOutputSection ) )? ( (lv_Visual_Section_5_0= ruleVisualSection ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )? ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:79:28: ( ( ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleInputSection ) )? ( (lv_Output_Section_4_0= ruleOutputSection ) )? ( (lv_Visual_Section_5_0= ruleVisualSection ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:1: ( ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleInputSection ) )? ( (lv_Output_Section_4_0= ruleOutputSection ) )? ( (lv_Visual_Section_5_0= ruleVisualSection ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:1: ( ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleInputSection ) )? ( (lv_Output_Section_4_0= ruleOutputSection ) )? ( (lv_Visual_Section_5_0= ruleVisualSection ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:2: ( (lv_Composition_Header_0_0= rulecomposition_header ) )? ( (lv_Base_Props_1_0= rulebase_prop ) )+ ( (lv_Contract_Instances_2_0= rulecontract_instance ) )* ( (lv_Input_Section_3_0= ruleInputSection ) )? ( (lv_Output_Section_4_0= ruleOutputSection ) )? ( (lv_Visual_Section_5_0= ruleVisualSection ) )* ( (lv_Generate_Section_6_0= rulegenerate_section ) )? ( (lv_Custom_Section_7_0= rulecustom_section ) )? ( (lv_Resource_Section_8_0= ruleresource_section ) )?
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

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:134:3: ( (lv_Input_Section_3_0= ruleInputSection ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:135:1: (lv_Input_Section_3_0= ruleInputSection )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:135:1: (lv_Input_Section_3_0= ruleInputSection )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:136:3: lv_Input_Section_3_0= ruleInputSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getInput_SectionInputSectionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInputSection_in_ruleprogram197);
                    lv_Input_Section_3_0=ruleInputSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"Input_Section",
                            		lv_Input_Section_3_0, 
                            		"InputSection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:152:3: ( (lv_Output_Section_4_0= ruleOutputSection ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==77) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:153:1: (lv_Output_Section_4_0= ruleOutputSection )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:153:1: (lv_Output_Section_4_0= ruleOutputSection )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:154:3: lv_Output_Section_4_0= ruleOutputSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getOutput_SectionOutputSectionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutputSection_in_ruleprogram219);
                    lv_Output_Section_4_0=ruleOutputSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"Output_Section",
                            		lv_Output_Section_4_0, 
                            		"OutputSection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:170:3: ( (lv_Visual_Section_5_0= ruleVisualSection ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:171:1: (lv_Visual_Section_5_0= ruleVisualSection )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:171:1: (lv_Visual_Section_5_0= ruleVisualSection )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:172:3: lv_Visual_Section_5_0= ruleVisualSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getVisual_SectionVisualSectionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVisualSection_in_ruleprogram241);
            	    lv_Visual_Section_5_0=ruleVisualSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Visual_Section",
            	            		lv_Visual_Section_5_0, 
            	            		"VisualSection");
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

            if ( (LA9_0==121) ) {
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
                           		set(
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:594:1: rulevalue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_int_val_1_0= RULE_INT ) ) | ( (lv_str_val_2_0= RULE_STRING ) ) ) ;
    public final EObject rulevalue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_int_val_1_0=null;
        Token lv_str_val_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:597:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_int_val_1_0= RULE_INT ) ) | ( (lv_str_val_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:598:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_int_val_1_0= RULE_INT ) ) | ( (lv_str_val_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:598:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_int_val_1_0= RULE_INT ) ) | ( (lv_str_val_2_0= RULE_STRING ) ) )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:617:6: ( (lv_int_val_1_0= RULE_INT ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:617:6: ( (lv_int_val_1_0= RULE_INT ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:618:1: (lv_int_val_1_0= RULE_INT )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:618:1: (lv_int_val_1_0= RULE_INT )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:619:3: lv_int_val_1_0= RULE_INT
                    {
                    lv_int_val_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulevalue1239); 

                    			newLeafNode(lv_int_val_1_0, grammarAccess.getValueAccess().getInt_valINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int_val",
                            		lv_int_val_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:636:6: ( (lv_str_val_2_0= RULE_STRING ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:636:6: ( (lv_str_val_2_0= RULE_STRING ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:637:1: (lv_str_val_2_0= RULE_STRING )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:637:1: (lv_str_val_2_0= RULE_STRING )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:638:3: lv_str_val_2_0= RULE_STRING
                    {
                    lv_str_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulevalue1267); 

                    			newLeafNode(lv_str_val_2_0, grammarAccess.getValueAccess().getStr_valSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"str_val",
                            		lv_str_val_2_0, 
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:671:1: rulevalue_list returns [EObject current=null] : ( ( (lv_vals_0_0= rulevalue ) ) (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )* ) ;
    public final EObject rulevalue_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vals_0_0 = null;

        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:674:28: ( ( ( (lv_vals_0_0= rulevalue ) ) (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:675:1: ( ( (lv_vals_0_0= rulevalue ) ) (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:675:1: ( ( (lv_vals_0_0= rulevalue ) ) (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:675:2: ( (lv_vals_0_0= rulevalue ) ) (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )*
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:675:2: ( (lv_vals_0_0= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:676:1: (lv_vals_0_0= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:676:1: (lv_vals_0_0= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:677:3: lv_vals_0_0= rulevalue
            {
             
            	        newCompositeNode(grammarAccess.getValue_listAccess().getValsValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_in_rulevalue_list1364);
            lv_vals_0_0=rulevalue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValue_listRule());
            	        }
                   		add(
                   			current, 
                   			"vals",
                    		lv_vals_0_0, 
                    		"value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:693:2: (otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==EOF||LA15_3==RULE_ID||LA15_3==20||LA15_3==30||LA15_3==33||LA15_3==37) ) {
                            alt15=1;
                        }


                    }
                    else if ( ((LA15_2>=RULE_INT && LA15_2<=RULE_STRING)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:693:4: otherlv_1= ',' ( (lv_vals_2_0= rulevalue ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulevalue_list1377); 

            	        	newLeafNode(otherlv_1, grammarAccess.getValue_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:697:1: ( (lv_vals_2_0= rulevalue ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:698:1: (lv_vals_2_0= rulevalue )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:698:1: (lv_vals_2_0= rulevalue )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:699:3: lv_vals_2_0= rulevalue
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:725:1: entryRuleassign returns [EObject current=null] : iv_ruleassign= ruleassign EOF ;
    public final EObject entryRuleassign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassign = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:726:2: (iv_ruleassign= ruleassign EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:727:2: iv_ruleassign= ruleassign EOF
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:734:1: ruleassign returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) ) ) ;
    public final EObject ruleassign() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:737:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:738:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:738:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:738:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= rulevalue_list ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:738:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:739:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:739:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:740:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleassign1490); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAssignAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleassign1507); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:760:1: ( (lv_vals_2_0= rulevalue_list ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:761:1: (lv_vals_2_0= rulevalue_list )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:761:1: (lv_vals_2_0= rulevalue_list )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:762:3: lv_vals_2_0= rulevalue_list
            {
             
            	        newCompositeNode(grammarAccess.getAssignAccess().getValsValue_listParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_list_in_ruleassign1528);
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:786:1: entryRuleassign_list returns [EObject current=null] : iv_ruleassign_list= ruleassign_list EOF ;
    public final EObject entryRuleassign_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassign_list = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:787:2: (iv_ruleassign_list= ruleassign_list EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:788:2: iv_ruleassign_list= ruleassign_list EOF
            {
             newCompositeNode(grammarAccess.getAssign_listRule()); 
            pushFollow(FOLLOW_ruleassign_list_in_entryRuleassign_list1564);
            iv_ruleassign_list=ruleassign_list();

            state._fsp--;

             current =iv_ruleassign_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassign_list1574); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:795:1: ruleassign_list returns [EObject current=null] : (this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )* ) ;
    public final EObject ruleassign_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_assign_0 = null;

        EObject lv_assign_internal_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:798:28: ( (this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:799:1: (this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:799:1: (this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:800:5: this_assign_0= ruleassign (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAssign_listAccess().getAssignParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleassign_in_ruleassign_list1621);
            this_assign_0=ruleassign();

            state._fsp--;

             
                    current = this_assign_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:808:1: (otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:808:3: otherlv_1= ',' ( (lv_assign_internal_2_0= ruleassign ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleassign_list1633); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAssign_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:812:1: ( (lv_assign_internal_2_0= ruleassign ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:813:1: (lv_assign_internal_2_0= ruleassign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:813:1: (lv_assign_internal_2_0= ruleassign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:814:3: lv_assign_internal_2_0= ruleassign
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssign_listAccess().getAssign_internalAssignParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleassign_in_ruleassign_list1654);
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:838:1: entryRulecomposition_header returns [EObject current=null] : iv_rulecomposition_header= rulecomposition_header EOF ;
    public final EObject entryRulecomposition_header() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomposition_header = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:839:2: (iv_rulecomposition_header= rulecomposition_header EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:840:2: iv_rulecomposition_header= rulecomposition_header EOF
            {
             newCompositeNode(grammarAccess.getComposition_headerRule()); 
            pushFollow(FOLLOW_rulecomposition_header_in_entryRulecomposition_header1692);
            iv_rulecomposition_header=rulecomposition_header();

            state._fsp--;

             current =iv_rulecomposition_header; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomposition_header1702); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:847:1: rulecomposition_header returns [EObject current=null] : ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END' ) ;
    public final EObject rulecomposition_header() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_assigns_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:850:28: ( ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:851:1: ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:851:1: ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:851:2: ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleassign ) )* otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:851:2: ( (lv_name_0_0= 'HEADER' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:852:1: (lv_name_0_0= 'HEADER' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:852:1: (lv_name_0_0= 'HEADER' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:853:3: lv_name_0_0= 'HEADER'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_32_in_rulecomposition_header1745); 

                    newLeafNode(lv_name_0_0, grammarAccess.getComposition_headerAccess().getNameHEADERKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComposition_headerRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "HEADER");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:866:2: ( (lv_assigns_1_0= ruleassign ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:867:1: (lv_assigns_1_0= ruleassign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:867:1: (lv_assigns_1_0= ruleassign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:868:3: lv_assigns_1_0= ruleassign
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComposition_headerAccess().getAssignsAssignParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleassign_in_rulecomposition_header1779);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulecomposition_header1792); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:896:1: entryRulecontract_instance returns [EObject current=null] : iv_rulecontract_instance= rulecontract_instance EOF ;
    public final EObject entryRulecontract_instance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecontract_instance = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:897:2: (iv_rulecontract_instance= rulecontract_instance EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:898:2: iv_rulecontract_instance= rulecontract_instance EOF
            {
             newCompositeNode(grammarAccess.getContract_instanceRule()); 
            pushFollow(FOLLOW_rulecontract_instance_in_entryRulecontract_instance1828);
            iv_rulecontract_instance=rulecontract_instance();

            state._fsp--;

             current =iv_rulecontract_instance; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecontract_instance1838); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:905:1: rulecontract_instance returns [EObject current=null] : ( ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END' ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:908:28: ( ( ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:909:1: ( ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:909:1: ( ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:909:2: ( (lv_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= rulevalue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleassign ) )* otherlv_8= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:909:2: ( (lv_name_0_0= 'INSTANCE' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:910:1: (lv_name_0_0= 'INSTANCE' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:910:1: (lv_name_0_0= 'INSTANCE' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:911:3: lv_name_0_0= 'INSTANCE'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_34_in_rulecontract_instance1881); 

                    newLeafNode(lv_name_0_0, grammarAccess.getContract_instanceAccess().getNameINSTANCEKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContract_instanceRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "INSTANCE");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:924:2: (this_ID_1= RULE_ID otherlv_2= ':' )?
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:924:3: this_ID_1= RULE_ID otherlv_2= ':'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecontract_instance1906); 
                     
                        newLeafNode(this_ID_1, grammarAccess.getContract_instanceAccess().getIDTerminalRuleCall_1_0()); 
                        
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_rulecontract_instance1917); 

                        	newLeafNode(otherlv_2, grammarAccess.getContract_instanceAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:932:3: ( (lv_vals_3_0= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:933:1: (lv_vals_3_0= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:933:1: (lv_vals_3_0= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:934:3: lv_vals_3_0= rulevalue
            {
             
            	        newCompositeNode(grammarAccess.getContract_instanceAccess().getValsValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_in_rulecontract_instance1940);
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

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_rulecontract_instance1952); 

                	newLeafNode(otherlv_4, grammarAccess.getContract_instanceAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:954:1: ( (otherlv_5= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:955:1: (otherlv_5= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:955:1: (otherlv_5= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:956:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContract_instanceRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecontract_instance1972); 

            		newLeafNode(otherlv_5, grammarAccess.getContract_instanceAccess().getVarsValueCrossReference_4_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_rulecontract_instance1984); 

                	newLeafNode(otherlv_6, grammarAccess.getContract_instanceAccess().getRightParenthesisKeyword_5());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:971:1: ( (lv_assigns_7_0= ruleassign ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:972:1: (lv_assigns_7_0= ruleassign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:972:1: (lv_assigns_7_0= ruleassign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:973:3: lv_assigns_7_0= ruleassign
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContract_instanceAccess().getAssignsAssignParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleassign_in_rulecontract_instance2005);
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

            otherlv_8=(Token)match(input,33,FOLLOW_33_in_rulecontract_instance2018); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1001:1: entryRulefield_decl returns [EObject current=null] : iv_rulefield_decl= rulefield_decl EOF ;
    public final EObject entryRulefield_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1002:2: (iv_rulefield_decl= rulefield_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1003:2: iv_rulefield_decl= rulefield_decl EOF
            {
             newCompositeNode(grammarAccess.getField_declRule()); 
            pushFollow(FOLLOW_rulefield_decl_in_entryRulefield_decl2054);
            iv_rulefield_decl=rulefield_decl();

            state._fsp--;

             current =iv_rulefield_decl; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_decl2064); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1010:1: rulefield_decl returns [EObject current=null] : (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';' ) ;
    public final EObject rulefield_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_input_internal_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1013:28: ( (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1014:1: (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1014:1: (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1014:3: otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_internal_2_0= ruleinput_options ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulefield_decl2101); 

                	newLeafNode(otherlv_0, grammarAccess.getField_declAccess().getFIELDKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1018:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1019:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1019:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1020:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefield_decl2118); 

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

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1036:2: ( (lv_input_internal_2_0= ruleinput_options ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1037:1: (lv_input_internal_2_0= ruleinput_options )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1037:1: (lv_input_internal_2_0= ruleinput_options )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1038:3: lv_input_internal_2_0= ruleinput_options
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_declAccess().getInput_internalInput_optionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleinput_options_in_rulefield_decl2144);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulefield_decl2157); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1066:1: entryRuleenum_decl returns [EObject current=null] : iv_ruleenum_decl= ruleenum_decl EOF ;
    public final EObject entryRuleenum_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenum_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1067:2: (iv_ruleenum_decl= ruleenum_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1068:2: iv_ruleenum_decl= ruleenum_decl EOF
            {
             newCompositeNode(grammarAccess.getEnum_declRule()); 
            pushFollow(FOLLOW_ruleenum_decl_in_entryRuleenum_decl2193);
            iv_ruleenum_decl=ruleenum_decl();

            state._fsp--;

             current =iv_ruleenum_decl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenum_decl2203); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1075:1: ruleenum_decl returns [EObject current=null] : ( ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleenum_decl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_vals_2_0 = null;

        EObject lv_assigns_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1078:28: ( ( ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1079:1: ( ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1079:1: ( ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1079:2: ( (lv_name_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) ) otherlv_4= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1079:2: ( (lv_name_0_0= 'ENUM' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1080:1: (lv_name_0_0= 'ENUM' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1080:1: (lv_name_0_0= 'ENUM' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1081:3: lv_name_0_0= 'ENUM'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_39_in_ruleenum_decl2246); 

                    newLeafNode(lv_name_0_0, grammarAccess.getEnum_declAccess().getNameENUMKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnum_declRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "ENUM");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleenum_decl2271); 

                	newLeafNode(otherlv_1, grammarAccess.getEnum_declAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1098:1: ( ( (lv_vals_2_0= rulevalue_list ) ) | ( (lv_assigns_3_0= ruleassign_list ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
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
            else if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)) ) {
                alt21=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1098:2: ( (lv_vals_2_0= rulevalue_list ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1098:2: ( (lv_vals_2_0= rulevalue_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1099:1: (lv_vals_2_0= rulevalue_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1099:1: (lv_vals_2_0= rulevalue_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1100:3: lv_vals_2_0= rulevalue_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnum_declAccess().getValsValue_listParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_list_in_ruleenum_decl2293);
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1117:6: ( (lv_assigns_3_0= ruleassign_list ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1117:6: ( (lv_assigns_3_0= ruleassign_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1118:1: (lv_assigns_3_0= ruleassign_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1118:1: (lv_assigns_3_0= ruleassign_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1119:3: lv_assigns_3_0= ruleassign_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnum_declAccess().getAssignsAssign_listParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleassign_list_in_ruleenum_decl2320);
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

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleenum_decl2333); 

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


    // $ANTLR start "entryRuleInputSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1147:1: entryRuleInputSection returns [EObject current=null] : iv_ruleInputSection= ruleInputSection EOF ;
    public final EObject entryRuleInputSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1148:2: (iv_ruleInputSection= ruleInputSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1149:2: iv_ruleInputSection= ruleInputSection EOF
            {
             newCompositeNode(grammarAccess.getInputSectionRule()); 
            pushFollow(FOLLOW_ruleInputSection_in_entryRuleInputSection2369);
            iv_ruleInputSection=ruleInputSection();

            state._fsp--;

             current =iv_ruleInputSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputSection2379); 

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
    // $ANTLR end "entryRuleInputSection"


    // $ANTLR start "ruleInputSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1156:1: ruleInputSection returns [EObject current=null] : ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END' ) ;
    public final EObject ruleInputSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_inputs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1159:28: ( ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1160:1: ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1160:1: ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1160:2: ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleinput_value ) )+ otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1160:2: ( (lv_name_0_0= 'INPUTS' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1161:1: (lv_name_0_0= 'INPUTS' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1161:1: (lv_name_0_0= 'INPUTS' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1162:3: lv_name_0_0= 'INPUTS'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_40_in_ruleInputSection2422); 

                    newLeafNode(lv_name_0_0, grammarAccess.getInputSectionAccess().getNameINPUTSKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputSectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "INPUTS");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1175:2: ( (lv_inputs_1_0= ruleinput_value ) )+
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1176:1: (lv_inputs_1_0= ruleinput_value )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1176:1: (lv_inputs_1_0= ruleinput_value )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1177:3: lv_inputs_1_0= ruleinput_value
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInputSectionAccess().getInputsInput_valueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleinput_value_in_ruleInputSection2456);
            	    lv_inputs_1_0=ruleinput_value();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInputSectionRule());
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInputSection2469); 

                	newLeafNode(otherlv_2, grammarAccess.getInputSectionAccess().getENDKeyword_2());
                

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
    // $ANTLR end "ruleInputSection"


    // $ANTLR start "entryRulebool"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1205:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1206:2: (iv_rulebool= rulebool EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1207:2: iv_rulebool= rulebool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_rulebool_in_entryRulebool2505);
            iv_rulebool=rulebool();

            state._fsp--;

             current =iv_rulebool; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebool2515); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1214:1: rulebool returns [EObject current=null] : (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1217:28: ( (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1218:1: (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1218:1: (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1218:3: otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_rulebool2552); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolAccess().getBOOLKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1222:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1223:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1223:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1224:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebool2569); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1248:1: entryRuleint_var returns [EObject current=null] : iv_ruleint_var= ruleint_var EOF ;
    public final EObject entryRuleint_var() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint_var = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1249:2: (iv_ruleint_var= ruleint_var EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1250:2: iv_ruleint_var= ruleint_var EOF
            {
             newCompositeNode(grammarAccess.getInt_varRule()); 
            pushFollow(FOLLOW_ruleint_var_in_entryRuleint_var2610);
            iv_ruleint_var=ruleint_var();

            state._fsp--;

             current =iv_ruleint_var; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleint_var2620); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1257:1: ruleint_var returns [EObject current=null] : (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleint_var() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1260:28: ( (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1261:1: (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1261:1: (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1261:3: otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleint_var2657); 

                	newLeafNode(otherlv_0, grammarAccess.getInt_varAccess().getINTKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1265:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1266:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1266:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1267:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleint_var2674); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1291:1: entryRulestring_var returns [EObject current=null] : iv_rulestring_var= rulestring_var EOF ;
    public final EObject entryRulestring_var() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring_var = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1292:2: (iv_rulestring_var= rulestring_var EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1293:2: iv_rulestring_var= rulestring_var EOF
            {
             newCompositeNode(grammarAccess.getString_varRule()); 
            pushFollow(FOLLOW_rulestring_var_in_entryRulestring_var2715);
            iv_rulestring_var=rulestring_var();

            state._fsp--;

             current =iv_rulestring_var; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestring_var2725); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1300:1: rulestring_var returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulestring_var() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1303:28: ( (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1304:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1304:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1304:3: otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_rulestring_var2762); 

                	newLeafNode(otherlv_0, grammarAccess.getString_varAccess().getSTRINGKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1309:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1309:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestring_var2779); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1334:1: entryRulerecord returns [EObject current=null] : iv_rulerecord= rulerecord EOF ;
    public final EObject entryRulerecord() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1335:2: (iv_rulerecord= rulerecord EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1336:2: iv_rulerecord= rulerecord EOF
            {
             newCompositeNode(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_rulerecord_in_entryRulerecord2820);
            iv_rulerecord=rulerecord();

            state._fsp--;

             current =iv_rulerecord; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord2830); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1343:1: rulerecord returns [EObject current=null] : (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulerecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1346:28: ( (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1347:1: (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1347:1: (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1347:3: otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_rulerecord2867); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordAccess().getRECORDKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1351:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1352:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1352:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1353:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulerecord2884); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1377:1: entryRuledataset returns [EObject current=null] : iv_ruledataset= ruledataset EOF ;
    public final EObject entryRuledataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledataset = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1378:2: (iv_ruledataset= ruledataset EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1379:2: iv_ruledataset= ruledataset EOF
            {
             newCompositeNode(grammarAccess.getDatasetRule()); 
            pushFollow(FOLLOW_ruledataset_in_entryRuledataset2925);
            iv_ruledataset=ruledataset();

            state._fsp--;

             current =iv_ruledataset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledataset2935); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1386:1: ruledataset returns [EObject current=null] : (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruledataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1389:28: ( (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1390:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1390:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1390:3: otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruledataset2972); 

                	newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getDATASETKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1394:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1395:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1395:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1396:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledataset2989); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1420:1: entryRulegroup returns [EObject current=null] : iv_rulegroup= rulegroup EOF ;
    public final EObject entryRulegroup() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroup = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1421:2: (iv_rulegroup= rulegroup EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1422:2: iv_rulegroup= rulegroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_rulegroup_in_entryRulegroup3030);
            iv_rulegroup=rulegroup();

            state._fsp--;

             current =iv_rulegroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup3040); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1429:1: rulegroup returns [EObject current=null] : (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulegroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1432:28: ( (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1433:1: (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1433:1: (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1433:3: otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulegroup3077); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGROUPKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1437:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1438:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1438:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1439:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegroup3094); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1465:1: entryRuleinput_value returns [EObject current=null] : iv_ruleinput_value= ruleinput_value EOF ;
    public final EObject entryRuleinput_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinput_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1466:2: (iv_ruleinput_value= ruleinput_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1467:2: iv_ruleinput_value= ruleinput_value EOF
            {
             newCompositeNode(grammarAccess.getInput_valueRule()); 
            pushFollow(FOLLOW_ruleinput_value_in_entryRuleinput_value3137);
            iv_ruleinput_value=ruleinput_value();

            state._fsp--;

             current =iv_ruleinput_value; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_value3147); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1474:1: ruleinput_value returns [EObject current=null] : ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1477:28: ( ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1478:1: ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1478:1: ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1478:2: ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1478:2: ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1478:3: (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1478:3: (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset )
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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1479:5: this_bool_0= rulebool
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getBoolParserRuleCall_0_0_0()); 
                                
                            pushFollow(FOLLOW_rulebool_in_ruleinput_value3196);
                            this_bool_0=rulebool();

                            state._fsp--;

                             
                                    current = this_bool_0; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1489:5: this_int_var_1= ruleint_var
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getInt_varParserRuleCall_0_0_1()); 
                                
                            pushFollow(FOLLOW_ruleint_var_in_ruleinput_value3223);
                            this_int_var_1=ruleint_var();

                            state._fsp--;

                             
                                    current = this_int_var_1; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1499:5: this_enum_decl_2= ruleenum_decl
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getEnum_declParserRuleCall_0_0_2()); 
                                
                            pushFollow(FOLLOW_ruleenum_decl_in_ruleinput_value3250);
                            this_enum_decl_2=ruleenum_decl();

                            state._fsp--;

                             
                                    current = this_enum_decl_2; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1509:5: this_string_var_3= rulestring_var
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getString_varParserRuleCall_0_0_3()); 
                                
                            pushFollow(FOLLOW_rulestring_var_in_ruleinput_value3277);
                            this_string_var_3=rulestring_var();

                            state._fsp--;

                             
                                    current = this_string_var_3; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1519:5: this_record_4= rulerecord
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getRecordParserRuleCall_0_0_4()); 
                                
                            pushFollow(FOLLOW_rulerecord_in_ruleinput_value3304);
                            this_record_4=rulerecord();

                            state._fsp--;

                             
                                    current = this_record_4; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1529:5: this_dataset_5= ruledataset
                            {
                             
                                    newCompositeNode(grammarAccess.getInput_valueAccess().getDatasetParserRuleCall_0_0_5()); 
                                
                            pushFollow(FOLLOW_ruledataset_in_ruleinput_value3331);
                            this_dataset_5=ruledataset();

                            state._fsp--;

                             
                                    current = this_dataset_5; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1537:2: ( (lv_input_ops_6_0= ruleinput_options ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==35) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1538:1: (lv_input_ops_6_0= ruleinput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1538:1: (lv_input_ops_6_0= ruleinput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1539:3: lv_input_ops_6_0= ruleinput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getInput_valueAccess().getInput_opsInput_optionsParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value3352);
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

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleinput_value3365); 

                        	newLeafNode(otherlv_7, grammarAccess.getInput_valueAccess().getSemicolonKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1560:6: (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1560:6: (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1561:5: this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END'
                    {
                     
                            newCompositeNode(grammarAccess.getInput_valueAccess().getDatasetParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruledataset_in_ruleinput_value3395);
                    this_dataset_8=ruledataset();

                    state._fsp--;

                     
                            current = this_dataset_8; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1569:1: ( (lv_input_ops_9_0= ruleinput_options ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==35) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1570:1: (lv_input_ops_9_0= ruleinput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1570:1: (lv_input_ops_9_0= ruleinput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1571:3: lv_input_ops_9_0= ruleinput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getInput_valueAccess().getInput_opsInput_optionsParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value3415);
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

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1587:3: ( (lv_fields_10_0= rulefield_decl ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==38) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1588:1: (lv_fields_10_0= rulefield_decl )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1588:1: (lv_fields_10_0= rulefield_decl )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1589:3: lv_fields_10_0= rulefield_decl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInput_valueAccess().getFieldsField_declParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulefield_decl_in_ruleinput_value3437);
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

                    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleinput_value3450); 

                        	newLeafNode(otherlv_11, grammarAccess.getInput_valueAccess().getENDKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1610:6: (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1610:6: (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1611:5: this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END'
                    {
                     
                            newCompositeNode(grammarAccess.getInput_valueAccess().getGroupParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_rulegroup_in_ruleinput_value3480);
                    this_group_12=rulegroup();

                    state._fsp--;

                     
                            current = this_group_12; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1619:1: ( (lv_input_internal_13_0= ruleinput_options ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==35) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1620:1: (lv_input_internal_13_0= ruleinput_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1620:1: (lv_input_internal_13_0= ruleinput_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1621:3: lv_input_internal_13_0= ruleinput_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getInput_valueAccess().getInput_internalInput_optionsParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleinput_options_in_ruleinput_value3500);
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

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1637:3: ( (lv_values_14_0= ruleinput_value ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==39||(LA28_0>=41 && LA28_0<=46)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1638:1: (lv_values_14_0= ruleinput_value )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1638:1: (lv_values_14_0= ruleinput_value )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1639:3: lv_values_14_0= ruleinput_value
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInput_valueAccess().getValuesInput_valueParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleinput_value_in_ruleinput_value3522);
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

                    otherlv_15=(Token)match(input,33,FOLLOW_33_in_ruleinput_value3535); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1667:1: entryRuleinput_options returns [EObject current=null] : iv_ruleinput_options= ruleinput_options EOF ;
    public final EObject entryRuleinput_options() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinput_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1668:2: (iv_ruleinput_options= ruleinput_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1669:2: iv_ruleinput_options= ruleinput_options EOF
            {
             newCompositeNode(grammarAccess.getInput_optionsRule()); 
            pushFollow(FOLLOW_ruleinput_options_in_entryRuleinput_options3572);
            iv_ruleinput_options=ruleinput_options();

            state._fsp--;

             current =iv_ruleinput_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_options3582); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1676:1: ruleinput_options returns [EObject current=null] : (otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )* ) ;
    public final EObject ruleinput_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_input_option_1 = null;

        EObject lv_input_internal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1679:28: ( (otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1680:1: (otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1680:1: (otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1680:3: otherlv_0= ':' this_input_option_1= ruleinput_option (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleinput_options3619); 

                	newLeafNode(otherlv_0, grammarAccess.getInput_optionsAccess().getColonKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getInput_optionsAccess().getInput_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleinput_option_in_ruleinput_options3641);
            this_input_option_1=ruleinput_option();

            state._fsp--;

             
                    current = this_input_option_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1693:1: (otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1693:3: otherlv_2= ',' ( (lv_input_internal_3_0= ruleinput_option ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleinput_options3653); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInput_optionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1697:1: ( (lv_input_internal_3_0= ruleinput_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1698:1: (lv_input_internal_3_0= ruleinput_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1698:1: (lv_input_internal_3_0= ruleinput_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1699:3: lv_input_internal_3_0= ruleinput_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInput_optionsAccess().getInput_internalInput_optionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleinput_option_in_ruleinput_options3674);
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1723:1: entryRuleinput_option returns [EObject current=null] : iv_ruleinput_option= ruleinput_option EOF ;
    public final EObject entryRuleinput_option() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinput_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1724:2: (iv_ruleinput_option= ruleinput_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1725:2: iv_ruleinput_option= ruleinput_option EOF
            {
             newCompositeNode(grammarAccess.getInput_optionRule()); 
            pushFollow(FOLLOW_ruleinput_option_in_entryRuleinput_option3712);
            iv_ruleinput_option=ruleinput_option();

            state._fsp--;

             current =iv_ruleinput_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinput_option3722); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1732:1: ruleinput_option returns [EObject current=null] : ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' ) ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1735:28: ( ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1736:1: ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1736:1: ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' ) )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1736:2: ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1736:2: ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) )
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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1736:3: ( (lv_name_0_0= 'OPTIONAL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1736:3: ( (lv_name_0_0= 'OPTIONAL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1737:1: (lv_name_0_0= 'OPTIONAL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1737:1: (lv_name_0_0= 'OPTIONAL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1738:3: lv_name_0_0= 'OPTIONAL'
                            {
                            lv_name_0_0=(Token)match(input,47,FOLLOW_47_in_ruleinput_option3766); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1752:6: ( (lv_name_1_0= 'DEFINED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1752:6: ( (lv_name_1_0= 'DEFINED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1753:1: (lv_name_1_0= 'DEFINED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1753:1: (lv_name_1_0= 'DEFINED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1754:3: lv_name_1_0= 'DEFINED'
                            {
                            lv_name_1_0=(Token)match(input,48,FOLLOW_48_in_ruleinput_option3803); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1768:6: ( (lv_name_2_0= 'DISABLED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1768:6: ( (lv_name_2_0= 'DISABLED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1769:1: (lv_name_2_0= 'DISABLED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1769:1: (lv_name_2_0= 'DISABLED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1770:3: lv_name_2_0= 'DISABLED'
                            {
                            lv_name_2_0=(Token)match(input,49,FOLLOW_49_in_ruleinput_option3840); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1784:6: ( (lv_name_3_0= 'MAPBYTYPE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1784:6: ( (lv_name_3_0= 'MAPBYTYPE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1785:1: (lv_name_3_0= 'MAPBYTYPE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1785:1: (lv_name_3_0= 'MAPBYTYPE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1786:3: lv_name_3_0= 'MAPBYTYPE'
                            {
                            lv_name_3_0=(Token)match(input,50,FOLLOW_50_in_ruleinput_option3877); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1800:6: ( (lv_name_4_0= 'MAPBYNAME' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1800:6: ( (lv_name_4_0= 'MAPBYNAME' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1801:1: (lv_name_4_0= 'MAPBYNAME' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1801:1: (lv_name_4_0= 'MAPBYNAME' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1802:3: lv_name_4_0= 'MAPBYNAME'
                            {
                            lv_name_4_0=(Token)match(input,51,FOLLOW_51_in_ruleinput_option3914); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1816:6: ( (lv_name_5_0= 'MANY' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1816:6: ( (lv_name_5_0= 'MANY' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1817:1: (lv_name_5_0= 'MANY' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1817:1: (lv_name_5_0= 'MANY' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1818:3: lv_name_5_0= 'MANY'
                            {
                            lv_name_5_0=(Token)match(input,52,FOLLOW_52_in_ruleinput_option3951); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1832:6: ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1832:6: ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1832:7: ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleformfield_option otherlv_9= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1832:7: ( (lv_name_6_0= 'FORMFIELD' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1833:1: (lv_name_6_0= 'FORMFIELD' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1833:1: (lv_name_6_0= 'FORMFIELD' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1834:3: lv_name_6_0= 'FORMFIELD'
                    {
                    lv_name_6_0=(Token)match(input,53,FOLLOW_53_in_ruleinput_option3990); 

                            newLeafNode(lv_name_6_0, grammarAccess.getInput_optionAccess().getNameFORMFIELDKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_6_0, "FORMFIELD");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleinput_option4015); 

                        	newLeafNode(otherlv_7, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_1_1());
                        
                     
                            newCompositeNode(grammarAccess.getInput_optionAccess().getFormfield_optionParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleformfield_option_in_ruleinput_option4031);
                    ruleformfield_option();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleinput_option4042); 

                        	newLeafNode(otherlv_9, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1864:6: ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1864:6: ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1864:7: ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_internal_12_0= ruleassign_list ) ) otherlv_13= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1864:7: ( (lv_name_10_0= 'ENABLE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1865:1: (lv_name_10_0= 'ENABLE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1865:1: (lv_name_10_0= 'ENABLE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1866:3: lv_name_10_0= 'ENABLE'
                    {
                    lv_name_10_0=(Token)match(input,54,FOLLOW_54_in_ruleinput_option4068); 

                            newLeafNode(lv_name_10_0, grammarAccess.getInput_optionAccess().getNameENABLEKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_10_0, "ENABLE");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleinput_option4093); 

                        	newLeafNode(otherlv_11, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1883:1: ( (lv_assigns_internal_12_0= ruleassign_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1884:1: (lv_assigns_internal_12_0= ruleassign_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1884:1: (lv_assigns_internal_12_0= ruleassign_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1885:3: lv_assigns_internal_12_0= ruleassign_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getInput_optionAccess().getAssigns_internalAssign_listParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleassign_list_in_ruleinput_option4114);
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

                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleinput_option4126); 

                        	newLeafNode(otherlv_13, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1906:6: ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1906:6: ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1906:7: ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleinputtype_options otherlv_17= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1906:7: ( (lv_name_14_0= 'TYPE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1907:1: (lv_name_14_0= 'TYPE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1907:1: (lv_name_14_0= 'TYPE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1908:3: lv_name_14_0= 'TYPE'
                    {
                    lv_name_14_0=(Token)match(input,55,FOLLOW_55_in_ruleinput_option4152); 

                            newLeafNode(lv_name_14_0, grammarAccess.getInput_optionAccess().getNameTYPEKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_14_0, "TYPE");
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,36,FOLLOW_36_in_ruleinput_option4177); 

                        	newLeafNode(otherlv_15, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_3_1());
                        
                     
                            newCompositeNode(grammarAccess.getInput_optionAccess().getInputtype_optionsParserRuleCall_3_2()); 
                        
                    pushFollow(FOLLOW_ruleinputtype_options_in_ruleinput_option4193);
                    ruleinputtype_options();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_17=(Token)match(input,37,FOLLOW_37_in_ruleinput_option4204); 

                        	newLeafNode(otherlv_17, grammarAccess.getInput_optionAccess().getRightParenthesisKeyword_3_3());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1938:6: ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1938:6: ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1938:7: ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= rulevalue_list ) ) otherlv_31= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1938:7: ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) )
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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1938:8: ( (lv_name_18_0= 'RANGE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1938:8: ( (lv_name_18_0= 'RANGE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1939:1: (lv_name_18_0= 'RANGE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1939:1: (lv_name_18_0= 'RANGE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1940:3: lv_name_18_0= 'RANGE'
                            {
                            lv_name_18_0=(Token)match(input,56,FOLLOW_56_in_ruleinput_option4231); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1954:6: ( (lv_name_19_0= 'DEFAULT' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1954:6: ( (lv_name_19_0= 'DEFAULT' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1955:1: (lv_name_19_0= 'DEFAULT' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1955:1: (lv_name_19_0= 'DEFAULT' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1956:3: lv_name_19_0= 'DEFAULT'
                            {
                            lv_name_19_0=(Token)match(input,57,FOLLOW_57_in_ruleinput_option4268); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1970:6: ( (lv_name_20_0= 'MAXLENGTH' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1970:6: ( (lv_name_20_0= 'MAXLENGTH' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:1: (lv_name_20_0= 'MAXLENGTH' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:1: (lv_name_20_0= 'MAXLENGTH' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1972:3: lv_name_20_0= 'MAXLENGTH'
                            {
                            lv_name_20_0=(Token)match(input,58,FOLLOW_58_in_ruleinput_option4305); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1986:6: ( (lv_name_21_0= 'DISABLED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1986:6: ( (lv_name_21_0= 'DISABLED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1987:1: (lv_name_21_0= 'DISABLED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1987:1: (lv_name_21_0= 'DISABLED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1988:3: lv_name_21_0= 'DISABLED'
                            {
                            lv_name_21_0=(Token)match(input,49,FOLLOW_49_in_ruleinput_option4342); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2002:6: ( (lv_name_22_0= 'DESCRIPTION' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2002:6: ( (lv_name_22_0= 'DESCRIPTION' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2003:1: (lv_name_22_0= 'DESCRIPTION' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2003:1: (lv_name_22_0= 'DESCRIPTION' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2004:3: lv_name_22_0= 'DESCRIPTION'
                            {
                            lv_name_22_0=(Token)match(input,13,FOLLOW_13_in_ruleinput_option4379); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2018:6: ( (lv_name_23_0= 'NULL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2018:6: ( (lv_name_23_0= 'NULL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2019:1: (lv_name_23_0= 'NULL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2019:1: (lv_name_23_0= 'NULL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2020:3: lv_name_23_0= 'NULL'
                            {
                            lv_name_23_0=(Token)match(input,59,FOLLOW_59_in_ruleinput_option4416); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2034:6: ( (lv_name_24_0= 'FIELDLENGTH' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2034:6: ( (lv_name_24_0= 'FIELDLENGTH' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2035:1: (lv_name_24_0= 'FIELDLENGTH' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2035:1: (lv_name_24_0= 'FIELDLENGTH' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2036:3: lv_name_24_0= 'FIELDLENGTH'
                            {
                            lv_name_24_0=(Token)match(input,60,FOLLOW_60_in_ruleinput_option4453); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2050:6: ( (lv_name_25_0= 'ROWS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2050:6: ( (lv_name_25_0= 'ROWS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2051:1: (lv_name_25_0= 'ROWS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2051:1: (lv_name_25_0= 'ROWS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2052:3: lv_name_25_0= 'ROWS'
                            {
                            lv_name_25_0=(Token)match(input,61,FOLLOW_61_in_ruleinput_option4490); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2066:6: ( (lv_name_26_0= 'COLS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2066:6: ( (lv_name_26_0= 'COLS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2067:1: (lv_name_26_0= 'COLS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2067:1: (lv_name_26_0= 'COLS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2068:3: lv_name_26_0= 'COLS'
                            {
                            lv_name_26_0=(Token)match(input,62,FOLLOW_62_in_ruleinput_option4527); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2082:6: ( (lv_name_27_0= '_HTML_STYLECLASS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2082:6: ( (lv_name_27_0= '_HTML_STYLECLASS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2083:1: (lv_name_27_0= '_HTML_STYLECLASS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2083:1: (lv_name_27_0= '_HTML_STYLECLASS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2084:3: lv_name_27_0= '_HTML_STYLECLASS'
                            {
                            lv_name_27_0=(Token)match(input,63,FOLLOW_63_in_ruleinput_option4564); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2098:6: ( (lv_name_28_0= 'LABEL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2098:6: ( (lv_name_28_0= 'LABEL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2099:1: (lv_name_28_0= 'LABEL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2099:1: (lv_name_28_0= 'LABEL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2100:3: lv_name_28_0= 'LABEL'
                            {
                            lv_name_28_0=(Token)match(input,18,FOLLOW_18_in_ruleinput_option4601); 

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

                    otherlv_29=(Token)match(input,36,FOLLOW_36_in_ruleinput_option4627); 

                        	newLeafNode(otherlv_29, grammarAccess.getInput_optionAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2117:1: ( (lv_vals_30_0= rulevalue_list ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2118:1: (lv_vals_30_0= rulevalue_list )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2118:1: (lv_vals_30_0= rulevalue_list )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2119:3: lv_vals_30_0= rulevalue_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getInput_optionAccess().getValsValue_listParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_list_in_ruleinput_option4648);
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

                    otherlv_31=(Token)match(input,37,FOLLOW_37_in_ruleinput_option4660); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2147:1: entryRuleformfield_option returns [String current=null] : iv_ruleformfield_option= ruleformfield_option EOF ;
    public final String entryRuleformfield_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleformfield_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2148:2: (iv_ruleformfield_option= ruleformfield_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2149:2: iv_ruleformfield_option= ruleformfield_option EOF
            {
             newCompositeNode(grammarAccess.getFormfield_optionRule()); 
            pushFollow(FOLLOW_ruleformfield_option_in_entryRuleformfield_option4698);
            iv_ruleformfield_option=ruleformfield_option();

            state._fsp--;

             current =iv_ruleformfield_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformfield_option4709); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2156:1: ruleformfield_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' ) ;
    public final AntlrDatatypeRuleToken ruleformfield_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2159:28: ( (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2160:1: (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2160:1: (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2161:2: kw= 'CHECKBOX'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleformfield_option4747); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getCHECKBOXKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2168:2: kw= 'RADIO'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleformfield_option4766); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getRADIOKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2175:2: kw= 'SELECT'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleformfield_option4785); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getSELECTKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2182:2: kw= 'MULTIPLESELECT'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleformfield_option4804); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getMULTIPLESELECTKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2189:2: kw= 'TEXTAREA'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleformfield_option4823); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getTEXTAREAKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2196:2: kw= 'HIDDEN'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleformfield_option4842); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormfield_optionAccess().getHIDDENKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2203:2: kw= 'TEXT'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleformfield_option4861); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2216:1: entryRuleinputtype_option returns [String current=null] : iv_ruleinputtype_option= ruleinputtype_option EOF ;
    public final String entryRuleinputtype_option() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinputtype_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2217:2: (iv_ruleinputtype_option= ruleinputtype_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2218:2: iv_ruleinputtype_option= ruleinputtype_option EOF
            {
             newCompositeNode(grammarAccess.getInputtype_optionRule()); 
            pushFollow(FOLLOW_ruleinputtype_option_in_entryRuleinputtype_option4902);
            iv_ruleinputtype_option=ruleinputtype_option();

            state._fsp--;

             current =iv_ruleinputtype_option.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputtype_option4913); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2225:1: ruleinputtype_option returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' ) ;
    public final AntlrDatatypeRuleToken ruleinputtype_option() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2228:28: ( (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2229:1: (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2229:1: (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2230:2: kw= 'STRING'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleinputtype_option4951); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getSTRINGKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2237:2: kw= 'UNICODE'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleinputtype_option4970); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getUNICODEKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2244:2: kw= 'UNISTR'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleinputtype_option4989); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getUNISTRKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2251:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleinputtype_option5008); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getINTEGERKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2258:2: kw= 'DECIMAL'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleinputtype_option5027); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getDECIMALKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2265:2: kw= 'NUMERIC'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleinputtype_option5046); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInputtype_optionAccess().getNUMERICKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2272:2: kw= 'REAL'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleinputtype_option5065); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2285:1: entryRuleinputtype_options returns [String current=null] : iv_ruleinputtype_options= ruleinputtype_options EOF ;
    public final String entryRuleinputtype_options() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinputtype_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2286:2: (iv_ruleinputtype_options= ruleinputtype_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2287:2: iv_ruleinputtype_options= ruleinputtype_options EOF
            {
             newCompositeNode(grammarAccess.getInputtype_optionsRule()); 
            pushFollow(FOLLOW_ruleinputtype_options_in_entryRuleinputtype_options5106);
            iv_ruleinputtype_options=ruleinputtype_options();

            state._fsp--;

             current =iv_ruleinputtype_options.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputtype_options5117); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2294:1: ruleinputtype_options returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* ) ;
    public final AntlrDatatypeRuleToken ruleinputtype_options() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_inputtype_option_0 = null;

        AntlrDatatypeRuleToken this_inputtype_option_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2297:28: ( (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2298:1: (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2298:1: (this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2299:5: this_inputtype_option_0= ruleinputtype_option (kw= ',' this_inputtype_option_2= ruleinputtype_option )*
            {
             
                    newCompositeNode(grammarAccess.getInputtype_optionsAccess().getInputtype_optionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleinputtype_option_in_ruleinputtype_options5164);
            this_inputtype_option_0=ruleinputtype_option();

            state._fsp--;


            		current.merge(this_inputtype_option_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2309:1: (kw= ',' this_inputtype_option_2= ruleinputtype_option )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2310:2: kw= ',' this_inputtype_option_2= ruleinputtype_option
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleinputtype_options5183); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getInputtype_optionsAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getInputtype_optionsAccess().getInputtype_optionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleinputtype_option_in_ruleinputtype_options5205);
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


    // $ANTLR start "entryRuleOutputSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2334:1: entryRuleOutputSection returns [EObject current=null] : iv_ruleOutputSection= ruleOutputSection EOF ;
    public final EObject entryRuleOutputSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2335:2: (iv_ruleOutputSection= ruleOutputSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2336:2: iv_ruleOutputSection= ruleOutputSection EOF
            {
             newCompositeNode(grammarAccess.getOutputSectionRule()); 
            pushFollow(FOLLOW_ruleOutputSection_in_entryRuleOutputSection5252);
            iv_ruleOutputSection=ruleOutputSection();

            state._fsp--;

             current =iv_ruleOutputSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputSection5262); 

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
    // $ANTLR end "entryRuleOutputSection"


    // $ANTLR start "ruleOutputSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2343:1: ruleOutputSection returns [EObject current=null] : ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END' ) ;
    public final EObject ruleOutputSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_outputs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2346:28: ( ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2347:1: ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2347:1: ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2347:2: ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleoutput_value ) )+ otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2347:2: ( (lv_name_0_0= 'OUTPUTS' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2348:1: (lv_name_0_0= 'OUTPUTS' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2348:1: (lv_name_0_0= 'OUTPUTS' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2349:3: lv_name_0_0= 'OUTPUTS'
            {
            lv_name_0_0=(Token)match(input,77,FOLLOW_77_in_ruleOutputSection5305); 

                    newLeafNode(lv_name_0_0, grammarAccess.getOutputSectionAccess().getNameOUTPUTSKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputSectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "OUTPUTS");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2362:2: ( (lv_outputs_1_0= ruleoutput_value ) )+
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2363:1: (lv_outputs_1_0= ruleoutput_value )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2363:1: (lv_outputs_1_0= ruleoutput_value )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2364:3: lv_outputs_1_0= ruleoutput_value
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutputSectionAccess().getOutputsOutput_valueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleoutput_value_in_ruleOutputSection5339);
            	    lv_outputs_1_0=ruleoutput_value();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutputSectionRule());
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleOutputSection5352); 

                	newLeafNode(otherlv_2, grammarAccess.getOutputSectionAccess().getENDKeyword_2());
                

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
    // $ANTLR end "ruleOutputSection"


    // $ANTLR start "entryRuleecl_integer"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2394:1: entryRuleecl_integer returns [EObject current=null] : iv_ruleecl_integer= ruleecl_integer EOF ;
    public final EObject entryRuleecl_integer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_integer = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2395:2: (iv_ruleecl_integer= ruleecl_integer EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2396:2: iv_ruleecl_integer= ruleecl_integer EOF
            {
             newCompositeNode(grammarAccess.getEcl_integerRule()); 
            pushFollow(FOLLOW_ruleecl_integer_in_entryRuleecl_integer5390);
            iv_ruleecl_integer=ruleecl_integer();

            state._fsp--;

             current =iv_ruleecl_integer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_integer5400); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2403:1: ruleecl_integer returns [EObject current=null] : (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_integer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2406:28: ( (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2407:1: (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2407:1: (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2407:3: otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleecl_integer5437); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_integerAccess().getINTEGERKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2411:1: (this_INT_1= RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2411:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_integer5449); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_integerAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2415:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2416:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2416:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2417:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_integer5467); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2441:1: entryRuleecl_unsigned returns [EObject current=null] : iv_ruleecl_unsigned= ruleecl_unsigned EOF ;
    public final EObject entryRuleecl_unsigned() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_unsigned = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2442:2: (iv_ruleecl_unsigned= ruleecl_unsigned EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2443:2: iv_ruleecl_unsigned= ruleecl_unsigned EOF
            {
             newCompositeNode(grammarAccess.getEcl_unsignedRule()); 
            pushFollow(FOLLOW_ruleecl_unsigned_in_entryRuleecl_unsigned5508);
            iv_ruleecl_unsigned=ruleecl_unsigned();

            state._fsp--;

             current =iv_ruleecl_unsigned; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_unsigned5518); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2450:1: ruleecl_unsigned returns [EObject current=null] : (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_unsigned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2453:28: ( (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2454:1: (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2454:1: (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2454:3: otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleecl_unsigned5555); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_unsignedAccess().getUNSIGNEDKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2458:1: (this_INT_1= RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2458:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_unsigned5567); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_unsignedAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2462:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2463:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2463:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2464:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_unsigned5585); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2488:1: entryRuleecl_string returns [EObject current=null] : iv_ruleecl_string= ruleecl_string EOF ;
    public final EObject entryRuleecl_string() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_string = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2489:2: (iv_ruleecl_string= ruleecl_string EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2490:2: iv_ruleecl_string= ruleecl_string EOF
            {
             newCompositeNode(grammarAccess.getEcl_stringRule()); 
            pushFollow(FOLLOW_ruleecl_string_in_entryRuleecl_string5626);
            iv_ruleecl_string=ruleecl_string();

            state._fsp--;

             current =iv_ruleecl_string; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_string5636); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2497:1: ruleecl_string returns [EObject current=null] : (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_string() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2500:28: ( (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2501:1: (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2501:1: (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2501:3: otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleecl_string5673); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_stringAccess().getSTRINGKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2505:1: (this_INT_1= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2505:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_string5685); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_stringAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2509:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2510:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2510:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2511:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_string5703); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2535:1: entryRuleecl_qstring returns [EObject current=null] : iv_ruleecl_qstring= ruleecl_qstring EOF ;
    public final EObject entryRuleecl_qstring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_qstring = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2536:2: (iv_ruleecl_qstring= ruleecl_qstring EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2537:2: iv_ruleecl_qstring= ruleecl_qstring EOF
            {
             newCompositeNode(grammarAccess.getEcl_qstringRule()); 
            pushFollow(FOLLOW_ruleecl_qstring_in_entryRuleecl_qstring5744);
            iv_ruleecl_qstring=ruleecl_qstring();

            state._fsp--;

             current =iv_ruleecl_qstring; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_qstring5754); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2544:1: ruleecl_qstring returns [EObject current=null] : (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_qstring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2547:28: ( (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2548:1: (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2548:1: (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2548:3: otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleecl_qstring5791); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_qstringAccess().getQSTRINGKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2552:1: (this_INT_1= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2552:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_qstring5803); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_qstringAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2556:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2557:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2557:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2558:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_qstring5821); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2582:1: entryRuleecl_varstring returns [EObject current=null] : iv_ruleecl_varstring= ruleecl_varstring EOF ;
    public final EObject entryRuleecl_varstring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_varstring = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2583:2: (iv_ruleecl_varstring= ruleecl_varstring EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2584:2: iv_ruleecl_varstring= ruleecl_varstring EOF
            {
             newCompositeNode(grammarAccess.getEcl_varstringRule()); 
            pushFollow(FOLLOW_ruleecl_varstring_in_entryRuleecl_varstring5862);
            iv_ruleecl_varstring=ruleecl_varstring();

            state._fsp--;

             current =iv_ruleecl_varstring; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_varstring5872); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2591:1: ruleecl_varstring returns [EObject current=null] : (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_varstring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2594:28: ( (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2595:1: (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2595:1: (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2595:3: otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleecl_varstring5909); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_varstringAccess().getVARSTRINGKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2599:1: (this_INT_1= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2599:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_varstring5921); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_varstringAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2603:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2604:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2604:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2605:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_varstring5939); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2629:1: entryRuleecl_unicode returns [EObject current=null] : iv_ruleecl_unicode= ruleecl_unicode EOF ;
    public final EObject entryRuleecl_unicode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_unicode = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2630:2: (iv_ruleecl_unicode= ruleecl_unicode EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2631:2: iv_ruleecl_unicode= ruleecl_unicode EOF
            {
             newCompositeNode(grammarAccess.getEcl_unicodeRule()); 
            pushFollow(FOLLOW_ruleecl_unicode_in_entryRuleecl_unicode5980);
            iv_ruleecl_unicode=ruleecl_unicode();

            state._fsp--;

             current =iv_ruleecl_unicode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_unicode5990); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2638:1: ruleecl_unicode returns [EObject current=null] : (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_unicode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2641:28: ( (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2642:1: (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2642:1: (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2642:3: otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleecl_unicode6027); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_unicodeAccess().getUNICODEKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2646:1: (this_INT_1= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2646:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_unicode6039); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_unicodeAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2650:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2651:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2651:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2652:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_unicode6057); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2676:1: entryRuleecl_varunicode returns [EObject current=null] : iv_ruleecl_varunicode= ruleecl_varunicode EOF ;
    public final EObject entryRuleecl_varunicode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_varunicode = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2677:2: (iv_ruleecl_varunicode= ruleecl_varunicode EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2678:2: iv_ruleecl_varunicode= ruleecl_varunicode EOF
            {
             newCompositeNode(grammarAccess.getEcl_varunicodeRule()); 
            pushFollow(FOLLOW_ruleecl_varunicode_in_entryRuleecl_varunicode6098);
            iv_ruleecl_varunicode=ruleecl_varunicode();

            state._fsp--;

             current =iv_ruleecl_varunicode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_varunicode6108); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2685:1: ruleecl_varunicode returns [EObject current=null] : (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_varunicode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2688:28: ( (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2689:1: (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2689:1: (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2689:3: otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleecl_varunicode6145); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_varunicodeAccess().getVARUNICODEKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2693:1: (this_INT_1= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2693:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleecl_varunicode6157); 
                     
                        newLeafNode(this_INT_1, grammarAccess.getEcl_varunicodeAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2697:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2698:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2698:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2699:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_varunicode6175); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2723:1: entryRuleecl_data returns [EObject current=null] : iv_ruleecl_data= ruleecl_data EOF ;
    public final EObject entryRuleecl_data() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_data = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2724:2: (iv_ruleecl_data= ruleecl_data EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2725:2: iv_ruleecl_data= ruleecl_data EOF
            {
             newCompositeNode(grammarAccess.getEcl_dataRule()); 
            pushFollow(FOLLOW_ruleecl_data_in_entryRuleecl_data6216);
            iv_ruleecl_data=ruleecl_data();

            state._fsp--;

             current =iv_ruleecl_data; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_data6226); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2732:1: ruleecl_data returns [EObject current=null] : (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_data() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2735:28: ( (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2736:1: (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2736:1: (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2736:3: otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleecl_data6263); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_dataAccess().getDATAKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2740:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2741:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2741:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2742:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_data6280); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2766:1: entryRuleecl_real returns [EObject current=null] : iv_ruleecl_real= ruleecl_real EOF ;
    public final EObject entryRuleecl_real() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecl_real = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2767:2: (iv_ruleecl_real= ruleecl_real EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2768:2: iv_ruleecl_real= ruleecl_real EOF
            {
             newCompositeNode(grammarAccess.getEcl_realRule()); 
            pushFollow(FOLLOW_ruleecl_real_in_entryRuleecl_real6321);
            iv_ruleecl_real=ruleecl_real();

            state._fsp--;

             current =iv_ruleecl_real; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecl_real6331); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2775:1: ruleecl_real returns [EObject current=null] : (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleecl_real() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2778:28: ( (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2779:1: (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2779:1: (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2779:3: otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleecl_real6368); 

                	newLeafNode(otherlv_0, grammarAccess.getEcl_realAccess().getREALKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2783:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2784:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2784:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2785:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleecl_real6385); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2809:1: entryRuleeclfield_type returns [EObject current=null] : iv_ruleeclfield_type= ruleeclfield_type EOF ;
    public final EObject entryRuleeclfield_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleeclfield_type = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2810:2: (iv_ruleeclfield_type= ruleeclfield_type EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2811:2: iv_ruleeclfield_type= ruleeclfield_type EOF
            {
             newCompositeNode(grammarAccess.getEclfield_typeRule()); 
            pushFollow(FOLLOW_ruleeclfield_type_in_entryRuleeclfield_type6426);
            iv_ruleeclfield_type=ruleeclfield_type();

            state._fsp--;

             current =iv_ruleeclfield_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleeclfield_type6436); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2818:1: ruleeclfield_type returns [EObject current=null] : (this_ecl_integer_0= ruleecl_integer | this_ecl_qstring_1= ruleecl_qstring | this_ecl_string_2= ruleecl_string | this_ecl_real_3= ruleecl_real | this_ecl_unicode_4= ruleecl_unicode | this_ecl_data_5= ruleecl_data | this_ecl_varstring_6= ruleecl_varstring | this_ecl_varunicode_7= ruleecl_varunicode | this_ecl_unsigned_8= ruleecl_unsigned ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2821:28: ( (this_ecl_integer_0= ruleecl_integer | this_ecl_qstring_1= ruleecl_qstring | this_ecl_string_2= ruleecl_string | this_ecl_real_3= ruleecl_real | this_ecl_unicode_4= ruleecl_unicode | this_ecl_data_5= ruleecl_data | this_ecl_varstring_6= ruleecl_varstring | this_ecl_varunicode_7= ruleecl_varunicode | this_ecl_unsigned_8= ruleecl_unsigned ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2822:1: (this_ecl_integer_0= ruleecl_integer | this_ecl_qstring_1= ruleecl_qstring | this_ecl_string_2= ruleecl_string | this_ecl_real_3= ruleecl_real | this_ecl_unicode_4= ruleecl_unicode | this_ecl_data_5= ruleecl_data | this_ecl_varstring_6= ruleecl_varstring | this_ecl_varunicode_7= ruleecl_varunicode | this_ecl_unsigned_8= ruleecl_unsigned )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2822:1: (this_ecl_integer_0= ruleecl_integer | this_ecl_qstring_1= ruleecl_qstring | this_ecl_string_2= ruleecl_string | this_ecl_real_3= ruleecl_real | this_ecl_unicode_4= ruleecl_unicode | this_ecl_data_5= ruleecl_data | this_ecl_varstring_6= ruleecl_varstring | this_ecl_varunicode_7= ruleecl_varunicode | this_ecl_unsigned_8= ruleecl_unsigned )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2823:5: this_ecl_integer_0= ruleecl_integer
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_integerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleecl_integer_in_ruleeclfield_type6483);
                    this_ecl_integer_0=ruleecl_integer();

                    state._fsp--;

                     
                            current = this_ecl_integer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2833:5: this_ecl_qstring_1= ruleecl_qstring
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_qstringParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleecl_qstring_in_ruleeclfield_type6510);
                    this_ecl_qstring_1=ruleecl_qstring();

                    state._fsp--;

                     
                            current = this_ecl_qstring_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2843:5: this_ecl_string_2= ruleecl_string
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_stringParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleecl_string_in_ruleeclfield_type6537);
                    this_ecl_string_2=ruleecl_string();

                    state._fsp--;

                     
                            current = this_ecl_string_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2853:5: this_ecl_real_3= ruleecl_real
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_realParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleecl_real_in_ruleeclfield_type6564);
                    this_ecl_real_3=ruleecl_real();

                    state._fsp--;

                     
                            current = this_ecl_real_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2863:5: this_ecl_unicode_4= ruleecl_unicode
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_unicodeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleecl_unicode_in_ruleeclfield_type6591);
                    this_ecl_unicode_4=ruleecl_unicode();

                    state._fsp--;

                     
                            current = this_ecl_unicode_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2873:5: this_ecl_data_5= ruleecl_data
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_dataParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleecl_data_in_ruleeclfield_type6618);
                    this_ecl_data_5=ruleecl_data();

                    state._fsp--;

                     
                            current = this_ecl_data_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2883:5: this_ecl_varstring_6= ruleecl_varstring
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_varstringParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleecl_varstring_in_ruleeclfield_type6645);
                    this_ecl_varstring_6=ruleecl_varstring();

                    state._fsp--;

                     
                            current = this_ecl_varstring_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2893:5: this_ecl_varunicode_7= ruleecl_varunicode
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_varunicodeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleecl_varunicode_in_ruleeclfield_type6672);
                    this_ecl_varunicode_7=ruleecl_varunicode();

                    state._fsp--;

                     
                            current = this_ecl_varunicode_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2903:5: this_ecl_unsigned_8= ruleecl_unsigned
                    {
                     
                            newCompositeNode(grammarAccess.getEclfield_typeAccess().getEcl_unsignedParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleecl_unsigned_in_ruleeclfield_type6699);
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2921:1: entryRuleecloutput_decl returns [EObject current=null] : iv_ruleecloutput_decl= ruleecloutput_decl EOF ;
    public final EObject entryRuleecloutput_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecloutput_decl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2922:2: (iv_ruleecloutput_decl= ruleecloutput_decl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2923:2: iv_ruleecloutput_decl= ruleecloutput_decl EOF
            {
             newCompositeNode(grammarAccess.getEcloutput_declRule()); 
            pushFollow(FOLLOW_ruleecloutput_decl_in_entryRuleecloutput_decl6736);
            iv_ruleecloutput_decl=ruleecloutput_decl();

            state._fsp--;

             current =iv_ruleecloutput_decl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleecloutput_decl6746); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2930:1: ruleecloutput_decl returns [EObject current=null] : (this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) ;
    public final EObject ruleecloutput_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_eclfield_type_0 = null;

        EObject lv_options_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2933:28: ( (this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2934:1: (this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2934:1: (this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2935:5: this_eclfield_type_0= ruleeclfield_type ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';'
            {
             
                    newCompositeNode(grammarAccess.getEcloutput_declAccess().getEclfield_typeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleeclfield_type_in_ruleecloutput_decl6793);
            this_eclfield_type_0=ruleeclfield_type();

            state._fsp--;

             
                    current = this_eclfield_type_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2943:1: ( (lv_options_1_0= ruleOutputOptions ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2944:1: (lv_options_1_0= ruleOutputOptions )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2944:1: (lv_options_1_0= ruleOutputOptions )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2945:3: lv_options_1_0= ruleOutputOptions
                    {
                     
                    	        newCompositeNode(grammarAccess.getEcloutput_declAccess().getOptionsOutputOptionsParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutputOptions_in_ruleecloutput_decl6813);
                    lv_options_1_0=ruleOutputOptions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEcloutput_declRule());
                    	        }
                           		add(
                           			current, 
                           			"options",
                            		lv_options_1_0, 
                            		"OutputOptions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleecloutput_decl6826); 

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


    // $ANTLR start "entryRuleOutputOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2973:1: entryRuleOutputOption returns [EObject current=null] : iv_ruleOutputOption= ruleOutputOption EOF ;
    public final EObject entryRuleOutputOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOption = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2974:2: (iv_ruleOutputOption= ruleOutputOption EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2975:2: iv_ruleOutputOption= ruleOutputOption EOF
            {
             newCompositeNode(grammarAccess.getOutputOptionRule()); 
            pushFollow(FOLLOW_ruleOutputOption_in_entryRuleOutputOption6862);
            iv_ruleOutputOption=ruleOutputOption();

            state._fsp--;

             current =iv_ruleOutputOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOption6872); 

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
    // $ANTLR end "entryRuleOutputOption"


    // $ANTLR start "ruleOutputOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2982:1: ruleOutputOption returns [EObject current=null] : ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleOutputOption() throws RecognitionException {
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2985:28: ( ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2986:1: ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2986:1: ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' ) )
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2986:2: ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2986:2: ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) )
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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2986:3: ( (lv_name_0_0= 'SIDE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2986:3: ( (lv_name_0_0= 'SIDE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2987:1: (lv_name_0_0= 'SIDE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2987:1: (lv_name_0_0= 'SIDE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2988:3: lv_name_0_0= 'SIDE'
                            {
                            lv_name_0_0=(Token)match(input,83,FOLLOW_83_in_ruleOutputOption6916); 

                                    newLeafNode(lv_name_0_0, grammarAccess.getOutputOptionAccess().getNameSIDEKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutputOptionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_0_0, "SIDE");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3002:6: ( (lv_name_1_0= 'LARGE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3002:6: ( (lv_name_1_0= 'LARGE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3003:1: (lv_name_1_0= 'LARGE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3003:1: (lv_name_1_0= 'LARGE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3004:3: lv_name_1_0= 'LARGE'
                            {
                            lv_name_1_0=(Token)match(input,84,FOLLOW_84_in_ruleOutputOption6953); 

                                    newLeafNode(lv_name_1_0, grammarAccess.getOutputOptionAccess().getNameLARGEKeyword_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutputOptionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_1_0, "LARGE");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3018:6: ( (lv_name_2_0= 'SMALL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3018:6: ( (lv_name_2_0= 'SMALL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3019:1: (lv_name_2_0= 'SMALL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3019:1: (lv_name_2_0= 'SMALL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3020:3: lv_name_2_0= 'SMALL'
                            {
                            lv_name_2_0=(Token)match(input,85,FOLLOW_85_in_ruleOutputOption6990); 

                                    newLeafNode(lv_name_2_0, grammarAccess.getOutputOptionAccess().getNameSMALLKeyword_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutputOptionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_0, "SMALL");
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3034:6: ( (lv_name_3_0= 'FEW' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3034:6: ( (lv_name_3_0= 'FEW' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3035:1: (lv_name_3_0= 'FEW' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3035:1: (lv_name_3_0= 'FEW' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3036:3: lv_name_3_0= 'FEW'
                            {
                            lv_name_3_0=(Token)match(input,86,FOLLOW_86_in_ruleOutputOption7027); 

                                    newLeafNode(lv_name_3_0, grammarAccess.getOutputOptionAccess().getNameFEWKeyword_0_3_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutputOptionRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_3_0, "FEW");
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3050:6: ( (lv_name_4_0= 'WUID' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3050:6: ( (lv_name_4_0= 'WUID' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3051:1: (lv_name_4_0= 'WUID' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3051:1: (lv_name_4_0= 'WUID' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3052:3: lv_name_4_0= 'WUID'
                            {
                            lv_name_4_0=(Token)match(input,87,FOLLOW_87_in_ruleOutputOption7064); 

                                    newLeafNode(lv_name_4_0, grammarAccess.getOutputOptionAccess().getNameWUIDKeyword_0_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOutputOptionRule());
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3066:6: ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3066:6: ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3066:7: ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3066:7: ( (lv_name_5_0= 'FROM' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3067:1: (lv_name_5_0= 'FROM' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3067:1: (lv_name_5_0= 'FROM' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3068:3: lv_name_5_0= 'FROM'
                    {
                    lv_name_5_0=(Token)match(input,88,FOLLOW_88_in_ruleOutputOption7103); 

                            newLeafNode(lv_name_5_0, grammarAccess.getOutputOptionAccess().getNameFROMKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputOptionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_5_0, "FROM");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleOutputOption7128); 

                        	newLeafNode(otherlv_6, grammarAccess.getOutputOptionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3085:1: ( (otherlv_7= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3086:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3086:1: (otherlv_7= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3087:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputOptionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputOption7148); 

                    		newLeafNode(otherlv_7, grammarAccess.getOutputOptionAccess().getVarsDatatypeCrossReference_1_2_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleOutputOption7160); 

                        	newLeafNode(otherlv_8, grammarAccess.getOutputOptionAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3103:6: ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3103:6: ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3103:7: ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= rulevalue ) ) otherlv_12= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3103:7: ( (lv_name_9_0= 'DESCRIPTION' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3104:1: (lv_name_9_0= 'DESCRIPTION' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3104:1: (lv_name_9_0= 'DESCRIPTION' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3105:3: lv_name_9_0= 'DESCRIPTION'
                    {
                    lv_name_9_0=(Token)match(input,13,FOLLOW_13_in_ruleOutputOption7186); 

                            newLeafNode(lv_name_9_0, grammarAccess.getOutputOptionAccess().getNameDESCRIPTIONKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputOptionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_9_0, "DESCRIPTION");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleOutputOption7211); 

                        	newLeafNode(otherlv_10, grammarAccess.getOutputOptionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3122:1: ( (lv_vals_11_0= rulevalue ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3123:1: (lv_vals_11_0= rulevalue )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3123:1: (lv_vals_11_0= rulevalue )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3124:3: lv_vals_11_0= rulevalue
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputOptionAccess().getValsValueParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_in_ruleOutputOption7232);
                    lv_vals_11_0=rulevalue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputOptionRule());
                    	        }
                           		add(
                           			current, 
                           			"vals",
                            		lv_vals_11_0, 
                            		"value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleOutputOption7244); 

                        	newLeafNode(otherlv_12, grammarAccess.getOutputOptionAccess().getRightParenthesisKeyword_2_3());
                        

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
    // $ANTLR end "ruleOutputOption"


    // $ANTLR start "entryRuleOutputOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3152:1: entryRuleOutputOptions returns [EObject current=null] : iv_ruleOutputOptions= ruleOutputOptions EOF ;
    public final EObject entryRuleOutputOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOptions = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3153:2: (iv_ruleOutputOptions= ruleOutputOptions EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3154:2: iv_ruleOutputOptions= ruleOutputOptions EOF
            {
             newCompositeNode(grammarAccess.getOutputOptionsRule()); 
            pushFollow(FOLLOW_ruleOutputOptions_in_entryRuleOutputOptions7281);
            iv_ruleOutputOptions=ruleOutputOptions();

            state._fsp--;

             current =iv_ruleOutputOptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOptions7291); 

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
    // $ANTLR end "entryRuleOutputOptions"


    // $ANTLR start "ruleOutputOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3161:1: ruleOutputOptions returns [EObject current=null] : (otherlv_0= ':' this_OutputOption_1= ruleOutputOption (otherlv_2= ',' ( (lv_output_internal_3_0= ruleOutputOption ) ) )* ) ;
    public final EObject ruleOutputOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_OutputOption_1 = null;

        EObject lv_output_internal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3164:28: ( (otherlv_0= ':' this_OutputOption_1= ruleOutputOption (otherlv_2= ',' ( (lv_output_internal_3_0= ruleOutputOption ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3165:1: (otherlv_0= ':' this_OutputOption_1= ruleOutputOption (otherlv_2= ',' ( (lv_output_internal_3_0= ruleOutputOption ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3165:1: (otherlv_0= ':' this_OutputOption_1= ruleOutputOption (otherlv_2= ',' ( (lv_output_internal_3_0= ruleOutputOption ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3165:3: otherlv_0= ':' this_OutputOption_1= ruleOutputOption (otherlv_2= ',' ( (lv_output_internal_3_0= ruleOutputOption ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleOutputOptions7328); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputOptionsAccess().getColonKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getOutputOptionsAccess().getOutputOptionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOutputOption_in_ruleOutputOptions7350);
            this_OutputOption_1=ruleOutputOption();

            state._fsp--;

             
                    current = this_OutputOption_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3178:1: (otherlv_2= ',' ( (lv_output_internal_3_0= ruleOutputOption ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==30) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3178:3: otherlv_2= ',' ( (lv_output_internal_3_0= ruleOutputOption ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleOutputOptions7362); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOutputOptionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3182:1: ( (lv_output_internal_3_0= ruleOutputOption ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3183:1: (lv_output_internal_3_0= ruleOutputOption )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3183:1: (lv_output_internal_3_0= ruleOutputOption )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3184:3: lv_output_internal_3_0= ruleOutputOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutputOptionsAccess().getOutput_internalOutputOptionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutputOption_in_ruleOutputOptions7383);
            	    lv_output_internal_3_0=ruleOutputOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutputOptionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"output_internal",
            	            		lv_output_internal_3_0, 
            	            		"OutputOption");
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
    // $ANTLR end "ruleOutputOptions"


    // $ANTLR start "entryRuleout_type"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3208:1: entryRuleout_type returns [EObject current=null] : iv_ruleout_type= ruleout_type EOF ;
    public final EObject entryRuleout_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleout_type = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3209:2: (iv_ruleout_type= ruleout_type EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3210:2: iv_ruleout_type= ruleout_type EOF
            {
             newCompositeNode(grammarAccess.getOut_typeRule()); 
            pushFollow(FOLLOW_ruleout_type_in_entryRuleout_type7421);
            iv_ruleout_type=ruleout_type();

            state._fsp--;

             current =iv_ruleout_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleout_type7431); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3217:1: ruleout_type returns [EObject current=null] : ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue ) ;
    public final EObject ruleout_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_value_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3220:28: ( ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3221:1: ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3221:1: ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3221:2: (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? this_value_4= rulevalue
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3221:2: (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )?
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3221:4: otherlv_0= 'BOOL'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleout_type7469); 

                        	newLeafNode(otherlv_0, grammarAccess.getOut_typeAccess().getBOOLKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3226:7: otherlv_1= 'INT'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleout_type7487); 

                        	newLeafNode(otherlv_1, grammarAccess.getOut_typeAccess().getINTKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3231:7: otherlv_2= 'STRING'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleout_type7505); 

                        	newLeafNode(otherlv_2, grammarAccess.getOut_typeAccess().getSTRINGKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3236:7: otherlv_3= 'ACTION'
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_89_in_ruleout_type7523); 

                        	newLeafNode(otherlv_3, grammarAccess.getOut_typeAccess().getACTIONKeyword_0_3());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getOut_typeAccess().getValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevalue_in_ruleout_type7547);
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


    // $ANTLR start "entryRuleout_dataset"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3257:1: entryRuleout_dataset returns [EObject current=null] : iv_ruleout_dataset= ruleout_dataset EOF ;
    public final EObject entryRuleout_dataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleout_dataset = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3258:2: (iv_ruleout_dataset= ruleout_dataset EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3259:2: iv_ruleout_dataset= ruleout_dataset EOF
            {
             newCompositeNode(grammarAccess.getOut_datasetRule()); 
            pushFollow(FOLLOW_ruleout_dataset_in_entryRuleout_dataset7582);
            iv_ruleout_dataset=ruleout_dataset();

            state._fsp--;

             current =iv_ruleout_dataset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleout_dataset7592); 

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
    // $ANTLR end "entryRuleout_dataset"


    // $ANTLR start "ruleout_dataset"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3266:1: ruleout_dataset returns [EObject current=null] : (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleoutputbase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )? ) ;
    public final EObject ruleout_dataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_out_base_2_0 = null;

        EObject lv_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3269:28: ( (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleoutputbase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3270:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleoutputbase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3270:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleoutputbase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3270:3: otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleoutputbase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleout_dataset7629); 

                	newLeafNode(otherlv_0, grammarAccess.getOut_datasetAccess().getDATASETKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3274:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3275:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3275:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3276:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleout_dataset7646); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOut_datasetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOut_datasetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3292:2: ( (lv_out_base_2_0= ruleoutputbase ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==36) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3293:1: (lv_out_base_2_0= ruleoutputbase )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3293:1: (lv_out_base_2_0= ruleoutputbase )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3294:3: lv_out_base_2_0= ruleoutputbase
                    {
                     
                    	        newCompositeNode(grammarAccess.getOut_datasetAccess().getOut_baseOutputbaseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleoutputbase_in_ruleout_dataset7672);
                    lv_out_base_2_0=ruleoutputbase();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOut_datasetRule());
                    	        }
                           		set(
                           			current, 
                           			"out_base",
                            		lv_out_base_2_0, 
                            		"outputbase");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3310:3: ( (lv_ops_3_0= ruleOutputOptions ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==35) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3311:1: (lv_ops_3_0= ruleOutputOptions )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3311:1: (lv_ops_3_0= ruleOutputOptions )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3312:3: lv_ops_3_0= ruleOutputOptions
                    {
                     
                    	        newCompositeNode(grammarAccess.getOut_datasetAccess().getOpsOutputOptionsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutputOptions_in_ruleout_dataset7694);
                    lv_ops_3_0=ruleOutputOptions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOut_datasetRule());
                    	        }
                           		add(
                           			current, 
                           			"ops",
                            		lv_ops_3_0, 
                            		"OutputOptions");
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
    // $ANTLR end "ruleout_dataset"


    // $ANTLR start "entryRuleoutput_value"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3336:1: entryRuleoutput_value returns [EObject current=null] : iv_ruleoutput_value= ruleoutput_value EOF ;
    public final EObject entryRuleoutput_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3337:2: (iv_ruleoutput_value= ruleoutput_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3338:2: iv_ruleoutput_value= ruleoutput_value EOF
            {
             newCompositeNode(grammarAccess.getOutput_valueRule()); 
            pushFollow(FOLLOW_ruleoutput_value_in_entryRuleoutput_value7731);
            iv_ruleoutput_value=ruleoutput_value();

            state._fsp--;

             current =iv_ruleoutput_value; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutput_value7741); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3345:1: ruleoutput_value returns [EObject current=null] : ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_out_dataset_3= ruleout_dataset ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )* otherlv_5= 'END' ) | (this_out_dataset_6= ruleout_dataset otherlv_7= ';' ) ) ;
    public final EObject ruleoutput_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_out_type_0 = null;

        EObject lv_ops_1_0 = null;

        EObject this_out_dataset_3 = null;

        EObject lv_ecl_vars_4_0 = null;

        EObject this_out_dataset_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3348:28: ( ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_out_dataset_3= ruleout_dataset ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )* otherlv_5= 'END' ) | (this_out_dataset_6= ruleout_dataset otherlv_7= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3349:1: ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_out_dataset_3= ruleout_dataset ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )* otherlv_5= 'END' ) | (this_out_dataset_6= ruleout_dataset otherlv_7= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3349:1: ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_out_dataset_3= ruleout_dataset ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )* otherlv_5= 'END' ) | (this_out_dataset_6= ruleout_dataset otherlv_7= ';' ) )
            int alt55=3;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3349:2: (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3349:2: (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3350:5: this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getOutput_valueAccess().getOut_typeParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleout_type_in_ruleoutput_value7789);
                    this_out_type_0=ruleout_type();

                    state._fsp--;

                     
                            current = this_out_type_0; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3358:1: ( (lv_ops_1_0= ruleOutputOptions ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==35) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3359:1: (lv_ops_1_0= ruleOutputOptions )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3359:1: (lv_ops_1_0= ruleOutputOptions )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3360:3: lv_ops_1_0= ruleOutputOptions
                            {
                             
                            	        newCompositeNode(grammarAccess.getOutput_valueAccess().getOpsOutputOptionsParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleOutputOptions_in_ruleoutput_value7809);
                            lv_ops_1_0=ruleOutputOptions();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"ops",
                                    		lv_ops_1_0, 
                                    		"OutputOptions");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleoutput_value7822); 

                        	newLeafNode(otherlv_2, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3381:6: (this_out_dataset_3= ruleout_dataset ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )* otherlv_5= 'END' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3381:6: (this_out_dataset_3= ruleout_dataset ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )* otherlv_5= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3382:5: this_out_dataset_3= ruleout_dataset ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )* otherlv_5= 'END'
                    {
                     
                            newCompositeNode(grammarAccess.getOutput_valueAccess().getOut_datasetParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleout_dataset_in_ruleoutput_value7852);
                    this_out_dataset_3=ruleout_dataset();

                    state._fsp--;

                     
                            current = this_out_dataset_3; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3390:1: ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==43||LA54_0==71||LA54_0==73||LA54_0==76||(LA54_0>=78 && LA54_0<=82)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3391:1: (lv_ecl_vars_4_0= ruleecloutput_decl )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3391:1: (lv_ecl_vars_4_0= ruleecloutput_decl )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3392:3: lv_ecl_vars_4_0= ruleecloutput_decl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOutput_valueAccess().getEcl_varsEcloutput_declParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleecloutput_decl_in_ruleoutput_value7872);
                    	    lv_ecl_vars_4_0=ruleecloutput_decl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ecl_vars",
                    	            		lv_ecl_vars_4_0, 
                    	            		"ecloutput_decl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleoutput_value7885); 

                        	newLeafNode(otherlv_5, grammarAccess.getOutput_valueAccess().getENDKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3413:6: (this_out_dataset_6= ruleout_dataset otherlv_7= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3413:6: (this_out_dataset_6= ruleout_dataset otherlv_7= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3414:5: this_out_dataset_6= ruleout_dataset otherlv_7= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getOutput_valueAccess().getOut_datasetParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleout_dataset_in_ruleoutput_value7915);
                    this_out_dataset_6=ruleout_dataset();

                    state._fsp--;

                     
                            current = this_out_dataset_6; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleoutput_value7926); 

                        	newLeafNode(otherlv_7, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_2_1());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3434:1: entryRuleoutputbase returns [EObject current=null] : iv_ruleoutputbase= ruleoutputbase EOF ;
    public final EObject entryRuleoutputbase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutputbase = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3435:2: (iv_ruleoutputbase= ruleoutputbase EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3436:2: iv_ruleoutputbase= ruleoutputbase EOF
            {
             newCompositeNode(grammarAccess.getOutputbaseRule()); 
            pushFollow(FOLLOW_ruleoutputbase_in_entryRuleoutputbase7963);
            iv_ruleoutputbase=ruleoutputbase();

            state._fsp--;

             current =iv_ruleoutputbase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutputbase7973); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3443:1: ruleoutputbase returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleoutputbase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3446:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3447:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3447:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3447:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleoutputbase8010); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputbaseAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3451:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3452:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3452:1: (otherlv_1= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3453:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputbaseRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleoutputbase8030); 

            		newLeafNode(otherlv_1, grammarAccess.getOutputbaseAccess().getActionsDatasetCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleoutputbase8042); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3476:1: entryRulegenerate_section returns [EObject current=null] : iv_rulegenerate_section= rulegenerate_section EOF ;
    public final EObject entryRulegenerate_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegenerate_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3477:2: (iv_rulegenerate_section= rulegenerate_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3478:2: iv_rulegenerate_section= rulegenerate_section EOF
            {
             newCompositeNode(grammarAccess.getGenerate_sectionRule()); 
            pushFollow(FOLLOW_rulegenerate_section_in_entryRulegenerate_section8078);
            iv_rulegenerate_section=rulegenerate_section();

            state._fsp--;

             current =iv_rulegenerate_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_section8088); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3485:1: rulegenerate_section returns [EObject current=null] : (this_generate_body_inline_0= rulegenerate_body_inline | this_generate_body_salt_1= rulegenerate_body_salt ) ;
    public final EObject rulegenerate_section() throws RecognitionException {
        EObject current = null;

        EObject this_generate_body_inline_0 = null;

        EObject this_generate_body_salt_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3488:28: ( (this_generate_body_inline_0= rulegenerate_body_inline | this_generate_body_salt_1= rulegenerate_body_salt ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3489:1: (this_generate_body_inline_0= rulegenerate_body_inline | this_generate_body_salt_1= rulegenerate_body_salt )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3489:1: (this_generate_body_inline_0= rulegenerate_body_inline | this_generate_body_salt_1= rulegenerate_body_salt )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==90) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==91) ) {
                    alt56=2;
                }
                else if ( (LA56_1==RULE_GEN_BLOCK) ) {
                    alt56=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3490:5: this_generate_body_inline_0= rulegenerate_body_inline
                    {
                     
                            newCompositeNode(grammarAccess.getGenerate_sectionAccess().getGenerate_body_inlineParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulegenerate_body_inline_in_rulegenerate_section8135);
                    this_generate_body_inline_0=rulegenerate_body_inline();

                    state._fsp--;

                     
                            current = this_generate_body_inline_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3500:5: this_generate_body_salt_1= rulegenerate_body_salt
                    {
                     
                            newCompositeNode(grammarAccess.getGenerate_sectionAccess().getGenerate_body_saltParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulegenerate_body_salt_in_rulegenerate_section8162);
                    this_generate_body_salt_1=rulegenerate_body_salt();

                    state._fsp--;

                     
                            current = this_generate_body_salt_1; 
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
    // $ANTLR end "rulegenerate_section"


    // $ANTLR start "entryRulegenerate_body_inline"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3516:1: entryRulegenerate_body_inline returns [EObject current=null] : iv_rulegenerate_body_inline= rulegenerate_body_inline EOF ;
    public final EObject entryRulegenerate_body_inline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegenerate_body_inline = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3517:2: (iv_rulegenerate_body_inline= rulegenerate_body_inline EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3518:2: iv_rulegenerate_body_inline= rulegenerate_body_inline EOF
            {
             newCompositeNode(grammarAccess.getGenerate_body_inlineRule()); 
            pushFollow(FOLLOW_rulegenerate_body_inline_in_entryRulegenerate_body_inline8197);
            iv_rulegenerate_body_inline=rulegenerate_body_inline();

            state._fsp--;

             current =iv_rulegenerate_body_inline; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_body_inline8207); 

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
    // $ANTLR end "entryRulegenerate_body_inline"


    // $ANTLR start "rulegenerate_body_inline"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3525:1: rulegenerate_body_inline returns [EObject current=null] : ( ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK ) ;
    public final EObject rulegenerate_body_inline() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_GEN_BLOCK_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3528:28: ( ( ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3529:1: ( ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3529:1: ( ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3529:2: ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3529:2: ( (lv_name_0_0= 'GENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3530:1: (lv_name_0_0= 'GENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3530:1: (lv_name_0_0= 'GENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3531:3: lv_name_0_0= 'GENERATES'
            {
            lv_name_0_0=(Token)match(input,90,FOLLOW_90_in_rulegenerate_body_inline8250); 

                    newLeafNode(lv_name_0_0, grammarAccess.getGenerate_body_inlineAccess().getNameGENERATESKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenerate_body_inlineRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "GENERATES");
            	    

            }


            }

            this_GEN_BLOCK_1=(Token)match(input,RULE_GEN_BLOCK,FOLLOW_RULE_GEN_BLOCK_in_rulegenerate_body_inline8274); 
             
                newLeafNode(this_GEN_BLOCK_1, grammarAccess.getGenerate_body_inlineAccess().getGEN_BLOCKTerminalRuleCall_1()); 
                

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
    // $ANTLR end "rulegenerate_body_inline"


    // $ANTLR start "entryRulegenerate_body_salt"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3556:1: entryRulegenerate_body_salt returns [EObject current=null] : iv_rulegenerate_body_salt= rulegenerate_body_salt EOF ;
    public final EObject entryRulegenerate_body_salt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegenerate_body_salt = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3557:2: (iv_rulegenerate_body_salt= rulegenerate_body_salt EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3558:2: iv_rulegenerate_body_salt= rulegenerate_body_salt EOF
            {
             newCompositeNode(grammarAccess.getGenerate_body_saltRule()); 
            pushFollow(FOLLOW_rulegenerate_body_salt_in_entryRulegenerate_body_salt8309);
            iv_rulegenerate_body_salt=rulegenerate_body_salt();

            state._fsp--;

             current =iv_rulegenerate_body_salt; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_body_salt8319); 

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
    // $ANTLR end "entryRulegenerate_body_salt"


    // $ANTLR start "rulegenerate_body_salt"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3565:1: rulegenerate_body_salt returns [EObject current=null] : ( ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) otherlv_8= 'ENDGENERATES' ) ;
    public final EObject rulegenerate_body_salt() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3568:28: ( ( ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) otherlv_8= 'ENDGENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3569:1: ( ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) otherlv_8= 'ENDGENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3569:1: ( ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) otherlv_8= 'ENDGENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3569:2: ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) otherlv_8= 'ENDGENERATES'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3569:2: ( (lv_name_0_0= 'GENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3570:1: (lv_name_0_0= 'GENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3570:1: (lv_name_0_0= 'GENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3571:3: lv_name_0_0= 'GENERATES'
            {
            lv_name_0_0=(Token)match(input,90,FOLLOW_90_in_rulegenerate_body_salt8362); 

                    newLeafNode(lv_name_0_0, grammarAccess.getGenerate_body_saltAccess().getNameGENERATESKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenerate_body_saltRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "GENERATES");
            	    

            }


            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_rulegenerate_body_salt8387); 

                	newLeafNode(otherlv_1, grammarAccess.getGenerate_body_saltAccess().getSALTKeyword_1());
                
            otherlv_2=(Token)match(input,36,FOLLOW_36_in_rulegenerate_body_salt8399); 

                	newLeafNode(otherlv_2, grammarAccess.getGenerate_body_saltAccess().getLeftParenthesisKeyword_2());
                
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegenerate_body_salt8410); 
             
                newLeafNode(this_ID_3, grammarAccess.getGenerate_body_saltAccess().getIDTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,37,FOLLOW_37_in_rulegenerate_body_salt8421); 

                	newLeafNode(otherlv_4, grammarAccess.getGenerate_body_saltAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,35,FOLLOW_35_in_rulegenerate_body_salt8433); 

                	newLeafNode(otherlv_5, grammarAccess.getGenerate_body_saltAccess().getColonKeyword_5());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3604:1: (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==92) ) {
                alt57=1;
            }
            else if ( (LA57_0==93) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3604:3: otherlv_6= 'SCOREDSEARCH'
                    {
                    otherlv_6=(Token)match(input,92,FOLLOW_92_in_rulegenerate_body_salt8446); 

                        	newLeafNode(otherlv_6, grammarAccess.getGenerate_body_saltAccess().getSCOREDSEARCHKeyword_6_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3609:7: otherlv_7= 'PROFILE'
                    {
                    otherlv_7=(Token)match(input,93,FOLLOW_93_in_rulegenerate_body_salt8464); 

                        	newLeafNode(otherlv_7, grammarAccess.getGenerate_body_saltAccess().getPROFILEKeyword_6_1());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,94,FOLLOW_94_in_rulegenerate_body_salt8477); 

                	newLeafNode(otherlv_8, grammarAccess.getGenerate_body_saltAccess().getENDGENERATESKeyword_7());
                

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
    // $ANTLR end "rulegenerate_body_salt"


    // $ANTLR start "entryRuleVisualSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3625:1: entryRuleVisualSection returns [EObject current=null] : iv_ruleVisualSection= ruleVisualSection EOF ;
    public final EObject entryRuleVisualSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3626:2: (iv_ruleVisualSection= ruleVisualSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3627:2: iv_ruleVisualSection= ruleVisualSection EOF
            {
             newCompositeNode(grammarAccess.getVisualSectionRule()); 
            pushFollow(FOLLOW_ruleVisualSection_in_entryRuleVisualSection8513);
            iv_ruleVisualSection=ruleVisualSection();

            state._fsp--;

             current =iv_ruleVisualSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualSection8523); 

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
    // $ANTLR end "entryRuleVisualSection"


    // $ANTLR start "ruleVisualSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3634:1: ruleVisualSection returns [EObject current=null] : ( ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END' ) ;
    public final EObject ruleVisualSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_ID_1=null;
        Token otherlv_4=null;
        EObject lv_vis_ops_2_0 = null;

        EObject lv_vis_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3637:28: ( ( ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3638:1: ( ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3638:1: ( ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3638:2: ( (lv_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= rulevisual_section_options ) )? ( (lv_vis_elements_3_0= rulevisualization ) )+ otherlv_4= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3638:2: ( (lv_name_0_0= 'VISUALIZE' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3639:1: (lv_name_0_0= 'VISUALIZE' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3639:1: (lv_name_0_0= 'VISUALIZE' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3640:3: lv_name_0_0= 'VISUALIZE'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleVisualSection8566); 

                    newLeafNode(lv_name_0_0, grammarAccess.getVisualSectionAccess().getNameVISUALIZEKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVisualSectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "VISUALIZE");
            	    

            }


            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVisualSection8590); 
             
                newLeafNode(this_ID_1, grammarAccess.getVisualSectionAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3657:1: ( (lv_vis_ops_2_0= rulevisual_section_options ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==35) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3658:1: (lv_vis_ops_2_0= rulevisual_section_options )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3658:1: (lv_vis_ops_2_0= rulevisual_section_options )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3659:3: lv_vis_ops_2_0= rulevisual_section_options
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisualSectionAccess().getVis_opsVisual_section_optionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevisual_section_options_in_ruleVisualSection8610);
                    lv_vis_ops_2_0=rulevisual_section_options();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVisualSectionRule());
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

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3675:3: ( (lv_vis_elements_3_0= rulevisualization ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=95 && LA59_0<=101)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3676:1: (lv_vis_elements_3_0= rulevisualization )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3676:1: (lv_vis_elements_3_0= rulevisualization )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3677:3: lv_vis_elements_3_0= rulevisualization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVisualSectionAccess().getVis_elementsVisualizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevisualization_in_ruleVisualSection8632);
            	    lv_vis_elements_3_0=rulevisualization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVisualSectionRule());
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
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVisualSection8645); 

                	newLeafNode(otherlv_4, grammarAccess.getVisualSectionAccess().getENDKeyword_4());
                

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
    // $ANTLR end "ruleVisualSection"


    // $ANTLR start "entryRulevisualization"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3705:1: entryRulevisualization returns [EObject current=null] : iv_rulevisualization= rulevisualization EOF ;
    public final EObject entryRulevisualization() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisualization = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3706:2: (iv_rulevisualization= rulevisualization EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3707:2: iv_rulevisualization= rulevisualization EOF
            {
             newCompositeNode(grammarAccess.getVisualizationRule()); 
            pushFollow(FOLLOW_rulevisualization_in_entryRulevisualization8681);
            iv_rulevisualization=rulevisualization();

            state._fsp--;

             current =iv_rulevisualization; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisualization8691); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3714:1: rulevisualization returns [EObject current=null] : ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' ) ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3717:28: ( ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3718:1: ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3718:1: ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=95 && LA63_0<=100)) ) {
                alt63=1;
            }
            else if ( (LA63_0==101) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3718:2: ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3718:2: ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3718:3: (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_inputs_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_ops_10_0= rulevisual_options ) )? otherlv_11= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3718:3: (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' )
                    int alt60=6;
                    switch ( input.LA(1) ) {
                    case 95:
                        {
                        alt60=1;
                        }
                        break;
                    case 96:
                        {
                        alt60=2;
                        }
                        break;
                    case 97:
                        {
                        alt60=3;
                        }
                        break;
                    case 98:
                        {
                        alt60=4;
                        }
                        break;
                    case 99:
                        {
                        alt60=5;
                        }
                        break;
                    case 100:
                        {
                        alt60=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }

                    switch (alt60) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3718:5: otherlv_0= 'CHORO'
                            {
                            otherlv_0=(Token)match(input,95,FOLLOW_95_in_rulevisualization8730); 

                                	newLeafNode(otherlv_0, grammarAccess.getVisualizationAccess().getCHOROKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3723:7: otherlv_1= 'LINE'
                            {
                            otherlv_1=(Token)match(input,96,FOLLOW_96_in_rulevisualization8748); 

                                	newLeafNode(otherlv_1, grammarAccess.getVisualizationAccess().getLINEKeyword_0_0_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3728:7: otherlv_2= 'TIMELINE'
                            {
                            otherlv_2=(Token)match(input,97,FOLLOW_97_in_rulevisualization8766); 

                                	newLeafNode(otherlv_2, grammarAccess.getVisualizationAccess().getTIMELINEKeyword_0_0_2());
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3733:7: otherlv_3= 'PIE'
                            {
                            otherlv_3=(Token)match(input,98,FOLLOW_98_in_rulevisualization8784); 

                                	newLeafNode(otherlv_3, grammarAccess.getVisualizationAccess().getPIEKeyword_0_0_3());
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3738:7: otherlv_4= 'BAR'
                            {
                            otherlv_4=(Token)match(input,99,FOLLOW_99_in_rulevisualization8802); 

                                	newLeafNode(otherlv_4, grammarAccess.getVisualizationAccess().getBARKeyword_0_0_4());
                                

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3743:7: otherlv_5= 'TABLE'
                            {
                            otherlv_5=(Token)match(input,100,FOLLOW_100_in_rulevisualization8820); 

                                	newLeafNode(otherlv_5, grammarAccess.getVisualizationAccess().getTABLEKeyword_0_0_5());
                                

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3747:2: ( (lv_name_6_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3748:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3748:1: (lv_name_6_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3749:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisualization8838); 

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

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_rulevisualization8855); 

                        	newLeafNode(otherlv_7, grammarAccess.getVisualizationAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3769:1: ( (lv_inputs_8_0= ruleVisBasis ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3770:1: (lv_inputs_8_0= ruleVisBasis )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3770:1: (lv_inputs_8_0= ruleVisBasis )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3771:3: lv_inputs_8_0= ruleVisBasis
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisualizationAccess().getInputsVisBasisParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisBasis_in_rulevisualization8876);
                    lv_inputs_8_0=ruleVisBasis();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_8_0, 
                            		"VisBasis");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_rulevisualization8888); 

                        	newLeafNode(otherlv_9, grammarAccess.getVisualizationAccess().getRightParenthesisKeyword_0_4());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3791:1: ( (lv_vis_ops_10_0= rulevisual_options ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==35) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3792:1: (lv_vis_ops_10_0= rulevisual_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3792:1: (lv_vis_ops_10_0= rulevisual_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3793:3: lv_vis_ops_10_0= rulevisual_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getVisualizationAccess().getVis_opsVisual_optionsParserRuleCall_0_5_0()); 
                            	    
                            pushFollow(FOLLOW_rulevisual_options_in_rulevisualization8909);
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

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_rulevisualization8922); 

                        	newLeafNode(otherlv_11, grammarAccess.getVisualizationAccess().getSemicolonKeyword_0_6());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3814:6: (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3814:6: (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3814:8: otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_ops_14_0= rulevisual_options ) )? otherlv_15= ';'
                    {
                    otherlv_12=(Token)match(input,101,FOLLOW_101_in_rulevisualization8942); 

                        	newLeafNode(otherlv_12, grammarAccess.getVisualizationAccess().getSLIDERKeyword_1_0());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3818:1: ( (lv_name_13_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3819:1: (lv_name_13_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3819:1: (lv_name_13_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3820:3: lv_name_13_0= RULE_ID
                    {
                    lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisualization8959); 

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

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3836:2: ( (lv_vis_ops_14_0= rulevisual_options ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==35) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3837:1: (lv_vis_ops_14_0= rulevisual_options )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3837:1: (lv_vis_ops_14_0= rulevisual_options )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3838:3: lv_vis_ops_14_0= rulevisual_options
                            {
                             
                            	        newCompositeNode(grammarAccess.getVisualizationAccess().getVis_opsVisual_optionsParserRuleCall_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_rulevisual_options_in_rulevisualization8985);
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

                    otherlv_15=(Token)match(input,20,FOLLOW_20_in_rulevisualization8998); 

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


    // $ANTLR start "entryRuleVisBasis"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3866:1: entryRuleVisBasis returns [EObject current=null] : iv_ruleVisBasis= ruleVisBasis EOF ;
    public final EObject entryRuleVisBasis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisBasis = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3867:2: (iv_ruleVisBasis= ruleVisBasis EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3868:2: iv_ruleVisBasis= ruleVisBasis EOF
            {
             newCompositeNode(grammarAccess.getVisBasisRule()); 
            pushFollow(FOLLOW_ruleVisBasis_in_entryRuleVisBasis9035);
            iv_ruleVisBasis=ruleVisBasis();

            state._fsp--;

             current =iv_ruleVisBasis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisBasis9045); 

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
    // $ANTLR end "entryRuleVisBasis"


    // $ANTLR start "ruleVisBasis"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3875:1: ruleVisBasis returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )? ) ;
    public final EObject ruleVisBasis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_quals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3878:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3879:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3879:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3879:2: ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= rulevis_basis_qualifiers ) )?
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3879:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3880:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3880:1: (otherlv_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3881:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVisBasisRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVisBasis9090); 

            		newLeafNode(otherlv_0, grammarAccess.getVisBasisAccess().getAssignedOut_datasetCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3892:2: ( (lv_quals_1_0= rulevis_basis_qualifiers ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==102) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3893:1: (lv_quals_1_0= rulevis_basis_qualifiers )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3893:1: (lv_quals_1_0= rulevis_basis_qualifiers )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3894:3: lv_quals_1_0= rulevis_basis_qualifiers
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisBasisAccess().getQualsVis_basis_qualifiersParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevis_basis_qualifiers_in_ruleVisBasis9111);
                    lv_quals_1_0=rulevis_basis_qualifiers();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVisBasisRule());
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
    // $ANTLR end "ruleVisBasis"


    // $ANTLR start "entryRulevis_basis_qualifiers"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3918:1: entryRulevis_basis_qualifiers returns [EObject current=null] : iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF ;
    public final EObject entryRulevis_basis_qualifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevis_basis_qualifiers = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3919:2: (iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3920:2: iv_rulevis_basis_qualifiers= rulevis_basis_qualifiers EOF
            {
             newCompositeNode(grammarAccess.getVis_basis_qualifiersRule()); 
            pushFollow(FOLLOW_rulevis_basis_qualifiers_in_entryRulevis_basis_qualifiers9148);
            iv_rulevis_basis_qualifiers=rulevis_basis_qualifiers();

            state._fsp--;

             current =iv_rulevis_basis_qualifiers; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevis_basis_qualifiers9158); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3927:1: rulevis_basis_qualifiers returns [EObject current=null] : (otherlv_0= '{' ( (lv_funcs_1_0= rulefunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}' ) ;
    public final EObject rulevis_basis_qualifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_funcs_1_0 = null;

        EObject lv_funcs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3930:28: ( (otherlv_0= '{' ( (lv_funcs_1_0= rulefunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3931:1: (otherlv_0= '{' ( (lv_funcs_1_0= rulefunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3931:1: (otherlv_0= '{' ( (lv_funcs_1_0= rulefunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3931:3: otherlv_0= '{' ( (lv_funcs_1_0= rulefunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_rulevis_basis_qualifiers9195); 

                	newLeafNode(otherlv_0, grammarAccess.getVis_basis_qualifiersAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3935:1: ( (lv_funcs_1_0= rulefunction ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3936:1: (lv_funcs_1_0= rulefunction )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3936:1: (lv_funcs_1_0= rulefunction )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3937:3: lv_funcs_1_0= rulefunction
            {
             
            	        newCompositeNode(grammarAccess.getVis_basis_qualifiersAccess().getFuncsFunctionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulefunction_in_rulevis_basis_qualifiers9216);
            lv_funcs_1_0=rulefunction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVis_basis_qualifiersRule());
            	        }
                   		add(
                   			current, 
                   			"funcs",
                    		lv_funcs_1_0, 
                    		"function");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3953:2: (otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==30) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3953:4: otherlv_2= ',' ( (lv_funcs_3_0= rulefunction ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulevis_basis_qualifiers9229); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVis_basis_qualifiersAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3957:1: ( (lv_funcs_3_0= rulefunction ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3958:1: (lv_funcs_3_0= rulefunction )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3958:1: (lv_funcs_3_0= rulefunction )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3959:3: lv_funcs_3_0= rulefunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVis_basis_qualifiersAccess().getFuncsFunctionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulefunction_in_rulevis_basis_qualifiers9250);
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
            	    break loop65;
                }
            } while (true);

            otherlv_4=(Token)match(input,103,FOLLOW_103_in_rulevis_basis_qualifiers9264); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3987:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3988:2: (iv_rulefunction= rulefunction EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3989:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction9300);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction9310); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3996:1: rulefunction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= rulevalue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) | (otherlv_6= 'SUM' otherlv_7= '(' ( (lv_vals_8_0= rulevalue ) ) otherlv_9= ')' ) | (otherlv_10= 'SCALE' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' this_INT_14= RULE_INT otherlv_15= ')' ) | (otherlv_16= 'SCALE' otherlv_17= '(' ( (lv_vals_18_0= rulevalue ) ) otherlv_19= ',' this_INT_20= RULE_INT otherlv_21= ')' ) ) ;
    public final EObject rulefunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_INT_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token this_INT_20=null;
        Token otherlv_21=null;
        EObject lv_vals_1_0 = null;

        EObject lv_vals_8_0 = null;

        EObject lv_vals_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3999:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= rulevalue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) | (otherlv_6= 'SUM' otherlv_7= '(' ( (lv_vals_8_0= rulevalue ) ) otherlv_9= ')' ) | (otherlv_10= 'SCALE' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' this_INT_14= RULE_INT otherlv_15= ')' ) | (otherlv_16= 'SCALE' otherlv_17= '(' ( (lv_vals_18_0= rulevalue ) ) otherlv_19= ',' this_INT_20= RULE_INT otherlv_21= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4000:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= rulevalue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) | (otherlv_6= 'SUM' otherlv_7= '(' ( (lv_vals_8_0= rulevalue ) ) otherlv_9= ')' ) | (otherlv_10= 'SCALE' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' this_INT_14= RULE_INT otherlv_15= ')' ) | (otherlv_16= 'SCALE' otherlv_17= '(' ( (lv_vals_18_0= rulevalue ) ) otherlv_19= ',' this_INT_20= RULE_INT otherlv_21= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4000:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= rulevalue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) | (otherlv_6= 'SUM' otherlv_7= '(' ( (lv_vals_8_0= rulevalue ) ) otherlv_9= ')' ) | (otherlv_10= 'SCALE' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' this_INT_14= RULE_INT otherlv_15= ')' ) | (otherlv_16= 'SCALE' otherlv_17= '(' ( (lv_vals_18_0= rulevalue ) ) otherlv_19= ',' this_INT_20= RULE_INT otherlv_21= ')' ) )
            int alt66=6;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4000:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4000:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4001:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4001:1: (otherlv_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4002:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction9355); 

                    		newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getVarsPos_viz_dataCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4014:6: ( (lv_vals_1_0= rulevalue ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4014:6: ( (lv_vals_1_0= rulevalue ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4015:1: (lv_vals_1_0= rulevalue )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4015:1: (lv_vals_1_0= rulevalue )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4016:3: lv_vals_1_0= rulevalue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getValsValueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_in_rulefunction9382);
                    lv_vals_1_0=rulevalue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		add(
                           			current, 
                           			"vals",
                            		lv_vals_1_0, 
                            		"value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4033:6: (otherlv_2= 'SUM' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4033:6: (otherlv_2= 'SUM' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4033:8: otherlv_2= 'SUM' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,104,FOLLOW_104_in_rulefunction9401); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getSUMKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_rulefunction9413); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4041:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4042:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4042:1: (otherlv_4= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4043:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction9433); 

                    		newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getVarsPos_viz_dataCrossReference_2_2_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_rulefunction9445); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4059:6: (otherlv_6= 'SUM' otherlv_7= '(' ( (lv_vals_8_0= rulevalue ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4059:6: (otherlv_6= 'SUM' otherlv_7= '(' ( (lv_vals_8_0= rulevalue ) ) otherlv_9= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4059:8: otherlv_6= 'SUM' otherlv_7= '(' ( (lv_vals_8_0= rulevalue ) ) otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,104,FOLLOW_104_in_rulefunction9465); 

                        	newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getSUMKeyword_3_0());
                        
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_rulefunction9477); 

                        	newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4067:1: ( (lv_vals_8_0= rulevalue ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4068:1: (lv_vals_8_0= rulevalue )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4068:1: (lv_vals_8_0= rulevalue )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4069:3: lv_vals_8_0= rulevalue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getValsValueParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_in_rulefunction9498);
                    lv_vals_8_0=rulevalue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		add(
                           			current, 
                           			"vals",
                            		lv_vals_8_0, 
                            		"value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_rulefunction9510); 

                        	newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3_3());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4090:6: (otherlv_10= 'SCALE' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' this_INT_14= RULE_INT otherlv_15= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4090:6: (otherlv_10= 'SCALE' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' this_INT_14= RULE_INT otherlv_15= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4090:8: otherlv_10= 'SCALE' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' this_INT_14= RULE_INT otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,105,FOLLOW_105_in_rulefunction9530); 

                        	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getSCALEKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_rulefunction9542); 

                        	newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4098:1: ( (otherlv_12= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4099:1: (otherlv_12= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4099:1: (otherlv_12= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4100:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction9562); 

                    		newLeafNode(otherlv_12, grammarAccess.getFunctionAccess().getVarsPos_viz_dataCrossReference_4_2_0()); 
                    	

                    }


                    }

                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_rulefunction9574); 

                        	newLeafNode(otherlv_13, grammarAccess.getFunctionAccess().getCommaKeyword_4_3());
                        
                    this_INT_14=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulefunction9585); 
                     
                        newLeafNode(this_INT_14, grammarAccess.getFunctionAccess().getINTTerminalRuleCall_4_4()); 
                        
                    otherlv_15=(Token)match(input,37,FOLLOW_37_in_rulefunction9596); 

                        	newLeafNode(otherlv_15, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4_5());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4124:6: (otherlv_16= 'SCALE' otherlv_17= '(' ( (lv_vals_18_0= rulevalue ) ) otherlv_19= ',' this_INT_20= RULE_INT otherlv_21= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4124:6: (otherlv_16= 'SCALE' otherlv_17= '(' ( (lv_vals_18_0= rulevalue ) ) otherlv_19= ',' this_INT_20= RULE_INT otherlv_21= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4124:8: otherlv_16= 'SCALE' otherlv_17= '(' ( (lv_vals_18_0= rulevalue ) ) otherlv_19= ',' this_INT_20= RULE_INT otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,105,FOLLOW_105_in_rulefunction9616); 

                        	newLeafNode(otherlv_16, grammarAccess.getFunctionAccess().getSCALEKeyword_5_0());
                        
                    otherlv_17=(Token)match(input,36,FOLLOW_36_in_rulefunction9628); 

                        	newLeafNode(otherlv_17, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4132:1: ( (lv_vals_18_0= rulevalue ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4133:1: (lv_vals_18_0= rulevalue )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4133:1: (lv_vals_18_0= rulevalue )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4134:3: lv_vals_18_0= rulevalue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getValsValueParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_in_rulefunction9649);
                    lv_vals_18_0=rulevalue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		add(
                           			current, 
                           			"vals",
                            		lv_vals_18_0, 
                            		"value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,30,FOLLOW_30_in_rulefunction9661); 

                        	newLeafNode(otherlv_19, grammarAccess.getFunctionAccess().getCommaKeyword_5_3());
                        
                    this_INT_20=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulefunction9672); 
                     
                        newLeafNode(this_INT_20, grammarAccess.getFunctionAccess().getINTTerminalRuleCall_5_4()); 
                        
                    otherlv_21=(Token)match(input,37,FOLLOW_37_in_rulefunction9683); 

                        	newLeafNode(otherlv_21, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5_5());
                        

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4170:1: entryRulevisual_section_options returns [EObject current=null] : iv_rulevisual_section_options= rulevisual_section_options EOF ;
    public final EObject entryRulevisual_section_options() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_section_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4171:2: (iv_rulevisual_section_options= rulevisual_section_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4172:2: iv_rulevisual_section_options= rulevisual_section_options EOF
            {
             newCompositeNode(grammarAccess.getVisual_section_optionsRule()); 
            pushFollow(FOLLOW_rulevisual_section_options_in_entryRulevisual_section_options9720);
            iv_rulevisual_section_options=rulevisual_section_options();

            state._fsp--;

             current =iv_rulevisual_section_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_section_options9730); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4179:1: rulevisual_section_options returns [EObject current=null] : (otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )* ) ;
    public final EObject rulevisual_section_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_visual_section_option_1 = null;

        EObject lv_vis_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4182:28: ( (otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4183:1: (otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4183:1: (otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4183:3: otherlv_0= ':' this_visual_section_option_1= rulevisual_section_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulevisual_section_options9767); 

                	newLeafNode(otherlv_0, grammarAccess.getVisual_section_optionsAccess().getColonKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getVisual_section_optionsAccess().getVisual_section_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevisual_section_option_in_rulevisual_section_options9789);
            this_visual_section_option_1=rulevisual_section_option();

            state._fsp--;

             
                    current = this_visual_section_option_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4196:1: (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==30) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4196:3: otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_section_option ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulevisual_section_options9801); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVisual_section_optionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4200:1: ( (lv_vis_ops_3_0= rulevisual_section_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4201:1: (lv_vis_ops_3_0= rulevisual_section_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4201:1: (lv_vis_ops_3_0= rulevisual_section_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4202:3: lv_vis_ops_3_0= rulevisual_section_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVisual_section_optionsAccess().getVis_opsVisual_section_optionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevisual_section_option_in_rulevisual_section_options9822);
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
    // $ANTLR end "rulevisual_section_options"


    // $ANTLR start "entryRulevisual_section_option"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4226:1: entryRulevisual_section_option returns [EObject current=null] : iv_rulevisual_section_option= rulevisual_section_option EOF ;
    public final EObject entryRulevisual_section_option() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_section_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4227:2: (iv_rulevisual_section_option= rulevisual_section_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4228:2: iv_rulevisual_section_option= rulevisual_section_option EOF
            {
             newCompositeNode(grammarAccess.getVisual_section_optionRule()); 
            pushFollow(FOLLOW_rulevisual_section_option_in_entryRulevisual_section_option9860);
            iv_rulevisual_section_option=rulevisual_section_option();

            state._fsp--;

             current =iv_rulevisual_section_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_section_option9870); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4235:1: rulevisual_section_option returns [EObject current=null] : ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')' ) ;
    public final EObject rulevisual_section_option() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4238:28: ( ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4239:1: ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4239:1: ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4239:2: ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= rulevalue ) ) otherlv_3= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4239:2: ( (lv_name_0_0= 'LABEL' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4240:1: (lv_name_0_0= 'LABEL' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4240:1: (lv_name_0_0= 'LABEL' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4241:3: lv_name_0_0= 'LABEL'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_rulevisual_section_option9913); 

                    newLeafNode(lv_name_0_0, grammarAccess.getVisual_section_optionAccess().getNameLABELKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVisual_section_optionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "LABEL");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_rulevisual_section_option9938); 

                	newLeafNode(otherlv_1, grammarAccess.getVisual_section_optionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4258:1: ( (lv_vals_2_0= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4259:1: (lv_vals_2_0= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4259:1: (lv_vals_2_0= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4260:3: lv_vals_2_0= rulevalue
            {
             
            	        newCompositeNode(grammarAccess.getVisual_section_optionAccess().getValsValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_in_rulevisual_section_option9959);
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

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_rulevisual_section_option9971); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4288:1: entryRulevisual_options returns [EObject current=null] : iv_rulevisual_options= rulevisual_options EOF ;
    public final EObject entryRulevisual_options() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4289:2: (iv_rulevisual_options= rulevisual_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4290:2: iv_rulevisual_options= rulevisual_options EOF
            {
             newCompositeNode(grammarAccess.getVisual_optionsRule()); 
            pushFollow(FOLLOW_rulevisual_options_in_entryRulevisual_options10007);
            iv_rulevisual_options=rulevisual_options();

            state._fsp--;

             current =iv_rulevisual_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_options10017); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4297:1: rulevisual_options returns [EObject current=null] : (otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )* ) ;
    public final EObject rulevisual_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_visual_option_1 = null;

        EObject lv_vis_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4300:28: ( (otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4301:1: (otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4301:1: (otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4301:3: otherlv_0= ':' this_visual_option_1= rulevisual_option (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulevisual_options10054); 

                	newLeafNode(otherlv_0, grammarAccess.getVisual_optionsAccess().getColonKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getVisual_optionsAccess().getVisual_optionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevisual_option_in_rulevisual_options10076);
            this_visual_option_1=rulevisual_option();

            state._fsp--;

             
                    current = this_visual_option_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4314:1: (otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==30) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4314:3: otherlv_2= ',' ( (lv_vis_ops_3_0= rulevisual_option ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulevisual_options10088); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVisual_optionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4318:1: ( (lv_vis_ops_3_0= rulevisual_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4319:1: (lv_vis_ops_3_0= rulevisual_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4319:1: (lv_vis_ops_3_0= rulevisual_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4320:3: lv_vis_ops_3_0= rulevisual_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVisual_optionsAccess().getVis_opsVisual_optionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevisual_option_in_rulevisual_options10109);
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
            	    break loop68;
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4344:1: entryRulevisual_option returns [EObject current=null] : iv_rulevisual_option= rulevisual_option EOF ;
    public final EObject entryRulevisual_option() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4345:2: (iv_rulevisual_option= rulevisual_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4346:2: iv_rulevisual_option= rulevisual_option EOF
            {
             newCompositeNode(grammarAccess.getVisual_optionRule()); 
            pushFollow(FOLLOW_rulevisual_option_in_entryRulevisual_option10147);
            iv_rulevisual_option=rulevisual_option();

            state._fsp--;

             current =iv_rulevisual_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_option10157); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4353:1: rulevisual_option returns [EObject current=null] : ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' ) | (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4356:28: ( ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' ) | (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4357:1: ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' ) | (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4357:1: ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' ) | (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 13:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
                {
                alt71=1;
                }
                break;
            case 18:
            case 56:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
                {
                alt71=2;
                }
                break;
            case 113:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4357:2: ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4357:2: ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4357:3: ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= rulefunction ) ) otherlv_10= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4357:3: ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) )
                    int alt69=8;
                    switch ( input.LA(1) ) {
                    case 106:
                        {
                        alt69=1;
                        }
                        break;
                    case 107:
                        {
                        alt69=2;
                        }
                        break;
                    case 13:
                        {
                        alt69=3;
                        }
                        break;
                    case 108:
                        {
                        alt69=4;
                        }
                        break;
                    case 109:
                        {
                        alt69=5;
                        }
                        break;
                    case 110:
                        {
                        alt69=6;
                        }
                        break;
                    case 111:
                        {
                        alt69=7;
                        }
                        break;
                    case 112:
                        {
                        alt69=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }

                    switch (alt69) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4357:4: ( (lv_name_0_0= 'TITLE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4357:4: ( (lv_name_0_0= 'TITLE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4358:1: (lv_name_0_0= 'TITLE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4358:1: (lv_name_0_0= 'TITLE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4359:3: lv_name_0_0= 'TITLE'
                            {
                            lv_name_0_0=(Token)match(input,106,FOLLOW_106_in_rulevisual_option10202); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4373:6: ( (lv_name_1_0= 'DATE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4373:6: ( (lv_name_1_0= 'DATE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4374:1: (lv_name_1_0= 'DATE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4374:1: (lv_name_1_0= 'DATE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4375:3: lv_name_1_0= 'DATE'
                            {
                            lv_name_1_0=(Token)match(input,107,FOLLOW_107_in_rulevisual_option10239); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4389:6: ( (lv_name_2_0= 'DESCRIPTION' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4389:6: ( (lv_name_2_0= 'DESCRIPTION' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4390:1: (lv_name_2_0= 'DESCRIPTION' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4390:1: (lv_name_2_0= 'DESCRIPTION' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4391:3: lv_name_2_0= 'DESCRIPTION'
                            {
                            lv_name_2_0=(Token)match(input,13,FOLLOW_13_in_rulevisual_option10276); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4405:6: ( (lv_name_3_0= 'PICTURE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4405:6: ( (lv_name_3_0= 'PICTURE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4406:1: (lv_name_3_0= 'PICTURE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4406:1: (lv_name_3_0= 'PICTURE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4407:3: lv_name_3_0= 'PICTURE'
                            {
                            lv_name_3_0=(Token)match(input,108,FOLLOW_108_in_rulevisual_option10313); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4421:6: ( (lv_name_4_0= 'STATE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4421:6: ( (lv_name_4_0= 'STATE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4422:1: (lv_name_4_0= 'STATE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4422:1: (lv_name_4_0= 'STATE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4423:3: lv_name_4_0= 'STATE'
                            {
                            lv_name_4_0=(Token)match(input,109,FOLLOW_109_in_rulevisual_option10350); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4437:6: ( (lv_name_5_0= 'COUNTY' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4437:6: ( (lv_name_5_0= 'COUNTY' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4438:1: (lv_name_5_0= 'COUNTY' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4438:1: (lv_name_5_0= 'COUNTY' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4439:3: lv_name_5_0= 'COUNTY'
                            {
                            lv_name_5_0=(Token)match(input,110,FOLLOW_110_in_rulevisual_option10387); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4453:6: ( (lv_name_6_0= 'WEIGHT' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4453:6: ( (lv_name_6_0= 'WEIGHT' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4454:1: (lv_name_6_0= 'WEIGHT' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4454:1: (lv_name_6_0= 'WEIGHT' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4455:3: lv_name_6_0= 'WEIGHT'
                            {
                            lv_name_6_0=(Token)match(input,111,FOLLOW_111_in_rulevisual_option10424); 

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
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4469:6: ( (lv_name_7_0= 'SIZE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4469:6: ( (lv_name_7_0= 'SIZE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4470:1: (lv_name_7_0= 'SIZE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4470:1: (lv_name_7_0= 'SIZE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4471:3: lv_name_7_0= 'SIZE'
                            {
                            lv_name_7_0=(Token)match(input,112,FOLLOW_112_in_rulevisual_option10461); 

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

                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_rulevisual_option10487); 

                        	newLeafNode(otherlv_8, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4488:1: ( (lv_funcs_9_0= rulefunction ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4489:1: (lv_funcs_9_0= rulefunction )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4489:1: (lv_funcs_9_0= rulefunction )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4490:3: lv_funcs_9_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisual_optionAccess().getFuncsFunctionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_rulevisual_option10508);
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

                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_rulevisual_option10520); 

                        	newLeafNode(otherlv_10, grammarAccess.getVisual_optionAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4511:6: (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4511:6: (this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4512:5: this_visual_multival_11= rulevisual_multival otherlv_12= '(' ( (lv_funcs_13_0= rulefunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )* otherlv_16= ')'
                    {
                     
                            newCompositeNode(grammarAccess.getVisual_optionAccess().getVisual_multivalParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulevisual_multival_in_rulevisual_option10550);
                    this_visual_multival_11=rulevisual_multival();

                    state._fsp--;

                     
                            current = this_visual_multival_11; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_12=(Token)match(input,36,FOLLOW_36_in_rulevisual_option10561); 

                        	newLeafNode(otherlv_12, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4524:1: ( (lv_funcs_13_0= rulefunction ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4525:1: (lv_funcs_13_0= rulefunction )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4525:1: (lv_funcs_13_0= rulefunction )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4526:3: lv_funcs_13_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisual_optionAccess().getFuncsFunctionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_rulevisual_option10582);
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

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4542:2: (otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==30) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4542:4: otherlv_14= ',' ( (lv_funcs_15_0= rulefunction ) )
                    	    {
                    	    otherlv_14=(Token)match(input,30,FOLLOW_30_in_rulevisual_option10595); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getVisual_optionAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4546:1: ( (lv_funcs_15_0= rulefunction ) )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4547:1: (lv_funcs_15_0= rulefunction )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4547:1: (lv_funcs_15_0= rulefunction )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4548:3: lv_funcs_15_0= rulefunction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVisual_optionAccess().getFuncsFunctionParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulefunction_in_rulevisual_option10616);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,37,FOLLOW_37_in_rulevisual_option10630); 

                        	newLeafNode(otherlv_16, grammarAccess.getVisual_optionAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4569:6: ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4569:6: ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4569:7: ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4569:7: ( (lv_name_17_0= 'SELECTS' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4570:1: (lv_name_17_0= 'SELECTS' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4570:1: (lv_name_17_0= 'SELECTS' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4571:3: lv_name_17_0= 'SELECTS'
                    {
                    lv_name_17_0=(Token)match(input,113,FOLLOW_113_in_rulevisual_option10656); 

                            newLeafNode(lv_name_17_0, grammarAccess.getVisual_optionAccess().getNameSELECTSKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVisual_optionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_17_0, "SELECTS");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_rulevisual_option10681); 

                        	newLeafNode(otherlv_18, grammarAccess.getVisual_optionAccess().getLeftParenthesisKeyword_2_1());
                        
                    this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisual_option10692); 
                     
                        newLeafNode(this_ID_19, grammarAccess.getVisual_optionAccess().getIDTerminalRuleCall_2_2()); 
                        
                    otherlv_20=(Token)match(input,114,FOLLOW_114_in_rulevisual_option10703); 

                        	newLeafNode(otherlv_20, grammarAccess.getVisual_optionAccess().getHyphenMinusGreaterThanSignKeyword_2_3());
                        
                    this_ID_21=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevisual_option10714); 
                     
                        newLeafNode(this_ID_21, grammarAccess.getVisual_optionAccess().getIDTerminalRuleCall_2_4()); 
                        
                    otherlv_22=(Token)match(input,37,FOLLOW_37_in_rulevisual_option10725); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4612:1: entryRulevisual_multival returns [EObject current=null] : iv_rulevisual_multival= rulevisual_multival EOF ;
    public final EObject entryRulevisual_multival() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_multival = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4613:2: (iv_rulevisual_multival= rulevisual_multival EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4614:2: iv_rulevisual_multival= rulevisual_multival EOF
            {
             newCompositeNode(grammarAccess.getVisual_multivalRule()); 
            pushFollow(FOLLOW_rulevisual_multival_in_entryRulevisual_multival10762);
            iv_rulevisual_multival=rulevisual_multival();

            state._fsp--;

             current =iv_rulevisual_multival; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevisual_multival10772); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4621:1: rulevisual_multival returns [EObject current=null] : ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4624:28: ( ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4625:1: ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4625:1: ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) )
            int alt72=7;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt72=1;
                }
                break;
            case 116:
                {
                alt72=2;
                }
                break;
            case 117:
                {
                alt72=3;
                }
                break;
            case 56:
                {
                alt72=4;
                }
                break;
            case 118:
                {
                alt72=5;
                }
                break;
            case 18:
                {
                alt72=6;
                }
                break;
            case 119:
                {
                alt72=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4625:2: ( (lv_name_0_0= 'X' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4625:2: ( (lv_name_0_0= 'X' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4626:1: (lv_name_0_0= 'X' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4626:1: (lv_name_0_0= 'X' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4627:3: lv_name_0_0= 'X'
                    {
                    lv_name_0_0=(Token)match(input,115,FOLLOW_115_in_rulevisual_multival10815); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4641:6: ( (lv_name_1_0= 'Y' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4641:6: ( (lv_name_1_0= 'Y' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4642:1: (lv_name_1_0= 'Y' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4642:1: (lv_name_1_0= 'Y' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4643:3: lv_name_1_0= 'Y'
                    {
                    lv_name_1_0=(Token)match(input,116,FOLLOW_116_in_rulevisual_multival10852); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4657:6: ( (lv_name_2_0= 'COLOR' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4657:6: ( (lv_name_2_0= 'COLOR' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4658:1: (lv_name_2_0= 'COLOR' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4658:1: (lv_name_2_0= 'COLOR' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4659:3: lv_name_2_0= 'COLOR'
                    {
                    lv_name_2_0=(Token)match(input,117,FOLLOW_117_in_rulevisual_multival10889); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4673:6: ( (lv_name_3_0= 'RANGE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4673:6: ( (lv_name_3_0= 'RANGE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4674:1: (lv_name_3_0= 'RANGE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4674:1: (lv_name_3_0= 'RANGE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4675:3: lv_name_3_0= 'RANGE'
                    {
                    lv_name_3_0=(Token)match(input,56,FOLLOW_56_in_rulevisual_multival10926); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4689:6: ( (lv_name_4_0= 'FILTER' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4689:6: ( (lv_name_4_0= 'FILTER' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4690:1: (lv_name_4_0= 'FILTER' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4690:1: (lv_name_4_0= 'FILTER' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4691:3: lv_name_4_0= 'FILTER'
                    {
                    lv_name_4_0=(Token)match(input,118,FOLLOW_118_in_rulevisual_multival10963); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4705:6: ( (lv_name_5_0= 'LABEL' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4705:6: ( (lv_name_5_0= 'LABEL' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4706:1: (lv_name_5_0= 'LABEL' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4706:1: (lv_name_5_0= 'LABEL' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4707:3: lv_name_5_0= 'LABEL'
                    {
                    lv_name_5_0=(Token)match(input,18,FOLLOW_18_in_rulevisual_multival11000); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4721:6: ( (lv_name_6_0= 'VALUE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4721:6: ( (lv_name_6_0= 'VALUE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4722:1: (lv_name_6_0= 'VALUE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4722:1: (lv_name_6_0= 'VALUE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4723:3: lv_name_6_0= 'VALUE'
                    {
                    lv_name_6_0=(Token)match(input,119,FOLLOW_119_in_rulevisual_multival11037); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4744:1: entryRulecustom_section returns [EObject current=null] : iv_rulecustom_section= rulecustom_section EOF ;
    public final EObject entryRulecustom_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecustom_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4745:2: (iv_rulecustom_section= rulecustom_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4746:2: iv_rulecustom_section= rulecustom_section EOF
            {
             newCompositeNode(grammarAccess.getCustom_sectionRule()); 
            pushFollow(FOLLOW_rulecustom_section_in_entryRulecustom_section11086);
            iv_rulecustom_section=rulecustom_section();

            state._fsp--;

             current =iv_rulecustom_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecustom_section11096); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4753:1: rulecustom_section returns [EObject current=null] : ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END' ) ;
    public final EObject rulecustom_section() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_cust_vals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4756:28: ( ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4757:1: ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4757:1: ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4757:2: ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= rulecustom_value ) )* otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4757:2: ( (lv_name_0_0= 'CUSTOM' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4758:1: (lv_name_0_0= 'CUSTOM' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4758:1: (lv_name_0_0= 'CUSTOM' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4759:3: lv_name_0_0= 'CUSTOM'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_rulecustom_section11139); 

                    newLeafNode(lv_name_0_0, grammarAccess.getCustom_sectionAccess().getNameCUSTOMKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustom_sectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "CUSTOM");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4772:2: ( (lv_cust_vals_1_0= rulecustom_value ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4773:1: (lv_cust_vals_1_0= rulecustom_value )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4773:1: (lv_cust_vals_1_0= rulecustom_value )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4774:3: lv_cust_vals_1_0= rulecustom_value
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustom_sectionAccess().getCust_valsCustom_valueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecustom_value_in_rulecustom_section11173);
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
            	    break loop73;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulecustom_section11186); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4802:1: entryRulecustom_value returns [EObject current=null] : iv_rulecustom_value= rulecustom_value EOF ;
    public final EObject entryRulecustom_value() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecustom_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4803:2: (iv_rulecustom_value= rulecustom_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4804:2: iv_rulecustom_value= rulecustom_value EOF
            {
             newCompositeNode(grammarAccess.getCustom_valueRule()); 
            pushFollow(FOLLOW_rulecustom_value_in_entryRulecustom_value11222);
            iv_rulecustom_value=rulecustom_value();

            state._fsp--;

             current =iv_rulecustom_value; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecustom_value11232); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4811:1: rulecustom_value returns [EObject current=null] : (this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';' ) ;
    public final EObject rulecustom_value() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_2=null;
        EObject this_value_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4814:28: ( (this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4815:1: (this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4815:1: (this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4815:2: this_ID_0= RULE_ID this_value_1= rulevalue otherlv_2= ';'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecustom_value11268); 
             
                newLeafNode(this_ID_0, grammarAccess.getCustom_valueAccess().getIDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getCustom_valueAccess().getValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevalue_in_rulecustom_value11289);
            this_value_1=rulevalue();

            state._fsp--;

             
                    current = this_value_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulecustom_value11300); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4840:1: entryRuleresource_option returns [EObject current=null] : iv_ruleresource_option= ruleresource_option EOF ;
    public final EObject entryRuleresource_option() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresource_option = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4841:2: (iv_ruleresource_option= ruleresource_option EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4842:2: iv_ruleresource_option= ruleresource_option EOF
            {
             newCompositeNode(grammarAccess.getResource_optionRule()); 
            pushFollow(FOLLOW_ruleresource_option_in_entryRuleresource_option11336);
            iv_ruleresource_option=ruleresource_option();

            state._fsp--;

             current =iv_ruleresource_option; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_option11346); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4849:1: ruleresource_option returns [EObject current=null] : ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4852:28: ( ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4853:1: ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4853:1: ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4853:2: ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= rulevalue ) ) otherlv_6= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4853:2: ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt74=1;
                }
                break;
            case 120:
                {
                alt74=2;
                }
                break;
            case 18:
                {
                alt74=3;
                }
                break;
            case 63:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4853:3: ( (lv_name_0_0= 'DESCRIPTION' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4853:3: ( (lv_name_0_0= 'DESCRIPTION' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4854:1: (lv_name_0_0= 'DESCRIPTION' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4854:1: (lv_name_0_0= 'DESCRIPTION' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4855:3: lv_name_0_0= 'DESCRIPTION'
                    {
                    lv_name_0_0=(Token)match(input,13,FOLLOW_13_in_ruleresource_option11390); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4869:6: ( (lv_name_1_0= 'FILE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4869:6: ( (lv_name_1_0= 'FILE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4870:1: (lv_name_1_0= 'FILE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4870:1: (lv_name_1_0= 'FILE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4871:3: lv_name_1_0= 'FILE'
                    {
                    lv_name_1_0=(Token)match(input,120,FOLLOW_120_in_ruleresource_option11427); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4885:6: ( (lv_name_2_0= 'LABEL' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4885:6: ( (lv_name_2_0= 'LABEL' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4886:1: (lv_name_2_0= 'LABEL' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4886:1: (lv_name_2_0= 'LABEL' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4887:3: lv_name_2_0= 'LABEL'
                    {
                    lv_name_2_0=(Token)match(input,18,FOLLOW_18_in_ruleresource_option11464); 

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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4901:6: ( (lv_name_3_0= '_HTML_STYLECLASS' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4901:6: ( (lv_name_3_0= '_HTML_STYLECLASS' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4902:1: (lv_name_3_0= '_HTML_STYLECLASS' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4902:1: (lv_name_3_0= '_HTML_STYLECLASS' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4903:3: lv_name_3_0= '_HTML_STYLECLASS'
                    {
                    lv_name_3_0=(Token)match(input,63,FOLLOW_63_in_ruleresource_option11501); 

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

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleresource_option11527); 

                	newLeafNode(otherlv_4, grammarAccess.getResource_optionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4920:1: ( (lv_vals_5_0= rulevalue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4921:1: (lv_vals_5_0= rulevalue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4921:1: (lv_vals_5_0= rulevalue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4922:3: lv_vals_5_0= rulevalue
            {
             
            	        newCompositeNode(grammarAccess.getResource_optionAccess().getValsValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulevalue_in_ruleresource_option11548);
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

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleresource_option11560); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4950:1: entryRuleresource_options returns [EObject current=null] : iv_ruleresource_options= ruleresource_options EOF ;
    public final EObject entryRuleresource_options() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresource_options = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4951:2: (iv_ruleresource_options= ruleresource_options EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4952:2: iv_ruleresource_options= ruleresource_options EOF
            {
             newCompositeNode(grammarAccess.getResource_optionsRule()); 
            pushFollow(FOLLOW_ruleresource_options_in_entryRuleresource_options11596);
            iv_ruleresource_options=ruleresource_options();

            state._fsp--;

             current =iv_ruleresource_options; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_options11606); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4959:1: ruleresource_options returns [EObject current=null] : (this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )* ) ;
    public final EObject ruleresource_options() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_resource_option_0 = null;

        EObject lv_res_ops_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4962:28: ( (this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4963:1: (this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4963:1: (this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4964:5: this_resource_option_0= ruleresource_option (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getResource_optionsAccess().getResource_optionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleresource_option_in_ruleresource_options11653);
            this_resource_option_0=ruleresource_option();

            state._fsp--;

             
                    current = this_resource_option_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4972:1: (otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==30) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4972:3: otherlv_1= ',' ( (lv_res_ops_2_0= ruleresource_option ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleresource_options11665); 

            	        	newLeafNode(otherlv_1, grammarAccess.getResource_optionsAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4976:1: ( (lv_res_ops_2_0= ruleresource_option ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4977:1: (lv_res_ops_2_0= ruleresource_option )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4977:1: (lv_res_ops_2_0= ruleresource_option )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4978:3: lv_res_ops_2_0= ruleresource_option
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResource_optionsAccess().getRes_opsResource_optionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleresource_option_in_ruleresource_options11686);
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
            	    break loop75;
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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5002:1: entryRuleresource_value returns [EObject current=null] : iv_ruleresource_value= ruleresource_value EOF ;
    public final EObject entryRuleresource_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresource_value = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5003:2: (iv_ruleresource_value= ruleresource_value EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5004:2: iv_ruleresource_value= ruleresource_value EOF
            {
             newCompositeNode(grammarAccess.getResource_valueRule()); 
            pushFollow(FOLLOW_ruleresource_value_in_entryRuleresource_value11724);
            iv_ruleresource_value=ruleresource_value();

            state._fsp--;

             current =iv_ruleresource_value; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_value11734); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5011:1: ruleresource_value returns [EObject current=null] : (this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';' ) ;
    public final EObject ruleresource_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_value_0 = null;

        EObject lv_res_ops_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5014:28: ( (this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5015:1: (this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5015:1: (this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5016:5: this_value_0= rulevalue otherlv_1= ':' ( (lv_res_ops_2_0= ruleresource_options ) )? otherlv_3= ';'
            {
             
                    newCompositeNode(grammarAccess.getResource_valueAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevalue_in_ruleresource_value11781);
            this_value_0=rulevalue();

            state._fsp--;

             
                    current = this_value_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleresource_value11792); 

                	newLeafNode(otherlv_1, grammarAccess.getResource_valueAccess().getColonKeyword_1());
                
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5028:1: ( (lv_res_ops_2_0= ruleresource_options ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==13||LA76_0==18||LA76_0==63||LA76_0==120) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5029:1: (lv_res_ops_2_0= ruleresource_options )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5029:1: (lv_res_ops_2_0= ruleresource_options )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5030:3: lv_res_ops_2_0= ruleresource_options
                    {
                     
                    	        newCompositeNode(grammarAccess.getResource_valueAccess().getRes_opsResource_optionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleresource_options_in_ruleresource_value11813);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleresource_value11826); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5058:1: entryRuleresource_section returns [EObject current=null] : iv_ruleresource_section= ruleresource_section EOF ;
    public final EObject entryRuleresource_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresource_section = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5059:2: (iv_ruleresource_section= ruleresource_section EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5060:2: iv_ruleresource_section= ruleresource_section EOF
            {
             newCompositeNode(grammarAccess.getResource_sectionRule()); 
            pushFollow(FOLLOW_ruleresource_section_in_entryRuleresource_section11862);
            iv_ruleresource_section=ruleresource_section();

            state._fsp--;

             current =iv_ruleresource_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresource_section11872); 

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5067:1: ruleresource_section returns [EObject current=null] : ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END' ) ;
    public final EObject ruleresource_section() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_res_vals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5070:28: ( ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5071:1: ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5071:1: ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5071:2: ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleresource_value ) )+ otherlv_2= 'END'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5071:2: ( (lv_name_0_0= 'RESOURCES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5072:1: (lv_name_0_0= 'RESOURCES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5072:1: (lv_name_0_0= 'RESOURCES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5073:3: lv_name_0_0= 'RESOURCES'
            {
            lv_name_0_0=(Token)match(input,121,FOLLOW_121_in_ruleresource_section11915); 

                    newLeafNode(lv_name_0_0, grammarAccess.getResource_sectionAccess().getNameRESOURCESKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResource_sectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "RESOURCES");
            	    

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5086:2: ( (lv_res_vals_1_0= ruleresource_value ) )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=RULE_ID && LA77_0<=RULE_STRING)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5087:1: (lv_res_vals_1_0= ruleresource_value )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5087:1: (lv_res_vals_1_0= ruleresource_value )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5088:3: lv_res_vals_1_0= ruleresource_value
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResource_sectionAccess().getRes_valsResource_valueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleresource_value_in_ruleresource_section11949);
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
            	    if ( cnt77 >= 1 ) break loop77;
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleresource_section11962); 

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
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA66 dfa66 = new DFA66(this);
    static final String DFA29_eotS =
        "\u009a\uffff";
    static final String DFA29_eofS =
        "\u009a\uffff";
    static final String DFA29_minS =
        "\1\47\1\uffff\1\4\1\uffff\1\24\1\15\1\uffff\6\24\15\44\1\15\1\4\1\100\1\4\1\53\6\24\15\44\3\36\7\45\1\37\7\36\1\4\1\100\1\4\1\53\1\4\2\24\1\4\1\53\1\24\3\36\7\45\1\37\24\36\1\4\2\24\1\4\1\53\1\24\1\4\1\24\20\36\1\4\1\24\1\4\6\36\2\4\6\36\1\4\3\36";
    static final String DFA29_maxS =
        "\1\56\1\uffff\1\4\1\uffff\1\46\1\77\1\uffff\6\46\15\44\1\77\1\6\1\106\1\4\1\114\6\46\15\44\12\45\1\37\7\45\1\6\1\106\1\4\1\114\1\6\2\46\1\6\1\114\1\46\12\45\1\37\24\45\1\6\2\46\1\6\1\114\1\46\1\6\1\46\20\45\1\6\1\46\1\6\6\45\2\6\6\45\1\6\3\45";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\2\uffff\1\2\u0093\uffff";
    static final String DFA29_specialS =
        "\u009a\uffff}>";
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
            "\1\74",
            "\1\75\33\uffff\1\76\1\77\1\100\1\101\1\102\1\103",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\2\uffff\1\104\1\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\110\6\uffff\1\111",
            "\1\110\6\uffff\1\111",
            "\1\110\6\uffff\1\111",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\113",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\116\1\117\1\120",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127",
            "\1\130",
            "\1\131\33\uffff\1\132\1\133\1\134\1\135\1\136\1\137",
            "\1\140\1\141\1\142",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\143\1\144\1\145",
            "\1\146\33\uffff\1\147\1\150\1\151\1\152\1\153\1\154",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\155\6\uffff\1\156",
            "\1\155\6\uffff\1\156",
            "\1\155\6\uffff\1\156",
            "\1\157",
            "\1\157",
            "\1\157",
            "\1\157",
            "\1\157",
            "\1\157",
            "\1\157",
            "\1\160",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\110\6\uffff\1\111",
            "\1\110\6\uffff\1\111",
            "\1\110\6\uffff\1\111",
            "\1\163\6\uffff\1\164",
            "\1\163\6\uffff\1\164",
            "\1\163\6\uffff\1\164",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\114\6\uffff\1\115",
            "\1\165\1\166\1\167",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\170\1\171\1\172",
            "\1\173\33\uffff\1\174\1\175\1\176\1\177\1\u0080\1\u0081",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\u0082\1\u0083\1\u0084",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\155\6\uffff\1\156",
            "\1\155\6\uffff\1\156",
            "\1\155\6\uffff\1\156",
            "\1\u0085\6\uffff\1\u0086",
            "\1\u0085\6\uffff\1\u0086",
            "\1\u0085\6\uffff\1\u0086",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\161\6\uffff\1\162",
            "\1\163\1\u0087\5\uffff\1\164",
            "\1\163\6\uffff\1\164",
            "\1\163\6\uffff\1\164",
            "\1\u0088\1\u0089\1\u008a",
            "\1\1\11\uffff\1\32\2\uffff\1\6\4\uffff\1\6",
            "\1\u008b\1\u008c\1\u008d",
            "\1\u0085\1\u008e\5\uffff\1\u0086",
            "\1\u0085\6\uffff\1\u0086",
            "\1\u0085\6\uffff\1\u0086",
            "\1\u008f\6\uffff\1\164",
            "\1\u008f\6\uffff\1\164",
            "\1\u008f\6\uffff\1\164",
            "\1\u0090\1\u0091\1\u0092",
            "\1\u0093\1\u0094\1\u0095",
            "\1\u0096\6\uffff\1\u0086",
            "\1\u0096\6\uffff\1\u0086",
            "\1\u0096\6\uffff\1\u0086",
            "\1\u008f\1\u0087\5\uffff\1\164",
            "\1\u008f\6\uffff\1\164",
            "\1\u008f\6\uffff\1\164",
            "\1\u0097\1\u0098\1\u0099",
            "\1\u0096\1\u008e\5\uffff\1\u0086",
            "\1\u0096\6\uffff\1\u0086",
            "\1\u0096\6\uffff\1\u0086"
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
            return "1478:1: ( ( (this_bool_0= rulebool | this_int_var_1= ruleint_var | this_enum_decl_2= ruleenum_decl | this_string_var_3= rulestring_var | this_record_4= rulerecord | this_dataset_5= ruledataset ) ( (lv_input_ops_6_0= ruleinput_options ) )? otherlv_7= ';' ) | (this_dataset_8= ruledataset ( (lv_input_ops_9_0= ruleinput_options ) )? ( (lv_fields_10_0= rulefield_decl ) )* otherlv_11= 'END' ) | (this_group_12= rulegroup ( (lv_input_internal_13_0= ruleinput_options ) )? ( (lv_values_14_0= ruleinput_value ) )* otherlv_15= 'END' ) )";
        }
    }
    static final String DFA55_eotS =
        "\51\uffff";
    static final String DFA55_eofS =
        "\51\uffff";
    static final String DFA55_minS =
        "\1\4\1\uffff\1\4\1\24\1\4\1\15\2\uffff\1\45\5\24\2\44\1\24\1\15\2\4\5\24\2\44\4\45\2\4\2\24\4\45\2\24";
    static final String DFA55_maxS =
        "\1\131\1\uffff\1\4\1\122\1\4\1\130\2\uffff\1\45\5\122\2\44\1\122\1\130\1\4\1\6\5\122\2\44\4\45\1\4\1\6\2\122\4\45\2\122";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\1\3\41\uffff";
    static final String DFA55_specialS =
        "\51\uffff}>";
    static final String[] DFA55_transitionS = {
            "\3\1\42\uffff\3\1\1\uffff\1\2\53\uffff\1\1",
            "",
            "\1\3",
            "\1\7\14\uffff\1\6\1\uffff\1\5\1\4\6\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\10",
            "\1\17\105\uffff\1\11\1\12\1\13\1\14\1\15\1\16",
            "",
            "",
            "\1\20",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\22",
            "\1\23",
            "\1\7\14\uffff\1\6\1\uffff\1\5\7\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\32\105\uffff\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\33",
            "\1\34\1\35\1\36",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\44\1\45\1\46",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6",
            "\1\7\11\uffff\1\21\2\uffff\1\6\11\uffff\1\6\33\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\5\6"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3349:1: ( (this_out_type_0= ruleout_type ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_out_dataset_3= ruleout_dataset ( (lv_ecl_vars_4_0= ruleecloutput_decl ) )* otherlv_5= 'END' ) | (this_out_dataset_6= ruleout_dataset otherlv_7= ';' ) )";
        }
    }
    static final String DFA66_eotS =
        "\17\uffff";
    static final String DFA66_eofS =
        "\17\uffff";
    static final String DFA66_minS =
        "\1\4\2\uffff\2\44\2\4\1\45\1\uffff\1\36\2\uffff\1\5\1\45\1\uffff";
    static final String DFA66_maxS =
        "\1\151\2\uffff\2\44\2\6\1\45\1\uffff\1\36\2\uffff\1\5\1\45\1\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\5\uffff\1\4\1\uffff\1\6\1\3\2\uffff\1\5";
    static final String DFA66_specialS =
        "\17\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\2\2\141\uffff\1\3\1\4",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\7\2\10",
            "\1\11\2\12",
            "\1\13",
            "",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "4000:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= rulevalue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) | (otherlv_6= 'SUM' otherlv_7= '(' ( (lv_vals_8_0= rulevalue ) ) otherlv_9= ')' ) | (otherlv_10= 'SCALE' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' this_INT_14= RULE_INT otherlv_15= ')' ) | (otherlv_16= 'SCALE' otherlv_17= '(' ( (lv_vals_18_0= rulevalue ) ) otherlv_19= ',' this_INT_20= RULE_INT otherlv_21= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomposition_header_in_ruleprogram131 = new BitSet(new long[]{0x00000000002FF000L});
    public static final BitSet FOLLOW_rulebase_prop_in_ruleprogram153 = new BitSet(new long[]{0x00000104182FF002L,0x0200000004002000L});
    public static final BitSet FOLLOW_rulecontract_instance_in_ruleprogram175 = new BitSet(new long[]{0x0000010418000002L,0x0200000004002000L});
    public static final BitSet FOLLOW_ruleInputSection_in_ruleprogram197 = new BitSet(new long[]{0x0000000018000002L,0x0200000004002000L});
    public static final BitSet FOLLOW_ruleOutputSection_in_ruleprogram219 = new BitSet(new long[]{0x0000000018000002L,0x0200000004000000L});
    public static final BitSet FOLLOW_ruleVisualSection_in_ruleprogram241 = new BitSet(new long[]{0x0000000018000002L,0x0200000004000000L});
    public static final BitSet FOLLOW_rulegenerate_section_in_ruleprogram263 = new BitSet(new long[]{0x0000000008000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_rulecustom_section_in_ruleprogram285 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
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
    public static final BitSet FOLLOW_rulevalue_in_rulevalue_list1364 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevalue_list1377 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulevalue_list1398 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleassign_in_entryRuleassign1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassign1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleassign1490 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleassign1507 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleassign1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassign_list_in_entryRuleassign_list1564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassign_list1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassign_in_ruleassign_list1621 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleassign_list1633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleassign_in_ruleassign_list1654 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulecomposition_header_in_entryRulecomposition_header1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomposition_header1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulecomposition_header1745 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleassign_in_rulecomposition_header1779 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_rulecomposition_header1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontract_instance_in_entryRulecontract_instance1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecontract_instance1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulecontract_instance1881 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecontract_instance1906 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulecontract_instance1917 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulecontract_instance1940 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulecontract_instance1952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecontract_instance1972 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulecontract_instance1984 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleassign_in_rulecontract_instance2005 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_rulecontract_instance2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_decl_in_entryRulefield_decl2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_decl2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulefield_decl2101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefield_decl2118 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleinput_options_in_rulefield_decl2144 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulefield_decl2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenum_decl_in_entryRuleenum_decl2193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenum_decl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleenum_decl2246 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleenum_decl2271 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleenum_decl2293 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleassign_list_in_ruleenum_decl2320 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleenum_decl2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSection_in_entryRuleInputSection2369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSection2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInputSection2422 = new BitSet(new long[]{0x00007E8000000000L});
    public static final BitSet FOLLOW_ruleinput_value_in_ruleInputSection2456 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_33_in_ruleInputSection2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_entryRulebool2505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebool2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulebool2552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebool2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleint_var_in_entryRuleint_var2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleint_var2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleint_var2657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleint_var2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestring_var_in_entryRulestring_var2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestring_var2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulestring_var2762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestring_var2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_in_entryRulerecord2820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulerecord2867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulerecord2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledataset_in_entryRuledataset2925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledataset2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruledataset2972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledataset2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_entryRulegroup3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulegroup3077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegroup3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinput_value_in_entryRuleinput_value3137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_value3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_ruleinput_value3196 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleint_var_in_ruleinput_value3223 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleenum_decl_in_ruleinput_value3250 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulestring_var_in_ruleinput_value3277 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulerecord_in_ruleinput_value3304 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruledataset_in_ruleinput_value3331 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value3352 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleinput_value3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledataset_in_ruleinput_value3395 = new BitSet(new long[]{0x0000004A00000000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value3415 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rulefield_decl_in_ruleinput_value3437 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_33_in_ruleinput_value3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_ruleinput_value3480 = new BitSet(new long[]{0x00007E8A00000000L});
    public static final BitSet FOLLOW_ruleinput_options_in_ruleinput_value3500 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_ruleinput_value_in_ruleinput_value3522 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_33_in_ruleinput_value3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinput_options_in_entryRuleinput_options3572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_options3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleinput_options3619 = new BitSet(new long[]{0xFFFF800000042000L});
    public static final BitSet FOLLOW_ruleinput_option_in_ruleinput_options3641 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleinput_options3653 = new BitSet(new long[]{0xFFFF800000042000L});
    public static final BitSet FOLLOW_ruleinput_option_in_ruleinput_options3674 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleinput_option_in_entryRuleinput_option3712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinput_option3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleinput_option3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleinput_option3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleinput_option3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleinput_option3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleinput_option3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleinput_option3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleinput_option3990 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option4015 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleformfield_option_in_ruleinput_option4031 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleinput_option4068 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option4093 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleassign_list_in_ruleinput_option4114 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleinput_option4152 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option4177 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleinputtype_options_in_ruleinput_option4193 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleinput_option4231 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_57_in_ruleinput_option4268 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_58_in_ruleinput_option4305 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_49_in_ruleinput_option4342 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13_in_ruleinput_option4379 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_59_in_ruleinput_option4416 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_60_in_ruleinput_option4453 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_61_in_ruleinput_option4490 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_62_in_ruleinput_option4527 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63_in_ruleinput_option4564 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleinput_option4601 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleinput_option4627 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_list_in_ruleinput_option4648 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleinput_option4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformfield_option_in_entryRuleformfield_option4698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformfield_option4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleformfield_option4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleformfield_option4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleformfield_option4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleformfield_option4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleformfield_option4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleformfield_option4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleformfield_option4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_entryRuleinputtype_option4902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputtype_option4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleinputtype_option4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleinputtype_option4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleinputtype_option4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleinputtype_option5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleinputtype_option5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleinputtype_option5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleinputtype_option5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_options_in_entryRuleinputtype_options5106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputtype_options5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_ruleinputtype_options5164 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleinputtype_options5183 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleinputtype_option_in_ruleinputtype_options5205 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOutputSection_in_entryRuleOutputSection5252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSection5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOutputSection5305 = new BitSet(new long[]{0x00002E0000000070L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleoutput_value_in_ruleOutputSection5339 = new BitSet(new long[]{0x00002E0200000070L,0x0000000002000000L});
    public static final BitSet FOLLOW_33_in_ruleOutputSection5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_integer_in_entryRuleecl_integer5390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_integer5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleecl_integer5437 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_integer5449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_integer5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_unsigned_in_entryRuleecl_unsigned5508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_unsigned5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleecl_unsigned5555 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_unsigned5567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_unsigned5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_string_in_entryRuleecl_string5626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_string5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleecl_string5673 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_string5685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_string5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_qstring_in_entryRuleecl_qstring5744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_qstring5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleecl_qstring5791 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_qstring5803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_qstring5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_varstring_in_entryRuleecl_varstring5862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_varstring5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleecl_varstring5909 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_varstring5921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_varstring5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_unicode_in_entryRuleecl_unicode5980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_unicode5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleecl_unicode6027 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_unicode6039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_unicode6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_varunicode_in_entryRuleecl_varunicode6098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_varunicode6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleecl_varunicode6145 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleecl_varunicode6157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_varunicode6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_data_in_entryRuleecl_data6216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_data6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleecl_data6263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_data6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_real_in_entryRuleecl_real6321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecl_real6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleecl_real6368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleecl_real6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeclfield_type_in_entryRuleeclfield_type6426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeclfield_type6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_integer_in_ruleeclfield_type6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_qstring_in_ruleeclfield_type6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_string_in_ruleeclfield_type6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_real_in_ruleeclfield_type6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_unicode_in_ruleeclfield_type6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_data_in_ruleeclfield_type6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_varstring_in_ruleeclfield_type6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_varunicode_in_ruleeclfield_type6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecl_unsigned_in_ruleeclfield_type6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleecloutput_decl_in_entryRuleecloutput_decl6736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleecloutput_decl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeclfield_type_in_ruleecloutput_decl6793 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleOutputOptions_in_ruleecloutput_decl6813 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleecloutput_decl6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOption_in_entryRuleOutputOption6862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOption6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOutputOption6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOutputOption6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOutputOption6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOutputOption7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOutputOption7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOutputOption7103 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOutputOption7128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputOption7148 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleOutputOption7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOutputOption7186 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOutputOption7211 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleOutputOption7232 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleOutputOption7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOptions_in_entryRuleOutputOptions7281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOptions7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOutputOptions7328 = new BitSet(new long[]{0x0000000000002000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleOutputOption_in_ruleOutputOptions7350 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleOutputOptions7362 = new BitSet(new long[]{0x0000000000002000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleOutputOption_in_ruleOutputOptions7383 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleout_type_in_entryRuleout_type7421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleout_type7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleout_type7469 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_42_in_ruleout_type7487 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_43_in_ruleout_type7505 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_89_in_ruleout_type7523 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleout_type7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleout_dataset_in_entryRuleout_dataset7582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleout_dataset7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleout_dataset7629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleout_dataset7646 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleoutputbase_in_ruleout_dataset7672 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOutputOptions_in_ruleout_dataset7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutput_value_in_entryRuleoutput_value7731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutput_value7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleout_type_in_ruleoutput_value7789 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleOutputOptions_in_ruleoutput_value7809 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleoutput_value7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleout_dataset_in_ruleoutput_value7852 = new BitSet(new long[]{0x0000080200000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_ruleecloutput_decl_in_ruleoutput_value7872 = new BitSet(new long[]{0x0000080200000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_33_in_ruleoutput_value7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleout_dataset_in_ruleoutput_value7915 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleoutput_value7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutputbase_in_entryRuleoutputbase7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutputbase7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleoutputbase8010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleoutputbase8030 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleoutputbase8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_section_in_entryRulegenerate_section8078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_section8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_body_inline_in_rulegenerate_section8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_body_salt_in_rulegenerate_section8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_body_inline_in_entryRulegenerate_body_inline8197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_body_inline8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulegenerate_body_inline8250 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_GEN_BLOCK_in_rulegenerate_body_inline8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_body_salt_in_entryRulegenerate_body_salt8309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_body_salt8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulegenerate_body_salt8362 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_rulegenerate_body_salt8387 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulegenerate_body_salt8399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegenerate_body_salt8410 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulegenerate_body_salt8421 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulegenerate_body_salt8433 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_92_in_rulegenerate_body_salt8446 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_93_in_rulegenerate_body_salt8464 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_rulegenerate_body_salt8477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualSection_in_entryRuleVisualSection8513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualSection8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVisualSection8566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVisualSection8590 = new BitSet(new long[]{0x0000000800000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_rulevisual_section_options_in_ruleVisualSection8610 = new BitSet(new long[]{0x0000000800000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_rulevisualization_in_ruleVisualSection8632 = new BitSet(new long[]{0x0000000A00000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_33_in_ruleVisualSection8645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisualization_in_entryRulevisualization8681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisualization8691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rulevisualization8730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_96_in_rulevisualization8748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_97_in_rulevisualization8766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_98_in_rulevisualization8784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_99_in_rulevisualization8802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_100_in_rulevisualization8820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisualization8838 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisualization8855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVisBasis_in_rulevisualization8876 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisualization8888 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulevisual_options_in_rulevisualization8909 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulevisualization8922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rulevisualization8942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisualization8959 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_rulevisual_options_in_rulevisualization8985 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulevisualization8998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisBasis_in_entryRuleVisBasis9035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisBasis9045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVisBasis9090 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_rulevis_basis_qualifiers_in_ruleVisBasis9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevis_basis_qualifiers_in_entryRulevis_basis_qualifiers9148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevis_basis_qualifiers9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rulevis_basis_qualifiers9195 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevis_basis_qualifiers9216 = new BitSet(new long[]{0x0000000040000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_30_in_rulevis_basis_qualifiers9229 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevis_basis_qualifiers9250 = new BitSet(new long[]{0x0000000040000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_rulevis_basis_qualifiers9264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction9300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_rulefunction9382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rulefunction9401 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunction9413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction9433 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rulefunction9465 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunction9477 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulefunction9498 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction9510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rulefunction9530 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunction9542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction9562 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulefunction9574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulefunction9585 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction9596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rulefunction9616 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefunction9628 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulefunction9649 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulefunction9661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulefunction9672 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulefunction9683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_section_options_in_entryRulevisual_section_options9720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_section_options9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulevisual_section_options9767 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_rulevisual_section_options9789 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevisual_section_options9801 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_rulevisual_section_options9822 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulevisual_section_option_in_entryRulevisual_section_option9860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_section_option9870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulevisual_section_option9913 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_section_option9938 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulevisual_section_option9959 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_section_option9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_options_in_entryRulevisual_options10007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_options10017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulevisual_options10054 = new BitSet(new long[]{0x0100000000042000L,0x00FBFC0000000000L});
    public static final BitSet FOLLOW_rulevisual_option_in_rulevisual_options10076 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulevisual_options10088 = new BitSet(new long[]{0x0100000000042000L,0x00FBFC0000000000L});
    public static final BitSet FOLLOW_rulevisual_option_in_rulevisual_options10109 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulevisual_option_in_entryRulevisual_option10147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_option10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rulevisual_option10202 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_107_in_rulevisual_option10239 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13_in_rulevisual_option10276 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_108_in_rulevisual_option10313 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_109_in_rulevisual_option10350 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_110_in_rulevisual_option10387 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_111_in_rulevisual_option10424 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_112_in_rulevisual_option10461 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option10487 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option10508 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option10520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_multival_in_rulevisual_option10550 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option10561 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option10582 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_30_in_rulevisual_option10595 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_rulefunction_in_rulevisual_option10616 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_rulevisual_option10656 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulevisual_option10681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisual_option10692 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_rulevisual_option10703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevisual_option10714 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulevisual_option10725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevisual_multival_in_entryRulevisual_multival10762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevisual_multival10772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_rulevisual_multival10815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rulevisual_multival10852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_rulevisual_multival10889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulevisual_multival10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_rulevisual_multival10963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulevisual_multival11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_rulevisual_multival11037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecustom_section_in_entryRulecustom_section11086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecustom_section11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulecustom_section11139 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rulecustom_value_in_rulecustom_section11173 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_rulecustom_section11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecustom_value_in_entryRulecustom_value11222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecustom_value11232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecustom_value11268 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_rulecustom_value11289 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulecustom_value11300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_option_in_entryRuleresource_option11336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_option11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleresource_option11390 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_120_in_ruleresource_option11427 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleresource_option11464 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63_in_ruleresource_option11501 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleresource_option11527 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulevalue_in_ruleresource_option11548 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleresource_option11560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_options_in_entryRuleresource_options11596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_options11606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_option_in_ruleresource_options11653 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleresource_options11665 = new BitSet(new long[]{0x8000000000042000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ruleresource_option_in_ruleresource_options11686 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleresource_value_in_entryRuleresource_value11724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_value11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_ruleresource_value11781 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleresource_value11792 = new BitSet(new long[]{0x8000000000142000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ruleresource_options_in_ruleresource_value11813 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleresource_value11826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresource_section_in_entryRuleresource_section11862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresource_section11872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleresource_section11915 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleresource_value_in_ruleresource_section11949 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_33_in_ruleresource_section11962 = new BitSet(new long[]{0x0000000000000002L});

}